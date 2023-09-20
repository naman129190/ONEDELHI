package com.onedelhi.secure;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.nt */
public final class C6225nt {

    /* renamed from: b */
    public static final String f32764b = "nt";

    /* renamed from: a */
    public int f32765a = -1;

    /* renamed from: a */
    public Context f32766a;

    /* renamed from: a */
    public Camera.CameraInfo f32767a;

    /* renamed from: a */
    public Camera f32768a;

    /* renamed from: a */
    public C4473a5 f32769a;

    /* renamed from: a */
    public C5421gf f32770a;

    /* renamed from: a */
    public final C6226a f32771a;

    /* renamed from: a */
    public pz3 f32772a;

    /* renamed from: a */
    public C6596qt f32773a = new C6596qt();

    /* renamed from: a */
    public zm0 f32774a;

    /* renamed from: a */
    public String f32775a;

    /* renamed from: a */
    public boolean f32776a;

    /* renamed from: b */
    public pz3 f32777b;

    /* renamed from: com.onedelhi.secure.nt$a */
    public final class C6226a implements Camera.PreviewCallback {

        /* renamed from: a */
        public pz3 f32779a;

        /* renamed from: a */
        public u43 f32780a;

        public C6226a() {
        }

        /* renamed from: a */
        public void mo41479a(u43 u43) {
            this.f32780a = u43;
        }

