package com.delhitransport.onedelhi.networking;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.live.BusesOnRouteRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
import com.delhitransport.onedelhi.models.LiveBusData;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.o42;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.networking.j */
public class C1375j {

    /* renamed from: a */
    public static C1375j f7158a;

    /* renamed from: a */
    public static o42 f7159a;

    /* renamed from: com.delhitransport.onedelhi.networking.j$a */
    public class C1376a implements C7181ws<List<LiveItem>> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7160a;

        public C1376a(lm2 lm2) {
            this.f7160a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<List<LiveItem>> qsVar, Throwable th) {
            this.f7160a.mo4933q(null);
            String a = pj0.m61166a(-135866007787335L);
            s41.m27245c(a, pj0.m61166a(-135981971904327L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<List<LiveItem>> qsVar, el3<List<LiveItem>> el3) {
            if (el3.mo35472g()) {
                this.f7160a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7160a.mo4933q(null);
            String a = pj0.m61166a(-135719978899271L);
            s41.m27245c(a, pj0.m61166a(-135835943016263L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.j$b */
    public class C1377b implements C7181ws<List<LiveItem>> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7161a;

        public C1377b(lm2 lm2) {
            this.f7161a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<List<LiveItem>> qsVar, Throwable th) {
            this.f7161a.mo4933q(null);
            String a = pj0.m61166a(-136162360530759L);
            s41.m27245c(a, pj0.m61166a(-136274029680455L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<List<LiveItem>> qsVar, el3<List<LiveItem>> el3) {
            if (el3.mo35472g()) {
                this.f7161a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7161a.mo4933q(null);
            String a = pj0.m61166a(-136020626609991L);
            s41.m27245c(a, pj0.m61166a(-136132295759687L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.j$c */
    public class C1378c implements C7181ws<LiveBusData> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7162a;

        public C1378c(lm2 lm2) {
            this.f7162a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<LiveBusData> qsVar, Throwable th) {
            this.f7162a.mo4933q(null);
            String a = pj0.m61166a(-136441533404999L);
            s41.m27245c(a, pj0.m61166a(-136540317652807L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<LiveBusData> qsVar, el3<LiveBusData> el3) {
            if (el3.mo35472g()) {
                this.f7162a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7162a.mo4933q(null);
            String a = pj0.m61166a(-136312684386119L);
            s41.m27245c(a, pj0.m61166a(-136411468633927L) + el3.toString());
        }
    }

    public C1375j() {
        f7159a = (o42) ApiClient.m8528i(o42.class);
    }

    /* renamed from: a */
    public static LiveData<List<LiveItem>> m8639a(BusesOnRouteRequest busesOnRouteRequest) {
        lm2 lm2 = new lm2();
        f7159a.mo21597b(busesOnRouteRequest).mo14269jh(new C1377b(lm2));
        return lm2;
    }

    /* renamed from: b */
    public static C1375j m8640b() {
        if (f7158a == null) {
            f7158a = new C1375j();
        }
        return f7158a;
    }

    /* renamed from: c */
    public static LiveData<LiveBusData> m8641c(String str) {
        lm2 lm2 = new lm2();
        f7159a.mo21598c(str).mo14269jh(new C1378c(lm2));
        return lm2;
    }

    /* renamed from: d */
    public static LiveData<List<LiveItem>> m8642d(LiveRequest liveRequest) {
        lm2 lm2 = new lm2();
        f7159a.mo21596a(liveRequest).mo14269jh(new C1376a(lm2));
        return lm2;
    }
}
