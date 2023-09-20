package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.mr2;

/* renamed from: androidx.lifecycle.l */
public class C0707l {

    /* renamed from: a */
    public final Handler f4115a = new Handler();

    /* renamed from: a */
    public final C0695g f4116a;

    /* renamed from: a */
    public C0708a f4117a;

    /* renamed from: androidx.lifecycle.l$a */
    public static class C0708a implements Runnable {

        /* renamed from: a */
        public final C0690e.C0692b f4118a;

        /* renamed from: a */
        public final C0695g f4119a;

        /* renamed from: b */
        public boolean f4120b = false;

        public C0708a(@mr2 C0695g gVar, C0690e.C0692b bVar) {
            this.f4119a = gVar;
            this.f4118a = bVar;
        }

        public void run() {
            if (!this.f4120b) {
                this.f4119a.mo4968j(this.f4118a);
                this.f4120b = true;
            }
        }
    }

    public C0707l(@mr2 a32 a32) {
        this.f4116a = new C0695g(a32);
    }

    @mr2
    /* renamed from: a */
    public C0690e mo5020a() {
        return this.f4116a;
    }

    /* renamed from: b */
    public void mo5021b() {
        mo5025f(C0690e.C0692b.ON_START);
    }

    /* renamed from: c */
    public void mo5022c() {
        mo5025f(C0690e.C0692b.ON_CREATE);
    }

    /* renamed from: d */
    public void mo5023d() {
        mo5025f(C0690e.C0692b.ON_STOP);
        mo5025f(C0690e.C0692b.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo5024e() {
        mo5025f(C0690e.C0692b.ON_START);
    }

    /* renamed from: f */
    public final void mo5025f(C0690e.C0692b bVar) {
        C0708a aVar = this.f4117a;
        if (aVar != null) {
            aVar.run();
        }
        C0708a aVar2 = new C0708a(this.f4116a, bVar);
        this.f4117a = aVar2;
        this.f4115a.postAtFrontOfQueue(aVar2);
    }
}