        /* renamed from: b */
        public void mo41480b(pz3 pz3) {
            this.f32779a = pz3;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e;
            pz3 pz3 = this.f32779a;
            u43 u43 = this.f32780a;
            if (pz3 == null || u43 == null) {
                Log.d(C6225nt.f32764b, "Got preview callback, but no handler or resolution available");
                if (u43 != null) {
                    e = new Exception("No resolution available");
                } else {
                    return;
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    b14 b14 = new b14(bArr2, pz3.f33850n, pz3.f33851o, camera.getParameters().getPreviewFormat(), C6225nt.this.mo41461h());
                    if (C6225nt.this.f32767a.facing == 1) {
                        b14.mo31343n(true);
                    }
                    u43.mo38088a(b14);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e(C6225nt.f32764b, "Camera preview failed", e);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
            u43.mo38089b(e);
        }
    }

    public C6225nt(Context context) {
        this.f32766a = context;
        this.f32771a = new C6226a();
    }

    /* renamed from: n */
    public static List<pz3> m58753n(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new pz3(previewSize.width, previewSize.height);
                arrayList.add(new pz3(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new pz3(next.width, next.height));
        }
        return arrayList;
    }

    /* renamed from: A */
    public void mo41453A(boolean z) {
        if (this.f32768a != null) {
            try {
                if (z != mo41469q()) {
                    C5421gf gfVar = this.f32770a;
                    if (gfVar != null) {
                        gfVar.mo36694j();
                    }
                    Camera.Parameters parameters = this.f32768a.getParameters();
                    C5448gt.m49820n(parameters, z);
                    if (this.f32773a.mo43709g()) {
                        C5448gt.m49813g(parameters, z);
                    }
                    this.f32768a.setParameters(parameters);
                    C5421gf gfVar2 = this.f32770a;
                    if (gfVar2 != null) {
                        gfVar2.mo36693i();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(f32764b, "Failed to set torch", e);
            }
        }
    }

    /* renamed from: B */
    public void mo41454B() {
        Camera camera = this.f32768a;
        if (camera != null && !this.f32776a) {
            camera.startPreview();
            this.f32776a = true;
            this.f32770a = new C5421gf(this.f32768a, this.f32773a);
            C4473a5 a5Var = new C4473a5(this.f32766a, this, this.f32773a);
            this.f32769a = a5Var;
            a5Var.mo30467d();
        }
    }

    /* renamed from: C */
    public void mo41455C() {
        C5421gf gfVar = this.f32770a;
        if (gfVar != null) {
            gfVar.mo36694j();
            this.f32770a = null;
        }
        C4473a5 a5Var = this.f32769a;
        if (a5Var != null) {
            a5Var.mo30468e();
            this.f32769a = null;
        }
        Camera camera = this.f32768a;
        if (camera != null && this.f32776a) {
            camera.stopPreview();
            this.f32771a.mo41479a((u43) null);
            this.f32776a = false;
        }
    }

    /* renamed from: c */
    public final int mo41456c() {
        int d = this.f32774a.mo48324d();
        int i = 0;
        if (d != 0) {
            if (d == 1) {
                i = 90;
            } else if (d == 2) {
                i = 180;
            } else if (d == 3) {
                i = C3527sn.f20441p;
            }
        }
        Camera.CameraInfo cameraInfo = this.f32767a;
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        int i4 = (i2 == 1 ? 360 - ((i3 + i) % 360) : (i3 - i) + 360) % 360;
        String str = f32764b;
        Log.i(str, "Camera Display Orientation: " + i4);
        return i4;
    }

    /* renamed from: d */
    public void mo41457d(C6301ot otVar) {
        Camera camera = this.f32768a;
        if (camera != null) {
            try {
                camera.setParameters(otVar.mo41955a(camera.getParameters()));
            } catch (RuntimeException e) {
                Log.e(f32764b, "Failed to change camera parameters", e);
            }
        }
    }

    /* renamed from: e */
    public void mo41458e() {
        Camera camera = this.f32768a;
        if (camera != null) {
            camera.release();
            this.f32768a = null;
        }
    }

    /* renamed from: f */
    public void mo41459f() {
        if (this.f32768a != null) {
            mo41476x();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: g */
    public Camera mo41460g() {
        return this.f32768a;
    }

    /* renamed from: h */
    public int mo41461h() {
        return this.f32765a;
    }

    /* renamed from: i */
    public C6596qt mo41462i() {
        return this.f32773a;
    }

    /* renamed from: j */
    public final Camera.Parameters mo41463j() {
        Camera.Parameters parameters = this.f32768a.getParameters();
        String str = this.f32775a;
        if (str == null) {
            this.f32775a = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: k */
    public zm0 mo41464k() {
        return this.f32774a;
    }

    /* renamed from: l */
    public pz3 mo41465l() {
        return this.f32777b;
    }

    /* renamed from: m */
    public pz3 mo41466m() {
        if (this.f32777b == null) {
            return null;
        }
        return mo41467o() ? this.f32777b.mo42987e() : this.f32777b;
    }

    /* renamed from: o */
    public boolean mo41467o() {
        int i = this.f32765a;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: p */
    public boolean mo41468p() {
        return this.f32768a != null;
    }

    /* renamed from: q */
    public boolean mo41469q() {
        String flashMode;
        Camera.Parameters parameters = this.f32768a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return bf0.f26276d.equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: r */
    public void mo41470r() {
        Camera b = xv2.m70882b(this.f32773a.mo43704b());
        this.f32768a = b;
        if (b != null) {
            int a = xv2.m70881a(this.f32773a.mo43704b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f32767a = cameraInfo;
            Camera.getCameraInfo(a, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: s */
    public void mo41471s(u43 u43) {
        Camera camera = this.f32768a;
        if (camera != null && this.f32776a) {
            this.f32771a.mo41479a(u43);
            camera.setOneShotPreviewCallback(this.f32771a);
        }
    }

    /* renamed from: t */
    public final void mo41472t(int i) {
        this.f32768a.setDisplayOrientation(i);
    }

    /* renamed from: u */
    public void mo41473u(C6596qt qtVar) {
        this.f32773a = qtVar;
    }

    /* renamed from: v */
    public final void mo41474v(boolean z) {
        Camera.Parameters j = mo41463j();
        if (j == null) {
            Log.w(f32764b, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f32764b;
        Log.i(str, "Initial camera parameters: " + j.flatten());
        if (z) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C5448gt.m49816j(j, this.f32773a.mo43703a(), z);
        if (!z) {
            C5448gt.m49820n(j, false);
            if (this.f32773a.mo43711i()) {
                C5448gt.m49818l(j);
            }
            if (this.f32773a.mo43707e()) {
                C5448gt.m49812f(j);
            }
            if (this.f32773a.mo43710h()) {
                C5448gt.m49821o(j);
                C5448gt.m49817k(j);
                C5448gt.m49819m(j);
            }
        }
        List<pz3> n = m58753n(j);
        if (n.size() == 0) {
            this.f32772a = null;
        } else {
            pz3 a = this.f32774a.mo48321a(n, mo41467o());
            this.f32772a = a;
            j.setPreviewSize(a.f33850n, a.f33851o);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C5448gt.m49814h(j);
        }
        Log.i(str, "Final camera parameters: " + j.flatten());
        this.f32768a.setParameters(j);
    }

    /* renamed from: w */
    public void mo41475w(zm0 zm0) {
        this.f32774a = zm0;
    }

    /* renamed from: x */
    public final void mo41476x() {
        try {
            int c = mo41456c();
            this.f32765a = c;
            mo41472t(c);
        } catch (Exception unused) {
            Log.w(f32764b, "Failed to set rotation.");
        }
        try {
            mo41474v(false);
        } catch (Exception unused2) {
            try {
                mo41474v(true);
            } catch (Exception unused3) {
                Log.w(f32764b, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f32768a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f32777b = this.f32772a;
        } else {
            this.f32777b = new pz3(previewSize.width, previewSize.height);
        }
        this.f32771a.mo41480b(this.f32777b);
    }

    /* renamed from: y */
    public void mo41477y(SurfaceHolder surfaceHolder) throws IOException {
        mo41478z(new C6712rt(surfaceHolder));
    }

    /* renamed from: z */
    public void mo41478z(C6712rt rtVar) throws IOException {
        rtVar.mo44060c(this.f32768a);
    }
}
