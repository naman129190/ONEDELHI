package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C4030z1;
import com.onedelhi.secure.C7108vy;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.bq0;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.gc0;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jo1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju0;
import com.onedelhi.secure.kz2;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.mb4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.zq2;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.a */
public class C4258a extends LinearLayout {

    /* renamed from: a */
    public ColorStateList f24667a;

    /* renamed from: a */
    public PorterDuff.Mode f24668a;

    /* renamed from: a */
    public final TextWatcher f24669a = new C4259a();

    /* renamed from: a */
    public View.OnLongClickListener f24670a;
    @ts2

    /* renamed from: a */
    public final AccessibilityManager f24671a;

    /* renamed from: a */
    public EditText f24672a;
    @mr2

    /* renamed from: a */
    public final FrameLayout f24673a;
    @mr2

    /* renamed from: a */
    public final TextView f24674a;
    @mr2

    /* renamed from: a */
    public final CheckableImageButton f24675a;

    /* renamed from: a */
    public final TextInputLayout.C4254i f24676a;

    /* renamed from: a */
    public final TextInputLayout f24677a;

    /* renamed from: a */
    public final C4262d f24678a;
    @ts2

    /* renamed from: a */
    public C4030z1.C4035e f24679a;
    @ts2

    /* renamed from: a */
    public CharSequence f24680a;

    /* renamed from: a */
    public final LinkedHashSet<TextInputLayout.C4255j> f24681a = new LinkedHashSet<>();

    /* renamed from: b */
    public ColorStateList f24682b;

    /* renamed from: b */
    public PorterDuff.Mode f24683b;

    /* renamed from: b */
    public View.OnLongClickListener f24684b;
    @mr2

    /* renamed from: b */
    public final CheckableImageButton f24685b;

    /* renamed from: b */
    public boolean f24686b;

