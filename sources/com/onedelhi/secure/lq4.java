package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

public class lq4 extends gq4 {

    /* renamed from: a */
    public static final ThreadLocal<C2772a> f15529a = ThreadLocal.withInitial(kq4.f31404a);

    /* renamed from: com.onedelhi.secure.lq4$a */
    public static class C2772a {

        /* renamed from: a */
        public CharSequence f15530a = null;

        /* renamed from: a */
        public ByteBuffer f15531a = null;

        /* renamed from: a */
        public final CharsetDecoder f15532a = StandardCharsets.UTF_8.newDecoder();

        /* renamed from: a */
        public final CharsetEncoder f15533a = StandardCharsets.UTF_8.newEncoder();
    }

    /* renamed from: g */
    public static /* synthetic */ C2772a m20904g() {
        return new C2772a();
    }

    /* renamed from: a */
    public String mo16832a(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f15529a.get().f15532a;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    /* renamed from: b */
    public void mo16833b(CharSequence charSequence, ByteBuffer byteBuffer) {
        C2772a aVar = f15529a.get();
        if (aVar.f15530a != charSequence) {
            mo16834c(charSequence);
        }
        byteBuffer.put(aVar.f15531a);
    }

    /* renamed from: c */
    public int mo16834c(CharSequence charSequence) {
        C2772a aVar = f15529a.get();
        int length = (int) (((float) charSequence.length()) * aVar.f15533a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f15531a;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f15531a = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f15531a.clear();
        aVar.f15530a = charSequence;
        CoderResult encode = aVar.f15533a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f15531a, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        aVar.f15531a.flip();
        return aVar.f15531a.remaining();
    }
}
