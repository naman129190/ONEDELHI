package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0425c {

    /* renamed from: a */
    public static final int f2735a = 1;

    /* renamed from: b */
    public static final int f2736b = 2;

    /* renamed from: c */
    public static final int f2737c = 3;

    /* renamed from: d */
    public static final int f2738d = 4;

    /* renamed from: e */
    public static final int f2739e = 5;

    /* renamed from: f */
    public static final int f2740f = 6;

    /* renamed from: g */
    public static final int f2741g = 7;

    /* renamed from: h */
    public static final int f2742h = -1;

    /* renamed from: i */
    public static final int f2743i = 0;

    /* renamed from: j */
    public static final int f2744j = 0;

    /* renamed from: k */
    public static final int f2745k = -2;

    /* renamed from: l */
    public static final int f2746l = 1;

    /* renamed from: m */
    public static final int f2747m = 0;

    /* renamed from: a */
    public View f2748a;

    /* renamed from: a */
    public ConstraintLayout.LayoutParams f2749a;

    public C0425c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f2749a = (ConstraintLayout.LayoutParams) layoutParams;
            this.f2748a = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    /* renamed from: A */
    public C0425c mo3332A(float f) {
        this.f2749a.f2566f = f;
        return this;
    }

    /* renamed from: B */
    public C0425c mo3333B(int i, int i2) {
        switch (i) {
            case 1:
                this.f2749a.leftMargin = i2;
                break;
            case 2:
                this.f2749a.rightMargin = i2;
                break;
            case 3:
                this.f2749a.topMargin = i2;
                break;
            case 4:
                this.f2749a.bottomMargin = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2749a.setMarginStart(i2);
                break;
            case 7:
                this.f2749a.setMarginEnd(i2);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: C */
    public C0425c mo3334C(int i) {
        switch (i) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f2749a;
                layoutParams.f2561d = -1;
                layoutParams.f2558c = -1;
                layoutParams.leftMargin = -1;
                layoutParams.f2594t = Integer.MIN_VALUE;
                break;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f2749a;
                layoutParams2.f2567f = -1;
                layoutParams2.f2564e = -1;
                layoutParams2.rightMargin = -1;
                layoutParams2.f2596v = Integer.MIN_VALUE;
                break;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f2749a;
                layoutParams3.f2573h = -1;
                layoutParams3.f2570g = -1;
                layoutParams3.topMargin = -1;
                layoutParams3.f2595u = Integer.MIN_VALUE;
                break;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f2749a;
                layoutParams4.f2576i = -1;
                layoutParams4.f2579j = -1;
                layoutParams4.bottomMargin = -1;
                layoutParams4.f2597w = Integer.MIN_VALUE;
                break;
            case 5:
                this.f2749a.f2582k = -1;
                break;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f2749a;
                layoutParams5.f2590p = -1;
                layoutParams5.f2591q = -1;
                layoutParams5.setMarginStart(-1);
                this.f2749a.f2598x = Integer.MIN_VALUE;
                break;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f2749a;
                layoutParams6.f2592r = -1;
                layoutParams6.f2593s = -1;
                layoutParams6.setMarginEnd(-1);
                this.f2749a.f2599y = Integer.MIN_VALUE;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: D */
    public C0425c mo3335D() {
        ConstraintLayout.LayoutParams layoutParams = this.f2749a;
        int i = layoutParams.f2561d;
        int i2 = layoutParams.f2564e;
        if (i == -1 && i2 == -1) {
            int i3 = layoutParams.f2590p;
            int i4 = layoutParams.f2592r;
            if (!(i3 == -1 && i4 == -1)) {
                C0425c cVar = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i3));
                C0425c cVar2 = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i4));
                ConstraintLayout.LayoutParams layoutParams2 = this.f2749a;
                if (i3 != -1 && i4 != -1) {
                    cVar.mo3366m(7, i4, 6, 0);
                    cVar2.mo3366m(6, i, 7, 0);
                } else if (!(i == -1 && i4 == -1)) {
                    int i5 = layoutParams2.f2567f;
                    if (i5 != -1) {
                        cVar.mo3366m(7, i5, 7, 0);
                    } else {
                        int i6 = layoutParams2.f2558c;
                        if (i6 != -1) {
                            cVar2.mo3366m(6, i6, 6, 0);
                        }
                    }
                }
            }
            mo3334C(6);
            mo3334C(7);
        } else {
            C0425c cVar3 = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i));
            C0425c cVar4 = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i2));
            ConstraintLayout.LayoutParams layoutParams3 = this.f2749a;
            if (i != -1 && i2 != -1) {
                cVar3.mo3366m(2, i2, 1, 0);
                cVar4.mo3366m(1, i, 2, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i7 = layoutParams3.f2567f;
                if (i7 != -1) {
                    cVar3.mo3366m(2, i7, 2, 0);
                } else {
                    int i8 = layoutParams3.f2558c;
                    if (i8 != -1) {
                        cVar4.mo3366m(1, i8, 1, 0);
                    }
                }
            }
            mo3334C(1);
            mo3334C(2);
        }
        return this;
    }

    /* renamed from: E */
    public C0425c mo3336E() {
        ConstraintLayout.LayoutParams layoutParams = this.f2749a;
        int i = layoutParams.f2573h;
        int i2 = layoutParams.f2576i;
        if (!(i == -1 && i2 == -1)) {
            C0425c cVar = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i));
            C0425c cVar2 = new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i2));
            ConstraintLayout.LayoutParams layoutParams2 = this.f2749a;
            if (i != -1 && i2 != -1) {
                cVar.mo3366m(4, i2, 3, 0);
                cVar2.mo3366m(3, i, 4, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i3 = layoutParams2.f2579j;
                if (i3 != -1) {
                    cVar.mo3366m(4, i3, 4, 0);
                } else {
                    int i4 = layoutParams2.f2570g;
                    if (i4 != -1) {
                        cVar2.mo3366m(3, i4, 3, 0);
                    }
                }
            }
        }
        mo3334C(3);
        mo3334C(4);
        return this;
    }

    /* renamed from: F */
    public C0425c mo3337F(float f) {
        this.f2748a.setRotation(f);
        return this;
    }

    /* renamed from: G */
    public C0425c mo3338G(float f) {
        this.f2748a.setRotationX(f);
        return this;
    }

    /* renamed from: H */
    public C0425c mo3339H(float f) {
        this.f2748a.setRotationY(f);
        return this;
    }

    /* renamed from: I */
    public C0425c mo3340I(float f) {
        this.f2748a.setScaleY(f);
        return this;
    }

    /* renamed from: J */
    public C0425c mo3341J(float f) {
        return this;
    }

    /* renamed from: K */
    public final String mo3342K(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: L */
    public C0425c mo3343L(float f, float f2) {
        this.f2748a.setPivotX(f);
        this.f2748a.setPivotY(f2);
        return this;
    }

    /* renamed from: M */
    public C0425c mo3344M(float f) {
        this.f2748a.setPivotX(f);
        return this;
    }

    /* renamed from: N */
    public C0425c mo3345N(float f) {
        this.f2748a.setPivotY(f);
        return this;
    }

    /* renamed from: O */
    public C0425c mo3346O(float f, float f2) {
        this.f2748a.setTranslationX(f);
        this.f2748a.setTranslationY(f2);
        return this;
    }

    /* renamed from: P */
    public C0425c mo3347P(float f) {
        this.f2748a.setTranslationX(f);
        return this;
    }

    /* renamed from: Q */
    public C0425c mo3348Q(float f) {
        this.f2748a.setTranslationY(f);
        return this;
    }

    /* renamed from: R */
    public C0425c mo3349R(float f) {
        this.f2748a.setTranslationZ(f);
        return this;
    }

    /* renamed from: S */
    public C0425c mo3350S(float f) {
        this.f2749a.f2560d = f;
        return this;
    }

    /* renamed from: T */
    public C0425c mo3351T(int i) {
        this.f2749a.f2529D = i;
        return this;
    }

    /* renamed from: U */
    public C0425c mo3352U(float f) {
        this.f2749a.f2569g = f;
        return this;
    }

    /* renamed from: V */
    public C0425c mo3353V(int i) {
        this.f2748a.setVisibility(i);
        return this;
    }

    /* renamed from: a */
    public C0425c mo3354a(int i, int i2) {
        mo3366m(1, i, i == 0 ? 1 : 2, 0);
        mo3366m(2, i2, i2 == 0 ? 2 : 1, 0);
        if (i != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i)).mo3366m(2, this.f2748a.getId(), 1, 0);
        }
        if (i2 != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i2)).mo3366m(1, this.f2748a.getId(), 2, 0);
        }
        return this;
    }

    /* renamed from: b */
    public C0425c mo3355b(int i, int i2) {
        mo3366m(6, i, i == 0 ? 6 : 7, 0);
        mo3366m(7, i2, i2 == 0 ? 7 : 6, 0);
        if (i != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i)).mo3366m(7, this.f2748a.getId(), 6, 0);
        }
        if (i2 != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i2)).mo3366m(6, this.f2748a.getId(), 7, 0);
        }
        return this;
    }

    /* renamed from: c */
    public C0425c mo3356c(int i, int i2) {
        mo3366m(3, i, i == 0 ? 3 : 4, 0);
        mo3366m(4, i2, i2 == 0 ? 4 : 3, 0);
        if (i != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i)).mo3366m(4, this.f2748a.getId(), 3, 0);
        }
        if (i2 != 0) {
            new C0425c(((ViewGroup) this.f2748a.getParent()).findViewById(i2)).mo3366m(3, this.f2748a.getId(), 4, 0);
        }
        return this;
    }

    /* renamed from: d */
    public C0425c mo3357d(float f) {
        this.f2748a.setAlpha(f);
        return this;
    }

    /* renamed from: e */
    public void mo3358e() {
    }

    /* renamed from: f */
    public C0425c mo3359f(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            int i7 = 2;
            int i8 = 1;
            if (!(i2 == 1 || i2 == 2)) {
                i7 = 7;
                i8 = 6;
                if (!(i2 == 6 || i2 == 7)) {
                    mo3366m(3, i, i2, i3);
                    mo3366m(4, i4, i5, i6);
                    this.f2749a.f2560d = f;
                    return this;
                }
            }
            mo3366m(i8, i, i2, i3);
            mo3366m(i7, i4, i5, i6);
            this.f2749a.f2557c = f;
            return this;
        }
    }

    /* renamed from: g */
    public C0425c mo3360g(int i) {
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0425c cVar;
        if (i == 0) {
            i7 = 0;
            i6 = 1;
            i5 = 0;
            i4 = 0;
            i3 = 2;
            i2 = 0;
            f = 0.5f;
            cVar = this;
        } else {
            i6 = 2;
            i5 = 0;
            i3 = 1;
            i2 = 0;
            f = 0.5f;
            cVar = this;
            i7 = i;
            i4 = i;
        }
        cVar.mo3359f(i7, i6, i5, i4, i3, i2, f);
        return this;
    }

    /* renamed from: h */
    public C0425c mo3361h(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo3366m(1, i, i2, i3);
        mo3366m(2, i4, i5, i6);
        this.f2749a.f2557c = f;
        return this;
    }

    /* renamed from: i */
    public C0425c mo3362i(int i) {
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0425c cVar;
        if (i == 0) {
            i7 = 0;
            i6 = 6;
            i5 = 0;
            i4 = 0;
            i3 = 7;
            i2 = 0;
            f = 0.5f;
            cVar = this;
        } else {
            i6 = 7;
            i5 = 0;
            i3 = 6;
            i2 = 0;
            f = 0.5f;
            cVar = this;
            i7 = i;
            i4 = i;
        }
        cVar.mo3359f(i7, i6, i5, i4, i3, i2, f);
        return this;
    }

    /* renamed from: j */
    public C0425c mo3363j(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo3366m(6, i, i2, i3);
        mo3366m(7, i4, i5, i6);
        this.f2749a.f2557c = f;
        return this;
    }

    /* renamed from: k */
    public C0425c mo3364k(int i) {
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0425c cVar;
        if (i == 0) {
            i7 = 0;
            i6 = 3;
            i5 = 0;
            i4 = 0;
            i3 = 4;
            i2 = 0;
            f = 0.5f;
            cVar = this;
        } else {
            i6 = 4;
            i5 = 0;
            i3 = 3;
            i2 = 0;
            f = 0.5f;
            cVar = this;
            i7 = i;
            i4 = i;
        }
        cVar.mo3359f(i7, i6, i5, i4, i3, i2, f);
        return this;
    }

    /* renamed from: l */
    public C0425c mo3365l(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo3366m(3, i, i2, i3);
        mo3366m(4, i4, i5, i6);
        this.f2749a.f2560d = f;
        return this;
    }

    /* renamed from: m */
    public C0425c mo3366m(int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        ConstraintLayout.LayoutParams layoutParams3;
        switch (i) {
            case 1:
                if (i3 == 1) {
                    ConstraintLayout.LayoutParams layoutParams4 = this.f2749a;
                    layoutParams4.f2558c = i2;
                    layoutParams4.f2561d = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f2749a;
                    layoutParams5.f2561d = i2;
                    layoutParams5.f2558c = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + mo3342K(i3) + " undefined");
                }
                this.f2749a.leftMargin = i4;
                break;
            case 2:
                if (i3 == 1) {
                    ConstraintLayout.LayoutParams layoutParams6 = this.f2749a;
                    layoutParams6.f2564e = i2;
                    layoutParams6.f2567f = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.f2749a;
                    layoutParams7.f2567f = i2;
                    layoutParams7.f2564e = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                this.f2749a.rightMargin = i4;
                break;
            case 3:
                if (i3 == 3) {
                    layoutParams = this.f2749a;
                    layoutParams.f2570g = i2;
                    layoutParams.f2573h = -1;
                } else if (i3 == 4) {
                    layoutParams = this.f2749a;
                    layoutParams.f2573h = i2;
                    layoutParams.f2570g = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                layoutParams.f2582k = -1;
                layoutParams.f2584l = -1;
                layoutParams.f2586m = -1;
                this.f2749a.topMargin = i4;
                break;
            case 4:
                if (i3 == 4) {
                    layoutParams2 = this.f2749a;
                    layoutParams2.f2579j = i2;
                    layoutParams2.f2576i = -1;
                } else if (i3 == 3) {
                    layoutParams2 = this.f2749a;
                    layoutParams2.f2576i = i2;
                    layoutParams2.f2579j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                layoutParams2.f2582k = -1;
                layoutParams2.f2584l = -1;
                layoutParams2.f2586m = -1;
                this.f2749a.bottomMargin = i4;
                break;
            case 5:
                if (i3 == 5) {
                    ConstraintLayout.LayoutParams layoutParams8 = this.f2749a;
                    layoutParams8.f2582k = i2;
                    layoutParams8.f2579j = -1;
                    layoutParams8.f2576i = -1;
                    layoutParams8.f2570g = -1;
                    layoutParams8.f2573h = -1;
                }
                if (i3 == 3) {
                    layoutParams3 = this.f2749a;
                    layoutParams3.f2584l = i2;
                } else if (i3 == 4) {
                    layoutParams3 = this.f2749a;
                    layoutParams3.f2586m = i2;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                layoutParams3.f2579j = -1;
                layoutParams3.f2576i = -1;
                layoutParams3.f2570g = -1;
                layoutParams3.f2573h = -1;
                this.f2749a.f2526A = i4;
                break;
            case 6:
                if (i3 == 6) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.f2749a;
                    layoutParams9.f2591q = i2;
                    layoutParams9.f2590p = -1;
                } else if (i3 == 7) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f2749a;
                    layoutParams10.f2590p = i2;
                    layoutParams10.f2591q = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                this.f2749a.setMarginStart(i4);
                break;
            case 7:
                if (i3 == 7) {
                    ConstraintLayout.LayoutParams layoutParams11 = this.f2749a;
                    layoutParams11.f2593s = i2;
                    layoutParams11.f2592r = -1;
                } else if (i3 == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.f2749a;
                    layoutParams12.f2592r = i2;
                    layoutParams12.f2593s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo3342K(i3) + " undefined");
                }
                this.f2749a.setMarginEnd(i4);
                break;
            default:
                throw new IllegalArgumentException(mo3342K(i) + " to " + mo3342K(i3) + " unknown");
        }
        return this;
    }

    /* renamed from: n */
    public C0425c mo3367n(int i) {
        this.f2749a.f2531F = i;
        return this;
    }

    /* renamed from: o */
    public C0425c mo3368o(int i) {
        this.f2749a.f2530E = i;
        return this;
    }

    /* renamed from: p */
    public C0425c mo3369p(int i) {
        this.f2749a.height = i;
        return this;
    }

    /* renamed from: q */
    public C0425c mo3370q(int i) {
        this.f2749a.f2535J = i;
        return this;
    }

    /* renamed from: r */
    public C0425c mo3371r(int i) {
        this.f2749a.f2534I = i;
        return this;
    }

    /* renamed from: s */
    public C0425c mo3372s(int i) {
        this.f2749a.f2533H = i;
        return this;
    }

    /* renamed from: t */
    public C0425c mo3373t(int i) {
        this.f2749a.f2532G = i;
        return this;
    }

    /* renamed from: u */
    public C0425c mo3374u(int i) {
        this.f2749a.width = i;
        return this;
    }

    /* renamed from: v */
    public C0425c mo3375v(String str) {
        this.f2749a.f2551a = str;
        return this;
    }

    /* renamed from: w */
    public C0425c mo3376w(float f) {
        this.f2748a.setElevation(f);
        return this;
    }

    /* renamed from: x */
    public C0425c mo3377x(int i, int i2) {
        switch (i) {
            case 1:
                this.f2749a.f2594t = i2;
                break;
            case 2:
                this.f2749a.f2596v = i2;
                break;
            case 3:
                this.f2749a.f2595u = i2;
                break;
            case 4:
                this.f2749a.f2597w = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2749a.f2598x = i2;
                break;
            case 7:
                this.f2749a.f2599y = i2;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: y */
    public C0425c mo3378y(float f) {
        this.f2749a.f2557c = f;
        return this;
    }

    /* renamed from: z */
    public C0425c mo3379z(int i) {
        this.f2749a.f2528C = i;
        return this;
    }
}
