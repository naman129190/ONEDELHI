package com.onedelhi.secure;

import android.util.Log;
import com.phonepe.intent.sdk.api.PhonePe;

public class m05 {

    /* renamed from: a */
    public static C6076b f31968a;

    /* renamed from: com.onedelhi.secure.m05$a */
    public static class C6075a implements C6076b {

        /* renamed from: a */
        public r25 f31969a;

        public C6075a() {
        }

        /* renamed from: a */
        public void mo40402a(String str, String str2) {
            if (mo40415n(0)) {
                Log.d(str, str2);
            }
        }

        /* renamed from: b */
        public void mo40403b(String str, String str2) {
            if (mo40415n(2)) {
                Log.w(str, str2);
            }
        }

        /* renamed from: c */
        public void mo40404c(String str, String str2) {
            if (mo40415n(1)) {
                Log.i(str, str2);
            }
        }

        /* renamed from: d */
        public void mo40405d(String str, String str2, int i, String str3) {
            if (mo40414m(0)) {
                Log.d(str, "Message: " + str2 + "\n" + "Line Number: " + i + "\n" + "SourceId: " + str3);
            }
        }

        /* renamed from: e */
        public void mo40406e(String str, String str2, int i, String str3) {
            if (mo40414m(2)) {
                Log.w(str, "Message: " + str2 + "\n" + "Line Number: " + i + "\n" + "SourceId: " + str3);
            }
        }

        /* renamed from: f */
        public void mo40407f(String str, String str2) {
            if (mo40415n(3)) {
                Log.wtf(str, str2);
            }
        }

        /* renamed from: g */
        public void mo40408g(String str, String str2) {
            if (mo40415n(3)) {
                Log.e(str, str2);
            }
        }

        /* renamed from: h */
        public void mo40409h(String str, String str2, Exception exc) {
            if (mo40415n(3)) {
                Log.e(str, str2, exc);
            }
        }

        /* renamed from: i */
        public void mo40410i(String str, String str2, int i, String str3) {
            if (mo40414m(1)) {
                Log.i(str, "Message: " + str2 + "\n" + "Line Number: " + i + "\n" + "SourceId: " + str3);
            }
        }

        /* renamed from: j */
        public void mo40411j(String str, String str2, int i, String str3) {
            if (mo40414m(3)) {
                Log.e(str, "Message: " + str2 + "\n" + "Line Number: " + i + "\n" + "SourceId: " + str3);
            }
        }

        /* renamed from: k */
        public void mo40412k(String str, String str2, int i, String str3) {
            if (mo40414m(1)) {
                Log.i(str, "Message: " + str2 + "\n" + "Line Number: " + i + "\n" + "SourceId: " + str3);
            }
        }

        /* renamed from: l */
        public void mo40413l(String str, String str2) {
            if (mo40415n(0)) {
                Log.v(str, str2);
            }
        }

        /* renamed from: m */
        public final boolean mo40414m(int i) {
            try {
                if (PhonePe.getObjectFactory() == null) {
                    return false;
                }
                r25 r25 = (r25) PhonePe.getObjectFactory().mo48873i(r25.class);
                this.f31969a = r25;
                return r25.mo43795a() && this.f31969a.f34479a.mo48862b().getInt("webLogsLevel", 3) <= i;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: n */
        public final boolean mo40415n(int i) {
            try {
                if (PhonePe.getObjectFactory() == null) {
                    return false;
                }
                r25 r25 = (r25) PhonePe.getObjectFactory().mo48873i(r25.class);
                this.f31969a = r25;
                return r25.f34479a.mo48862b().getBoolean("areAndroidLogsEnabled", false) && this.f31969a.f34479a.mo48862b().getInt("androidLogsLevel", 3) <= i;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.m05$b */
    public interface C6076b {
        /* renamed from: a */
        void mo40402a(String str, String str2);

        /* renamed from: b */
        void mo40403b(String str, String str2);

        /* renamed from: c */
        void mo40404c(String str, String str2);

        /* renamed from: d */
        void mo40405d(String str, String str2, int i, String str3);

        /* renamed from: e */
        void mo40406e(String str, String str2, int i, String str3);

        /* renamed from: f */
        void mo40407f(String str, String str2);

        /* renamed from: g */
        void mo40408g(String str, String str2);

        /* renamed from: h */
        void mo40409h(String str, String str2, Exception exc);

        /* renamed from: i */
        void mo40410i(String str, String str2, int i, String str3);

        /* renamed from: j */
        void mo40411j(String str, String str2, int i, String str3);

        /* renamed from: k */
        void mo40412k(String str, String str2, int i, String str3);

        /* renamed from: l */
        void mo40413l(String str, String str2);
    }

    /* renamed from: com.onedelhi.secure.m05$d */
    public static class C6078d extends C6075a {
        public C6078d() {
            super();
        }
    }

    /* renamed from: a */
    public static void m56770a(String str, String str2) {
        C6076b bVar = f31968a;
        if (bVar != null) {
            bVar.mo40404c(str, str2);
        }
    }

    /* renamed from: b */
    public static void m56771b(String str, String str2) {
        C6076b bVar = f31968a;
        if (bVar != null) {
            bVar.mo40408g(str, str2);
        }
    }

    /* renamed from: c */
    public static void m56772c(String str, String str2) {
        C6076b bVar = f31968a;
        if (bVar != null) {
            bVar.mo40402a(str, str2);
        }
    }

    /* renamed from: d */
    public static void m56773d(String str, String str2, Exception exc) {
        C6076b bVar = f31968a;
        if (bVar != null) {
            bVar.mo40409h(str, str2, exc);
        }
    }

    /* renamed from: e */
    public static void m56774e(String str, String str2) {
        C6076b bVar = f31968a;
        if (bVar != null) {
            bVar.mo40413l(str, str2);
        }
    }
}
