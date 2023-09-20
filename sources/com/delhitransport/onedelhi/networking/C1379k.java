package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.others.NotificationResponse;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.yr2;

/* renamed from: com.delhitransport.onedelhi.networking.k */
public class C1379k {

    /* renamed from: a */
    public static C1379k f7163a;

    /* renamed from: a */
    public final yr2 f7164a = ((yr2) ApiClient.m8529j(yr2.class));

    /* renamed from: com.delhitransport.onedelhi.networking.k$a */
    public class C1380a implements C7181ws<NotificationResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7166a;

        public C1380a(lm2 lm2) {
            this.f7166a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<NotificationResponse> qsVar, Throwable th) {
            this.f7166a.mo4933q(null);
            String a = pj0.m61166a(-136733591181127L);
            s41.m27245c(a, pj0.m61166a(-136858145232711L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<NotificationResponse> qsVar, el3<NotificationResponse> el3) {
            if (el3.mo35472g()) {
                this.f7166a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7166a.mo4933q(null);
            String a = pj0.m61166a(-136578972358471L);
            s41.m27245c(a, pj0.m61166a(-136703526410055L) + el3.toString());
        }
    }

    /* renamed from: b */
    public static C1379k m8649b() {
        if (f7163a == null) {
            f7163a = new C1379k();
        }
        return f7163a;
    }

    /* renamed from: a */
    public lm2<NotificationResponse> mo8685a() {
        lm2<NotificationResponse> lm2 = new lm2<>();
        this.f7164a.mo27672a().mo14269jh(new C1380a(lm2));
        return lm2;
    }
}
