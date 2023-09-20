package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ug3;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C1200c implements C1195a<InputStream> {

    /* renamed from: a */
    public static final int f6105a = 5242880;

    /* renamed from: a */
    public final ug3 f6106a;

    /* renamed from: com.bumptech.glide.load.data.c$a */
    public static final class C1201a implements C1195a.C1196a<InputStream> {

        /* renamed from: a */
        public final C3131pa f6107a;

        public C1201a(C3131pa paVar) {
            this.f6107a = paVar;
        }

        @mr2
        /* renamed from: a */
        public Class<InputStream> mo7518a() {
            return InputStream.class;
        }

        @mr2
        /* renamed from: c */
        public C1195a<InputStream> mo7519b(InputStream inputStream) {
            return new C1200c(inputStream, this.f6107a);
        }
    }

    public C1200c(InputStream inputStream, C3131pa paVar) {
        ug3 ug3 = new ug3(inputStream, paVar);
        this.f6106a = ug3;
        ug3.mark(5242880);
    }

    /* renamed from: a */
    public void mo7523a() {
        this.f6106a.mo25605b();
    }

    /* renamed from: b */
    public void mo7514b() {
        this.f6106a.release();
    }

    @mr2
    /* renamed from: d */
    public InputStream mo7515c() throws IOException {
        this.f6106a.reset();
        return this.f6106a;
    }
}
