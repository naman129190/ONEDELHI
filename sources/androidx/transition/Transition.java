package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.ga2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ox4;
import com.onedelhi.secure.ph4;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ty3;
import com.onedelhi.secure.uh4;
import com.onedelhi.secure.vf4;
import com.onedelhi.secure.xj4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {

    /* renamed from: a */
    public static ThreadLocal<C3042oa<Animator, C1039d>> f5555a = new ThreadLocal<>();

    /* renamed from: b */
    public static final PathMotion f5556b = new C1036a();

    /* renamed from: b */
    public static final int[] f5557b = {2, 1, 3, 4};

    /* renamed from: c */
    public static final String f5558c = "Transition";

    /* renamed from: d */
    public static final String f5559d = "instance";

    /* renamed from: e */
    public static final String f5560e = "name";

    /* renamed from: e */
    public static final boolean f5561e = false;

    /* renamed from: f */
    public static final String f5562f = "id";

    /* renamed from: g */
    public static final String f5563g = "itemId";

    /* renamed from: o */
    public static final int f5564o = 1;

    /* renamed from: p */
    public static final int f5565p = 1;

    /* renamed from: q */
    public static final int f5566q = 2;

    /* renamed from: r */
    public static final int f5567r = 3;

    /* renamed from: s */
    public static final int f5568s = 4;

    /* renamed from: t */
    public static final int f5569t = 4;

    /* renamed from: a */
    public TimeInterpolator f5570a = null;

    /* renamed from: a */
    public ViewGroup f5571a = null;

    /* renamed from: a */
    public PathMotion f5572a = f5556b;

    /* renamed from: a */
    public C1041f f5573a;

    /* renamed from: a */
    public TransitionSet f5574a = null;

    /* renamed from: a */
    public C3042oa<String, String> f5575a;

    /* renamed from: a */
    public ph4 f5576a;

    /* renamed from: a */
    public uh4 f5577a = new uh4();

    /* renamed from: a */
    public ArrayList<Integer> f5578a = new ArrayList<>();

    /* renamed from: a */
    public int[] f5579a = f5557b;

    /* renamed from: b */
    public long f5580b = -1;

    /* renamed from: b */
    public uh4 f5581b = new uh4();

    /* renamed from: b */
    public String f5582b = getClass().getName();

    /* renamed from: b */
    public ArrayList<View> f5583b = new ArrayList<>();

    /* renamed from: b */
    public boolean f5584b = false;

    /* renamed from: c */
    public long f5585c = -1;

    /* renamed from: c */
    public ArrayList<String> f5586c = null;

    /* renamed from: c */
    public boolean f5587c = false;

    /* renamed from: d */
    public ArrayList<Class<?>> f5588d = null;

    /* renamed from: d */
    public boolean f5589d = false;

    /* renamed from: e */
    public ArrayList<Integer> f5590e = null;

    /* renamed from: f */
    public ArrayList<View> f5591f = null;

    /* renamed from: g */
    public ArrayList<Class<?>> f5592g = null;

    /* renamed from: h */
    public ArrayList<String> f5593h = null;

    /* renamed from: i */
    public ArrayList<Integer> f5594i = null;

    /* renamed from: j */
    public ArrayList<View> f5595j = null;

    /* renamed from: k */
    public ArrayList<Class<?>> f5596k = null;

    /* renamed from: l */
    public ArrayList<th4> f5597l;

    /* renamed from: m */
    public ArrayList<th4> f5598m;

    /* renamed from: n */
    public int f5599n = 0;

    /* renamed from: n */
    public ArrayList<Animator> f5600n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<C1043h> f5601o = null;

    /* renamed from: p */
    public ArrayList<Animator> f5602p = new ArrayList<>();

    /* renamed from: androidx.transition.Transition$a */
    public static class C1036a extends PathMotion {
        /* renamed from: a */
        public Path mo6787a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    public class C1037b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C3042oa f5604a;

        public C1037b(C3042oa oaVar) {
            this.f5604a = oaVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5604a.remove(animator);
            Transition.this.f5600n.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f5600n.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    public class C1038c extends AnimatorListenerAdapter {
        public C1038c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo6944s();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    public static class C1039d {

        /* renamed from: a */
        public View f5606a;

        /* renamed from: a */
        public Transition f5607a;

        /* renamed from: a */
        public ox4 f5608a;

        /* renamed from: a */
        public th4 f5609a;

        /* renamed from: a */
        public String f5610a;

        public C1039d(View view, String str, Transition transition, ox4 ox4, th4 th4) {
            this.f5606a = view;
            this.f5610a = str;
            this.f5609a = th4;
            this.f5608a = ox4;
            this.f5607a = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static class C1040e {
        /* renamed from: a */
        public static <T> ArrayList<T> m7029a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: b */
        public static <T> ArrayList<T> m7030b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.Transition$f */
    public static abstract class C1041f {
        /* renamed from: a */
        public abstract Rect mo6963a(@mr2 Transition transition);
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.Transition$g */
    public @interface C1042g {
    }

    /* renamed from: androidx.transition.Transition$h */
    public interface C1043h {
        /* renamed from: a */
        void mo6964a(@mr2 Transition transition);

        /* renamed from: b */
        void mo6830b(@mr2 Transition transition);

        /* renamed from: c */
        void mo6831c(@mr2 Transition transition);

        /* renamed from: d */
        void mo6832d(@mr2 Transition transition);

        /* renamed from: e */
        void mo6833e(@mr2 Transition transition);
    }

    public Transition() {
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5679c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = (long) xj4.m31494k(obtainStyledAttributes, xmlResourceParser, ak4.C1715h.f9299b, 1, -1);
        if (k >= 0) {
            mo6941q0(k);
        }
        long k2 = (long) xj4.m31494k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            mo6955x0(k2);
        }
        int l = xj4.m31495l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            mo6945s0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = xj4.m31496m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            mo6947t0(m6953e0(m));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N */
    public static C3042oa<Animator, C1039d> m6950N() {
        C3042oa<Animator, C1039d> oaVar = f5555a.get();
        if (oaVar != null) {
            return oaVar;
        }
        C3042oa<Animator, C1039d> oaVar2 = new C3042oa<>();
        f5555a.set(oaVar2);
        return oaVar2;
    }

    /* renamed from: W */
    public static boolean m6951W(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: Y */
    public static boolean m6952Y(th4 th4, th4 th42, String str) {
        Object obj = th4.f20846a.get(str);
        Object obj2 = th42.f20846a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: e0 */
    public static int[] m6953e0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, vf4.f36537c);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (f5563g.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: g */
    public static void m6954g(uh4 uh4, View view, th4 th4) {
        uh4.f21379a.put(view, th4);
        int id = view.getId();
        if (id >= 0) {
            if (uh4.f21377a.indexOfKey(id) >= 0) {
                uh4.f21377a.put(id, (Object) null);
            } else {
                uh4.f21377a.put(id, view);
            }
        }
        String x0 = jt4.m19024x0(view);
        if (x0 != null) {
            if (uh4.f21380b.containsKey(x0)) {
                uh4.f21380b.put(x0, null);
            } else {
                uh4.f21380b.put(x0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (uh4.f21378a.mo16419j(itemIdAtPosition) >= 0) {
                    View h = uh4.f21378a.mo16417h(itemIdAtPosition);
                    if (h != null) {
                        jt4.m18903Q1(h, false);
                        uh4.f21378a.mo16423n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                jt4.m18903Q1(view, true);
                uh4.f21378a.mo16423n(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    public static boolean m6955h(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static <T> ArrayList<T> m6956x(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? C1040e.m7029a(arrayList, t) : C1040e.m7030b(arrayList, t) : arrayList;
    }

    @mr2
    /* renamed from: A */
    public Transition mo6890A(@mr2 Class<?> cls, boolean z) {
        this.f5592g = mo6892C(this.f5592g, cls, z);
        return this;
    }

    @mr2
    /* renamed from: B */
    public Transition mo6891B(@mr2 String str, boolean z) {
        this.f5593h = m6956x(this.f5593h, str, z);
        return this;
    }

    /* renamed from: C */
    public final ArrayList<Class<?>> mo6892C(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? C1040e.m7029a(arrayList, cls) : C1040e.m7030b(arrayList, cls) : arrayList;
    }

    /* renamed from: D */
    public final ArrayList<View> mo6893D(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? C1040e.m7029a(arrayList, view) : C1040e.m7030b(arrayList, view) : arrayList;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: E */
    public void mo6894E(ViewGroup viewGroup) {
        C3042oa<Animator, C1039d> N = m6950N();
        int size = N.size();
        if (viewGroup != null && size != 0) {
            ox4 d = qv4.m26199d(viewGroup);
            C3042oa oaVar = new C3042oa((ty3) N);
            N.clear();
            for (int i = size - 1; i >= 0; i--) {
                C1039d dVar = (C1039d) oaVar.mo25352q(i);
                if (!(dVar.f5606a == null || d == null || !d.equals(dVar.f5608a))) {
                    ((Animator) oaVar.mo25350m(i)).end();
                }
            }
        }
    }

    /* renamed from: F */
    public long mo6895F() {
        return this.f5585c;
    }

    @ts2
    /* renamed from: G */
    public Rect mo6896G() {
        C1041f fVar = this.f5573a;
        if (fVar == null) {
            return null;
        }
        return fVar.mo6963a(this);
    }

    @ts2
    /* renamed from: H */
    public C1041f mo6897H() {
        return this.f5573a;
    }

    @ts2
    /* renamed from: I */
    public TimeInterpolator mo6898I() {
        return this.f5570a;
    }

    /* renamed from: J */
    public th4 mo6899J(View view, boolean z) {
        TransitionSet transitionSet = this.f5574a;
        if (transitionSet != null) {
            return transitionSet.mo6899J(view, z);
        }
        ArrayList<th4> arrayList = z ? this.f5597l : this.f5598m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            th4 th4 = arrayList.get(i2);
            if (th4 == null) {
                return null;
            }
            if (th4.f20844a == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f5598m : this.f5597l).get(i);
    }

    @mr2
    /* renamed from: K */
    public String mo6900K() {
        return this.f5582b;
    }

    @mr2
    /* renamed from: L */
    public PathMotion mo6901L() {
        return this.f5572a;
    }

    @ts2
    /* renamed from: M */
    public ph4 mo6902M() {
        return this.f5576a;
    }

    /* renamed from: O */
    public long mo6903O() {
        return this.f5580b;
    }

    @mr2
    /* renamed from: P */
    public List<Integer> mo6904P() {
        return this.f5578a;
    }

    @ts2
    /* renamed from: Q */
    public List<String> mo6905Q() {
        return this.f5586c;
    }

    @ts2
    /* renamed from: R */
    public List<Class<?>> mo6906R() {
        return this.f5588d;
    }

    @mr2
    /* renamed from: S */
    public List<View> mo6907S() {
        return this.f5583b;
    }

    @ts2
    /* renamed from: T */
    public String[] mo6799T() {
        return null;
    }

    @ts2
    /* renamed from: U */
    public th4 mo6908U(@mr2 View view, boolean z) {
        TransitionSet transitionSet = this.f5574a;
        if (transitionSet != null) {
            return transitionSet.mo6908U(view, z);
        }
        return (z ? this.f5577a : this.f5581b).f21379a.get(view);
    }

    /* renamed from: V */
    public boolean mo6909V(@ts2 th4 th4, @ts2 th4 th42) {
        if (th4 == null || th42 == null) {
            return false;
        }
        String[] T = mo6799T();
        if (T != null) {
            int length = T.length;
            int i = 0;
            while (i < length) {
                if (!m6952Y(th4, th42, T[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String Y : th4.f20846a.keySet()) {
            if (m6952Y(th4, th42, Y)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: X */
    public boolean mo6910X(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f5590e;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f5591f;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f5592g;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f5592g.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f5593h != null && jt4.m19024x0(view) != null && this.f5593h.contains(jt4.m19024x0(view))) {
            return false;
        }
        if ((this.f5578a.size() == 0 && this.f5583b.size() == 0 && (((arrayList = this.f5588d) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5586c) == null || arrayList2.isEmpty()))) || this.f5578a.contains(Integer.valueOf(id)) || this.f5583b.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5586c;
        if (arrayList6 != null && arrayList6.contains(jt4.m19024x0(view))) {
            return true;
        }
        if (this.f5588d != null) {
            for (int i2 = 0; i2 < this.f5588d.size(); i2++) {
                if (this.f5588d.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Z */
    public final void mo6911Z(C3042oa<View, th4> oaVar, C3042oa<View, th4> oaVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo6910X(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo6910X(view)) {
                th4 th4 = oaVar.get(valueAt);
                th4 th42 = oaVar2.get(view);
                if (!(th4 == null || th42 == null)) {
                    this.f5597l.add(th4);
                    this.f5598m.add(th42);
                    oaVar.remove(valueAt);
                    oaVar2.remove(view);
                }
            }
        }
    }

    @mr2
    /* renamed from: a */
    public Transition mo6912a(@mr2 C1043h hVar) {
        if (this.f5601o == null) {
            this.f5601o = new ArrayList<>();
        }
        this.f5601o.add(hVar);
        return this;
    }

    /* renamed from: a0 */
    public final void mo6913a0(C3042oa<View, th4> oaVar, C3042oa<View, th4> oaVar2) {
        th4 remove;
        for (int size = oaVar.size() - 1; size >= 0; size--) {
            View m = oaVar.mo25350m(size);
            if (m != null && mo6910X(m) && (remove = oaVar2.remove(m)) != null && mo6910X(remove.f20844a)) {
                this.f5597l.add(oaVar.mo4015o(size));
                this.f5598m.add(remove);
            }
        }
    }

    @mr2
    /* renamed from: b */
    public Transition mo6914b(@mo1 int i) {
        if (i != 0) {
            this.f5578a.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: b0 */
    public final void mo6915b0(C3042oa<View, th4> oaVar, C3042oa<View, th4> oaVar2, ga2<View> ga2, ga2<View> ga22) {
        View h;
        int w = ga2.mo16433w();
        for (int i = 0; i < w; i++) {
            View x = ga2.mo16434x(i);
            if (x != null && mo6910X(x) && (h = ga22.mo16417h(ga2.mo16422m(i))) != null && mo6910X(h)) {
                th4 th4 = oaVar.get(x);
                th4 th42 = oaVar2.get(h);
                if (!(th4 == null || th42 == null)) {
                    this.f5597l.add(th4);
                    this.f5598m.add(th42);
                    oaVar.remove(x);
                    oaVar2.remove(h);
                }
            }
        }
    }

    @mr2
    /* renamed from: c */
    public Transition mo6916c(@mr2 View view) {
        this.f5583b.add(view);
        return this;
    }

    /* renamed from: c0 */
    public final void mo6917c0(C3042oa<View, th4> oaVar, C3042oa<View, th4> oaVar2, C3042oa<String, View> oaVar3, C3042oa<String, View> oaVar4) {
        View view;
        int size = oaVar3.size();
        for (int i = 0; i < size; i++) {
            View q = oaVar3.mo25352q(i);
            if (q != null && mo6910X(q) && (view = oaVar4.get(oaVar3.mo25350m(i))) != null && mo6910X(view)) {
                th4 th4 = oaVar.get(q);
                th4 th42 = oaVar2.get(view);
                if (!(th4 == null || th42 == null)) {
                    this.f5597l.add(th4);
                    this.f5598m.add(th42);
                    oaVar.remove(q);
                    oaVar2.remove(view);
                }
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void cancel() {
        for (int size = this.f5600n.size() - 1; size >= 0; size--) {
            this.f5600n.get(size).cancel();
        }
        ArrayList<C1043h> arrayList = this.f5601o;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5601o.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1043h) arrayList2.get(i)).mo6831c(this);
            }
        }
    }

    @mr2
    /* renamed from: d */
    public Transition mo6920d(@mr2 Class<?> cls) {
        if (this.f5588d == null) {
            this.f5588d = new ArrayList<>();
        }
        this.f5588d.add(cls);
        return this;
    }

    /* renamed from: d0 */
    public final void mo6921d0(uh4 uh4, uh4 uh42) {
        C3042oa oaVar = new C3042oa((ty3) uh4.f21379a);
        C3042oa oaVar2 = new C3042oa((ty3) uh42.f21379a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5579a;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    mo6913a0(oaVar, oaVar2);
                } else if (i2 == 2) {
                    mo6917c0(oaVar, oaVar2, uh4.f21380b, uh42.f21380b);
                } else if (i2 == 3) {
                    mo6911Z(oaVar, oaVar2, uh4.f21377a, uh42.f21377a);
                } else if (i2 == 4) {
                    mo6915b0(oaVar, oaVar2, uh4.f21378a, uh42.f21378a);
                }
                i++;
            } else {
                mo6923f(oaVar, oaVar2);
                return;
            }
        }
    }

    @mr2
    /* renamed from: e */
    public Transition mo6922e(@mr2 String str) {
        if (this.f5586c == null) {
            this.f5586c = new ArrayList<>();
        }
        this.f5586c.add(str);
        return this;
    }

    /* renamed from: f */
    public final void mo6923f(C3042oa<View, th4> oaVar, C3042oa<View, th4> oaVar2) {
        for (int i = 0; i < oaVar.size(); i++) {
            th4 q = oaVar.mo25352q(i);
            if (mo6910X(q.f20844a)) {
                this.f5597l.add(q);
                this.f5598m.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < oaVar2.size(); i2++) {
            th4 q2 = oaVar2.mo25352q(i2);
            if (mo6910X(q2.f20844a)) {
                this.f5598m.add(q2);
                this.f5597l.add((Object) null);
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: f0 */
    public void mo6924f0(View view) {
        if (!this.f5589d) {
            C3042oa<Animator, C1039d> N = m6950N();
            int size = N.size();
            ox4 d = qv4.m26199d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1039d q = N.mo25352q(i);
                if (q.f5606a != null && d.equals(q.f5608a)) {
                    C1050a.m7119b(N.mo25350m(i));
                }
            }
            ArrayList<C1043h> arrayList = this.f5601o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5601o.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1043h) arrayList2.get(i2)).mo6832d(this);
                }
            }
            this.f5587c = true;
        }
    }

    /* renamed from: g0 */
    public void mo6925g0(ViewGroup viewGroup) {
        C1039d dVar;
        this.f5597l = new ArrayList<>();
        this.f5598m = new ArrayList<>();
        mo6921d0(this.f5577a, this.f5581b);
        C3042oa<Animator, C1039d> N = m6950N();
        int size = N.size();
        ox4 d = qv4.m26199d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m = N.mo25350m(i);
            if (!(m == null || (dVar = N.get(m)) == null || dVar.f5606a == null || !d.equals(dVar.f5608a))) {
                th4 th4 = dVar.f5609a;
                View view = dVar.f5606a;
                th4 U = mo6908U(view, true);
                th4 J = mo6899J(view, true);
                if (U == null && J == null) {
                    J = this.f5581b.f21379a.get(view);
                }
                if (!(U == null && J == null) && dVar.f5607a.mo6909V(th4, J)) {
                    if (m.isRunning() || m.isStarted()) {
                        m.cancel();
                    } else {
                        N.remove(m);
                    }
                }
            }
        }
        mo6942r(viewGroup, this.f5577a, this.f5581b, this.f5597l, this.f5598m);
        mo6938o0();
    }

    @mr2
    /* renamed from: h0 */
    public Transition mo6926h0(@mr2 C1043h hVar) {
        ArrayList<C1043h> arrayList = this.f5601o;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.f5601o.size() == 0) {
            this.f5601o = null;
        }
        return this;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: i */
    public void mo6927i(Animator animator) {
        if (animator == null) {
            mo6944s();
            return;
        }
        if (mo6895F() >= 0) {
            animator.setDuration(mo6895F());
        }
        if (mo6903O() >= 0) {
            animator.setStartDelay(mo6903O() + animator.getStartDelay());
        }
        if (mo6898I() != null) {
            animator.setInterpolator(mo6898I());
        }
        animator.addListener(new C1038c());
        animator.start();
    }

    @mr2
    /* renamed from: i0 */
    public Transition mo6928i0(@mo1 int i) {
        if (i != 0) {
            this.f5578a.remove(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: j */
    public abstract void mo6800j(@mr2 th4 th4);

    @mr2
    /* renamed from: j0 */
    public Transition mo6929j0(@mr2 View view) {
        this.f5583b.remove(view);
        return this;
    }

    /* renamed from: k */
    public final void mo6930k(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5590e;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5591f;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5592g;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f5592g.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        th4 th4 = new th4(view);
                        if (z) {
                            mo6801m(th4);
                        } else {
                            mo6800j(th4);
                        }
                        th4.f20845a.add(this);
                        mo6932l(th4);
                        m6954g(z ? this.f5577a : this.f5581b, view, th4);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5594i;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5595j;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5596k;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f5596k.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    mo6930k(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @mr2
    /* renamed from: k0 */
    public Transition mo6931k0(@mr2 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f5588d;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* renamed from: l */
    public void mo6932l(th4 th4) {
        String[] b;
        if (this.f5576a != null && !th4.f20846a.isEmpty() && (b = this.f5576a.mo16959b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!th4.f20846a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f5576a.mo16958a(th4);
            }
        }
    }

    @mr2
    /* renamed from: l0 */
    public Transition mo6933l0(@mr2 String str) {
        ArrayList<String> arrayList = this.f5586c;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    /* renamed from: m */
    public abstract void mo6801m(@mr2 th4 th4);

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: m0 */
    public void mo6934m0(View view) {
        if (this.f5587c) {
            if (!this.f5589d) {
                C3042oa<Animator, C1039d> N = m6950N();
                int size = N.size();
                ox4 d = qv4.m26199d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1039d q = N.mo25352q(i);
                    if (q.f5606a != null && d.equals(q.f5608a)) {
                        C1050a.m7120c(N.mo25350m(i));
                    }
                }
                ArrayList<C1043h> arrayList = this.f5601o;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5601o.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1043h) arrayList2.get(i2)).mo6830b(this);
                    }
                }
            }
            this.f5587c = false;
        }
    }

    /* renamed from: n */
    public void mo6935n(ViewGroup viewGroup, boolean z) {
        C3042oa<String, String> oaVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo6937o(z);
        if ((this.f5578a.size() > 0 || this.f5583b.size() > 0) && (((arrayList = this.f5586c) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5588d) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f5578a.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5578a.get(i).intValue());
                if (findViewById != null) {
                    th4 th4 = new th4(findViewById);
                    if (z) {
                        mo6801m(th4);
                    } else {
                        mo6800j(th4);
                    }
                    th4.f20845a.add(this);
                    mo6932l(th4);
                    m6954g(z ? this.f5577a : this.f5581b, findViewById, th4);
                }
            }
            for (int i2 = 0; i2 < this.f5583b.size(); i2++) {
                View view = this.f5583b.get(i2);
                th4 th42 = new th4(view);
                if (z) {
                    mo6801m(th42);
                } else {
                    mo6800j(th42);
                }
                th42.f20845a.add(this);
                mo6932l(th42);
                m6954g(z ? this.f5577a : this.f5581b, view, th42);
            }
        } else {
            mo6930k(viewGroup, z);
        }
        if (!z && (oaVar = this.f5575a) != null) {
            int size = oaVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f5577a.f21380b.remove(this.f5575a.mo25350m(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f5577a.f21380b.put(this.f5575a.mo25352q(i4), view2);
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void mo6936n0(Animator animator, C3042oa<Animator, C1039d> oaVar) {
        if (animator != null) {
            animator.addListener(new C1037b(oaVar));
            mo6927i(animator);
        }
    }

    /* renamed from: o */
    public void mo6937o(boolean z) {
        uh4 uh4;
        if (z) {
            this.f5577a.f21379a.clear();
            this.f5577a.f21377a.clear();
            uh4 = this.f5577a;
        } else {
            this.f5581b.f21379a.clear();
            this.f5581b.f21377a.clear();
            uh4 = this.f5581b;
        }
        uh4.f21378a.mo16410b();
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: o0 */
    public void mo6938o0() {
        mo6957y0();
        C3042oa<Animator, C1039d> N = m6950N();
        Iterator<Animator> it = this.f5602p.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (N.containsKey(next)) {
                mo6957y0();
                mo6936n0(next, N);
            }
        }
        this.f5602p.clear();
        mo6944s();
    }

    /* renamed from: p */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f5602p = new ArrayList<>();
            transition.f5577a = new uh4();
            transition.f5581b = new uh4();
            transition.f5597l = null;
            transition.f5598m = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: p0 */
    public void mo6940p0(boolean z) {
        this.f5584b = z;
    }

    @ts2
    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        return null;
    }

    @mr2
    /* renamed from: q0 */
    public Transition mo6941q0(long j) {
        this.f5585c = j;
        return this;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: r */
    public void mo6942r(ViewGroup viewGroup, uh4 uh4, uh4 uh42, ArrayList<th4> arrayList, ArrayList<th4> arrayList2) {
        int i;
        int i2;
        Animator q;
        View view;
        Animator animator;
        th4 th4;
        th4 th42;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C3042oa<Animator, C1039d> N = m6950N();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            th4 th43 = arrayList.get(i3);
            th4 th44 = arrayList2.get(i3);
            if (th43 != null && !th43.f20845a.contains(this)) {
                th43 = null;
            }
            if (th44 != null && !th44.f20845a.contains(this)) {
                th44 = null;
            }
            if (!(th43 == null && th44 == null)) {
                if ((th43 == null || th44 == null || mo6909V(th43, th44)) && (q = mo6802q(viewGroup2, th43, th44)) != null) {
                    if (th44 != null) {
                        view = th44.f20844a;
                        String[] T = mo6799T();
                        if (T != null && T.length > 0) {
                            th42 = new th4(view);
                            Animator animator3 = q;
                            i2 = size;
                            th4 th45 = uh42.f21379a.get(view);
                            if (th45 != null) {
                                int i4 = 0;
                                while (i4 < T.length) {
                                    th42.f20846a.put(T[i4], th45.f20846a.get(T[i4]));
                                    i4++;
                                    ArrayList<th4> arrayList3 = arrayList2;
                                    i3 = i3;
                                    th45 = th45;
                                }
                            }
                            i = i3;
                            int size2 = N.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C1039d dVar = N.get(N.mo25350m(i5));
                                if (dVar.f5609a != null && dVar.f5606a == view && dVar.f5610a.equals(mo6900K()) && dVar.f5609a.equals(th42)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = q;
                            th42 = null;
                        }
                        animator = animator2;
                        th4 = th42;
                    } else {
                        i2 = size;
                        i = i3;
                        view = th43.f20844a;
                        animator = q;
                        th4 = null;
                    }
                    if (animator != null) {
                        ph4 ph4 = this.f5576a;
                        if (ph4 != null) {
                            long c = ph4.mo19242c(viewGroup2, this, th43, th44);
                            sparseIntArray.put(this.f5602p.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        N.put(animator, new C1039d(view, mo6900K(), this, qv4.m26199d(viewGroup), th4));
                        this.f5602p.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f5602p.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: r0 */
    public void mo6943r0(@ts2 C1041f fVar) {
        this.f5573a = fVar;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: s */
    public void mo6944s() {
        int i = this.f5599n - 1;
        this.f5599n = i;
        if (i == 0) {
            ArrayList<C1043h> arrayList = this.f5601o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5601o.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1043h) arrayList2.get(i2)).mo6833e(this);
                }
            }
            for (int i3 = 0; i3 < this.f5577a.f21378a.mo16433w(); i3++) {
                View x = this.f5577a.f21378a.mo16434x(i3);
                if (x != null) {
                    jt4.m18903Q1(x, false);
                }
            }
            for (int i4 = 0; i4 < this.f5581b.f21378a.mo16433w(); i4++) {
                View x2 = this.f5581b.f21378a.mo16434x(i4);
                if (x2 != null) {
                    jt4.m18903Q1(x2, false);
                }
            }
            this.f5589d = true;
        }
    }

    @mr2
    /* renamed from: s0 */
    public Transition mo6945s0(@ts2 TimeInterpolator timeInterpolator) {
        this.f5570a = timeInterpolator;
        return this;
    }

    @mr2
    /* renamed from: t */
    public Transition mo6946t(@mo1 int i, boolean z) {
        this.f5594i = mo6953w(this.f5594i, i, z);
        return this;
    }

    /* renamed from: t0 */
    public void mo6947t0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f5579a = f5557b;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m6951W(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m6955h(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f5579a = (int[]) iArr.clone();
    }

    public String toString() {
        return mo6959z0("");
    }

    @mr2
    /* renamed from: u */
    public Transition mo6949u(@mr2 View view, boolean z) {
        this.f5595j = mo6893D(this.f5595j, view, z);
        return this;
    }

    /* renamed from: u0 */
    public void mo6950u0(@ts2 PathMotion pathMotion) {
        if (pathMotion == null) {
            pathMotion = f5556b;
        }
        this.f5572a = pathMotion;
    }

    @mr2
    /* renamed from: v */
    public Transition mo6951v(@mr2 Class<?> cls, boolean z) {
        this.f5596k = mo6892C(this.f5596k, cls, z);
        return this;
    }

    /* renamed from: v0 */
    public void mo6952v0(@ts2 ph4 ph4) {
        this.f5576a = ph4;
    }

    /* renamed from: w */
    public final ArrayList<Integer> mo6953w(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        Integer valueOf = Integer.valueOf(i);
        return z ? C1040e.m7029a(arrayList, valueOf) : C1040e.m7030b(arrayList, valueOf);
    }

    /* renamed from: w0 */
    public Transition mo6954w0(ViewGroup viewGroup) {
        this.f5571a = viewGroup;
        return this;
    }

    @mr2
    /* renamed from: x0 */
    public Transition mo6955x0(long j) {
        this.f5580b = j;
        return this;
    }

    @mr2
    /* renamed from: y */
    public Transition mo6956y(@mo1 int i, boolean z) {
        this.f5590e = mo6953w(this.f5590e, i, z);
        return this;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: y0 */
    public void mo6957y0() {
        if (this.f5599n == 0) {
            ArrayList<C1043h> arrayList = this.f5601o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5601o.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1043h) arrayList2.get(i)).mo6964a(this);
                }
            }
            this.f5589d = false;
        }
        this.f5599n++;
    }

    @mr2
    /* renamed from: z */
    public Transition mo6958z(@mr2 View view, boolean z) {
        this.f5591f = mo6893D(this.f5591f, view, z);
        return this;
    }

    /* renamed from: z0 */
    public String mo6959z0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5585c != -1) {
            str2 = str2 + "dur(" + this.f5585c + ") ";
        }
        if (this.f5580b != -1) {
            str2 = str2 + "dly(" + this.f5580b + ") ";
        }
        if (this.f5570a != null) {
            str2 = str2 + "interp(" + this.f5570a + ") ";
        }
        if (this.f5578a.size() <= 0 && this.f5583b.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f5578a.size() > 0) {
            for (int i = 0; i < this.f5578a.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5578a.get(i);
            }
        }
        if (this.f5583b.size() > 0) {
            for (int i2 = 0; i2 < this.f5583b.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5583b.get(i2);
            }
        }
        return str3 + pl2.f33727d;
    }
}
