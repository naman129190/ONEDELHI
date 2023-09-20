package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.onedelhi.secure.C3632ti;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ya4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.si */
public class C3516si extends Drawable implements ya4.C7322b {

    /* renamed from: b */
    public static final String f20377b = "+";

    /* renamed from: o */
    public static final int f20378o = 8388661;

    /* renamed from: p */
    public static final int f20379p = 8388659;

    /* renamed from: q */
    public static final int f20380q = 8388693;

    /* renamed from: r */
    public static final int f20381r = 8388691;

    /* renamed from: s */
    public static final int f20382s = 9;
    @e64

    /* renamed from: t */
    public static final int f20383t = fd3.C2164n.Widget_MaterialComponents_Badge;
    @C3982yb

    /* renamed from: u */
    public static final int f20384u = fd3.C2153c.badgeStyle;

    /* renamed from: a */
    public float f20385a;
    @mr2

    /* renamed from: a */
    public final Rect f20386a = new Rect();
    @mr2

    /* renamed from: a */
    public final bf2 f20387a = new bf2();
    @mr2

    /* renamed from: a */
    public final C3632ti f20388a;
    @mr2

    /* renamed from: a */
    public final ya4 f20389a;
    @mr2

    /* renamed from: a */
    public final WeakReference<Context> f20390a;

    /* renamed from: b */
    public float f20391b;
    @ts2

    /* renamed from: b */
    public WeakReference<View> f20392b;

    /* renamed from: c */
    public float f20393c;
    @ts2

    /* renamed from: c */
    public WeakReference<FrameLayout> f20394c;

    /* renamed from: d */
    public float f20395d;

    /* renamed from: e */
    public float f20396e;

    /* renamed from: n */
    public int f20397n;

    /* renamed from: com.onedelhi.secure.si$a */
    public class C3517a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f20398a;

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f20399a;

        public C3517a(View view, FrameLayout frameLayout) {
            this.f20398a = view;
            this.f20399a = frameLayout;
        }

