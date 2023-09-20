package com.onedelhi.secure;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0007\u001a \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0001\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0001\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0001¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/lq0;", "Ljava/util/concurrent/TimeUnit;", "e", "d", "", "value", "sourceUnit", "targetUnit", "a", "", "c", "b", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/time/DurationUnitKt")
public class nq0 {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.nq0$a */
    public /* synthetic */ class C6221a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32720a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            iArr[TimeUnit.SECONDS.ordinal()] = 4;
            iArr[TimeUnit.MINUTES.ordinal()] = 5;
            iArr[TimeUnit.HOURS.ordinal()] = 6;
            iArr[TimeUnit.DAYS.ordinal()] = 7;
            f32720a = iArr;
        }
    }

    @gz3(version = "1.3")
    /* renamed from: a */
    public static final double m58658a(double d, @vr2 lq0 lq0, @vr2 lq0 lq02) {
        jt1.m53777p(lq0, "sourceUnit");
        jt1.m53777p(lq02, "targetUnit");
        long convert = lq02.mo40210b().convert(1, lq0.mo40210b());
        return convert > 0 ? d * ((double) convert) : d / ((double) lq0.mo40210b().convert(1, lq02.mo40210b()));
    }

    @gz3(version = "1.5")
    /* renamed from: b */
    public static final long m58659b(long j, @vr2 lq0 lq0, @vr2 lq0 lq02) {
        jt1.m53777p(lq0, "sourceUnit");
        jt1.m53777p(lq02, "targetUnit");
        return lq02.mo40210b().convert(j, lq0.mo40210b());
    }

    @gz3(version = "1.5")
    /* renamed from: c */
    public static final long m58660c(long j, @vr2 lq0 lq0, @vr2 lq0 lq02) {
        jt1.m53777p(lq0, "sourceUnit");
        jt1.m53777p(lq02, "targetUnit");
        return lq02.mo40210b().convert(j, lq0.mo40210b());
    }

    @gz3(version = "1.6")
    @my0
    @vr2
    /* renamed from: d */
    public static final lq0 m58661d(@vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "<this>");
        switch (C6221a.f32720a[timeUnit.ordinal()]) {
            case 1:
                return lq0.NANOSECONDS;
            case 2:
                return lq0.MICROSECONDS;
            case 3:
                return lq0.MILLISECONDS;
            case 4:
                return lq0.SECONDS;
            case 5:
                return lq0.MINUTES;
            case 6:
                return lq0.HOURS;
            case 7:
                return lq0.DAYS;
            default:
                throw new gr2();
        }
    }

    @gz3(version = "1.6")
    @my0
    @vr2
    /* renamed from: e */
    public static final TimeUnit m58662e(@vr2 lq0 lq0) {
        jt1.m53777p(lq0, "<this>");
        return lq0.mo40210b();
    }
}
