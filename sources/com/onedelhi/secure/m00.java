package com.onedelhi.secure;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.onedelhi.secure.C5306fu;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.n34;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class m00 {

    /* renamed from: E */
    public static final float f31884E = 0.5f;

    /* renamed from: a */
    public static final String f31885a = "CollapsingTextHelper";
    @mr2

    /* renamed from: b */
    public static final Paint f31886b = null;

    /* renamed from: b */
    public static final String f31887b = "…";

    /* renamed from: f */
    public static final boolean f31888f = false;

    /* renamed from: g */
    public static final boolean f31889g = false;

    /* renamed from: A */
    public float f31890A;

    /* renamed from: B */
    public float f31891B;

    /* renamed from: C */
    public float f31892C = 0.0f;

    /* renamed from: D */
    public float f31893D = 1.0f;

    /* renamed from: a */
    public float f31894a;

    /* renamed from: a */
    public int f31895a;

    /* renamed from: a */
    public TimeInterpolator f31896a;

    /* renamed from: a */
    public ColorStateList f31897a;
    @ts2

    /* renamed from: a */
    public Bitmap f31898a;

    /* renamed from: a */
    public Paint f31899a;
    @mr2

    /* renamed from: a */
    public final Rect f31900a;
    @mr2

    /* renamed from: a */
    public final RectF f31901a;

    /* renamed from: a */
    public Typeface f31902a;

    /* renamed from: a */
    public StaticLayout f31903a;
    @mr2

    /* renamed from: a */
    public final TextPaint f31904a;

    /* renamed from: a */
    public TextUtils.TruncateAt f31905a = TextUtils.TruncateAt.END;

    /* renamed from: a */
    public final View f31906a;

    /* renamed from: a */
    public C5306fu f31907a;
    @ts2

    /* renamed from: a */
    public o34 f31908a;
    @ts2

    /* renamed from: a */
    public CharSequence f31909a;

    /* renamed from: a */
    public boolean f31910a;

    /* renamed from: a */
    public int[] f31911a;

    /* renamed from: b */
    public float f31912b;

    /* renamed from: b */
    public int f31913b = 16;

    /* renamed from: b */
    public TimeInterpolator f31914b;

    /* renamed from: b */
    public ColorStateList f31915b;
    @mr2

    /* renamed from: b */
    public final Rect f31916b;

    /* renamed from: b */
    public Typeface f31917b;
    @mr2

    /* renamed from: b */
    public final TextPaint f31918b;

    /* renamed from: b */
    public C5306fu f31919b;
    @ts2

    /* renamed from: b */
    public CharSequence f31920b;

    /* renamed from: b */
    public boolean f31921b;

    /* renamed from: c */
    public float f31922c;

    /* renamed from: c */
    public int f31923c = 16;

    /* renamed from: c */
    public ColorStateList f31924c;

    /* renamed from: c */
    public Typeface f31925c;

    /* renamed from: c */
    public CharSequence f31926c;

    /* renamed from: c */
    public boolean f31927c = true;

    /* renamed from: d */
    public float f31928d = 15.0f;

    /* renamed from: d */
    public int f31929d;

    /* renamed from: d */
    public ColorStateList f31930d;

    /* renamed from: d */
    public Typeface f31931d;

    /* renamed from: d */
    public boolean f31932d;

    /* renamed from: e */
    public float f31933e = 15.0f;

    /* renamed from: e */
    public int f31934e;

    /* renamed from: e */
    public Typeface f31935e;

    /* renamed from: e */
    public boolean f31936e;

    /* renamed from: f */
    public float f31937f;

    /* renamed from: f */
    public int f31938f = 1;

    /* renamed from: f */
    public Typeface f31939f;

    /* renamed from: g */
    public float f31940g;

    /* renamed from: g */
    public int f31941g = n34.f32368f;

    /* renamed from: g */
    public Typeface f31942g;

    /* renamed from: h */
    public float f31943h;

    /* renamed from: i */
    public float f31944i;

    /* renamed from: j */
    public float f31945j;

    /* renamed from: k */
    public float f31946k;

    /* renamed from: l */
    public float f31947l;

    /* renamed from: m */
    public float f31948m;

    /* renamed from: n */
    public float f31949n;

    /* renamed from: o */
    public float f31950o;

    /* renamed from: p */
    public float f31951p;

    /* renamed from: q */
    public float f31952q;

    /* renamed from: r */
    public float f31953r;

    /* renamed from: s */
    public float f31954s;

    /* renamed from: t */
    public float f31955t;

    /* renamed from: u */
    public float f31956u;

    /* renamed from: v */
    public float f31957v;

    /* renamed from: w */
    public float f31958w;

    /* renamed from: x */
    public float f31959x;

    /* renamed from: y */
    public float f31960y;

    /* renamed from: z */
    public float f31961z;

    /* renamed from: com.onedelhi.secure.m00$a */
    public class C6073a implements C5306fu.C5307a {
        public C6073a() {
        }

        /* renamed from: a */
        public void mo36310a(Typeface typeface) {
            m00.this.mo40374m0(typeface);
        }
    }

    /* renamed from: com.onedelhi.secure.m00$b */
    public class C6074b implements C5306fu.C5307a {
        public C6074b() {
        }

        /* renamed from: a */
        public void mo36310a(Typeface typeface) {
            m00.this.mo40396x0(typeface);
        }
    }

    public m00(View view) {
        this.f31906a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f31904a = textPaint;
        this.f31918b = new TextPaint(textPaint);
        this.f31916b = new Rect();
        this.f31900a = new Rect();
        this.f31901a = new RectF();
        this.f31922c = mo40358e();
        mo40351a0(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: U */
    public static boolean m56671U(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: Z */
    public static float m56672Z(float f, float f2, float f3, @ts2 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1947d7.m12985a(f, f2, f3);
    }

    @d10
    /* renamed from: a */
    public static int m56673a(@d10 int i, @d10 int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: e0 */
    public static boolean m56674e0(@mr2 Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: A */
    public ColorStateList mo40311A() {
        return this.f31897a;
    }

    /* renamed from: A0 */
    public void mo40312A0(boolean z) {
        this.f31910a = z;
    }

    /* renamed from: B */
    public float mo40313B() {
        mo40344R(this.f31918b);
        return (-this.f31918b.ascent()) + this.f31918b.descent();
    }

    /* renamed from: B0 */
    public void mo40314B0(float f) {
        this.f31912b = f;
        this.f31922c = mo40358e();
    }

    /* renamed from: C */
    public int mo40315C() {
        return this.f31913b;
    }

    @sj3(23)
    /* renamed from: C0 */
    public void mo40316C0(int i) {
        this.f31941g = i;
    }

    /* renamed from: D */
    public float mo40317D() {
        mo40344R(this.f31918b);
        return -this.f31918b.ascent();
    }

    /* renamed from: D0 */
    public final void mo40318D0(float f) {
        mo40363h(f);
        boolean z = f31888f && this.f31947l != 1.0f;
        this.f31932d = z;
        if (z) {
            mo40375n();
        }
        jt4.m18985n1(this.f31906a);
    }

    /* renamed from: E */
    public float mo40319E() {
        return this.f31928d;
    }

    @sj3(23)
    /* renamed from: E0 */
    public void mo40320E0(float f) {
        this.f31892C = f;
    }

    /* renamed from: F */
    public Typeface mo40321F() {
        Typeface typeface = this.f31931d;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @sj3(23)
    /* renamed from: F0 */
    public void mo40322F0(@d81(from = 0.0d) float f) {
        this.f31893D = f;
    }

    /* renamed from: G */
    public float mo40323G() {
        return this.f31894a;
    }

    /* renamed from: G0 */
    public void mo40324G0(int i) {
        if (i != this.f31938f) {
            this.f31938f = i;
            mo40367j();
            mo40355c0();
        }
    }

    /* renamed from: H */
    public float mo40325H() {
        return this.f31922c;
    }

    /* renamed from: H0 */
    public void mo40326H0(TimeInterpolator timeInterpolator) {
        this.f31896a = timeInterpolator;
        mo40355c0();
    }

    @sj3(23)
    /* renamed from: I */
    public int mo40327I() {
        return this.f31941g;
    }

    /* renamed from: I0 */
    public void mo40328I0(boolean z) {
        this.f31927c = z;
    }

    /* renamed from: J */
    public int mo40329J() {
        StaticLayout staticLayout = this.f31903a;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: J0 */
    public final boolean mo40330J0(int[] iArr) {
        this.f31911a = iArr;
        if (!mo40349X()) {
            return false;
        }
        mo40355c0();
        return true;
    }

    @sj3(23)
    /* renamed from: K */
    public float mo40331K() {
        return this.f31903a.getSpacingAdd();
    }

    @sj3(23)
    /* renamed from: K0 */
    public void mo40332K0(@ts2 o34 o34) {
        if (this.f31908a != o34) {
            this.f31908a = o34;
            mo40357d0(true);
        }
    }

    @sj3(23)
    /* renamed from: L */
    public float mo40333L() {
        return this.f31903a.getSpacingMultiplier();
    }

    /* renamed from: L0 */
    public void mo40334L0(@ts2 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f31909a, charSequence)) {
            this.f31909a = charSequence;
            this.f31920b = null;
            mo40367j();
            mo40355c0();
        }
    }

    /* renamed from: M */
    public int mo40335M() {
        return this.f31938f;
    }

    /* renamed from: M0 */
    public void mo40336M0(TimeInterpolator timeInterpolator) {
        this.f31914b = timeInterpolator;
        mo40355c0();
    }

    /* renamed from: N */
    public final Layout.Alignment mo40337N() {
        int d = ri1.m26762d(this.f31913b, this.f31921b ? 1 : 0) & 7;
        return d != 1 ? d != 5 ? this.f31921b ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f31921b ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: N0 */
    public void mo40338N0(@mr2 TextUtils.TruncateAt truncateAt) {
        this.f31905a = truncateAt;
        mo40355c0();
    }

    @ts2
    /* renamed from: O */
    public TimeInterpolator mo40339O() {
        return this.f31896a;
    }

    /* renamed from: O0 */
    public void mo40340O0(Typeface typeface) {
        boolean n0 = mo40376n0(typeface);
        boolean y0 = mo40398y0(typeface);
        if (n0 || y0) {
            mo40355c0();
        }
    }

    @ts2
    /* renamed from: P */
    public CharSequence mo40341P() {
        return this.f31909a;
    }

    /* renamed from: P0 */
    public final boolean mo40342P0() {
        return this.f31938f > 1 && (!this.f31921b || this.f31910a) && !this.f31932d;
    }

    /* renamed from: Q */
    public final void mo40343Q(@mr2 TextPaint textPaint) {
        textPaint.setTextSize(this.f31933e);
        textPaint.setTypeface(this.f31902a);
        textPaint.setLetterSpacing(this.f31958w);
    }

    /* renamed from: R */
    public final void mo40344R(@mr2 TextPaint textPaint) {
        textPaint.setTextSize(this.f31928d);
        textPaint.setTypeface(this.f31931d);
        textPaint.setLetterSpacing(this.f31959x);
    }

    @mr2
    /* renamed from: S */
    public TextUtils.TruncateAt mo40345S() {
        return this.f31905a;
    }

    /* renamed from: T */
    public final void mo40346T(float f) {
        if (this.f31910a) {
            this.f31901a.set(f < this.f31922c ? this.f31900a : this.f31916b);
            return;
        }
        this.f31901a.left = m56672Z((float) this.f31900a.left, (float) this.f31916b.left, f, this.f31896a);
        this.f31901a.top = m56672Z(this.f31937f, this.f31940g, f, this.f31896a);
        this.f31901a.right = m56672Z((float) this.f31900a.right, (float) this.f31916b.right, f, this.f31896a);
        this.f31901a.bottom = m56672Z((float) this.f31900a.bottom, (float) this.f31916b.bottom, f, this.f31896a);
    }

    /* renamed from: V */
    public final boolean mo40347V() {
        return jt4.m18928Z(this.f31906a) == 1;
    }

    /* renamed from: W */
    public boolean mo40348W() {
        return this.f31927c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f31897a;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40349X() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f31915b
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f31897a
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m00.mo40349X():boolean");
    }

    /* renamed from: Y */
    public final boolean mo40350Y(@mr2 CharSequence charSequence, boolean z) {
        return (z ? xa4.f22496d : xa4.f22495c).mo26476a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a0 */
    public void mo40351a0(@mr2 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f31925c;
            if (typeface != null) {
                this.f31917b = rk4.m63713b(configuration, typeface);
            }
            Typeface typeface2 = this.f31939f;
            if (typeface2 != null) {
                this.f31935e = rk4.m63713b(configuration, typeface2);
            }
            Typeface typeface3 = this.f31917b;
            if (typeface3 == null) {
                typeface3 = this.f31925c;
            }
            this.f31902a = typeface3;
            Typeface typeface4 = this.f31935e;
            if (typeface4 == null) {
                typeface4 = this.f31939f;
            }
            this.f31931d = typeface4;
            mo40357d0(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40352b(boolean r10) {
        /*
            r9 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo40365i(r0, r10)
            java.lang.CharSequence r0 = r9.f31920b
            if (r0 == 0) goto L_0x001c
            android.text.StaticLayout r1 = r9.f31903a
            if (r1 == 0) goto L_0x001c
            android.text.TextPaint r2 = r9.f31904a
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r3 = r9.f31905a
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r1, r3)
            r9.f31926c = r0
        L_0x001c:
            java.lang.CharSequence r0 = r9.f31926c
            r1 = 0
            if (r0 == 0) goto L_0x002a
            android.text.TextPaint r2 = r9.f31904a
            float r0 = r9.mo40353b0(r2, r0)
            r9.f31961z = r0
            goto L_0x002c
        L_0x002a:
            r9.f31961z = r1
        L_0x002c:
            int r0 = r9.f31923c
            boolean r2 = r9.f31921b
            int r0 = com.onedelhi.secure.ri1.m26762d(r0, r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 80
            r4 = 48
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L_0x0066
            if (r2 == r3) goto L_0x0059
            android.text.TextPaint r2 = r9.f31904a
            float r2 = r2.descent()
            android.text.TextPaint r6 = r9.f31904a
            float r6 = r6.ascent()
            float r2 = r2 - r6
            float r2 = r2 / r5
            android.graphics.Rect r6 = r9.f31916b
            int r6 = r6.centerY()
            float r6 = (float) r6
            float r6 = r6 - r2
            r9.f31940g = r6
            goto L_0x006d
        L_0x0059:
            android.graphics.Rect r2 = r9.f31916b
            int r2 = r2.bottom
            float r2 = (float) r2
            android.text.TextPaint r6 = r9.f31904a
            float r6 = r6.ascent()
            float r2 = r2 + r6
            goto L_0x006b
        L_0x0066:
            android.graphics.Rect r2 = r9.f31916b
            int r2 = r2.top
            float r2 = (float) r2
        L_0x006b:
            r9.f31940g = r2
        L_0x006d:
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            r6 = 5
            r7 = 1
            if (r0 == r7) goto L_0x0085
            if (r0 == r6) goto L_0x007d
            android.graphics.Rect r0 = r9.f31916b
            int r0 = r0.left
            float r0 = (float) r0
            goto L_0x0090
        L_0x007d:
            android.graphics.Rect r0 = r9.f31916b
            int r0 = r0.right
            float r0 = (float) r0
            float r8 = r9.f31961z
            goto L_0x008f
        L_0x0085:
            android.graphics.Rect r0 = r9.f31916b
            int r0 = r0.centerX()
            float r0 = (float) r0
            float r8 = r9.f31961z
            float r8 = r8 / r5
        L_0x008f:
            float r0 = r0 - r8
        L_0x0090:
            r9.f31944i = r0
            r9.mo40365i(r1, r10)
            android.text.StaticLayout r10 = r9.f31903a
            if (r10 == 0) goto L_0x009f
            int r10 = r10.getHeight()
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009f:
            r10 = 0
        L_0x00a0:
            android.text.StaticLayout r0 = r9.f31903a
            if (r0 == 0) goto L_0x00ae
            int r8 = r9.f31938f
            if (r8 <= r7) goto L_0x00ae
            int r0 = r0.getWidth()
            float r1 = (float) r0
            goto L_0x00b8
        L_0x00ae:
            java.lang.CharSequence r0 = r9.f31920b
            if (r0 == 0) goto L_0x00b8
            android.text.TextPaint r1 = r9.f31904a
            float r1 = r9.mo40353b0(r1, r0)
        L_0x00b8:
            android.text.StaticLayout r0 = r9.f31903a
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.getLineCount()
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            r9.f31929d = r0
            int r0 = r9.f31913b
            boolean r8 = r9.f31921b
            int r0 = com.onedelhi.secure.ri1.m26762d(r0, r8)
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 == r4) goto L_0x00ec
            if (r8 == r3) goto L_0x00de
            float r10 = r10 / r5
            android.graphics.Rect r3 = r9.f31900a
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r10
        L_0x00db:
            r9.f31937f = r3
            goto L_0x00f3
        L_0x00de:
            android.graphics.Rect r3 = r9.f31900a
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r10
            android.text.TextPaint r10 = r9.f31904a
            float r10 = r10.descent()
            float r3 = r3 + r10
            goto L_0x00db
        L_0x00ec:
            android.graphics.Rect r10 = r9.f31900a
            int r10 = r10.top
            float r10 = (float) r10
            r9.f31937f = r10
        L_0x00f3:
            r10 = r0 & r2
            if (r10 == r7) goto L_0x0105
            if (r10 == r6) goto L_0x00ff
            android.graphics.Rect r10 = r9.f31900a
            int r10 = r10.left
            float r10 = (float) r10
            goto L_0x010e
        L_0x00ff:
            android.graphics.Rect r10 = r9.f31900a
            int r10 = r10.right
            float r10 = (float) r10
            goto L_0x010d
        L_0x0105:
            android.graphics.Rect r10 = r9.f31900a
            int r10 = r10.centerX()
            float r10 = (float) r10
            float r1 = r1 / r5
        L_0x010d:
            float r10 = r10 - r1
        L_0x010e:
            r9.f31943h = r10
            r9.mo40367j()
            float r10 = r9.f31894a
            r9.mo40318D0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m00.mo40352b(boolean):void");
    }

    /* renamed from: b0 */
    public final float mo40353b0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final void mo40354c() {
        mo40361g(this.f31894a);
    }

    /* renamed from: c0 */
    public void mo40355c0() {
        mo40357d0(false);
    }

    /* renamed from: d */
    public final float mo40356d(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        float f2 = this.f31922c;
        return f <= f2 ? C1947d7.m12986b(1.0f, 0.0f, this.f31912b, f2, f) : C1947d7.m12986b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: d0 */
    public void mo40357d0(boolean z) {
        if ((this.f31906a.getHeight() > 0 && this.f31906a.getWidth() > 0) || z) {
            mo40352b(z);
            mo40354c();
        }
    }

    /* renamed from: e */
    public final float mo40358e() {
        float f = this.f31912b;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: f */
    public final boolean mo40359f(@mr2 CharSequence charSequence) {
        boolean V = mo40347V();
        return this.f31927c ? mo40350Y(charSequence, V) : V;
    }

    /* renamed from: f0 */
    public void mo40360f0(int i, int i2, int i3, int i4) {
        if (!m56674e0(this.f31916b, i, i2, i3, i4)) {
            this.f31916b.set(i, i2, i3, i4);
            this.f31936e = true;
        }
    }

    /* renamed from: g */
    public final void mo40361g(float f) {
        float f2;
        mo40346T(f);
        if (!this.f31910a) {
            this.f31945j = m56672Z(this.f31943h, this.f31944i, f, this.f31896a);
            this.f31946k = m56672Z(this.f31937f, this.f31940g, f, this.f31896a);
            mo40318D0(f);
            f2 = f;
        } else if (f < this.f31922c) {
            this.f31945j = this.f31943h;
            this.f31946k = this.f31937f;
            mo40318D0(0.0f);
            f2 = 0.0f;
        } else {
            this.f31945j = this.f31944i;
            this.f31946k = this.f31940g - ((float) Math.max(0, this.f31895a));
            mo40318D0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C1947d7.f10650b;
        mo40366i0(1.0f - m56672Z(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        mo40388t0(m56672Z(1.0f, 0.0f, f, timeInterpolator));
        if (this.f31915b != this.f31897a) {
            this.f31904a.setColor(m56673a(mo40397y(), mo40393w(), f2));
        } else {
            this.f31904a.setColor(mo40393w());
        }
        float f3 = this.f31958w;
        float f4 = this.f31959x;
        if (f3 != f4) {
            this.f31904a.setLetterSpacing(m56672Z(f4, f3, f, timeInterpolator));
        } else {
            this.f31904a.setLetterSpacing(f3);
        }
        this.f31949n = m56672Z(this.f31955t, this.f31952q, f, (TimeInterpolator) null);
        this.f31950o = m56672Z(this.f31956u, this.f31953r, f, (TimeInterpolator) null);
        this.f31951p = m56672Z(this.f31957v, this.f31954s, f, (TimeInterpolator) null);
        int a = m56673a(mo40395x(this.f31930d), mo40395x(this.f31924c), f);
        this.f31934e = a;
        this.f31904a.setShadowLayer(this.f31949n, this.f31950o, this.f31951p, a);
        if (this.f31910a) {
            int alpha = this.f31904a.getAlpha();
            this.f31904a.setAlpha((int) (mo40356d(f) * ((float) alpha)));
        }
        jt4.m18985n1(this.f31906a);
    }

    /* renamed from: g0 */
    public void mo40362g0(@mr2 Rect rect) {
        mo40360f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public final void mo40363h(float f) {
        mo40365i(f, false);
    }

    /* renamed from: h0 */
    public void mo40364h0(int i) {
        sa4 sa4 = new sa4(this.f31906a.getContext(), i);
        if (sa4.mo44261i() != null) {
            this.f31915b = sa4.mo44261i();
        }
        if (sa4.mo44262j() != 0.0f) {
            this.f31933e = sa4.mo44262j();
        }
        ColorStateList colorStateList = sa4.f34959c;
        if (colorStateList != null) {
            this.f31924c = colorStateList;
        }
        this.f31953r = sa4.f34947a;
        this.f31954s = sa4.f34953b;
        this.f31952q = sa4.f34957c;
        this.f31958w = sa4.f34961d;
        C5306fu fuVar = this.f31919b;
        if (fuVar != null) {
            fuVar.mo36308c();
        }
        this.f31919b = new C5306fu(new C6073a(), sa4.mo44257e());
        sa4.mo44260h(this.f31906a.getContext(), this.f31919b);
        mo40355c0();
    }

    /* renamed from: i */
    public final void mo40365i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.f31909a != null) {
            float width = (float) this.f31916b.width();
            float width2 = (float) this.f31900a.width();
            if (m56671U(f, 1.0f)) {
                f3 = this.f31933e;
                f2 = this.f31958w;
                this.f31947l = 1.0f;
                typeface = this.f31902a;
            } else {
                float f4 = this.f31928d;
                float f5 = this.f31959x;
                Typeface typeface2 = this.f31931d;
                if (m56671U(f, 0.0f)) {
                    this.f31947l = 1.0f;
                } else {
                    this.f31947l = m56672Z(this.f31928d, this.f31933e, f, this.f31914b) / this.f31928d;
                }
                float f6 = this.f31933e / this.f31928d;
                width = (!z && width2 * f6 > width) ? Math.min(width / f6, width2) : width2;
                f3 = f4;
                f2 = f5;
                typeface = typeface2;
            }
            int i = 1;
            boolean z2 = false;
            if (width > 0.0f) {
                boolean z3 = this.f31948m != f3;
                boolean z4 = this.f31960y != f2;
                boolean z5 = this.f31942g != typeface;
                StaticLayout staticLayout = this.f31903a;
                boolean z6 = z3 || z4 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f31936e;
                this.f31948m = f3;
                this.f31960y = f2;
                this.f31942g = typeface;
                this.f31936e = false;
                TextPaint textPaint = this.f31904a;
                if (this.f31947l != 1.0f) {
                    z2 = true;
                }
                textPaint.setLinearText(z2);
                z2 = z6;
            }
            if (this.f31920b == null || z2) {
                this.f31904a.setTextSize(this.f31948m);
                this.f31904a.setTypeface(this.f31942g);
                this.f31904a.setLetterSpacing(this.f31960y);
                this.f31921b = mo40359f(this.f31909a);
                if (mo40342P0()) {
                    i = this.f31938f;
                }
                StaticLayout k = mo40369k(i, width, this.f31921b);
                this.f31903a = k;
                this.f31920b = k.getText();
            }
        }
    }

    /* renamed from: i0 */
    public final void mo40366i0(float f) {
        this.f31890A = f;
        jt4.m18985n1(this.f31906a);
    }

    /* renamed from: j */
    public final void mo40367j() {
        Bitmap bitmap = this.f31898a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31898a = null;
        }
    }

    /* renamed from: j0 */
    public void mo40368j0(ColorStateList colorStateList) {
        if (this.f31915b != colorStateList) {
            this.f31915b = colorStateList;
            mo40355c0();
        }
    }

    /* renamed from: k */
    public final StaticLayout mo40369k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (i == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (n34.C6168a e) {
                Log.e(f31885a, e.getCause().getMessage(), e);
                staticLayout = null;
            }
        } else {
            alignment = mo40337N();
        }
        staticLayout = n34.m57837c(this.f31909a, this.f31904a, (int) f).mo40922e(this.f31905a).mo40926i(z).mo40921d(alignment).mo40925h(false).mo40928k(i).mo40927j(this.f31892C, this.f31893D).mo40924g(this.f31941g).mo40930m(this.f31908a).mo40919a();
        return (StaticLayout) k43.m19455l(staticLayout);
    }

    /* renamed from: k0 */
    public void mo40370k0(int i) {
        if (this.f31923c != i) {
            this.f31923c = i;
            mo40355c0();
        }
    }

    /* renamed from: l */
    public void mo40371l(@mr2 Canvas canvas) {
        int save = canvas.save();
        if (this.f31920b != null && this.f31901a.width() > 0.0f && this.f31901a.height() > 0.0f) {
            this.f31904a.setTextSize(this.f31948m);
            float f = this.f31945j;
            float f2 = this.f31946k;
            boolean z = this.f31932d && this.f31898a != null;
            float f3 = this.f31947l;
            if (f3 != 1.0f && !this.f31910a) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f31898a, f, f2, this.f31899a);
                canvas.restoreToCount(save);
                return;
            }
            if (!mo40342P0() || (this.f31910a && this.f31894a <= this.f31922c)) {
                canvas.translate(f, f2);
                this.f31903a.draw(canvas);
            } else {
                mo40373m(canvas, this.f31945j - ((float) this.f31903a.getLineStart(0)), f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l0 */
    public void mo40372l0(float f) {
        if (this.f31933e != f) {
            this.f31933e = f;
            mo40355c0();
        }
    }

    /* renamed from: m */
    public final void mo40373m(@mr2 Canvas canvas, float f, float f2) {
        int alpha = this.f31904a.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f31904a.setAlpha((int) (this.f31891B * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f31904a;
            textPaint.setShadowLayer(this.f31949n, this.f31950o, this.f31951p, oe2.m23715a(this.f31934e, textPaint.getAlpha()));
        }
        Canvas canvas2 = canvas;
        this.f31903a.draw(canvas);
        this.f31904a.setAlpha((int) (this.f31890A * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f31904a;
            textPaint2.setShadowLayer(this.f31949n, this.f31950o, this.f31951p, oe2.m23715a(this.f31934e, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f31903a.getLineBaseline(0);
        CharSequence charSequence = this.f31926c;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f31904a);
        if (i >= 31) {
            this.f31904a.setShadowLayer(this.f31949n, this.f31950o, this.f31951p, this.f31934e);
        }
        if (!this.f31910a) {
            String trim = this.f31926c.toString().trim();
            if (trim.endsWith(f31887b)) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f31904a.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f31903a.getLineEnd(0), str.length()), 0.0f, f4, this.f31904a);
        }
    }

    /* renamed from: m0 */
    public void mo40374m0(Typeface typeface) {
        if (mo40376n0(typeface)) {
            mo40355c0();
        }
    }

    /* renamed from: n */
    public final void mo40375n() {
        if (this.f31898a == null && !this.f31900a.isEmpty() && !TextUtils.isEmpty(this.f31920b)) {
            mo40361g(0.0f);
            int width = this.f31903a.getWidth();
            int height = this.f31903a.getHeight();
            if (width > 0 && height > 0) {
                this.f31898a = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f31903a.draw(new Canvas(this.f31898a));
                if (this.f31899a == null) {
                    this.f31899a = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n0 */
    public final boolean mo40376n0(Typeface typeface) {
        C5306fu fuVar = this.f31919b;
        if (fuVar != null) {
            fuVar.mo36308c();
        }
        if (this.f31925c == typeface) {
            return false;
        }
        this.f31925c = typeface;
        Typeface b = rk4.m63713b(this.f31906a.getContext().getResources().getConfiguration(), typeface);
        this.f31917b = b;
        if (b == null) {
            b = this.f31925c;
        }
        this.f31902a = b;
        return true;
    }

    /* renamed from: o */
    public void mo40377o(@mr2 RectF rectF, int i, int i2) {
        this.f31921b = mo40359f(this.f31909a);
        rectF.left = Math.max(mo40385s(i, i2), (float) this.f31916b.left);
        rectF.top = (float) this.f31916b.top;
        rectF.right = Math.min(mo40387t(rectF, i, i2), (float) this.f31916b.right);
        rectF.bottom = ((float) this.f31916b.top) + mo40383r();
    }

    /* renamed from: o0 */
    public void mo40378o0(int i) {
        this.f31895a = i;
    }

    /* renamed from: p */
    public ColorStateList mo40379p() {
        return this.f31915b;
    }

    /* renamed from: p0 */
    public void mo40380p0(int i, int i2, int i3, int i4) {
        if (!m56674e0(this.f31900a, i, i2, i3, i4)) {
            this.f31900a.set(i, i2, i3, i4);
            this.f31936e = true;
        }
    }

    /* renamed from: q */
    public int mo40381q() {
        return this.f31923c;
    }

    /* renamed from: q0 */
    public void mo40382q0(@mr2 Rect rect) {
        mo40380p0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: r */
    public float mo40383r() {
        mo40343Q(this.f31918b);
        return -this.f31918b.ascent();
    }

    /* renamed from: r0 */
    public void mo40384r0(float f) {
        if (this.f31959x != f) {
            this.f31959x = f;
            mo40355c0();
        }
    }

    /* renamed from: s */
    public final float mo40385s(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) - (this.f31961z / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f31921b ? (float) this.f31916b.left : ((float) this.f31916b.right) - this.f31961z : this.f31921b ? ((float) this.f31916b.right) - this.f31961z : (float) this.f31916b.left;
    }

    /* renamed from: s0 */
    public void mo40386s0(int i) {
        sa4 sa4 = new sa4(this.f31906a.getContext(), i);
        if (sa4.mo44261i() != null) {
            this.f31897a = sa4.mo44261i();
        }
        if (sa4.mo44262j() != 0.0f) {
            this.f31928d = sa4.mo44262j();
        }
        ColorStateList colorStateList = sa4.f34959c;
        if (colorStateList != null) {
            this.f31930d = colorStateList;
        }
        this.f31956u = sa4.f34947a;
        this.f31957v = sa4.f34953b;
        this.f31955t = sa4.f34957c;
        this.f31959x = sa4.f34961d;
        C5306fu fuVar = this.f31907a;
        if (fuVar != null) {
            fuVar.mo36308c();
        }
        this.f31907a = new C5306fu(new C6074b(), sa4.mo44257e());
        sa4.mo44260h(this.f31906a.getContext(), this.f31907a);
        mo40355c0();
    }

    /* renamed from: t */
    public final float mo40387t(@mr2 RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) + (this.f31961z / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f31921b ? rectF.left + this.f31961z : (float) this.f31916b.right : this.f31921b ? (float) this.f31916b.right : rectF.left + this.f31961z;
    }

    /* renamed from: t0 */
    public final void mo40388t0(float f) {
        this.f31891B = f;
        jt4.m18985n1(this.f31906a);
    }

    /* renamed from: u */
    public float mo40389u() {
        return this.f31933e;
    }

    /* renamed from: u0 */
    public void mo40390u0(ColorStateList colorStateList) {
        if (this.f31897a != colorStateList) {
            this.f31897a = colorStateList;
            mo40355c0();
        }
    }

    /* renamed from: v */
    public Typeface mo40391v() {
        Typeface typeface = this.f31902a;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: v0 */
    public void mo40392v0(int i) {
        if (this.f31913b != i) {
            this.f31913b = i;
            mo40355c0();
        }
    }

    @d10
    /* renamed from: w */
    public int mo40393w() {
        return mo40395x(this.f31915b);
    }

    /* renamed from: w0 */
    public void mo40394w0(float f) {
        if (this.f31928d != f) {
            this.f31928d = f;
            mo40355c0();
        }
    }

    @d10
    /* renamed from: x */
    public final int mo40395x(@ts2 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f31911a;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: x0 */
    public void mo40396x0(Typeface typeface) {
        if (mo40398y0(typeface)) {
            mo40355c0();
        }
    }

    @d10
    /* renamed from: y */
    public final int mo40397y() {
        return mo40395x(this.f31897a);
    }

    /* renamed from: y0 */
    public final boolean mo40398y0(Typeface typeface) {
        C5306fu fuVar = this.f31907a;
        if (fuVar != null) {
            fuVar.mo36308c();
        }
        if (this.f31939f == typeface) {
            return false;
        }
        this.f31939f = typeface;
        Typeface b = rk4.m63713b(this.f31906a.getContext().getResources().getConfiguration(), typeface);
        this.f31935e = b;
        if (b == null) {
            b = this.f31939f;
        }
        this.f31931d = b;
        return true;
    }

    /* renamed from: z */
    public int mo40399z() {
        return this.f31929d;
    }

    /* renamed from: z0 */
    public void mo40400z0(float f) {
        float d = rf2.m26698d(f, 0.0f, 1.0f);
        if (d != this.f31894a) {
            this.f31894a = d;
            mo40354c();
        }
    }
}
