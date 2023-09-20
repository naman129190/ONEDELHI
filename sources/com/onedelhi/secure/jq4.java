package com.onedelhi.secure;

import java.io.EOFException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/no;", "", "a", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
public final class jq4 {
    /* renamed from: a */
    public static final boolean m53697a(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$isProbablyUtf8");
        try {
            C6205no noVar2 = new C6205no();
            noVar.mo41278m(noVar2, 0, df3.m45222v(noVar.mo41244V0(), 64));
            for (int i = 0; i < 16; i++) {
                if (noVar2.mo31685f2()) {
                    return true;
                }
                int D0 = noVar2.mo31669D0();
                if (Character.isISOControl(D0) && !Character.isWhitespace(D0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
