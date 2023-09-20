package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.C1173a;
import com.bumptech.glide.C1182c;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class ti3<TranscodeType> extends C3636tj<ti3<TranscodeType>> implements Cloneable, vj2<ti3<TranscodeType>> {

    /* renamed from: a */
    public static final mj3 f20879a = ((mj3) ((mj3) ((mj3) new mj3().mo25192p(km0.f15021c)).mo25209y0(f53.LOW)).mo25139G0(true));

    /* renamed from: a */
    public final Context f20880a;

    /* renamed from: a */
    public final C1173a f20881a;

    /* renamed from: a */
    public final C1182c f20882a;

    /* renamed from: a */
    public final fj3 f20883a;
    @mr2

    /* renamed from: a */
    public oh4<?, ? super TranscodeType> f20884a;
    @ts2

    /* renamed from: a */
    public ti3<TranscodeType> f20885a;
    @ts2

    /* renamed from: a */
    public Float f20886a;
    @ts2

    /* renamed from: a */
    public Object f20887a;
    @ts2

    /* renamed from: a */
    public List<ej3<TranscodeType>> f20888a;
    @ts2

    /* renamed from: b */
    public ti3<TranscodeType> f20889b;

    /* renamed from: b */
    public final Class<TranscodeType> f20890b;

    /* renamed from: k */
    public boolean f20891k;

    /* renamed from: l */
    public boolean f20892l;

    /* renamed from: m */
    public boolean f20893m;

    /* renamed from: com.onedelhi.secure.ti3$a */
    public static /* synthetic */ class C3635a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20894a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f20895b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.onedelhi.secure.f53[] r0 = com.onedelhi.secure.f53.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20895b = r0
                r1 = 1
                com.onedelhi.secure.f53 r2 = com.onedelhi.secure.f53.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20895b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.f53 r3 = com.onedelhi.secure.f53.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f20895b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.f53 r4 = com.onedelhi.secure.f53.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f20895b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.f53 r5 = com.onedelhi.secure.f53.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f20894a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f20894a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ti3.C3635a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    public ti3(@mr2 C1173a aVar, fj3 fj3, Class<TranscodeType> cls, Context context) {
        this.f20891k = true;
        this.f20881a = aVar;
        this.f20883a = fj3;
        this.f20890b = cls;
        this.f20880a = context;
        this.f20884a = fj3.mo15972H(cls);
        this.f20882a = aVar.mo7460k();
        mo25095f1(fj3.mo15970F());
        mo25088a(fj3.mo15971G());
    }

    @SuppressLint({"CheckResult"})
    public ti3(Class<TranscodeType> cls, ti3<?> ti3) {
        this(ti3.f20881a, ti3.f20883a, cls, ti3.f20880a);
        this.f20887a = ti3.f20887a;
        this.f20892l = ti3.f20892l;
        mo25088a(ti3);
    }

    @mr2
    /* renamed from: A1 */
    public ld1<TranscodeType> mo25073A1() {
        return mo25074B1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @mr2
    /* renamed from: B1 */
    public ld1<TranscodeType> mo25074B1(int i, int i2) {
        zi3 zi3 = new zi3(i, i2);
        return (ld1) mo25100j1(zi3, zi3, cx0.m12784a());
    }

    @mr2
    @C2677kx
    /* renamed from: C1 */
    public ti3<TranscodeType> mo25075C1(float f) {
        if (mo25167X()) {
            return mo25096g().mo25075C1(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f20886a = Float.valueOf(f);
        return (ti3) mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: D1 */
    public ti3<TranscodeType> mo25076D1(@ts2 ti3<TranscodeType> ti3) {
        if (mo25167X()) {
            return mo25096g().mo25076D1(ti3);
        }
        this.f20885a = ti3;
        return (ti3) mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: E1 */
    public ti3<TranscodeType> mo25077E1(@ts2 List<ti3<TranscodeType>> list) {
        ti3 ti3 = null;
        if (list == null || list.isEmpty()) {
            return mo25076D1((ti3) null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            ti3 ti32 = list.get(size);
            if (ti32 != null) {
                ti3 = ti3 == null ? ti32 : ti32.mo25076D1(ti3);
            }
        }
        return mo25076D1(ti3);
    }

    @mr2
    @C2677kx
    /* renamed from: F1 */
    public ti3<TranscodeType> mo25078F1(@ts2 ti3<TranscodeType>... ti3Arr) {
        return (ti3Arr == null || ti3Arr.length == 0) ? mo25076D1((ti3) null) : mo25077E1(Arrays.asList(ti3Arr));
    }

    @mr2
    @C2677kx
    /* renamed from: G1 */
    public ti3<TranscodeType> mo25079G1(@mr2 oh4<?, ? super TranscodeType> oh4) {
        if (mo25167X()) {
            return mo25096g().mo25079G1(oh4);
        }
        this.f20884a = (oh4) g43.m15509d(oh4);
        this.f20891k = false;
        return (ti3) mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: S0 */
    public ti3<TranscodeType> mo25080S0(@ts2 ej3<TranscodeType> ej3) {
        if (mo25167X()) {
            return mo25096g().mo25080S0(ej3);
        }
        if (ej3 != null) {
            if (this.f20888a == null) {
                this.f20888a = new ArrayList();
            }
            this.f20888a.add(ej3);
        }
        return (ti3) mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: T0 */
    public ti3<TranscodeType> mo25088a(@mr2 C3636tj<?> tjVar) {
        g43.m15509d(tjVar);
        return (ti3) super.mo25088a(tjVar);
    }

    /* renamed from: U0 */
    public final si3 mo25082U0(s94<TranscodeType> s94, @ts2 ej3<TranscodeType> ej3, C3636tj<?> tjVar, Executor executor) {
        return mo25083V0(new Object(), s94, ej3, (vi3) null, this.f20884a, tjVar.mo25156P(), tjVar.mo25150M(), tjVar.mo25148L(), tjVar, executor);
    }

    /* renamed from: V0 */
    public final si3 mo25083V0(Object obj, s94<TranscodeType> s94, @ts2 ej3<TranscodeType> ej3, @ts2 vi3 vi3, oh4<?, ? super TranscodeType> oh4, f53 f53, int i, int i2, C3636tj<?> tjVar, Executor executor) {
        ov0 ov0;
        ov0 ov02;
        if (this.f20889b != null) {
            ov02 = new ov0(obj, vi3);
            ov0 = ov02;
        } else {
            Object obj2 = obj;
            ov0 = null;
            ov02 = vi3;
        }
        si3 W0 = mo25084W0(obj, s94, ej3, ov02, oh4, f53, i, i2, tjVar, executor);
        if (ov0 == null) {
            return W0;
        }
        int M = this.f20889b.mo25150M();
        int L = this.f20889b.mo25148L();
        if (oq4.m24035w(i, i2) && !this.f20889b.mo25185j0()) {
            M = tjVar.mo25150M();
            L = tjVar.mo25148L();
        }
        ti3<TranscodeType> ti3 = this.f20889b;
        ov0 ov03 = ov0;
        ov03.mo22107p(W0, ti3.mo25083V0(obj, s94, ej3, ov03, ti3.f20884a, ti3.mo25156P(), M, L, this.f20889b, executor));
        return ov03;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [com.onedelhi.secure.tj<?>, com.onedelhi.secure.tj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.si3 mo25084W0(java.lang.Object r19, com.onedelhi.secure.s94<TranscodeType> r20, com.onedelhi.secure.ej3<TranscodeType> r21, @com.onedelhi.secure.ts2 com.onedelhi.secure.vi3 r22, com.onedelhi.secure.oh4<?, ? super TranscodeType> r23, com.onedelhi.secure.f53 r24, int r25, int r26, com.onedelhi.secure.C3636tj<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.onedelhi.secure.ti3<TranscodeType> r0 = r11.f20885a
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f20893m
            if (r1 != 0) goto L_0x008c
            com.onedelhi.secure.oh4<?, ? super TranscodeType> r1 = r0.f20884a
            boolean r2 = r0.f20891k
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo25172b0()
            if (r0 == 0) goto L_0x0027
            com.onedelhi.secure.ti3<TranscodeType> r0 = r11.f20885a
            com.onedelhi.secure.f53 r0 = r0.mo25156P()
            goto L_0x002b
        L_0x0027:
            com.onedelhi.secure.f53 r0 = r11.mo25094e1(r13)
        L_0x002b:
            r15 = r0
            com.onedelhi.secure.ti3<TranscodeType> r0 = r11.f20885a
            int r0 = r0.mo25150M()
            com.onedelhi.secure.ti3<TranscodeType> r1 = r11.f20885a
            int r1 = r1.mo25148L()
            boolean r2 = com.onedelhi.secure.oq4.m24035w(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.onedelhi.secure.ti3<TranscodeType> r2 = r11.f20885a
            boolean r2 = r2.mo25185j0()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo25150M()
            int r1 = r27.mo25148L()
        L_0x004e:
            r16 = r0
            r17 = r1
            com.onedelhi.secure.pc4 r10 = new com.onedelhi.secure.pc4
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            com.onedelhi.secure.si3 r10 = r0.mo25114x1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f20893m = r0
            com.onedelhi.secure.ti3<TranscodeType> r9 = r11.f20885a
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            com.onedelhi.secure.si3 r0 = r0.mo25083V0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f20893m = r1
            r13.mo22388o(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f20886a
            if (r0 == 0) goto L_0x00d4
            com.onedelhi.secure.pc4 r14 = new com.onedelhi.secure.pc4
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.onedelhi.secure.si3 r15 = r0.mo25114x1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.onedelhi.secure.tj r0 = r27.clone()
            java.lang.Float r1 = r11.f20886a
            float r1 = r1.floatValue()
            com.onedelhi.secure.tj r4 = r0.mo25137F0(r1)
            com.onedelhi.secure.f53 r7 = r11.mo25094e1(r13)
            r0 = r18
            r1 = r19
            com.onedelhi.secure.si3 r0 = r0.mo25114x1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo22388o(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.onedelhi.secure.si3 r0 = r0.mo25114x1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ti3.mo25084W0(java.lang.Object, com.onedelhi.secure.s94, com.onedelhi.secure.ej3, com.onedelhi.secure.vi3, com.onedelhi.secure.oh4, com.onedelhi.secure.f53, int, int, com.onedelhi.secure.tj, java.util.concurrent.Executor):com.onedelhi.secure.si3");
    }

    @C2677kx
    /* renamed from: X0 */
    public ti3<TranscodeType> mo25096g() {
        ti3<TranscodeType> ti3 = (ti3) super.clone();
        ti3.f20884a = ti3.f20884a.clone();
        if (ti3.f20888a != null) {
            ti3.f20888a = new ArrayList(ti3.f20888a);
        }
        ti3<TranscodeType> ti32 = ti3.f20885a;
        if (ti32 != null) {
            ti3.f20885a = ti32.mo25096g();
        }
        ti3<TranscodeType> ti33 = ti3.f20889b;
        if (ti33 != null) {
            ti3.f20889b = ti33.mo25096g();
        }
        return ti3;
    }

    /* renamed from: Y0 */
    public final ti3<TranscodeType> mo25086Y0() {
        return mo25096g().mo25090b1((ti3) null).mo25076D1((ti3) null);
    }

    @C2677kx
    @Deprecated
    /* renamed from: Z0 */
    public ld1<File> mo25087Z0(int i, int i2) {
        return mo25093d1().mo25074B1(i, i2);
    }

    @C2677kx
    @Deprecated
    /* renamed from: a1 */
    public <Y extends s94<File>> Y mo25089a1(@mr2 Y y) {
        return mo25093d1().mo25098h1(y);
    }

    @mr2
    /* renamed from: b1 */
    public ti3<TranscodeType> mo25090b1(@ts2 ti3<TranscodeType> ti3) {
        if (mo25167X()) {
            return mo25096g().mo25090b1(ti3);
        }
        this.f20889b = ti3;
        return (ti3) mo25131C0();
    }

    @mr2
    @C2677kx
    /* renamed from: c1 */
    public ti3<TranscodeType> mo25091c1(Object obj) {
        return mo25090b1(obj == null ? null : mo25086Y0().mo16003l(obj));
    }

    @mr2
    @C2677kx
    /* renamed from: d1 */
    public ti3<File> mo25093d1() {
        return new ti3(File.class, this).mo25088a(f20879a);
    }

    @mr2
    /* renamed from: e1 */
    public final f53 mo25094e1(@mr2 f53 f53) {
        int i = C3635a.f20895b[f53.ordinal()];
        if (i == 1) {
            return f53.NORMAL;
        }
        if (i == 2) {
            return f53.HIGH;
        }
        if (i == 3 || i == 4) {
            return f53.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo25156P());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: f1 */
    public final void mo25095f1(List<ej3<Object>> list) {
        for (ej3<Object> S0 : list) {
            mo25080S0(S0);
        }
    }

    @Deprecated
    /* renamed from: g1 */
    public ld1<TranscodeType> mo25097g1(int i, int i2) {
        return mo25074B1(i, i2);
    }

    @mr2
    /* renamed from: h1 */
    public <Y extends s94<TranscodeType>> Y mo25098h1(@mr2 Y y) {
        return mo25100j1(y, (ej3) null, cx0.m12785b());
    }

    /* renamed from: i1 */
    public final <Y extends s94<TranscodeType>> Y mo25099i1(@mr2 Y y, @ts2 ej3<TranscodeType> ej3, C3636tj<?> tjVar, Executor executor) {
        g43.m15509d(y);
        if (this.f20892l) {
            si3 U0 = mo25082U0(y, ej3, tjVar, executor);
            si3 m = y.mo16335m();
            if (!U0.mo19959f(m) || mo25102l1(tjVar, m)) {
                this.f20883a.mo15967C(y);
                y.mo16333a(U0);
                this.f20883a.mo15992b0(y, U0);
                return y;
            }
            if (!((si3) g43.m15509d(m)).isRunning()) {
                m.mo19957d();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @mr2
    /* renamed from: j1 */
    public <Y extends s94<TranscodeType>> Y mo25100j1(@mr2 Y y, @ts2 ej3<TranscodeType> ej3, Executor executor) {
        return mo25099i1(y, ej3, this, executor);
    }

    @mr2
    /* renamed from: k1 */
    public gv4<ImageView, TranscodeType> mo25101k1(@mr2 ImageView imageView) {
        C3636tj tjVar;
        oq4.m24014b();
        g43.m15509d(imageView);
        if (!mo25184i0() && mo25180g0() && imageView.getScaleType() != null) {
            switch (C3635a.f20894a[imageView.getScaleType().ordinal()]) {
                case 1:
                    tjVar = clone().mo25189m0();
                    break;
                case 2:
                case 6:
                    tjVar = clone().mo25190n0();
                    break;
                case 3:
                case 4:
                case 5:
                    tjVar = clone().mo25193p0();
                    break;
            }
        }
        tjVar = this;
        return (gv4) mo25099i1(this.f20882a.mo7493a(imageView, this.f20890b), (ej3) null, tjVar, cx0.m12785b());
    }

    /* renamed from: l1 */
    public final boolean mo25102l1(C3636tj<?> tjVar, si3 si3) {
        return !tjVar.mo25170a0() && si3.mo19960h();
    }

    @mr2
    @C2677kx
    /* renamed from: m1 */
    public ti3<TranscodeType> mo25103m1(@ts2 ej3<TranscodeType> ej3) {
        if (mo25167X()) {
            return mo25096g().mo25103m1(ej3);
        }
        this.f20888a = null;
        return mo25080S0(ej3);
    }

    @mr2
    @C2677kx
    /* renamed from: n1 */
    public ti3<TranscodeType> mo16009q(@ts2 Bitmap bitmap) {
        return mo25113w1(bitmap).mo25088a(mj3.m21650X0(km0.f15020b));
    }

    @mr2
    @C2677kx
    /* renamed from: o1 */
    public ti3<TranscodeType> mo16010t(@ts2 Drawable drawable) {
        return mo25113w1(drawable).mo25088a(mj3.m21650X0(km0.f15020b));
    }

    @mr2
    @C2677kx
    /* renamed from: p1 */
    public ti3<TranscodeType> mo16002k(@ts2 Uri uri) {
        return mo25113w1(uri);
    }

    @mr2
    @C2677kx
    /* renamed from: q1 */
    public ti3<TranscodeType> mo16000i(@ts2 File file) {
        return mo25113w1(file);
    }

    @mr2
    @C2677kx
    /* renamed from: r1 */
    public ti3<TranscodeType> mo16005o(@dp0 @mf3 @ts2 Integer num) {
        return mo25113w1(num).mo25088a(mj3.m21667o1(C4044z5.m32869c(this.f20880a)));
    }

    @mr2
    @C2677kx
    /* renamed from: s1 */
    public ti3<TranscodeType> mo16003l(@ts2 Object obj) {
        return mo25113w1(obj);
    }

    @mr2
    @C2677kx
    /* renamed from: t1 */
    public ti3<TranscodeType> mo16004n(@ts2 String str) {
        return mo25113w1(str);
    }

    @C2677kx
    @Deprecated
    /* renamed from: u1 */
    public ti3<TranscodeType> mo15998f(@ts2 URL url) {
        return mo25113w1(url);
    }

    @mr2
    @C2677kx
    /* renamed from: v1 */
    public ti3<TranscodeType> mo16001j(@ts2 byte[] bArr) {
        ti3<TranscodeType> w1 = mo25113w1(bArr);
        if (!w1.mo25168Y()) {
            w1 = w1.mo25088a(mj3.m21650X0(km0.f15020b));
        }
        return !w1.mo25179f0() ? w1.mo25088a(mj3.m21669q1(true)) : w1;
    }

    @mr2
    /* renamed from: w1 */
    public final ti3<TranscodeType> mo25113w1(@ts2 Object obj) {
        if (mo25167X()) {
            return mo25096g().mo25113w1(obj);
        }
        this.f20887a = obj;
        this.f20892l = true;
        return (ti3) mo25131C0();
    }

    /* renamed from: x1 */
    public final si3 mo25114x1(Object obj, s94<TranscodeType> s94, ej3<TranscodeType> ej3, C3636tj<?> tjVar, vi3 vi3, oh4<?, ? super TranscodeType> oh4, f53 f53, int i, int i2, Executor executor) {
        Context context = this.f20880a;
        C1182c cVar = this.f20882a;
        return lz3.m21081x(context, cVar, obj, this.f20887a, this.f20890b, tjVar, i, i2, f53, s94, ej3, this.f20888a, vi3, cVar.mo7498f(), oh4.mo21935c(), executor);
    }

    @mr2
    /* renamed from: y1 */
    public s94<TranscodeType> mo25115y1() {
        return mo25116z1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @mr2
    /* renamed from: z1 */
    public s94<TranscodeType> mo25116z1(int i, int i2) {
        return mo25098h1(r43.m26307i(this.f20883a, i, i2));
    }
}
