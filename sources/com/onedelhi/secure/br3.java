package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0690e;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0003%\u0005\nB\t\b\u0000¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/br3;", "", "", "key", "Landroid/os/Bundle;", "b", "Lcom/onedelhi/secure/br3$c;", "provider", "Lcom/onedelhi/secure/un4;", "j", "c", "m", "Ljava/lang/Class;", "Lcom/onedelhi/secure/br3$a;", "clazz", "k", "Landroidx/lifecycle/e;", "lifecycle", "g", "(Landroidx/lifecycle/e;)V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "", "<set-?>", "isRestored", "Z", "e", "()Z", "isAllowingSavingState", "d", "l", "(Z)V", "<init>", "()V", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
public final class br3 {
    @vr2

    /* renamed from: a */
    public static final C1802b f9948a = new C1802b((wg0) null);
    @Deprecated
    @vr2

    /* renamed from: a */
    public static final String f9949a = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    @ss2

    /* renamed from: a */
    public Bundle f9950a;
    @ss2

    /* renamed from: a */
    public Recreator.C0985b f9951a;
    @vr2

    /* renamed from: a */
    public final nq3<String, C1803c> f9952a = new nq3<>();

    /* renamed from: a */
    public boolean f9953a;

    /* renamed from: b */
    public boolean f9954b;

    /* renamed from: c */
    public boolean f9955c = true;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/br3$a;", "", "Lcom/onedelhi/secure/dr3;", "owner", "Lcom/onedelhi/secure/un4;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.br3$a */
    public interface C1801a {
        /* renamed from: a */
        void mo4913a(@vr2 dr3 dr3);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/br3$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.br3$b */
    public static final class C1802b {
        public C1802b() {
        }

        public /* synthetic */ C1802b(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/onedelhi/secure/br3$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.br3$c */
    public interface C1803c {
        @vr2
        /* renamed from: a */
        Bundle mo879a();
    }

    /* renamed from: f */
    public static final void m12039f(br3 br3, a32 a32, C0690e.C0692b bVar) {
        boolean z;
        jt1.m53777p(br3, "this$0");
        jt1.m53777p(a32, "<anonymous parameter 0>");
        jt1.m53777p(bVar, "event");
        if (bVar == C0690e.C0692b.ON_START) {
            z = true;
        } else if (bVar == C0690e.C0692b.ON_STOP) {
            z = false;
        } else {
            return;
        }
        br3.f9955c = z;
    }

    @bc2
    @ss2
    /* renamed from: b */
    public final Bundle mo13796b(@vr2 String str) {
        jt1.m53777p(str, "key");
        if (this.f9954b) {
            Bundle bundle = this.f9950a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f9950a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f9950a;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f9950a = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @ss2
    /* renamed from: c */
    public final C1803c mo13797c(@vr2 String str) {
        jt1.m53777p(str, "key");
        Iterator<Map.Entry<String, C1803c>> it = this.f9952a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            jt1.m53776o(next, "components");
            C1803c cVar = (C1803c) next.getValue();
            if (jt1.m53768g((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo13798d() {
        return this.f9955c;
    }

    @bc2
    /* renamed from: e */
    public final boolean mo13799e() {
        return this.f9954b;
    }

    @bc2
    /* renamed from: g */
    public final void mo13800g(@vr2 C0690e eVar) {
        jt1.m53777p(eVar, "lifecycle");
        if (!this.f9953a) {
            eVar.mo4958a(new ar3(this));
            this.f9953a = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @bc2
    /* renamed from: h */
    public final void mo13801h(@ss2 Bundle bundle) {
        if (!this.f9953a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f9954b) {
            this.f9950a = bundle != null ? bundle.getBundle(f9949a) : null;
            this.f9954b = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    @bc2
    /* renamed from: i */
    public final void mo13802i(@vr2 Bundle bundle) {
        jt1.m53777p(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f9950a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        nq3<K, V>.d g = this.f9952a.mo21423g();
        jt1.m53776o(g, "this.components.iteratorWithAdditions()");
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            bundle2.putBundle((String) entry.getKey(), ((C1803c) entry.getValue()).mo879a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f9949a, bundle2);
        }
    }

    @bc2
    /* renamed from: j */
    public final void mo13803j(@vr2 String str, @vr2 C1803c cVar) {
        jt1.m53777p(str, "key");
        jt1.m53777p(cVar, "provider");
        if (!(this.f9952a.mo13878k(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @bc2
    /* renamed from: k */
    public final void mo13804k(@vr2 Class<? extends C1801a> cls) {
        jt1.m53777p(cls, "clazz");
        if (this.f9955c) {
            Recreator.C0985b bVar = this.f9951a;
            if (bVar == null) {
                bVar = new Recreator.C0985b(this);
            }
            this.f9951a = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C0985b bVar2 = this.f9951a;
                if (bVar2 != null) {
                    String name = cls.getName();
                    jt1.m53776o(name, "clazz.name");
                    bVar2.mo6655b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    /* renamed from: l */
    public final void mo13805l(boolean z) {
        this.f9955c = z;
    }

    @bc2
    /* renamed from: m */
    public final void mo13806m(@vr2 String str) {
        jt1.m53777p(str, "key");
        this.f9952a.mo13879l(str);
    }
}
