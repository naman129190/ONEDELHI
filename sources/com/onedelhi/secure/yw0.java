package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/yw0;", "Lcom/onedelhi/secure/e90;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/un4;", "close", "Ljava/util/concurrent/Executor;", "c1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class yw0 extends e90 implements Closeable {
    @vr2

    /* renamed from: a */
    public static final C7393a f38081a = new C7393a((wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/yw0$a;", "Lcom/onedelhi/secure/n0;", "Lcom/onedelhi/secure/e90;", "Lcom/onedelhi/secure/yw0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @ly0
    /* renamed from: com.onedelhi.secure.yw0$a */
    public static final class C7393a extends C6161n0<e90, yw0> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/onedelhi/secure/b90$b;", "it", "Lcom/onedelhi/secure/yw0;", "a", "(Lcom/onedelhi/secure/b90$b;)Lcom/onedelhi/secure/yw0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.yw0$a$a */
        public static final class C7394a extends d12 implements ec1<b90.C4634b, yw0> {

            /* renamed from: a */
            public static final C7394a f38082a = new C7394a();

            public C7394a() {
                super(1);
            }

            @ss2
            /* renamed from: a */
            public final yw0 mo17094X(@vr2 b90.C4634b bVar) {
                if (bVar instanceof yw0) {
                    return (yw0) bVar;
                }
                return null;
            }
        }

        public C7393a() {
            super(e90.f27717a, C7394a.f38082a);
        }

        public /* synthetic */ C7393a(wg0 wg0) {
            this();
        }
    }

    @vr2
    /* renamed from: c1 */
    public abstract Executor mo35656c1();

    public abstract void close();
}
