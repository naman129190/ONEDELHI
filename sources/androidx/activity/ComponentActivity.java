package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.C0689d;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import androidx.lifecycle.C0695g;
import androidx.lifecycle.C0703j;
import androidx.lifecycle.C0706k;
import androidx.lifecycle.C0709m;
import com.onedelhi.secure.C1936d3;
import com.onedelhi.secure.C2470j3;
import com.onedelhi.secure.C2593k3;
import com.onedelhi.secure.C2691l3;
import com.onedelhi.secure.C2811m3;
import com.onedelhi.secure.C2921n3;
import com.onedelhi.secure.C3023o3;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ah2;
import com.onedelhi.secure.av2;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.c30;
import com.onedelhi.secure.cm2;
import com.onedelhi.secure.cr3;
import com.onedelhi.secure.d30;
import com.onedelhi.secure.dh2;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.e30;
import com.onedelhi.secure.f23;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.jb0;
import com.onedelhi.secure.kh2;
import com.onedelhi.secure.km2;
import com.onedelhi.secure.kv4;
import com.onedelhi.secure.lu2;
import com.onedelhi.secure.lv4;
import com.onedelhi.secure.m70;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mv4;
import com.onedelhi.secure.ov4;
import com.onedelhi.secure.p70;
import com.onedelhi.secure.pu2;
import com.onedelhi.secure.pv2;
import com.onedelhi.secure.q70;
import com.onedelhi.secure.ru2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.s60;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xq3;
import com.onedelhi.secure.yu2;
import com.onedelhi.secure.zf4;
import com.onedelhi.secure.zu2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements p70, a32, hu4, C0689d, dr3, lu2, C3023o3, C2593k3, pu2, pv2, zu2, yu2, av2, ah2 {

    /* renamed from: b */
    public static final String f570b = "android:support:activity-result";

    /* renamed from: a */
    public final OnBackPressedDispatcher f571a;

    /* renamed from: a */
    public final ActivityResultRegistry f572a;

    /* renamed from: a */
    public C0709m.C0713b f573a;

    /* renamed from: a */
    public final cr3 f574a;

    /* renamed from: a */
    public final dh2 f575a;

    /* renamed from: a */
    public gu4 f576a;

    /* renamed from: a */
    public final q70 f577a;

    /* renamed from: a */
    public final CopyOnWriteArrayList<s60<Configuration>> f578a;

    /* renamed from: a */
    public final AtomicInteger f579a;

    /* renamed from: b */
    public final C0695g f580b;

    /* renamed from: b */
    public final CopyOnWriteArrayList<s60<Integer>> f581b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<s60<Intent>> f582c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<s60<cm2>> f583d;

    /* renamed from: e */
    public final CopyOnWriteArrayList<s60<f23>> f584e;
    @s12

    /* renamed from: n */
    public int f585n;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0147a implements Runnable {
        public C0147a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0148b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        public class C0149a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2691l3.C2692a f592a;

            /* renamed from: n */
            public final /* synthetic */ int f593n;

            public C0149a(int i, C2691l3.C2692a aVar) {
                this.f593n = i;
                this.f592a = aVar;
            }

            public void run() {
                C0148b.this.mo682c(this.f593n, this.f592a.mo19273a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        public class C0150b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ IntentSender.SendIntentException f594a;

            /* renamed from: n */
            public final /* synthetic */ int f596n;

            public C0150b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f596n = i;
                this.f594a = sendIntentException;
            }

            public void run() {
                C0148b.this.mo681b(this.f596n, 0, new Intent().setAction(C2811m3.C2826l.f15893a).putExtra(C2811m3.C2826l.f15895c, this.f594a));
            }
        }

        public C0148b() {
        }

        /* renamed from: f */
        public <I, O> void mo671f(int i, @mr2 C2691l3<I, O> l3Var, I i2, @ts2 C1936d3 d3Var) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C2691l3.C2692a<O> b = l3Var.mo19272b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0149a(i, b));
                return;
            }
            Intent a = l3Var.mo4654a(componentActivity, i2);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra(C2811m3.C2824k.f15891a)) {
                bundle = a.getBundleExtra(C2811m3.C2824k.f15891a);
                a.removeExtra(C2811m3.C2824k.f15891a);
            } else if (d3Var != null) {
                bundle = d3Var.mo14459l();
            }
            Bundle bundle2 = bundle;
            if (C2811m3.C2821i.f15887a.equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra(C2811m3.C2821i.f15888b);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C3962y2.m31859G(componentActivity, stringArrayExtra, i);
            } else if (C2811m3.C2826l.f15893a.equals(a.getAction())) {
                ts1 ts1 = (ts1) a.getParcelableExtra(C2811m3.C2826l.f15894b);
                try {
                    C3962y2.m31867O(componentActivity, ts1.mo25294d(), i, ts1.mo25291a(), ts1.mo25292b(), ts1.mo25293c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0150b(i, e));
                }
            } else {
                C3962y2.m31866N(componentActivity, a, i, bundle2);
            }
        }
    }

    @sj3(19)
    /* renamed from: androidx.activity.ComponentActivity$c */
    public static class C0151c {
        /* renamed from: a */
        public static void m1081a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public static final class C0152d {

        /* renamed from: a */
        public gu4 f597a;

        /* renamed from: a */
        public Object f598a;
    }

    public ComponentActivity() {
        this.f577a = new q70();
        this.f575a = new dh2(new e30(this));
        this.f580b = new C0695g(this);
        cr3 a = cr3.m12700a(this);
        this.f574a = a;
        this.f571a = new OnBackPressedDispatcher(new C0147a());
        this.f579a = new AtomicInteger();
        this.f572a = new C0148b();
        this.f578a = new CopyOnWriteArrayList<>();
        this.f581b = new CopyOnWriteArrayList<>();
        this.f582c = new CopyOnWriteArrayList<>();
        this.f583d = new CopyOnWriteArrayList<>();
        this.f584e = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo4958a(new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    if (bVar == C0690e.C0692b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            C0151c.m1081a(peekDecorView);
                        }
                    }
                }
            });
            getLifecycle().mo4958a(new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    if (bVar == C0690e.C0692b.ON_DESTROY) {
                        ComponentActivity.this.f577a.mo22857b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo16917a();
                        }
                    }
                }
            });
            getLifecycle().mo4958a(new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    ComponentActivity.this.mo636o0();
                    ComponentActivity.this.getLifecycle().mo4960c(this);
                }
            });
            a.mo14341c();
            xq3.m31625c(this);
            if (i <= 23) {
                getLifecycle().mo4958a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo13803j(f570b, new d30(this));
            mo626b0(new c30(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @m70
    public ComponentActivity(@s12 int i) {
        this();
        this.f585n = i;
    }

    /* renamed from: q0 */
    private void m1050q0() {
        kv4.m20051b(getWindow().getDecorView(), this);
        ov4.m24127b(getWindow().getDecorView(), this);
        mv4.m22038b(getWindow().getDecorView(), this);
        lv4.m21020b(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ Bundle m1051r0() {
        Bundle bundle = new Bundle();
        this.f572a.mo686h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m1052s0(Context context) {
        Bundle b = getSavedStateRegistry().mo13796b(f570b);
        if (b != null) {
            this.f572a.mo685g(b);
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: A */
    public void mo613A(@mr2 kh2 kh2, @mr2 a32 a32, @mr2 C0690e.C0693c cVar) {
        this.f575a.mo14660e(kh2, a32, cVar);
    }

    @mr2
    /* renamed from: C */
    public final OnBackPressedDispatcher mo614C() {
        return this.f571a;
    }

    /* renamed from: D */
    public final void mo615D(@mr2 s60<cm2> s60) {
        this.f583d.remove(s60);
    }

    /* renamed from: E */
    public final void mo616E(@mr2 ru2 ru2) {
        this.f577a.mo22860e(ru2);
    }

    /* renamed from: P */
    public void mo617P(@mr2 kh2 kh2) {
        this.f575a.mo14658c(kh2);
    }

    /* renamed from: Q */
    public void mo618Q(@mr2 kh2 kh2, @mr2 a32 a32) {
        this.f575a.mo14659d(kh2, a32);
    }

    /* renamed from: S */
    public void mo619S() {
        invalidateOptionsMenu();
    }

    /* renamed from: T */
    public final void mo620T(@mr2 s60<Integer> s60) {
        this.f581b.remove(s60);
    }

    /* renamed from: U */
    public final void mo621U(@mr2 s60<Integer> s60) {
        this.f581b.add(s60);
    }

    /* renamed from: W */
    public void mo622W(@mr2 kh2 kh2) {
        this.f575a.mo14665l(kh2);
    }

    /* renamed from: Z */
    public final void mo623Z(@mr2 s60<cm2> s60) {
        this.f583d.add(s60);
    }

    /* renamed from: a0 */
    public final void mo624a0(@mr2 s60<f23> s60) {
        this.f584e.add(s60);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m1050q0();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b0 */
    public final void mo626b0(@mr2 ru2 ru2) {
        this.f577a.mo22856a(ru2);
    }

    /* renamed from: c0 */
    public final void mo627c0(@mr2 s60<Configuration> s60) {
        this.f578a.remove(s60);
    }

    /* renamed from: e0 */
    public final void mo628e0(@mr2 s60<Intent> s60) {
        this.f582c.remove(s60);
    }

    @mr2
    /* renamed from: f0 */
    public final ActivityResultRegistry mo629f0() {
        return this.f572a;
    }

    @ts2
    /* renamed from: g0 */
    public Context mo630g0() {
        return this.f577a.mo22859d();
    }

    @mr2
    public C0709m.C0713b getDefaultViewModelProviderFactory() {
        if (this.f573a == null) {
            this.f573a = new C0706k(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f573a;
    }

    @mr2
    public C0690e getLifecycle() {
        return this.f580b;
    }

    @mr2
    public final br3 getSavedStateRegistry() {
        return this.f574a.mo14340b();
    }

    @mr2
    public gu4 getViewModelStore() {
        if (getApplication() != null) {
            mo636o0();
            return this.f576a;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: o */
    public final void mo635o(@mr2 s60<f23> s60) {
        this.f584e.remove(s60);
    }

    /* renamed from: o0 */
    public void mo636o0() {
        if (this.f576a == null) {
            C0152d dVar = (C0152d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f576a = dVar.f597a;
            }
            if (this.f576a == null) {
                this.f576a = new gu4();
            }
        }
    }

    @C3740us
    @Deprecated
    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        if (!this.f572a.mo681b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @bc2
    public void onBackPressed() {
        this.f571a.mo678e();
    }

    @C3740us
    public void onConfigurationChanged(@mr2 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<s60<Configuration>> it = this.f578a.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        this.f574a.mo14342d(bundle);
        this.f577a.mo22858c(this);
        super.onCreate(bundle);
        C0703j.m4831g(this);
        int i = this.f585n;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, @mr2 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f575a.mo14661h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, @mr2 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f575a.mo14663j(menuItem);
        }
        return false;
    }

    @C3740us
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<s60<cm2>> it = this.f583d.iterator();
        while (it.hasNext()) {
            it.next().accept(new cm2(z));
        }
    }

    @sj3(api = 26)
    @C3740us
    public void onMultiWindowModeChanged(boolean z, @mr2 Configuration configuration) {
        Iterator<s60<cm2>> it = this.f583d.iterator();
        while (it.hasNext()) {
            it.next().accept(new cm2(z, configuration));
        }
    }

    @C3740us
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<s60<Intent>> it = this.f582c.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, @mr2 Menu menu) {
        this.f575a.mo14662i(menu);
        super.onPanelClosed(i, menu);
    }

    @C3740us
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<s60<f23>> it = this.f584e.iterator();
        while (it.hasNext()) {
            it.next().accept(new f23(z));
        }
    }

    @sj3(api = 26)
    @C3740us
    public void onPictureInPictureModeChanged(boolean z, @mr2 Configuration configuration) {
        Iterator<s60<f23>> it = this.f584e.iterator();
        while (it.hasNext()) {
            it.next().accept(new f23(z, configuration));
        }
    }

    public boolean onPreparePanel(int i, @ts2 View view, @mr2 Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f575a.mo14664k(menu);
        return true;
    }

    @C3740us
    @Deprecated
    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        if (!this.f572a.mo681b(i, -1, new Intent().putExtra(C2811m3.C2821i.f15888b, strArr).putExtra(C2811m3.C2821i.f15889c, iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @ts2
    public final Object onRetainNonConfigurationInstance() {
        C0152d dVar;
        Object t0 = mo666t0();
        gu4 gu4 = this.f576a;
        if (gu4 == null && (dVar = (C0152d) getLastNonConfigurationInstance()) != null) {
            gu4 = dVar.f597a;
        }
        if (gu4 == null && t0 == null) {
            return null;
        }
        C0152d dVar2 = new C0152d();
        dVar2.f598a = t0;
        dVar2.f597a = gu4;
        return dVar2;
    }

    @C3740us
    public void onSaveInstanceState(@mr2 Bundle bundle) {
        C0690e lifecycle = getLifecycle();
        if (lifecycle instanceof C0695g) {
            ((C0695g) lifecycle).mo4974q(C0690e.C0693c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f574a.mo14343e(bundle);
    }

    @C3740us
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<s60<Integer>> it = this.f581b.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @ts2
    @Deprecated
    /* renamed from: p0 */
    public Object mo654p0() {
        C0152d dVar = (C0152d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f598a;
        }
        return null;
    }

    /* renamed from: q */
    public final void mo655q(@mr2 s60<Configuration> s60) {
        this.f578a.add(s60);
    }

    @mr2
    public final <I, O> C2921n3<I> registerForActivityResult(@mr2 C2691l3<I, O> l3Var, @mr2 ActivityResultRegistry activityResultRegistry, @mr2 C2470j3<O> j3Var) {
        return activityResultRegistry.mo688j("activity_rq#" + this.f579a.getAndIncrement(), this, l3Var, j3Var);
    }

    @mr2
    public final <I, O> C2921n3<I> registerForActivityResult(@mr2 C2691l3<I, O> l3Var, @mr2 C2470j3<O> j3Var) {
        return registerForActivityResult(l3Var, this.f572a, j3Var);
    }

    public void reportFullyDrawn() {
        try {
            if (zf4.m33110h()) {
                zf4.m33105c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            zf4.m33108f();
        }
    }

    public void setContentView(@s12 int i) {
        m1050q0();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m1050q0();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m1050q0();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @ts2 Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @ts2
    @Deprecated
    /* renamed from: t0 */
    public Object mo666t0() {
        return null;
    }

    /* renamed from: w */
    public final void mo667w(@mr2 s60<Intent> s60) {
        this.f582c.add(s60);
    }

    @mr2
    @C3740us
    /* renamed from: z */
    public jb0 mo668z() {
        km2 km2 = new km2();
        if (getApplication() != null) {
            km2.mo19162c(C0709m.C0710a.f4127b, getApplication());
        }
        km2.mo19162c(xq3.f22704a, this);
        km2.mo19162c(xq3.f22706b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            km2.mo19162c(xq3.f22708c, getIntent().getExtras());
        }
        return km2;
    }
}
