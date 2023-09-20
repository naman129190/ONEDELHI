package com.onedelhi.secure;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@sj3(29)
public final class f83<DataT> implements rj2<Uri, DataT> {

    /* renamed from: a */
    public final Context f11959a;

    /* renamed from: a */
    public final rj2<File, DataT> f11960a;

    /* renamed from: a */
    public final Class<DataT> f11961a;

    /* renamed from: b */
    public final rj2<Uri, DataT> f11962b;

    /* renamed from: com.onedelhi.secure.f83$a */
    public static abstract class C2131a<DataT> implements sj2<Uri, DataT> {

        /* renamed from: a */
        public final Context f11963a;

        /* renamed from: a */
        public final Class<DataT> f11964a;

        public C2131a(Context context, Class<DataT> cls) {
            this.f11963a = context;
            this.f11964a = cls;
        }

        /* renamed from: b */
        public final void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public final rj2<Uri, DataT> mo14017c(@mr2 am2 am2) {
            return new f83(this.f11963a, am2.mo13184d(File.class, this.f11964a), am2.mo13184d(Uri.class, this.f11964a), this.f11964a);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.f83$b */
    public static final class C2132b extends C2131a<ParcelFileDescriptor> {
        public C2132b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.f83$c */
    public static final class C2133c extends C2131a<InputStream> {
        public C2133c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.onedelhi.secure.f83$d */
    public static final class C2134d<DataT> implements pd0<DataT> {

        /* renamed from: a */
        public static final String[] f11965a = {"_data"};

        /* renamed from: a */
        public final Context f11966a;

        /* renamed from: a */
        public final Uri f11967a;
        @ts2

        /* renamed from: a */
        public volatile pd0<DataT> f11968a;

        /* renamed from: a */
        public final rj2<File, DataT> f11969a;

        /* renamed from: a */
        public final zw2 f11970a;

        /* renamed from: a */
        public final Class<DataT> f11971a;

        /* renamed from: b */
        public final rj2<Uri, DataT> f11972b;

        /* renamed from: b */
        public volatile boolean f11973b;

        /* renamed from: n */
        public final int f11974n;

        /* renamed from: o */
        public final int f11975o;

        public C2134d(Context context, rj2<File, DataT> rj2, rj2<Uri, DataT> rj22, Uri uri, int i, int i2, zw2 zw2, Class<DataT> cls) {
            this.f11966a = context.getApplicationContext();
            this.f11969a = rj2;
            this.f11972b = rj22;
            this.f11967a = uri;
            this.f11974n = i;
            this.f11975o = i2;
            this.f11970a = zw2;
            this.f11971a = cls;
        }

        @mr2
        /* renamed from: a */
        public Class<DataT> mo14075a() {
            return this.f11971a;
        }

        /* renamed from: b */
        public void mo14569b() {
            pd0<DataT> pd0 = this.f11968a;
            if (pd0 != null) {
                pd0.mo14569b();
            }
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super DataT> aVar) {
            try {
                pd0<DataT> f = mo15891f();
                if (f == null) {
                    aVar.mo13892e(new IllegalArgumentException("Failed to build fetcher for: " + this.f11967a));
                    return;
                }
                this.f11968a = f;
                if (this.f11973b) {
                    cancel();
                } else {
                    f.mo14570c(f53, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo13892e(e);
            }
        }

        public void cancel() {
            this.f11973b = true;
            pd0<DataT> pd0 = this.f11968a;
            if (pd0 != null) {
                pd0.cancel();
            }
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return vd0.LOCAL;
        }

        @ts2
        /* renamed from: e */
        public final rj2.C3418a<DataT> mo15890e() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f11969a.mo13191a(mo15893h(this.f11967a), this.f11974n, this.f11975o, this.f11970a);
            }
            return this.f11972b.mo13191a(mo15892g() ? MediaStore.setRequireOriginal(this.f11967a) : this.f11967a, this.f11974n, this.f11975o, this.f11970a);
        }

        @ts2
        /* renamed from: f */
        public final pd0<DataT> mo15891f() throws FileNotFoundException {
            rj2.C3418a e = mo15890e();
            if (e != null) {
                return e.f19900a;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean mo15892g() {
            return this.f11966a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @mr2
        /* renamed from: h */
        public final File mo15893h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f11966a.getContentResolver().query(uri, f11965a, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public f83(Context context, rj2<File, DataT> rj2, rj2<Uri, DataT> rj22, Class<DataT> cls) {
        this.f11959a = context.getApplicationContext();
        this.f11960a = rj2;
        this.f11962b = rj22;
        this.f11961a = cls;
    }

    /* renamed from: c */
    public rj2.C3418a<DataT> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(uri), new C2134d(this.f11959a, this.f11960a, this.f11962b, uri, i, i2, zw2, this.f11961a));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ig2.m17519b(uri);
    }
}
