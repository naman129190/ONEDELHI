package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.C2118f6;
import com.onedelhi.secure.C2402i7;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.l */
public abstract class C0657l {

    /* renamed from: h */
    public static final int f3903h = 0;

    /* renamed from: i */
    public static final int f3904i = 1;

    /* renamed from: j */
    public static final int f3905j = 2;

    /* renamed from: k */
    public static final int f3906k = 3;

    /* renamed from: l */
    public static final int f3907l = 4;

    /* renamed from: m */
    public static final int f3908m = 5;

    /* renamed from: n */
    public static final int f3909n = 6;

    /* renamed from: o */
    public static final int f3910o = 7;

    /* renamed from: p */
    public static final int f3911p = 8;

    /* renamed from: q */
    public static final int f3912q = 9;

    /* renamed from: r */
    public static final int f3913r = 10;

    /* renamed from: s */
    public static final int f3914s = 4096;

    /* renamed from: t */
    public static final int f3915t = 8192;

    /* renamed from: u */
    public static final int f3916u = -1;

    /* renamed from: v */
    public static final int f3917v = 0;

    /* renamed from: w */
    public static final int f3918w = 4097;

    /* renamed from: x */
    public static final int f3919x = 8194;

    /* renamed from: y */
    public static final int f3920y = 4099;

    /* renamed from: a */
    public int f3921a;

    /* renamed from: a */
    public final C0645e f3922a;

    /* renamed from: a */
    public CharSequence f3923a;

    /* renamed from: a */
    public final ClassLoader f3924a;
    @ts2

    /* renamed from: a */
    public String f3925a;

    /* renamed from: a */
    public ArrayList<C0658a> f3926a;

    /* renamed from: a */
    public boolean f3927a;

    /* renamed from: b */
    public int f3928b;

    /* renamed from: b */
    public CharSequence f3929b;

    /* renamed from: b */
    public ArrayList<String> f3930b;

    /* renamed from: b */
    public boolean f3931b;

    /* renamed from: c */
    public int f3932c;

    /* renamed from: c */
    public ArrayList<String> f3933c;

    /* renamed from: c */
    public boolean f3934c;

    /* renamed from: d */
    public int f3935d;

    /* renamed from: d */
    public ArrayList<Runnable> f3936d;

    /* renamed from: e */
    public int f3937e;

    /* renamed from: f */
    public int f3938f;

    /* renamed from: g */
    public int f3939g;

    /* renamed from: androidx.fragment.app.l$a */
    public static final class C0658a {

        /* renamed from: a */
        public int f3940a;

        /* renamed from: a */
        public Fragment f3941a;

        /* renamed from: a */
        public C0690e.C0693c f3942a;

        /* renamed from: b */
        public int f3943b;

        /* renamed from: b */
        public C0690e.C0693c f3944b;

        /* renamed from: c */
        public int f3945c;

        /* renamed from: d */
        public int f3946d;

        /* renamed from: e */
        public int f3947e;

        public C0658a() {
        }

        public C0658a(int i, Fragment fragment) {
            this.f3940a = i;
            this.f3941a = fragment;
            C0690e.C0693c cVar = C0690e.C0693c.RESUMED;
            this.f3942a = cVar;
            this.f3944b = cVar;
        }

        public C0658a(int i, @mr2 Fragment fragment, C0690e.C0693c cVar) {
            this.f3940a = i;
            this.f3941a = fragment;
            this.f3942a = fragment.mMaxState;
            this.f3944b = cVar;
        }
    }

    @Deprecated
    public C0657l() {
        this.f3926a = new ArrayList<>();
        this.f3931b = true;
        this.f3934c = false;
        this.f3922a = null;
        this.f3924a = null;
    }

    public C0657l(@mr2 C0645e eVar, @ts2 ClassLoader classLoader) {
        this.f3926a = new ArrayList<>();
        this.f3931b = true;
        this.f3934c = false;
        this.f3922a = eVar;
        this.f3924a = classLoader;
    }

