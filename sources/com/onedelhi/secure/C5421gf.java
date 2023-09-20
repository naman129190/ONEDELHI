package com.onedelhi.secure;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.onedelhi.secure.gf */
public final class C5421gf {

    /* renamed from: a */
    public static final long f29146a = 2000;

    /* renamed from: a */
    public static final String f29147a = "gf";

    /* renamed from: a */
    public static final Collection<String> f29148a;

    /* renamed from: a */
    public int f29149a = 1;

    /* renamed from: a */
    public final Camera.AutoFocusCallback f29150a;

    /* renamed from: a */
    public final Camera f29151a;

    /* renamed from: a */
    public final Handler.Callback f29152a;

    /* renamed from: a */
    public Handler f29153a;

    /* renamed from: a */
    public boolean f29154a;

    /* renamed from: b */
    public boolean f29155b;

    /* renamed from: c */
    public final boolean f29156c;

    /* renamed from: com.onedelhi.secure.gf$a */
    public class C5422a implements Handler.Callback {
        public C5422a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != C5421gf.this.f29149a) {
                return false;
            }
            C5421gf.this.mo36692h();
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.gf$b */
    public class C5423b implements Camera.AutoFocusCallback {
        public C5423b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m49399b() {
            boolean unused = C5421gf.this.f29155b = false;
            C5421gf.this.mo36690f();
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C5421gf.this.f29153a.post(new C5515hf(this));
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f29148a = arrayList;
        arrayList.add(bf0.f26274c);
        arrayList.add("macro");
    }

    public C5421gf(Camera camera, C6596qt qtVar) {
        boolean z = true;
        C5422a aVar = new C5422a();
        this.f29152a = aVar;
        this.f29150a = new C5423b();
        this.f29153a = new Handler(aVar);
        this.f29151a = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z = (!qtVar.mo43705c() || !f29148a.contains(focusMode)) ? false : z;
        this.f29156c = z;
        String str = f29147a;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z);
        mo36693i();
    }

    /* renamed from: f */
    public final synchronized void mo36690f() {
        if (!this.f29154a && !this.f29153a.hasMessages(this.f29149a)) {
            Handler handler = this.f29153a;
            handler.sendMessageDelayed(handler.obtainMessage(this.f29149a), 2000);
        }
    }

    /* renamed from: g */
    public final void mo36691g() {
        this.f29153a.removeMessages(this.f29149a);
    }

    /* renamed from: h */
    public final void mo36692h() {
        if (this.f29156c && !this.f29154a && !this.f29155b) {
            try {
                this.f29151a.autoFocus(this.f29150a);
                this.f29155b = true;
            } catch (RuntimeException e) {
                Log.w(f29147a, "Unexpected exception while focusing", e);
                mo36690f();
            }
        }
    }

    /* renamed from: i */
    public void mo36693i() {
        this.f29154a = false;
        mo36692h();
    }

    /* renamed from: j */
    public void mo36694j() {
        this.f29154a = true;
        this.f29155b = false;
        mo36691g();
        if (this.f29156c) {
            try {
                this.f29151a.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f29147a, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
