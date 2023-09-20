package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.C0689d;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import androidx.lifecycle.C0695g;
import androidx.lifecycle.C0706k;
import androidx.lifecycle.C0709m;
import androidx.lifecycle.LiveData;
import com.onedelhi.secure.C1936d3;
import com.onedelhi.secure.C2470j3;
import com.onedelhi.secure.C2593k3;
import com.onedelhi.secure.C2691l3;
import com.onedelhi.secure.C2921n3;
import com.onedelhi.secure.C3023o3;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.bd1;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.cr3;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hn4;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.j62;
import com.onedelhi.secure.jb0;
import com.onedelhi.secure.jb1;
import com.onedelhi.secure.kk1;
import com.onedelhi.secure.kv4;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.m70;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mv4;
import com.onedelhi.secure.ov4;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.px3;
import com.onedelhi.secure.q12;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.t64;
import com.onedelhi.secure.ta1;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.va1;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, a32, hu4, C0689d, dr3, C2593k3 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C0586i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    @mr2
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    @s12
    private int mContentLayoutId;
    public C0709m.C0713b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C0646f<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C0695g mLifecycleRegistry;
    public C0690e.C0693c mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C0588k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public cr3 mSavedStateRegistryController;
    @ts2
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    @ts2
    public jb1 mViewLifecycleOwner;
    public lm2<a32> mViewLifecycleOwnerLiveData;
    @mr2
    public String mWho;

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C0578a implements Runnable {
        public C0578a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C0579b implements Runnable {
        public C0579b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C0580c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0668n f3636a;

        public C0580c(C0668n nVar) {
            this.f3636a = nVar;
        }

        public void run() {
            this.f3636a.mo4885g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C0581d extends ta1 {
        public C0581d() {
        }

        @ts2
        /* renamed from: c */
        public View mo4428c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: d */
        public boolean mo4429d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C0582e implements bd1<Void, ActivityResultRegistry> {
        public C0582e() {
        }

        /* renamed from: b */
        public ActivityResultRegistry mo4430a(Void voidR) {
            Fragment fragment = Fragment.this;
            C0646f<?> fVar = fragment.mHost;
            return fVar instanceof C3023o3 ? ((C3023o3) fVar).mo629f0() : fragment.requireActivity().mo629f0();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C0583f implements bd1<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f3639a;

        public C0583f(ActivityResultRegistry activityResultRegistry) {
            this.f3639a = activityResultRegistry;
        }

        /* renamed from: b */
        public ActivityResultRegistry mo4430a(Void voidR) {
            return this.f3639a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C0584g extends C0588k {

        /* renamed from: a */
        public final /* synthetic */ bd1 f3642a;

        /* renamed from: a */
        public final /* synthetic */ C2470j3 f3643a;

        /* renamed from: a */
        public final /* synthetic */ C2691l3 f3644a;

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f3645a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0584g(bd1 bd1, AtomicReference atomicReference, C2691l3 l3Var, C2470j3 j3Var) {
            super((C0578a) null);
            this.f3642a = bd1;
            this.f3645a = atomicReference;
            this.f3644a = l3Var;
            this.f3643a = j3Var;
        }

        /* renamed from: a */
        public void mo4433a() {
            this.f3645a.set(((ActivityResultRegistry) this.f3642a.mo4430a(null)).mo688j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f3644a, this.f3643a));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C0585h extends C2921n3<I> {

        /* renamed from: a */
        public final /* synthetic */ C2691l3 f3647a;

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f3648a;

        public C0585h(AtomicReference atomicReference, C2691l3 l3Var) {
            this.f3648a = atomicReference;
            this.f3647a = l3Var;
        }

        @mr2
        /* renamed from: a */
        public C2691l3<I, ?> mo691a() {
            return this.f3647a;
        }

        /* renamed from: c */
        public void mo692c(I i, @ts2 C1936d3 d3Var) {
            C2921n3 n3Var = (C2921n3) this.f3648a.get();
            if (n3Var != null) {
                n3Var.mo692c(i, d3Var);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: d */
        public void mo693d() {
            C2921n3 n3Var = (C2921n3) this.f3648a.getAndSet((Object) null);
            if (n3Var != null) {
                n3Var.mo693d();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public static class C0586i {

        /* renamed from: a */
        public float f3649a;

        /* renamed from: a */
        public int f3650a;

        /* renamed from: a */
        public Animator f3651a;

        /* renamed from: a */
        public View f3652a;

        /* renamed from: a */
        public C0589l f3653a;

        /* renamed from: a */
        public px3 f3654a;

        /* renamed from: a */
        public Boolean f3655a;

        /* renamed from: a */
        public Object f3656a = null;

        /* renamed from: a */
        public ArrayList<String> f3657a;

        /* renamed from: a */
        public boolean f3658a;

        /* renamed from: b */
        public int f3659b;

        /* renamed from: b */
        public View f3660b;

        /* renamed from: b */
        public px3 f3661b;

        /* renamed from: b */
        public Boolean f3662b;

        /* renamed from: b */
        public Object f3663b;

        /* renamed from: b */
        public ArrayList<String> f3664b;

        /* renamed from: b */
        public boolean f3665b;

        /* renamed from: c */
        public int f3666c;

        /* renamed from: c */
        public Object f3667c;

        /* renamed from: c */
        public boolean f3668c;

        /* renamed from: d */
        public int f3669d;

        /* renamed from: d */
        public Object f3670d;

        /* renamed from: e */
        public int f3671e;

        /* renamed from: e */
        public Object f3672e;

        /* renamed from: f */
        public Object f3673f;

        public C0586i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f3663b = obj;
            this.f3667c = null;
            this.f3670d = obj;
            this.f3672e = null;
            this.f3673f = obj;
            this.f3654a = null;
            this.f3661b = null;
            this.f3649a = 1.0f;
            this.f3660b = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C0587j extends RuntimeException {
        public C0587j(@mr2 String str, @ts2 Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    public static abstract class C0588k {
        public C0588k() {
        }

        public /* synthetic */ C0588k(C0578a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract void mo4433a();
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    public interface C0589l {
        /* renamed from: a */
        void mo4434a();

        /* renamed from: b */
        void mo4435b();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.Fragment$m */
    public static class C0590m implements Parcelable {
        @mr2
        public static final Parcelable.Creator<C0590m> CREATOR = new C0591a();

        /* renamed from: a */
        public final Bundle f3674a;

        /* renamed from: androidx.fragment.app.Fragment$m$a */
        public class C0591a implements Parcelable.ClassLoaderCreator<C0590m> {
            /* renamed from: a */
            public C0590m createFromParcel(Parcel parcel) {
                return new C0590m(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0590m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0590m(parcel, classLoader);
            }

            /* renamed from: c */
            public C0590m[] newArray(int i) {
                return new C0590m[i];
            }
        }

        public C0590m(Bundle bundle) {
            this.f3674a = bundle;
        }

        public C0590m(@mr2 Parcel parcel, @ts2 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3674a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            parcel.writeBundle(this.f3674a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new va1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0578a();
        this.mMaxState = C0690e.C0693c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new lm2<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        mo4311l();
    }

    @m70
    public Fragment(@s12 int i) {
        this();
        this.mContentLayoutId = i;
    }

    @mr2
    @Deprecated
    public static Fragment instantiate(@mr2 Context context, @mr2 String str) {
        return instantiate(context, str, (Bundle) null);
    }

    @mr2
    @Deprecated
    public static Fragment instantiate(@mr2 Context context, @mr2 String str, @ts2 Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0645e.m4542d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0587j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0587j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0587j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0587j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0586i iVar = this.mAnimationInfo;
        C0589l lVar = null;
        if (iVar != null) {
            iVar.f3665b = false;
            C0589l lVar2 = iVar.f3653a;
            iVar.f3653a = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            lVar.mo4435b();
        } else if (FragmentManager.f3692h && this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            C0668n n = C0668n.m4684n(viewGroup, fragmentManager);
            n.mo4892p();
            if (z) {
                this.mHost.mo4780g().post(new C0580c(n));
            } else {
                n.mo4885g();
            }
        }
    }

    @mr2
    public ta1 createFragmentContainer() {
        return new C0581d();
    }

    public void dump(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            j62.m18173d(this).mo18148b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ar4.f25981a);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.mo4571b0(str + yg1.C3999a.f23084c, fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@ts2 Object obj) {
        return super.equals(obj);
    }

    @ts2
    public Fragment findFragmentByWho(@mr2 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.mo4612r0(str);
    }

    @mr2
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @ts2
    public final FragmentActivity getActivity() {
        C0646f<?> fVar = this.mHost;
        if (fVar == null) {
            return null;
        }
        return (FragmentActivity) fVar.mo4778e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f3662b) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f3655a) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3652a;
    }

    public Animator getAnimator() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3651a;
    }

    @ts2
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @mr2
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @ts2
    public Context getContext() {
        C0646f<?> fVar = this.mHost;
        if (fVar == null) {
            return null;
        }
        return fVar.mo4779f();
    }

    @mr2
    public C0709m.C0713b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m4279T0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C0706k(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3650a;
    }

    @ts2
    public Object getEnterTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3656a;
    }

    public px3 getEnterTransitionCallback() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3654a;
    }

    public int getExitAnim() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3659b;
    }

    @ts2
    public Object getExitTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3667c;
    }

    public px3 getExitTransitionCallback() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3661b;
    }

    public View getFocusedView() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3660b;
    }

    @ts2
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @ts2
    public final Object getHost() {
        C0646f<?> fVar = this.mHost;
        if (fVar == null) {
            return null;
        }
        return fVar.mo4470i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @mr2
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    @mr2
    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    public LayoutInflater getLayoutInflater(@ts2 Bundle bundle) {
        C0646f<?> fVar = this.mHost;
        if (fVar != null) {
            LayoutInflater j = fVar.mo4471j();
            q12.m25254d(j, this.mChildFragmentManager.mo4521I0());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @mr2
    public C0690e getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @mr2
    @Deprecated
    public j62 getLoaderManager() {
        return j62.m18173d(this);
    }

    public int getNextTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3671e;
    }

    @ts2
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @mr2
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f3658a;
    }

    public int getPopEnterAnim() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3666c;
    }

    public int getPopExitAnim() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3669d;
    }

    public float getPostOnViewCreatedAlpha() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f3649a;
    }

    @ts2
    public Object getReenterTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3670d;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @mr2
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @ts2
    public Object getReturnTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3663b;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @mr2
    public final br3 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo14340b();
    }

    @ts2
    public Object getSharedElementEnterTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f3672e;
    }

    @ts2
    public Object getSharedElementReturnTransition() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3673f;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3657a;
     */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3657a
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3664b;
     */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3664b
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementTargetNames():java.util.ArrayList");
    }

    @mr2
    public final String getString(@e54 int i) {
        return getResources().getString(i);
    }

    @mr2
    public final String getString(@e54 int i, @ts2 Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @ts2
    public final String getTag() {
        return this.mTag;
    }

    @ts2
    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo4601n0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @mr2
    public final CharSequence getText(@e54 int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @ts2
    public View getView() {
        return this.mView;
    }

    @bc2
    @mr2
    public a32 getViewLifecycleOwner() {
        jb1 jb1 = this.mViewLifecycleOwner;
        if (jb1 != null) {
            return jb1;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @mr2
    public LiveData<a32> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @mr2
    public gu4 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (mo4310k() != C0690e.C0693c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.mo4538O0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @hl3({hl3.C2354a.f13188c})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        mo4311l();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new va1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f3668c;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.mo4558V0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isMenuVisible():boolean");
    }

    public boolean isPostponed() {
        C0586i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f3665b;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo4564Y0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    /* renamed from: j */
    public final C0586i mo4309j() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0586i();
        }
        return this.mAnimationInfo;
    }

    /* renamed from: k */
    public final int mo4310k() {
        C0690e.C0693c cVar = this.mMaxState;
        return (cVar == C0690e.C0693c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.mo4310k());
    }

    /* renamed from: l */
    public final void mo4311l() {
        this.mLifecycleRegistry = new C0695g(this);
        this.mSavedStateRegistryController = cr3.m12700a(this);
        this.mDefaultFactory = null;
    }

    @mr2
    /* renamed from: n */
    public final <I, O> C2921n3<I> mo4312n(@mr2 C2691l3<I, O> l3Var, @mr2 bd1<Void, ActivityResultRegistry> bd1, @mr2 C2470j3<O> j3Var) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            mo4314o(new C0584g(bd1, atomicReference, l3Var, j3Var));
            return new C0585h(atomicReference, l3Var);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo4585h1();
    }

    /* renamed from: o */
    public final void mo4314o(@mr2 C0588k kVar) {
        if (this.mState >= 0) {
            kVar.mo4433a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    @bc2
    @C3740us
    @Deprecated
    public void onActivityCreated(@ts2 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @bc2
    @C3740us
    @Deprecated
    public void onAttach(@mr2 Activity activity) {
        this.mCalled = true;
    }

    @bc2
    @C3740us
    public void onAttach(@mr2 Context context) {
        this.mCalled = true;
        C0646f<?> fVar = this.mHost;
        Activity e = fVar == null ? null : fVar.mo4778e();
        if (e != null) {
            this.mCalled = false;
            onAttach(e);
        }
    }

    @bc2
    @Deprecated
    public void onAttachFragment(@mr2 Fragment fragment) {
    }

    @C3740us
    public void onConfigurationChanged(@mr2 Configuration configuration) {
        this.mCalled = true;
    }

    @bc2
    public boolean onContextItemSelected(@mr2 MenuItem menuItem) {
        return false;
    }

    @bc2
    @C3740us
    public void onCreate(@ts2 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo4562X0(1)) {
            this.mChildFragmentManager.mo4517H();
        }
    }

    @bc2
    @ts2
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @bc2
    @ts2
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @bc2
    public void onCreateContextMenu(@mr2 ContextMenu contextMenu, @mr2 View view, @ts2 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @bc2
    public void onCreateOptionsMenu(@mr2 Menu menu, @mr2 MenuInflater menuInflater) {
    }

    @bc2
    @ts2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @bc2
    @C3740us
    public void onDestroy() {
        this.mCalled = true;
    }

    @bc2
    public void onDestroyOptionsMenu() {
    }

    @bc2
    @C3740us
    public void onDestroyView() {
        this.mCalled = true;
    }

    @bc2
    @C3740us
    public void onDetach() {
        this.mCalled = true;
    }

    @mr2
    public LayoutInflater onGetLayoutInflater(@ts2 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @bc2
    public void onHiddenChanged(boolean z) {
    }

    @C3740us
    @hn4
    @Deprecated
    public void onInflate(@mr2 Activity activity, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        this.mCalled = true;
    }

    @C3740us
    @hn4
    public void onInflate(@mr2 Context context, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        this.mCalled = true;
        C0646f<?> fVar = this.mHost;
        Activity e = fVar == null ? null : fVar.mo4778e();
        if (e != null) {
            this.mCalled = false;
            onInflate(e, attributeSet, bundle);
        }
    }

    @bc2
    @C3740us
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @bc2
    public boolean onOptionsItemSelected(@mr2 MenuItem menuItem) {
        return false;
    }

    @bc2
    public void onOptionsMenuClosed(@mr2 Menu menu) {
    }

    @bc2
    @C3740us
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @bc2
    public void onPrepareOptionsMenu(@mr2 Menu menu) {
    }

    @bc2
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
    }

    @bc2
    @C3740us
    public void onResume() {
        this.mCalled = true;
    }

    @bc2
    public void onSaveInstanceState(@mr2 Bundle bundle) {
    }

    @bc2
    @C3740us
    public void onStart() {
        this.mCalled = true;
    }

    @bc2
    @C3740us
    public void onStop() {
        this.mCalled = true;
    }

    @bc2
    public void onViewCreated(@mr2 View view, @ts2 Bundle bundle) {
    }

    @bc2
    @C3740us
    public void onViewStateRestored(@ts2 Bundle bundle) {
        this.mCalled = true;
    }

    /* renamed from: p */
    public final void mo4351p() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo4585h1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            mo4351p();
            this.mChildFragmentManager.mo4506D();
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<C0588k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4433a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo4605p(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo4779f());
        if (this.mCalled) {
            this.mFragmentManager.mo4535N(this);
            this.mChildFragmentManager.mo4509E();
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(@mr2 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo4512F(configuration);
    }

    public boolean performContextItemSelected(@mr2 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo4515G(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo4585h1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4958a(new C0694f() {
            /* renamed from: g */
            public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                View view;
                if (bVar == C0690e.C0692b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.mo14342d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4968j(C0690e.C0692b.ON_CREATE);
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(@mr2 Menu menu, @mr2 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo4520I(menu, menuInflater);
    }

    public void performCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        this.mChildFragmentManager.mo4585h1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new jb1(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo18208b();
            kv4.m20051b(this.mView, this.mViewLifecycleOwner);
            ov4.m24127b(this.mView, this.mViewLifecycleOwner);
            mv4.m22038b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo4933q(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo18209c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo4523J();
        this.mLifecycleRegistry.mo4968j(C0690e.C0692b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new t64("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo4526K();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo4959b().mo4962a(C0690e.C0693c.CREATED)) {
            this.mViewLifecycleOwner.mo18207a(C0690e.C0692b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            j62.m18173d(this).mo18152h();
            this.mPerformedCreateView = false;
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new t64("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.mo4550S0()) {
            this.mChildFragmentManager.mo4523J();
            this.mChildFragmentManager = new va1();
        }
    }

    @mr2
    public LayoutInflater performGetLayoutInflater(@ts2 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo4529L();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo4532M(z);
    }

    public boolean performOptionsItemSelected(@mr2 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo4537O(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(@mr2 Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo4540P(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo4546R();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo18207a(C0690e.C0692b.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4968j(C0690e.C0692b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new t64("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo4549S(z);
    }

    public boolean performPrepareOptionsMenu(@mr2 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo4552T(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean W0 = this.mFragmentManager.mo4560W0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != W0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(W0);
            onPrimaryNavigationFragmentChanged(W0);
            this.mChildFragmentManager.mo4554U();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.mo4585h1();
        this.mChildFragmentManager.mo4584h0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C0695g gVar = this.mLifecycleRegistry;
            C0690e.C0692b bVar = C0690e.C0692b.ON_RESUME;
            gVar.mo4968j(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo18207a(bVar);
            }
            this.mChildFragmentManager.mo4557V();
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo14343e(bundle);
        Parcelable H1 = this.mChildFragmentManager.mo4519H1();
        if (H1 != null) {
            bundle.putParcelable(FragmentActivity.f3675c, H1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.mo4585h1();
        this.mChildFragmentManager.mo4584h0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C0695g gVar = this.mLifecycleRegistry;
            C0690e.C0692b bVar = C0690e.C0692b.ON_START;
            gVar.mo4968j(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo18207a(bVar);
            }
            this.mChildFragmentManager.mo4559W();
            return;
        }
        throw new t64("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.mo4563Y();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo18207a(C0690e.C0692b.ON_STOP);
        }
        this.mLifecycleRegistry.mo4968j(C0690e.C0692b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new t64("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo4565Z();
    }

    public void postponeEnterTransition() {
        mo4309j().f3665b = true;
    }

    public final void postponeEnterTransition(long j, @mr2 TimeUnit timeUnit) {
        mo4309j().f3665b = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler g = fragmentManager != null ? fragmentManager.mo4518H0().mo4780g() : new Handler(Looper.getMainLooper());
        g.removeCallbacks(this.mPostponedDurationRunnable);
        g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @bc2
    @mr2
    public final <I, O> C2921n3<I> registerForActivityResult(@mr2 C2691l3<I, O> l3Var, @mr2 ActivityResultRegistry activityResultRegistry, @mr2 C2470j3<O> j3Var) {
        return mo4312n(l3Var, new C0583f(activityResultRegistry), j3Var);
    }

    @bc2
    @mr2
    public final <I, O> C2921n3<I> registerForActivityResult(@mr2 C2691l3<I, O> l3Var, @mr2 C2470j3<O> j3Var) {
        return mo4312n(l3Var, new C0582e(), j3Var);
    }

    public void registerForContextMenu(@mr2 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@mr2 String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().mo4566Z0(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @mr2
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @mr2
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @mr2
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @mr2
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @mr2
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @mr2
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @mr2
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(@ts2 Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(FragmentActivity.f3675c)) != null) {
            this.mChildFragmentManager.mo4511E1(parcelable);
            this.mChildFragmentManager.mo4517H();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo18210d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new t64("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo18207a(C0690e.C0692b.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        mo4309j().f3662b = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        mo4309j().f3655a = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        mo4309j().f3652a = view;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            mo4309j().f3650a = i;
            mo4309j().f3659b = i2;
            mo4309j().f3666c = i3;
            mo4309j().f3669d = i4;
        }
    }

    public void setAnimator(Animator animator) {
        mo4309j().f3651a = animator;
    }

    public void setArguments(@ts2 Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(@ts2 px3 px3) {
        mo4309j().f3654a = px3;
    }

    public void setEnterTransition(@ts2 Object obj) {
        mo4309j().f3656a = obj;
    }

    public void setExitSharedElementCallback(@ts2 px3 px3) {
        mo4309j().f3661b = px3;
    }

    public void setExitTransition(@ts2 Object obj) {
        mo4309j().f3667c = obj;
    }

    public void setFocusedView(View view) {
        mo4309j().f3660b = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo4476s();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        mo4309j().f3668c = z;
    }

    public void setInitialSavedState(@ts2 C0590m mVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (mVar == null || (bundle = mVar.f3674a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo4476s();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            mo4309j();
            this.mAnimationInfo.f3671e = i;
        }
    }

    public void setOnStartEnterTransitionListener(C0589l lVar) {
        mo4309j();
        C0586i iVar = this.mAnimationInfo;
        C0589l lVar2 = iVar.f3653a;
        if (lVar != lVar2) {
            if (lVar == null || lVar2 == null) {
                if (iVar.f3665b) {
                    iVar.f3653a = lVar;
                }
                if (lVar != null) {
                    lVar.mo4434a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            mo4309j().f3658a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        mo4309j().f3649a = f;
    }

    public void setReenterTransition(@ts2 Object obj) {
        mo4309j().f3670d = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.mo4600n(this);
        } else {
            fragmentManager.mo4502B1(this);
        }
    }

    public void setReturnTransition(@ts2 Object obj) {
        mo4309j().f3663b = obj;
    }

    public void setSharedElementEnterTransition(@ts2 Object obj) {
        mo4309j().f3672e = obj;
    }

    public void setSharedElementNames(@ts2 ArrayList<String> arrayList, @ts2 ArrayList<String> arrayList2) {
        mo4309j();
        C0586i iVar = this.mAnimationInfo;
        iVar.f3657a = arrayList;
        iVar.f3664b = arrayList2;
    }

    public void setSharedElementReturnTransition(@ts2 Object obj) {
        mo4309j().f3673f = obj;
    }

    @Deprecated
    public void setTargetFragment(@ts2 Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
                this.mTargetRequestCode = i;
                return;
            } else {
                this.mTargetWho = fragment.mWho;
            }
            this.mTarget = null;
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.mo4593k1(fragmentManager.mo4497A(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@mr2 String str) {
        C0646f<?> fVar = this.mHost;
        if (fVar != null) {
            return fVar.mo4475o(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @ts2 Bundle bundle) {
        C0646f<?> fVar = this.mHost;
        if (fVar != null) {
            fVar.mo4783q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @ts2 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().mo4569a1(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.m4279T0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
                Log.v("FragmentManager", sb.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().mo4572b1(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && mo4309j().f3665b) {
            if (this.mHost == null) {
                mo4309j().f3665b = false;
            } else if (Looper.myLooper() != this.mHost.mo4780g().getLooper()) {
                this.mHost.mo4780g().postAtFrontOfQueue(new C0579b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append(to1.f35745h);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(pl2.f33727d);
        return sb.toString();
    }

    public void unregisterForContextMenu(@mr2 View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    /* renamed from: z */
    public /* synthetic */ jb0 mo668z() {
        return kk1.m19873a(this);
    }
}
