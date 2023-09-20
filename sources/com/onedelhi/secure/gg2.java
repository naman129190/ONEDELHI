package com.onedelhi.secure;

import android.content.Context;
import android.net.Uri;
import com.onedelhi.secure.rj2;
import java.io.InputStream;

public class gg2 implements rj2<Uri, InputStream> {

    /* renamed from: a */
    public final Context f12571a;

    /* renamed from: com.onedelhi.secure.gg2$a */
    public static class C2246a implements sj2<Uri, InputStream> {

        /* renamed from: a */
        public final Context f12572a;

        public C2246a(Context context) {
            this.f12572a = context;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, InputStream> mo14017c(am2 am2) {
            return new gg2(this.f12572a);
        }
    }

    public gg2(Context context) {
        this.f12571a = context.getApplicationContext();
    }

    /* renamed from: c */
    public rj2.C3418a<InputStream> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        if (ig2.m17521d(i, i2)) {
            return new rj2.C3418a<>(new mt2(uri), mc4.m21476f(this.f12571a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return ig2.m17518a(uri);
    }
}
