package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

public class gu0 extends qq4 {
    /* renamed from: b */
    public static void m49828b(OutputStream outputStream, long j) throws IOException {
        while (j >= 128) {
            outputStream.write((byte) ((int) (128 | j)));
            j >>>= 7;
        }
        outputStream.write((byte) ((int) j));
    }

    /* renamed from: c */
    public static void m49829c(OutputStream outputStream, byte[] bArr) throws IOException {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) ((int) (value >>> (i * 8))));
        }
    }
}
