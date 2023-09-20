package p005me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.dn0;
import com.onedelhi.secure.ho1;
import p005me.dm7.barcodescanner.core.C7609a;

/* renamed from: me.dm7.barcodescanner.core.ViewFinderView */
public class ViewFinderView extends View implements ho1 {

    /* renamed from: a */
    public static final int[] f38821a = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b */
    public static final float f38822b = 0.75f;

    /* renamed from: b */
    public static final long f38823b = 80;

    /* renamed from: b */
    public static final String f38824b = "ViewFinderView";

    /* renamed from: c */
    public static final float f38825c = 0.75f;

    /* renamed from: d */
    public static final float f38826d = 0.625f;

    /* renamed from: e */
    public static final float f38827e = 1.4f;

    /* renamed from: f */
    public static final float f38828f = 0.625f;

    /* renamed from: v */
    public static final int f38829v = 50;

    /* renamed from: w */
    public static final int f38830w = 10;

    /* renamed from: a */
    public float f38831a;

    /* renamed from: a */
    public Paint f38832a;

    /* renamed from: a */
    public Rect f38833a;

    /* renamed from: b */
    public Paint f38834b;

    /* renamed from: b */
    public boolean f38835b;

    /* renamed from: c */
    public Paint f38836c;

    /* renamed from: c */
    public boolean f38837c;

    /* renamed from: n */
    public int f38838n;

    /* renamed from: o */
    public final int f38839o = getResources().getColor(C7609a.C7611b.viewfinder_laser);

    /* renamed from: p */
    public final int f38840p = getResources().getColor(C7609a.C7611b.viewfinder_mask);

    /* renamed from: q */
    public final int f38841q = getResources().getColor(C7609a.C7611b.viewfinder_border);

    /* renamed from: r */
    public final int f38842r = getResources().getInteger(C7609a.C7615f.viewfinder_border_width);

    /* renamed from: s */
    public final int f38843s = getResources().getInteger(C7609a.C7615f.viewfinder_border_length);

    /* renamed from: t */
    public int f38844t;

    /* renamed from: u */
    public int f38845u = 0;

    public ViewFinderView(Context context) {
        super(context);
        mo48936d();
    }

