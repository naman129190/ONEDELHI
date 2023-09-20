package com.onedelhi.secure;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.io.InputStream;

public class c54<Data> implements rj2<String, Data> {

    /* renamed from: a */
    public final rj2<Uri, Data> f10151a;

    /* renamed from: com.onedelhi.secure.c54$a */
    public static final class C1849a implements sj2<String, AssetFileDescriptor> {
        /* renamed from: b */
        public void mo14016b() {
        }

        /* renamed from: c */
        public rj2<String, AssetFileDescriptor> mo14017c(@mr2 am2 am2) {
            return new c54(am2.mo13184d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.onedelhi.secure.c54$b */
    public static class C1850b implements sj2<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<String, ParcelFileDescriptor> mo14017c(@mr2 am2 am2) {
            return new c54(am2.mo13184d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.onedelhi.secure.c54$c */
    public static class C1851c implements sj2<String, InputStream> {
        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<String, InputStream> mo14017c(@mr2 am2 am2) {
            return new c54(am2.mo13184d(Uri.class, InputStream.class));
        }
    }

    public c54(rj2<Uri, Data> rj2) {
        this.f10151a = rj2;
    }

    @ts2
    /* renamed from: e */
    public static Uri m12329e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return m12330f(str);
    }

    /* renamed from: f */
    public static Uri m12330f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 String str, int i, int i2, @mr2 zw2 zw2) {
        Uri e = m12329e(str);
        if (e == null || !this.f10151a.mo13192b(e)) {
            return null;
        }
        return this.f10151a.mo13191a(e, i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 String str) {
        return true;
    }
}
