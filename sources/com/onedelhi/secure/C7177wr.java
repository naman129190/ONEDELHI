package com.onedelhi.secure;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.onedelhi.secure.wr */
public class C7177wr {

    /* renamed from: a */
    public static String f37093a;

    /* renamed from: a */
    public static final AtomicLong f37094a = new AtomicLong(0);

    public C7177wr(lo1 lo1) {
        byte[] bArr = new byte[10];
        mo46832e(bArr);
        mo46831d(bArr);
        mo46830c(bArr);
        String G = u10.m66352G(lo1.mo38197a());
        String y = u10.m66378y(bArr);
        Locale locale = Locale.US;
        f37093a = String.format(locale, "%s%s%s%s", new Object[]{y.substring(0, 12), y.substring(12, 16), y.subSequence(16, 20), G.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m69563a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m69564b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void mo46830c(byte[] bArr) {
        byte[] b = m69564b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    public final void mo46831d(byte[] bArr) {
        byte[] b = m69564b(f37094a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    public final void mo46832e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m69563a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m69564b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f37093a;
    }
}
