package com.onedelhi.secure;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0426d;
import java.io.PrintStream;
import java.util.HashMap;

public class dk0 implements j73 {

    /* renamed from: a */
    public static final HashMap<Pair<Integer, Integer>, String> f10788a;

    /* renamed from: a */
    public static final boolean f10789a = false;

    /* renamed from: b */
    public static final HashMap<String, String> f10790b;

    /* renamed from: c */
    public static final String f10791c = "DesignTool";

    /* renamed from: a */
    public int f10792a = -1;

    /* renamed from: a */
    public final MotionLayout f10793a;

    /* renamed from: a */
    public C0393b f10794a;

    /* renamed from: a */
    public String f10795a = null;

    /* renamed from: b */
    public int f10796b = -1;

    /* renamed from: b */
    public String f10797b = null;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f10788a = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f10790b = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public dk0(MotionLayout motionLayout) {
        this.f10793a = motionLayout;
    }

    /* renamed from: j */
    public static void m13173j(int i, C0426d dVar, View view, HashMap<String, String> hashMap, int i2, int i3) {
        String str = f10788a.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = f10790b.get(str);
            dVar.mo3405L(view.getId(), i2, Integer.parseInt(str2), i3, str3 != null ? m13174k(i, hashMap.get(str3)) : 0);
        }
    }

    /* renamed from: k */
    public static int m13174k(int i, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) (((float) (Integer.valueOf(str.substring(0, indexOf)).intValue() * i)) / 160.0f);
    }

    /* renamed from: l */
    public static void m13175l(int i, C0426d dVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.mo3424W0(view.getId(), m13174k(i, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.mo3426X0(view.getId(), m13174k(i, str2));
        }
    }

    /* renamed from: m */
    public static void m13176m(C0426d dVar, View view, HashMap<String, String> hashMap, int i) {
        String str = hashMap.get(i == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str == null) {
            return;
        }
        if (i == 0) {
            dVar.mo3442f1(view.getId(), Float.parseFloat(str));
        } else if (i == 1) {
            dVar.mo3381A1(view.getId(), Float.parseFloat(str));
        }
    }

    /* renamed from: n */
    public static void m13177n(int i, C0426d dVar, View view, HashMap<String, String> hashMap, int i2) {
        String str = hashMap.get(i2 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int i3 = -2;
            if (!str.equalsIgnoreCase("wrap_content")) {
                i3 = m13174k(i, str);
            }
            int id = view.getId();
            if (i2 == 0) {
                dVar.mo3423W(id, i3);
            } else {
                dVar.mo3413P(id, i3);
            }
        }
    }

    /* renamed from: A */
    public String mo14709A() {
        if (!(this.f10795a == null || this.f10797b == null)) {
            float y = mo14734y();
            if (y <= 0.01f) {
                return this.f10795a;
            }
            if (y >= 0.99f) {
                return this.f10797b;
            }
        }
        return this.f10795a;
    }

    /* renamed from: B */
    public boolean mo14710B() {
        return (this.f10795a == null || this.f10797b == null) ? false : true;
    }

    /* renamed from: C */
    public void mo14711C(Object obj, String str, Object obj2) {
        if (obj instanceof ly1) {
            ((ly1) obj).mo14442j(str, obj2);
            this.f10793a.mo2748R0();
            this.f10793a.f2034j = true;
        }
    }

    /* renamed from: D */
    public void mo14712D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f10795a != str) {
            this.f10795a = str;
            this.f10797b = null;
            MotionLayout motionLayout = this.f10793a;
            if (motionLayout.f2005a == null) {
                motionLayout.f2005a = this.f10794a;
            }
            int M0 = motionLayout.mo2743M0(str);
            this.f10792a = M0;
            if (M0 != 0) {
                if (M0 == this.f10793a.getStartState()) {
                    this.f10793a.setProgress(0.0f);
                } else {
                    if (M0 != this.f10793a.getEndState()) {
                        this.f10793a.mo2759c1(M0);
                    }
                    this.f10793a.setProgress(1.0f);
                }
            }
            this.f10793a.requestLayout();
        }
    }

    /* renamed from: E */
    public void mo14713E(String str, String str2) {
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a == null) {
            motionLayout.f2005a = this.f10794a;
        }
        int M0 = motionLayout.mo2743M0(str);
        int M02 = this.f10793a.mo2743M0(str2);
        this.f10793a.setTransition(M0, M02);
        this.f10792a = M0;
        this.f10796b = M02;
        this.f10795a = str;
        this.f10797b = str2;
    }

    /* renamed from: F */
    public void mo14714F(Object obj, int i) {
        cl2 cl2;
        if ((obj instanceof View) && (cl2 = this.f10793a.f2016b.get(obj)) != null) {
            cl2.mo14215S(i);
            this.f10793a.invalidate();
        }
    }

    /* renamed from: a */
    public float mo14715a(Object obj, int i, float f, float f2) {
        cl2 cl2;
        if ((obj instanceof View) && (cl2 = this.f10793a.f2016b.get((View) obj)) != null) {
            return cl2.mo14249y(i, f, f2);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public int mo14716b(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        cl2 cl2;
        View view = (View) obj;
        if (i != 0) {
            MotionLayout motionLayout = this.f10793a;
            if (motionLayout.f2005a == null || view == null || (cl2 = motionLayout.f2016b.get(view)) == null) {
                return -1;
            }
        } else {
            cl2 = null;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int t = this.f10793a.f2005a.mo2941t() / 16;
            cl2.mo14230f(fArr2, t);
            return t;
        } else if (i == 2) {
            int t2 = this.f10793a.f2005a.mo2941t() / 16;
            cl2.mo14229e(fArr2, (int[]) null);
            return t2;
        } else if (i != 3) {
            return -1;
        } else {
            int t3 = this.f10793a.f2005a.mo2941t() / 16;
            return cl2.mo14236l(str, fArr2, i3);
        }
    }

    /* renamed from: c */
    public long mo14717c() {
        return this.f10793a.getTransitionTimeMs();
    }

    /* renamed from: d */
    public void mo14718d(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int M0 = this.f10793a.mo2743M0(str);
        C0426d o = this.f10793a.f2005a.mo2932o(M0);
        if (o != null) {
            o.mo3389E(view.getId());
            m13177n(i, o, view, hashMap, 0);
            m13177n(i, o, view, hashMap, 1);
            int i2 = i;
            C0426d dVar = o;
            View view2 = view;
            HashMap hashMap2 = hashMap;
            m13173j(i2, dVar, view2, hashMap2, 6, 6);
            m13173j(i2, dVar, view2, hashMap2, 6, 7);
            m13173j(i2, dVar, view2, hashMap2, 7, 7);
            m13173j(i2, dVar, view2, hashMap2, 7, 6);
            m13173j(i2, dVar, view2, hashMap2, 1, 1);
            m13173j(i2, dVar, view2, hashMap2, 1, 2);
            m13173j(i2, dVar, view2, hashMap2, 2, 2);
            m13173j(i2, dVar, view2, hashMap2, 2, 1);
            m13173j(i2, dVar, view2, hashMap2, 3, 3);
            m13173j(i2, dVar, view2, hashMap2, 3, 4);
            m13173j(i2, dVar, view2, hashMap2, 4, 3);
            m13173j(i2, dVar, view2, hashMap2, 4, 4);
            m13173j(i2, dVar, view2, hashMap2, 5, 5);
            m13176m(o, view, hashMap, 0);
            m13176m(o, view, hashMap, 1);
            m13175l(i, o, view, hashMap);
            this.f10793a.mo2782h1(M0, o);
            this.f10793a.requestLayout();
        }
    }

    /* renamed from: e */
    public Object mo14719e(Object obj, float f, float f2) {
        cl2 cl2;
        View view = (View) obj;
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a == null) {
            return -1;
        }
        if (view == null || (cl2 = motionLayout.f2016b.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return cl2.mo14198B(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    /* renamed from: f */
    public void mo14720f(Object obj, int i, String str, Object obj2) {
        C0393b bVar = this.f10793a.f2005a;
        if (bVar != null) {
            bVar.mo2927l0((View) obj, i, str, obj2);
            MotionLayout motionLayout = this.f10793a;
            motionLayout.f2024e = ((float) i) / 100.0f;
            motionLayout.f2021d = 0.0f;
            motionLayout.mo2748R0();
            this.f10793a.mo2805s0(true);
        }
    }

    /* renamed from: g */
    public boolean mo14721g(Object obj, int i, int i2, float f, float f2) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a != null) {
            cl2 cl2 = motionLayout.f2016b.get(obj);
            MotionLayout motionLayout2 = this.f10793a;
            int i3 = (int) (motionLayout2.f2017c * 100.0f);
            if (cl2 != null) {
                View view = (View) obj;
                if (motionLayout2.f2005a.mo2901S(view, i3)) {
                    float y = cl2.mo14249y(2, f, f2);
                    float y2 = cl2.mo14249y(5, f, f2);
                    this.f10793a.f2005a.mo2927l0(view, i3, "motion:percentX", Float.valueOf(y));
                    this.f10793a.f2005a.mo2927l0(view, i3, "motion:percentY", Float.valueOf(y2));
                    this.f10793a.mo2748R0();
                    this.f10793a.mo2805s0(true);
                    this.f10793a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public Boolean mo14722h(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (!(obj instanceof az1)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f10793a.f2016b.get(view).mo14210N(view, (az1) obj, f, f2, strArr, fArr);
        this.f10793a.mo2748R0();
        this.f10793a.f2034j = true;
        return Boolean.TRUE;
    }

    /* renamed from: i */
    public void mo14723i(float f) {
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a == null) {
            motionLayout.f2005a = this.f10794a;
        }
        motionLayout.setProgress(f);
        this.f10793a.mo2805s0(true);
        this.f10793a.requestLayout();
        this.f10793a.invalidate();
    }

    /* renamed from: o */
    public void mo14724o(boolean z) {
        this.f10793a.mo2792o0(z);
    }

    /* renamed from: p */
    public void mo14725p(String str) {
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a == null) {
            motionLayout.f2005a = this.f10794a;
        }
        int M0 = motionLayout.mo2743M0(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + M0 + pl2.f33727d);
        try {
            this.f10793a.f2005a.mo2932o(M0).mo3443g0(this.f10793a.f2005a, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public int mo14726q(Object obj, float[] fArr) {
        C0393b bVar = this.f10793a.f2005a;
        if (bVar == null) {
            return -1;
        }
        int t = bVar.mo2941t() / 16;
        cl2 cl2 = this.f10793a.f2016b.get(obj);
        if (cl2 == null) {
            return 0;
        }
        cl2.mo14229e(fArr, (int[]) null);
        return t;
    }

    /* renamed from: r */
    public int mo14727r(Object obj, float[] fArr, int i) {
        MotionLayout motionLayout = this.f10793a;
        if (motionLayout.f2005a == null) {
            return -1;
        }
        cl2 cl2 = motionLayout.f2016b.get(obj);
        if (cl2 == null) {
            return 0;
        }
        cl2.mo14230f(fArr, i);
        return i;
    }

    /* renamed from: s */
    public void mo14728s(Object obj, float[] fArr) {
        C0393b bVar = this.f10793a.f2005a;
        if (bVar != null) {
            int t = bVar.mo2941t() / 16;
            cl2 cl2 = this.f10793a.f2016b.get(obj);
            if (cl2 != null) {
                cl2.mo14232h(fArr, t);
            }
        }
    }

    /* renamed from: t */
    public String mo14729t() {
        int endState = this.f10793a.getEndState();
        if (this.f10796b == endState) {
            return this.f10797b;
        }
        String A0 = this.f10793a.mo2731A0(endState);
        if (A0 != null) {
            this.f10797b = A0;
            this.f10796b = endState;
        }
        return A0;
    }

    /* renamed from: u */
    public int mo14730u(Object obj, int i, int[] iArr) {
        cl2 cl2 = this.f10793a.f2016b.get((View) obj);
        if (cl2 == null) {
            return 0;
        }
        return cl2.mo14248x(i, iArr);
    }

    /* renamed from: v */
    public int mo14731v(Object obj, int[] iArr, float[] fArr) {
        cl2 cl2 = this.f10793a.f2016b.get((View) obj);
        if (cl2 == null) {
            return 0;
        }
        return cl2.mo14250z(iArr, fArr);
    }

    /* renamed from: w */
    public Object mo14732w(int i, int i2, int i3) {
        MotionLayout motionLayout = this.f10793a;
        C0393b bVar = motionLayout.f2005a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo2947y(motionLayout.getContext(), i, i2, i3);
    }

    /* renamed from: x */
    public Object mo14733x(Object obj, int i, int i2) {
        if (this.f10793a.f2005a == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.f10793a;
        return motionLayout.f2005a.mo2947y(motionLayout.getContext(), i, id, i2);
    }

    /* renamed from: y */
    public float mo14734y() {
        return this.f10793a.getProgress();
    }

    /* renamed from: z */
    public String mo14735z() {
        int startState = this.f10793a.getStartState();
        if (this.f10792a == startState) {
            return this.f10795a;
        }
        String A0 = this.f10793a.mo2731A0(startState);
        if (A0 != null) {
            this.f10795a = A0;
            this.f10792a = startState;
        }
        return this.f10793a.mo2731A0(startState);
    }
}
