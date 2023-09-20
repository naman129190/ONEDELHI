package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/ma1;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "Lcom/onedelhi/secure/me4;", "timeout", "close", "", "toString", "-deprecated_delegate", "()Lcom/onedelhi/secure/oz3;", "delegate", "Lcom/onedelhi/secure/oz3;", "<init>", "(Lcom/onedelhi/secure/oz3;)V", "okio"}, k = 1, mv = {1, 4, 0})
public abstract class ma1 implements oz3 {
    @vr2
    private final oz3 delegate;

    public ma1(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "delegate");
        this.delegate = oz3;
    }

    @uw1(name = "-deprecated_delegate")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "delegate", imports = {}))
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final oz3 m74745deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @uw1(name = "delegate")
    @vr2
    public final oz3 delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    @vr2
    public me4 timeout() {
        return this.delegate.timeout();
    }

    @vr2
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "source");
        this.delegate.write(noVar, j);
    }
}
