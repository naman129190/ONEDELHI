package com.onedelhi.secure;

import androidx.lifecycle.LiveData;

public class vg4 {

    /* renamed from: com.onedelhi.secure.vg4$a */
    public static class C3785a implements bu2<X> {

        /* renamed from: a */
        public final /* synthetic */ bd1 f21773a;

        /* renamed from: a */
        public final /* synthetic */ kg2 f21774a;

        public C3785a(kg2 kg2, bd1 bd1) {
            this.f21774a = kg2;
            this.f21773a = bd1;
        }

        /* renamed from: b */
        public void mo3946b(@ts2 X x) {
            this.f21774a.mo4933q(this.f21773a.mo4430a(x));
        }
    }

    /* renamed from: com.onedelhi.secure.vg4$b */
    public static class C3786b implements bu2<X> {

        /* renamed from: a */
        public LiveData<Y> f21775a;

        /* renamed from: a */
        public final /* synthetic */ bd1 f21776a;

        /* renamed from: a */
        public final /* synthetic */ kg2 f21777a;

        /* renamed from: com.onedelhi.secure.vg4$b$a */
        public class C3787a implements bu2<Y> {
            public C3787a() {
            }

            /* renamed from: b */
            public void mo3946b(@ts2 Y y) {
                C3786b.this.f21777a.mo4933q(y);
            }
        }

        public C3786b(bd1 bd1, kg2 kg2) {
            this.f21776a = bd1;
            this.f21777a = kg2;
        }

        /* renamed from: b */
        public void mo3946b(@ts2 X x) {
            LiveData<Y> liveData = (LiveData) this.f21776a.mo4430a(x);
            LiveData<Y> liveData2 = this.f21775a;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f21777a.mo19060s(liveData2);
                }
                this.f21775a = liveData;
                if (liveData != null) {
                    this.f21777a.mo19059r(liveData, new C3787a());
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vg4$c */
    public static class C3788c implements bu2<X> {

        /* renamed from: a */
        public final /* synthetic */ kg2 f21779a;

        /* renamed from: a */
        public boolean f21780a = true;

        public C3788c(kg2 kg2) {
            this.f21779a = kg2;
        }

        /* renamed from: b */
        public void mo3946b(X x) {
            Object f = this.f21779a.mo4922f();
            if (this.f21780a || ((f == null && x != null) || (f != null && !f.equals(x)))) {
                this.f21780a = false;
                this.f21779a.mo4933q(x);
            }
        }
    }

    @bc2
    @mr2
    /* renamed from: a */
    public static <X> LiveData<X> m30043a(@mr2 LiveData<X> liveData) {
        kg2 kg2 = new kg2();
        kg2.mo19059r(liveData, new C3788c(kg2));
        return kg2;
    }

    @bc2
    @mr2
    /* renamed from: b */
    public static <X, Y> LiveData<Y> m30044b(@mr2 LiveData<X> liveData, @mr2 bd1<X, Y> bd1) {
        kg2 kg2 = new kg2();
        kg2.mo19059r(liveData, new C3785a(kg2, bd1));
        return kg2;
    }

    @bc2
    @mr2
    /* renamed from: c */
    public static <X, Y> LiveData<Y> m30045c(@mr2 LiveData<X> liveData, @mr2 bd1<X, LiveData<Y>> bd1) {
        kg2 kg2 = new kg2();
        kg2.mo19059r(liveData, new C3786b(bd1, kg2));
        return kg2;
    }
}
