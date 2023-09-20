package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.ticket.SendLog;
import com.delhitransport.onedelhi.ticket.SendLogResponse;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.ee1;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;

/* renamed from: com.delhitransport.onedelhi.networking.i */
public class C1372i {

    /* renamed from: a */
    public static C1372i f7152a;

    /* renamed from: a */
    public final ee1 f7153a = ((ee1) ApiClient.m8527h(ee1.class));

    /* renamed from: com.delhitransport.onedelhi.networking.i$a */
    public class C1373a implements C7181ws<Ticket> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7155a;

        public C1373a(lm2 lm2) {
            this.f7155a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<Ticket> qsVar, @mr2 Throwable th) {
            this.f7155a.mo4933q(null);
            String a = pj0.m61166a(-135350611711815L);
            s41.m27245c(a, pj0.m61166a(-135449395959623L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<Ticket> qsVar, @mr2 el3<Ticket> el3) {
            if (el3.mo35472g()) {
                this.f7155a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7155a.mo4933q(null);
            String a = pj0.m61166a(-135221762692935L);
            s41.m27245c(a, pj0.m61166a(-135320546940743L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.i$b */
    public class C1374b implements C7181ws<SendLogResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7157a;

        public C1374b(lm2 lm2) {
            this.f7157a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<SendLogResponse> qsVar, @mr2 Throwable th) {
            this.f7157a.mo4933q(null);
            String a = pj0.m61166a(-135599719814983L);
            s41.m27245c(a, pj0.m61166a(-135681324193607L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<SendLogResponse> qsVar, @mr2 el3<SendLogResponse> el3) {
            if (el3.mo35472g()) {
                this.f7157a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7157a.mo4933q(null);
            String a = pj0.m61166a(-135488050665287L);
            s41.m27245c(a, pj0.m61166a(-135569655043911L) + el3.toString());
        }
    }

    /* renamed from: b */
    public static C1372i m8632b() {
        if (f7152a == null) {
            f7152a = new C1372i();
        }
        return f7152a;
    }

    /* renamed from: a */
    public lm2<Ticket> mo8683a(TicketRequest ticketRequest) {
        lm2<Ticket> lm2 = new lm2<>();
        this.f7153a.mo15140a(ticketRequest).mo14269jh(new C1373a(lm2));
        return lm2;
    }

    /* renamed from: c */
    public lm2<SendLogResponse> mo8684c(SendLog sendLog) {
        lm2<SendLogResponse> lm2 = new lm2<>();
        this.f7153a.mo15141b(sendLog).mo14269jh(new C1374b(lm2));
        return lm2;
    }
}
