package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.C0451g;
import com.onedelhi.secure.cl2;
import com.onedelhi.secure.hv2;
import com.onedelhi.secure.ly1;
import com.onedelhi.secure.sy1;
import com.onedelhi.secure.ur0;
import com.onedelhi.secure.ve0;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.b */
public class C0393b {

    /* renamed from: a */
    public static final String f2103a = "MotionScene";

    /* renamed from: b */
    public static final String f2104b = "MotionScene";

    /* renamed from: c */
    public static final int f2105c = 8;

    /* renamed from: c */
    public static final String f2106c = "Transition";

    /* renamed from: d */
    public static final int f2107d = 0;

    /* renamed from: d */
    public static final String f2108d = "OnSwipe";

    /* renamed from: e */
    public static final int f2109e = 1;

    /* renamed from: e */
    public static final String f2110e = "OnClick";

    /* renamed from: f */
    public static final int f2111f = -1;

    /* renamed from: f */
    public static final String f2112f = "StateSet";

    /* renamed from: f */
    public static final boolean f2113f = false;

    /* renamed from: g */
    public static final int f2114g = -2;

    /* renamed from: g */
    public static final String f2115g = "Include";

    /* renamed from: h */
    public static final int f2116h = -1;

    /* renamed from: h */
    public static final String f2117h = "include";

    /* renamed from: i */
    public static final int f2118i = 0;

    /* renamed from: i */
    public static final String f2119i = "KeyFrameSet";

    /* renamed from: j */
    public static final int f2120j = 1;

    /* renamed from: j */
    public static final String f2121j = "ConstraintSet";

    /* renamed from: k */
    public static final int f2122k = 2;

    /* renamed from: k */
    public static final String f2123k = "ViewTransition";

    /* renamed from: l */
    public static final int f2124l = 0;

    /* renamed from: m */
    public static final int f2125m = 1;

    /* renamed from: n */
    public static final int f2126n = 2;

    /* renamed from: o */
    public static final int f2127o = 3;

    /* renamed from: p */
    public static final int f2128p = 4;

    /* renamed from: q */
    public static final int f2129q = 5;

    /* renamed from: r */
    public static final int f2130r = 6;

    /* renamed from: a */
    public float f2131a;

    /* renamed from: a */
    public int f2132a = 400;

    /* renamed from: a */
    public SparseArray<C0426d> f2133a = new SparseArray<>();

    /* renamed from: a */
    public SparseIntArray f2134a = new SparseIntArray();

    /* renamed from: a */
    public MotionEvent f2135a;

    /* renamed from: a */
    public MotionLayout.C0387i f2136a;

    /* renamed from: a */
    public final MotionLayout f2137a;

    /* renamed from: a */
    public C0395b f2138a = null;

    /* renamed from: a */
    public final C0405g f2139a;

    /* renamed from: a */
    public C0451g f2140a = null;

    /* renamed from: a */
    public ArrayList<C0395b> f2141a = new ArrayList<>();

    /* renamed from: a */
    public HashMap<String, Integer> f2142a = new HashMap<>();

    /* renamed from: a */
    public boolean f2143a = false;

    /* renamed from: b */
    public float f2144b;

    /* renamed from: b */
    public int f2145b = 0;

    /* renamed from: b */
    public C0395b f2146b = null;

    /* renamed from: b */
    public ArrayList<C0395b> f2147b = new ArrayList<>();

    /* renamed from: b */
    public boolean f2148b = false;

    /* renamed from: c */
    public boolean f2149c = false;

    /* renamed from: d */
    public boolean f2150d = false;

    /* renamed from: e */
    public boolean f2151e;

    /* renamed from: androidx.constraintlayout.motion.widget.b$a */
    public class C0394a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ur0 f2152a;

        public C0394a(C0393b bVar, ur0 ur0) {
            this.f2152a = ur0;
        }

