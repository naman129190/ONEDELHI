package com.onedelhi.secure;

public final class zl3 {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m33244a(int i, TInput tinput, oc1<TInput, TResult, TException> oc1, hm3<TInput, TResult> hm3) throws Throwable {
        TResult a;
        if (i < 1) {
            return oc1.mo21861a(tinput);
        }
        do {
            a = oc1.mo21861a(tinput);
            tinput = hm3.mo17348a(tinput, a);
            if (tinput == null || i - 1 < 1) {
                return a;
            }
            a = oc1.mo21861a(tinput);
            tinput = hm3.mo17348a(tinput, a);
            break;
        } while (i - 1 < 1);
        return a;
    }
}
