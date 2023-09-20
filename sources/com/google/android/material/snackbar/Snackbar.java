package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n70;
import com.onedelhi.secure.q04;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zk0;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: b */
    public static final int[] f24399b;

    /* renamed from: c */
    public static final int[] f24400c;
    @ts2

    /* renamed from: a */
    public BaseTransientBottomBar.C4212s<Snackbar> f24401a;
    @ts2

    /* renamed from: b */
    public final AccessibilityManager f24402b;

    /* renamed from: e */
    public boolean f24403e;

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(@ts2 Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@ts2 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(@ts2 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(@ts2 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public static class C4217a extends BaseTransientBottomBar.C4212s<Snackbar> {

        /* renamed from: f */
        public static final int f24404f = 0;

        /* renamed from: g */
        public static final int f24405g = 1;

        /* renamed from: h */
        public static final int f24406h = 2;

        /* renamed from: i */
        public static final int f24407i = 3;

        /* renamed from: j */
        public static final int f24408j = 4;

        /* renamed from: c */
        public void mo28890a(Snackbar snackbar, int i) {
        }

        /* renamed from: d */
        public void mo28891b(Snackbar snackbar) {
        }
    }

    static {
        int i = fd3.C2153c.snackbarButtonStyle;
        f24399b = new int[]{i};
        f24400c = new int[]{i, fd3.C2153c.snackbarTextViewStyle};
    }

    public Snackbar(@mr2 Context context, @mr2 ViewGroup viewGroup, @mr2 View view, @mr2 n70 n70) {
        super(context, viewGroup, view, n70);
        this.f24402b = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @mr2
    /* renamed from: A0 */
    public static Snackbar m33970A0(@mr2 Context context, @mr2 View view, @mr2 CharSequence charSequence, int i) {
        return m33973D0(context, view, charSequence, i);
    }

    @mr2
    /* renamed from: B0 */
    public static Snackbar m33971B0(@mr2 View view, @e54 int i, int i2) {
        return m33972C0(view, view.getResources().getText(i), i2);
    }

    @mr2
    /* renamed from: C0 */
    public static Snackbar m33972C0(@mr2 View view, @mr2 CharSequence charSequence, int i) {
        return m33973D0((Context) null, view, charSequence, i);
    }

    @mr2
    /* renamed from: D0 */
    public static Snackbar m33973D0(@ts2 Context context, @mr2 View view, @mr2 CharSequence charSequence, int i) {
        ViewGroup t0 = m33975t0(view);
        if (t0 != null) {
            if (context == null) {
                context = t0.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m33977y0(context) ? fd3.C2161k.mtrl_layout_snackbar_include : fd3.C2161k.design_layout_snackbar_include, t0, false);
            Snackbar snackbar = new Snackbar(context, t0, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo28905O0(charSequence);
            snackbar.mo28827f0(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @ts2
    /* renamed from: t0 */
    public static ViewGroup m33975t0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    /* renamed from: x0 */
    public static boolean m33976x0(@mr2 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24399b);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: y0 */
    public static boolean m33977y0(@mr2 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24400c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m33978z0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        mo28845y(1);
    }

    /* renamed from: E */
    public int mo28800E() {
        int E = super.mo28800E();
        if (E == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f24402b.getRecommendedTimeoutMillis(E, (this.f24403e ? 4 : 0) | 1 | 2);
        } else if (!this.f24403e || !this.f24402b.isTouchExplorationEnabled()) {
            return E;
        } else {
            return -2;
        }
    }

    @mr2
    /* renamed from: E0 */
    public Snackbar mo28895E0(@e54 int i, View.OnClickListener onClickListener) {
        return mo28896F0(mo28799D().getText(i), onClickListener);
    }

    @mr2
    /* renamed from: F0 */
    public Snackbar mo28896F0(@ts2 CharSequence charSequence, @ts2 View.OnClickListener onClickListener) {
        Button u0 = mo28909u0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            u0.setVisibility(8);
            u0.setOnClickListener((View.OnClickListener) null);
            this.f24403e = false;
        } else {
            this.f24403e = true;
            u0.setVisibility(0);
            u0.setText(charSequence);
            u0.setOnClickListener(new q04(this, onClickListener));
        }
        return this;
    }

    @mr2
    /* renamed from: G0 */
    public Snackbar mo28897G0(@d10 int i) {
        mo28909u0().setTextColor(i);
        return this;
    }

    @mr2
    /* renamed from: H0 */
    public Snackbar mo28898H0(ColorStateList colorStateList) {
        mo28909u0().setTextColor(colorStateList);
        return this;
    }

    @mr2
    /* renamed from: I0 */
    public Snackbar mo28899I0(@d10 int i) {
        return mo28900J0(ColorStateList.valueOf(i));
    }

    @mr2
    /* renamed from: J0 */
    public Snackbar mo28900J0(@ts2 ColorStateList colorStateList) {
        this.f24344a.setBackgroundTintList(colorStateList);
        return this;
    }

    @mr2
    /* renamed from: K0 */
    public Snackbar mo28901K0(@ts2 PorterDuff.Mode mode) {
        this.f24344a.setBackgroundTintMode(mode);
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: L0 */
    public Snackbar mo28902L0(@ts2 C4217a aVar) {
        BaseTransientBottomBar.C4212s<Snackbar> sVar = this.f24401a;
        if (sVar != null) {
            mo28821Z(sVar);
        }
        if (aVar != null) {
            mo28839r(aVar);
        }
        this.f24401a = aVar;
        return this;
    }

    @mr2
    /* renamed from: M0 */
    public Snackbar mo28903M0(@zk0 int i) {
        mo28910v0().setMaxInlineActionWidth(i);
        return this;
    }

    @mr2
    /* renamed from: N0 */
    public Snackbar mo28904N0(@e54 int i) {
        return mo28905O0(mo28799D().getText(i));
    }

    @mr2
    /* renamed from: O0 */
    public Snackbar mo28905O0(@mr2 CharSequence charSequence) {
        mo28911w0().setText(charSequence);
        return this;
    }

    @mr2
    /* renamed from: P0 */
    public Snackbar mo28906P0(@d10 int i) {
        mo28911w0().setTextColor(i);
        return this;
    }

    /* renamed from: Q */
    public boolean mo28812Q() {
        return super.mo28812Q();
    }

    @mr2
    /* renamed from: Q0 */
    public Snackbar mo28907Q0(ColorStateList colorStateList) {
        mo28911w0().setTextColor(colorStateList);
        return this;
    }

    @mr2
    /* renamed from: R0 */
    public Snackbar mo28908R0(int i) {
        mo28911w0().setMaxLines(i);
        return this;
    }

    /* renamed from: k0 */
    public void mo28832k0() {
        super.mo28832k0();
    }

    /* renamed from: u0 */
    public final Button mo28909u0() {
        return mo28910v0().getActionView();
    }

    /* renamed from: v0 */
    public final SnackbarContentLayout mo28910v0() {
        return (SnackbarContentLayout) this.f24344a.getChildAt(0);
    }

    /* renamed from: w0 */
    public final TextView mo28911w0() {
        return mo28910v0().getMessageView();
    }

    /* renamed from: x */
    public void mo28844x() {
        super.mo28844x();
    }
}
