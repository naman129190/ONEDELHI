package com.onedelhi.secure;

import com.onedelhi.secure.C5860k1;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0015\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/s32;", "E", "Lcom/onedelhi/secure/i0;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/it3;", "select", "J", "(Ljava/lang/Object;Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "Lcom/onedelhi/secure/tq1;", "Lcom/onedelhi/secure/rt3;", "list", "Lcom/onedelhi/secure/iz;", "closed", "Lcom/onedelhi/secure/un4;", "n0", "(Ljava/lang/Object;Lcom/onedelhi/secure/iz;)V", "", "j0", "()Z", "isBufferAlwaysEmpty", "k0", "isBufferEmpty", "D", "isBufferAlwaysFull", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class s32<E> extends C5632i0<E> {
    public s32(@ss2 ec1<? super E, un4> ec1) {
        super(ec1);
    }

    /* renamed from: D */
    public final boolean mo31520D() {
        return false;
    }

    /* renamed from: E */
    public final boolean mo31521E() {
        return false;
    }

    @vr2
    /* renamed from: H */
    public Object mo31522H(E e) {
        mg3<?> N;
        do {
            Object H = super.mo31522H(e);
            l84 l84 = C5757j0.f30528b;
            if (H == l84) {
                return l84;
            }
            if (H == C5757j0.f30529c) {
                N = mo38987N(e);
                if (N == null) {
                    return l84;
                }
            } else if (H instanceof C5753iz) {
                return H;
            } else {
                throw new IllegalStateException(jt1.m53745C("Invalid offerInternal result ", H).toString());
            }
        } while (!(N instanceof C5753iz));
        return N;
    }

    @vr2
    /* renamed from: J */
    public Object mo31523J(E e, @vr2 it3<?> it3) {
        Object obj;
        while (true) {
            if (mo37704i0()) {
                obj = super.mo31523J(e, it3);
            } else {
                obj = it3.mo35593C(mo38991i(e));
                if (obj == null) {
                    obj = C5757j0.f30528b;
                }
            }
            if (obj == kt3.m54916d()) {
                return kt3.m54916d();
            }
            l84 l84 = C5757j0.f30528b;
            if (obj == l84) {
                return l84;
            }
            if (obj != C5757j0.f30529c && obj != C6944ub.f36019b) {
                if (obj instanceof C5753iz) {
                    return obj;
                }
                throw new IllegalStateException(jt1.m53745C("Invalid result ", obj).toString());
            }
        }
    }

    /* renamed from: j0 */
    public final boolean mo31526j0() {
        return true;
    }

    /* renamed from: k0 */
    public final boolean mo31527k0() {
        return true;
    }

    /* renamed from: n0 */
    public void mo37707n0(@vr2 Object obj, @vr2 C5753iz<?> izVar) {
        mn4 mn4 = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                rt3 rt3 = (rt3) obj;
                if (rt3 instanceof C5860k1.C5861a) {
                    ec1<E, un4> ec1 = this.f31049a;
                    if (ec1 != null) {
                        mn4 = qv2.m63198c(ec1, ((C5860k1.C5861a) rt3).f31051a, (mn4) null);
                    }
                } else {
                    rt3.mo38291c1(izVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    mn4 mn42 = null;
                    while (true) {
                        int i = size - 1;
                        rt3 rt32 = (rt3) arrayList.get(size);
                        if (rt32 instanceof C5860k1.C5861a) {
                            ec1<E, un4> ec12 = this.f31049a;
                            mn42 = ec12 == null ? null : qv2.m63198c(ec12, ((C5860k1.C5861a) rt32).f31051a, mn42);
                        } else {
                            rt32.mo38291c1(izVar);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    mn4 = mn42;
                }
            }
        }
        if (mn4 != null) {
            throw mn4;
        }
    }
}
