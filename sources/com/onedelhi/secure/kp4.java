package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.rj2;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class kp4<Data> implements rj2<Uri, Data> {

    /* renamed from: a */
    public static final Set<String> f15039a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", FirebaseAnalytics.C4305d.f24947P})));

    /* renamed from: a */
    public final C2658c<Data> f15040a;

    /* renamed from: com.onedelhi.secure.kp4$a */
    public static final class C2656a implements sj2<Uri, AssetFileDescriptor>, C2658c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f15041a;

        public C2656a(ContentResolver contentResolver) {
            this.f15041a = contentResolver;
        }

        /* renamed from: a */
        public pd0<AssetFileDescriptor> mo19175a(Uri uri) {
            return new C1869cb(this.f15041a, uri);
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        /* renamed from: c */
        public rj2<Uri, AssetFileDescriptor> mo14017c(am2 am2) {
            return new kp4(this);
        }
    }

    /* renamed from: com.onedelhi.secure.kp4$b */
    public static class C2657b implements sj2<Uri, ParcelFileDescriptor>, C2658c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f15042a;

        public C2657b(ContentResolver contentResolver) {
            this.f15042a = contentResolver;
        }

        /* renamed from: a */
        public pd0<ParcelFileDescriptor> mo19175a(Uri uri) {
            return new l21(this.f15042a, uri);
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, ParcelFileDescriptor> mo14017c(am2 am2) {
            return new kp4(this);
        }
    }

    /* renamed from: com.onedelhi.secure.kp4$c */
    public interface C2658c<Data> {
        /* renamed from: a */
        pd0<Data> mo19175a(Uri uri);
    }

    /* renamed from: com.onedelhi.secure.kp4$d */
    public static class C2659d implements sj2<Uri, InputStream>, C2658c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f15043a;

        public C2659d(ContentResolver contentResolver) {
            this.f15043a = contentResolver;
        }

        /* renamed from: a */
        public pd0<InputStream> mo19175a(Uri uri) {
            return new j44(this.f15043a, uri);
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Uri, InputStream> mo14017c(am2 am2) {
            return new kp4(this);
        }
    }

    public kp4(C2658c<Data> cVar) {
        this.f15040a = cVar;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(uri), this.f15040a.mo19175a(uri));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 Uri uri) {
        return f15039a.contains(uri.getScheme());
    }
}
