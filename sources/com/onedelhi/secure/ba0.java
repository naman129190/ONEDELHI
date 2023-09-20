package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.C4623b5;
import java.util.Locale;

public class ba0 implements C4623b5.C4625b {

    /* renamed from: a */
    public static final String f26250a = "_o";

    /* renamed from: b */
    public static final String f26251b = "name";

    /* renamed from: c */
    public static final String f26252c = "params";

    /* renamed from: d */
    public static final String f26253d = "clx";

    /* renamed from: a */
    public C5663i5 f26254a;

    /* renamed from: b */
    public C5663i5 f26255b;

    /* renamed from: b */
    public static void m39676b(@ts2 C5663i5 i5Var, @mr2 String str, @mr2 Bundle bundle) {
        if (i5Var != null) {
            i5Var.mo34506W(str, bundle);
        }
    }

    /* renamed from: a */
    public void mo31408a(int i, @ts2 Bundle bundle) {
        String string;
        o92.m59120f().mo41621k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle(f26252c);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            mo31536c(string, bundle2);
        }
    }

    /* renamed from: c */
    public final void mo31536c(@mr2 String str, @mr2 Bundle bundle) {
        m39676b("clx".equals(bundle.getString(f26250a)) ? this.f26254a : this.f26255b, str, bundle);
    }

    /* renamed from: d */
    public void mo31537d(@ts2 C5663i5 i5Var) {
        this.f26255b = i5Var;
    }

    /* renamed from: e */
    public void mo31538e(@ts2 C5663i5 i5Var) {
        this.f26254a = i5Var;
    }
}
