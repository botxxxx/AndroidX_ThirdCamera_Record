# com.askey.record
    [CDR9030_Thermal_test_v1.0.0]
        1.Recording 3 video for CDR9030 device at thermal test
        2.The Camera 0 is External-1, Camera 1 is Front Camera, Camera 2 is External-2
        3.At the small Testing, Some data prove two External camera can't be Run at the same time
        4.BSP path:\\10.1.28.27\DailyBuild\SDM660\R43_UserDebugVersion\20201019
    [v1.0.1]
        1.fix save log may crash error.
        2.fix close video record issues.
        3.fix camera may crash issues.
        4.add setProp to record logs.
    [v1.0.2]
        1.fix video file issues.
        2.delay 0.3.6 with recording
    [v1.0.3]
        1.delay 0.1.3 with recording
        2.disable VideoFrameRate setting
    [v1.1]
        1.moving package to com.d160.thermal
        2.rename VideoRecordActivity -> CameraFragment
        3.use AtomicReferenceArray
        4.add #audio
        5.add FragmentLayout -> CameraActivity
        6.add autoRecording -> extraRecordStatus = true
        7.add system.gc
