package com.onedelhi.secure;

import com.onedelhi.secure.rj2;
import java.io.InputStream;

public class nm1 implements rj2<gh1, InputStream> {

    /* renamed from: a */
    public static final ow2<Integer> f17486a = ow2.m24135g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @ts2

    /* renamed from: a */
    public final qj2<gh1, gh1> f17487a;

    /* renamed from: com.onedelhi.secure.nm1$a */
    public static class C2986a implements sj2<gh1, InputStream> {

        /* renamed from: a */
        public final qj2<gh1, gh1> f17488a = new qj2<>(500);

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<gh1, InputStream> mo14017c(am2 am2) {
            return new nm1(this.f17488a);
        }
    }

    public nm1() {
        this((qj2<gh1, gh1>) null);
    }

    public nm1(@ts2 qj2<gh1, gh1> qj2) {
        this.f17487a = qj2;
    }

    /* renamed from: c */
    public rj2.C3418a<InputStream> mo13191a(@mr2 gh1 gh1, int i, int i2, @mr2 zw2 zw2) {
        qj2<gh1, gh1> qj2 = this.f17487a;
        if (qj2 != null) {
            gh1 b = qj2.mo23190b(gh1, 0, 0);
            if (b == null) {
                this.f17487a.mo23191c(gh1, 0, 0, gh1);
            } else {
                gh1 = b;
            }
        }
        return new rj2.C3418a<>(gh1, new en1(gh1, ((Integer) zw2.mo28148c(f17486a)).intValue()));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 gh1 gh1) {
        return true;
    }
}
