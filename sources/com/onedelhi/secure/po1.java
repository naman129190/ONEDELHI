package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.internal.Preconditions;

@Deprecated
public final class po1 {
    @mr2

    /* renamed from: a */
    public static final String f18624a = "https://www.facebook.com";
    @mr2

    /* renamed from: b */
    public static final String f18625b = "https://accounts.google.com";
    @mr2

    /* renamed from: c */
    public static final String f18626c = "https://www.linkedin.com";
    @mr2

    /* renamed from: d */
    public static final String f18627d = "https://login.live.com";
    @mr2

    /* renamed from: e */
    public static final String f18628e = "https://www.paypal.com";
    @mr2

    /* renamed from: f */
    public static final String f18629f = "https://twitter.com";
    @mr2

    /* renamed from: g */
    public static final String f18630g = "https://login.yahoo.com";

    @ts2
    /* renamed from: a */
    public static final String m24848a(@mr2 Account account) {
        Preconditions.checkNotNull(account, "account cannot be null");
        if ("com.google".equals(account.type)) {
            return f18625b;
        }
        if ("com.facebook.auth.login".equals(account.type)) {
            return f18624a;
        }
        return null;
    }
}
