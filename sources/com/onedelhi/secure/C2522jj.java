package com.onedelhi.secure;

import android.text.TextUtils;
import com.onedelhi.secure.rj2;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.jj */
public abstract class C2522jj<Model> implements rj2<Model, InputStream> {
    @ts2

    /* renamed from: a */
    public final qj2<Model, gh1> f14194a;

    /* renamed from: a */
    public final rj2<gh1, InputStream> f14195a;

    public C2522jj(rj2<gh1, InputStream> rj2) {
        this(rj2, (qj2) null);
    }

    public C2522jj(rj2<gh1, InputStream> rj2, @ts2 qj2<Model, gh1> qj2) {
        this.f14195a = rj2;
        this.f14194a = qj2;
    }

    /* renamed from: c */
    public static List<ky1> m18605c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String gh1 : collection) {
            arrayList.add(new gh1(gh1));
        }
        return arrayList;
    }

    @ts2
    /* renamed from: a */
    public rj2.C3418a<InputStream> mo13191a(@mr2 Model model, int i, int i2, @mr2 zw2 zw2) {
        qj2<Model, gh1> qj2 = this.f14194a;
        gh1 b = qj2 != null ? qj2.mo23190b(model, i, i2) : null;
        if (b == null) {
            String f = mo18445f(model, i, i2, zw2);
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            gh1 gh1 = new gh1(f, mo18444e(model, i, i2, zw2));
            qj2<Model, gh1> qj22 = this.f14194a;
            if (qj22 != null) {
                qj22.mo23191c(model, i, i2, gh1);
            }
            b = gh1;
        }
        List<String> d = mo18443d(model, i, i2, zw2);
        rj2.C3418a<InputStream> a = this.f14195a.mo13191a(b, i, i2, zw2);
        return (a == null || d.isEmpty()) ? a : new rj2.C3418a<>(a.f19899a, m18605c(d), a.f19900a);
    }

    /* renamed from: d */
    public List<String> mo18443d(Model model, int i, int i2, zw2 zw2) {
        return Collections.emptyList();
    }

    @ts2
    /* renamed from: e */
    public vk1 mo18444e(Model model, int i, int i2, zw2 zw2) {
        return vk1.f21843b;
    }

    /* renamed from: f */
    public abstract String mo18445f(Model model, int i, int i2, zw2 zw2);
}
