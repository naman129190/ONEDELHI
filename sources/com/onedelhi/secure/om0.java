package com.onedelhi.secure;

import com.onedelhi.secure.im0;
import java.io.File;

public class om0 implements im0.C2452a {

    /* renamed from: a */
    public final long f18014a;

    /* renamed from: a */
    public final C3076c f18015a;

    /* renamed from: com.onedelhi.secure.om0$a */
    public class C3074a implements C3076c {

        /* renamed from: a */
        public final /* synthetic */ String f18016a;

        public C3074a(String str) {
            this.f18016a = str;
        }

        /* renamed from: a */
        public File mo14949a() {
            return new File(this.f18016a);
        }
    }

    /* renamed from: com.onedelhi.secure.om0$b */
    public class C3075b implements C3076c {

        /* renamed from: a */
        public final /* synthetic */ String f18017a;

        /* renamed from: b */
        public final /* synthetic */ String f18018b;

        public C3075b(String str, String str2) {
            this.f18017a = str;
            this.f18018b = str2;
        }

        /* renamed from: a */
        public File mo14949a() {
            return new File(this.f18017a, this.f18018b);
        }
    }

    /* renamed from: com.onedelhi.secure.om0$c */
    public interface C3076c {
        /* renamed from: a */
        File mo14949a();
    }

    public om0(C3076c cVar, long j) {
        this.f18014a = j;
        this.f18015a = cVar;
    }

    public om0(String str, long j) {
        this((C3076c) new C3074a(str), j);
    }

    public om0(String str, String str2, long j) {
        this((C3076c) new C3075b(str, str2), j);
    }

    /* renamed from: a */
    public im0 mo17849a() {
        File a = this.f18015a.mo14949a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return pm0.m24815d(a, this.f18014a);
        }
        return null;
    }
}
