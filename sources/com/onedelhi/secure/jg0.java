package com.onedelhi.secure;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

public class jg0 extends qq4 {
    /* renamed from: b */
    public static boolean m53340b(h44 h44, h44 h442) {
        return h44.f29453a == h442.f29453a;
    }

    /* renamed from: c */
    public static h44 m53341c(byte[] bArr, int i) throws no4 {
        if (bArr[i] == 0) {
            int i2 = i + 1;
            if ((bArr[i2] & 255) < 16) {
                h44 h44 = new h44();
                h44.f29453a = bArr[i2];
                return h44;
            }
        }
        throw new no4();
    }

    /* renamed from: d */
    public static h44 m53342d(byte[] bArr) throws IOException {
        byte b = bArr[10];
        byte[] bArr2 = zy4.f38506b;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new s90("XZ Stream Footer is corrupt");
        } else if (m53345g(bArr, 4, 6, 0)) {
            try {
                h44 c = m53341c(bArr, 8);
                c.f29454a = 0;
                for (int i = 0; i < 4; i++) {
                    c.f29454a |= (long) ((bArr[i + 4] & 255) << (i * 8));
                }
                c.f29454a = (c.f29454a + 1) * 4;
                return c;
            } catch (no4 unused) {
                throw new no4("Unsupported options in XZ Stream Footer");
            }
        } else {
            throw new s90("XZ Stream Footer is corrupt");
        }
    }

    /* renamed from: e */
    public static h44 m53343e(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = zy4.f38504a;
            if (i < bArr2.length) {
                if (bArr[i] == bArr2[i]) {
                    i++;
                } else {
                    throw new az4();
                }
            } else if (m53345g(bArr, bArr2.length, 2, bArr2.length + 2)) {
                try {
                    return m53341c(bArr, bArr2.length);
                } catch (no4 unused) {
                    throw new no4("Unsupported options in XZ Stream Header");
                }
            } else {
                throw new s90("XZ Stream Header is corrupt");
            }
        }
    }

    /* renamed from: f */
    public static long m53344f(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = (long) (read & 127);
            int i = 0;
            while ((read & 128) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException();
                    } else if (read != 0) {
                        j |= ((long) (read & 127)) << (i * 7);
                    } else {
                        throw new s90();
                    }
                } else {
                    throw new s90();
                }
            }
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: g */
    public static boolean m53345g(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) ((int) (value >>> (i4 * 8)))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }
}
