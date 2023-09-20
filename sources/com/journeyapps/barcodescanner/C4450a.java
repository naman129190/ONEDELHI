package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.CameraPreview;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.C4593av;
import com.onedelhi.secure.C4675bj;
import com.onedelhi.secure.C4699bv;
import com.onedelhi.secure.C4915cv;
import com.onedelhi.secure.C5730ik;
import com.onedelhi.secure.C7169wi;
import com.onedelhi.secure.C7388yu;
import com.onedelhi.secure.C7514zu;
import com.onedelhi.secure.np1;
import com.onedelhi.secure.ql3;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sl3;
import com.onedelhi.secure.us1;
import com.onedelhi.secure.yd3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.journeyapps.barcodescanner.a */
public class C4450a {

    /* renamed from: b */
    public static int f25656b = 250;

    /* renamed from: b */
    public static final String f25657b = "a";

    /* renamed from: c */
    public static final String f25658c = "SAVED_ORIENTATION_LOCK";

    /* renamed from: a */
    public int f25659a = -1;

    /* renamed from: a */
    public Activity f25660a;

    /* renamed from: a */
    public Handler f25661a;

    /* renamed from: a */
    public final CameraPreview.C4446f f25662a;

    /* renamed from: a */
    public DecoratedBarcodeView f25663a;

    /* renamed from: a */
    public C5730ik f25664a;

    /* renamed from: a */
    public np1 f25665a;

    /* renamed from: a */
    public C7169wi f25666a = new C4451a();

    /* renamed from: a */
    public String f25667a = "";

    /* renamed from: a */
    public boolean f25668a = false;

    /* renamed from: b */
    public boolean f25669b = true;

    /* renamed from: c */
    public boolean f25670c = false;

    /* renamed from: d */
    public boolean f25671d = false;

    /* renamed from: e */
    public boolean f25672e;

    /* renamed from: com.journeyapps.barcodescanner.a$a */
    public class C4451a implements C7169wi {
        public C4451a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m35628d(C4675bj bjVar) {
            C4450a.this.mo30355C(bjVar);
        }

        /* renamed from: a */
        public void mo30344a(C4675bj bjVar) {
            C4450a.this.f25663a.mo30332h();
            C4450a.this.f25664a.mo38118h();
            C4450a.this.f25661a.post(new C4915cv(this, bjVar));
        }

        /* renamed from: b */
        public void mo30345b(List<sl3> list) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$b */
    public class C4452b implements CameraPreview.C4446f {
        public C4452b() {
        }

        /* renamed from: a */
        public void mo30308a() {
        }

        /* renamed from: b */
        public void mo30309b() {
            if (C4450a.this.f25671d) {
                Log.d(C4450a.f25657b, "Camera closed; finishing activity");
                C4450a.this.mo30363n();
            }
        }

        /* renamed from: c */
        public void mo30310c() {
        }

        /* renamed from: d */
        public void mo30311d(Exception exc) {
            C4450a aVar = C4450a.this;
            aVar.mo30362m(aVar.f25660a.getString(yd3.C7340k.zxing_msg_camera_framework_bug));
        }

        /* renamed from: e */
        public void mo30312e() {
        }
    }

    public C4450a(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C4452b bVar = new C4452b();
        this.f25662a = bVar;
        this.f25672e = false;
        this.f25660a = activity;
        this.f25663a = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().mo30273i(bVar);
        this.f25661a = new Handler();
        this.f25665a = new np1(activity, new C4699bv(this));
        this.f25664a = new C5730ik(activity);
    }

