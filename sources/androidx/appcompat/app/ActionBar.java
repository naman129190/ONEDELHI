package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.C0657l;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {
    @Deprecated

    /* renamed from: a */
    public static final int f644a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f645b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f646c = 2;

    /* renamed from: d */
    public static final int f647d = 1;

    /* renamed from: e */
    public static final int f648e = 2;

    /* renamed from: f */
    public static final int f649f = 4;

    /* renamed from: g */
    public static final int f650g = 8;

    /* renamed from: h */
    public static final int f651h = 16;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f652a;

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f652a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f652a = i3;
        }

        public LayoutParams(@mr2 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f652a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.ActionBarLayout);
            this.f652a = obtainStyledAttributes.getInt(za3.C4068m.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f652a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f652a = 0;
            this.f652a = layoutParams.f652a;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public @interface C0159a {
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public @interface C0160b {
    }

    /* renamed from: androidx.appcompat.app.ActionBar$c */
    public interface C0161c {
        /* renamed from: a */
        void mo772a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$d */
    public interface C0162d {
        /* renamed from: a */
        boolean mo773a(int i, long j);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$e */
    public static abstract class C0163e {

        /* renamed from: a */
        public static final int f653a = -1;

        /* renamed from: a */
        public abstract CharSequence mo774a();

        /* renamed from: b */
        public abstract View mo775b();

        /* renamed from: c */
        public abstract Drawable mo776c();

        /* renamed from: d */
        public abstract int mo777d();

        /* renamed from: e */
        public abstract Object mo778e();

        /* renamed from: f */
        public abstract CharSequence mo779f();

        /* renamed from: g */
        public abstract void mo780g();

        /* renamed from: h */
        public abstract C0163e mo781h(@e54 int i);

        /* renamed from: i */
        public abstract C0163e mo782i(CharSequence charSequence);

        /* renamed from: j */
        public abstract C0163e mo783j(int i);

        /* renamed from: k */
        public abstract C0163e mo784k(View view);

        /* renamed from: l */
        public abstract C0163e mo785l(@dp0 int i);

        /* renamed from: m */
        public abstract C0163e mo786m(Drawable drawable);

        /* renamed from: n */
        public abstract C0163e mo787n(C0164f fVar);

        /* renamed from: o */
        public abstract C0163e mo788o(Object obj);

        /* renamed from: p */
        public abstract C0163e mo789p(int i);

        /* renamed from: q */
        public abstract C0163e mo790q(CharSequence charSequence);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$f */
    public interface C0164f {
        /* renamed from: a */
        void mo791a(C0163e eVar, C0657l lVar);

        /* renamed from: b */
        void mo792b(C0163e eVar, C0657l lVar);

        /* renamed from: c */
        void mo793c(C0163e eVar, C0657l lVar);
    }

    /* renamed from: A */
    public Context mo696A() {
        return null;
    }

    /* renamed from: A0 */
    public abstract void mo697A0(CharSequence charSequence);

    @ts2
    /* renamed from: B */
    public abstract CharSequence mo698B();

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: B0 */
    public void mo699B0(CharSequence charSequence) {
    }

    /* renamed from: C */
    public abstract void mo700C();

    /* renamed from: C0 */
    public abstract void mo701C0();

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: D */
    public boolean mo702D() {
        return false;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: D0 */
    public C3563t2 mo703D0(C3563t2.C3564a aVar) {
        return null;
    }

    /* renamed from: E */
    public boolean mo704E() {
        return false;
    }

    /* renamed from: F */
    public abstract boolean mo705F();

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: G */
    public boolean mo706G() {
        return false;
    }

    @Deprecated
    /* renamed from: H */
    public abstract C0163e mo707H();

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: I */
    public void mo708I(Configuration configuration) {
    }

    /* renamed from: J */
    public void mo709J() {
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: K */
    public boolean mo710K(int i, KeyEvent keyEvent) {
        return false;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: L */
    public boolean mo711L(KeyEvent keyEvent) {
        return false;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: M */
    public boolean mo712M() {
        return false;
    }

    @Deprecated
    /* renamed from: N */
    public abstract void mo713N();

    /* renamed from: O */
    public abstract void mo714O(C0161c cVar);

    @Deprecated
    /* renamed from: P */
    public abstract void mo715P(C0163e eVar);

    @Deprecated
    /* renamed from: Q */
    public abstract void mo716Q(int i);

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: R */
    public boolean mo717R() {
        return false;
    }

    @Deprecated
    /* renamed from: S */
    public abstract void mo718S(C0163e eVar);

    /* renamed from: T */
    public abstract void mo719T(@ts2 Drawable drawable);

    /* renamed from: U */
    public abstract void mo720U(int i);

    /* renamed from: V */
    public abstract void mo721V(View view);

    /* renamed from: W */
    public abstract void mo722W(View view, LayoutParams layoutParams);

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: X */
    public void mo723X(boolean z) {
    }

    /* renamed from: Y */
    public abstract void mo724Y(boolean z);

    /* renamed from: Z */
    public abstract void mo725Z(int i);

    /* renamed from: a0 */
    public abstract void mo726a0(int i, int i2);

    /* renamed from: b0 */
    public abstract void mo727b0(boolean z);

    /* renamed from: c0 */
    public abstract void mo728c0(boolean z);

    /* renamed from: d0 */
    public abstract void mo729d0(boolean z);

    /* renamed from: e0 */
    public abstract void mo730e0(boolean z);

    /* renamed from: f0 */
    public void mo731f0(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: g */
    public abstract void mo732g(C0161c cVar);

    /* renamed from: g0 */
    public void mo733g0(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: h */
    public abstract void mo734h(C0163e eVar);

    /* renamed from: h0 */
    public void mo735h0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: i */
    public abstract void mo736i(C0163e eVar, int i);

    /* renamed from: i0 */
    public void mo737i0(@e54 int i) {
    }

    @Deprecated
    /* renamed from: j */
    public abstract void mo738j(C0163e eVar, int i, boolean z);

    /* renamed from: j0 */
    public void mo739j0(@ts2 CharSequence charSequence) {
    }

    @Deprecated
    /* renamed from: k */
    public abstract void mo740k(C0163e eVar, boolean z);

    /* renamed from: k0 */
    public void mo741k0(@dp0 int i) {
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: l */
    public boolean mo742l() {
        return false;
    }

    /* renamed from: l0 */
    public void mo743l0(@ts2 Drawable drawable) {
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: m */
    public boolean mo744m() {
        return false;
    }

    /* renamed from: m0 */
    public void mo745m0(boolean z) {
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: n */
    public void mo746n(boolean z) {
    }

    /* renamed from: n0 */
    public abstract void mo747n0(@dp0 int i);

    /* renamed from: o */
    public abstract View mo748o();

    /* renamed from: o0 */
    public abstract void mo749o0(Drawable drawable);

    /* renamed from: p */
    public abstract int mo750p();

    @Deprecated
    /* renamed from: p0 */
    public abstract void mo751p0(SpinnerAdapter spinnerAdapter, C0162d dVar);

    /* renamed from: q */
    public float mo752q() {
        return 0.0f;
    }

    /* renamed from: q0 */
    public abstract void mo753q0(@dp0 int i);

    /* renamed from: r */
    public abstract int mo754r();

    /* renamed from: r0 */
    public abstract void mo755r0(Drawable drawable);

    /* renamed from: s */
    public int mo756s() {
        return 0;
    }

    @Deprecated
    /* renamed from: s0 */
    public abstract void mo757s0(int i);

    @Deprecated
    /* renamed from: t */
    public abstract int mo758t();

    @Deprecated
    /* renamed from: t0 */
    public abstract void mo759t0(int i);

    @Deprecated
    /* renamed from: u */
    public abstract int mo760u();

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: u0 */
    public void mo761u0(boolean z) {
    }

    @Deprecated
    /* renamed from: v */
    public abstract int mo762v();

    /* renamed from: v0 */
    public void mo763v0(Drawable drawable) {
    }

    @ts2
    @Deprecated
    /* renamed from: w */
    public abstract C0163e mo764w();

    /* renamed from: w0 */
    public void mo765w0(Drawable drawable) {
    }

    @ts2
    /* renamed from: x */
    public abstract CharSequence mo766x();

    /* renamed from: x0 */
    public abstract void mo767x0(int i);

    @Deprecated
    /* renamed from: y */
    public abstract C0163e mo768y(int i);

    /* renamed from: y0 */
    public abstract void mo769y0(CharSequence charSequence);

    @Deprecated
    /* renamed from: z */
    public abstract int mo770z();

    /* renamed from: z0 */
    public abstract void mo771z0(@e54 int i);
}
