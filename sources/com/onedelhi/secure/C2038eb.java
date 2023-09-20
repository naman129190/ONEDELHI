package com.onedelhi.secure;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.onedelhi.secure.rj2;
import java.io.InputStream;

/* renamed from: com.onedelhi.secure.eb */
public class C2038eb<Data> implements rj2<Uri, Data> {

    /* renamed from: a */
    public static final int f11157a = 22;

    /* renamed from: a */
    public static final String f11158a = "android_asset";

    /* renamed from: b */
    public static final String f11159b = "file:///android_asset/";

    /* renamed from: a */
    public final AssetManager f11160a;

    /* renamed from: a */
    public final C2039a<Data> f11161a;

    /* renamed from: com.onedelhi.secure.eb$a */
    public interface C2039a<Data> {
        /* renamed from: a */
        pd0<Data> mo15102a(AssetManager assetManager, String str);
    }

    /* renamed from: com.onedelhi.secure.eb$b */
    public static class C2040b implements sj2<Uri, ParcelFileDescriptor>, C2039a<ParcelFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f11162a;

        public C2040b(AssetManager assetManager) {
            this.f11162a = assetManager;
        }

        /* renamed from: a */
        public pd0<ParcelFileDescriptor> mo15102a(AssetManager assetManager, String str) {
            return new k21(assetManager, str);
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, ParcelFileDescriptor> mo14017c(am2 am2) {
            return new C2038eb(this.f11162a, this);
        }
    }

    /* renamed from: com.onedelhi.secure.eb$c */
    public static class C2041c implements sj2<Uri, InputStream>, C2039a<InputStream> {

        /* renamed from: a */
        public final AssetManager f11163a;

        public C2041c(AssetManager assetManager) {
            this.f11163a = assetManager;
        }

        /* renamed from: a */
        public pd0<InputStream> mo15102a(AssetManager assetManager, String str) {
            return new e44(assetManager, str);
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, InputStream> mo14017c(am2 am2) {
            return new C2038eb(this.f11163a, this);
        }
    }

    public C2038eb(AssetManager assetManager, C2039a<Data> aVar) {
        this.f11160a = assetManager;
        this.f11161a = aVar;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(uri), this.f11161a.mo15102a(this.f11160a, uri.toString().substring(f11157a)));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f11158a.equals(uri.getPathSegments().get(0));
    }
}
