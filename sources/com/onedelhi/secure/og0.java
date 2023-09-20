package com.onedelhi.secure;

import kotlin.Metadata;

@ml3
@gz3(version = "1.7")
@tw4(markerClass = {ly0.class})
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\n\u001a\u00028\u0003\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t2\u0006\u0010\u0004\u001a\u00028\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u0001\u0001\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/og0;", "T", "R", "", "value", "e", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "U", "S", "Lcom/onedelhi/secure/mg0;", "c", "(Lcom/onedelhi/secure/mg0;Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "g", "<init>", "()V", "Lcom/onedelhi/secure/pg0;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class og0<T, R> {
    public og0() {
    }

    public /* synthetic */ og0(wg0 wg0) {
        this();
    }

    @ss2
    /* renamed from: c */
    public abstract <U, S> Object mo41776c(@vr2 mg0<U, S> mg0, U u, @vr2 b80<? super S> b80);

    @ss2
    /* renamed from: e */
    public abstract Object mo41777e(T t, @vr2 b80<? super R> b80);

    @vr2
    @xj0(level = ak0.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @oi3(expression = "this.callRecursive(value)", imports = {}))
    /* renamed from: g */
    public final Void mo41778g(@vr2 mg0<?, ?> mg0, @ss2 Object obj) {
        jt1.m53777p(mg0, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
