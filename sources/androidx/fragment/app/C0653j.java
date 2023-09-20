package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C0668n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.ab3;
import com.onedelhi.secure.cb1;
import com.onedelhi.secure.dv0;
import com.onedelhi.secure.fb1;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.fragment.app.j */
public class C0653j {

    /* renamed from: a */
    public static final String f3878a = "FragmentManager";

    /* renamed from: b */
    public static final String f3879b = "android:target_req_state";

    /* renamed from: c */
    public static final String f3880c = "android:target_state";

    /* renamed from: d */
    public static final String f3881d = "android:view_state";

    /* renamed from: e */
    public static final String f3882e = "android:view_registry_state";

    /* renamed from: f */
    public static final String f3883f = "android:user_visible_hint";

    /* renamed from: a */
    public int f3884a = -1;
    @mr2

    /* renamed from: a */
    public final Fragment f3885a;

    /* renamed from: a */
    public final C0649h f3886a;

    /* renamed from: a */
    public final fb1 f3887a;

    /* renamed from: a */
    public boolean f3888a = false;

    /* renamed from: androidx.fragment.app.j$a */
    public class C0654a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f3889a;

        public C0654a(View view) {
            this.f3889a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3889a.removeOnAttachStateChangeListener(this);
            jt4.m19017v1(this.f3889a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    public static /* synthetic */ class C0655b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.e$c[] r0 = androidx.lifecycle.C0690e.C0693c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3891a = r0
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3891a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3891a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3891a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0653j.C0655b.<clinit>():void");
        }
    }

    public C0653j(@mr2 C0649h hVar, @mr2 fb1 fb1, @mr2 Fragment fragment) {
        this.f3886a = hVar;
        this.f3887a = fb1;
        this.f3885a = fragment;
    }