        public void run() {
            C3516si.this.mo24422i0(this.f20398a, this.f20399a);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.si$b */
    public @interface C3518b {
    }

    public C3516si(@mr2 Context context, @ez4 int i, @C3982yb int i2, @e64 int i3, @ts2 C3632ti.C3633a aVar) {
        this.f20390a = new WeakReference<>(context);
        ob4.m59187c(context);
        ya4 ya4 = new ya4(this);
        this.f20389a = ya4;
        ya4.mo47666e().setTextAlign(Paint.Align.CENTER);
        mo24404Z(fd3.C2164n.TextAppearance_MaterialComponents_Badge);
        this.f20388a = new C3632ti(context, i, i2, i3, aVar);
        mo24388J();
    }

    @mr2
    /* renamed from: d */
    public static C3516si m27588d(@mr2 Context context) {
        return new C3516si(context, 0, f20384u, f20383t, (C3632ti.C3633a) null);
    }

    @mr2
    /* renamed from: e */
    public static C3516si m27589e(@mr2 Context context, @ez4 int i) {
        return new C3516si(context, i, f20384u, f20383t, (C3632ti.C3633a) null);
    }

    @mr2
    /* renamed from: f */
    public static C3516si m27590f(@mr2 Context context, @mr2 C3632ti.C3633a aVar) {
        return new C3516si(context, 0, f20384u, f20383t, aVar);
    }

    /* renamed from: f0 */
    public static void m27591f0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @e83
    /* renamed from: A */
    public int mo24379A() {
        return this.f20388a.mo25060s();
    }

    /* renamed from: B */
    public boolean mo24380B() {
        return this.f20388a.mo25061t();
    }

    /* renamed from: C */
    public final void mo24381C() {
        this.f20389a.mo47666e().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* renamed from: D */
    public final void mo24382D() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f20388a.mo25047f());
        if (this.f20387a.mo31646y() != valueOf) {
            this.f20387a.mo31626o0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: E */
    public final void mo24383E() {
        WeakReference<View> weakReference = this.f20392b;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f20392b.get();
            WeakReference<FrameLayout> weakReference2 = this.f20394c;
            mo24422i0(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
        }
    }

    /* renamed from: F */
    public final void mo24384F() {
        this.f20389a.mo47666e().setColor(this.f20388a.mo25049h());
        invalidateSelf();
    }

    /* renamed from: G */
    public final void mo24385G() {
        mo24427k0();
        this.f20389a.mo47671j(true);
        mo24425j0();
        invalidateSelf();
    }

    /* renamed from: H */
    public final void mo24386H() {
        this.f20389a.mo47671j(true);
        mo24425j0();
        invalidateSelf();
    }

    /* renamed from: I */
    public final void mo24387I() {
        boolean u = this.f20388a.mo25062u();
        setVisible(u, false);
        if (C3711ui.f21382a && mo24432p() != null && !u) {
            ((ViewGroup) mo24432p().getParent()).invalidate();
        }
    }

    /* renamed from: J */
    public final void mo24388J() {
        mo24385G();
        mo24386H();
        mo24381C();
        mo24382D();
        mo24384F();
        mo24383E();
        mo24425j0();
        mo24387I();
    }

    /* renamed from: K */
    public void mo24389K(int i) {
        this.f20388a.mo25063w(i);
        mo24425j0();
    }

    /* renamed from: L */
    public void mo24390L(@e83 int i) {
        this.f20388a.mo25064x(i);
        mo24425j0();
    }

    /* renamed from: M */
    public void mo24391M(@d10 int i) {
        this.f20388a.mo25066z(i);
        mo24382D();
    }

    /* renamed from: N */
    public void mo24392N(int i) {
        if (this.f20388a.mo25048g() != i) {
            this.f20388a.mo25029A(i);
            mo24383E();
        }
    }

    /* renamed from: O */
    public void mo24393O(@mr2 Locale locale) {
        if (!locale.equals(this.f20388a.mo25057p())) {
            this.f20388a.mo25038J(locale);
            invalidateSelf();
        }
    }

    /* renamed from: P */
    public void mo24394P(@d10 int i) {
        if (this.f20389a.mo47666e().getColor() != i) {
            this.f20388a.mo25030B(i);
            mo24384F();
        }
    }

    /* renamed from: Q */
    public void mo24395Q(@e54 int i) {
        this.f20388a.mo25031C(i);
    }

    /* renamed from: R */
    public void mo24396R(CharSequence charSequence) {
        this.f20388a.mo25032D(charSequence);
    }

    /* renamed from: S */
    public void mo24397S(@t23 int i) {
        this.f20388a.mo25033E(i);
    }

    /* renamed from: T */
    public void mo24398T(int i) {
        mo24400V(i);
        mo24399U(i);
    }

    /* renamed from: U */
    public void mo24399U(@e83 int i) {
        this.f20388a.mo25034F(i);
        mo24425j0();
    }

    /* renamed from: V */
    public void mo24400V(@e83 int i) {
        this.f20388a.mo25035G(i);
        mo24425j0();
    }

    /* renamed from: W */
    public void mo24401W(int i) {
        if (this.f20388a.mo25055n() != i) {
            this.f20388a.mo25036H(i);
            mo24385G();
        }
    }

    /* renamed from: X */
    public void mo24402X(int i) {
        int max = Math.max(0, i);
        if (this.f20388a.mo25056o() != max) {
            this.f20388a.mo25037I(max);
            mo24386H();
        }
    }

    /* renamed from: Y */
    public final void mo24403Y(@ts2 sa4 sa4) {
        Context context;
        if (this.f20389a.mo47665d() != sa4 && (context = (Context) this.f20390a.get()) != null) {
            this.f20389a.mo47670i(sa4, context);
            mo24425j0();
        }
    }

    /* renamed from: Z */
    public final void mo24404Z(@e64 int i) {
        Context context = (Context) this.f20390a.get();
        if (context != null) {
            mo24403Y(new sa4(context, i));
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo11839a() {
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo24405a0(int i) {
        mo24409c0(i);
        mo24407b0(i);
    }

    /* renamed from: b */
    public final void mo24406b(@mr2 Context context, @mr2 Rect rect, @mr2 View view) {
        float f;
        int x = mo24442x();
        int g = this.f20388a.mo25048g();
        this.f20391b = (float) ((g == 8388691 || g == 8388693) ? rect.bottom - x : rect.top + x);
        if (mo24439u() <= 9) {
            f = !mo24380B() ? this.f20388a.f20854a : this.f20388a.f20856b;
            this.f20393c = f;
            this.f20396e = f;
        } else {
            float f2 = this.f20388a.f20856b;
            this.f20393c = f2;
            this.f20396e = f2;
            f = (this.f20389a.mo47667f(mo24429m()) / 2.0f) + this.f20388a.f20858c;
        }
        this.f20395d = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo24380B() ? fd3.C2156f.mtrl_badge_text_horizontal_edge_offset : fd3.C2156f.mtrl_badge_horizontal_edge_offset);
        int w = mo24441w();
        int g2 = this.f20388a.mo25048g();
        this.f20385a = (g2 == 8388659 || g2 == 8388691 ? jt4.m18928Z(view) != 0 : jt4.m18928Z(view) == 0) ? ((((float) rect.right) + this.f20395d) - ((float) dimensionPixelSize)) - ((float) w) : (((float) rect.left) - this.f20395d) + ((float) dimensionPixelSize) + ((float) w);
    }

    /* renamed from: b0 */
    public void mo24407b0(@e83 int i) {
        this.f20388a.mo25039K(i);
        mo24425j0();
    }

    /* renamed from: c */
    public void mo24408c() {
        if (mo24380B()) {
            this.f20388a.mo25042a();
            mo24386H();
        }
    }

    /* renamed from: c0 */
    public void mo24409c0(@e83 int i) {
        this.f20388a.mo25040L(i);
        mo24425j0();
    }

    /* renamed from: d0 */
    public void mo24410d0(boolean z) {
        this.f20388a.mo25041M(z);
        mo24387I();
    }

    public void draw(@mr2 Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f20387a.draw(canvas);
            if (mo24380B()) {
                mo24413g(canvas);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo24412e0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != fd3.C2158h.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f20394c;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m27591f0(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(fd3.C2158h.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f20394c = new WeakReference<>(frameLayout);
                frameLayout.post(new C3517a(view, frameLayout));
            }
        }
    }

    /* renamed from: g */
    public final void mo24413g(Canvas canvas) {
        Rect rect = new Rect();
        String m = mo24429m();
        this.f20389a.mo47666e().getTextBounds(m, 0, m.length(), rect);
        canvas.drawText(m, this.f20385a, this.f20391b + ((float) (rect.height() / 2)), this.f20389a.mo47666e());
    }

    /* renamed from: g0 */
    public void mo24414g0(@mr2 View view) {
        mo24422i0(view, (FrameLayout) null);
    }

    public int getAlpha() {
        return this.f20388a.mo25046e();
    }

    public int getIntrinsicHeight() {
        return this.f20386a.height();
    }

    public int getIntrinsicWidth() {
        return this.f20386a.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int mo24419h() {
        return this.f20388a.mo25044c();
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo24420h0(@mr2 View view, @ts2 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            mo24422i0(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    @e83
    /* renamed from: i */
    public int mo24421i() {
        return this.f20388a.mo25045d();
    }

    /* renamed from: i0 */
    public void mo24422i0(@mr2 View view, @ts2 FrameLayout frameLayout) {
        this.f20392b = new WeakReference<>(view);
        boolean z = C3711ui.f21382a;
        if (!z || frameLayout != null) {
            this.f20394c = new WeakReference<>(frameLayout);
        } else {
            mo24412e0(view);
        }
        if (!z) {
            m27591f0(view);
        }
        mo24425j0();
        invalidateSelf();
    }

    public boolean isStateful() {
        return false;
    }

    @d10
    /* renamed from: j */
    public int mo24424j() {
        return this.f20387a.mo31646y().getDefaultColor();
    }

    /* renamed from: j0 */
    public final void mo24425j0() {
        Context context = (Context) this.f20390a.get();
        WeakReference<View> weakReference = this.f20392b;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f20386a);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f20394c;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C3711ui.f21382a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            mo24406b(context, rect2, view);
            C3711ui.m29368o(this.f20386a, this.f20385a, this.f20391b, this.f20395d, this.f20396e);
            this.f20387a.mo31619k0(this.f20393c);
            if (!rect.equals(this.f20386a)) {
                this.f20387a.setBounds(this.f20386a);
            }
        }
    }

    /* renamed from: k */
    public int mo24426k() {
        return this.f20388a.mo25048g();
    }

    /* renamed from: k0 */
    public final void mo24427k0() {
        this.f20397n = ((int) Math.pow(10.0d, ((double) mo24438t()) - 1.0d)) - 1;
    }

    @mr2
    /* renamed from: l */
    public Locale mo24428l() {
        return this.f20388a.mo25057p();
    }

    @mr2
    /* renamed from: m */
    public final String mo24429m() {
        if (mo24439u() <= this.f20397n) {
            return NumberFormat.getInstance(this.f20388a.mo25057p()).format((long) mo24439u());
        }
        Context context = (Context) this.f20390a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f20388a.mo25057p(), context.getString(fd3.C2163m.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f20397n), f20377b});
    }

    @d10
    /* renamed from: n */
    public int mo24430n() {
        return this.f20389a.mo47666e().getColor();
    }

    @ts2
    /* renamed from: o */
    public CharSequence mo24431o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo24380B()) {
            return this.f20388a.mo25051j();
        }
        if (this.f20388a.mo25052k() == 0 || (context = (Context) this.f20390a.get()) == null) {
            return null;
        }
        if (mo24439u() <= this.f20397n) {
            return context.getResources().getQuantityString(this.f20388a.mo25052k(), mo24439u(), new Object[]{Integer.valueOf(mo24439u())});
        }
        return context.getString(this.f20388a.mo25050i(), new Object[]{Integer.valueOf(this.f20397n)});
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @ts2
    /* renamed from: p */
    public FrameLayout mo24432p() {
        WeakReference<FrameLayout> weakReference = this.f20394c;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: q */
    public int mo24433q() {
        return this.f20388a.mo25054m();
    }

    @e83
    /* renamed from: r */
    public int mo24434r() {
        return this.f20388a.mo25053l();
    }

    @e83
    /* renamed from: s */
    public int mo24435s() {
        return this.f20388a.mo25054m();
    }

    public void setAlpha(int i) {
        this.f20388a.mo25065y(i);
        mo24381C();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public int mo24438t() {
        return this.f20388a.mo25055n();
    }

    /* renamed from: u */
    public int mo24439u() {
        if (mo24380B()) {
            return this.f20388a.mo25056o();
        }
        return 0;
    }

    @mr2
    /* renamed from: v */
    public C3632ti.C3633a mo24440v() {
        return this.f20388a.mo25058q();
    }

    /* renamed from: w */
    public final int mo24441w() {
        return (mo24380B() ? this.f20388a.mo25053l() : this.f20388a.mo25054m()) + this.f20388a.mo25044c();
    }

    /* renamed from: x */
    public final int mo24442x() {
        return (mo24380B() ? this.f20388a.mo25059r() : this.f20388a.mo25060s()) + this.f20388a.mo25045d();
    }

    /* renamed from: y */
    public int mo24443y() {
        return this.f20388a.mo25060s();
    }

    @e83
    /* renamed from: z */
    public int mo24444z() {
        return this.f20388a.mo25059r();
    }
}
