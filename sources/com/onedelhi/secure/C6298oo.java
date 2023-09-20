package com.onedelhi.secure;

import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.oo */
public abstract class C6298oo {

    /* renamed from: a */
    public static final C6298oo f33148a = new C6299a();

    /* renamed from: com.onedelhi.secure.oo$a */
    public static class C6299a extends C6298oo {
        /* renamed from: a */
        public C7303y4 mo41922a(int i) {
            return C7303y4.m71221j(ByteBuffer.allocateDirect(i));
        }

        /* renamed from: b */
        public C7303y4 mo41923b(int i) {
            return C7303y4.m71222k(new byte[i]);
        }
    }

    /* renamed from: c */
    public static C6298oo m59576c() {
        return f33148a;
    }

    /* renamed from: a */
    public abstract C7303y4 mo41922a(int i);

    /* renamed from: b */
    public abstract C7303y4 mo41923b(int i);
}
