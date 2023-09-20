package com.onedelhi.secure;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.io.FileNotFoundException;

public final class fg2 implements rj2<Uri, File> {

    /* renamed from: a */
    public final Context f12059a;

    /* renamed from: com.onedelhi.secure.fg2$a */
    public static final class C2166a implements sj2<Uri, File> {

        /* renamed from: a */
        public final Context f12060a;

        public C2166a(Context context) {
            this.f12060a = context;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, File> mo14017c(am2 am2) {
            return new fg2(this.f12060a);
        }
    }

    /* renamed from: com.onedelhi.secure.fg2$b */
    public static class C2167b implements pd0<File> {

        /* renamed from: a */
        public static final String[] f12061a = {"_data"};

        /* renamed from: a */
        public final Context f12062a;

        /* renamed from: a */
        public final Uri f12063a;

        public C2167b(Context context, Uri uri) {
            this.f12062a = context;
            this.f12063a = uri;
        }

        @mr2
        /* renamed from: a */
        public Class<File> mo14075a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo14569b() {
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super File> aVar) {
            Cursor query = this.f12062a.getContentResolver().query(this.f12063a, f12061a, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo13892e(new FileNotFoundException("Failed to find file path for: " + this.f12063a));
                return;
            }
            aVar.mo13893f(new File(str));
        }

        public void cancel() {
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return vd0.LOCAL;
        }
    }

    public fg2(Context context) {
        this.f12059a = context;
    }

    /* renamed from: c */
    public rj2.C3418a<File> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(uri), new C2167b(this.f12059a, uri));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return ig2.m17519b(uri);
    }
}
