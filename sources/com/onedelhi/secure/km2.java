package com.onedelhi.secure;

import com.onedelhi.secure.jb0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/km2;", "Lcom/onedelhi/secure/jb0;", "T", "Lcom/onedelhi/secure/jb0$b;", "key", "t", "Lcom/onedelhi/secure/un4;", "c", "(Lcom/onedelhi/secure/jb0$b;Ljava/lang/Object;)V", "a", "(Lcom/onedelhi/secure/jb0$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(Lcom/onedelhi/secure/jb0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
public final class km2 extends jb0 {
    public km2() {
        this((jb0) null, 1, (wg0) null);
    }

    public km2(@vr2 jb0 jb0) {
        jt1.m53777p(jb0, "initialExtras");
        mo18206b().putAll(jb0.mo18206b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km2(jb0 jb0, int i, wg0 wg0) {
        this((i & 1) != 0 ? jb0.C2482a.f14048a : jb0);
    }

    @ss2
    /* renamed from: a */
    public <T> T mo18205a(@vr2 jb0.C2483b<T> bVar) {
        jt1.m53777p(bVar, "key");
        return mo18206b().get(bVar);
    }

    /* renamed from: c */
    public final <T> void mo19162c(@vr2 jb0.C2483b<T> bVar, T t) {
        jt1.m53777p(bVar, "key");
        mo18206b().put(bVar, t);
    }
}
