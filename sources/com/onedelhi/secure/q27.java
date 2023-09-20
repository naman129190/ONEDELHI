package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class q27 extends n47 {

    /* renamed from: a */
    public final /* synthetic */ h37 f18856a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q27(h37 h37, d57 d57, CharSequence charSequence) {
        super(d57, charSequence);
        this.f18856a = h37;
    }

    /* renamed from: d */
    public final int mo20864d(int i) {
        return i + 1;
    }

    /* renamed from: e */
    public final int mo20865e(int i) {
        rv6 rv6 = this.f18856a.f12908a;
        CharSequence charSequence = this.f17102a;
        int length = charSequence.length();
        z17.m32799b(i, length, FirebaseAnalytics.C4305d.f24955X);
        while (i < length) {
            if (rv6.mo13822a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
