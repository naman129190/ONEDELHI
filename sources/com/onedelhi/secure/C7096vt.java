package com.onedelhi.secure;

import android.hardware.Camera;
import java.util.List;

/* renamed from: com.onedelhi.secure.vt */
public class C7096vt {
    /* renamed from: a */
    public static Camera m68507a() {
        return m68508b(m68509c());
    }

    /* renamed from: b */
    public static Camera m68508b(int i) {
        if (i != -1) {
            return Camera.open(i);
        }
        try {
            return Camera.open();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static int m68509c() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 0) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: d */
    public static boolean m68510d(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals(bf0.f26277e))) {
                return true;
            }
        }
        return false;
    }
}
