package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.C3636tj;
import java.util.Map;

/* renamed from: com.onedelhi.secure.tj */
public abstract class C3636tj<T extends C3636tj<T>> implements Cloneable {

    /* renamed from: A */
    public static final int f20903A = 128;

    /* renamed from: B */
    public static final int f20904B = 256;

    /* renamed from: C */
    public static final int f20905C = 512;

    /* renamed from: D */
    public static final int f20906D = 1024;

    /* renamed from: E */
    public static final int f20907E = 2048;

    /* renamed from: F */
    public static final int f20908F = 4096;

    /* renamed from: G */
    public static final int f20909G = 8192;

    /* renamed from: H */
    public static final int f20910H = 16384;

    /* renamed from: I */
    public static final int f20911I = 32768;

    /* renamed from: J */
    public static final int f20912J = 65536;

    /* renamed from: K */
    public static final int f20913K = 131072;

    /* renamed from: L */
    public static final int f20914L = 262144;

    /* renamed from: M */
    public static final int f20915M = 524288;

    /* renamed from: N */
    public static final int f20916N = 1048576;

    /* renamed from: t */
    public static final int f20917t = -1;

    /* renamed from: u */
    public static final int f20918u = 2;

    /* renamed from: v */
    public static final int f20919v = 4;

    /* renamed from: w */
    public static final int f20920w = 8;

    /* renamed from: x */
    public static final int f20921x = 16;

    /* renamed from: y */
    public static final int f20922y = 32;

    /* renamed from: z */
    public static final int f20923z = 64;

    /* renamed from: a */
    public float f20924a = 1.0f;
    @ts2

    /* renamed from: a */
    public Resources.Theme f20925a;
    @ts2

    /* renamed from: a */
    public Drawable f20926a;
    @mr2

    /* renamed from: a */
    public f53 f20927a = f53.NORMAL;
    @mr2

    /* renamed from: a */
    public km0 f20928a = km0.f15023e;
    @mr2

    /* renamed from: a */
    public ky1 f20929a = qt0.m26155c();
    @mr2

    /* renamed from: a */
    public zw2 f20930a = new zw2();
    @mr2

    /* renamed from: a */
    public Class<?> f20931a = Object.class;
    @mr2

    /* renamed from: a */
    public Map<Class<?>, sg4<?>> f20932a = new C2460is();
    @ts2

    /* renamed from: b */
    public Drawable f20933b;

    /* renamed from: b */
    public boolean f20934b = true;
    @ts2

    /* renamed from: c */
    public Drawable f20935c;

    /* renamed from: c */
    public boolean f20936c;

    /* renamed from: d */
    public boolean f20937d = true;

    /* renamed from: e */
    public boolean f20938e;

    /* renamed from: f */
    public boolean f20939f;

    /* renamed from: g */
    public boolean f20940g;

    /* renamed from: h */
    public boolean f20941h;

    /* renamed from: i */
    public boolean f20942i = true;

    /* renamed from: j */
    public boolean f20943j;

    /* renamed from: n */
    public int f20944n;

    /* renamed from: o */
    public int f20945o;

    /* renamed from: p */
    public int f20946p;

    /* renamed from: q */
    public int f20947q = -1;

    /* renamed from: r */
    public int f20948r = -1;

    /* renamed from: s */
    public int f20949s;

    /* renamed from: e0 */
    public static boolean m28698e0(int i, int i2) {
        return (i & i2) != 0;
    }

