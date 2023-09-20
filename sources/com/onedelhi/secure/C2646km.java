package com.onedelhi.secure;

import android.graphics.Bitmap;
import com.onedelhi.secure.b43;
import java.util.HashMap;

/* renamed from: com.onedelhi.secure.km */
public final class C2646km {

    /* renamed from: a */
    public final C2355hm f15015a;

    /* renamed from: a */
    public C2526jm f15016a;

    /* renamed from: a */
    public final lf0 f15017a;

    /* renamed from: a */
    public final rg2 f15018a;

    public C2646km(rg2 rg2, C2355hm hmVar, lf0 lf0) {
        this.f15018a = rg2;
        this.f15015a = hmVar;
        this.f15017a = lf0;
    }

    /* renamed from: b */
    public static int m19905b(b43 b43) {
        return oq4.m24019g(b43.mo13401d(), b43.mo13399b(), b43.mo13398a());
    }

    @hw4
    /* renamed from: a */
    public a43 mo19156a(b43... b43Arr) {
        long e = (this.f15018a.mo23853e() - this.f15018a.mo23852c()) + this.f15015a.mo17344e();
        int i = 0;
        for (b43 c : b43Arr) {
            i += c.mo13400c();
        }
        float f = ((float) e) / ((float) i);
        HashMap hashMap = new HashMap();
        for (b43 b43 : b43Arr) {
            hashMap.put(b43, Integer.valueOf(Math.round(((float) b43.mo13400c()) * f) / m19905b(b43)));
        }
        return new a43(hashMap);
    }

    /* renamed from: c */
    public void mo19157c(b43.C1747a... aVarArr) {
        C2526jm jmVar = this.f15016a;
        if (jmVar != null) {
            jmVar.mo18476b();
        }
        b43[] b43Arr = new b43[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            b43.C1747a aVar = aVarArr[i];
            if (aVar.mo13406b() == null) {
                aVar.mo13407c(this.f15017a == lf0.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            b43Arr[i] = aVar.mo13405a();
        }
        C2526jm jmVar2 = new C2526jm(this.f15015a, this.f15018a, mo19156a(b43Arr));
        this.f15016a = jmVar2;
        oq4.m24036x(jmVar2);
    }
}
