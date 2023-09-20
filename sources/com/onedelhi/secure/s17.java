package com.onedelhi.secure;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.messaging.FirebaseMessaging;

public final class s17 {

    /* renamed from: a */
    public final za6 f20188a;

    public s17(za6 za6) {
        this.f20188a = za6;
    }

    @ly4
    /* renamed from: a */
    public final void mo24168a(String str, Bundle bundle) {
        String str2;
        this.f20188a.mo15135d().mo15139h();
        if (!this.f20188a.mo27884o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = bf0.f26274c;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f20188a.mo27864F().f18957d.mo20990b(str2);
                this.f20188a.mo27864F().f18961g.mo15076b(this.f20188a.mo15133a().currentTimeMillis());
            }
        }
    }

    @ly4
    /* renamed from: b */
    public final void mo24169b() {
        this.f20188a.mo15135d().mo15139h();
        if (mo24171d()) {
            if (mo24172e()) {
                this.f20188a.mo27864F().f18957d.mo20990b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f20188a.mo27866I().mo23910u(bf0.f26274c, "_cmpx", bundle);
            } else {
                String a = this.f20188a.mo27864F().f18957d.mo20989a();
                if (TextUtils.isEmpty(a)) {
                    this.f20188a.mo15136e().mo12728t().mo25379a("Cache still valid but referrer not found");
                } else {
                    long a2 = this.f20188a.mo27864F().f18961g.mo15075a() / 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a2 - 1) * 3600000);
                    Object obj = pair.first;
                    this.f20188a.mo27866I().mo23910u(obj == null ? FirebaseMessaging.f25020d : (String) obj, C4311b.C4317f.f25142l, (Bundle) pair.second);
                }
                this.f20188a.mo27864F().f18957d.mo20990b((String) null);
            }
            this.f20188a.mo27864F().f18961g.mo15076b(0);
        }
    }

    /* renamed from: c */
    public final void mo24170c() {
        if (mo24171d() && mo24172e()) {
            this.f20188a.mo27864F().f18957d.mo20990b((String) null);
        }
    }

    /* renamed from: d */
    public final boolean mo24171d() {
        return this.f20188a.mo27864F().f18961g.mo15075a() > 0;
    }

    /* renamed from: e */
    public final boolean mo24172e() {
        return mo24171d() && this.f20188a.mo15133a().currentTimeMillis() - this.f20188a.mo27864F().f18961g.mo15075a() > this.f20188a.mo27891z().mo14125r((String) null, n36.f17035S);
    }
}
