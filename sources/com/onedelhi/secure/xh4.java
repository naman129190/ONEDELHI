package com.onedelhi.secure;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C3303qh;
import com.onedelhi.secure.hl3;

@AutoValue
public abstract class xh4 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.xh4$a */
    public static abstract class C3922a {
        /* renamed from: a */
        public abstract xh4 mo23182a();

        /* renamed from: b */
        public abstract C3922a mo23183b(String str);

        /* renamed from: c */
        public abstract C3922a mo23184c(@ts2 byte[] bArr);

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: d */
        public abstract C3922a mo23185d(d53 d53);
    }

    /* renamed from: a */
    public static C3922a m31443a() {
        return new C3303qh.C3305b().mo23185d(d53.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo23177b();

    @ts2
    /* renamed from: c */
    public abstract byte[] mo23178c();

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract d53 mo23179d();

    /* renamed from: e */
    public boolean mo26923e() {
        return mo23178c() != null;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: f */
    public xh4 mo26924f(d53 d53) {
        return m31443a().mo23183b(mo23177b()).mo23185d(d53).mo23184c(mo23178c()).mo23182a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo23177b();
        objArr[1] = mo23179d();
        objArr[2] = mo23178c() == null ? "" : Base64.encodeToString(mo23178c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
