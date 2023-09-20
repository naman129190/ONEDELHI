package com.onedelhi.secure;

import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.vq */
public class C3804vq {
    /* renamed from: a */
    public static int m30270a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* renamed from: b */
    public static ByteBuffer m30271b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
