package com.onedelhi.secure;

import android.graphics.Matrix;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroid/graphics/Matrix;", "m", "e", "", "h", "", "tx", "ty", "f", "sx", "sy", "c", "degrees", "px", "py", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class tf2 {
    @vr2
    /* renamed from: a */
    public static final Matrix m28382a(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    /* renamed from: b */
    public static /* synthetic */ Matrix m28383b(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return m28382a(f, f2, f3);
    }

    @vr2
    /* renamed from: c */
    public static final Matrix m28384c(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    /* renamed from: d */
    public static /* synthetic */ Matrix m28385d(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return m28384c(f, f2);
    }

    @vr2
    /* renamed from: e */
    public static final Matrix m28386e(@vr2 Matrix matrix, @vr2 Matrix matrix2) {
        jt1.m53777p(matrix, "<this>");
        jt1.m53777p(matrix2, by2.f10023b);
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @vr2
    /* renamed from: f */
    public static final Matrix m28387f(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    /* renamed from: g */
    public static /* synthetic */ Matrix m28388g(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m28387f(f, f2);
    }

    @vr2
    /* renamed from: h */
    public static final float[] m28389h(@vr2 Matrix matrix) {
        jt1.m53777p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
