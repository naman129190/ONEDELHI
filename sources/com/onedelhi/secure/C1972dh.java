package com.onedelhi.secure;

import com.onedelhi.secure.jo2;

/* renamed from: com.onedelhi.secure.dh */
public final class C1972dh extends jo2 {

    /* renamed from: a */
    public final jo2.C2535b f10738a;

    /* renamed from: a */
    public final jo2.C2536c f10739a;

    /* renamed from: com.onedelhi.secure.dh$b */
    public static final class C1974b extends jo2.C2534a {

        /* renamed from: a */
        public jo2.C2535b f10740a;

        /* renamed from: a */
        public jo2.C2536c f10741a;

        /* renamed from: a */
        public jo2 mo14651a() {
            return new C1972dh(this.f10741a, this.f10740a);
        }

        /* renamed from: b */
        public jo2.C2534a mo14652b(@ts2 jo2.C2535b bVar) {
            this.f10740a = bVar;
            return this;
        }

        /* renamed from: c */
        public jo2.C2534a mo14653c(@ts2 jo2.C2536c cVar) {
            this.f10741a = cVar;
            return this;
        }
    }

    public C1972dh(@ts2 jo2.C2536c cVar, @ts2 jo2.C2535b bVar) {
        this.f10739a = cVar;
        this.f10738a = bVar;
    }

    @ts2
    /* renamed from: b */
    public jo2.C2535b mo14646b() {
        return this.f10738a;
    }

    @ts2
    /* renamed from: c */
    public jo2.C2536c mo14647c() {
        return this.f10739a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2 = (jo2) obj;
        jo2.C2536c cVar = this.f10739a;
        if (cVar != null ? cVar.equals(jo2.mo14647c()) : jo2.mo14647c() == null) {
            jo2.C2535b bVar = this.f10738a;
            jo2.C2535b b = jo2.mo14646b();
            if (bVar == null) {
                if (b == null) {
                    return true;
                }
            } else if (bVar.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        jo2.C2536c cVar = this.f10739a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        jo2.C2535b bVar = this.f10738a;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10739a + ", mobileSubtype=" + this.f10738a + "}";
    }
}
