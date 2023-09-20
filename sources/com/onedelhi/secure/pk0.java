package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.ak4;
import java.io.IOException;
import java.io.InputStream;

public class pk0 {

    /* renamed from: a */
    public static final String f33694a = "Unity";

    /* renamed from: b */
    public static final String f33695b = "Flutter";

    /* renamed from: c */
    public static final String f33696c = "com.google.firebase.crashlytics.unity_version";

    /* renamed from: d */
    public static final String f33697d = "flutter_assets/NOTICES.Z";

    /* renamed from: a */
    public final Context f33698a;
    @ts2

    /* renamed from: a */
    public C6451b f33699a = null;

    /* renamed from: com.onedelhi.secure.pk0$b */
    public class C6451b {
        @ts2

        /* renamed from: a */
        public final String f33701a;
        @ts2

        /* renamed from: b */
        public final String f33702b;

        public C6451b() {
            int s = u10.m66372s(pk0.this.f33698a, pk0.f33696c, ak4.C1709b.f9167e);
            if (s != 0) {
                this.f33701a = pk0.f33694a;
                String string = pk0.this.f33698a.getResources().getString(s);
                this.f33702b = string;
                o92 f = o92.m59120f();
                f.mo41621k("Unity Editor version is: " + string);
            } else if (pk0.this.mo42694c(pk0.f33697d)) {
                this.f33701a = pk0.f33695b;
                this.f33702b = null;
                o92.m59120f().mo41621k("Development platform is: Flutter");
            } else {
                this.f33701a = null;
                this.f33702b = null;
            }
        }
    }

    public pk0(Context context) {
        this.f33698a = context;
    }

    /* renamed from: g */
    public static boolean m61169g(Context context) {
        return u10.m66372s(context, f33696c, ak4.C1709b.f9167e) != 0;
    }

    /* renamed from: c */
    public final boolean mo42694c(String str) {
        if (this.f33698a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f33698a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @ts2
    /* renamed from: d */
    public String mo42695d() {
        return mo42697f().f33701a;
    }

    @ts2
    /* renamed from: e */
    public String mo42696e() {
        return mo42697f().f33702b;
    }

    /* renamed from: f */
    public final C6451b mo42697f() {
        if (this.f33699a == null) {
            this.f33699a = new C6451b();
        }
        return this.f33699a;
    }
}
