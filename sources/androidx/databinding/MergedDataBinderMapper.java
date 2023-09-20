package androidx.databinding;

import android.util.Log;
import android.view.View;
import com.onedelhi.secure.dd0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends dd0 {

    /* renamed from: a */
    public static final String f3373a = "MergedDataBinderMapper";

    /* renamed from: a */
    public List<dd0> f3374a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public Set<Class<? extends dd0>> f3375a = new HashSet();

    /* renamed from: b */
    public List<String> f3376b = new CopyOnWriteArrayList();

    /* renamed from: b */
    public String mo3901b(int i) {
        for (dd0 b : this.f3374a) {
            String b2 = b.mo3901b(i);
            if (b2 != null) {
                return b2;
            }
        }
        if (mo3907h()) {
            return mo3901b(i);
        }
        return null;
    }

    /* renamed from: c */
    public ViewDataBinding mo3902c(DataBindingComponent dataBindingComponent, View view, int i) {
        for (dd0 c : this.f3374a) {
            ViewDataBinding c2 = c.mo3902c(dataBindingComponent, view, i);
            if (c2 != null) {
                return c2;
            }
        }
        if (mo3907h()) {
            return mo3902c(dataBindingComponent, view, i);
        }
        return null;
    }

    /* renamed from: d */
    public ViewDataBinding mo3903d(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        for (dd0 d : this.f3374a) {
            ViewDataBinding d2 = d.mo3903d(dataBindingComponent, viewArr, i);
            if (d2 != null) {
                return d2;
            }
        }
        if (mo3907h()) {
            return mo3903d(dataBindingComponent, viewArr, i);
        }
        return null;
    }

    /* renamed from: e */
    public int mo3904e(String str) {
        for (dd0 e : this.f3374a) {
            int e2 = e.mo3904e(str);
            if (e2 != 0) {
                return e2;
            }
        }
        if (mo3907h()) {
            return mo3904e(str);
        }
        return 0;
    }

    /* renamed from: f */
    public void mo3905f(dd0 dd0) {
        if (this.f3375a.add(dd0.getClass())) {
            this.f3374a.add(dd0);
            for (dd0 f : dd0.mo4023a()) {
                mo3905f(f);
            }
        }
    }

    /* renamed from: g */
    public void mo3906g(String str) {
        List<String> list = this.f3376b;
        list.add(str + ".DataBinderMapperImpl");
    }

    /* renamed from: h */
    public final boolean mo3907h() {
        StringBuilder sb;
        boolean z = false;
        for (String next : this.f3376b) {
            try {
                Class<?> cls = Class.forName(next);
                if (dd0.class.isAssignableFrom(cls)) {
                    mo3905f((dd0) cls.newInstance());
                    this.f3376b.remove(next);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(next);
                Log.e(f3373a, sb.toString(), e);
            } catch (InstantiationException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(next);
                Log.e(f3373a, sb.toString(), e);
            }
        }
        return z;
    }
}
