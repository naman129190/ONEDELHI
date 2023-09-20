package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000*\u001e\b\u0002\u0010\u0007\u001a\u0004\b\u0000\u0010\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0012\u0004\u0012\u00028\u00000\u0006¨\u0006\b"}, d2 = {"", "timeMillis", "d", "timeNanos", "c", "T", "Lcom/onedelhi/secure/o82;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class zv0 {

    /* renamed from: a */
    public static final int f38453a = 0;

    /* renamed from: a */
    public static final long f38454a = 1000000;
    @vr2

    /* renamed from: a */
    public static final l84 f38455a = new l84("REMOVED_TASK");

    /* renamed from: b */
    public static final int f38456b = 1;

    /* renamed from: b */
    public static final long f38457b = 9223372036854L;
    @vr2

    /* renamed from: b */
    public static final l84 f38458b = new l84("CLOSED_EMPTY");

    /* renamed from: c */
    public static final int f38459c = 2;

    /* renamed from: c */
    public static final long f38460c = 4611686018427387903L;

    /* renamed from: c */
    public static final long m74357c(long j) {
        return j / f38454a;
    }

    /* renamed from: d */
    public static final long m74358d(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= f38457b) {
            return Long.MAX_VALUE;
        }
        return f38454a * j;
    }

    /* renamed from: e */
    public static /* synthetic */ void m74359e() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m74360f() {
    }
}
