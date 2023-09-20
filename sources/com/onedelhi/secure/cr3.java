package com.onedelhi.secure;

import android.os.Bundle;
import androidx.lifecycle.C0690e;
import androidx.savedstate.Recreator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/cr3;", "", "Lcom/onedelhi/secure/un4;", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Lcom/onedelhi/secure/br3;", "savedStateRegistry", "Lcom/onedelhi/secure/br3;", "b", "()Lcom/onedelhi/secure/br3;", "Lcom/onedelhi/secure/dr3;", "owner", "<init>", "(Lcom/onedelhi/secure/dr3;)V", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class cr3 {
    @vr2

    /* renamed from: a */
    public static final C1923a f10467a = new C1923a((wg0) null);
    @vr2

    /* renamed from: a */
    public final br3 f10468a;
    @vr2

    /* renamed from: a */
    public final dr3 f10469a;

    /* renamed from: a */
    public boolean f10470a;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/cr3$a;", "", "Lcom/onedelhi/secure/dr3;", "owner", "Lcom/onedelhi/secure/cr3;", "a", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.cr3$a */
    public static final class C1923a {
        public C1923a() {
        }

        public /* synthetic */ C1923a(wg0 wg0) {
            this();
        }

        @zw1
        @vr2
        /* renamed from: a */
        public final cr3 mo14344a(@vr2 dr3 dr3) {
            jt1.m53777p(dr3, "owner");
            return new cr3(dr3, (wg0) null);
        }
    }

    public cr3(dr3 dr3) {
        this.f10469a = dr3;
        this.f10468a = new br3();
    }

    public /* synthetic */ cr3(dr3 dr3, wg0 wg0) {
        this(dr3);
    }

    @zw1
    @vr2
    /* renamed from: a */
    public static final cr3 m12700a(@vr2 dr3 dr3) {
        return f10467a.mo14344a(dr3);
    }

    @vr2
    /* renamed from: b */
    public final br3 mo14340b() {
        return this.f10468a;
    }

    @bc2
    /* renamed from: c */
    public final void mo14341c() {
        C0690e lifecycle = this.f10469a.getLifecycle();
        jt1.m53776o(lifecycle, "owner.lifecycle");
        if (lifecycle.mo4959b() == C0690e.C0693c.INITIALIZED) {
            lifecycle.mo4958a(new Recreator(this.f10469a));
            this.f10468a.mo13800g(lifecycle);
            this.f10470a = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @bc2
    /* renamed from: d */
    public final void mo14342d(@ss2 Bundle bundle) {
        if (!this.f10470a) {
            mo14341c();
        }
        C0690e lifecycle = this.f10469a.getLifecycle();
        jt1.m53776o(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo4959b().mo4962a(C0690e.C0693c.STARTED)) {
            this.f10468a.mo13801h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo4959b()).toString());
    }

    @bc2
    /* renamed from: e */
    public final void mo14343e(@vr2 Bundle bundle) {
        jt1.m53777p(bundle, "outBundle");
        this.f10468a.mo13802i(bundle);
    }
}
