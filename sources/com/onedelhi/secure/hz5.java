package com.onedelhi.secure;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class hz5 {
    @mj1("sharedStringBuilder")

    /* renamed from: a */
    public static final StringBuilder f13382a = new StringBuilder(33);

    /* renamed from: a */
    public static final SimpleDateFormat f13383a;

    /* renamed from: b */
    public static final SimpleDateFormat f13384b;

    static {
        Locale locale = Locale.ROOT;
        f13383a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f13384b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
    }

    /* renamed from: a */
    public static String m17064a(long j) {
        String sb;
        StringBuilder sb2 = f13382a;
        synchronized (sb2) {
            sb2.setLength(0);
            m17065b(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: b */
    public static void m17065b(long j, StringBuilder sb) {
        String str;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            str = "0s";
        } else {
            sb.ensureCapacity(sb.length() + 27);
            boolean z = false;
            if (i < 0) {
                sb.append("-");
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    j = Long.MAX_VALUE;
                    z = true;
                }
            }
            if (j >= pr3.f18684a) {
                sb.append(j / pr3.f18684a);
                sb.append(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);
                j %= pr3.f18684a;
            }
            if (true == z) {
                j = 25975808;
            }
            if (j >= 3600000) {
                sb.append(j / 3600000);
                sb.append("h");
                j %= 3600000;
            }
            if (j >= jg3.f30769e) {
                sb.append(j / jg3.f30769e);
                sb.append(by2.f10023b);
                j %= jg3.f30769e;
            }
            if (j >= 1000) {
                sb.append(j / 1000);
                sb.append("s");
                j %= 1000;
            }
            if (j > 0) {
                sb.append(j);
                str = "ms";
            } else {
                return;
            }
        }
        sb.append(str);
    }
}
