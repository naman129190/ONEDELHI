package com.onedelhi.secure;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@gz3(version = "1.6")
@tw4(markerClass = {my0.class})
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/lq0;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "b", "()Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public enum lq0 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @vr2

    /* renamed from: a */
    public final TimeUnit f31794a;

    /* access modifiers changed from: public */
    lq0(TimeUnit timeUnit) {
        this.f31794a = timeUnit;
    }

    @vr2
    /* renamed from: b */
    public final TimeUnit mo40210b() {
        return this.f31794a;
    }
}
