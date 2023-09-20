package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.b90.C4634b;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/n0;", "Lcom/onedelhi/secure/b90$b;", "B", "E", "Lcom/onedelhi/secure/b90$c;", "element", "b", "(Lcom/onedelhi/secure/b90$b;)Lcom/onedelhi/secure/b90$b;", "key", "", "a", "(Lcom/onedelhi/secure/b90$c;)Z", "baseKey", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "safeCast", "<init>", "(Lcom/onedelhi/secure/b90$c;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@ly0
/* renamed from: com.onedelhi.secure.n0 */
public abstract class C6161n0<B extends b90.C4634b, E extends B> implements b90.C4636c<E> {
    @vr2

    /* renamed from: a */
    public final b90.C4636c<?> f32330a;
    @vr2

    /* renamed from: a */
    public final ec1<b90.C4634b, E> f32331a;

    public C6161n0(@vr2 b90.C4636c<B> cVar, @vr2 ec1<? super b90.C4634b, ? extends E> ec1) {
        jt1.m53777p(cVar, "baseKey");
        jt1.m53777p(ec1, "safeCast");
        this.f32331a = ec1;
        this.f32330a = cVar instanceof C6161n0 ? ((C6161n0) cVar).f32330a : cVar;
    }

    /* renamed from: a */
    public final boolean mo40886a(@vr2 b90.C4636c<?> cVar) {
        jt1.m53777p(cVar, "key");
        return cVar == this || this.f32330a == cVar;
    }

    @ss2
    /* renamed from: b */
    public final E mo40887b(@vr2 b90.C4634b bVar) {
        jt1.m53777p(bVar, "element");
        return (b90.C4634b) this.f32331a.mo17094X(bVar);
    }
}
