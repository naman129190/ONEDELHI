package com.onedelhi.secure;

import android.net.Uri;
import javax.annotation.Nullable;

public final class tw5 {

    /* renamed from: a */
    public final Uri f21151a;
    @Nullable

    /* renamed from: a */
    public final yy5 f21152a;

    /* renamed from: a */
    public final String f21153a;

    /* renamed from: a */
    public final boolean f21154a;

    /* renamed from: b */
    public final String f21155b;

    /* renamed from: b */
    public final boolean f21156b;

    /* renamed from: c */
    public final String f21157c;

    /* renamed from: c */
    public final boolean f21158c;

    /* renamed from: d */
    public final boolean f21159d;

    public tw5(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (yy5) null);
    }

    public tw5(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable yy5 yy5) {
        this.f21153a = null;
        this.f21151a = uri;
        this.f21155b = "";
        this.f21157c = "";
        this.f21154a = z;
        this.f21156b = false;
        this.f21158c = z3;
        this.f21159d = false;
        this.f21152a = null;
    }

    /* renamed from: a */
    public final tw5 mo25324a() {
        return new tw5((String) null, this.f21151a, this.f21155b, this.f21157c, this.f21154a, false, true, false, (yy5) null);
    }

    /* renamed from: b */
    public final tw5 mo25325b() {
        if (this.f21155b.isEmpty()) {
            return new tw5((String) null, this.f21151a, this.f21155b, this.f21157c, true, false, this.f21158c, false, (yy5) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final iy5 mo25326c(String str, double d) {
        return new lw5(this, str, Double.valueOf(0.0d), true);
    }

    /* renamed from: d */
    public final iy5 mo25327d(String str, long j) {
        return new dw5(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final iy5 mo25328e(String str, boolean z) {
        return new hw5(this, str, Boolean.valueOf(z), true);
    }

    /* renamed from: f */
    public final iy5 mo25329f(String str, Object obj, ug6 ug6) {
        return new pw5(this, "getTokenRefactor__blocked_packages", obj, true, ug6, (byte[]) null);
    }
}
