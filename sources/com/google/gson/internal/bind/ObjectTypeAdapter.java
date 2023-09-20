package com.google.gson.internal.bind;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.gf4;
import com.onedelhi.secure.hf4;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.t32;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends cj4<Object> {

    /* renamed from: a */
    public static final dj4 f25463a = m35335k(gf4.DOUBLE);

    /* renamed from: a */
    public final fj1 f25464a;

    /* renamed from: a */
    public final hf4 f25465a;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    public static /* synthetic */ class C4391a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25467a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.fw1[] r0 = com.onedelhi.secure.fw1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25467a = r0
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25467a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25467a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25467a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25467a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25467a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.C4391a.<clinit>():void");
        }
    }

    public ObjectTypeAdapter(fj1 fj1, hf4 hf4) {
        this.f25464a = fj1;
        this.f25465a = hf4;
    }

    /* renamed from: j */
    public static dj4 m35334j(hf4 hf4) {
        return hf4 == gf4.DOUBLE ? f25463a : m35335k(hf4);
    }

    /* renamed from: k */
    public static dj4 m35335k(final hf4 hf4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                if (tj4.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(fj1, hf4.this);
                }
                return null;
            }
        };
    }

    /* renamed from: e */
    public Object mo30144e(xv1 xv1) throws IOException {
        switch (C4391a.f25467a[xv1.mo36944q0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                xv1.mo36929a();
                while (xv1.mo36922A()) {
                    arrayList.add(mo30144e(xv1));
                }
                xv1.mo36937h();
                return arrayList;
            case 2:
                t32 t32 = new t32();
                xv1.mo36930b();
                while (xv1.mo36922A()) {
                    t32.put(xv1.mo36932c0(), mo30144e(xv1));
                }
                xv1.mo36941l();
                return t32;
            case 3:
                return xv1.mo36942o0();
            case 4:
                return this.f25465a.mo36699a(xv1);
            case 5:
                return Boolean.valueOf(xv1.mo36923M());
            case 6:
                xv1.mo36940j0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    public void mo30145i(lw1 lw1, Object obj) throws IOException {
        if (obj == null) {
            lw1.mo37582M();
            return;
        }
        cj4<?> q = this.f25464a.mo36015q(obj.getClass());
        if (q instanceof ObjectTypeAdapter) {
            lw1.mo37589d();
            lw1.mo37592l();
            return;
        }
        q.mo30145i(lw1, obj);
    }
}
