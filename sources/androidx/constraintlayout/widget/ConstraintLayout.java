package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.C1788bk;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.m60;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nj1;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.p60;
import com.onedelhi.secure.q60;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vf4;
import com.onedelhi.secure.zi2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: B */
    public static final int f2468B = 0;

    /* renamed from: a */
    public static C0449f f2469a = null;

    /* renamed from: b */
    public static final String f2470b = "ConstraintLayout-2.1.4";

    /* renamed from: c */
    public static final String f2471c = "ConstraintLayout";

    /* renamed from: c */
    public static final boolean f2472c = true;

    /* renamed from: d */
    public static final boolean f2473d = false;

    /* renamed from: e */
    public static final boolean f2474e = false;

    /* renamed from: f */
    public static final boolean f2475f = false;

    /* renamed from: g */
    public static final boolean f2476g = false;

    /* renamed from: A */
    public int f2477A = 0;

    /* renamed from: a */
    public SparseArray<View> f2478a = new SparseArray<>();

    /* renamed from: a */
    public C0418b f2479a = new C0418b(this);

    /* renamed from: a */
    public C0422b f2480a = null;

    /* renamed from: a */
    public C0426d f2481a = null;

    /* renamed from: a */
    public p60 f2482a = new p60();

    /* renamed from: a */
    public q60 f2483a;

    /* renamed from: a */
    public zi2 f2484a;

    /* renamed from: a */
    public ArrayList<ConstraintHelper> f2485a = new ArrayList<>(4);

    /* renamed from: a */
    public HashMap<String, Integer> f2486a = new HashMap<>();

    /* renamed from: b */
    public SparseArray<o60> f2487b = new SparseArray<>();

    /* renamed from: b */
    public boolean f2488b = true;

    /* renamed from: n */
    public int f2489n = 0;

    /* renamed from: o */
    public int f2490o = 0;

    /* renamed from: p */
    public int f2491p = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f2492q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f2493r = 257;

    /* renamed from: s */
    public int f2494s = -1;

    /* renamed from: t */
    public int f2495t = -1;

    /* renamed from: u */
    public int f2496u = -1;

    /* renamed from: v */
    public int f2497v = -1;

    /* renamed from: w */
    public int f2498w = -1;

    /* renamed from: x */
    public int f2499x = 0;

    /* renamed from: y */
    public int f2500y = 0;

    /* renamed from: z */
    public int f2501z = 0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: W */
        public static final int f2502W = 0;

        /* renamed from: X */
        public static final int f2503X = 0;

        /* renamed from: Y */
        public static final int f2504Y = -1;

        /* renamed from: Z */
        public static final int f2505Z = Integer.MIN_VALUE;

        /* renamed from: a0 */
        public static final int f2506a0 = 0;

        /* renamed from: b0 */
        public static final int f2507b0 = 1;

        /* renamed from: c0 */
        public static final int f2508c0 = 1;

        /* renamed from: d0 */
        public static final int f2509d0 = 2;

        /* renamed from: e0 */
        public static final int f2510e0 = 3;

        /* renamed from: f0 */
        public static final int f2511f0 = 4;

        /* renamed from: g0 */
        public static final int f2512g0 = 5;

        /* renamed from: h0 */
        public static final int f2513h0 = 6;

        /* renamed from: i0 */
        public static final int f2514i0 = 7;

        /* renamed from: j0 */
        public static final int f2515j0 = 8;

        /* renamed from: k0 */
        public static final int f2516k0 = 1;

        /* renamed from: l0 */
        public static final int f2517l0 = 0;

        /* renamed from: m0 */
        public static final int f2518m0 = 2;

        /* renamed from: n0 */
        public static final int f2519n0 = 0;

        /* renamed from: o0 */
        public static final int f2520o0 = 1;

        /* renamed from: p0 */
        public static final int f2521p0 = 2;

        /* renamed from: q0 */
        public static final int f2522q0 = 0;

        /* renamed from: r0 */
        public static final int f2523r0 = 1;

        /* renamed from: s0 */
        public static final int f2524s0 = 2;

        /* renamed from: t0 */
        public static final int f2525t0 = 3;

        /* renamed from: A */
        public int f2526A = 0;

        /* renamed from: B */
        public int f2527B = 1;

        /* renamed from: C */
        public int f2528C = 0;

        /* renamed from: D */
        public int f2529D = 0;

        /* renamed from: E */
        public int f2530E = 0;

        /* renamed from: F */
        public int f2531F = 0;

        /* renamed from: G */
        public int f2532G = 0;

        /* renamed from: H */
        public int f2533H = 0;

        /* renamed from: I */
        public int f2534I = 0;

        /* renamed from: J */
        public int f2535J = 0;

        /* renamed from: K */
        public int f2536K = -1;

        /* renamed from: L */
        public int f2537L = -1;

        /* renamed from: M */
        public int f2538M = -1;

        /* renamed from: N */
        public int f2539N = 0;

        /* renamed from: O */
        public int f2540O = -1;

        /* renamed from: P */
        public int f2541P = -1;

        /* renamed from: Q */
        public int f2542Q = -1;

        /* renamed from: R */
        public int f2543R = -1;

        /* renamed from: S */
        public int f2544S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f2545T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f2546U;

        /* renamed from: V */
        public int f2547V;

        /* renamed from: a */
        public float f2548a = -1.0f;

        /* renamed from: a */
        public int f2549a = -1;

        /* renamed from: a */
        public o60 f2550a = new o60();

        /* renamed from: a */
        public String f2551a = null;

        /* renamed from: a */
        public boolean f2552a = true;

        /* renamed from: b */
        public float f2553b = 0.0f;

        /* renamed from: b */
        public int f2554b = -1;

        /* renamed from: b */
        public String f2555b = null;

        /* renamed from: b */
        public boolean f2556b = true;

        /* renamed from: c */
        public float f2557c = 0.5f;

        /* renamed from: c */
        public int f2558c = -1;

        /* renamed from: c */
        public boolean f2559c = true;

        /* renamed from: d */
        public float f2560d = 0.5f;

        /* renamed from: d */
        public int f2561d = -1;

        /* renamed from: d */
        public boolean f2562d = false;

        /* renamed from: e */
        public float f2563e = 0.0f;

        /* renamed from: e */
        public int f2564e = -1;

        /* renamed from: e */
        public boolean f2565e = false;

        /* renamed from: f */
        public float f2566f = -1.0f;

        /* renamed from: f */
        public int f2567f = -1;

        /* renamed from: f */
        public boolean f2568f = true;

        /* renamed from: g */
        public float f2569g = -1.0f;

        /* renamed from: g */
        public int f2570g = -1;

        /* renamed from: g */
        public boolean f2571g = true;

        /* renamed from: h */
        public float f2572h = 1.0f;

        /* renamed from: h */
        public int f2573h = -1;

        /* renamed from: h */
        public boolean f2574h = false;

        /* renamed from: i */
        public float f2575i = 1.0f;

        /* renamed from: i */
        public int f2576i = -1;

        /* renamed from: i */
        public boolean f2577i = false;

        /* renamed from: j */
        public float f2578j = 0.5f;

        /* renamed from: j */
        public int f2579j = -1;

        /* renamed from: j */
        public boolean f2580j = false;

        /* renamed from: k */
        public float f2581k;

        /* renamed from: k */
        public int f2582k = -1;

        /* renamed from: k */
        public boolean f2583k = false;

        /* renamed from: l */
        public int f2584l = -1;

        /* renamed from: l */
        public boolean f2585l = false;

        /* renamed from: m */
        public int f2586m = -1;

        /* renamed from: m */
        public boolean f2587m = false;

        /* renamed from: n */
        public int f2588n = -1;

        /* renamed from: o */
        public int f2589o = 0;

        /* renamed from: p */
        public int f2590p = -1;

        /* renamed from: q */
        public int f2591q = -1;

        /* renamed from: r */
        public int f2592r = -1;

        /* renamed from: s */
        public int f2593s = -1;

        /* renamed from: t */
        public int f2594t = Integer.MIN_VALUE;

        /* renamed from: u */
        public int f2595u = Integer.MIN_VALUE;

        /* renamed from: v */
        public int f2596v = Integer.MIN_VALUE;

        /* renamed from: w */
        public int f2597w = Integer.MIN_VALUE;

        /* renamed from: x */
        public int f2598x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f2599y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f2600z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C0416a {

            /* renamed from: A */
            public static final int f2601A = 26;

            /* renamed from: B */
            public static final int f2602B = 27;

            /* renamed from: C */
            public static final int f2603C = 28;

            /* renamed from: D */
            public static final int f2604D = 29;

            /* renamed from: E */
            public static final int f2605E = 30;

            /* renamed from: F */
            public static final int f2606F = 31;

            /* renamed from: G */
            public static final int f2607G = 32;

            /* renamed from: H */
            public static final int f2608H = 33;

            /* renamed from: I */
            public static final int f2609I = 34;

            /* renamed from: J */
            public static final int f2610J = 35;

            /* renamed from: K */
            public static final int f2611K = 36;

            /* renamed from: L */
            public static final int f2612L = 37;

            /* renamed from: M */
            public static final int f2613M = 38;

            /* renamed from: N */
            public static final int f2614N = 39;

            /* renamed from: O */
            public static final int f2615O = 40;

            /* renamed from: P */
            public static final int f2616P = 41;

            /* renamed from: Q */
            public static final int f2617Q = 42;

            /* renamed from: R */
            public static final int f2618R = 43;

            /* renamed from: S */
            public static final int f2619S = 44;

            /* renamed from: T */
            public static final int f2620T = 45;

            /* renamed from: U */
            public static final int f2621U = 46;

            /* renamed from: V */
            public static final int f2622V = 47;

            /* renamed from: W */
            public static final int f2623W = 48;

            /* renamed from: X */
            public static final int f2624X = 49;

            /* renamed from: Y */
            public static final int f2625Y = 50;

            /* renamed from: Z */
            public static final int f2626Z = 51;

            /* renamed from: a */
            public static final int f2627a = 0;

            /* renamed from: a */
            public static final SparseIntArray f2628a;

            /* renamed from: a0 */
            public static final int f2629a0 = 52;

            /* renamed from: b */
            public static final int f2630b = 1;

            /* renamed from: b0 */
            public static final int f2631b0 = 53;

            /* renamed from: c */
            public static final int f2632c = 2;

            /* renamed from: c0 */
            public static final int f2633c0 = 54;

            /* renamed from: d */
            public static final int f2634d = 3;

            /* renamed from: d0 */
            public static final int f2635d0 = 55;

            /* renamed from: e */
            public static final int f2636e = 4;

            /* renamed from: e0 */
            public static final int f2637e0 = 64;

            /* renamed from: f */
            public static final int f2638f = 5;

            /* renamed from: f0 */
            public static final int f2639f0 = 65;

            /* renamed from: g */
            public static final int f2640g = 6;

            /* renamed from: g0 */
            public static final int f2641g0 = 66;

            /* renamed from: h */
            public static final int f2642h = 7;

            /* renamed from: h0 */
            public static final int f2643h0 = 67;

            /* renamed from: i */
            public static final int f2644i = 8;

            /* renamed from: j */
            public static final int f2645j = 9;

            /* renamed from: k */
            public static final int f2646k = 10;

            /* renamed from: l */
            public static final int f2647l = 11;

            /* renamed from: m */
            public static final int f2648m = 12;

            /* renamed from: n */
            public static final int f2649n = 13;

            /* renamed from: o */
            public static final int f2650o = 14;

            /* renamed from: p */
            public static final int f2651p = 15;

            /* renamed from: q */
            public static final int f2652q = 16;

            /* renamed from: r */
            public static final int f2653r = 17;

            /* renamed from: s */
            public static final int f2654s = 18;

            /* renamed from: t */
            public static final int f2655t = 19;

            /* renamed from: u */
            public static final int f2656u = 20;

            /* renamed from: v */
            public static final int f2657v = 21;

            /* renamed from: w */
            public static final int f2658w = 22;

            /* renamed from: x */
            public static final int f2659x = 23;

            /* renamed from: y */
            public static final int f2660y = 24;

            /* renamed from: z */
            public static final int f2661z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2628a = sparseIntArray;
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C0435e.C0448m.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ff, code lost:
            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.f2471c, r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f2549a = r0
                r10.f2554b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f2548a = r1
                r2 = 1
                r10.f2552a = r2
                r10.f2558c = r0
                r10.f2561d = r0
                r10.f2564e = r0
                r10.f2567f = r0
                r10.f2570g = r0
                r10.f2573h = r0
                r10.f2576i = r0
                r10.f2579j = r0
                r10.f2582k = r0
                r10.f2584l = r0
                r10.f2586m = r0
                r10.f2588n = r0
                r3 = 0
                r10.f2589o = r3
                r4 = 0
                r10.f2553b = r4
                r10.f2590p = r0
                r10.f2591q = r0
                r10.f2592r = r0
                r10.f2593s = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r10.f2594t = r5
                r10.f2595u = r5
                r10.f2596v = r5
                r10.f2597w = r5
                r10.f2598x = r5
                r10.f2599y = r5
                r10.f2600z = r5
                r10.f2526A = r3
                r10.f2556b = r2
                r10.f2559c = r2
                r6 = 1056964608(0x3f000000, float:0.5)
                r10.f2557c = r6
                r10.f2560d = r6
                r7 = 0
                r10.f2551a = r7
                r10.f2563e = r4
                r10.f2527B = r2
                r10.f2566f = r1
                r10.f2569g = r1
                r10.f2528C = r3
                r10.f2529D = r3
                r10.f2530E = r3
                r10.f2531F = r3
                r10.f2532G = r3
                r10.f2533H = r3
                r10.f2534I = r3
                r10.f2535J = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f2572h = r1
                r10.f2575i = r1
                r10.f2536K = r0
                r10.f2537L = r0
                r10.f2538M = r0
                r10.f2562d = r3
                r10.f2565e = r3
                r10.f2555b = r7
                r10.f2539N = r3
                r10.f2568f = r2
                r10.f2571g = r2
                r10.f2574h = r3
                r10.f2577i = r3
                r10.f2580j = r3
                r10.f2583k = r3
                r10.f2585l = r3
                r10.f2540O = r0
                r10.f2541P = r0
                r10.f2542Q = r0
                r10.f2543R = r0
                r10.f2544S = r5
                r10.f2545T = r5
                r10.f2578j = r6
                com.onedelhi.secure.o60 r1 = new com.onedelhi.secure.o60
                r1.<init>()
                r10.f2550a = r1
                r10.f2587m = r3
                int[] r1 = androidx.constraintlayout.widget.C0435e.C0448m.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = 0
            L_0x00b0:
                if (r1 >= r12) goto L_0x03a6
                int r5 = r11.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.C0416a.f2628a
                int r6 = r6.get(r5)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r6) {
                    case 1: goto L_0x039a;
                    case 2: goto L_0x0389;
                    case 3: goto L_0x0380;
                    case 4: goto L_0x036b;
                    case 5: goto L_0x0362;
                    case 6: goto L_0x0359;
                    case 7: goto L_0x0350;
                    case 8: goto L_0x033f;
                    case 9: goto L_0x032e;
                    case 10: goto L_0x031c;
                    case 11: goto L_0x030a;
                    case 12: goto L_0x02f8;
                    case 13: goto L_0x02e6;
                    case 14: goto L_0x02d4;
                    case 15: goto L_0x02c2;
                    case 16: goto L_0x02b0;
                    case 17: goto L_0x029e;
                    case 18: goto L_0x028c;
                    case 19: goto L_0x027a;
                    case 20: goto L_0x0268;
                    case 21: goto L_0x025e;
                    case 22: goto L_0x0254;
                    case 23: goto L_0x024a;
                    case 24: goto L_0x0240;
                    case 25: goto L_0x0236;
                    case 26: goto L_0x022c;
                    case 27: goto L_0x0222;
                    case 28: goto L_0x0218;
                    case 29: goto L_0x020e;
                    case 30: goto L_0x0204;
                    case 31: goto L_0x01f5;
                    case 32: goto L_0x01ea;
                    case 33: goto L_0x01d3;
                    case 34: goto L_0x01bc;
                    case 35: goto L_0x01ac;
                    case 36: goto L_0x0195;
                    case 37: goto L_0x017e;
                    case 38: goto L_0x016e;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                switch(r6) {
                    case 44: goto L_0x0165;
                    case 45: goto L_0x015b;
                    case 46: goto L_0x0151;
                    case 47: goto L_0x0149;
                    case 48: goto L_0x0141;
                    case 49: goto L_0x0137;
                    case 50: goto L_0x012d;
                    case 51: goto L_0x0125;
                    case 52: goto L_0x0113;
                    case 53: goto L_0x0101;
                    case 54: goto L_0x00f7;
                    case 55: goto L_0x00ed;
                    default: goto L_0x00c6;
                }
            L_0x00c6:
                switch(r6) {
                    case 64: goto L_0x00e6;
                    case 65: goto L_0x00df;
                    case 66: goto L_0x00d5;
                    case 67: goto L_0x00cb;
                    default: goto L_0x00c9;
                }
            L_0x00c9:
                goto L_0x03a2
            L_0x00cb:
                boolean r6 = r10.f2552a
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f2552a = r5
                goto L_0x03a2
            L_0x00d5:
                int r6 = r10.f2539N
                int r5 = r11.getInt(r5, r6)
                r10.f2539N = r5
                goto L_0x03a2
            L_0x00df:
                androidx.constraintlayout.widget.C0426d.m3231A0(r10, r11, r5, r2)
                r10.f2559c = r2
                goto L_0x03a2
            L_0x00e6:
                androidx.constraintlayout.widget.C0426d.m3231A0(r10, r11, r5, r3)
                r10.f2556b = r2
                goto L_0x03a2
            L_0x00ed:
                int r6 = r10.f2600z
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2600z = r5
                goto L_0x03a2
            L_0x00f7:
                int r6 = r10.f2526A
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2526A = r5
                goto L_0x03a2
            L_0x0101:
                int r6 = r10.f2586m
                int r6 = r11.getResourceId(r5, r6)
                r10.f2586m = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2586m = r5
                goto L_0x03a2
            L_0x0113:
                int r6 = r10.f2584l
                int r6 = r11.getResourceId(r5, r6)
                r10.f2584l = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2584l = r5
                goto L_0x03a2
            L_0x0125:
                java.lang.String r5 = r11.getString(r5)
                r10.f2555b = r5
                goto L_0x03a2
            L_0x012d:
                int r6 = r10.f2537L
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f2537L = r5
                goto L_0x03a2
            L_0x0137:
                int r6 = r10.f2536K
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f2536K = r5
                goto L_0x03a2
            L_0x0141:
                int r5 = r11.getInt(r5, r3)
                r10.f2529D = r5
                goto L_0x03a2
            L_0x0149:
                int r5 = r11.getInt(r5, r3)
                r10.f2528C = r5
                goto L_0x03a2
            L_0x0151:
                float r6 = r10.f2569g
                float r5 = r11.getFloat(r5, r6)
                r10.f2569g = r5
                goto L_0x03a2
            L_0x015b:
                float r6 = r10.f2566f
                float r5 = r11.getFloat(r5, r6)
                r10.f2566f = r5
                goto L_0x03a2
            L_0x0165:
                java.lang.String r5 = r11.getString(r5)
                androidx.constraintlayout.widget.C0426d.m3233C0(r10, r5)
                goto L_0x03a2
            L_0x016e:
                float r6 = r10.f2575i
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.f2575i = r5
                r10.f2531F = r8
                goto L_0x03a2
            L_0x017e:
                int r6 = r10.f2535J     // Catch:{ Exception -> 0x0188 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0188 }
                r10.f2535J = r6     // Catch:{ Exception -> 0x0188 }
                goto L_0x03a2
            L_0x0188:
                int r6 = r10.f2535J
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x03a2
                r10.f2535J = r9
                goto L_0x03a2
            L_0x0195:
                int r6 = r10.f2533H     // Catch:{ Exception -> 0x019f }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x019f }
                r10.f2533H = r6     // Catch:{ Exception -> 0x019f }
                goto L_0x03a2
            L_0x019f:
                int r6 = r10.f2533H
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x03a2
                r10.f2533H = r9
                goto L_0x03a2
            L_0x01ac:
                float r6 = r10.f2572h
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.f2572h = r5
                r10.f2530E = r8
                goto L_0x03a2
            L_0x01bc:
                int r6 = r10.f2534I     // Catch:{ Exception -> 0x01c6 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01c6 }
                r10.f2534I = r6     // Catch:{ Exception -> 0x01c6 }
                goto L_0x03a2
            L_0x01c6:
                int r6 = r10.f2534I
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x03a2
                r10.f2534I = r9
                goto L_0x03a2
            L_0x01d3:
                int r6 = r10.f2532G     // Catch:{ Exception -> 0x01dd }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01dd }
                r10.f2532G = r6     // Catch:{ Exception -> 0x01dd }
                goto L_0x03a2
            L_0x01dd:
                int r6 = r10.f2532G
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x03a2
                r10.f2532G = r9
                goto L_0x03a2
            L_0x01ea:
                int r5 = r11.getInt(r5, r3)
                r10.f2531F = r5
                if (r5 != r2) goto L_0x03a2
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x01ff
            L_0x01f5:
                int r5 = r11.getInt(r5, r3)
                r10.f2530E = r5
                if (r5 != r2) goto L_0x03a2
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x01ff:
                android.util.Log.e(r7, r5)
                goto L_0x03a2
            L_0x0204:
                float r6 = r10.f2560d
                float r5 = r11.getFloat(r5, r6)
                r10.f2560d = r5
                goto L_0x03a2
            L_0x020e:
                float r6 = r10.f2557c
                float r5 = r11.getFloat(r5, r6)
                r10.f2557c = r5
                goto L_0x03a2
            L_0x0218:
                boolean r6 = r10.f2565e
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f2565e = r5
                goto L_0x03a2
            L_0x0222:
                boolean r6 = r10.f2562d
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f2562d = r5
                goto L_0x03a2
            L_0x022c:
                int r6 = r10.f2599y
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2599y = r5
                goto L_0x03a2
            L_0x0236:
                int r6 = r10.f2598x
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2598x = r5
                goto L_0x03a2
            L_0x0240:
                int r6 = r10.f2597w
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2597w = r5
                goto L_0x03a2
            L_0x024a:
                int r6 = r10.f2596v
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2596v = r5
                goto L_0x03a2
            L_0x0254:
                int r6 = r10.f2595u
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2595u = r5
                goto L_0x03a2
            L_0x025e:
                int r6 = r10.f2594t
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2594t = r5
                goto L_0x03a2
            L_0x0268:
                int r6 = r10.f2593s
                int r6 = r11.getResourceId(r5, r6)
                r10.f2593s = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2593s = r5
                goto L_0x03a2
            L_0x027a:
                int r6 = r10.f2592r
                int r6 = r11.getResourceId(r5, r6)
                r10.f2592r = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2592r = r5
                goto L_0x03a2
            L_0x028c:
                int r6 = r10.f2591q
                int r6 = r11.getResourceId(r5, r6)
                r10.f2591q = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2591q = r5
                goto L_0x03a2
            L_0x029e:
                int r6 = r10.f2590p
                int r6 = r11.getResourceId(r5, r6)
                r10.f2590p = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2590p = r5
                goto L_0x03a2
            L_0x02b0:
                int r6 = r10.f2582k
                int r6 = r11.getResourceId(r5, r6)
                r10.f2582k = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2582k = r5
                goto L_0x03a2
            L_0x02c2:
                int r6 = r10.f2579j
                int r6 = r11.getResourceId(r5, r6)
                r10.f2579j = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2579j = r5
                goto L_0x03a2
            L_0x02d4:
                int r6 = r10.f2576i
                int r6 = r11.getResourceId(r5, r6)
                r10.f2576i = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2576i = r5
                goto L_0x03a2
            L_0x02e6:
                int r6 = r10.f2573h
                int r6 = r11.getResourceId(r5, r6)
                r10.f2573h = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2573h = r5
                goto L_0x03a2
            L_0x02f8:
                int r6 = r10.f2570g
                int r6 = r11.getResourceId(r5, r6)
                r10.f2570g = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2570g = r5
                goto L_0x03a2
            L_0x030a:
                int r6 = r10.f2567f
                int r6 = r11.getResourceId(r5, r6)
                r10.f2567f = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2567f = r5
                goto L_0x03a2
            L_0x031c:
                int r6 = r10.f2564e
                int r6 = r11.getResourceId(r5, r6)
                r10.f2564e = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2564e = r5
                goto L_0x03a2
            L_0x032e:
                int r6 = r10.f2561d
                int r6 = r11.getResourceId(r5, r6)
                r10.f2561d = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2561d = r5
                goto L_0x03a2
            L_0x033f:
                int r6 = r10.f2558c
                int r6 = r11.getResourceId(r5, r6)
                r10.f2558c = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2558c = r5
                goto L_0x03a2
            L_0x0350:
                float r6 = r10.f2548a
                float r5 = r11.getFloat(r5, r6)
                r10.f2548a = r5
                goto L_0x03a2
            L_0x0359:
                int r6 = r10.f2554b
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f2554b = r5
                goto L_0x03a2
            L_0x0362:
                int r6 = r10.f2549a
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f2549a = r5
                goto L_0x03a2
            L_0x036b:
                float r6 = r10.f2553b
                float r5 = r11.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r10.f2553b = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x03a2
                float r5 = r6 - r5
                float r5 = r5 % r6
                r10.f2553b = r5
                goto L_0x03a2
            L_0x0380:
                int r6 = r10.f2589o
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f2589o = r5
                goto L_0x03a2
            L_0x0389:
                int r6 = r10.f2588n
                int r6 = r11.getResourceId(r5, r6)
                r10.f2588n = r6
                if (r6 != r0) goto L_0x03a2
                int r5 = r11.getInt(r5, r0)
                r10.f2588n = r5
                goto L_0x03a2
            L_0x039a:
                int r6 = r10.f2538M
                int r5 = r11.getInt(r5, r6)
                r10.f2538M = r5
            L_0x03a2:
                int r1 = r1 + 1
                goto L_0x00b0
            L_0x03a6:
                r11.recycle()
                r10.mo3257e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2549a = layoutParams.f2549a;
            this.f2554b = layoutParams.f2554b;
            this.f2548a = layoutParams.f2548a;
            this.f2552a = layoutParams.f2552a;
            this.f2558c = layoutParams.f2558c;
            this.f2561d = layoutParams.f2561d;
            this.f2564e = layoutParams.f2564e;
            this.f2567f = layoutParams.f2567f;
            this.f2570g = layoutParams.f2570g;
            this.f2573h = layoutParams.f2573h;
            this.f2576i = layoutParams.f2576i;
            this.f2579j = layoutParams.f2579j;
            this.f2582k = layoutParams.f2582k;
            this.f2584l = layoutParams.f2584l;
            this.f2586m = layoutParams.f2586m;
            this.f2588n = layoutParams.f2588n;
            this.f2589o = layoutParams.f2589o;
            this.f2553b = layoutParams.f2553b;
            this.f2590p = layoutParams.f2590p;
            this.f2591q = layoutParams.f2591q;
            this.f2592r = layoutParams.f2592r;
            this.f2593s = layoutParams.f2593s;
            this.f2594t = layoutParams.f2594t;
            this.f2595u = layoutParams.f2595u;
            this.f2596v = layoutParams.f2596v;
            this.f2597w = layoutParams.f2597w;
            this.f2598x = layoutParams.f2598x;
            this.f2599y = layoutParams.f2599y;
            this.f2600z = layoutParams.f2600z;
            this.f2526A = layoutParams.f2526A;
            this.f2557c = layoutParams.f2557c;
            this.f2560d = layoutParams.f2560d;
            this.f2551a = layoutParams.f2551a;
            this.f2563e = layoutParams.f2563e;
            this.f2527B = layoutParams.f2527B;
            this.f2566f = layoutParams.f2566f;
            this.f2569g = layoutParams.f2569g;
            this.f2528C = layoutParams.f2528C;
            this.f2529D = layoutParams.f2529D;
            this.f2562d = layoutParams.f2562d;
            this.f2565e = layoutParams.f2565e;
            this.f2530E = layoutParams.f2530E;
            this.f2531F = layoutParams.f2531F;
            this.f2532G = layoutParams.f2532G;
            this.f2534I = layoutParams.f2534I;
            this.f2533H = layoutParams.f2533H;
            this.f2535J = layoutParams.f2535J;
            this.f2572h = layoutParams.f2572h;
            this.f2575i = layoutParams.f2575i;
            this.f2536K = layoutParams.f2536K;
            this.f2537L = layoutParams.f2537L;
            this.f2538M = layoutParams.f2538M;
            this.f2568f = layoutParams.f2568f;
            this.f2571g = layoutParams.f2571g;
            this.f2574h = layoutParams.f2574h;
            this.f2577i = layoutParams.f2577i;
            this.f2540O = layoutParams.f2540O;
            this.f2541P = layoutParams.f2541P;
            this.f2542Q = layoutParams.f2542Q;
            this.f2543R = layoutParams.f2543R;
            this.f2544S = layoutParams.f2544S;
            this.f2545T = layoutParams.f2545T;
            this.f2578j = layoutParams.f2578j;
            this.f2555b = layoutParams.f2555b;
            this.f2539N = layoutParams.f2539N;
            this.f2550a = layoutParams.f2550a;
            this.f2556b = layoutParams.f2556b;
            this.f2559c = layoutParams.f2559c;
        }

        /* renamed from: a */
        public String mo3253a() {
            return this.f2555b;
        }

        /* renamed from: b */
        public o60 mo3254b() {
            return this.f2550a;
        }

        /* renamed from: c */
        public void mo3255c() {
            o60 o60 = this.f2550a;
            if (o60 != null) {
                o60.mo14929R0();
            }
        }

        /* renamed from: d */
        public void mo3256d(String str) {
            this.f2550a.mo21715j1(str);
        }

        /* renamed from: e */
        public void mo3257e() {
            this.f2577i = false;
            this.f2568f = true;
            this.f2571g = true;
            int i = this.width;
            if (i == -2 && this.f2562d) {
                this.f2568f = false;
                if (this.f2530E == 0) {
                    this.f2530E = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f2565e) {
                this.f2571g = false;
                if (this.f2531F == 0) {
                    this.f2531F = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2568f = false;
                if (i == 0 && this.f2530E == 1) {
                    this.width = -2;
                    this.f2562d = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2571g = false;
                if (i2 == 0 && this.f2531F == 1) {
                    this.height = -2;
                    this.f2565e = true;
                }
            }
            if (this.f2548a != -1.0f || this.f2549a != -1 || this.f2554b != -1) {
                this.f2577i = true;
                this.f2568f = true;
                this.f2571g = true;
                if (!(this.f2550a instanceof nj1)) {
                    this.f2550a = new nj1();
                }
                ((nj1) this.f2550a).mo21317B2(this.f2538M);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = 1
                goto L_0x0012
            L_0x0011:
                r11 = 0
            L_0x0012:
                r4 = -1
                r10.f2542Q = r4
                r10.f2543R = r4
                r10.f2540O = r4
                r10.f2541P = r4
                int r5 = r10.f2594t
                r10.f2544S = r5
                int r5 = r10.f2596v
                r10.f2545T = r5
                float r5 = r10.f2557c
                r10.f2578j = r5
                int r6 = r10.f2549a
                r10.f2546U = r6
                int r7 = r10.f2554b
                r10.f2547V = r7
                float r8 = r10.f2548a
                r10.f2581k = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0092
                int r11 = r10.f2590p
                if (r11 == r4) goto L_0x003f
                r10.f2542Q = r11
            L_0x003d:
                r2 = 1
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f2591q
                if (r11 == r4) goto L_0x0046
                r10.f2543R = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f2592r
                if (r11 == r4) goto L_0x004d
                r10.f2541P = r11
                r2 = 1
            L_0x004d:
                int r11 = r10.f2593s
                if (r11 == r4) goto L_0x0054
                r10.f2540O = r11
                r2 = 1
            L_0x0054:
                int r11 = r10.f2598x
                if (r11 == r9) goto L_0x005a
                r10.f2545T = r11
            L_0x005a:
                int r11 = r10.f2599y
                if (r11 == r9) goto L_0x0060
                r10.f2544S = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f2578j = r2
            L_0x0068:
                boolean r2 = r10.f2577i
                if (r2 == 0) goto L_0x00b6
                int r2 = r10.f2538M
                if (r2 != r3) goto L_0x00b6
                boolean r2 = r10.f2552a
                if (r2 == 0) goto L_0x00b6
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f2581k = r11
                r10.f2546U = r4
                r10.f2547V = r4
                goto L_0x00b6
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f2547V = r6
                r10.f2546U = r4
            L_0x0088:
                r10.f2581k = r2
                goto L_0x00b6
            L_0x008b:
                if (r7 == r4) goto L_0x00b6
                r10.f2546U = r7
                r10.f2547V = r4
                goto L_0x0088
            L_0x0092:
                int r11 = r10.f2590p
                if (r11 == r4) goto L_0x0098
                r10.f2541P = r11
            L_0x0098:
                int r11 = r10.f2591q
                if (r11 == r4) goto L_0x009e
                r10.f2540O = r11
            L_0x009e:
                int r11 = r10.f2592r
                if (r11 == r4) goto L_0x00a4
                r10.f2542Q = r11
            L_0x00a4:
                int r11 = r10.f2593s
                if (r11 == r4) goto L_0x00aa
                r10.f2543R = r11
            L_0x00aa:
                int r11 = r10.f2598x
                if (r11 == r9) goto L_0x00b0
                r10.f2544S = r11
            L_0x00b0:
                int r11 = r10.f2599y
                if (r11 == r9) goto L_0x00b6
                r10.f2545T = r11
            L_0x00b6:
                int r11 = r10.f2592r
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f2593s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f2591q
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f2590p
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f2564e
                if (r11 == r4) goto L_0x00d5
                r10.f2542Q = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
            L_0x00d2:
                r10.rightMargin = r1
                goto L_0x00e2
            L_0x00d5:
                int r11 = r10.f2567f
                if (r11 == r4) goto L_0x00e2
                r10.f2543R = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r11 = r10.f2558c
                if (r11 == r4) goto L_0x00f1
                r10.f2540O = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
            L_0x00ee:
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f1:
                int r11 = r10.f2561d
                if (r11 == r4) goto L_0x00fe
                r10.f2541P = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                goto L_0x00ee
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C0417a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2662a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onedelhi.secure.o60$b[] r0 = com.onedelhi.secure.o60.C3032b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2662a = r0
                com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2662a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2662a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2662a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0417a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0418b implements C1788bk.C1790b {

        /* renamed from: a */
        public int f2663a;

        /* renamed from: a */
        public ConstraintLayout f2664a;

        /* renamed from: b */
        public int f2665b;

        /* renamed from: c */
        public int f2667c;

        /* renamed from: d */
        public int f2668d;

        /* renamed from: e */
        public int f2669e;

        /* renamed from: f */
        public int f2670f;

        public C0418b(ConstraintLayout constraintLayout) {
            this.f2664a = constraintLayout;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3259a(com.onedelhi.secure.o60 r18, com.onedelhi.secure.C1788bk.C1789a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.mo21720l0()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r18.mo21617C0()
                if (r3 != 0) goto L_0x001f
                r2.f9870c = r5
                r2.f9871d = r5
                r2.f9872e = r5
                return
            L_0x001f:
                com.onedelhi.secure.o60 r3 = r18.mo21666U()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                com.onedelhi.secure.o60$b r3 = r2.f9865a
                com.onedelhi.secure.o60$b r4 = r2.f9868b
                int r6 = r2.f9864a
                int r7 = r2.f9867b
                int r8 = r0.f2663a
                int r9 = r0.f2665b
                int r8 = r8 + r9
                int r9 = r0.f2667c
                java.lang.Object r10 = r18.mo21750w()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0417a.f2662a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto L_0x00a8
                if (r12 == r15) goto L_0x00a0
                if (r12 == r14) goto L_0x0097
                if (r12 == r13) goto L_0x0051
                r6 = 0
                goto L_0x00ae
            L_0x0051:
                int r6 = r0.f2669e
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f17788f
                if (r9 != r5) goto L_0x005e
                r9 = 1
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                int r12 = r2.f9873f
                int r13 = com.onedelhi.secure.C1788bk.C1789a.f9862h
                if (r12 == r13) goto L_0x0069
                int r13 = com.onedelhi.secure.C1788bk.C1789a.f9863i
                if (r12 != r13) goto L_0x00ae
            L_0x0069:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.mo21619D()
                if (r12 != r13) goto L_0x0075
                r12 = 1
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                int r13 = r2.f9873f
                int r14 = com.onedelhi.secure.C1788bk.C1789a.f9863i
                if (r13 == r14) goto L_0x008f
                if (r9 == 0) goto L_0x008f
                if (r9 == 0) goto L_0x0082
                if (r12 != 0) goto L_0x008f
            L_0x0082:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x008f
                boolean r9 = r18.mo15197G0()
                if (r9 == 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r9 = 0
                goto L_0x0090
            L_0x008f:
                r9 = 1
            L_0x0090:
                if (r9 == 0) goto L_0x00ae
                int r6 = r18.mo21723m0()
                goto L_0x00a8
            L_0x0097:
                int r6 = r0.f2669e
                int r12 = r18.mo21632I()
                int r9 = r9 + r12
                r12 = -1
                goto L_0x00a3
            L_0x00a0:
                int r6 = r0.f2669e
                r12 = -2
            L_0x00a3:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00ae
            L_0x00a8:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00ae:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0117
                if (r9 == r15) goto L_0x010f
                r7 = 3
                if (r9 == r7) goto L_0x0106
                r7 = 4
                if (r9 == r7) goto L_0x00c0
                r7 = 0
                goto L_0x011d
            L_0x00c0:
                int r7 = r0.f2670f
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f17792g
                if (r8 != r5) goto L_0x00cd
                r8 = 1
                goto L_0x00ce
            L_0x00cd:
                r8 = 0
            L_0x00ce:
                int r9 = r2.f9873f
                int r11 = com.onedelhi.secure.C1788bk.C1789a.f9862h
                if (r9 == r11) goto L_0x00d8
                int r11 = com.onedelhi.secure.C1788bk.C1789a.f9863i
                if (r9 != r11) goto L_0x011d
            L_0x00d8:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo21723m0()
                if (r9 != r11) goto L_0x00e4
                r9 = 1
                goto L_0x00e5
            L_0x00e4:
                r9 = 0
            L_0x00e5:
                int r11 = r2.f9873f
                int r12 = com.onedelhi.secure.C1788bk.C1789a.f9863i
                if (r11 == r12) goto L_0x00fe
                if (r8 == 0) goto L_0x00fe
                if (r8 == 0) goto L_0x00f1
                if (r9 != 0) goto L_0x00fe
            L_0x00f1:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x00fe
                boolean r8 = r18.mo15198H0()
                if (r8 == 0) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r8 = 0
                goto L_0x00ff
            L_0x00fe:
                r8 = 1
            L_0x00ff:
                if (r8 == 0) goto L_0x011d
                int r7 = r18.mo21619D()
                goto L_0x0117
            L_0x0106:
                int r7 = r0.f2670f
                int r9 = r18.mo21717k0()
                int r8 = r8 + r9
                r9 = -1
                goto L_0x0112
            L_0x010f:
                int r7 = r0.f2670f
                r9 = -2
            L_0x0112:
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x011d
            L_0x0117:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x011d:
                com.onedelhi.secure.o60 r8 = r18.mo21666U()
                com.onedelhi.secure.p60 r8 = (com.onedelhi.secure.p60) r8
                if (r8 == 0) goto L_0x019f
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.f2493r
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = com.onedelhi.secure.mw2.m22047b(r9, r11)
                if (r9 == 0) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo21723m0()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.mo21723m0()
                if (r9 >= r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.mo21619D()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.mo21619D()
                if (r9 >= r8) goto L_0x019f
                int r8 = r10.getBaseline()
                int r9 = r18.mo21741t()
                if (r8 != r9) goto L_0x019f
                boolean r8 = r18.mo21626F0()
                if (r8 != 0) goto L_0x019f
                int r8 = r18.mo21635J()
                int r9 = r18.mo21723m0()
                boolean r8 = r0.mo3262d(r8, r6, r9)
                if (r8 == 0) goto L_0x0189
                int r8 = r18.mo21638K()
                int r9 = r18.mo21619D()
                boolean r8 = r0.mo3262d(r8, r7, r9)
                if (r8 == 0) goto L_0x0189
                r8 = 1
                goto L_0x018a
            L_0x0189:
                r8 = 0
            L_0x018a:
                if (r8 == 0) goto L_0x019f
                int r3 = r18.mo21723m0()
                r2.f9870c = r3
                int r3 = r18.mo21619D()
                r2.f9871d = r3
                int r1 = r18.mo21741t()
                r2.f9872e = r1
                return
            L_0x019f:
                com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01a5
                r9 = 1
                goto L_0x01a6
            L_0x01a5:
                r9 = 0
            L_0x01a6:
                if (r4 != r8) goto L_0x01aa
                r8 = 1
                goto L_0x01ab
            L_0x01aa:
                r8 = 0
            L_0x01ab:
                com.onedelhi.secure.o60$b r11 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
                if (r4 == r11) goto L_0x01b6
                com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.FIXED
                if (r4 != r12) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r4 = 0
                goto L_0x01b7
            L_0x01b6:
                r4 = 1
            L_0x01b7:
                if (r3 == r11) goto L_0x01c0
                com.onedelhi.secure.o60$b r11 = com.onedelhi.secure.o60.C3032b.FIXED
                if (r3 != r11) goto L_0x01be
                goto L_0x01c0
            L_0x01be:
                r3 = 0
                goto L_0x01c1
            L_0x01c0:
                r3 = 1
            L_0x01c1:
                r11 = 0
                if (r9 == 0) goto L_0x01cc
                float r12 = r1.f17783e
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x01cc
                r12 = 1
                goto L_0x01cd
            L_0x01cc:
                r12 = 0
            L_0x01cd:
                if (r8 == 0) goto L_0x01d7
                float r13 = r1.f17783e
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x01d7
                r11 = 1
                goto L_0x01d8
            L_0x01d7:
                r11 = 0
            L_0x01d8:
                if (r10 != 0) goto L_0x01db
                return
            L_0x01db:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
                int r14 = r2.f9873f
                int r15 = com.onedelhi.secure.C1788bk.C1789a.f9862h
                if (r14 == r15) goto L_0x01fe
                int r15 = com.onedelhi.secure.C1788bk.C1789a.f9863i
                if (r14 == r15) goto L_0x01fe
                if (r9 == 0) goto L_0x01fe
                int r9 = r1.f17788f
                if (r9 != 0) goto L_0x01fe
                if (r8 == 0) goto L_0x01fe
                int r8 = r1.f17792g
                if (r8 == 0) goto L_0x01f8
                goto L_0x01fe
            L_0x01f8:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L_0x029a
            L_0x01fe:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r8 == 0) goto L_0x0210
                boolean r8 = r1 instanceof com.onedelhi.secure.dw4
                if (r8 == 0) goto L_0x0210
                r8 = r1
                com.onedelhi.secure.dw4 r8 = (com.onedelhi.secure.dw4) r8
                r9 = r10
                androidx.constraintlayout.widget.VirtualLayout r9 = (androidx.constraintlayout.widget.VirtualLayout) r9
                r9.mo2675J(r8, r6, r7)
                goto L_0x0213
            L_0x0210:
                r10.measure(r6, r7)
            L_0x0213:
                r1.mo21637J1(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.f17795h
                if (r15 <= 0) goto L_0x022b
                int r15 = java.lang.Math.max(r15, r8)
                goto L_0x022c
            L_0x022b:
                r15 = r8
            L_0x022c:
                int r5 = r1.f17798i
                if (r5 <= 0) goto L_0x0234
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0234:
                int r5 = r1.f17800j
                if (r5 <= 0) goto L_0x023f
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0242
            L_0x023f:
                r16 = r6
                r5 = r9
            L_0x0242:
                int r6 = r1.f17802k
                if (r6 <= 0) goto L_0x024a
                int r5 = java.lang.Math.min(r6, r5)
            L_0x024a:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.f2493r
                r0 = 1
                boolean r6 = com.onedelhi.secure.mw2.m22047b(r6, r0)
                if (r6 != 0) goto L_0x026f
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L_0x0265
                if (r4 == 0) goto L_0x0265
                float r3 = r1.f17783e
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L_0x026f
            L_0x0265:
                if (r11 == 0) goto L_0x026f
                if (r3 == 0) goto L_0x026f
                float r3 = r1.f17783e
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L_0x026f:
                if (r8 != r15) goto L_0x0276
                if (r9 == r5) goto L_0x0274
                goto L_0x0276
            L_0x0274:
                r0 = -1
                goto L_0x029a
            L_0x0276:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L_0x027f
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x0281
            L_0x027f:
                r6 = r16
            L_0x0281:
                if (r9 == r5) goto L_0x0287
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x0287:
                r10.measure(r6, r7)
                r1.mo21637J1(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L_0x0274
            L_0x029a:
                if (r14 == r0) goto L_0x029e
                r0 = 1
                goto L_0x029f
            L_0x029e:
                r0 = 0
            L_0x029f:
                int r3 = r2.f9864a
                if (r15 != r3) goto L_0x02aa
                int r3 = r2.f9867b
                if (r5 == r3) goto L_0x02a8
                goto L_0x02aa
            L_0x02a8:
                r3 = 0
                goto L_0x02ab
            L_0x02aa:
                r3 = 1
            L_0x02ab:
                r2.f9869b = r3
                boolean r3 = r13.f2574h
                if (r3 == 0) goto L_0x02b2
                r0 = 1
            L_0x02b2:
                if (r0 == 0) goto L_0x02c0
                r3 = -1
                if (r14 == r3) goto L_0x02c0
                int r1 = r18.mo21741t()
                if (r1 == r14) goto L_0x02c0
                r1 = 1
                r2.f9869b = r1
            L_0x02c0:
                r2.f9870c = r15
                r2.f9871d = r5
                r2.f9866a = r0
                r2.f9872e = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0418b.mo3259a(com.onedelhi.secure.o60, com.onedelhi.secure.bk$a):void");
        }

        /* renamed from: b */
        public final void mo3260b() {
            int childCount = this.f2664a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2664a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo3281b(this.f2664a);
                }
            }
            int size = this.f2664a.f2485a.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f2664a.f2485a.get(i2)).mo3194E(this.f2664a);
                }
            }
        }

        /* renamed from: c */
        public void mo3261c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2663a = i3;
            this.f2665b = i4;
            this.f2667c = i5;
            this.f2668d = i6;
            this.f2669e = i;
            this.f2670f = i2;
        }

        /* renamed from: d */
        public final boolean mo3262d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@mr2 Context context) {
        super(context);
        mo3250v((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3250v(attributeSet, 0, 0);
    }

    public ConstraintLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3250v(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3250v(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static C0449f getSharedValues() {
        if (f2469a == null) {
            f2469a = new C0449f();
        }
        return f2469a;
    }

    /* renamed from: A */
    public void mo3215A(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0418b bVar = this.f2479a;
        int i5 = bVar.f2668d;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + bVar.f2667c, i, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0);
        int i6 = resolveSizeAndState & jt4.f14542r;
        int i7 = resolveSizeAndState2 & jt4.f14542r;
        int min = Math.min(this.f2491p, i6);
        int min2 = Math.min(this.f2492q, i7);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f2495t = min;
        this.f2496u = min2;
    }

    /* renamed from: B */
    public void mo3216B(p60 p60, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2479a.mo3261c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? mo3251w() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        mo3218D(p60, mode, i5, mode2, i6);
        p60.mo22334Q2(i, mode, i5, mode2, i6, this.f2495t, this.f2496u, max5, max);
    }

    /* renamed from: C */
    public final void mo3217C() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            o60 u = mo3249u(getChildAt(i));
            if (u != null) {
                u.mo14929R0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo3237s(childAt.getId()).mo21715j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2494s != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f2494s && (childAt2 instanceof Constraints)) {
                    this.f2481a = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0426d dVar = this.f2481a;
        if (dVar != null) {
            dVar.mo3479t(this, true);
        }
        this.f2482a.mo14937p2();
        int size = this.f2485a.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f2485a.get(i4).mo3195G(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo3282c(this);
            }
        }
        this.f2487b.clear();
        this.f2487b.put(0, this.f2482a);
        this.f2487b.put(getId(), this.f2482a);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f2487b.put(childAt4.getId(), mo3249u(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            o60 u2 = mo3249u(childAt5);
            if (u2 != null) {
                this.f2482a.mo14931b(u2);
                mo3232i(isInEditMode, childAt5, u2, (LayoutParams) childAt5.getLayoutParams(), this.f2487b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3218D(com.onedelhi.secure.p60 r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = r7.f2479a
            int r1 = r0.f2668d
            int r0 = r0.f2667c
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = 0
            goto L_0x0032
        L_0x001a:
            int r9 = r7.f2491p
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            com.onedelhi.secure.o60$b r9 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            com.onedelhi.secure.o60$b r9 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.f2489n
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x0051
        L_0x003a:
            int r11 = r7.f2492q
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.f2490o
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.mo21723m0()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.mo21619D()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.mo22330M2()
        L_0x0060:
            r8.mo21702f2(r6)
            r8.mo21705g2(r6)
            int r11 = r7.f2491p
            int r11 = r11 - r0
            r8.mo21646M1(r11)
            int r11 = r7.f2492q
            int r11 = r11 - r1
            r8.mo21643L1(r11)
            r8.mo21655P1(r6)
            r8.mo21652O1(r6)
            r8.mo21621D1(r9)
            r8.mo21691c2(r10)
            r8.mo21679Y1(r2)
            r8.mo21758y1(r12)
            int r9 = r7.f2489n
            int r9 = r9 - r0
            r8.mo21655P1(r9)
            int r9 = r7.f2490o
            int r9 = r9 - r1
            r8.mo21652O1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo3218D(com.onedelhi.secure.p60, int, int, int, int):void");
    }

    /* renamed from: E */
    public final void mo3219E(o60 o60, LayoutParams layoutParams, SparseArray<o60> sparseArray, int i, m60.C2835b bVar) {
        View view = this.f2478a.get(i);
        o60 o602 = sparseArray.get(i);
        if (o602 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f2574h = true;
            m60.C2835b bVar2 = m60.C2835b.BASELINE;
            if (bVar == bVar2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f2574h = true;
                layoutParams2.f2550a.mo21755x1(true);
            }
            o60.mo21327r(bVar2).mo20107b(o602.mo21327r(bVar), layoutParams.f2526A, layoutParams.f2600z, true);
            o60.mo21755x1(true);
            o60.mo21327r(m60.C2835b.TOP).mo20130x();
            o60.mo21327r(m60.C2835b.BOTTOM).mo20130x();
        }
    }

    /* renamed from: F */
    public final boolean mo3220F() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo3217C();
        }
        return z;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2485a;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2485a.get(i).mo2703F(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(vf4.f36537c);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(g74.f12468c);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        mo3252y();
        super.forceLayout();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f2492q;
    }

    public int getMaxWidth() {
        return this.f2491p;
    }

    public int getMinHeight() {
        return this.f2490o;
    }

    public int getMinWidth() {
        return this.f2489n;
    }

    public int getOptimizationLevel() {
        return this.f2482a.mo22325H2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f2482a.f17753a == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f2482a.f17753a = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f2482a.f17753a = C0426d.f2835g;
            }
        }
        if (this.f2482a.mo21756y() == null) {
            p60 p60 = this.f2482a;
            p60.mo21715j1(p60.f17753a);
            Log.v(f2471c, " setDebugName " + this.f2482a.mo21756y());
        }
        Iterator<o60> it = this.f2482a.mo14933l2().iterator();
        while (it.hasNext()) {
            o60 next = it.next();
            View view = (View) next.mo21750w();
            if (view != null) {
                if (next.f17753a == null && (id = view.getId()) != -1) {
                    next.f17753a = getContext().getResources().getResourceEntryName(id);
                }
                if (next.mo21756y() == null) {
                    next.mo21715j1(next.f17753a);
                    Log.v(f2471c, " setDebugName " + next.mo21756y());
                }
            }
        }
        this.f2482a.mo21686b0(sb);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0166  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3232i(boolean r17, android.view.View r18, com.onedelhi.secure.o60 r19, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r20, android.util.SparseArray<com.onedelhi.secure.o60> r21) {
        /*
            r16 = this;
            r0 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r20.mo3257e()
            r9 = 0
            r7.f2587m = r9
            int r1 = r18.getVisibility()
            r6.mo21688b2(r1)
            boolean r1 = r7.f2583k
            if (r1 == 0) goto L_0x0022
            r1 = 1
            r6.mo21631H1(r1)
            r1 = 8
            r6.mo21688b2(r1)
        L_0x0022:
            r6.mo21707h1(r0)
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L_0x0037
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r10 = r16
            com.onedelhi.secure.p60 r1 = r10.f2482a
            boolean r1 = r1.mo22332O2()
            r0.mo2674B(r6, r1)
            goto L_0x0039
        L_0x0037:
            r10 = r16
        L_0x0039:
            boolean r0 = r7.f2577i
            r11 = -1
            if (r0 == 0) goto L_0x0060
            r0 = r6
            com.onedelhi.secure.nj1 r0 = (com.onedelhi.secure.nj1) r0
            int r1 = r7.f2546U
            int r2 = r7.f2547V
            float r3 = r7.f2581k
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            r0.mo21335y2(r3)
            goto L_0x0237
        L_0x0052:
            if (r1 == r11) goto L_0x0059
            r0.mo21333w2(r1)
            goto L_0x0237
        L_0x0059:
            if (r2 == r11) goto L_0x0237
            r0.mo21334x2(r2)
            goto L_0x0237
        L_0x0060:
            int r0 = r7.f2540O
            int r1 = r7.f2541P
            int r12 = r7.f2542Q
            int r13 = r7.f2543R
            int r5 = r7.f2544S
            int r14 = r7.f2545T
            float r15 = r7.f2578j
            int r2 = r7.f2588n
            if (r2 == r11) goto L_0x0083
            java.lang.Object r0 = r8.get(r2)
            com.onedelhi.secure.o60 r0 = (com.onedelhi.secure.o60) r0
            if (r0 == 0) goto L_0x0169
            float r1 = r7.f2553b
            int r2 = r7.f2589o
            r6.mo21722m(r0, r1, r2)
            goto L_0x0169
        L_0x0083:
            if (r0 == r11) goto L_0x0096
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x00ac
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.LEFT
            int r4 = r7.leftMargin
            r0 = r19
            r1 = r3
            goto L_0x00a9
        L_0x0096:
            if (r1 == r11) goto L_0x00ac
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x00ac
            com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.LEFT
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.RIGHT
            int r4 = r7.leftMargin
            r0 = r19
        L_0x00a9:
            r0.mo21748v0(r1, r2, r3, r4, r5)
        L_0x00ac:
            if (r12 == r11) goto L_0x00c0
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x00d6
            com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.RIGHT
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.LEFT
            int r4 = r7.rightMargin
            r0 = r19
            goto L_0x00d2
        L_0x00c0:
            if (r13 == r11) goto L_0x00d6
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x00d6
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.RIGHT
            int r4 = r7.rightMargin
            r0 = r19
            r1 = r3
        L_0x00d2:
            r5 = r14
            r0.mo21748v0(r1, r2, r3, r4, r5)
        L_0x00d6:
            int r0 = r7.f2570g
            if (r0 == r11) goto L_0x00ed
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x0107
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.TOP
            int r4 = r7.topMargin
            int r5 = r7.f2595u
            r0 = r19
            r1 = r3
            goto L_0x0104
        L_0x00ed:
            int r0 = r7.f2573h
            if (r0 == r11) goto L_0x0107
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x0107
            com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.TOP
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.f2595u
            r0 = r19
        L_0x0104:
            r0.mo21748v0(r1, r2, r3, r4, r5)
        L_0x0107:
            int r0 = r7.f2576i
            if (r0 == r11) goto L_0x011f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x0138
            com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BOTTOM
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.f2597w
            r0 = r19
            goto L_0x0135
        L_0x011f:
            int r0 = r7.f2579j
            if (r0 == r11) goto L_0x0138
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            if (r2 == 0) goto L_0x0138
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.f2597w
            r0 = r19
            r1 = r3
        L_0x0135:
            r0.mo21748v0(r1, r2, r3, r4, r5)
        L_0x0138:
            int r4 = r7.f2582k
            if (r4 == r11) goto L_0x014a
            com.onedelhi.secure.m60$b r5 = com.onedelhi.secure.m60.C2835b.BASELINE
        L_0x013e:
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.mo3219E(r1, r2, r3, r4, r5)
            goto L_0x0158
        L_0x014a:
            int r4 = r7.f2584l
            if (r4 == r11) goto L_0x0151
            com.onedelhi.secure.m60$b r5 = com.onedelhi.secure.m60.C2835b.TOP
            goto L_0x013e
        L_0x0151:
            int r4 = r7.f2586m
            if (r4 == r11) goto L_0x0158
            com.onedelhi.secure.m60$b r5 = com.onedelhi.secure.m60.C2835b.BOTTOM
            goto L_0x013e
        L_0x0158:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0160
            r6.mo21612A1(r15)
        L_0x0160:
            float r1 = r7.f2560d
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0169
            r6.mo21671V1(r1)
        L_0x0169:
            if (r17 == 0) goto L_0x0178
            int r0 = r7.f2536K
            if (r0 != r11) goto L_0x0173
            int r1 = r7.f2537L
            if (r1 == r11) goto L_0x0178
        L_0x0173:
            int r1 = r7.f2537L
            r6.mo21659R1(r0, r1)
        L_0x0178:
            boolean r0 = r7.f2568f
            r1 = -2
            if (r0 != 0) goto L_0x01ab
            int r0 = r7.width
            if (r0 != r11) goto L_0x01a2
            boolean r0 = r7.f2562d
            if (r0 == 0) goto L_0x0188
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            goto L_0x018a
        L_0x0188:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
        L_0x018a:
            r6.mo21621D1(r0)
            com.onedelhi.secure.m60$b r0 = com.onedelhi.secure.m60.C2835b.LEFT
            com.onedelhi.secure.m60 r0 = r6.mo21327r(r0)
            int r2 = r7.leftMargin
            r0.f15920b = r2
            com.onedelhi.secure.m60$b r0 = com.onedelhi.secure.m60.C2835b.RIGHT
            com.onedelhi.secure.m60 r0 = r6.mo21327r(r0)
            int r2 = r7.rightMargin
            r0.f15920b = r2
            goto L_0x01be
        L_0x01a2:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            r6.mo21621D1(r0)
            r6.mo21691c2(r9)
            goto L_0x01be
        L_0x01ab:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.FIXED
            r6.mo21621D1(r0)
            int r0 = r7.width
            r6.mo21691c2(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x01be
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            r6.mo21621D1(r0)
        L_0x01be:
            boolean r0 = r7.f2571g
            if (r0 != 0) goto L_0x01f0
            int r0 = r7.height
            if (r0 != r11) goto L_0x01e7
            boolean r0 = r7.f2565e
            if (r0 == 0) goto L_0x01cd
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            goto L_0x01cf
        L_0x01cd:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
        L_0x01cf:
            r6.mo21679Y1(r0)
            com.onedelhi.secure.m60$b r0 = com.onedelhi.secure.m60.C2835b.TOP
            com.onedelhi.secure.m60 r0 = r6.mo21327r(r0)
            int r1 = r7.topMargin
            r0.f15920b = r1
            com.onedelhi.secure.m60$b r0 = com.onedelhi.secure.m60.C2835b.BOTTOM
            com.onedelhi.secure.m60 r0 = r6.mo21327r(r0)
            int r1 = r7.bottomMargin
            r0.f15920b = r1
            goto L_0x0203
        L_0x01e7:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            r6.mo21679Y1(r0)
            r6.mo21758y1(r9)
            goto L_0x0203
        L_0x01f0:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.FIXED
            r6.mo21679Y1(r0)
            int r0 = r7.height
            r6.mo21758y1(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x0203
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            r6.mo21679Y1(r0)
        L_0x0203:
            java.lang.String r0 = r7.f2551a
            r6.mo21726n1(r0)
            float r0 = r7.f2566f
            r6.mo21627F1(r0)
            float r0 = r7.f2569g
            r6.mo21685a2(r0)
            int r0 = r7.f2528C
            r6.mo21615B1(r0)
            int r0 = r7.f2529D
            r6.mo21673W1(r0)
            int r0 = r7.f2539N
            r6.mo21699e2(r0)
            int r0 = r7.f2530E
            int r1 = r7.f2532G
            int r2 = r7.f2534I
            float r3 = r7.f2572h
            r6.mo21624E1(r0, r1, r2, r3)
            int r0 = r7.f2531F
            int r1 = r7.f2533H
            int r2 = r7.f2535J
            float r3 = r7.f2575i
            r6.mo21682Z1(r0, r1, r2, r3)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo3232i(boolean, android.view.View, com.onedelhi.secure.o60, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* renamed from: j */
    public void mo3233j(zi2 zi2) {
        this.f2484a = zi2;
        this.f2482a.mo22322E2(zi2);
    }

    /* renamed from: m */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: o */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            o60 o60 = layoutParams.f2550a;
            if ((childAt.getVisibility() != 8 || layoutParams.f2577i || layoutParams.f2580j || layoutParams.f2585l || isInEditMode) && !layoutParams.f2583k) {
                int o0 = o60.mo21728o0();
                int p0 = o60.mo21731p0();
                int m0 = o60.mo21723m0() + o0;
                int D = o60.mo21619D() + p0;
                childAt.layout(o0, p0, m0, D);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o0, p0, m0, D);
                }
            }
        }
        int size = this.f2485a.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2485a.get(i6).mo2702D(this);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f2501z == i) {
            int i3 = this.f2477A;
        }
        if (!this.f2488b) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.f2488b = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.f2488b;
        this.f2501z = i;
        this.f2477A = i2;
        this.f2482a.mo22341Y2(mo3251w());
        if (this.f2488b) {
            this.f2488b = false;
            if (mo3220F()) {
                this.f2482a.mo22343a3();
            }
        }
        mo3216B(this.f2482a, this.f2493r, i, i2);
        mo3215A(i, i2, this.f2482a.mo21723m0(), this.f2482a.mo21619D(), this.f2482a.mo22333P2(), this.f2482a.mo22331N2());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o60 u = mo3249u(view);
        if ((view instanceof Guideline) && !(u instanceof nj1)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            nj1 nj1 = new nj1();
            layoutParams.f2550a = nj1;
            layoutParams.f2577i = true;
            nj1.mo21317B2(layoutParams.f2538M);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo3196I();
            ((LayoutParams) view.getLayoutParams()).f2580j = true;
            if (!this.f2485a.contains(constraintHelper)) {
                this.f2485a.add(constraintHelper);
            }
        }
        this.f2478a.put(view.getId(), view);
        this.f2488b = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2478a.remove(view.getId());
        this.f2482a.mo14936o2(mo3249u(view));
        this.f2485a.remove(view);
        this.f2488b = true;
    }

    /* renamed from: q */
    public Object mo3236q(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2486a;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2486a.get(str);
    }

    public void requestLayout() {
        mo3252y();
        super.requestLayout();
    }

    /* renamed from: s */
    public final o60 mo3237s(int i) {
        if (i == 0) {
            return this.f2482a;
        }
        View view = this.f2478a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2482a;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2550a;
    }

    public void setConstraintSet(C0426d dVar) {
        this.f2481a = dVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2486a == null) {
                this.f2486a = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2486a.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.f2478a.remove(getId());
        super.setId(i);
        this.f2478a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2492q) {
            this.f2492q = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2491p) {
            this.f2491p = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2490o) {
            this.f2490o = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2489n) {
            this.f2489n = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(q60 q60) {
        this.f2483a = q60;
        C0422b bVar = this.f2480a;
        if (bVar != null) {
            bVar.mo3327d(q60);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2493r = i;
        this.f2482a.mo22338V2(i);
    }

    public void setState(int i, int i2, int i3) {
        C0422b bVar = this.f2480a;
        if (bVar != null) {
            bVar.mo3328e(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public View mo3248t(int i) {
        return this.f2478a.get(i);
    }

    /* renamed from: u */
    public final o60 mo3249u(View view) {
        if (view == this) {
            return this.f2482a;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof LayoutParams)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof LayoutParams)) {
                return null;
            }
        }
        return ((LayoutParams) view.getLayoutParams()).f2550a;
    }

    /* renamed from: v */
    public final void mo3250v(AttributeSet attributeSet, int i, int i2) {
        this.f2482a.mo21707h1(this);
        this.f2482a.mo22337U2(this.f2479a);
        this.f2478a.put(getId(), this);
        this.f2481a = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_android_minWidth) {
                    this.f2489n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2489n);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_minHeight) {
                    this.f2490o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2490o);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2491p = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2491p);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2492q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2492q);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2493r = obtainStyledAttributes.getInt(index, this.f2493r);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2832z(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2480a = null;
                        }
                    }
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0426d dVar = new C0426d();
                        this.f2481a = dVar;
                        dVar.mo3488w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2481a = null;
                    }
                    this.f2494s = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2482a.mo22338V2(this.f2493r);
    }

    /* renamed from: w */
    public boolean mo3251w() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: x */
    public void mo2829x(int i) {
        if (i != 0) {
            try {
                this.f2480a = new C0422b(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.f2480a = null;
    }

    /* renamed from: y */
    public final void mo3252y() {
        this.f2488b = true;
        this.f2495t = -1;
        this.f2496u = -1;
        this.f2497v = -1;
        this.f2498w = -1;
        this.f2499x = 0;
        this.f2500y = 0;
    }

    /* renamed from: z */
    public void mo2832z(int i) {
        this.f2480a = new C0422b(getContext(), this, i);
    }
}
