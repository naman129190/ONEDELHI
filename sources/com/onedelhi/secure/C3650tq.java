package com.onedelhi.secure;

import com.bumptech.glide.load.data.C1195a;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.tq */
public class C3650tq implements C1195a<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f21049a;

    /* renamed from: com.onedelhi.secure.tq$a */
    public static class C3651a implements C1195a.C1196a<ByteBuffer> {
        @mr2
        /* renamed from: a */
        public Class<ByteBuffer> mo7518a() {
            return ByteBuffer.class;
        }

        @mr2
        /* renamed from: c */
        public C1195a<ByteBuffer> mo7519b(ByteBuffer byteBuffer) {
            return new C3650tq(byteBuffer);
        }
    }

    public C3650tq(ByteBuffer byteBuffer) {
        this.f21049a = byteBuffer;
    }

    @mr2
    /* renamed from: a */
    public ByteBuffer mo7515c() {
        this.f21049a.position(0);
        return this.f21049a;
    }

    /* renamed from: b */
    public void mo7514b() {
    }
}
