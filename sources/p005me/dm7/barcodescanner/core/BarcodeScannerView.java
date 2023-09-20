package p005me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.onedelhi.secure.C5564ht;
import com.onedelhi.secure.C7096vt;
import com.onedelhi.secure.C7183wt;
import com.onedelhi.secure.bf0;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.ho1;
import p005me.dm7.barcodescanner.core.C7609a;

/* renamed from: me.dm7.barcodescanner.core.BarcodeScannerView */
public abstract class BarcodeScannerView extends FrameLayout implements Camera.PreviewCallback {

    /* renamed from: a */
    public float f38788a = 1.0f;

    /* renamed from: a */
    public Rect f38789a;

    /* renamed from: a */
    public ho1 f38790a;

    /* renamed from: a */
    public C5564ht f38791a;

    /* renamed from: a */
    public C7183wt f38792a;

    /* renamed from: a */
    public Boolean f38793a;

    /* renamed from: a */
    public CameraPreview f38794a;

    /* renamed from: b */
    public float f38795b = 0.1f;

    /* renamed from: b */
    public boolean f38796b = true;

    /* renamed from: c */
    public boolean f38797c = true;

    /* renamed from: d */
    public boolean f38798d = true;

    /* renamed from: e */
    public boolean f38799e = false;

    /* renamed from: f */
    public boolean f38800f = false;
    @d10

    /* renamed from: n */
    public int f38801n = getResources().getColor(C7609a.C7611b.viewfinder_laser);
    @d10

    /* renamed from: o */
    public int f38802o = getResources().getColor(C7609a.C7611b.viewfinder_border);

    /* renamed from: p */
    public int f38803p = getResources().getColor(C7609a.C7611b.viewfinder_mask);

    /* renamed from: q */
    public int f38804q = getResources().getInteger(C7609a.C7615f.viewfinder_border_width);

    /* renamed from: r */
    public int f38805r = getResources().getInteger(C7609a.C7615f.viewfinder_border_length);

    /* renamed from: s */
    public int f38806s = 0;

    /* renamed from: t */
    public int f38807t = 0;

    public BarcodeScannerView(Context context) {
        super(context);
        mo48889d();
    }

