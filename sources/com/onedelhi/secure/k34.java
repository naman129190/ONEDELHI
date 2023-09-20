package com.onedelhi.secure;

public abstract class k34 {

    /* renamed from: a */
    public static final boolean f14722a = false;

    /* renamed from: com.onedelhi.secure.k34$b */
    public static class C2596b extends k34 {

        /* renamed from: a */
        public volatile RuntimeException f14723a;

        public C2596b() {
            super();
        }

        /* renamed from: b */
        public void mo18880b(boolean z) {
            this.f14723a = z ? new RuntimeException("Released") : null;
        }

        /* renamed from: c */
        public void mo18881c() {
            if (this.f14723a != null) {
                throw new IllegalStateException("Already released", this.f14723a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.k34$c */
    public static class C2597c extends k34 {

        /* renamed from: b */
        public volatile boolean f14724b;

        public C2597c() {
            super();
        }

        /* renamed from: b */
        public void mo18880b(boolean z) {
            this.f14724b = z;
        }

        /* renamed from: c */
        public void mo18881c() {
            if (this.f14724b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public k34() {
    }

    @mr2
    /* renamed from: a */
    public static k34 m19424a() {
        return new C2597c();
    }

    /* renamed from: b */
    public abstract void mo18880b(boolean z);

    /* renamed from: c */
    public abstract void mo18881c();
}
