package com.onedelhi.secure;

public abstract class f05 {

    /* renamed from: com.onedelhi.secure.f05$a */
    public static final class C5204a extends f05 {
        @ss2

        /* renamed from: a */
        public final Boolean f28138a;
        @ss2

        /* renamed from: a */
        public final String f28139a;

        public C5204a(@ss2 String str, @ss2 Boolean bool) {
            super((wg0) null);
            this.f28139a = str;
            this.f28138a = bool;
        }

        public boolean equals(@ss2 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5204a)) {
                return false;
            }
            C5204a aVar = (C5204a) obj;
            return jt1.m53768g(this.f28139a, aVar.f28139a) && jt1.m53768g(this.f28138a, aVar.f28138a);
        }

        public int hashCode() {
            String str = this.f28139a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f28138a;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        @vr2
        public String toString() {
            return "B2BScreenResult(response=" + this.f28139a + ", isCanceled=" + this.f28138a + ')';
        }
    }

    /* renamed from: com.onedelhi.secure.f05$b */
    public static final class C5205b extends f05 {
        @vr2

        /* renamed from: a */
        public final n15 f28140a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5205b(@vr2 n15 n15) {
            super((wg0) null);
            jt1.m53777p(n15, "b2BPGResponseWrapper");
            this.f28140a = n15;
        }

        public boolean equals(@ss2 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5205b) && jt1.m53768g(this.f28140a, ((C5205b) obj).f28140a);
        }

        public int hashCode() {
            return this.f28140a.hashCode();
        }

        @vr2
        public String toString() {
            return "B2BApiResult(b2BPGResponseWrapper=" + this.f28140a + ')';
        }
    }

    public f05() {
    }

    public /* synthetic */ f05(wg0 wg0) {
        this();
    }
}