    public C0653j(@mr2 C0649h hVar, @mr2 fb1 fb1, @mr2 Fragment fragment, @mr2 cb1 cb1) {
        this.f3886a = hVar;
        this.f3887a = fb1;
        this.f3885a = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = cb1.f10205b;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public C0653j(@mr2 C0649h hVar, @mr2 fb1 fb1, @mr2 ClassLoader classLoader, @mr2 C0645e eVar, @mr2 cb1 cb1) {
        this.f3886a = hVar;
        this.f3887a = fb1;
        Fragment a = eVar.mo4643a(classLoader, cb1.f10206b);
        this.f3885a = a;
        Bundle bundle = cb1.f10204a;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(cb1.f10204a);
        a.mWho = cb1.f10208c;
        a.mFromLayout = cb1.f10207b;
        a.mRestored = true;
        a.mFragmentId = cb1.f10214n;
        a.mContainerId = cb1.f10215o;
        a.mTag = cb1.f10210d;
        a.mRetainInstance = cb1.f10209c;
        a.mRemoving = cb1.f10211d;
        a.mDetached = cb1.f10212e;
        a.mHidden = cb1.f10213f;
        a.mMaxState = C0690e.C0693c.values()[cb1.f10216p];
        Bundle bundle2 = cb1.f10205b;
        a.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* renamed from: a */
    public void mo4811a() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3885a);
        }
        Fragment fragment = this.f3885a;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0649h hVar = this.f3886a;
        Fragment fragment2 = this.f3885a;
        hVar.mo4789a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void mo4812b() {
        int j = this.f3887a.mo15919j(this.f3885a);
        Fragment fragment = this.f3885a;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* renamed from: c */
    public void mo4813c() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3885a);
        }
        Fragment fragment = this.f3885a;
        Fragment fragment2 = fragment.mTarget;
        C0653j jVar = null;
        if (fragment2 != null) {
            C0653j n = this.f3887a.mo15923n(fragment2.mWho);
            if (n != null) {
                Fragment fragment3 = this.f3885a;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                jVar = n;
            } else {
                throw new IllegalStateException("Fragment " + this.f3885a + " declared target fragment " + this.f3885a.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (jVar = this.f3887a.mo15923n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3885a + " declared target fragment " + this.f3885a.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (jVar != null && (FragmentManager.f3692h || jVar.mo4821k().mState < 1)) {
            jVar.mo4823m();
        }
        Fragment fragment4 = this.f3885a;
        fragment4.mHost = fragment4.mFragmentManager.mo4518H0();
        Fragment fragment5 = this.f3885a;
        fragment5.mParentFragment = fragment5.mFragmentManager.mo4527K0();
        this.f3886a.mo4795g(this.f3885a, false);
        this.f3885a.performAttach();
        this.f3886a.mo4790b(this.f3885a, false);
    }

    /* renamed from: d */
    public int mo4814d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3885a;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.f3884a;
        int i2 = C0655b.f3891a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment3 = this.f3885a;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.f3884a, 2);
                View view = this.f3885a.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3884a < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.f3885a.mAdded) {
            i = Math.min(i, 1);
        }
        C0668n.C0673e.C0675b bVar = null;
        if (FragmentManager.f3692h && (viewGroup = fragment.mContainer) != null) {
            bVar = C0668n.m4684n(viewGroup, (fragment = this.f3885a).getParentFragmentManager()).mo4890l(this);
        }
        if (bVar == C0668n.C0673e.C0675b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C0668n.C0673e.C0675b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3885a;
            if (fragment4.mRemoving) {
                i = fragment4.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f3885a;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f3885a);
        }
        return i;
    }

    /* renamed from: e */
    public void mo4815e() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3885a);
        }
        Fragment fragment = this.f3885a;
        if (!fragment.mIsCreated) {
            this.f3886a.mo4796h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3885a;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C0649h hVar = this.f3886a;
            Fragment fragment3 = this.f3885a;
            hVar.mo4791c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3885a.mState = 1;
    }

    /* renamed from: f */
    public void mo4816f() {
        String str;
        if (!this.f3885a.mFromLayout) {
            if (FragmentManager.m4279T0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3885a);
            }
            Fragment fragment = this.f3885a;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3885a;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.mo4501B0().mo4428c(this.f3885a.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3885a;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f3885a.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = dv0.f10947b;
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3885a.mContainerId) + " (" + str + ") for fragment " + this.f3885a);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3885a + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3885a;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f3885a.mView;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3885a;
                fragment5.mView.setTag(ab3.C1684g.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    mo4812b();
                }
                Fragment fragment6 = this.f3885a;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (jt4.m18896O0(this.f3885a.mView)) {
                    jt4.m19017v1(this.f3885a.mView);
                } else {
                    View view2 = this.f3885a.mView;
                    view2.addOnAttachStateChangeListener(new C0654a(view2));
                }
                this.f3885a.performViewCreated();
                C0649h hVar = this.f3886a;
                Fragment fragment7 = this.f3885a;
                hVar.mo4801m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f3885a.mView.getVisibility();
                float alpha = this.f3885a.mView.getAlpha();
                if (FragmentManager.f3692h) {
                    this.f3885a.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.f3885a;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.f3885a.setFocusedView(findFocus);
                            if (FragmentManager.m4279T0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3885a);
                            }
                        }
                        this.f3885a.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f3885a;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z = true;
                    }
                    fragment9.mIsNewlyAdded = z;
                }
            }
            this.f3885a.mState = 2;
        }
    }

    /* renamed from: g */
    public void mo4817g() {
        Fragment f;
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3885a);
        }
        Fragment fragment = this.f3885a;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.f3887a.mo15925p().mo26858p(this.f3885a)) {
            C0646f<?> fVar = this.f3885a.mHost;
            if (fVar instanceof hu4) {
                z = this.f3887a.mo15925p().mo26854l();
            } else if (fVar.mo4779f() instanceof Activity) {
                z = true ^ ((Activity) fVar.mo4779f()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f3887a.mo15925p().mo26846d(this.f3885a);
            }
            this.f3885a.performDestroy();
            this.f3886a.mo4792d(this.f3885a, false);
            for (C0653j next : this.f3887a.mo15921l()) {
                if (next != null) {
                    Fragment k = next.mo4821k();
                    if (this.f3885a.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f3885a;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f3885a;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f3887a.mo15915f(str);
            }
            this.f3887a.mo15927r(this);
            return;
        }
        String str2 = this.f3885a.mTargetWho;
        if (!(str2 == null || (f = this.f3887a.mo15915f(str2)) == null || !f.mRetainInstance)) {
            this.f3885a.mTarget = f;
        }
        this.f3885a.mState = 0;
    }

    /* renamed from: h */
    public void mo4818h() {
        View view;
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3885a);
        }
        Fragment fragment = this.f3885a;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f3885a.performDestroyView();
        this.f3886a.mo4802n(this.f3885a, false);
        Fragment fragment2 = this.f3885a;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo4933q(null);
        this.f3885a.mInLayout = false;
    }

    /* renamed from: i */
    public void mo4819i() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3885a);
        }
        this.f3885a.performDetach();
        boolean z = false;
        this.f3886a.mo4793e(this.f3885a, false);
        Fragment fragment = this.f3885a;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f3887a.mo15925p().mo26858p(this.f3885a)) {
            if (FragmentManager.m4279T0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3885a);
            }
            this.f3885a.initState();
        }
    }

    /* renamed from: j */
    public void mo4820j() {
        Fragment fragment = this.f3885a;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m4279T0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3885a);
            }
            Fragment fragment2 = this.f3885a;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f3885a.mSavedFragmentState);
            View view = this.f3885a.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3885a;
                fragment3.mView.setTag(ab3.C1684g.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3885a;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3885a.performViewCreated();
                C0649h hVar = this.f3886a;
                Fragment fragment5 = this.f3885a;
                hVar.mo4801m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3885a.mState = 2;
            }
        }
    }

    @mr2
    /* renamed from: k */
    public Fragment mo4821k() {
        return this.f3885a;
    }

    /* renamed from: l */
    public final boolean mo4822l(@mr2 View view) {
        if (view == this.f3885a.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3885a.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo4823m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3888a) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d = mo4814d();
                    Fragment fragment = this.f3885a;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo4819i();
                                    break;
                                case 0:
                                    mo4817g();
                                    break;
                                case 1:
                                    mo4818h();
                                    this.f3885a.mState = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m4279T0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3885a);
                                    }
                                    Fragment fragment2 = this.f3885a;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo4830t();
                                    }
                                    Fragment fragment3 = this.f3885a;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        C0668n.m4684n(viewGroup2, fragment3.getParentFragmentManager()).mo4883d(this);
                                    }
                                    this.f3885a.mState = 3;
                                    break;
                                case 4:
                                    mo4833w();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    mo4824n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo4813c();
                                    break;
                                case 1:
                                    mo4815e();
                                    break;
                                case 2:
                                    mo4820j();
                                    mo4816f();
                                    break;
                                case 3:
                                    mo4811a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        C0668n.m4684n(viewGroup3, fragment.getParentFragmentManager()).mo4881b(C0668n.C0673e.C0676c.m4716b(this.f3885a.mView.getVisibility()), this);
                                    }
                                    this.f3885a.mState = 4;
                                    break;
                                case 5:
                                    mo4832v();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo4826p();
                                    break;
                            }
                        }
                    } else {
                        if (FragmentManager.f3692h && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                C0668n n = C0668n.m4684n(viewGroup, fragment.getParentFragmentManager());
                                if (this.f3885a.mHidden) {
                                    n.mo4882c(this);
                                } else {
                                    n.mo4884e(this);
                                }
                            }
                            Fragment fragment4 = this.f3885a;
                            FragmentManager fragmentManager = fragment4.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.mo4547R0(fragment4);
                            }
                            Fragment fragment5 = this.f3885a;
                            fragment5.mHiddenChanged = z;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f3888a = z;
                        return;
                    }
                }
            } finally {
                this.f3888a = z;
            }
        } else if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo4821k());
        }
    }

    /* renamed from: n */
    public void mo4824n() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3885a);
        }
        this.f3885a.performPause();
        this.f3886a.mo4794f(this.f3885a, false);
    }

    /* renamed from: o */
    public void mo4825o(@mr2 ClassLoader classLoader) {
        Bundle bundle = this.f3885a.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3885a;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f3881d);
            Fragment fragment2 = this.f3885a;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f3882e);
            Fragment fragment3 = this.f3885a;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(f3880c);
            Fragment fragment4 = this.f3885a;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(f3879b, 0);
            }
            Fragment fragment5 = this.f3885a;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f3885a.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(f3883f, true);
            }
            Fragment fragment6 = this.f3885a;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: p */
    public void mo4826p() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3885a);
        }
        View focusedView = this.f3885a.getFocusedView();
        if (focusedView != null && mo4822l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m4279T0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3885a);
                sb.append(" resulting in focused view ");
                sb.append(this.f3885a.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3885a.setFocusedView((View) null);
        this.f3885a.performResume();
        this.f3886a.mo4797i(this.f3885a, false);
        Fragment fragment = this.f3885a;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle mo4827q() {
        Bundle bundle = new Bundle();
        this.f3885a.performSaveInstanceState(bundle);
        this.f3886a.mo4798j(this.f3885a, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3885a.mView != null) {
            mo4830t();
        }
        if (this.f3885a.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f3881d, this.f3885a.mSavedViewState);
        }
        if (this.f3885a.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f3882e, this.f3885a.mSavedViewRegistryState);
        }
        if (!this.f3885a.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f3883f, this.f3885a.mUserVisibleHint);
        }
        return bundle;
    }

    @ts2
    /* renamed from: r */
    public Fragment.C0590m mo4828r() {
        Bundle q;
        if (this.f3885a.mState <= -1 || (q = mo4827q()) == null) {
            return null;
        }
        return new Fragment.C0590m(q);
    }

    @mr2
    /* renamed from: s */
    public cb1 mo4829s() {
        cb1 cb1 = new cb1(this.f3885a);
        Fragment fragment = this.f3885a;
        if (fragment.mState <= -1 || cb1.f10205b != null) {
            cb1.f10205b = fragment.mSavedFragmentState;
        } else {
            Bundle q = mo4827q();
            cb1.f10205b = q;
            if (this.f3885a.mTargetWho != null) {
                if (q == null) {
                    cb1.f10205b = new Bundle();
                }
                cb1.f10205b.putString(f3880c, this.f3885a.mTargetWho);
                int i = this.f3885a.mTargetRequestCode;
                if (i != 0) {
                    cb1.f10205b.putInt(f3879b, i);
                }
            }
        }
        return cb1;
    }

    /* renamed from: t */
    public void mo4830t() {
        if (this.f3885a.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3885a.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3885a.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3885a.mViewLifecycleOwner.mo18211e(bundle);
            if (!bundle.isEmpty()) {
                this.f3885a.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* renamed from: u */
    public void mo4831u(int i) {
        this.f3884a = i;
    }

    /* renamed from: v */
    public void mo4832v() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3885a);
        }
        this.f3885a.performStart();
        this.f3886a.mo4799k(this.f3885a, false);
    }

    /* renamed from: w */
    public void mo4833w() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3885a);
        }
        this.f3885a.performStop();
        this.f3886a.mo4800l(this.f3885a, false);
    }
}
