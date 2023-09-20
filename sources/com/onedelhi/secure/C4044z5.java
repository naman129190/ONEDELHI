package com.onedelhi.secure;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.onedelhi.secure.z5 */
public final class C4044z5 implements ky1 {

    /* renamed from: a */
    public final int f23464a;

    /* renamed from: a */
    public final ky1 f23465a;

    public C4044z5(int i, ky1 ky1) {
        this.f23464a = i;
        this.f23465a = ky1;
    }

    @mr2
    /* renamed from: c */
    public static ky1 m32869c(@mr2 Context context) {
        return new C4044z5(context.getResources().getConfiguration().uiMode & 48, C3130p9.m24532c(context));
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        this.f23465a.mo13311a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f23464a).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4044z5)) {
            return false;
        }
        C4044z5 z5Var = (C4044z5) obj;
        return this.f23464a == z5Var.f23464a && this.f23465a.equals(z5Var.f23465a);
    }

    public int hashCode() {
        return oq4.m24029q(this.f23465a, this.f23464a);
    }
}
