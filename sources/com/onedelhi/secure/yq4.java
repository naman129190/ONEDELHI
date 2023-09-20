package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

public final class yq4 {

    /* renamed from: a */
    public static final float f23291a = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: a */
    public static final int f23292a = 1000000000;

    /* renamed from: a */
    public static final Path f23293a = new Path();

    /* renamed from: a */
    public static final PathMeasure f23294a = new PathMeasure();

    /* renamed from: a */
    public static final float[] f23295a = new float[4];

    /* renamed from: b */
    public static float f23296b = -1.0f;

    /* renamed from: b */
    public static final Path f23297b = new Path();

    /* renamed from: a */
    public static void m32598a(Path path, float f, float f2, float f3) {
        h02.m16420a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f23294a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            h02.m16421b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            h02.m16421b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) hj2.m16791f(min, length);
                max = (float) hj2.m16791f(max, length);
            }
            if (min < 0.0f) {
                min = (float) hj2.m16791f(min, length);
            }
            if (max < 0.0f) {
                max = (float) hj2.m16791f(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
            } else {
                if (i >= 0) {
                    min -= length;
                }
                Path path2 = f23293a;
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    Path path3 = f23297b;
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                    path2.addPath(path3);
                } else if (min < 0.0f) {
                    Path path4 = f23297b;
                    path4.reset();
                    pathMeasure.getSegment(min + length, length, path4, true);
                    path2.addPath(path4);
                }
                path.set(path2);
            }
            h02.m16421b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m32599b(Path path, @ts2 ti4 ti4) {
        if (ti4 != null && !ti4.mo25122k()) {
            m32598a(path, ((z71) ti4.mo25120i()).mo27830o() / 100.0f, ((z71) ti4.mo25118d()).mo27830o() / 100.0f, ((z71) ti4.mo25119h()).mo27830o() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m32600c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m32601d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m32602e() {
        if (f23296b == -1.0f) {
            f23296b = Resources.getSystem().getDisplayMetrics().density;
        }
        return f23296b;
    }

    /* renamed from: f */
    public static float m32603f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m32604g(Matrix matrix) {
        float[] fArr = f23295a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f23291a;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m32605h(Matrix matrix) {
        float[] fArr = f23295a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* renamed from: i */
    public static int m32606i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m32607j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m32608k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m32609l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        i02 i02 = new i02();
        i02.setAntiAlias(true);
        i02.setColor(-16776961);
        canvas.drawPath(path, i02);
        return createBitmap;
    }

    /* renamed from: m */
    public static Bitmap m32610m(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: n */
    public static void m32611n(Canvas canvas, RectF rectF, Paint paint) {
        m32612o(canvas, rectF, paint, 31);
    }

    /* renamed from: o */
    public static void m32612o(Canvas canvas, RectF rectF, Paint paint, int i) {
        h02.m16420a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        h02.m16421b("Utils#saveLayer");
    }
}
