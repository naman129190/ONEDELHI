package com.onedelhi.secure;

import org.json.JSONObject;

/* renamed from: com.onedelhi.secure.ye */
public class C3991ye {

    /* renamed from: a */
    public static C3991ye f23022a;

    /* renamed from: a */
    public final C3409re f23023a = ((C3409re) C3901x7.m31309b(C3409re.class));

    /* renamed from: com.onedelhi.secure.ye$a */
    public class C3992a implements C7181ws<C4084ze> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f23024a;

        public C3992a(lm2 lm2) {
            this.f23024a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<C4084ze> qsVar, @mr2 Throwable th) {
            this.f23024a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<C4084ze> qsVar, @mr2 el3<C4084ze> el3) {
            if (el3.mo35472g()) {
                this.f23024a.mo4933q(el3.mo35468a());
                return;
            }
            if (el3.mo35469b() < 500 && el3.mo35469b() >= 400) {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    C4084ze zeVar = new C4084ze();
                    zeVar.mo27950e(jSONObject.getString(pj0.m61166a(-87723719366471L)));
                    zeVar.mo27949d(jSONObject.getString(pj0.m61166a(-87758079104839L)));
                    this.f23024a.mo4933q(zeVar);
                    return;
                } catch (Exception unused) {
                }
            }
            this.f23024a.mo4933q(null);
        }
    }

    /* renamed from: b */
    public static C3991ye m32290b() {
        if (f23022a == null) {
            f23022a = new C3991ye();
        }
        return f23022a;
    }

    /* renamed from: a */
    public lm2<C4084ze> mo27422a(String str) {
        lm2<C4084ze> lm2 = new lm2<>();
        this.f23023a.mo23821a(str).mo14269jh(new C3992a(lm2));
        return lm2;
    }
}
