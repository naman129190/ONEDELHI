package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

public class na2 {

    /* renamed from: a */
    public static final Map<String, fb2<la2>> f17236a = new HashMap();

    /* renamed from: com.onedelhi.secure.na2$a */
    public class C2937a implements xa2<la2> {

        /* renamed from: a */
        public final /* synthetic */ String f17237a;

        public C2937a(String str) {
            this.f17237a = str;
        }

        /* renamed from: a */
        public void onResult(la2 la2) {
            na2.f17236a.remove(this.f17237a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$b */
    public class C2938b implements xa2<Throwable> {

        /* renamed from: a */
        public final /* synthetic */ String f17238a;

        public C2938b(String str) {
            this.f17238a = str;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            na2.f17236a.remove(this.f17238a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$c */
    public class C2939c implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ Context f17239a;

        /* renamed from: a */
        public final /* synthetic */ String f17240a;

        /* renamed from: b */
        public final /* synthetic */ String f17241b;

        public C2939c(Context context, String str, String str2) {
            this.f17239a = context;
            this.f17240a = str;
            this.f17241b = str2;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return mo2.m21824e(this.f17239a, this.f17240a, this.f17241b);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$d */
    public class C2940d implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ Context f17242a;

        /* renamed from: a */
        public final /* synthetic */ String f17243a;

        /* renamed from: b */
        public final /* synthetic */ String f17244b;

        public C2940d(Context context, String str, String str2) {
            this.f17242a = context;
            this.f17243a = str;
            this.f17244b = str2;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22547h(this.f17242a, this.f17243a, this.f17244b);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$e */
    public class C2941e implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ int f17245a;

        /* renamed from: a */
        public final /* synthetic */ Context f17246a;

        /* renamed from: a */
        public final /* synthetic */ WeakReference f17247a;

        public C2941e(WeakReference weakReference, Context context, int i) {
            this.f17247a = weakReference;
            this.f17246a = context;
            this.f17245a = i;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            Context context = (Context) this.f17247a.get();
            if (context == null) {
                context = this.f17246a;
            }
            return na2.m22560u(context, this.f17245a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$f */
    public class C2942f implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ InputStream f17248a;

        /* renamed from: a */
        public final /* synthetic */ String f17249a;

        public C2942f(InputStream inputStream, String str) {
            this.f17248a = inputStream;
            this.f17249a = str;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22550k(this.f17248a, this.f17249a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$g */
    public class C2943g implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ String f17250a;

        /* renamed from: a */
        public final /* synthetic */ JSONObject f17251a;

        public C2943g(JSONObject jSONObject, String str) {
            this.f17251a = jSONObject;
            this.f17250a = str;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22557r(this.f17251a, this.f17250a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$h */
    public class C2944h implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ String f17252a;

        /* renamed from: b */
        public final /* synthetic */ String f17253b;

        public C2944h(String str, String str2) {
            this.f17252a = str;
            this.f17253b = str2;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22556q(this.f17252a, this.f17253b);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$i */
    public class C2945i implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ wv1 f17254a;

        /* renamed from: a */
        public final /* synthetic */ String f17255a;

        public C2945i(wv1 wv1, String str) {
            this.f17254a = wv1;
            this.f17255a = str;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22553n(this.f17254a, this.f17255a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$j */
    public class C2946j implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ String f17256a;

        /* renamed from: a */
        public final /* synthetic */ ZipInputStream f17257a;

        public C2946j(ZipInputStream zipInputStream, String str) {
            this.f17257a = zipInputStream;
            this.f17256a = str;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return na2.m22535B(this.f17257a, this.f17256a);
        }
    }

    /* renamed from: com.onedelhi.secure.na2$k */
    public class C2947k implements Callable<eb2<la2>> {

        /* renamed from: a */
        public final /* synthetic */ la2 f17258a;

        public C2947k(la2 la2) {
            this.f17258a = la2;
        }

        /* renamed from: a */
        public eb2<la2> call() {
            return new eb2<>(this.f17258a);
        }
    }

    /* renamed from: A */
    public static fb2<la2> m22534A(ZipInputStream zipInputStream, @ts2 String str) {
        return m22541b(str, new C2946j(zipInputStream, str));
    }

    @ly4
    /* renamed from: B */
    public static eb2<la2> m22535B(ZipInputStream zipInputStream, @ts2 String str) {
        try {
            return m22536C(zipInputStream, str);
        } finally {
            yq4.m32600c(zipInputStream);
        }
    }

    @ly4
    /* renamed from: C */
    public static eb2<la2> m22536C(ZipInputStream zipInputStream, @ts2 String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            la2 la2 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        la2 = m22554o(wv1.m31124E(gu2.m49835d(gu2.m49844m(zipInputStream))), (String) null, false).mo15104b();
                    } else if (name.contains(".png") || name.contains(".webp")) {
                        String[] split = name.split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (la2 == null) {
                return new eb2<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                sa2 d = m22543d(la2, (String) entry.getKey());
                if (d != null) {
                    d.mo24279g(yq4.m32610m((Bitmap) entry.getValue(), d.mo24278f(), d.mo24276d()));
                }
            }
            for (Map.Entry next : la2.mo19380i().entrySet()) {
                if (((sa2) next.getValue()).mo24273a() == null) {
                    return new eb2<>((Throwable) new IllegalStateException("There is no image for " + ((sa2) next.getValue()).mo24275c()));
                }
            }
            if (str != null) {
                ma2.m21403c().mo20232d(str, la2);
            }
            return new eb2<>(la2);
        } catch (IOException e) {
            return new eb2<>((Throwable) e);
        }
    }

    /* renamed from: D */
    public static boolean m22537D(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: E */
    public static String m22538E(Context context, @mf3 int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m22537D(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: F */
    public static void m22539F(int i) {
        ma2.m21403c().mo20233e(i);
    }

    /* renamed from: b */
    public static fb2<la2> m22541b(@ts2 String str, Callable<eb2<la2>> callable) {
        la2 b = str == null ? null : ma2.m21403c().mo20231b(str);
        if (b != null) {
            return new fb2<>(new C2947k(b));
        }
        if (str != null) {
            Map<String, fb2<la2>> map = f17236a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        fb2<la2> fb2 = new fb2<>(callable);
        if (str != null) {
            fb2.mo15936f(new C2937a(str));
            fb2.mo15935e(new C2938b(str));
            f17236a.put(str, fb2);
        }
        return fb2;
    }

    /* renamed from: c */
    public static void m22542c(Context context) {
        f17236a.clear();
        ma2.m21403c().mo20230a();
        new io2(context).mo17888a();
    }

    @ts2
    /* renamed from: d */
    public static sa2 m22543d(la2 la2, String str) {
        for (sa2 next : la2.mo19380i().values()) {
            if (next.mo24275c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static fb2<la2> m22544e(Context context, String str) {
        return m22545f(context, str, "asset_" + str);
    }

    /* renamed from: f */
    public static fb2<la2> m22545f(Context context, String str, @ts2 String str2) {
        return m22541b(str2, new C2940d(context.getApplicationContext(), str, str2));
    }

    @ly4
    /* renamed from: g */
    public static eb2<la2> m22546g(Context context, String str) {
        return m22547h(context, str, "asset_" + str);
    }

    @ly4
    /* renamed from: h */
    public static eb2<la2> m22547h(Context context, String str, @ts2 String str2) {
        try {
            return str.endsWith(".zip") ? m22535B(new ZipInputStream(context.getAssets().open(str)), str2) : m22550k(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new eb2<>((Throwable) e);
        }
    }

    @Deprecated
    /* renamed from: i */
    public static fb2<la2> m22548i(JSONObject jSONObject, @ts2 String str) {
        return m22541b(str, new C2943g(jSONObject, str));
    }

    /* renamed from: j */
    public static fb2<la2> m22549j(InputStream inputStream, @ts2 String str) {
        return m22541b(str, new C2942f(inputStream, str));
    }

    @ly4
    /* renamed from: k */
    public static eb2<la2> m22550k(InputStream inputStream, @ts2 String str) {
        return m22551l(inputStream, str, true);
    }

    @ly4
    /* renamed from: l */
    public static eb2<la2> m22551l(InputStream inputStream, @ts2 String str, boolean z) {
        try {
            return m22553n(wv1.m31124E(gu2.m49835d(gu2.m49844m(inputStream))), str);
        } finally {
            if (z) {
                yq4.m32600c(inputStream);
            }
        }
    }

    /* renamed from: m */
    public static fb2<la2> m22552m(wv1 wv1, @ts2 String str) {
        return m22541b(str, new C2945i(wv1, str));
    }

    @ly4
    /* renamed from: n */
    public static eb2<la2> m22553n(wv1 wv1, @ts2 String str) {
        return m22554o(wv1, str, true);
    }

    /* renamed from: o */
    public static eb2<la2> m22554o(wv1 wv1, @ts2 String str, boolean z) {
        try {
            la2 a = oa2.m23633a(wv1);
            if (str != null) {
                ma2.m21403c().mo20232d(str, a);
            }
            eb2<la2> eb2 = new eb2<>(a);
            if (z) {
                yq4.m32600c(wv1);
            }
            return eb2;
        } catch (Exception e) {
            eb2<la2> eb22 = new eb2<>((Throwable) e);
            if (z) {
                yq4.m32600c(wv1);
            }
            return eb22;
        } catch (Throwable th) {
            if (z) {
                yq4.m32600c(wv1);
            }
            throw th;
        }
    }

    /* renamed from: p */
    public static fb2<la2> m22555p(String str, @ts2 String str2) {
        return m22541b(str2, new C2944h(str, str2));
    }

    @ly4
    /* renamed from: q */
    public static eb2<la2> m22556q(String str, @ts2 String str2) {
        return m22553n(wv1.m31124E(gu2.m49835d(gu2.m49844m(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @Deprecated
    @ly4
    /* renamed from: r */
    public static eb2<la2> m22557r(JSONObject jSONObject, @ts2 String str) {
        return m22556q(jSONObject.toString(), str);
    }

    /* renamed from: s */
    public static fb2<la2> m22558s(Context context, @mf3 int i) {
        return m22559t(context, i, m22538E(context, i));
    }

    /* renamed from: t */
    public static fb2<la2> m22559t(Context context, @mf3 int i, @ts2 String str) {
        return m22541b(str, new C2941e(new WeakReference(context), context.getApplicationContext(), i));
    }

    @ly4
    /* renamed from: u */
    public static eb2<la2> m22560u(Context context, @mf3 int i) {
        return m22561v(context, i, m22538E(context, i));
    }

    @ly4
    /* renamed from: v */
    public static eb2<la2> m22561v(Context context, @mf3 int i, @ts2 String str) {
        try {
            return m22550k(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e) {
            return new eb2<>((Throwable) e);
        }
    }

    /* renamed from: w */
    public static fb2<la2> m22562w(Context context, String str) {
        return m22563x(context, str, "url_" + str);
    }

    /* renamed from: x */
    public static fb2<la2> m22563x(Context context, String str, @ts2 String str2) {
        return m22541b(str2, new C2939c(context, str, str2));
    }

    @ly4
    /* renamed from: y */
    public static eb2<la2> m22564y(Context context, String str) {
        return m22565z(context, str, str);
    }

    @ly4
    /* renamed from: z */
    public static eb2<la2> m22565z(Context context, String str, @ts2 String str2) {
        return mo2.m21824e(context, str, str2);
    }
}
