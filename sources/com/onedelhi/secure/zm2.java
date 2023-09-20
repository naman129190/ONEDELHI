package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/zm2;", "", "owner", "", "f", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "a", "d", "b", "()Z", "isLocked", "Lcom/onedelhi/secure/ht3;", "e", "()Lcom/onedelhi/secure/ht3;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface zm2 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.zm2$a */
    public static final class C7507a {
        @xj0(level = ak0.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        /* renamed from: a */
        public static /* synthetic */ void m74187a() {
        }

        /* renamed from: b */
        public static /* synthetic */ Object m74188b(zm2 zm2, Object obj, b80 b80, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return zm2.mo31066c(obj, b80);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m74189c(zm2 zm2, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return zm2.mo31069f(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: d */
        public static /* synthetic */ void m74190d(zm2 zm2, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                zm2.mo31067d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    /* renamed from: a */
    boolean mo31064a(@vr2 Object obj);

    /* renamed from: b */
    boolean mo31065b();

    @ss2
    /* renamed from: c */
    Object mo31066c(@ss2 Object obj, @vr2 b80<? super un4> b80);

    /* renamed from: d */
    void mo31067d(@ss2 Object obj);

    @vr2
    /* renamed from: e */
    ht3<Object, zm2> mo31068e();

    /* renamed from: f */
    boolean mo31069f(@ss2 Object obj);
}
