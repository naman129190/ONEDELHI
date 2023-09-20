package com.onedelhi.secure;

import com.onedelhi.secure.de4;
import kotlin.Metadata;

@gz3(version = "1.3")
@my0
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0015\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0002\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/wk2;", "Lcom/onedelhi/secure/de4;", "", "toString", "Lcom/onedelhi/secure/de4$b$a;", "d", "()J", "timeMark", "Lcom/onedelhi/secure/fq0;", "c", "(J)J", "duration", "b", "(JJ)J", "", "e", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class wk2 implements de4 {

    /* renamed from: a */
    public static final long f37008a = System.nanoTime();
    @vr2

    /* renamed from: a */
    public static final wk2 f37009a = new wk2();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ rd4 mo34354a() {
        return de4.C5015b.C5016a.m45042f(mo46763d());
    }

    /* renamed from: b */
    public final long mo46761b(long j, long j2) {
        return de4.C5015b.C5016a.m45043g(ea2.m46191b(j, j2));
    }

    /* renamed from: c */
    public final long mo46762c(long j) {
        return ea2.m46193d(mo46764e(), j);
    }

    /* renamed from: d */
    public long mo46763d() {
        return de4.C5015b.C5016a.m45043g(mo46764e());
    }

    /* renamed from: e */
    public final long mo46764e() {
        return System.nanoTime() - f37008a;
    }

    @vr2
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
