package com.onedelhi.secure;

import android.graphics.Typeface;
import android.os.Handler;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.x91;

/* renamed from: com.onedelhi.secure.at */
public class C1730at {
    @mr2

    /* renamed from: a */
    public final Handler f9517a;
    @mr2

    /* renamed from: a */
    public final aa1.C1676d f9518a;

    /* renamed from: com.onedelhi.secure.at$a */
    public class C1731a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Typeface f9519a;

        /* renamed from: a */
        public final /* synthetic */ aa1.C1676d f9520a;

        public C1731a(aa1.C1676d dVar, Typeface typeface) {
            this.f9520a = dVar;
            this.f9519a = typeface;
        }

        public void run() {
            this.f9520a.mo12882b(this.f9519a);
        }
    }

    /* renamed from: com.onedelhi.secure.at$b */
    public class C1732b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ aa1.C1676d f9522a;

        /* renamed from: n */
        public final /* synthetic */ int f9524n;

        public C1732b(aa1.C1676d dVar, int i) {
            this.f9522a = dVar;
            this.f9524n = i;
        }

        public void run() {
            this.f9522a.mo12881a(this.f9524n);
        }
    }

    public C1730at(@mr2 aa1.C1676d dVar) {
        this.f9518a = dVar;
        this.f9517a = C1804bt.m12056a();
    }

    public C1730at(@mr2 aa1.C1676d dVar, @mr2 Handler handler) {
        this.f9518a = dVar;
        this.f9517a = handler;
    }

    /* renamed from: a */
    public final void mo13257a(int i) {
        this.f9517a.post(new C1732b(this.f9518a, i));
    }

    /* renamed from: b */
    public void mo13258b(@mr2 x91.C3906e eVar) {
        if (eVar.mo26831a()) {
            mo13259c(eVar.f22479a);
        } else {
            mo13257a(eVar.f22478a);
        }
    }

    /* renamed from: c */
    public final void mo13259c(@mr2 Typeface typeface) {
        this.f9517a.post(new C1731a(this.f9518a, typeface));
    }
}
