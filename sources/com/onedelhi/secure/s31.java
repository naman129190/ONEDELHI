package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import com.onedelhi.secure.C4623b5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class s31 {
    @hw4

    /* renamed from: b */
    public static final String f34906b = "com.google.firebase.abt";
    @hw4

    /* renamed from: c */
    public static final String f34907c = "%s_lastKnownExperimentStartTime";

    /* renamed from: a */
    public final b73<C4623b5> f34908a;
    @ts2

    /* renamed from: a */
    public Integer f34909a = null;

    /* renamed from: a */
    public final String f34910a;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.s31$a */
    public @interface C6748a {

        /* renamed from: r */
        public static final String f34911r = "frc";

        /* renamed from: s */
        public static final String f34912s = "fiam";
    }

    public s31(Context context, b73<C4623b5> b73, String str) {
        this.f34908a = b73;
        this.f34910a = str;
    }

    /* renamed from: c */
    public static List<C6819t1> m64166c(List<Map<String, String>> list) throws C6733s1 {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> b : list) {
            arrayList.add(C6819t1.m65122b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo44184a(C4623b5.C4626c cVar) {
        this.f34908a.get().mo31399c(cVar);
    }

    /* renamed from: b */
    public final void mo44185b(List<C6819t1> list) {
        ArrayDeque arrayDeque = new ArrayDeque(mo44188f());
        int i = mo44191i();
        for (C6819t1 next : list) {
            while (arrayDeque.size() >= i) {
                mo44193k(((C4623b5.C4626c) arrayDeque.pollFirst()).f26149b);
            }
            C4623b5.C4626c i2 = next.mo44731i(this.f34910a);
            mo44184a(i2);
            arrayDeque.offer(i2);
        }
    }

    /* renamed from: d */
    public final boolean mo44186d(List<C6819t1> list, C6819t1 t1Var) {
        String c = t1Var.mo44725c();
        String h = t1Var.mo44730h();
        for (C6819t1 next : list) {
            if (next.mo44725c().equals(c) && next.mo44730h().equals(h)) {
                return true;
            }
        }
        return false;
    }

    @ly4
    /* renamed from: e */
    public List<C6819t1> mo44187e() throws C6733s1 {
        mo44198p();
        List<C4623b5.C4626c> f = mo44188f();
        ArrayList arrayList = new ArrayList();
        for (C4623b5.C4626c a : f) {
            arrayList.add(C6819t1.m65121a(a));
        }
        return arrayList;
    }

    @ly4
    /* renamed from: f */
    public final List<C4623b5.C4626c> mo44188f() {
        return this.f34908a.get().mo31403f(this.f34910a, "");
    }

    /* renamed from: g */
    public final ArrayList<C6819t1> mo44189g(List<C6819t1> list, List<C6819t1> list2) {
        ArrayList<C6819t1> arrayList = new ArrayList<>();
        for (C6819t1 next : list) {
            if (!mo44186d(list2, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final ArrayList<C4623b5.C4626c> mo44190h(List<C6819t1> list, List<C6819t1> list2) {
        ArrayList<C4623b5.C4626c> arrayList = new ArrayList<>();
        for (C6819t1 next : list) {
            if (!mo44186d(list2, next)) {
                arrayList.add(next.mo44731i(this.f34910a));
            }
        }
        return arrayList;
    }

    @ly4
    /* renamed from: i */
    public final int mo44191i() {
        if (this.f34909a == null) {
            this.f34909a = Integer.valueOf(this.f34908a.get().mo31402e(this.f34910a));
        }
        return this.f34909a.intValue();
    }

    @ly4
    /* renamed from: j */
    public void mo44192j() throws C6733s1 {
        mo44198p();
        mo44194l(mo44188f());
    }

    /* renamed from: k */
    public final void mo44193k(String str) {
        this.f34908a.get().clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: l */
    public final void mo44194l(Collection<C4623b5.C4626c> collection) {
        for (C4623b5.C4626c cVar : collection) {
            mo44193k(cVar.f26149b);
        }
    }

    @ly4
    /* renamed from: m */
    public void mo44195m(List<Map<String, String>> list) throws C6733s1 {
        mo44198p();
        if (list != null) {
            mo44196n(m64166c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    /* renamed from: n */
    public final void mo44196n(List<C6819t1> list) throws C6733s1 {
        if (list.isEmpty()) {
            mo44192j();
            return;
        }
        List<C6819t1> e = mo44187e();
        mo44194l(mo44190h(e, list));
        mo44185b(mo44189g(list, e));
    }

    @ly4
    /* renamed from: o */
    public void mo44197o(C6819t1 t1Var) throws C6733s1 {
        mo44198p();
        C6819t1.m65123k(t1Var);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j = t1Var.mo44732j();
        j.remove(C6819t1.f35325f);
        arrayList.add(C6819t1.m65122b(j));
        mo44185b(arrayList);
    }

    /* renamed from: p */
    public final void mo44198p() throws C6733s1 {
        if (this.f34908a.get() == null) {
            throw new C6733s1("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @ly4
    /* renamed from: q */
    public void mo44199q(List<C6819t1> list) throws C6733s1 {
        mo44198p();
        mo44194l(mo44190h(mo44187e(), list));
    }
}
