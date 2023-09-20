package com.onedelhi.secure;

import com.onedelhi.secure.C4142zy;

/* renamed from: com.onedelhi.secure.tf */
public final class C3598tf extends C4142zy {

    /* renamed from: a */
    public final C3365r5 f20772a;

    /* renamed from: a */
    public final C4142zy.C4144b f20773a;

    /* renamed from: com.onedelhi.secure.tf$b */
    public static final class C3600b extends C4142zy.C4143a {

        /* renamed from: a */
        public C3365r5 f20774a;

        /* renamed from: a */
        public C4142zy.C4144b f20775a;

        /* renamed from: a */
        public C4142zy mo24892a() {
            return new C3598tf(this.f20775a, this.f20774a);
        }

        /* renamed from: b */
        public C4142zy.C4143a mo24893b(@ts2 C3365r5 r5Var) {
            this.f20774a = r5Var;
            return this;
        }

        /* renamed from: c */
        public C4142zy.C4143a mo24894c(@ts2 C4142zy.C4144b bVar) {
            this.f20775a = bVar;
            return this;
        }
    }

    public C3598tf(@ts2 C4142zy.C4144b bVar, @ts2 C3365r5 r5Var) {
        this.f20773a = bVar;
        this.f20772a = r5Var;
    }

    @ts2
    /* renamed from: b */
    public C3365r5 mo24887b() {
        return this.f20772a;
    }

    @ts2
    /* renamed from: c */
    public C4142zy.C4144b mo24888c() {
        return this.f20773a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4142zy)) {
            return false;
        }
        C4142zy zyVar = (C4142zy) obj;
        C4142zy.C4144b bVar = this.f20773a;
        if (bVar != null ? bVar.equals(zyVar.mo24888c()) : zyVar.mo24888c() == null) {
            C3365r5 r5Var = this.f20772a;
            C3365r5 b = zyVar.mo24887b();
            if (r5Var == null) {
                if (b == null) {
                    return true;
                }
            } else if (r5Var.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C4142zy.C4144b bVar = this.f20773a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C3365r5 r5Var = this.f20772a;
        if (r5Var != null) {
            i = r5Var.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f20773a + ", androidClientInfo=" + this.f20772a + "}";
    }
}
