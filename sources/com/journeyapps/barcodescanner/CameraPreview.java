package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.onedelhi.secure.C6137mt;
import com.onedelhi.secure.C6301ot;
import com.onedelhi.secure.C6308ov;
import com.onedelhi.secure.C6470pt;
import com.onedelhi.secure.C6596qt;
import com.onedelhi.secure.C6712rt;
import com.onedelhi.secure.d71;
import com.onedelhi.secure.fn3;
import com.onedelhi.secure.gn3;
import com.onedelhi.secure.k71;
import com.onedelhi.secure.pq4;
import com.onedelhi.secure.pz3;
import com.onedelhi.secure.v43;
import com.onedelhi.secure.yd3;
import com.onedelhi.secure.zm0;
import java.util.ArrayList;
import java.util.List;

public class CameraPreview extends ViewGroup {

    /* renamed from: b */
    public static final String f25595b = CameraPreview.class.getSimpleName();

    /* renamed from: o */
    public static final int f25596o = 250;

    /* renamed from: a */
    public double f25597a = 0.1d;

    /* renamed from: a */
    public Rect f25598a;

    /* renamed from: a */
    public final Handler.Callback f25599a = new C4443c();

    /* renamed from: a */
    public Handler f25600a;

    /* renamed from: a */
    public final SurfaceHolder.Callback f25601a = new C4442b();

    /* renamed from: a */
    public SurfaceView f25602a;

    /* renamed from: a */
    public TextureView f25603a;

    /* renamed from: a */
    public WindowManager f25604a;

    /* renamed from: a */
    public final C4446f f25605a = new C4445e();

    /* renamed from: a */
    public fn3 f25606a = new C4444d();

    /* renamed from: a */
    public gn3 f25607a;

    /* renamed from: a */
    public C6137mt f25608a;

    /* renamed from: a */
    public pz3 f25609a;

    /* renamed from: a */
    public C6596qt f25610a = new C6596qt();

    /* renamed from: a */
    public v43 f25611a = null;

    /* renamed from: a */
    public zm0 f25612a;

    /* renamed from: a */
    public List<C4446f> f25613a = new ArrayList();

    /* renamed from: b */
    public Rect f25614b = null;

    /* renamed from: b */
    public pz3 f25615b;

    /* renamed from: b */
    public boolean f25616b = false;

    /* renamed from: c */
    public Rect f25617c = null;

    /* renamed from: c */
    public pz3 f25618c;

    /* renamed from: c */
    public boolean f25619c = false;

    /* renamed from: d */
    public pz3 f25620d = null;

    /* renamed from: d */
    public boolean f25621d = false;

