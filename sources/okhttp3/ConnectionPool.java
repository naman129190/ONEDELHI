package okhttp3;

import com.onedelhi.secure.fa4;
import com.onedelhi.secure.gg3;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lokhttp3/ConnectionPool;", "", "", "idleConnectionCount", "connectionCount", "Lcom/onedelhi/secure/un4;", "evictAll", "Lcom/onedelhi/secure/gg3;", "delegate", "Lcom/onedelhi/secure/gg3;", "getDelegate$okhttp", "()Lcom/onedelhi/secure/gg3;", "<init>", "(Lcom/onedelhi/secure/gg3;)V", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ConnectionPool {
    @vr2
    private final gg3 delegate;

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, @vr2 TimeUnit timeUnit) {
        this(new gg3(fa4.f28227a, i, j, timeUnit));
        jt1.m53777p(timeUnit, "timeUnit");
    }

    public ConnectionPool(@vr2 gg3 gg3) {
        jt1.m53777p(gg3, "delegate");
        this.delegate = gg3;
    }

    public final int connectionCount() {
        return this.delegate.mo36735d();
    }

    public final void evictAll() {
        this.delegate.mo36736e();
    }

    @vr2
    public final gg3 getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.mo36737f();
    }
}
