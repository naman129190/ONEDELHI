package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.onedelhi.secure.dp1;
import com.onedelhi.secure.no0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class oo0 {

    /* renamed from: a */
    public static final C3078b f18035a = new C3077a();

    /* renamed from: a */
    public static final ow2<lf0> f18036a = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", lf0.f15361c);

    /* renamed from: a */
    public static final String f18037a = "Downsampler";

    /* renamed from: a */
    public static final Queue<BitmapFactory.Options> f18038a = oq4.m24018f(0);

    /* renamed from: a */
    public static final Set<String> f18039a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{f18041b, f18044c})));

    /* renamed from: b */
    public static final ow2<q43> f18040b = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", q43.SRGB);

    /* renamed from: b */
    public static final String f18041b = "image/vnd.wap.wbmp";

    /* renamed from: b */
    public static final Set<ImageHeaderParser.ImageType> f18042b = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    @Deprecated

    /* renamed from: c */
    public static final ow2<no0> f18043c = no0.f17493a;

    /* renamed from: c */
    public static final String f18044c = "image/x-ico";

    /* renamed from: d */
    public static final ow2<Boolean> f18045d;

    /* renamed from: e */
    public static final ow2<Boolean> f18046e;

    /* renamed from: a */
    public final DisplayMetrics f18047a;

    /* renamed from: a */
    public final gk1 f18048a = gk1.m15888d();

    /* renamed from: a */
    public final C2355hm f18049a;

    /* renamed from: a */
    public final C3131pa f18050a;

    /* renamed from: a */
    public final List<ImageHeaderParser> f18051a;

    /* renamed from: com.onedelhi.secure.oo0$a */
    public class C3077a implements C3078b {
        /* renamed from: a */
        public void mo15773a() {
        }

        /* renamed from: b */
        public void mo15774b(C2355hm hmVar, Bitmap bitmap) {
        }
    }

    /* renamed from: com.onedelhi.secure.oo0$b */
    public interface C3078b {
        /* renamed from: a */
        void mo15773a();

        /* renamed from: b */
        void mo15774b(C2355hm hmVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f18045d = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f18046e = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public oo0(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C2355hm hmVar, C3131pa paVar) {
        this.f18051a = list;
        this.f18047a = (DisplayMetrics) g43.m15509d(displayMetrics);
        this.f18049a = (C2355hm) g43.m15509d(hmVar);
        this.f18050a = (C3131pa) g43.m15509d(paVar);
    }

    /* renamed from: a */
    public static int m23930a(double d) {
        int l = m23935l(d);
        int x = m23944x(((double) l) * d);
        return m23944x((d / ((double) (((float) x) / ((float) l)))) * ((double) x));
    }

    /* renamed from: c */
    public static void m23931c(ImageHeaderParser.ImageType imageType, dp1 dp1, C3078b bVar, C2355hm hmVar, no0 no0, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ImageHeaderParser.ImageType imageType2 = imageType;
        no0 no02 = no0;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = f18037a;
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + imageType2 + " with target [" + i13 + str2 + i14 + "]");
                return;
            }
            return;
        }
        if (m23938r(i)) {
            i6 = i11;
            i7 = i12;
        } else {
            i7 = i11;
            i6 = i12;
        }
        float b = no02.mo21387b(i7, i6, i13, i14);
        if (b > 0.0f) {
            no0.C2993g a = no02.mo21386a(i7, i6, i13, i14);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m23944x((double) (b * f));
                int x2 = i6 / m23944x((double) (b * f2));
                no0.C2993g gVar = no0.C2993g.MEMORY;
                int max = a == gVar ? Math.max(x, x2) : Math.min(x, x2);
                int i15 = Build.VERSION.SDK_INT;
                String str3 = "x";
                String str4 = f18037a;
                if (i15 > 23 || !f18039a.contains(options2.outMimeType)) {
                    int max2 = Math.max(1, Integer.highestOneBit(max));
                    if (a == gVar && ((float) max2) < 1.0f / b) {
                        max2 <<= 1;
                    }
                    i8 = max2;
                } else {
                    i8 = 1;
                }
                options2.inSampleSize = i8;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i8, 8);
                    i9 = (int) Math.ceil((double) (f / min));
                    i10 = (int) Math.ceil((double) (f2 / min));
                    int i16 = i8 / 8;
                    if (i16 > 0) {
                        i9 /= i16;
                        i10 /= i16;
                    }
                } else {
                    if (!(imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A)) {
                        if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                            if (i15 >= 24) {
                                float f3 = (float) i8;
                                i9 = Math.round(f / f3);
                                i10 = Math.round(f2 / f3);
                            }
                        } else if (i7 % i8 == 0 && i6 % i8 == 0) {
                            i9 = i7 / i8;
                            i10 = i6 / i8;
                        } else {
                            int[] m = m23936m(dp1, options2, bVar, hmVar);
                            i9 = m[0];
                            i10 = m[1];
                        }
                    }
                    float f4 = (float) i8;
                    i9 = (int) Math.floor((double) (f / f4));
                    i10 = (int) Math.floor((double) (f2 / f4));
                }
                double b2 = (double) no02.mo21387b(i9, i10, i13, i14);
                options2.inTargetDensity = m23930a(b2);
                options2.inDensity = m23935l(b2);
                if (m23939s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str4;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i2);
                    String str6 = str3;
                    sb.append(str6);
                    sb.append(i3);
                    sb.append("], degreesToRotate: ");
                    sb.append(i);
                    sb.append(", target: [");
                    sb.append(i13);
                    sb.append(str6);
                    sb.append(i14);
                    sb.append("], power of two scaled: [");
                    sb.append(i9);
                    sb.append(str6);
                    sb.append(i10);
                    sb.append("], exact scale factor: ");
                    sb.append(b);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i8);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i17 = i11;
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + no02 + ", source: [" + i17 + str7 + i12 + "], target: [" + i13 + str7 + i14 + "]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m23932i(com.onedelhi.secure.dp1 r5, android.graphics.BitmapFactory.Options r6, com.onedelhi.secure.oo0.C3078b r7, com.onedelhi.secure.C2355hm r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo15773a()
            r5.mo14803b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.onedelhi.secure.ug4.m29337i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo14802a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.onedelhi.secure.ug4.m29337i()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m23941u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo16798c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m23932i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = com.onedelhi.secure.ug4.m29337i()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = com.onedelhi.secure.ug4.m29337i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oo0.m23932i(com.onedelhi.secure.dp1, android.graphics.BitmapFactory$Options, com.onedelhi.secure.oo0$b, com.onedelhi.secure.hm):android.graphics.Bitmap");
    }

    @TargetApi(19)
    @ts2
    /* renamed from: j */
    public static String m23933j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + pl2.f33727d);
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m23934k() {
        BitmapFactory.Options poll;
        synchronized (oo0.class) {
            Queue<BitmapFactory.Options> queue = f18038a;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m23943w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    public static int m23935l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m23936m(dp1 dp1, BitmapFactory.Options options, C3078b bVar, C2355hm hmVar) throws IOException {
        options.inJustDecodeBounds = true;
        m23932i(dp1, options, bVar, hmVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m23937n(BitmapFactory.Options options) {
        return m23933j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m23938r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23939s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oo0.m23939s(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: t */
    public static void m23940t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v(f18037a, "Decoded " + m23933j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m23937n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + j92.m18213a(j));
    }

    /* renamed from: u */
    public static IOException m23941u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m23937n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m23942v(BitmapFactory.Options options) {
        m23943w(options);
        Queue<BitmapFactory.Options> queue = f18038a;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m23943w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    public static int m23944x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    public static void m23945y(BitmapFactory.Options options, C2355hm hmVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = hmVar.mo17346g(i, i2, config);
    }

    /* renamed from: b */
    public final void mo22035b(dp1 dp1, lf0 lf0, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f18048a.mo16691k(i, i2, options, z, z2)) {
            if (lf0 != lf0.PREFER_ARGB_8888) {
                boolean z3 = false;
                try {
                    z3 = dp1.mo14804c().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable(f18037a, 3)) {
                        Log.d(f18037a, "Cannot determine whether the image has alpha or not from header, format " + lf0, e);
                    }
                }
                Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    @sj3(21)
    /* renamed from: d */
    public ck3<Bitmap> mo22036d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, zw2 zw2) throws IOException {
        return mo22037e(new dp1.C1987b(parcelFileDescriptor, this.f18051a, this.f18050a), i, i2, zw2, f18035a);
    }

    /* renamed from: e */
    public final ck3<Bitmap> mo22037e(dp1 dp1, int i, int i2, zw2 zw2, C3078b bVar) throws IOException {
        zw2 zw22 = zw2;
        byte[] bArr = (byte[]) this.f18050a.mo18216d(65536, byte[].class);
        BitmapFactory.Options k = m23934k();
        k.inTempStorage = bArr;
        lf0 lf0 = (lf0) zw22.mo28148c(f18036a);
        q43 q43 = (q43) zw22.mo28148c(f18040b);
        no0 no0 = (no0) zw22.mo28148c(no0.f17493a);
        boolean booleanValue = ((Boolean) zw22.mo28148c(f18045d)).booleanValue();
        ow2 ow2 = f18046e;
        try {
            return C2768lm.m20843f(mo22040h(dp1, k, no0, lf0, q43, zw22.mo28148c(ow2) != null && ((Boolean) zw22.mo28148c(ow2)).booleanValue(), i, i2, booleanValue, bVar), this.f18049a);
        } finally {
            m23942v(k);
            this.f18050a.mo18218f(bArr);
        }
    }

    /* renamed from: f */
    public ck3<Bitmap> mo22038f(InputStream inputStream, int i, int i2, zw2 zw2) throws IOException {
        return mo22039g(inputStream, i, i2, zw2, f18035a);
    }

    /* renamed from: g */
    public ck3<Bitmap> mo22039g(InputStream inputStream, int i, int i2, zw2 zw2, C3078b bVar) throws IOException {
        return mo22037e(new dp1.C1986a(inputStream, this.f18051a, this.f18050a), i, i2, zw2, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0160, code lost:
        if (r0 >= 26) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0191  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo22040h(com.onedelhi.secure.dp1 r29, android.graphics.BitmapFactory.Options r30, com.onedelhi.secure.no0 r31, com.onedelhi.secure.lf0 r32, com.onedelhi.secure.q43 r33, boolean r34, int r35, int r36, boolean r37, com.onedelhi.secure.oo0.C3078b r38) throws java.io.IOException {
        /*
            r28 = this;
            r8 = r28
            r7 = r29
            r6 = r30
            r5 = r38
            long r20 = com.onedelhi.secure.j92.m18214b()
            com.onedelhi.secure.hm r0 = r8.f18049a
            int[] r0 = m23936m(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r3 = 1
            r2 = r0[r3]
            java.lang.String r1 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L_0x0024
            if (r2 != r0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r23 = r34
            goto L_0x0026
        L_0x0024:
            r23 = 0
        L_0x0026:
            int r0 = r29.mo14805d()
            int r14 = com.onedelhi.secure.ug4.m29338j(r0)
            boolean r24 = com.onedelhi.secure.ug4.m29341m(r0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r35
            if (r15 != r9) goto L_0x0046
            boolean r10 = m23938r(r14)
            r13 = r36
            if (r10 == 0) goto L_0x0043
            r25 = r2
            goto L_0x004a
        L_0x0043:
            r25 = r4
            goto L_0x004a
        L_0x0046:
            r13 = r36
            r25 = r15
        L_0x004a:
            if (r13 != r9) goto L_0x0058
            boolean r9 = m23938r(r14)
            if (r9 == 0) goto L_0x0055
            r26 = r4
            goto L_0x005a
        L_0x0055:
            r26 = r2
            goto L_0x005a
        L_0x0058:
            r26 = r13
        L_0x005a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = r29.mo14804c()
            com.onedelhi.secure.hm r11 = r8.f18049a
            r9 = r12
            r10 = r29
            r16 = r11
            r11 = r38
            r27 = r12
            r12 = r16
            r13 = r31
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r26
            r19 = r30
            m23931c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            r0 = r28
            r11 = r1
            r1 = r29
            r10 = r2
            r2 = r32
            r9 = 1
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r30
            r14 = r6
            r6 = r25
            r7 = r26
            r0.mo22035b(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r14.inSampleSize
            r1 = r27
            boolean r1 = r8.mo22044z(r1)
            java.lang.String r3 = "Downsampler"
            if (r1 == 0) goto L_0x0142
            if (r12 < 0) goto L_0x00ae
            if (r10 < 0) goto L_0x00ae
            if (r37 == 0) goto L_0x00ae
            r6 = r3
            r2 = r25
            r3 = r26
            goto L_0x0138
        L_0x00ae:
            boolean r1 = m23939s(r30)
            if (r1 == 0) goto L_0x00bc
            int r1 = r14.inTargetDensity
            float r1 = (float) r1
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r1 = r1 / r4
            goto L_0x00be
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x00be:
            int r4 = r14.inSampleSize
            float r5 = (float) r12
            float r6 = (float) r4
            float r5 = r5 / r6
            r32 = r3
            double r2 = (double) r5
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r3 = (float) r10
            float r3 = r3 / r6
            double r5 = (double) r3
            double r5 = java.lang.Math.ceil(r5)
            int r3 = (int) r5
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            r6 = r32
            r5 = 2
            boolean r7 = android.util.Log.isLoggable(r6, r5)
            if (r7 == 0) goto L_0x0138
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Calculated target ["
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = "x"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r9 = "] for source ["
            r5.append(r9)
            r5.append(r12)
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = "], sampleSize: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = ", targetDensity: "
            r5.append(r4)
            int r4 = r14.inTargetDensity
            r5.append(r4)
            java.lang.String r4 = ", density: "
            r5.append(r4)
            int r4 = r14.inDensity
            r5.append(r4)
            java.lang.String r4 = ", density multiplier: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.v(r6, r1)
        L_0x0138:
            if (r2 <= 0) goto L_0x0143
            if (r3 <= 0) goto L_0x0143
            com.onedelhi.secure.hm r1 = r8.f18049a
            m23945y(r14, r1, r2, r3)
            goto L_0x0143
        L_0x0142:
            r6 = r3
        L_0x0143:
            r1 = 28
            if (r0 < r1) goto L_0x015e
            com.onedelhi.secure.q43 r0 = com.onedelhi.secure.q43.DISPLAY_P3
            r1 = r33
            if (r1 != r0) goto L_0x0159
            android.graphics.ColorSpace r0 = r14.outColorSpace
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0159
            r22 = 1
        L_0x0159:
            if (r22 == 0) goto L_0x0162
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0164
        L_0x015e:
            r1 = 26
            if (r0 < r1) goto L_0x016a
        L_0x0162:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0164:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
        L_0x016a:
            com.onedelhi.secure.hm r0 = r8.f18049a
            r1 = r29
            android.graphics.Bitmap r0 = m23932i(r1, r14, r13, r0)
            com.onedelhi.secure.hm r1 = r8.f18049a
            r13.mo15774b(r1, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L_0x018d
            r9 = r12
            r12 = r30
            r13 = r0
            r14 = r35
            r1 = r15
            r15 = r36
            r16 = r20
            m23940t(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x018e
        L_0x018d:
            r1 = r15
        L_0x018e:
            r2 = 0
            if (r0 == 0) goto L_0x01a9
            android.util.DisplayMetrics r2 = r8.f18047a
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            com.onedelhi.secure.hm r2 = r8.f18049a
            android.graphics.Bitmap r2 = com.onedelhi.secure.ug4.m29343o(r2, r0, r1)
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L_0x01a9
            com.onedelhi.secure.hm r1 = r8.f18049a
            r1.mo16798c(r0)
        L_0x01a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oo0.mo22040h(com.onedelhi.secure.dp1, android.graphics.BitmapFactory$Options, com.onedelhi.secure.no0, com.onedelhi.secure.lf0, com.onedelhi.secure.q43, boolean, int, int, boolean, com.onedelhi.secure.oo0$b):android.graphics.Bitmap");
    }

    /* renamed from: o */
    public boolean mo22041o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m7613a();
    }

    /* renamed from: p */
    public boolean mo22042p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo22043q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean mo22044z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
