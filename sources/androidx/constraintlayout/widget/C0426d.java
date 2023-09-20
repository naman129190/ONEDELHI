package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.onedelhi.secure.a13;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.dv0;
import com.onedelhi.secure.ml1;
import com.onedelhi.secure.mx0;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.ur0;
import com.onedelhi.secure.ve0;
import com.onedelhi.secure.vf4;
import com.onedelhi.secure.yz1;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0426d {

    /* renamed from: A */
    public static final int f2750A = 3;

    /* renamed from: A0 */
    public static final int f2751A0 = 41;

    /* renamed from: A1 */
    public static final int f2752A1 = 93;

    /* renamed from: B */
    public static final int f2753B = 4;

    /* renamed from: B0 */
    public static final int f2754B0 = 42;

    /* renamed from: B1 */
    public static final int f2755B1 = 94;

    /* renamed from: C */
    public static final int f2756C = 5;

    /* renamed from: C0 */
    public static final int f2757C0 = 43;

    /* renamed from: C1 */
    public static final int f2758C1 = 95;

    /* renamed from: D */
    public static final int f2759D = 6;

    /* renamed from: D0 */
    public static final int f2760D0 = 44;

    /* renamed from: D1 */
    public static final int f2761D1 = 96;

    /* renamed from: E */
    public static final int f2762E = 7;

    /* renamed from: E0 */
    public static final int f2763E0 = 45;

    /* renamed from: E1 */
    public static final int f2764E1 = 97;

    /* renamed from: F */
    public static final int f2765F = 8;

    /* renamed from: F0 */
    public static final int f2766F0 = 46;

    /* renamed from: F1 */
    public static final int f2767F1 = 98;

    /* renamed from: G */
    public static final int f2768G = 0;

    /* renamed from: G0 */
    public static final int f2769G0 = 47;

    /* renamed from: G1 */
    public static final int f2770G1 = 99;

    /* renamed from: H */
    public static final int f2771H = 1;

    /* renamed from: H0 */
    public static final int f2772H0 = 48;

    /* renamed from: I */
    public static final int f2773I = 0;

    /* renamed from: I0 */
    public static final int f2774I0 = 49;

    /* renamed from: J */
    public static final int f2775J = 1;

    /* renamed from: J0 */
    public static final int f2776J0 = 50;

    /* renamed from: K */
    public static final int f2777K = 2;

    /* renamed from: K0 */
    public static final int f2778K0 = 51;

    /* renamed from: L */
    public static final int f2779L = 1;

    /* renamed from: L0 */
    public static final int f2780L0 = 52;

    /* renamed from: M */
    public static final int f2781M = 1;

    /* renamed from: M0 */
    public static final int f2782M0 = 53;

    /* renamed from: N */
    public static final int f2783N = 2;

    /* renamed from: N0 */
    public static final int f2784N0 = 54;

    /* renamed from: O */
    public static final int f2785O = 3;

    /* renamed from: O0 */
    public static final int f2786O0 = 55;

    /* renamed from: P */
    public static final int f2787P = 4;

    /* renamed from: P0 */
    public static final int f2788P0 = 56;

    /* renamed from: Q */
    public static final int f2789Q = 5;

    /* renamed from: Q0 */
    public static final int f2790Q0 = 57;

    /* renamed from: R */
    public static final int f2791R = 6;

    /* renamed from: R0 */
    public static final int f2792R0 = 58;

    /* renamed from: S */
    public static final int f2793S = 7;

    /* renamed from: S0 */
    public static final int f2794S0 = 59;

    /* renamed from: T */
    public static final int f2795T = 8;

    /* renamed from: T0 */
    public static final int f2796T0 = 60;

    /* renamed from: U */
    public static final int f2797U = 9;

    /* renamed from: U0 */
    public static final int f2798U0 = 61;

    /* renamed from: V */
    public static final int f2799V = 10;

    /* renamed from: V0 */
    public static final int f2800V0 = 62;

    /* renamed from: W */
    public static final int f2801W = 11;

    /* renamed from: W0 */
    public static final int f2802W0 = 63;

    /* renamed from: X */
    public static final int f2803X = 12;

    /* renamed from: X0 */
    public static final int f2804X0 = 64;

    /* renamed from: Y */
    public static final int f2805Y = 13;

    /* renamed from: Y0 */
    public static final int f2806Y0 = 65;

    /* renamed from: Z */
    public static final int f2807Z = 14;

    /* renamed from: Z0 */
    public static final int f2808Z0 = 66;

    /* renamed from: a */
    public static SparseIntArray f2809a = new SparseIntArray();

    /* renamed from: a */
    public static final int[] f2810a = {0, 4, 8};

    /* renamed from: a0 */
    public static final int f2811a0 = 15;

    /* renamed from: a1 */
    public static final int f2812a1 = 67;

    /* renamed from: b */
    public static final int f2813b = -1;

    /* renamed from: b */
    public static SparseIntArray f2814b = new SparseIntArray();

    /* renamed from: b0 */
    public static final int f2815b0 = 16;

    /* renamed from: b1 */
    public static final int f2816b1 = 68;

    /* renamed from: c */
    public static final int f2817c = -2;

    /* renamed from: c */
    public static final String f2818c = "ConstraintSet";

    /* renamed from: c */
    public static final boolean f2819c = false;

    /* renamed from: c0 */
    public static final int f2820c0 = 17;

    /* renamed from: c1 */
    public static final int f2821c1 = 69;

    /* renamed from: d */
    public static final int f2822d = -3;

    /* renamed from: d */
    public static final String f2823d = "XML parser error must be within a Constraint ";

    /* renamed from: d0 */
    public static final int f2824d0 = 18;

    /* renamed from: d1 */
    public static final int f2825d1 = 70;

    /* renamed from: e */
    public static final int f2826e = -4;

    /* renamed from: e */
    public static final String f2827e = "weight";

    /* renamed from: e0 */
    public static final int f2828e0 = 19;

    /* renamed from: e1 */
    public static final int f2829e1 = 71;

    /* renamed from: f */
    public static final int f2830f = 0;

    /* renamed from: f */
    public static final String f2831f = "ratio";

    /* renamed from: f0 */
    public static final int f2832f0 = 20;

    /* renamed from: f1 */
    public static final int f2833f1 = 72;

    /* renamed from: g */
    public static final int f2834g = 1;

    /* renamed from: g */
    public static final String f2835g = "parent";

    /* renamed from: g0 */
    public static final int f2836g0 = 21;

    /* renamed from: g1 */
    public static final int f2837g1 = 73;

    /* renamed from: h */
    public static final int f2838h = 2;

    /* renamed from: h0 */
    public static final int f2839h0 = 22;

    /* renamed from: h1 */
    public static final int f2840h1 = 74;

    /* renamed from: i */
    public static final int f2841i = 3;

    /* renamed from: i0 */
    public static final int f2842i0 = 23;

    /* renamed from: i1 */
    public static final int f2843i1 = 75;

    /* renamed from: j */
    public static final int f2844j = 4;

    /* renamed from: j0 */
    public static final int f2845j0 = 24;

    /* renamed from: j1 */
    public static final int f2846j1 = 76;

    /* renamed from: k */
    public static final int f2847k = -1;

    /* renamed from: k0 */
    public static final int f2848k0 = 25;

    /* renamed from: k1 */
    public static final int f2849k1 = 77;

    /* renamed from: l */
    public static final int f2850l = 0;

    /* renamed from: l0 */
    public static final int f2851l0 = 26;

    /* renamed from: l1 */
    public static final int f2852l1 = 78;

    /* renamed from: m */
    public static final int f2853m = -2;

    /* renamed from: m0 */
    public static final int f2854m0 = 27;

    /* renamed from: m1 */
    public static final int f2855m1 = 79;

    /* renamed from: n */
    public static final int f2856n = 1;

    /* renamed from: n0 */
    public static final int f2857n0 = 28;

    /* renamed from: n1 */
    public static final int f2858n1 = 80;

    /* renamed from: o */
    public static final int f2859o = 0;

    /* renamed from: o0 */
    public static final int f2860o0 = 29;

    /* renamed from: o1 */
    public static final int f2861o1 = 81;

    /* renamed from: p */
    public static final int f2862p = 2;

    /* renamed from: p0 */
    public static final int f2863p0 = 30;

    /* renamed from: p1 */
    public static final int f2864p1 = 82;

    /* renamed from: q */
    public static final int f2865q = 0;

    /* renamed from: q0 */
    public static final int f2866q0 = 31;

    /* renamed from: q1 */
    public static final int f2867q1 = 83;

    /* renamed from: r */
    public static final int f2868r = 0;

    /* renamed from: r0 */
    public static final int f2869r0 = 32;

    /* renamed from: r1 */
    public static final int f2870r1 = 84;

    /* renamed from: s */
    public static final int f2871s = 1;

    /* renamed from: s0 */
    public static final int f2872s0 = 33;

    /* renamed from: s1 */
    public static final int f2873s1 = 85;

    /* renamed from: t */
    public static final int f2874t = 0;

    /* renamed from: t0 */
    public static final int f2875t0 = 34;

    /* renamed from: t1 */
    public static final int f2876t1 = 86;

    /* renamed from: u */
    public static final int f2877u = 1;

    /* renamed from: u0 */
    public static final int f2878u0 = 35;

    /* renamed from: u1 */
    public static final int f2879u1 = 87;

    /* renamed from: v */
    public static final int f2880v = 0;

    /* renamed from: v0 */
    public static final int f2881v0 = 36;

    /* renamed from: v1 */
    public static final int f2882v1 = 88;

    /* renamed from: w */
    public static final int f2883w = 4;

    /* renamed from: w0 */
    public static final int f2884w0 = 37;

    /* renamed from: w1 */
    public static final int f2885w1 = 89;

    /* renamed from: x */
    public static final int f2886x = 8;

    /* renamed from: x0 */
    public static final int f2887x0 = 38;

    /* renamed from: x1 */
    public static final int f2888x1 = 90;

    /* renamed from: y */
    public static final int f2889y = 1;

    /* renamed from: y0 */
    public static final int f2890y0 = 39;

    /* renamed from: y1 */
    public static final int f2891y1 = 91;

    /* renamed from: z */
    public static final int f2892z = 2;

    /* renamed from: z0 */
    public static final int f2893z0 = 40;

    /* renamed from: z1 */
    public static final int f2894z1 = 92;

    /* renamed from: a */
    public int f2895a = 0;

    /* renamed from: a */
    public String f2896a;

    /* renamed from: a */
    public HashMap<String, C0419a> f2897a = new HashMap<>();

    /* renamed from: a */
    public boolean f2898a;

    /* renamed from: b */
    public String f2899b = "";

    /* renamed from: b */
    public HashMap<Integer, C0427a> f2900b = new HashMap<>();

    /* renamed from: b */
    public boolean f2901b = true;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0427a {

        /* renamed from: a */
        public int f2902a;

        /* renamed from: a */
        public C0428a f2903a;

        /* renamed from: a */
        public final C0429b f2904a = new C0429b();

        /* renamed from: a */
        public final C0430c f2905a = new C0430c();

        /* renamed from: a */
        public final C0431d f2906a = new C0431d();

        /* renamed from: a */
        public final C0432e f2907a = new C0432e();

        /* renamed from: a */
        public String f2908a;

        /* renamed from: a */
        public HashMap<String, C0419a> f2909a = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.d$a$a */
        public static class C0428a {

            /* renamed from: e */
            public static final int f2910e = 4;

            /* renamed from: f */
            public static final int f2911f = 10;

            /* renamed from: g */
            public static final int f2912g = 10;

            /* renamed from: h */
            public static final int f2913h = 5;

            /* renamed from: a */
            public int f2914a = 0;

            /* renamed from: a */
            public float[] f2915a = new float[10];

            /* renamed from: a */
            public int[] f2916a = new int[10];

            /* renamed from: a */
            public String[] f2917a = new String[5];

            /* renamed from: a */
            public boolean[] f2918a = new boolean[4];

            /* renamed from: b */
            public int f2919b = 0;

            /* renamed from: b */
            public int[] f2920b = new int[10];

            /* renamed from: c */
            public int f2921c = 0;

            /* renamed from: c */
            public int[] f2922c = new int[10];

            /* renamed from: d */
            public int f2923d = 0;

            /* renamed from: d */
            public int[] f2924d = new int[5];

            /* renamed from: e */
            public int[] f2925e = new int[4];

            /* renamed from: a */
            public void mo3511a(int i, float f) {
                int i2 = this.f2919b;
                int[] iArr = this.f2922c;
                if (i2 >= iArr.length) {
                    this.f2922c = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2915a;
                    this.f2915a = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2922c;
                int i3 = this.f2919b;
                iArr2[i3] = i;
                float[] fArr2 = this.f2915a;
                this.f2919b = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void mo3512b(int i, int i2) {
                int i3 = this.f2914a;
                int[] iArr = this.f2916a;
                if (i3 >= iArr.length) {
                    this.f2916a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2920b;
                    this.f2920b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2916a;
                int i4 = this.f2914a;
                iArr3[i4] = i;
                int[] iArr4 = this.f2920b;
                this.f2914a = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void mo3513c(int i, String str) {
                int i2 = this.f2921c;
                int[] iArr = this.f2924d;
                if (i2 >= iArr.length) {
                    this.f2924d = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2917a;
                    this.f2917a = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2924d;
                int i3 = this.f2921c;
                iArr2[i3] = i;
                String[] strArr2 = this.f2917a;
                this.f2921c = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void mo3514d(int i, boolean z) {
                int i2 = this.f2923d;
                int[] iArr = this.f2925e;
                if (i2 >= iArr.length) {
                    this.f2925e = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2918a;
                    this.f2918a = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2925e;
                int i3 = this.f2923d;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f2918a;
                this.f2923d = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void mo3515e(C0427a aVar) {
                for (int i = 0; i < this.f2914a; i++) {
                    C0426d.m3237S0(aVar, this.f2916a[i], this.f2920b[i]);
                }
                for (int i2 = 0; i2 < this.f2919b; i2++) {
                    C0426d.m3236R0(aVar, this.f2922c[i2], this.f2915a[i2]);
                }
                for (int i3 = 0; i3 < this.f2921c; i3++) {
                    C0426d.m3238T0(aVar, this.f2924d[i3], this.f2917a[i3]);
                }
                for (int i4 = 0; i4 < this.f2923d; i4++) {
                    C0426d.m3239U0(aVar, this.f2925e[i4], this.f2918a[i4]);
                }
            }

            @SuppressLint({"LogConditional"})
            /* renamed from: f */
            public void mo3516f(String str) {
                Log.v(str, "int");
                for (int i = 0; i < this.f2914a; i++) {
                    Log.v(str, this.f2916a[i] + " = " + this.f2920b[i]);
                }
                Log.v(str, ak4.C1709b.f9163c);
                for (int i2 = 0; i2 < this.f2919b; i2++) {
                    Log.v(str, this.f2922c[i2] + " = " + this.f2915a[i2]);
                }
                Log.v(str, "strings");
                for (int i3 = 0; i3 < this.f2921c; i3++) {
                    Log.v(str, this.f2924d[i3] + " = " + this.f2917a[i3]);
                }
                Log.v(str, ak4.C1709b.f9169f);
                for (int i4 = 0; i4 < this.f2923d; i4++) {
                    Log.v(str, this.f2925e[i4] + " = " + this.f2918a[i4]);
                }
            }
        }

        /* renamed from: h */
        public void mo3499h(C0427a aVar) {
            C0428a aVar2 = this.f2903a;
            if (aVar2 != null) {
                aVar2.mo3515e(aVar);
            }
        }

        /* renamed from: i */
        public void mo3500i(ConstraintLayout.LayoutParams layoutParams) {
            C0429b bVar = this.f2904a;
            layoutParams.f2558c = bVar.f3038e;
            layoutParams.f2561d = bVar.f3041f;
            layoutParams.f2564e = bVar.f3044g;
            layoutParams.f2567f = bVar.f3047h;
            layoutParams.f2570g = bVar.f3048i;
            layoutParams.f2573h = bVar.f3049j;
            layoutParams.f2576i = bVar.f3050k;
            layoutParams.f2579j = bVar.f3051l;
            layoutParams.f2582k = bVar.f3052m;
            layoutParams.f2584l = bVar.f3053n;
            layoutParams.f2586m = bVar.f3054o;
            layoutParams.f2590p = bVar.f3055p;
            layoutParams.f2591q = bVar.f3056q;
            layoutParams.f2592r = bVar.f3057r;
            layoutParams.f2593s = bVar.f3058s;
            layoutParams.leftMargin = bVar.f3064y;
            layoutParams.rightMargin = bVar.f3065z;
            layoutParams.topMargin = bVar.f2997A;
            layoutParams.bottomMargin = bVar.f2998B;
            layoutParams.f2598x = bVar.f3007K;
            layoutParams.f2599y = bVar.f3006J;
            layoutParams.f2595u = bVar.f3003G;
            layoutParams.f2597w = bVar.f3005I;
            layoutParams.f2557c = bVar.f3026b;
            layoutParams.f2560d = bVar.f3030c;
            layoutParams.f2588n = bVar.f3059t;
            layoutParams.f2589o = bVar.f3060u;
            layoutParams.f2553b = bVar.f3034d;
            layoutParams.f2551a = bVar.f3023a;
            layoutParams.f2536K = bVar.f3061v;
            layoutParams.f2537L = bVar.f3062w;
            layoutParams.f2569g = bVar.f3037e;
            layoutParams.f2566f = bVar.f3040f;
            layoutParams.f2529D = bVar.f3010N;
            layoutParams.f2528C = bVar.f3009M;
            layoutParams.f2562d = bVar.f3039e;
            layoutParams.f2565e = bVar.f3042f;
            layoutParams.f2530E = bVar.f3011O;
            layoutParams.f2531F = bVar.f3012P;
            layoutParams.f2534I = bVar.f3013Q;
            layoutParams.f2535J = bVar.f3014R;
            layoutParams.f2532G = bVar.f3015S;
            layoutParams.f2533H = bVar.f3016T;
            layoutParams.f2572h = bVar.f3043g;
            layoutParams.f2575i = bVar.f3046h;
            layoutParams.f2538M = bVar.f3063x;
            layoutParams.f2548a = bVar.f3021a;
            layoutParams.f2549a = bVar.f3031c;
            layoutParams.f2554b = bVar.f3035d;
            layoutParams.width = bVar.f3022a;
            layoutParams.height = bVar.f3027b;
            String str = bVar.f3032c;
            if (str != null) {
                layoutParams.f2555b = str;
            }
            layoutParams.f2539N = bVar.f3020X;
            layoutParams.setMarginStart(bVar.f3000D);
            layoutParams.setMarginEnd(this.f2904a.f2999C);
            layoutParams.mo3257e();
        }

        /* renamed from: j */
        public C0427a clone() {
            C0427a aVar = new C0427a();
            aVar.f2904a.mo3517a(this.f2904a);
            aVar.f2905a.mo3520a(this.f2905a);
            aVar.f2906a.mo3522a(this.f2906a);
            aVar.f2907a.mo3524a(this.f2907a);
            aVar.f2902a = this.f2902a;
            aVar.f2903a = this.f2903a;
            return aVar;
        }

        /* renamed from: k */
        public final void mo3502k(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2902a = i;
            C0429b bVar = this.f2904a;
            bVar.f3038e = layoutParams.f2558c;
            bVar.f3041f = layoutParams.f2561d;
            bVar.f3044g = layoutParams.f2564e;
            bVar.f3047h = layoutParams.f2567f;
            bVar.f3048i = layoutParams.f2570g;
            bVar.f3049j = layoutParams.f2573h;
            bVar.f3050k = layoutParams.f2576i;
            bVar.f3051l = layoutParams.f2579j;
            bVar.f3052m = layoutParams.f2582k;
            bVar.f3053n = layoutParams.f2584l;
            bVar.f3054o = layoutParams.f2586m;
            bVar.f3055p = layoutParams.f2590p;
            bVar.f3056q = layoutParams.f2591q;
            bVar.f3057r = layoutParams.f2592r;
            bVar.f3058s = layoutParams.f2593s;
            bVar.f3026b = layoutParams.f2557c;
            bVar.f3030c = layoutParams.f2560d;
            bVar.f3023a = layoutParams.f2551a;
            bVar.f3059t = layoutParams.f2588n;
            bVar.f3060u = layoutParams.f2589o;
            bVar.f3034d = layoutParams.f2553b;
            bVar.f3061v = layoutParams.f2536K;
            bVar.f3062w = layoutParams.f2537L;
            bVar.f3063x = layoutParams.f2538M;
            bVar.f3021a = layoutParams.f2548a;
            bVar.f3031c = layoutParams.f2549a;
            bVar.f3035d = layoutParams.f2554b;
            bVar.f3022a = layoutParams.width;
            bVar.f3027b = layoutParams.height;
            bVar.f3064y = layoutParams.leftMargin;
            bVar.f3065z = layoutParams.rightMargin;
            bVar.f2997A = layoutParams.topMargin;
            bVar.f2998B = layoutParams.bottomMargin;
            bVar.f3001E = layoutParams.f2526A;
            bVar.f3037e = layoutParams.f2569g;
            bVar.f3040f = layoutParams.f2566f;
            bVar.f3010N = layoutParams.f2529D;
            bVar.f3009M = layoutParams.f2528C;
            bVar.f3039e = layoutParams.f2562d;
            bVar.f3042f = layoutParams.f2565e;
            bVar.f3011O = layoutParams.f2530E;
            bVar.f3012P = layoutParams.f2531F;
            bVar.f3013Q = layoutParams.f2534I;
            bVar.f3014R = layoutParams.f2535J;
            bVar.f3015S = layoutParams.f2532G;
            bVar.f3016T = layoutParams.f2533H;
            bVar.f3043g = layoutParams.f2572h;
            bVar.f3046h = layoutParams.f2575i;
            bVar.f3032c = layoutParams.f2555b;
            bVar.f3003G = layoutParams.f2595u;
            bVar.f3005I = layoutParams.f2597w;
            bVar.f3002F = layoutParams.f2594t;
            bVar.f3004H = layoutParams.f2596v;
            bVar.f3007K = layoutParams.f2598x;
            bVar.f3006J = layoutParams.f2599y;
            bVar.f3008L = layoutParams.f2600z;
            bVar.f3020X = layoutParams.f2539N;
            bVar.f2999C = layoutParams.getMarginEnd();
            this.f2904a.f3000D = layoutParams.getMarginStart();
        }

        /* renamed from: l */
        public final void mo3503l(int i, Constraints.LayoutParams layoutParams) {
            mo3502k(i, layoutParams);
            this.f2906a.f3094a = layoutParams.f2673l;
            C0432e eVar = this.f2907a;
            eVar.f3112a = layoutParams.f2675n;
            eVar.f3115b = layoutParams.f2677o;
            eVar.f3117c = layoutParams.f2678p;
            eVar.f3118d = layoutParams.f2679q;
            eVar.f3119e = layoutParams.f2680r;
            eVar.f3120f = layoutParams.f2681s;
            eVar.f3121g = layoutParams.f2682t;
            eVar.f3122h = layoutParams.f2683u;
            eVar.f3123i = layoutParams.f2684v;
            eVar.f3124j = layoutParams.f2685w;
            eVar.f3125k = layoutParams.f2674m;
            eVar.f3116b = layoutParams.f2676n;
        }

        /* renamed from: m */
        public final void mo3504m(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            mo3503l(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0429b bVar = this.f2904a;
                bVar.f3019W = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f3017U = barrier.getType();
                this.f2904a.f3025a = barrier.getReferencedIds();
                this.f2904a.f3018V = barrier.getMargin();
            }
        }

        /* renamed from: n */
        public final C0419a mo3505n(String str, C0419a.C0421b bVar) {
            if (this.f2909a.containsKey(str)) {
                C0419a aVar = this.f2909a.get(str);
                if (aVar.mo3311j() == bVar) {
                    return aVar;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.mo3311j().name());
            }
            C0419a aVar2 = new C0419a(str, bVar);
            this.f2909a.put(str, aVar2);
            return aVar2;
        }

        /* renamed from: o */
        public void mo3506o(String str) {
            C0428a aVar = this.f2903a;
            if (aVar != null) {
                aVar.mo3516f(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }

        /* renamed from: p */
        public final void mo3507p(String str, int i) {
            mo3505n(str, C0419a.C0421b.COLOR_TYPE).mo3318s(i);
        }

        /* renamed from: q */
        public final void mo3508q(String str, float f) {
            mo3505n(str, C0419a.C0421b.FLOAT_TYPE).mo3319t(f);
        }

        /* renamed from: r */
        public final void mo3509r(String str, int i) {
            mo3505n(str, C0419a.C0421b.INT_TYPE).mo3320u(i);
        }

        /* renamed from: s */
        public final void mo3510s(String str, String str2) {
            mo3505n(str, C0419a.C0421b.STRING_TYPE).mo3321v(str2);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0429b {

        /* renamed from: A0 */
        public static final int f2926A0 = 27;

        /* renamed from: B0 */
        public static final int f2927B0 = 28;

        /* renamed from: C0 */
        public static final int f2928C0 = 29;

        /* renamed from: D0 */
        public static final int f2929D0 = 30;

        /* renamed from: E0 */
        public static final int f2930E0 = 31;

        /* renamed from: F0 */
        public static final int f2931F0 = 32;

        /* renamed from: G0 */
        public static final int f2932G0 = 33;

        /* renamed from: H0 */
        public static final int f2933H0 = 34;

        /* renamed from: I0 */
        public static final int f2934I0 = 35;

        /* renamed from: J0 */
        public static final int f2935J0 = 36;

        /* renamed from: K0 */
        public static final int f2936K0 = 37;

        /* renamed from: L0 */
        public static final int f2937L0 = 38;

        /* renamed from: M0 */
        public static final int f2938M0 = 39;

        /* renamed from: N0 */
        public static final int f2939N0 = 40;

        /* renamed from: O0 */
        public static final int f2940O0 = 41;

        /* renamed from: P0 */
        public static final int f2941P0 = 42;

        /* renamed from: Q0 */
        public static final int f2942Q0 = 61;

        /* renamed from: R0 */
        public static final int f2943R0 = 62;

        /* renamed from: S0 */
        public static final int f2944S0 = 63;

        /* renamed from: T0 */
        public static final int f2945T0 = 69;

        /* renamed from: U0 */
        public static final int f2946U0 = 70;

        /* renamed from: V0 */
        public static final int f2947V0 = 71;

        /* renamed from: W0 */
        public static final int f2948W0 = 72;

        /* renamed from: X0 */
        public static final int f2949X0 = 73;

        /* renamed from: Y */
        public static final int f2950Y = -1;

        /* renamed from: Y0 */
        public static final int f2951Y0 = 74;

        /* renamed from: Z */
        public static final int f2952Z = Integer.MIN_VALUE;

        /* renamed from: Z0 */
        public static final int f2953Z0 = 75;

        /* renamed from: a */
        public static SparseIntArray f2954a = null;

        /* renamed from: a0 */
        public static final int f2955a0 = 1;

        /* renamed from: a1 */
        public static final int f2956a1 = 76;

        /* renamed from: b0 */
        public static final int f2957b0 = 2;

        /* renamed from: b1 */
        public static final int f2958b1 = 77;

        /* renamed from: c0 */
        public static final int f2959c0 = 3;

        /* renamed from: c1 */
        public static final int f2960c1 = 78;

        /* renamed from: d0 */
        public static final int f2961d0 = 4;

        /* renamed from: d1 */
        public static final int f2962d1 = 79;

        /* renamed from: e0 */
        public static final int f2963e0 = 5;

        /* renamed from: e1 */
        public static final int f2964e1 = 80;

        /* renamed from: f0 */
        public static final int f2965f0 = 6;

        /* renamed from: f1 */
        public static final int f2966f1 = 81;

        /* renamed from: g0 */
        public static final int f2967g0 = 7;

        /* renamed from: g1 */
        public static final int f2968g1 = 82;

        /* renamed from: h0 */
        public static final int f2969h0 = 8;

        /* renamed from: h1 */
        public static final int f2970h1 = 83;

        /* renamed from: i0 */
        public static final int f2971i0 = 9;

        /* renamed from: i1 */
        public static final int f2972i1 = 84;

        /* renamed from: j0 */
        public static final int f2973j0 = 10;

        /* renamed from: j1 */
        public static final int f2974j1 = 85;

        /* renamed from: k0 */
        public static final int f2975k0 = 11;

        /* renamed from: k1 */
        public static final int f2976k1 = 86;

        /* renamed from: l0 */
        public static final int f2977l0 = 12;

        /* renamed from: l1 */
        public static final int f2978l1 = 87;

        /* renamed from: m0 */
        public static final int f2979m0 = 13;

        /* renamed from: m1 */
        public static final int f2980m1 = 88;

        /* renamed from: n0 */
        public static final int f2981n0 = 14;

        /* renamed from: n1 */
        public static final int f2982n1 = 89;

        /* renamed from: o0 */
        public static final int f2983o0 = 15;

        /* renamed from: o1 */
        public static final int f2984o1 = 90;

        /* renamed from: p0 */
        public static final int f2985p0 = 16;

        /* renamed from: p1 */
        public static final int f2986p1 = 91;

        /* renamed from: q0 */
        public static final int f2987q0 = 17;

        /* renamed from: r0 */
        public static final int f2988r0 = 18;

        /* renamed from: s0 */
        public static final int f2989s0 = 19;

        /* renamed from: t0 */
        public static final int f2990t0 = 20;

        /* renamed from: u0 */
        public static final int f2991u0 = 21;

        /* renamed from: v0 */
        public static final int f2992v0 = 22;

        /* renamed from: w0 */
        public static final int f2993w0 = 23;

        /* renamed from: x0 */
        public static final int f2994x0 = 24;

        /* renamed from: y0 */
        public static final int f2995y0 = 25;

        /* renamed from: z0 */
        public static final int f2996z0 = 26;

        /* renamed from: A */
        public int f2997A = 0;

        /* renamed from: B */
        public int f2998B = 0;

        /* renamed from: C */
        public int f2999C = 0;

        /* renamed from: D */
        public int f3000D = 0;

        /* renamed from: E */
        public int f3001E = 0;

        /* renamed from: F */
        public int f3002F = Integer.MIN_VALUE;

        /* renamed from: G */
        public int f3003G = Integer.MIN_VALUE;

        /* renamed from: H */
        public int f3004H = Integer.MIN_VALUE;

        /* renamed from: I */
        public int f3005I = Integer.MIN_VALUE;

        /* renamed from: J */
        public int f3006J = Integer.MIN_VALUE;

        /* renamed from: K */
        public int f3007K = Integer.MIN_VALUE;

        /* renamed from: L */
        public int f3008L = Integer.MIN_VALUE;

        /* renamed from: M */
        public int f3009M = 0;

        /* renamed from: N */
        public int f3010N = 0;

        /* renamed from: O */
        public int f3011O = 0;

        /* renamed from: P */
        public int f3012P = 0;

        /* renamed from: Q */
        public int f3013Q = 0;

        /* renamed from: R */
        public int f3014R = 0;

        /* renamed from: S */
        public int f3015S = 0;

        /* renamed from: T */
        public int f3016T = 0;

        /* renamed from: U */
        public int f3017U = -1;

        /* renamed from: V */
        public int f3018V = 0;

        /* renamed from: W */
        public int f3019W = -1;

        /* renamed from: X */
        public int f3020X = 0;

        /* renamed from: a */
        public float f3021a = -1.0f;

        /* renamed from: a */
        public int f3022a;

        /* renamed from: a */
        public String f3023a = null;

        /* renamed from: a */
        public boolean f3024a = false;

        /* renamed from: a */
        public int[] f3025a;

        /* renamed from: b */
        public float f3026b = 0.5f;

        /* renamed from: b */
        public int f3027b;

        /* renamed from: b */
        public String f3028b;

        /* renamed from: b */
        public boolean f3029b = false;

        /* renamed from: c */
        public float f3030c = 0.5f;

        /* renamed from: c */
        public int f3031c = -1;

        /* renamed from: c */
        public String f3032c;

        /* renamed from: c */
        public boolean f3033c = false;

        /* renamed from: d */
        public float f3034d = 0.0f;

        /* renamed from: d */
        public int f3035d = -1;

        /* renamed from: d */
        public boolean f3036d = true;

        /* renamed from: e */
        public float f3037e = -1.0f;

        /* renamed from: e */
        public int f3038e = -1;

        /* renamed from: e */
        public boolean f3039e = false;

        /* renamed from: f */
        public float f3040f = -1.0f;

        /* renamed from: f */
        public int f3041f = -1;

        /* renamed from: f */
        public boolean f3042f = false;

        /* renamed from: g */
        public float f3043g = 1.0f;

        /* renamed from: g */
        public int f3044g = -1;

        /* renamed from: g */
        public boolean f3045g = true;

        /* renamed from: h */
        public float f3046h = 1.0f;

        /* renamed from: h */
        public int f3047h = -1;

        /* renamed from: i */
        public int f3048i = -1;

        /* renamed from: j */
        public int f3049j = -1;

        /* renamed from: k */
        public int f3050k = -1;

        /* renamed from: l */
        public int f3051l = -1;

        /* renamed from: m */
        public int f3052m = -1;

        /* renamed from: n */
        public int f3053n = -1;

        /* renamed from: o */
        public int f3054o = -1;

        /* renamed from: p */
        public int f3055p = -1;

        /* renamed from: q */
        public int f3056q = -1;

        /* renamed from: r */
        public int f3057r = -1;

        /* renamed from: s */
        public int f3058s = -1;

        /* renamed from: t */
        public int f3059t = -1;

        /* renamed from: u */
        public int f3060u = 0;

        /* renamed from: v */
        public int f3061v = -1;

        /* renamed from: w */
        public int f3062w = -1;

        /* renamed from: x */
        public int f3063x = -1;

        /* renamed from: y */
        public int f3064y = 0;

        /* renamed from: z */
        public int f3065z = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2954a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.Layout_layout_constraintLeft_toLeftOf, 24);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintLeft_toRightOf, 25);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintRight_toLeftOf, 28);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintRight_toRightOf, 29);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintTop_toTopOf, 35);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintTop_toBottomOf, 34);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintBottom_toTopOf, 4);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintBottom_toBottomOf, 3);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2954a.append(C0435e.C0448m.Layout_layout_editor_absoluteX, 6);
            f2954a.append(C0435e.C0448m.Layout_layout_editor_absoluteY, 7);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintGuide_begin, 17);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintGuide_end, 18);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintGuide_percent, 19);
            f2954a.append(C0435e.C0448m.Layout_guidelineUseRtl, 90);
            f2954a.append(C0435e.C0448m.Layout_android_orientation, 26);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintStart_toEndOf, 31);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintStart_toStartOf, 32);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintEnd_toStartOf, 10);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintEnd_toEndOf, 9);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginLeft, 13);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginTop, 16);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginRight, 14);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginBottom, 11);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginStart, 15);
            f2954a.append(C0435e.C0448m.Layout_layout_goneMarginEnd, 12);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintVertical_weight, 38);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintHorizontal_weight, 37);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintVertical_chainStyle, 40);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintHorizontal_bias, 20);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintVertical_bias, 36);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintDimensionRatio, 5);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintLeft_creator, 91);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintTop_creator, 91);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintRight_creator, 91);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintBottom_creator, 91);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintBaseline_creator, 91);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginLeft, 23);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginRight, 27);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginStart, 30);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginEnd, 8);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginTop, 33);
            f2954a.append(C0435e.C0448m.Layout_android_layout_marginBottom, 2);
            f2954a.append(C0435e.C0448m.Layout_android_layout_width, 22);
            f2954a.append(C0435e.C0448m.Layout_android_layout_height, 21);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintWidth, 41);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintHeight, 42);
            f2954a.append(C0435e.C0448m.Layout_layout_constrainedWidth, 41);
            f2954a.append(C0435e.C0448m.Layout_layout_constrainedHeight, 42);
            f2954a.append(C0435e.C0448m.Layout_layout_wrapBehaviorInParent, 76);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintCircle, 61);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintCircleRadius, 62);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintCircleAngle, 63);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintWidth_percent, 69);
            f2954a.append(C0435e.C0448m.Layout_layout_constraintHeight_percent, 70);
            f2954a.append(C0435e.C0448m.Layout_chainUseRtl, 71);
            f2954a.append(C0435e.C0448m.Layout_barrierDirection, 72);
            f2954a.append(C0435e.C0448m.Layout_barrierMargin, 73);
            f2954a.append(C0435e.C0448m.Layout_constraint_referenced_ids, 74);
            f2954a.append(C0435e.C0448m.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo3517a(C0429b bVar) {
            this.f3024a = bVar.f3024a;
            this.f3022a = bVar.f3022a;
            this.f3029b = bVar.f3029b;
            this.f3027b = bVar.f3027b;
            this.f3031c = bVar.f3031c;
            this.f3035d = bVar.f3035d;
            this.f3021a = bVar.f3021a;
            this.f3036d = bVar.f3036d;
            this.f3038e = bVar.f3038e;
            this.f3041f = bVar.f3041f;
            this.f3044g = bVar.f3044g;
            this.f3047h = bVar.f3047h;
            this.f3048i = bVar.f3048i;
            this.f3049j = bVar.f3049j;
            this.f3050k = bVar.f3050k;
            this.f3051l = bVar.f3051l;
            this.f3052m = bVar.f3052m;
            this.f3053n = bVar.f3053n;
            this.f3054o = bVar.f3054o;
            this.f3055p = bVar.f3055p;
            this.f3056q = bVar.f3056q;
            this.f3057r = bVar.f3057r;
            this.f3058s = bVar.f3058s;
            this.f3026b = bVar.f3026b;
            this.f3030c = bVar.f3030c;
            this.f3023a = bVar.f3023a;
            this.f3059t = bVar.f3059t;
            this.f3060u = bVar.f3060u;
            this.f3034d = bVar.f3034d;
            this.f3061v = bVar.f3061v;
            this.f3062w = bVar.f3062w;
            this.f3063x = bVar.f3063x;
            this.f3064y = bVar.f3064y;
            this.f3065z = bVar.f3065z;
            this.f2997A = bVar.f2997A;
            this.f2998B = bVar.f2998B;
            this.f2999C = bVar.f2999C;
            this.f3000D = bVar.f3000D;
            this.f3001E = bVar.f3001E;
            this.f3002F = bVar.f3002F;
            this.f3003G = bVar.f3003G;
            this.f3004H = bVar.f3004H;
            this.f3005I = bVar.f3005I;
            this.f3006J = bVar.f3006J;
            this.f3007K = bVar.f3007K;
            this.f3008L = bVar.f3008L;
            this.f3037e = bVar.f3037e;
            this.f3040f = bVar.f3040f;
            this.f3009M = bVar.f3009M;
            this.f3010N = bVar.f3010N;
            this.f3011O = bVar.f3011O;
            this.f3012P = bVar.f3012P;
            this.f3013Q = bVar.f3013Q;
            this.f3014R = bVar.f3014R;
            this.f3015S = bVar.f3015S;
            this.f3016T = bVar.f3016T;
            this.f3043g = bVar.f3043g;
            this.f3046h = bVar.f3046h;
            this.f3017U = bVar.f3017U;
            this.f3018V = bVar.f3018V;
            this.f3019W = bVar.f3019W;
            this.f3032c = bVar.f3032c;
            int[] iArr = bVar.f3025a;
            if (iArr == null || bVar.f3028b != null) {
                this.f3025a = null;
            } else {
                this.f3025a = Arrays.copyOf(iArr, iArr.length);
            }
            this.f3028b = bVar.f3028b;
            this.f3039e = bVar.f3039e;
            this.f3042f = bVar.f3042f;
            this.f3045g = bVar.f3045g;
            this.f3020X = bVar.f3020X;
        }

        /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3518b(androidx.constraintlayout.motion.widget.C0393b r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            L_0x000e:
                int r2 = r0.length
                if (r1 >= r2) goto L_0x007d
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L_0x0022
                goto L_0x007a
            L_0x0022:
                java.lang.Object r4 = r2.get(r9)     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r2 = r2.getType()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L_0x0059
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1
                if (r2 == r5) goto L_0x007a
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r2 = r10.mo2906X(r2)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r4 = r2
            L_0x0052:
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
            L_0x0055:
                r11.append(r6)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x007a
            L_0x0059:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != r5) goto L_0x007a
                java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                float r2 = r4.floatValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L_0x007a
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x0055
            L_0x0076:
                r2 = move-exception
                r2.printStackTrace()
            L_0x007a:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0426d.C0429b.mo3518b(androidx.constraintlayout.motion.widget.b, java.lang.StringBuilder):void");
        }

        /* renamed from: c */
        public void mo3519c(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.Layout);
            this.f3029b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2954a.get(index);
                switch (i2) {
                    case 1:
                        this.f3052m = C0426d.m3250y0(obtainStyledAttributes, index, this.f3052m);
                        break;
                    case 2:
                        this.f2998B = obtainStyledAttributes.getDimensionPixelSize(index, this.f2998B);
                        break;
                    case 3:
                        this.f3051l = C0426d.m3250y0(obtainStyledAttributes, index, this.f3051l);
                        break;
                    case 4:
                        this.f3050k = C0426d.m3250y0(obtainStyledAttributes, index, this.f3050k);
                        break;
                    case 5:
                        this.f3023a = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f3061v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3061v);
                        break;
                    case 7:
                        this.f3062w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3062w);
                        break;
                    case 8:
                        this.f2999C = obtainStyledAttributes.getDimensionPixelSize(index, this.f2999C);
                        break;
                    case 9:
                        this.f3058s = C0426d.m3250y0(obtainStyledAttributes, index, this.f3058s);
                        break;
                    case 10:
                        this.f3057r = C0426d.m3250y0(obtainStyledAttributes, index, this.f3057r);
                        break;
                    case 11:
                        this.f3005I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3005I);
                        break;
                    case 12:
                        this.f3006J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3006J);
                        break;
                    case 13:
                        this.f3002F = obtainStyledAttributes.getDimensionPixelSize(index, this.f3002F);
                        break;
                    case 14:
                        this.f3004H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3004H);
                        break;
                    case 15:
                        this.f3007K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3007K);
                        break;
                    case 16:
                        this.f3003G = obtainStyledAttributes.getDimensionPixelSize(index, this.f3003G);
                        break;
                    case 17:
                        this.f3031c = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3031c);
                        break;
                    case 18:
                        this.f3035d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3035d);
                        break;
                    case 19:
                        this.f3021a = obtainStyledAttributes.getFloat(index, this.f3021a);
                        break;
                    case 20:
                        this.f3026b = obtainStyledAttributes.getFloat(index, this.f3026b);
                        break;
                    case 21:
                        this.f3027b = obtainStyledAttributes.getLayoutDimension(index, this.f3027b);
                        break;
                    case 22:
                        this.f3022a = obtainStyledAttributes.getLayoutDimension(index, this.f3022a);
                        break;
                    case 23:
                        this.f3064y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3064y);
                        break;
                    case 24:
                        this.f3038e = C0426d.m3250y0(obtainStyledAttributes, index, this.f3038e);
                        break;
                    case 25:
                        this.f3041f = C0426d.m3250y0(obtainStyledAttributes, index, this.f3041f);
                        break;
                    case 26:
                        this.f3063x = obtainStyledAttributes.getInt(index, this.f3063x);
                        break;
                    case 27:
                        this.f3065z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3065z);
                        break;
                    case 28:
                        this.f3044g = C0426d.m3250y0(obtainStyledAttributes, index, this.f3044g);
                        break;
                    case 29:
                        this.f3047h = C0426d.m3250y0(obtainStyledAttributes, index, this.f3047h);
                        break;
                    case 30:
                        this.f3000D = obtainStyledAttributes.getDimensionPixelSize(index, this.f3000D);
                        break;
                    case 31:
                        this.f3055p = C0426d.m3250y0(obtainStyledAttributes, index, this.f3055p);
                        break;
                    case 32:
                        this.f3056q = C0426d.m3250y0(obtainStyledAttributes, index, this.f3056q);
                        break;
                    case 33:
                        this.f2997A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2997A);
                        break;
                    case 34:
                        this.f3049j = C0426d.m3250y0(obtainStyledAttributes, index, this.f3049j);
                        break;
                    case 35:
                        this.f3048i = C0426d.m3250y0(obtainStyledAttributes, index, this.f3048i);
                        break;
                    case 36:
                        this.f3030c = obtainStyledAttributes.getFloat(index, this.f3030c);
                        break;
                    case 37:
                        this.f3040f = obtainStyledAttributes.getFloat(index, this.f3040f);
                        break;
                    case 38:
                        this.f3037e = obtainStyledAttributes.getFloat(index, this.f3037e);
                        break;
                    case 39:
                        this.f3009M = obtainStyledAttributes.getInt(index, this.f3009M);
                        break;
                    case 40:
                        this.f3010N = obtainStyledAttributes.getInt(index, this.f3010N);
                        break;
                    case 41:
                        C0426d.m3231A0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0426d.m3231A0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f3059t = C0426d.m3250y0(obtainStyledAttributes, index, this.f3059t);
                                break;
                            case 62:
                                this.f3060u = obtainStyledAttributes.getDimensionPixelSize(index, this.f3060u);
                                break;
                            case 63:
                                this.f3034d = obtainStyledAttributes.getFloat(index, this.f3034d);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f3043g = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f3046h = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f3017U = obtainStyledAttributes.getInt(index, this.f3017U);
                                        continue;
                                    case 73:
                                        this.f3018V = obtainStyledAttributes.getDimensionPixelSize(index, this.f3018V);
                                        continue;
                                    case 74:
                                        this.f3028b = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f3045g = obtainStyledAttributes.getBoolean(index, this.f3045g);
                                        continue;
                                    case 76:
                                        this.f3020X = obtainStyledAttributes.getInt(index, this.f3020X);
                                        continue;
                                    case 77:
                                        this.f3053n = C0426d.m3250y0(obtainStyledAttributes, index, this.f3053n);
                                        continue;
                                    case 78:
                                        this.f3054o = C0426d.m3250y0(obtainStyledAttributes, index, this.f3054o);
                                        continue;
                                    case 79:
                                        this.f3008L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3008L);
                                        continue;
                                    case 80:
                                        this.f3001E = obtainStyledAttributes.getDimensionPixelSize(index, this.f3001E);
                                        continue;
                                    case 81:
                                        this.f3011O = obtainStyledAttributes.getInt(index, this.f3011O);
                                        continue;
                                    case 82:
                                        this.f3012P = obtainStyledAttributes.getInt(index, this.f3012P);
                                        continue;
                                    case 83:
                                        this.f3014R = obtainStyledAttributes.getDimensionPixelSize(index, this.f3014R);
                                        continue;
                                    case 84:
                                        this.f3013Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3013Q);
                                        continue;
                                    case 85:
                                        this.f3016T = obtainStyledAttributes.getDimensionPixelSize(index, this.f3016T);
                                        continue;
                                    case 86:
                                        this.f3015S = obtainStyledAttributes.getDimensionPixelSize(index, this.f3015S);
                                        continue;
                                    case 87:
                                        this.f3039e = obtainStyledAttributes.getBoolean(index, this.f3039e);
                                        continue;
                                    case 88:
                                        this.f3042f = obtainStyledAttributes.getBoolean(index, this.f3042f);
                                        continue;
                                    case 89:
                                        this.f3032c = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f3036d = obtainStyledAttributes.getBoolean(index, this.f3036d);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(f2954a.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class C0430c {

        /* renamed from: a */
        public static SparseIntArray f3066a = null;

        /* renamed from: i */
        public static final int f3067i = -2;

        /* renamed from: j */
        public static final int f3068j = -1;

        /* renamed from: k */
        public static final int f3069k = -3;

        /* renamed from: l */
        public static final int f3070l = 1;

        /* renamed from: m */
        public static final int f3071m = 2;

        /* renamed from: n */
        public static final int f3072n = 3;

        /* renamed from: o */
        public static final int f3073o = 4;

        /* renamed from: p */
        public static final int f3074p = 5;

        /* renamed from: q */
        public static final int f3075q = 6;

        /* renamed from: r */
        public static final int f3076r = 7;

        /* renamed from: s */
        public static final int f3077s = 8;

        /* renamed from: t */
        public static final int f3078t = 9;

        /* renamed from: u */
        public static final int f3079u = 10;

        /* renamed from: a */
        public float f3080a = Float.NaN;

        /* renamed from: a */
        public int f3081a = -1;

        /* renamed from: a */
        public String f3082a = null;

        /* renamed from: a */
        public boolean f3083a = false;

        /* renamed from: b */
        public float f3084b = Float.NaN;

        /* renamed from: b */
        public int f3085b = 0;

        /* renamed from: b */
        public String f3086b = null;

        /* renamed from: c */
        public float f3087c = Float.NaN;

        /* renamed from: c */
        public int f3088c = -1;

        /* renamed from: d */
        public int f3089d = 0;

        /* renamed from: e */
        public int f3090e = -1;

        /* renamed from: f */
        public int f3091f = -1;

        /* renamed from: g */
        public int f3092g = -3;

        /* renamed from: h */
        public int f3093h = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3066a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.Motion_motionPathRotate, 1);
            f3066a.append(C0435e.C0448m.Motion_pathMotionArc, 2);
            f3066a.append(C0435e.C0448m.Motion_transitionEasing, 3);
            f3066a.append(C0435e.C0448m.Motion_drawPath, 4);
            f3066a.append(C0435e.C0448m.Motion_animateRelativeTo, 5);
            f3066a.append(C0435e.C0448m.Motion_animateCircleAngleTo, 6);
            f3066a.append(C0435e.C0448m.Motion_motionStagger, 7);
            f3066a.append(C0435e.C0448m.Motion_quantizeMotionSteps, 8);
            f3066a.append(C0435e.C0448m.Motion_quantizeMotionPhase, 9);
            f3066a.append(C0435e.C0448m.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void mo3520a(C0430c cVar) {
            this.f3083a = cVar.f3083a;
            this.f3081a = cVar.f3081a;
            this.f3082a = cVar.f3082a;
            this.f3088c = cVar.f3088c;
            this.f3089d = cVar.f3089d;
            this.f3084b = cVar.f3084b;
            this.f3080a = cVar.f3080a;
            this.f3090e = cVar.f3090e;
        }

        /* renamed from: b */
        public void mo3521b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.Motion);
            this.f3083a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3066a.get(index)) {
                    case 1:
                        this.f3084b = obtainStyledAttributes.getFloat(index, this.f3084b);
                        break;
                    case 2:
                        this.f3088c = obtainStyledAttributes.getInt(index, this.f3088c);
                        break;
                    case 3:
                        this.f3082a = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : ur0.f21493a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f3089d = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3081a = C0426d.m3250y0(obtainStyledAttributes, index, this.f3081a);
                        break;
                    case 6:
                        this.f3085b = obtainStyledAttributes.getInteger(index, this.f3085b);
                        break;
                    case 7:
                        this.f3080a = obtainStyledAttributes.getFloat(index, this.f3080a);
                        break;
                    case 8:
                        this.f3091f = obtainStyledAttributes.getInteger(index, this.f3091f);
                        break;
                    case 9:
                        this.f3087c = obtainStyledAttributes.getFloat(index, this.f3087c);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f3092g = obtainStyledAttributes.getInteger(index, this.f3093h);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f3086b = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f3092g = -1;
                                    break;
                                } else {
                                    this.f3093h = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3093h = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                        }
                        this.f3092g = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0431d {

        /* renamed from: a */
        public float f3094a = 1.0f;

        /* renamed from: a */
        public int f3095a = 0;

        /* renamed from: a */
        public boolean f3096a = false;

        /* renamed from: b */
        public float f3097b = Float.NaN;

        /* renamed from: b */
        public int f3098b = 0;

        /* renamed from: a */
        public void mo3522a(C0431d dVar) {
            this.f3096a = dVar.f3096a;
            this.f3095a = dVar.f3095a;
            this.f3094a = dVar.f3094a;
            this.f3097b = dVar.f3097b;
            this.f3098b = dVar.f3098b;
        }

        /* renamed from: b */
        public void mo3523b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.PropertySet);
            this.f3096a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.PropertySet_android_alpha) {
                    this.f3094a = obtainStyledAttributes.getFloat(index, this.f3094a);
                } else if (index == C0435e.C0448m.PropertySet_android_visibility) {
                    this.f3095a = obtainStyledAttributes.getInt(index, this.f3095a);
                    this.f3095a = C0426d.f2810a[this.f3095a];
                } else if (index == C0435e.C0448m.PropertySet_visibilityMode) {
                    this.f3098b = obtainStyledAttributes.getInt(index, this.f3098b);
                } else if (index == C0435e.C0448m.PropertySet_motionProgress) {
                    this.f3097b = obtainStyledAttributes.getFloat(index, this.f3097b);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class C0432e {

        /* renamed from: a */
        public static SparseIntArray f3099a = null;

        /* renamed from: b */
        public static final int f3100b = 1;

        /* renamed from: c */
        public static final int f3101c = 2;

        /* renamed from: d */
        public static final int f3102d = 3;

        /* renamed from: e */
        public static final int f3103e = 4;

        /* renamed from: f */
        public static final int f3104f = 5;

        /* renamed from: g */
        public static final int f3105g = 6;

        /* renamed from: h */
        public static final int f3106h = 7;

        /* renamed from: i */
        public static final int f3107i = 8;

        /* renamed from: j */
        public static final int f3108j = 9;

        /* renamed from: k */
        public static final int f3109k = 10;

        /* renamed from: l */
        public static final int f3110l = 11;

        /* renamed from: m */
        public static final int f3111m = 12;

        /* renamed from: a */
        public float f3112a = 0.0f;

        /* renamed from: a */
        public int f3113a = -1;

        /* renamed from: a */
        public boolean f3114a = false;

        /* renamed from: b */
        public float f3115b = 0.0f;

        /* renamed from: b */
        public boolean f3116b = false;

        /* renamed from: c */
        public float f3117c = 0.0f;

        /* renamed from: d */
        public float f3118d = 1.0f;

        /* renamed from: e */
        public float f3119e = 1.0f;

        /* renamed from: f */
        public float f3120f = Float.NaN;

        /* renamed from: g */
        public float f3121g = Float.NaN;

        /* renamed from: h */
        public float f3122h = 0.0f;

        /* renamed from: i */
        public float f3123i = 0.0f;

        /* renamed from: j */
        public float f3124j = 0.0f;

        /* renamed from: k */
        public float f3125k = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3099a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.Transform_android_rotation, 1);
            f3099a.append(C0435e.C0448m.Transform_android_rotationX, 2);
            f3099a.append(C0435e.C0448m.Transform_android_rotationY, 3);
            f3099a.append(C0435e.C0448m.Transform_android_scaleX, 4);
            f3099a.append(C0435e.C0448m.Transform_android_scaleY, 5);
            f3099a.append(C0435e.C0448m.Transform_android_transformPivotX, 6);
            f3099a.append(C0435e.C0448m.Transform_android_transformPivotY, 7);
            f3099a.append(C0435e.C0448m.Transform_android_translationX, 8);
            f3099a.append(C0435e.C0448m.Transform_android_translationY, 9);
            f3099a.append(C0435e.C0448m.Transform_android_translationZ, 10);
            f3099a.append(C0435e.C0448m.Transform_android_elevation, 11);
            f3099a.append(C0435e.C0448m.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void mo3524a(C0432e eVar) {
            this.f3114a = eVar.f3114a;
            this.f3112a = eVar.f3112a;
            this.f3115b = eVar.f3115b;
            this.f3117c = eVar.f3117c;
            this.f3118d = eVar.f3118d;
            this.f3119e = eVar.f3119e;
            this.f3120f = eVar.f3120f;
            this.f3121g = eVar.f3121g;
            this.f3113a = eVar.f3113a;
            this.f3122h = eVar.f3122h;
            this.f3123i = eVar.f3123i;
            this.f3124j = eVar.f3124j;
            this.f3116b = eVar.f3116b;
            this.f3125k = eVar.f3125k;
        }

        /* renamed from: b */
        public void mo3525b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.Transform);
            this.f3114a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3099a.get(index)) {
                    case 1:
                        this.f3112a = obtainStyledAttributes.getFloat(index, this.f3112a);
                        break;
                    case 2:
                        this.f3115b = obtainStyledAttributes.getFloat(index, this.f3115b);
                        break;
                    case 3:
                        this.f3117c = obtainStyledAttributes.getFloat(index, this.f3117c);
                        break;
                    case 4:
                        this.f3118d = obtainStyledAttributes.getFloat(index, this.f3118d);
                        break;
                    case 5:
                        this.f3119e = obtainStyledAttributes.getFloat(index, this.f3119e);
                        break;
                    case 6:
                        this.f3120f = obtainStyledAttributes.getDimension(index, this.f3120f);
                        break;
                    case 7:
                        this.f3121g = obtainStyledAttributes.getDimension(index, this.f3121g);
                        break;
                    case 8:
                        this.f3122h = obtainStyledAttributes.getDimension(index, this.f3122h);
                        break;
                    case 9:
                        this.f3123i = obtainStyledAttributes.getDimension(index, this.f3123i);
                        break;
                    case 10:
                        this.f3124j = obtainStyledAttributes.getDimension(index, this.f3124j);
                        break;
                    case 11:
                        this.f3116b = true;
                        this.f3125k = obtainStyledAttributes.getDimension(index, this.f3125k);
                        break;
                    case 12:
                        this.f3113a = C0426d.m3250y0(obtainStyledAttributes, index, this.f3113a);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$f */
    public class C0433f {

        /* renamed from: h */
        public static final String f3126h = "       ";

        /* renamed from: a */
        public int f3127a;

        /* renamed from: a */
        public Context f3128a;

        /* renamed from: a */
        public ConstraintLayout f3129a;

        /* renamed from: a */
        public Writer f3131a;

        /* renamed from: a */
        public final String f3132a = "'left'";

        /* renamed from: a */
        public HashMap<Integer, String> f3133a = new HashMap<>();

        /* renamed from: b */
        public int f3134b = 0;

        /* renamed from: b */
        public final String f3135b = "'right'";

        /* renamed from: c */
        public final String f3136c = "'baseline'";

        /* renamed from: d */
        public final String f3137d = "'bottom'";

        /* renamed from: e */
        public final String f3138e = "'top'";

        /* renamed from: f */
        public final String f3139f = "'start'";

        /* renamed from: g */
        public final String f3140g = "'end'";

        public C0433f(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.f3131a = writer;
            this.f3129a = constraintLayout;
            this.f3128a = constraintLayout.getContext();
            this.f3127a = i;
        }

        /* renamed from: a */
        public String mo3526a(int i) {
            if (this.f3133a.containsKey(Integer.valueOf(i))) {
                return "'" + this.f3133a.get(Integer.valueOf(i)) + "'";
            } else if (i == 0) {
                return "'parent'";
            } else {
                String b = mo3527b(i);
                this.f3133a.put(Integer.valueOf(i), b);
                return "'" + b + "'";
            }
        }

        /* renamed from: b */
        public String mo3527b(int i) {
            if (i != -1) {
                try {
                    return this.f3128a.getResources().getResourceEntryName(i);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(dv0.f10947b);
                    int i2 = this.f3134b + 1;
                    this.f3134b = i2;
                    sb.append(i2);
                    return sb.toString();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dv0.f10947b);
                int i3 = this.f3134b + 1;
                this.f3134b = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public void mo3528c(int i, float f, int i2) throws IOException {
            if (i != -1) {
                this.f3131a.write("       circle");
                this.f3131a.write(":[");
                this.f3131a.write(mo3526a(i));
                Writer writer = this.f3131a;
                writer.write(", " + f);
                Writer writer2 = this.f3131a;
                writer2.write(i2 + "]");
            }
        }

        /* renamed from: d */
        public void mo3529d(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i != -1) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                this.f3131a.write(":[");
                this.f3131a.write(mo3526a(i));
                this.f3131a.write(" , ");
                this.f3131a.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.f3131a;
                    writer2.write(" , " + i2);
                }
                this.f3131a.write("],\n");
            }
        }

        /* renamed from: e */
        public final void mo3530e(String str, int i, int i2, float f, int i3, int i4, boolean z) throws IOException {
            Writer writer;
            StringBuilder sb;
            String str2;
            Writer writer2;
            StringBuilder sb2;
            String str3;
            StringBuilder sb3;
            Writer writer3;
            String str4;
            if (i == 0) {
                if (i4 == -1 && i3 == -1) {
                    if (i2 == 1) {
                        writer3 = this.f3131a;
                        sb3 = new StringBuilder();
                        sb3.append(f3126h);
                        sb3.append(str);
                        str4 = ": '???????????',\n";
                    } else if (i2 == 2) {
                        writer3 = this.f3131a;
                        sb3 = new StringBuilder();
                        sb3.append(f3126h);
                        sb3.append(str);
                        sb3.append(": '");
                        sb3.append(f);
                        str4 = "%',\n";
                    } else {
                        return;
                    }
                    sb3.append(str4);
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        writer2 = this.f3131a;
                        sb2 = new StringBuilder();
                        sb2.append(f3126h);
                        sb2.append(str);
                        str3 = ": {'wrap' ,";
                    } else if (i2 == 2) {
                        writer2 = this.f3131a;
                        sb2 = new StringBuilder();
                        sb2.append(f3126h);
                        sb2.append(str);
                        sb2.append(": {'");
                        sb2.append(f);
                        str3 = "'% ,";
                    } else {
                        return;
                    }
                    sb3.append(str3);
                    sb3.append(i3);
                    sb3.append(", ");
                    sb3.append(i4);
                    sb3.append("}\n");
                } else {
                    Writer writer4 = this.f3131a;
                    writer4.write(f3126h + str + ": {'spread' ," + i3 + ", " + i4 + "}\n");
                    return;
                }
                writer3.write(sb3.toString());
                return;
            }
            if (i == -2) {
                writer = this.f3131a;
                sb = new StringBuilder();
                sb.append(f3126h);
                sb.append(str);
                str2 = ": 'wrap'\n";
            } else if (i == -1) {
                writer = this.f3131a;
                sb = new StringBuilder();
                sb.append(f3126h);
                sb.append(str);
                str2 = ": 'parent'\n";
            } else {
                Writer writer5 = this.f3131a;
                writer5.write(f3126h + str + ": " + i + ",\n");
                return;
            }
            sb.append(str2);
            writer.write(sb.toString());
        }

        /* renamed from: f */
        public final void mo3531f(int i, int i2, int i3, float f) {
        }

        /* renamed from: g */
        public void mo3532g() throws IOException {
            this.f3131a.write("\n'ConstraintSet':{\n");
            for (Integer num : C0426d.this.f2900b.keySet()) {
                String a = mo3526a(num.intValue());
                Writer writer = this.f3131a;
                writer.write(a + ":{\n");
                C0429b bVar = ((C0427a) C0426d.this.f2900b.get(num)).f2904a;
                mo3530e("height", bVar.f3027b, bVar.f3012P, bVar.f3046h, bVar.f3016T, bVar.f3014R, bVar.f3042f);
                mo3530e(yz1.f38148j, bVar.f3022a, bVar.f3011O, bVar.f3043g, bVar.f3015S, bVar.f3013Q, bVar.f3039e);
                mo3529d("'left'", bVar.f3038e, "'left'", bVar.f3064y, bVar.f3002F);
                mo3529d("'left'", bVar.f3041f, "'right'", bVar.f3064y, bVar.f3002F);
                mo3529d("'right'", bVar.f3044g, "'left'", bVar.f3065z, bVar.f3004H);
                mo3529d("'right'", bVar.f3047h, "'right'", bVar.f3065z, bVar.f3004H);
                mo3529d("'baseline'", bVar.f3052m, "'baseline'", -1, bVar.f3008L);
                mo3529d("'baseline'", bVar.f3053n, "'top'", -1, bVar.f3008L);
                mo3529d("'baseline'", bVar.f3054o, "'bottom'", -1, bVar.f3008L);
                mo3529d("'top'", bVar.f3049j, "'bottom'", bVar.f2997A, bVar.f3003G);
                mo3529d("'top'", bVar.f3048i, "'top'", bVar.f2997A, bVar.f3003G);
                mo3529d("'bottom'", bVar.f3051l, "'bottom'", bVar.f2998B, bVar.f3005I);
                mo3529d("'bottom'", bVar.f3050k, "'top'", bVar.f2998B, bVar.f3005I);
                mo3529d("'start'", bVar.f3056q, "'start'", bVar.f3000D, bVar.f3007K);
                mo3529d("'start'", bVar.f3055p, "'end'", bVar.f3000D, bVar.f3007K);
                mo3529d("'end'", bVar.f3057r, "'start'", bVar.f2999C, bVar.f3006J);
                mo3529d("'end'", bVar.f3058s, "'end'", bVar.f2999C, bVar.f3006J);
                mo3534i("'horizontalBias'", bVar.f3026b, 0.5f);
                mo3534i("'verticalBias'", bVar.f3030c, 0.5f);
                mo3528c(bVar.f3059t, bVar.f3034d, bVar.f3060u);
                mo3531f(bVar.f3063x, bVar.f3031c, bVar.f3035d, bVar.f3021a);
                mo3536k("'dimensionRatio'", bVar.f3023a);
                mo3535j("'barrierMargin'", bVar.f3018V);
                mo3535j("'type'", bVar.f3019W);
                mo3536k("'ReferenceId'", bVar.f3028b);
                mo3538m("'mBarrierAllowsGoneWidgets'", bVar.f3045g, true);
                mo3535j("'WrapBehavior'", bVar.f3020X);
                mo3533h("'verticalWeight'", bVar.f3037e);
                mo3533h("'horizontalWeight'", bVar.f3040f);
                mo3535j("'horizontalChainStyle'", bVar.f3009M);
                mo3535j("'verticalChainStyle'", bVar.f3010N);
                mo3535j("'barrierDirection'", bVar.f3017U);
                int[] iArr = bVar.f3025a;
                if (iArr != null) {
                    mo3539n("'ReferenceIds'", iArr);
                }
                this.f3131a.write("}\n");
            }
            this.f3131a.write("}\n");
        }

        /* renamed from: h */
        public void mo3533h(String str, float f) throws IOException {
            if (f != -1.0f) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                Writer writer2 = this.f3131a;
                writer2.write(": " + f);
                this.f3131a.write(",\n");
            }
        }

        /* renamed from: i */
        public void mo3534i(String str, float f, float f2) throws IOException {
            if (f != f2) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                Writer writer2 = this.f3131a;
                writer2.write(": " + f);
                this.f3131a.write(",\n");
            }
        }

        /* renamed from: j */
        public void mo3535j(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                this.f3131a.write(ar4.f25981a);
                Writer writer2 = this.f3131a;
                writer2.write(", " + i);
                this.f3131a.write("\n");
            }
        }

        /* renamed from: k */
        public void mo3536k(String str, String str2) throws IOException {
            if (str2 != null) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                this.f3131a.write(ar4.f25981a);
                Writer writer2 = this.f3131a;
                writer2.write(", " + str2);
                this.f3131a.write("\n");
            }
        }

        /* renamed from: l */
        public void mo3537l(String str, boolean z) throws IOException {
            if (z) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                Writer writer2 = this.f3131a;
                writer2.write(": " + z);
                this.f3131a.write(",\n");
            }
        }

        /* renamed from: m */
        public void mo3538m(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                Writer writer2 = this.f3131a;
                writer2.write(": " + z);
                this.f3131a.write(",\n");
            }
        }

        /* renamed from: n */
        public void mo3539n(String str, int[] iArr) throws IOException {
            if (iArr != null) {
                Writer writer = this.f3131a;
                writer.write(f3126h + str);
                this.f3131a.write(": ");
                int i = 0;
                while (i < iArr.length) {
                    Writer writer2 = this.f3131a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i == 0 ? "[" : ", ");
                    sb.append(mo3526a(iArr[i]));
                    writer2.write(sb.toString());
                    i++;
                }
                this.f3131a.write("],\n");
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$g */
    public class C0434g {

        /* renamed from: h */
        public static final String f3141h = "\n       ";

        /* renamed from: a */
        public int f3142a;

        /* renamed from: a */
        public Context f3143a;

        /* renamed from: a */
        public ConstraintLayout f3144a;

        /* renamed from: a */
        public Writer f3146a;

        /* renamed from: a */
        public final String f3147a = "'left'";

        /* renamed from: a */
        public HashMap<Integer, String> f3148a = new HashMap<>();

        /* renamed from: b */
        public int f3149b = 0;

        /* renamed from: b */
        public final String f3150b = "'right'";

        /* renamed from: c */
        public final String f3151c = "'baseline'";

        /* renamed from: d */
        public final String f3152d = "'bottom'";

        /* renamed from: e */
        public final String f3153e = "'top'";

        /* renamed from: f */
        public final String f3154f = "'start'";

        /* renamed from: g */
        public final String f3155g = "'end'";

        public C0434g(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.f3146a = writer;
            this.f3144a = constraintLayout;
            this.f3143a = constraintLayout.getContext();
            this.f3142a = i;
        }

        /* renamed from: a */
        public String mo3540a(int i) {
            if (this.f3148a.containsKey(Integer.valueOf(i))) {
                return "@+id/" + this.f3148a.get(Integer.valueOf(i)) + "";
            } else if (i == 0) {
                return C0426d.f2835g;
            } else {
                String b = mo3541b(i);
                this.f3148a.put(Integer.valueOf(i), b);
                return "@+id/" + b + "";
            }
        }

        /* renamed from: b */
        public String mo3541b(int i) {
            if (i != -1) {
                try {
                    return this.f3143a.getResources().getResourceEntryName(i);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(dv0.f10947b);
                    int i2 = this.f3149b + 1;
                    this.f3149b = i2;
                    sb.append(i2);
                    return sb.toString();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dv0.f10947b);
                int i3 = this.f3149b + 1;
                this.f3149b = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public final void mo3542c(String str, int i, int i2) throws IOException {
            Writer writer;
            StringBuilder sb;
            String str2;
            if (i != i2) {
                if (i == -2) {
                    writer = this.f3146a;
                    sb = new StringBuilder();
                    sb.append(f3141h);
                    sb.append(str);
                    str2 = "=\"wrap_content\"";
                } else if (i == -1) {
                    writer = this.f3146a;
                    sb = new StringBuilder();
                    sb.append(f3141h);
                    sb.append(str);
                    str2 = "=\"match_parent\"";
                } else {
                    Writer writer2 = this.f3146a;
                    writer2.write(f3141h + str + "=\"" + i + "dp\"");
                    return;
                }
                sb.append(str2);
                writer.write(sb.toString());
            }
        }

        /* renamed from: d */
        public final void mo3543d(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str + "=\"" + z + "dp\"");
            }
        }

        /* renamed from: e */
        public void mo3544e(int i, float f, int i2) throws IOException {
            if (i != -1) {
                this.f3146a.write("circle");
                this.f3146a.write(":[");
                this.f3146a.write(mo3540a(i));
                Writer writer = this.f3146a;
                writer.write(", " + f);
                Writer writer2 = this.f3146a;
                writer2.write(i2 + "]");
            }
        }

        /* renamed from: f */
        public void mo3545f(String str, int i, String str2, int i2, int i3) throws IOException {
            if (i != -1) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str);
                this.f3146a.write(":[");
                this.f3146a.write(mo3540a(i));
                this.f3146a.write(" , ");
                this.f3146a.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.f3146a;
                    writer2.write(" , " + i2);
                }
                this.f3146a.write("],\n");
            }
        }

        /* renamed from: g */
        public final void mo3546g(String str, int i, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str + "=\"" + i + "dp\"");
            }
        }

        /* renamed from: h */
        public final void mo3547h(String str, int i, String[] strArr, int i2) throws IOException {
            if (i != i2) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str + "=\"" + strArr[i] + "\"");
            }
        }

        /* renamed from: i */
        public void mo3548i() throws IOException {
            this.f3146a.write("\n<ConstraintSet>\n");
            for (Integer num : C0426d.this.f2900b.keySet()) {
                String a = mo3540a(num.intValue());
                this.f3146a.write("  <Constraint");
                Writer writer = this.f3146a;
                writer.write("\n       android:id=\"" + a + "\"");
                C0429b bVar = ((C0427a) C0426d.this.f2900b.get(num)).f2904a;
                mo3542c("android:layout_width", bVar.f3022a, -5);
                mo3542c("android:layout_height", bVar.f3027b, -5);
                mo3549j("app:layout_constraintGuide_begin", (float) bVar.f3031c, -1.0f);
                mo3549j("app:layout_constraintGuide_end", (float) bVar.f3035d, -1.0f);
                mo3549j("app:layout_constraintGuide_percent", bVar.f3021a, -1.0f);
                mo3549j("app:layout_constraintHorizontal_bias", bVar.f3026b, 0.5f);
                mo3549j("app:layout_constraintVertical_bias", bVar.f3030c, 0.5f);
                mo3552m("app:layout_constraintDimensionRatio", bVar.f3023a, (String) null);
                mo3554o("app:layout_constraintCircle", bVar.f3059t);
                mo3549j("app:layout_constraintCircleRadius", (float) bVar.f3060u, 0.0f);
                mo3549j("app:layout_constraintCircleAngle", bVar.f3034d, 0.0f);
                mo3549j("android:orientation", (float) bVar.f3063x, -1.0f);
                mo3549j("app:layout_constraintVertical_weight", bVar.f3037e, -1.0f);
                mo3549j("app:layout_constraintHorizontal_weight", bVar.f3040f, -1.0f);
                mo3549j("app:layout_constraintHorizontal_chainStyle", (float) bVar.f3009M, 0.0f);
                mo3549j("app:layout_constraintVertical_chainStyle", (float) bVar.f3010N, 0.0f);
                mo3549j("app:barrierDirection", (float) bVar.f3017U, -1.0f);
                mo3549j("app:barrierMargin", (float) bVar.f3018V, 0.0f);
                mo3546g("app:layout_marginLeft", bVar.f3064y, 0);
                mo3546g("app:layout_goneMarginLeft", bVar.f3002F, Integer.MIN_VALUE);
                mo3546g("app:layout_marginRight", bVar.f3065z, 0);
                mo3546g("app:layout_goneMarginRight", bVar.f3004H, Integer.MIN_VALUE);
                mo3546g("app:layout_marginStart", bVar.f3000D, 0);
                mo3546g("app:layout_goneMarginStart", bVar.f3007K, Integer.MIN_VALUE);
                mo3546g("app:layout_marginEnd", bVar.f2999C, 0);
                mo3546g("app:layout_goneMarginEnd", bVar.f3006J, Integer.MIN_VALUE);
                mo3546g("app:layout_marginTop", bVar.f2997A, 0);
                mo3546g("app:layout_goneMarginTop", bVar.f3003G, Integer.MIN_VALUE);
                mo3546g("app:layout_marginBottom", bVar.f2998B, 0);
                mo3546g("app:layout_goneMarginBottom", bVar.f3005I, Integer.MIN_VALUE);
                mo3546g("app:goneBaselineMargin", bVar.f3008L, Integer.MIN_VALUE);
                mo3546g("app:baselineMargin", bVar.f3001E, 0);
                mo3543d("app:layout_constrainedWidth", bVar.f3039e, false);
                mo3543d("app:layout_constrainedHeight", bVar.f3042f, false);
                mo3543d("app:barrierAllowsGoneWidgets", bVar.f3045g, true);
                mo3549j("app:layout_wrapBehaviorInParent", (float) bVar.f3020X, 0.0f);
                mo3554o("app:baselineToBaseline", bVar.f3052m);
                mo3554o("app:baselineToBottom", bVar.f3054o);
                mo3554o("app:baselineToTop", bVar.f3053n);
                mo3554o("app:layout_constraintBottom_toBottomOf", bVar.f3051l);
                mo3554o("app:layout_constraintBottom_toTopOf", bVar.f3050k);
                mo3554o("app:layout_constraintEnd_toEndOf", bVar.f3058s);
                mo3554o("app:layout_constraintEnd_toStartOf", bVar.f3057r);
                mo3554o("app:layout_constraintLeft_toLeftOf", bVar.f3038e);
                mo3554o("app:layout_constraintLeft_toRightOf", bVar.f3041f);
                mo3554o("app:layout_constraintRight_toLeftOf", bVar.f3044g);
                mo3554o("app:layout_constraintRight_toRightOf", bVar.f3047h);
                mo3554o("app:layout_constraintStart_toEndOf", bVar.f3055p);
                mo3554o("app:layout_constraintStart_toStartOf", bVar.f3056q);
                mo3554o("app:layout_constraintTop_toBottomOf", bVar.f3049j);
                mo3554o("app:layout_constraintTop_toTopOf", bVar.f3048i);
                String[] strArr = {"spread", "wrap", "percent"};
                mo3547h("app:layout_constraintHeight_default", bVar.f3012P, strArr, 0);
                mo3549j("app:layout_constraintHeight_percent", bVar.f3046h, 1.0f);
                mo3546g("app:layout_constraintHeight_min", bVar.f3016T, 0);
                mo3546g("app:layout_constraintHeight_max", bVar.f3014R, 0);
                mo3543d("android:layout_constrainedHeight", bVar.f3042f, false);
                mo3547h("app:layout_constraintWidth_default", bVar.f3011O, strArr, 0);
                mo3549j("app:layout_constraintWidth_percent", bVar.f3043g, 1.0f);
                mo3546g("app:layout_constraintWidth_min", bVar.f3015S, 0);
                mo3546g("app:layout_constraintWidth_max", bVar.f3013Q, 0);
                mo3543d("android:layout_constrainedWidth", bVar.f3039e, false);
                mo3549j("app:layout_constraintVertical_weight", bVar.f3037e, -1.0f);
                mo3549j("app:layout_constraintHorizontal_weight", bVar.f3040f, -1.0f);
                mo3550k("app:layout_constraintHorizontal_chainStyle", bVar.f3009M);
                mo3550k("app:layout_constraintVertical_chainStyle", bVar.f3010N);
                mo3547h("app:barrierDirection", bVar.f3017U, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                mo3552m("app:layout_constraintTag", bVar.f3032c, (String) null);
                int[] iArr = bVar.f3025a;
                if (iArr != null) {
                    mo3553n("'ReferenceIds'", iArr);
                }
                this.f3146a.write(" />\n");
            }
            this.f3146a.write("</ConstraintSet>\n");
        }

        /* renamed from: j */
        public void mo3549j(String str, float f, float f2) throws IOException {
            if (f != f2) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str);
                Writer writer2 = this.f3146a;
                writer2.write("=\"" + f + "\"");
            }
        }

        /* renamed from: k */
        public void mo3550k(String str, int i) throws IOException {
            if (i != 0 && i != -1) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str + "=\"" + i + "\"\n");
            }
        }

        /* renamed from: l */
        public void mo3551l(String str, String str2) throws IOException {
            if (str2 != null) {
                this.f3146a.write(str);
                this.f3146a.write(ar4.f25981a);
                Writer writer = this.f3146a;
                writer.write(", " + str2);
                this.f3146a.write("\n");
            }
        }

        /* renamed from: m */
        public void mo3552m(String str, String str2, String str3) throws IOException {
            if (str2 != null && !str2.equals(str3)) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str);
                Writer writer2 = this.f3146a;
                writer2.write("=\"" + str2 + "\"");
            }
        }

        /* renamed from: n */
        public void mo3553n(String str, int[] iArr) throws IOException {
            if (iArr != null) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str);
                this.f3146a.write(ar4.f25981a);
                int i = 0;
                while (i < iArr.length) {
                    Writer writer2 = this.f3146a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i == 0 ? "[" : ", ");
                    sb.append(mo3540a(iArr[i]));
                    writer2.write(sb.toString());
                    i++;
                }
                this.f3146a.write("],\n");
            }
        }

        /* renamed from: o */
        public void mo3554o(String str, int i) throws IOException {
            if (i != -1) {
                Writer writer = this.f3146a;
                writer.write(f3141h + str);
                Writer writer2 = this.f3146a;
                writer2.write("=\"" + mo3540a(i) + "\"");
            }
        }
    }

    static {
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintLeft_toRightOf, 26);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintRight_toLeftOf, 29);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintRight_toRightOf, 30);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintTop_toTopOf, 36);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintTop_toBottomOf, 35);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBottom_toTopOf, 4);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBaseline_toTopOf, 91);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f2809a.append(C0435e.C0448m.Constraint_layout_editor_absoluteX, 6);
        f2809a.append(C0435e.C0448m.Constraint_layout_editor_absoluteY, 7);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintGuide_begin, 17);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintGuide_end, 18);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintGuide_percent, 19);
        f2809a.append(C0435e.C0448m.Constraint_guidelineUseRtl, 99);
        f2809a.append(C0435e.C0448m.Constraint_android_orientation, 27);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintStart_toEndOf, 32);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintStart_toStartOf, 33);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintEnd_toStartOf, 10);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintEnd_toEndOf, 9);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginLeft, 13);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginTop, 16);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginRight, 14);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginBottom, 11);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginStart, 15);
        f2809a.append(C0435e.C0448m.Constraint_layout_goneMarginEnd, 12);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintVertical_weight, 40);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHorizontal_weight, 39);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintVertical_chainStyle, 42);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHorizontal_bias, 20);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintVertical_bias, 37);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintDimensionRatio, 5);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintLeft_creator, 87);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintTop_creator, 87);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintRight_creator, 87);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBottom_creator, 87);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintBaseline_creator, 87);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginLeft, 24);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginRight, 28);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginStart, 31);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginEnd, 8);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginTop, 34);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_marginBottom, 2);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_width, 23);
        f2809a.append(C0435e.C0448m.Constraint_android_layout_height, 21);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintWidth, 95);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHeight, 96);
        f2809a.append(C0435e.C0448m.Constraint_android_visibility, 22);
        f2809a.append(C0435e.C0448m.Constraint_android_alpha, 43);
        f2809a.append(C0435e.C0448m.Constraint_android_elevation, 44);
        f2809a.append(C0435e.C0448m.Constraint_android_rotationX, 45);
        f2809a.append(C0435e.C0448m.Constraint_android_rotationY, 46);
        f2809a.append(C0435e.C0448m.Constraint_android_rotation, 60);
        f2809a.append(C0435e.C0448m.Constraint_android_scaleX, 47);
        f2809a.append(C0435e.C0448m.Constraint_android_scaleY, 48);
        f2809a.append(C0435e.C0448m.Constraint_android_transformPivotX, 49);
        f2809a.append(C0435e.C0448m.Constraint_android_transformPivotY, 50);
        f2809a.append(C0435e.C0448m.Constraint_android_translationX, 51);
        f2809a.append(C0435e.C0448m.Constraint_android_translationY, 52);
        f2809a.append(C0435e.C0448m.Constraint_android_translationZ, 53);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintWidth_default, 54);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHeight_default, 55);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintWidth_max, 56);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHeight_max, 57);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintWidth_min, 58);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHeight_min, 59);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintCircle, 61);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintCircleRadius, 62);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintCircleAngle, 63);
        f2809a.append(C0435e.C0448m.Constraint_animateRelativeTo, 64);
        f2809a.append(C0435e.C0448m.Constraint_transitionEasing, 65);
        f2809a.append(C0435e.C0448m.Constraint_drawPath, 66);
        f2809a.append(C0435e.C0448m.Constraint_transitionPathRotate, 67);
        f2809a.append(C0435e.C0448m.Constraint_motionStagger, 79);
        f2809a.append(C0435e.C0448m.Constraint_android_id, 38);
        f2809a.append(C0435e.C0448m.Constraint_motionProgress, 68);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintWidth_percent, 69);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintHeight_percent, 70);
        f2809a.append(C0435e.C0448m.Constraint_layout_wrapBehaviorInParent, 97);
        f2809a.append(C0435e.C0448m.Constraint_chainUseRtl, 71);
        f2809a.append(C0435e.C0448m.Constraint_barrierDirection, 72);
        f2809a.append(C0435e.C0448m.Constraint_barrierMargin, 73);
        f2809a.append(C0435e.C0448m.Constraint_constraint_referenced_ids, 74);
        f2809a.append(C0435e.C0448m.Constraint_barrierAllowsGoneWidgets, 75);
        f2809a.append(C0435e.C0448m.Constraint_pathMotionArc, 76);
        f2809a.append(C0435e.C0448m.Constraint_layout_constraintTag, 77);
        f2809a.append(C0435e.C0448m.Constraint_visibilityMode, 78);
        f2809a.append(C0435e.C0448m.Constraint_layout_constrainedWidth, 80);
        f2809a.append(C0435e.C0448m.Constraint_layout_constrainedHeight, 81);
        f2809a.append(C0435e.C0448m.Constraint_polarRelativeTo, 82);
        f2809a.append(C0435e.C0448m.Constraint_transformPivotTarget, 83);
        f2809a.append(C0435e.C0448m.Constraint_quantizeMotionSteps, 84);
        f2809a.append(C0435e.C0448m.Constraint_quantizeMotionPhase, 85);
        f2809a.append(C0435e.C0448m.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f2814b;
        int i = C0435e.C0448m.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f2814b.append(i, 7);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_orientation, 27);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginLeft, 13);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginTop, 16);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginRight, 14);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginBottom, 11);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginStart, 15);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_goneMarginEnd, 12);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintVertical_weight, 40);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintVertical_bias, 37);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintLeft_creator, 87);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintTop_creator, 87);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintRight_creator, 87);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintBottom_creator, 87);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginLeft, 24);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginRight, 28);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginStart, 31);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginEnd, 8);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginTop, 34);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_marginBottom, 2);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_width, 23);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_layout_height, 21);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintWidth, 95);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHeight, 96);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_visibility, 22);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_alpha, 43);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_elevation, 44);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_rotationX, 45);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_rotationY, 46);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_rotation, 60);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_scaleX, 47);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_scaleY, 48);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_transformPivotX, 49);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_transformPivotY, 50);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_translationX, 51);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_translationY, 52);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_translationZ, 53);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintWidth_default, 54);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHeight_default, 55);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintWidth_max, 56);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHeight_max, 57);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintWidth_min, 58);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHeight_min, 59);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintCircleRadius, 62);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintCircleAngle, 63);
        f2814b.append(C0435e.C0448m.ConstraintOverride_animateRelativeTo, 64);
        f2814b.append(C0435e.C0448m.ConstraintOverride_transitionEasing, 65);
        f2814b.append(C0435e.C0448m.ConstraintOverride_drawPath, 66);
        f2814b.append(C0435e.C0448m.ConstraintOverride_transitionPathRotate, 67);
        f2814b.append(C0435e.C0448m.ConstraintOverride_motionStagger, 79);
        f2814b.append(C0435e.C0448m.ConstraintOverride_android_id, 38);
        f2814b.append(C0435e.C0448m.ConstraintOverride_motionTarget, 98);
        f2814b.append(C0435e.C0448m.ConstraintOverride_motionProgress, 68);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintWidth_percent, 69);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintHeight_percent, 70);
        f2814b.append(C0435e.C0448m.ConstraintOverride_chainUseRtl, 71);
        f2814b.append(C0435e.C0448m.ConstraintOverride_barrierDirection, 72);
        f2814b.append(C0435e.C0448m.ConstraintOverride_barrierMargin, 73);
        f2814b.append(C0435e.C0448m.ConstraintOverride_constraint_referenced_ids, 74);
        f2814b.append(C0435e.C0448m.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f2814b.append(C0435e.C0448m.ConstraintOverride_pathMotionArc, 76);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constraintTag, 77);
        f2814b.append(C0435e.C0448m.ConstraintOverride_visibilityMode, 78);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constrainedWidth, 80);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_constrainedHeight, 81);
        f2814b.append(C0435e.C0448m.ConstraintOverride_polarRelativeTo, 82);
        f2814b.append(C0435e.C0448m.ConstraintOverride_transformPivotTarget, 83);
        f2814b.append(C0435e.C0448m.ConstraintOverride_quantizeMotionSteps, 84);
        f2814b.append(C0435e.C0448m.ConstraintOverride_quantizeMotionPhase, 85);
        f2814b.append(C0435e.C0448m.ConstraintOverride_quantizeMotionInterpolator, 86);
        f2814b.append(C0435e.C0448m.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: A0 */
    public static void m3231A0(Object obj, TypedArray typedArray, int i, int i2) {
        int i3;
        if (obj != null) {
            int i4 = typedArray.peekValue(i).type;
            if (i4 != 3) {
                int i5 = -2;
                boolean z = false;
                if (i4 != 5) {
                    int i6 = typedArray.getInt(i, 0);
                    if (i6 != -4) {
                        i5 = (i6 == -3 || !(i6 == -2 || i6 == -1)) ? 0 : i6;
                    } else {
                        z = true;
                    }
                } else {
                    i5 = typedArray.getDimensionPixelSize(i, 0);
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        layoutParams.width = i5;
                        layoutParams.f2562d = z;
                        return;
                    }
                    layoutParams.height = i5;
                    layoutParams.f2565e = z;
                } else if (obj instanceof C0429b) {
                    C0429b bVar = (C0429b) obj;
                    if (i2 == 0) {
                        bVar.f3022a = i5;
                        bVar.f3039e = z;
                        return;
                    }
                    bVar.f3027b = i5;
                    bVar.f3042f = z;
                } else if (obj instanceof C0427a.C0428a) {
                    C0427a.C0428a aVar = (C0427a.C0428a) obj;
                    if (i2 == 0) {
                        aVar.mo3512b(23, i5);
                        i3 = 80;
                    } else {
                        aVar.mo3512b(21, i5);
                        i3 = 81;
                    }
                    aVar.mo3514d(i3, z);
                }
            } else {
                m3232B0(obj, typedArray.getString(i), i2);
            }
        }
    }

    /* renamed from: B0 */
    public static void m3232B0(Object obj, String str, int i) {
        int i2;
        int i3;
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if (f2831f.equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams.width = 0;
                            } else {
                                layoutParams.height = 0;
                            }
                            m3233C0(layoutParams, trim2);
                        } else if (obj instanceof C0429b) {
                            ((C0429b) obj).f3023a = trim2;
                        } else if (obj instanceof C0427a.C0428a) {
                            ((C0427a.C0428a) obj).mo3513c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.LayoutParams) {
                                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                                if (i == 0) {
                                    layoutParams2.width = 0;
                                    layoutParams2.f2566f = parseFloat;
                                    return;
                                }
                                layoutParams2.height = 0;
                                layoutParams2.f2569g = parseFloat;
                            } else if (obj instanceof C0429b) {
                                C0429b bVar = (C0429b) obj;
                                if (i == 0) {
                                    bVar.f3022a = 0;
                                    bVar.f3040f = parseFloat;
                                    return;
                                }
                                bVar.f3027b = 0;
                                bVar.f3037e = parseFloat;
                            } else if (obj instanceof C0427a.C0428a) {
                                C0427a.C0428a aVar = (C0427a.C0428a) obj;
                                if (i == 0) {
                                    aVar.mo3512b(23, 0);
                                    i3 = 39;
                                } else {
                                    aVar.mo3512b(21, 0);
                                    i3 = 40;
                                }
                                aVar.mo3511a(i3, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (f2835g.equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams3.width = 0;
                                layoutParams3.f2572h = max;
                                layoutParams3.f2530E = 2;
                                return;
                            }
                            layoutParams3.height = 0;
                            layoutParams3.f2575i = max;
                            layoutParams3.f2531F = 2;
                        } else if (obj instanceof C0429b) {
                            C0429b bVar2 = (C0429b) obj;
                            if (i == 0) {
                                bVar2.f3022a = 0;
                                bVar2.f3043g = max;
                                bVar2.f3011O = 2;
                                return;
                            }
                            bVar2.f3027b = 0;
                            bVar2.f3046h = max;
                            bVar2.f3012P = 2;
                        } else if (obj instanceof C0427a.C0428a) {
                            C0427a.C0428a aVar2 = (C0427a.C0428a) obj;
                            if (i == 0) {
                                aVar2.mo3512b(23, 0);
                                i2 = 54;
                            } else {
                                aVar2.mo3512b(21, 0);
                                i2 = 55;
                            }
                            aVar2.mo3512b(i2, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: C0 */
    public static void m3233C0(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(mx0.f16714k2)) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        layoutParams.f2551a = str;
        layoutParams.f2563e = f;
        layoutParams.f2527B = i;
    }

    /* renamed from: G1 */
    public static String[] m3234G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (charArray[i2] == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031a, code lost:
        r3 = r13.getFloat(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x031e, code lost:
        r0.mo3511a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x036c, code lost:
        r3 = r13.getDimensionPixelOffset(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0372, code lost:
        r0.mo3513c(r4, r13.getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037f, code lost:
        r3 = r13.getDimensionPixelSize(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0383, code lost:
        r0.mo3512b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0386, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        r3 = r13.getInteger(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017f, code lost:
        r0.mo3514d(r4, r13.getBoolean(r3, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        r4.append(r5);
        r4.append(java.lang.Integer.toHexString(r3));
        r4.append("   ");
        r4.append(f2809a.get(r3));
        android.util.Log.w("ConstraintSet", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e5, code lost:
        r3 = m3250y0(r13, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        r3 = r13.getDimension(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02dc, code lost:
        r3 = r13.getInt(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0307, code lost:
        r3 = r13.getLayoutDimension(r3, r5);
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3235H0(android.content.Context r11, androidx.constraintlayout.widget.C0426d.C0427a r12, android.content.res.TypedArray r13) {
        /*
            int r11 = r13.getIndexCount()
            androidx.constraintlayout.widget.d$a$a r0 = new androidx.constraintlayout.widget.d$a$a
            r0.<init>()
            r12.f2903a = r0
            androidx.constraintlayout.widget.d$c r1 = r12.f2905a
            r2 = 0
            r1.f3083a = r2
            androidx.constraintlayout.widget.d$b r1 = r12.f2904a
            r1.f3029b = r2
            androidx.constraintlayout.widget.d$d r1 = r12.f2906a
            r1.f3096a = r2
            androidx.constraintlayout.widget.d$e r1 = r12.f2907a
            r1.f3114a = r2
            r1 = 0
        L_0x001d:
            if (r1 >= r11) goto L_0x038a
            int r3 = r13.getIndex(r1)
            android.util.SparseIntArray r4 = f2814b
            int r4 = r4.get(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "   "
            r7 = 3
            java.lang.String r8 = "ConstraintSet"
            r9 = 1
            r10 = -1
            switch(r4) {
                case 2: goto L_0x037a;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0371;
                case 6: goto L_0x0367;
                case 7: goto L_0x0361;
                case 8: goto L_0x035a;
                case 9: goto L_0x0035;
                case 10: goto L_0x0035;
                case 11: goto L_0x0353;
                case 12: goto L_0x034c;
                case 13: goto L_0x0345;
                case 14: goto L_0x033e;
                case 15: goto L_0x0337;
                case 16: goto L_0x0330;
                case 17: goto L_0x0329;
                case 18: goto L_0x0322;
                case 19: goto L_0x0314;
                case 20: goto L_0x030d;
                case 21: goto L_0x0301;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02ea;
                case 24: goto L_0x02e2;
                case 25: goto L_0x0035;
                case 26: goto L_0x0035;
                case 27: goto L_0x02d6;
                case 28: goto L_0x02ce;
                case 29: goto L_0x0035;
                case 30: goto L_0x0035;
                case 31: goto L_0x02c6;
                case 32: goto L_0x0035;
                case 33: goto L_0x0035;
                case 34: goto L_0x02be;
                case 35: goto L_0x0035;
                case 36: goto L_0x0035;
                case 37: goto L_0x02b7;
                case 38: goto L_0x02ab;
                case 39: goto L_0x02a3;
                case 40: goto L_0x029b;
                case 41: goto L_0x0294;
                case 42: goto L_0x028d;
                case 43: goto L_0x0285;
                case 44: goto L_0x027b;
                case 45: goto L_0x0273;
                case 46: goto L_0x026b;
                case 47: goto L_0x0263;
                case 48: goto L_0x025b;
                case 49: goto L_0x024f;
                case 50: goto L_0x0248;
                case 51: goto L_0x0241;
                case 52: goto L_0x023a;
                case 53: goto L_0x0233;
                case 54: goto L_0x022b;
                case 55: goto L_0x0223;
                case 56: goto L_0x021b;
                case 57: goto L_0x0213;
                case 58: goto L_0x020b;
                case 59: goto L_0x0203;
                case 60: goto L_0x01fb;
                case 61: goto L_0x0035;
                case 62: goto L_0x01f3;
                case 63: goto L_0x01eb;
                case 64: goto L_0x01df;
                case 65: goto L_0x01c3;
                case 66: goto L_0x01bb;
                case 67: goto L_0x01b3;
                case 68: goto L_0x01ab;
                case 69: goto L_0x01a7;
                case 70: goto L_0x01a3;
                case 71: goto L_0x019c;
                case 72: goto L_0x0194;
                case 73: goto L_0x018c;
                case 74: goto L_0x0188;
                case 75: goto L_0x0179;
                case 76: goto L_0x0171;
                case 77: goto L_0x016d;
                case 78: goto L_0x0165;
                case 79: goto L_0x015d;
                case 80: goto L_0x0156;
                case 81: goto L_0x014f;
                case 82: goto L_0x0143;
                case 83: goto L_0x013b;
                case 84: goto L_0x0134;
                case 85: goto L_0x012c;
                case 86: goto L_0x00b6;
                case 87: goto L_0x00ae;
                case 88: goto L_0x0035;
                case 89: goto L_0x0035;
                case 90: goto L_0x0035;
                case 91: goto L_0x0035;
                case 92: goto L_0x0035;
                case 93: goto L_0x00a6;
                case 94: goto L_0x009e;
                case 95: goto L_0x0099;
                case 96: goto L_0x0094;
                case 97: goto L_0x008c;
                case 98: goto L_0x0063;
                case 99: goto L_0x005b;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown attribute 0x"
        L_0x003c:
            r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            r4.append(r6)
            android.util.SparseIntArray r5 = f2809a
            int r3 = r5.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
            goto L_0x0386
        L_0x005b:
            r4 = 99
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            boolean r5 = r5.f3036d
            goto L_0x017f
        L_0x0063:
            boolean r4 = androidx.constraintlayout.motion.widget.MotionLayout.f1969w
            if (r4 == 0) goto L_0x0072
            int r4 = r12.f2902a
            int r4 = r13.getResourceId(r3, r4)
            r12.f2902a = r4
            if (r4 != r10) goto L_0x0386
            goto L_0x007a
        L_0x0072:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            if (r4 != r7) goto L_0x0082
        L_0x007a:
            java.lang.String r3 = r13.getString(r3)
            r12.f2908a = r3
            goto L_0x0386
        L_0x0082:
            int r4 = r12.f2902a
            int r3 = r13.getResourceId(r3, r4)
            r12.f2902a = r3
            goto L_0x0386
        L_0x008c:
            r4 = 97
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3020X
            goto L_0x02dc
        L_0x0094:
            m3231A0(r0, r13, r3, r9)
            goto L_0x0386
        L_0x0099:
            m3231A0(r0, r13, r3, r2)
            goto L_0x0386
        L_0x009e:
            r4 = 94
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3008L
            goto L_0x037f
        L_0x00a6:
            r4 = 93
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3001E
            goto L_0x037f
        L_0x00ae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unused attribute 0x"
            goto L_0x003c
        L_0x00b6:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = -2
            r6 = 89
            r8 = 88
            if (r4 != r9) goto L_0x00df
            androidx.constraintlayout.widget.d$c r4 = r12.f2905a
            int r3 = r13.getResourceId(r3, r10)
            r4.f3093h = r3
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            int r3 = r3.f3093h
            r0.mo3512b(r6, r3)
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            int r4 = r3.f3093h
            if (r4 == r10) goto L_0x0386
        L_0x00d8:
            r3.f3092g = r5
            r0.mo3512b(r8, r5)
            goto L_0x0386
        L_0x00df:
            if (r4 != r7) goto L_0x0119
            androidx.constraintlayout.widget.d$c r4 = r12.f2905a
            java.lang.String r7 = r13.getString(r3)
            r4.f3086b = r7
            r4 = 90
            androidx.constraintlayout.widget.d$c r7 = r12.f2905a
            java.lang.String r7 = r7.f3086b
            r0.mo3513c(r4, r7)
            androidx.constraintlayout.widget.d$c r4 = r12.f2905a
            java.lang.String r4 = r4.f3086b
            java.lang.String r7 = "/"
            int r4 = r4.indexOf(r7)
            if (r4 <= 0) goto L_0x0110
            androidx.constraintlayout.widget.d$c r4 = r12.f2905a
            int r3 = r13.getResourceId(r3, r10)
            r4.f3093h = r3
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            int r3 = r3.f3093h
            r0.mo3512b(r6, r3)
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            goto L_0x00d8
        L_0x0110:
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            r3.f3092g = r10
            r0.mo3512b(r8, r10)
            goto L_0x0386
        L_0x0119:
            androidx.constraintlayout.widget.d$c r4 = r12.f2905a
            int r5 = r4.f3093h
            int r3 = r13.getInteger(r3, r5)
            r4.f3092g = r3
            androidx.constraintlayout.widget.d$c r3 = r12.f2905a
            int r3 = r3.f3092g
            r0.mo3512b(r8, r3)
            goto L_0x0386
        L_0x012c:
            r4 = 85
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            float r5 = r5.f3087c
            goto L_0x031a
        L_0x0134:
            r4 = 84
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            int r5 = r5.f3091f
            goto L_0x0149
        L_0x013b:
            r4 = 83
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            int r5 = r5.f3113a
            goto L_0x01e5
        L_0x0143:
            r4 = 82
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            int r5 = r5.f3085b
        L_0x0149:
            int r3 = r13.getInteger(r3, r5)
            goto L_0x0383
        L_0x014f:
            r4 = 81
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            boolean r5 = r5.f3042f
            goto L_0x017f
        L_0x0156:
            r4 = 80
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            boolean r5 = r5.f3039e
            goto L_0x017f
        L_0x015d:
            r4 = 79
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            float r5 = r5.f3080a
            goto L_0x031a
        L_0x0165:
            r4 = 78
            androidx.constraintlayout.widget.d$d r5 = r12.f2906a
            int r5 = r5.f3098b
            goto L_0x02dc
        L_0x016d:
            r4 = 77
            goto L_0x0372
        L_0x0171:
            r4 = 76
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            int r5 = r5.f3088c
            goto L_0x02dc
        L_0x0179:
            r4 = 75
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            boolean r5 = r5.f3045g
        L_0x017f:
            boolean r3 = r13.getBoolean(r3, r5)
            r0.mo3514d(r4, r3)
            goto L_0x0386
        L_0x0188:
            r4 = 74
            goto L_0x0372
        L_0x018c:
            r4 = 73
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3018V
            goto L_0x037f
        L_0x0194:
            r4 = 72
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3017U
            goto L_0x02dc
        L_0x019c:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r8, r3)
            goto L_0x0386
        L_0x01a3:
            r4 = 70
            goto L_0x031a
        L_0x01a7:
            r4 = 69
            goto L_0x031a
        L_0x01ab:
            r4 = 68
            androidx.constraintlayout.widget.d$d r5 = r12.f2906a
            float r5 = r5.f3097b
            goto L_0x031a
        L_0x01b3:
            r4 = 67
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            float r5 = r5.f3084b
            goto L_0x031a
        L_0x01bb:
            r4 = 66
            int r3 = r13.getInt(r3, r2)
            goto L_0x0383
        L_0x01c3:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 65
            if (r4 != r7) goto L_0x01d2
            java.lang.String r3 = r13.getString(r3)
            goto L_0x01da
        L_0x01d2:
            java.lang.String[] r4 = com.onedelhi.secure.ur0.f21493a
            int r3 = r13.getInteger(r3, r2)
            r3 = r4[r3]
        L_0x01da:
            r0.mo3513c(r5, r3)
            goto L_0x0386
        L_0x01df:
            r4 = 64
            androidx.constraintlayout.widget.d$c r5 = r12.f2905a
            int r5 = r5.f3081a
        L_0x01e5:
            int r3 = m3250y0(r13, r3, r5)
            goto L_0x0383
        L_0x01eb:
            r4 = 63
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3034d
            goto L_0x031a
        L_0x01f3:
            r4 = 62
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3060u
            goto L_0x037f
        L_0x01fb:
            r4 = 60
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3112a
            goto L_0x031a
        L_0x0203:
            r4 = 59
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3016T
            goto L_0x037f
        L_0x020b:
            r4 = 58
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3015S
            goto L_0x037f
        L_0x0213:
            r4 = 57
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3014R
            goto L_0x037f
        L_0x021b:
            r4 = 56
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3013Q
            goto L_0x037f
        L_0x0223:
            r4 = 55
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3012P
            goto L_0x02dc
        L_0x022b:
            r4 = 54
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3011O
            goto L_0x02dc
        L_0x0233:
            r4 = 53
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3124j
            goto L_0x0255
        L_0x023a:
            r4 = 52
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3123i
            goto L_0x0255
        L_0x0241:
            r4 = 51
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3122h
            goto L_0x0255
        L_0x0248:
            r4 = 50
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3121g
            goto L_0x0255
        L_0x024f:
            r4 = 49
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3120f
        L_0x0255:
            float r3 = r13.getDimension(r3, r5)
            goto L_0x031e
        L_0x025b:
            r4 = 48
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3119e
            goto L_0x031a
        L_0x0263:
            r4 = 47
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3118d
            goto L_0x031a
        L_0x026b:
            r4 = 46
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3117c
            goto L_0x031a
        L_0x0273:
            r4 = 45
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3115b
            goto L_0x031a
        L_0x027b:
            r4 = 44
            r0.mo3514d(r4, r9)
            androidx.constraintlayout.widget.d$e r5 = r12.f2907a
            float r5 = r5.f3125k
            goto L_0x0255
        L_0x0285:
            r4 = 43
            androidx.constraintlayout.widget.d$d r5 = r12.f2906a
            float r5 = r5.f3094a
            goto L_0x031a
        L_0x028d:
            r4 = 42
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3010N
            goto L_0x02dc
        L_0x0294:
            r4 = 41
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3009M
            goto L_0x02dc
        L_0x029b:
            r4 = 40
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3037e
            goto L_0x031a
        L_0x02a3:
            r4 = 39
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3040f
            goto L_0x031a
        L_0x02ab:
            int r4 = r12.f2902a
            int r3 = r13.getResourceId(r3, r4)
            r12.f2902a = r3
            r4 = 38
            goto L_0x0383
        L_0x02b7:
            r4 = 37
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3030c
            goto L_0x031a
        L_0x02be:
            r4 = 34
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f2997A
            goto L_0x037f
        L_0x02c6:
            r4 = 31
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3000D
            goto L_0x037f
        L_0x02ce:
            r4 = 28
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3065z
            goto L_0x037f
        L_0x02d6:
            r4 = 27
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3063x
        L_0x02dc:
            int r3 = r13.getInt(r3, r5)
            goto L_0x0383
        L_0x02e2:
            r4 = 24
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3064y
            goto L_0x037f
        L_0x02ea:
            r4 = 23
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3022a
            goto L_0x0307
        L_0x02f1:
            r4 = 22
            int[] r5 = f2810a
            androidx.constraintlayout.widget.d$d r6 = r12.f2906a
            int r6 = r6.f3095a
            int r3 = r13.getInt(r3, r6)
            r3 = r5[r3]
            goto L_0x0383
        L_0x0301:
            r4 = 21
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3027b
        L_0x0307:
            int r3 = r13.getLayoutDimension(r3, r5)
            goto L_0x0383
        L_0x030d:
            r4 = 20
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3026b
            goto L_0x031a
        L_0x0314:
            r4 = 19
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            float r5 = r5.f3021a
        L_0x031a:
            float r3 = r13.getFloat(r3, r5)
        L_0x031e:
            r0.mo3511a(r4, r3)
            goto L_0x0386
        L_0x0322:
            r4 = 18
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3035d
            goto L_0x036c
        L_0x0329:
            r4 = 17
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3031c
            goto L_0x036c
        L_0x0330:
            r4 = 16
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3003G
            goto L_0x037f
        L_0x0337:
            r4 = 15
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3007K
            goto L_0x037f
        L_0x033e:
            r4 = 14
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3004H
            goto L_0x037f
        L_0x0345:
            r4 = 13
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3002F
            goto L_0x037f
        L_0x034c:
            r4 = 12
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3006J
            goto L_0x037f
        L_0x0353:
            r4 = 11
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3005I
            goto L_0x037f
        L_0x035a:
            r4 = 8
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f2999C
            goto L_0x037f
        L_0x0361:
            r4 = 7
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3062w
            goto L_0x036c
        L_0x0367:
            r4 = 6
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f3061v
        L_0x036c:
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            goto L_0x0383
        L_0x0371:
            r4 = 5
        L_0x0372:
            java.lang.String r3 = r13.getString(r3)
            r0.mo3513c(r4, r3)
            goto L_0x0386
        L_0x037a:
            r4 = 2
            androidx.constraintlayout.widget.d$b r5 = r12.f2904a
            int r5 = r5.f2998B
        L_0x037f:
            int r3 = r13.getDimensionPixelSize(r3, r5)
        L_0x0383:
            r0.mo3512b(r4, r3)
        L_0x0386:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x038a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0426d.m3235H0(android.content.Context, androidx.constraintlayout.widget.d$a, android.content.res.TypedArray):void");
    }

    /* renamed from: R0 */
    public static void m3236R0(C0427a aVar, int i, float f) {
        if (i == 19) {
            aVar.f2904a.f3021a = f;
        } else if (i == 20) {
            aVar.f2904a.f3026b = f;
        } else if (i == 37) {
            aVar.f2904a.f3030c = f;
        } else if (i == 60) {
            aVar.f2907a.f3112a = f;
        } else if (i == 63) {
            aVar.f2904a.f3034d = f;
        } else if (i == 79) {
            aVar.f2905a.f3080a = f;
        } else if (i == 85) {
            aVar.f2905a.f3087c = f;
        } else if (i == 87) {
        } else {
            if (i == 39) {
                aVar.f2904a.f3040f = f;
            } else if (i != 40) {
                switch (i) {
                    case 43:
                        aVar.f2906a.f3094a = f;
                        return;
                    case 44:
                        C0432e eVar = aVar.f2907a;
                        eVar.f3125k = f;
                        eVar.f3116b = true;
                        return;
                    case 45:
                        aVar.f2907a.f3115b = f;
                        return;
                    case 46:
                        aVar.f2907a.f3117c = f;
                        return;
                    case 47:
                        aVar.f2907a.f3118d = f;
                        return;
                    case 48:
                        aVar.f2907a.f3119e = f;
                        return;
                    case 49:
                        aVar.f2907a.f3120f = f;
                        return;
                    case 50:
                        aVar.f2907a.f3121g = f;
                        return;
                    case 51:
                        aVar.f2907a.f3122h = f;
                        return;
                    case 52:
                        aVar.f2907a.f3123i = f;
                        return;
                    case 53:
                        aVar.f2907a.f3124j = f;
                        return;
                    default:
                        switch (i) {
                            case 67:
                                aVar.f2905a.f3084b = f;
                                return;
                            case 68:
                                aVar.f2906a.f3097b = f;
                                return;
                            case 69:
                                aVar.f2904a.f3043g = f;
                                return;
                            case 70:
                                aVar.f2904a.f3046h = f;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                aVar.f2904a.f3037e = f;
            }
        }
    }

    /* renamed from: S0 */
    public static void m3237S0(C0427a aVar, int i, int i2) {
        if (i == 6) {
            aVar.f2904a.f3061v = i2;
        } else if (i == 7) {
            aVar.f2904a.f3062w = i2;
        } else if (i == 8) {
            aVar.f2904a.f2999C = i2;
        } else if (i == 27) {
            aVar.f2904a.f3063x = i2;
        } else if (i == 28) {
            aVar.f2904a.f3065z = i2;
        } else if (i == 41) {
            aVar.f2904a.f3009M = i2;
        } else if (i == 42) {
            aVar.f2904a.f3010N = i2;
        } else if (i == 61) {
            aVar.f2904a.f3059t = i2;
        } else if (i == 62) {
            aVar.f2904a.f3060u = i2;
        } else if (i == 72) {
            aVar.f2904a.f3017U = i2;
        } else if (i != 73) {
            switch (i) {
                case 2:
                    aVar.f2904a.f2998B = i2;
                    return;
                case 11:
                    aVar.f2904a.f3005I = i2;
                    return;
                case 12:
                    aVar.f2904a.f3006J = i2;
                    return;
                case 13:
                    aVar.f2904a.f3002F = i2;
                    return;
                case 14:
                    aVar.f2904a.f3004H = i2;
                    return;
                case 15:
                    aVar.f2904a.f3007K = i2;
                    return;
                case 16:
                    aVar.f2904a.f3003G = i2;
                    return;
                case 17:
                    aVar.f2904a.f3031c = i2;
                    return;
                case 18:
                    aVar.f2904a.f3035d = i2;
                    return;
                case 31:
                    aVar.f2904a.f3000D = i2;
                    return;
                case 34:
                    aVar.f2904a.f2997A = i2;
                    return;
                case 38:
                    aVar.f2902a = i2;
                    return;
                case 64:
                    aVar.f2905a.f3081a = i2;
                    return;
                case 66:
                    aVar.f2905a.f3089d = i2;
                    return;
                case 76:
                    aVar.f2905a.f3088c = i2;
                    return;
                case 78:
                    aVar.f2906a.f3098b = i2;
                    return;
                case 93:
                    aVar.f2904a.f3001E = i2;
                    return;
                case 94:
                    aVar.f2904a.f3008L = i2;
                    return;
                case 97:
                    aVar.f2904a.f3020X = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            aVar.f2904a.f3027b = i2;
                            return;
                        case 22:
                            aVar.f2906a.f3095a = i2;
                            return;
                        case 23:
                            aVar.f2904a.f3022a = i2;
                            return;
                        case 24:
                            aVar.f2904a.f3064y = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    aVar.f2904a.f3011O = i2;
                                    return;
                                case 55:
                                    aVar.f2904a.f3012P = i2;
                                    return;
                                case 56:
                                    aVar.f2904a.f3013Q = i2;
                                    return;
                                case 57:
                                    aVar.f2904a.f3014R = i2;
                                    return;
                                case 58:
                                    aVar.f2904a.f3015S = i2;
                                    return;
                                case 59:
                                    aVar.f2904a.f3016T = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            aVar.f2905a.f3085b = i2;
                                            return;
                                        case 83:
                                            aVar.f2907a.f3113a = i2;
                                            return;
                                        case 84:
                                            aVar.f2905a.f3091f = i2;
                                            return;
                                        default:
                                            switch (i) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    aVar.f2905a.f3092g = i2;
                                                    return;
                                                case 89:
                                                    aVar.f2905a.f3093h = i2;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar.f2904a.f3018V = i2;
        }
    }

    /* renamed from: T0 */
    public static void m3238T0(C0427a aVar, int i, String str) {
        if (i == 5) {
            aVar.f2904a.f3023a = str;
        } else if (i == 65) {
            aVar.f2905a.f3082a = str;
        } else if (i == 74) {
            C0429b bVar = aVar.f2904a;
            bVar.f3028b = str;
            bVar.f3025a = null;
        } else if (i == 77) {
            aVar.f2904a.f3032c = str;
        } else if (i == 87) {
        } else {
            if (i != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2905a.f3086b = str;
            }
        }
    }

    /* renamed from: U0 */
    public static void m3239U0(C0427a aVar, int i, boolean z) {
        if (i == 44) {
            aVar.f2907a.f3116b = z;
        } else if (i == 75) {
            aVar.f2904a.f3045g = z;
        } else if (i == 87) {
        } else {
            if (i == 80) {
                aVar.f2904a.f3039e = z;
            } else if (i != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2904a.f3042f = z;
            }
        }
    }

    /* renamed from: m0 */
    public static String m3247m0(int i) {
        for (Field field : C0426d.class.getDeclaredFields()) {
            if (field.getName().contains(db0.f27369e) && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt((Object) null) == i) {
                        return field.getName();
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    /* renamed from: p0 */
    public static String m3248p0(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + ve0.m30010i(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* renamed from: w */
    public static C0427a m3249w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0427a aVar = new C0427a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C0435e.C0448m.ConstraintOverride);
        m3235H0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: y0 */
    public static int m3250y0(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: A */
    public void mo3380A(int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0426d dVar;
        if (i2 == 0) {
            i8 = 0;
            i7 = 6;
            i6 = 0;
            i5 = 0;
            i4 = 7;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
        } else {
            i7 = 7;
            i6 = 0;
            i4 = 6;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
            i8 = i2;
            i5 = i2;
        }
        dVar.mo3490x(i9, i8, i7, i6, i5, i4, i3, f);
    }

    /* renamed from: A1 */
    public void mo3381A1(int i, float f) {
        mo3449i0(i).f2904a.f3030c = f;
    }

    /* renamed from: B */
    public void mo3382B(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3405L(i, 6, i2, i3, i4);
        mo3405L(i, 7, i5, i6, i7);
        C0427a aVar = this.f2900b.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f2904a.f3026b = f;
        }
    }

    /* renamed from: B1 */
    public void mo3383B1(int i, int i2) {
        mo3449i0(i).f2904a.f3010N = i2;
    }

    /* renamed from: C */
    public void mo3384C(int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0426d dVar;
        if (i2 == 0) {
            i8 = 0;
            i7 = 3;
            i6 = 0;
            i5 = 0;
            i4 = 4;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
        } else {
            i7 = 4;
            i6 = 0;
            i4 = 3;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
            i8 = i2;
            i5 = i2;
        }
        dVar.mo3490x(i9, i8, i7, i6, i5, i4, i3, f);
    }

    /* renamed from: C1 */
    public void mo3385C1(int i, float f) {
        mo3449i0(i).f2904a.f3037e = f;
    }

    /* renamed from: D */
    public void mo3386D(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3405L(i, 3, i2, i3, i4);
        mo3405L(i, 4, i5, i6, i7);
        C0427a aVar = this.f2900b.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f2904a.f3030c = f;
        }
    }

    /* renamed from: D0 */
    public void mo3387D0(C0427a aVar, String str) {
        String[] split = str.split(vf4.f36537c);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(a13.f25713a);
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            } else {
                aVar.mo3508q(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    /* renamed from: D1 */
    public void mo3388D1(int i, int i2) {
        mo3449i0(i).f2906a.f3095a = i2;
    }

    /* renamed from: E */
    public void mo3389E(int i) {
        this.f2900b.remove(Integer.valueOf(i));
    }

    /* renamed from: E0 */
    public void mo3390E0(C0427a aVar, String str) {
        String[] split = str.split(vf4.f36537c);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(a13.f25713a);
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            } else {
                aVar.mo3508q(split2[0], (float) Integer.decode(split2[1]).intValue());
            }
        }
    }

    /* renamed from: E1 */
    public void mo3391E1(int i, int i2) {
        mo3449i0(i).f2906a.f3098b = i2;
    }

    /* renamed from: F */
    public void mo3392F(int i, int i2) {
        C0427a aVar;
        if (this.f2900b.containsKey(Integer.valueOf(i)) && (aVar = this.f2900b.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C0429b bVar = aVar.f2904a;
                    bVar.f3041f = -1;
                    bVar.f3038e = -1;
                    bVar.f3064y = -1;
                    bVar.f3002F = Integer.MIN_VALUE;
                    return;
                case 2:
                    C0429b bVar2 = aVar.f2904a;
                    bVar2.f3047h = -1;
                    bVar2.f3044g = -1;
                    bVar2.f3065z = -1;
                    bVar2.f3004H = Integer.MIN_VALUE;
                    return;
                case 3:
                    C0429b bVar3 = aVar.f2904a;
                    bVar3.f3049j = -1;
                    bVar3.f3048i = -1;
                    bVar3.f2997A = 0;
                    bVar3.f3003G = Integer.MIN_VALUE;
                    return;
                case 4:
                    C0429b bVar4 = aVar.f2904a;
                    bVar4.f3050k = -1;
                    bVar4.f3051l = -1;
                    bVar4.f2998B = 0;
                    bVar4.f3005I = Integer.MIN_VALUE;
                    return;
                case 5:
                    C0429b bVar5 = aVar.f2904a;
                    bVar5.f3052m = -1;
                    bVar5.f3053n = -1;
                    bVar5.f3054o = -1;
                    bVar5.f3001E = 0;
                    bVar5.f3008L = Integer.MIN_VALUE;
                    return;
                case 6:
                    C0429b bVar6 = aVar.f2904a;
                    bVar6.f3055p = -1;
                    bVar6.f3056q = -1;
                    bVar6.f3000D = 0;
                    bVar6.f3007K = Integer.MIN_VALUE;
                    return;
                case 7:
                    C0429b bVar7 = aVar.f2904a;
                    bVar7.f3057r = -1;
                    bVar7.f3058s = -1;
                    bVar7.f2999C = 0;
                    bVar7.f3006J = Integer.MIN_VALUE;
                    return;
                case 8:
                    C0429b bVar8 = aVar.f2904a;
                    bVar8.f3034d = -1.0f;
                    bVar8.f3060u = -1;
                    bVar8.f3059t = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: F0 */
    public void mo3393F0(C0427a aVar, String str) {
        String[] G1 = m3234G1(str);
        for (int i = 0; i < G1.length; i++) {
            String[] split = G1[i].split(a13.f25713a);
            Log.w("ConstraintSet", " Unable to parse " + G1[i]);
            aVar.mo3510s(split[0], split[1]);
        }
    }

    /* renamed from: F1 */
    public final String mo3394F1(int i) {
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

    /* renamed from: G */
    public void mo3395G(Context context, int i) {
        mo3397H((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: G0 */
    public final void mo3396G0(Context context, C0427a aVar, TypedArray typedArray, boolean z) {
        C0430c cVar;
        String str;
        C0430c cVar2;
        String str2;
        StringBuilder sb;
        if (z) {
            m3235H0(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0435e.C0448m.Constraint_android_id || C0435e.C0448m.Constraint_android_layout_marginStart == index || C0435e.C0448m.Constraint_android_layout_marginEnd == index)) {
                aVar.f2905a.f3083a = true;
                aVar.f2904a.f3029b = true;
                aVar.f2906a.f3096a = true;
                aVar.f2907a.f3114a = true;
            }
            switch (f2809a.get(index)) {
                case 1:
                    C0429b bVar = aVar.f2904a;
                    bVar.f3052m = m3250y0(typedArray, index, bVar.f3052m);
                    continue;
                case 2:
                    C0429b bVar2 = aVar.f2904a;
                    bVar2.f2998B = typedArray.getDimensionPixelSize(index, bVar2.f2998B);
                    continue;
                case 3:
                    C0429b bVar3 = aVar.f2904a;
                    bVar3.f3051l = m3250y0(typedArray, index, bVar3.f3051l);
                    continue;
                case 4:
                    C0429b bVar4 = aVar.f2904a;
                    bVar4.f3050k = m3250y0(typedArray, index, bVar4.f3050k);
                    continue;
                case 5:
                    aVar.f2904a.f3023a = typedArray.getString(index);
                    continue;
                case 6:
                    C0429b bVar5 = aVar.f2904a;
                    bVar5.f3061v = typedArray.getDimensionPixelOffset(index, bVar5.f3061v);
                    continue;
                case 7:
                    C0429b bVar6 = aVar.f2904a;
                    bVar6.f3062w = typedArray.getDimensionPixelOffset(index, bVar6.f3062w);
                    continue;
                case 8:
                    C0429b bVar7 = aVar.f2904a;
                    bVar7.f2999C = typedArray.getDimensionPixelSize(index, bVar7.f2999C);
                    continue;
                case 9:
                    C0429b bVar8 = aVar.f2904a;
                    bVar8.f3058s = m3250y0(typedArray, index, bVar8.f3058s);
                    continue;
                case 10:
                    C0429b bVar9 = aVar.f2904a;
                    bVar9.f3057r = m3250y0(typedArray, index, bVar9.f3057r);
                    continue;
                case 11:
                    C0429b bVar10 = aVar.f2904a;
                    bVar10.f3005I = typedArray.getDimensionPixelSize(index, bVar10.f3005I);
                    continue;
                case 12:
                    C0429b bVar11 = aVar.f2904a;
                    bVar11.f3006J = typedArray.getDimensionPixelSize(index, bVar11.f3006J);
                    continue;
                case 13:
                    C0429b bVar12 = aVar.f2904a;
                    bVar12.f3002F = typedArray.getDimensionPixelSize(index, bVar12.f3002F);
                    continue;
                case 14:
                    C0429b bVar13 = aVar.f2904a;
                    bVar13.f3004H = typedArray.getDimensionPixelSize(index, bVar13.f3004H);
                    continue;
                case 15:
                    C0429b bVar14 = aVar.f2904a;
                    bVar14.f3007K = typedArray.getDimensionPixelSize(index, bVar14.f3007K);
                    continue;
                case 16:
                    C0429b bVar15 = aVar.f2904a;
                    bVar15.f3003G = typedArray.getDimensionPixelSize(index, bVar15.f3003G);
                    continue;
                case 17:
                    C0429b bVar16 = aVar.f2904a;
                    bVar16.f3031c = typedArray.getDimensionPixelOffset(index, bVar16.f3031c);
                    continue;
                case 18:
                    C0429b bVar17 = aVar.f2904a;
                    bVar17.f3035d = typedArray.getDimensionPixelOffset(index, bVar17.f3035d);
                    continue;
                case 19:
                    C0429b bVar18 = aVar.f2904a;
                    bVar18.f3021a = typedArray.getFloat(index, bVar18.f3021a);
                    continue;
                case 20:
                    C0429b bVar19 = aVar.f2904a;
                    bVar19.f3026b = typedArray.getFloat(index, bVar19.f3026b);
                    continue;
                case 21:
                    C0429b bVar20 = aVar.f2904a;
                    bVar20.f3027b = typedArray.getLayoutDimension(index, bVar20.f3027b);
                    continue;
                case 22:
                    C0431d dVar = aVar.f2906a;
                    dVar.f3095a = typedArray.getInt(index, dVar.f3095a);
                    C0431d dVar2 = aVar.f2906a;
                    dVar2.f3095a = f2810a[dVar2.f3095a];
                    continue;
                case 23:
                    C0429b bVar21 = aVar.f2904a;
                    bVar21.f3022a = typedArray.getLayoutDimension(index, bVar21.f3022a);
                    continue;
                case 24:
                    C0429b bVar22 = aVar.f2904a;
                    bVar22.f3064y = typedArray.getDimensionPixelSize(index, bVar22.f3064y);
                    continue;
                case 25:
                    C0429b bVar23 = aVar.f2904a;
                    bVar23.f3038e = m3250y0(typedArray, index, bVar23.f3038e);
                    continue;
                case 26:
                    C0429b bVar24 = aVar.f2904a;
                    bVar24.f3041f = m3250y0(typedArray, index, bVar24.f3041f);
                    continue;
                case 27:
                    C0429b bVar25 = aVar.f2904a;
                    bVar25.f3063x = typedArray.getInt(index, bVar25.f3063x);
                    continue;
                case 28:
                    C0429b bVar26 = aVar.f2904a;
                    bVar26.f3065z = typedArray.getDimensionPixelSize(index, bVar26.f3065z);
                    continue;
                case 29:
                    C0429b bVar27 = aVar.f2904a;
                    bVar27.f3044g = m3250y0(typedArray, index, bVar27.f3044g);
                    continue;
                case 30:
                    C0429b bVar28 = aVar.f2904a;
                    bVar28.f3047h = m3250y0(typedArray, index, bVar28.f3047h);
                    continue;
                case 31:
                    C0429b bVar29 = aVar.f2904a;
                    bVar29.f3000D = typedArray.getDimensionPixelSize(index, bVar29.f3000D);
                    continue;
                case 32:
                    C0429b bVar30 = aVar.f2904a;
                    bVar30.f3055p = m3250y0(typedArray, index, bVar30.f3055p);
                    continue;
                case 33:
                    C0429b bVar31 = aVar.f2904a;
                    bVar31.f3056q = m3250y0(typedArray, index, bVar31.f3056q);
                    continue;
                case 34:
                    C0429b bVar32 = aVar.f2904a;
                    bVar32.f2997A = typedArray.getDimensionPixelSize(index, bVar32.f2997A);
                    continue;
                case 35:
                    C0429b bVar33 = aVar.f2904a;
                    bVar33.f3049j = m3250y0(typedArray, index, bVar33.f3049j);
                    continue;
                case 36:
                    C0429b bVar34 = aVar.f2904a;
                    bVar34.f3048i = m3250y0(typedArray, index, bVar34.f3048i);
                    continue;
                case 37:
                    C0429b bVar35 = aVar.f2904a;
                    bVar35.f3030c = typedArray.getFloat(index, bVar35.f3030c);
                    continue;
                case 38:
                    aVar.f2902a = typedArray.getResourceId(index, aVar.f2902a);
                    continue;
                case 39:
                    C0429b bVar36 = aVar.f2904a;
                    bVar36.f3040f = typedArray.getFloat(index, bVar36.f3040f);
                    continue;
                case 40:
                    C0429b bVar37 = aVar.f2904a;
                    bVar37.f3037e = typedArray.getFloat(index, bVar37.f3037e);
                    continue;
                case 41:
                    C0429b bVar38 = aVar.f2904a;
                    bVar38.f3009M = typedArray.getInt(index, bVar38.f3009M);
                    continue;
                case 42:
                    C0429b bVar39 = aVar.f2904a;
                    bVar39.f3010N = typedArray.getInt(index, bVar39.f3010N);
                    continue;
                case 43:
                    C0431d dVar3 = aVar.f2906a;
                    dVar3.f3094a = typedArray.getFloat(index, dVar3.f3094a);
                    continue;
                case 44:
                    C0432e eVar = aVar.f2907a;
                    eVar.f3116b = true;
                    eVar.f3125k = typedArray.getDimension(index, eVar.f3125k);
                    continue;
                case 45:
                    C0432e eVar2 = aVar.f2907a;
                    eVar2.f3115b = typedArray.getFloat(index, eVar2.f3115b);
                    continue;
                case 46:
                    C0432e eVar3 = aVar.f2907a;
                    eVar3.f3117c = typedArray.getFloat(index, eVar3.f3117c);
                    continue;
                case 47:
                    C0432e eVar4 = aVar.f2907a;
                    eVar4.f3118d = typedArray.getFloat(index, eVar4.f3118d);
                    continue;
                case 48:
                    C0432e eVar5 = aVar.f2907a;
                    eVar5.f3119e = typedArray.getFloat(index, eVar5.f3119e);
                    continue;
                case 49:
                    C0432e eVar6 = aVar.f2907a;
                    eVar6.f3120f = typedArray.getDimension(index, eVar6.f3120f);
                    continue;
                case 50:
                    C0432e eVar7 = aVar.f2907a;
                    eVar7.f3121g = typedArray.getDimension(index, eVar7.f3121g);
                    continue;
                case 51:
                    C0432e eVar8 = aVar.f2907a;
                    eVar8.f3122h = typedArray.getDimension(index, eVar8.f3122h);
                    continue;
                case 52:
                    C0432e eVar9 = aVar.f2907a;
                    eVar9.f3123i = typedArray.getDimension(index, eVar9.f3123i);
                    continue;
                case 53:
                    C0432e eVar10 = aVar.f2907a;
                    eVar10.f3124j = typedArray.getDimension(index, eVar10.f3124j);
                    continue;
                case 54:
                    C0429b bVar40 = aVar.f2904a;
                    bVar40.f3011O = typedArray.getInt(index, bVar40.f3011O);
                    continue;
                case 55:
                    C0429b bVar41 = aVar.f2904a;
                    bVar41.f3012P = typedArray.getInt(index, bVar41.f3012P);
                    continue;
                case 56:
                    C0429b bVar42 = aVar.f2904a;
                    bVar42.f3013Q = typedArray.getDimensionPixelSize(index, bVar42.f3013Q);
                    continue;
                case 57:
                    C0429b bVar43 = aVar.f2904a;
                    bVar43.f3014R = typedArray.getDimensionPixelSize(index, bVar43.f3014R);
                    continue;
                case 58:
                    C0429b bVar44 = aVar.f2904a;
                    bVar44.f3015S = typedArray.getDimensionPixelSize(index, bVar44.f3015S);
                    continue;
                case 59:
                    C0429b bVar45 = aVar.f2904a;
                    bVar45.f3016T = typedArray.getDimensionPixelSize(index, bVar45.f3016T);
                    continue;
                case 60:
                    C0432e eVar11 = aVar.f2907a;
                    eVar11.f3112a = typedArray.getFloat(index, eVar11.f3112a);
                    continue;
                case 61:
                    C0429b bVar46 = aVar.f2904a;
                    bVar46.f3059t = m3250y0(typedArray, index, bVar46.f3059t);
                    continue;
                case 62:
                    C0429b bVar47 = aVar.f2904a;
                    bVar47.f3060u = typedArray.getDimensionPixelSize(index, bVar47.f3060u);
                    continue;
                case 63:
                    C0429b bVar48 = aVar.f2904a;
                    bVar48.f3034d = typedArray.getFloat(index, bVar48.f3034d);
                    continue;
                case 64:
                    C0430c cVar3 = aVar.f2905a;
                    cVar3.f3081a = m3250y0(typedArray, index, cVar3.f3081a);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f2905a;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f2905a;
                        str = ur0.f21493a[typedArray.getInteger(index, 0)];
                    }
                    cVar.f3082a = str;
                    continue;
                case 66:
                    aVar.f2905a.f3089d = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0430c cVar4 = aVar.f2905a;
                    cVar4.f3084b = typedArray.getFloat(index, cVar4.f3084b);
                    continue;
                case 68:
                    C0431d dVar4 = aVar.f2906a;
                    dVar4.f3097b = typedArray.getFloat(index, dVar4.f3097b);
                    continue;
                case 69:
                    aVar.f2904a.f3043g = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f2904a.f3046h = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0429b bVar49 = aVar.f2904a;
                    bVar49.f3017U = typedArray.getInt(index, bVar49.f3017U);
                    continue;
                case 73:
                    C0429b bVar50 = aVar.f2904a;
                    bVar50.f3018V = typedArray.getDimensionPixelSize(index, bVar50.f3018V);
                    continue;
                case 74:
                    aVar.f2904a.f3028b = typedArray.getString(index);
                    continue;
                case 75:
                    C0429b bVar51 = aVar.f2904a;
                    bVar51.f3045g = typedArray.getBoolean(index, bVar51.f3045g);
                    continue;
                case 76:
                    C0430c cVar5 = aVar.f2905a;
                    cVar5.f3088c = typedArray.getInt(index, cVar5.f3088c);
                    continue;
                case 77:
                    aVar.f2904a.f3032c = typedArray.getString(index);
                    continue;
                case 78:
                    C0431d dVar5 = aVar.f2906a;
                    dVar5.f3098b = typedArray.getInt(index, dVar5.f3098b);
                    continue;
                case 79:
                    C0430c cVar6 = aVar.f2905a;
                    cVar6.f3080a = typedArray.getFloat(index, cVar6.f3080a);
                    continue;
                case 80:
                    C0429b bVar52 = aVar.f2904a;
                    bVar52.f3039e = typedArray.getBoolean(index, bVar52.f3039e);
                    continue;
                case 81:
                    C0429b bVar53 = aVar.f2904a;
                    bVar53.f3042f = typedArray.getBoolean(index, bVar53.f3042f);
                    continue;
                case 82:
                    C0430c cVar7 = aVar.f2905a;
                    cVar7.f3085b = typedArray.getInteger(index, cVar7.f3085b);
                    continue;
                case 83:
                    C0432e eVar12 = aVar.f2907a;
                    eVar12.f3113a = m3250y0(typedArray, index, eVar12.f3113a);
                    continue;
                case 84:
                    C0430c cVar8 = aVar.f2905a;
                    cVar8.f3091f = typedArray.getInteger(index, cVar8.f3091f);
                    continue;
                case 85:
                    C0430c cVar9 = aVar.f2905a;
                    cVar9.f3087c = typedArray.getFloat(index, cVar9.f3087c);
                    continue;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0430c cVar10 = aVar.f2905a;
                            cVar10.f3092g = typedArray.getInteger(index, cVar10.f3093h);
                            break;
                        } else {
                            aVar.f2905a.f3086b = typedArray.getString(index);
                            if (aVar.f2905a.f3086b.indexOf("/") <= 0) {
                                aVar.f2905a.f3092g = -1;
                                break;
                            } else {
                                aVar.f2905a.f3093h = typedArray.getResourceId(index, -1);
                                cVar2 = aVar.f2905a;
                            }
                        }
                    } else {
                        aVar.f2905a.f3093h = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f2905a;
                        if (cVar2.f3093h == -1) {
                            continue;
                        }
                    }
                    cVar2.f3092g = -2;
                    break;
                case 87:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 91:
                    C0429b bVar54 = aVar.f2904a;
                    bVar54.f3053n = m3250y0(typedArray, index, bVar54.f3053n);
                    continue;
                case 92:
                    C0429b bVar55 = aVar.f2904a;
                    bVar55.f3054o = m3250y0(typedArray, index, bVar55.f3054o);
                    continue;
                case 93:
                    C0429b bVar56 = aVar.f2904a;
                    bVar56.f3001E = typedArray.getDimensionPixelSize(index, bVar56.f3001E);
                    continue;
                case 94:
                    C0429b bVar57 = aVar.f2904a;
                    bVar57.f3008L = typedArray.getDimensionPixelSize(index, bVar57.f3008L);
                    continue;
                case 95:
                    m3231A0(aVar.f2904a, typedArray, index, 0);
                    continue;
                case 96:
                    m3231A0(aVar.f2904a, typedArray, index, 1);
                    continue;
                case 97:
                    C0429b bVar58 = aVar.f2904a;
                    bVar58.f3020X = typedArray.getInt(index, bVar58.f3020X);
                    continue;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f2809a.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        C0429b bVar59 = aVar.f2904a;
        if (bVar59.f3028b != null) {
            bVar59.f3025a = null;
        }
    }

    /* renamed from: H */
    public void mo3397H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2900b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2901b || id != -1) {
                if (!this.f2900b.containsKey(Integer.valueOf(id))) {
                    this.f2900b.put(Integer.valueOf(id), new C0427a());
                }
                C0427a aVar = this.f2900b.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f2909a = C0419a.m3151d(this.f2897a, childAt);
                    aVar.mo3502k(id, layoutParams);
                    aVar.f2906a.f3095a = childAt.getVisibility();
                    aVar.f2906a.f3094a = childAt.getAlpha();
                    aVar.f2907a.f3112a = childAt.getRotation();
                    aVar.f2907a.f3115b = childAt.getRotationX();
                    aVar.f2907a.f3117c = childAt.getRotationY();
                    aVar.f2907a.f3118d = childAt.getScaleX();
                    aVar.f2907a.f3119e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0432e eVar = aVar.f2907a;
                        eVar.f3120f = pivotX;
                        eVar.f3121g = pivotY;
                    }
                    aVar.f2907a.f3122h = childAt.getTranslationX();
                    aVar.f2907a.f3123i = childAt.getTranslationY();
                    aVar.f2907a.f3124j = childAt.getTranslationZ();
                    C0432e eVar2 = aVar.f2907a;
                    if (eVar2.f3116b) {
                        eVar2.f3125k = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f2904a.f3045g = barrier.getAllowsGoneWidget();
                        aVar.f2904a.f3025a = barrier.getReferencedIds();
                        aVar.f2904a.f3017U = barrier.getType();
                        aVar.f2904a.f3018V = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: H1 */
    public void mo3398H1(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i & 1) == 1) {
            new C0434g(writer, constraintLayout, i).mo3548i();
        } else {
            new C0433f(writer, constraintLayout, i).mo3532g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    /* renamed from: I */
    public void mo3399I(C0426d dVar) {
        this.f2900b.clear();
        for (Integer next : dVar.f2900b.keySet()) {
            C0427a aVar = dVar.f2900b.get(next);
            if (aVar != null) {
                this.f2900b.put(next, aVar.clone());
            }
        }
    }

    /* renamed from: I0 */
    public void mo3400I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2901b || id != -1) {
                if (!this.f2900b.containsKey(Integer.valueOf(id))) {
                    this.f2900b.put(Integer.valueOf(id), new C0427a());
                }
                C0427a aVar = this.f2900b.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (!aVar.f2904a.f3029b) {
                        aVar.mo3502k(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            aVar.f2904a.f3025a = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f2904a.f3045g = barrier.getAllowsGoneWidget();
                                aVar.f2904a.f3017U = barrier.getType();
                                aVar.f2904a.f3018V = barrier.getMargin();
                            }
                        }
                        aVar.f2904a.f3029b = true;
                    }
                    C0431d dVar = aVar.f2906a;
                    if (!dVar.f3096a) {
                        dVar.f3095a = childAt.getVisibility();
                        aVar.f2906a.f3094a = childAt.getAlpha();
                        aVar.f2906a.f3096a = true;
                    }
                    C0432e eVar = aVar.f2907a;
                    if (!eVar.f3114a) {
                        eVar.f3114a = true;
                        eVar.f3112a = childAt.getRotation();
                        aVar.f2907a.f3115b = childAt.getRotationX();
                        aVar.f2907a.f3117c = childAt.getRotationY();
                        aVar.f2907a.f3118d = childAt.getScaleX();
                        aVar.f2907a.f3119e = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0432e eVar2 = aVar.f2907a;
                            eVar2.f3120f = pivotX;
                            eVar2.f3121g = pivotY;
                        }
                        aVar.f2907a.f3122h = childAt.getTranslationX();
                        aVar.f2907a.f3123i = childAt.getTranslationY();
                        aVar.f2907a.f3124j = childAt.getTranslationZ();
                        C0432e eVar3 = aVar.f2907a;
                        if (eVar3.f3116b) {
                            eVar3.f3125k = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: J */
    public void mo3401J(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2900b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2901b || id != -1) {
                if (!this.f2900b.containsKey(Integer.valueOf(id))) {
                    this.f2900b.put(Integer.valueOf(id), new C0427a());
                }
                C0427a aVar = this.f2900b.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (childAt instanceof ConstraintHelper) {
                        aVar.mo3504m((ConstraintHelper) childAt, id, layoutParams);
                    }
                    aVar.mo3503l(id, layoutParams);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: J0 */
    public void mo3402J0(C0426d dVar) {
        for (Integer next : dVar.f2900b.keySet()) {
            int intValue = next.intValue();
            C0427a aVar = dVar.f2900b.get(next);
            if (!this.f2900b.containsKey(Integer.valueOf(intValue))) {
                this.f2900b.put(Integer.valueOf(intValue), new C0427a());
            }
            C0427a aVar2 = this.f2900b.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                C0429b bVar = aVar2.f2904a;
                if (!bVar.f3029b) {
                    bVar.mo3517a(aVar.f2904a);
                }
                C0431d dVar2 = aVar2.f2906a;
                if (!dVar2.f3096a) {
                    dVar2.mo3522a(aVar.f2906a);
                }
                C0432e eVar = aVar2.f2907a;
                if (!eVar.f3114a) {
                    eVar.mo3524a(aVar.f2907a);
                }
                C0430c cVar = aVar2.f2905a;
                if (!cVar.f3083a) {
                    cVar.mo3520a(aVar.f2905a);
                }
                for (String next2 : aVar.f2909a.keySet()) {
                    if (!aVar2.f2909a.containsKey(next2)) {
                        aVar2.f2909a.put(next2, aVar.f2909a.get(next2));
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void mo3403K(int i, int i2, int i3, int i4) {
        C0429b bVar;
        C0429b bVar2;
        if (!this.f2900b.containsKey(Integer.valueOf(i))) {
            this.f2900b.put(Integer.valueOf(i), new C0427a());
        }
        C0427a aVar = this.f2900b.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0429b bVar3 = aVar.f2904a;
                        bVar3.f3038e = i3;
                        bVar3.f3041f = -1;
                        return;
                    } else if (i4 == 2) {
                        C0429b bVar4 = aVar.f2904a;
                        bVar4.f3041f = i3;
                        bVar4.f3038e = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + mo3394F1(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        C0429b bVar5 = aVar.f2904a;
                        bVar5.f3044g = i3;
                        bVar5.f3047h = -1;
                        return;
                    } else if (i4 == 2) {
                        C0429b bVar6 = aVar.f2904a;
                        bVar6.f3047h = i3;
                        bVar6.f3044g = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        bVar = aVar.f2904a;
                        bVar.f3048i = i3;
                        bVar.f3049j = -1;
                        break;
                    } else if (i4 == 4) {
                        bVar = aVar.f2904a;
                        bVar.f3049j = i3;
                        bVar.f3048i = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        bVar = aVar.f2904a;
                        bVar.f3051l = i3;
                        bVar.f3050k = -1;
                        break;
                    } else if (i4 == 3) {
                        bVar = aVar.f2904a;
                        bVar.f3050k = i3;
                        bVar.f3051l = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        bVar2 = aVar.f2904a;
                        bVar2.f3052m = i3;
                    } else if (i4 == 3) {
                        bVar2 = aVar.f2904a;
                        bVar2.f3053n = i3;
                    } else if (i4 == 4) {
                        bVar2 = aVar.f2904a;
                        bVar2.f3054o = i3;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    bVar2.f3051l = -1;
                    bVar2.f3050k = -1;
                    bVar2.f3048i = -1;
                    bVar2.f3049j = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C0429b bVar7 = aVar.f2904a;
                        bVar7.f3056q = i3;
                        bVar7.f3055p = -1;
                        return;
                    } else if (i4 == 7) {
                        C0429b bVar8 = aVar.f2904a;
                        bVar8.f3055p = i3;
                        bVar8.f3056q = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        C0429b bVar9 = aVar.f2904a;
                        bVar9.f3058s = i3;
                        bVar9.f3057r = -1;
                        return;
                    } else if (i4 == 6) {
                        C0429b bVar10 = aVar.f2904a;
                        bVar10.f3057r = i3;
                        bVar10.f3058s = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(mo3394F1(i2) + " to " + mo3394F1(i4) + " unknown");
            }
            bVar.f3052m = -1;
            bVar.f3053n = -1;
            bVar.f3054o = -1;
        }
    }

    /* renamed from: K0 */
    public void mo3404K0(String str) {
        this.f2897a.remove(str);
    }

    /* renamed from: L */
    public void mo3405L(int i, int i2, int i3, int i4, int i5) {
        C0429b bVar;
        C0429b bVar2;
        C0429b bVar3;
        if (!this.f2900b.containsKey(Integer.valueOf(i))) {
            this.f2900b.put(Integer.valueOf(i), new C0427a());
        }
        C0427a aVar = this.f2900b.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0429b bVar4 = aVar.f2904a;
                        bVar4.f3038e = i3;
                        bVar4.f3041f = -1;
                    } else if (i4 == 2) {
                        C0429b bVar5 = aVar.f2904a;
                        bVar5.f3041f = i3;
                        bVar5.f3038e = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + mo3394F1(i4) + " undefined");
                    }
                    aVar.f2904a.f3064y = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C0429b bVar6 = aVar.f2904a;
                        bVar6.f3044g = i3;
                        bVar6.f3047h = -1;
                    } else if (i4 == 2) {
                        C0429b bVar7 = aVar.f2904a;
                        bVar7.f3047h = i3;
                        bVar7.f3044g = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    aVar.f2904a.f3065z = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        bVar = aVar.f2904a;
                        bVar.f3048i = i3;
                        bVar.f3049j = -1;
                    } else if (i4 == 4) {
                        bVar = aVar.f2904a;
                        bVar.f3049j = i3;
                        bVar.f3048i = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    bVar.f3052m = -1;
                    bVar.f3053n = -1;
                    bVar.f3054o = -1;
                    aVar.f2904a.f2997A = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        bVar2 = aVar.f2904a;
                        bVar2.f3051l = i3;
                        bVar2.f3050k = -1;
                    } else if (i4 == 3) {
                        bVar2 = aVar.f2904a;
                        bVar2.f3050k = i3;
                        bVar2.f3051l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    bVar2.f3052m = -1;
                    bVar2.f3053n = -1;
                    bVar2.f3054o = -1;
                    aVar.f2904a.f2998B = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        bVar3 = aVar.f2904a;
                        bVar3.f3052m = i3;
                    } else if (i4 == 3) {
                        bVar3 = aVar.f2904a;
                        bVar3.f3053n = i3;
                    } else if (i4 == 4) {
                        bVar3 = aVar.f2904a;
                        bVar3.f3054o = i3;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    bVar3.f3051l = -1;
                    bVar3.f3050k = -1;
                    bVar3.f3048i = -1;
                    bVar3.f3049j = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C0429b bVar8 = aVar.f2904a;
                        bVar8.f3056q = i3;
                        bVar8.f3055p = -1;
                    } else if (i4 == 7) {
                        C0429b bVar9 = aVar.f2904a;
                        bVar9.f3055p = i3;
                        bVar9.f3056q = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    aVar.f2904a.f3000D = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        C0429b bVar10 = aVar.f2904a;
                        bVar10.f3058s = i3;
                        bVar10.f3057r = -1;
                    } else if (i4 == 6) {
                        C0429b bVar11 = aVar.f2904a;
                        bVar11.f3057r = i3;
                        bVar11.f3058s = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + mo3394F1(i4) + " undefined");
                    }
                    aVar.f2904a.f2999C = i5;
                    return;
                default:
                    throw new IllegalArgumentException(mo3394F1(i2) + " to " + mo3394F1(i4) + " unknown");
            }
        }
    }

    /* renamed from: L0 */
    public void mo3406L0(int i) {
        C0427a aVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0426d dVar;
        int i8;
        int i9;
        int i10;
        int i11;
        C0426d dVar2;
        int i12;
        if (this.f2900b.containsKey(Integer.valueOf(i)) && (aVar = this.f2900b.get(Integer.valueOf(i))) != null) {
            C0429b bVar = aVar.f2904a;
            int i13 = bVar.f3041f;
            int i14 = bVar.f3044g;
            if (i13 == -1 && i14 == -1) {
                int i15 = bVar.f3055p;
                int i16 = bVar.f3057r;
                if (!(i15 == -1 && i16 == -1)) {
                    if (i15 != -1 && i16 != -1) {
                        i11 = 0;
                        dVar2 = this;
                        dVar2.mo3405L(i15, 7, i16, 6, 0);
                        i9 = 6;
                        i10 = 7;
                        i12 = i16;
                        i8 = i13;
                    } else if (i16 != -1) {
                        i8 = bVar.f3047h;
                        if (i8 != -1) {
                            i9 = 7;
                            i10 = 7;
                            i11 = 0;
                            dVar2 = this;
                            i12 = i13;
                        } else {
                            i8 = bVar.f3038e;
                            if (i8 != -1) {
                                i9 = 6;
                                i10 = 6;
                                i11 = 0;
                                dVar2 = this;
                                i12 = i16;
                            }
                        }
                    }
                    dVar2.mo3405L(i12, i9, i8, i10, i11);
                }
                mo3392F(i, 6);
                i2 = 7;
            } else {
                if (i13 == -1 || i14 == -1) {
                    i5 = bVar.f3047h;
                    if (i5 != -1) {
                        i6 = 2;
                        i4 = 2;
                        i3 = 0;
                        dVar = this;
                        i7 = i13;
                    } else {
                        i5 = bVar.f3038e;
                        if (i5 != -1) {
                            i6 = 1;
                            i4 = 1;
                            i3 = 0;
                            dVar = this;
                            i7 = i14;
                        }
                        mo3392F(i, 1);
                        i2 = 2;
                    }
                } else {
                    i3 = 0;
                    dVar = this;
                    dVar.mo3405L(i13, 2, i14, 1, 0);
                    i6 = 1;
                    i4 = 2;
                    i7 = i14;
                    i5 = i13;
                }
                dVar.mo3405L(i7, i6, i5, i4, i3);
                mo3392F(i, 1);
                i2 = 2;
            }
            mo3392F(i, i2);
        }
    }

    /* renamed from: M */
    public void mo3407M(int i, int i2, int i3, float f) {
        C0429b bVar = mo3449i0(i).f2904a;
        bVar.f3059t = i2;
        bVar.f3060u = i3;
        bVar.f3034d = f;
    }

    /* renamed from: M0 */
    public void mo3408M0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C0426d dVar;
        if (this.f2900b.containsKey(Integer.valueOf(i))) {
            C0427a aVar = this.f2900b.get(Integer.valueOf(i));
            if (aVar != null) {
                C0429b bVar = aVar.f2904a;
                int i7 = bVar.f3049j;
                int i8 = bVar.f3050k;
                if (!(i7 == -1 && i8 == -1)) {
                    if (i7 == -1 || i8 == -1) {
                        i4 = bVar.f3051l;
                        if (i4 != -1) {
                            i5 = 4;
                            i3 = 4;
                            i2 = 0;
                            dVar = this;
                            i6 = i7;
                        } else {
                            i4 = bVar.f3048i;
                            if (i4 != -1) {
                                i5 = 3;
                                i3 = 3;
                                i2 = 0;
                                dVar = this;
                                i6 = i8;
                            }
                        }
                    } else {
                        i2 = 0;
                        dVar = this;
                        dVar.mo3405L(i7, 4, i8, 3, 0);
                        i5 = 3;
                        i3 = 4;
                        i6 = i8;
                        i4 = i7;
                    }
                    dVar.mo3405L(i6, i5, i4, i3, i2);
                }
            } else {
                return;
            }
        }
        mo3392F(i, 3);
        mo3392F(i, 4);
    }

    /* renamed from: N */
    public void mo3409N(int i, int i2) {
        mo3449i0(i).f2904a.f3012P = i2;
    }

    /* renamed from: N0 */
    public void mo3410N0(int i, float f) {
        mo3449i0(i).f2906a.f3094a = f;
    }

    /* renamed from: O */
    public void mo3411O(int i, int i2) {
        mo3449i0(i).f2904a.f3011O = i2;
    }

    /* renamed from: O0 */
    public void mo3412O0(int i, boolean z) {
        mo3449i0(i).f2907a.f3116b = z;
    }

    /* renamed from: P */
    public void mo3413P(int i, int i2) {
        mo3449i0(i).f2904a.f3027b = i2;
    }

    /* renamed from: P0 */
    public void mo3414P0(int i, int i2) {
        mo3449i0(i).f2904a.f3019W = i2;
    }

    /* renamed from: Q */
    public void mo3415Q(int i, int i2) {
        mo3449i0(i).f2904a.f3014R = i2;
    }

    /* renamed from: Q0 */
    public void mo3416Q0(int i, String str, int i2) {
        mo3449i0(i).mo3507p(str, i2);
    }

    /* renamed from: R */
    public void mo3417R(int i, int i2) {
        mo3449i0(i).f2904a.f3013Q = i2;
    }

    /* renamed from: S */
    public void mo3418S(int i, int i2) {
        mo3449i0(i).f2904a.f3016T = i2;
    }

    /* renamed from: T */
    public void mo3419T(int i, int i2) {
        mo3449i0(i).f2904a.f3015S = i2;
    }

    /* renamed from: U */
    public void mo3420U(int i, float f) {
        mo3449i0(i).f2904a.f3046h = f;
    }

    /* renamed from: V */
    public void mo3421V(int i, float f) {
        mo3449i0(i).f2904a.f3043g = f;
    }

    /* renamed from: V0 */
    public void mo3422V0(int i, String str) {
        mo3449i0(i).f2904a.f3023a = str;
    }

    /* renamed from: W */
    public void mo3423W(int i, int i2) {
        mo3449i0(i).f2904a.f3022a = i2;
    }

    /* renamed from: W0 */
    public void mo3424W0(int i, int i2) {
        mo3449i0(i).f2904a.f3061v = i2;
    }

    /* renamed from: X */
    public void mo3425X(int i, boolean z) {
        mo3449i0(i).f2904a.f3042f = z;
    }

    /* renamed from: X0 */
    public void mo3426X0(int i, int i2) {
        mo3449i0(i).f2904a.f3062w = i2;
    }

    /* renamed from: Y */
    public void mo3427Y(int i, boolean z) {
        mo3449i0(i).f2904a.f3039e = z;
    }

    /* renamed from: Y0 */
    public void mo3428Y0(int i, float f) {
        mo3449i0(i).f2907a.f3125k = f;
        mo3449i0(i).f2907a.f3116b = true;
    }

    /* renamed from: Z */
    public final int[] mo3429Z(View view, String str) {
        int i;
        Object q;
        String[] split = str.split(vf4.f36537c);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0435e.C0442g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (q = ((ConstraintLayout) view.getParent()).mo3236q(0, trim)) != null && (q instanceof Integer)) {
                i = ((Integer) q).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: Z0 */
    public void mo3430Z0(int i, String str, float f) {
        mo3449i0(i).mo3508q(str, f);
    }

    /* renamed from: a0 */
    public void mo3431a0(int i, int i2) {
        C0429b bVar = mo3449i0(i).f2904a;
        bVar.f3024a = true;
        bVar.f3063x = i2;
    }

    /* renamed from: a1 */
    public void mo3432a1(boolean z) {
        this.f2901b = z;
    }

    /* renamed from: b0 */
    public void mo3433b0(int i, int i2, int i3, int... iArr) {
        C0429b bVar = mo3449i0(i).f2904a;
        bVar.f3019W = 1;
        bVar.f3017U = i2;
        bVar.f3018V = i3;
        bVar.f3024a = false;
        bVar.f3025a = iArr;
    }

    /* renamed from: b1 */
    public void mo3434b1(int i, int i2, int i3) {
        C0427a i0 = mo3449i0(i);
        switch (i2) {
            case 1:
                i0.f2904a.f3002F = i3;
                return;
            case 2:
                i0.f2904a.f3004H = i3;
                return;
            case 3:
                i0.f2904a.f3003G = i3;
                return;
            case 4:
                i0.f2904a.f3005I = i3;
                return;
            case 5:
                i0.f2904a.f3008L = i3;
                return;
            case 6:
                i0.f2904a.f3007K = i3;
                return;
            case 7:
                i0.f2904a.f3006J = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: c0 */
    public void mo3435c0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        mo3437d0(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    /* renamed from: c1 */
    public void mo3436c1(int i, int i2) {
        mo3449i0(i).f2904a.f3031c = i2;
        mo3449i0(i).f2904a.f3035d = -1;
        mo3449i0(i).f2904a.f3021a = -1.0f;
    }

    /* renamed from: d0 */
    public final void mo3437d0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                mo3449i0(iArr2[0]).f2904a.f3040f = fArr2[0];
            }
            mo3449i0(iArr2[0]).f2904a.f3009M = i5;
            mo3405L(iArr2[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr2.length; i8++) {
                int i9 = iArr2[i8];
                int i10 = i8 - 1;
                mo3405L(iArr2[i8], i6, iArr2[i10], i7, -1);
                mo3405L(iArr2[i10], i7, iArr2[i8], i6, -1);
                if (fArr2 != null) {
                    mo3449i0(iArr2[i8]).f2904a.f3040f = fArr2[i8];
                }
            }
            mo3405L(iArr2[iArr2.length - 1], i7, i3, i4, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: d1 */
    public void mo3438d1(int i, int i2) {
        mo3449i0(i).f2904a.f3035d = i2;
        mo3449i0(i).f2904a.f3031c = -1;
        mo3449i0(i).f2904a.f3021a = -1.0f;
    }

    /* renamed from: e0 */
    public void mo3439e0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        mo3437d0(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    /* renamed from: e1 */
    public void mo3440e1(int i, float f) {
        mo3449i0(i).f2904a.f3021a = f;
        mo3449i0(i).f2904a.f3035d = -1;
        mo3449i0(i).f2904a.f3031c = -1;
    }

    /* renamed from: f0 */
    public void mo3441f0(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                mo3449i0(iArr2[0]).f2904a.f3037e = fArr2[0];
            }
            mo3449i0(iArr2[0]).f2904a.f3010N = i5;
            mo3405L(iArr2[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr2.length; i6++) {
                int i7 = iArr2[i6];
                int i8 = i6 - 1;
                mo3405L(iArr2[i6], 3, iArr2[i8], 4, 0);
                mo3405L(iArr2[i8], 4, iArr2[i6], 3, 0);
                if (fArr2 != null) {
                    mo3449i0(iArr2[i6]).f2904a.f3037e = fArr2[i6];
                }
            }
            mo3405L(iArr2[iArr2.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: f1 */
    public void mo3442f1(int i, float f) {
        mo3449i0(i).f2904a.f3026b = f;
    }

    /* renamed from: g0 */
    public void mo3443g0(C0393b bVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.f2900b.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int valueOf : iArr) {
                hashSet.add(Integer.valueOf(valueOf));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            C0427a aVar = this.f2900b.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.f2904a.mo3518b(bVar, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    /* renamed from: g1 */
    public void mo3444g1(int i, int i2) {
        mo3449i0(i).f2904a.f3009M = i2;
    }

    /* renamed from: h */
    public final void mo3445h(C0419a.C0421b bVar, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.f2897a.containsKey(strArr[i])) {
                C0419a aVar = this.f2897a.get(strArr[i]);
                if (!(aVar == null || aVar.mo3311j() == bVar)) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.mo3311j().name());
                }
            } else {
                this.f2897a.put(strArr[i], new C0419a(strArr[i], bVar));
            }
        }
    }

    /* renamed from: h0 */
    public final C0427a mo3446h0(Context context, AttributeSet attributeSet, boolean z) {
        C0427a aVar = new C0427a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C0435e.C0448m.ConstraintOverride : C0435e.C0448m.Constraint);
        mo3396G0(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: h1 */
    public void mo3447h1(int i, float f) {
        mo3449i0(i).f2904a.f3040f = f;
    }

    /* renamed from: i */
    public void mo3448i(String... strArr) {
        mo3445h(C0419a.C0421b.COLOR_TYPE, strArr);
    }

    /* renamed from: i0 */
    public final C0427a mo3449i0(int i) {
        if (!this.f2900b.containsKey(Integer.valueOf(i))) {
            this.f2900b.put(Integer.valueOf(i), new C0427a());
        }
        return this.f2900b.get(Integer.valueOf(i));
    }

    /* renamed from: i1 */
    public void mo3450i1(int i, String str, int i2) {
        mo3449i0(i).mo3509r(str, i2);
    }

    /* renamed from: j */
    public void mo3451j(String... strArr) {
        mo3445h(C0419a.C0421b.FLOAT_TYPE, strArr);
    }

    /* renamed from: j0 */
    public boolean mo3452j0(int i) {
        return mo3449i0(i).f2907a.f3116b;
    }

    /* renamed from: j1 */
    public void mo3453j1(int i, int i2) {
        if (i2 >= 0 && i2 <= 3) {
            mo3449i0(i).f2904a.f3020X = i2;
        }
    }

    /* renamed from: k */
    public void mo3454k(String... strArr) {
        mo3445h(C0419a.C0421b.INT_TYPE, strArr);
    }

    /* renamed from: k0 */
    public C0427a mo3455k0(int i) {
        if (this.f2900b.containsKey(Integer.valueOf(i))) {
            return this.f2900b.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: k1 */
    public void mo3456k1(int i, int i2, int i3) {
        C0427a i0 = mo3449i0(i);
        switch (i2) {
            case 1:
                i0.f2904a.f3064y = i3;
                return;
            case 2:
                i0.f2904a.f3065z = i3;
                return;
            case 3:
                i0.f2904a.f2997A = i3;
                return;
            case 4:
                i0.f2904a.f2998B = i3;
                return;
            case 5:
                i0.f2904a.f3001E = i3;
                return;
            case 6:
                i0.f2904a.f3000D = i3;
                return;
            case 7:
                i0.f2904a.f2999C = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: l */
    public void mo3457l(String... strArr) {
        mo3445h(C0419a.C0421b.STRING_TYPE, strArr);
    }

    /* renamed from: l0 */
    public HashMap<String, C0419a> mo3458l0() {
        return this.f2897a;
    }

    /* renamed from: l1 */
    public void mo3459l1(int i, int... iArr) {
        mo3449i0(i).f2904a.f3025a = iArr;
    }

    /* renamed from: m */
    public void mo3460m(int i, int i2, int i3) {
        mo3405L(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        mo3405L(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            mo3405L(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            mo3405L(i3, 1, i, 2, 0);
        }
    }

    /* renamed from: m1 */
    public void mo3461m1(int i, float f) {
        mo3449i0(i).f2907a.f3112a = f;
    }

    /* renamed from: n */
    public void mo3462n(int i, int i2, int i3) {
        mo3405L(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        mo3405L(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            mo3405L(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            mo3405L(i3, 6, i, 7, 0);
        }
    }

    /* renamed from: n0 */
    public int mo3463n0(int i) {
        return mo3449i0(i).f2904a.f3027b;
    }

    /* renamed from: n1 */
    public void mo3464n1(int i, float f) {
        mo3449i0(i).f2907a.f3115b = f;
    }

    /* renamed from: o */
    public void mo3465o(int i, int i2, int i3) {
        mo3405L(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        mo3405L(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            mo3405L(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            mo3405L(i3, 3, i, 4, 0);
        }
    }

    /* renamed from: o0 */
    public int[] mo3466o0() {
        Integer[] numArr = (Integer[]) this.f2900b.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: o1 */
    public void mo3467o1(int i, float f) {
        mo3449i0(i).f2907a.f3117c = f;
    }

    /* renamed from: p */
    public void mo3468p(ConstraintLayout constraintLayout) {
        C0427a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2900b.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ve0.m30012k(childAt));
            } else if (this.f2901b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f2900b.containsKey(Integer.valueOf(id)) && (aVar = this.f2900b.get(Integer.valueOf(id))) != null) {
                C0419a.m3153r(childAt, aVar.f2909a);
            }
        }
    }

    /* renamed from: p1 */
    public void mo3469p1(int i, float f) {
        mo3449i0(i).f2907a.f3118d = f;
    }

    /* renamed from: q */
    public void mo3470q(C0426d dVar) {
        for (C0427a next : dVar.f2900b.values()) {
            if (next.f2903a != null) {
                if (next.f2908a != null) {
                    for (Integer intValue : this.f2900b.keySet()) {
                        C0427a k0 = mo3455k0(intValue.intValue());
                        String str = k0.f2904a.f3032c;
                        if (str != null && next.f2908a.matches(str)) {
                            next.f2903a.mo3515e(k0);
                            k0.f2909a.putAll((HashMap) next.f2909a.clone());
                        }
                    }
                } else {
                    next.f2903a.mo3515e(mo3455k0(next.f2902a));
                }
            }
        }
    }

    /* renamed from: q0 */
    public C0427a mo3471q0(int i) {
        return mo3449i0(i);
    }

    /* renamed from: q1 */
    public void mo3472q1(int i, float f) {
        mo3449i0(i).f2907a.f3119e = f;
    }

    /* renamed from: r */
    public void mo3473r(ConstraintLayout constraintLayout) {
        mo3479t(constraintLayout, true);
        constraintLayout.setConstraintSet((C0426d) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: r0 */
    public int[] mo3474r0(int i) {
        int[] iArr = mo3449i0(i).f2904a.f3025a;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: r1 */
    public void mo3475r1(int i, String str, String str2) {
        mo3449i0(i).mo3510s(str, str2);
    }

    /* renamed from: s */
    public void mo3476s(ConstraintHelper constraintHelper, o60 o60, ConstraintLayout.LayoutParams layoutParams, SparseArray<o60> sparseArray) {
        C0427a aVar;
        int id = constraintHelper.getId();
        if (this.f2900b.containsKey(Integer.valueOf(id)) && (aVar = this.f2900b.get(Integer.valueOf(id))) != null && (o60 instanceof ml1)) {
            constraintHelper.mo2701z(aVar, (ml1) o60, layoutParams, sparseArray);
        }
    }

    /* renamed from: s0 */
    public int mo3477s0(int i) {
        return mo3449i0(i).f2906a.f3095a;
    }

    /* renamed from: s1 */
    public void mo3478s1(int i, float f, float f2) {
        C0432e eVar = mo3449i0(i).f2907a;
        eVar.f3121g = f2;
        eVar.f3120f = f;
    }

    /* renamed from: t */
    public void mo3479t(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2900b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2900b.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ve0.m30012k(childAt));
            } else if (this.f2901b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2900b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0427a aVar = this.f2900b.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f2904a.f3019W = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2904a.f3017U);
                            barrier.setMargin(aVar.f2904a.f3018V);
                            barrier.setAllowsGoneWidget(aVar.f2904a.f3045g);
                            C0429b bVar = aVar.f2904a;
                            int[] iArr = bVar.f3025a;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f3028b;
                                if (str != null) {
                                    bVar.f3025a = mo3429Z(barrier, str);
                                    barrier.setReferencedIds(aVar.f2904a.f3025a);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.mo3257e();
                        aVar.mo3500i(layoutParams);
                        if (z) {
                            C0419a.m3153r(childAt, aVar.f2909a);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0431d dVar = aVar.f2906a;
                        if (dVar.f3098b == 0) {
                            childAt.setVisibility(dVar.f3095a);
                        }
                        childAt.setAlpha(aVar.f2906a.f3094a);
                        childAt.setRotation(aVar.f2907a.f3112a);
                        childAt.setRotationX(aVar.f2907a.f3115b);
                        childAt.setRotationY(aVar.f2907a.f3117c);
                        childAt.setScaleX(aVar.f2907a.f3118d);
                        childAt.setScaleY(aVar.f2907a.f3119e);
                        C0432e eVar = aVar.f2907a;
                        if (eVar.f3113a != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2907a.f3113a);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f3120f)) {
                                childAt.setPivotX(aVar.f2907a.f3120f);
                            }
                            if (!Float.isNaN(aVar.f2907a.f3121g)) {
                                childAt.setPivotY(aVar.f2907a.f3121g);
                            }
                        }
                        childAt.setTranslationX(aVar.f2907a.f3122h);
                        childAt.setTranslationY(aVar.f2907a.f3123i);
                        childAt.setTranslationZ(aVar.f2907a.f3124j);
                        C0432e eVar2 = aVar.f2907a;
                        if (eVar2.f3116b) {
                            childAt.setElevation(eVar2.f3125k);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0427a aVar2 = this.f2900b.get(num);
            if (aVar2 != null) {
                if (aVar2.f2904a.f3019W == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0429b bVar2 = aVar2.f2904a;
                    int[] iArr2 = bVar2.f3025a;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f3028b;
                        if (str2 != null) {
                            bVar2.f3025a = mo3429Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2904a.f3025a);
                        }
                    }
                    barrier2.setType(aVar2.f2904a.f3017U);
                    barrier2.setMargin(aVar2.f2904a.f3018V);
                    ConstraintLayout.LayoutParams m = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo3196I();
                    aVar2.mo3500i(m);
                    constraintLayout.addView(barrier2, m);
                }
                if (aVar2.f2904a.f3024a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams m2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo3500i(m2);
                    constraintLayout.addView(guideline, m2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo2707r(constraintLayout);
            }
        }
    }

    /* renamed from: t0 */
    public int mo3480t0(int i) {
        return mo3449i0(i).f2906a.f3098b;
    }

    /* renamed from: t1 */
    public void mo3481t1(int i, float f) {
        mo3449i0(i).f2907a.f3120f = f;
    }

    /* renamed from: u */
    public void mo3482u(int i, ConstraintLayout.LayoutParams layoutParams) {
        C0427a aVar;
        if (this.f2900b.containsKey(Integer.valueOf(i)) && (aVar = this.f2900b.get(Integer.valueOf(i))) != null) {
            aVar.mo3500i(layoutParams);
        }
    }

    /* renamed from: u0 */
    public int mo3483u0(int i) {
        return mo3449i0(i).f2904a.f3022a;
    }

    /* renamed from: u1 */
    public void mo3484u1(int i, float f) {
        mo3449i0(i).f2907a.f3121g = f;
    }

    /* renamed from: v */
    public void mo3485v(ConstraintLayout constraintLayout) {
        mo3479t(constraintLayout, false);
        constraintLayout.setConstraintSet((C0426d) null);
    }

    /* renamed from: v0 */
    public boolean mo3486v0() {
        return this.f2901b;
    }

    /* renamed from: v1 */
    public void mo3487v1(int i, float f, float f2) {
        C0432e eVar = mo3449i0(i).f2907a;
        eVar.f3122h = f;
        eVar.f3123i = f2;
    }

    /* renamed from: w0 */
    public void mo3488w0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0427a h0 = mo3446h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h0.f2904a.f3024a = true;
                    }
                    this.f2900b.put(Integer.valueOf(h0.f2902a), h0);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: w1 */
    public void mo3489w1(int i, float f) {
        mo3449i0(i).f2907a.f3122h = f;
    }

    /* renamed from: x */
    public void mo3490x(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        C0427a aVar;
        int i8 = i3;
        float f2 = f;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i8 == 1 || i8 == 2) {
                int i9 = i;
                mo3405L(i9, 1, i2, i3, i4);
                mo3405L(i9, 2, i5, i6, i7);
                aVar = this.f2900b.get(Integer.valueOf(i));
                if (aVar == null) {
                    return;
                }
            } else if (i8 == 6 || i8 == 7) {
                int i10 = i;
                mo3405L(i10, 6, i2, i3, i4);
                mo3405L(i10, 7, i5, i6, i7);
                aVar = this.f2900b.get(Integer.valueOf(i));
                if (aVar == null) {
                    return;
                }
            } else {
                int i11 = i;
                mo3405L(i11, 3, i2, i3, i4);
                mo3405L(i11, 4, i5, i6, i7);
                C0427a aVar2 = this.f2900b.get(Integer.valueOf(i));
                if (aVar2 != null) {
                    aVar2.f2904a.f3030c = f2;
                    return;
                }
                return;
            }
            aVar.f2904a.f3026b = f2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3491x0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f2900b     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f2902a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f2909a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.C0419a.m3152q(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.d$c r0 = r2.f2905a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3521b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.d$b r0 = r2.f2904a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3519c(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.d$e r0 = r2.f2907a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3525b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.d$d r0 = r2.f2906a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3523b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.mo3446h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$b r2 = r0.f2904a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3019W = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.mo3446h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$b r2 = r0.f2904a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3024a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3029b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.mo3446h0(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.mo3446h0(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0426d.mo3491x0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: x1 */
    public void mo3492x1(int i, float f) {
        mo3449i0(i).f2907a.f3123i = f;
    }

    /* renamed from: y */
    public void mo3493y(int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0426d dVar;
        if (i2 == 0) {
            i8 = 0;
            i7 = 1;
            i6 = 0;
            i5 = 0;
            i4 = 2;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
        } else {
            i7 = 2;
            i6 = 0;
            i4 = 1;
            i3 = 0;
            f = 0.5f;
            dVar = this;
            i9 = i;
            i8 = i2;
            i5 = i2;
        }
        dVar.mo3490x(i9, i8, i7, i6, i5, i4, i3, f);
    }

    /* renamed from: y1 */
    public void mo3494y1(int i, float f) {
        mo3449i0(i).f2907a.f3124j = f;
    }

    /* renamed from: z */
    public void mo3495z(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3405L(i, 1, i2, i3, i4);
        mo3405L(i, 2, i5, i6, i7);
        C0427a aVar = this.f2900b.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f2904a.f3026b = f;
        }
    }

    /* renamed from: z0 */
    public void mo3496z0(C0427a aVar, String str) {
        String[] split = str.split(vf4.f36537c);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(a13.f25713a);
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            } else {
                aVar.mo3507p(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    /* renamed from: z1 */
    public void mo3497z1(boolean z) {
        this.f2898a = z;
    }
}
