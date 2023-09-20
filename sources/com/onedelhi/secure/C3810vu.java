package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a=\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aG\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aQ\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aI\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aI\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\""}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "block", "j", "", "x", "y", "o", "degrees", "pivotX", "pivotY", "h", "k", "m", "Landroid/graphics/Matrix;", "matrix", "f", "Landroid/graphics/Rect;", "clipRect", "d", "Landroid/graphics/RectF;", "e", "", "left", "top", "right", "bottom", "b", "a", "Landroid/graphics/Path;", "clipPath", "c", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.vu */
public final class C3810vu {
    /* renamed from: a */
    public static final void m30449a(@vr2 Canvas canvas, float f, float f2, float f3, float f4, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: b */
    public static final void m30450b(@vr2 Canvas canvas, int i, int i2, int i3, int i4, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: c */
    public static final void m30451c(@vr2 Canvas canvas, @vr2 Path path, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(path, "clipPath");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: d */
    public static final void m30452d(@vr2 Canvas canvas, @vr2 Rect rect, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(rect, "clipRect");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: e */
    public static final void m30453e(@vr2 Canvas canvas, @vr2 RectF rectF, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(rectF, "clipRect");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: f */
    public static final void m30454f(@vr2 Canvas canvas, @vr2 Matrix matrix, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(matrix, "matrix");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m30455g(Canvas canvas, Matrix matrix, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(matrix, "matrix");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: h */
    public static final void m30456h(@vr2 Canvas canvas, float f, float f2, float f3, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m30457i(Canvas canvas, float f, float f2, float f3, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: j */
    public static final void m30458j(@vr2 Canvas canvas, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: k */
    public static final void m30459k(@vr2 Canvas canvas, float f, float f2, float f3, float f4, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m30460l(Canvas canvas, float f, float f2, float f3, float f4, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: m */
    public static final void m30461m(@vr2 Canvas canvas, float f, float f2, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m30462n(Canvas canvas, float f, float f2, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: o */
    public static final void m30463o(@vr2 Canvas canvas, float f, float f2, @vr2 ec1<? super Canvas, un4> ec1) {
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m30464p(Canvas canvas, float f, float f2, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        jt1.m53777p(canvas, "<this>");
        jt1.m53777p(ec1, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ec1.mo17094X(canvas);
        } finally {
            uq1.m67403d(1);
            canvas.restoreToCount(save);
            uq1.m67402c(1);
        }
    }
}
