package com.onedelhi.secure;

import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.mq */
public class C2873mq<Data> implements rj2<byte[], Data> {

    /* renamed from: a */
    public final C2876b<Data> f16270a;

    /* renamed from: com.onedelhi.secure.mq$a */
    public static class C2874a implements sj2<byte[], ByteBuffer> {

        /* renamed from: com.onedelhi.secure.mq$a$a */
        public class C2875a implements C2876b<ByteBuffer> {
            public C2875a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo20585a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo20586b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<byte[], ByteBuffer> mo14017c(@mr2 am2 am2) {
            return new C2873mq(new C2875a());
        }
    }

    /* renamed from: com.onedelhi.secure.mq$b */
    public interface C2876b<Data> {
        /* renamed from: a */
        Class<Data> mo20585a();

        /* renamed from: b */
        Data mo20586b(byte[] bArr);
    }

    /* renamed from: com.onedelhi.secure.mq$c */
    public static class C2877c<Data> implements pd0<Data> {

        /* renamed from: a */
        public final C2876b<Data> f16272a;

        /* renamed from: a */
        public final byte[] f16273a;

        public C2877c(byte[] bArr, C2876b<Data> bVar) {
            this.f16273a = bArr;
            this.f16272a = bVar;
        }

        @mr2
        /* renamed from: a */
        public Class<Data> mo14075a() {
            return this.f16272a.mo20585a();
        }

        /* renamed from: b */
        public void mo14569b() {
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super Data> aVar) {
            aVar.mo13893f(this.f16272a.mo20586b(this.f16273a));
        }

        public void cancel() {
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return vd0.LOCAL;
        }
    }

    /* renamed from: com.onedelhi.secure.mq$d */
    public static class C2878d implements sj2<byte[], InputStream> {

        /* renamed from: com.onedelhi.secure.mq$d$a */
        public class C2879a implements C2876b<InputStream> {
            public C2879a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo20585a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo20586b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<byte[], InputStream> mo14017c(@mr2 am2 am2) {
            return new C2873mq(new C2879a());
        }
    }

    public C2873mq(C2876b<Data> bVar) {
        this.f16270a = bVar;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 byte[] bArr, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(bArr), new C2877c(bArr, this.f16270a));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 byte[] bArr) {
        return true;
    }
}
