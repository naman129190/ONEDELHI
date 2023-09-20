package com.onedelhi.secure;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Constructor;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class n34 {
    @ts2

    /* renamed from: a */
    public static Object f32359a = null;

    /* renamed from: a */
    public static final String f32360a = "android.text.TextDirectionHeuristic";
    @ts2

    /* renamed from: a */
    public static Constructor<StaticLayout> f32361a = null;

    /* renamed from: b */
    public static final String f32362b = "android.text.TextDirectionHeuristics";

    /* renamed from: c */
    public static final float f32363c = 0.0f;

    /* renamed from: c */
    public static final String f32364c = "LTR";

    /* renamed from: c */
    public static boolean f32365c = false;

    /* renamed from: d */
    public static final float f32366d = 1.0f;

    /* renamed from: d */
    public static final String f32367d = "RTL";

    /* renamed from: f */
    public static final int f32368f = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: a */
    public float f32369a;

    /* renamed from: a */
    public final int f32370a;

    /* renamed from: a */
    public Layout.Alignment f32371a;

    /* renamed from: a */
    public final TextPaint f32372a;
    @ts2

    /* renamed from: a */
    public TextUtils.TruncateAt f32373a;
    @ts2

    /* renamed from: a */
    public o34 f32374a;

    /* renamed from: a */
    public CharSequence f32375a;

    /* renamed from: a */
    public boolean f32376a;

    /* renamed from: b */
    public float f32377b;

    /* renamed from: b */
    public int f32378b = 0;

    /* renamed from: b */
    public boolean f32379b;

    /* renamed from: c */
    public int f32380c;

    /* renamed from: d */
    public int f32381d;

    /* renamed from: e */
    public int f32382e;

    /* renamed from: com.onedelhi.secure.n34$a */
    public static class C6168a extends Exception {
        public C6168a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public n34(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f32375a = charSequence;
        this.f32372a = textPaint;
        this.f32370a = i;
        this.f32380c = charSequence.length();
        this.f32371a = Layout.Alignment.ALIGN_NORMAL;
        this.f32381d = Integer.MAX_VALUE;
        this.f32369a = 0.0f;
        this.f32377b = 1.0f;
        this.f32382e = f32368f;
        this.f32376a = true;
        this.f32373a = null;
    }

    @mr2
    /* renamed from: c */
    public static n34 m57837c(@mr2 CharSequence charSequence, @mr2 TextPaint textPaint, @js1(from = 0) int i) {
        return new n34(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo40919a() throws C6168a {
        if (this.f32375a == null) {
            this.f32375a = "";
        }
        int max = Math.max(0, this.f32370a);
        CharSequence charSequence = this.f32375a;
        if (this.f32381d == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f32372a, (float) max, this.f32373a);
        }
        int min = Math.min(charSequence.length(), this.f32380c);
        this.f32380c = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f32379b && this.f32381d == 1) {
                this.f32371a = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f32378b, min, this.f32372a, max);
            obtain.setAlignment(this.f32371a);
            obtain.setIncludePad(this.f32376a);
            obtain.setTextDirection(this.f32379b ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f32373a;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f32381d);
            float f = this.f32369a;
            if (!(f == 0.0f && this.f32377b == 1.0f)) {
                obtain.setLineSpacing(f, this.f32377b);
            }
            if (this.f32381d > 1) {
                obtain.setHyphenationFrequency(this.f32382e);
            }
            o34 o34 = this.f32374a;
            if (o34 != null) {
                o34.mo41518a(obtain);
            }
            return obtain.build();
        }
        mo40920b();
        try {
            return (StaticLayout) ((Constructor) k43.m19455l(f32361a)).newInstance(new Object[]{charSequence, Integer.valueOf(this.f32378b), Integer.valueOf(this.f32380c), this.f32372a, Integer.valueOf(max), this.f32371a, k43.m19455l(f32359a), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f32376a), null, Integer.valueOf(max), Integer.valueOf(this.f32381d)});
        } catch (Exception e) {
            throw new C6168a(e);
        }
    }

    /* renamed from: b */
    public final void mo40920b() throws C6168a {
        if (!f32365c) {
            try {
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f32359a = this.f32379b && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f32361a = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f32365c = true;
            } catch (Exception e) {
                throw new C6168a(e);
            }
        }
    }

    @mr2
    /* renamed from: d */
    public n34 mo40921d(@mr2 Layout.Alignment alignment) {
        this.f32371a = alignment;
        return this;
    }

    @mr2
    /* renamed from: e */
    public n34 mo40922e(@ts2 TextUtils.TruncateAt truncateAt) {
        this.f32373a = truncateAt;
        return this;
    }

    @mr2
    /* renamed from: f */
    public n34 mo40923f(@js1(from = 0) int i) {
        this.f32380c = i;
        return this;
    }

    @mr2
    /* renamed from: g */
    public n34 mo40924g(int i) {
        this.f32382e = i;
        return this;
    }

    @mr2
    /* renamed from: h */
    public n34 mo40925h(boolean z) {
        this.f32376a = z;
        return this;
    }

    /* renamed from: i */
    public n34 mo40926i(boolean z) {
        this.f32379b = z;
        return this;
    }

    @mr2
    /* renamed from: j */
    public n34 mo40927j(float f, float f2) {
        this.f32369a = f;
        this.f32377b = f2;
        return this;
    }

    @mr2
    /* renamed from: k */
    public n34 mo40928k(@js1(from = 0) int i) {
        this.f32381d = i;
        return this;
    }

    @mr2
    /* renamed from: l */
    public n34 mo40929l(@js1(from = 0) int i) {
        this.f32378b = i;
        return this;
    }

    @mr2
    /* renamed from: m */
    public n34 mo40930m(@ts2 o34 o34) {
        this.f32374a = o34;
        return this;
    }
}
