package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.fd3;
import java.util.ArrayList;
import java.util.List;

public final class gq1 {

    /* renamed from: f */
    public static final int f29259f = 217;

    /* renamed from: g */
    public static final int f29260g = 167;

    /* renamed from: h */
    public static final int f29261h = 0;

    /* renamed from: i */
    public static final int f29262i = 1;

    /* renamed from: j */
    public static final int f29263j = 2;

    /* renamed from: k */
    public static final int f29264k = 0;

    /* renamed from: l */
    public static final int f29265l = 1;

    /* renamed from: m */
    public static final int f29266m = 2;

    /* renamed from: a */
    public final float f29267a;

    /* renamed from: a */
    public int f29268a;
    @ts2

    /* renamed from: a */
    public Animator f29269a;

    /* renamed from: a */
    public final Context f29270a;
    @ts2

    /* renamed from: a */
    public ColorStateList f29271a;

    /* renamed from: a */
    public Typeface f29272a;

    /* renamed from: a */
    public FrameLayout f29273a;

    /* renamed from: a */
    public LinearLayout f29274a;
    @ts2

    /* renamed from: a */
    public TextView f29275a;
    @mr2

    /* renamed from: a */
    public final TextInputLayout f29276a;
    @ts2

    /* renamed from: a */
    public CharSequence f29277a;

    /* renamed from: a */
    public boolean f29278a;

    /* renamed from: b */
    public int f29279b;
    @ts2

    /* renamed from: b */
    public ColorStateList f29280b;
    @ts2

    /* renamed from: b */
    public TextView f29281b;
    @ts2

    /* renamed from: b */
    public CharSequence f29282b;

    /* renamed from: b */
    public boolean f29283b;

    /* renamed from: c */
    public int f29284c;

    /* renamed from: c */
    public CharSequence f29285c;

    /* renamed from: d */
    public int f29286d;

    /* renamed from: e */
    public int f29287e;

    /* renamed from: com.onedelhi.secure.gq1$a */
    public class C5443a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f29288a;

        /* renamed from: a */
        public final /* synthetic */ TextView f29289a;

        /* renamed from: b */
        public final /* synthetic */ int f29291b;

        /* renamed from: b */
        public final /* synthetic */ TextView f29292b;

