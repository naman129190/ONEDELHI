package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.C0358b;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.C1824by;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.zk3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.apache.commons.compress.utils.CharsetNames;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    public static final float f3298a = 0.25f;

    /* renamed from: b */
    public static final float f3299b = 0.6666667f;

    /* renamed from: b */
    public static final PorterDuff.Mode f3300b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static final float f3301c = 0.9166667f;

    /* renamed from: c */
    public static final String f3302c = "IconCompat";

    /* renamed from: d */
    public static final float f3303d = 0.010416667f;

    /* renamed from: d */
    public static final int f3304d = -1;
    @hw4

    /* renamed from: d */
    public static final String f3305d = "type";

    /* renamed from: e */
    public static final float f3306e = 0.020833334f;

    /* renamed from: e */
    public static final int f3307e = 1;
    @hw4

    /* renamed from: e */
    public static final String f3308e = "obj";

    /* renamed from: f */
    public static final int f3309f = 2;
    @hw4

    /* renamed from: f */
    public static final String f3310f = "int1";

    /* renamed from: g */
    public static final int f3311g = 3;
    @hw4

    /* renamed from: g */
    public static final String f3312g = "int2";

    /* renamed from: h */
    public static final int f3313h = 4;
    @hw4

    /* renamed from: h */
    public static final String f3314h = "tint_list";

    /* renamed from: i */
    public static final int f3315i = 5;
    @hw4

    /* renamed from: i */
    public static final String f3316i = "tint_mode";

    /* renamed from: j */
    public static final int f3317j = 6;
    @hw4

    /* renamed from: j */
    public static final String f3318j = "string1";

    /* renamed from: k */
    public static final int f3319k = 61;

    /* renamed from: l */
    public static final int f3320l = 30;
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public int f3321a;
    @ts2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: a */
    public ColorStateList f3322a;

    /* renamed from: a */
    public PorterDuff.Mode f3323a;
    @ts2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: a */
    public Parcelable f3324a;

    /* renamed from: a */
    public Object f3325a;
    @ts2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: a */
    public String f3326a;
    @ts2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: a */
    public byte[] f3327a;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: b */
    public int f3328b;
    @ts2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: b */
    public String f3329b;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: c */
    public int f3330c;

    @sj3(23)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0482a {
        @ts2
        /* renamed from: a */
        public static IconCompat m3673a(@mr2 Context context, @mr2 Icon icon) {
            int e = m3677e(icon);
            if (e == 2) {
                String d = m3676d(icon);
                try {
                    return IconCompat.m3654z(IconCompat.m3639D(context, d), d, m3675c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else if (e == 4) {
                return IconCompat.m3650v(m3678f(icon));
            } else {
                if (e == 6) {
                    return IconCompat.m3647s(m3678f(icon));
                }
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.f3325a = icon;
                return iconCompat;
            }
        }

        /* renamed from: b */
        public static IconCompat m3674b(@mr2 Object obj) {
            k43.m19455l(obj);
            int e = m3677e(obj);
            if (e == 2) {
                return IconCompat.m3654z((Resources) null, m3676d(obj), m3675c(obj));
            }
            if (e == 4) {
                return IconCompat.m3650v(m3678f(obj));
            }
            if (e == 6) {
                return IconCompat.m3647s(m3678f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3325a = obj;
            return iconCompat;
        }

        @dp0
        @mo1
        /* renamed from: c */
        public static int m3675c(@mr2 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0484c.m3683a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f3302c, "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e(IconCompat.f3302c, "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f3302c, "Unable to get icon resource", e3);
                return 0;
            }
        }

        @ts2
        /* renamed from: d */
        public static String m3676d(@mr2 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0484c.m3684b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f3302c, "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e(IconCompat.f3302c, "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f3302c, "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: e */
        public static int m3677e(@mr2 Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return C0484c.m3685c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.f3302c, sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.f3302c, sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.f3302c, sb.toString(), e);
                return -1;
            }
        }

        @pn0
        @ts2
        /* renamed from: f */
        public static Uri m3678f(@mr2 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0484c.m3686d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f3302c, "Unable to get icon uri", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e(IconCompat.f3302c, "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f3302c, "Unable to get icon uri", e3);
                return null;
            }
        }

        @pn0
        /* renamed from: g */
        public static Drawable m3679g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r0 >= 26) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.C0483b.m3682b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.m3645q(r5, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
            r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
            r0 = r4.f3322a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
            if (r0 == null) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
            r5.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            r4 = r4.f3323a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
            if (r4 == androidx.core.graphics.drawable.IconCompat.f3300b) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
            r5.setTintMode(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
            return r5;
         */
        @com.onedelhi.secure.pn0
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Icon m3680h(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f3321a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto L_0x00b5;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x009c;
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x007b;
                    case 5: goto L_0x0065;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r5 = r4.mo3777F()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0485d.m3687a(r5)
                goto L_0x00a4
            L_0x0020:
                if (r5 == 0) goto L_0x004a
                java.io.InputStream r5 = r4.mo3778G(r5)
                if (r5 == 0) goto L_0x002f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L_0x0076
                goto L_0x006d
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.mo3777F()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x004a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.mo3777F()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0065:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L_0x0072
                java.lang.Object r5 = r4.f3325a
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x006d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0483b.m3682b(r5)
                goto L_0x00a4
            L_0x0072:
                java.lang.Object r5 = r4.f3325a
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x0076:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.m3645q(r5, r1)
                goto L_0x00a0
            L_0x007b:
                java.lang.Object r5 = r4.f3325a
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x00a4
            L_0x0084:
                java.lang.Object r5 = r4.f3325a
                byte[] r5 = (byte[]) r5
                int r0 = r4.f3328b
                int r1 = r4.f3330c
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x00a4
            L_0x0091:
                java.lang.String r5 = r4.mo3775C()
                int r0 = r4.f3328b
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x00a4
            L_0x009c:
                java.lang.Object r5 = r4.f3325a
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x00a0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L_0x00a4:
                android.content.res.ColorStateList r0 = r4.f3322a
                if (r0 == 0) goto L_0x00ab
                r5.setTintList(r0)
            L_0x00ab:
                android.graphics.PorterDuff$Mode r4 = r4.f3323a
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f3300b
                if (r4 == r0) goto L_0x00b4
                r5.setTintMode(r4)
            L_0x00b4:
                return r5
            L_0x00b5:
                java.lang.Object r4 = r4.f3325a
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.C0482a.m3680h(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    @sj3(26)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C0483b {
        @pn0
        /* renamed from: a */
        public static Drawable m3681a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @pn0
        /* renamed from: b */
        public static Icon m3682b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @sj3(28)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C0484c {
        @pn0
        /* renamed from: a */
        public static int m3683a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @pn0
        /* renamed from: b */
        public static String m3684b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @pn0
        /* renamed from: c */
        public static int m3685c(Object obj) {
            return ((Icon) obj).getType();
        }

        @pn0
        /* renamed from: d */
        public static Uri m3686d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @sj3(30)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C0485d {
        @pn0
        /* renamed from: a */
        public static Icon m3687a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @hl3({hl3.C2354a.f13185a})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$e */
    public @interface C0486e {
    }

    @hl3({hl3.C2354a.f13185a})
    public IconCompat() {
        this.f3321a = -1;
        this.f3327a = null;
        this.f3324a = null;
        this.f3328b = 0;
        this.f3330c = 0;
        this.f3322a = null;
        this.f3323a = f3300b;
        this.f3326a = null;
    }

    public IconCompat(int i) {
        this.f3327a = null;
        this.f3324a = null;
        this.f3328b = 0;
        this.f3330c = 0;
        this.f3322a = null;
        this.f3323a = f3300b;
        this.f3326a = null;
        this.f3321a = i;
    }

    /* renamed from: D */
    public static Resources m3639D(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f3302c, String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: O */
    public static String m3640O(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @ts2
    /* renamed from: m */
    public static IconCompat m3641m(@mr2 Bundle bundle) {
        Object obj;
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f3328b = bundle.getInt(f3310f);
        iconCompat.f3330c = bundle.getInt(f3312g);
        iconCompat.f3329b = bundle.getString(f3318j);
        if (bundle.containsKey(f3314h)) {
            iconCompat.f3322a = (ColorStateList) bundle.getParcelable(f3314h);
        }
        if (bundle.containsKey(f3316i)) {
            iconCompat.f3323a = PorterDuff.Mode.valueOf(bundle.getString(f3316i));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable(f3308e);
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString(f3308e);
                break;
            case 3:
                iconCompat.f3325a = bundle.getByteArray(f3308e);
                break;
            default:
                Log.w(f3302c, "Unknown type " + i);
                return null;
        }
        iconCompat.f3325a = obj;
        return iconCompat;
    }

    @sj3(23)
    @ts2
    /* renamed from: n */
    public static IconCompat m3642n(@mr2 Context context, @mr2 Icon icon) {
        k43.m19455l(icon);
        return C0482a.m3673a(context, icon);
    }

    @sj3(23)
    @ts2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: o */
    public static IconCompat m3643o(@mr2 Icon icon) {
        return C0482a.m3674b(icon);
    }

    @sj3(23)
    @ts2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: p */
    public static IconCompat m3644p(@mr2 Icon icon) {
        if (C0482a.m3677e(icon) == 2 && C0482a.m3675c(icon) == 0) {
            return null;
        }
        return C0482a.m3674b(icon);
    }

    @hw4
    /* renamed from: q */
    public static Bitmap m3645q(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, C1824by.f10014p);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, C1824by.f10013o);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @mr2
    /* renamed from: r */
    public static IconCompat m3646r(@mr2 Bitmap bitmap) {
        ot2.m24059d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3325a = bitmap;
        return iconCompat;
    }

    @mr2
    /* renamed from: s */
    public static IconCompat m3647s(@mr2 Uri uri) {
        ot2.m24059d(uri);
        return m3648t(uri.toString());
    }

    @mr2
    /* renamed from: t */
    public static IconCompat m3648t(@mr2 String str) {
        ot2.m24059d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3325a = str;
        return iconCompat;
    }

    @mr2
    /* renamed from: u */
    public static IconCompat m3649u(@mr2 Bitmap bitmap) {
        ot2.m24059d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3325a = bitmap;
        return iconCompat;
    }

    @mr2
    /* renamed from: v */
    public static IconCompat m3650v(@mr2 Uri uri) {
        ot2.m24059d(uri);
        return m3651w(uri.toString());
    }

    @mr2
    /* renamed from: w */
    public static IconCompat m3651w(@mr2 String str) {
        ot2.m24059d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3325a = str;
        return iconCompat;
    }

    @mr2
    /* renamed from: x */
    public static IconCompat m3652x(@mr2 byte[] bArr, int i, int i2) {
        ot2.m24059d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f3325a = bArr;
        iconCompat.f3328b = i;
        iconCompat.f3330c = i2;
        return iconCompat;
    }

    @mr2
    /* renamed from: y */
    public static IconCompat m3653y(@mr2 Context context, @dp0 int i) {
        ot2.m24059d(context);
        return m3654z(context.getResources(), context.getPackageName(), i);
    }

    @mr2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: z */
    public static IconCompat m3654z(@ts2 Resources resources, @mr2 String str, @dp0 int i) {
        ot2.m24059d(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3328b = i;
            if (resources != null) {
                try {
                    iconCompat.f3325a = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3325a = str;
            }
            iconCompat.f3329b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: A */
    public Bitmap mo3773A() {
        int i = this.f3321a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3325a;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3325a;
        } else {
            if (i == 5) {
                return m3645q((Bitmap) this.f3325a, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    @dp0
    /* renamed from: B */
    public int mo3774B() {
        int i = this.f3321a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0482a.m3675c(this.f3325a);
        }
        if (i == 2) {
            return this.f3328b;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @mr2
    /* renamed from: C */
    public String mo3775C() {
        int i = this.f3321a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0482a.m3676d(this.f3325a);
        }
        if (i == 2) {
            String str = this.f3329b;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3325a).split(ar4.f25981a, -1)[0] : this.f3329b;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: E */
    public int mo3776E() {
        int i = this.f3321a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C0482a.m3677e(this.f3325a);
    }

    @mr2
    /* renamed from: F */
    public Uri mo3777F() {
        int i = this.f3321a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0482a.m3678f(this.f3325a);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3325a);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @ts2
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: G */
    public InputStream mo3778G(@mr2 Context context) {
        String str;
        StringBuilder sb;
        Uri F = mo3777F();
        String scheme = F.getScheme();
        if (FirebaseAnalytics.C4305d.f24947P.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(F);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(F);
                Log.w(f3302c, sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3325a));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(F);
                Log.w(f3302c, sb.toString(), e);
                return null;
            }
        }
    }

    @ts2
    /* renamed from: H */
    public Drawable mo3779H(@mr2 Context context) {
        mo3790l(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return C0482a.m3679g(mo3785N(context), context);
        }
        Drawable I = mo3780I(context);
        if (!(I == null || (this.f3322a == null && this.f3323a == f3300b))) {
            I.mutate();
            wo0.m30986o(I, this.f3322a);
            wo0.m30987p(I, this.f3323a);
        }
        return I;
    }

    /* renamed from: I */
    public final Drawable mo3780I(Context context) {
        switch (this.f3321a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3325a);
            case 2:
                String C = mo3775C();
                if (TextUtils.isEmpty(C)) {
                    C = context.getPackageName();
                }
                try {
                    return zk3.m33204g(m3639D(context, C), this.f3328b, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e(f3302c, String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f3328b), this.f3325a}), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3325a, this.f3328b, this.f3330c));
            case 4:
                InputStream G = mo3778G(context);
                if (G != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(G));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m3645q((Bitmap) this.f3325a, false));
            case 6:
                InputStream G2 = mo3778G(context);
                if (G2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? C0483b.m3681a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(G2))) : new BitmapDrawable(context.getResources(), m3645q(BitmapFactory.decodeStream(G2), false));
                }
                break;
        }
        return null;
    }

    @mr2
    /* renamed from: J */
    public IconCompat mo3781J(@d10 int i) {
        return mo3782K(ColorStateList.valueOf(i));
    }

    @mr2
    /* renamed from: K */
    public IconCompat mo3782K(@ts2 ColorStateList colorStateList) {
        this.f3322a = colorStateList;
        return this;
    }

    @mr2
    /* renamed from: L */
    public IconCompat mo3783L(@ts2 PorterDuff.Mode mode) {
        this.f3323a = mode;
        return this;
    }

    @mr2
    @sj3(23)
    @Deprecated
    /* renamed from: M */
    public Icon mo3784M() {
        return mo3785N((Context) null);
    }

    @mr2
    @sj3(23)
    /* renamed from: N */
    public Icon mo3785N(@ts2 Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0482a.m3680h(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    @mr2
    /* renamed from: a */
    public Bundle mo3786a() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f3321a) {
            case -1:
                parcelable = (Parcelable) this.f3325a;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.f3325a;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f3308e, (String) this.f3325a);
                break;
            case 3:
                bundle.putByteArray(f3308e, (byte[]) this.f3325a);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable(f3308e, parcelable);
        bundle.putInt("type", this.f3321a);
        bundle.putInt(f3310f, this.f3328b);
        bundle.putInt(f3312g, this.f3330c);
        bundle.putString(f3318j, this.f3329b);
        ColorStateList colorStateList = this.f3322a;
        if (colorStateList != null) {
            bundle.putParcelable(f3314h, colorStateList);
        }
        PorterDuff.Mode mode = this.f3323a;
        if (mode != f3300b) {
            bundle.putString(f3316i, mode.name());
        }
        return bundle;
    }

    /* renamed from: i */
    public void mo3787i() {
        Parcelable parcelable;
        this.f3323a = PorterDuff.Mode.valueOf(this.f3326a);
        switch (this.f3321a) {
            case -1:
                parcelable = this.f3324a;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f3324a;
                if (parcelable == null) {
                    byte[] bArr = this.f3327a;
                    this.f3325a = bArr;
                    this.f3321a = 3;
                    this.f3328b = 0;
                    this.f3330c = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3327a, Charset.forName(CharsetNames.UTF_16));
                this.f3325a = str;
                if (this.f3321a == 2 && this.f3329b == null) {
                    this.f3329b = str.split(ar4.f25981a, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3325a = this.f3327a;
                return;
            default:
                return;
        }
        this.f3325a = parcelable;
    }

    /* renamed from: j */
    public void mo3788j(boolean z) {
        this.f3326a = this.f3323a.name();
        switch (this.f3321a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3325a).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3327a = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3327a = ((String) this.f3325a).getBytes(Charset.forName(CharsetNames.UTF_16));
                return;
            case 3:
                this.f3327a = (byte[]) this.f3325a;
                return;
            case 4:
            case 6:
                this.f3327a = this.f3325a.toString().getBytes(Charset.forName(CharsetNames.UTF_16));
                return;
            default:
                return;
        }
        this.f3324a = (Parcelable) this.f3325a;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: k */
    public void mo3789k(@mr2 Intent intent, @ts2 Drawable drawable, @mr2 Context context) {
        Bitmap bitmap;
        mo3790l(context);
        int i = this.f3321a;
        if (i == 1) {
            bitmap = (Bitmap) this.f3325a;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(mo3775C(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f3328b));
                    return;
                }
                Drawable i2 = r70.m26356i(createPackageContext, this.f3328b);
                if (i2.getIntrinsicWidth() > 0) {
                    if (i2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(i2.getIntrinsicWidth(), i2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        i2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        i2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(C0358b.f1779e)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f3325a, e);
            }
        } else if (i == 5) {
            bitmap = m3645q((Bitmap) this.f3325a, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: l */
    public void mo3790l(@mr2 Context context) {
        Object obj;
        if (this.f3321a == 2 && (obj = this.f3325a) != null) {
            String str = (String) obj;
            if (str.contains(ar4.f25981a)) {
                String str2 = str.split(ar4.f25981a, -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(ar4.f25981a, -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i(f3302c, "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String C = mo3775C();
                int identifier = m3639D(context, C).getIdentifier(str4, str3, str5);
                if (this.f3328b != identifier) {
                    Log.i(f3302c, "Id has changed for " + C + " " + str);
                    this.f3328b = identifier;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f3321a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f3325a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f3321a
            java.lang.String r1 = m3640O(r1)
            r0.append(r1)
            int r1 = r4.f3321a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f3325a
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f3328b
            r0.append(r1)
            int r1 = r4.f3330c
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f3330c
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f3329b
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo3774B()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f3325a
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f3325a
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f3322a
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f3322a
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f3323a
            android.graphics.PorterDuff$Mode r2 = f3300b
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f3323a
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
