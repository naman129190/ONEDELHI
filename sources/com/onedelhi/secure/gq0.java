package com.onedelhi.secure;

import java.time.Duration;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"Ljava/time/Duration;", "Lcom/onedelhi/secure/fq0;", "b", "(Ljava/time/Duration;)J", "a", "(J)Ljava/time/Duration;", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.time")
@uw1(name = "DurationConversionsJDK8Kt")
public final class gq0 {
    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    @xq1
    /* renamed from: a */
    public static final Duration m49622a(long j) {
        Duration ofSeconds = Duration.ofSeconds(fq0.m48256W(j), (long) fq0.m48261a0(j));
        jt1.m53776o(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    @xq1
    /* renamed from: b */
    public static final long m49623b(Duration duration) {
        jt1.m53777p(duration, "<this>");
        return fq0.m48279o0(iq0.m52557n0(duration.getSeconds(), lq0.SECONDS), iq0.m52555m0(duration.getNano(), lq0.NANOSECONDS));
    }
}
