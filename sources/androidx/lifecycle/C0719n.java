package androidx.lifecycle;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0709m;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@Deprecated
/* renamed from: androidx.lifecycle.n */
public class C0719n {

    @Deprecated
    /* renamed from: androidx.lifecycle.n$a */
    public static class C0720a extends C0709m.C0710a {
        @Deprecated
        public C0720a(@mr2 Application application) {
            super(application);
        }
    }

    @bc2
    @mr2
    @Deprecated
    /* renamed from: a */
    public static C0709m m4871a(@mr2 Fragment fragment) {
        return new C0709m(fragment);
    }

    @bc2
    @mr2
    @Deprecated
    /* renamed from: b */
    public static C0709m m4872b(@mr2 Fragment fragment, @ts2 C0709m.C0713b bVar) {
        if (bVar == null) {
            bVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new C0709m(fragment.getViewModelStore(), bVar);
    }

    @bc2
    @mr2
    @Deprecated
    /* renamed from: c */
    public static C0709m m4873c(@mr2 FragmentActivity fragmentActivity) {
        return new C0709m(fragmentActivity);
    }

    @bc2
    @mr2
    @Deprecated
    /* renamed from: d */
    public static C0709m m4874d(@mr2 FragmentActivity fragmentActivity, @ts2 C0709m.C0713b bVar) {
        if (bVar == null) {
            bVar = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new C0709m(fragmentActivity.getViewModelStore(), bVar);
    }
}
