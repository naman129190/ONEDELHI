package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/i32;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "", "d", "", "endOfInput", "", "b", "a", "nBytes", "nChars", "c", "Lcom/onedelhi/secure/un4;", "g", "e", "f", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class i32 {

    /* renamed from: a */
    public static final int f30063a = 32;
    @vr2

    /* renamed from: a */
    public static final i32 f30064a = new i32();
    @vr2

    /* renamed from: a */
    public static final StringBuilder f30065a = new StringBuilder();
    @vr2

    /* renamed from: a */
    public static final ByteBuffer f30066a;
    @vr2

    /* renamed from: a */
    public static final CharBuffer f30067a;

    /* renamed from: a */
    public static CharsetDecoder f30068a;

    /* renamed from: a */
    public static boolean f30069a;
    @vr2

    /* renamed from: a */
    public static final byte[] f30070a;
    @vr2

    /* renamed from: a */
    public static final char[] f30071a;

    static {
        byte[] bArr = new byte[32];
        f30070a = bArr;
        char[] cArr = new char[32];
        f30071a = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        jt1.m53776o(wrap, "wrap(bytes)");
        f30066a = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        jt1.m53776o(wrap2, "wrap(chars)");
        f30067a = wrap2;
    }

    /* renamed from: a */
    public final int mo37825a() {
        ByteBuffer byteBuffer = f30066a;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    /* renamed from: b */
    public final int mo37826b(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = f30068a;
            if (charsetDecoder == null) {
                jt1.m53761S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f30066a;
            CharBuffer charBuffer = f30067a;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            jt1.m53776o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                mo37829e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f30065a;
            char[] cArr = f30071a;
            int i = position - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    /* renamed from: c */
    public final int mo37827c(int i, int i2) {
        ByteBuffer byteBuffer = f30066a;
        byteBuffer.limit(i);
        f30067a.position(i2);
        int b = mo37826b(true);
        CharsetDecoder charsetDecoder = f30068a;
        if (charsetDecoder == null) {
            jt1.m53761S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (f30065a.length() != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r11 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r2 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11 = mo37827c(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (com.onedelhi.secure.jt1.m53768g(r0.charset(), r12) == false) goto L_0x0022;
     */
    @com.onedelhi.secure.ss2
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo37828d(@com.onedelhi.secure.vr2 java.io.InputStream r11, @com.onedelhi.secure.vr2 java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            com.onedelhi.secure.jt1.m53777p(r11, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "charset"
            com.onedelhi.secure.jt1.m53777p(r12, r0)     // Catch:{ all -> 0x00c9 }
            java.nio.charset.CharsetDecoder r0 = f30068a     // Catch:{ all -> 0x00c9 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "decoder"
            com.onedelhi.secure.jt1.m53761S(r0)     // Catch:{ all -> 0x00c9 }
            r0 = r1
        L_0x0018:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x00c9 }
            boolean r0 = com.onedelhi.secure.jt1.m53768g(r0, r12)     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            r10.mo37831g(r12)     // Catch:{ all -> 0x00c9 }
        L_0x0025:
            r12 = 0
            r0 = 0
            r2 = 0
        L_0x0028:
            int r3 = r11.read()     // Catch:{ all -> 0x00c9 }
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L_0x004c
            java.lang.StringBuilder r11 = f30065a     // Catch:{ all -> 0x00c9 }
            int r11 = r11.length()     // Catch:{ all -> 0x00c9 }
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            if (r11 == 0) goto L_0x0047
            if (r0 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            monitor-exit(r10)
            return r1
        L_0x0047:
            int r11 = r10.mo37827c(r0, r2)     // Catch:{ all -> 0x00c9 }
            goto L_0x007a
        L_0x004c:
            byte[] r6 = f30070a     // Catch:{ all -> 0x00c9 }
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch:{ all -> 0x00c9 }
            r6[r0] = r9     // Catch:{ all -> 0x00c9 }
            if (r3 == r5) goto L_0x005e
            if (r8 == r4) goto L_0x005e
            boolean r0 = f30069a     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = r8
            goto L_0x0028
        L_0x005e:
            java.nio.ByteBuffer r0 = f30066a     // Catch:{ all -> 0x00c9 }
            r0.limit(r8)     // Catch:{ all -> 0x00c9 }
            java.nio.CharBuffer r3 = f30067a     // Catch:{ all -> 0x00c9 }
            r3.position(r2)     // Catch:{ all -> 0x00c9 }
            int r2 = r10.mo37826b(r12)     // Catch:{ all -> 0x00c9 }
            if (r2 <= 0) goto L_0x00c3
            char[] r3 = f30071a     // Catch:{ all -> 0x00c9 }
            int r6 = r2 + -1
            char r3 = r3[r6]     // Catch:{ all -> 0x00c9 }
            if (r3 != r5) goto L_0x00c3
            r0.position(r12)     // Catch:{ all -> 0x00c9 }
            r11 = r2
        L_0x007a:
            if (r11 <= 0) goto L_0x0092
            char[] r0 = f30071a     // Catch:{ all -> 0x00c9 }
            int r1 = r11 + -1
            char r1 = r0[r1]     // Catch:{ all -> 0x00c9 }
            if (r1 != r5) goto L_0x0092
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x0092
            int r1 = r11 + -1
            char r0 = r0[r1]     // Catch:{ all -> 0x00c9 }
            r1 = 13
            if (r0 != r1) goto L_0x0092
            int r11 = r11 + -1
        L_0x0092:
            java.lang.StringBuilder r0 = f30065a     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r7 = 0
        L_0x009c:
            if (r7 == 0) goto L_0x00a7
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00c9 }
            char[] r1 = f30071a     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r0
        L_0x00a7:
            char[] r1 = f30071a     // Catch:{ all -> 0x00c9 }
            r0.append(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "sb.toString()"
            com.onedelhi.secure.jt1.m53776o(r11, r1)     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 <= r4) goto L_0x00be
            r10.mo37830f()     // Catch:{ all -> 0x00c9 }
        L_0x00be:
            r0.setLength(r12)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r11
        L_0x00c3:
            int r0 = r10.mo37825a()     // Catch:{ all -> 0x00c9 }
            goto L_0x0028
        L_0x00c9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.i32.mo37828d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: e */
    public final void mo37829e() {
        CharsetDecoder charsetDecoder = f30068a;
        if (charsetDecoder == null) {
            jt1.m53761S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f30066a.position(0);
        f30065a.setLength(0);
    }

    /* renamed from: f */
    public final void mo37830f() {
        StringBuilder sb = f30065a;
        sb.setLength(32);
        sb.trimToSize();
    }

    /* renamed from: g */
    public final void mo37831g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        jt1.m53776o(newDecoder, "charset.newDecoder()");
        f30068a = newDecoder;
        ByteBuffer byteBuffer = f30066a;
        byteBuffer.clear();
        CharBuffer charBuffer = f30067a;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f30068a;
        if (charsetDecoder == null) {
            jt1.m53761S("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == 10) {
            z = true;
        }
        f30069a = z;
        mo37829e();
    }
}
