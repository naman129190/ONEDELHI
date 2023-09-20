package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.C4623b5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.onedelhi.secure.g5 */
public class C5361g5 {

    /* renamed from: a */
    public volatile C4688bo f28942a;

    /* renamed from: a */
    public volatile C5479h5 f28943a;

    /* renamed from: a */
    public final xh0<C4623b5> f28944a;
    @mj1("this")

    /* renamed from: a */
    public final List<C4586ao> f28945a;

    public C5361g5(xh0<C4623b5> xh0) {
        this(xh0, new gm0(), new in4());
    }

    public C5361g5(xh0<C4623b5> xh0, @mr2 C4688bo boVar, @mr2 C5479h5 h5Var) {
        this.f28944a = xh0;
        this.f28942a = boVar;
        this.f28945a = new ArrayList();
        this.f28943a = h5Var;
        mo36570f();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m49080g(String str, Bundle bundle) {
        this.f28943a.mo34224a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m49081h(C4586ao aoVar) {
        synchronized (this) {
            if (this.f28942a instanceof gm0) {
                this.f28945a.add(aoVar);
            }
            this.f28942a.mo31956a(aoVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m49082i(b73 b73) {
        o92.m59120f().mo41613b("AnalyticsConnector now available.");
        C4623b5 b5Var = (C4623b5) b73.get();
        na0 na0 = new na0(b5Var);
        ba0 ba0 = new ba0();
        if (m49083j(b5Var, ba0) != null) {
            o92.m59120f().mo41613b("Registered Firebase Analytics listener.");
            C7508zn znVar = new C7508zn();
            C5033dn dnVar = new C5033dn(na0, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C4586ao a : this.f28945a) {
                    znVar.mo31956a(a);
                }
                ba0.mo31537d(znVar);
                ba0.mo31538e(dnVar);
                this.f28942a = znVar;
                this.f28943a = dnVar;
            }
            return;
        }
        o92.m59120f().mo41623m("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @zh0
    /* renamed from: j */
    public static C4623b5.C4624a m49083j(@mr2 C4623b5 b5Var, @mr2 ba0 ba0) {
        C4623b5.C4624a b = b5Var.mo31398b("clx", ba0);
        if (b == null) {
            o92.m59120f().mo41613b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b = b5Var.mo31398b("crash", ba0);
            if (b != null) {
                o92.m59120f().mo41623m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b;
    }

    /* renamed from: d */
    public C5479h5 mo36568d() {
        return new C4961d5(this);
    }

    /* renamed from: e */
    public C4688bo mo36569e() {
        return new C5082e5(this);
    }

    /* renamed from: f */
    public final void mo36570f() {
        this.f28944a.mo47184a(new C5212f5(this));
    }
}