    /* renamed from: B */
    public static Intent m35593B(C4675bj bjVar, String str) {
        Intent intent = new Intent(us1.C6979a.f36243a);
        intent.addFlags(524288);
        intent.putExtra(us1.C6979a.f36265u, bjVar.toString());
        intent.putExtra(us1.C6979a.f36266v, bjVar.mo31807b().toString());
        byte[] f = bjVar.mo31811f();
        if (f != null && f.length > 0) {
            intent.putExtra(us1.C6979a.f36268x, f);
        }
        Map<ql3, Object> h = bjVar.mo31813h();
        if (h != null) {
            ql3 ql3 = ql3.UPC_EAN_EXTENSION;
            if (h.containsKey(ql3)) {
                intent.putExtra(us1.C6979a.f36267w, h.get(ql3).toString());
            }
            Number number = (Number) h.get(ql3.ORIENTATION);
            if (number != null) {
                intent.putExtra(us1.C6979a.f36269y, number.intValue());
            }
            String str2 = (String) h.get(ql3.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra(us1.C6979a.f36270z, str2);
            }
            Iterable<byte[]> iterable = (Iterable) h.get(ql3.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra(us1.C6979a.f36239A + i, putExtra);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra(us1.C6979a.f36240B, str);
        }
        return intent;
    }

    /* renamed from: E */
    public static void m35594E(int i) {
        f25656b = i;
    }

    /* renamed from: p */
    public static int m35605p() {
        return f25656b;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m35606r(DialogInterface dialogInterface, int i) {
        mo30363n();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m35607s(DialogInterface dialogInterface) {
        mo30363n();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m35608t() {
        Log.d(f25657b, "Finishing due to inactivity");
        mo30363n();
    }

    @TargetApi(23)
    /* renamed from: A */
    public final void mo30354A() {
        if (r70.m26348a(this.f25660a, "android.permission.CAMERA") == 0) {
            this.f25663a.mo30334j();
        } else if (!this.f25672e) {
            C3962y2.m31859G(this.f25660a, new String[]{"android.permission.CAMERA"}, f25656b);
            this.f25672e = true;
        }
    }

    /* renamed from: C */
    public void mo30355C(C4675bj bjVar) {
        this.f25660a.setResult(-1, m35593B(bjVar, mo30364o(bjVar)));
        mo30360k();
    }

    /* renamed from: D */
    public void mo30356D() {
        Intent intent = new Intent(us1.C6979a.f36243a);
        intent.putExtra(us1.C6979a.f36259o, true);
        this.f25660a.setResult(0, intent);
        mo30360k();
    }

    /* renamed from: F */
    public final void mo30357F() {
        Intent intent = new Intent(us1.C6979a.f36243a);
        intent.putExtra(us1.C6979a.f36260p, true);
        this.f25660a.setResult(0, intent);
    }

    /* renamed from: G */
    public void mo30358G(boolean z) {
        mo30359H(z, "");
    }

    /* renamed from: H */
    public void mo30359H(boolean z, String str) {
        this.f25669b = z;
        if (str == null) {
            str = "";
        }
        this.f25667a = str;
    }

    /* renamed from: k */
    public void mo30360k() {
        if (this.f25663a.getBarcodeView().mo30294t()) {
            mo30363n();
        } else {
            this.f25671d = true;
        }
        this.f25663a.mo30332h();
        this.f25665a.mo41423d();
    }

    /* renamed from: l */
    public void mo30361l() {
        this.f25663a.mo30323d(this.f25666a);
    }

    /* renamed from: m */
    public void mo30362m(String str) {
        if (!this.f25660a.isFinishing() && !this.f25670c && !this.f25671d) {
            if (str.isEmpty()) {
                str = this.f25660a.getString(yd3.C7340k.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f25660a);
            builder.setTitle(this.f25660a.getString(yd3.C7340k.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(yd3.C7340k.zxing_button_ok, new C7514zu(this));
            builder.setOnCancelListener(new C7388yu(this));
            builder.show();
        }
    }

    /* renamed from: n */
    public final void mo30363n() {
        this.f25660a.finish();
    }

    /* renamed from: o */
    public final String mo30364o(C4675bj bjVar) {
        if (this.f25668a) {
            Bitmap c = bjVar.mo31808c();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f25660a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                c.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = f25657b;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e);
            }
        }
        return null;
    }

    /* renamed from: q */
    public void mo30365q(Intent intent, Bundle bundle) {
        this.f25660a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f25659a = bundle.getInt(f25658c, -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra(us1.C6979a.f36263s, true)) {
                mo30366u();
            }
            if (us1.C6979a.f36243a.equals(intent.getAction())) {
                this.f25663a.mo30326g(intent);
            }
            if (!intent.getBooleanExtra(us1.C6979a.f36257m, true)) {
                this.f25664a.mo38119i(false);
            }
            if (intent.hasExtra(us1.C6979a.f36261q)) {
                mo30359H(intent.getBooleanExtra(us1.C6979a.f36261q, true), intent.getStringExtra(us1.C6979a.f36262r));
            }
            if (intent.hasExtra(us1.C6979a.f36259o)) {
                this.f25661a.postDelayed(new C4593av(this), intent.getLongExtra(us1.C6979a.f36259o, 0));
            }
            if (intent.getBooleanExtra(us1.C6979a.f36258n, false)) {
                this.f25668a = true;
            }
        }
    }

    /* renamed from: u */
    public void mo30366u() {
        if (this.f25659a == -1) {
            int rotation = this.f25660a.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f25660a.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f25659a = i2;
        }
        this.f25660a.setRequestedOrientation(this.f25659a);
    }

    /* renamed from: v */
    public void mo30367v() {
        this.f25670c = true;
        this.f25665a.mo41423d();
        this.f25661a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: w */
    public void mo30368w() {
        this.f25665a.mo41423d();
        this.f25663a.mo30333i();
    }

    /* renamed from: x */
    public void mo30369x(int i, String[] strArr, int[] iArr) {
        if (i != f25656b) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            mo30357F();
            if (this.f25669b) {
                mo30362m(this.f25667a);
            } else {
                mo30360k();
            }
        } else {
            this.f25663a.mo30334j();
        }
    }

    /* renamed from: y */
    public void mo30370y() {
        if (Build.VERSION.SDK_INT >= 23) {
            mo30354A();
        } else {
            this.f25663a.mo30334j();
        }
        this.f25665a.mo41427h();
    }

    /* renamed from: z */
    public void mo30371z(Bundle bundle) {
        bundle.putInt(f25658c, this.f25659a);
    }
}
