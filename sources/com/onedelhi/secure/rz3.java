package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@sj3(19)
public class rz3 implements ob2 {

    /* renamed from: a */
    public static final int f20143a = 8;

    /* renamed from: a */
    public static final Bitmap.Config[] f20144a;

    /* renamed from: b */
    public static final Bitmap.Config[] f20145b;

    /* renamed from: c */
    public static final Bitmap.Config[] f20146c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    public static final Bitmap.Config[] f20147d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    public static final Bitmap.Config[] f20148e = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C3464c f20149a = new C3464c();

    /* renamed from: a */
    public final yi1<C3463b, Bitmap> f20150a = new yi1<>();

    /* renamed from: a */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f20151a = new HashMap();

    /* renamed from: com.onedelhi.secure.rz3$a */
    public static /* synthetic */ class C3462a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20152a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20152a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20152a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20152a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20152a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rz3.C3462a.<clinit>():void");
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.rz3$b */
    public static final class C3463b implements k33 {

        /* renamed from: a */
        public int f20153a;

        /* renamed from: a */
        public Bitmap.Config f20154a;

        /* renamed from: a */
        public final C3464c f20155a;

        public C3463b(C3464c cVar) {
            this.f20155a = cVar;
        }

        @hw4
        public C3463b(C3464c cVar, int i, Bitmap.Config config) {
            this(cVar);
            mo24143b(i, config);
        }

        /* renamed from: a */
        public void mo14602a() {
            this.f20155a.mo19086c(this);
        }

        /* renamed from: b */
        public void mo24143b(int i, Bitmap.Config config) {
            this.f20153a = i;
            this.f20154a = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3463b)) {
                return false;
            }
            C3463b bVar = (C3463b) obj;
            return this.f20153a == bVar.f20153a && oq4.m24016d(this.f20154a, bVar.f20154a);
        }

        public int hashCode() {
            int i = this.f20153a * 31;
            Bitmap.Config config = this.f20154a;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return rz3.m27168i(this.f20153a, this.f20154a);
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.rz3$c */
    public static class C3464c extends C2634kj<C3463b> {
        /* renamed from: d */
        public C3463b mo14607a() {
            return new C3463b(this);
        }

        /* renamed from: e */
        public C3463b mo24148e(int i, Bitmap.Config config) {
            C3463b bVar = (C3463b) mo19085b();
            bVar.mo24143b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f20144a = configArr;
        f20145b = configArr;
    }

    /* renamed from: i */
    public static String m27168i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + pl2.f33727d;
    }

    /* renamed from: j */
    public static Bitmap.Config[] m27169j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f20145b;
        }
        int i = C3462a.f20152a[config.ordinal()];
        if (i == 1) {
            return f20144a;
        }
        if (i == 2) {
            return f20146c;
        }
        if (i == 3) {
            return f20147d;
        }
        if (i == 4) {
            return f20148e;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: a */
    public String mo14595a(int i, int i2, Bitmap.Config config) {
        return m27168i(oq4.m24019g(i, i2, config), config);
    }

    /* renamed from: b */
    public String mo14596b(Bitmap bitmap) {
        return m27168i(oq4.m24020h(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public void mo14597c(Bitmap bitmap) {
        C3463b e = this.f20149a.mo24148e(oq4.m24020h(bitmap), bitmap.getConfig());
        this.f20150a.mo27503d(e, bitmap);
        NavigableMap<Integer, Integer> k = mo24141k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f20153a));
        Integer valueOf = Integer.valueOf(e.f20153a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    @ts2
    /* renamed from: d */
    public Bitmap mo14598d(int i, int i2, Bitmap.Config config) {
        C3463b h = mo24140h(oq4.m24019g(i, i2, config), config);
        Bitmap a = this.f20150a.mo27500a(h);
        if (a != null) {
            mo24139g(Integer.valueOf(h.f20153a), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public int mo14599e(Bitmap bitmap) {
        return oq4.m24020h(bitmap);
    }

    @ts2
    /* renamed from: f */
    public Bitmap mo14600f() {
        Bitmap f = this.f20150a.mo27504f();
        if (f != null) {
            mo24139g(Integer.valueOf(oq4.m24020h(f)), f);
        }
        return f;
    }

    /* renamed from: g */
    public final void mo24139g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = mo24141k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo14596b(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    public final C3463b mo24140h(int i, Bitmap.Config config) {
        C3463b e = this.f20149a.mo24148e(i, config);
        Bitmap.Config[] j = m27169j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = j[i2];
            Integer ceilingKey = mo24141k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f20149a.mo19086c(e);
                return this.f20149a.mo24148e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: k */
    public final NavigableMap<Integer, Integer> mo24141k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f20151a.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20151a.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f20150a);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f20151a.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f20151a.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
