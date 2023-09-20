package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/f;", "Lcom/onedelhi/secure/a32;", "source", "Landroidx/lifecycle/e$b;", "event", "Lcom/onedelhi/secure/un4;", "g", "", "className", "h", "Lcom/onedelhi/secure/dr3;", "owner", "<init>", "(Lcom/onedelhi/secure/dr3;)V", "a", "b", "savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class Recreator implements C0694f {
    @vr2

    /* renamed from: a */
    public static final C0984a f5316a = new C0984a((wg0) null);
    @vr2

    /* renamed from: b */
    public static final String f5317b = "classes_to_restore";
    @vr2

    /* renamed from: c */
    public static final String f5318c = "androidx.savedstate.Restarter";
    @vr2

    /* renamed from: a */
    public final dr3 f5319a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/savedstate/Recreator$a;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0984a {
        public C0984a() {
        }

        public /* synthetic */ C0984a(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/Recreator$b;", "Lcom/onedelhi/secure/br3$c;", "Landroid/os/Bundle;", "a", "", "className", "Lcom/onedelhi/secure/un4;", "b", "", "Ljava/util/Set;", "classes", "Lcom/onedelhi/secure/br3;", "registry", "<init>", "(Lcom/onedelhi/secure/br3;)V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C0985b implements br3.C1803c {
        @vr2

        /* renamed from: a */
        public final Set<String> f5320a = new LinkedHashSet();

        public C0985b(@vr2 br3 br3) {
            jt1.m53777p(br3, "registry");
            br3.mo13803j(Recreator.f5318c, this);
        }

        @vr2
        /* renamed from: a */
        public Bundle mo879a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f5317b, new ArrayList(this.f5320a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo6655b(@vr2 String str) {
            jt1.m53777p(str, "className");
            this.f5320a.add(str);
        }
    }

    public Recreator(@vr2 dr3 dr3) {
        jt1.m53777p(dr3, "owner");
        this.f5319a = dr3;
    }

    /* renamed from: g */
    public void mo669g(@vr2 a32 a32, @vr2 C0690e.C0692b bVar) {
        jt1.m53777p(a32, "source");
        jt1.m53777p(bVar, "event");
        if (bVar == C0690e.C0692b.ON_CREATE) {
            a32.getLifecycle().mo4960c(this);
            Bundle b = this.f5319a.getSavedStateRegistry().mo13796b(f5318c);
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList(f5317b);
                if (stringArrayList != null) {
                    for (String h : stringArrayList) {
                        mo6654h(h);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    /* renamed from: h */
    public final void mo6654h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(br3.C1801a.class);
            jt1.m53776o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    jt1.m53776o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((br3.C1801a) newInstance).mo4913a(this.f5319a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }
}
