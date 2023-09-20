package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.onedelhi.secure.C4675bj;
import com.onedelhi.secure.C6301ot;
import com.onedelhi.secure.C6596qt;
import com.onedelhi.secure.C7169wi;
import com.onedelhi.secure.C7363yi;
import com.onedelhi.secure.fg0;
import com.onedelhi.secure.mf0;
import com.onedelhi.secure.of0;
import com.onedelhi.secure.pf0;
import com.onedelhi.secure.sl3;
import com.onedelhi.secure.us1;
import com.onedelhi.secure.wl2;
import com.onedelhi.secure.yd3;
import com.onedelhi.secure.yg0;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a */
    public TextView f25630a;

    /* renamed from: a */
    public BarcodeView f25631a;

    /* renamed from: a */
    public C4447a f25632a;

    /* renamed from: a */
    public ViewfinderView f25633a;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C4447a {
        /* renamed from: a */
        void mo30342a();

        /* renamed from: b */
        void mo30343b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    public class C4448b implements C7169wi {

        /* renamed from: a */
        public C7169wi f25635a;

        public C4448b(C7169wi wiVar) {
            this.f25635a = wiVar;
        }

        /* renamed from: a */
        public void mo30344a(C4675bj bjVar) {
            this.f25635a.mo30344a(bjVar);
        }

        /* renamed from: b */
        public void mo30345b(List<sl3> list) {
            for (sl3 a : list) {
                DecoratedBarcodeView.this.f25633a.mo30346a(a);
            }
            this.f25635a.mo30345b(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        mo30324e();
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30325f(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30325f(attributeSet);
    }

    /* renamed from: b */
    public void mo30321b(C6301ot otVar) {
        this.f25631a.mo30277m(otVar);
    }

    /* renamed from: c */
    public void mo30322c(C7169wi wiVar) {
        this.f25631a.mo30248K(new C4448b(wiVar));
    }

    /* renamed from: d */
    public void mo30323d(C7169wi wiVar) {
        this.f25631a.mo30249L(new C4448b(wiVar));
    }

    /* renamed from: e */
    public final void mo30324e() {
        mo30325f((AttributeSet) null);
    }

    /* renamed from: f */
    public final void mo30325f(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yd3.C7342m.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(yd3.C7342m.zxing_view_zxing_scanner_layout, yd3.C7338i.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(yd3.C7336g.zxing_barcode_surface);
        this.f25631a = barcodeView;
        if (barcodeView != null) {
            barcodeView.mo30286r(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(yd3.C7336g.zxing_viewfinder_view);
            this.f25633a = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f25631a);
                this.f25630a = (TextView) findViewById(yd3.C7336g.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: g */
    public void mo30326g(Intent intent) {
        int intExtra;
        Set<C7363yi> a = mf0.m57090a(intent);
        Map<pf0, Object> a2 = of0.m59371a(intent);
        C6596qt qtVar = new C6596qt();
        if (intent.hasExtra(us1.C6979a.f36254j) && (intExtra = intent.getIntExtra(us1.C6979a.f36254j, -1)) >= 0) {
            qtVar.mo43719q(intExtra);
        }
        if (intent.hasExtra(us1.C6979a.f36255k) && intent.getBooleanExtra(us1.C6979a.f36255k, false)) {
            setTorchOn();
        }
        String stringExtra = intent.getStringExtra(us1.C6979a.f36264t);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(us1.C6979a.f36241C, 0);
        String stringExtra2 = intent.getStringExtra(us1.C6979a.f36256l);
        new wl2().mo46799e(a2);
        this.f25631a.setCameraSettings(qtVar);
        this.f25631a.setDecoderFactory(new yg0(a, a2, stringExtra2, intExtra2));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(yd3.C7336g.zxing_barcode_surface);
    }

    public C6596qt getCameraSettings() {
        return this.f25631a.getCameraSettings();
    }

    public fg0 getDecoderFactory() {
        return this.f25631a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f25630a;
    }

    public ViewfinderView getViewFinder() {
        return this.f25633a;
    }

    /* renamed from: h */
    public void mo30332h() {
        this.f25631a.mo30256w();
    }

    /* renamed from: i */
    public void mo30333i() {
        this.f25631a.mo30297x();
    }

    /* renamed from: j */
    public void mo30334j() {
        this.f25631a.mo30259A();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        } else if (i == 25) {
            setTorchOff();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(C6596qt qtVar) {
        this.f25631a.setCameraSettings(qtVar);
    }

    public void setDecoderFactory(fg0 fg0) {
        this.f25631a.setDecoderFactory(fg0);
    }

    public void setStatusText(String str) {
        TextView textView = this.f25630a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C4447a aVar) {
        this.f25632a = aVar;
    }

    public void setTorchOff() {
        this.f25631a.setTorch(false);
        C4447a aVar = this.f25632a;
        if (aVar != null) {
            aVar.mo30342a();
        }
    }

    public void setTorchOn() {
        this.f25631a.setTorch(true);
        C4447a aVar = this.f25632a;
        if (aVar != null) {
            aVar.mo30343b();
        }
    }
}
