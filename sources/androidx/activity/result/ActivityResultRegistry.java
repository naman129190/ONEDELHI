package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import com.onedelhi.secure.C1936d3;
import com.onedelhi.secure.C2394i3;
import com.onedelhi.secure.C2470j3;
import com.onedelhi.secure.C2691l3;
import com.onedelhi.secure.C2921n3;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public static final int f615a = 65536;

    /* renamed from: a */
    public static final String f616a = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: b */
    public static final String f617b = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: c */
    public static final String f618c = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: d */
    public static final String f619d = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: e */
    public static final String f620e = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: f */
    public static final String f621f = "ActivityResultRegistry";

    /* renamed from: a */
    public final Bundle f622a = new Bundle();

    /* renamed from: a */
    public ArrayList<String> f623a = new ArrayList<>();

    /* renamed from: a */
    public final Map<Integer, String> f624a = new HashMap();

    /* renamed from: a */
    public Random f625a = new Random();

    /* renamed from: b */
    public final Map<String, Integer> f626b = new HashMap();

    /* renamed from: c */
    public final Map<String, C0158d> f627c = new HashMap();

    /* renamed from: d */
    public final transient Map<String, C0157c<?>> f628d = new HashMap();

    /* renamed from: e */
    public final Map<String, Object> f629e = new HashMap();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0155a extends C2921n3<I> {

        /* renamed from: a */
        public final /* synthetic */ C2691l3 f635a;

        /* renamed from: a */
        public final /* synthetic */ String f636a;

        public C0155a(String str, C2691l3 l3Var) {
            this.f636a = str;
            this.f635a = l3Var;
        }

        @mr2
        /* renamed from: a */
        public C2691l3<I, ?> mo691a() {
            return this.f635a;
        }

        /* renamed from: c */
        public void mo692c(I i, @ts2 C1936d3 d3Var) {
            Integer num = ActivityResultRegistry.this.f626b.get(this.f636a);
            if (num != null) {
                ActivityResultRegistry.this.f623a.add(this.f636a);
                try {
                    ActivityResultRegistry.this.mo671f(num.intValue(), this.f635a, i, d3Var);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f623a.remove(this.f636a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f635a + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: d */
        public void mo693d() {
            ActivityResultRegistry.this.mo690l(this.f636a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0156b extends C2921n3<I> {

        /* renamed from: a */
        public final /* synthetic */ C2691l3 f638a;

        /* renamed from: a */
        public final /* synthetic */ String f639a;

        public C0156b(String str, C2691l3 l3Var) {
            this.f639a = str;
            this.f638a = l3Var;
        }

        @mr2
        /* renamed from: a */
        public C2691l3<I, ?> mo691a() {
            return this.f638a;
        }

        /* renamed from: c */
        public void mo692c(I i, @ts2 C1936d3 d3Var) {
            Integer num = ActivityResultRegistry.this.f626b.get(this.f639a);
            if (num != null) {
                ActivityResultRegistry.this.f623a.add(this.f639a);
                try {
                    ActivityResultRegistry.this.mo671f(num.intValue(), this.f638a, i, d3Var);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f623a.remove(this.f639a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f638a + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: d */
        public void mo693d() {
            ActivityResultRegistry.this.mo690l(this.f639a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0157c<O> {

        /* renamed from: a */
        public final C2470j3<O> f640a;

        /* renamed from: a */
        public final C2691l3<?, O> f641a;

        public C0157c(C2470j3<O> j3Var, C2691l3<?, O> l3Var) {
            this.f640a = j3Var;
            this.f641a = l3Var;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0158d {

        /* renamed from: a */
        public final C0690e f642a;

        /* renamed from: a */
        public final ArrayList<C0694f> f643a = new ArrayList<>();

        public C0158d(@mr2 C0690e eVar) {
            this.f642a = eVar;
        }

        /* renamed from: a */
        public void mo694a(@mr2 C0694f fVar) {
            this.f642a.mo4958a(fVar);
            this.f643a.add(fVar);
        }

        /* renamed from: b */
        public void mo695b() {
            Iterator<C0694f> it = this.f643a.iterator();
            while (it.hasNext()) {
                this.f642a.mo4960c(it.next());
            }
            this.f643a.clear();
        }
    }

    /* renamed from: a */
    public final void mo680a(int i, String str) {
        this.f624a.put(Integer.valueOf(i), str);
        this.f626b.put(str, Integer.valueOf(i));
    }

    @bc2
    /* renamed from: b */
    public final boolean mo681b(int i, int i2, @ts2 Intent intent) {
        String str = this.f624a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        mo683d(str, i2, intent, this.f628d.get(str));
        return true;
    }

    @bc2
    /* renamed from: c */
    public final <O> boolean mo682c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        C2470j3<O> j3Var;
        String str = this.f624a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0157c cVar = this.f628d.get(str);
        if (cVar == null || (j3Var = cVar.f640a) == null) {
            this.f622a.remove(str);
            this.f629e.put(str, o);
            return true;
        } else if (!this.f623a.remove(str)) {
            return true;
        } else {
            j3Var.mo4637a(o);
            return true;
        }
    }

    /* renamed from: d */
    public final <O> void mo683d(String str, int i, @ts2 Intent intent, @ts2 C0157c<O> cVar) {
        if (cVar == null || cVar.f640a == null || !this.f623a.contains(str)) {
            this.f629e.remove(str);
            this.f622a.putParcelable(str, new C2394i3(i, intent));
            return;
        }
        cVar.f640a.mo4637a(cVar.f641a.mo4655c(i, intent));
        this.f623a.remove(str);
    }

    /* renamed from: e */
    public final int mo684e() {
        int nextInt = this.f625a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f624a.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f625a.nextInt(2147418112);
        }
    }

    @bc2
    /* renamed from: f */
    public abstract <I, O> void mo671f(int i, @mr2 C2691l3<I, O> l3Var, @SuppressLint({"UnknownNullness"}) I i2, @ts2 C1936d3 d3Var);

    /* renamed from: g */
    public final void mo685g(@ts2 Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f616a);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f617b);
            if (stringArrayList != null && integerArrayList != null) {
                this.f623a = bundle.getStringArrayList(f618c);
                this.f625a = (Random) bundle.getSerializable(f620e);
                this.f622a.putAll(bundle.getBundle(f619d));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f626b.containsKey(str)) {
                        Integer remove = this.f626b.remove(str);
                        if (!this.f622a.containsKey(str)) {
                            this.f624a.remove(remove);
                        }
                    }
                    mo680a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo686h(@mr2 Bundle bundle) {
        bundle.putIntegerArrayList(f616a, new ArrayList(this.f626b.values()));
        bundle.putStringArrayList(f617b, new ArrayList(this.f626b.keySet()));
        bundle.putStringArrayList(f618c, new ArrayList(this.f623a));
        bundle.putBundle(f619d, (Bundle) this.f622a.clone());
        bundle.putSerializable(f620e, this.f625a);
    }

    @mr2
    /* renamed from: i */
    public final <I, O> C2921n3<I> mo687i(@mr2 String str, @mr2 C2691l3<I, O> l3Var, @mr2 C2470j3<O> j3Var) {
        mo689k(str);
        this.f628d.put(str, new C0157c(j3Var, l3Var));
        if (this.f629e.containsKey(str)) {
            Object obj = this.f629e.get(str);
            this.f629e.remove(str);
            j3Var.mo4637a(obj);
        }
        C2394i3 i3Var = (C2394i3) this.f622a.getParcelable(str);
        if (i3Var != null) {
            this.f622a.remove(str);
            j3Var.mo4637a(l3Var.mo4655c(i3Var.mo17515b(), i3Var.mo17514a()));
        }
        return new C0156b(str, l3Var);
    }

    @mr2
    /* renamed from: j */
    public final <I, O> C2921n3<I> mo688j(@mr2 final String str, @mr2 a32 a32, @mr2 final C2691l3<I, O> l3Var, @mr2 final C2470j3<O> j3Var) {
        C0690e lifecycle = a32.getLifecycle();
        if (!lifecycle.mo4959b().mo4962a(C0690e.C0693c.STARTED)) {
            mo689k(str);
            C0158d dVar = this.f627c.get(str);
            if (dVar == null) {
                dVar = new C0158d(lifecycle);
            }
            dVar.mo694a(new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    if (C0690e.C0692b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f628d.put(str, new C0157c(j3Var, l3Var));
                        if (ActivityResultRegistry.this.f629e.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f629e.get(str);
                            ActivityResultRegistry.this.f629e.remove(str);
                            j3Var.mo4637a(obj);
                        }
                        C2394i3 i3Var = (C2394i3) ActivityResultRegistry.this.f622a.getParcelable(str);
                        if (i3Var != null) {
                            ActivityResultRegistry.this.f622a.remove(str);
                            j3Var.mo4637a(l3Var.mo4655c(i3Var.mo17515b(), i3Var.mo17514a()));
                        }
                    } else if (C0690e.C0692b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f628d.remove(str);
                    } else if (C0690e.C0692b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.mo690l(str);
                    }
                }
            });
            this.f627c.put(str, dVar);
            return new C0155a(str, l3Var);
        }
        throw new IllegalStateException("LifecycleOwner " + a32 + " is attempting to register while current state is " + lifecycle.mo4959b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: k */
    public final void mo689k(String str) {
        if (this.f626b.get(str) == null) {
            mo680a(mo684e(), str);
        }
    }

    @bc2
    /* renamed from: l */
    public final void mo690l(@mr2 String str) {
        Integer remove;
        if (!this.f623a.contains(str) && (remove = this.f626b.remove(str)) != null) {
            this.f624a.remove(remove);
        }
        this.f628d.remove(str);
        if (this.f629e.containsKey(str)) {
            Log.w(f621f, "Dropping pending result for request " + str + ": " + this.f629e.get(str));
            this.f629e.remove(str);
        }
        if (this.f622a.containsKey(str)) {
            Log.w(f621f, "Dropping pending result for request " + str + ": " + this.f622a.getParcelable(str));
            this.f622a.remove(str);
        }
        C0158d dVar = this.f627c.get(str);
        if (dVar != null) {
            dVar.mo695b();
            this.f627c.remove(str);
        }
    }
}
