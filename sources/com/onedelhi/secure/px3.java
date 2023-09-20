package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

public abstract class px3 {

    /* renamed from: a */
    public static final int f18734a = 1048576;

    /* renamed from: a */
    public static final String f18735a = "sharedElement:snapshot:bitmap";

    /* renamed from: b */
    public static final String f18736b = "sharedElement:snapshot:imageScaleType";

    /* renamed from: c */
    public static final String f18737c = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a */
    public Matrix f18738a;

    /* renamed from: com.onedelhi.secure.px3$a */
    public interface C3197a {
        /* renamed from: a */
        void mo22686a();
    }

    /* renamed from: a */
    public static Bitmap m25066a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        int i2 = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    /* renamed from: b */
    public Parcelable mo22679b(View view, Matrix matrix, RectF rectF) {
        Bitmap a;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (!(drawable == null || background != null || (a = m25066a(drawable)) == null)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f18735a, a);
                bundle.putString(f18736b, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f18737c, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i = (int) (((float) round) * min);
        int i2 = (int) (((float) round2) * min);
        if (this.f18738a == null) {
            this.f18738a = new Matrix();
        }
        this.f18738a.set(matrix);
        this.f18738a.postTranslate(-rectF.left, -rectF.top);
        this.f18738a.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f18738a);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: c */
    public View mo22680c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f18735a);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f18736b)));
            if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                return imageView;
            }
            float[] floatArray = bundle.getFloatArray(f18737c);
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView.setImageMatrix(matrix);
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    /* renamed from: d */
    public void mo22681d(List<String> list, Map<String, View> map) {
    }

    /* renamed from: e */
    public void mo22682e(List<View> list) {
    }

    /* renamed from: f */
    public void mo22683f(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: g */
    public void mo22684g(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: h */
    public void mo22685h(List<String> list, List<View> list2, C3197a aVar) {
        aVar.mo22686a();
    }
}
