package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/ko3;", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/nl3;", "result", "m0", "(Ljava/lang/Object;)V", "c", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/nl3;", "e", "()Lcom/onedelhi/secure/nl3;", "g", "(Lcom/onedelhi/secure/nl3;)V", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ko3 implements b80<un4> {
    @ss2

    /* renamed from: a */
    public nl3<un4> f31359a;

    /* renamed from: c */
    public final void mo39362c() {
        synchronized (this) {
            while (true) {
                nl3<un4> nl3 = this.f31359a;
                if (nl3 == null) {
                    jt1.m53775n(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    pl3.m61436n(nl3.mo41106l());
                }
            }
        }
    }

    @ss2
    /* renamed from: e */
    public final nl3<un4> mo39363e() {
        return this.f31359a;
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return gt0.f29313a;
    }

    /* renamed from: g */
    public final void mo39364g(@ss2 nl3<un4> nl3) {
        this.f31359a = nl3;
    }

    /* renamed from: m0 */
    public void mo31191m0(@vr2 Object obj) {
        synchronized (this) {
            this.f31359a = nl3.m58186a(obj);
            jt1.m53775n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            un4 un4 = un4.f36206a;
        }
    }
}