    /* JADX INFO: finally extract failed */
    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7609a.C7619j.BarcodeScannerView, 0, 0);
        try {
            setShouldScaleToFill(obtainStyledAttributes.getBoolean(C7609a.C7619j.BarcodeScannerView_shouldScaleToFill, true));
            this.f38798d = obtainStyledAttributes.getBoolean(C7609a.C7619j.BarcodeScannerView_laserEnabled, this.f38798d);
            this.f38801n = obtainStyledAttributes.getColor(C7609a.C7619j.BarcodeScannerView_laserColor, this.f38801n);
            this.f38802o = obtainStyledAttributes.getColor(C7609a.C7619j.BarcodeScannerView_borderColor, this.f38802o);
            this.f38803p = obtainStyledAttributes.getColor(C7609a.C7619j.BarcodeScannerView_maskColor, this.f38803p);
            this.f38804q = obtainStyledAttributes.getDimensionPixelSize(C7609a.C7619j.BarcodeScannerView_borderWidth, this.f38804q);
            this.f38805r = obtainStyledAttributes.getDimensionPixelSize(C7609a.C7619j.BarcodeScannerView_borderLength, this.f38805r);
            this.f38799e = obtainStyledAttributes.getBoolean(C7609a.C7619j.BarcodeScannerView_roundedCorner, this.f38799e);
            this.f38806s = obtainStyledAttributes.getDimensionPixelSize(C7609a.C7619j.BarcodeScannerView_cornerRadius, this.f38806s);
            this.f38800f = obtainStyledAttributes.getBoolean(C7609a.C7619j.BarcodeScannerView_squaredFinder, this.f38800f);
            this.f38788a = obtainStyledAttributes.getFloat(C7609a.C7619j.BarcodeScannerView_borderAlpha, this.f38788a);
            this.f38807t = obtainStyledAttributes.getDimensionPixelSize(C7609a.C7619j.BarcodeScannerView_finderOffset, this.f38807t);
            obtainStyledAttributes.recycle();
            mo48889d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public ho1 mo48886a(Context context) {
        ViewFinderView viewFinderView = new ViewFinderView(context);
        viewFinderView.setBorderColor(this.f38802o);
        viewFinderView.setLaserColor(this.f38801n);
        viewFinderView.setLaserEnabled(this.f38798d);
        viewFinderView.setBorderStrokeWidth(this.f38804q);
        viewFinderView.setBorderLineLength(this.f38805r);
        viewFinderView.setMaskColor(this.f38803p);
        viewFinderView.setBorderCornerRounded(this.f38799e);
        viewFinderView.setBorderCornerRadius(this.f38806s);
        viewFinderView.setSquareViewFinder(this.f38800f);
        viewFinderView.setViewFinderOffset(this.f38807t);
        return viewFinderView;
    }

    /* renamed from: b */
    public synchronized Rect mo48887b(int i, int i2) {
        if (this.f38789a == null) {
            Rect framingRect = this.f38790a.getFramingRect();
            int width = this.f38790a.getWidth();
            int height = this.f38790a.getHeight();
            if (!(framingRect == null || width == 0)) {
                if (height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i < width) {
                        rect.left = (rect.left * i) / width;
                        rect.right = (rect.right * i) / width;
                    }
                    if (i2 < height) {
                        rect.top = (rect.top * i2) / height;
                        rect.bottom = (rect.bottom * i2) / height;
                    }
                    this.f38789a = rect;
                }
            }
            return null;
        }
        return this.f38789a;
    }

    /* renamed from: c */
    public byte[] mo48888c(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        int rotationCount = getRotationCount();
        if (rotationCount == 1 || rotationCount == 3) {
            int i3 = 0;
            while (i3 < rotationCount) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i4 = 0; i4 < i2; i4++) {
                    for (int i5 = 0; i5 < i; i5++) {
                        bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                    }
                }
                i3++;
                bArr = bArr2;
                int i6 = i;
                i = i2;
                i2 = i6;
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public final void mo48889d() {
        this.f38790a = mo48886a(getContext());
    }

    /* renamed from: e */
    public void mo48890e() {
        CameraPreview cameraPreview = this.f38794a;
        if (cameraPreview != null) {
            cameraPreview.mo48921l();
        }
    }

    /* renamed from: f */
    public void mo48891f() {
        mo48892g(C7096vt.m68509c());
    }

    /* renamed from: g */
    public void mo48892g(int i) {
        if (this.f38791a == null) {
            this.f38791a = new C5564ht(this);
        }
        this.f38791a.mo37546b(i);
    }

    public boolean getFlash() {
        C7183wt wtVar = this.f38792a;
        return wtVar != null && C7096vt.m68510d(wtVar.f37116a) && this.f38792a.f37116a.getParameters().getFlashMode().equals("torch");
    }

    public int getRotationCount() {
        return this.f38794a.getDisplayOrientation() / 90;
    }

    /* renamed from: h */
    public void mo48895h() {
        if (this.f38792a != null) {
            this.f38794a.mo48922m();
            this.f38794a.setCamera((C7183wt) null, (Camera.PreviewCallback) null);
            this.f38792a.f37116a.release();
            this.f38792a = null;
        }
        C5564ht htVar = this.f38791a;
        if (htVar != null) {
            htVar.quit();
            this.f38791a = null;
        }
    }

    /* renamed from: i */
    public void mo48896i() {
        CameraPreview cameraPreview = this.f38794a;
        if (cameraPreview != null) {
            cameraPreview.mo48922m();
        }
    }

    /* renamed from: j */
    public void mo48897j() {
        C7183wt wtVar = this.f38792a;
        if (wtVar != null && C7096vt.m68510d(wtVar.f37116a)) {
            Camera.Parameters parameters = this.f38792a.f37116a.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode(bf0.f26277e);
            } else {
                parameters.setFlashMode("torch");
            }
            this.f38792a.f37116a.setParameters(parameters);
        }
    }

    public void setAspectTolerance(float f) {
        this.f38795b = f;
    }

    public void setAutoFocus(boolean z) {
        this.f38796b = z;
        CameraPreview cameraPreview = this.f38794a;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void setBorderAlpha(float f) {
        this.f38788a = f;
        this.f38790a.setBorderAlpha(f);
        this.f38790a.setupViewFinder();
    }

    public void setBorderColor(int i) {
        this.f38802o = i;
        this.f38790a.setBorderColor(i);
        this.f38790a.setupViewFinder();
    }

    public void setBorderCornerRadius(int i) {
        this.f38806s = i;
        this.f38790a.setBorderCornerRadius(i);
        this.f38790a.setupViewFinder();
    }

    public void setBorderLineLength(int i) {
        this.f38805r = i;
        this.f38790a.setBorderLineLength(i);
        this.f38790a.setupViewFinder();
    }

    public void setBorderStrokeWidth(int i) {
        this.f38804q = i;
        this.f38790a.setBorderStrokeWidth(i);
        this.f38790a.setupViewFinder();
    }

    public void setFlash(boolean z) {
        String str;
        this.f38793a = Boolean.valueOf(z);
        C7183wt wtVar = this.f38792a;
        if (wtVar != null && C7096vt.m68510d(wtVar.f37116a)) {
            Camera.Parameters parameters = this.f38792a.f37116a.getParameters();
            if (z) {
                str = "torch";
                if (parameters.getFlashMode().equals(str)) {
                    return;
                }
            } else {
                String flashMode = parameters.getFlashMode();
                str = bf0.f26277e;
                if (flashMode.equals(str)) {
                    return;
                }
            }
            parameters.setFlashMode(str);
            this.f38792a.f37116a.setParameters(parameters);
        }
    }

    public void setIsBorderCornerRounded(boolean z) {
        this.f38799e = z;
        this.f38790a.setBorderCornerRounded(z);
        this.f38790a.setupViewFinder();
    }

    public void setLaserColor(int i) {
        this.f38801n = i;
        this.f38790a.setLaserColor(i);
        this.f38790a.setupViewFinder();
    }

    public void setLaserEnabled(boolean z) {
        this.f38798d = z;
        this.f38790a.setLaserEnabled(z);
        this.f38790a.setupViewFinder();
    }

    public void setMaskColor(int i) {
        this.f38803p = i;
        this.f38790a.setMaskColor(i);
        this.f38790a.setupViewFinder();
    }

    public void setShouldScaleToFill(boolean z) {
        this.f38797c = z;
    }

    public void setSquareViewFinder(boolean z) {
        this.f38800f = z;
        this.f38790a.setSquareViewFinder(z);
        this.f38790a.setupViewFinder();
    }

    public void setupCameraPreview(C7183wt wtVar) {
        this.f38792a = wtVar;
        if (wtVar != null) {
            setupLayout(wtVar);
            this.f38790a.setupViewFinder();
            Boolean bool = this.f38793a;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f38796b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: me.dm7.barcodescanner.core.CameraPreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: me.dm7.barcodescanner.core.CameraPreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: me.dm7.barcodescanner.core.CameraPreview} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupLayout(com.onedelhi.secure.C7183wt r3) {
        /*
            r2 = this;
            r2.removeAllViews()
            me.dm7.barcodescanner.core.CameraPreview r0 = new me.dm7.barcodescanner.core.CameraPreview
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3, r2)
            r2.f38794a = r0
            float r3 = r2.f38795b
            r0.setAspectTolerance(r3)
            me.dm7.barcodescanner.core.CameraPreview r3 = r2.f38794a
            boolean r0 = r2.f38797c
            r3.setShouldScaleToFill(r0)
            boolean r3 = r2.f38797c
            if (r3 != 0) goto L_0x0037
            android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
            r0 = 17
            r3.setGravity(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setBackgroundColor(r0)
            me.dm7.barcodescanner.core.CameraPreview r0 = r2.f38794a
            r3.addView(r0)
            goto L_0x0039
        L_0x0037:
            me.dm7.barcodescanner.core.CameraPreview r3 = r2.f38794a
        L_0x0039:
            r2.addView(r3)
            com.onedelhi.secure.ho1 r3 = r2.f38790a
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x0048
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
            return
        L_0x0048:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005me.dm7.barcodescanner.core.BarcodeScannerView.setupLayout(com.onedelhi.secure.wt):void");
    }
}