    public ViewFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo48936d();
    }

    /* renamed from: a */
    public void mo48933a(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Paint paint = this.f38832a;
        int[] iArr = f38821a;
        paint.setAlpha(iArr[this.f38838n]);
        this.f38838n = (this.f38838n + 1) % iArr.length;
        int height = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect((float) (framingRect.left + 2), (float) (height - 1), (float) (framingRect.right - 1), (float) (height + 2), this.f38832a);
        postInvalidateDelayed(80, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    /* renamed from: b */
    public void mo48934b(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Path path = new Path();
        path.moveTo((float) framingRect.left, (float) (framingRect.top + this.f38844t));
        path.lineTo((float) framingRect.left, (float) framingRect.top);
        path.lineTo((float) (framingRect.left + this.f38844t), (float) framingRect.top);
        canvas.drawPath(path, this.f38836c);
        path.moveTo((float) framingRect.right, (float) (framingRect.top + this.f38844t));
        path.lineTo((float) framingRect.right, (float) framingRect.top);
        path.lineTo((float) (framingRect.right - this.f38844t), (float) framingRect.top);
        canvas.drawPath(path, this.f38836c);
        path.moveTo((float) framingRect.right, (float) (framingRect.bottom - this.f38844t));
        path.lineTo((float) framingRect.right, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.right - this.f38844t), (float) framingRect.bottom);
        canvas.drawPath(path, this.f38836c);
        path.moveTo((float) framingRect.left, (float) (framingRect.bottom - this.f38844t));
        path.lineTo((float) framingRect.left, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.left + this.f38844t), (float) framingRect.bottom);
        canvas.drawPath(path, this.f38836c);
    }

    /* renamed from: c */
    public void mo48935c(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f = (float) width;
        canvas.drawRect(0.0f, 0.0f, f, (float) framingRect.top, this.f38834b);
        canvas.drawRect(0.0f, (float) framingRect.top, (float) framingRect.left, (float) (framingRect.bottom + 1), this.f38834b);
        Canvas canvas2 = canvas;
        float f2 = f;
        canvas2.drawRect((float) (framingRect.right + 1), (float) framingRect.top, f2, (float) (framingRect.bottom + 1), this.f38834b);
        canvas2.drawRect(0.0f, (float) (framingRect.bottom + 1), f2, (float) height, this.f38834b);
    }

    /* renamed from: d */
    public final void mo48936d() {
        Paint paint = new Paint();
        this.f38832a = paint;
        paint.setColor(this.f38839o);
        this.f38832a.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f38834b = paint2;
        paint2.setColor(this.f38840p);
        Paint paint3 = new Paint();
        this.f38836c = paint3;
        paint3.setColor(this.f38841q);
        this.f38836c.setStyle(Paint.Style.STROKE);
        this.f38836c.setStrokeWidth((float) this.f38842r);
        this.f38836c.setAntiAlias(true);
        this.f38844t = this.f38843s;
    }

    /* renamed from: e */
    public synchronized void mo48937e() {
        int i;
        int i2;
        Point point = new Point(getWidth(), getHeight());
        int a = dn0.m45377a(getContext());
        if (this.f38835b) {
            i2 = (int) (((float) (a != 1 ? getHeight() : getWidth())) * 0.625f);
            i = i2;
        } else if (a != 1) {
            int height = (int) (((float) getHeight()) * 0.625f);
            i = height;
            i2 = (int) (((float) height) * 1.4f);
        } else {
            i2 = (int) (((float) getWidth()) * 0.75f);
            i = (int) (((float) i2) * 0.75f);
        }
        if (i2 > getWidth()) {
            i2 = getWidth() - 50;
        }
        if (i > getHeight()) {
            i = getHeight() - 50;
        }
        int i3 = (point.x - i2) / 2;
        int i4 = (point.y - i) / 2;
        int i5 = this.f38845u;
        this.f38833a = new Rect(i3 + i5, i4 + i5, (i3 + i2) - i5, (i4 + i) - i5);
    }

    public Rect getFramingRect() {
        return this.f38833a;
    }

    public void onDraw(Canvas canvas) {
        if (getFramingRect() != null) {
            mo48935c(canvas);
            mo48934b(canvas);
            if (this.f38837c) {
                mo48933a(canvas);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo48937e();
    }

    public void setBorderAlpha(float f) {
        this.f38831a = f;
        this.f38836c.setAlpha((int) (255.0f * f));
    }

    public void setBorderColor(int i) {
        this.f38836c.setColor(i);
    }

    public void setBorderCornerRadius(int i) {
        this.f38836c.setPathEffect(new CornerPathEffect((float) i));
    }

    public void setBorderCornerRounded(boolean z) {
        Paint paint;
        Paint.Join join;
        if (z) {
            paint = this.f38836c;
            join = Paint.Join.ROUND;
        } else {
            paint = this.f38836c;
            join = Paint.Join.BEVEL;
        }
        paint.setStrokeJoin(join);
    }

    public void setBorderLineLength(int i) {
        this.f38844t = i;
    }

    public void setBorderStrokeWidth(int i) {
        this.f38836c.setStrokeWidth((float) i);
    }

    public void setLaserColor(int i) {
        this.f38832a.setColor(i);
    }

    public void setLaserEnabled(boolean z) {
        this.f38837c = z;
    }

    public void setMaskColor(int i) {
        this.f38834b.setColor(i);
    }

    public void setSquareViewFinder(boolean z) {
        this.f38835b = z;
    }

    public void setViewFinderOffset(int i) {
        this.f38845u = i;
    }

    public void setupViewFinder() {
        mo48937e();
        invalidate();
    }
}
