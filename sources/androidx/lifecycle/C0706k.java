package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0709m;
import com.onedelhi.secure.C1852c6;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.er3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb0;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wq3;
import com.onedelhi.secure.xq3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010$J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006%"}, d2 = {"Landroidx/lifecycle/k;", "Landroidx/lifecycle/m$d;", "Landroidx/lifecycle/m$b;", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "Lcom/onedelhi/secure/jb0;", "extras", "a", "(Ljava/lang/Class;Lcom/onedelhi/secure/jb0;)Lcom/onedelhi/secure/au4;", "", "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "b", "(Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "viewModel", "Lcom/onedelhi/secure/un4;", "c", "Landroid/app/Application;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/m$b;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/e;", "Landroidx/lifecycle/e;", "lifecycle", "<init>", "()V", "Lcom/onedelhi/secure/dr3;", "owner", "(Landroid/app/Application;Lcom/onedelhi/secure/dr3;)V", "(Landroid/app/Application;Lcom/onedelhi/secure/dr3;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.k */
public final class C0706k extends C0709m.C0718d implements C0709m.C0713b {
    @ss2

    /* renamed from: a */
    public Application f4110a;
    @ss2

    /* renamed from: a */
    public Bundle f4111a;
    @ss2

    /* renamed from: a */
    public C0690e f4112a;
    @vr2

    /* renamed from: a */
    public final C0709m.C0713b f4113a;
    @ss2

    /* renamed from: a */
    public br3 f4114a;

    public C0706k() {
        this.f4113a = new C0709m.C0710a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0706k(@ss2 Application application, @vr2 dr3 dr3) {
        this(application, dr3, (Bundle) null);
        jt1.m53777p(dr3, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public C0706k(@ss2 Application application, @vr2 dr3 dr3, @ss2 Bundle bundle) {
        jt1.m53777p(dr3, "owner");
        this.f4114a = dr3.getSavedStateRegistry();
        this.f4112a = dr3.getLifecycle();
        this.f4111a = bundle;
        this.f4110a = application;
        this.f4113a = application != null ? C0709m.C0710a.f4124a.mo5031b(application) : new C0709m.C0710a();
    }

    @vr2
    /* renamed from: a */
    public <T extends au4> T mo4943a(@vr2 Class<T> cls, @vr2 jb0 jb0) {
        jt1.m53777p(cls, "modelClass");
        jt1.m53777p(jb0, "extras");
        String str = (String) jb0.mo18205a(C0709m.C0715c.f4134a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (jb0.mo18205a(xq3.f22704a) != null && jb0.mo18205a(xq3.f22706b) != null) {
            Application application = (Application) jb0.mo18205a(C0709m.C0710a.f4127b);
            boolean isAssignableFrom = C1852c6.class.isAssignableFrom(cls);
            Constructor<T> c = er3.m13944c(cls, (!isAssignableFrom || application == null) ? er3.f11331b : er3.f11330a);
            if (c == null) {
                return this.f4113a.mo4943a(cls, jb0);
            }
            if (!isAssignableFrom || application == null) {
                return er3.m13945d(cls, c, xq3.m31623a(jb0));
            }
            return er3.m13945d(cls, c, application, xq3.m31623a(jb0));
        } else if (this.f4112a != null) {
            return mo5019d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    @vr2
    /* renamed from: b */
    public <T extends au4> T mo4944b(@vr2 Class<T> cls) {
        jt1.m53777p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo5019d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: c */
    public void mo4945c(@vr2 au4 au4) {
        jt1.m53777p(au4, "viewModel");
        C0690e eVar = this.f4112a;
        if (eVar != null) {
            LegacySavedStateHandleController.m4724a(au4, this.f4114a, eVar);
        }
    }

    @vr2
    /* renamed from: d */
    public final <T extends au4> T mo5019d(@vr2 String str, @vr2 Class<T> cls) {
        T t;
        Application application;
        jt1.m53777p(str, "key");
        jt1.m53777p(cls, "modelClass");
        if (this.f4112a != null) {
            boolean isAssignableFrom = C1852c6.class.isAssignableFrom(cls);
            Constructor<T> c = er3.m13944c(cls, (!isAssignableFrom || this.f4110a == null) ? er3.f11331b : er3.f11330a);
            if (c == null) {
                return this.f4110a != null ? this.f4113a.mo4944b(cls) : C0709m.C0715c.f4132a.mo5033a().mo4944b(cls);
            }
            SavedStateHandleController b = LegacySavedStateHandleController.m4725b(this.f4114a, this.f4112a, str, this.f4111a);
            if (!isAssignableFrom || (application = this.f4110a) == null) {
                wq3 i = b.mo4941i();
                jt1.m53776o(i, "controller.handle");
                t = er3.m13945d(cls, c, i);
            } else {
                jt1.m53774m(application);
                wq3 i2 = b.mo4941i();
                jt1.m53776o(i2, "controller.handle");
                t = er3.m13945d(cls, c, application, i2);
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
