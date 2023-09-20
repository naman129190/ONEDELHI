package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zk3;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.t8 */
public class C3569t8 {

    /* renamed from: c */
    public static final int f20680c = -1;

    /* renamed from: d */
    public static final int f20681d = 1;

    /* renamed from: e */
    public static final int f20682e = 2;

    /* renamed from: f */
    public static final int f20683f = 3;

    /* renamed from: a */
    public int f20684a = 0;

    /* renamed from: a */
    public Typeface f20685a;
    @mr2

    /* renamed from: a */
    public final TextView f20686a;
    @mr2

    /* renamed from: a */
    public final C3671u8 f20687a;

    /* renamed from: a */
    public ye4 f20688a;

    /* renamed from: a */
    public boolean f20689a;

    /* renamed from: b */
    public int f20690b = -1;

    /* renamed from: b */
    public ye4 f20691b;

    /* renamed from: c */
    public ye4 f20692c;

    /* renamed from: d */
    public ye4 f20693d;

    /* renamed from: e */
    public ye4 f20694e;

    /* renamed from: f */
    public ye4 f20695f;

    /* renamed from: g */
    public ye4 f20696g;

    /* renamed from: com.onedelhi.secure.t8$a */
    public class C3570a extends zk3.C4109g {

        /* renamed from: a */
        public final /* synthetic */ int f20697a;

        /* renamed from: a */
        public final /* synthetic */ WeakReference f20699a;

        /* renamed from: b */
        public final /* synthetic */ int f20700b;

        public C3570a(int i, int i2, WeakReference weakReference) {
            this.f20697a = i;
            this.f20700b = i2;
            this.f20699a = weakReference;
        }

        /* renamed from: h */
        public void mo24770h(int i) {
        }

