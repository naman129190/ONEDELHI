package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/onedelhi/secure/v94;", "", "", "f", "Lcom/onedelhi/secure/ea4;", "queue", "Lcom/onedelhi/secure/un4;", "e", "(Lcom/onedelhi/secure/ea4;)V", "", "toString", "Lcom/onedelhi/secure/ea4;", "d", "()Lcom/onedelhi/secure/ea4;", "h", "nextExecuteNanoTime", "J", "c", "()J", "g", "(J)V", "name", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "cancelable", "Z", "a", "()Z", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class v94 {

    /* renamed from: a */
    public long f36463a;
    @ss2

    /* renamed from: a */
    public ea4 f36464a;
    @vr2

    /* renamed from: a */
    public final String f36465a;

    /* renamed from: a */
    public final boolean f36466a;

    public v94(@vr2 String str, boolean z) {
        jt1.m53777p(str, "name");
        this.f36465a = str;
        this.f36466a = z;
        this.f36463a = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v94(String str, boolean z, int i, wg0 wg0) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* renamed from: a */
    public final boolean mo46052a() {
        return this.f36466a;
    }

    @vr2
    /* renamed from: b */
    public final String mo46053b() {
        return this.f36465a;
    }

    /* renamed from: c */
    public final long mo46054c() {
        return this.f36463a;
    }

    @ss2
    /* renamed from: d */
    public final ea4 mo46055d() {
        return this.f36464a;
    }

    /* renamed from: e */
    public final void mo46056e(@vr2 ea4 ea4) {
        jt1.m53777p(ea4, "queue");
        ea4 ea42 = this.f36464a;
        if (ea42 != ea4) {
            if (ea42 == null) {
                this.f36464a = ea4;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* renamed from: f */
    public abstract long mo33844f();

    /* renamed from: g */
    public final void mo46057g(long j) {
        this.f36463a = j;
    }

    /* renamed from: h */
    public final void mo46058h(@ss2 ea4 ea4) {
        this.f36464a = ea4;
    }

    @vr2
    public String toString() {
        return this.f36465a;
    }
}
