package com.onedelhi.secure;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

public class kg2<T> extends lm2<T> {

    /* renamed from: b */
    public nq3<LiveData<?>, C2630a<?>> f14891b = new nq3<>();

    /* renamed from: com.onedelhi.secure.kg2$a */
    public static class C2630a<V> implements bu2<V> {

        /* renamed from: a */
        public int f14892a = -1;

        /* renamed from: a */
        public final LiveData<V> f14893a;

        /* renamed from: a */
        public final bu2<? super V> f14894a;

        public C2630a(LiveData<V> liveData, bu2<? super V> bu2) {
            this.f14893a = liveData;
            this.f14894a = bu2;
        }

        /* renamed from: a */
        public void mo19061a() {
            this.f14893a.mo4927k(this);
        }

        /* renamed from: b */
        public void mo3946b(@ts2 V v) {
            if (this.f14892a != this.f14893a.mo4923g()) {
                this.f14892a = this.f14893a.mo4923g();
                this.f14894a.mo3946b(v);
            }
        }

        /* renamed from: c */
        public void mo19062c() {
            this.f14893a.mo4931o(this);
        }
    }

    @C3740us
    /* renamed from: l */
    public void mo4928l() {
        Iterator<Map.Entry<LiveData<?>, C2630a<?>>> it = this.f14891b.iterator();
        while (it.hasNext()) {
            ((C2630a) it.next().getValue()).mo19061a();
        }
    }

    @C3740us
    /* renamed from: m */
    public void mo4929m() {
        Iterator<Map.Entry<LiveData<?>, C2630a<?>>> it = this.f14891b.iterator();
        while (it.hasNext()) {
            ((C2630a) it.next().getValue()).mo19062c();
        }
    }

    @bc2
    /* renamed from: r */
    public <S> void mo19059r(@mr2 LiveData<S> liveData, @mr2 bu2<? super S> bu2) {
        C2630a aVar = new C2630a(liveData, bu2);
        C2630a k = this.f14891b.mo13878k(liveData, aVar);
        if (k != null && k.f14894a != bu2) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (k == null && mo4924h()) {
            aVar.mo19061a();
        }
    }

    @bc2
    /* renamed from: s */
    public <S> void mo19060s(@mr2 LiveData<S> liveData) {
        C2630a l = this.f14891b.mo13879l(liveData);
        if (l != null) {
            l.mo19062c();
        }
    }
}
