package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.onedelhi.secure.C4675bj;
import com.onedelhi.secure.C7169wi;
import com.onedelhi.secure.eg0;
import com.onedelhi.secure.fg0;
import com.onedelhi.secure.hg0;
import com.onedelhi.secure.ig0;
import com.onedelhi.secure.pf0;
import com.onedelhi.secure.pq4;
import com.onedelhi.secure.yd3;
import com.onedelhi.secure.yg0;
import java.util.HashMap;
import java.util.List;

public class BarcodeView extends CameraPreview {

    /* renamed from: a */
    public C4440b f25584a = C4440b.NONE;

    /* renamed from: a */
    public fg0 f25585a;

    /* renamed from: a */
    public ig0 f25586a;

    /* renamed from: a */
    public C7169wi f25587a = null;

    /* renamed from: b */
    public final Handler.Callback f25588b = new C4439a();

    /* renamed from: b */
    public Handler f25589b;

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    public class C4439a implements Handler.Callback {
        public C4439a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == yd3.C7336g.zxing_decode_succeeded) {
                C4675bj bjVar = (C4675bj) message.obj;
                if (!(bjVar == null || BarcodeView.this.f25587a == null || BarcodeView.this.f25584a == C4440b.NONE)) {
                    BarcodeView.this.f25587a.mo30344a(bjVar);
                    if (BarcodeView.this.f25584a == C4440b.SINGLE) {
                        BarcodeView.this.mo30253P();
                    }
                }
                return true;
            } else if (i == yd3.C7336g.zxing_decode_failed) {
                return true;
            } else {
                if (i != yd3.C7336g.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.f25587a == null || BarcodeView.this.f25584a == C4440b.NONE)) {
                    BarcodeView.this.f25587a.mo30345b(list);
                }
                return true;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$b */
    public enum C4440b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        mo30250M();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30250M();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30250M();
    }

    /* renamed from: I */
    public final eg0 mo30246I() {
        if (this.f25585a == null) {
            this.f25585a = mo30247J();
        }
        hg0 hg0 = new hg0();
        HashMap hashMap = new HashMap();
        hashMap.put(pf0.NEED_RESULT_POINT_CALLBACK, hg0);
        eg0 a = this.f25585a.mo35939a(hashMap);
        hg0.mo37302c(a);
        return a;
    }

    /* renamed from: J */
    public fg0 mo30247J() {
        return new yg0();
    }

    /* renamed from: K */
    public void mo30248K(C7169wi wiVar) {
        this.f25584a = C4440b.CONTINUOUS;
        this.f25587a = wiVar;
        mo30251N();
    }

    /* renamed from: L */
    public void mo30249L(C7169wi wiVar) {
        this.f25584a = C4440b.SINGLE;
        this.f25587a = wiVar;
        mo30251N();
    }

    /* renamed from: M */
    public final void mo30250M() {
        this.f25585a = new yg0();
        this.f25589b = new Handler(this.f25588b);
    }

    /* renamed from: N */
    public final void mo30251N() {
        mo30252O();
        if (this.f25584a != C4440b.NONE && mo30295u()) {
            ig0 ig0 = new ig0(getCameraInstance(), mo30246I(), this.f25589b);
            this.f25586a = ig0;
            ig0.mo38083k(getPreviewFramingRect());
            this.f25586a.mo38085m();
        }
    }

    /* renamed from: O */
    public final void mo30252O() {
        ig0 ig0 = this.f25586a;
        if (ig0 != null) {
            ig0.mo38086n();
            this.f25586a = null;
        }
    }

    /* renamed from: P */
    public void mo30253P() {
        this.f25584a = C4440b.NONE;
        this.f25587a = null;
        mo30252O();
    }

    public fg0 getDecoderFactory() {
        return this.f25585a;
    }

    public void setDecoderFactory(fg0 fg0) {
        pq4.m61624a();
        this.f25585a = fg0;
        ig0 ig0 = this.f25586a;
        if (ig0 != null) {
            ig0.mo38084l(mo30246I());
        }
    }

    /* renamed from: w */
    public void mo30256w() {
        mo30252O();
        super.mo30256w();
    }

    /* renamed from: z */
    public void mo30257z() {
        super.mo30257z();
        mo30251N();
    }
}
