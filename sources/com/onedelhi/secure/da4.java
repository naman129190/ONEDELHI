package com.onedelhi.secure;

import com.onedelhi.secure.mb1;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/v94;", "task", "Lcom/onedelhi/secure/ea4;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lcom/onedelhi/secure/un4;", "e", "T", "block", "d", "(Lcom/onedelhi/secure/v94;Lcom/onedelhi/secure/ea4;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "message", "c", "", "ns", "b", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class da4 {
    @vr2
    /* renamed from: b */
    public static final String m44953b(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        StringBuilder sb2;
        long j4;
        if (j <= ((long) -999500000)) {
            sb = new StringBuilder();
            j2 = j - ((long) 500000000);
        } else {
            if (j <= ((long) -999500)) {
                sb = new StringBuilder();
                j3 = j - ((long) mb1.C2849a.f16043c);
            } else {
                if (j <= 0) {
                    sb2 = new StringBuilder();
                    j4 = j - ((long) 500);
                } else if (j < ((long) 999500)) {
                    sb2 = new StringBuilder();
                    j4 = j + ((long) 500);
                } else if (j < ((long) 999500000)) {
                    j3 = j + ((long) mb1.C2849a.f16043c);
                } else {
                    sb = new StringBuilder();
                    j2 = j + ((long) 500000000);
                }
                sb2.append(j4 / ((long) 1000));
                sb2.append(" µs");
                String sb3 = sb2.toString();
                x44 x44 = x44.f37329a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3}, 1));
                jt1.m53776o(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb2.append(j3 / ((long) 1000000));
            sb2.append(" ms");
            String sb32 = sb2.toString();
            x44 x442 = x44.f37329a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb32}, 1));
            jt1.m53776o(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb2.append(j2 / ((long) 1000000000));
        sb2.append(" s ");
        String sb322 = sb2.toString();
        x44 x4422 = x44.f37329a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb322}, 1));
        jt1.m53776o(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* renamed from: c */
    public static final void m44954c(v94 v94, ea4 ea4, String str) {
        Logger a = fa4.f28226a.mo35819a();
        StringBuilder sb = new StringBuilder();
        sb.append(ea4.mo34993h());
        sb.append(' ');
        x44 x44 = x44.f37329a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        jt1.m53776o(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(v94.mo46053b());
        a.fine(sb.toString());
    }

    /* renamed from: d */
    public static final <T> T m44955d(@vr2 v94 v94, @vr2 ea4 ea4, @vr2 cc1<? extends T> cc1) {
        long j;
        jt1.m53777p(v94, "task");
        jt1.m53777p(ea4, "queue");
        jt1.m53777p(cc1, "block");
        boolean isLoggable = fa4.f28226a.mo35819a().isLoggable(Level.FINE);
        if (isLoggable) {
            j = ea4.mo34996k().mo35810h().nanoTime();
            m44954c(v94, ea4, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = cc1.invoke();
            uq1.m67403d(1);
            if (isLoggable) {
                m44954c(v94, ea4, "finished run in " + m44953b(ea4.mo34996k().mo35810h().nanoTime() - j));
            }
            uq1.m67402c(1);
            return invoke;
        } catch (Throwable th) {
            uq1.m67403d(1);
            if (isLoggable) {
                m44954c(v94, ea4, "failed a run in " + m44953b(ea4.mo34996k().mo35810h().nanoTime() - j));
            }
            uq1.m67402c(1);
            throw th;
        }
    }

    /* renamed from: e */
    public static final void m44956e(@vr2 v94 v94, @vr2 ea4 ea4, @vr2 cc1<String> cc1) {
        jt1.m53777p(v94, "task");
        jt1.m53777p(ea4, "queue");
        jt1.m53777p(cc1, "messageBlock");
        if (fa4.f28226a.mo35819a().isLoggable(Level.FINE)) {
            m44954c(v94, ea4, cc1.invoke());
        }
    }
}
