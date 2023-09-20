package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.C1556c;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pf2;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.circularreveal.b */
public class C1553b {

    /* renamed from: a */
    public static final int f8179a = 0;

    /* renamed from: b */
    public static final int f8180b = 1;

    /* renamed from: c */
    public static final int f8181c = 2;

    /* renamed from: c */
    public static final boolean f8182c = false;

    /* renamed from: d */
    public static final int f8183d = 2;
    @mr2

    /* renamed from: a */
    public final Paint f8184a = new Paint(7);
    @mr2

    /* renamed from: a */
    public final Path f8185a = new Path();
    @ts2

    /* renamed from: a */
    public Drawable f8186a;
    @mr2

    /* renamed from: a */
    public final View f8187a;

    /* renamed from: a */
    public final C1554a f8188a;
    @ts2

    /* renamed from: a */
    public C1556c.C1561e f8189a;

    /* renamed from: a */
    public boolean f8190a;
    @mr2

    /* renamed from: b */
    public final Paint f8191b;

    /* renamed from: b */
    public boolean f8192b;

    /* renamed from: c */
    public Paint f8193c;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface C1554a {
        /* renamed from: a */
        boolean mo11932a();

        /* renamed from: e */
        void mo11936e(Canvas canvas);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b */
    public @interface C1555b {
    }

    public C1553b(C1554a aVar) {
        this.f8188a = aVar;
        View view = (View) aVar;
        this.f8187a = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f8191b = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public void mo11946a() {
        if (f8183d == 0) {
            this.f8190a = true;
            this.f8192b = false;
            this.f8187a.buildDrawingCache();
            Bitmap drawingCache = this.f8187a.getDrawingCache();
            if (!(drawingCache != null || this.f8187a.getWidth() == 0 || this.f8187a.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f8187a.getWidth(), this.f8187a.getHeight(), Bitmap.Config.ARGB_8888);
                this.f8187a.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f8184a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f8190a = false;
            this.f8192b = true;
        }
    }

    /* renamed from: b */
    public void mo11947b() {
        if (f8183d == 0) {
            this.f8192b = false;
            this.f8187a.destroyDrawingCache();
            this.f8184a.setShader((Shader) null);
            this.f8187a.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (mo11963r() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (mo11963r() != false) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11948c(@com.onedelhi.secure.mr2 android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.mo11961p()
            if (r0 == 0) goto L_0x0082
            int r0 = f8183d
            if (r0 == 0) goto L_0x0061
            r1 = 1
            if (r0 == r1) goto L_0x0033
            r1 = 2
            if (r0 != r1) goto L_0x001c
            com.google.android.material.circularreveal.b$a r0 = r8.f8188a
            r0.mo11936e(r9)
            boolean r0 = r8.mo11963r()
            if (r0 == 0) goto L_0x00a3
            goto L_0x008d
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported strategy "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0033:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.f8185a
            r9.clipPath(r1)
            com.google.android.material.circularreveal.b$a r1 = r8.f8188a
            r1.mo11936e(r9)
            boolean r1 = r8.mo11963r()
            if (r1 == 0) goto L_0x005d
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.f8187a
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.f8187a
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.f8191b
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x005d:
            r9.restoreToCount(r0)
            goto L_0x00a3
        L_0x0061:
            com.google.android.material.circularreveal.c$e r0 = r8.f8189a
            float r1 = r0.f8199a
            float r2 = r0.f8200b
            float r0 = r0.f8201c
            android.graphics.Paint r3 = r8.f8184a
            r9.drawCircle(r1, r2, r0, r3)
            boolean r0 = r8.mo11963r()
            if (r0 == 0) goto L_0x00a3
            com.google.android.material.circularreveal.c$e r0 = r8.f8189a
            float r1 = r0.f8199a
            float r2 = r0.f8200b
            float r0 = r0.f8201c
            android.graphics.Paint r3 = r8.f8191b
            r9.drawCircle(r1, r2, r0, r3)
            goto L_0x00a3
        L_0x0082:
            com.google.android.material.circularreveal.b$a r0 = r8.f8188a
            r0.mo11936e(r9)
            boolean r0 = r8.mo11963r()
            if (r0 == 0) goto L_0x00a3
        L_0x008d:
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.f8187a
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.f8187a
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.f8191b
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x00a3:
            r8.mo11951f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C1553b.mo11948c(android.graphics.Canvas):void");
    }

    /* renamed from: d */
    public final void mo11949d(@mr2 Canvas canvas, int i, float f) {
        this.f8193c.setColor(i);
        this.f8193c.setStrokeWidth(f);
        C1556c.C1561e eVar = this.f8189a;
        canvas.drawCircle(eVar.f8199a, eVar.f8200b, eVar.f8201c - (f / 2.0f), this.f8193c);
    }

    /* renamed from: e */
    public final void mo11950e(@mr2 Canvas canvas) {
        this.f8188a.mo11936e(canvas);
        if (mo11963r()) {
            C1556c.C1561e eVar = this.f8189a;
            canvas.drawCircle(eVar.f8199a, eVar.f8200b, eVar.f8201c, this.f8191b);
        }
        if (mo11961p()) {
            mo11949d(canvas, -16777216, 10.0f);
            mo11949d(canvas, g74.f12468c, 5.0f);
        }
        mo11951f(canvas);
    }

    /* renamed from: f */
    public final void mo11951f(@mr2 Canvas canvas) {
        if (mo11962q()) {
            Rect bounds = this.f8186a.getBounds();
            float width = this.f8189a.f8199a - (((float) bounds.width()) / 2.0f);
            float height = this.f8189a.f8200b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f8186a.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    @ts2
    /* renamed from: g */
    public Drawable mo11952g() {
        return this.f8186a;
    }

    @d10
    /* renamed from: h */
    public int mo11953h() {
        return this.f8191b.getColor();
    }

    /* renamed from: i */
    public final float mo11954i(@mr2 C1556c.C1561e eVar) {
        return pf2.m60988b(eVar.f8199a, eVar.f8200b, 0.0f, 0.0f, (float) this.f8187a.getWidth(), (float) this.f8187a.getHeight());
    }

    @ts2
    /* renamed from: j */
    public C1556c.C1561e mo11955j() {
        C1556c.C1561e eVar = this.f8189a;
        if (eVar == null) {
            return null;
        }
        C1556c.C1561e eVar2 = new C1556c.C1561e(eVar);
        if (eVar2.mo11974a()) {
            eVar2.f8201c = mo11954i(eVar2);
        }
        return eVar2;
    }

    /* renamed from: k */
    public final void mo11956k() {
        if (f8183d == 1) {
            this.f8185a.rewind();
            C1556c.C1561e eVar = this.f8189a;
            if (eVar != null) {
                this.f8185a.addCircle(eVar.f8199a, eVar.f8200b, eVar.f8201c, Path.Direction.CW);
            }
        }
        this.f8187a.invalidate();
    }

    /* renamed from: l */
    public boolean mo11957l() {
        return this.f8188a.mo11932a() && !mo11961p();
    }

    /* renamed from: m */
    public void mo11958m(@ts2 Drawable drawable) {
        this.f8186a = drawable;
        this.f8187a.invalidate();
    }

    /* renamed from: n */
    public void mo11959n(@d10 int i) {
        this.f8191b.setColor(i);
        this.f8187a.invalidate();
    }

    /* renamed from: o */
    public void mo11960o(@ts2 C1556c.C1561e eVar) {
        if (eVar == null) {
            this.f8189a = null;
        } else {
            C1556c.C1561e eVar2 = this.f8189a;
            if (eVar2 == null) {
                this.f8189a = new C1556c.C1561e(eVar);
            } else {
                eVar2.mo11976c(eVar);
            }
            if (pf2.m60991e(eVar.f8201c, mo11954i(eVar), 1.0E-4f)) {
                this.f8189a.f8201c = Float.MAX_VALUE;
            }
        }
        mo11956k();
    }

    /* renamed from: p */
    public final boolean mo11961p() {
        C1556c.C1561e eVar = this.f8189a;
        boolean z = eVar == null || eVar.mo11974a();
        return f8183d == 0 ? !z && this.f8192b : !z;
    }

    /* renamed from: q */
    public final boolean mo11962q() {
        return (this.f8190a || this.f8186a == null || this.f8189a == null) ? false : true;
    }

    /* renamed from: r */
    public final boolean mo11963r() {
        return !this.f8190a && Color.alpha(this.f8191b.getColor()) != 0;
    }
}
