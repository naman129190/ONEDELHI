package com.onedelhi.secure;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.onedelhi.secure.rj2;
import java.io.InputStream;

public class rk3<Data> implements rj2<Integer, Data> {

    /* renamed from: a */
    public static final String f19913a = "ResourceLoader";

    /* renamed from: a */
    public final Resources f19914a;

    /* renamed from: a */
    public final rj2<Uri, Data> f19915a;

    /* renamed from: com.onedelhi.secure.rk3$a */
    public static final class C3419a implements sj2<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f19916a;

        public C3419a(Resources resources) {
            this.f19916a = resources;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        /* renamed from: c */
        public rj2<Integer, AssetFileDescriptor> mo14017c(am2 am2) {
            return new rk3(this.f19916a, am2.mo13184d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.onedelhi.secure.rk3$b */
    public static class C3420b implements sj2<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f19917a;

        public C3420b(Resources resources) {
            this.f19917a = resources;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Integer, ParcelFileDescriptor> mo14017c(am2 am2) {
            return new rk3(this.f19917a, am2.mo13184d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.onedelhi.secure.rk3$c */
    public static class C3421c implements sj2<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f19918a;

        public C3421c(Resources resources) {
            this.f19918a = resources;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Integer, InputStream> mo14017c(am2 am2) {
            return new rk3(this.f19918a, am2.mo13184d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.onedelhi.secure.rk3$d */
    public static class C3422d implements sj2<Integer, Uri> {

        /* renamed from: a */
        public final Resources f19919a;

        public C3422d(Resources resources) {
            this.f19919a = resources;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Integer, Uri> mo14017c(am2 am2) {
            return new rk3(this.f19919a, xn4.m31551c());
        }
    }

    public rk3(Resources resources, rj2<Uri, Data> rj2) {
        this.f19914a = resources;
        this.f19915a = rj2;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 Integer num, int i, int i2, @mr2 zw2 zw2) {
        Uri d = mo23928d(num);
        if (d == null) {
            return null;
        }
        return this.f19915a.mo13191a(d, i, i2, zw2);
    }

    @ts2
    /* renamed from: d */
    public final Uri mo23928d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f19914a.getResourcePackageName(num.intValue()) + '/' + this.f19914a.getResourceTypeName(num.intValue()) + '/' + this.f19914a.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable(f19913a, 5)) {
                return null;
            }
            Log.w(f19913a, "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo13192b(@mr2 Integer num) {
        return true;
    }
}
