package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/b90$b;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "a", "(Lcom/onedelhi/secure/b90$b;Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "Lcom/onedelhi/secure/b90;", "b", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class c90 {
    @gz3(version = "1.3")
    @ly0
    @ss2
    /* renamed from: a */
    public static final <E extends b90.C4634b> E m40762a(@vr2 b90.C4634b bVar, @vr2 b90.C4636c<E> cVar) {
        jt1.m53777p(bVar, "<this>");
        jt1.m53777p(cVar, "key");
        if (cVar instanceof C6161n0) {
            C6161n0 n0Var = (C6161n0) cVar;
            if (!n0Var.mo40886a(bVar.getKey())) {
                return null;
            }
            E b = n0Var.mo40887b(bVar);
            if (b instanceof b90.C4634b) {
                return b;
            }
            return null;
        } else if (bVar.getKey() == cVar) {
            return bVar;
        } else {
            return null;
        }
    }

    @vr2
    @gz3(version = "1.3")
    @ly0
    /* renamed from: b */
    public static final b90 m40763b(@vr2 b90.C4634b bVar, @vr2 b90.C4636c<?> cVar) {
        jt1.m53777p(bVar, "<this>");
        jt1.m53777p(cVar, "key");
        if (!(cVar instanceof C6161n0)) {
            return bVar.getKey() == cVar ? gt0.f29313a : bVar;
        }
        C6161n0 n0Var = (C6161n0) cVar;
        return (!n0Var.mo40886a(bVar.getKey()) || n0Var.mo40887b(bVar) == null) ? bVar : gt0.f29313a;
    }
}
