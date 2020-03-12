package com.askey.record;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.askey.widget.LogMsg;
import com.askey.widget.mLog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.askey.record.Utils.EXTRA_VIDEO_COPY;
import static com.askey.record.Utils.EXTRA_VIDEO_PASTE;
import static com.askey.record.Utils.EXTRA_VIDEO_REMOVE;
import static com.askey.record.Utils.errorMessage;
import static com.askey.record.Utils.getSDPath;
import static com.askey.record.Utils.isError;
import static com.askey.record.Utils.videoLogList;

public class MyIntentService extends IntentService {
    String video;
    String pathname;
    boolean reomve;

    public MyIntentService() {
        // ActivityのstartService(intent);で呼び出されるコンストラクタはこちら
        super("MyIntentService");
    }

    public static void copy(String src, String dst, boolean remove) {
        try {
            File sf = new File(src);
            InputStream in = new FileInputStream(sf);
            try {
                OutputStream out = new FileOutputStream(dst);
                try {
                    // Transfer bytes from in to out
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                } catch (IOException | RuntimeException e) {
                    e.printStackTrace();
                    isError = true;
                    errorMessage = "Copy file error. <============ Crash here";
                } finally {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                isError = true;
                errorMessage = "Copy file error. <============ Crash here";
            } finally {
                in.close();
                if (remove) sf.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
            isError = true;
            errorMessage = "Copy file error. <============ Crash here";
            videoLogList.add(new LogMsg("Copy file error", mLog.e));
        }
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        video = intent.getStringExtra(EXTRA_VIDEO_COPY);
        pathname = intent.getStringExtra(EXTRA_VIDEO_PASTE);
        reomve = intent.getBooleanExtra(EXTRA_VIDEO_REMOVE, false);
        // 非同期処理を行うメソッド。タスクはonHandleIntentメソッド内で実行する
        videoLogList.add(new LogMsg("#copy.", mLog.e));
        try {
            Log.d("IntentService", "onHandleIntent Start");
            Thread t = new Thread(() -> {
                try {
                    if (!getSDPath().equals(""))
                        copy(video, pathname, reomve);
                } catch (Exception e) {
                    e.printStackTrace();
                    isError = true;
                    errorMessage = "Copy file error. <============ Crash here";
                    videoLogList.add(new LogMsg("Copy file error", mLog.e));
                }
            });
            t.start();
            t.join();
            videoLogList.add(new LogMsg("copy successful.", mLog.e));
        } catch (Exception e) {
            e.printStackTrace();
            isError = true;
            errorMessage = "Copy file error. <============ Crash here";
            videoLogList.add(new LogMsg("Copy file error", mLog.e));
        }
    }
}
