package com.onedelhi.secure;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class cp1 extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f10460a = new Matrix();

    public cp1() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @mr2
    /* renamed from: a */
    public Matrix get(@mr2 ImageView imageView) {
        this.f10460a.set(imageView.getImageMatrix());
        return this.f10460a;
    }

    /* renamed from: b */
    public void set(@mr2 ImageView imageView, @mr2 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