    /* renamed from: n */
    public int f25622n = -1;

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$a */
    public class C4441a implements TextureView.SurfaceTextureListener {
        public C4441a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            pz3 unused = CameraPreview.this.f25618c = new pz3(i, i2);
            CameraPreview.this.mo30263E();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$b */
    public class C4442b implements SurfaceHolder.Callback {
        public C4442b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(CameraPreview.f25595b, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            pz3 unused = CameraPreview.this.f25618c = new pz3(i2, i3);
            CameraPreview.this.mo30263E();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            pz3 unused = CameraPreview.this.f25618c = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$c */
    public class C4443c implements Handler.Callback {
        public C4443c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == yd3.C7336g.zxing_prewiew_size_ready) {
                CameraPreview.this.mo30298y((pz3) message.obj);
                return true;
            } else if (i == yd3.C7336g.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.mo30287s()) {
                    return false;
                }
                CameraPreview.this.mo30256w();
                CameraPreview.this.f25605a.mo30311d(exc);
                return false;
            } else if (i != yd3.C7336g.zxing_camera_closed) {
                return false;
            } else {
                CameraPreview.this.f25605a.mo30309b();
                return false;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$d */
    public class C4444d implements fn3 {
        public C4444d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m35557c() {
            CameraPreview.this.mo30260B();
        }

        /* renamed from: a */
        public void mo30307a(int i) {
            CameraPreview.this.f25600a.postDelayed(new C6470pt(this), 250);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$e */
    public class C4445e implements C4446f {
        public C4445e() {
        }

        /* renamed from: a */
        public void mo30308a() {
            for (C4446f a : CameraPreview.this.f25613a) {
                a.mo30308a();
            }
        }

        /* renamed from: b */
        public void mo30309b() {
            for (C4446f b : CameraPreview.this.f25613a) {
                b.mo30309b();
            }
        }

        /* renamed from: c */
        public void mo30310c() {
            for (C4446f c : CameraPreview.this.f25613a) {
                c.mo30310c();
            }
        }

        /* renamed from: d */
        public void mo30311d(Exception exc) {
            for (C4446f d : CameraPreview.this.f25613a) {
                d.mo30311d(exc);
            }
        }

        /* renamed from: e */
        public void mo30312e() {
            for (C4446f e : CameraPreview.this.f25613a) {
                e.mo30312e();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$f */
    public interface C4446f {
        /* renamed from: a */
        void mo30308a();

        /* renamed from: b */
        void mo30309b();

        /* renamed from: c */
        void mo30310c();

        /* renamed from: d */
        void mo30311d(Exception exc);

        /* renamed from: e */
        void mo30312e();
    }

    public CameraPreview(Context context) {
        super(context);
        mo30285q(context, (AttributeSet) null, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30285q(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30285q(context, attributeSet, i, 0);
    }

    private int getDisplayRotation() {
        return this.f25604a.getDefaultDisplay().getRotation();
    }

    /* renamed from: A */
    public void mo30259A() {
        pq4.m61624a();
        Log.d(f25595b, "resume()");
        mo30284p();
        if (this.f25618c != null) {
            mo30263E();
        } else {
            SurfaceView surfaceView = this.f25602a;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f25601a);
            } else {
                TextureView textureView = this.f25603a;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        mo30264F().onSurfaceTextureAvailable(this.f25603a.getSurfaceTexture(), this.f25603a.getWidth(), this.f25603a.getHeight());
                    } else {
                        this.f25603a.setSurfaceTextureListener(mo30264F());
                    }
                }
            }
        }
        requestLayout();
        this.f25607a.mo36797e(getContext(), this.f25606a);
    }

    /* renamed from: B */
    public final void mo30260B() {
        if (mo30287s() && getDisplayRotation() != this.f25622n) {
            mo30256w();
            mo30259A();
        }
    }

    /* renamed from: C */
    public final void mo30261C() {
        View view;
        if (this.f25616b) {
            TextureView textureView = new TextureView(getContext());
            this.f25603a = textureView;
            textureView.setSurfaceTextureListener(mo30264F());
            view = this.f25603a;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f25602a = surfaceView;
            surfaceView.getHolder().addCallback(this.f25601a);
            view = this.f25602a;
        }
        addView(view);
    }

    /* renamed from: D */
    public final void mo30262D(C6712rt rtVar) {
        if (!this.f25619c && this.f25608a != null) {
            Log.i(f25595b, "Starting preview");
            this.f25608a.mo40764I(rtVar);
            this.f25608a.mo40767L();
            this.f25619c = true;
            mo30257z();
            this.f25605a.mo30312e();
        }
    }

    /* renamed from: E */
    public final void mo30263E() {
        Rect rect;
        C6712rt rtVar;
        pz3 pz3 = this.f25618c;
        if (pz3 != null && this.f25615b != null && (rect = this.f25598a) != null) {
            if (this.f25602a == null || !pz3.equals(new pz3(rect.width(), this.f25598a.height()))) {
                TextureView textureView = this.f25603a;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f25615b != null) {
                        this.f25603a.setTransform(mo30276l(new pz3(this.f25603a.getWidth(), this.f25603a.getHeight()), this.f25615b));
                    }
                    rtVar = new C6712rt(this.f25603a.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                rtVar = new C6712rt(this.f25602a.getHolder());
            }
            mo30262D(rtVar);
        }
    }

    @TargetApi(14)
    /* renamed from: F */
    public final TextureView.SurfaceTextureListener mo30264F() {
        return new C4441a();
    }

    public C6137mt getCameraInstance() {
        return this.f25608a;
    }

    public C6596qt getCameraSettings() {
        return this.f25610a;
    }

    public Rect getFramingRect() {
        return this.f25614b;
    }

    public pz3 getFramingRectSize() {
        return this.f25620d;
    }

    public double getMarginFraction() {
        return this.f25597a;
    }

    public Rect getPreviewFramingRect() {
        return this.f25617c;
    }

    public v43 getPreviewScalingStrategy() {
        v43 v43 = this.f25611a;
        return v43 != null ? v43 : this.f25603a != null ? new C6308ov() : new d71();
    }

    public pz3 getPreviewSize() {
        return this.f25615b;
    }

    /* renamed from: i */
    public void mo30273i(C4446f fVar) {
        this.f25613a.add(fVar);
    }

    /* renamed from: j */
    public final void mo30274j() {
        pz3 pz3;
        zm0 zm0;
        pz3 pz32 = this.f25609a;
        if (pz32 == null || (pz3 = this.f25615b) == null || (zm0 = this.f25612a) == null) {
            this.f25617c = null;
            this.f25614b = null;
            this.f25598a = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = pz3.f33850n;
        int i2 = pz3.f33851o;
        int i3 = pz32.f33850n;
        int i4 = pz32.f33851o;
        Rect f = zm0.mo48326f(pz3);
        if (f.width() > 0 && f.height() > 0) {
            this.f25598a = f;
            this.f25614b = mo30275k(new Rect(0, 0, i3, i4), this.f25598a);
            Rect rect = new Rect(this.f25614b);
            Rect rect2 = this.f25598a;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i) / this.f25598a.width(), (rect.top * i2) / this.f25598a.height(), (rect.right * i) / this.f25598a.width(), (rect.bottom * i2) / this.f25598a.height());
            this.f25617c = rect3;
            if (rect3.width() <= 0 || this.f25617c.height() <= 0) {
                this.f25617c = null;
                this.f25614b = null;
                Log.w(f25595b, "Preview frame is too small");
                return;
            }
            this.f25605a.mo30310c();
        }
    }

    /* renamed from: k */
    public Rect mo30275k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f25620d != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f25620d.f33850n) / 2), Math.max(0, (rect3.height() - this.f25620d.f33851o) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.f25597a, ((double) rect3.height()) * this.f25597a);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* renamed from: l */
    public Matrix mo30276l(pz3 pz3, pz3 pz32) {
        float f;
        float f2 = ((float) pz3.f33850n) / ((float) pz3.f33851o);
        float f3 = ((float) pz32.f33850n) / ((float) pz32.f33851o);
        float f4 = 1.0f;
        if (f2 < f3) {
            f4 = f3 / f2;
            f = 1.0f;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = pz3.f33850n;
        int i2 = pz3.f33851o;
        matrix.postTranslate((((float) i) - (((float) i) * f4)) / 2.0f, (((float) i2) - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* renamed from: m */
    public void mo30277m(C6301ot otVar) {
        C6137mt mtVar = this.f25608a;
        if (mtVar != null) {
            mtVar.mo40769m(otVar);
        }
    }

    /* renamed from: n */
    public final void mo30278n(pz3 pz3) {
        this.f25609a = pz3;
        C6137mt mtVar = this.f25608a;
        if (mtVar != null && mtVar.mo40776t() == null) {
            zm0 zm0 = new zm0(getDisplayRotation(), pz3);
            this.f25612a = zm0;
            zm0.mo48327g(getPreviewScalingStrategy());
            this.f25608a.mo40762G(this.f25612a);
            this.f25608a.mo40771o();
            boolean z = this.f25621d;
            if (z) {
                this.f25608a.mo40766K(z);
            }
        }
    }

    /* renamed from: o */
    public C6137mt mo30279o() {
        C6137mt mtVar = new C6137mt(getContext());
        mtVar.mo40761F(this.f25610a);
        return mtVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo30261C();
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo30278n(new pz3(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f25602a;
        if (surfaceView != null) {
            Rect rect = this.f25598a;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f25603a;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f25621d);
        return bundle;
    }

    /* renamed from: p */
    public final void mo30284p() {
        if (this.f25608a != null) {
            Log.w(f25595b, "initCamera called twice");
            return;
        }
        C6137mt o = mo30279o();
        this.f25608a = o;
        o.mo40763H(this.f25600a);
        this.f25608a.mo40759D();
        this.f25622n = getDisplayRotation();
    }

    /* renamed from: q */
    public final void mo30285q(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        mo30286r(attributeSet);
        this.f25604a = (WindowManager) context.getSystemService("window");
        this.f25600a = new Handler(this.f25599a);
        this.f25607a = new gn3();
    }

    /* renamed from: r */
    public void mo30286r(AttributeSet attributeSet) {
        v43 k71;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yd3.C7342m.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(yd3.C7342m.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(yd3.C7342m.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f25620d = new pz3(dimension, dimension2);
        }
        this.f25616b = obtainStyledAttributes.getBoolean(yd3.C7342m.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(yd3.C7342m.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            k71 = new C6308ov();
        } else if (integer == 2) {
            k71 = new d71();
        } else {
            if (integer == 3) {
                k71 = new k71();
            }
            obtainStyledAttributes.recycle();
        }
        this.f25611a = k71;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: s */
    public boolean mo30287s() {
        return this.f25608a != null;
    }

    public void setCameraSettings(C6596qt qtVar) {
        this.f25610a = qtVar;
    }

    public void setFramingRectSize(pz3 pz3) {
        this.f25620d = pz3;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f25597a = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(v43 v43) {
        this.f25611a = v43;
    }

    public void setTorch(boolean z) {
        this.f25621d = z;
        C6137mt mtVar = this.f25608a;
        if (mtVar != null) {
            mtVar.mo40766K(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f25616b = z;
    }

    /* renamed from: t */
    public boolean mo30294t() {
        C6137mt mtVar = this.f25608a;
        return mtVar == null || mtVar.mo40779w();
    }

    /* renamed from: u */
    public boolean mo30295u() {
        return this.f25619c;
    }

    /* renamed from: v */
    public boolean mo30296v() {
        return this.f25616b;
    }

    /* renamed from: w */
    public void mo30256w() {
        TextureView textureView;
        SurfaceView surfaceView;
        pq4.m61624a();
        Log.d(f25595b, "pause()");
        this.f25622n = -1;
        C6137mt mtVar = this.f25608a;
        if (mtVar != null) {
            mtVar.mo40770n();
            this.f25608a = null;
            this.f25619c = false;
        } else {
            this.f25600a.sendEmptyMessage(yd3.C7336g.zxing_camera_closed);
        }
        if (this.f25618c == null && (surfaceView = this.f25602a) != null) {
            surfaceView.getHolder().removeCallback(this.f25601a);
        }
        if (this.f25618c == null && (textureView = this.f25603a) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f25609a = null;
        this.f25615b = null;
        this.f25617c = null;
        this.f25607a.mo36798f();
        this.f25605a.mo30308a();
    }

    /* renamed from: x */
    public void mo30297x() {
        C6137mt cameraInstance = getCameraInstance();
        mo30256w();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.mo40779w() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: y */
    public final void mo30298y(pz3 pz3) {
        this.f25615b = pz3;
        if (this.f25609a != null) {
            mo30274j();
            requestLayout();
            mo30263E();
        }
    }

    /* renamed from: z */
    public void mo30257z() {
    }
}
