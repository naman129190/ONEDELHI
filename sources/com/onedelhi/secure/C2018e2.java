package com.onedelhi.secure;

import android.os.Bundle;
import android.view.View;
import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.e2 */
public interface C2018e2 {

    /* renamed from: com.onedelhi.secure.e2$a */
    public static abstract class C2019a {

        /* renamed from: a */
        public Bundle f11075a;

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: a */
        public void mo14978a(@ts2 Bundle bundle) {
            this.f11075a = bundle;
        }
    }

    /* renamed from: com.onedelhi.secure.e2$b */
    public static final class C2020b extends C2019a {
        /* renamed from: b */
        public boolean mo14979b() {
            return this.f11075a.getBoolean(C1638a2.f8599n);
        }

        /* renamed from: c */
        public int mo14980c() {
            return this.f11075a.getInt(C1638a2.f8595l);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$c */
    public static final class C2021c extends C2019a {
        @ts2
        /* renamed from: b */
        public String mo14981b() {
            return this.f11075a.getString(C1638a2.f8597m);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$d */
    public static final class C2022d extends C2019a {
        /* renamed from: b */
        public int mo14982b() {
            return this.f11075a.getInt(C1638a2.f8613u);
        }

        /* renamed from: c */
        public int mo14983c() {
            return this.f11075a.getInt(C1638a2.f8615v);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$e */
    public static final class C2023e extends C2019a {
        /* renamed from: b */
        public int mo14984b() {
            return this.f11075a.getInt(C1638a2.f8609s);
        }

        /* renamed from: c */
        public int mo14985c() {
            return this.f11075a.getInt(C1638a2.f8607r);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$f */
    public static final class C2024f extends C2019a {
        /* renamed from: b */
        public float mo14986b() {
            return this.f11075a.getFloat(C1638a2.f8611t);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$g */
    public static final class C2025g extends C2019a {
        /* renamed from: b */
        public int mo14987b() {
            return this.f11075a.getInt(C1638a2.f8603p);
        }

        /* renamed from: c */
        public int mo14988c() {
            return this.f11075a.getInt(C1638a2.f8601o);
        }
    }

    /* renamed from: com.onedelhi.secure.e2$h */
    public static final class C2026h extends C2019a {
        @ts2
        /* renamed from: b */
        public CharSequence mo14989b() {
            return this.f11075a.getCharSequence(C1638a2.f8605q);
        }
    }

    /* renamed from: a */
    boolean mo4110a(@mr2 View view, @ts2 C2019a aVar);
}
