package com.onedelhi.secure;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.rt */
public class C6712rt {

    /* renamed from: a */
    public SurfaceTexture f34749a;

    /* renamed from: a */
    public SurfaceHolder f34750a;

    public C6712rt(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f34749a = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C6712rt(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f34750a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public SurfaceHolder mo44058a() {
        return this.f34750a;
    }

    /* renamed from: b */
    public SurfaceTexture mo44059b() {
        return this.f34749a;
    }

    /* renamed from: c */
    public void mo44060c(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f34750a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f34749a);
        }
    }
}
