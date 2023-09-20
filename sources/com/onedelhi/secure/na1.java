package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/na1;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "", "toString", "-deprecated_delegate", "()Lcom/onedelhi/secure/x04;", "delegate", "Lcom/onedelhi/secure/x04;", "<init>", "(Lcom/onedelhi/secure/x04;)V", "okio"}, k = 1, mv = {1, 4, 0})
public abstract class na1 implements x04 {
    @vr2
    private final x04 delegate;

    public na1(@vr2 x04 x04) {
        jt1.m53777p(x04, "delegate");
        this.delegate = x04;
    }

    @uw1(name = "-deprecated_delegate")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "delegate", imports = {}))
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final x04 m74746deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @uw1(name = "delegate")
    @vr2
    public final x04 delegate() {
        return this.delegate;
    }

    public long read(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "sink");
        return this.delegate.read(noVar, j);
    }

    @vr2
    public me4 timeout() {
        return this.delegate.timeout();
    }

    @vr2
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
