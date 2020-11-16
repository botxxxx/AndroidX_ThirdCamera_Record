# cdr9020_qtr
    <!--
    [CDR9020_QTR_v1.0.0]
        1.Rear Camera、External Camera同時錄影並儲存至外接SD Card
        2.Speaker播音樂(與錄影功能同時撥放)
        3.可讀取VideoRecordConfig.ini 設定測試時間(每一單位10分鐘)
        4.可寫入VideoRecordLog.ini 記錄Log資訊及影片測試結果
        5.可設定影像尺寸 1080p or 720p(鏡頭解析度最高為720p)
        6.可設定影像FPS  27.5 or 16 // 可設定之FPS為27.5, 24, 20, 16, 12
        7.SD Card空間小於3.5G自動移除影片
        8.VideoRecordConfig.ini 解析失敗或檔案不存在時重置檔案
        9.VideoRecordLog.ini 不存在時重置檔案
    [v1.1.0]
        1.add setProp, getProp.
        2.move function to Utils.class.
    [v1.1.1]
        1.fix some error.
        2.add auto change camera device with config.ini.
    [v1.2.0]
        1.optimize user experience on takerecord function.
        2.fix reset framerate change error.
        3.add framerate switch options.
        4.the framerate switch will update on camera preview.
        5.show loadingView on framerate switch.
    [v1.2.1]
        1.fix deletefile and checkfile error.
    [v1.2.2]
        1.disable setprop function for the default devices.
    [v1.2.3]
        1.fix the problem with takeRecord change CameraDevice will crash error.
        *you can change CameraDevice on application running.
    [v1.3.0]
        1.add Setting Dialog, Log Dialog.
        2.add setprop item in Config.ini. (if you used the new-9020 system.img)
        3.fix error.
        *you can change CameraDevice and Review log with DialogView.
    [v1.3.1]
        1.optimizing The UX/UI.
        2.add libs/debug.keystore.
    [v1.3.2]
        1.fix dialog can not dismiss problem.
        2.fix record can used dialog change camera problem.
    [v1.3.3]
        1.update default config file, total_test_minute = 999.
        2.fix error.
    [v1.3.4]
        1.update default config file, app version at config file.
        2.fix error with setUpMediaRecorder 1080p.
        3.edit log layout to show complete message.
    [v1.3.5]
        1.fix manually stop record crash bug.
        2.unblock setProp, inner and external option.
        3.Update Config message.
        4.fix inner and external will crash error, application is not closed.
        5.fix cancel and restart will crash error, application is not closed.
    [v1.4.0]
        1.add Battery Listener.
        2.add Reset Activity.
        3.application will reset on camera error.
        3.show battery in Log message.
    [v1.4.1]
        1.show reset in Log message.
        2.fix no SD card crash, camera not access crash, config not match crash.
        3.auto select the last line of log message.
    [v1.5.0]
        1.add record timer, record status.
        2.unblock playMusic, LogList, LogDialog.
        3.record Time from 10min change to 1min.
        4.save log & config on /storage/emulated/0/DCIM/
        5.copy log to sd card when record finish or stop.
        6.videoBitRate is 20Mbps.
    [v1.6.0]
        1.SystemProperties default is 1.
        2.videoBitRate is 10Mbps.
        3.saveLog is running in the background.
        4.Create singleRecording Handler.
        5.fix mediaRecorder no release error.
        6.disable mHomeBtnReceiver, BroadcastReceiver
        7.fix click cancel button doesn't save @cancel in log message error.
        8.test the record on 30min will restartActivity function.
    [v1.7.0]
        1.Enable mHomeBtnReceiver.
        2.videoBitRate is 6Mbps.
        3.fix System properties can't be resolved error.
    [v1.7.1]
        1.fix stopRecord bug.
    [v1.7.2]
        1.fix Camera Access error function was not reset problem.
        2.fix application has stopped problem.
        3.try to restart application when (startRecord, stopRecord, MediaRecorder, setCaptureRequest, takePreview) error.
    [v1.7.3]
        1.fix saveLogService, copyFileService, checkSdCardService shutdown error.
        2.fix stopRecord time out error.
        3.try to restart application when (CameraDevice.StateCallback) error.
        4.find getFrameRate 0 error on delete file time out.
        5.fix reset camera not recording error.
        6.fix run number not continue error.
        7.add checkSdCard background service.
    [v1.7.5]
        1.fix apk restart for bt connect/disconnect.
    -->