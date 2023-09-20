package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@hl3({hl3.C2354a.f13188c})
public abstract class hb1 {

    /* renamed from: com.onedelhi.secure.hb1$a */
    public class C2322a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f13013a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f13014b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f13015c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f13016d;

        /* renamed from: n */
        public final /* synthetic */ int f13017n;

        public C2322a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f13017n = i;
            this.f13013a = arrayList;
            this.f13014b = arrayList2;
            this.f13015c = arrayList3;
            this.f13016d = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f13017n; i++) {
                jt4.m19010t2((View) this.f13013a.get(i), (String) this.f13014b.get(i));
                jt4.m19010t2((View) this.f13015c.get(i), (String) this.f13016d.get(i));
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hb1$b */
    public class C2323b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f13019a;

        /* renamed from: a */
        public final /* synthetic */ Map f13020a;

        public C2323b(ArrayList arrayList, Map map) {
            this.f13019a = arrayList;
            this.f13020a = map;
        }

        public void run() {
            int size = this.f13019a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f13019a.get(i);
                String x0 = jt4.m19024x0(view);
                if (x0 != null) {
                    jt4.m19010t2(view, hb1.m16587i(this.f13020a, x0));
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hb1$c */
    public class C2324c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f13022a;

        /* renamed from: a */
        public final /* synthetic */ Map f13023a;

        public C2324c(ArrayList arrayList, Map map) {
            this.f13022a = arrayList;
            this.f13023a = map;
        }

        public void run() {
            int size = this.f13022a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f13022a.get(i);
                jt4.m19010t2(view, (String) this.f13023a.get(jt4.m19024x0(view)));
            }
        }
    }

    /* renamed from: d */
    public static void m16585d(List<View> list, View view) {
        int size = list.size();
        if (!m16586h(list, view, size)) {
            if (jt4.m19024x0(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m16586h(list, childAt, size) && jt4.m19024x0(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m16586h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m16587i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m16588l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo7002A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo7003B(Object obj);

    /* renamed from: a */
    public abstract void mo7004a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo7005b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo7006c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo7007e(Object obj);

    /* renamed from: f */
    public void mo17170f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean c = ot4.m24066c(viewGroup2);
                viewGroup = viewGroup2;
                if (!c) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo17170f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo7008g(Object obj);

    /* renamed from: j */
    public void mo17171j(Map<String, View> map, @mr2 View view) {
        if (view.getVisibility() == 0) {
            String x0 = jt4.m19024x0(view);
            if (x0 != null) {
                map.put(x0, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo17171j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: k */
    public void mo17172k(View view, Rect rect) {
        if (jt4.m18896O0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo7009m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo7010n(Object obj, Object obj2, Object obj3);

    /* renamed from: o */
    public ArrayList<String> mo17173o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(jt4.m19024x0(view));
            jt4.m19010t2(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo7011p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo7012q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo7013r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    public void mo17174s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        tv2.m28961a(viewGroup, new C2324c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo7014t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo7015u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo7016v(Object obj, View view);

    /* renamed from: w */
    public void mo16455w(@mr2 Fragment fragment, @mr2 Object obj, @mr2 C3345qu quVar, @mr2 Runnable runnable) {
        runnable.run();
    }

    /* renamed from: x */
    public void mo17175x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        tv2.m28961a(view, new C2323b(arrayList, map));
    }

    /* renamed from: y */
    public void mo17176y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String x0 = jt4.m19024x0(view2);
            arrayList4.add(x0);
            if (x0 != null) {
                jt4.m19010t2(view2, (String) null);
                String str = map.get(x0);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        jt4.m19010t2(arrayList2.get(i2), x0);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        tv2.m28961a(view, new C2322a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo7017z(Object obj, View view, ArrayList<View> arrayList);
}
