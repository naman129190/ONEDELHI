package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.br3;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/yq3;", "Lcom/onedelhi/secure/br3$c;", "Landroid/os/Bundle;", "a", "Lcom/onedelhi/secure/un4;", "d", "", "key", "b", "Lcom/onedelhi/secure/zq3;", "viewModel$delegate", "Lcom/onedelhi/secure/w12;", "c", "()Lcom/onedelhi/secure/zq3;", "viewModel", "Lcom/onedelhi/secure/br3;", "savedStateRegistry", "Lcom/onedelhi/secure/hu4;", "viewModelStoreOwner", "<init>", "(Lcom/onedelhi/secure/br3;Lcom/onedelhi/secure/hu4;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class yq3 implements br3.C1803c {
    @ss2

    /* renamed from: a */
    public Bundle f23286a;
    @vr2

    /* renamed from: a */
    public final br3 f23287a;
    @vr2

    /* renamed from: a */
    public final w12 f23288a;

    /* renamed from: a */
    public boolean f23289a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/zq3;", "a", "()Lcom/onedelhi/secure/zq3;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.yq3$a */
    public static final class C4020a extends d12 implements cc1<zq3> {

        /* renamed from: a */
        public final /* synthetic */ hu4 f23290a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4020a(hu4 hu4) {
            super(0);
            this.f23290a = hu4;
        }

        @vr2
        /* renamed from: a */
        public final zq3 invoke() {
            return xq3.m31627e(this.f23290a);
        }
    }

    public yq3(@vr2 br3 br3, @vr2 hu4 hu4) {
        jt1.m53777p(br3, "savedStateRegistry");
        jt1.m53777p(hu4, "viewModelStoreOwner");
        this.f23287a = br3;
        this.f23288a = i22.m51739a(new C4020a(hu4));
    }

    @vr2
    /* renamed from: a */
    public Bundle mo879a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f23286a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : mo27663c().mo28065b().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((wq3) next.getValue()).mo26654o().mo879a();
            if (!jt1.m53768g(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f23289a = false;
        return bundle;
    }

    @ss2
    /* renamed from: b */
    public final Bundle mo27662b(@vr2 String str) {
        jt1.m53777p(str, "key");
        mo27664d();
        Bundle bundle = this.f23286a;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f23286a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f23286a;
        boolean z = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f23286a = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final zq3 mo27663c() {
        return (zq3) this.f23288a.getValue();
    }

    /* renamed from: d */
    public final void mo27664d() {
        if (!this.f23289a) {
            this.f23286a = this.f23287a.mo13796b(xq3.f22707b);
            this.f23289a = true;
            mo27663c();
        }
    }
}
