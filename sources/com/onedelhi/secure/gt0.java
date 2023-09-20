package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import java.io.Serializable;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/gt0;", "Lcom/onedelhi/secure/b90;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lcom/onedelhi/secure/b90$b;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "context", "plus", "minusKey", "", "hashCode", "", "toString", "", "e", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class gt0 implements b90, Serializable {
    @vr2

    /* renamed from: a */
    public static final gt0 f29313a = new gt0();

    /* renamed from: b */
    public static final long f29314b = 0;

    /* renamed from: e */
    public final Object mo36884e() {
        return f29313a;
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        jt1.m53777p(sc1, "operation");
        return r;
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        jt1.m53777p(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        jt1.m53777p(cVar, "key");
        return this;
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        jt1.m53777p(b90, "context");
        return b90;
    }

    @vr2
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
