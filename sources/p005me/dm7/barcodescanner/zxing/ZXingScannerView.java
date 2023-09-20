package p005me.dm7.barcodescanner.zxing;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.onedelhi.secure.C6969uk;
import com.onedelhi.secure.C7363yi;
import com.onedelhi.secure.dn0;
import com.onedelhi.secure.gn1;
import com.onedelhi.secure.j23;
import com.onedelhi.secure.ol3;
import com.onedelhi.secure.pf0;
import com.onedelhi.secure.tr2;
import com.onedelhi.secure.wf3;
import com.onedelhi.secure.wl2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import p005me.dm7.barcodescanner.core.BarcodeScannerView;

/* renamed from: me.dm7.barcodescanner.zxing.ZXingScannerView */
public class ZXingScannerView extends BarcodeScannerView {

    /* renamed from: b */
    public static final String f38846b = "ZXingScannerView";

    /* renamed from: b */
    public static final List<C7363yi> f38847b;

    /* renamed from: a */
    public wl2 f38848a;

    /* renamed from: a */
    public List<C7363yi> f38849a;

    /* renamed from: a */
    public C7621b f38850a;

    /* renamed from: me.dm7.barcodescanner.zxing.ZXingScannerView$a */
    public class C7620a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ol3 f38851a;

        public C7620a(ol3 ol3) {
            this.f38851a = ol3;
        }

        public void run() {
            C7621b k = ZXingScannerView.this.f38850a;
            C7621b unused = ZXingScannerView.this.f38850a = null;
            ZXingScannerView.this.mo48896i();
            if (k != null) {
                k.mo7798Y(this.f38851a);
            }
        }
    }

    /* renamed from: me.dm7.barcodescanner.zxing.ZXingScannerView$b */
    public interface C7621b {
        /* renamed from: Y */
        void mo7798Y(ol3 ol3);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f38847b = arrayList;
        arrayList.add(C7363yi.AZTEC);
        arrayList.add(C7363yi.CODABAR);
        arrayList.add(C7363yi.CODE_39);
        arrayList.add(C7363yi.CODE_93);
        arrayList.add(C7363yi.CODE_128);
        arrayList.add(C7363yi.DATA_MATRIX);
        arrayList.add(C7363yi.EAN_8);
        arrayList.add(C7363yi.EAN_13);
        arrayList.add(C7363yi.ITF);
        arrayList.add(C7363yi.MAXICODE);
        arrayList.add(C7363yi.PDF_417);
        arrayList.add(C7363yi.QR_CODE);
        arrayList.add(C7363yi.RSS_14);
        arrayList.add(C7363yi.RSS_EXPANDED);
        arrayList.add(C7363yi.UPC_A);
        arrayList.add(C7363yi.UPC_E);
        arrayList.add(C7363yi.UPC_EAN_EXTENSION);
    }

    public ZXingScannerView(Context context) {
        super(context);
        mo48942n();
    }

    public ZXingScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo48942n();
    }

    public Collection<C7363yi> getFormats() {
        List<C7363yi> list = this.f38849a;
        return list == null ? f38847b : list;
    }

    /* renamed from: m */
    public j23 mo48941m(byte[] bArr, int i, int i2) {
        Rect b = mo48887b(i, i2);
        if (b == null) {
            return null;
        }
        try {
            return new j23(bArr, i, i2, b.left, b.top, b.width(), b.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final void mo48942n() {
        EnumMap enumMap = new EnumMap(pf0.class);
        enumMap.put(pf0.POSSIBLE_FORMATS, getFormats());
        wl2 wl2 = new wl2();
        this.f38848a = wl2;
        wl2.mo46799e(enumMap);
    }

    /* renamed from: o */
    public void mo48943o(C7621b bVar) {
        this.f38850a = bVar;
        super.mo48890e();
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        ol3 ol3;
        wl2 wl2;
        wl2 wl22;
        if (this.f38850a != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                int i = previewSize.width;
                int i2 = previewSize.height;
                if (dn0.m45377a(getContext()) == 1) {
                    int rotationCount = getRotationCount();
                    if (rotationCount == 1 || rotationCount == 3) {
                        int i3 = i;
                        i = i2;
                        i2 = i3;
                    }
                    bArr = mo48888c(bArr, camera);
                }
                ol3 = null;
                j23 m = mo48941m(bArr, i, i2);
                if (m != null) {
                    ol3 = this.f38848a.mo46798d(new C6969uk(new gn1(m)));
                    wl2 = this.f38848a;
                    wl2.reset();
                    if (ol3 == null) {
                        ol3 = this.f38848a.mo46798d(new C6969uk(new gn1(m.mo43293f())));
                        wl22 = this.f38848a;
                        wl22.reset();
                    }
                }
            } catch (tr2 unused) {
                wl22 = this.f38848a;
            } catch (wf3 unused2) {
                wl2 = this.f38848a;
            } catch (NullPointerException unused3) {
                wl2 = this.f38848a;
            } catch (ArrayIndexOutOfBoundsException unused4) {
                wl2 = this.f38848a;
            } catch (RuntimeException e) {
                Log.e(f38846b, e.toString(), e);
                return;
            } catch (Throwable th) {
                this.f38848a.reset();
                throw th;
            }
            if (ol3 != null) {
                new Handler(Looper.getMainLooper()).post(new C7620a(ol3));
            } else {
                camera.setOneShotPreviewCallback(this);
            }
        }
    }

    public void setFormats(List<C7363yi> list) {
        this.f38849a = list;
        mo48942n();
    }

    public void setResultHandler(C7621b bVar) {
        this.f38850a = bVar;
    }
}
