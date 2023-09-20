package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.l92;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yg1;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
public final class C0620a extends C0657l implements FragmentManager.C0606k, FragmentManager.C0613q {

    /* renamed from: b */
    public static final String f3777b = "FragmentManager";

    /* renamed from: a */
    public final FragmentManager f3778a;

    /* renamed from: d */
    public boolean f3779d;

    /* renamed from: z */
    public int f3780z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0620a(@mr2 FragmentManager fragmentManager) {
        super(fragmentManager.mo4510E0(), fragmentManager.mo4518H0() != null ? fragmentManager.mo4518H0().mo4779f().getClassLoader() : null);
        this.f3780z = -1;
        this.f3778a = fragmentManager;
    }

    /* renamed from: d0 */
    public static boolean m4484d0(C0657l.C0658a aVar) {
        Fragment fragment = aVar.f3941a;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* renamed from: A */
    public boolean mo4708A() {
        return this.f3926a.isEmpty();
    }

    @mr2
    /* renamed from: B */
    public C0657l mo4709B(@mr2 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3778a) {
            return super.mo4709B(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @mr2
    /* renamed from: O */
    public C0657l mo4710O(@mr2 Fragment fragment, @mr2 C0690e.C0693c cVar) {
        if (fragment.mFragmentManager != this.f3778a) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3778a);
        } else if (cVar == C0690e.C0693c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != C0690e.C0693c.DESTROYED) {
            return super.mo4710O(fragment, cVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @mr2
    /* renamed from: P */
    public C0657l mo4711P(@ts2 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f3778a) {
            return super.mo4711P(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @mr2
    /* renamed from: T */
    public C0657l mo4712T(@mr2 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3778a) {
            return super.mo4712T(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: U */
    public void mo4713U(int i) {
        if (this.f3927a) {
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3926a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0657l.C0658a aVar = this.f3926a.get(i2);
                Fragment fragment = aVar.f3941a;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3941a + " to " + aVar.f3941a.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public int mo4714V(boolean z) {
        if (!this.f3779d) {
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new l92("FragmentManager"));
                mo4715W(yg1.C3999a.f23084c, printWriter);
                printWriter.close();
            }
            this.f3779d = true;
            this.f3780z = this.f3927a ? this.f3778a.mo4603o() : -1;
            this.f3778a.mo4579f0(this, z);
            return this.f3780z;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: W */
    public void mo4715W(String str, PrintWriter printWriter) {
        mo4716X(str, printWriter, true);
    }

    /* renamed from: X */
    public void mo4716X(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3925a);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3780z);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3779d);
            if (this.f3937e != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3937e));
            }
            if (!(this.f3921a == 0 && this.f3928b == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3921a));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3928b));
            }
            if (!(this.f3932c == 0 && this.f3935d == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3932c));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3935d));
            }
            if (!(this.f3938f == 0 && this.f3923a == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3938f));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3923a);
            }
            if (!(this.f3939g == 0 && this.f3929b == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3939g));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3929b);
            }
        }
        if (!this.f3926a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3926a.size();
            for (int i = 0; i < size; i++) {
                C0657l.C0658a aVar = this.f3926a.get(i);
                switch (aVar.f3940a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = mm0.f16222i;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3940a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3941a);
                if (z) {
                    if (!(aVar.f3943b == 0 && aVar.f3945c == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3943b));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3945c));
                    }
                    if (aVar.f3946d != 0 || aVar.f3947e != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3946d));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3947e));
                    }
                }
            }
        }
    }

    /* renamed from: Y */
    public void mo4717Y() {
        int size = this.f3926a.size();
        for (int i = 0; i < size; i++) {
            C0657l.C0658a aVar = this.f3926a.get(i);
            Fragment fragment = aVar.f3941a;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3937e);
                fragment.setSharedElementNames(this.f3930b, this.f3933c);
            }
            switch (aVar.f3940a) {
                case 1:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, false);
                    this.f3778a.mo4591k(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4630x1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4544Q0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, false);
                    this.f3778a.mo4545Q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4503C(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, false);
                    this.f3778a.mo4608q(fragment);
                    break;
                case 8:
                    this.f3778a.mo4536N1(fragment);
                    break;
                case 9:
                    this.f3778a.mo4536N1((Fragment) null);
                    break;
                case 10:
                    this.f3778a.mo4534M1(fragment, aVar.f3944b);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3940a);
            }
            if (!this.f3934c && aVar.f3940a != 1 && fragment != null && !FragmentManager.f3692h) {
                this.f3778a.mo4576d1(fragment);
            }
        }
        if (!this.f3934c && !FragmentManager.f3692h) {
            FragmentManager fragmentManager = this.f3778a;
            fragmentManager.mo4578e1(fragmentManager.f3693a, true);
        }
    }

    /* renamed from: Z */
    public void mo4718Z(boolean z) {
        for (int size = this.f3926a.size() - 1; size >= 0; size--) {
            C0657l.C0658a aVar = this.f3926a.get(size);
            Fragment fragment = aVar.f3941a;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m4277G1(this.f3937e));
                fragment.setSharedElementNames(this.f3933c, this.f3930b);
            }
            switch (aVar.f3940a) {
                case 1:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, true);
                    this.f3778a.mo4630x1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4591k(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4545Q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, true);
                    this.f3778a.mo4544Q0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4608q(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3943b, aVar.f3945c, aVar.f3946d, aVar.f3947e);
                    this.f3778a.mo4528K1(fragment, true);
                    this.f3778a.mo4503C(fragment);
                    break;
                case 8:
                    this.f3778a.mo4536N1((Fragment) null);
                    break;
                case 9:
                    this.f3778a.mo4536N1(fragment);
                    break;
                case 10:
                    this.f3778a.mo4534M1(fragment, aVar.f3942a);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3940a);
            }
            if (!this.f3934c && aVar.f3940a != 3 && fragment != null && !FragmentManager.f3692h) {
                this.f3778a.mo4576d1(fragment);
            }
        }
        if (!this.f3934c && z && !FragmentManager.f3692h) {
            FragmentManager fragmentManager = this.f3778a;
            fragmentManager.mo4578e1(fragmentManager.f3693a, true);
        }
    }

    /* renamed from: a */
    public int mo4648a() {
        return this.f3939g;
    }

    /* renamed from: a0 */
    public Fragment mo4719a0(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3926a.size()) {
            C0657l.C0658a aVar = this.f3926a.get(i);
            int i2 = aVar.f3940a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3941a;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3926a.add(i, new C0657l.C0658a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0657l.C0658a aVar2 = new C0657l.C0658a(3, fragment4);
                                aVar2.f3943b = aVar.f3943b;
                                aVar2.f3946d = aVar.f3946d;
                                aVar2.f3945c = aVar.f3945c;
                                aVar2.f3947e = aVar.f3947e;
                                this.f3926a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3926a.remove(i);
                        i--;
                    } else {
                        aVar.f3940a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3941a);
                    Fragment fragment5 = aVar.f3941a;
                    if (fragment5 == fragment2) {
                        this.f3926a.add(i, new C0657l.C0658a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3926a.add(i, new C0657l.C0658a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3941a;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3941a);
            i++;
        }
        return fragment2;
    }

    /* renamed from: b */
    public boolean mo4682b(@mr2 ArrayList<C0620a> arrayList, @mr2 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3927a) {
            return true;
        }
        this.f3778a.mo4586i(this);
        return true;
    }

    /* renamed from: b0 */
    public boolean mo4720b0(int i) {
        int size = this.f3926a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3926a.get(i2).f3941a;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    @ts2
    /* renamed from: c */
    public CharSequence mo4649c() {
        return this.f3938f != 0 ? this.f3778a.mo4518H0().mo4779f().getText(this.f3938f) : this.f3923a;
    }

    /* renamed from: c0 */
    public boolean mo4721c0(ArrayList<C0620a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3926a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3926a.get(i4).f3941a;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0620a aVar = arrayList.get(i6);
                    int size2 = aVar.f3926a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3926a.get(i7).f3941a;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @ts2
    /* renamed from: d */
    public CharSequence mo4650d() {
        return this.f3939g != 0 ? this.f3778a.mo4518H0().mo4779f().getText(this.f3939g) : this.f3929b;
    }

    /* renamed from: e */
    public int mo4651e() {
        return this.f3938f;
    }

    /* renamed from: e0 */
    public boolean mo4722e0() {
        for (int i = 0; i < this.f3926a.size(); i++) {
            if (m4484d0(this.f3926a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public void mo4723f0() {
        if (this.f3936d != null) {
            for (int i = 0; i < this.f3936d.size(); i++) {
                this.f3936d.get(i).run();
            }
            this.f3936d = null;
        }
    }

    /* renamed from: g0 */
    public void mo4724g0(Fragment.C0589l lVar) {
        for (int i = 0; i < this.f3926a.size(); i++) {
            C0657l.C0658a aVar = this.f3926a.get(i);
            if (m4484d0(aVar)) {
                aVar.f3941a.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    public int getId() {
        return this.f3780z;
    }

    @ts2
    public String getName() {
        return this.f3925a;
    }

    /* renamed from: h0 */
    public Fragment mo4725h0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3926a.size() - 1; size >= 0; size--) {
            C0657l.C0658a aVar = this.f3926a.get(size);
            int i = aVar.f3940a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3941a;
                            break;
                        case 10:
                            aVar.f3944b = aVar.f3942a;
                            break;
                    }
                }
                arrayList.add(aVar.f3941a);
            }
            arrayList.remove(aVar.f3941a);
        }
        return fragment;
    }

    /* renamed from: q */
    public int mo4726q() {
        return mo4714V(false);
    }

    /* renamed from: r */
    public int mo4727r() {
        return mo4714V(true);
    }

    /* renamed from: s */
    public void mo4728s() {
        mo4872w();
        this.f3778a.mo4587i0(this, false);
    }

    /* renamed from: t */
    public void mo4729t() {
        mo4872w();
        this.f3778a.mo4587i0(this, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3780z >= 0) {
            sb.append(" #");
            sb.append(this.f3780z);
        }
        if (this.f3925a != null) {
            sb.append(" ");
            sb.append(this.f3925a);
        }
        sb.append("}");
        return sb.toString();
    }

    @mr2
    /* renamed from: v */
    public C0657l mo4731v(@mr2 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3778a) {
            return super.mo4731v(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: x */
    public void mo4732x(int i, Fragment fragment, @ts2 String str, int i2) {
        super.mo4732x(i, fragment, str, i2);
        fragment.mFragmentManager = this.f3778a;
    }

    @mr2
    /* renamed from: y */
    public C0657l mo4733y(@mr2 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3778a) {
            return super.mo4733y(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
