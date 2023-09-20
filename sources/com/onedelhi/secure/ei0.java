package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/ei0;", "", "", "time", "Lcom/onedelhi/secure/un4;", "P0", "(JLcom/onedelhi/secure/b80;)Ljava/lang/Object;", "timeMillis", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/fn0;", "M0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
public interface ei0 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.ei0$a */
    public static final class C5156a {
        @ss2
        @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        /* renamed from: a */
        public static Object m46892a(@vr2 ei0 ei0, long j, @vr2 b80<? super un4> b80) {
            if (j <= 0) {
                return un4.f36206a;
            }
            C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
            juVar.mo38234T();
            ei0.mo31904Z(j, juVar);
            Object A = juVar.mo38880A();
            if (A == mt1.m57558h()) {
                hf0.m50483c(b80);
            }
            return A == mt1.m57558h() ? A : un4.f36206a;
        }

        @vr2
        /* renamed from: b */
        public static fn0 m46893b(@vr2 ei0 ei0, long j, @vr2 Runnable runnable, @vr2 b90 b90) {
            return ah0.m38670a().mo31901M0(j, runnable, b90);
        }
    }

    @vr2
    /* renamed from: M0 */
    fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90);

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    /* renamed from: P0 */
    Object mo33767P0(long j, @vr2 b80<? super un4> b80);

    /* renamed from: Z */
    void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar);
}
