package com.onedelhi.secure;

import android.graphics.Paint;
import java.util.List;

public class jx3 implements h70 {

    /* renamed from: a */
    public final float f14587a;

    /* renamed from: a */
    public final C2398i6 f14588a;
    @ts2

    /* renamed from: a */
    public final C2475j6 f14589a;

    /* renamed from: a */
    public final C2580b f14590a;

    /* renamed from: a */
    public final C2581c f14591a;

    /* renamed from: a */
    public final C2695l6 f14592a;

    /* renamed from: a */
    public final String f14593a;

    /* renamed from: a */
    public final List<C2475j6> f14594a;

    /* renamed from: a */
    public final boolean f14595a;

    /* renamed from: b */
    public final C2475j6 f14596b;

    /* renamed from: com.onedelhi.secure.jx3$a */
    public static /* synthetic */ class C2579a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14597a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f14598b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.onedelhi.secure.jx3$c[] r0 = com.onedelhi.secure.jx3.C2581c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14598b = r0
                r1 = 1
                com.onedelhi.secure.jx3$c r2 = com.onedelhi.secure.jx3.C2581c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14598b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.jx3$c r3 = com.onedelhi.secure.jx3.C2581c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f14598b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.jx3$c r4 = com.onedelhi.secure.jx3.C2581c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.onedelhi.secure.jx3$b[] r3 = com.onedelhi.secure.jx3.C2580b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f14597a = r3
                com.onedelhi.secure.jx3$b r4 = com.onedelhi.secure.jx3.C2580b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f14597a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onedelhi.secure.jx3$b r3 = com.onedelhi.secure.jx3.C2580b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f14597a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.onedelhi.secure.jx3$b r1 = com.onedelhi.secure.jx3.C2580b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jx3.C2579a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.jx3$b */
    public enum C2580b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: a */
        public Paint.Cap mo18710a() {
            int i = C2579a.f14597a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* renamed from: com.onedelhi.secure.jx3$c */
    public enum C2581c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: a */
        public Paint.Join mo18711a() {
            int i = C2579a.f14598b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public jx3(String str, @ts2 C2475j6 j6Var, List<C2475j6> list, C2398i6 i6Var, C2695l6 l6Var, C2475j6 j6Var2, C2580b bVar, C2581c cVar, float f, boolean z) {
        this.f14593a = str;
        this.f14589a = j6Var;
        this.f14594a = list;
        this.f14588a = i6Var;
        this.f14592a = l6Var;
        this.f14596b = j6Var2;
        this.f14590a = bVar;
        this.f14591a = cVar;
        this.f14587a = f;
        this.f14595a = z;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new x54(qa2, mjVar, this);
    }

    /* renamed from: b */
    public C2580b mo18700b() {
        return this.f14590a;
    }

    /* renamed from: c */
    public C2398i6 mo18701c() {
        return this.f14588a;
    }

    /* renamed from: d */
    public C2475j6 mo18702d() {
        return this.f14589a;
    }

    /* renamed from: e */
    public C2581c mo18703e() {
        return this.f14591a;
    }

    /* renamed from: f */
    public List<C2475j6> mo18704f() {
        return this.f14594a;
    }

    /* renamed from: g */
    public float mo18705g() {
        return this.f14587a;
    }

    /* renamed from: h */
    public String mo18706h() {
        return this.f14593a;
    }

    /* renamed from: i */
    public C2695l6 mo18707i() {
        return this.f14592a;
    }

    /* renamed from: j */
    public C2475j6 mo18708j() {
        return this.f14596b;
    }

    /* renamed from: k */
    public boolean mo18709k() {
        return this.f14595a;
    }
}
