package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fx3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.vw3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class bf2 extends Drawable implements we4, nx3 {

    /* renamed from: a */
    public static final float f26278a = 0.75f;

    /* renamed from: b */
    public static final float f26279b = 0.25f;

    /* renamed from: b */
    public static final String f26280b = bf2.class.getSimpleName();

    /* renamed from: c */
    public static final Paint f26281c;

    /* renamed from: o */
    public static final int f26282o = 0;

    /* renamed from: p */
    public static final int f26283p = 1;

    /* renamed from: q */
    public static final int f26284q = 2;

    /* renamed from: a */
    public final Matrix f26285a;

    /* renamed from: a */
    public final Paint f26286a;

    /* renamed from: a */
    public final Path f26287a;
    @ts2

    /* renamed from: a */
    public PorterDuffColorFilter f26288a;

    /* renamed from: a */
    public final RectF f26289a;

    /* renamed from: a */
    public final Region f26290a;

    /* renamed from: a */
    public C4668d f26291a;

    /* renamed from: a */
    public final sw3 f26292a;

    /* renamed from: a */
    public uw3 f26293a;
    @mr2

    /* renamed from: a */
    public final vw3.C7103b f26294a;

    /* renamed from: a */
    public final vw3 f26295a;

    /* renamed from: a */
    public final BitSet f26296a;

    /* renamed from: a */
    public final fx3.C5337j[] f26297a;

    /* renamed from: b */
    public final Paint f26298b;

    /* renamed from: b */
    public final Path f26299b;
    @ts2

    /* renamed from: b */
    public PorterDuffColorFilter f26300b;

    /* renamed from: b */
    public final RectF f26301b;

    /* renamed from: b */
    public final Region f26302b;

    /* renamed from: b */
    public boolean f26303b;

    /* renamed from: b */
    public final fx3.C5337j[] f26304b;
    @mr2

    /* renamed from: c */
    public final RectF f26305c;

    /* renamed from: c */
    public boolean f26306c;

    /* renamed from: n */
    public int f26307n;

    /* renamed from: com.onedelhi.secure.bf2$a */
    public class C4665a implements vw3.C7103b {
        public C4665a() {
        }

        /* renamed from: a */
        public void mo31650a(@mr2 fx3 fx3, Matrix matrix, int i) {
            bf2.this.f26296a.set(i + 4, fx3.mo36339e());
            bf2.this.f26304b[i] = fx3.mo36340f(matrix);
        }

        /* renamed from: b */
        public void mo31651b(@mr2 fx3 fx3, Matrix matrix, int i) {
            bf2.this.f26296a.set(i, fx3.mo36339e());
            bf2.this.f26297a[i] = fx3.mo36340f(matrix);
        }
    }

    /* renamed from: com.onedelhi.secure.bf2$b */
    public class C4666b implements uw3.C6983c {

        /* renamed from: a */
        public final /* synthetic */ float f26309a;

        public C4666b(float f) {
            this.f26309a = f;
        }

        @mr2
        /* renamed from: a */
        public z80 mo31652a(@mr2 z80 z80) {
            return z80 instanceof ph3 ? z80 : new C4727c4(this.f26309a, z80);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.bf2$c */
    public @interface C4667c {
    }

    /* renamed from: com.onedelhi.secure.bf2$d */
    public static final class C4668d extends Drawable.ConstantState {

        /* renamed from: a */
        public float f26311a = 1.0f;

        /* renamed from: a */
        public int f26312a = 255;
        @ts2

        /* renamed from: a */
        public ColorStateList f26313a = null;
        @ts2

        /* renamed from: a */
        public ColorFilter f26314a;

        /* renamed from: a */
        public Paint.Style f26315a = Paint.Style.FILL_AND_STROKE;
        @ts2

        /* renamed from: a */
        public PorterDuff.Mode f26316a = PorterDuff.Mode.SRC_IN;
        @ts2

        /* renamed from: a */
        public Rect f26317a = null;
        @ts2

        /* renamed from: a */
        public js0 f26318a;
        @mr2

        /* renamed from: a */
        public uw3 f26319a;

        /* renamed from: a */
        public boolean f26320a = false;

        /* renamed from: b */
        public float f26321b = 1.0f;

        /* renamed from: b */
        public int f26322b = 0;
        @ts2

        /* renamed from: b */
        public ColorStateList f26323b = null;

        /* renamed from: c */
        public float f26324c;

        /* renamed from: c */
        public int f26325c = 0;
        @ts2

        /* renamed from: c */
        public ColorStateList f26326c = null;

        /* renamed from: d */
        public float f26327d = 0.0f;

        /* renamed from: d */
        public int f26328d = 0;
        @ts2

        /* renamed from: d */
        public ColorStateList f26329d = null;

        /* renamed from: e */
        public float f26330e = 0.0f;

        /* renamed from: e */
        public int f26331e = 0;

        /* renamed from: f */
        public float f26332f = 0.0f;

        public C4668d(@mr2 C4668d dVar) {
            this.f26319a = dVar.f26319a;
            this.f26318a = dVar.f26318a;
            this.f26324c = dVar.f26324c;
            this.f26314a = dVar.f26314a;
            this.f26313a = dVar.f26313a;
            this.f26323b = dVar.f26323b;
            this.f26316a = dVar.f26316a;
            this.f26329d = dVar.f26329d;
            this.f26312a = dVar.f26312a;
            this.f26311a = dVar.f26311a;
            this.f26328d = dVar.f26328d;
            this.f26322b = dVar.f26322b;
            this.f26320a = dVar.f26320a;
            this.f26321b = dVar.f26321b;
            this.f26327d = dVar.f26327d;
            this.f26330e = dVar.f26330e;
            this.f26332f = dVar.f26332f;
            this.f26325c = dVar.f26325c;
            this.f26331e = dVar.f26331e;
            this.f26326c = dVar.f26326c;
            this.f26315a = dVar.f26315a;
            if (dVar.f26317a != null) {
                this.f26317a = new Rect(dVar.f26317a);
            }
        }

        public C4668d(uw3 uw3, js0 js0) {
            this.f26319a = uw3;
            this.f26318a = js0;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @mr2
        public Drawable newDrawable() {
            bf2 bf2 = new bf2(this, (C4665a) null);
            boolean unused = bf2.f26303b = true;
            return bf2;
        }
    }

    static {
        Paint paint = new Paint(1);
        f26281c = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public bf2() {
        this(new uw3());
    }

    public bf2(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        this(uw3.m67447e(context, attributeSet, i, i2).mo45845m());
    }

    public bf2(@mr2 C4668d dVar) {
        this.f26297a = new fx3.C5337j[4];
        this.f26304b = new fx3.C5337j[4];
        this.f26296a = new BitSet(8);
        this.f26285a = new Matrix();
        this.f26287a = new Path();
        this.f26299b = new Path();
        this.f26289a = new RectF();
        this.f26301b = new RectF();
        this.f26290a = new Region();
        this.f26302b = new Region();
        Paint paint = new Paint(1);
        this.f26286a = paint;
        Paint paint2 = new Paint(1);
        this.f26298b = paint2;
        this.f26292a = new sw3();
        this.f26295a = Looper.getMainLooper().getThread() == Thread.currentThread() ? vw3.m68560k() : new vw3();
        this.f26305c = new RectF();
        this.f26306c = true;
        this.f26291a = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        mo31586N0();
        mo31584M0(getState());
        this.f26294a = new C4665a();
    }

    public /* synthetic */ bf2(C4668d dVar, C4665a aVar) {
        this(dVar);
    }

    @Deprecated
    public bf2(@mr2 hx3 hx3) {
        this((uw3) hx3);
    }

    public bf2(@mr2 uw3 uw3) {
        this(new C4668d(uw3, (js0) null));
    }

    /* renamed from: h0 */
    public static int m39721h0(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @mr2
    /* renamed from: m */
    public static bf2 m39722m(Context context) {
        return m39723n(context, 0.0f);
    }

    @mr2
    /* renamed from: n */
    public static bf2 m39723n(Context context, float f) {
        int c = oe2.m23717c(context, fd3.C2153c.colorSurface, bf2.class.getSimpleName());
        bf2 bf2 = new bf2();
        bf2.mo31599Z(context);
        bf2.mo31626o0(ColorStateList.valueOf(c));
        bf2.mo31624n0(f);
        return bf2;
    }

    /* renamed from: A */
    public Paint.Style mo31559A() {
        return this.f26291a.f26315a;
    }

    @Deprecated
    /* renamed from: A0 */
    public void mo31560A0(int i) {
        this.f26291a.f26325c = i;
    }

    /* renamed from: B */
    public float mo31561B() {
        return this.f26291a.f26327d;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: B0 */
    public void mo31562B0(int i) {
        C4668d dVar = this.f26291a;
        if (dVar.f26328d != i) {
            dVar.f26328d = i;
            mo31600a0();
        }
    }

    @Deprecated
    /* renamed from: C */
    public void mo31563C(int i, int i2, @mr2 Path path) {
        mo31612h(new RectF(0.0f, 0.0f, (float) i, (float) i2), path);
    }

    @Deprecated
    /* renamed from: C0 */
    public void mo31564C0(@mr2 hx3 hx3) {
        setShapeAppearanceModel(hx3);
    }

    @d10
    /* renamed from: D */
    public int mo31565D() {
        return this.f26307n;
    }

    /* renamed from: D0 */
    public void mo31566D0(float f, @d10 int i) {
        mo31576I0(f);
        mo31570F0(ColorStateList.valueOf(i));
    }

    /* renamed from: E */
    public float mo31567E() {
        return this.f26291a.f26311a;
    }

    /* renamed from: E0 */
    public void mo31568E0(float f, @ts2 ColorStateList colorStateList) {
        mo31576I0(f);
        mo31570F0(colorStateList);
    }

    /* renamed from: F */
    public int mo31569F() {
        return this.f26291a.f26331e;
    }

    /* renamed from: F0 */
    public void mo31570F0(@ts2 ColorStateList colorStateList) {
        C4668d dVar = this.f26291a;
        if (dVar.f26323b != colorStateList) {
            dVar.f26323b = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public int mo31571G() {
        return this.f26291a.f26322b;
    }

    /* renamed from: G0 */
    public void mo31572G0(@d10 int i) {
        mo31574H0(ColorStateList.valueOf(i));
    }

    @Deprecated
    /* renamed from: H */
    public int mo31573H() {
        return (int) mo31644x();
    }

    /* renamed from: H0 */
    public void mo31574H0(ColorStateList colorStateList) {
        this.f26291a.f26326c = colorStateList;
        mo31586N0();
        mo31600a0();
    }

    /* renamed from: I */
    public int mo31575I() {
        C4668d dVar = this.f26291a;
        return (int) (((double) dVar.f26328d) * Math.sin(Math.toRadians((double) dVar.f26331e)));
    }

    /* renamed from: I0 */
    public void mo31576I0(float f) {
        this.f26291a.f26324c = f;
        invalidateSelf();
    }

    /* renamed from: J */
    public int mo31577J() {
        C4668d dVar = this.f26291a;
        return (int) (((double) dVar.f26328d) * Math.cos(Math.toRadians((double) dVar.f26331e)));
    }

    /* renamed from: J0 */
    public void mo31578J0(float f) {
        C4668d dVar = this.f26291a;
        if (dVar.f26332f != f) {
            dVar.f26332f = f;
            mo31588O0();
        }
    }

    /* renamed from: K */
    public int mo31579K() {
        return this.f26291a.f26325c;
    }

    /* renamed from: K0 */
    public void mo31580K0(boolean z) {
        C4668d dVar = this.f26291a;
        if (dVar.f26320a != z) {
            dVar.f26320a = z;
            invalidateSelf();
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: L */
    public int mo31581L() {
        return this.f26291a.f26328d;
    }

    /* renamed from: L0 */
    public void mo31582L0(float f) {
        mo31578J0(f - mo31644x());
    }

    @ts2
    @Deprecated
    /* renamed from: M */
    public hx3 mo31583M() {
        uw3 shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof hx3) {
            return (hx3) shapeAppearanceModel;
        }
        return null;
    }

    /* renamed from: M0 */
    public final boolean mo31584M0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f26291a.f26313a == null || (color2 = this.f26286a.getColor()) == (colorForState2 = this.f26291a.f26313a.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f26286a.setColor(colorForState2);
            z = true;
        }
        if (this.f26291a.f26323b == null || (color = this.f26298b.getColor()) == (colorForState = this.f26291a.f26323b.getColorForState(iArr, color))) {
            return z;
        }
        this.f26298b.setColor(colorForState);
        return true;
    }

    @ts2
    /* renamed from: N */
    public ColorStateList mo31585N() {
        return this.f26291a.f26323b;
    }

    /* renamed from: N0 */
    public final boolean mo31586N0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f26288a;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f26300b;
        C4668d dVar = this.f26291a;
        this.f26288a = mo31618k(dVar.f26329d, dVar.f26316a, this.f26286a, true);
        C4668d dVar2 = this.f26291a;
        this.f26300b = mo31618k(dVar2.f26326c, dVar2.f26316a, this.f26298b, false);
        C4668d dVar3 = this.f26291a;
        if (dVar3.f26320a) {
            this.f26292a.mo44586e(dVar3.f26329d.getColorForState(getState(), 0));
        }
        return !ot2.m24056a(porterDuffColorFilter, this.f26288a) || !ot2.m24056a(porterDuffColorFilter2, this.f26300b);
    }

    /* renamed from: O */
    public final float mo31587O() {
        if (mo31598Y()) {
            return this.f26298b.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: O0 */
    public final void mo31588O0() {
        float V = mo31595V();
        this.f26291a.f26325c = (int) Math.ceil((double) (0.75f * V));
        this.f26291a.f26328d = (int) Math.ceil((double) (V * 0.25f));
        mo31586N0();
        mo31600a0();
    }

    @ts2
    /* renamed from: P */
    public ColorStateList mo31589P() {
        return this.f26291a.f26326c;
    }

    /* renamed from: Q */
    public float mo31590Q() {
        return this.f26291a.f26324c;
    }

    @ts2
    /* renamed from: R */
    public ColorStateList mo31591R() {
        return this.f26291a.f26329d;
    }

    /* renamed from: S */
    public float mo31592S() {
        return this.f26291a.f26319a.mo45820r().mo32234a(mo31640v());
    }

    /* renamed from: T */
    public float mo31593T() {
        return this.f26291a.f26319a.mo45822t().mo32234a(mo31640v());
    }

    /* renamed from: U */
    public float mo31594U() {
        return this.f26291a.f26332f;
    }

    /* renamed from: V */
    public float mo31595V() {
        return mo31644x() + mo31594U();
    }

    /* renamed from: W */
    public final boolean mo31596W() {
        C4668d dVar = this.f26291a;
        int i = dVar.f26322b;
        return i != 1 && dVar.f26325c > 0 && (i == 2 || mo31617j0());
    }

    /* renamed from: X */
    public final boolean mo31597X() {
        Paint.Style style = this.f26291a.f26315a;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: Y */
    public final boolean mo31598Y() {
        Paint.Style style = this.f26291a.f26315a;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f26298b.getStrokeWidth() > 0.0f;
    }

    /* renamed from: Z */
    public void mo31599Z(Context context) {
        this.f26291a.f26318a = new js0(context);
        mo31588O0();
    }

    /* renamed from: a0 */
    public final void mo31600a0() {
        super.invalidateSelf();
    }

    /* renamed from: b0 */
    public boolean mo31601b0() {
        js0 js0 = this.f26291a.f26318a;
        return js0 != null && js0.mo18577l();
    }

    /* renamed from: c0 */
    public boolean mo31602c0() {
        return this.f26291a.f26318a != null;
    }

    /* renamed from: d0 */
    public boolean mo31603d0(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    public void draw(@mr2 Canvas canvas) {
        this.f26286a.setColorFilter(this.f26288a);
        int alpha = this.f26286a.getAlpha();
        this.f26286a.setAlpha(m39721h0(alpha, this.f26291a.f26312a));
        this.f26298b.setColorFilter(this.f26300b);
        this.f26298b.setStrokeWidth(this.f26291a.f26324c);
        int alpha2 = this.f26298b.getAlpha();
        this.f26298b.setAlpha(m39721h0(alpha2, this.f26291a.f26312a));
        if (this.f26303b) {
            mo31613i();
            mo31607g(mo31640v(), this.f26287a);
            this.f26303b = false;
        }
        mo31608g0(canvas);
        if (mo31597X()) {
            mo31628p(canvas);
        }
        if (mo31598Y()) {
            mo31634s(canvas);
        }
        this.f26286a.setAlpha(alpha);
        this.f26298b.setAlpha(alpha2);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: e0 */
    public boolean mo31604e0() {
        return this.f26291a.f26319a.mo45823u(mo31640v());
    }

    @ts2
    /* renamed from: f */
    public final PorterDuffColorFilter mo31605f(@mr2 Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = mo31620l(color);
        this.f26307n = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @Deprecated
    /* renamed from: f0 */
    public boolean mo31606f0() {
        int i = this.f26291a.f26322b;
        return i == 0 || i == 2;
    }

    /* renamed from: g */
    public final void mo31607g(@mr2 RectF rectF, @mr2 Path path) {
        mo31612h(rectF, path);
        if (this.f26291a.f26311a != 1.0f) {
            this.f26285a.reset();
            Matrix matrix = this.f26285a;
            float f = this.f26291a.f26311a;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f26285a);
        }
        path.computeBounds(this.f26305c, true);
    }

    /* renamed from: g0 */
    public final void mo31608g0(@mr2 Canvas canvas) {
        if (mo31596W()) {
            canvas.save();
            mo31614i0(canvas);
            if (!this.f26306c) {
                mo31625o(canvas);
            } else {
                int width = (int) (this.f26305c.width() - ((float) getBounds().width()));
                int height = (int) (this.f26305c.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f26305c.width()) + (this.f26291a.f26325c * 2) + width, ((int) this.f26305c.height()) + (this.f26291a.f26325c * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (float) ((getBounds().left - this.f26291a.f26325c) - width);
                float f2 = (float) ((getBounds().top - this.f26291a.f26325c) - height);
                canvas2.translate(-f, -f2);
                mo31625o(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    public int getAlpha() {
        return this.f26291a.f26312a;
    }

    @ts2
    public Drawable.ConstantState getConstantState() {
        return this.f26291a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@mr2 Outline outline) {
        if (this.f26291a.f26322b != 2) {
            if (mo31604e0()) {
                outline.setRoundRect(getBounds(), mo31592S() * this.f26291a.f26321b);
                return;
            }
            mo31607g(mo31640v(), this.f26287a);
            if (this.f26287a.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f26287a);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(@mr2 Rect rect) {
        Rect rect2 = this.f26291a.f26317a;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return this.f26291a.f26319a;
    }

    public Region getTransparentRegion() {
        this.f26290a.set(getBounds());
        mo31607g(mo31640v(), this.f26287a);
        this.f26302b.setPath(this.f26287a, this.f26290a);
        this.f26290a.op(this.f26302b, Region.Op.DIFFERENCE);
        return this.f26290a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: h */
    public final void mo31612h(@mr2 RectF rectF, @mr2 Path path) {
        vw3 vw3 = this.f26295a;
        C4668d dVar = this.f26291a;
        uw3 uw3 = dVar.f26319a;
        float f = dVar.f26321b;
        vw3.mo46403e(uw3, f, rectF, this.f26294a, path);
    }

    /* renamed from: i */
    public final void mo31613i() {
        uw3 y = getShapeAppearanceModel().mo45827y(new C4666b(-mo31587O()));
        this.f26293a = y;
        this.f26295a.mo46402d(y, this.f26291a.f26321b, mo31642w(), this.f26299b);
    }

    /* renamed from: i0 */
    public final void mo31614i0(@mr2 Canvas canvas) {
        canvas.translate((float) mo31575I(), (float) mo31577J());
    }

    public void invalidateSelf() {
        this.f26303b = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f26291a.f26323b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f26291a.f26313a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f26291a.f26329d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f26291a.f26326c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            com.onedelhi.secure.bf2$d r0 = r1.f26291a
            android.content.res.ColorStateList r0 = r0.f26329d
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            com.onedelhi.secure.bf2$d r0 = r1.f26291a
            android.content.res.ColorStateList r0 = r0.f26326c
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            com.onedelhi.secure.bf2$d r0 = r1.f26291a
            android.content.res.ColorStateList r0 = r0.f26323b
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            com.onedelhi.secure.bf2$d r0 = r1.f26291a
            android.content.res.ColorStateList r0 = r0.f26313a
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bf2.isStateful():boolean");
    }

    @mr2
    /* renamed from: j */
    public final PorterDuffColorFilter mo31616j(@mr2 ColorStateList colorStateList, @mr2 PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo31620l(colorForState);
        }
        this.f26307n = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    public boolean mo31617j0() {
        return !mo31604e0() && !this.f26287a.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    @mr2
    /* renamed from: k */
    public final PorterDuffColorFilter mo31618k(@ts2 ColorStateList colorStateList, @ts2 PorterDuff.Mode mode, @mr2 Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? mo31605f(paint, z) : mo31616j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    public void mo31619k0(float f) {
        setShapeAppearanceModel(this.f26291a.f26319a.mo45825w(f));
    }

    @d10
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: l */
    public int mo31620l(@d10 int i) {
        float V = mo31595V() + mo31561B();
        js0 js0 = this.f26291a.f26318a;
        return js0 != null ? js0.mo18570e(i, V) : i;
    }

    /* renamed from: l0 */
    public void mo31621l0(@mr2 z80 z80) {
        setShapeAppearanceModel(this.f26291a.f26319a.mo45826x(z80));
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: m0 */
    public void mo31622m0(boolean z) {
        this.f26295a.mo46411n(z);
    }

    @mr2
    public Drawable mutate() {
        this.f26291a = new C4668d(this.f26291a);
        return this;
    }

    /* renamed from: n0 */
    public void mo31624n0(float f) {
        C4668d dVar = this.f26291a;
        if (dVar.f26330e != f) {
            dVar.f26330e = f;
            mo31588O0();
        }
    }

    /* renamed from: o */
    public final void mo31625o(@mr2 Canvas canvas) {
        if (this.f26296a.cardinality() > 0) {
            Log.w(f26280b, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f26291a.f26328d != 0) {
            canvas.drawPath(this.f26287a, this.f26292a.mo44585d());
        }
        for (int i = 0; i < 4; i++) {
            this.f26297a[i].mo36397b(this.f26292a, this.f26291a.f26325c, canvas);
            this.f26304b[i].mo36397b(this.f26292a, this.f26291a.f26325c, canvas);
        }
        if (this.f26306c) {
            int I = mo31575I();
            int J = mo31577J();
            canvas.translate((float) (-I), (float) (-J));
            canvas.drawPath(this.f26287a, f26281c);
            canvas.translate((float) I, (float) J);
        }
    }

    /* renamed from: o0 */
    public void mo31626o0(@ts2 ColorStateList colorStateList) {
        C4668d dVar = this.f26291a;
        if (dVar.f26313a != colorStateList) {
            dVar.f26313a = colorStateList;
            onStateChange(getState());
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f26303b = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = mo31584M0(iArr) || mo31586N0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final void mo31628p(@mr2 Canvas canvas) {
        mo31632r(canvas, this.f26286a, this.f26287a, this.f26291a.f26319a, mo31640v());
    }

    /* renamed from: p0 */
    public void mo31629p0(float f) {
        C4668d dVar = this.f26291a;
        if (dVar.f26321b != f) {
            dVar.f26321b = f;
            this.f26303b = true;
            invalidateSelf();
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: q */
    public void mo31630q(@mr2 Canvas canvas, @mr2 Paint paint, @mr2 Path path, @mr2 RectF rectF) {
        mo31632r(canvas, paint, path, this.f26291a.f26319a, rectF);
    }

    /* renamed from: q0 */
    public void mo31631q0(int i, int i2, int i3, int i4) {
        C4668d dVar = this.f26291a;
        if (dVar.f26317a == null) {
            dVar.f26317a = new Rect();
        }
        this.f26291a.f26317a.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: r */
    public final void mo31632r(@mr2 Canvas canvas, @mr2 Paint paint, @mr2 Path path, @mr2 uw3 uw3, @mr2 RectF rectF) {
        if (uw3.mo45823u(rectF)) {
            float a = uw3.mo45822t().mo32234a(rectF) * this.f26291a.f26321b;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r0 */
    public void mo31633r0(Paint.Style style) {
        this.f26291a.f26315a = style;
        mo31600a0();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: s */
    public void mo31634s(@mr2 Canvas canvas) {
        mo31632r(canvas, this.f26298b, this.f26299b, this.f26293a, mo31642w());
    }

    /* renamed from: s0 */
    public void mo31635s0(float f) {
        C4668d dVar = this.f26291a;
        if (dVar.f26327d != f) {
            dVar.f26327d = f;
            mo31588O0();
        }
    }

    public void setAlpha(@js1(from = 0, mo18580to = 255) int i) {
        C4668d dVar = this.f26291a;
        if (dVar.f26312a != i) {
            dVar.f26312a = i;
            mo31600a0();
        }
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        this.f26291a.f26314a = colorFilter;
        mo31600a0();
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        this.f26291a.f26319a = uw3;
        invalidateSelf();
    }

    public void setTint(@d10 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(@ts2 ColorStateList colorStateList) {
        this.f26291a.f26329d = colorStateList;
        mo31586N0();
        mo31600a0();
    }

    public void setTintMode(@ts2 PorterDuff.Mode mode) {
        C4668d dVar = this.f26291a;
        if (dVar.f26316a != mode) {
            dVar.f26316a = mode;
            mo31586N0();
            mo31600a0();
        }
    }

    /* renamed from: t */
    public float mo31636t() {
        return this.f26291a.f26319a.mo45813j().mo32234a(mo31640v());
    }

    /* renamed from: t0 */
    public void mo31637t0(float f) {
        C4668d dVar = this.f26291a;
        if (dVar.f26311a != f) {
            dVar.f26311a = f;
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public float mo31638u() {
        return this.f26291a.f26319a.mo45815l().mo32234a(mo31640v());
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: u0 */
    public void mo31639u0(boolean z) {
        this.f26306c = z;
    }

    @mr2
    /* renamed from: v */
    public RectF mo31640v() {
        this.f26289a.set(getBounds());
        return this.f26289a;
    }

    /* renamed from: v0 */
    public void mo31641v0(int i) {
        this.f26292a.mo44586e(i);
        this.f26291a.f26320a = false;
        mo31600a0();
    }

    @mr2
    /* renamed from: w */
    public final RectF mo31642w() {
        this.f26301b.set(mo31640v());
        float O = mo31587O();
        this.f26301b.inset(O, O);
        return this.f26301b;
    }

    /* renamed from: w0 */
    public void mo31643w0(int i) {
        C4668d dVar = this.f26291a;
        if (dVar.f26331e != i) {
            dVar.f26331e = i;
            mo31600a0();
        }
    }

    /* renamed from: x */
    public float mo31644x() {
        return this.f26291a.f26330e;
    }

    /* renamed from: x0 */
    public void mo31645x0(int i) {
        C4668d dVar = this.f26291a;
        if (dVar.f26322b != i) {
            dVar.f26322b = i;
            mo31600a0();
        }
    }

    @ts2
    /* renamed from: y */
    public ColorStateList mo31646y() {
        return this.f26291a.f26313a;
    }

    @Deprecated
    /* renamed from: y0 */
    public void mo31647y0(int i) {
        mo31624n0((float) i);
    }

    /* renamed from: z */
    public float mo31648z() {
        return this.f26291a.f26321b;
    }

    @Deprecated
    /* renamed from: z0 */
    public void mo31649z0(boolean z) {
        mo31645x0(z ^ true ? 1 : 0);
    }
}