        /* renamed from: i */
        public void mo24771i(@mr2 Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f20697a) != -1) {
                typeface = C3576g.m28193a(typeface, i, (this.f20700b & 2) != 0);
            }
            C3569t8.this.mo24757n(this.f20699a, typeface);
        }
    }

    /* renamed from: com.onedelhi.secure.t8$b */
    public class C3571b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Typeface f20701a;

        /* renamed from: a */
        public final /* synthetic */ TextView f20702a;

        /* renamed from: n */
        public final /* synthetic */ int f20704n;

        public C3571b(TextView textView, Typeface typeface, int i) {
            this.f20702a = textView;
            this.f20701a = typeface;
            this.f20704n = i;
        }

        public void run() {
            this.f20702a.setTypeface(this.f20701a, this.f20704n);
        }
    }

    @sj3(17)
    /* renamed from: com.onedelhi.secure.t8$c */
    public static class C3572c {
        @pn0
        /* renamed from: a */
        public static Drawable[] m28183a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @pn0
        /* renamed from: b */
        public static void m28184b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @pn0
        /* renamed from: c */
        public static void m28185c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.t8$d */
    public static class C3573d {
        @pn0
        /* renamed from: a */
        public static Locale m28186a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.t8$e */
    public static class C3574e {
        @pn0
        /* renamed from: a */
        public static LocaleList m28187a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @pn0
        /* renamed from: b */
        public static void m28188b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.t8$f */
    public static class C3575f {
        @pn0
        /* renamed from: a */
        public static int m28189a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @pn0
        /* renamed from: b */
        public static void m28190b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @pn0
        /* renamed from: c */
        public static void m28191c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @pn0
        /* renamed from: d */
        public static boolean m28192d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.t8$g */
    public static class C3576g {
        @pn0
        /* renamed from: a */
        public static Typeface m28193a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C3569t8(@mr2 TextView textView) {
        this.f20686a = textView;
        this.f20687a = new C3671u8(textView);
    }

    /* renamed from: d */
    public static ye4 m28152d(Context context, C2416i8 i8Var, int i) {
        ColorStateList f = i8Var.mo17664f(context, i);
        if (f == null) {
            return null;
        }
        ye4 ye4 = new ye4();
        ye4.f23032b = true;
        ye4.f23029a = f;
        return ye4;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: A */
    public void mo24742A(int i, float f) {
        if (!C3056of.f17942a && !mo24755l()) {
            mo24743B(i, f);
        }
    }

    /* renamed from: B */
    public final void mo24743B(int i, float f) {
        this.f20687a.mo25430w(i, f);
    }

    /* renamed from: C */
    public final void mo24744C(Context context, af4 af4) {
        String w;
        Typeface typeface;
        Typeface typeface2;
        this.f20684a = af4.mo13044o(za3.C4068m.TextAppearance_android_textStyle, this.f20684a);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int o = af4.mo13044o(za3.C4068m.TextAppearance_android_textFontWeight, -1);
            this.f20690b = o;
            if (o != -1) {
                this.f20684a = (this.f20684a & 2) | 0;
            }
        }
        int i2 = za3.C4068m.TextAppearance_android_fontFamily;
        if (af4.mo13026C(i2) || af4.mo13026C(za3.C4068m.TextAppearance_fontFamily)) {
            this.f20685a = null;
            int i3 = za3.C4068m.TextAppearance_fontFamily;
            if (af4.mo13026C(i3)) {
                i2 = i3;
            }
            int i4 = this.f20690b;
            int i5 = this.f20684a;
            if (!context.isRestricted()) {
                try {
                    Typeface k = af4.mo13040k(i2, this.f20684a, new C3570a(i4, i5, new WeakReference(this.f20686a)));
                    if (k != null) {
                        if (i >= 28 && this.f20690b != -1) {
                            k = C3576g.m28193a(Typeface.create(k, 0), this.f20690b, (this.f20684a & 2) != 0);
                        }
                        this.f20685a = k;
                    }
                    this.f20689a = this.f20685a == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f20685a == null && (w = af4.mo13052w(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f20690b == -1) {
                    typeface = Typeface.create(w, this.f20684a);
                } else {
                    Typeface create = Typeface.create(w, 0);
                    int i6 = this.f20690b;
                    if ((this.f20684a & 2) != 0) {
                        z = true;
                    }
                    typeface = C3576g.m28193a(create, i6, z);
                }
                this.f20685a = typeface;
                return;
            }
            return;
        }
        int i7 = za3.C4068m.TextAppearance_android_typeface;
        if (af4.mo13026C(i7)) {
            this.f20689a = false;
            int o2 = af4.mo13044o(i7, 1);
            if (o2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (o2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (o2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f20685a = typeface2;
        }
    }

    /* renamed from: a */
    public final void mo24745a(Drawable drawable, ye4 ye4) {
        if (drawable != null && ye4 != null) {
            C2416i8.m17333j(drawable, ye4, this.f20686a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo24746b() {
        if (!(this.f20688a == null && this.f20691b == null && this.f20692c == null && this.f20693d == null)) {
            Drawable[] compoundDrawables = this.f20686a.getCompoundDrawables();
            mo24745a(compoundDrawables[0], this.f20688a);
            mo24745a(compoundDrawables[1], this.f20691b);
            mo24745a(compoundDrawables[2], this.f20692c);
            mo24745a(compoundDrawables[3], this.f20693d);
        }
        if (this.f20694e != null || this.f20695f != null) {
            Drawable[] a = C3572c.m28183a(this.f20686a);
            mo24745a(a[0], this.f20694e);
            mo24745a(a[2], this.f20695f);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo24747c() {
        this.f20687a.mo25412b();
    }

    /* renamed from: e */
    public int mo24748e() {
        return this.f20687a.mo25418h();
    }

    /* renamed from: f */
    public int mo24749f() {
        return this.f20687a.mo25419i();
    }

    /* renamed from: g */
    public int mo24750g() {
        return this.f20687a.mo25420j();
    }

    /* renamed from: h */
    public int[] mo24751h() {
        return this.f20687a.mo25421k();
    }

    /* renamed from: i */
    public int mo24752i() {
        return this.f20687a.mo25422l();
    }

    @ts2
    /* renamed from: j */
    public ColorStateList mo24753j() {
        ye4 ye4 = this.f20696g;
        if (ye4 != null) {
            return ye4.f23029a;
        }
        return null;
    }

    @ts2
    /* renamed from: k */
    public PorterDuff.Mode mo24754k() {
        ye4 ye4 = this.f20696g;
        if (ye4 != null) {
            return ye4.f23030a;
        }
        return null;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public boolean mo24755l() {
        return this.f20687a.mo25424q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24756m(@com.onedelhi.secure.ts2 android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f20686a
            android.content.Context r10 = r0.getContext()
            com.onedelhi.secure.i8 r11 = com.onedelhi.secure.C2416i8.m17330b()
            int[] r2 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper
            r12 = 0
            com.onedelhi.secure.af4 r13 = com.onedelhi.secure.af4.m11110G(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f20686a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo13025B()
            r6 = 0
            r3 = r24
            r5 = r25
            com.onedelhi.secure.jt4.m19033z1(r0, r1, r2, r3, r4, r5, r6)
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.mo13050u(r0, r14)
            int r1 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.mo13026C(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo13050u(r1, r12)
            com.onedelhi.secure.ye4 r1 = m28152d(r10, r11, r1)
            r7.f20688a = r1
        L_0x0042:
            int r1 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.mo13026C(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo13050u(r1, r12)
            com.onedelhi.secure.ye4 r1 = m28152d(r10, r11, r1)
            r7.f20691b = r1
        L_0x0054:
            int r1 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.mo13026C(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo13050u(r1, r12)
            com.onedelhi.secure.ye4 r1 = m28152d(r10, r11, r1)
            r7.f20692c = r1
        L_0x0066:
            int r1 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.mo13026C(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo13050u(r1, r12)
            com.onedelhi.secure.ye4 r1 = m28152d(r10, r11, r1)
            r7.f20693d = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.mo13026C(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.mo13050u(r2, r12)
            com.onedelhi.secure.ye4 r2 = m28152d(r10, r11, r2)
            r7.f20694e = r2
        L_0x008c:
            int r2 = com.onedelhi.secure.za3.C4068m.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.mo13026C(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.mo13050u(r2, r12)
            com.onedelhi.secure.ye4 r2 = m28152d(r10, r11, r2)
            r7.f20695f = r2
        L_0x009e:
            r13.mo13029I()
            android.widget.TextView r2 = r7.f20686a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011a
            int[] r6 = com.onedelhi.secure.za3.C4068m.TextAppearance
            com.onedelhi.secure.af4 r0 = com.onedelhi.secure.af4.m11108E(r10, r0, r6)
            if (r2 != 0) goto L_0x00c5
            int r6 = com.onedelhi.secure.za3.C4068m.TextAppearance_textAllCaps
            boolean r15 = r0.mo13026C(r6)
            if (r15 == 0) goto L_0x00c5
            boolean r6 = r0.mo13030a(r6, r12)
            r15 = 1
            goto L_0x00c7
        L_0x00c5:
            r6 = 0
            r15 = 0
        L_0x00c7:
            r7.mo24744C(r10, r0)
            if (r1 >= r5) goto L_0x00f5
            int r4 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColor
            boolean r17 = r0.mo13026C(r4)
            if (r17 == 0) goto L_0x00d9
            android.content.res.ColorStateList r4 = r0.mo13033d(r4)
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            int r13 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColorHint
            boolean r18 = r0.mo13026C(r13)
            if (r18 == 0) goto L_0x00e7
            android.content.res.ColorStateList r13 = r0.mo13033d(r13)
            goto L_0x00e8
        L_0x00e7:
            r13 = 0
        L_0x00e8:
            int r14 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColorLink
            boolean r19 = r0.mo13026C(r14)
            if (r19 == 0) goto L_0x00f7
            android.content.res.ColorStateList r14 = r0.mo13033d(r14)
            goto L_0x00f8
        L_0x00f5:
            r4 = 0
            r13 = 0
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            int r5 = com.onedelhi.secure.za3.C4068m.TextAppearance_textLocale
            boolean r20 = r0.mo13026C(r5)
            if (r20 == 0) goto L_0x0105
            java.lang.String r5 = r0.mo13052w(r5)
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            if (r1 < r3) goto L_0x0115
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_fontVariationSettings
            boolean r21 = r0.mo13026C(r3)
            if (r21 == 0) goto L_0x0115
            java.lang.String r3 = r0.mo13052w(r3)
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            r0.mo13029I()
            goto L_0x0121
        L_0x011a:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0121:
            int[] r0 = com.onedelhi.secure.za3.C4068m.TextAppearance
            com.onedelhi.secure.af4 r0 = com.onedelhi.secure.af4.m11110G(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x013c
            int r12 = com.onedelhi.secure.za3.C4068m.TextAppearance_textAllCaps
            boolean r22 = r0.mo13026C(r12)
            if (r22 == 0) goto L_0x013c
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo13030a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0140
        L_0x013c:
            r22 = r3
            r3 = 23
        L_0x0140:
            if (r1 >= r3) goto L_0x0166
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColor
            boolean r12 = r0.mo13026C(r3)
            if (r12 == 0) goto L_0x014e
            android.content.res.ColorStateList r4 = r0.mo13033d(r3)
        L_0x014e:
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColorHint
            boolean r12 = r0.mo13026C(r3)
            if (r12 == 0) goto L_0x015a
            android.content.res.ColorStateList r13 = r0.mo13033d(r3)
        L_0x015a:
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColorLink
            boolean r12 = r0.mo13026C(r3)
            if (r12 == 0) goto L_0x0166
            android.content.res.ColorStateList r14 = r0.mo13033d(r3)
        L_0x0166:
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_textLocale
            boolean r12 = r0.mo13026C(r3)
            if (r12 == 0) goto L_0x0172
            java.lang.String r5 = r0.mo13052w(r3)
        L_0x0172:
            r3 = 26
            if (r1 < r3) goto L_0x0183
            int r3 = com.onedelhi.secure.za3.C4068m.TextAppearance_fontVariationSettings
            boolean r12 = r0.mo13026C(r3)
            if (r12 == 0) goto L_0x0183
            java.lang.String r3 = r0.mo13052w(r3)
            goto L_0x0185
        L_0x0183:
            r3 = r22
        L_0x0185:
            r12 = 28
            if (r1 < r12) goto L_0x01a2
            int r12 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textSize
            boolean r16 = r0.mo13026C(r12)
            if (r16 == 0) goto L_0x01a2
            r16 = r11
            r11 = -1
            int r12 = r0.mo13036g(r12, r11)
            if (r12 != 0) goto L_0x01a4
            android.widget.TextView r11 = r7.f20686a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a4
        L_0x01a2:
            r16 = r11
        L_0x01a4:
            r7.mo24744C(r10, r0)
            r0.mo13029I()
            if (r4 == 0) goto L_0x01b1
            android.widget.TextView r0 = r7.f20686a
            r0.setTextColor(r4)
        L_0x01b1:
            if (r13 == 0) goto L_0x01b8
            android.widget.TextView r0 = r7.f20686a
            r0.setHintTextColor(r13)
        L_0x01b8:
            if (r14 == 0) goto L_0x01bf
            android.widget.TextView r0 = r7.f20686a
            r0.setLinkTextColor(r14)
        L_0x01bf:
            if (r2 != 0) goto L_0x01c6
            if (r15 == 0) goto L_0x01c6
            r7.mo24762s(r6)
        L_0x01c6:
            android.graphics.Typeface r0 = r7.f20685a
            if (r0 == 0) goto L_0x01dc
            int r2 = r7.f20690b
            r4 = -1
            if (r2 != r4) goto L_0x01d7
            android.widget.TextView r2 = r7.f20686a
            int r4 = r7.f20684a
            r2.setTypeface(r0, r4)
            goto L_0x01dc
        L_0x01d7:
            android.widget.TextView r2 = r7.f20686a
            r2.setTypeface(r0)
        L_0x01dc:
            if (r3 == 0) goto L_0x01e3
            android.widget.TextView r0 = r7.f20686a
            com.onedelhi.secure.C3569t8.C3575f.m28192d(r0, r3)
        L_0x01e3:
            if (r5 == 0) goto L_0x0205
            r0 = 24
            if (r1 < r0) goto L_0x01f3
            android.widget.TextView r0 = r7.f20686a
            android.os.LocaleList r1 = com.onedelhi.secure.C3569t8.C3574e.m28187a(r5)
            com.onedelhi.secure.C3569t8.C3574e.m28188b(r0, r1)
            goto L_0x0205
        L_0x01f3:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.f20686a
            java.util.Locale r0 = com.onedelhi.secure.C3569t8.C3573d.m28186a(r0)
            com.onedelhi.secure.C3569t8.C3572c.m28185c(r1, r0)
        L_0x0205:
            com.onedelhi.secure.u8 r0 = r7.f20687a
            r1 = r24
            r0.mo25425r(r1, r9)
            boolean r0 = com.onedelhi.secure.C3056of.f17942a
            if (r0 == 0) goto L_0x024d
            com.onedelhi.secure.u8 r0 = r7.f20687a
            int r0 = r0.mo25422l()
            if (r0 == 0) goto L_0x024d
            com.onedelhi.secure.u8 r0 = r7.f20687a
            int[] r0 = r0.mo25421k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x024d
            android.widget.TextView r2 = r7.f20686a
            int r2 = com.onedelhi.secure.C3569t8.C3575f.m28189a(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0247
            android.widget.TextView r0 = r7.f20686a
            com.onedelhi.secure.u8 r2 = r7.f20687a
            int r2 = r2.mo25419i()
            com.onedelhi.secure.u8 r3 = r7.f20687a
            int r3 = r3.mo25418h()
            com.onedelhi.secure.u8 r4 = r7.f20687a
            int r4 = r4.mo25420j()
            r5 = 0
            com.onedelhi.secure.C3569t8.C3575f.m28190b(r0, r2, r3, r4, r5)
            goto L_0x024d
        L_0x0247:
            r5 = 0
            android.widget.TextView r2 = r7.f20686a
            com.onedelhi.secure.C3569t8.C3575f.m28191c(r2, r0, r5)
        L_0x024d:
            int[] r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView
            com.onedelhi.secure.af4 r8 = com.onedelhi.secure.af4.m11109F(r10, r1, r0)
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo13050u(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x0264
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r3 = r0
            goto L_0x0265
        L_0x0264:
            r3 = 0
        L_0x0265:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo13050u(r0, r1)
            if (r0 == r1) goto L_0x0273
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r4 = r0
            goto L_0x0274
        L_0x0273:
            r4 = 0
        L_0x0274:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo13050u(r0, r1)
            if (r0 == r1) goto L_0x0282
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r5 = r0
            goto L_0x0283
        L_0x0282:
            r5 = 0
        L_0x0283:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo13050u(r0, r1)
            if (r0 == r1) goto L_0x0291
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r6 = r0
            goto L_0x0292
        L_0x0291:
            r6 = 0
        L_0x0292:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo13050u(r0, r1)
            if (r0 == r1) goto L_0x02a0
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r9 = r0
            goto L_0x02a1
        L_0x02a0:
            r9 = 0
        L_0x02a1:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo13050u(r0, r1)
            if (r0 == r1) goto L_0x02af
            android.graphics.drawable.Drawable r0 = r2.mo17662c(r10, r0)
            r10 = r0
            goto L_0x02b0
        L_0x02af:
            r10 = 0
        L_0x02b0:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.mo24768y(r1, r2, r3, r4, r5, r6)
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableTint
            boolean r1 = r8.mo13026C(r0)
            if (r1 == 0) goto L_0x02cc
            android.content.res.ColorStateList r0 = r8.mo13033d(r0)
            android.widget.TextView r1 = r7.f20686a
            com.onedelhi.secure.jb4.m18334u(r1, r0)
        L_0x02cc:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_drawableTintMode
            boolean r1 = r8.mo13026C(r0)
            if (r1 == 0) goto L_0x02e4
            r1 = -1
            int r0 = r8.mo13044o(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = com.onedelhi.secure.jp0.m18734e(r0, r2)
            android.widget.TextView r2 = r7.f20686a
            com.onedelhi.secure.jb4.m18335v(r2, r0)
            goto L_0x02e5
        L_0x02e4:
            r1 = -1
        L_0x02e5:
            int r0 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo13036g(r0, r1)
            int r2 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo13036g(r2, r1)
            int r3 = com.onedelhi.secure.za3.C4068m.AppCompatTextView_lineHeight
            int r3 = r8.mo13036g(r3, r1)
            r8.mo13029I()
            if (r0 == r1) goto L_0x0301
            android.widget.TextView r4 = r7.f20686a
            com.onedelhi.secure.jb4.m18306A(r4, r0)
        L_0x0301:
            if (r2 == r1) goto L_0x0308
            android.widget.TextView r0 = r7.f20686a
            com.onedelhi.secure.jb4.m18307B(r0, r2)
        L_0x0308:
            if (r3 == r1) goto L_0x030f
            android.widget.TextView r0 = r7.f20686a
            com.onedelhi.secure.jb4.m18308C(r0, r3)
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3569t8.mo24756m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void mo24757n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f20689a) {
            this.f20685a = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (jt4.m18896O0(textView)) {
                textView.post(new C3571b(textView, typeface, this.f20684a));
            } else {
                textView.setTypeface(typeface, this.f20684a);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: o */
    public void mo24758o(boolean z, int i, int i2, int i3, int i4) {
        if (!C3056of.f17942a) {
            mo24747c();
        }
    }

    /* renamed from: p */
    public void mo24759p() {
        mo24746b();
    }

    /* renamed from: q */
    public void mo24760q(Context context, int i) {
        String w;
        ColorStateList d;
        ColorStateList d2;
        ColorStateList d3;
        af4 E = af4.m11108E(context, i, za3.C4068m.TextAppearance);
        int i2 = za3.C4068m.TextAppearance_textAllCaps;
        if (E.mo13026C(i2)) {
            mo24762s(E.mo13030a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = za3.C4068m.TextAppearance_android_textColor;
            if (E.mo13026C(i4) && (d3 = E.mo13033d(i4)) != null) {
                this.f20686a.setTextColor(d3);
            }
            int i5 = za3.C4068m.TextAppearance_android_textColorLink;
            if (E.mo13026C(i5) && (d2 = E.mo13033d(i5)) != null) {
                this.f20686a.setLinkTextColor(d2);
            }
            int i6 = za3.C4068m.TextAppearance_android_textColorHint;
            if (E.mo13026C(i6) && (d = E.mo13033d(i6)) != null) {
                this.f20686a.setHintTextColor(d);
            }
        }
        int i7 = za3.C4068m.TextAppearance_android_textSize;
        if (E.mo13026C(i7) && E.mo13036g(i7, -1) == 0) {
            this.f20686a.setTextSize(0, 0.0f);
        }
        mo24744C(context, E);
        if (i3 >= 26) {
            int i8 = za3.C4068m.TextAppearance_fontVariationSettings;
            if (E.mo13026C(i8) && (w = E.mo13052w(i8)) != null) {
                C3575f.m28192d(this.f20686a, w);
            }
        }
        E.mo13029I();
        Typeface typeface = this.f20685a;
        if (typeface != null) {
            this.f20686a.setTypeface(typeface, this.f20684a);
        }
    }

    /* renamed from: r */
    public void mo24761r(@mr2 TextView textView, @ts2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            es0.m13956j(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void mo24762s(boolean z) {
        this.f20686a.setAllCaps(z);
    }

    /* renamed from: t */
    public void mo24763t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f20687a.mo25426s(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void mo24764u(@mr2 int[] iArr, int i) throws IllegalArgumentException {
        this.f20687a.mo25427t(iArr, i);
    }

    /* renamed from: v */
    public void mo24765v(int i) {
        this.f20687a.mo25428u(i);
    }

    /* renamed from: w */
    public void mo24766w(@ts2 ColorStateList colorStateList) {
        if (this.f20696g == null) {
            this.f20696g = new ye4();
        }
        ye4 ye4 = this.f20696g;
        ye4.f23029a = colorStateList;
        ye4.f23032b = colorStateList != null;
        mo24769z();
    }

    /* renamed from: x */
    public void mo24767x(@ts2 PorterDuff.Mode mode) {
        if (this.f20696g == null) {
            this.f20696g = new ye4();
        }
        ye4 ye4 = this.f20696g;
        ye4.f23030a = mode;
        ye4.f23031a = mode != null;
        mo24769z();
    }

    /* renamed from: y */
    public final void mo24768y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a = C3572c.m28183a(this.f20686a);
            TextView textView = this.f20686a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C3572c.m28184b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a2 = C3572c.m28183a(this.f20686a);
            if (a2[0] == null && a2[2] == null) {
                Drawable[] compoundDrawables = this.f20686a.getCompoundDrawables();
                TextView textView2 = this.f20686a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f20686a;
            Drawable drawable7 = a2[0];
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            Drawable drawable8 = a2[2];
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            C3572c.m28184b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    public final void mo24769z() {
        ye4 ye4 = this.f20696g;
        this.f20688a = ye4;
        this.f20691b = ye4;
        this.f20692c = ye4;
        this.f20693d = ye4;
        this.f20694e = ye4;
        this.f20695f = ye4;
    }
}
