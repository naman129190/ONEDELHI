package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.onedelhi.secure.qv4;

/* renamed from: androidx.transition.k */
public class C1089k {

    /* renamed from: a */
    public static final int f5725a = 1048576;

    /* renamed from: a */
    public static final boolean f5726a = true;

    /* renamed from: b */
    public static final boolean f5727b = true;

    /* renamed from: c */
    public static final boolean f5728c;

    /* renamed from: androidx.transition.k$a */
    public static class C1090a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final Matrix f5729a = new Matrix();

        /* renamed from: a */
        public final float[] f5730a = new float[9];

        /* renamed from: b */
        public final float[] f5731b = new float[9];

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f5730a);
            matrix2.getValues(this.f5731b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f5731b;
                float f2 = fArr[i];
                float[] fArr2 = this.f5730a;
                fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            }
            this.f5729a.setValues(this.f5731b);
            return this.f5729a;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f5728c = z;
    }

    /* renamed from: a */
    public static View m7199a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        qv4.m26205j(view, matrix);
        qv4.m26206k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b = m7200b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m7200b(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
        /*
            boolean r0 = f5726a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r9.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r12 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            boolean r2 = r12.isAttachedToWindow()
            goto L_0x0015
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
        L_0x0015:
            boolean r3 = f5727b
            r4 = 0
            if (r3 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x001f
            return r4
        L_0x001f:
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r9)
            android.view.ViewGroupOverlay r5 = r12.getOverlay()
            r5.add(r9)
            goto L_0x0033
        L_0x0031:
            r1 = r4
            r2 = 0
        L_0x0033:
            float r5 = r11.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r11.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L_0x0099
            if (r6 <= 0) goto L_0x0099
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 1233125376(0x49800000, float:1048576.0)
            int r8 = r5 * r6
            float r8 = (float) r8
            float r7 = r7 / r8
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r11.left
            float r7 = -r7
            float r11 = r11.top
            float r11 = -r11
            r10.postTranslate(r7, r11)
            r10.postScale(r4, r4)
            boolean r11 = f5728c
            if (r11 == 0) goto L_0x0088
            android.graphics.Picture r11 = new android.graphics.Picture
            r11.<init>()
            android.graphics.Canvas r4 = r11.beginRecording(r5, r6)
            r4.concat(r10)
            r9.draw(r4)
            r11.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11)
            goto L_0x0099
        L_0x0088:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r11)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            r11.concat(r10)
            r9.draw(r11)
        L_0x0099:
            if (r3 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a7
            android.view.ViewGroupOverlay r10 = r12.getOverlay()
            r10.remove(r9)
            r1.addView(r9, r2)
        L_0x00a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1089k.m7200b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static Animator m7201c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
