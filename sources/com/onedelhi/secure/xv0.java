package com.onedelhi.secure;

import com.onedelhi.secure.wv0;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/xv0;", "Lcom/onedelhi/secure/vv0;", "Lcom/onedelhi/secure/un4;", "G1", "", "now", "Lcom/onedelhi/secure/wv0$c;", "delayedTask", "E1", "Ljava/lang/Thread;", "D1", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class xv0 extends vv0 {
    @vr2
    /* renamed from: D1 */
    public abstract Thread mo36144D1();

    /* renamed from: E1 */
    public void mo47396E1(long j, @vr2 wv0.C7189c cVar) {
        zg0.f38333a.mo46887b2(j, cVar);
    }

    /* renamed from: G1 */
    public final void mo47397G1() {
        un4 un4;
        Thread D1 = mo36144D1();
        if (Thread.currentThread() != D1) {
            C6357p1 b = C6492q1.m61804b();
            if (b == null) {
                un4 = null;
            } else {
                b.mo42352g(D1);
                un4 = un4.f36206a;
            }
            if (un4 == null) {
                LockSupport.unpark(D1);
            }
        }
    }
}
