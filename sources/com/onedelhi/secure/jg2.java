package com.onedelhi.secure;

import android.content.Context;
import android.net.Uri;
import com.onedelhi.secure.rj2;
import java.io.InputStream;

public class jg2 implements rj2<Uri, InputStream> {

    /* renamed from: a */
    public final Context f14140a;

    /* renamed from: com.onedelhi.secure.jg2$a */
    public static class C2515a implements sj2<Uri, InputStream> {

        /* renamed from: a */
        public final Context f14141a;

        public C2515a(Context context) {
            this.f14141a = context;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, InputStream> mo14017c(am2 am2) {
            return new jg2(this.f14141a);
        }
    }

    public jg2(Context context) {
        this.f14140a = context.getApplicationContext();
    }

    @ts2
    /* renamed from: c */
    public rj2.C3418a<InputStream> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        if (!ig2.m17521d(i, i2) || !mo18404e(zw2)) {
            return null;
        }
        return new rj2.C3418a<>(new mt2(uri), mc4.m21477g(this.f14140a, uri));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return ig2.m17520c(uri);
    }

    /* renamed from: e */
    public final boolean mo18404e(zw2 zw2) {
        Long l = (Long) zw2.mo28148c(dt4.f10912a);
        return l != null && l.longValue() == -1;
    }
}
