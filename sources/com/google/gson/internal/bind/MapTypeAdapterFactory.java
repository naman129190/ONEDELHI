package com.google.gson.internal.bind;

import com.onedelhi.secure.C4602b;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.jt2;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.m44;
import com.onedelhi.secure.ov1;
import com.onedelhi.secure.r60;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.vv1;
import com.onedelhi.secure.xv1;
import com.onedelhi.secure.yv1;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements dj4 {

    /* renamed from: a */
    public final r60 f25453a;

    /* renamed from: b */
    public final boolean f25454b;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    public final class C4387a<K, V> extends cj4<Map<K, V>> {

        /* renamed from: a */
        public final cj4<K> f25456a;

        /* renamed from: a */
        public final jt2<? extends Map<K, V>> f25457a;

        /* renamed from: b */
        public final cj4<V> f25458b;

        public C4387a(fj1 fj1, Type type, cj4<K> cj4, Type type2, cj4<V> cj42, jt2<? extends Map<K, V>> jt2) {
            this.f25456a = new C4435a(fj1, cj4, type);
            this.f25458b = new C4435a(fj1, cj42, type2);
            this.f25457a = jt2;
        }

        /* renamed from: j */
        public final String mo30154j(ov1 ov1) {
            if (ov1.mo42275B()) {
                vv1 t = ov1.mo42279t();
                if (t.mo46385G()) {
                    return String.valueOf(t.mo36919v());
                }
                if (t.mo46384D()) {
                    return Boolean.toString(t.mo36908g());
                }
                if (t.mo46386I()) {
                    return t.mo36921x();
                }
                throw new AssertionError();
            } else if (ov1.mo42282z()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: k */
        public Map<K, V> mo30144e(xv1 xv1) throws IOException {
            fw1 q0 = xv1.mo36944q0();
            if (q0 == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            Map<K, V> map = (Map) this.f25457a.mo38879a();
            if (q0 == fw1.BEGIN_ARRAY) {
                xv1.mo36929a();
                while (xv1.mo36922A()) {
                    xv1.mo36929a();
                    K e = this.f25456a.mo30144e(xv1);
                    if (map.put(e, this.f25458b.mo30144e(xv1)) == null) {
                        xv1.mo36937h();
                    } else {
                        throw new ew1("duplicate key: " + e);
                    }
                }
                xv1.mo36937h();
            } else {
                xv1.mo36930b();
                while (xv1.mo36922A()) {
                    yv1.f38068a.mo47419a(xv1);
                    K e2 = this.f25456a.mo30144e(xv1);
                    if (map.put(e2, this.f25458b.mo30144e(xv1)) != null) {
                        throw new ew1("duplicate key: " + e2);
                    }
                }
                xv1.mo36941l();
            }
            return map;
        }

        /* renamed from: l */
        public void mo30145i(lw1 lw1, Map<K, V> map) throws IOException {
            if (map == null) {
                lw1.mo37582M();
            } else if (!MapTypeAdapterFactory.this.f25454b) {
                lw1.mo37589d();
                for (Map.Entry next : map.entrySet()) {
                    lw1.mo37581H(String.valueOf(next.getKey()));
                    this.f25458b.mo30145i(lw1, next.getValue());
                }
                lw1.mo37592l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    ov1 h = this.f25456a.mo32410h(next2.getKey());
                    arrayList.add(h);
                    arrayList2.add(next2.getValue());
                    z |= h.mo42281y() || h.mo42274A();
                }
                if (z) {
                    lw1.mo37587c();
                    int size = arrayList.size();
                    while (i < size) {
                        lw1.mo37587c();
                        m44.m56910b((ov1) arrayList.get(i), lw1);
                        this.f25458b.mo30145i(lw1, arrayList2.get(i));
                        lw1.mo37591h();
                        i++;
                    }
                    lw1.mo37591h();
                    return;
                }
                lw1.mo37589d();
                int size2 = arrayList.size();
                while (i < size2) {
                    lw1.mo37581H(mo30154j((ov1) arrayList.get(i)));
                    this.f25458b.mo30145i(lw1, arrayList2.get(i));
                    i++;
                }
                lw1.mo37592l();
            }
        }
    }

    public MapTypeAdapterFactory(r60 r60, boolean z) {
        this.f25453a = r60;
        this.f25454b = z;
    }

    /* renamed from: a */
    public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
        Type type = tj4.getType();
        if (!Map.class.isAssignableFrom(tj4.getRawType())) {
            return null;
        }
        Type[] j = C4602b.m39223j(type, C4602b.m39224k(type));
        return new C4387a(fj1, j[0], mo30153b(fj1, j[0]), j[1], fj1.mo36014p(tj4.get(j[1])), this.f25453a.mo43820a(tj4));
    }

    /* renamed from: b */
    public final cj4<?> mo30153b(fj1 fj1, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f25505d : fj1.mo36014p(tj4.get(type));
    }
}
