package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.fd3;

@SuppressLint({"ViewConstructor"})
public class s24 extends LinearLayout {

    /* renamed from: a */
    public ColorStateList f34897a;

    /* renamed from: a */
    public PorterDuff.Mode f34898a;

    /* renamed from: a */
    public View.OnLongClickListener f34899a;

    /* renamed from: a */
    public final TextView f34900a;

    /* renamed from: a */
    public final CheckableImageButton f34901a;

    /* renamed from: a */
    public final TextInputLayout f34902a;
    @ts2

    /* renamed from: a */
    public CharSequence f34903a;

    /* renamed from: b */
    public boolean f34904b;

    public s24(TextInputLayout textInputLayout, af4 af4) {
        super(textInputLayout.getContext());
        this.f34902a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, ri1.f19869b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(fd3.C2161k.design_text_input_start_icon, this, false);
        this.f34901a = checkableImageButton;
        jo1.m53681d(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f34900a = appCompatTextView;
        mo44164g(af4);
        mo44163f(af4);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    @ts2
    /* renamed from: a */
    public CharSequence mo44158a() {
        return this.f34903a;
    }

    @ts2
    /* renamed from: b */
    public ColorStateList mo44159b() {
        return this.f34900a.getTextColors();
    }

    @mr2
    /* renamed from: c */
    public TextView mo44160c() {
        return this.f34900a;
    }

    @ts2
    /* renamed from: d */
    public CharSequence mo44161d() {
        return this.f34901a.getContentDescription();
    }

    @ts2
    /* renamed from: e */
    public Drawable mo44162e() {
        return this.f34901a.getDrawable();
    }

    /* renamed from: f */
    public final void mo44163f(af4 af4) {
        this.f34900a.setVisibility(8);
        this.f34900a.setId(fd3.C2158h.textinput_prefix_text);
        this.f34900a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        jt4.m18857D1(this.f34900a, 1);
        mo44170m(af4.mo13050u(fd3.C2165o.TextInputLayout_prefixTextAppearance, 0));
        int i = fd3.C2165o.TextInputLayout_prefixTextColor;
        if (af4.mo13026C(i)) {
            mo44171n(af4.mo13033d(i));
        }
        mo44169l(af4.mo13053x(fd3.C2165o.TextInputLayout_prefixText));
    }

    /* renamed from: g */
    public final void mo44164g(af4 af4) {
        if (af2.m38618i(getContext())) {
            ld2.m20483g((ViewGroup.MarginLayoutParams) this.f34901a.getLayoutParams(), 0);
        }
        mo44176r((View.OnClickListener) null);
        mo44177s((View.OnLongClickListener) null);
        int i = fd3.C2165o.TextInputLayout_startIconTint;
        if (af4.mo13026C(i)) {
            this.f34897a = af2.m38611b(getContext(), af4, i);
        }
        int i2 = fd3.C2165o.TextInputLayout_startIconTintMode;
        if (af4.mo13026C(i2)) {
            this.f34898a = pv4.m61673m(af4.mo13044o(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = fd3.C2165o.TextInputLayout_startIconDrawable;
        if (af4.mo13026C(i3)) {
            mo44175q(af4.mo13037h(i3));
            int i4 = fd3.C2165o.TextInputLayout_startIconContentDescription;
            if (af4.mo13026C(i4)) {
                mo44174p(af4.mo13053x(i4));
            }
            mo44172o(af4.mo13030a(fd3.C2165o.TextInputLayout_startIconCheckable, true));
        }
    }

    /* renamed from: h */
    public boolean mo44165h() {
        return this.f34901a.mo28216a();
    }

    /* renamed from: i */
    public boolean mo44166i() {
        return this.f34901a.getVisibility() == 0;
    }

    /* renamed from: j */
    public void mo44167j(boolean z) {
        this.f34904b = z;
        mo44183y();
    }

    /* renamed from: k */
    public void mo44168k() {
        jo1.m53680c(this.f34902a, this.f34901a, this.f34897a);
    }

    /* renamed from: l */
    public void mo44169l(@ts2 CharSequence charSequence) {
        this.f34903a = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f34900a.setText(charSequence);
        mo44183y();
    }

    /* renamed from: m */
    public void mo44170m(@e64 int i) {
        jb4.m18310E(this.f34900a, i);
    }

    /* renamed from: n */
    public void mo44171n(@mr2 ColorStateList colorStateList) {
        this.f34900a.setTextColor(colorStateList);
    }

    /* renamed from: o */
    public void mo44172o(boolean z) {
        this.f34901a.setCheckable(z);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo44182x();
    }

    /* renamed from: p */
    public void mo44174p(@ts2 CharSequence charSequence) {
        if (mo44161d() != charSequence) {
            this.f34901a.setContentDescription(charSequence);
        }
    }

    /* renamed from: q */
    public void mo44175q(@ts2 Drawable drawable) {
        this.f34901a.setImageDrawable(drawable);
        if (drawable != null) {
            jo1.m53678a(this.f34902a, this.f34901a, this.f34897a, this.f34898a);
            mo44180v(true);
            mo44168k();
            return;
        }
        mo44180v(false);
        mo44176r((View.OnClickListener) null);
        mo44177s((View.OnLongClickListener) null);
        mo44174p((CharSequence) null);
    }

    /* renamed from: r */
    public void mo44176r(@ts2 View.OnClickListener onClickListener) {
        jo1.m53683f(this.f34901a, onClickListener, this.f34899a);
    }

    /* renamed from: s */
    public void mo44177s(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f34899a = onLongClickListener;
        jo1.m53684g(this.f34901a, onLongClickListener);
    }

    /* renamed from: t */
    public void mo44178t(@ts2 ColorStateList colorStateList) {
        if (this.f34897a != colorStateList) {
            this.f34897a = colorStateList;
            jo1.m53678a(this.f34902a, this.f34901a, colorStateList, this.f34898a);
        }
    }

    /* renamed from: u */
    public void mo44179u(@ts2 PorterDuff.Mode mode) {
        if (this.f34898a != mode) {
            this.f34898a = mode;
            jo1.m53678a(this.f34902a, this.f34901a, this.f34897a, mode);
        }
    }

    /* renamed from: v */
    public void mo44180v(boolean z) {
        if (mo44166i() != z) {
            this.f34901a.setVisibility(z ? 0 : 8);
            mo44182x();
            mo44183y();
        }
    }

    /* renamed from: w */
    public void mo44181w(@mr2 C1638a2 a2Var) {
        View view;
        if (this.f34900a.getVisibility() == 0) {
            a2Var.mo12601o1(this.f34900a);
            view = this.f34900a;
        } else {
            view = this.f34901a;
        }
        a2Var.mo12531Q1(view);
    }

    /* renamed from: x */
    public void mo44182x() {
        EditText editText = this.f34902a.f24607a;
        if (editText != null) {
            jt4.m18946d2(this.f34900a, mo44166i() ? 0 : jt4.m18972k0(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(fd3.C2156f.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* renamed from: y */
    public final void mo44183y() {
        int i = 8;
        int i2 = (this.f34903a == null || this.f34904b) ? 8 : 0;
        if (this.f34901a.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.f34900a.setVisibility(i2);
        this.f34902a.mo29158C0();
    }
}
