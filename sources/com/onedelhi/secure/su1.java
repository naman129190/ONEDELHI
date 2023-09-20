package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/su1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lcom/onedelhi/secure/x80;", "", "fillInStackTrace", "b", "", "toString", "", "other", "", "equals", "", "hashCode", "message", "cause", "Lcom/onedelhi/secure/ru1;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/onedelhi/secure/ru1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class su1 extends CancellationException implements x80<su1> {
    @rw1
    @vr2

    /* renamed from: a */
    public final ru1 f35196a;

    public su1(@vr2 String str, @ss2 Throwable th, @vr2 ru1 ru1) {
        super(str);
        this.f35196a = ru1;
        if (th != null) {
            initCause(th);
        }
    }

    @ss2
    /* renamed from: b */
    public su1 mo41021a() {
        return null;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj != this) {
            if (obj instanceof su1) {
                su1 su1 = (su1) obj;
                if (!jt1.m53768g(su1.getMessage(), getMessage()) || !jt1.m53768g(su1.f35196a, this.f35196a) || !jt1.m53768g(su1.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @vr2
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        jt1.m53774m(message);
        int hashCode = ((message.hashCode() * 31) + this.f35196a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @vr2
    public String toString() {
        return super.toString() + "; job=" + this.f35196a;
    }
}