        public float getInterpolation(float f) {
            return (float) this.f2152a.mo17398a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b */
    public static class C0395b {

        /* renamed from: A */
        public static final int f2153A = 6;

        /* renamed from: k */
        public static final int f2154k = 0;

        /* renamed from: l */
        public static final int f2155l = 1;

        /* renamed from: m */
        public static final int f2156m = 2;

        /* renamed from: n */
        public static final int f2157n = 3;

        /* renamed from: o */
        public static final int f2158o = 4;

        /* renamed from: p */
        public static final int f2159p = 1;

        /* renamed from: q */
        public static final int f2160q = 2;

        /* renamed from: r */
        public static final int f2161r = 4;

        /* renamed from: s */
        public static final int f2162s = -2;

        /* renamed from: t */
        public static final int f2163t = -1;

        /* renamed from: u */
        public static final int f2164u = 0;

        /* renamed from: v */
        public static final int f2165v = 1;

        /* renamed from: w */
        public static final int f2166w = 2;

        /* renamed from: x */
        public static final int f2167x = 3;

        /* renamed from: y */
        public static final int f2168y = 4;

        /* renamed from: z */
        public static final int f2169z = 5;

        /* renamed from: a */
        public float f2170a = 0.0f;

        /* renamed from: a */
        public int f2171a = -1;

        /* renamed from: a */
        public final C0393b f2172a;

        /* renamed from: a */
        public C0397c f2173a = null;

        /* renamed from: a */
        public String f2174a = null;

        /* renamed from: a */
        public ArrayList<sy1> f2175a = new ArrayList<>();

        /* renamed from: a */
        public boolean f2176a = false;

        /* renamed from: b */
        public int f2177b = -1;

        /* renamed from: b */
        public ArrayList<C0396a> f2178b = new ArrayList<>();

        /* renamed from: b */
        public boolean f2179b = false;

        /* renamed from: c */
        public int f2180c = -1;

        /* renamed from: d */
        public int f2181d = 0;

        /* renamed from: e */
        public int f2182e = -1;

        /* renamed from: f */
        public int f2183f = 400;

        /* renamed from: g */
        public int f2184g = 0;

        /* renamed from: h */
        public int f2185h = -1;

        /* renamed from: i */
        public int f2186i = 0;

        /* renamed from: j */
        public int f2187j = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.b$b$a */
        public static class C0396a implements View.OnClickListener {

            /* renamed from: p */
            public static final int f2188p = 1;

            /* renamed from: q */
            public static final int f2189q = 17;

            /* renamed from: r */
            public static final int f2190r = 16;

            /* renamed from: s */
            public static final int f2191s = 256;

            /* renamed from: t */
            public static final int f2192t = 4096;

            /* renamed from: a */
            public final C0395b f2193a;

            /* renamed from: n */
            public int f2194n;

            /* renamed from: o */
            public int f2195o;

            public C0396a(Context context, C0395b bVar, XmlPullParser xmlPullParser) {
                this.f2194n = -1;
                this.f2195o = 17;
                this.f2193a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0435e.C0448m.OnClick_targetId) {
                        this.f2194n = obtainStyledAttributes.getResourceId(index, this.f2194n);
                    } else if (index == C0435e.C0448m.OnClick_clickAction) {
                        this.f2195o = obtainStyledAttributes.getInt(index, this.f2195o);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public C0396a(C0395b bVar, int i, int i2) {
                this.f2193a = bVar;
                this.f2194n = i;
                this.f2195o = i2;
            }

            /* renamed from: a */
            public void mo2981a(MotionLayout motionLayout, int i, C0395b bVar) {
                int i2 = this.f2194n;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f2194n);
                    return;
                }
                int c = bVar.f2180c;
                int a = bVar.f2177b;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i3 = this.f2195o;
                boolean z = false;
                boolean z2 = ((i3 & 1) != 0 && i == c) | ((i3 & 1) != 0 && i == c) | ((i3 & 256) != 0 && i == c) | ((i3 & 16) != 0 && i == a);
                if ((i3 & 4096) != 0 && i == a) {
                    z = true;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public boolean mo2982b(C0395b bVar, MotionLayout motionLayout) {
                C0395b bVar2 = this.f2193a;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.f2177b;
                int c = this.f2193a.f2180c;
                int i = motionLayout.f1971D;
                return c == -1 ? i != a : i == c || i == a;
            }

            /* renamed from: c */
            public void mo2983c(MotionLayout motionLayout) {
                int i = this.f2194n;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.f2194n);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public void onClick(View view) {
                float f;
                MotionLayout d = this.f2193a.f2172a.f2137a;
                if (d.mo2740J0()) {
                    if (this.f2193a.f2180c == -1) {
                        int currentState = d.getCurrentState();
                        if (currentState == -1) {
                            d.mo2759c1(this.f2193a.f2177b);
                            return;
                        }
                        C0395b bVar = new C0395b(this.f2193a.f2172a, this.f2193a);
                        int unused = bVar.f2180c = currentState;
                        int unused2 = bVar.f2177b = this.f2193a.f2177b;
                        d.setTransition(bVar);
                        d.mo2756Z0();
                        return;
                    }
                    C0395b bVar2 = this.f2193a.f2172a.f2138a;
                    int i = this.f2195o;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        C0395b bVar3 = this.f2193a.f2172a.f2138a;
                        C0395b bVar4 = this.f2193a;
                        if (bVar3 != bVar4) {
                            d.setTransition(bVar4);
                        }
                        if (d.getCurrentState() != d.getEndState() && d.getProgress() <= 0.5f) {
                            z = z2;
                            z3 = false;
                        }
                    } else {
                        z = z2;
                    }
                    if (!mo2982b(bVar2, d)) {
                        return;
                    }
                    if (z && (this.f2195o & 1) != 0) {
                        d.setTransition(this.f2193a);
                        d.mo2756Z0();
                    } else if (!z3 || (this.f2195o & 16) == 0) {
                        if (z && (this.f2195o & 256) != 0) {
                            d.setTransition(this.f2193a);
                            f = 1.0f;
                        } else if (z3 && (this.f2195o & 4096) != 0) {
                            d.setTransition(this.f2193a);
                            f = 0.0f;
                        } else {
                            return;
                        }
                        d.setProgress(f);
                    } else {
                        d.setTransition(this.f2193a);
                        d.mo2758b1();
                    }
                }
            }
        }

        public C0395b(int i, C0393b bVar, int i2, int i3) {
            this.f2171a = i;
            this.f2172a = bVar;
            this.f2180c = i2;
            this.f2177b = i3;
            this.f2183f = bVar.f2132a;
            this.f2186i = bVar.f2145b;
        }

        public C0395b(C0393b bVar, Context context, XmlPullParser xmlPullParser) {
            this.f2183f = bVar.f2132a;
            this.f2186i = bVar.f2145b;
            this.f2172a = bVar;
            mo2979y(bVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        public C0395b(C0393b bVar, C0395b bVar2) {
            this.f2172a = bVar;
            this.f2183f = bVar.f2132a;
            if (bVar2 != null) {
                this.f2185h = bVar2.f2185h;
                this.f2181d = bVar2.f2181d;
                this.f2174a = bVar2.f2174a;
                this.f2182e = bVar2.f2182e;
                this.f2183f = bVar2.f2183f;
                this.f2175a = bVar2.f2175a;
                this.f2170a = bVar2.f2170a;
                this.f2186i = bVar2.f2186i;
            }
        }

        /* renamed from: A */
        public int mo2950A() {
            return this.f2183f;
        }

        /* renamed from: B */
        public int mo2951B() {
            return this.f2177b;
        }

        /* renamed from: C */
        public int mo2952C() {
            return this.f2171a;
        }

        /* renamed from: D */
        public List<sy1> mo2953D() {
            return this.f2175a;
        }

        /* renamed from: E */
        public int mo2954E() {
            return this.f2186i;
        }

        /* renamed from: F */
        public List<C0396a> mo2955F() {
            return this.f2178b;
        }

        /* renamed from: G */
        public int mo2956G() {
            return this.f2185h;
        }

        /* renamed from: H */
        public float mo2957H() {
            return this.f2170a;
        }

        /* renamed from: I */
        public int mo2958I() {
            return this.f2180c;
        }

        /* renamed from: J */
        public C0397c mo2959J() {
            return this.f2173a;
        }

        /* renamed from: K */
        public boolean mo2960K() {
            return !this.f2179b;
        }

        /* renamed from: L */
        public boolean mo2961L(int i) {
            return (i & this.f2187j) != 0;
        }

        /* renamed from: M */
        public void mo2962M(int i) {
            C0396a aVar;
            Iterator<C0396a> it = this.f2178b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.f2194n == i) {
                    break;
                }
            }
            if (aVar != null) {
                this.f2178b.remove(aVar);
            }
        }

        /* renamed from: N */
        public void mo2963N(int i) {
            this.f2184g = i;
        }

        /* renamed from: O */
        public void mo2964O(int i) {
            this.f2183f = Math.max(i, 8);
        }

        /* renamed from: P */
        public void mo2965P(boolean z) {
            mo2966Q(z);
        }

        /* renamed from: Q */
        public void mo2966Q(boolean z) {
            this.f2179b = !z;
        }

        /* renamed from: R */
        public void mo2967R(int i, String str, int i2) {
            this.f2181d = i;
            this.f2174a = str;
            this.f2182e = i2;
        }

        /* renamed from: S */
        public void mo2968S(int i) {
            this.f2186i = i;
        }

        /* renamed from: T */
        public void mo2969T(hv2 hv2) {
            this.f2173a = hv2 == null ? null : new C0397c(this.f2172a.f2137a, hv2);
        }

        /* renamed from: U */
        public void mo2970U(int i) {
            C0397c J = mo2959J();
            if (J != null) {
                J.mo2990F(i);
            }
        }

        /* renamed from: V */
        public void mo2971V(int i) {
            this.f2185h = i;
        }

        /* renamed from: W */
        public void mo2972W(float f) {
            this.f2170a = f;
        }

        /* renamed from: X */
        public void mo2973X(int i) {
            this.f2187j = i;
        }

        /* renamed from: t */
        public void mo2974t(sy1 sy1) {
            this.f2175a.add(sy1);
        }

        /* renamed from: u */
        public void mo2975u(int i, int i2) {
            Iterator<C0396a> it = this.f2178b.iterator();
            while (it.hasNext()) {
                C0396a next = it.next();
                if (next.f2194n == i) {
                    next.f2195o = i2;
                    return;
                }
            }
            this.f2178b.add(new C0396a(this, i, i2));
        }

        /* renamed from: v */
        public void mo2976v(Context context, XmlPullParser xmlPullParser) {
            this.f2178b.add(new C0396a(context, this, xmlPullParser));
        }

        /* renamed from: w */
        public String mo2977w(Context context) {
            String resourceEntryName = this.f2180c == -1 ? "null" : context.getResources().getResourceEntryName(this.f2180c);
            if (this.f2177b == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f2177b);
        }

        /* renamed from: x */
        public final void mo2978x(C0393b bVar, Context context, TypedArray typedArray) {
            C0426d dVar;
            SparseArray b;
            int i;
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == C0435e.C0448m.Transition_constraintSetEnd) {
                    this.f2177b = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2177b);
                    if ("layout".equals(resourceTypeName)) {
                        dVar = new C0426d();
                        dVar.mo3488w0(context, this.f2177b);
                        b = bVar.f2133a;
                        i = this.f2177b;
                    } else {
                        if ("xml".equals(resourceTypeName)) {
                            this.f2177b = bVar.mo2909a0(context, this.f2177b);
                        }
                    }
                } else {
                    if (index == C0435e.C0448m.Transition_constraintSetStart) {
                        this.f2180c = typedArray.getResourceId(index, this.f2180c);
                        String resourceTypeName2 = context.getResources().getResourceTypeName(this.f2180c);
                        if ("layout".equals(resourceTypeName2)) {
                            dVar = new C0426d();
                            dVar.mo3488w0(context, this.f2180c);
                            b = bVar.f2133a;
                            i = this.f2180c;
                        } else if ("xml".equals(resourceTypeName2)) {
                            this.f2180c = bVar.mo2909a0(context, this.f2180c);
                        }
                    } else if (index == C0435e.C0448m.Transition_motionInterpolator) {
                        int i3 = typedArray.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = typedArray.getResourceId(index, -1);
                            this.f2182e = resourceId;
                            if (resourceId == -1) {
                            }
                        } else if (i3 == 3) {
                            String string = typedArray.getString(index);
                            this.f2174a = string;
                            if (string != null) {
                                if (string.indexOf("/") > 0) {
                                    this.f2182e = typedArray.getResourceId(index, -1);
                                } else {
                                    this.f2181d = -1;
                                }
                            }
                        } else {
                            this.f2181d = typedArray.getInteger(index, this.f2181d);
                        }
                        this.f2181d = -2;
                    } else if (index == C0435e.C0448m.Transition_duration) {
                        int i4 = typedArray.getInt(index, this.f2183f);
                        this.f2183f = i4;
                        if (i4 < 8) {
                            this.f2183f = 8;
                        }
                    } else if (index == C0435e.C0448m.Transition_staggered) {
                        this.f2170a = typedArray.getFloat(index, this.f2170a);
                    } else if (index == C0435e.C0448m.Transition_autoTransition) {
                        this.f2184g = typedArray.getInteger(index, this.f2184g);
                    } else if (index == C0435e.C0448m.Transition_android_id) {
                        this.f2171a = typedArray.getResourceId(index, this.f2171a);
                    } else if (index == C0435e.C0448m.Transition_transitionDisable) {
                        this.f2179b = typedArray.getBoolean(index, this.f2179b);
                    } else if (index == C0435e.C0448m.Transition_pathMotionArc) {
                        this.f2185h = typedArray.getInteger(index, -1);
                    } else if (index == C0435e.C0448m.Transition_layoutDuringTransition) {
                        this.f2186i = typedArray.getInteger(index, 0);
                    } else if (index == C0435e.C0448m.Transition_transitionFlags) {
                        this.f2187j = typedArray.getInteger(index, 0);
                    }
                }
                b.append(i, dVar);
            }
            if (this.f2180c == -1) {
                this.f2176a = true;
            }
        }

        /* renamed from: y */
        public final void mo2979y(C0393b bVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.Transition);
            mo2978x(bVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: z */
        public int mo2980z() {
            return this.f2184g;
        }
    }

    public C0393b(Context context, MotionLayout motionLayout, int i) {
        this.f2137a = motionLayout;
        this.f2139a = new C0405g(motionLayout);
        mo2904V(context, i);
        SparseArray<C0426d> sparseArray = this.f2133a;
        int i2 = C0435e.C0442g.motion_base;
        sparseArray.put(i2, new C0426d());
        this.f2142a.put("motion_base", Integer.valueOf(i2));
    }

    public C0393b(MotionLayout motionLayout) {
        this.f2137a = motionLayout;
        this.f2139a = new C0405g(motionLayout);
    }

    /* renamed from: A */
    public static String m2835A(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + ve0.m30010i(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* renamed from: q0 */
    public static String m2841q0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    /* renamed from: B */
    public float mo2884B() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3001i();
    }

    /* renamed from: C */
    public float mo2885C() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3002j();
    }

    /* renamed from: D */
    public boolean mo2886D() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return false;
        }
        return this.f2138a.f2173a.mo3003k();
    }

    /* renamed from: E */
    public float mo2887E(View view, int i) {
        return 0.0f;
    }

    /* renamed from: F */
    public float mo2888F(float f, float f2) {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3004l(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo3565e(r3, -1, -1);
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2889G(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.g r0 = r2.f2140a
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.mo3565e(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0393b.mo2889G(int):int");
    }

    /* renamed from: H */
    public int mo2890H() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0;
        }
        return this.f2138a.f2173a.mo3005m();
    }

    /* renamed from: I */
    public float mo2891I() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3006n();
    }

    /* renamed from: J */
    public float mo2892J() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3007o();
    }

    /* renamed from: K */
    public float mo2893K() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3008p();
    }

    /* renamed from: L */
    public float mo2894L() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0.0f;
        }
        return this.f2138a.f2173a.mo3009q();
    }

    /* renamed from: M */
    public float mo2895M() {
        C0395b bVar = this.f2138a;
        if (bVar != null) {
            return bVar.f2170a;
        }
        return 0.0f;
    }

    /* renamed from: N */
    public int mo2896N() {
        C0395b bVar = this.f2138a;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2180c;
    }

    /* renamed from: O */
    public C0395b mo2897O(int i) {
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            C0395b next = it.next();
            if (next.f2171a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: P */
    public int mo2898P(int i) {
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            if (it.next().f2180c == i) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: Q */
    public List<C0395b> mo2899Q(int i) {
        int G = mo2889G(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            C0395b next = it.next();
            if (next.f2180c == G || next.f2177b == G) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final boolean mo2900R(int i) {
        int i2 = this.f2134a.get(i);
        int size = this.f2134a.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f2134a.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: S */
    public boolean mo2901S(View view, int i) {
        C0395b bVar = this.f2138a;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f2175a.iterator();
        while (it.hasNext()) {
            Iterator<ly1> it2 = ((sy1) it.next()).mo24665d(view.getId()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().f15688a == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo2902T() {
        return this.f2136a != null;
    }

    /* renamed from: U */
    public boolean mo2903U(int i) {
        return this.f2139a.mo3054h(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2904V(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0174
            if (r2 == 0) goto L_0x0162
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x0165
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            boolean r5 = r8.f2148b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r6 = "MotionScene"
            r7 = -1
            switch(r5) {
                case -1349929691: goto L_0x009a;
                case -1239391468: goto L_0x008f;
                case -687739768: goto L_0x0085;
                case 61998586: goto L_0x007a;
                case 269306229: goto L_0x0071;
                case 312750793: goto L_0x0067;
                case 327855227: goto L_0x005d;
                case 793277014: goto L_0x0055;
                case 1382829617: goto L_0x004b;
                case 1942574248: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x00a4
        L_0x0041:
            java.lang.String r3 = "include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 6
            goto L_0x00a5
        L_0x004b:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 4
            goto L_0x00a5
        L_0x0055:
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 0
            goto L_0x00a5
        L_0x005d:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 2
            goto L_0x00a5
        L_0x0067:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 3
            goto L_0x00a5
        L_0x0071:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x007a:
            java.lang.String r3 = "ViewTransition"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 9
            goto L_0x00a5
        L_0x0085:
            java.lang.String r3 = "Include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 7
            goto L_0x00a5
        L_0x008f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 8
            goto L_0x00a5
        L_0x009a:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 5
            goto L_0x00a5
        L_0x00a4:
            r3 = -1
        L_0x00a5:
            switch(r3) {
                case 0: goto L_0x015e;
                case 1: goto L_0x011c;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x00a8:
            goto L_0x0165
        L_0x00aa:
            androidx.constraintlayout.motion.widget.f r2 = new androidx.constraintlayout.motion.widget.f     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.g r3 = r8.f2139a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r3.mo3048b(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00b6:
            com.onedelhi.secure.sy1 r2 = new com.onedelhi.secure.sy1     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x0165
            java.util.ArrayList r3 = r1.f2175a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00c6:
            r8.mo2910b0(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00cb:
            r8.mo2908Z(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00d0:
            androidx.constraintlayout.widget.g r2 = new androidx.constraintlayout.widget.g     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r8.f2140a = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00d9:
            if (r1 == 0) goto L_0x0165
            r1.mo2976v(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00e0:
            if (r1 != 0) goto L_0x010f
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            android.util.Log.v(r6, r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x010f:
            if (r1 == 0) goto L_0x0165
            androidx.constraintlayout.motion.widget.c r2 = new androidx.constraintlayout.motion.widget.c     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f2137a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.C0397c unused = r1.f2173a = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x011c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r1 = r8.f2141a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.b$b r2 = new androidx.constraintlayout.motion.widget.b$b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.b$b r1 = r8.f2138a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != 0) goto L_0x0143
            boolean r1 = r2.f2176a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != 0) goto L_0x0143
            r8.f2138a = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.c r1 = r2.f2173a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x0143
            androidx.constraintlayout.motion.widget.b$b r1 = r8.f2138a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.c r1 = r1.f2173a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            boolean r3 = r8.f2151e     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.mo2988D(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0143:
            boolean r1 = r2.f2176a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x015c
            int r1 = r2.f2177b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != r7) goto L_0x0152
            r8.f2146b = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0157
        L_0x0152:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r1 = r8.f2147b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0157:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r1 = r8.f2141a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x015c:
            r1 = r2
            goto L_0x0165
        L_0x015e:
            r8.mo2911c0(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x0162:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0165:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x000d
        L_0x016b:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x0174
        L_0x0170:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0393b.mo2904V(android.content.Context, int):void");
    }

    /* renamed from: W */
    public int mo2905W(String str) {
        Integer num = this.f2142a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: X */
    public String mo2906X(int i) {
        for (Map.Entry next : this.f2142a.entrySet()) {
            Integer num = (Integer) next.getValue();
            if (num != null && num.intValue() == i) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: Y */
    public void mo2907Y(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2908Z(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.d r0 = new androidx.constraintlayout.widget.d
            r0.<init>()
            r1 = 0
            r0.mo3432a1(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x00e9
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.f2148b
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            r8.hashCode()
            int r10 = r8.hashCode()
            r11 = 2
            switch(r10) {
                case -1496482599: goto L_0x0059;
                case -1153153640: goto L_0x004e;
                case 3355: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r8 = -1
            goto L_0x0063
        L_0x0043:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r8 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r8 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0062
            goto L_0x0041
        L_0x0062:
            r8 = 0
        L_0x0063:
            switch(r8) {
                case 0: goto L_0x00e1;
                case 1: goto L_0x0081;
                case 2: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00e5
        L_0x0068:
            int r5 = r13.mo2944v(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f2142a
            java.lang.String r8 = m2841q0(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = com.onedelhi.secure.ve0.m30010i(r14, r5)
            r0.f2896a = r7
            goto L_0x00e5
        L_0x0081:
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0089 }
            r0.f2895a = r8     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x00e5
        L_0x0089:
            r9.hashCode()
            int r8 = r9.hashCode()
            r10 = 4
            r12 = 3
            switch(r8) {
                case -768416914: goto L_0x00c4;
                case 3317767: goto L_0x00b9;
                case 3387192: goto L_0x00ae;
                case 108511772: goto L_0x00a3;
                case 1954540437: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            r8 = -1
            goto L_0x00ce
        L_0x0098:
            java.lang.String r8 = "x_right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00a1
            goto L_0x0096
        L_0x00a1:
            r8 = 4
            goto L_0x00ce
        L_0x00a3:
            java.lang.String r8 = "right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00ac
            goto L_0x0096
        L_0x00ac:
            r8 = 3
            goto L_0x00ce
        L_0x00ae:
            java.lang.String r8 = "none"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00b7
            goto L_0x0096
        L_0x00b7:
            r8 = 2
            goto L_0x00ce
        L_0x00b9:
            java.lang.String r8 = "left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00c2
            goto L_0x0096
        L_0x00c2:
            r8 = 1
            goto L_0x00ce
        L_0x00c4:
            java.lang.String r8 = "x_left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00cd
            goto L_0x0096
        L_0x00cd:
            r8 = 0
        L_0x00ce:
            switch(r8) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00db;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00d2;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x00e5
        L_0x00d2:
            r0.f2895a = r12
            goto L_0x00e5
        L_0x00d5:
            r0.f2895a = r7
            goto L_0x00e5
        L_0x00d8:
            r0.f2895a = r1
            goto L_0x00e5
        L_0x00db:
            r0.f2895a = r11
            goto L_0x00e5
        L_0x00de:
            r0.f2895a = r10
            goto L_0x00e5
        L_0x00e1:
            int r6 = r13.mo2944v(r14, r9)
        L_0x00e5:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00e9:
            if (r5 == r3) goto L_0x0103
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f2137a
            int r1 = r1.f1975H
            if (r1 == 0) goto L_0x00f4
            r0.mo3497z1(r7)
        L_0x00f4:
            r0.mo3491x0(r14, r15)
            if (r6 == r3) goto L_0x00fe
            android.util.SparseIntArray r14 = r13.f2134a
            r14.put(r5, r6)
        L_0x00fe:
            android.util.SparseArray<androidx.constraintlayout.widget.d> r14 = r13.f2133a
            r14.put(r5, r0)
        L_0x0103:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0393b.mo2908Z(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: a0 */
    public final int mo2909a0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return mo2908Z(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b0 */
    public final void mo2910b0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0435e.C0448m.include_constraintSet) {
                mo2909a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c0 */
    public final void mo2911c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0435e.C0448m.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f2132a);
                this.f2132a = i2;
                if (i2 < 8) {
                    this.f2132a = 8;
                }
            } else if (index == C0435e.C0448m.MotionScene_layoutDuringTransition) {
                this.f2145b = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d0 */
    public void mo2912d0(float f, float f2) {
        C0395b bVar = this.f2138a;
        if (bVar != null && bVar.f2173a != null) {
            this.f2138a.f2173a.mo3016w(f, f2);
        }
    }

    /* renamed from: e0 */
    public void mo2913e0(float f, float f2) {
        C0395b bVar = this.f2138a;
        if (bVar != null && bVar.f2173a != null) {
            this.f2138a.f2173a.mo3017x(f, f2);
        }
    }

    /* renamed from: f */
    public void mo2914f(MotionLayout motionLayout, int i) {
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            C0395b next = it.next();
            if (next.f2178b.size() > 0) {
                Iterator it2 = next.f2178b.iterator();
                while (it2.hasNext()) {
                    ((C0395b.C0396a) it2.next()).mo2983c(motionLayout);
                }
            }
        }
        Iterator<C0395b> it3 = this.f2147b.iterator();
        while (it3.hasNext()) {
            C0395b next2 = it3.next();
            if (next2.f2178b.size() > 0) {
                Iterator it4 = next2.f2178b.iterator();
                while (it4.hasNext()) {
                    ((C0395b.C0396a) it4.next()).mo2983c(motionLayout);
                }
            }
        }
        Iterator<C0395b> it5 = this.f2141a.iterator();
        while (it5.hasNext()) {
            C0395b next3 = it5.next();
            if (next3.f2178b.size() > 0) {
                Iterator it6 = next3.f2178b.iterator();
                while (it6.hasNext()) {
                    ((C0395b.C0396a) it6.next()).mo2981a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C0395b> it7 = this.f2147b.iterator();
        while (it7.hasNext()) {
            C0395b next4 = it7.next();
            if (next4.f2178b.size() > 0) {
                Iterator it8 = next4.f2178b.iterator();
                while (it8.hasNext()) {
                    ((C0395b.C0396a) it8.next()).mo2981a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo2915f0(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.C0387i iVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2136a == null) {
            this.f2136a = this.f2137a.mo2744N0();
        }
        this.f2136a.mo2875h(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f2131a = motionEvent.getRawX();
                this.f2144b = motionEvent.getRawY();
                this.f2135a = motionEvent;
                this.f2149c = false;
                if (this.f2138a.f2173a != null) {
                    RectF g = this.f2138a.f2173a.mo2999g(this.f2137a, rectF);
                    if (g == null || g.contains(this.f2135a.getX(), this.f2135a.getY())) {
                        RectF r = this.f2138a.f2173a.mo3010r(this.f2137a, rectF);
                        if (r == null || r.contains(this.f2135a.getX(), this.f2135a.getY())) {
                            this.f2150d = false;
                        } else {
                            this.f2150d = true;
                        }
                        this.f2138a.f2173a.mo2985A(this.f2131a, this.f2144b);
                        return;
                    }
                    this.f2135a = null;
                    this.f2149c = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f2149c) {
                float rawY = motionEvent.getRawY() - this.f2144b;
                float rawX = motionEvent.getRawX() - this.f2131a;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f2135a) != null) {
                    C0395b j = mo2922j(i, rawX, rawY, motionEvent2);
                    if (j != null) {
                        motionLayout.setTransition(j);
                        RectF r2 = this.f2138a.f2173a.mo3010r(this.f2137a, rectF);
                        if (r2 != null && !r2.contains(this.f2135a.getX(), this.f2135a.getY())) {
                            z = true;
                        }
                        this.f2150d = z;
                        this.f2138a.f2173a.mo2991G(this.f2131a, this.f2144b);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f2149c) {
            C0395b bVar = this.f2138a;
            if (!(bVar == null || bVar.f2173a == null || this.f2150d)) {
                this.f2138a.f2173a.mo3014u(motionEvent, this.f2136a, i, this);
            }
            this.f2131a = motionEvent.getRawX();
            this.f2144b = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (iVar = this.f2136a) != null) {
                iVar.mo2867a();
                this.f2136a = null;
                int i2 = motionLayout.f1971D;
                if (i2 != -1) {
                    mo2920i(motionLayout, i2);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo2916g(C0395b bVar) {
        int w = mo2945w(bVar);
        if (w == -1) {
            this.f2141a.add(bVar);
        } else {
            this.f2141a.set(w, bVar);
        }
    }

    /* renamed from: g0 */
    public final void mo2917g0(int i, MotionLayout motionLayout) {
        C0426d dVar = this.f2133a.get(i);
        dVar.f2899b = dVar.f2896a;
        int i2 = this.f2134a.get(i);
        if (i2 > 0) {
            mo2917g0(i2, motionLayout);
            C0426d dVar2 = this.f2133a.get(i2);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + ve0.m30010i(this.f2137a.getContext(), i2));
                return;
            }
            dVar.f2899b += "/" + dVar2.f2899b;
            dVar.mo3402J0(dVar2);
        } else {
            dVar.f2899b += "  layout";
            dVar.mo3400I0(motionLayout);
        }
        dVar.mo3470q(dVar);
    }

    /* renamed from: h */
    public boolean mo2918h(int i, cl2 cl2) {
        return this.f2139a.mo3051e(i, cl2);
    }

    /* renamed from: h0 */
    public void mo2919h0(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.f2133a.size()) {
            int keyAt = this.f2133a.keyAt(i);
            if (mo2900R(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                mo2917g0(keyAt, motionLayout);
                i++;
            }
        }
    }

    /* renamed from: i */
    public boolean mo2920i(MotionLayout motionLayout, int i) {
        C0395b bVar;
        if (mo2902T() || this.f2143a) {
            return false;
        }
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            C0395b next = it.next();
            if (next.f2184g != 0 && ((bVar = this.f2138a) != next || !bVar.mo2961L(2))) {
                if (i == next.f2180c && (next.f2184g == 4 || next.f2184g == 2)) {
                    MotionLayout.C0391m mVar = MotionLayout.C0391m.FINISHED;
                    motionLayout.setState(mVar);
                    motionLayout.setTransition(next);
                    if (next.f2184g == 4) {
                        motionLayout.mo2756Z0();
                        motionLayout.setState(MotionLayout.C0391m.SETUP);
                        motionLayout.setState(MotionLayout.C0391m.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo2805s0(true);
                        motionLayout.setState(MotionLayout.C0391m.SETUP);
                        motionLayout.setState(MotionLayout.C0391m.MOVING);
                        motionLayout.setState(mVar);
                        motionLayout.mo2745O0();
                    }
                    return true;
                } else if (i == next.f2177b && (next.f2184g == 3 || next.f2184g == 1)) {
                    MotionLayout.C0391m mVar2 = MotionLayout.C0391m.FINISHED;
                    motionLayout.setState(mVar2);
                    motionLayout.setTransition(next);
                    if (next.f2184g == 3) {
                        motionLayout.mo2758b1();
                        motionLayout.setState(MotionLayout.C0391m.SETUP);
                        motionLayout.setState(MotionLayout.C0391m.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.mo2805s0(true);
                        motionLayout.setState(MotionLayout.C0391m.SETUP);
                        motionLayout.setState(MotionLayout.C0391m.MOVING);
                        motionLayout.setState(mVar2);
                        motionLayout.mo2745O0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public void mo2921i0(C0395b bVar) {
        int w = mo2945w(bVar);
        if (w != -1) {
            this.f2141a.remove(w);
        }
    }

    /* renamed from: j */
    public C0395b mo2922j(int i, float f, float f2, MotionEvent motionEvent) {
        RectF g;
        int i2 = i;
        float f3 = f;
        float f4 = f2;
        if (i2 == -1) {
            return this.f2138a;
        }
        List<C0395b> Q = mo2899Q(i);
        float f5 = 0.0f;
        C0395b bVar = null;
        RectF rectF = new RectF();
        for (C0395b next : Q) {
            if (!next.f2179b && next.f2173a != null) {
                next.f2173a.mo2988D(this.f2151e);
                RectF r = next.f2173a.mo3010r(this.f2137a, rectF);
                if ((r == null || motionEvent == null || r.contains(motionEvent.getX(), motionEvent.getY())) && ((g = next.f2173a.mo2999g(this.f2137a, rectF)) == null || motionEvent == null || g.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a = next.f2173a.mo2993a(f3, f4);
                    if (next.f2173a.f2223a && motionEvent != null) {
                        float x = motionEvent.getX() - next.f2173a.f2229c;
                        float y = motionEvent.getY() - next.f2173a.f2232d;
                        a = ((float) (Math.atan2((double) (f4 + y), (double) (f3 + x)) - Math.atan2((double) x, (double) y))) * 10.0f;
                    }
                    float f6 = a * (next.f2177b == i2 ? -1.0f : 1.1f);
                    if (f6 > f5) {
                        bVar = next;
                        f5 = f6;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: j0 */
    public void mo2923j0(int i, C0426d dVar) {
        this.f2133a.put(i, dVar);
    }

    /* renamed from: k */
    public void mo2924k(boolean z) {
        this.f2143a = z;
    }

    /* renamed from: k0 */
    public void mo2925k0(int i) {
        C0395b bVar = this.f2138a;
        if (bVar != null) {
            bVar.mo2964O(i);
        } else {
            this.f2132a = i;
        }
    }

    /* renamed from: l */
    public void mo2926l(int i, boolean z) {
        this.f2139a.mo3052f(i, z);
    }

    /* renamed from: l0 */
    public void mo2927l0(View view, int i, String str, Object obj) {
        C0395b bVar = this.f2138a;
        if (bVar != null) {
            Iterator it = bVar.f2175a.iterator();
            while (it.hasNext()) {
                Iterator<ly1> it2 = ((sy1) it.next()).mo24665d(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().f15688a == i) {
                        if (obj != null) {
                            ((Float) obj).floatValue();
                        }
                        str.equalsIgnoreCase("app:PerpendicularPath_percent");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public int mo2928m() {
        C0395b bVar = this.f2138a;
        if (bVar != null) {
            return bVar.f2185h;
        }
        return -1;
    }

    /* renamed from: m0 */
    public void mo2929m0(boolean z) {
        this.f2151e = z;
        C0395b bVar = this.f2138a;
        if (bVar != null && bVar.f2173a != null) {
            this.f2138a.f2173a.mo2988D(this.f2151e);
        }
    }

    /* renamed from: n */
    public int mo2930n() {
        C0395b bVar = this.f2138a;
        if (bVar == null || bVar.f2173a == null) {
            return 0;
        }
        return this.f2138a.f2173a.mo2997e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2931n0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.g r0 = r6.f2140a
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo3565e(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.g r2 = r6.f2140a
            int r2 = r2.mo3565e(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.b$b r3 = r6.f2138a
            if (r3 == 0) goto L_0x002b
            int r3 = r3.f2177b
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.b$b r3 = r6.f2138a
            int r3 = r3.f2180c
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r6.f2141a
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0393b.C0395b) r4
            int r5 = r4.f2177b
            if (r5 != r2) goto L_0x0049
            int r5 = r4.f2180c
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.f2177b
            if (r5 != r8) goto L_0x0031
            int r5 = r4.f2180c
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.f2138a = r4
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.c r7 = r4.f2173a
            if (r7 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.b$b r7 = r6.f2138a
            androidx.constraintlayout.motion.widget.c r7 = r7.f2173a
            boolean r8 = r6.f2151e
            r7.mo2988D(r8)
        L_0x006a:
            return
        L_0x006b:
            androidx.constraintlayout.motion.widget.b$b r7 = r6.f2146b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r6.f2147b
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0393b.C0395b) r4
            int r5 = r4.f2177b
            if (r5 != r8) goto L_0x0073
            r7 = r4
            goto L_0x0073
        L_0x0087:
            androidx.constraintlayout.motion.widget.b$b r8 = new androidx.constraintlayout.motion.widget.b$b
            r8.<init>(r6, r7)
            int unused = r8.f2180c = r0
            int unused = r8.f2177b = r2
            if (r0 == r1) goto L_0x0099
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r7 = r6.f2141a
            r7.add(r8)
        L_0x0099:
            r6.f2138a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0393b.mo2931n0(int, int):void");
    }

    /* renamed from: o */
    public C0426d mo2932o(int i) {
        return mo2934p(i, -1, -1);
    }

    /* renamed from: o0 */
    public void mo2933o0(C0395b bVar) {
        this.f2138a = bVar;
        if (bVar != null && bVar.f2173a != null) {
            this.f2138a.f2173a.mo2988D(this.f2151e);
        }
    }

    /* renamed from: p */
    public C0426d mo2934p(int i, int i2, int i3) {
        Object obj;
        int e;
        if (this.f2148b) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f2133a.size());
        }
        C0451g gVar = this.f2140a;
        if (!(gVar == null || (e = gVar.mo3565e(i, i2, i3)) == -1)) {
            i = e;
        }
        if (this.f2133a.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + ve0.m30010i(this.f2137a.getContext(), i) + " In MotionScene");
            SparseArray sparseArray = this.f2133a;
            obj = sparseArray.get(sparseArray.keyAt(0));
        } else {
            obj = this.f2133a.get(i);
        }
        return (C0426d) obj;
    }

    /* renamed from: p0 */
    public void mo2935p0() {
        C0395b bVar = this.f2138a;
        if (bVar != null && bVar.f2173a != null) {
            this.f2138a.f2173a.mo2992H();
        }
    }

    /* renamed from: q */
    public C0426d mo2936q(Context context, String str) {
        if (this.f2148b) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f2133a.size());
        }
        for (int i = 0; i < this.f2133a.size(); i++) {
            int keyAt = this.f2133a.keyAt(i);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f2148b) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f2133a.get(keyAt);
            }
        }
        return null;
    }

    /* renamed from: r */
    public int[] mo2937r() {
        int size = this.f2133a.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f2133a.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: r0 */
    public boolean mo2938r0() {
        Iterator<C0395b> it = this.f2141a.iterator();
        while (it.hasNext()) {
            if (it.next().f2173a != null) {
                return true;
            }
        }
        C0395b bVar = this.f2138a;
        return (bVar == null || bVar.f2173a == null) ? false : true;
    }

    /* renamed from: s */
    public ArrayList<C0395b> mo2939s() {
        return this.f2141a;
    }

    /* renamed from: s0 */
    public boolean mo2940s0(MotionLayout motionLayout) {
        return motionLayout == this.f2137a && motionLayout.f2005a == this;
    }

    /* renamed from: t */
    public int mo2941t() {
        C0395b bVar = this.f2138a;
        return bVar != null ? bVar.f2183f : this.f2132a;
    }

    /* renamed from: t0 */
    public void mo2942t0(int i, View... viewArr) {
        this.f2139a.mo3059m(i, viewArr);
    }

    /* renamed from: u */
    public int mo2943u() {
        C0395b bVar = this.f2138a;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2177b;
    }

    /* renamed from: v */
    public final int mo2944v(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f2148b) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* renamed from: w */
    public final int mo2945w(C0395b bVar) {
        int o = bVar.f2171a;
        if (o != -1) {
            for (int i = 0; i < this.f2141a.size(); i++) {
                if (this.f2141a.get(i).f2171a == o) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    /* renamed from: x */
    public Interpolator mo2946x() {
        int g = this.f2138a.f2181d;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.f2137a.getContext(), this.f2138a.f2182e);
        }
        if (g == -1) {
            return new C0394a(this, ur0.m29534c(this.f2138a.f2174a));
        }
        if (g == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return new AccelerateInterpolator();
        }
        if (g == 2) {
            return new DecelerateInterpolator();
        }
        if (g == 4) {
            return new BounceInterpolator();
        }
        if (g == 5) {
            return new OvershootInterpolator();
        }
        if (g != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: y */
    public ly1 mo2947y(Context context, int i, int i2, int i3) {
        C0395b bVar = this.f2138a;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f2175a.iterator();
        while (it.hasNext()) {
            sy1 sy1 = (sy1) it.next();
            Iterator<Integer> it2 = sy1.mo24666e().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer next = it2.next();
                    if (i2 == next.intValue()) {
                        Iterator<ly1> it3 = sy1.mo24665d(next.intValue()).iterator();
                        while (it3.hasNext()) {
                            ly1 next2 = it3.next();
                            if (next2.f15688a == i3 && next2.f15692c == i) {
                                return next2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    public void mo2948z(cl2 cl2) {
        C0395b bVar = this.f2138a;
        if (bVar == null) {
            C0395b bVar2 = this.f2146b;
            if (bVar2 != null) {
                Iterator it = bVar2.f2175a.iterator();
                while (it.hasNext()) {
                    ((sy1) it.next()).mo24663b(cl2);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f2175a.iterator();
        while (it2.hasNext()) {
            ((sy1) it2.next()).mo24663b(cl2);
        }
    }
}
