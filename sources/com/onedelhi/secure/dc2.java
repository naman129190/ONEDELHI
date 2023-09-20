package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class dc2 {

    /* renamed from: a */
    public static final String f10710a = "ManifestParser";

    /* renamed from: b */
    public static final String f10711b = "GlideModule";

    /* renamed from: a */
    public final Context f10712a;

    public dc2(Context context) {
        this.f10712a = context;
    }

    /* renamed from: b */
    public static bh1 m13075b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                m13076c(cls, e);
            }
            if (obj instanceof bh1) {
                return (bh1) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e2) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e2);
        }
    }

    /* renamed from: c */
    public static void m13076c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<bh1> mo14616a() {
        if (Log.isLoggable(f10710a, 3)) {
            Log.d(f10710a, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f10712a.getPackageManager().getApplicationInfo(this.f10712a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable(f10710a, 3)) {
                    Log.d(f10710a, "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable(f10710a, 2)) {
                Log.v(f10710a, "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if (f10711b.equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m13075b(str));
                    if (Log.isLoggable(f10710a, 3)) {
                        Log.d(f10710a, "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable(f10710a, 3)) {
                Log.d(f10710a, "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
