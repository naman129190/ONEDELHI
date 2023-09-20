package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.delhitransport.onedelhi.p002ev.EVRequest;
import com.delhitransport.onedelhi.p002ev.EVSearch;
import com.delhitransport.onedelhi.p002ev.EVStations;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.zq0;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.networking.g */
public class C1360g {

    /* renamed from: a */
    public static C1360g f7128a;

    /* renamed from: a */
    public final zq0 f7129a = ((zq0) ApiClient.m8525f(zq0.class));

    /* renamed from: com.delhitransport.onedelhi.networking.g$a */
    public class C1361a implements C7181ws<EVStations> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7131a;

        public C1361a(lm2 lm2) {
            this.f7131a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<EVStations> qsVar, Throwable th) {
            this.f7131a.mo4933q(null);
            String a = pj0.m61166a(-131154428663623L);
            s41.m27245c(a, pj0.m61166a(-131300457551687L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<EVStations> qsVar, el3<EVStations> el3) {
            if (el3.mo35472g()) {
                this.f7131a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7131a.mo4933q(null);
            String a = pj0.m61166a(-130978335004487L);
            s41.m27245c(a, pj0.m61166a(-131124363892551L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.g$b */
    public class C1362b implements C7181ws<EVStations> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7133a;

        public C1362b(lm2 lm2) {
            this.f7133a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<EVStations> qsVar, Throwable th) {
            this.f7133a.mo4933q(null);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                System.err.println(stackTraceElement.getFileName() + pj0.m61166a(-131498026047303L) + stackTraceElement.getLineNumber() + pj0.m61166a(-131506615981895L) + stackTraceElement.getMethodName() + pj0.m61166a(-131523795851079L));
            }
            s41.m27245c(pj0.m61166a(-131536680752967L), pj0.m61166a(-131665529771847L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<EVStations> qsVar, el3<EVStations> el3) {
            if (el3.mo35472g()) {
                this.f7133a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7133a.mo4933q(null);
            String a = pj0.m61166a(-131339112257351L);
            s41.m27245c(a, pj0.m61166a(-131467961276231L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.g$c */
    public class C1363c implements C7181ws<List<String>> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7135a;

        public C1363c(lm2 lm2) {
            this.f7135a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<List<String>> qsVar, Throwable th) {
            this.f7135a.mo4933q(null);
            String a = pj0.m61166a(-131841623430983L);
            s41.m27245c(a, pj0.m61166a(-131957587547975L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<List<String>> qsVar, el3<List<String>> el3) {
            if (el3.mo35472g()) {
                this.f7135a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7135a.mo4933q(null);
            String a = pj0.m61166a(-131695594542919L);
            s41.m27245c(a, pj0.m61166a(-131811558659911L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.g$d */
    public class C1364d implements C7181ws<List<EVConnector>> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7137a;

        public C1364d(lm2 lm2) {
            this.f7137a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<List<EVConnector>> qsVar, Throwable th) {
            this.f7137a.mo4933q(null);
            String a = pj0.m61166a(-132137976174407L);
            s41.m27245c(a, pj0.m61166a(-132249645324103L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<List<EVConnector>> qsVar, el3<List<EVConnector>> el3) {
            if (el3.mo35472g()) {
                this.f7137a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7137a.mo4933q(null);
            String a = pj0.m61166a(-131996242253639L);
            s41.m27245c(a, pj0.m61166a(-132107911403335L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.g$e */
    public class C1365e implements C7181ws<EVSearch> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7139a;

        public C1365e(lm2 lm2) {
            this.f7139a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<EVSearch> qsVar, Throwable th) {
            this.f7139a.mo4933q(null);
            String a = pj0.m61166a(-132412854081351L);
            s41.m27245c(a, pj0.m61166a(-132507343361863L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<EVSearch> qsVar, el3<EVSearch> el3) {
            if (el3.mo35472g()) {
                this.f7139a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7139a.mo4933q(null);
            String a = pj0.m61166a(-132288300029767L);
            s41.m27245c(a, pj0.m61166a(-132382789310279L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.g$f */
    public class C1366f implements C7181ws<EVStations> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7141a;

        public C1366f(lm2 lm2) {
            this.f7141a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(C6595qs<EVStations> qsVar, Throwable th) {
            this.f7141a.mo4933q(null);
            String a = pj0.m61166a(-132692026955591L);
            s41.m27245c(a, pj0.m61166a(-132807991072583L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(C6595qs<EVStations> qsVar, el3<EVStations> el3) {
            if (el3.mo35472g()) {
                this.f7141a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7141a.mo4933q(null);
            String a = pj0.m61166a(-132545998067527L);
            s41.m27245c(a, pj0.m61166a(-132661962184519L) + el3.toString());
        }
    }

    /* renamed from: f */
    public static C1360g m8597f() {
        if (f7128a == null) {
            f7128a = new C1360g();
        }
        return f7128a;
    }

    /* renamed from: a */
    public lm2<List<EVConnector>> mo8670a() {
        lm2<List<EVConnector>> lm2 = new lm2<>();
        this.f7129a.mo28060e().mo14269jh(new C1364d(lm2));
        return lm2;
    }

    /* renamed from: b */
    public lm2<EVSearch> mo8671b() {
        lm2<EVSearch> lm2 = new lm2<>();
        this.f7129a.mo28058c().mo14269jh(new C1365e(lm2));
        return lm2;
    }

    /* renamed from: c */
    public lm2<EVStations> mo8672c() {
        lm2<EVStations> lm2 = new lm2<>();
        this.f7129a.mo28061f().mo14269jh(new C1362b(lm2));
        return lm2;
    }

    /* renamed from: d */
    public lm2<EVStations> mo8673d(String str) {
        lm2<EVStations> lm2 = new lm2<>();
        this.f7129a.mo28056a(str).mo14269jh(new C1366f(lm2));
        return lm2;
    }

    /* renamed from: e */
    public lm2<List<String>> mo8674e() {
        lm2<List<String>> lm2 = new lm2<>();
        this.f7129a.mo28057b().mo14269jh(new C1363c(lm2));
        return lm2;
    }

    /* renamed from: g */
    public lm2<EVStations> mo8675g(EVRequest eVRequest) {
        lm2<EVStations> lm2 = new lm2<>();
        this.f7129a.mo28059d(eVRequest).mo14269jh(new C1361a(lm2));
        return lm2;
    }
}
