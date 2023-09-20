package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class zp1 extends wp1 {

    /* renamed from: a */
    public C5853jx f38403a;

    public zp1() {
        super(new s90());
        try {
            this.f38403a = new so3();
        } catch (NoSuchAlgorithmException unused) {
            this.f38403a = new C4590as();
        }
    }

    /* renamed from: a */
    public void mo46813a(long j, long j2) throws bz4 {
        super.mo46813a(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        this.f38403a.mo38919e(allocate.array());
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
    public void mo48423f(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        int i = 0;
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (jg0.m53344f(checkedInputStream) == this.f37070d) {
            zp1 zp1 = new zp1();
            long j = 0;
            while (j < this.f37070d) {
                try {
                    zp1.mo46813a(jg0.m53344f(checkedInputStream), jg0.m53344f(checkedInputStream));
                    if (zp1.f37066a > this.f37066a || zp1.f37068b > this.f37068b || zp1.f37069c > this.f37069c) {
                        throw new s90("XZ Index is corrupt");
                    }
                    j++;
                } catch (bz4 unused) {
                    throw new s90("XZ Index is corrupt");
                }
            }
            if (zp1.f37066a == this.f37066a && zp1.f37068b == this.f37068b && zp1.f37069c == this.f37069c && Arrays.equals(zp1.f38403a.mo31122a(), this.f38403a.mo31122a())) {
                DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
                int b = mo46814b();
                while (b > 0) {
                    if (dataInputStream.readUnsignedByte() == 0) {
                        b--;
                    } else {
                        throw new s90("XZ Index is corrupt");
                    }
                }
                long value = crc32.getValue();
                while (i < 4) {
                    if (((value >>> (i * 8)) & 255) == ((long) dataInputStream.readUnsignedByte())) {
                        i++;
                    } else {
                        throw new s90("XZ Index is corrupt");
                    }
                }
                return;
            }
            throw new s90("XZ Index is corrupt");
        }
        throw new s90("XZ Block Header or the start of XZ Index is corrupt");
    }
}
