package com.onedelhi.secure;

import com.onedelhi.secure.rj2;
import java.io.InputStream;
import java.net.URL;

public class mp4 implements rj2<URL, InputStream> {

    /* renamed from: a */
    public final rj2<gh1, InputStream> f16267a;

    /* renamed from: com.onedelhi.secure.mp4$a */
    public static class C2872a implements sj2<URL, InputStream> {
        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<URL, InputStream> mo14017c(am2 am2) {
            return new mp4(am2.mo13184d(gh1.class, InputStream.class));
        }
    }

    public mp4(rj2<gh1, InputStream> rj2) {
        this.f16267a = rj2;
    }

    /* renamed from: c */
    public rj2.C3418a<InputStream> mo13191a(@mr2 URL url, int i, int i2, @mr2 zw2 zw2) {
        return this.f16267a.mo13191a(new gh1(url), i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 URL url) {
        return true;
    }
}
