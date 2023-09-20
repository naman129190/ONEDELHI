package com.onedelhi.secure;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0189c;
import com.onedelhi.secure.fd3;

public class ge2 extends C0189c.C0190a {
    @C3982yb

    /* renamed from: b */
    public static final int f12523b = fd3.C2153c.alertDialogStyle;
    @e64

    /* renamed from: c */
    public static final int f12524c = fd3.C2164n.MaterialAlertDialog_MaterialComponents;
    @C3982yb

    /* renamed from: d */
    public static final int f12525d = fd3.C2153c.materialAlertDialogTheme;
    @mr2
    @zk0

    /* renamed from: a */
    public final Rect f12526a;
    @ts2

    /* renamed from: a */
    public Drawable f12527a;

    public ge2(@mr2 Context context) {
        this(context, 0);
    }

    public ge2(@mr2 Context context, int i) {
        super(m15714P(context), m15716S(context, i));
        Context b = mo942b();
        Resources.Theme theme = b.getTheme();
        int i2 = f12523b;
        int i3 = f12524c;
        this.f12526a = se2.m27488a(b, i2, i3);
        int c = oe2.m23717c(b, fd3.C2153c.colorSurface, getClass().getCanonicalName());
        bf2 bf2 = new bf2(b, (AttributeSet) null, i2, i3);
        bf2.mo31599Z(b);
        bf2.mo31626o0(ColorStateList.valueOf(c));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(mo942b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                bf2.mo31619k0(dimension);
            }
        }
        this.f12527a = bf2;
    }

    /* renamed from: P */
    public static Context m15714P(@mr2 Context context) {
        int R = m15715R(context);
        Context c = hf2.m50488c(context, (AttributeSet) null, f12523b, f12524c);
        return R == 0 ? c : new z70(c, R);
    }

    /* renamed from: R */
    public static int m15715R(@mr2 Context context) {
        TypedValue a = je2.m53272a(context, f12525d);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    /* renamed from: S */
    public static int m15716S(@mr2 Context context, int i) {
        return i == 0 ? m15715R(context) : i;
    }

    @mr2
    /* renamed from: A0 */
    public ge2 mo932G(@ts2 Cursor cursor, int i, @mr2 String str, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo932G(cursor, i, str, onClickListener);
    }

    @mr2
    /* renamed from: B0 */
    public ge2 mo933H(@ts2 ListAdapter listAdapter, int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo933H(listAdapter, i, onClickListener);
    }

    @mr2
    /* renamed from: C0 */
    public ge2 mo934I(@ts2 CharSequence[] charSequenceArr, int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo934I(charSequenceArr, i, onClickListener);
    }

    @mr2
    /* renamed from: D0 */
    public ge2 mo935J(@e54 int i) {
        return (ge2) super.mo935J(i);
    }

    @mr2
    /* renamed from: E0 */
    public ge2 mo936K(@ts2 CharSequence charSequence) {
        return (ge2) super.mo936K(charSequence);
    }

    @mr2
    /* renamed from: F0 */
    public ge2 mo937L(int i) {
        return (ge2) super.mo937L(i);
    }

    @mr2
    /* renamed from: G0 */
    public ge2 mo938M(@ts2 View view) {
        return (ge2) super.mo938M(view);
    }

    @ts2
    /* renamed from: Q */
    public Drawable mo16516Q() {
        return this.f12527a;
    }

    @mr2
    /* renamed from: T */
    public ge2 mo943c(@ts2 ListAdapter listAdapter, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo943c(listAdapter, onClickListener);
    }

    @mr2
    /* renamed from: U */
    public ge2 mo16518U(@ts2 Drawable drawable) {
        this.f12527a = drawable;
        return this;
    }

    @mr2
    /* renamed from: V */
    public ge2 mo16519V(@e83 int i) {
        this.f12526a.bottom = i;
        return this;
    }

    @mr2
    /* renamed from: W */
    public ge2 mo16520W(@e83 int i) {
        if (mo942b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f12526a.left = i;
        } else {
            this.f12526a.right = i;
        }
        return this;
    }

    @mr2
    /* renamed from: X */
    public ge2 mo16521X(@e83 int i) {
        if (mo942b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f12526a.right = i;
        } else {
            this.f12526a.left = i;
        }
        return this;
    }

    @mr2
    /* renamed from: Y */
    public ge2 mo16522Y(@e83 int i) {
        this.f12526a.top = i;
        return this;
    }

    @mr2
    /* renamed from: Z */
    public ge2 mo944d(boolean z) {
        return (ge2) super.mo944d(z);
    }

    @mr2
    /* renamed from: a */
    public C0189c mo941a() {
        C0189c a = super.mo941a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f12527a;
        if (drawable instanceof bf2) {
            ((bf2) drawable).mo31624n0(jt4.m18904R(decorView));
        }
        window.setBackgroundDrawable(se2.m27489b(this.f12527a, this.f12526a));
        decorView.setOnTouchListener(new fr1(a, this.f12526a));
        return a;
    }

    @mr2
    /* renamed from: a0 */
    public ge2 mo945e(@ts2 Cursor cursor, @ts2 DialogInterface.OnClickListener onClickListener, @mr2 String str) {
        return (ge2) super.mo945e(cursor, onClickListener, str);
    }

    @mr2
    /* renamed from: b0 */
    public ge2 mo946f(@ts2 View view) {
        return (ge2) super.mo946f(view);
    }

    @mr2
    /* renamed from: c0 */
    public ge2 mo947g(@dp0 int i) {
        return (ge2) super.mo947g(i);
    }

    @mr2
    /* renamed from: d0 */
    public ge2 mo948h(@ts2 Drawable drawable) {
        return (ge2) super.mo948h(drawable);
    }

    @mr2
    /* renamed from: e0 */
    public ge2 mo949i(@C3982yb int i) {
        return (ge2) super.mo949i(i);
    }

    @mr2
    /* renamed from: f0 */
    public ge2 mo951k(@C3483sa int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo951k(i, onClickListener);
    }

    @mr2
    /* renamed from: g0 */
    public ge2 mo952l(@ts2 CharSequence[] charSequenceArr, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo952l(charSequenceArr, onClickListener);
    }

    @mr2
    /* renamed from: h0 */
    public ge2 mo953m(@e54 int i) {
        return (ge2) super.mo953m(i);
    }

    @mr2
    /* renamed from: i0 */
    public ge2 mo954n(@ts2 CharSequence charSequence) {
        return (ge2) super.mo954n(charSequence);
    }

    @mr2
    /* renamed from: j0 */
    public ge2 mo955o(@C3483sa int i, @ts2 boolean[] zArr, @ts2 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ge2) super.mo955o(i, zArr, onMultiChoiceClickListener);
    }

    @mr2
    /* renamed from: k0 */
    public ge2 mo956p(@ts2 Cursor cursor, @mr2 String str, @mr2 String str2, @ts2 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ge2) super.mo956p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @mr2
    /* renamed from: l0 */
    public ge2 mo957q(@ts2 CharSequence[] charSequenceArr, @ts2 boolean[] zArr, @ts2 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (ge2) super.mo957q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @mr2
    /* renamed from: m0 */
    public ge2 mo958r(@e54 int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo958r(i, onClickListener);
    }

    @mr2
    /* renamed from: n0 */
    public ge2 mo959s(@ts2 CharSequence charSequence, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo959s(charSequence, onClickListener);
    }

    @mr2
    /* renamed from: o0 */
    public ge2 mo960t(@ts2 Drawable drawable) {
        return (ge2) super.mo960t(drawable);
    }

    @mr2
    /* renamed from: p0 */
    public ge2 mo961u(@e54 int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo961u(i, onClickListener);
    }

    @mr2
    /* renamed from: q0 */
    public ge2 mo962v(@ts2 CharSequence charSequence, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo962v(charSequence, onClickListener);
    }

    @mr2
    /* renamed from: r0 */
    public ge2 mo963w(@ts2 Drawable drawable) {
        return (ge2) super.mo963w(drawable);
    }

    @mr2
    /* renamed from: s0 */
    public ge2 mo964x(@ts2 DialogInterface.OnCancelListener onCancelListener) {
        return (ge2) super.mo964x(onCancelListener);
    }

    @mr2
    /* renamed from: t0 */
    public ge2 mo965y(@ts2 DialogInterface.OnDismissListener onDismissListener) {
        return (ge2) super.mo965y(onDismissListener);
    }

    @mr2
    /* renamed from: u0 */
    public ge2 mo966z(@ts2 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (ge2) super.mo966z(onItemSelectedListener);
    }

    @mr2
    /* renamed from: v0 */
    public ge2 mo926A(@ts2 DialogInterface.OnKeyListener onKeyListener) {
        return (ge2) super.mo926A(onKeyListener);
    }

    @mr2
    /* renamed from: w0 */
    public ge2 mo927B(@e54 int i, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo927B(i, onClickListener);
    }

    @mr2
    /* renamed from: x0 */
    public ge2 mo928C(@ts2 CharSequence charSequence, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo928C(charSequence, onClickListener);
    }

    @mr2
    /* renamed from: y0 */
    public ge2 mo929D(@ts2 Drawable drawable) {
        return (ge2) super.mo929D(drawable);
    }

    @mr2
    /* renamed from: z0 */
    public ge2 mo931F(@C3483sa int i, int i2, @ts2 DialogInterface.OnClickListener onClickListener) {
        return (ge2) super.mo931F(i, i2, onClickListener);
    }
}
