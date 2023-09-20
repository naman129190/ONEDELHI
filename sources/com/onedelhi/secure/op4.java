package com.onedelhi.secure;

import android.net.Uri;
import com.onedelhi.secure.rj2;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class op4<Data> implements rj2<Uri, Data> {

    /* renamed from: a */
    public static final Set<String> f18064a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{m51.f32018a, m51.f32019b})));

    /* renamed from: a */
    public final rj2<gh1, Data> f18065a;

    /* renamed from: com.onedelhi.secure.op4$a */
    public static class C3081a implements sj2<Uri, InputStream> {
        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, InputStream> mo14017c(am2 am2) {
            return new op4(am2.mo13184d(gh1.class, InputStream.class));
        }
    }

    public op4(rj2<gh1, Data> rj2) {
        this.f18065a = rj2;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        return this.f18065a.mo13191a(new gh1(uri.toString()), i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return f18064a.contains(uri.getScheme());
    }
}
