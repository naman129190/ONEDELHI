package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/e80;", "Lcom/onedelhi/secure/ij;", "Lcom/onedelhi/secure/b80;", "", "L", "Lcom/onedelhi/secure/un4;", "F", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "completion", "_context", "<init>", "(Lcom/onedelhi/secure/b80;Lcom/onedelhi/secure/b90;)V", "(Lcom/onedelhi/secure/b80;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class e80 extends C5729ij {
    @ss2

    /* renamed from: a */
    public final b90 f27714a;
    @ss2

    /* renamed from: b */
    public transient b80<Object> f27715b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e80(@ss2 b80<Object> b80) {
        this(b80, b80 != null ? b80.mo31187f() : null);
    }

    public e80(@ss2 b80<Object> b80, @ss2 b90 b90) {
        super(b80);
        this.f27714a = b90;
    }

    /* renamed from: F */
    public void mo34861F() {
        b80<Object> b80 = this.f27715b;
        if (!(b80 == null || b80 == this)) {
            b90.C4634b bVar = mo31187f().get(f80.f28189a);
            jt1.m53774m(bVar);
            ((f80) bVar).mo34866e0(b80);
        }
        this.f27715b = l20.f31519a;
    }

    @vr2
    /* renamed from: L */
    public final b80<Object> mo34862L() {
        b80<Object> b80 = this.f27715b;
        if (b80 == null) {
            f80 f80 = (f80) mo31187f().get(f80.f28189a);
            if (f80 == null || (b80 = f80.mo34867u0(this)) == null) {
                b80 = this;
            }
            this.f27715b = b80;
        }
        return b80;
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        b90 b90 = this.f27714a;
        jt1.m53774m(b90);
        return b90;
    }
}
