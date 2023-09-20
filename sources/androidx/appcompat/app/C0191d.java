package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0180a;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.C1862c8;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ms4;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: androidx.appcompat.app.d */
public abstract class C0191d {

    /* renamed from: a */
    public static final C3679ua<WeakReference<C0191d>> f803a = new C3679ua<>();

    /* renamed from: a */
    public static final Object f804a = new Object();

    /* renamed from: b */
    public static final String f805b = "AppCompatDelegate";

    /* renamed from: b */
    public static final boolean f806b = false;

    /* renamed from: n */
    public static final int f807n = -1;
    @Deprecated

    /* renamed from: o */
    public static final int f808o = 0;
    @Deprecated

    /* renamed from: p */
    public static final int f809p = 0;

    /* renamed from: q */
    public static final int f810q = 1;

    /* renamed from: r */
    public static final int f811r = 2;

    /* renamed from: s */
    public static final int f812s = 3;

    /* renamed from: t */
    public static final int f813t = -100;

    /* renamed from: u */
    public static int f814u = -100;

    /* renamed from: v */
    public static final int f815v = 108;

    /* renamed from: w */
    public static final int f816w = 109;

    /* renamed from: x */
    public static final int f817x = 10;

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.d$a */
    public @interface C0192a {
    }

    /* renamed from: G */
    public static void m1366G(@mr2 C0191d dVar) {
        synchronized (f804a) {
            m1367H(dVar);
        }
    }

    /* renamed from: H */
    public static void m1367H(@mr2 C0191d dVar) {
        synchronized (f804a) {
            Iterator<WeakReference<C0191d>> it = f803a.iterator();
            while (it.hasNext()) {
                C0191d dVar2 = (C0191d) it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: J */
    public static void m1368J(boolean z) {
        ms4.m21938c(z);
    }

    /* renamed from: N */
    public static void m1369N(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d(f805b, "setDefaultNightMode() called with an unknown mode");
        } else if (f814u != i) {
            f814u = i;
            m1371f();
        }
    }

    /* renamed from: c */
    public static void m1370c(@mr2 C0191d dVar) {
        synchronized (f804a) {
            m1367H(dVar);
            f803a.add(new WeakReference(dVar));
        }
    }

    /* renamed from: f */
    public static void m1371f() {
        synchronized (f804a) {
            Iterator<WeakReference<C0191d>> it = f803a.iterator();
            while (it.hasNext()) {
                C0191d dVar = (C0191d) it.next().get();
                if (dVar != null) {
                    dVar.mo984e();
                }
            }
        }
    }

    @mr2
    /* renamed from: i */
    public static C0191d m1372i(@mr2 Activity activity, @ts2 C1862c8 c8Var) {
        return new C0193e(activity, c8Var);
    }

    @mr2
    /* renamed from: j */
    public static C0191d m1373j(@mr2 Dialog dialog, @ts2 C1862c8 c8Var) {
        return new C0193e(dialog, c8Var);
    }

    @mr2
    /* renamed from: k */
    public static C0191d m1374k(@mr2 Context context, @mr2 Activity activity, @ts2 C1862c8 c8Var) {
        return new C0193e(context, activity, c8Var);
    }

    @mr2
    /* renamed from: l */
    public static C0191d m1375l(@mr2 Context context, @mr2 Window window, @ts2 C1862c8 c8Var) {
        return new C0193e(context, window, c8Var);
    }

    /* renamed from: o */
    public static int m1376o() {
        return f814u;
    }

    /* renamed from: w */
    public static boolean m1377w() {
        return ms4.m21937b();
    }

    /* renamed from: A */
    public abstract void mo967A();

    /* renamed from: B */
    public abstract void mo968B(Bundle bundle);

    /* renamed from: C */
    public abstract void mo969C();

    /* renamed from: D */
    public abstract void mo970D(Bundle bundle);

    /* renamed from: E */
    public abstract void mo971E();

    /* renamed from: F */
    public abstract void mo972F();

    /* renamed from: I */
    public abstract boolean mo973I(int i);

    /* renamed from: K */
    public abstract void mo974K(@s12 int i);

    /* renamed from: L */
    public abstract void mo975L(View view);

    /* renamed from: M */
    public abstract void mo976M(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: O */
    public abstract void mo977O(boolean z);

    @sj3(17)
    /* renamed from: P */
    public abstract void mo978P(int i);

    /* renamed from: Q */
    public abstract void mo979Q(@ts2 Toolbar toolbar);

    /* renamed from: R */
    public void mo980R(@e64 int i) {
    }

    /* renamed from: S */
    public abstract void mo981S(@ts2 CharSequence charSequence);

    @ts2
    /* renamed from: T */
    public abstract C3563t2 mo982T(@mr2 C3563t2.C3564a aVar);

    /* renamed from: d */
    public abstract void mo983d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public abstract boolean mo984e();

    @Deprecated
    /* renamed from: g */
    public void mo985g(Context context) {
    }

    @mr2
    @C3740us
    /* renamed from: h */
    public Context mo986h(@mr2 Context context) {
        mo985g(context);
        return context;
    }

    /* renamed from: m */
    public abstract View mo987m(@ts2 View view, String str, @mr2 Context context, @mr2 AttributeSet attributeSet);

    @ts2
    /* renamed from: n */
    public abstract <T extends View> T mo988n(@mo1 int i);

    @ts2
    /* renamed from: p */
    public abstract C0180a.C0182b mo989p();

    /* renamed from: q */
    public int mo990q() {
        return -100;
    }

    /* renamed from: r */
    public abstract MenuInflater mo991r();

    @ts2
    /* renamed from: s */
    public abstract ActionBar mo992s();

    /* renamed from: t */
    public abstract boolean mo993t(int i);

    /* renamed from: u */
    public abstract void mo994u();

    /* renamed from: v */
    public abstract void mo995v();

    /* renamed from: x */
    public abstract boolean mo996x();

    /* renamed from: y */
    public abstract void mo997y(Configuration configuration);

    /* renamed from: z */
    public abstract void mo998z(Bundle bundle);
}
