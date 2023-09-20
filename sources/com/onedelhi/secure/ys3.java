package com.onedelhi.secure;

import com.onedelhi.secure.xs3;
import java.util.Objects;
import kotlin.Metadata;

@sw1
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u0001\u0016\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/ys3;", "Lcom/onedelhi/secure/xs3;", "S", "", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "h", "(Ljava/lang/Object;)Z", "isClosed", "f", "(Ljava/lang/Object;)Lcom/onedelhi/secure/xs3;", "getSegment$annotations", "()V", "segment", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ys3<S extends xs3<S>> {
    @ss2

    /* renamed from: a */
    public final Object f38050a;

    public /* synthetic */ ys3(Object obj) {
        this.f38050a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ ys3 m72069a(Object obj) {
        return new ys3(obj);
    }

    @vr2
    /* renamed from: b */
    public static <S extends xs3<S>> Object m72070b(@ss2 Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m72071c(Object obj, Object obj2) {
        return (obj2 instanceof ys3) && jt1.m53768g(obj, ((ys3) obj2).mo47931j());
    }

    /* renamed from: d */
    public static final boolean m72072d(Object obj, Object obj2) {
        return jt1.m53768g(obj, obj2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m72073e() {
    }

    @vr2
    /* renamed from: f */
    public static final S m72074f(Object obj) {
        if (obj != j40.f30571a) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (xs3) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: g */
    public static int m72075g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m72076h(Object obj) {
        return obj == j40.f30571a;
    }

    /* renamed from: i */
    public static String m72077i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m72071c(this.f38050a, obj);
    }

    public int hashCode() {
        return m72075g(this.f38050a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo47931j() {
        return this.f38050a;
    }

    public String toString() {
        return m72077i(this.f38050a);
    }
}
