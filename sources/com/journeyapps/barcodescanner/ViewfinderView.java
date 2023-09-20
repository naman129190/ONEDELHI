package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.CameraPreview;
import com.onedelhi.secure.pz3;
import com.onedelhi.secure.sl3;
import com.onedelhi.secure.yd3;
import java.util.ArrayList;
import java.util.List;

public class ViewfinderView extends View {

    /* renamed from: a */
    public static final int[] f25636a = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b */
    public static final long f25637b = 80;

    /* renamed from: b */
    public static final String f25638b = ViewfinderView.class.getSimpleName();

    /* renamed from: s */
    public static final int f25639s = 160;

    /* renamed from: t */
    public static final int f25640t = 20;

    /* renamed from: u */
    public static final int f25641u = 6;

    /* renamed from: a */
    public Bitmap f25642a;

    /* renamed from: a */
    public final Paint f25643a = new Paint(1);

    /* renamed from: a */
    public Rect f25644a;

    /* renamed from: a */
    public CameraPreview f25645a;

    /* renamed from: a */
    public pz3 f25646a;

    /* renamed from: a */
    public List<sl3> f25647a;

    /* renamed from: b */
    public List<sl3> f25648b;

    /* renamed from: b */
    public boolean f25649b;

    /* renamed from: n */
    public int f25650n;

    /* renamed from: o */
    public final int f25651o;

    /* renamed from: p */
    public final int f25652p;

    /* renamed from: q */
    public final int f25653q;

    /* renamed from: r */
    public int f25654r;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    public class C4449a implements CameraPreview.C4446f {
        public C4449a() {
        }

        /* renamed from: a */
        public void mo30308a() {
        }

        /* renamed from: b */
        public void mo30309b() {
        }

        /* renamed from: c */
        public void mo30310c() {
            ViewfinderView.this.mo30349d();
            ViewfinderView.this.invalidate();
        }

        /* renamed from: d */
        public void mo30311d(Exception exc) {
        }

        /* renamed from: e */
        public void mo30312e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yd3.C7342m.zxing_finder);
        this.f25650n = obtainStyledAttributes.getColor(yd3.C7342m.zxing_finder_zxing_viewfinder_mask, resources.getColor(yd3.C7333d.zxing_viewfinder_mask));
        this.f25651o = obtainStyledAttributes.getColor(yd3.C7342m.zxing_finder_zxing_result_view, resources.getColor(yd3.C7333d.zxing_result_view));
        this.f25652p = obtainStyledAttributes.getColor(yd3.C7342m.zxing_finder_zxing_viewfinder_laser, resources.getColor(yd3.C7333d.zxing_viewfinder_laser));
        this.f25653q = obtainStyledAttributes.getColor(yd3.C7342m.zxing_finder_zxing_possible_result_points, resources.getColor(yd3.C7333d.zxing_possible_result_points));
        this.f25649b = obtainStyledAttributes.getBoolean(yd3.C7342m.zxing_finder_zxing_viewfinder_laser_visibility, true);
        obtainStyledAttributes.recycle();
        this.f25654r = 0;
        this.f25647a = new ArrayList(20);
        this.f25648b = new ArrayList(20);
    }

    /* renamed from: a */
    public void mo30346a(sl3 sl3) {
        if (this.f25647a.size() < 20) {
            this.f25647a.add(sl3);
        }
    }

    /* renamed from: b */
    public void mo30347b(Bitmap bitmap) {
        this.f25642a = bitmap;
        invalidate();
    }

    /* renamed from: c */
    public void mo30348c() {
        Bitmap bitmap = this.f25642a;
        this.f25642a = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    /* renamed from: d */
    public void mo30349d() {
        CameraPreview cameraPreview = this.f25645a;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            pz3 previewSize = this.f25645a.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f25644a = framingRect;
                this.f25646a = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        pz3 pz3;
        mo30349d();
        Rect rect = this.f25644a;
        if (rect != null && (pz3 = this.f25646a) != null) {
            int width = getWidth();
            int height = getHeight();
            this.f25643a.setColor(this.f25642a != null ? this.f25651o : this.f25650n);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f25643a);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f25643a);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f25643a);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f25643a);
            if (this.f25642a != null) {
                this.f25643a.setAlpha(160);
                canvas.drawBitmap(this.f25642a, (Rect) null, rect, this.f25643a);
                return;
            }
            if (this.f25649b) {
                this.f25643a.setColor(this.f25652p);
                Paint paint = this.f25643a;
                int[] iArr = f25636a;
                paint.setAlpha(iArr[this.f25654r]);
                this.f25654r = (this.f25654r + 1) % iArr.length;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f25643a);
            }
            float width2 = ((float) getWidth()) / ((float) pz3.f33850n);
            float height3 = ((float) getHeight()) / ((float) pz3.f33851o);
            if (!this.f25648b.isEmpty()) {
                this.f25643a.setAlpha(80);
                this.f25643a.setColor(this.f25653q);
                for (sl3 next : this.f25648b) {
                    canvas.drawCircle((float) ((int) (next.mo44403c() * width2)), (float) ((int) (next.mo44404d() * height3)), 3.0f, this.f25643a);
                }
                this.f25648b.clear();
            }
            if (!this.f25647a.isEmpty()) {
                this.f25643a.setAlpha(160);
                this.f25643a.setColor(this.f25653q);
                for (sl3 next2 : this.f25647a) {
                    canvas.drawCircle((float) ((int) (next2.mo44403c() * width2)), (float) ((int) (next2.mo44404d() * height3)), 6.0f, this.f25643a);
                }
                List<sl3> list = this.f25647a;
                List<sl3> list2 = this.f25648b;
                this.f25647a = list2;
                this.f25648b = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f25645a = cameraPreview;
        cameraPreview.mo30273i(new C4449a());
    }

    public void setLaserVisibility(boolean z) {
        this.f25649b = z;
    }

    public void setMaskColor(int i) {
        this.f25650n = i;
    }
}
