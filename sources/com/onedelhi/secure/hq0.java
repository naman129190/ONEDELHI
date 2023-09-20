package com.onedelhi.secure;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\n\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "decimals", "Ljava/text/DecimalFormat;", "a", "", "value", "", "b", "c", "", "durationAssertionsEnabled", "Z", "d", "()Z", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class hq0 {

    /* renamed from: a */
    public static final boolean f29734a = false;
    @vr2

    /* renamed from: a */
    public static final ThreadLocal<DecimalFormat>[] f29735a;

    static {
        Class<fq0> cls = fq0.class;
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f29735a = threadLocalArr;
    }

    /* renamed from: a */
    public static final DecimalFormat m50747a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat(qa0.f34045b);
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @vr2
    /* renamed from: b */
    public static final String m50748b(double d, int i) {
        DecimalFormat decimalFormat;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f29735a;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormat2 = threadLocal.get();
            if (decimalFormat2 == null) {
                decimalFormat2 = m50747a(i);
                threadLocal.set(decimalFormat2);
            } else {
                jt1.m53776o(decimalFormat2, "get() ?: default().also(this::set)");
            }
            decimalFormat = decimalFormat2;
        } else {
            decimalFormat = m50747a(i);
        }
        String format = decimalFormat.format(d);
        jt1.m53776o(format, "format.format(value)");
        return format;
    }

    @vr2
    /* renamed from: c */
    public static final String m50749c(double d, int i) {
        DecimalFormat a = m50747a(0);
        a.setMaximumFractionDigits(i);
        String format = a.format(d);
        jt1.m53776o(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    /* renamed from: d */
    public static final boolean m50750d() {
        return f29734a;
    }
}
