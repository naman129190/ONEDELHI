package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.io.Serializable;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/ij;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/p90;", "Ljava/io/Serializable;", "Lcom/onedelhi/secure/nl3;", "result", "Lcom/onedelhi/secure/un4;", "m0", "(Ljava/lang/Object;)V", "D", "(Ljava/lang/Object;)Ljava/lang/Object;", "F", "completion", "A", "value", "B", "", "toString", "Ljava/lang/StackTraceElement;", "P", "Lcom/onedelhi/secure/b80;", "C", "()Lcom/onedelhi/secure/b80;", "i", "()Lcom/onedelhi/secure/p90;", "callerFrame", "<init>", "(Lcom/onedelhi/secure/b80;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ij */
public abstract class C5729ij implements b80<Object>, p90, Serializable {
    @ss2

    /* renamed from: a */
    public final b80<Object> f30342a;

    public C5729ij(@ss2 b80<Object> b80) {
        this.f30342a = b80;
    }

    @vr2
    /* renamed from: A */
    public b80<un4> mo38112A(@vr2 b80<?> b80) {
        jt1.m53777p(b80, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @vr2
    /* renamed from: B */
    public b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
        jt1.m53777p(b80, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @ss2
    /* renamed from: C */
    public final b80<Object> mo38113C() {
        return this.f30342a;
    }

    @ss2
    /* renamed from: D */
    public abstract Object mo22645D(@vr2 Object obj);

    /* renamed from: F */
    public void mo34861F() {
    }

    @ss2
    /* renamed from: P */
    public StackTraceElement mo35201P() {
        return df0.m45065e(this);
    }

    @ss2
    /* renamed from: i */
    public p90 mo35202i() {
        b80<Object> b80 = this.f30342a;
        if (b80 instanceof p90) {
            return (p90) b80;
        }
        return null;
    }

    /* renamed from: m0 */
    public final void mo31191m0(@vr2 Object obj) {
        b80 b80 = this;
        while (true) {
            hf0.m50482b(b80);
            C5729ij ijVar = (C5729ij) b80;
            b80 b802 = ijVar.f30342a;
            jt1.m53774m(b802);
            try {
                Object D = ijVar.mo22645D(obj);
                if (D != mt1.m57558h()) {
                    nl3.C6191a aVar = nl3.f32575a;
                    obj = nl3.m58187b(D);
                    ijVar.mo34861F();
                    if (b802 instanceof C5729ij) {
                        b80 = b802;
                    } else {
                        b802.mo31191m0(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th));
            }
        }
    }

    @vr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object P = mo35201P();
        if (P == null) {
            P = getClass().getName();
        }
        sb.append(P);
        return sb.toString();
    }
}