    /* renamed from: n */
    public int f24687n = 0;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class C4259a extends mb4 {
        public C4259a() {
        }

        public void afterTextChanged(Editable editable) {
            C4258a.this.mo29452o().mo31983a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4258a.this.mo29452o().mo38910b(charSequence, i, i2, i3);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class C4260b implements TextInputLayout.C4254i {
        public C4260b() {
        }

        /* renamed from: a */
        public void mo29395a(@mr2 TextInputLayout textInputLayout) {
            if (C4258a.this.f24672a != textInputLayout.getEditText()) {
                if (C4258a.this.f24672a != null) {
                    C4258a.this.f24672a.removeTextChangedListener(C4258a.this.f24669a);
                    if (C4258a.this.f24672a.getOnFocusChangeListener() == C4258a.this.mo29452o().mo31986e()) {
                        C4258a.this.f24672a.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = C4258a.this.f24672a = textInputLayout.getEditText();
                if (C4258a.this.f24672a != null) {
                    C4258a.this.f24672a.addTextChangedListener(C4258a.this.f24669a);
                }
                C4258a.this.mo29452o().mo31994n(C4258a.this.f24672a);
                C4258a aVar = C4258a.this;
                aVar.mo29439h0(aVar.mo29452o());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class C4261c implements View.OnAttachStateChangeListener {
        public C4261c() {
        }

        public void onViewAttachedToWindow(View view) {
            C4258a.this.mo29438h();
        }

        public void onViewDetachedFromWindow(View view) {
            C4258a.this.mo29418O();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public static class C4262d {

        /* renamed from: a */
        public final int f24691a;

        /* renamed from: a */
        public final SparseArray<ju0> f24692a = new SparseArray<>();

        /* renamed from: a */
        public final C4258a f24693a;

        /* renamed from: b */
        public final int f24694b;

        public C4262d(C4258a aVar, af4 af4) {
            this.f24693a = aVar;
            this.f24691a = af4.mo13050u(fd3.C2165o.TextInputLayout_endIconDrawable, 0);
            this.f24694b = af4.mo13050u(fd3.C2165o.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: b */
        public final ju0 mo29480b(int i) {
            if (i == -1) {
                return new gc0(this.f24693a);
            }
            if (i == 0) {
                return new zq2(this.f24693a);
            }
            if (i == 1) {
                return new kz2(this.f24693a, this.f24694b);
            }
            if (i == 2) {
                return new C7108vy(this.f24693a);
            }
            if (i == 3) {
                return new bq0(this.f24693a);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        /* renamed from: c */
        public ju0 mo29481c(int i) {
            ju0 ju0 = this.f24692a.get(i);
            if (ju0 != null) {
                return ju0;
            }
            ju0 b = mo29480b(i);
            this.f24692a.append(i, b);
            return b;
        }
    }

    public C4258a(TextInputLayout textInputLayout, af4 af4) {
        super(textInputLayout.getContext());
        C4260b bVar = new C4260b();
        this.f24676a = bVar;
        this.f24671a = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f24677a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f24673a = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton k = mo29444k(this, from, fd3.C2158h.text_input_error_icon);
        this.f24675a = k;
        CheckableImageButton k2 = mo29444k(frameLayout, from, fd3.C2158h.text_input_end_icon);
        this.f24685b = k2;
        this.f24678a = new C4262d(this, af4);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f24674a = appCompatTextView;
        mo29405B(af4);
        mo29404A(af4);
        mo29406C(af4);
        frameLayout.addView(k2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(k);
        textInputLayout.mo29254h(bVar);
        addOnAttachStateChangeListener(new C4261c());
    }

    /* renamed from: A */
    public final void mo29404A(af4 af4) {
        int i = fd3.C2165o.TextInputLayout_passwordToggleEnabled;
        if (!af4.mo13026C(i)) {
            int i2 = fd3.C2165o.TextInputLayout_endIconTint;
            if (af4.mo13026C(i2)) {
                this.f24682b = af2.m38611b(getContext(), af4, i2);
            }
            int i3 = fd3.C2165o.TextInputLayout_endIconTintMode;
            if (af4.mo13026C(i3)) {
                this.f24683b = pv4.m61673m(af4.mo13044o(i3, -1), (PorterDuff.Mode) null);
            }
        }
        int i4 = fd3.C2165o.TextInputLayout_endIconMode;
        if (af4.mo13026C(i4)) {
            mo29425V(af4.mo13044o(i4, 0));
            int i5 = fd3.C2165o.TextInputLayout_endIconContentDescription;
            if (af4.mo13026C(i5)) {
                mo29422S(af4.mo13053x(i5));
            }
            mo29420Q(af4.mo13030a(fd3.C2165o.TextInputLayout_endIconCheckable, true));
        } else if (af4.mo13026C(i)) {
            int i6 = fd3.C2165o.TextInputLayout_passwordToggleTint;
            if (af4.mo13026C(i6)) {
                this.f24682b = af2.m38611b(getContext(), af4, i6);
            }
            int i7 = fd3.C2165o.TextInputLayout_passwordToggleTintMode;
            if (af4.mo13026C(i7)) {
                this.f24683b = pv4.m61673m(af4.mo13044o(i7, -1), (PorterDuff.Mode) null);
            }
            mo29425V(af4.mo13030a(i, false) ? 1 : 0);
            mo29422S(af4.mo13053x(fd3.C2165o.TextInputLayout_passwordToggleContentDescription));
        }
    }

    /* renamed from: B */
    public final void mo29405B(af4 af4) {
        int i = fd3.C2165o.TextInputLayout_errorIconTint;
        if (af4.mo13026C(i)) {
            this.f24667a = af2.m38611b(getContext(), af4, i);
        }
        int i2 = fd3.C2165o.TextInputLayout_errorIconTintMode;
        if (af4.mo13026C(i2)) {
            this.f24668a = pv4.m61673m(af4.mo13044o(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = fd3.C2165o.TextInputLayout_errorIconDrawable;
        if (af4.mo13026C(i3)) {
            mo29432c0(af4.mo13037h(i3));
        }
        this.f24675a.setContentDescription(getResources().getText(fd3.C2163m.error_icon_content_description));
        jt4.m18906R1(this.f24675a, 2);
        this.f24675a.setClickable(false);
        this.f24675a.setPressable(false);
        this.f24675a.setFocusable(false);
    }

    /* renamed from: C */
    public final void mo29406C(af4 af4) {
        this.f24674a.setVisibility(8);
        this.f24674a.setId(fd3.C2158h.textinput_suffix_text);
        this.f24674a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        jt4.m18857D1(this.f24674a, 1);
        mo29457q0(af4.mo13050u(fd3.C2165o.TextInputLayout_suffixTextAppearance, 0));
        int i = fd3.C2165o.TextInputLayout_suffixTextColor;
        if (af4.mo13026C(i)) {
            mo29459r0(af4.mo13033d(i));
        }
        mo29455p0(af4.mo13053x(fd3.C2165o.TextInputLayout_suffixText));
    }

    /* renamed from: D */
    public boolean mo29407D() {
        return this.f24685b.mo28216a();
    }

    /* renamed from: E */
    public boolean mo29408E() {
        return mo29474z() && this.f24685b.isChecked();
    }

    /* renamed from: F */
    public boolean mo29409F() {
        return this.f24673a.getVisibility() == 0 && this.f24685b.getVisibility() == 0;
    }

    /* renamed from: G */
    public boolean mo29410G() {
        return this.f24675a.getVisibility() == 0;
    }

    /* renamed from: H */
    public boolean mo29411H() {
        return this.f24687n == 1;
    }

    /* renamed from: I */
    public void mo29412I(boolean z) {
        this.f24686b = z;
        mo29475z0();
    }

    /* renamed from: J */
    public void mo29413J() {
        mo29471x0();
        mo29415L();
        mo29414K();
        if (mo29452o().mo31998t()) {
            mo29465u0(this.f24677a.mo29282s0());
        }
    }

    /* renamed from: K */
    public void mo29414K() {
        jo1.m53680c(this.f24677a, this.f24685b, this.f24682b);
    }

    /* renamed from: L */
    public void mo29415L() {
        jo1.m53680c(this.f24677a, this.f24675a, this.f24667a);
    }

    /* renamed from: M */
    public void mo29416M(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        ju0 o = mo29452o();
        boolean z3 = true;
        if (!o.mo31992l() || (isChecked = this.f24685b.isChecked()) == o.mo31993m()) {
            z2 = false;
        } else {
            this.f24685b.setChecked(!isChecked);
            z2 = true;
        }
        if (!o.mo31990j() || (isActivated = this.f24685b.isActivated()) == o.mo31991k()) {
            z3 = z2;
        } else {
            mo29419P(!isActivated);
        }
        if (z || z3) {
            mo29414K();
        }
    }

    /* renamed from: N */
    public void mo29417N(@mr2 TextInputLayout.C4255j jVar) {
        this.f24681a.remove(jVar);
    }

    /* renamed from: O */
    public final void mo29418O() {
        AccessibilityManager accessibilityManager;
        C4030z1.C4035e eVar = this.f24679a;
        if (eVar != null && (accessibilityManager = this.f24671a) != null) {
            C4030z1.m32787g(accessibilityManager, eVar);
        }
    }

    /* renamed from: P */
    public void mo29419P(boolean z) {
        this.f24685b.setActivated(z);
    }

    /* renamed from: Q */
    public void mo29420Q(boolean z) {
        this.f24685b.setCheckable(z);
    }

    /* renamed from: R */
    public void mo29421R(@e54 int i) {
        mo29422S(i != 0 ? getResources().getText(i) : null);
    }

    /* renamed from: S */
    public void mo29422S(@ts2 CharSequence charSequence) {
        if (mo29450n() != charSequence) {
            this.f24685b.setContentDescription(charSequence);
        }
    }

    /* renamed from: T */
    public void mo29423T(@dp0 int i) {
        mo29424U(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    /* renamed from: U */
    public void mo29424U(@ts2 Drawable drawable) {
        this.f24685b.setImageDrawable(drawable);
        if (drawable != null) {
            jo1.m53678a(this.f24677a, this.f24685b, this.f24682b, this.f24683b);
            mo29414K();
        }
    }

    /* renamed from: V */
    public void mo29425V(int i) {
        if (this.f24687n != i) {
            mo29463t0(mo29452o());
            int i2 = this.f24687n;
            this.f24687n = i;
            mo29446l(i2);
            mo29430a0(i != 0);
            ju0 o = mo29452o();
            mo29423T(mo29462t(o));
            mo29421R(o.mo31984c());
            mo29420Q(o.mo31992l());
            if (o.mo31989i(this.f24677a.getBoxBackgroundMode())) {
                mo29461s0(o);
                mo29426W(o.mo31987f());
                EditText editText = this.f24672a;
                if (editText != null) {
                    o.mo31994n(editText);
                    mo29439h0(o);
                }
                jo1.m53678a(this.f24677a, this.f24685b, this.f24682b, this.f24683b);
                mo29416M(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f24677a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
    }

    /* renamed from: W */
    public void mo29426W(@ts2 View.OnClickListener onClickListener) {
        jo1.m53683f(this.f24685b, onClickListener, this.f24684b);
    }

    /* renamed from: X */
    public void mo29427X(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f24684b = onLongClickListener;
        jo1.m53684g(this.f24685b, onLongClickListener);
    }

    /* renamed from: Y */
    public void mo29428Y(@ts2 ColorStateList colorStateList) {
        if (this.f24682b != colorStateList) {
            this.f24682b = colorStateList;
            jo1.m53678a(this.f24677a, this.f24685b, colorStateList, this.f24683b);
        }
    }

    /* renamed from: Z */
    public void mo29429Z(@ts2 PorterDuff.Mode mode) {
        if (this.f24683b != mode) {
            this.f24683b = mode;
            jo1.m53678a(this.f24677a, this.f24685b, this.f24682b, mode);
        }
    }

    /* renamed from: a0 */
    public void mo29430a0(boolean z) {
        if (mo29409F() != z) {
            this.f24685b.setVisibility(z ? 0 : 8);
            mo29469w0();
            mo29473y0();
            this.f24677a.mo29158C0();
        }
    }

    /* renamed from: b0 */
    public void mo29431b0(@dp0 int i) {
        mo29432c0(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
        mo29415L();
    }

    /* renamed from: c0 */
    public void mo29432c0(@ts2 Drawable drawable) {
        this.f24675a.setImageDrawable(drawable);
        mo29471x0();
        jo1.m53678a(this.f24677a, this.f24675a, this.f24667a, this.f24668a);
    }

    /* renamed from: d0 */
    public void mo29433d0(@ts2 View.OnClickListener onClickListener) {
        jo1.m53683f(this.f24675a, onClickListener, this.f24670a);
    }

    /* renamed from: e0 */
    public void mo29434e0(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f24670a = onLongClickListener;
        jo1.m53684g(this.f24675a, onLongClickListener);
    }

    /* renamed from: f0 */
    public void mo29435f0(@ts2 ColorStateList colorStateList) {
        if (this.f24667a != colorStateList) {
            this.f24667a = colorStateList;
            jo1.m53678a(this.f24677a, this.f24675a, colorStateList, this.f24668a);
        }
    }

    /* renamed from: g */
    public void mo29436g(@mr2 TextInputLayout.C4255j jVar) {
        this.f24681a.add(jVar);
    }

    /* renamed from: g0 */
    public void mo29437g0(@ts2 PorterDuff.Mode mode) {
        if (this.f24668a != mode) {
            this.f24668a = mode;
            jo1.m53678a(this.f24677a, this.f24675a, this.f24667a, mode);
        }
    }

    /* renamed from: h */
    public final void mo29438h() {
        if (this.f24679a != null && this.f24671a != null && jt4.m18896O0(this)) {
            C4030z1.m32782b(this.f24671a, this.f24679a);
        }
    }

    /* renamed from: h0 */
    public final void mo29439h0(ju0 ju0) {
        if (this.f24672a != null) {
            if (ju0.mo31986e() != null) {
                this.f24672a.setOnFocusChangeListener(ju0.mo31986e());
            }
            if (ju0.mo38911g() != null) {
                this.f24685b.setOnFocusChangeListener(ju0.mo38911g());
            }
        }
    }

    /* renamed from: i */
    public void mo29440i() {
        this.f24685b.performClick();
        this.f24685b.jumpDrawablesToCurrentState();
    }

    /* renamed from: i0 */
    public void mo29441i0(@e54 int i) {
        mo29443j0(i != 0 ? getResources().getText(i) : null);
    }

    /* renamed from: j */
    public void mo29442j() {
        this.f24681a.clear();
    }

    /* renamed from: j0 */
    public void mo29443j0(@ts2 CharSequence charSequence) {
        this.f24685b.setContentDescription(charSequence);
    }

    /* renamed from: k */
    public final CheckableImageButton mo29444k(ViewGroup viewGroup, LayoutInflater layoutInflater, @mo1 int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(fd3.C2161k.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        jo1.m53681d(checkableImageButton);
        if (af2.m38618i(getContext())) {
            ld2.m20484h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: k0 */
    public void mo29445k0(@dp0 int i) {
        mo29447l0(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    /* renamed from: l */
    public final void mo29446l(int i) {
        Iterator it = this.f24681a.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.C4255j) it.next()).mo29396a(this.f24677a, i);
        }
    }

    /* renamed from: l0 */
    public void mo29447l0(@ts2 Drawable drawable) {
        this.f24685b.setImageDrawable(drawable);
    }

    @ts2
    /* renamed from: m */
    public CheckableImageButton mo29448m() {
        if (mo29410G()) {
            return this.f24675a;
        }
        if (!mo29474z() || !mo29409F()) {
            return null;
        }
        return this.f24685b;
    }

    /* renamed from: m0 */
    public void mo29449m0(boolean z) {
        if (z && this.f24687n != 1) {
            mo29425V(1);
        } else if (!z) {
            mo29425V(0);
        }
    }

    @ts2
    /* renamed from: n */
    public CharSequence mo29450n() {
        return this.f24685b.getContentDescription();
    }

    /* renamed from: n0 */
    public void mo29451n0(@ts2 ColorStateList colorStateList) {
        this.f24682b = colorStateList;
        jo1.m53678a(this.f24677a, this.f24685b, colorStateList, this.f24683b);
    }

    /* renamed from: o */
    public ju0 mo29452o() {
        return this.f24678a.mo29481c(this.f24687n);
    }

    /* renamed from: o0 */
    public void mo29453o0(@ts2 PorterDuff.Mode mode) {
        this.f24683b = mode;
        jo1.m53678a(this.f24677a, this.f24685b, this.f24682b, mode);
    }

    @ts2
    /* renamed from: p */
    public Drawable mo29454p() {
        return this.f24685b.getDrawable();
    }

    /* renamed from: p0 */
    public void mo29455p0(@ts2 CharSequence charSequence) {
        this.f24680a = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f24674a.setText(charSequence);
        mo29475z0();
    }

    /* renamed from: q */
    public int mo29456q() {
        return this.f24687n;
    }

    /* renamed from: q0 */
    public void mo29457q0(@e64 int i) {
        jb4.m18310E(this.f24674a, i);
    }

    /* renamed from: r */
    public CheckableImageButton mo29458r() {
        return this.f24685b;
    }

    /* renamed from: r0 */
    public void mo29459r0(@mr2 ColorStateList colorStateList) {
        this.f24674a.setTextColor(colorStateList);
    }

    /* renamed from: s */
    public Drawable mo29460s() {
        return this.f24675a.getDrawable();
    }

    /* renamed from: s0 */
    public final void mo29461s0(@mr2 ju0 ju0) {
        ju0.mo31997s();
        this.f24679a = ju0.mo31988h();
        mo29438h();
    }

    /* renamed from: t */
    public final int mo29462t(ju0 ju0) {
        int a = this.f24678a.f24691a;
        return a == 0 ? ju0.mo31985d() : a;
    }

    /* renamed from: t0 */
    public final void mo29463t0(@mr2 ju0 ju0) {
        mo29418O();
        this.f24679a = null;
        ju0.mo31999u();
    }

    @ts2
    /* renamed from: u */
    public CharSequence mo29464u() {
        return this.f24685b.getContentDescription();
    }

    /* renamed from: u0 */
    public final void mo29465u0(boolean z) {
        if (!z || mo29454p() == null) {
            jo1.m53678a(this.f24677a, this.f24685b, this.f24682b, this.f24683b);
            return;
        }
        Drawable mutate = wo0.m30989r(mo29454p()).mutate();
        wo0.m30985n(mutate, this.f24677a.getErrorCurrentTextColors());
        this.f24685b.setImageDrawable(mutate);
    }

    @ts2
    /* renamed from: v */
    public Drawable mo29466v() {
        return this.f24685b.getDrawable();
    }

    /* renamed from: v0 */
    public void mo29467v0(boolean z) {
        if (this.f24687n == 1) {
            this.f24685b.performClick();
            if (z) {
                this.f24685b.jumpDrawablesToCurrentState();
            }
        }
    }

    @ts2
    /* renamed from: w */
    public CharSequence mo29468w() {
        return this.f24680a;
    }

    /* renamed from: w0 */
    public final void mo29469w0() {
        int i = 8;
        this.f24673a.setVisibility((this.f24685b.getVisibility() != 0 || mo29410G()) ? 8 : 0);
        if (mo29409F() || mo29410G() || ((this.f24680a == null || this.f24686b) ? (char) 8 : 0) == 0) {
            i = 0;
        }
        setVisibility(i);
    }

    @ts2
    /* renamed from: x */
    public ColorStateList mo29470x() {
        return this.f24674a.getTextColors();
    }

    /* renamed from: x0 */
    public final void mo29471x0() {
        int i = 0;
        boolean z = mo29460s() != null && this.f24677a.mo29183S() && this.f24677a.mo29282s0();
        CheckableImageButton checkableImageButton = this.f24675a;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        mo29469w0();
        mo29473y0();
        if (!mo29474z()) {
            this.f24677a.mo29158C0();
        }
    }

    /* renamed from: y */
    public TextView mo29472y() {
        return this.f24674a;
    }

    /* renamed from: y0 */
    public void mo29473y0() {
        if (this.f24677a.f24607a != null) {
            jt4.m18946d2(this.f24674a, getContext().getResources().getDimensionPixelSize(fd3.C2156f.material_input_text_to_prefix_suffix_padding), this.f24677a.f24607a.getPaddingTop(), (mo29409F() || mo29410G()) ? 0 : jt4.m18968j0(this.f24677a.f24607a), this.f24677a.f24607a.getPaddingBottom());
        }
    }

    /* renamed from: z */
    public boolean mo29474z() {
        return this.f24687n != 0;
    }

    /* renamed from: z0 */
    public final void mo29475z0() {
        int visibility = this.f24674a.getVisibility();
        boolean z = false;
        int i = (this.f24680a == null || this.f24686b) ? 8 : 0;
        if (visibility != i) {
            ju0 o = mo29452o();
            if (i == 0) {
                z = true;
            }
            o.mo38912q(z);
        }
        mo29469w0();
        this.f24674a.setVisibility(i);
        this.f24677a.mo29158C0();
    }
}
