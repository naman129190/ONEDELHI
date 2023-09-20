package com.onedelhi.secure;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/lq0;", "", "h", "shortName", "g", "", "isoChar", "", "isTimeComponent", "f", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/time/DurationUnitKt")
public class oq0 extends nq0 {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.oq0$a */
    public /* synthetic */ class C6300a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33164a;

        static {
            int[] iArr = new int[lq0.values().length];
            iArr[lq0.NANOSECONDS.ordinal()] = 1;
            iArr[lq0.MICROSECONDS.ordinal()] = 2;
            iArr[lq0.MILLISECONDS.ordinal()] = 3;
            iArr[lq0.SECONDS.ordinal()] = 4;
            iArr[lq0.MINUTES.ordinal()] = 5;
            iArr[lq0.HOURS.ordinal()] = 6;
            iArr[lq0.DAYS.ordinal()] = 7;
            f33164a = iArr;
        }
    }

    @gz3(version = "1.5")
    @vr2
    /* renamed from: f */
    public static final lq0 m59609f(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return lq0.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return lq0.HOURS;
        } else {
            if (c == 'M') {
                return lq0.MINUTES;
            }
            if (c == 'S') {
                return lq0.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    @gz3(version = "1.5")
    @vr2
    /* renamed from: g */
    public static final lq0 m59610g(@vr2 String str) {
        jt1.m53777p(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return lq0.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return lq0.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return lq0.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return lq0.SECONDS;
                    }
                } else if (str.equals(by2.f10023b)) {
                    return lq0.MINUTES;
                }
            } else if (str.equals("h")) {
                return lq0.HOURS;
            }
        } else if (str.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
            return lq0.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: h */
    public static final String m59611h(@vr2 lq0 lq0) {
        jt1.m53777p(lq0, "<this>");
        switch (C6300a.f33164a[lq0.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return by2.f10023b;
            case 6:
                return "h";
            case 7:
                return GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
            default:
                throw new IllegalStateException(("Unknown unit: " + lq0).toString());
        }
    }
}
