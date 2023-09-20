package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ug4 {

    /* renamed from: a */
    public static final int f21362a = 6;

    /* renamed from: a */
    public static final Paint f21363a = new Paint(6);

    /* renamed from: a */
    public static final String f21364a = "TransformationUtils";

    /* renamed from: a */
    public static final Set<String> f21365a;

    /* renamed from: a */
    public static final Lock f21366a;

    /* renamed from: b */
    public static final int f21367b = 7;

    /* renamed from: b */
    public static final Paint f21368b = new Paint(7);

    /* renamed from: c */
    public static final Paint f21369c;

    /* renamed from: com.onedelhi.secure.ug4$a */
    public class C3707a implements C3709c {

        /* renamed from: a */
        public final /* synthetic */ int f21370a;

        public C3707a(int i) {
            this.f21370a = i;
        }

        /* renamed from: a */
        public void mo25614a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f21370a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.onedelhi.secure.ug4$b */
    public class C3708b implements C3709c {

        /* renamed from: a */
        public final /* synthetic */ float f21371a;

        /* renamed from: b */
        public final /* synthetic */ float f21372b;

        /* renamed from: c */
        public final /* synthetic */ float f21373c;

        /* renamed from: d */
        public final /* synthetic */ float f21374d;

        public C3708b(float f, float f2, float f3, float f4) {
            this.f21371a = f;
            this.f21372b = f2;
            this.f21373c = f3;
            this.f21374d = f4;
        }

        /* renamed from: a */
        public void mo25614a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f21371a;
            float f2 = this.f21372b;
            float f3 = this.f21373c;
            float f4 = this.f21374d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: com.onedelhi.secure.ug4$c */
    public interface C3709c {
        /* renamed from: a */
        void mo25614a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.onedelhi.secure.ug4$d */
    public static final class C3710d implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        @mr2
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, @mr2 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f21365a = hashSet;
        f21366a = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C3710d();
        Paint paint = new Paint(7);
        f21369c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m29329a(@mr2 Bitmap bitmap, @mr2 Bitmap bitmap2, Matrix matrix) {
        Lock lock = f21366a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f21363a);
            m29333e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f21366a.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m29330b(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = hmVar.mo17343d(i, i2, m29339k(bitmap));
        m29348t(bitmap, d);
        m29329a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: c */
    public static Bitmap m29331c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(f21364a, 2)) {
                Log.v(f21364a, "requested target size too big for input, fit centering instead");
            }
            return m29334f(hmVar, bitmap, i, i2);
        }
        if (Log.isLoggable(f21364a, 2)) {
            Log.v(f21364a, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m29332d(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m29335g(hmVar, bitmap);
        Bitmap d = hmVar.mo17343d(min, min, m29336h(bitmap));
        d.setHasAlpha(true);
        Lock lock = f21366a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawCircle(f2, f2, f2, f21368b);
            canvas.drawBitmap(g, (Rect) null, rectF, f21369c);
            m29333e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                hmVar.mo16798c(g);
            }
            return d;
        } catch (Throwable th) {
            f21366a.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m29333e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: f */
    public static Bitmap m29334f(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(f21364a, 2)) {
                Log.v(f21364a, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(f21364a, 2)) {
                Log.v(f21364a, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d = hmVar.mo17343d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m29339k(bitmap));
        m29348t(bitmap, d);
        if (Log.isLoggable(f21364a, 2)) {
            Log.v(f21364a, "request: " + i + "x" + i2);
            Log.v(f21364a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v(f21364a, "toReuse: " + d.getWidth() + "x" + d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v(f21364a, sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m29329a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: g */
    public static Bitmap m29335g(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap) {
        Bitmap.Config h = m29336h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = hmVar.mo17343d(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d;
    }

    @mr2
    /* renamed from: h */
    public static Bitmap.Config m29336h(@mr2 Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m29337i() {
        return f21366a;
    }

    /* renamed from: j */
    public static int m29338j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return C3527sn.f20441p;
            default:
                return 0;
        }
    }

    @mr2
    /* renamed from: k */
    public static Bitmap.Config m29339k(@mr2 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @hw4
    /* renamed from: l */
    public static void m29340l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: m */
    public static boolean m29341m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m29342n(@mr2 Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e) {
            if (!Log.isLoggable(f21364a, 6)) {
                return bitmap;
            }
            Log.e(f21364a, "Exception when trying to orient image", e);
            return bitmap;
        }
    }

    /* renamed from: o */
    public static Bitmap m29343o(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i) {
        if (!m29341m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m29340l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = hmVar.mo17343d(Math.round(rectF.width()), Math.round(rectF.height()), m29339k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m29329a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: p */
    public static Bitmap m29344p(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, float f, float f2, float f3, float f4) {
        return m29347s(hmVar, bitmap, new C3708b(f, f2, f3, f4));
    }

    /* renamed from: q */
    public static Bitmap m29345q(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i) {
        g43.m15506a(i > 0, "roundingRadius must be greater than 0.");
        return m29347s(hmVar, bitmap, new C3707a(i));
    }

    @Deprecated
    /* renamed from: r */
    public static Bitmap m29346r(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2, int i3) {
        return m29345q(hmVar, bitmap, i3);
    }

    /* renamed from: s */
    public static Bitmap m29347s(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, C3709c cVar) {
        Bitmap.Config h = m29336h(bitmap);
        Bitmap g = m29335g(hmVar, bitmap);
        Bitmap d = hmVar.mo17343d(g.getWidth(), g.getHeight(), h);
        d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) d.getWidth(), (float) d.getHeight());
        Lock lock = f21366a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.mo25614a(canvas, paint, rectF);
            m29333e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                hmVar.mo16798c(g);
            }
            return d;
        } catch (Throwable th) {
            f21366a.unlock();
            throw th;
        }
    }

    /* renamed from: t */
    public static void m29348t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
