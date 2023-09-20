package com.onedelhi.secure;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/onedelhi/secure/kf0;", "Ljava/io/Serializable;", "", "coroutineId", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "f", "state", "h", "lastObservedThreadState", "e", "lastObservedThreadName", "d", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "c", "()Ljava/util/List;", "sequenceNumber", "J", "g", "()J", "Lcom/onedelhi/secure/xe0;", "source", "Lcom/onedelhi/secure/b90;", "context", "<init>", "(Lcom/onedelhi/secure/xe0;Lcom/onedelhi/secure/b90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@z73
public final class kf0 implements Serializable {
    @ss2

    /* renamed from: a */
    public final Long f31192a;
    @vr2

    /* renamed from: a */
    public final List<StackTraceElement> f31193a;

    /* renamed from: b */
    public final long f31194b;
    @ss2

    /* renamed from: b */
    public final String f31195b;
    @ss2

    /* renamed from: c */
    public final String f31196c;
    @vr2

    /* renamed from: d */
    public final String f31197d;
    @ss2

    /* renamed from: e */
    public final String f31198e;
    @ss2

    /* renamed from: f */
    public final String f31199f;

    public kf0(@vr2 xe0 xe0, @vr2 b90 b90) {
        Thread.State state;
        i90 i90 = (i90) b90.get(i90.f30122a);
        String str = null;
        this.f31192a = i90 == null ? null : Long.valueOf(i90.mo37903V0());
        f80 f80 = (f80) b90.get(f80.f28189a);
        this.f31195b = f80 == null ? null : f80.toString();
        j90 j90 = (j90) b90.get(j90.f30592a);
        this.f31196c = j90 == null ? null : j90.mo38462V0();
        this.f31197d = xe0.mo47133g();
        Thread thread = xe0.f37391a;
        this.f31198e = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = xe0.f37391a;
        this.f31199f = thread2 != null ? thread2.getName() : str;
        this.f31193a = xe0.mo47134h();
        this.f31194b = xe0.f37388a;
    }

    @ss2
    /* renamed from: a */
    public final Long mo39222a() {
        return this.f31192a;
    }

    @ss2
    /* renamed from: b */
    public final String mo39223b() {
        return this.f31195b;
    }

    @vr2
    /* renamed from: c */
    public final List<StackTraceElement> mo39224c() {
        return this.f31193a;
    }

    @ss2
    /* renamed from: d */
    public final String mo39225d() {
        return this.f31199f;
    }

    @ss2
    /* renamed from: e */
    public final String mo39226e() {
        return this.f31198e;
    }

    @ss2
    /* renamed from: f */
    public final String mo39227f() {
        return this.f31196c;
    }

    /* renamed from: g */
    public final long mo39228g() {
        return this.f31194b;
    }

    @vr2
    /* renamed from: h */
    public final String mo39229h() {
        return this.f31197d;
    }
}
