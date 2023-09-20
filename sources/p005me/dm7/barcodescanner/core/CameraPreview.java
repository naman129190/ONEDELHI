package p005me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.onedelhi.secure.C3527sn;
import com.onedelhi.secure.C7183wt;
import com.onedelhi.secure.dn0;
import java.util.List;

/* renamed from: me.dm7.barcodescanner.core.CameraPreview */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: b */
    public static final String f38808b = "CameraPreview";

    /* renamed from: a */
    public float f38809a = 0.1f;

    /* renamed from: a */
    public Camera.AutoFocusCallback f38810a = new C7608b();

    /* renamed from: a */
    public Camera.PreviewCallback f38811a;

    /* renamed from: a */
    public Handler f38812a;

    /* renamed from: a */
    public C7183wt f38813a;

    /* renamed from: a */
    public Runnable f38814a = new C7607a();

    /* renamed from: b */
    public boolean f38815b = true;

    /* renamed from: c */
    public boolean f38816c = true;

    /* renamed from: d */
    public boolean f38817d = false;

    /* renamed from: e */
    public boolean f38818e = true;

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$a */
    public class C7607a implements Runnable {
        public C7607a() {
        }

        public void run() {
            if (CameraPreview.this.f38813a != null && CameraPreview.this.f38815b && CameraPreview.this.f38816c && CameraPreview.this.f38817d) {
                CameraPreview.this.mo48918i();
            }
        }
    }

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$b */
    public class C7608b implements Camera.AutoFocusCallback {
        public C7608b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            CameraPreview.this.mo48919j();
        }
    }

    public CameraPreview(Context context, AttributeSet attributeSet, C7183wt wtVar, Camera.PreviewCallback previewCallback) {
        super(context, attributeSet);
        mo48917h(wtVar, previewCallback);
    }

    public CameraPreview(Context context, C7183wt wtVar, Camera.PreviewCallback previewCallback) {
        super(context);
        mo48917h(wtVar, previewCallback);
    }

    private Camera.Size getOptimalPreviewSize() {
        C7183wt wtVar = this.f38813a;
        Camera.Size size = null;
        if (wtVar == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = wtVar.f37116a.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (dn0.m45377a(getContext()) == 1) {
            int i = height;
            height = width;
            width = i;
        }
        double d = ((double) width) / ((double) height);
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size next : supportedPreviewSizes) {
            if (Math.abs((((double) next.width) / ((double) next.height)) - d) <= ((double) this.f38809a) && ((double) Math.abs(next.height - height)) < d3) {
                d3 = (double) Math.abs(next.height - height);
                size = next;
            }
        }
        if (size == null) {
            for (Camera.Size next2 : supportedPreviewSizes) {
                if (((double) Math.abs(next2.height - height)) < d2) {
                    size = next2;
                    d2 = (double) Math.abs(next2.height - height);
                }
            }
        }
        return size;
    }

    /* renamed from: f */
    public final void mo48914f(Camera.Size size) {
        Point g = mo48915g(new Point(getWidth(), getHeight()));
        float f = ((float) size.width) / ((float) size.height);
        int i = g.x;
        int i2 = g.y;
        if (((float) i) / ((float) i2) > f) {
            i = (int) (((float) i2) * f);
        } else {
            i2 = (int) (((float) i) / f);
        }
        mo48920k(i, i2);
    }

    /* renamed from: g */
    public final Point mo48915g(Point point) {
        return getDisplayOrientation() % 180 == 0 ? point : new Point(point.y, point.x);
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.f38813a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.f38813a.f37115a;
        if (i2 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i2, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = C3527sn.f20441p;
            }
        }
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return (i3 == 1 ? 360 - ((i4 + i) % 360) : (i4 - i) + 360) % 360;
    }

    /* renamed from: h */
    public void mo48917h(C7183wt wtVar, Camera.PreviewCallback previewCallback) {
        setCamera(wtVar, previewCallback);
        this.f38812a = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    /* renamed from: i */
    public void mo48918i() {
        try {
            this.f38813a.f37116a.autoFocus(this.f38810a);
        } catch (RuntimeException unused) {
            mo48919j();
        }
    }

    /* renamed from: j */
    public final void mo48919j() {
        this.f38812a.postDelayed(this.f38814a, 1000);
    }

    /* renamed from: k */
    public final void mo48920k(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (this.f38818e) {
            float f = (float) i;
            float width = ((float) ((View) getParent()).getWidth()) / f;
            float f2 = (float) i2;
            float height = ((float) ((View) getParent()).getHeight()) / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    /* renamed from: l */
    public void mo48921l() {
        if (this.f38813a != null) {
            try {
                getHolder().addCallback(this);
                this.f38815b = true;
                setupCameraParameters();
                this.f38813a.f37116a.setPreviewDisplay(getHolder());
                this.f38813a.f37116a.setDisplayOrientation(getDisplayOrientation());
                this.f38813a.f37116a.setOneShotPreviewCallback(this.f38811a);
                this.f38813a.f37116a.startPreview();
                if (!this.f38816c) {
                    return;
                }
                if (this.f38817d) {
                    mo48918i();
                } else {
                    mo48919j();
                }
            } catch (Exception e) {
                Log.e(f38808b, e.toString(), e);
            }
        }
    }

    /* renamed from: m */
    public void mo48922m() {
        if (this.f38813a != null) {
            try {
                this.f38815b = false;
                getHolder().removeCallback(this);
                this.f38813a.f37116a.cancelAutoFocus();
                this.f38813a.f37116a.setOneShotPreviewCallback((Camera.PreviewCallback) null);
                this.f38813a.f37116a.stopPreview();
            } catch (Exception e) {
                Log.e(f38808b, e.toString(), e);
            }
        }
    }

    public void setAspectTolerance(float f) {
        this.f38809a = f;
    }

    public void setAutoFocus(boolean z) {
        if (this.f38813a != null && this.f38815b && z != this.f38816c) {
            this.f38816c = z;
            if (!z) {
                Log.v(f38808b, "Cancelling autofocus");
                this.f38813a.f37116a.cancelAutoFocus();
            } else if (this.f38817d) {
                Log.v(f38808b, "Starting autofocus");
                mo48918i();
            } else {
                mo48919j();
            }
        }
    }

    public void setCamera(C7183wt wtVar, Camera.PreviewCallback previewCallback) {
        this.f38813a = wtVar;
        this.f38811a = previewCallback;
    }

    public void setShouldScaleToFill(boolean z) {
        this.f38818e = z;
    }

    public void setupCameraParameters() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f38813a.f37116a.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f38813a.f37116a.setParameters(parameters);
        mo48914f(optimalPreviewSize);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() != null) {
            mo48922m();
            mo48921l();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f38817d = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f38817d = false;
        mo48922m();
    }
}
