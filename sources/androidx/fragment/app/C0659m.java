package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1052b;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.C3345qu;
import com.onedelhi.secure.gb1;
import com.onedelhi.secure.hb1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.px3;
import com.onedelhi.secure.ta1;
import com.onedelhi.secure.tv2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.fragment.app.m */
public class C0659m {

    /* renamed from: a */
    public static final hb1 f3948a = new gb1();

    /* renamed from: a */
    public static final int[] f3949a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final hb1 f3950b = m4679x();

    /* renamed from: androidx.fragment.app.m$a */
    public class C0660a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Fragment f3951a;

        /* renamed from: a */
        public final /* synthetic */ C0666g f3952a;

        /* renamed from: a */
        public final /* synthetic */ C3345qu f3953a;

        public C0660a(C0666g gVar, Fragment fragment, C3345qu quVar) {
            this.f3952a = gVar;
            this.f3951a = fragment;
            this.f3953a = quVar;
        }

        public void run() {
            this.f3952a.mo4642b(this.f3951a, this.f3953a);
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    public class C0661b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f3954a;

        public C0661b(ArrayList arrayList) {
            this.f3954a = arrayList;
        }

        public void run() {
            C0659m.m4653B(this.f3954a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    public class C0662c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Fragment f3955a;

        /* renamed from: a */
        public final /* synthetic */ C0666g f3956a;

        /* renamed from: a */
        public final /* synthetic */ C3345qu f3957a;

        public C0662c(C0666g gVar, Fragment fragment, C3345qu quVar) {
            this.f3956a = gVar;
            this.f3955a = fragment;
            this.f3957a = quVar;
        }

        public void run() {
            this.f3956a.mo4642b(this.f3955a, this.f3957a);
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    public class C0663d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f3958a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3959a;

        /* renamed from: a */
        public final /* synthetic */ hb1 f3960a;

        /* renamed from: a */
        public final /* synthetic */ Object f3961a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f3962a;

        /* renamed from: b */
        public final /* synthetic */ Object f3963b;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3964b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f3965c;

        public C0663d(Object obj, hb1 hb1, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3961a = obj;
            this.f3960a = hb1;
            this.f3958a = view;
            this.f3959a = fragment;
            this.f3962a = arrayList;
            this.f3964b = arrayList2;
            this.f3965c = arrayList3;
            this.f3963b = obj2;
        }

        public void run() {
            Object obj = this.f3961a;
            if (obj != null) {
                this.f3960a.mo7011p(obj, this.f3958a);
                this.f3964b.addAll(C0659m.m4666k(this.f3960a, this.f3961a, this.f3959a, this.f3962a, this.f3958a));
            }
            if (this.f3965c != null) {
                if (this.f3963b != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3958a);
                    this.f3960a.mo7012q(this.f3963b, this.f3965c, arrayList);
                }
                this.f3965c.clear();
                this.f3965c.add(this.f3958a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$e */
    public class C0664e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Rect f3966a;

        /* renamed from: a */
        public final /* synthetic */ View f3967a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3968a;

        /* renamed from: a */
        public final /* synthetic */ hb1 f3969a;

        /* renamed from: a */
        public final /* synthetic */ C3042oa f3970a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3971b;

        /* renamed from: b */
        public final /* synthetic */ boolean f3972b;

        public C0664e(Fragment fragment, Fragment fragment2, boolean z, C3042oa oaVar, View view, hb1 hb1, Rect rect) {
            this.f3968a = fragment;
            this.f3971b = fragment2;
            this.f3972b = z;
            this.f3970a = oaVar;
            this.f3967a = view;
            this.f3969a = hb1;
            this.f3966a = rect;
        }

        public void run() {
            C0659m.m4661f(this.f3968a, this.f3971b, this.f3972b, this.f3970a, false);
            View view = this.f3967a;
            if (view != null) {
                this.f3969a.mo17172k(view, this.f3966a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$f */
    public class C0665f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Rect f3973a;

        /* renamed from: a */
        public final /* synthetic */ View f3974a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3975a;

        /* renamed from: a */
        public final /* synthetic */ C0667h f3976a;

        /* renamed from: a */
        public final /* synthetic */ hb1 f3977a;

        /* renamed from: a */
        public final /* synthetic */ C3042oa f3978a;

        /* renamed from: a */
        public final /* synthetic */ Object f3979a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f3980a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3981b;

        /* renamed from: b */
        public final /* synthetic */ Object f3982b;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3983b;

        /* renamed from: b */
        public final /* synthetic */ boolean f3984b;

        public C0665f(hb1 hb1, C3042oa oaVar, Object obj, C0667h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3977a = hb1;
            this.f3978a = oaVar;
            this.f3979a = obj;
            this.f3976a = hVar;
            this.f3980a = arrayList;
            this.f3974a = view;
            this.f3975a = fragment;
            this.f3981b = fragment2;
            this.f3984b = z;
            this.f3983b = arrayList2;
            this.f3982b = obj2;
            this.f3973a = rect;
        }

        public void run() {
            C3042oa<String, View> h = C0659m.m4663h(this.f3977a, this.f3978a, this.f3979a, this.f3976a);
            if (h != null) {
                this.f3980a.addAll(h.values());
                this.f3980a.add(this.f3974a);
            }
            C0659m.m4661f(this.f3975a, this.f3981b, this.f3984b, h, false);
            Object obj = this.f3979a;
            if (obj != null) {
                this.f3977a.mo7002A(obj, this.f3983b, this.f3980a);
                View t = C0659m.m4675t(h, this.f3976a, this.f3982b, this.f3984b);
                if (t != null) {
                    this.f3977a.mo17172k(t, this.f3973a);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$g */
    public interface C0666g {
        /* renamed from: a */
        void mo4641a(@mr2 Fragment fragment, @mr2 C3345qu quVar);

        /* renamed from: b */
        void mo4642b(@mr2 Fragment fragment, @mr2 C3345qu quVar);
    }

    /* renamed from: androidx.fragment.app.m$h */
    public static class C0667h {

        /* renamed from: a */
        public Fragment f3985a;

        /* renamed from: a */
        public C0620a f3986a;

        /* renamed from: a */
        public boolean f3987a;

        /* renamed from: b */
        public Fragment f3988b;

        /* renamed from: b */
        public C0620a f3989b;

        /* renamed from: b */
        public boolean f3990b;
    }

    /* renamed from: A */
    public static void m4652A(hb1 hb1, Object obj, Object obj2, C3042oa<String, View> oaVar, boolean z, C0620a aVar) {
        ArrayList<String> arrayList = aVar.f3930b;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = oaVar.get((z ? aVar.f3933c : aVar.f3930b).get(0));
            hb1.mo7016v(obj, view);
            if (obj2 != null) {
                hb1.mo7016v(obj2, view);
            }
        }
    }

    /* renamed from: B */
    public static void m4653B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: C */
    public static void m4654C(@mr2 Context context, @mr2 ta1 ta1, ArrayList<C0620a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0666g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0620a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m4660e(aVar, sparseArray, z);
            } else {
                m4658c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C3042oa<String, String> d = m4659d(keyAt, arrayList, arrayList2, i, i2);
                C0667h hVar = (C0667h) sparseArray.valueAt(i4);
                if (ta1.mo4429d() && (viewGroup = (ViewGroup) ta1.mo4428c(keyAt)) != null) {
                    if (z) {
                        m4670o(viewGroup, hVar, view, d, gVar);
                    } else {
                        m4669n(viewGroup, hVar, view, d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public static boolean m4655D() {
        return (f3948a == null && f3950b == null) ? false : true;
    }

    /* renamed from: a */
    public static void m4656a(ArrayList<View> arrayList, C3042oa<String, View> oaVar, Collection<String> collection) {
        for (int size = oaVar.size() - 1; size >= 0; size--) {
            View q = oaVar.mo25352q(size);
            if (collection.contains(jt4.m19024x0(q))) {
                arrayList.add(q);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.mHidden == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4657b(androidx.fragment.app.C0620a r8, androidx.fragment.app.C0657l.C0658a r9, android.util.SparseArray<androidx.fragment.app.C0659m.C0667h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3941a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3949a
            int r9 = r9.f3940a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3940a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.mAdded
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.m$h r5 = (androidx.fragment.app.C0659m.C0667h) r5
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.m$h r5 = m4671p(r5, r10, r1)
            r5.f3985a = r0
            r5.f3987a = r11
            r5.f3986a = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r3 = r5.f3988b
            if (r3 != r0) goto L_0x00af
            r5.f3988b = r2
        L_0x00af:
            boolean r3 = r8.f3934c
            if (r3 != 0) goto L_0x00c3
            androidx.fragment.app.FragmentManager r3 = r8.f3778a
            androidx.fragment.app.j r6 = r3.mo4497A(r0)
            com.onedelhi.secure.fb1 r7 = r3.mo4513F0()
            r7.mo15926q(r6)
            r3.mo4580f1(r0)
        L_0x00c3:
            if (r4 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r3 = r5.f3988b
            if (r3 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.m$h r5 = m4671p(r5, r10, r1)
            r5.f3988b = r0
            r5.f3990b = r11
            r5.f3989b = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r5.f3985a
            if (r8 != r0) goto L_0x00e1
            r5.f3985a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0659m.m4657b(androidx.fragment.app.a, androidx.fragment.app.l$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m4658c(C0620a aVar, SparseArray<C0667h> sparseArray, boolean z) {
        int size = aVar.f3926a.size();
        for (int i = 0; i < size; i++) {
            m4657b(aVar, aVar.f3926a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    public static C3042oa<String, String> m4659d(int i, ArrayList<C0620a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C3042oa<String, String> oaVar = new C3042oa<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0620a aVar = arrayList.get(i4);
            if (aVar.mo4720b0(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.f3930b;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.f3930b;
                        arrayList4 = aVar.f3933c;
                    } else {
                        ArrayList<String> arrayList6 = aVar.f3930b;
                        arrayList3 = aVar.f3933c;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = oaVar.remove(str2);
                        if (remove != null) {
                            oaVar.put(str, remove);
                        } else {
                            oaVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return oaVar;
    }

    /* renamed from: e */
    public static void m4660e(C0620a aVar, SparseArray<C0667h> sparseArray, boolean z) {
        if (aVar.f3778a.mo4501B0().mo4429d()) {
            for (int size = aVar.f3926a.size() - 1; size >= 0; size--) {
                m4657b(aVar, aVar.f3926a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    public static void m4661f(Fragment fragment, Fragment fragment2, boolean z, C3042oa<String, View> oaVar, boolean z2) {
        px3 enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = oaVar == null ? 0 : oaVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(oaVar.mo25350m(i));
                arrayList.add(oaVar.mo25352q(i));
            }
            if (z2) {
                enterTransitionCallback.mo22684g(arrayList2, arrayList, (List<View>) null);
            } else {
                enterTransitionCallback.mo22683f(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: g */
    public static boolean m4662g(hb1 hb1, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!hb1.mo7007e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static C3042oa<String, View> m4663h(hb1 hb1, C3042oa<String, String> oaVar, Object obj, C0667h hVar) {
        px3 px3;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f3985a;
        View view = fragment.getView();
        if (oaVar.isEmpty() || obj == null || view == null) {
            oaVar.clear();
            return null;
        }
        C3042oa<String, View> oaVar2 = new C3042oa<>();
        hb1.mo17171j(oaVar2, view);
        C0620a aVar = hVar.f3986a;
        if (hVar.f3987a) {
            px3 = fragment.getExitTransitionCallback();
            arrayList = aVar.f3930b;
        } else {
            px3 = fragment.getEnterTransitionCallback();
            arrayList = aVar.f3933c;
        }
        if (arrayList != null) {
            oaVar2.mo4019u(arrayList);
            oaVar2.mo4019u(oaVar.values());
        }
        if (px3 != null) {
            px3.mo22681d(arrayList, oaVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = oaVar2.get(str);
                if (view2 == null) {
                    String q2 = m4672q(oaVar, str);
                    if (q2 != null) {
                        oaVar.remove(q2);
                    }
                } else if (!str.equals(jt4.m19024x0(view2)) && (q = m4672q(oaVar, str)) != null) {
                    oaVar.put(q, jt4.m19024x0(view2));
                }
            }
        } else {
            m4680y(oaVar, oaVar2);
        }
        return oaVar2;
    }

    /* renamed from: i */
    public static C3042oa<String, View> m4664i(hb1 hb1, C3042oa<String, String> oaVar, Object obj, C0667h hVar) {
        px3 px3;
        ArrayList<String> arrayList;
        if (oaVar.isEmpty() || obj == null) {
            oaVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3988b;
        C3042oa<String, View> oaVar2 = new C3042oa<>();
        hb1.mo17171j(oaVar2, fragment.requireView());
        C0620a aVar = hVar.f3989b;
        if (hVar.f3990b) {
            px3 = fragment.getEnterTransitionCallback();
            arrayList = aVar.f3933c;
        } else {
            px3 = fragment.getExitTransitionCallback();
            arrayList = aVar.f3930b;
        }
        if (arrayList != null) {
            oaVar2.mo4019u(arrayList);
        }
        if (px3 != null) {
            px3.mo22681d(arrayList, oaVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = oaVar2.get(str);
                if (view == null) {
                    oaVar.remove(str);
                } else if (!str.equals(jt4.m19024x0(view))) {
                    oaVar.put(jt4.m19024x0(view), oaVar.remove(str));
                }
            }
        } else {
            oaVar.mo4019u(oaVar2.keySet());
        }
        return oaVar2;
    }

    /* renamed from: j */
    public static hb1 m4665j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hb1 hb1 = f3948a;
        if (hb1 != null && m4662g(hb1, arrayList)) {
            return hb1;
        }
        hb1 hb12 = f3950b;
        if (hb12 != null && m4662g(hb12, arrayList)) {
            return hb12;
        }
        if (hb1 == null && hb12 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    public static ArrayList<View> m4666k(hb1 hb1, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            hb1.mo17170f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        hb1.mo7005b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    public static Object m4667l(hb1 hb1, ViewGroup viewGroup, View view, C3042oa<String, String> oaVar, C0667h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3042oa<String, String> oaVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        hb1 hb12 = hb1;
        C0667h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3985a;
        Fragment fragment2 = hVar2.f3988b;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3987a;
        if (oaVar.isEmpty()) {
            oaVar2 = oaVar;
            obj3 = null;
        } else {
            obj3 = m4676u(hb12, fragment, fragment2, z);
            oaVar2 = oaVar;
        }
        C3042oa<String, View> i = m4664i(hb12, oaVar2, obj3, hVar2);
        if (oaVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4661f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            hb12.mo7017z(obj4, view, arrayList3);
            m4652A(hb1, obj4, obj2, i, hVar2.f3990b, hVar2.f3989b);
            if (obj5 != null) {
                hb12.mo7015u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0665f fVar = r0;
        C0665f fVar2 = new C0665f(hb1, oaVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        tv2.m28961a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    public static Object m4668m(hb1 hb1, ViewGroup viewGroup, View view, C3042oa<String, String> oaVar, C0667h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        hb1 hb12 = hb1;
        View view3 = view;
        C3042oa<String, String> oaVar2 = oaVar;
        C0667h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f3985a;
        Fragment fragment2 = hVar2.f3988b;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3987a;
        Object u = oaVar.isEmpty() ? null : m4676u(hb1, fragment, fragment2, z);
        C3042oa<String, View> i = m4664i(hb1, oaVar2, u, hVar2);
        C3042oa<String, View> h = m4663h(hb1, oaVar2, u, hVar2);
        if (oaVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            m4656a(arrayList3, i, oaVar.keySet());
            m4656a(arrayList4, h, oaVar.values());
            obj3 = u;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4661f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            hb1.mo7017z(obj3, view3, arrayList3);
            m4652A(hb1, obj3, obj2, i, hVar2.f3990b, hVar2.f3989b);
            Rect rect2 = new Rect();
            View t = m4675t(h, hVar2, obj4, z);
            if (t != null) {
                hb1.mo7015u(obj4, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        tv2.m28961a(viewGroup, new C0664e(fragment, fragment2, z, h, view2, hb1, rect));
        return obj3;
    }

    /* renamed from: n */
    public static void m4669n(@mr2 ViewGroup viewGroup, C0667h hVar, View view, C3042oa<String, String> oaVar, C0666g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        C0667h hVar2 = hVar;
        View view2 = view;
        C3042oa<String, String> oaVar2 = oaVar;
        C0666g gVar2 = gVar;
        Fragment fragment = hVar2.f3985a;
        Fragment fragment2 = hVar2.f3988b;
        hb1 j = m4665j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3987a;
            boolean z2 = hVar2.f3990b;
            Object r = m4673r(j, fragment, z);
            Object s = m4674s(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            hb1 hb1 = j;
            Object l = m4667l(j, viewGroup, view, oaVar, hVar, arrayList, arrayList2, r, obj2);
            Object obj3 = r;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m4666k(hb1, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            hb1.mo7004a(obj3, view2);
            Object v = m4677v(hb1, obj3, obj4, l, fragment, hVar2.f3987a);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C3345qu quVar = new C3345qu();
                gVar2.mo4641a(fragment2, quVar);
                hb1.mo16455w(fragment2, v, quVar, new C0662c(gVar2, fragment2, quVar));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                hb1 hb12 = hb1;
                hb12.mo7014t(v, obj3, arrayList5, obj4, k, l, arrayList2);
                m4681z(hb12, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k);
                ViewGroup viewGroup3 = viewGroup;
                hb1 hb13 = hb1;
                ArrayList arrayList6 = arrayList2;
                hb13.mo17175x(viewGroup3, arrayList6, oaVar2);
                hb13.mo7006c(viewGroup3, v);
                hb13.mo17174s(viewGroup3, arrayList6, oaVar2);
            }
        }
    }

    /* renamed from: o */
    public static void m4670o(@mr2 ViewGroup viewGroup, C0667h hVar, View view, C3042oa<String, String> oaVar, C0666g gVar) {
        Object obj;
        C0667h hVar2 = hVar;
        View view2 = view;
        C0666g gVar2 = gVar;
        Fragment fragment = hVar2.f3985a;
        Fragment fragment2 = hVar2.f3988b;
        hb1 j = m4665j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3987a;
            boolean z2 = hVar2.f3990b;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object r = m4673r(j, fragment, z);
            Object s = m4674s(j, fragment2, z2);
            ArrayList arrayList3 = arrayList2;
            Object m = m4668m(j, viewGroup, view, oaVar, hVar, arrayList2, arrayList, r, s);
            Object obj2 = r;
            if (obj2 == null && m == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k = m4666k(j, obj, fragment2, arrayList3, view2);
            ArrayList<View> k2 = m4666k(j, obj2, fragment, arrayList, view2);
            m4653B(k2, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k;
            Object v = m4677v(j, obj2, obj, m, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                C3345qu quVar = new C3345qu();
                C0666g gVar3 = gVar;
                gVar3.mo4641a(fragment2, quVar);
                j.mo16455w(fragment2, v, quVar, new C0660a(gVar3, fragment2, quVar));
            }
            if (v != null) {
                m4678w(j, obj, fragment2, arrayList4);
                ArrayList<String> o = j.mo17173o(arrayList);
                hb1 hb1 = j;
                hb1.mo7014t(v, obj2, k2, obj, arrayList4, m, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.mo7006c(viewGroup2, v);
                hb1.mo17176y(viewGroup2, arrayList3, arrayList, o, oaVar);
                m4653B(k2, 0);
                j.mo7002A(m, arrayList3, arrayList);
            }
        }
    }

    /* renamed from: p */
    public static C0667h m4671p(C0667h hVar, SparseArray<C0667h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0667h hVar2 = new C0667h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    public static String m4672q(C3042oa<String, String> oaVar, String str) {
        int size = oaVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(oaVar.mo25352q(i))) {
                return oaVar.mo25350m(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    public static Object m4673r(hb1 hb1, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return hb1.mo7008g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* renamed from: s */
    public static Object m4674s(hb1 hb1, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return hb1.mo7008g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* renamed from: t */
    public static View m4675t(C3042oa<String, View> oaVar, C0667h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0620a aVar = hVar.f3986a;
        if (obj == null || oaVar == null || (arrayList = aVar.f3930b) == null || arrayList.isEmpty()) {
            return null;
        }
        return oaVar.get((z ? aVar.f3930b : aVar.f3933c).get(0));
    }

    /* renamed from: u */
    public static Object m4676u(hb1 hb1, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return hb1.mo7003B(hb1.mo7008g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* renamed from: v */
    public static Object m4677v(hb1 hb1, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? hb1.mo7010n(obj2, obj, obj3) : hb1.mo7009m(obj2, obj, obj3);
    }

    /* renamed from: w */
    public static void m4678w(hb1 hb1, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            hb1.mo7013r(obj, fragment.getView(), arrayList);
            tv2.m28961a(fragment.mContainer, new C0661b(arrayList));
        }
    }

    /* renamed from: x */
    public static hb1 m4679x() {
        try {
            return C1052b.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    public static void m4680y(@mr2 C3042oa<String, String> oaVar, @mr2 C3042oa<String, View> oaVar2) {
        for (int size = oaVar.size() - 1; size >= 0; size--) {
            if (!oaVar2.containsKey(oaVar.mo25352q(size))) {
                oaVar.mo4015o(size);
            }
        }
    }

    /* renamed from: z */
    public static void m4681z(hb1 hb1, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        tv2.m28961a(viewGroup, new C0663d(obj, hb1, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
