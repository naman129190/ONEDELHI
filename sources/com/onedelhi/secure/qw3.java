package com.onedelhi.secure;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "block", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class qw3 {
    /* renamed from: a */
    public static final void m26212a(@vr2 Shader shader, @vr2 ec1<? super Matrix, un4> ec1) {
        jt1.m53777p(shader, "<this>");
        jt1.m53777p(ec1, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        ec1.mo17094X(matrix);
        shader.setLocalMatrix(matrix);
    }
}
