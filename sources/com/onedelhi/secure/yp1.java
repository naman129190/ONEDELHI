package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

public class yp1 extends wp1 {

    /* renamed from: a */
    public final ArrayList<bq1> f38037a = new ArrayList<>();

    public yp1() {
        super(new bz4("XZ Stream or its Index has grown too big"));
    }

    /* renamed from: a */
    public void mo46813a(long j, long j2) throws bz4 {
        super.mo46813a(j, j2);
        this.f38037a.add(new bq1(j, j2));
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ long mo46815c() {
        return super.mo46815c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ long mo46816d() {
        return super.mo46816d();
    }

    /* renamed from: f */
    public void mo47915f(OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, crc32);
        checkedOutputStream.write(0);
        gu0.m49828b(checkedOutputStream, this.f37070d);
        Iterator<bq1> it = this.f38037a.iterator();
        while (it.hasNext()) {
            bq1 next = it.next();
            gu0.m49828b(checkedOutputStream, next.f26497a);
            gu0.m49828b(checkedOutputStream, next.f26498b);
        }
        for (int b = mo46814b(); b > 0; b--) {
            checkedOutputStream.write(0);
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) ((int) (value >>> (i * 8))));
        }
    }
}
