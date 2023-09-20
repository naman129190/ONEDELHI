package com.onedelhi.secure;

import android.hardware.Camera;
import android.util.Log;

public final class xv2 {

    /* renamed from: a */
    public static final int f37645a = -1;

    /* renamed from: a */
    public static final String f37646a = "com.onedelhi.secure.xv2";

    /* renamed from: a */
    public static int m70881a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f37646a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m70882b(int i) {
        int a = m70881a(i);
        if (a == -1) {
            return null;
        }
        return Camera.open(a);
    }
}
