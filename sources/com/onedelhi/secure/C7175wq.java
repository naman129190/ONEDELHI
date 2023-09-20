package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.onedelhi.secure.wq */
public final class C7175wq {

    /* renamed from: a */
    public static final float f37080a = 0.5f;

    /* renamed from: a */
    public static final int f37081a = 1024;

    /* renamed from: a */
    public static final long f37082a;

    /* renamed from: a */
    public static final Class<?> f37083a;

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f37084a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int f37085b = 16384;

    static {
        Class<?> f = m69536f("java.io.FileOutputStream");
        f37083a = f;
        f37082a = m69533c(f);
    }

    /* renamed from: a */
    public static void m69531a() {
        f37084a.set((Object) null);
    }

    /* renamed from: b */
    public static byte[] m69532b() {
        SoftReference softReference = f37084a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: c */
    public static long m69533c(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (ko4.m54683U()) {
                return ko4.m54688Z(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static byte[] m69534d(int i) {
        int max = Math.max(i, 1024);
        byte[] b = m69532b();
        if (b == null || m69535e(max, b.length)) {
            b = new byte[max];
            if (max <= 16384) {
                m69537g(b);
            }
        }
        return b;
    }

    /* renamed from: e */
    public static boolean m69535e(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: f */
    public static Class<?> m69536f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m69537g(byte[] bArr) {
        f37084a.set(new SoftReference(bArr));
    }

    /* renamed from: h */
    public static void m69538h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m69539i(byteBuffer, outputStream)) {
                byte[] d = m69534d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), d.length);
                    byteBuffer.get(d, 0, min);
                    outputStream.write(d, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    /* renamed from: i */
    public static boolean m69539i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j = f37082a;
        if (j < 0 || !f37083a.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) ko4.m54679Q(outputStream, j);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
