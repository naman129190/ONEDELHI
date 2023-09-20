package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.util.NavigableMap;

@sj3(19)
public final class vz3 implements ob2 {

    /* renamed from: a */
    public static final int f21996a = 8;

    /* renamed from: a */
    public final C3822b f21997a = new C3822b();

    /* renamed from: a */
    public final yi1<C3821a, Bitmap> f21998a = new yi1<>();

    /* renamed from: a */
    public final NavigableMap<Integer, Integer> f21999a = new s43();

    @hw4
    /* renamed from: com.onedelhi.secure.vz3$a */
    public static final class C3821a implements k33 {

        /* renamed from: a */
        public int f22000a;

        /* renamed from: a */
        public final C3822b f22001a;

        public C3821a(C3822b bVar) {
            this.f22001a = bVar;
        }

        /* renamed from: a */
        public void mo14602a() {
            this.f22001a.mo19086c(this);
        }

        /* renamed from: b */
        public void mo26403b(int i) {
            this.f22000a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3821a) && this.f22000a == ((C3821a) obj).f22000a;
        }

        public int hashCode() {
            return this.f22000a;
        }

        public String toString() {
            return vz3.m30562h(this.f22000a);
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.vz3$b */
    public static class C3822b extends C2634kj<C3821a> {
        /* renamed from: d */
        public C3821a mo14607a() {
            return new C3821a(this);
        }

        /* renamed from: e */
        public C3821a mo26408e(int i) {
            C3821a aVar = (C3821a) super.mo19085b();
            aVar.mo26403b(i);
            return aVar;
        }
    }

    /* renamed from: h */
    public static String m30562h(int i) {
        return "[" + i + "]";
    }

    /* renamed from: i */
    public static String m30563i(Bitmap bitmap) {
        return m30562h(oq4.m24020h(bitmap));
    }

    /* renamed from: a */
    public String mo14595a(int i, int i2, Bitmap.Config config) {
        return m30562h(oq4.m24019g(i, i2, config));
    }

    /* renamed from: b */
    public String mo14596b(Bitmap bitmap) {
        return m30563i(bitmap);
    }

    /* renamed from: c */
    public void mo14597c(Bitmap bitmap) {
        C3821a e = this.f21997a.mo26408e(oq4.m24020h(bitmap));
        this.f21998a.mo27503d(e, bitmap);
        Integer num = (Integer) this.f21999a.get(Integer.valueOf(e.f22000a));
        NavigableMap<Integer, Integer> navigableMap = this.f21999a;
        Integer valueOf = Integer.valueOf(e.f22000a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i));
    }

    @ts2
    /* renamed from: d */
    public Bitmap mo14598d(int i, int i2, Bitmap.Config config) {
        int g = oq4.m24019g(i, i2, config);
        C3821a e = this.f21997a.mo26408e(g);
        Integer ceilingKey = this.f21999a.ceilingKey(Integer.valueOf(g));
        if (!(ceilingKey == null || ceilingKey.intValue() == g || ceilingKey.intValue() > g * 8)) {
            this.f21997a.mo19086c(e);
            e = this.f21997a.mo26408e(ceilingKey.intValue());
        }
        Bitmap a = this.f21998a.mo27500a(e);
        if (a != null) {
            a.reconfigure(i, i2, config);
            mo26401g(ceilingKey);
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
        Bitmap f = this.f21998a.mo27504f();
        if (f != null) {
            mo26401g(Integer.valueOf(oq4.m24020h(f)));
        }
        return f;
    }

    /* renamed from: g */
    public final void mo26401g(Integer num) {
        Integer num2 = (Integer) this.f21999a.get(num);
        if (num2.intValue() == 1) {
            this.f21999a.remove(num);
        } else {
            this.f21999a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f21998a + "\n  SortedSizes" + this.f21999a;
    }
}
