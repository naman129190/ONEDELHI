package com.onedelhi.secure;

import android.net.Uri;

public final class nv5 {
    @mj1("PhenotypeConstants.class")

    /* renamed from: a */
    public static final C3042oa f17609a = new C3042oa();

    /* renamed from: a */
    public static synchronized Uri m23202a(String str) {
        synchronized (nv5.class) {
            C3042oa oaVar = f17609a;
            Uri uri = (Uri) oaVar.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            oaVar.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