        public C5443a(int i, TextView textView, int i2, TextView textView2) {
            this.f29288a = i;
            this.f29289a = textView;
            this.f29291b = i2;
            this.f29292b = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = gq1.this.f29279b = this.f29288a;
            Animator unused2 = gq1.this.f29269a = null;
            TextView textView = this.f29289a;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f29291b == 1 && gq1.this.f29275a != null) {
                    gq1.this.f29275a.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f29292b;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f29292b.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f29292b;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.gq1$b */
    public class C5444b extends View.AccessibilityDelegate {
        public C5444b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = gq1.this.f29276a.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public gq1(@mr2 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f29270a = context;
        this.f29276a = textInputLayout;
        this.f29267a = (float) context.getResources().getDimensionPixelSize(fd3.C2156f.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    public void mo36818A() {
        mo36843h();
        int i = this.f29279b;
        if (i == 2) {
            this.f29284c = 0;
        }
        mo36839V(i, this.f29284c, mo36836S(this.f29281b, ""));
    }

    /* renamed from: B */
    public final boolean mo36819B(int i) {
        return i == 1 && this.f29275a != null && !TextUtils.isEmpty(this.f29277a);
    }

    /* renamed from: C */
    public final boolean mo36820C(int i) {
        return i == 2 && this.f29281b != null && !TextUtils.isEmpty(this.f29285c);
    }

    /* renamed from: D */
    public boolean mo36821D(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: E */
    public boolean mo36822E() {
        return this.f29278a;
    }

    /* renamed from: F */
    public boolean mo36823F() {
        return this.f29283b;
    }

    /* renamed from: G */
    public void mo36824G(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f29274a != null) {
            if (!mo36821D(i) || (frameLayout = this.f29273a) == null) {
                this.f29274a.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f29268a - 1;
            this.f29268a = i2;
            mo36835R(this.f29274a, i2);
        }
    }

    /* renamed from: H */
    public final void mo36825H(int i, int i2) {
        TextView n;
        TextView n2;
        if (i != i2) {
            if (!(i2 == 0 || (n2 = mo36849n(i2)) == null)) {
                n2.setVisibility(0);
                n2.setAlpha(1.0f);
            }
            if (!(i == 0 || (n = mo36849n(i)) == null)) {
                n.setVisibility(4);
                if (i == 1) {
                    n.setText((CharSequence) null);
                }
            }
            this.f29279b = i2;
        }
    }

    /* renamed from: I */
    public void mo36826I(@ts2 CharSequence charSequence) {
        this.f29282b = charSequence;
        TextView textView = this.f29275a;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: J */
    public void mo36827J(boolean z) {
        if (this.f29278a != z) {
            mo36843h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f29270a);
                this.f29275a = appCompatTextView;
                appCompatTextView.setId(fd3.C2158h.textinput_error);
                this.f29275a.setTextAlignment(5);
                Typeface typeface = this.f29272a;
                if (typeface != null) {
                    this.f29275a.setTypeface(typeface);
                }
                mo36828K(this.f29286d);
                mo36829L(this.f29271a);
                mo36826I(this.f29282b);
                this.f29275a.setVisibility(4);
                jt4.m18857D1(this.f29275a, 1);
                mo36840e(this.f29275a, 0);
            } else {
                mo36861z();
                mo36824G(this.f29275a, 0);
                this.f29275a = null;
                this.f29276a.mo29160D0();
                this.f29276a.mo29178N0();
            }
            this.f29278a = z;
        }
    }

    /* renamed from: K */
    public void mo36828K(@e64 int i) {
        this.f29286d = i;
        TextView textView = this.f29275a;
        if (textView != null) {
            this.f29276a.mo29280r0(textView, i);
        }
    }

    /* renamed from: L */
    public void mo36829L(@ts2 ColorStateList colorStateList) {
        this.f29271a = colorStateList;
        TextView textView = this.f29275a;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: M */
    public void mo36830M(@e64 int i) {
        this.f29287e = i;
        TextView textView = this.f29281b;
        if (textView != null) {
            jb4.m18310E(textView, i);
        }
    }

    /* renamed from: N */
    public void mo36831N(boolean z) {
        if (this.f29283b != z) {
            mo36843h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f29270a);
                this.f29281b = appCompatTextView;
                appCompatTextView.setId(fd3.C2158h.textinput_helper_text);
                this.f29281b.setTextAlignment(5);
                Typeface typeface = this.f29272a;
                if (typeface != null) {
                    this.f29281b.setTypeface(typeface);
                }
                this.f29281b.setVisibility(4);
                jt4.m18857D1(this.f29281b, 1);
                mo36830M(this.f29287e);
                mo36832O(this.f29280b);
                mo36840e(this.f29281b, 1);
                this.f29281b.setAccessibilityDelegate(new C5444b());
            } else {
                mo36818A();
                mo36824G(this.f29281b, 1);
                this.f29281b = null;
                this.f29276a.mo29160D0();
                this.f29276a.mo29178N0();
            }
            this.f29283b = z;
        }
    }

    /* renamed from: O */
    public void mo36832O(@ts2 ColorStateList colorStateList) {
        this.f29280b = colorStateList;
        TextView textView = this.f29281b;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: P */
    public final void mo36833P(@ts2 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: Q */
    public void mo36834Q(Typeface typeface) {
        if (typeface != this.f29272a) {
            this.f29272a = typeface;
            mo36833P(this.f29275a, typeface);
            mo36833P(this.f29281b, typeface);
        }
    }

    /* renamed from: R */
    public final void mo36835R(@mr2 ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: S */
    public final boolean mo36836S(@ts2 TextView textView, @mr2 CharSequence charSequence) {
        return jt4.m18914U0(this.f29276a) && this.f29276a.isEnabled() && (this.f29284c != this.f29279b || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: T */
    public void mo36837T(CharSequence charSequence) {
        mo36843h();
        this.f29277a = charSequence;
        this.f29275a.setText(charSequence);
        int i = this.f29279b;
        if (i != 1) {
            this.f29284c = 1;
        }
        mo36839V(i, this.f29284c, mo36836S(this.f29275a, charSequence));
    }

    /* renamed from: U */
    public void mo36838U(CharSequence charSequence) {
        mo36843h();
        this.f29285c = charSequence;
        this.f29281b.setText(charSequence);
        int i = this.f29279b;
        if (i != 2) {
            this.f29284c = 2;
        }
        mo36839V(i, this.f29284c, mo36836S(this.f29281b, charSequence));
    }

    /* renamed from: V */
    public final void mo36839V(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f29269a = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                mo36844i(arrayList2, this.f29283b, this.f29281b, 2, i3, i4);
                mo36844i(arrayList2, this.f29278a, this.f29275a, 1, i3, i4);
                C2479j7.m18186a(animatorSet, arrayList);
                animatorSet.addListener(new C5443a(i2, mo36849n(i), i, mo36849n(i2)));
                animatorSet.start();
            } else {
                mo36825H(i, i2);
            }
            this.f29276a.mo29160D0();
            this.f29276a.mo29168H0(z2);
            this.f29276a.mo29178N0();
        }
    }

    /* renamed from: e */
    public void mo36840e(TextView textView, int i) {
        if (this.f29274a == null && this.f29273a == null) {
            LinearLayout linearLayout = new LinearLayout(this.f29270a);
            this.f29274a = linearLayout;
            linearLayout.setOrientation(0);
            this.f29276a.addView(this.f29274a, -1, -2);
            this.f29273a = new FrameLayout(this.f29270a);
            this.f29274a.addView(this.f29273a, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f29276a.getEditText() != null) {
                mo36841f();
            }
        }
        if (mo36821D(i)) {
            this.f29273a.setVisibility(0);
            this.f29273a.addView(textView);
        } else {
            this.f29274a.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f29274a.setVisibility(0);
        this.f29268a++;
    }

    /* renamed from: f */
    public void mo36841f() {
        if (mo36842g()) {
            EditText editText = this.f29276a.getEditText();
            boolean i = af2.m38618i(this.f29270a);
            LinearLayout linearLayout = this.f29274a;
            int i2 = fd3.C2156f.material_helper_text_font_1_3_padding_horizontal;
            jt4.m18946d2(linearLayout, mo36858w(i, i2, jt4.m18972k0(editText)), mo36858w(i, fd3.C2156f.material_helper_text_font_1_3_padding_top, this.f29270a.getResources().getDimensionPixelSize(fd3.C2156f.material_helper_text_default_padding_top)), mo36858w(i, i2, jt4.m18968j0(editText)), 0);
        }
    }

    /* renamed from: g */
    public final boolean mo36842g() {
        return (this.f29274a == null || this.f29276a.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    public void mo36843h() {
        Animator animator = this.f29269a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void mo36844i(@mr2 List<Animator> list, boolean z, @ts2 TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(mo36845j(textView, i3 == i));
                if (i3 == i) {
                    list.add(mo36846k(textView));
                }
            }
        }
    }

    /* renamed from: j */
    public final ObjectAnimator mo36845j(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C1947d7.f10649a);
        return ofFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator mo36846k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f29267a, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C1947d7.f10652d);
        return ofFloat;
    }

    /* renamed from: l */
    public boolean mo36847l() {
        return mo36819B(this.f29279b);
    }

    /* renamed from: m */
    public boolean mo36848m() {
        return mo36819B(this.f29284c);
    }

    @ts2
    /* renamed from: n */
    public final TextView mo36849n(int i) {
        if (i == 1) {
            return this.f29275a;
        }
        if (i != 2) {
            return null;
        }
        return this.f29281b;
    }

    @ts2
    /* renamed from: o */
    public CharSequence mo36850o() {
        return this.f29282b;
    }

    @ts2
    /* renamed from: p */
    public CharSequence mo36851p() {
        return this.f29277a;
    }

    @d10
    /* renamed from: q */
    public int mo36852q() {
        TextView textView = this.f29275a;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @ts2
    /* renamed from: r */
    public ColorStateList mo36853r() {
        TextView textView = this.f29275a;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence mo36854s() {
        return this.f29285c;
    }

    @ts2
    /* renamed from: t */
    public View mo36855t() {
        return this.f29281b;
    }

    @ts2
    /* renamed from: u */
    public ColorStateList mo36856u() {
        TextView textView = this.f29281b;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @d10
    /* renamed from: v */
    public int mo36857v() {
        TextView textView = this.f29281b;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: w */
    public final int mo36858w(boolean z, @yk0 int i, int i2) {
        return z ? this.f29270a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    public boolean mo36859x() {
        return mo36820C(this.f29279b);
    }

    /* renamed from: y */
    public boolean mo36860y() {
        return mo36820C(this.f29284c);
    }

    /* renamed from: z */
    public void mo36861z() {
        this.f29277a = null;
        mo36843h();
        if (this.f29279b == 1) {
            this.f29284c = (!this.f29283b || TextUtils.isEmpty(this.f29285c)) ? 0 : 2;
        }
        mo36839V(this.f29279b, this.f29284c, mo36836S(this.f29275a, ""));
    }
}
