package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.c32;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.lifecycle.j */
public class C0703j extends Fragment {

    /* renamed from: b */
    public static final String f4108b = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* renamed from: a */
    public C0704a f4109a;

    /* renamed from: androidx.lifecycle.j$a */
    public interface C0704a {
        /* renamed from: d */
        void mo4986d();

        /* renamed from: f */
        void mo4987f();

        /* renamed from: g */
        void mo4988g();
    }

    @sj3(29)
    /* renamed from: androidx.lifecycle.j$b */
    public static class C0705b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0705b());
        }

        public void onActivityCreated(@mr2 Activity activity, @ts2 Bundle bundle) {
        }

        public void onActivityDestroyed(@mr2 Activity activity) {
        }

        public void onActivityPaused(@mr2 Activity activity) {
        }

        public void onActivityPostCreated(@mr2 Activity activity, @ts2 Bundle bundle) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_CREATE);
        }

        public void onActivityPostResumed(@mr2 Activity activity) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_RESUME);
        }

        public void onActivityPostStarted(@mr2 Activity activity) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_START);
        }

        public void onActivityPreDestroyed(@mr2 Activity activity) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_DESTROY);
        }

        public void onActivityPrePaused(@mr2 Activity activity) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_PAUSE);
        }

        public void onActivityPreStopped(@mr2 Activity activity) {
            C0703j.m4829a(activity, C0690e.C0692b.ON_STOP);
        }

        public void onActivityResumed(@mr2 Activity activity) {
        }

        public void onActivitySaveInstanceState(@mr2 Activity activity, @mr2 Bundle bundle) {
        }

        public void onActivityStarted(@mr2 Activity activity) {
        }

        public void onActivityStopped(@mr2 Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m4829a(@mr2 Activity activity, @mr2 C0690e.C0692b bVar) {
        if (activity instanceof c32) {
            ((c32) activity).mo13968x().mo4968j(bVar);
        } else if (activity instanceof a32) {
            C0690e lifecycle = ((a32) activity).getLifecycle();
            if (lifecycle instanceof C0695g) {
                ((C0695g) lifecycle).mo4968j(bVar);
            }
        }
    }

    /* renamed from: f */
    public static C0703j m4830f(Activity activity) {
        return (C0703j) activity.getFragmentManager().findFragmentByTag(f4108b);
    }

    /* renamed from: g */
    public static void m4831g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0705b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(f4108b) == null) {
            fragmentManager.beginTransaction().add(new C0703j(), f4108b).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo4995b(@mr2 C0690e.C0692b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4829a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    public final void mo4996c(C0704a aVar) {
        if (aVar != null) {
            aVar.mo4988g();
        }
    }

    /* renamed from: d */
    public final void mo4997d(C0704a aVar) {
        if (aVar != null) {
            aVar.mo4987f();
        }
    }

    /* renamed from: e */
    public final void mo4998e(C0704a aVar) {
        if (aVar != null) {
            aVar.mo4986d();
        }
    }

    /* renamed from: h */
    public void mo4999h(C0704a aVar) {
        this.f4109a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo4996c(this.f4109a);
        mo4995b(C0690e.C0692b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo4995b(C0690e.C0692b.ON_DESTROY);
        this.f4109a = null;
    }

    public void onPause() {
        super.onPause();
        mo4995b(C0690e.C0692b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        mo4997d(this.f4109a);
        mo4995b(C0690e.C0692b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        mo4998e(this.f4109a);
        mo4995b(C0690e.C0692b.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo4995b(C0690e.C0692b.ON_STOP);
    }
}
