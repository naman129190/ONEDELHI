package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0695g;
import com.onedelhi.secure.C3023o3;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.j62;
import com.onedelhi.secure.jb1;
import com.onedelhi.secure.lu2;
import com.onedelhi.secure.m70;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.px3;
import com.onedelhi.secure.ru2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ua1;
import com.onedelhi.secure.ya1;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements C3962y2.C3971i, C3962y2.C3973k {

    /* renamed from: c */
    public static final String f3675c = "android:support:fragments";

    /* renamed from: a */
    public final ua1 f3676a = ua1.m29221b(new C0594c());

    /* renamed from: b */
    public boolean f3677b;

    /* renamed from: c */
    public final C0695g f3678c = new C0695g(this);

    /* renamed from: c */
    public boolean f3679c;

    /* renamed from: d */
    public boolean f3680d = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C0592a implements br3.C1803c {
        public C0592a() {
        }

        @mr2
        /* renamed from: a */
        public Bundle mo879a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.mo4467y0();
            FragmentActivity.this.f3678c.mo4968j(C0690e.C0692b.ON_STOP);
            Parcelable P = FragmentActivity.this.f3676a.mo25512P();
            if (P != null) {
                bundle.putParcelable(FragmentActivity.f3675c, P);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    public class C0593b implements ru2 {
        public C0593b() {
        }

        /* renamed from: a */
        public void mo880a(@mr2 Context context) {
            FragmentActivity.this.f3676a.mo25513a((Fragment) null);
            Bundle b = FragmentActivity.this.getSavedStateRegistry().mo13796b(FragmentActivity.f3675c);
            if (b != null) {
                FragmentActivity.this.f3676a.mo25508L(b.getParcelable(FragmentActivity.f3675c));
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    public class C0594c extends C0646f<FragmentActivity> implements hu4, lu2, C3023o3, ya1 {
        public C0594c() {
            super(FragmentActivity.this);
        }

        @mr2
        /* renamed from: C */
        public OnBackPressedDispatcher mo614C() {
            return FragmentActivity.this.mo614C();
        }

        /* renamed from: a */
        public void mo4468a(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
            FragmentActivity.this.mo4444A0(fragment);
        }

        @ts2
        /* renamed from: c */
        public View mo4428c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: d */
        public boolean mo4429d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @mr2
        /* renamed from: f0 */
        public ActivityResultRegistry mo629f0() {
            return FragmentActivity.this.mo629f0();
        }

        @mr2
        public C0690e getLifecycle() {
            return FragmentActivity.this.f3678c;
        }

        @mr2
        public gu4 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        /* renamed from: h */
        public void mo4469h(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @mr2
        /* renamed from: j */
        public LayoutInflater mo4471j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: k */
        public int mo4472k() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: l */
        public boolean mo4473l() {
            return FragmentActivity.this.getWindow() != null;
        }

        /* renamed from: n */
        public boolean mo4474n(@mr2 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: o */
        public boolean mo4475o(@mr2 String str) {
            return C3962y2.m31865M(FragmentActivity.this, str);
        }

        /* renamed from: s */
        public void mo4476s() {
            FragmentActivity.this.mo839J0();
        }

        /* renamed from: t */
        public FragmentActivity mo4470i() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        mo4466x0();
    }

    @m70
    public FragmentActivity(@s12 int i) {
        super(i);
        mo4466x0();
    }

    /* renamed from: z0 */
    public static boolean m4241z0(FragmentManager fragmentManager, C0690e.C0693c cVar) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo4516G0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= m4241z0(next.getChildFragmentManager(), cVar);
                }
                jb1 jb1 = next.mViewLifecycleOwner;
                if (jb1 != null && jb1.getLifecycle().mo4959b().mo4962a(C0690e.C0693c.STARTED)) {
                    next.mViewLifecycleOwner.mo18212f(cVar);
                    z = true;
                }
                if (next.mLifecycleRegistry.mo4959b().mo4962a(C0690e.C0693c.STARTED)) {
                    next.mLifecycleRegistry.mo4974q(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @bc2
    @Deprecated
    /* renamed from: A0 */
    public void mo4444A0(@mr2 Fragment fragment) {
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: B0 */
    public boolean mo4445B0(@ts2 View view, @mr2 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: C0 */
    public void mo4446C0() {
        this.f3678c.mo4968j(C0690e.C0692b.ON_RESUME);
        this.f3676a.mo25529r();
    }

    /* renamed from: D0 */
    public void mo4447D0(@ts2 px3 px3) {
        C3962y2.m31861I(this, px3);
    }

    /* renamed from: E0 */
    public void mo4448E0(@ts2 px3 px3) {
        C3962y2.m31862J(this, px3);
    }

    /* renamed from: F0 */
    public void mo4449F0(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo4450G0(fragment, intent, i, (Bundle) null);
    }

    /* renamed from: G0 */
    public void mo4450G0(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @ts2 Bundle bundle) {
        if (i == -1) {
            C3962y2.m31866N(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    /* renamed from: H0 */
    public void mo4451H0(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C3962y2.m31867O(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: I0 */
    public void mo4452I0() {
        C3962y2.m31871x(this);
    }

    @Deprecated
    /* renamed from: J0 */
    public void mo839J0() {
        invalidateOptionsMenu();
    }

    /* renamed from: K0 */
    public void mo4453K0() {
        C3962y2.m31856D(this);
    }

    /* renamed from: L0 */
    public void mo4454L0() {
        C3962y2.m31868P(this);
    }

    @Deprecated
    /* renamed from: X */
    public final void mo4455X(int i) {
    }

    public void dump(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + yg1.C3999a.f23084c;
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3677b);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3679c);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3680d);
        if (getApplication() != null) {
            j62.m18173d(this).mo18148b(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3676a.mo25500D().mo4571b0(str, fileDescriptor, printWriter, strArr);
    }

    @C3740us
    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        this.f3676a.mo25502F();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
        this.f3676a.mo25502F();
        super.onConfigurationChanged(configuration);
        this.f3676a.mo25515d(configuration);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f3678c.mo4968j(C0690e.C0692b.ON_CREATE);
        this.f3676a.mo25517f();
    }

    public boolean onCreatePanelMenu(int i, @mr2 Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f3676a.mo25518g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @ts2
    public View onCreateView(@ts2 View view, @mr2 String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        View u0 = mo4463u0(view, str, context, attributeSet);
        return u0 == null ? super.onCreateView(view, str, context, attributeSet) : u0;
    }

    @ts2
    public View onCreateView(@mr2 String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        View u0 = mo4463u0((View) null, str, context, attributeSet);
        return u0 == null ? super.onCreateView(str, context, attributeSet) : u0;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3676a.mo25519h();
        this.f3678c.mo4968j(C0690e.C0692b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f3676a.mo25521j();
    }

    public boolean onMenuItemSelected(int i, @mr2 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f3676a.mo25523l(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f3676a.mo25516e(menuItem);
    }

    @C3740us
    public void onMultiWindowModeChanged(boolean z) {
        this.f3676a.mo25522k(z);
    }

    @C3740us
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f3676a.mo25502F();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, @mr2 Menu menu) {
        if (i == 0) {
            this.f3676a.mo25524m(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f3679c = false;
        this.f3676a.mo25525n();
        this.f3678c.mo4968j(C0690e.C0692b.ON_PAUSE);
    }

    @C3740us
    public void onPictureInPictureModeChanged(boolean z) {
        this.f3676a.mo25526o(z);
    }

    public void onPostResume() {
        super.onPostResume();
        mo4446C0();
    }

    public boolean onPreparePanel(int i, @ts2 View view, @mr2 Menu menu) {
        return i == 0 ? mo4445B0(view, menu) | this.f3676a.mo25527p(menu) : super.onPreparePanel(i, view, menu);
    }

    @C3740us
    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        this.f3676a.mo25502F();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.f3676a.mo25502F();
        super.onResume();
        this.f3679c = true;
        this.f3676a.mo25537z();
    }

    public void onStart() {
        this.f3676a.mo25502F();
        super.onStart();
        this.f3680d = false;
        if (!this.f3677b) {
            this.f3677b = true;
            this.f3676a.mo25514c();
        }
        this.f3676a.mo25537z();
        this.f3678c.mo4968j(C0690e.C0692b.ON_START);
        this.f3676a.mo25530s();
    }

    public void onStateNotSaved() {
        this.f3676a.mo25502F();
    }

    public void onStop() {
        super.onStop();
        this.f3680d = true;
        mo4467y0();
        this.f3676a.mo25531t();
        this.f3678c.mo4968j(C0690e.C0692b.ON_STOP);
    }

    @ts2
    /* renamed from: u0 */
    public final View mo4463u0(@ts2 View view, @mr2 String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        return this.f3676a.mo25503G(view, str, context, attributeSet);
    }

    @mr2
    /* renamed from: v0 */
    public FragmentManager mo4464v0() {
        return this.f3676a.mo25500D();
    }

    @mr2
    @Deprecated
    /* renamed from: w0 */
    public j62 mo4465w0() {
        return j62.m18173d(this);
    }

    /* renamed from: x0 */
    public final void mo4466x0() {
        getSavedStateRegistry().mo13803j(f3675c, new C0592a());
        mo626b0(new C0593b());
    }

    /* renamed from: y0 */
    public void mo4467y0() {
        do {
        } while (m4241z0(mo4464v0(), C0690e.C0693c.CREATED));
    }
}
