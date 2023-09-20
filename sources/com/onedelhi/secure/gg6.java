package com.onedelhi.secure;

import android.net.Uri;

public final class gg6 {
    @mj1("PhenotypeConstants.class")

    /* renamed from: a */
    public static final C3042oa f12573a = new C3042oa();

    /* renamed from: a */
    public static synchronized Uri m15836a(String str) {
        synchronized (gg6.class) {
            C3042oa oaVar = f12573a;
            Uri uri = (Uri) oaVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            oaVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
