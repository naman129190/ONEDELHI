package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.yd3;

public class CaptureActivity extends Activity {

    /* renamed from: a */
    public DecoratedBarcodeView f25628a;

    /* renamed from: a */
    public C4450a f25629a;

    /* renamed from: a */
    public DecoratedBarcodeView mo30313a() {
        setContentView(yd3.C7338i.zxing_capture);
        return (DecoratedBarcodeView) findViewById(yd3.C7336g.zxing_barcode_scanner);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25628a = mo30313a();
        C4450a aVar = new C4450a(this, this.f25628a);
        this.f25629a = aVar;
        aVar.mo30365q(getIntent(), bundle);
        this.f25629a.mo30361l();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f25629a.mo30367v();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f25628a.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f25629a.mo30368w();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        this.f25629a.mo30369x(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f25629a.mo30370y();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f25629a.mo30371z(bundle);
    }
}
