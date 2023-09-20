package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.transition.C1086j;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C2416i8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3155pk;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.bk0;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.ds0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.gq1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jp0;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.m00;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.s24;
import com.onedelhi.secure.tc0;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: N */
    public static final int f24571N = fd3.C2164n.Widget_Design_TextInputLayout;

    /* renamed from: O */
    public static final int f24572O = 167;

    /* renamed from: P */
    public static final int f24573P = -1;

    /* renamed from: Q */
    public static final int f24574Q = -1;

    /* renamed from: R */
    public static final int f24575R = 0;

    /* renamed from: S */
    public static final int f24576S = 1;

    /* renamed from: T */
    public static final int f24577T = 2;

    /* renamed from: U */
    public static final int f24578U = -1;

    /* renamed from: V */
    public static final int f24579V = 0;

    /* renamed from: W */
    public static final int f24580W = 1;

    /* renamed from: X */
    public static final int f24581X = 2;

    /* renamed from: Y */
    public static final int f24582Y = 3;

    /* renamed from: a */
    public static final int[][] f24583a = {new int[]{16842919}, new int[0]};

    /* renamed from: b */
    public static final long f24584b = 87;

    /* renamed from: b */
    public static final String f24585b = "TextInputLayout";

    /* renamed from: c */
    public static final long f24586c = 67;

    /* renamed from: A */
    public int f24587A;
    @d10

    /* renamed from: B */
    public int f24588B;
    @d10

    /* renamed from: C */
    public int f24589C;

    /* renamed from: D */
    public int f24590D;

    /* renamed from: E */
    public int f24591E;
    @d10

    /* renamed from: F */
    public int f24592F;
    @d10

    /* renamed from: G */
    public int f24593G;
    @d10

    /* renamed from: H */
    public int f24594H;
    @d10

    /* renamed from: I */
    public int f24595I;
    @d10

    /* renamed from: J */
    public int f24596J;
    @d10

    /* renamed from: K */
    public int f24597K;
    @d10

    /* renamed from: L */
    public int f24598L;
    @d10

    /* renamed from: M */
    public int f24599M;

    /* renamed from: a */
    public ValueAnimator f24600a;
    @ts2

    /* renamed from: a */
    public ColorStateList f24601a;

    /* renamed from: a */
    public final Rect f24602a;

    /* renamed from: a */
    public final RectF f24603a;

    /* renamed from: a */
    public Typeface f24604a;
    @ts2

    /* renamed from: a */
    public Drawable f24605a;

    /* renamed from: a */
    public StateListDrawable f24606a;

    /* renamed from: a */
    public EditText f24607a;
    @mr2

    /* renamed from: a */
    public final FrameLayout f24608a;
    @ts2

    /* renamed from: a */
    public TextView f24609a;
    @ts2

    /* renamed from: a */
    public Fade f24610a;
    @mr2

    /* renamed from: a */
    public C4253h f24611a;
    @mr2

    /* renamed from: a */
    public final C4258a f24612a;
    @ts2

    /* renamed from: a */
    public bf2 f24613a;

    /* renamed from: a */
    public final gq1 f24614a;

    /* renamed from: a */
    public final m00 f24615a;
    @mr2

    /* renamed from: a */
    public final s24 f24616a;
    @mr2

    /* renamed from: a */
    public uw3 f24617a;

    /* renamed from: a */
    public CharSequence f24618a;

    /* renamed from: a */
    public final LinkedHashSet<C4254i> f24619a;
    @ts2

    /* renamed from: b */
    public ColorStateList f24620b;

    /* renamed from: b */
    public final Rect f24621b;
    @ts2

    /* renamed from: b */
    public Drawable f24622b;

    /* renamed from: b */
    public TextView f24623b;
    @ts2

    /* renamed from: b */
    public Fade f24624b;

    /* renamed from: b */
    public bf2 f24625b;

    /* renamed from: b */
    public CharSequence f24626b;

    /* renamed from: b */
    public boolean f24627b;
    @ts2

    /* renamed from: c */
    public ColorStateList f24628c;

    /* renamed from: c */
    public Drawable f24629c;
    @ts2

    /* renamed from: c */
    public bf2 f24630c;

    /* renamed from: c */
    public CharSequence f24631c;

    /* renamed from: c */
    public boolean f24632c;

    /* renamed from: d */
    public ColorStateList f24633d;
    @ts2

    /* renamed from: d */
    public bf2 f24634d;

    /* renamed from: d */
    public boolean f24635d;

    /* renamed from: e */
    public ColorStateList f24636e;

    /* renamed from: e */
    public boolean f24637e;

    /* renamed from: f */
    public ColorStateList f24638f;

    /* renamed from: f */
    public boolean f24639f;

    /* renamed from: g */
    public boolean f24640g;

    /* renamed from: h */
    public boolean f24641h;

    /* renamed from: i */
    public boolean f24642i;

    /* renamed from: j */
    public boolean f24643j;

    /* renamed from: k */
    public boolean f24644k;

    /* renamed from: l */
    public boolean f24645l;

    /* renamed from: m */
    public boolean f24646m;

    /* renamed from: n */
    public int f24647n;

    /* renamed from: o */
    public int f24648o;

    /* renamed from: p */
    public int f24649p;

    /* renamed from: q */
    public int f24650q;

    /* renamed from: r */
    public int f24651r;

    /* renamed from: s */
    public int f24652s;

    /* renamed from: t */
    public int f24653t;

    /* renamed from: u */
    public int f24654u;

    /* renamed from: v */
    public final int f24655v;

    /* renamed from: w */
    public int f24656w;

    /* renamed from: x */
    public int f24657x;

    /* renamed from: y */
    public int f24658y;

    /* renamed from: z */
    public int f24659z;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C4246a implements TextWatcher {
        public C4246a() {
        }

        public void afterTextChanged(@mr2 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo29168H0(!textInputLayout.f24646m);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f24627b) {
                textInputLayout2.mo29387z0(editable);
            }
            if (TextInputLayout.this.f24635d) {
                TextInputLayout.this.mo29175L0(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C4247b implements Runnable {
        public C4247b() {
        }

        public void run() {
            TextInputLayout.this.f24612a.mo29440i();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C4248c implements Runnable {
        public C4248c() {
        }

        public void run() {
            TextInputLayout.this.f24607a.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C4249d implements ValueAnimator.AnimatorUpdateListener {
        public C4249d() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            TextInputLayout.this.f24615a.mo40400z0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C4250e extends C3884x1 {

        /* renamed from: a */
        public final TextInputLayout f24664a;

        public C4250e(@mr2 TextInputLayout textInputLayout) {
            this.f24664a = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            if (r3 != null) goto L_0x008e;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3893g(@com.onedelhi.secure.mr2 android.view.View r14, @com.onedelhi.secure.mr2 com.onedelhi.secure.C1638a2 r15) {
            /*
                r13 = this;
                super.mo3893g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.f24664a
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L_0x0010
                android.text.Editable r0 = r0.getText()
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f24664a
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f24664a
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f24664a
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f24664a
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f24664a
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.f24664a
                boolean r9 = r9.mo29189Y()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L_0x0051
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r11 = 0
                goto L_0x0052
            L_0x0051:
                r11 = 1
            L_0x0052:
                if (r8 == 0) goto L_0x0059
                java.lang.String r1 = r1.toString()
                goto L_0x005b
            L_0x0059:
                java.lang.String r1 = ""
            L_0x005b:
                com.google.android.material.textfield.TextInputLayout r8 = r13.f24664a
                com.onedelhi.secure.s24 r8 = r8.f24616a
                r8.mo44181w(r15)
                java.lang.String r8 = ", "
                if (r6 == 0) goto L_0x006c
                r15.mo12516L1(r0)
                goto L_0x0091
            L_0x006c:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x008c
                r15.mo12516L1(r1)
                if (r9 == 0) goto L_0x0091
                if (r3 == 0) goto L_0x0091
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                goto L_0x008e
            L_0x008c:
                if (r3 == 0) goto L_0x0091
            L_0x008e:
                r15.mo12516L1(r3)
            L_0x0091:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00bd
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L_0x00a1
                r15.mo12593l1(r1)
                goto L_0x00b8
            L_0x00a1:
                if (r6 == 0) goto L_0x00b5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x00b5:
                r15.mo12516L1(r1)
            L_0x00b8:
                r1 = r6 ^ 1
                r15.mo12504H1(r1)
            L_0x00bd:
                if (r0 == 0) goto L_0x00c6
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00c6
                goto L_0x00c7
            L_0x00c6:
                r4 = -1
            L_0x00c7:
                r15.mo12620u1(r4)
                if (r11 == 0) goto L_0x00d3
                if (r10 == 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r2 = r5
            L_0x00d0:
                r15.mo12580h1(r2)
            L_0x00d3:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f24664a
                com.onedelhi.secure.gq1 r0 = r0.f24614a
                android.view.View r0 = r0.mo36855t()
                if (r0 == 0) goto L_0x00e2
                r15.mo12601o1(r0)
            L_0x00e2:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f24664a
                com.google.android.material.textfield.a r0 = r0.f24612a
                com.onedelhi.secure.ju0 r0 = r0.mo29452o()
                r0.mo31995o(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C4250e.mo3893g(android.view.View, com.onedelhi.secure.a2):void");
        }

        /* renamed from: h */
        public void mo6531h(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            super.mo6531h(view, accessibilityEvent);
            this.f24664a.f24612a.mo29452o().mo31996p(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public @interface C4251f {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public @interface C4252g {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public interface C4253h {
        /* renamed from: a */
        int mo29394a(@ts2 Editable editable);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$i */
    public interface C4254i {
        /* renamed from: a */
        void mo29395a(@mr2 TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$j */
    public interface C4255j {
        /* renamed from: a */
        void mo29396a(@mr2 TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$k */
    public static class C4256k extends C2015e0 {
        public static final Parcelable.Creator<C4256k> CREATOR = new C4257a();
        @ts2

        /* renamed from: a */
        public CharSequence f24665a;

        /* renamed from: b */
        public boolean f24666b;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$k$a */
        public class C4257a implements Parcelable.ClassLoaderCreator<C4256k> {
            @ts2
            /* renamed from: a */
            public C4256k createFromParcel(@mr2 Parcel parcel) {
                return new C4256k(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C4256k createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C4256k(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C4256k[] newArray(int i) {
                return new C4256k[i];
            }
        }

        public C4256k(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24665a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24666b = parcel.readInt() != 1 ? false : true;
        }

        public C4256k(Parcelable parcelable) {
            super(parcelable);
        }

        @mr2
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f24665a + "}";
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f24665a, parcel, i);
            parcel.writeInt(this.f24666b ? 1 : 0);
        }
    }

    public TextInputLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(@com.onedelhi.secure.mr2 android.content.Context r21, @com.onedelhi.secure.ts2 android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r9 = f24571N
            r1 = r21
            android.content.Context r1 = com.onedelhi.secure.hf2.m50488c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f24647n = r10
            r0.f24648o = r10
            r0.f24649p = r10
            r0.f24650q = r10
            com.onedelhi.secure.gq1 r1 = new com.onedelhi.secure.gq1
            r1.<init>(r0)
            r0.f24614a = r1
            com.onedelhi.secure.bb4 r1 = com.onedelhi.secure.bb4.f26261a
            r0.f24611a = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f24602a = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f24621b = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f24603a = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f24619a = r1
            com.onedelhi.secure.m00 r1 = new com.onedelhi.secure.m00
            r1.<init>(r0)
            r0.f24615a = r1
            android.content.Context r11 = r20.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.f24608a = r14
            r14.setAddStatesFromChildren(r12)
            android.animation.TimeInterpolator r2 = com.onedelhi.secure.C1947d7.f10649a
            r1.mo40336M0(r2)
            r1.mo40326H0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo40370k0(r2)
            int[] r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout
            r1 = 5
            int[] r6 = new int[r1]
            int r15 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterTextAppearance
            r6[r13] = r15
            int r5 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterOverflowTextAppearance
            r6[r12] = r5
            int r4 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_errorTextAppearance
            r2 = 2
            r6[r2] = r4
            int r1 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_helperTextTextAppearance
            r16 = 3
            r6[r16] = r1
            int r13 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_hintTextAppearance
            r16 = 4
            r6[r16] = r13
            r17 = r1
            r1 = r11
            r2 = r22
            r18 = r4
            r4 = r23
            r19 = r5
            r5 = r9
            com.onedelhi.secure.af4 r1 = com.onedelhi.secure.ob4.m59196l(r1, r2, r3, r4, r5, r6)
            com.onedelhi.secure.s24 r2 = new com.onedelhi.secure.s24
            r2.<init>(r0, r1)
            r0.f24616a = r2
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_hintEnabled
            boolean r3 = r1.mo13030a(r3, r12)
            r0.f24637e = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_hint
            java.lang.CharSequence r3 = r1.mo13053x(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_hintAnimationEnabled
            boolean r3 = r1.mo13030a(r3, r12)
            r0.f24644k = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_expandedHintEnabled
            boolean r3 = r1.mo13030a(r3, r12)
            r0.f24643j = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_minEms
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x00d5
            int r3 = r1.mo13044o(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00e4
        L_0x00d5:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_minWidth
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x00e4
            int r3 = r1.mo13036g(r3, r10)
            r0.setMinWidth(r3)
        L_0x00e4:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_maxEms
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x00f4
            int r3 = r1.mo13044o(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x0103
        L_0x00f4:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_maxWidth
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x0103
            int r3 = r1.mo13036g(r3, r10)
            r0.setMaxWidth(r3)
        L_0x0103:
            com.onedelhi.secure.uw3$b r3 = com.onedelhi.secure.uw3.m67447e(r11, r7, r8, r9)
            com.onedelhi.secure.uw3 r3 = r3.mo45845m()
            r0.f24617a = r3
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.onedelhi.secure.fd3.C2156f.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f24655v = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxCollapsedPaddingTop
            r4 = 0
            int r3 = r1.mo13035f(r3, r4)
            r0.f24657x = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r11.getResources()
            int r5 = com.onedelhi.secure.fd3.C2156f.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo13036g(r3, r4)
            r0.f24659z = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r11.getResources()
            int r5 = com.onedelhi.secure.fd3.C2156f.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo13036g(r3, r4)
            r0.f24587A = r3
            int r3 = r0.f24659z
            r0.f24658y = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxCornerRadiusTopStart
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.mo13034e(r3, r4)
            int r5 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxCornerRadiusTopEnd
            float r5 = r1.mo13034e(r5, r4)
            int r6 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxCornerRadiusBottomEnd
            float r6 = r1.mo13034e(r6, r4)
            int r7 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxCornerRadiusBottomStart
            float r4 = r1.mo13034e(r7, r4)
            com.onedelhi.secure.uw3 r7 = r0.f24617a
            com.onedelhi.secure.uw3$b r7 = r7.mo45824v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x0172
            r7.mo45838K(r3)
        L_0x0172:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0179
            r7.mo45843P(r5)
        L_0x0179:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0180
            r7.mo45830C(r6)
        L_0x0180:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0187
            r7.mo45855x(r4)
        L_0x0187:
            com.onedelhi.secure.uw3 r3 = r7.mo45845m()
            r0.f24617a = r3
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r3 = com.onedelhi.secure.af2.m38611b(r11, r1, r3)
            if (r3 == 0) goto L_0x01eb
            int r4 = r3.getDefaultColor()
            r0.f24595I = r4
            r0.f24589C = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c7
            int[] r4 = new int[r12]
            r6 = 0
            r4[r6] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.f24596J = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.f24597K = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            goto L_0x01e8
        L_0x01c7:
            r4 = 2
            int r3 = r0.f24595I
            r0.f24597K = r3
            int r3 = com.onedelhi.secure.fd3.C2155e.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = com.onedelhi.secure.C3129p8.m24528a(r11, r3)
            int[] r6 = new int[r12]
            r7 = 0
            r6[r7] = r5
            int r5 = r3.getColorForState(r6, r10)
            r0.f24596J = r5
            int[] r5 = new int[r12]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r7] = r6
            int r3 = r3.getColorForState(r5, r10)
        L_0x01e8:
            r0.f24598L = r3
            goto L_0x01f7
        L_0x01eb:
            r4 = 2
            r7 = 0
            r0.f24589C = r7
            r0.f24595I = r7
            r0.f24596J = r7
            r0.f24597K = r7
            r0.f24598L = r7
        L_0x01f7:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_textColorHint
            boolean r5 = r1.mo13026C(r3)
            if (r5 == 0) goto L_0x0207
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.f24636e = r3
            r0.f24633d = r3
        L_0x0207:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r5 = com.onedelhi.secure.af2.m38611b(r11, r1, r3)
            r6 = 0
            int r3 = r1.mo13032c(r3, r6)
            r0.f24594H = r3
            int r3 = com.onedelhi.secure.fd3.C2155e.mtrl_textinput_default_box_stroke_color
            int r3 = com.onedelhi.secure.r70.m26353f(r11, r3)
            r0.f24592F = r3
            int r3 = com.onedelhi.secure.fd3.C2155e.mtrl_textinput_disabled_color
            int r3 = com.onedelhi.secure.r70.m26353f(r11, r3)
            r0.f24599M = r3
            int r3 = com.onedelhi.secure.fd3.C2155e.mtrl_textinput_hovered_box_stroke_color
            int r3 = com.onedelhi.secure.r70.m26353f(r11, r3)
            r0.f24593G = r3
            if (r5 == 0) goto L_0x0231
            r0.setBoxStrokeColorStateList(r5)
        L_0x0231:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxStrokeErrorColor
            boolean r5 = r1.mo13026C(r3)
            if (r5 == 0) goto L_0x0240
            android.content.res.ColorStateList r3 = com.onedelhi.secure.af2.m38611b(r11, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0240:
            int r3 = r1.mo13050u(r13, r10)
            if (r3 == r10) goto L_0x024f
            r3 = 0
            int r5 = r1.mo13050u(r13, r3)
            r0.setHintTextAppearance(r5)
            goto L_0x0250
        L_0x024f:
            r3 = 0
        L_0x0250:
            r5 = r18
            int r5 = r1.mo13050u(r5, r3)
            int r6 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_errorContentDescription
            java.lang.CharSequence r6 = r1.mo13053x(r6)
            int r7 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_errorEnabled
            boolean r7 = r1.mo13030a(r7, r3)
            r8 = r17
            int r8 = r1.mo13050u(r8, r3)
            int r9 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_helperTextEnabled
            boolean r9 = r1.mo13030a(r9, r3)
            int r11 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_helperText
            java.lang.CharSequence r11 = r1.mo13053x(r11)
            int r13 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_placeholderTextAppearance
            int r13 = r1.mo13050u(r13, r3)
            int r4 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_placeholderText
            java.lang.CharSequence r4 = r1.mo13053x(r4)
            int r12 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterEnabled
            boolean r12 = r1.mo13030a(r12, r3)
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterMaxLength
            int r3 = r1.mo13044o(r3, r10)
            r0.setCounterMaxLength(r3)
            r3 = 0
            int r10 = r1.mo13050u(r15, r3)
            r0.f24653t = r10
            r10 = r19
            int r10 = r1.mo13050u(r10, r3)
            r0.f24652s = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_boxBackgroundMode
            int r3 = r1.mo13044o(r10, r3)
            r0.setBoxBackgroundMode(r3)
            r0.setErrorContentDescription(r6)
            int r3 = r0.f24652s
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r5)
            int r3 = r0.f24653t
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r4)
            r0.setPlaceholderTextAppearance(r13)
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_errorTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x02cf
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setErrorTextColor(r3)
        L_0x02cf:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_helperTextTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x02de
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setHelperTextColor(r3)
        L_0x02de:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_hintTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x02ed
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setHintTextColor(r3)
        L_0x02ed:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x02fc
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setCounterTextColor(r3)
        L_0x02fc:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_counterOverflowTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x030b
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x030b:
            int r3 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_placeholderTextColor
            boolean r4 = r1.mo13026C(r3)
            if (r4 == 0) goto L_0x031a
            android.content.res.ColorStateList r3 = r1.mo13033d(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x031a:
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0, r1)
            r0.f24612a = r3
            int r4 = com.onedelhi.secure.fd3.C2165o.TextInputLayout_android_enabled
            r5 = 1
            boolean r4 = r1.mo13030a(r4, r5)
            r1.mo13029I()
            r1 = 2
            com.onedelhi.secure.jt4.m18906R1(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L_0x0338
            com.onedelhi.secure.jt4.m18909S1(r0, r5)
        L_0x0338:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r12)
            r0.setHelperText(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A0 */
    public static void m34191A0(@mr2 Context context, @mr2 TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? fd3.C2163m.character_counter_overflowed_content_description : fd3.C2163m.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: K */
    public static Drawable m34192K(bf2 bf2, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{oe2.m23728n(i2, i, 0.1f), i}), bf2, bf2);
    }

    /* renamed from: N */
    public static Drawable m34193N(Context context, bf2 bf2, int i, int[][] iArr) {
        int c = oe2.m23717c(context, fd3.C2153c.colorSurface, f24585b);
        bf2 bf22 = new bf2(bf2.getShapeAppearanceModel());
        int n = oe2.m23728n(i, c, 0.1f);
        bf22.mo31626o0(new ColorStateList(iArr, new int[]{n, 0}));
        bf22.setTint(c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{n, c});
        bf2 bf23 = new bf2(bf2.getShapeAppearanceModel());
        bf23.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, bf22, bf23), bf2});
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m34199e0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @ts2
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f24607a;
        if (!(editText instanceof AutoCompleteTextView) || ds0.m45525a(editText)) {
            return this.f24613a;
        }
        int d = oe2.m23718d(this.f24607a, fd3.C2153c.colorControlHighlight);
        int i = this.f24656w;
        if (i == 2) {
            return m34193N(getContext(), this.f24613a, d, f24583a);
        }
        if (i == 1) {
            return m34192K(this.f24613a, this.f24589C, d, f24583a);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f24606a == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f24606a = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f24606a.addState(new int[0], mo29171J(false));
        }
        return this.f24606a;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f24625b == null) {
            this.f24625b = mo29171J(true);
        }
        return this.f24625b;
    }

    /* renamed from: j0 */
    public static void m34202j0(@mr2 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m34202j0((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f24607a == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(f24585b, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f24607a = editText;
            int i = this.f24647n;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f24649p);
            }
            int i2 = this.f24648o;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f24650q);
            }
            this.f24640g = false;
            mo29200f0();
            setTextInputAccessibilityDelegate(new C4250e(this));
            this.f24615a.mo40340O0(this.f24607a.getTypeface());
            this.f24615a.mo40394w0(this.f24607a.getTextSize());
            this.f24615a.mo40384r0(this.f24607a.getLetterSpacing());
            int gravity = this.f24607a.getGravity();
            this.f24615a.mo40370k0((gravity & -113) | 48);
            this.f24615a.mo40392v0(gravity);
            this.f24607a.addTextChangedListener(new C4246a());
            if (this.f24633d == null) {
                this.f24633d = this.f24607a.getHintTextColors();
            }
            if (this.f24637e) {
                if (TextUtils.isEmpty(this.f24631c)) {
                    CharSequence hint = this.f24607a.getHint();
                    this.f24618a = hint;
                    setHint(hint);
                    this.f24607a.setHint((CharSequence) null);
                }
                this.f24639f = true;
            }
            if (this.f24609a != null) {
                mo29387z0(this.f24607a.getText());
            }
            mo29160D0();
            this.f24614a.mo36841f();
            this.f24616a.bringToFront();
            this.f24612a.bringToFront();
            mo29163F();
            this.f24612a.mo29473y0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo29170I0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f24631c)) {
            this.f24631c = charSequence;
            this.f24615a.mo40334L0(charSequence);
            if (!this.f24642i) {
                mo29201g0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f24635d != z) {
            if (z) {
                mo29258j();
            } else {
                mo29276p0();
                this.f24623b = null;
            }
            this.f24635d = z;
        }
    }

    /* renamed from: A */
    public final void mo29154A() {
        if (mo29159D()) {
            ((tc0) this.f24613a).mo44959Q0();
        }
    }

    /* renamed from: B */
    public final void mo29155B(boolean z) {
        ValueAnimator valueAnimator = this.f24600a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24600a.cancel();
        }
        if (!z || !this.f24644k) {
            this.f24615a.mo40400z0(1.0f);
        } else {
            mo29261l(1.0f);
        }
        this.f24642i = false;
        if (mo29159D()) {
            mo29201g0();
        }
        mo29173K0();
        this.f24616a.mo44167j(false);
        this.f24612a.mo29412I(false);
    }

    /* renamed from: B0 */
    public final void mo29156B0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f24609a;
        if (textView != null) {
            mo29280r0(textView, this.f24632c ? this.f24652s : this.f24653t);
            if (!this.f24632c && (colorStateList2 = this.f24620b) != null) {
                this.f24609a.setTextColor(colorStateList2);
            }
            if (this.f24632c && (colorStateList = this.f24628c) != null) {
                this.f24609a.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: C */
    public final Fade mo29157C() {
        Fade fade = new Fade();
        fade.mo6941q0(87);
        fade.mo6945s0(C1947d7.f10649a);
        return fade;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29158C0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f24607a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.mo29377u0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.onedelhi.secure.s24 r0 = r10.f24616a
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f24607a
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f24605a
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f24590D
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f24605a = r6
            r10.f24590D = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f24607a
            android.graphics.drawable.Drawable[] r0 = com.onedelhi.secure.jb4.m18321h(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f24605a
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f24607a
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            com.onedelhi.secure.jb4.m18336w(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f24605a
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f24607a
            android.graphics.drawable.Drawable[] r0 = com.onedelhi.secure.jb4.m18321h(r0)
            android.widget.EditText r6 = r10.f24607a
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            com.onedelhi.secure.jb4.m18336w(r6, r2, r7, r8, r0)
            r10.f24605a = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.mo29375t0()
            if (r6 == 0) goto L_0x00d9
            com.google.android.material.textfield.a r2 = r10.f24612a
            android.widget.TextView r2 = r2.mo29472y()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f24607a
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.a r6 = r10.f24612a
            com.google.android.material.internal.CheckableImageButton r6 = r6.mo29448m()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = com.onedelhi.secure.ld2.m20479c(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f24607a
            android.graphics.drawable.Drawable[] r6 = com.onedelhi.secure.jb4.m18321h(r6)
            android.graphics.drawable.Drawable r7 = r10.f24622b
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f24591E
            if (r8 == r2) goto L_0x00b3
            r10.f24591E = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f24607a
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f24622b
            r3 = r6[r3]
            com.onedelhi.secure.jb4.m18336w(r0, r1, r2, r4, r3)
            goto L_0x00fa
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f24622b = r7
            r10.f24591E = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f24622b
            if (r2 == r7) goto L_0x00d7
            r0 = r6[r4]
            r10.f24629c = r0
            android.widget.EditText r0 = r10.f24607a
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            com.onedelhi.secure.jb4.m18336w(r0, r1, r2, r7, r3)
            goto L_0x00fa
        L_0x00d7:
            r5 = r0
            goto L_0x00fa
        L_0x00d9:
            android.graphics.drawable.Drawable r6 = r10.f24622b
            if (r6 == 0) goto L_0x00fb
            android.widget.EditText r6 = r10.f24607a
            android.graphics.drawable.Drawable[] r6 = com.onedelhi.secure.jb4.m18321h(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f24622b
            if (r4 != r7) goto L_0x00f7
            android.widget.EditText r0 = r10.f24607a
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f24629c
            r3 = r6[r3]
            com.onedelhi.secure.jb4.m18336w(r0, r1, r4, r7, r3)
            goto L_0x00f8
        L_0x00f7:
            r5 = r0
        L_0x00f8:
            r10.f24622b = r2
        L_0x00fa:
            r0 = r5
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo29158C0():boolean");
    }

    /* renamed from: D */
    public final boolean mo29159D() {
        return this.f24637e && !TextUtils.isEmpty(this.f24631c) && (this.f24613a instanceof tc0);
    }

    /* renamed from: D0 */
    public void mo29160D0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f24607a;
        if (editText != null && this.f24656w == 0 && (background = editText.getBackground()) != null) {
            if (jp0.m18730a(background)) {
                background = background.mutate();
            }
            if (mo29282s0()) {
                currentTextColor = getErrorCurrentTextColors();
            } else if (!this.f24632c || (textView = this.f24609a) == null) {
                wo0.m30974c(background);
                this.f24607a.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C2416i8.m17331e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    @hw4
    /* renamed from: E */
    public boolean mo29161E() {
        return mo29159D() && ((tc0) this.f24613a).mo44958P0();
    }

    /* renamed from: E0 */
    public void mo29162E0() {
        EditText editText = this.f24607a;
        if (editText != null && this.f24613a != null) {
            if ((this.f24640g || editText.getBackground() == null) && this.f24656w != 0) {
                jt4.m18877I1(this.f24607a, getEditTextBoxBackground());
                this.f24640g = true;
            }
        }
    }

    /* renamed from: F */
    public final void mo29163F() {
        Iterator it = this.f24619a.iterator();
        while (it.hasNext()) {
            ((C4254i) it.next()).mo29395a(this);
        }
    }

    /* renamed from: F0 */
    public final boolean mo29164F0() {
        int max;
        if (this.f24607a == null || this.f24607a.getMeasuredHeight() >= (max = Math.max(this.f24612a.getMeasuredHeight(), this.f24616a.getMeasuredHeight()))) {
            return false;
        }
        this.f24607a.setMinimumHeight(max);
        return true;
    }

    /* renamed from: G */
    public final void mo29165G(Canvas canvas) {
        bf2 bf2;
        if (this.f24634d != null && (bf2 = this.f24630c) != null) {
            bf2.draw(canvas);
            if (this.f24607a.isFocused()) {
                Rect bounds = this.f24634d.getBounds();
                Rect bounds2 = this.f24630c.getBounds();
                float G = this.f24615a.mo40323G();
                int centerX = bounds2.centerX();
                bounds.left = C1947d7.m12987c(centerX, bounds2.left, G);
                bounds.right = C1947d7.m12987c(centerX, bounds2.right, G);
                this.f24634d.draw(canvas);
            }
        }
    }

    /* renamed from: G0 */
    public final void mo29166G0() {
        if (this.f24656w != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24608a.getLayoutParams();
            int v = mo29378v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f24608a.requestLayout();
            }
        }
    }

    /* renamed from: H */
    public final void mo29167H(@mr2 Canvas canvas) {
        if (this.f24637e) {
            this.f24615a.mo40371l(canvas);
        }
    }

    /* renamed from: H0 */
    public void mo29168H0(boolean z) {
        mo29170I0(z, false);
    }

    /* renamed from: I */
    public final void mo29169I(boolean z) {
        ValueAnimator valueAnimator = this.f24600a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24600a.cancel();
        }
        if (!z || !this.f24644k) {
            this.f24615a.mo40400z0(0.0f);
        } else {
            mo29261l(0.0f);
        }
        if (mo29159D() && ((tc0) this.f24613a).mo44958P0()) {
            mo29154A();
        }
        this.f24642i = true;
        mo29179O();
        this.f24616a.mo44167j(true);
        this.f24612a.mo29412I(true);
    }

    /* renamed from: I0 */
    public final void mo29170I0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        m00 m00;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f24607a;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f24607a;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f24633d;
        if (colorStateList2 != null) {
            this.f24615a.mo40368j0(colorStateList2);
            this.f24615a.mo40390u0(this.f24633d);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f24633d;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f24599M) : this.f24599M;
            this.f24615a.mo40368j0(ColorStateList.valueOf(colorForState));
            this.f24615a.mo40390u0(ColorStateList.valueOf(colorForState));
        } else if (mo29282s0()) {
            this.f24615a.mo40368j0(this.f24614a.mo36853r());
        } else {
            if (this.f24632c && (textView = this.f24609a) != null) {
                m00 = this.f24615a;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f24636e) != null) {
                m00 = this.f24615a;
            }
            m00.mo40368j0(colorStateList);
        }
        if (z3 || !this.f24643j || (isEnabled() && z4)) {
            if (z2 || this.f24642i) {
                mo29155B(z);
            }
        } else if (z2 || !this.f24642i) {
            mo29169I(z);
        }
    }

    /* renamed from: J */
    public final bf2 mo29171J(boolean z) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f24607a;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        uw3 m = uw3.m67443a().mo45838K(f).mo45843P(f).mo45855x(dimensionPixelOffset).mo45830C(dimensionPixelOffset).mo45845m();
        bf2 n = bf2.m39723n(getContext(), popupElevation);
        n.setShapeAppearanceModel(m);
        n.mo31631q0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return n;
    }

    /* renamed from: J0 */
    public final void mo29172J0() {
        EditText editText;
        if (this.f24623b != null && (editText = this.f24607a) != null) {
            this.f24623b.setGravity(editText.getGravity());
            this.f24623b.setPadding(this.f24607a.getCompoundPaddingLeft(), this.f24607a.getCompoundPaddingTop(), this.f24607a.getCompoundPaddingRight(), this.f24607a.getCompoundPaddingBottom());
        }
    }

    /* renamed from: K0 */
    public final void mo29173K0() {
        EditText editText = this.f24607a;
        mo29175L0(editText == null ? null : editText.getText());
    }

    /* renamed from: L */
    public final int mo29174L(int i, boolean z) {
        int compoundPaddingLeft = i + this.f24607a.getCompoundPaddingLeft();
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: L0 */
    public final void mo29175L0(@ts2 Editable editable) {
        if (this.f24611a.mo29394a(editable) != 0 || this.f24642i) {
            mo29179O();
        } else {
            mo29379v0();
        }
    }

    /* renamed from: M */
    public final int mo29176M(int i, boolean z) {
        int compoundPaddingRight = i - this.f24607a.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: M0 */
    public final void mo29177M0(boolean z, boolean z2) {
        int defaultColor = this.f24638f.getDefaultColor();
        int colorForState = this.f24638f.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f24638f.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f24588B = colorForState2;
        } else if (z2) {
            this.f24588B = colorForState;
        } else {
            this.f24588B = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f24607a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29178N0() {
        /*
            r5 = this;
            com.onedelhi.secure.bf2 r0 = r5.f24613a
            if (r0 == 0) goto L_0x00b4
            int r0 = r5.f24656w
            if (r0 != 0) goto L_0x000a
            goto L_0x00b4
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f24607a
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r5.f24607a
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r5.f24599M
        L_0x0039:
            r5.f24588B = r3
            goto L_0x006e
        L_0x003c:
            boolean r3 = r5.mo29282s0()
            if (r3 == 0) goto L_0x004f
            android.content.res.ColorStateList r3 = r5.f24638f
            if (r3 == 0) goto L_0x004a
        L_0x0046:
            r5.mo29177M0(r0, r1)
            goto L_0x006e
        L_0x004a:
            int r3 = r5.getErrorCurrentTextColors()
            goto L_0x0039
        L_0x004f:
            boolean r3 = r5.f24632c
            if (r3 == 0) goto L_0x0061
            android.widget.TextView r3 = r5.f24609a
            if (r3 == 0) goto L_0x0061
            android.content.res.ColorStateList r4 = r5.f24638f
            if (r4 == 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            int r3 = r3.getCurrentTextColor()
            goto L_0x0039
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            int r3 = r5.f24594H
            goto L_0x0039
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            int r3 = r5.f24593G
            goto L_0x0039
        L_0x006b:
            int r3 = r5.f24592F
            goto L_0x0039
        L_0x006e:
            com.google.android.material.textfield.a r3 = r5.f24612a
            r3.mo29413J()
            r5.mo29264m0()
            int r3 = r5.f24656w
            r4 = 2
            if (r3 != r4) goto L_0x0093
            int r3 = r5.f24658y
            if (r0 == 0) goto L_0x0088
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L_0x0088
            int r4 = r5.f24587A
            goto L_0x008a
        L_0x0088:
            int r4 = r5.f24659z
        L_0x008a:
            r5.f24658y = r4
            int r4 = r5.f24658y
            if (r4 == r3) goto L_0x0093
            r5.mo29257i0()
        L_0x0093:
            int r3 = r5.f24656w
            if (r3 != r2) goto L_0x00b1
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto L_0x00a2
            int r0 = r5.f24596J
        L_0x009f:
            r5.f24589C = r0
            goto L_0x00b1
        L_0x00a2:
            if (r1 == 0) goto L_0x00a9
            if (r0 != 0) goto L_0x00a9
            int r0 = r5.f24598L
            goto L_0x009f
        L_0x00a9:
            if (r0 == 0) goto L_0x00ae
            int r0 = r5.f24597K
            goto L_0x009f
        L_0x00ae:
            int r0 = r5.f24595I
            goto L_0x009f
        L_0x00b1:
            r5.mo29263m()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo29178N0():void");
    }

    /* renamed from: O */
    public final void mo29179O() {
        TextView textView = this.f24623b;
        if (textView != null && this.f24635d) {
            textView.setText((CharSequence) null);
            C1086j.m7185b(this.f24608a, this.f24624b);
            this.f24623b.setVisibility(4);
        }
    }

    /* renamed from: P */
    public boolean mo29180P() {
        return this.f24627b;
    }

    /* renamed from: Q */
    public boolean mo29181Q() {
        return this.f24612a.mo29407D();
    }

    /* renamed from: R */
    public boolean mo29182R() {
        return this.f24612a.mo29409F();
    }

    /* renamed from: S */
    public boolean mo29183S() {
        return this.f24614a.mo36822E();
    }

    /* renamed from: T */
    public boolean mo29184T() {
        return this.f24643j;
    }

    @hw4
    /* renamed from: U */
    public final boolean mo29185U() {
        return this.f24614a.mo36859x();
    }

    /* renamed from: V */
    public boolean mo29186V() {
        return this.f24614a.mo36823F();
    }

    /* renamed from: W */
    public boolean mo29187W() {
        return this.f24644k;
    }

    /* renamed from: X */
    public boolean mo29188X() {
        return this.f24637e;
    }

    /* renamed from: Y */
    public final boolean mo29189Y() {
        return this.f24642i;
    }

    @Deprecated
    /* renamed from: Z */
    public boolean mo29190Z() {
        return this.f24612a.mo29411H();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: a0 */
    public boolean mo29191a0() {
        return this.f24639f;
    }

    public void addView(@mr2 View view, int i, @mr2 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f24608a.addView(view, layoutParams2);
            this.f24608a.setLayoutParams(layoutParams);
            mo29166G0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b0 */
    public final boolean mo29193b0() {
        return this.f24656w == 1 && this.f24607a.getMinLines() <= 1;
    }

    /* renamed from: c0 */
    public boolean mo29194c0() {
        return this.f24616a.mo44165h();
    }

    /* renamed from: d0 */
    public boolean mo29195d0() {
        return this.f24616a.mo44166i();
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@mr2 ViewStructure viewStructure, int i) {
        EditText editText = this.f24607a;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f24618a != null) {
            boolean z = this.f24639f;
            this.f24639f = false;
            CharSequence hint = editText.getHint();
            this.f24607a.setHint(this.f24618a);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f24607a.setHint(hint);
                this.f24639f = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f24608a.getChildCount());
            for (int i2 = 0; i2 < this.f24608a.getChildCount(); i2++) {
                View childAt = this.f24608a.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f24607a) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(@mr2 SparseArray<Parcelable> sparseArray) {
        this.f24646m = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f24646m = false;
    }

    public void draw(@mr2 Canvas canvas) {
        super.draw(canvas);
        mo29167H(canvas);
        mo29165G(canvas);
    }

    public void drawableStateChanged() {
        if (!this.f24645l) {
            boolean z = true;
            this.f24645l = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            m00 m00 = this.f24615a;
            boolean J0 = m00 != null ? m00.mo40330J0(drawableState) | false : false;
            if (this.f24607a != null) {
                if (!jt4.m18914U0(this) || !isEnabled()) {
                    z = false;
                }
                mo29168H0(z);
            }
            mo29160D0();
            mo29178N0();
            if (J0) {
                invalidate();
            }
            this.f24645l = false;
        }
    }

    /* renamed from: f0 */
    public final void mo29200f0() {
        mo29275p();
        mo29162E0();
        mo29178N0();
        mo29381w0();
        mo29259k();
        if (this.f24656w != 0) {
            mo29166G0();
        }
        mo29278q0();
    }

    /* renamed from: g0 */
    public final void mo29201g0() {
        if (mo29159D()) {
            RectF rectF = this.f24603a;
            this.f24615a.mo40377o(rectF, this.f24607a.getWidth(), this.f24607a.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                mo29267o(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f24658y));
                ((tc0) this.f24613a).mo44961S0(rectF);
            }
        }
    }

    public int getBaseline() {
        EditText editText = this.f24607a;
        return editText != null ? editText.getBaseline() + getPaddingTop() + mo29378v() : super.getBaseline();
    }

    @mr2
    public bf2 getBoxBackground() {
        int i = this.f24656w;
        if (i == 1 || i == 2) {
            return this.f24613a;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f24589C;
    }

    public int getBoxBackgroundMode() {
        return this.f24656w;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f24657x;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (pv4.m61672l(this) ? this.f24617a.mo45813j() : this.f24617a.mo45815l()).mo32234a(this.f24603a);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (pv4.m61672l(this) ? this.f24617a.mo45815l() : this.f24617a.mo45813j()).mo32234a(this.f24603a);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (pv4.m61672l(this) ? this.f24617a.mo45820r() : this.f24617a.mo45822t()).mo32234a(this.f24603a);
    }

    public float getBoxCornerRadiusTopStart() {
        return (pv4.m61672l(this) ? this.f24617a.mo45822t() : this.f24617a.mo45820r()).mo32234a(this.f24603a);
    }

    public int getBoxStrokeColor() {
        return this.f24594H;
    }

    @ts2
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f24638f;
    }

    public int getBoxStrokeWidth() {
        return this.f24659z;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f24587A;
    }

    public int getCounterMaxLength() {
        return this.f24651r;
    }

    @ts2
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f24627b || !this.f24632c || (textView = this.f24609a) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    @ts2
    public ColorStateList getCounterOverflowTextColor() {
        return this.f24620b;
    }

    @ts2
    public ColorStateList getCounterTextColor() {
        return this.f24620b;
    }

    @ts2
    public ColorStateList getDefaultHintTextColor() {
        return this.f24633d;
    }

    @ts2
    public EditText getEditText() {
        return this.f24607a;
    }

    @ts2
    public CharSequence getEndIconContentDescription() {
        return this.f24612a.mo29450n();
    }

    @ts2
    public Drawable getEndIconDrawable() {
        return this.f24612a.mo29454p();
    }

    public int getEndIconMode() {
        return this.f24612a.mo29456q();
    }

    @mr2
    public CheckableImageButton getEndIconView() {
        return this.f24612a.mo29458r();
    }

    @ts2
    public CharSequence getError() {
        if (this.f24614a.mo36822E()) {
            return this.f24614a.mo36851p();
        }
        return null;
    }

    @ts2
    public CharSequence getErrorContentDescription() {
        return this.f24614a.mo36850o();
    }

    @d10
    public int getErrorCurrentTextColors() {
        return this.f24614a.mo36852q();
    }

    @ts2
    public Drawable getErrorIconDrawable() {
        return this.f24612a.mo29460s();
    }

    @ts2
    public CharSequence getHelperText() {
        if (this.f24614a.mo36823F()) {
            return this.f24614a.mo36854s();
        }
        return null;
    }

    @d10
    public int getHelperTextCurrentTextColor() {
        return this.f24614a.mo36857v();
    }

    @ts2
    public CharSequence getHint() {
        if (this.f24637e) {
            return this.f24631c;
        }
        return null;
    }

    @hw4
    public final float getHintCollapsedTextHeight() {
        return this.f24615a.mo40383r();
    }

    @hw4
    public final int getHintCurrentCollapsedTextColor() {
        return this.f24615a.mo40393w();
    }

    @ts2
    public ColorStateList getHintTextColor() {
        return this.f24636e;
    }

    @mr2
    public C4253h getLengthCounter() {
        return this.f24611a;
    }

    public int getMaxEms() {
        return this.f24648o;
    }

    @e83
    public int getMaxWidth() {
        return this.f24650q;
    }

    public int getMinEms() {
        return this.f24647n;
    }

    @e83
    public int getMinWidth() {
        return this.f24649p;
    }

    @ts2
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f24612a.mo29464u();
    }

    @ts2
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f24612a.mo29466v();
    }

    @ts2
    public CharSequence getPlaceholderText() {
        if (this.f24635d) {
            return this.f24626b;
        }
        return null;
    }

    @e64
    public int getPlaceholderTextAppearance() {
        return this.f24654u;
    }

    @ts2
    public ColorStateList getPlaceholderTextColor() {
        return this.f24601a;
    }

    @ts2
    public CharSequence getPrefixText() {
        return this.f24616a.mo44158a();
    }

    @ts2
    public ColorStateList getPrefixTextColor() {
        return this.f24616a.mo44159b();
    }

    @mr2
    public TextView getPrefixTextView() {
        return this.f24616a.mo44160c();
    }

    @ts2
    public CharSequence getStartIconContentDescription() {
        return this.f24616a.mo44161d();
    }

    @ts2
    public Drawable getStartIconDrawable() {
        return this.f24616a.mo44162e();
    }

    @ts2
    public CharSequence getSuffixText() {
        return this.f24612a.mo29468w();
    }

    @ts2
    public ColorStateList getSuffixTextColor() {
        return this.f24612a.mo29470x();
    }

    @mr2
    public TextView getSuffixTextView() {
        return this.f24612a.mo29472y();
    }

    @ts2
    public Typeface getTypeface() {
        return this.f24604a;
    }

    /* renamed from: h */
    public void mo29254h(@mr2 C4254i iVar) {
        this.f24619a.add(iVar);
        if (this.f24607a != null) {
            iVar.mo29395a(this);
        }
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo29255h0(boolean z) {
        this.f24612a.mo29467v0(z);
    }

    /* renamed from: i */
    public void mo29256i(@mr2 C4255j jVar) {
        this.f24612a.mo29436g(jVar);
    }

    /* renamed from: i0 */
    public final void mo29257i0() {
        if (mo29159D() && !this.f24642i) {
            mo29154A();
            mo29201g0();
        }
    }

    /* renamed from: j */
    public final void mo29258j() {
        TextView textView = this.f24623b;
        if (textView != null) {
            this.f24608a.addView(textView);
            this.f24623b.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final void mo29259k() {
        EditText editText;
        int k0;
        int dimensionPixelSize;
        int j0;
        Resources resources;
        int i;
        if (this.f24607a != null && this.f24656w == 1) {
            if (af2.m38619j(getContext())) {
                editText = this.f24607a;
                k0 = jt4.m18972k0(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(fd3.C2156f.material_filled_edittext_font_2_0_padding_top);
                j0 = jt4.m18968j0(this.f24607a);
                resources = getResources();
                i = fd3.C2156f.material_filled_edittext_font_2_0_padding_bottom;
            } else if (af2.m38618i(getContext())) {
                editText = this.f24607a;
                k0 = jt4.m18972k0(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(fd3.C2156f.material_filled_edittext_font_1_3_padding_top);
                j0 = jt4.m18968j0(this.f24607a);
                resources = getResources();
                i = fd3.C2156f.material_filled_edittext_font_1_3_padding_bottom;
            } else {
                return;
            }
            jt4.m18946d2(editText, k0, dimensionPixelSize, j0, resources.getDimensionPixelSize(i));
        }
    }

    /* renamed from: k0 */
    public void mo29260k0() {
        this.f24612a.mo29414K();
    }

    @hw4
    /* renamed from: l */
    public void mo29261l(float f) {
        if (this.f24615a.mo40323G() != f) {
            if (this.f24600a == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f24600a = valueAnimator;
                valueAnimator.setInterpolator(C1947d7.f10650b);
                this.f24600a.setDuration(167);
                this.f24600a.addUpdateListener(new C4249d());
            }
            this.f24600a.setFloatValues(new float[]{this.f24615a.mo40323G(), f});
            this.f24600a.start();
        }
    }

    /* renamed from: l0 */
    public void mo29262l0() {
        this.f24612a.mo29415L();
    }

    /* renamed from: m */
    public final void mo29263m() {
        bf2 bf2 = this.f24613a;
        if (bf2 != null) {
            uw3 shapeAppearanceModel = bf2.getShapeAppearanceModel();
            uw3 uw3 = this.f24617a;
            if (shapeAppearanceModel != uw3) {
                this.f24613a.setShapeAppearanceModel(uw3);
            }
            if (mo29380w()) {
                this.f24613a.mo31566D0((float) this.f24658y, this.f24588B);
            }
            int q = mo29277q();
            this.f24589C = q;
            this.f24613a.mo31626o0(ColorStateList.valueOf(q));
            mo29265n();
            mo29162E0();
        }
    }

    /* renamed from: m0 */
    public void mo29264m0() {
        this.f24616a.mo44168k();
    }

    /* renamed from: n */
    public final void mo29265n() {
        if (this.f24630c != null && this.f24634d != null) {
            if (mo29382x()) {
                this.f24630c.mo31626o0(ColorStateList.valueOf(this.f24607a.isFocused() ? this.f24592F : this.f24588B));
                this.f24634d.mo31626o0(ColorStateList.valueOf(this.f24588B));
            }
            invalidate();
        }
    }

    /* renamed from: n0 */
    public void mo29266n0(@mr2 C4254i iVar) {
        this.f24619a.remove(iVar);
    }

    /* renamed from: o */
    public final void mo29267o(@mr2 RectF rectF) {
        float f = rectF.left;
        int i = this.f24655v;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: o0 */
    public void mo29268o0(@mr2 C4255j jVar) {
        this.f24612a.mo29417N(jVar);
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24615a.mo40351a0(configuration);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f24607a;
        if (editText != null) {
            Rect rect = this.f24602a;
            bk0.m40127a(this, editText, rect);
            mo29383x0(rect);
            if (this.f24637e) {
                this.f24615a.mo40394w0(this.f24607a.getTextSize());
                int gravity = this.f24607a.getGravity();
                this.f24615a.mo40370k0((gravity & -113) | 48);
                this.f24615a.mo40392v0(gravity);
                this.f24615a.mo40362g0(mo29279r(rect));
                this.f24615a.mo40382q0(mo29376u(rect));
                this.f24615a.mo40355c0();
                if (mo29159D() && !this.f24642i) {
                    mo29201g0();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean F0 = mo29164F0();
        boolean C0 = mo29158C0();
        if (F0 || C0) {
            this.f24607a.post(new C4248c());
        }
        mo29172J0();
        this.f24612a.mo29473y0();
    }

    public void onRestoreInstanceState(@ts2 Parcelable parcelable) {
        if (!(parcelable instanceof C4256k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4256k kVar = (C4256k) parcelable;
        super.onRestoreInstanceState(kVar.mo14959a());
        setError(kVar.f24665a);
        if (kVar.f24666b) {
            post(new C4247b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f24641h;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float a = this.f24617a.mo45820r().mo32234a(this.f24603a);
            float a2 = this.f24617a.mo45822t().mo32234a(this.f24603a);
            float a3 = this.f24617a.mo45813j().mo32234a(this.f24603a);
            float a4 = this.f24617a.mo45815l().mo32234a(this.f24603a);
            float f = z ? a : a2;
            if (z) {
                a = a2;
            }
            float f2 = z ? a3 : a4;
            if (z) {
                a3 = a4;
            }
            setBoxCornerRadii(f, a, f2, a3);
        }
    }

    @ts2
    public Parcelable onSaveInstanceState() {
        C4256k kVar = new C4256k(super.onSaveInstanceState());
        if (mo29282s0()) {
            kVar.f24665a = getError();
        }
        kVar.f24666b = this.f24612a.mo29408E();
        return kVar;
    }

    /* renamed from: p */
    public final void mo29275p() {
        int i = this.f24656w;
        if (i == 0) {
            this.f24613a = null;
        } else if (i == 1) {
            this.f24613a = new bf2(this.f24617a);
            this.f24630c = new bf2();
            this.f24634d = new bf2();
            return;
        } else if (i == 2) {
            this.f24613a = (!this.f24637e || (this.f24613a instanceof tc0)) ? new bf2(this.f24617a) : new tc0(this.f24617a);
        } else {
            throw new IllegalArgumentException(this.f24656w + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f24630c = null;
        this.f24634d = null;
    }

    /* renamed from: p0 */
    public final void mo29276p0() {
        TextView textView = this.f24623b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: q */
    public final int mo29277q() {
        return this.f24656w == 1 ? oe2.m23727m(oe2.m23719e(this, fd3.C2153c.colorSurface, 0), this.f24589C) : this.f24589C;
    }

    /* renamed from: q0 */
    public final void mo29278q0() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f24607a;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.f24656w;
                if (i == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    @mr2
    /* renamed from: r */
    public final Rect mo29279r(@mr2 Rect rect) {
        int i;
        int i2;
        if (this.f24607a != null) {
            Rect rect2 = this.f24621b;
            boolean l = pv4.m61672l(this);
            rect2.bottom = rect.bottom;
            int i3 = this.f24656w;
            if (i3 == 1) {
                rect2.left = mo29174L(rect.left, l);
                i = rect.top + this.f24657x;
            } else if (i3 != 2) {
                rect2.left = mo29174L(rect.left, l);
                i = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f24607a.getPaddingLeft();
                rect2.top = rect.top - mo29378v();
                i2 = rect.right - this.f24607a.getPaddingRight();
                rect2.right = i2;
                return rect2;
            }
            rect2.top = i;
            i2 = mo29176M(rect.right, l);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r0 */
    public void mo29280r0(@mr2 TextView textView, @e64 int i) {
        boolean z = true;
        try {
            jb4.m18310E(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            jb4.m18310E(textView, fd3.C2164n.TextAppearance_AppCompat_Caption);
            textView.setTextColor(r70.m26353f(getContext(), fd3.C2155e.design_error));
        }
    }

    /* renamed from: s */
    public final int mo29281s(@mr2 Rect rect, @mr2 Rect rect2, float f) {
        return mo29193b0() ? (int) (((float) rect2.top) + f) : rect.bottom - this.f24607a.getCompoundPaddingBottom();
    }

    /* renamed from: s0 */
    public boolean mo29282s0() {
        return this.f24614a.mo36848m();
    }

    public void setBoxBackgroundColor(@d10 int i) {
        if (this.f24589C != i) {
            this.f24589C = i;
            this.f24595I = i;
            this.f24597K = i;
            this.f24598L = i;
            mo29263m();
        }
    }

    public void setBoxBackgroundColorResource(@k10 int i) {
        setBoxBackgroundColor(r70.m26353f(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@mr2 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f24595I = defaultColor;
        this.f24589C = defaultColor;
        this.f24596J = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f24597K = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f24598L = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo29263m();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f24656w) {
            this.f24656w = i;
            if (this.f24607a != null) {
                mo29200f0();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f24657x = i;
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean l = pv4.m61672l(this);
        this.f24641h = l;
        float f5 = l ? f2 : f;
        if (!l) {
            f = f2;
        }
        float f6 = l ? f4 : f3;
        if (!l) {
            f3 = f4;
        }
        bf2 bf2 = this.f24613a;
        if (bf2 == null || bf2.mo31592S() != f5 || this.f24613a.mo31593T() != f || this.f24613a.mo31636t() != f6 || this.f24613a.mo31638u() != f3) {
            this.f24617a = this.f24617a.mo45824v().mo45838K(f5).mo45843P(f).mo45855x(f6).mo45830C(f3).mo45845m();
            mo29263m();
        }
    }

    public void setBoxCornerRadiiResources(@yk0 int i, @yk0 int i2, @yk0 int i3, @yk0 int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(@d10 int i) {
        if (this.f24594H != i) {
            this.f24594H = i;
            mo29178N0();
        }
    }

    public void setBoxStrokeColorStateList(@mr2 ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f24592F = colorStateList.getDefaultColor();
            this.f24599M = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f24593G = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f24594H != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo29178N0();
        }
        this.f24594H = defaultColor;
        mo29178N0();
    }

    public void setBoxStrokeErrorColor(@ts2 ColorStateList colorStateList) {
        if (this.f24638f != colorStateList) {
            this.f24638f = colorStateList;
            mo29178N0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f24659z = i;
        mo29178N0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f24587A = i;
        mo29178N0();
    }

    public void setBoxStrokeWidthFocusedResource(@yk0 int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@yk0 int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f24627b != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f24609a = appCompatTextView;
                appCompatTextView.setId(fd3.C2158h.textinput_counter);
                Typeface typeface = this.f24604a;
                if (typeface != null) {
                    this.f24609a.setTypeface(typeface);
                }
                this.f24609a.setMaxLines(1);
                this.f24614a.mo36840e(this.f24609a, 2);
                ld2.m20484h((ViewGroup.MarginLayoutParams) this.f24609a.getLayoutParams(), getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_textinput_counter_margin_start));
                mo29156B0();
                mo29385y0();
            } else {
                this.f24614a.mo36824G(this.f24609a, 2);
                this.f24609a = null;
            }
            this.f24627b = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f24651r != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f24651r = i;
            if (this.f24627b) {
                mo29385y0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f24652s != i) {
            this.f24652s = i;
            mo29156B0();
        }
    }

    public void setCounterOverflowTextColor(@ts2 ColorStateList colorStateList) {
        if (this.f24628c != colorStateList) {
            this.f24628c = colorStateList;
            mo29156B0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f24653t != i) {
            this.f24653t = i;
            mo29156B0();
        }
    }

    public void setCounterTextColor(@ts2 ColorStateList colorStateList) {
        if (this.f24620b != colorStateList) {
            this.f24620b = colorStateList;
            mo29156B0();
        }
    }

    public void setDefaultHintTextColor(@ts2 ColorStateList colorStateList) {
        this.f24633d = colorStateList;
        this.f24636e = colorStateList;
        if (this.f24607a != null) {
            mo29168H0(false);
        }
    }

    public void setEnabled(boolean z) {
        m34202j0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f24612a.mo29419P(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f24612a.mo29420Q(z);
    }

    public void setEndIconContentDescription(@e54 int i) {
        this.f24612a.mo29421R(i);
    }

    public void setEndIconContentDescription(@ts2 CharSequence charSequence) {
        this.f24612a.mo29422S(charSequence);
    }

    public void setEndIconDrawable(@dp0 int i) {
        this.f24612a.mo29423T(i);
    }

    public void setEndIconDrawable(@ts2 Drawable drawable) {
        this.f24612a.mo29424U(drawable);
    }

    public void setEndIconMode(int i) {
        this.f24612a.mo29425V(i);
    }

    public void setEndIconOnClickListener(@ts2 View.OnClickListener onClickListener) {
        this.f24612a.mo29426W(onClickListener);
    }

    public void setEndIconOnLongClickListener(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f24612a.mo29427X(onLongClickListener);
    }

    public void setEndIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24612a.mo29428Y(colorStateList);
    }

    public void setEndIconTintMode(@ts2 PorterDuff.Mode mode) {
        this.f24612a.mo29429Z(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.f24612a.mo29430a0(z);
    }

    public void setError(@ts2 CharSequence charSequence) {
        if (!this.f24614a.mo36822E()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f24614a.mo36837T(charSequence);
        } else {
            this.f24614a.mo36861z();
        }
    }

    public void setErrorContentDescription(@ts2 CharSequence charSequence) {
        this.f24614a.mo36826I(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f24614a.mo36827J(z);
    }

    public void setErrorIconDrawable(@dp0 int i) {
        this.f24612a.mo29431b0(i);
    }

    public void setErrorIconDrawable(@ts2 Drawable drawable) {
        this.f24612a.mo29432c0(drawable);
    }

    public void setErrorIconOnClickListener(@ts2 View.OnClickListener onClickListener) {
        this.f24612a.mo29433d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f24612a.mo29434e0(onLongClickListener);
    }

    public void setErrorIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24612a.mo29435f0(colorStateList);
    }

    public void setErrorIconTintMode(@ts2 PorterDuff.Mode mode) {
        this.f24612a.mo29437g0(mode);
    }

    public void setErrorTextAppearance(@e64 int i) {
        this.f24614a.mo36828K(i);
    }

    public void setErrorTextColor(@ts2 ColorStateList colorStateList) {
        this.f24614a.mo36829L(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f24643j != z) {
            this.f24643j = z;
            mo29168H0(false);
        }
    }

    public void setHelperText(@ts2 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo29186V()) {
                setHelperTextEnabled(true);
            }
            this.f24614a.mo36838U(charSequence);
        } else if (mo29186V()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@ts2 ColorStateList colorStateList) {
        this.f24614a.mo36832O(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f24614a.mo36831N(z);
    }

    public void setHelperTextTextAppearance(@e64 int i) {
        this.f24614a.mo36830M(i);
    }

    public void setHint(@e54 int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(@ts2 CharSequence charSequence) {
        if (this.f24637e) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f24644k = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f24637e) {
            this.f24637e = z;
            if (!z) {
                this.f24639f = false;
                if (!TextUtils.isEmpty(this.f24631c) && TextUtils.isEmpty(this.f24607a.getHint())) {
                    this.f24607a.setHint(this.f24631c);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f24607a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f24631c)) {
                        setHint(hint);
                    }
                    this.f24607a.setHint((CharSequence) null);
                }
                this.f24639f = true;
            }
            if (this.f24607a != null) {
                mo29166G0();
            }
        }
    }

    public void setHintTextAppearance(@e64 int i) {
        this.f24615a.mo40364h0(i);
        this.f24636e = this.f24615a.mo40379p();
        if (this.f24607a != null) {
            mo29168H0(false);
            mo29166G0();
        }
    }

    public void setHintTextColor(@ts2 ColorStateList colorStateList) {
        if (this.f24636e != colorStateList) {
            if (this.f24633d == null) {
                this.f24615a.mo40368j0(colorStateList);
            }
            this.f24636e = colorStateList;
            if (this.f24607a != null) {
                mo29168H0(false);
            }
        }
    }

    public void setLengthCounter(@mr2 C4253h hVar) {
        this.f24611a = hVar;
    }

    public void setMaxEms(int i) {
        this.f24648o = i;
        EditText editText = this.f24607a;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(@e83 int i) {
        this.f24650q = i;
        EditText editText = this.f24607a;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(@yk0 int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f24647n = i;
        EditText editText = this.f24607a;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(@e83 int i) {
        this.f24649p = i;
        EditText editText = this.f24607a;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(@yk0 int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@e54 int i) {
        this.f24612a.mo29441i0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@ts2 CharSequence charSequence) {
        this.f24612a.mo29443j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@dp0 int i) {
        this.f24612a.mo29445k0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@ts2 Drawable drawable) {
        this.f24612a.mo29447l0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.f24612a.mo29449m0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@ts2 ColorStateList colorStateList) {
        this.f24612a.mo29451n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@ts2 PorterDuff.Mode mode) {
        this.f24612a.mo29453o0(mode);
    }

    public void setPlaceholderText(@ts2 CharSequence charSequence) {
        if (this.f24623b == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f24623b = appCompatTextView;
            appCompatTextView.setId(fd3.C2158h.textinput_placeholder);
            jt4.m18906R1(this.f24623b, 2);
            Fade C = mo29157C();
            this.f24610a = C;
            C.mo6955x0(67);
            this.f24624b = mo29157C();
            setPlaceholderTextAppearance(this.f24654u);
            setPlaceholderTextColor(this.f24601a);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f24635d) {
                setPlaceholderTextEnabled(true);
            }
            this.f24626b = charSequence;
        }
        mo29173K0();
    }

    public void setPlaceholderTextAppearance(@e64 int i) {
        this.f24654u = i;
        TextView textView = this.f24623b;
        if (textView != null) {
            jb4.m18310E(textView, i);
        }
    }

    public void setPlaceholderTextColor(@ts2 ColorStateList colorStateList) {
        if (this.f24601a != colorStateList) {
            this.f24601a = colorStateList;
            TextView textView = this.f24623b;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@ts2 CharSequence charSequence) {
        this.f24616a.mo44169l(charSequence);
    }

    public void setPrefixTextAppearance(@e64 int i) {
        this.f24616a.mo44170m(i);
    }

    public void setPrefixTextColor(@mr2 ColorStateList colorStateList) {
        this.f24616a.mo44171n(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f24616a.mo44172o(z);
    }

    public void setStartIconContentDescription(@e54 int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(@ts2 CharSequence charSequence) {
        this.f24616a.mo44174p(charSequence);
    }

    public void setStartIconDrawable(@dp0 int i) {
        setStartIconDrawable(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    public void setStartIconDrawable(@ts2 Drawable drawable) {
        this.f24616a.mo44175q(drawable);
    }

    public void setStartIconOnClickListener(@ts2 View.OnClickListener onClickListener) {
        this.f24616a.mo44176r(onClickListener);
    }

    public void setStartIconOnLongClickListener(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f24616a.mo44177s(onLongClickListener);
    }

    public void setStartIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24616a.mo44178t(colorStateList);
    }

    public void setStartIconTintMode(@ts2 PorterDuff.Mode mode) {
        this.f24616a.mo44179u(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f24616a.mo44180v(z);
    }

    public void setSuffixText(@ts2 CharSequence charSequence) {
        this.f24612a.mo29455p0(charSequence);
    }

    public void setSuffixTextAppearance(@e64 int i) {
        this.f24612a.mo29457q0(i);
    }

    public void setSuffixTextColor(@mr2 ColorStateList colorStateList) {
        this.f24612a.mo29459r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@ts2 C4250e eVar) {
        EditText editText = this.f24607a;
        if (editText != null) {
            jt4.m18849B1(editText, eVar);
        }
    }

    public void setTypeface(@ts2 Typeface typeface) {
        if (typeface != this.f24604a) {
            this.f24604a = typeface;
            this.f24615a.mo40340O0(typeface);
            this.f24614a.mo36834Q(typeface);
            TextView textView = this.f24609a;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final int mo29374t(@mr2 Rect rect, float f) {
        return mo29193b0() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f24607a.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    public final boolean mo29375t0() {
        return (this.f24612a.mo29410G() || ((this.f24612a.mo29474z() && mo29182R()) || this.f24612a.mo29468w() != null)) && this.f24612a.getMeasuredWidth() > 0;
    }

    @mr2
    /* renamed from: u */
    public final Rect mo29376u(@mr2 Rect rect) {
        if (this.f24607a != null) {
            Rect rect2 = this.f24621b;
            float D = this.f24615a.mo40317D();
            rect2.left = rect.left + this.f24607a.getCompoundPaddingLeft();
            rect2.top = mo29374t(rect, D);
            rect2.right = rect.right - this.f24607a.getCompoundPaddingRight();
            rect2.bottom = mo29281s(rect, rect2, D);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    public final boolean mo29377u0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f24616a.getMeasuredWidth() > 0;
    }

    /* renamed from: v */
    public final int mo29378v() {
        float r;
        if (!this.f24637e) {
            return 0;
        }
        int i = this.f24656w;
        if (i == 0) {
            r = this.f24615a.mo40383r();
        } else if (i != 2) {
            return 0;
        } else {
            r = this.f24615a.mo40383r() / 2.0f;
        }
        return (int) r;
    }

    /* renamed from: v0 */
    public final void mo29379v0() {
        if (this.f24623b != null && this.f24635d && !TextUtils.isEmpty(this.f24626b)) {
            this.f24623b.setText(this.f24626b);
            C1086j.m7185b(this.f24608a, this.f24610a);
            this.f24623b.setVisibility(0);
            this.f24623b.bringToFront();
            announceForAccessibility(this.f24626b);
        }
    }

    /* renamed from: w */
    public final boolean mo29380w() {
        return this.f24656w == 2 && mo29382x();
    }

    /* renamed from: w0 */
    public final void mo29381w0() {
        Resources resources;
        int i;
        if (this.f24656w == 1) {
            if (af2.m38619j(getContext())) {
                resources = getResources();
                i = fd3.C2156f.material_font_2_0_box_collapsed_padding_top;
            } else if (af2.m38618i(getContext())) {
                resources = getResources();
                i = fd3.C2156f.material_font_1_3_box_collapsed_padding_top;
            } else {
                return;
            }
            this.f24657x = resources.getDimensionPixelSize(i);
        }
    }

    /* renamed from: x */
    public final boolean mo29382x() {
        return this.f24658y > -1 && this.f24588B != 0;
    }

    /* renamed from: x0 */
    public final void mo29383x0(@mr2 Rect rect) {
        bf2 bf2 = this.f24630c;
        if (bf2 != null) {
            int i = rect.bottom;
            bf2.setBounds(rect.left, i - this.f24659z, rect.right, i);
        }
        bf2 bf22 = this.f24634d;
        if (bf22 != null) {
            int i2 = rect.bottom;
            bf22.setBounds(rect.left, i2 - this.f24587A, rect.right, i2);
        }
    }

    /* renamed from: y */
    public void mo29384y() {
        this.f24619a.clear();
    }

    /* renamed from: y0 */
    public final void mo29385y0() {
        if (this.f24609a != null) {
            EditText editText = this.f24607a;
            mo29387z0(editText == null ? null : editText.getText());
        }
    }

    /* renamed from: z */
    public void mo29386z() {
        this.f24612a.mo29442j();
    }

    /* renamed from: z0 */
    public void mo29387z0(@ts2 Editable editable) {
        int a = this.f24611a.mo29394a(editable);
        boolean z = this.f24632c;
        int i = this.f24651r;
        if (i == -1) {
            this.f24609a.setText(String.valueOf(a));
            this.f24609a.setContentDescription((CharSequence) null);
            this.f24632c = false;
        } else {
            this.f24632c = a > i;
            m34191A0(getContext(), this.f24609a, a, this.f24651r, this.f24632c);
            if (z != this.f24632c) {
                mo29156B0();
            }
            this.f24609a.setText(C3155pk.m24758c().mo22479q(getContext().getString(fd3.C2163m.character_counter_pattern, new Object[]{Integer.valueOf(a), Integer.valueOf(this.f24651r)})));
        }
        if (this.f24607a != null && z != this.f24632c) {
            mo29168H0(false);
            mo29178N0();
            mo29160D0();
        }
    }
}
