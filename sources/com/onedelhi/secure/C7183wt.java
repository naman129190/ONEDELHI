package com.onedelhi.secure;

import android.hardware.Camera;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.wt */
public class C7183wt {

    /* renamed from: a */
    public final int f37115a;

    /* renamed from: a */
    public final Camera f37116a;

    public C7183wt(@mr2 Camera camera, int i) {
        Objects.requireNonNull(camera, "Camera cannot be null");
        this.f37116a = camera;
        this.f37115a = i;
    }

    /* renamed from: a */
    public static C7183wt m69641a(Camera camera, int i) {
        if (camera == null) {
            return null;
        }
        return new C7183wt(camera, i);
    }
}