    @mr2
    @C2677kx
    /* renamed from: A */
    public T mo25126A(@ts2 Drawable drawable) {
        if (this.f20939f) {
            return clone().mo25126A(drawable);
        }
        this.f20935c = drawable;
        this.f20949s = 0;
        this.f20944n = (this.f20944n | 8192) & -16385;
        return mo25131C0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo25127A0(@com.onedelhi.secure.mr2 com.onedelhi.secure.no0 r1, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            com.onedelhi.secure.tj r1 = r0.mo25145J0(r1, r2)
            goto L_0x000b
        L_0x0007:
            com.onedelhi.secure.tj r1 = r0.mo25196r0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f20942i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25127A0(com.onedelhi.secure.no0, com.onedelhi.secure.sg4, boolean):com.onedelhi.secure.tj");
    }

    @mr2
    @C2677kx
    /* renamed from: B */
    public T mo25128B() {
        return mo25211z0(no0.f17496c, new c71());
    }

    /* renamed from: B0 */
    public final T mo25129B0() {
        return this;
    }

    @mr2
    @C2677kx
    /* renamed from: C */
    public T mo25130C(@mr2 lf0 lf0) {
        g43.m15509d(lf0);
        return mo25133D0(oo0.f18036a, lf0).mo25133D0(xg1.f22553a, lf0);
    }

    @mr2
    /* renamed from: C0 */
    public final T mo25131C0() {
        if (!this.f20938e) {
            return mo25129B0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @mr2
    @C2677kx
    /* renamed from: D */
    public T mo25132D(@js1(from = 0) long j) {
        return mo25133D0(dt4.f10912a, Long.valueOf(j));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.ow2, java.lang.Object, com.onedelhi.secure.ow2<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo25133D0(@com.onedelhi.secure.mr2 com.onedelhi.secure.ow2<Y> r2, @com.onedelhi.secure.mr2 Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f20939f
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.tj r0 = r1.clone()
            com.onedelhi.secure.tj r2 = r0.mo25133D0(r2, r3)
            return r2
        L_0x000d:
            com.onedelhi.secure.g43.m15509d(r2)
            com.onedelhi.secure.g43.m15509d(r3)
            com.onedelhi.secure.zw2 r0 = r1.f20930a
            r0.mo28150e(r2, r3)
            com.onedelhi.secure.tj r2 = r1.mo25131C0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25133D0(com.onedelhi.secure.ow2, java.lang.Object):com.onedelhi.secure.tj");
    }

    @mr2
    /* renamed from: E */
    public final km0 mo25134E() {
        return this.f20928a;
    }

    @mr2
    @C2677kx
    /* renamed from: E0 */
    public T mo25135E0(@mr2 ky1 ky1) {
        if (this.f20939f) {
            return clone().mo25135E0(ky1);
        }
        this.f20929a = (ky1) g43.m15509d(ky1);
        this.f20944n |= 1024;
        return mo25131C0();
    }

    /* renamed from: F */
    public final int mo25136F() {
        return this.f20945o;
    }

    @mr2
    @C2677kx
    /* renamed from: F0 */
    public T mo25137F0(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (this.f20939f) {
            return clone().mo25137F0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f20924a = f;
        this.f20944n |= 2;
        return mo25131C0();
    }

    @ts2
    /* renamed from: G */
    public final Drawable mo25138G() {
        return this.f20926a;
    }

    @mr2
    @C2677kx
    /* renamed from: G0 */
    public T mo25139G0(boolean z) {
        if (this.f20939f) {
            return clone().mo25139G0(true);
        }
        this.f20934b = !z;
        this.f20944n |= 256;
        return mo25131C0();
    }

    @ts2
    /* renamed from: H */
    public final Drawable mo25140H() {
        return this.f20935c;
    }

    @mr2
    @C2677kx
    /* renamed from: H0 */
    public T mo25141H0(@ts2 Resources.Theme theme) {
        if (this.f20939f) {
            return clone().mo25141H0(theme);
        }
        this.f20925a = theme;
        this.f20944n |= 32768;
        return mo25131C0();
    }

    /* renamed from: I */
    public final int mo25142I() {
        return this.f20949s;
    }

    @mr2
    @C2677kx
    /* renamed from: I0 */
    public T mo25143I0(@js1(from = 0) int i) {
        return mo25133D0(nm1.f17486a, Integer.valueOf(i));
    }

    /* renamed from: J */
    public final boolean mo25144J() {
        return this.f20941h;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo25145J0(@com.onedelhi.secure.mr2 com.onedelhi.secure.no0 r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f20939f
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.tj r0 = r1.clone()
            com.onedelhi.secure.tj r2 = r0.mo25145J0(r2, r3)
            return r2
        L_0x000d:
            r1.mo25200u(r2)
            com.onedelhi.secure.tj r2 = r1.mo25147K0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25145J0(com.onedelhi.secure.no0, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    @mr2
    /* renamed from: K */
    public final zw2 mo25146K() {
        return this.f20930a;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo25147K0(@com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            com.onedelhi.secure.tj r2 = r1.mo25149L0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25147K0(com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    /* renamed from: L */
    public final int mo25148L() {
        return this.f20947q;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo25149L0(@com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f20939f
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.tj r0 = r2.clone()
            com.onedelhi.secure.tj r3 = r0.mo25149L0(r3, r4)
            return r3
        L_0x000d:
            com.onedelhi.secure.hp0 r0 = new com.onedelhi.secure.hp0
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo25153N0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo25153N0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.onedelhi.secure.sg4 r0 = r0.mo17368c()
            r2.mo25153N0(r1, r0, r4)
            java.lang.Class<com.onedelhi.secure.ng1> r0 = com.onedelhi.secure.ng1.class
            com.onedelhi.secure.rg1 r1 = new com.onedelhi.secure.rg1
            r1.<init>(r3)
            r2.mo25153N0(r0, r1, r4)
            com.onedelhi.secure.tj r3 = r2.mo25131C0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25149L0(com.onedelhi.secure.sg4, boolean):com.onedelhi.secure.tj");
    }

    /* renamed from: M */
    public final int mo25150M() {
        return this.f20948r;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4<Y>, com.onedelhi.secure.sg4] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo25151M0(@com.onedelhi.secure.mr2 java.lang.Class<Y> r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<Y> r3) {
        /*
            r1 = this;
            r0 = 1
            com.onedelhi.secure.tj r2 = r1.mo25153N0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25151M0(java.lang.Class, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    @ts2
    /* renamed from: N */
    public final Drawable mo25152N() {
        return this.f20933b;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4<Y>, java.lang.Object, com.onedelhi.secure.sg4] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @com.onedelhi.secure.mr2
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo25153N0(@com.onedelhi.secure.mr2 java.lang.Class<Y> r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f20939f
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.tj r0 = r1.clone()
            com.onedelhi.secure.tj r2 = r0.mo25153N0(r2, r3, r4)
            return r2
        L_0x000d:
            com.onedelhi.secure.g43.m15509d(r2)
            com.onedelhi.secure.g43.m15509d(r3)
            java.util.Map<java.lang.Class<?>, com.onedelhi.secure.sg4<?>> r0 = r1.f20932a
            r0.put(r2, r3)
            int r2 = r1.f20944n
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f20937d = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f20944n = r2
            r0 = 0
            r1.f20942i = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f20944n = r2
            r1.f20936c = r3
        L_0x0030:
            com.onedelhi.secure.tj r2 = r1.mo25131C0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25153N0(java.lang.Class, com.onedelhi.secure.sg4, boolean):com.onedelhi.secure.tj");
    }

    /* renamed from: O */
    public final int mo25154O() {
        return this.f20946p;
    }

    @mr2
    @C2677kx
    /* renamed from: O0 */
    public T mo25155O0(@mr2 sg4<Bitmap>... sg4Arr) {
        return sg4Arr.length > 1 ? mo25149L0(new bm2((sg4<T>[]) sg4Arr), true) : sg4Arr.length == 1 ? mo25147K0(sg4Arr[0]) : mo25131C0();
    }

    @mr2
    /* renamed from: P */
    public final f53 mo25156P() {
        return this.f20927a;
    }

    @mr2
    @C2677kx
    @Deprecated
    /* renamed from: P0 */
    public T mo25157P0(@mr2 sg4<Bitmap>... sg4Arr) {
        return mo25149L0(new bm2((sg4<T>[]) sg4Arr), true);
    }

    @mr2
    /* renamed from: Q */
    public final Class<?> mo25158Q() {
        return this.f20931a;
    }

    @mr2
    @C2677kx
    /* renamed from: Q0 */
    public T mo25159Q0(boolean z) {
        if (this.f20939f) {
            return clone().mo25159Q0(z);
        }
        this.f20943j = z;
        this.f20944n |= 1048576;
        return mo25131C0();
    }

    @mr2
    /* renamed from: R */
    public final ky1 mo25160R() {
        return this.f20929a;
    }

    @mr2
    @C2677kx
    /* renamed from: R0 */
    public T mo25161R0(boolean z) {
        if (this.f20939f) {
            return clone().mo25161R0(z);
        }
        this.f20940g = z;
        this.f20944n |= 262144;
        return mo25131C0();
    }

    /* renamed from: S */
    public final float mo25162S() {
        return this.f20924a;
    }

    @ts2
    /* renamed from: T */
    public final Resources.Theme mo25163T() {
        return this.f20925a;
    }

    @mr2
    /* renamed from: U */
    public final Map<Class<?>, sg4<?>> mo25164U() {
        return this.f20932a;
    }

    /* renamed from: V */
    public final boolean mo25165V() {
        return this.f20943j;
    }

    /* renamed from: W */
    public final boolean mo25166W() {
        return this.f20940g;
    }

    /* renamed from: X */
    public final boolean mo25167X() {
        return this.f20939f;
    }

    /* renamed from: Y */
    public final boolean mo25168Y() {
        return mo25176d0(4);
    }

    /* renamed from: Z */
    public final boolean mo25169Z() {
        return this.f20938e;
    }

    @mr2
    @C2677kx
    /* renamed from: a */
    public T mo25088a(@mr2 C3636tj<?> tjVar) {
        if (this.f20939f) {
            return clone().mo25088a(tjVar);
        }
        if (m28698e0(tjVar.f20944n, 2)) {
            this.f20924a = tjVar.f20924a;
        }
        if (m28698e0(tjVar.f20944n, 262144)) {
            this.f20940g = tjVar.f20940g;
        }
        if (m28698e0(tjVar.f20944n, 1048576)) {
            this.f20943j = tjVar.f20943j;
        }
        if (m28698e0(tjVar.f20944n, 4)) {
            this.f20928a = tjVar.f20928a;
        }
        if (m28698e0(tjVar.f20944n, 8)) {
            this.f20927a = tjVar.f20927a;
        }
        if (m28698e0(tjVar.f20944n, 16)) {
            this.f20926a = tjVar.f20926a;
            this.f20945o = 0;
            this.f20944n &= -33;
        }
        if (m28698e0(tjVar.f20944n, 32)) {
            this.f20945o = tjVar.f20945o;
            this.f20926a = null;
            this.f20944n &= -17;
        }
        if (m28698e0(tjVar.f20944n, 64)) {
            this.f20933b = tjVar.f20933b;
            this.f20946p = 0;
            this.f20944n &= -129;
        }
        if (m28698e0(tjVar.f20944n, 128)) {
            this.f20946p = tjVar.f20946p;
            this.f20933b = null;
            this.f20944n &= -65;
        }
        if (m28698e0(tjVar.f20944n, 256)) {
            this.f20934b = tjVar.f20934b;
        }
        if (m28698e0(tjVar.f20944n, 512)) {
            this.f20948r = tjVar.f20948r;
            this.f20947q = tjVar.f20947q;
        }
        if (m28698e0(tjVar.f20944n, 1024)) {
            this.f20929a = tjVar.f20929a;
        }
        if (m28698e0(tjVar.f20944n, 4096)) {
            this.f20931a = tjVar.f20931a;
        }
        if (m28698e0(tjVar.f20944n, 8192)) {
            this.f20935c = tjVar.f20935c;
            this.f20949s = 0;
            this.f20944n &= -16385;
        }
        if (m28698e0(tjVar.f20944n, 16384)) {
            this.f20949s = tjVar.f20949s;
            this.f20935c = null;
            this.f20944n &= -8193;
        }
        if (m28698e0(tjVar.f20944n, 32768)) {
            this.f20925a = tjVar.f20925a;
        }
        if (m28698e0(tjVar.f20944n, 65536)) {
            this.f20937d = tjVar.f20937d;
        }
        if (m28698e0(tjVar.f20944n, 131072)) {
            this.f20936c = tjVar.f20936c;
        }
        if (m28698e0(tjVar.f20944n, 2048)) {
            this.f20932a.putAll(tjVar.f20932a);
            this.f20942i = tjVar.f20942i;
        }
        if (m28698e0(tjVar.f20944n, 524288)) {
            this.f20941h = tjVar.f20941h;
        }
        if (!this.f20937d) {
            this.f20932a.clear();
            this.f20936c = false;
            this.f20944n = this.f20944n & -2049 & -131073;
            this.f20942i = true;
        }
        this.f20944n |= tjVar.f20944n;
        this.f20930a.mo28149d(tjVar.f20930a);
        return mo25131C0();
    }

    /* renamed from: a0 */
    public final boolean mo25170a0() {
        return this.f20934b;
    }

    @mr2
    /* renamed from: b */
    public T mo25171b() {
        if (!this.f20938e || this.f20939f) {
            this.f20939f = true;
            return mo25186k0();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b0 */
    public final boolean mo25172b0() {
        return mo25176d0(8);
    }

    @mr2
    @C2677kx
    /* renamed from: c */
    public T mo25173c() {
        return mo25145J0(no0.f17498e, new C3016nv());
    }

    /* renamed from: c0 */
    public boolean mo25174c0() {
        return this.f20942i;
    }

    @mr2
    @C2677kx
    /* renamed from: d */
    public T mo25175d() {
        return mo25211z0(no0.f17497d, new C3195pv());
    }

    /* renamed from: d0 */
    public final boolean mo25176d0(int i) {
        return m28698e0(this.f20944n, i);
    }

    @mr2
    @C2677kx
    /* renamed from: e */
    public T mo25177e() {
        return mo25145J0(no0.f17497d, new C1737ay());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3636tj)) {
            return false;
        }
        C3636tj tjVar = (C3636tj) obj;
        return Float.compare(tjVar.f20924a, this.f20924a) == 0 && this.f20945o == tjVar.f20945o && oq4.m24016d(this.f20926a, tjVar.f20926a) && this.f20946p == tjVar.f20946p && oq4.m24016d(this.f20933b, tjVar.f20933b) && this.f20949s == tjVar.f20949s && oq4.m24016d(this.f20935c, tjVar.f20935c) && this.f20934b == tjVar.f20934b && this.f20947q == tjVar.f20947q && this.f20948r == tjVar.f20948r && this.f20936c == tjVar.f20936c && this.f20937d == tjVar.f20937d && this.f20940g == tjVar.f20940g && this.f20941h == tjVar.f20941h && this.f20928a.equals(tjVar.f20928a) && this.f20927a == tjVar.f20927a && this.f20930a.equals(tjVar.f20930a) && this.f20932a.equals(tjVar.f20932a) && this.f20931a.equals(tjVar.f20931a) && oq4.m24016d(this.f20929a, tjVar.f20929a) && oq4.m24016d(this.f20925a, tjVar.f20925a);
    }

    /* renamed from: f0 */
    public final boolean mo25179f0() {
        return mo25176d0(256);
    }

    @C2677kx
    /* renamed from: g */
    public T clone() {
        try {
            T t = (C3636tj) super.clone();
            zw2 zw2 = new zw2();
            t.f20930a = zw2;
            zw2.mo28149d(this.f20930a);
            C2460is isVar = new C2460is();
            t.f20932a = isVar;
            isVar.putAll(this.f20932a);
            t.f20938e = false;
            t.f20939f = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g0 */
    public final boolean mo25180g0() {
        return this.f20937d;
    }

    @mr2
    @C2677kx
    /* renamed from: h */
    public T mo25181h(@mr2 Class<?> cls) {
        if (this.f20939f) {
            return clone().mo25181h(cls);
        }
        this.f20931a = (Class) g43.m15509d(cls);
        this.f20944n |= 4096;
        return mo25131C0();
    }

    /* renamed from: h0 */
    public final boolean mo25182h0() {
        return this.f20936c;
    }

    public int hashCode() {
        return oq4.m24029q(this.f20925a, oq4.m24029q(this.f20929a, oq4.m24029q(this.f20931a, oq4.m24029q(this.f20932a, oq4.m24029q(this.f20930a, oq4.m24029q(this.f20927a, oq4.m24029q(this.f20928a, oq4.m24031s(this.f20941h, oq4.m24031s(this.f20940g, oq4.m24031s(this.f20937d, oq4.m24031s(this.f20936c, oq4.m24028p(this.f20948r, oq4.m24028p(this.f20947q, oq4.m24031s(this.f20934b, oq4.m24029q(this.f20935c, oq4.m24028p(this.f20949s, oq4.m24029q(this.f20933b, oq4.m24028p(this.f20946p, oq4.m24029q(this.f20926a, oq4.m24028p(this.f20945o, oq4.m24025m(this.f20924a)))))))))))))))))))));
    }

    /* renamed from: i0 */
    public final boolean mo25184i0() {
        return mo25176d0(2048);
    }

    /* renamed from: j0 */
    public final boolean mo25185j0() {
        return oq4.m24035w(this.f20948r, this.f20947q);
    }

    @mr2
    /* renamed from: k0 */
    public T mo25186k0() {
        this.f20938e = true;
        return mo25129B0();
    }

    @mr2
    @C2677kx
    /* renamed from: l0 */
    public T mo25187l0(boolean z) {
        if (this.f20939f) {
            return clone().mo25187l0(z);
        }
        this.f20941h = z;
        this.f20944n |= 524288;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: m */
    public T mo25188m() {
        return mo25133D0(oo0.f18046e, Boolean.FALSE);
    }

    @mr2
    @C2677kx
    /* renamed from: m0 */
    public T mo25189m0() {
        return mo25196r0(no0.f17498e, new C3016nv());
    }

    @mr2
    @C2677kx
    /* renamed from: n0 */
    public T mo25190n0() {
        return mo25194q0(no0.f17497d, new C3195pv());
    }

    @mr2
    @C2677kx
    /* renamed from: o0 */
    public T mo25191o0() {
        return mo25196r0(no0.f17498e, new C1737ay());
    }

    @mr2
    @C2677kx
    /* renamed from: p */
    public T mo25192p(@mr2 km0 km0) {
        if (this.f20939f) {
            return clone().mo25192p(km0);
        }
        this.f20928a = (km0) g43.m15509d(km0);
        this.f20944n |= 4;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: p0 */
    public T mo25193p0() {
        return mo25194q0(no0.f17496c, new c71());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo25194q0(@com.onedelhi.secure.mr2 com.onedelhi.secure.no0 r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            com.onedelhi.secure.tj r2 = r1.mo25127A0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25194q0(com.onedelhi.secure.no0, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    @mr2
    @C2677kx
    /* renamed from: r */
    public T mo25195r() {
        return mo25133D0(xg1.f22554b, Boolean.TRUE);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo25196r0(@com.onedelhi.secure.mr2 com.onedelhi.secure.no0 r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f20939f
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.tj r0 = r1.clone()
            com.onedelhi.secure.tj r2 = r0.mo25196r0(r2, r3)
            return r2
        L_0x000d:
            r1.mo25200u(r2)
            r2 = 0
            com.onedelhi.secure.tj r2 = r1.mo25149L0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25196r0(com.onedelhi.secure.no0, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    @mr2
    @C2677kx
    /* renamed from: s */
    public T mo25197s() {
        if (this.f20939f) {
            return clone().mo25197s();
        }
        this.f20932a.clear();
        this.f20936c = false;
        this.f20937d = false;
        this.f20944n = (this.f20944n & -2049 & -131073) | 65536;
        this.f20942i = true;
        return mo25131C0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo25198s0(@com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 0
            com.onedelhi.secure.tj r2 = r1.mo25149L0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25198s0(com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4<Y>, com.onedelhi.secure.sg4] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.C2677kx
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo25199t0(@com.onedelhi.secure.mr2 java.lang.Class<Y> r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<Y> r3) {
        /*
            r1 = this;
            r0 = 0
            com.onedelhi.secure.tj r2 = r1.mo25153N0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25199t0(java.lang.Class, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }

    @mr2
    @C2677kx
    /* renamed from: u */
    public T mo25200u(@mr2 no0 no0) {
        return mo25133D0(no0.f17493a, g43.m15509d(no0));
    }

    @mr2
    @C2677kx
    /* renamed from: u0 */
    public T mo25201u0(int i) {
        return mo25203v0(i, i);
    }

    @mr2
    @C2677kx
    /* renamed from: v */
    public T mo25202v(@mr2 Bitmap.CompressFormat compressFormat) {
        return mo25133D0(C1984dm.f10864b, g43.m15509d(compressFormat));
    }

    @mr2
    @C2677kx
    /* renamed from: v0 */
    public T mo25203v0(int i, int i2) {
        if (this.f20939f) {
            return clone().mo25203v0(i, i2);
        }
        this.f20948r = i;
        this.f20947q = i2;
        this.f20944n |= 512;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: w */
    public T mo25204w(@js1(from = 0, mo18580to = 100) int i) {
        return mo25133D0(C1984dm.f10862a, Integer.valueOf(i));
    }

    @mr2
    @C2677kx
    /* renamed from: w0 */
    public T mo25205w0(@dp0 int i) {
        if (this.f20939f) {
            return clone().mo25205w0(i);
        }
        this.f20946p = i;
        this.f20933b = null;
        this.f20944n = (this.f20944n | 128) & -65;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: x */
    public T mo25206x(@dp0 int i) {
        if (this.f20939f) {
            return clone().mo25206x(i);
        }
        this.f20945o = i;
        this.f20926a = null;
        this.f20944n = (this.f20944n | 32) & -17;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: x0 */
    public T mo25207x0(@ts2 Drawable drawable) {
        if (this.f20939f) {
            return clone().mo25207x0(drawable);
        }
        this.f20933b = drawable;
        this.f20946p = 0;
        this.f20944n = (this.f20944n | 64) & -129;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: y */
    public T mo25208y(@ts2 Drawable drawable) {
        if (this.f20939f) {
            return clone().mo25208y(drawable);
        }
        this.f20926a = drawable;
        this.f20945o = 0;
        this.f20944n = (this.f20944n | 16) & -33;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: y0 */
    public T mo25209y0(@mr2 f53 f53) {
        if (this.f20939f) {
            return clone().mo25209y0(f53);
        }
        this.f20927a = (f53) g43.m15509d(f53);
        this.f20944n |= 8;
        return mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: z */
    public T mo25210z(@dp0 int i) {
        if (this.f20939f) {
            return clone().mo25210z(i);
        }
        this.f20949s = i;
        this.f20935c = null;
        this.f20944n = (this.f20944n | 16384) & -8193;
        return mo25131C0();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.mr2
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo25211z0(@com.onedelhi.secure.mr2 com.onedelhi.secure.no0 r2, @com.onedelhi.secure.mr2 com.onedelhi.secure.sg4<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            com.onedelhi.secure.tj r2 = r1.mo25127A0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3636tj.mo25211z0(com.onedelhi.secure.no0, com.onedelhi.secure.sg4):com.onedelhi.secure.tj");
    }
}