    /* renamed from: A */
    public boolean mo4708A() {
        return this.f3926a.isEmpty();
    }

    @mr2
    /* renamed from: B */
    public C0657l mo4709B(@mr2 Fragment fragment) {
        mo4867m(new C0658a(3, fragment));
        return this;
    }

    @mr2
    /* renamed from: C */
    public C0657l mo4845C(@mo1 int i, @mr2 Fragment fragment) {
        return mo4846D(i, fragment, (String) null);
    }

    @mr2
    /* renamed from: D */
    public C0657l mo4846D(@mo1 int i, @mr2 Fragment fragment, @ts2 String str) {
        if (i != 0) {
            mo4732x(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @mr2
    /* renamed from: E */
    public final C0657l mo4847E(@mo1 int i, @mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle) {
        return mo4848F(i, cls, bundle, (String) null);
    }

    @mr2
    /* renamed from: F */
    public final C0657l mo4848F(@mo1 int i, @mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle, @ts2 String str) {
        return mo4846D(i, mo4871u(cls, bundle), str);
    }

    @mr2
    /* renamed from: G */
    public C0657l mo4849G(@mr2 Runnable runnable) {
        mo4872w();
        if (this.f3936d == null) {
            this.f3936d = new ArrayList<>();
        }
        this.f3936d.add(runnable);
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: H */
    public C0657l mo4850H(boolean z) {
        return mo4857Q(z);
    }

    @mr2
    @Deprecated
    /* renamed from: I */
    public C0657l mo4851I(@e54 int i) {
        this.f3939g = i;
        this.f3929b = null;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: J */
    public C0657l mo4852J(@ts2 CharSequence charSequence) {
        this.f3939g = 0;
        this.f3929b = charSequence;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: K */
    public C0657l mo4853K(@e54 int i) {
        this.f3938f = i;
        this.f3923a = null;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: L */
    public C0657l mo4854L(@ts2 CharSequence charSequence) {
        this.f3938f = 0;
        this.f3923a = charSequence;
        return this;
    }

    @mr2
    /* renamed from: M */
    public C0657l mo4855M(@C2402i7 @C2118f6 int i, @C2402i7 @C2118f6 int i2) {
        return mo4856N(i, i2, 0, 0);
    }

    @mr2
    /* renamed from: N */
    public C0657l mo4856N(@C2402i7 @C2118f6 int i, @C2402i7 @C2118f6 int i2, @C2402i7 @C2118f6 int i3, @C2402i7 @C2118f6 int i4) {
        this.f3921a = i;
        this.f3928b = i2;
        this.f3932c = i3;
        this.f3935d = i4;
        return this;
    }

    @mr2
    /* renamed from: O */
    public C0657l mo4710O(@mr2 Fragment fragment, @mr2 C0690e.C0693c cVar) {
        mo4867m(new C0658a(10, fragment, cVar));
        return this;
    }

    @mr2
    /* renamed from: P */
    public C0657l mo4711P(@ts2 Fragment fragment) {
        mo4867m(new C0658a(8, fragment));
        return this;
    }

    @mr2
    /* renamed from: Q */
    public C0657l mo4857Q(boolean z) {
        this.f3934c = z;
        return this;
    }

    @mr2
    /* renamed from: R */
    public C0657l mo4858R(int i) {
        this.f3937e = i;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: S */
    public C0657l mo4859S(@e64 int i) {
        return this;
    }

    @mr2
    /* renamed from: T */
    public C0657l mo4712T(@mr2 Fragment fragment) {
        mo4867m(new C0658a(5, fragment));
        return this;
    }

    @mr2
    /* renamed from: f */
    public C0657l mo4860f(@mo1 int i, @mr2 Fragment fragment) {
        mo4732x(i, fragment, (String) null, 1);
        return this;
    }

    @mr2
    /* renamed from: g */
    public C0657l mo4861g(@mo1 int i, @mr2 Fragment fragment, @ts2 String str) {
        mo4732x(i, fragment, str, 1);
        return this;
    }

    @mr2
    /* renamed from: h */
    public final C0657l mo4862h(@mo1 int i, @mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle) {
        return mo4860f(i, mo4871u(cls, bundle));
    }

    @mr2
    /* renamed from: i */
    public final C0657l mo4863i(@mo1 int i, @mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle, @ts2 String str) {
        return mo4861g(i, mo4871u(cls, bundle), str);
    }

    /* renamed from: j */
    public C0657l mo4864j(@mr2 ViewGroup viewGroup, @mr2 Fragment fragment, @ts2 String str) {
        fragment.mContainer = viewGroup;
        return mo4861g(viewGroup.getId(), fragment, str);
    }

    @mr2
    /* renamed from: k */
    public C0657l mo4865k(@mr2 Fragment fragment, @ts2 String str) {
        mo4732x(0, fragment, str, 1);
        return this;
    }

    @mr2
    /* renamed from: l */
    public final C0657l mo4866l(@mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle, @ts2 String str) {
        return mo4865k(mo4871u(cls, bundle), str);
    }

    /* renamed from: m */
    public void mo4867m(C0658a aVar) {
        this.f3926a.add(aVar);
        aVar.f3943b = this.f3921a;
        aVar.f3945c = this.f3928b;
        aVar.f3946d = this.f3932c;
        aVar.f3947e = this.f3935d;
    }

    @mr2
    /* renamed from: n */
    public C0657l mo4868n(@mr2 View view, @mr2 String str) {
        if (C0659m.m4655D()) {
            String x0 = jt4.m19024x0(view);
            if (x0 != null) {
                if (this.f3930b == null) {
                    this.f3930b = new ArrayList<>();
                    this.f3933c = new ArrayList<>();
                } else if (this.f3933c.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f3930b.contains(x0)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + x0 + "' has already been added to the transaction.");
                }
                this.f3930b.add(x0);
                this.f3933c.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @mr2
    /* renamed from: o */
    public C0657l mo4869o(@ts2 String str) {
        if (this.f3931b) {
            this.f3927a = true;
            this.f3925a = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @mr2
    /* renamed from: p */
    public C0657l mo4870p(@mr2 Fragment fragment) {
        mo4867m(new C0658a(7, fragment));
        return this;
    }

    /* renamed from: q */
    public abstract int mo4726q();

    /* renamed from: r */
    public abstract int mo4727r();

    /* renamed from: s */
    public abstract void mo4728s();

    /* renamed from: t */
    public abstract void mo4729t();

    @mr2
    /* renamed from: u */
    public final Fragment mo4871u(@mr2 Class<? extends Fragment> cls, @ts2 Bundle bundle) {
        C0645e eVar = this.f3922a;
        if (eVar != null) {
            ClassLoader classLoader = this.f3924a;
            if (classLoader != null) {
                Fragment a = eVar.mo4643a(classLoader, cls.getName());
                if (bundle != null) {
                    a.setArguments(bundle);
                }
                return a;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @mr2
    /* renamed from: v */
    public C0657l mo4731v(@mr2 Fragment fragment) {
        mo4867m(new C0658a(6, fragment));
        return this;
    }

    @mr2
    /* renamed from: w */
    public C0657l mo4872w() {
        if (!this.f3927a) {
            this.f3931b = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: x */
    public void mo4732x(int i, Fragment fragment, @ts2 String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4867m(new C0658a(i2, fragment));
    }

    @mr2
    /* renamed from: y */
    public C0657l mo4733y(@mr2 Fragment fragment) {
        mo4867m(new C0658a(4, fragment));
        return this;
    }

    /* renamed from: z */
    public boolean mo4873z() {
        return this.f3931b;
    }
}
