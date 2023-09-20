package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.xi */
public class C7256xi {

    /* renamed from: a */
    public static final int f37476a = -1;

    /* renamed from: b */
    public static final int f37477b = -16777216;

    /* renamed from: a */
    public Bitmap mo47185a(C6190nl nlVar) {
        int l = nlVar.mo41094l();
        int h = nlVar.mo41089h();
        int[] iArr = new int[(l * h)];
        for (int i = 0; i < h; i++) {
            int i2 = i * l;
            for (int i3 = 0; i3 < l; i3++) {
                iArr[i2 + i3] = nlVar.mo41085e(i3, i) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(l, h, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, l, 0, 0, l, h);
        return createBitmap;
    }

    /* renamed from: b */
    public C6190nl mo47186b(String str, C7363yi yiVar, int i, int i2) throws vy4 {
        try {
            return new yl2().mo35510a(str, yiVar, i, i2);
        } catch (vy4 e) {
            throw e;
        } catch (Exception e2) {
            throw new vy4((Throwable) e2);
        }
    }

    /* renamed from: c */
    public C6190nl mo47187c(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) throws vy4 {
        try {
            return new yl2().mo35511b(str, yiVar, i, i2, map);
        } catch (vy4 e) {
            throw e;
        } catch (Exception e2) {
            throw new vy4((Throwable) e2);
        }
    }

    /* renamed from: d */
    public Bitmap mo47188d(String str, C7363yi yiVar, int i, int i2) throws vy4 {
        return mo47185a(mo47186b(str, yiVar, i, i2));
    }

    /* renamed from: e */
    public Bitmap mo47189e(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) throws vy4 {
        return mo47185a(mo47187c(str, yiVar, i, i2, map));
    }
}
