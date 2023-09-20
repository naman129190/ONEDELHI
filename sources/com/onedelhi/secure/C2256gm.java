package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import easypay.appinvoke.manager.Constants;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\bø\u0001\u0000\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b\u001a7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\n\u001a\u0015\u0010\u001d\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001cH\n\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001e"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "block", "a", "", "x", "y", "h", "color", "k", "width", "height", "", "filter", "i", "Landroid/graphics/Bitmap$Config;", "config", "d", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "e", "Landroid/graphics/Point;", "p", "b", "Landroid/graphics/PointF;", "c", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.gm */
public final class C2256gm {
    @vr2
    /* renamed from: a */
    public static final Bitmap m15932a(@vr2 Bitmap bitmap, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(bitmap, "<this>");
        jt1.m53777p(ec1, "block");
        ec1.mo17094X(new Canvas(bitmap));
        return bitmap;
    }

    /* renamed from: b */
    public static final boolean m15933b(@vr2 Bitmap bitmap, @vr2 Point point) {
        int i;
        jt1.m53777p(bitmap, "<this>");
        jt1.m53777p(point, "p");
        int width = bitmap.getWidth();
        int i2 = point.x;
        return (i2 >= 0 && i2 < width) && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    /* renamed from: c */
    public static final boolean m15934c(@vr2 Bitmap bitmap, @vr2 PointF pointF) {
        jt1.m53777p(bitmap, "<this>");
        jt1.m53777p(pointF, "p");
        float f = pointF.x;
        if (f >= 0.0f && f < ((float) bitmap.getWidth())) {
            float f2 = pointF.y;
            return f2 >= 0.0f && f2 < ((float) bitmap.getHeight());
        }
    }

    @vr2
    /* renamed from: d */
    public static final Bitmap m15935d(int i, int i2, @vr2 Bitmap.Config config) {
        jt1.m53777p(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        jt1.m53776o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: e */
    public static final Bitmap m15936e(int i, int i2, @vr2 Bitmap.Config config, boolean z, @vr2 ColorSpace colorSpace) {
        jt1.m53777p(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        jt1.m53777p(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        jt1.m53776o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    /* renamed from: f */
    public static /* synthetic */ Bitmap m15937f(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        jt1.m53777p(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        jt1.m53776o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m15938g(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            jt1.m53776o(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        jt1.m53777p(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        jt1.m53777p(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        jt1.m53776o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    /* renamed from: h */
    public static final int m15939h(@vr2 Bitmap bitmap, int i, int i2) {
        jt1.m53777p(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    @vr2
    /* renamed from: i */
    public static final Bitmap m15940i(@vr2 Bitmap bitmap, int i, int i2, boolean z) {
        jt1.m53777p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        jt1.m53776o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    /* renamed from: j */
    public static /* synthetic */ Bitmap m15941j(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        jt1.m53777p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        jt1.m53776o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    /* renamed from: k */
    public static final void m15942k(@vr2 Bitmap bitmap, int i, int i2, @d10 int i3) {
        jt1.m53777p(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }
}
