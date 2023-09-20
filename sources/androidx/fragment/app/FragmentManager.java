package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0638d;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.C0659m;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import com.onedelhi.secure.C2394i3;
import com.onedelhi.secure.C2470j3;
import com.onedelhi.secure.C2691l3;
import com.onedelhi.secure.C2811m3;
import com.onedelhi.secure.C2921n3;
import com.onedelhi.secure.C3345qu;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ab1;
import com.onedelhi.secure.ab3;
import com.onedelhi.secure.bb1;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.cb1;
import com.onedelhi.secure.db1;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fb1;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.ku2;
import com.onedelhi.secure.l92;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p14;
import com.onedelhi.secure.ta1;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.ts1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wa1;
import com.onedelhi.secure.xa1;
import com.onedelhi.secure.ya1;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager implements bb1 {

    /* renamed from: a */
    public static final String f3688a = "FragmentManager";

    /* renamed from: b */
    public static final int f3689b = 1;

    /* renamed from: b */
    public static final String f3690b = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: g */
    public static boolean f3691g = false;

    /* renamed from: h */
    public static boolean f3692h = true;

    /* renamed from: a */
    public int f3693a = -1;

    /* renamed from: a */
    public OnBackPressedDispatcher f3694a;

    /* renamed from: a */
    public Fragment f3695a;

    /* renamed from: a */
    public C0645e f3696a = null;

    /* renamed from: a */
    public C0646f<?> f3697a;

    /* renamed from: a */
    public final C0647g f3698a = new C0647g(this);

    /* renamed from: a */
    public final C0649h f3699a = new C0649h(this);

    /* renamed from: a */
    public final C0659m.C0666g f3700a = new C0599d();

    /* renamed from: a */
    public final fb1 f3701a = new fb1();

    /* renamed from: a */
    public final ku2 f3702a = new C0598c(false);

    /* renamed from: a */
    public C2921n3<Intent> f3703a;

    /* renamed from: a */
    public p14 f3704a = null;

    /* renamed from: a */
    public ta1 f3705a;

    /* renamed from: a */
    public xa1 f3706a;

    /* renamed from: a */
    public Runnable f3707a = new C0602g();

    /* renamed from: a */
    public ArrayDeque<C0609n> f3708a = new ArrayDeque<>();

    /* renamed from: a */
    public final ArrayList<C0613q> f3709a = new ArrayList<>();

    /* renamed from: a */
    public final Map<String, Bundle> f3710a = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public final CopyOnWriteArrayList<ya1> f3711a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final AtomicInteger f3712a = new AtomicInteger();

    /* renamed from: a */
    public boolean f3713a;
    @ts2

    /* renamed from: b */
    public Fragment f3714b;

    /* renamed from: b */
    public C0645e f3715b = new C0600e();

    /* renamed from: b */
    public C2921n3<ts1> f3716b;

    /* renamed from: b */
    public p14 f3717b = new C0601f();

    /* renamed from: b */
    public ArrayList<C0620a> f3718b;

    /* renamed from: b */
    public final Map<String, C0611o> f3719b = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public boolean f3720b;

    /* renamed from: c */
    public C2921n3<String[]> f3721c;

    /* renamed from: c */
    public ArrayList<Fragment> f3722c;

    /* renamed from: c */
    public Map<Fragment, HashSet<C3345qu>> f3723c = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public boolean f3724c;

    /* renamed from: d */
    public ArrayList<C0612p> f3725d;

    /* renamed from: d */
    public boolean f3726d;

    /* renamed from: e */
    public ArrayList<C0620a> f3727e;

    /* renamed from: e */
    public boolean f3728e;

    /* renamed from: f */
    public ArrayList<Boolean> f3729f;

    /* renamed from: f */
    public boolean f3730f;

    /* renamed from: g */
    public ArrayList<Fragment> f3731g;

    /* renamed from: h */
    public ArrayList<C0615s> f3732h;

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0596a implements C2470j3<C2394i3> {
        public C0596a() {
        }

        /* renamed from: b */
        public void mo4637a(C2394i3 i3Var) {
            C0609n pollFirst = FragmentManager.this.f3708a.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3751b;
            int i = pollFirst.f3752n;
            Fragment i2 = FragmentManager.this.f3701a.mo15918i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, i3Var.mo17515b(), i3Var.mo17514a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0597b implements C2470j3<Map<String, Boolean>> {
        public C0597b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo4637a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C0609n pollFirst = FragmentManager.this.f3708a.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f3751b;
                int i2 = pollFirst.f3752n;
                Fragment i3 = FragmentManager.this.f3701a.mo15918i(str);
                if (i3 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i3.onRequestPermissionsResult(i2, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0598c extends ku2 {
        public C0598c(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo4640b() {
            FragmentManager.this.mo4541P0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0599d implements C0659m.C0666g {
        public C0599d() {
        }

        /* renamed from: a */
        public void mo4641a(@mr2 Fragment fragment, @mr2 C3345qu quVar) {
            FragmentManager.this.mo4589j(fragment, quVar);
        }

        /* renamed from: b */
        public void mo4642b(@mr2 Fragment fragment, @mr2 C3345qu quVar) {
            if (!quVar.mo23441c()) {
                FragmentManager.this.mo4627w1(fragment, quVar);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0600e extends C0645e {
        public C0600e() {
        }

        @mr2
        /* renamed from: a */
        public Fragment mo4643a(@mr2 ClassLoader classLoader, @mr2 String str) {
            return FragmentManager.this.mo4518H0().mo24816b(FragmentManager.this.mo4518H0().mo4779f(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C0601f implements p14 {
        public C0601f() {
        }

        @mr2
        /* renamed from: a */
        public C0668n mo4644a(@mr2 ViewGroup viewGroup) {
            return new C0623c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C0602g implements Runnable {
        public C0602g() {
        }

        public void run() {
            FragmentManager.this.mo4584h0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0603h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f3744a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3745a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3746a;

        public C0603h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3745a = viewGroup;
            this.f3744a = view;
            this.f3746a = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3745a.endViewTransition(this.f3744a);
            animator.removeListener(this);
            Fragment fragment = this.f3746a;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0604i implements ya1 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f3748a;

        public C0604i(Fragment fragment) {
            this.f3748a = fragment;
        }

        /* renamed from: a */
        public void mo4468a(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
            this.f3748a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public class C0605j implements C2470j3<C2394i3> {
        public C0605j() {
        }

        /* renamed from: b */
        public void mo4637a(C2394i3 i3Var) {
            C0609n pollFirst = FragmentManager.this.f3708a.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3751b;
            int i = pollFirst.f3752n;
            Fragment i2 = FragmentManager.this.f3701a.mo15918i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, i3Var.mo17515b(), i3Var.mo17514a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public interface C0606k {
        @e54
        @Deprecated
        /* renamed from: a */
        int mo4648a();

        @ts2
        @Deprecated
        /* renamed from: c */
        CharSequence mo4649c();

        @ts2
        @Deprecated
        /* renamed from: d */
        CharSequence mo4650d();

        @e54
        @Deprecated
        /* renamed from: e */
        int mo4651e();

        int getId();

        @ts2
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static class C0607l extends C2691l3<ts1, C2394i3> {
        @mr2
        /* renamed from: d */
        public Intent mo4654a(@mr2 Context context, ts1 ts1) {
            Bundle bundleExtra;
            Intent intent = new Intent(C2811m3.C2826l.f15893a);
            Intent a = ts1.mo25291a();
            if (!(a == null || (bundleExtra = a.getBundleExtra(C2811m3.C2824k.f15891a)) == null)) {
                intent.putExtra(C2811m3.C2824k.f15891a, bundleExtra);
                a.removeExtra(C2811m3.C2824k.f15891a);
                if (a.getBooleanExtra(FragmentManager.f3690b, false)) {
                    ts1 = new ts1.C3662b(ts1.mo25294d()).mo25302b((Intent) null).mo25303c(ts1.mo25293c(), ts1.mo25292b()).mo25301a();
                }
            }
            intent.putExtra(C2811m3.C2826l.f15894b, ts1);
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @mr2
        /* renamed from: e */
        public C2394i3 mo4655c(int i, @ts2 Intent intent) {
            return new C2394i3(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public static abstract class C0608m {
        @Deprecated
        /* renamed from: a */
        public void mo4658a(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @ts2 Bundle bundle) {
        }

        /* renamed from: b */
        public void mo4659b(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @mr2 Context context) {
        }

        /* renamed from: c */
        public void mo4660c(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @ts2 Bundle bundle) {
        }

        /* renamed from: d */
        public void mo4661d(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: e */
        public void mo4662e(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: f */
        public void mo4663f(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: g */
        public void mo4664g(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @mr2 Context context) {
        }

        /* renamed from: h */
        public void mo4665h(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @ts2 Bundle bundle) {
        }

        /* renamed from: i */
        public void mo4666i(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: j */
        public void mo4667j(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @mr2 Bundle bundle) {
        }

        /* renamed from: k */
        public void mo4668k(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: l */
        public void mo4669l(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }

        /* renamed from: m */
        public void mo4670m(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @mr2 View view, @ts2 Bundle bundle) {
        }

        /* renamed from: n */
        public void mo4671n(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public static class C0609n implements Parcelable {
        public static final Parcelable.Creator<C0609n> CREATOR = new C0610a();

        /* renamed from: b */
        public String f3751b;

        /* renamed from: n */
        public int f3752n;

        /* renamed from: androidx.fragment.app.FragmentManager$n$a */
        public class C0610a implements Parcelable.Creator<C0609n> {
            /* renamed from: a */
            public C0609n createFromParcel(Parcel parcel) {
                return new C0609n(parcel);
            }

            /* renamed from: b */
            public C0609n[] newArray(int i) {
                return new C0609n[i];
            }
        }

        public C0609n(@mr2 Parcel parcel) {
            this.f3751b = parcel.readString();
            this.f3752n = parcel.readInt();
        }

        public C0609n(@mr2 String str, int i) {
            this.f3751b = str;
            this.f3752n = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3751b);
            parcel.writeInt(this.f3752n);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public static class C0611o implements ab1 {

        /* renamed from: a */
        public final C0690e f3753a;

        /* renamed from: a */
        public final C0694f f3754a;

        /* renamed from: a */
        public final ab1 f3755a;

        public C0611o(@mr2 C0690e eVar, @mr2 ab1 ab1, @mr2 C0694f fVar) {
            this.f3753a = eVar;
            this.f3755a = ab1;
            this.f3754a = fVar;
        }

        /* renamed from: a */
        public void mo4678a(@mr2 String str, @mr2 Bundle bundle) {
            this.f3755a.mo4678a(str, bundle);
        }

        /* renamed from: b */
        public boolean mo4679b(C0690e.C0693c cVar) {
            return this.f3753a.mo4959b().mo4962a(cVar);
        }

        /* renamed from: c */
        public void mo4680c() {
            this.f3753a.mo4960c(this.f3754a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    public interface C0612p {
        @bc2
        /* renamed from: a */
        void mo4681a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    public interface C0613q {
        /* renamed from: b */
        boolean mo4682b(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$r */
    public class C0614r implements C0613q {

        /* renamed from: a */
        public final int f3756a;

        /* renamed from: a */
        public final String f3758a;

        /* renamed from: b */
        public final int f3759b;

        public C0614r(@ts2 String str, int i, int i2) {
            this.f3758a = str;
            this.f3756a = i;
            this.f3759b = i2;
        }

        /* renamed from: b */
        public boolean mo4682b(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3714b;
            if (fragment != null && this.f3756a < 0 && this.f3758a == null && fragment.getChildFragmentManager().mo4604o1()) {
                return false;
            }
            return FragmentManager.this.mo4615s1(arrayList, arrayList2, this.f3758a, this.f3756a, this.f3759b);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$s */
    public static class C0615s implements Fragment.C0589l {

        /* renamed from: a */
        public int f3760a;

        /* renamed from: a */
        public final C0620a f3761a;

        /* renamed from: a */
        public final boolean f3762a;

        public C0615s(@mr2 C0620a aVar, boolean z) {
            this.f3762a = z;
            this.f3761a = aVar;
        }

        /* renamed from: a */
        public void mo4434a() {
            this.f3760a++;
        }

        /* renamed from: b */
        public void mo4435b() {
            int i = this.f3760a - 1;
            this.f3760a = i;
            if (i == 0) {
                this.f3761a.f3778a.mo4525J1();
            }
        }

        /* renamed from: c */
        public void mo4683c() {
            C0620a aVar = this.f3761a;
            aVar.f3778a.mo4631y(aVar, this.f3762a, false, false);
        }

        /* renamed from: d */
        public void mo4684d() {
            boolean z = this.f3760a > 0;
            for (Fragment next : this.f3761a.f3778a.mo4516G0()) {
                next.setOnStartEnterTransitionListener((Fragment.C0589l) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            C0620a aVar = this.f3761a;
            aVar.f3778a.mo4631y(aVar, this.f3762a, !z, true);
        }

        /* renamed from: e */
        public boolean mo4685e() {
            return this.f3760a == 0;
        }
    }

    /* renamed from: G1 */
    public static int m4277G1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 4099) {
            return C0657l.f3920y;
        }
        if (i != 8194) {
            return 0;
        }
        return C0657l.f3918w;
    }

    @ts2
    /* renamed from: N0 */
    public static Fragment m4278N0(@mr2 View view) {
        Object tag = view.getTag(ab3.C1684g.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: T0 */
    public static boolean m4279T0(int i) {
        return f3691g || Log.isLoggable("FragmentManager", i);
    }

    @Deprecated
    /* renamed from: c0 */
    public static void m4280c0(boolean z) {
        f3691g = z;
    }

    @db1
    /* renamed from: d0 */
    public static void m4281d0(boolean z) {
        f3692h = z;
    }

    /* renamed from: j0 */
    public static void m4285j0(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0620a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo4713U(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo4718Z(z);
            } else {
                aVar.mo4713U(1);
                aVar.mo4717Y();
            }
            i++;
        }
    }

    @mr2
    /* renamed from: o0 */
    public static <F extends Fragment> F m4286o0(@mr2 View view) {
        F t0 = m4288t0(view);
        if (t0 != null) {
            return t0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @mr2
    /* renamed from: s0 */
    public static FragmentManager m4287s0(@mr2 View view) {
        Fragment t0 = m4288t0(view);
        if (t0 == null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.mo4464v0();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (t0.isAdded()) {
            return t0.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + t0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    @ts2
    /* renamed from: t0 */
    public static Fragment m4288t0(@mr2 View view) {
        while (view != null) {
            Fragment N0 = m4278N0(view);
            if (N0 != null) {
                return N0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @mr2
    /* renamed from: A */
    public C0653j mo4497A(@mr2 Fragment fragment) {
        C0653j n = this.f3701a.mo15923n(fragment.mWho);
        if (n != null) {
            return n;
        }
        C0653j jVar = new C0653j(this.f3699a, this.f3701a, fragment);
        jVar.mo4825o(this.f3697a.mo4779f().getClassLoader());
        jVar.mo4831u(this.f3693a);
        return jVar;
    }

    @mr2
    /* renamed from: A0 */
    public final xa1 mo4498A0(@mr2 Fragment fragment) {
        return this.f3706a.mo26849f(fragment);
    }

    /* renamed from: A1 */
    public final void mo4499A1(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                mo4598m0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3934c) {
                        if (i2 != i) {
                            mo4592k0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3934c) {
                                i2++;
                            }
                        }
                        mo4592k0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo4592k0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: B */
    public final void mo4500B(@mr2 Fragment fragment) {
        fragment.performDestroyView();
        this.f3699a.mo4802n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo4933q(null);
        fragment.mInLayout = false;
    }

    @mr2
    /* renamed from: B0 */
    public ta1 mo4501B0() {
        return this.f3705a;
    }

    /* renamed from: B1 */
    public void mo4502B1(@mr2 Fragment fragment) {
        this.f3706a.mo26855m(fragment);
    }

    /* renamed from: C */
    public void mo4503C(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m4279T0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3701a.mo15929t(fragment);
                if (mo4555U0(fragment)) {
                    this.f3720b = true;
                }
                mo4542P1(fragment);
            }
        }
    }

    @ts2
    /* renamed from: C0 */
    public Fragment mo4504C0(@mr2 Bundle bundle, @mr2 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment n0 = mo4601n0(string);
        if (n0 == null) {
            mo4551S1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return n0;
    }

    /* renamed from: C1 */
    public final void mo4505C1() {
        if (this.f3725d != null) {
            for (int i = 0; i < this.f3725d.size(); i++) {
                this.f3725d.get(i).mo4681a();
            }
        }
    }

    /* renamed from: D */
    public void mo4506D() {
        this.f3724c = false;
        this.f3726d = false;
        this.f3706a.mo26857o(false);
        mo4561X(4);
    }

    /* renamed from: D0 */
    public final ViewGroup mo4507D0(@mr2 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3705a.mo4429d()) {
            View c = this.f3705a.mo4428c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: D1 */
    public void mo4508D1(@ts2 Parcelable parcelable, @ts2 wa1 wa1) {
        if (this.f3697a instanceof hu4) {
            mo4551S1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f3706a.mo26856n(wa1);
        mo4511E1(parcelable);
    }

    /* renamed from: E */
    public void mo4509E() {
        this.f3724c = false;
        this.f3726d = false;
        this.f3706a.mo26857o(false);
        mo4561X(0);
    }

    @mr2
    /* renamed from: E0 */
    public C0645e mo4510E0() {
        C0645e eVar = this.f3696a;
        if (eVar != null) {
            return eVar;
        }
        Fragment fragment = this.f3695a;
        return fragment != null ? fragment.mFragmentManager.mo4510E0() : this.f3715b;
    }

    /* renamed from: E1 */
    public void mo4511E1(@ts2 Parcelable parcelable) {
        C0653j jVar;
        if (parcelable != null) {
            C0651i iVar = (C0651i) parcelable;
            if (iVar.f3870a != null) {
                this.f3701a.mo15930u();
                Iterator<cb1> it = iVar.f3870a.iterator();
                while (it.hasNext()) {
                    cb1 next = it.next();
                    if (next != null) {
                        Fragment e = this.f3706a.mo26847e(next.f10208c);
                        if (e != null) {
                            if (m4279T0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + e);
                            }
                            jVar = new C0653j(this.f3699a, this.f3701a, e, next);
                        } else {
                            jVar = new C0653j(this.f3699a, this.f3701a, this.f3697a.mo4779f().getClassLoader(), mo4510E0(), next);
                        }
                        Fragment k = jVar.mo4821k();
                        k.mFragmentManager = this;
                        if (m4279T0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.mWho + "): " + k);
                        }
                        jVar.mo4825o(this.f3697a.mo4779f().getClassLoader());
                        this.f3701a.mo15926q(jVar);
                        jVar.mo4831u(this.f3693a);
                    }
                }
                for (Fragment next2 : this.f3706a.mo26851i()) {
                    if (!this.f3701a.mo15912c(next2.mWho)) {
                        if (m4279T0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + iVar.f3870a);
                        }
                        this.f3706a.mo26855m(next2);
                        next2.mFragmentManager = this;
                        C0653j jVar2 = new C0653j(this.f3699a, this.f3701a, next2);
                        jVar2.mo4831u(1);
                        jVar2.mo4823m();
                        next2.mRemoving = true;
                        jVar2.mo4823m();
                    }
                }
                this.f3701a.mo15931v(iVar.f3873b);
                if (iVar.f3871a != null) {
                    this.f3718b = new ArrayList<>(iVar.f3871a.length);
                    int i = 0;
                    while (true) {
                        C0621b[] bVarArr = iVar.f3871a;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0620a a = bVarArr[i].mo4734a(this);
                        if (m4279T0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a.f3780z + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new l92("FragmentManager"));
                            a.mo4716X(yg1.C3999a.f23084c, printWriter, false);
                            printWriter.close();
                        }
                        this.f3718b.add(a);
                        i++;
                    }
                } else {
                    this.f3718b = null;
                }
                this.f3712a.set(iVar.f3877n);
                String str = iVar.f3872b;
                if (str != null) {
                    Fragment n0 = mo4601n0(str);
                    this.f3714b = n0;
                    mo4543Q(n0);
                }
                ArrayList<String> arrayList = iVar.f3874c;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Bundle bundle = iVar.f3875d.get(i2);
                        bundle.setClassLoader(this.f3697a.mo4779f().getClassLoader());
                        this.f3710a.put(arrayList.get(i2), bundle);
                    }
                }
                this.f3708a = new ArrayDeque<>(iVar.f3876e);
            }
        }
    }

    /* renamed from: F */
    public void mo4512F(@mr2 Configuration configuration) {
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    @mr2
    /* renamed from: F0 */
    public fb1 mo4513F0() {
        return this.f3701a;
    }

    @Deprecated
    /* renamed from: F1 */
    public wa1 mo4514F1() {
        if (this.f3697a instanceof hu4) {
            mo4551S1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f3706a.mo26852j();
    }

    /* renamed from: G */
    public boolean mo4515G(@mr2 MenuItem menuItem) {
        if (this.f3693a < 1) {
            return false;
        }
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: G0 */
    public List<Fragment> mo4516G0() {
        return this.f3701a.mo15924o();
    }

    /* renamed from: H */
    public void mo4517H() {
        this.f3724c = false;
        this.f3726d = false;
        this.f3706a.mo26857o(false);
        mo4561X(1);
    }

    @mr2
    /* renamed from: H0 */
    public C0646f<?> mo4518H0() {
        return this.f3697a;
    }

    /* renamed from: H1 */
    public Parcelable mo4519H1() {
        int size;
        mo4620u0();
        mo4577e0();
        mo4584h0(true);
        this.f3724c = true;
        this.f3706a.mo26857o(true);
        ArrayList<cb1> w = this.f3701a.mo15932w();
        C0621b[] bVarArr = null;
        if (w.isEmpty()) {
            if (m4279T0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> x = this.f3701a.mo15933x();
        ArrayList<C0620a> arrayList = this.f3718b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C0621b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C0621b(this.f3718b.get(i));
                if (m4279T0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3718b.get(i));
                }
            }
        }
        C0651i iVar = new C0651i();
        iVar.f3870a = w;
        iVar.f3873b = x;
        iVar.f3871a = bVarArr;
        iVar.f3877n = this.f3712a.get();
        Fragment fragment = this.f3714b;
        if (fragment != null) {
            iVar.f3872b = fragment.mWho;
        }
        iVar.f3874c.addAll(this.f3710a.keySet());
        iVar.f3875d.addAll(this.f3710a.values());
        iVar.f3876e = new ArrayList<>(this.f3708a);
        return iVar;
    }

    /* renamed from: I */
    public boolean mo4520I(@mr2 Menu menu, @mr2 MenuInflater menuInflater) {
        if (this.f3693a < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null && mo4558V0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3722c != null) {
            for (int i = 0; i < this.f3722c.size(); i++) {
                Fragment fragment = this.f3722c.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f3722c = arrayList;
        return z;
    }

    @mr2
    /* renamed from: I0 */
    public LayoutInflater.Factory2 mo4521I0() {
        return this.f3698a;
    }

    @ts2
    /* renamed from: I1 */
    public Fragment.C0590m mo4522I1(@mr2 Fragment fragment) {
        C0653j n = this.f3701a.mo15923n(fragment.mWho);
        if (n == null || !n.mo4821k().equals(fragment)) {
            mo4551S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n.mo4828r();
    }

    /* renamed from: J */
    public void mo4523J() {
        this.f3728e = true;
        mo4584h0(true);
        mo4577e0();
        mo4561X(-1);
        this.f3697a = null;
        this.f3705a = null;
        this.f3695a = null;
        if (this.f3694a != null) {
            this.f3702a.mo19198d();
            this.f3694a = null;
        }
        C2921n3<Intent> n3Var = this.f3703a;
        if (n3Var != null) {
            n3Var.mo693d();
            this.f3716b.mo693d();
            this.f3721c.mo693d();
        }
    }

    @mr2
    /* renamed from: J0 */
    public C0649h mo4524J0() {
        return this.f3699a;
    }

    /* renamed from: J1 */
    public void mo4525J1() {
        synchronized (this.f3709a) {
            ArrayList<C0615s> arrayList = this.f3732h;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f3709a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3697a.mo4780g().removeCallbacks(this.f3707a);
                this.f3697a.mo4780g().post(this.f3707a);
                mo4556U1();
            }
        }
    }

    /* renamed from: K */
    public void mo4526K() {
        mo4561X(1);
    }

    @ts2
    /* renamed from: K0 */
    public Fragment mo4527K0() {
        return this.f3695a;
    }

    /* renamed from: K1 */
    public void mo4528K1(@mr2 Fragment fragment, boolean z) {
        ViewGroup D0 = mo4507D0(fragment);
        if (D0 != null && (D0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) D0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: L */
    public void mo4529L() {
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    @ts2
    /* renamed from: L0 */
    public Fragment mo4530L0() {
        return this.f3714b;
    }

    /* renamed from: L1 */
    public void mo4531L1(@mr2 C0645e eVar) {
        this.f3696a = eVar;
    }

    /* renamed from: M */
    public void mo4532M(boolean z) {
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    @mr2
    /* renamed from: M0 */
    public p14 mo4533M0() {
        p14 p14 = this.f3704a;
        if (p14 != null) {
            return p14;
        }
        Fragment fragment = this.f3695a;
        return fragment != null ? fragment.mFragmentManager.mo4533M0() : this.f3717b;
    }

    /* renamed from: M1 */
    public void mo4534M1(@mr2 Fragment fragment, @mr2 C0690e.C0693c cVar) {
        if (!fragment.equals(mo4601n0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = cVar;
    }

    /* renamed from: N */
    public void mo4535N(@mr2 Fragment fragment) {
        Iterator<ya1> it = this.f3711a.iterator();
        while (it.hasNext()) {
            it.next().mo4468a(this, fragment);
        }
    }

    /* renamed from: N1 */
    public void mo4536N1(@ts2 Fragment fragment) {
        if (fragment == null || (fragment.equals(mo4601n0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3714b;
            this.f3714b = fragment;
            mo4543Q(fragment2);
            mo4543Q(this.f3714b);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: O */
    public boolean mo4537O(@mr2 MenuItem menuItem) {
        if (this.f3693a < 1) {
            return false;
        }
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: O0 */
    public gu4 mo4538O0(@mr2 Fragment fragment) {
        return this.f3706a.mo26853k(fragment);
    }

    /* renamed from: O1 */
    public void mo4539O1(@mr2 p14 p14) {
        this.f3704a = p14;
    }

    /* renamed from: P */
    public void mo4540P(@mr2 Menu menu) {
        if (this.f3693a >= 1) {
            for (Fragment next : this.f3701a.mo15924o()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: P0 */
    public void mo4541P0() {
        mo4584h0(true);
        if (this.f3702a.mo19197c()) {
            mo4604o1();
        } else {
            this.f3694a.mo678e();
        }
    }

    /* renamed from: P1 */
    public final void mo4542P1(@mr2 Fragment fragment) {
        ViewGroup D0 = mo4507D0(fragment);
        if (D0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = ab3.C1684g.visible_removing_fragment_view_tag;
            if (D0.getTag(i) == null) {
                D0.setTag(i, fragment);
            }
            ((Fragment) D0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: Q */
    public final void mo4543Q(@ts2 Fragment fragment) {
        if (fragment != null && fragment.equals(mo4601n0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: Q0 */
    public void mo4544Q0(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            mo4542P1(fragment);
        }
    }

    /* renamed from: Q1 */
    public void mo4545Q1(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: R */
    public void mo4546R() {
        mo4561X(5);
    }

    /* renamed from: R0 */
    public void mo4547R0(@mr2 Fragment fragment) {
        if (fragment.mAdded && mo4555U0(fragment)) {
            this.f3720b = true;
        }
    }

    /* renamed from: R1 */
    public final void mo4548R1() {
        for (C0653j k1 : this.f3701a.mo15921l()) {
            mo4593k1(k1);
        }
    }

    /* renamed from: S */
    public void mo4549S(boolean z) {
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: S0 */
    public boolean mo4550S0() {
        return this.f3728e;
    }

    /* renamed from: S1 */
    public final void mo4551S1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new l92("FragmentManager"));
        C0646f<?> fVar = this.f3697a;
        if (fVar != null) {
            try {
                fVar.mo4469h(yg1.C3999a.f23084c, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo4571b0(yg1.C3999a.f23084c, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: T */
    public boolean mo4552T(@mr2 Menu menu) {
        boolean z = false;
        if (this.f3693a < 1) {
            return false;
        }
        for (Fragment next : this.f3701a.mo15924o()) {
            if (next != null && mo4558V0(next) && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: T1 */
    public void mo4553T1(@mr2 C0608m mVar) {
        this.f3699a.mo4804p(mVar);
    }

    /* renamed from: U */
    public void mo4554U() {
        mo4556U1();
        mo4543Q(this.f3714b);
    }

    /* renamed from: U0 */
    public final boolean mo4555U0(@mr2 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo4616t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo4635z0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo4560W0(r3.f3695a) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo19200f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3702a;
     */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4556U1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$q> r0 = r3.f3709a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$q> r1 = r3.f3709a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            com.onedelhi.secure.ku2 r1 = r3.f3702a     // Catch:{ all -> 0x002a }
            r1.mo19200f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            com.onedelhi.secure.ku2 r0 = r3.f3702a
            int r1 = r3.mo4635z0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3695a
            boolean r1 = r3.mo4560W0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo19200f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4556U1():void");
    }

    /* renamed from: V */
    public void mo4557V() {
        this.f3724c = false;
        this.f3726d = false;
        this.f3706a.mo26857o(false);
        mo4561X(7);
    }

    /* renamed from: V0 */
    public boolean mo4558V0(@ts2 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: W */
    public void mo4559W() {
        this.f3724c = false;
        this.f3726d = false;
        this.f3706a.mo26857o(false);
        mo4561X(5);
    }

    /* renamed from: W0 */
    public boolean mo4560W0(@ts2 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.mo4530L0()) && mo4560W0(fragmentManager.f3695a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: X */
    public final void mo4561X(int i) {
        try {
            this.f3713a = true;
            this.f3701a.mo15913d(i);
            mo4578e1(i, false);
            if (f3692h) {
                for (C0668n j : mo4625w()) {
                    j.mo4888j();
                }
            }
            this.f3713a = false;
            mo4584h0(true);
        } catch (Throwable th) {
            this.f3713a = false;
            throw th;
        }
    }

    /* renamed from: X0 */
    public boolean mo4562X0(int i) {
        return this.f3693a >= i;
    }

    /* renamed from: Y */
    public void mo4563Y() {
        this.f3726d = true;
        this.f3706a.mo26857o(true);
        mo4561X(4);
    }

    /* renamed from: Y0 */
    public boolean mo4564Y0() {
        return this.f3724c || this.f3726d;
    }

    /* renamed from: Z */
    public void mo4565Z() {
        mo4561X(2);
    }

    /* renamed from: Z0 */
    public void mo4566Z0(@mr2 Fragment fragment, @mr2 String[] strArr, int i) {
        if (this.f3721c != null) {
            this.f3708a.addLast(new C0609n(fragment.mWho, i));
            this.f3721c.mo20857b(strArr);
            return;
        }
        this.f3697a.mo4781m(fragment, strArr, i);
    }

    /* renamed from: a */
    public final void mo4567a(@mr2 String str) {
        this.f3710a.remove(str);
    }

    /* renamed from: a0 */
    public final void mo4568a0() {
        if (this.f3730f) {
            this.f3730f = false;
            mo4548R1();
        }
    }

    /* renamed from: a1 */
    public void mo4569a1(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @ts2 Bundle bundle) {
        if (this.f3703a != null) {
            this.f3708a.addLast(new C0609n(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra(C2811m3.C2824k.f15891a, bundle);
            }
            this.f3703a.mo20857b(intent);
            return;
        }
        this.f3697a.mo4783q(fragment, intent, i, bundle);
    }

    /* renamed from: b */
    public final void mo4570b(@mr2 String str, @mr2 Bundle bundle) {
        C0611o oVar = this.f3719b.get(str);
        if (oVar == null || !oVar.mo4679b(C0690e.C0693c.STARTED)) {
            this.f3710a.put(str, bundle);
        } else {
            oVar.mo4678a(str, bundle);
        }
    }

    /* renamed from: b0 */
    public void mo4571b0(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3701a.mo15914e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3722c;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3722c.get(i).toString());
            }
        }
        ArrayList<C0620a> arrayList2 = this.f3718b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0620a aVar = this.f3718b.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo4715W(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3712a.get());
        synchronized (this.f3709a) {
            int size3 = this.f3709a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3709a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3697a);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3705a);
        if (this.f3695a != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3695a);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3693a);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3724c);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3726d);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3728e);
        if (this.f3720b) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3720b);
        }
    }

    /* renamed from: b1 */
    public void mo4572b1(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f3716b != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(f3690b, true);
                } else {
                    intent2 = intent;
                }
                if (m4279T0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra(C2811m3.C2824k.f15891a, bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            ts1 a = new ts1.C3662b(intentSender).mo25302b(intent2).mo25303c(i3, i2).mo25301a();
            int i5 = i;
            this.f3708a.addLast(new C0609n(fragment2.mWho, i));
            if (m4279T0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f3716b.mo20857b(a);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        this.f3697a.mo4784r(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public final void mo4573c(@mr2 final String str, @mr2 a32 a32, @mr2 final ab1 ab1) {
        final C0690e lifecycle = a32.getLifecycle();
        if (lifecycle.mo4959b() != C0690e.C0693c.DESTROYED) {
            C05956 r0 = new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    Bundle bundle;
                    if (bVar == C0690e.C0692b.ON_START && (bundle = (Bundle) FragmentManager.this.f3710a.get(str)) != null) {
                        ab1.mo4678a(str, bundle);
                        FragmentManager.this.mo4567a(str);
                    }
                    if (bVar == C0690e.C0692b.ON_DESTROY) {
                        lifecycle.mo4960c(this);
                        FragmentManager.this.f3719b.remove(str);
                    }
                }
            };
            lifecycle.mo4958a(r0);
            C0611o put = this.f3719b.put(str, new C0611o(lifecycle, ab1, r0));
            if (put != null) {
                put.mo4680c();
            }
        }
    }

    /* renamed from: c1 */
    public final void mo4574c1(@mr2 C3679ua<Fragment> uaVar) {
        int size = uaVar.size();
        for (int i = 0; i < size; i++) {
            Fragment o = uaVar.mo25489o(i);
            if (!o.mAdded) {
                View requireView = o.requireView();
                o.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: d */
    public final void mo4575d(@mr2 String str) {
        C0611o remove = this.f3719b.remove(str);
        if (remove != null) {
            remove.mo4680c();
        }
    }

    /* renamed from: d1 */
    public void mo4576d1(@mr2 Fragment fragment) {
        if (this.f3701a.mo15912c(fragment.mWho)) {
            mo4580f1(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                C0638d.C0643d c = C0638d.m4538c(this.f3697a.mo4779f(), fragment, true, fragment.getPopDirection());
                if (c != null) {
                    Animation animation = c.f3850a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        c.f3849a.setTarget(fragment.mView);
                        c.f3849a.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                mo4634z(fragment);
            }
        } else if (m4279T0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3693a + "since it is not added to " + this);
        }
    }

    /* renamed from: e0 */
    public final void mo4577e0() {
        if (f3692h) {
            for (C0668n j : mo4625w()) {
                j.mo4888j();
            }
        } else if (!this.f3723c.isEmpty()) {
            for (Fragment next : this.f3723c.keySet()) {
                mo4614s(next);
                mo4580f1(next);
            }
        }
    }

    /* renamed from: e1 */
    public void mo4578e1(int i, boolean z) {
        C0646f<?> fVar;
        if (this.f3697a == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3693a) {
            this.f3693a = i;
            if (f3692h) {
                this.f3701a.mo15928s();
            } else {
                for (Fragment d1 : this.f3701a.mo15924o()) {
                    mo4576d1(d1);
                }
                for (C0653j next : this.f3701a.mo15921l()) {
                    Fragment k = next.mo4821k();
                    if (!k.mIsNewlyAdded) {
                        mo4576d1(k);
                    }
                    if (k.mRemoving && !k.isInBackStack()) {
                        this.f3701a.mo15927r(next);
                    }
                }
            }
            mo4548R1();
            if (this.f3720b && (fVar = this.f3697a) != null && this.f3693a == 7) {
                fVar.mo4476s();
                this.f3720b = false;
            }
        }
    }

    /* renamed from: f0 */
    public void mo4579f0(@mr2 C0613q qVar, boolean z) {
        if (!z) {
            if (this.f3697a != null) {
                mo4619u();
            } else if (this.f3728e) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3709a) {
            if (this.f3697a != null) {
                this.f3709a.add(qVar);
                mo4525J1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: f1 */
    public void mo4580f1(@mr2 Fragment fragment) {
        mo4582g1(fragment, this.f3693a);
    }

    /* renamed from: g0 */
    public final void mo4581g0(boolean z) {
        if (this.f3713a) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3697a == null) {
            if (this.f3728e) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3697a.mo4780g().getLooper()) {
            if (!z) {
                mo4619u();
            }
            if (this.f3727e == null) {
                this.f3727e = new ArrayList<>();
                this.f3729f = new ArrayList<>();
            }
            this.f3713a = true;
            try {
                mo4598m0((ArrayList<C0620a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3713a = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4582g1(@com.onedelhi.secure.mr2 androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            com.onedelhi.secure.fb1 r0 = r10.f3701a
            java.lang.String r1 = r11.mWho
            androidx.fragment.app.j r0 = r0.mo15923n(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.j r0 = new androidx.fragment.app.j
            androidx.fragment.app.h r2 = r10.f3699a
            com.onedelhi.secure.fb1 r3 = r10.f3701a
            r0.<init>(r2, r3, r11)
            r0.mo4831u(r1)
        L_0x0017:
            boolean r2 = r11.mFromLayout
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.mInLayout
            if (r2 == 0) goto L_0x0028
            int r2 = r11.mState
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.mo4814d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.mState
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<com.onedelhi.secure.qu>> r2 = r10.f3723c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.mo4614s(r11)
        L_0x0047:
            int r2 = r11.mState
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.mo4813c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.mo4815e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.mo4820j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.mo4816f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.mo4811a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.mo4832v()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.mo4826p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.mo4824n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.mo4833w()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = m4279T0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.mView
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.f<?> r2 = r10.f3697a
            boolean r2 = r2.mo4474n(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.mSavedViewState
            if (r2 != 0) goto L_0x00c6
            r0.mo4830t()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.mView
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.mContainer
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.mView
            r7.clearAnimation()
            boolean r7 = r11.isRemovingParent()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f3693a
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.f3728e
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.mView
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.mPostponedAlpha
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.f<?> r2 = r10.f3697a
            android.content.Context r2 = r2.mo4779f()
            r6 = 0
            boolean r7 = r11.getPopDirection()
            androidx.fragment.app.d$d r2 = androidx.fragment.app.C0638d.m4538c(r2, r11, r6, r7)
        L_0x0105:
            r11.mPostponedAlpha = r8
            android.view.ViewGroup r6 = r11.mContainer
            android.view.View r7 = r11.mView
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.m$g r8 = r10.f3700a
            androidx.fragment.app.C0638d.m4536a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = m4279T0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.mContainer
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<com.onedelhi.secure.qu>> r2 = r10.f3723c
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.mo4818h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<com.onedelhi.secure.qu>> r2 = r10.f3723c
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.mo4817g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.mo4819i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.mState
            if (r0 == r12) goto L_0x0196
            boolean r0 = m4279T0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.mState = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4582g1(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: h */
    public final void mo4583h(@mr2 C3679ua<Fragment> uaVar) {
        int i = this.f3693a;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment next : this.f3701a.mo15924o()) {
                if (next.mState < min) {
                    mo4582g1(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        uaVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h0 */
    public boolean mo4584h0(boolean z) {
        mo4581g0(z);
        boolean z2 = false;
        while (mo4623v0(this.f3727e, this.f3729f)) {
            this.f3713a = true;
            try {
                mo4499A1(this.f3727e, this.f3729f);
                mo4622v();
                z2 = true;
            } catch (Throwable th) {
                mo4622v();
                throw th;
            }
        }
        mo4556U1();
        mo4568a0();
        this.f3701a.mo15911b();
        return z2;
    }

    /* renamed from: h1 */
    public void mo4585h1() {
        if (this.f3697a != null) {
            this.f3724c = false;
            this.f3726d = false;
            this.f3706a.mo26857o(false);
            for (Fragment next : this.f3701a.mo15924o()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo4586i(C0620a aVar) {
        if (this.f3718b == null) {
            this.f3718b = new ArrayList<>();
        }
        this.f3718b.add(aVar);
    }

    /* renamed from: i0 */
    public void mo4587i0(@mr2 C0613q qVar, boolean z) {
        if (!z || (this.f3697a != null && !this.f3728e)) {
            mo4581g0(z);
            if (qVar.mo4682b(this.f3727e, this.f3729f)) {
                this.f3713a = true;
                try {
                    mo4499A1(this.f3727e, this.f3729f);
                } finally {
                    mo4622v();
                }
            }
            mo4556U1();
            mo4568a0();
            this.f3701a.mo15911b();
        }
    }

    /* renamed from: i1 */
    public void mo4588i1(@mr2 FragmentContainerView fragmentContainerView) {
        View view;
        for (C0653j next : this.f3701a.mo15921l()) {
            Fragment k = next.mo4821k();
            if (k.mContainerId == fragmentContainerView.getId() && (view = k.mView) != null && view.getParent() == null) {
                k.mContainer = fragmentContainerView;
                next.mo4812b();
            }
        }
    }

    /* renamed from: j */
    public void mo4589j(@mr2 Fragment fragment, @mr2 C3345qu quVar) {
        if (this.f3723c.get(fragment) == null) {
            this.f3723c.put(fragment, new HashSet());
        }
        this.f3723c.get(fragment).add(quVar);
    }

    @mr2
    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: j1 */
    public C0657l mo4590j1() {
        return mo4611r();
    }

    /* renamed from: k */
    public C0653j mo4591k(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0653j A = mo4497A(fragment);
        fragment.mFragmentManager = this;
        this.f3701a.mo15926q(A);
        if (!fragment.mDetached) {
            this.f3701a.mo15910a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (mo4555U0(fragment)) {
                this.f3720b = true;
            }
        }
        return A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4592k0(@com.onedelhi.secure.mr2 java.util.ArrayList<androidx.fragment.app.C0620a> r18, @com.onedelhi.secure.mr2 java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C0620a) r0
            boolean r2 = r0.f3934c
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3731g
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f3731g = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3731g
            com.onedelhi.secure.fb1 r1 = r6.f3701a
            java.util.List r1 = r1.mo15924o()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.mo4530L0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0620a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3731g
            androidx.fragment.app.Fragment r0 = r8.mo4719a0(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3731g
            androidx.fragment.app.Fragment r0 = r8.mo4725h0(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f3927a
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3731g
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f3693a
            if (r0 < r14) goto L_0x00bd
            boolean r0 = f3692h
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.C0620a) r1
            java.util.ArrayList<androidx.fragment.app.l$a> r1 = r1.f3926a
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.l$a r7 = (androidx.fragment.app.C0657l.C0658a) r7
            androidx.fragment.app.Fragment r7 = r7.f3941a
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.j r7 = r6.mo4497A(r7)
            com.onedelhi.secure.fb1 r8 = r6.f3701a
            r8.mo15926q(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.f<?> r0 = r6.f3697a
            android.content.Context r7 = r0.mo4779f()
            com.onedelhi.secure.ta1 r8 = r6.f3705a
            r13 = 0
            androidx.fragment.app.m$g r0 = r6.f3700a
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.C0659m.m4654C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            m4285j0(r18, r19, r20, r21)
            boolean r0 = f3692h
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0620a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.l$a> r8 = r7.f3926a
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.l$a> r9 = r7.f3926a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.l$a r9 = (androidx.fragment.app.C0657l.C0658a) r9
            androidx.fragment.app.Fragment r9 = r9.f3941a
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.j r9 = r6.mo4497A(r9)
            r9.mo4823m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.l$a> r7 = r7.f3926a
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.l$a r8 = (androidx.fragment.app.C0657l.C0658a) r8
            androidx.fragment.app.Fragment r8 = r8.f3941a
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.j r8 = r6.mo4497A(r8)
            r8.mo4823m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f3693a
            r6.mo4578e1(r2, r1)
            java.util.Set r1 = r6.mo4628x(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.n r2 = (androidx.fragment.app.C0668n) r2
            r2.mo4894r(r0)
            r2.mo4892p()
            r2.mo4885g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            com.onedelhi.secure.ua r7 = new com.onedelhi.secure.ua
            r7.<init>()
            r6.mo4583h(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.mo4617t1(r1, r2, r3, r4, r5)
            r6.mo4574c1(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f3693a
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.f<?> r1 = r6.f3697a
            android.content.Context r7 = r1.mo4779f()
            com.onedelhi.secure.ta1 r8 = r6.f3705a
            r1 = 1
            androidx.fragment.app.m$g r2 = r6.f3700a
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.C0659m.m4654C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f3693a
            r6.mo4578e1(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0620a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f3780z
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f3780z = r4
        L_0x01b6:
            r2.mo4723f0()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.mo4505C1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4592k0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: k1 */
    public void mo4593k1(@mr2 C0653j jVar) {
        Fragment k = jVar.mo4821k();
        if (!k.mDeferStart) {
            return;
        }
        if (this.f3713a) {
            this.f3730f = true;
            return;
        }
        k.mDeferStart = false;
        if (f3692h) {
            jVar.mo4823m();
        } else {
            mo4580f1(k);
        }
    }

    /* renamed from: l */
    public void mo4594l(@mr2 ya1 ya1) {
        this.f3711a.add(ya1);
    }

    /* renamed from: l0 */
    public boolean mo4595l0() {
        boolean h0 = mo4584h0(true);
        mo4620u0();
        return h0;
    }

    /* renamed from: l1 */
    public void mo4596l1() {
        mo4579f0(new C0614r((String) null, -1, 0), false);
    }

    /* renamed from: m */
    public void mo4597m(@mr2 C0612p pVar) {
        if (this.f3725d == null) {
            this.f3725d = new ArrayList<>();
        }
        this.f3725d.add(pVar);
    }

    /* renamed from: m0 */
    public final void mo4598m0(@ts2 ArrayList<C0620a> arrayList, @ts2 ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0615s> arrayList3 = this.f3732h;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0615s sVar = this.f3732h.get(i);
            if (arrayList == null || sVar.f3762a || (indexOf2 = arrayList.indexOf(sVar.f3761a)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (sVar.mo4685e() || (arrayList != null && sVar.f3761a.mo4721c0(arrayList, 0, arrayList.size()))) {
                    this.f3732h.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || sVar.f3762a || (indexOf = arrayList.indexOf(sVar.f3761a)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        sVar.mo4684d();
                    }
                }
                i++;
            } else {
                this.f3732h.remove(i);
                i--;
                size--;
            }
            sVar.mo4683c();
            i++;
        }
    }

    /* renamed from: m1 */
    public void mo4599m1(int i, int i2) {
        if (i >= 0) {
            mo4579f0(new C0614r((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: n */
    public void mo4600n(@mr2 Fragment fragment) {
        this.f3706a.mo26845b(fragment);
    }

    @ts2
    /* renamed from: n0 */
    public Fragment mo4601n0(@mr2 String str) {
        return this.f3701a.mo15915f(str);
    }

    /* renamed from: n1 */
    public void mo4602n1(@ts2 String str, int i) {
        mo4579f0(new C0614r(str, -1, i), false);
    }

    /* renamed from: o */
    public int mo4603o() {
        return this.f3712a.getAndIncrement();
    }

    /* renamed from: o1 */
    public boolean mo4604o1() {
        return mo4613r1((String) null, -1, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: com.onedelhi.secure.lu2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4605p(@com.onedelhi.secure.mr2 androidx.fragment.app.C0646f<?> r3, @com.onedelhi.secure.mr2 com.onedelhi.secure.ta1 r4, @com.onedelhi.secure.ts2 androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.f<?> r0 = r2.f3697a
            if (r0 != 0) goto L_0x0103
            r2.f3697a = r3
            r2.f3705a = r4
            r2.f3695a = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$i r4 = new androidx.fragment.app.FragmentManager$i
            r4.<init>(r5)
        L_0x0011:
            r2.mo4594l(r4)
            goto L_0x001d
        L_0x0015:
            boolean r4 = r3 instanceof com.onedelhi.secure.ya1
            if (r4 == 0) goto L_0x001d
            r4 = r3
            com.onedelhi.secure.ya1 r4 = (com.onedelhi.secure.ya1) r4
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r4 = r2.f3695a
            if (r4 == 0) goto L_0x0024
            r2.mo4556U1()
        L_0x0024:
            boolean r4 = r3 instanceof com.onedelhi.secure.lu2
            if (r4 == 0) goto L_0x0039
            r4 = r3
            com.onedelhi.secure.lu2 r4 = (com.onedelhi.secure.lu2) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo614C()
            r2.f3694a = r0
            if (r5 == 0) goto L_0x0034
            r4 = r5
        L_0x0034:
            com.onedelhi.secure.ku2 r1 = r2.f3702a
            r0.mo674a(r4, r1)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            com.onedelhi.secure.xa1 r3 = r3.mo4498A0(r5)
        L_0x0041:
            r2.f3706a = r3
            goto L_0x005a
        L_0x0044:
            boolean r4 = r3 instanceof com.onedelhi.secure.hu4
            if (r4 == 0) goto L_0x0053
            com.onedelhi.secure.hu4 r3 = (com.onedelhi.secure.hu4) r3
            com.onedelhi.secure.gu4 r3 = r3.getViewModelStore()
            com.onedelhi.secure.xa1 r3 = com.onedelhi.secure.xa1.m31360g(r3)
            goto L_0x0041
        L_0x0053:
            com.onedelhi.secure.xa1 r3 = new com.onedelhi.secure.xa1
            r4 = 0
            r3.<init>(r4)
            goto L_0x0041
        L_0x005a:
            com.onedelhi.secure.xa1 r3 = r2.f3706a
            boolean r4 = r2.mo4564Y0()
            r3.mo26857o(r4)
            com.onedelhi.secure.fb1 r3 = r2.f3701a
            com.onedelhi.secure.xa1 r4 = r2.f3706a
            r3.mo15934y(r4)
            androidx.fragment.app.f<?> r3 = r2.f3697a
            boolean r4 = r3 instanceof com.onedelhi.secure.C3023o3
            if (r4 == 0) goto L_0x0102
            com.onedelhi.secure.o3 r3 = (com.onedelhi.secure.C3023o3) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.mo629f0()
            if (r5 == 0) goto L_0x008c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = ""
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.onedelhi.secure.m3$k r0 = new com.onedelhi.secure.m3$k
            r0.<init>()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            com.onedelhi.secure.n3 r5 = r3.mo687i(r5, r0, r1)
            r2.f3703a = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$l r0 = new androidx.fragment.app.FragmentManager$l
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            com.onedelhi.secure.n3 r5 = r3.mo687i(r5, r0, r1)
            r2.f3716b = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.onedelhi.secure.m3$i r5 = new com.onedelhi.secure.m3$i
            r5.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            com.onedelhi.secure.n3 r3 = r3.mo687i(r4, r5, r0)
            r2.f3721c = r3
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4605p(androidx.fragment.app.f, com.onedelhi.secure.ta1, androidx.fragment.app.Fragment):void");
    }

    @ts2
    /* renamed from: p0 */
    public Fragment mo4606p0(@mo1 int i) {
        return this.f3701a.mo15916g(i);
    }

    /* renamed from: p1 */
    public boolean mo4607p1(int i, int i2) {
        if (i >= 0) {
            return mo4613r1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: q */
    public void mo4608q(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f3701a.mo15910a(fragment);
                if (m4279T0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (mo4555U0(fragment)) {
                    this.f3720b = true;
                }
            }
        }
    }

    @ts2
    /* renamed from: q0 */
    public Fragment mo4609q0(@ts2 String str) {
        return this.f3701a.mo15917h(str);
    }

    /* renamed from: q1 */
    public boolean mo4610q1(@ts2 String str, int i) {
        return mo4613r1(str, -1, i);
    }

    @mr2
    /* renamed from: r */
    public C0657l mo4611r() {
        return new C0620a(this);
    }

    /* renamed from: r0 */
    public Fragment mo4612r0(@mr2 String str) {
        return this.f3701a.mo15918i(str);
    }

    /* renamed from: r1 */
    public final boolean mo4613r1(@ts2 String str, int i, int i2) {
        mo4584h0(false);
        mo4581g0(true);
        Fragment fragment = this.f3714b;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo4604o1()) {
            return true;
        }
        boolean s1 = mo4615s1(this.f3727e, this.f3729f, str, i, i2);
        if (s1) {
            this.f3713a = true;
            try {
                mo4499A1(this.f3727e, this.f3729f);
            } finally {
                mo4622v();
            }
        }
        mo4556U1();
        mo4568a0();
        this.f3701a.mo15911b();
        return s1;
    }

    /* renamed from: s */
    public final void mo4614s(@mr2 Fragment fragment) {
        HashSet hashSet = this.f3723c.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C3345qu) it.next()).mo23439a();
            }
            hashSet.clear();
            mo4500B(fragment);
            this.f3723c.remove(fragment);
        }
    }

    /* renamed from: s1 */
    public boolean mo4615s1(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2, @ts2 String str, int i, int i2) {
        int i3;
        ArrayList<C0620a> arrayList3 = this.f3718b;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3718b.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0620a aVar = this.f3718b.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i >= 0 && i == aVar.f3780z)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0620a aVar2 = this.f3718b.get(size2);
                        if ((str == null || !str.equals(aVar2.getName())) && (i < 0 || i != aVar2.f3780z)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3718b.size() - 1) {
                return false;
            }
            for (int size3 = this.f3718b.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3718b.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo4616t() {
        boolean z = false;
        for (Fragment next : this.f3701a.mo15922m()) {
            if (next != null) {
                z = mo4555U0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t1 */
    public final int mo4617t1(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2, int i, int i2, @mr2 C3679ua<Fragment> uaVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0620a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo4722e0() && !aVar.mo4721c0(arrayList, i4 + 1, i2)) {
                if (this.f3732h == null) {
                    this.f3732h = new ArrayList<>();
                }
                C0615s sVar = new C0615s(aVar, booleanValue);
                this.f3732h.add(sVar);
                aVar.mo4724g0(sVar);
                if (booleanValue) {
                    aVar.mo4717Y();
                } else {
                    aVar.mo4718Z(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                mo4583h(uaVar);
            }
        }
        return i3;
    }

    @mr2
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3695a;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append(to1.f35745h);
            obj = this.f3695a;
        } else {
            C0646f<?> fVar = this.f3697a;
            if (fVar != null) {
                sb.append(fVar.getClass().getSimpleName());
                sb.append(to1.f35745h);
                obj = this.f3697a;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo4619u() {
        if (mo4564Y0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: u0 */
    public final void mo4620u0() {
        if (f3692h) {
            for (C0668n k : mo4625w()) {
                k.mo4889k();
            }
        } else if (this.f3732h != null) {
            while (!this.f3732h.isEmpty()) {
                this.f3732h.remove(0).mo4684d();
            }
        }
    }

    /* renamed from: u1 */
    public void mo4621u1(@mr2 Bundle bundle, @mr2 String str, @mr2 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            mo4551S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: v */
    public final void mo4622v() {
        this.f3713a = false;
        this.f3729f.clear();
        this.f3727e.clear();
    }

    /* renamed from: v0 */
    public final boolean mo4623v0(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2) {
        synchronized (this.f3709a) {
            if (this.f3709a.isEmpty()) {
                return false;
            }
            int size = this.f3709a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3709a.get(i).mo4682b(arrayList, arrayList2);
            }
            this.f3709a.clear();
            this.f3697a.mo4780g().removeCallbacks(this.f3707a);
            return z;
        }
    }

    /* renamed from: v1 */
    public void mo4624v1(@mr2 C0608m mVar, boolean z) {
        this.f3699a.mo4803o(mVar, z);
    }

    /* renamed from: w */
    public final Set<C0668n> mo4625w() {
        HashSet hashSet = new HashSet();
        for (C0653j k : this.f3701a.mo15921l()) {
            ViewGroup viewGroup = k.mo4821k().mContainer;
            if (viewGroup != null) {
                hashSet.add(C0668n.m4685o(viewGroup, mo4533M0()));
            }
        }
        return hashSet;
    }

    /* renamed from: w0 */
    public int mo4626w0() {
        return this.f3701a.mo15920k();
    }

    /* renamed from: w1 */
    public void mo4627w1(@mr2 Fragment fragment, @mr2 C3345qu quVar) {
        HashSet hashSet = this.f3723c.get(fragment);
        if (hashSet != null && hashSet.remove(quVar) && hashSet.isEmpty()) {
            this.f3723c.remove(fragment);
            if (fragment.mState < 5) {
                mo4500B(fragment);
                mo4580f1(fragment);
            }
        }
    }

    /* renamed from: x */
    public final Set<C0668n> mo4628x(@mr2 ArrayList<C0620a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C0657l.C0658a> it = arrayList.get(i).f3926a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3941a;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(C0668n.m4684n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    @mr2
    /* renamed from: x0 */
    public List<Fragment> mo4629x0() {
        return this.f3701a.mo15922m();
    }

    /* renamed from: x1 */
    public void mo4630x1(@mr2 Fragment fragment) {
        if (m4279T0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f3701a.mo15929t(fragment);
            if (mo4555U0(fragment)) {
                this.f3720b = true;
            }
            fragment.mRemoving = true;
            mo4542P1(fragment);
        }
    }

    /* renamed from: y */
    public void mo4631y(@mr2 C0620a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo4718Z(z3);
        } else {
            aVar.mo4717Y();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f3693a >= 1) {
            C0659m.m4654C(this.f3697a.mo4779f(), this.f3705a, arrayList, arrayList2, 0, 1, true, this.f3700a);
        }
        if (z3) {
            mo4578e1(this.f3693a, true);
        }
        for (Fragment next : this.f3701a.mo15922m()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && aVar.mo4720b0(next.mContainerId)) {
                float f = next.mPostponedAlpha;
                if (f > 0.0f) {
                    next.mView.setAlpha(f);
                }
                if (z3) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    @mr2
    /* renamed from: y0 */
    public C0606k mo4632y0(int i) {
        return this.f3718b.get(i);
    }

    /* renamed from: y1 */
    public void mo4633y1(@mr2 ya1 ya1) {
        this.f3711a.remove(ya1);
    }

    /* renamed from: z */
    public final void mo4634z(@mr2 Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0638d.C0643d c = C0638d.m4538c(this.f3697a.mo4779f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c == null || (animator = c.f3849a) == null) {
                if (c != null) {
                    fragment.mView.startAnimation(c.f3850a);
                    c.f3850a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c.f3849a.addListener(new C0603h(viewGroup, view, fragment));
                }
                c.f3849a.start();
            }
        }
        mo4547R0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: z0 */
    public int mo4635z0() {
        ArrayList<C0620a> arrayList = this.f3718b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: z1 */
    public void mo4636z1(@mr2 C0612p pVar) {
        ArrayList<C0612p> arrayList = this.f3725d;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }
}
