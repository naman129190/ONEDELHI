package com.delhitransport.onedelhi.networking;

import android.content.Context;
import android.location.Location;
import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.data.NearByStopsRequest;
import com.delhitransport.onedelhi.data.RouteDetailRequest;
import com.delhitransport.onedelhi.data.RouteResponse;
import com.delhitransport.onedelhi.live.BusMetaData;
import com.delhitransport.onedelhi.live.MetroTimeTableResponse;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.nl0;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.vr2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.delhitransport.onedelhi.networking.e */
public class C1341e {

    /* renamed from: a */
    public static C1341e f7087a;

    /* renamed from: a */
    public final nl0 f7088a = ((nl0) ApiClient.m8523d(nl0.class));

    /* renamed from: com.delhitransport.onedelhi.networking.e$a */
    public class C1342a implements C7181ws<BusMetaData> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7090a;

        public C1342a(lm2 lm2) {
            this.f7090a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<BusMetaData> qsVar, @vr2 Throwable th) {
            this.f7090a.mo4933q(null);
            String a = pj0.m61166a(-126408489801543L);
            s41.m27245c(a, pj0.m61166a(-126515863983943L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<BusMetaData> qsVar, @vr2 el3<BusMetaData> el3) {
            if (el3.mo35472g()) {
                this.f7090a.mo4933q(el3.mo35468a());
            } else if (el3.mo35469b() < 500 && el3.mo35469b() >= 400) {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    BusMetaData busMetaData = new BusMetaData();
                    busMetaData.setStatus(jSONObject.getString(pj0.m61166a(-126159381698375L)));
                    busMetaData.setDescription(jSONObject.getString(pj0.m61166a(-126189446469447L)));
                    this.f7090a.mo4933q(busMetaData);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    this.f7090a.mo4933q(null);
                    s41.m27244b(e, pj0.m61166a(-126240986076999L) + el3.toString());
                }
                String a = pj0.m61166a(-126271050848071L);
                s41.m27245c(a, pj0.m61166a(-126378425030471L) + el3.toString());
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$b */
    public class C1343b implements C7181ws<AllRouteResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7092a;

        public C1343b(lm2 lm2) {
            this.f7092a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<AllRouteResponse> qsVar, @vr2 Throwable th) {
            String a = pj0.m61166a(-125961813202759L);
            s41.m27245c(a, pj0.m61166a(-126120726992711L) + th.toString());
            this.f7092a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<AllRouteResponse> qsVar, @vr2 el3<AllRouteResponse> el3) {
            if (el3.mo35472g()) {
                this.f7092a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7092a.mo4933q(null);
            String a = pj0.m61166a(-125772834641735L);
            s41.m27245c(a, pj0.m61166a(-125931748431687L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$c */
    public class C1344c implements C7181ws<AllStopsResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7094a;

        public C1344c(lm2 lm2) {
            this.f7094a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 Throwable th) {
            this.f7094a.mo4933q(null);
            String a = pj0.m61166a(-126739202283335L);
            s41.m27245c(a, pj0.m61166a(-126893821105991L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 el3<AllStopsResponse> el3) {
            if (el3.mo35472g()) {
                this.f7094a.mo4933q(el3.mo35468a());
                return;
            }
            String a = pj0.m61166a(-126554518689607L);
            s41.m27245c(a, pj0.m61166a(-126709137512263L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$d */
    public class C1345d implements C7181ws<RouteResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7096a;

        public C1345d(lm2 lm2) {
            this.f7096a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<RouteResponse> qsVar, @vr2 Throwable th) {
            this.f7096a.mo4933q(null);
            String a = pj0.m61166a(-127065619797831L);
            s41.m27245c(a, pj0.m61166a(-127168699012935L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<RouteResponse> qsVar, @vr2 el3<RouteResponse> el3) {
            if (el3.mo35472g()) {
                this.f7096a.mo4933q(el3.mo35468a());
                return;
            }
            String a = pj0.m61166a(-126932475811655L);
            s41.m27245c(a, pj0.m61166a(-127035555026759L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$e */
    public class C1346e implements C7181ws<AllRouteResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7098a;

        public C1346e(lm2 lm2) {
            this.f7098a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<AllRouteResponse> qsVar, @vr2 Throwable th) {
            this.f7098a.mo4933q(null);
            String a = pj0.m61166a(-127349087639367L);
            s41.m27245c(a, pj0.m61166a(-127460756789063L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<AllRouteResponse> qsVar, @vr2 el3<AllRouteResponse> el3) {
            if (el3.mo35472g()) {
                this.f7098a.mo4933q(el3.mo35468a());
                return;
            }
            String a = pj0.m61166a(-127207353718599L);
            s41.m27245c(a, pj0.m61166a(-127319022868295L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$f */
    public class C1347f implements C7181ws<RouteResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7100a;

        public C1347f(lm2 lm2) {
            this.f7100a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<RouteResponse> qsVar, @vr2 Throwable th) {
            this.f7100a.mo4933q(null);
            String a = pj0.m61166a(-127628260513607L);
            s41.m27245c(a, pj0.m61166a(-127727044761415L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<RouteResponse> qsVar, @vr2 el3<RouteResponse> el3) {
            if (el3.mo35472g()) {
                this.f7100a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7100a.mo4933q(null);
            String a = pj0.m61166a(-127499411494727L);
            s41.m27245c(a, pj0.m61166a(-127598195742535L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$g */
    public class C1348g implements C7181ws<AllStopsResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7102a;

        public C1348g(lm2 lm2) {
            this.f7102a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 Throwable th) {
            this.f7102a.mo4933q(null);
            String a = pj0.m61166a(-127907433387847L);
            s41.m27245c(a, pj0.m61166a(-128019102537543L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 el3<AllStopsResponse> el3) {
            if (el3.mo35472g()) {
                this.f7102a.mo4933q(el3.mo35468a());
                return;
            }
            String a = pj0.m61166a(-127765699467079L);
            s41.m27245c(a, pj0.m61166a(-127877368616775L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$h */
    public class C1349h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f7103a;

        /* renamed from: a */
        public final /* synthetic */ AllStopsResponse f7104a;

        /* renamed from: a */
        public final /* synthetic */ NearByStopsRequest f7105a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f7107a;

        public C1349h(Context context, NearByStopsRequest nearByStopsRequest, ArrayList arrayList, AllStopsResponse allStopsResponse) {
            this.f7103a = context;
            this.f7105a = nearByStopsRequest;
            this.f7107a = arrayList;
            this.f7104a = allStopsResponse;
        }

        public void run() {
            if (DatabaseClient.getInstance(this.f7103a).getAppDatabase().allStopsDao().getStopsCount() > 0) {
                List<AllStops> allStops = DatabaseClient.getInstance(this.f7103a).getAppDatabase().allStopsDao().getAllStops();
                for (int i = 0; i < allStops.size(); i++) {
                    if (C1341e.this.mo8656i(this.f7105a.getUser_lat().doubleValue(), this.f7105a.getUser_lon().doubleValue(), allStops.get(i).getLat().doubleValue(), allStops.get(i).getLng().doubleValue()) < 1000.0f) {
                        this.f7107a.add(allStops.get(i));
                    }
                }
                this.f7104a.setAll_stops(this.f7107a);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$i */
    public class C1350i implements C7181ws<AllStopsResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7109a;

        public C1350i(lm2 lm2) {
            this.f7109a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 Throwable th) {
            this.f7109a.mo4933q(null);
            String a = pj0.m61166a(-128259620706119L);
            s41.m27245c(a, pj0.m61166a(-128431419397959L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<AllStopsResponse> qsVar, @vr2 el3<AllStopsResponse> el3) {
            if (el3.mo35472g()) {
                this.f7109a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7109a.mo4933q(null);
            String a = pj0.m61166a(-128057757243207L);
            s41.m27245c(a, pj0.m61166a(-128229555935047L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.e$j */
    public class C1351j implements C7181ws<MetroTimeTableResponse> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7111a;

        public C1351j(lm2 lm2) {
            this.f7111a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@vr2 C6595qs<MetroTimeTableResponse> qsVar, @vr2 Throwable th) {
            this.f7111a.mo4933q(null);
            String a = pj0.m61166a(-128616102991687L);
            s41.m27245c(a, pj0.m61166a(-128732067108679L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@vr2 C6595qs<MetroTimeTableResponse> qsVar, @vr2 el3<MetroTimeTableResponse> el3) {
            if (el3.mo35472g()) {
                this.f7111a.mo4933q(el3.mo35468a());
                return;
            }
            String a = pj0.m61166a(-128470074103623L);
            s41.m27245c(a, pj0.m61166a(-128586038220615L) + el3.toString());
        }
    }

    /* renamed from: j */
    public static C1341e m8543j() {
        if (f7087a == null) {
            f7087a = new C1341e();
        }
        return f7087a;
    }

    /* renamed from: b */
    public lm2<AllRouteResponse> mo8649b(GenericRequest genericRequest, boolean z, Context context, int i) {
        lm2<AllRouteResponse> lm2 = new lm2<>();
        return z ? mo8651d(lm2, genericRequest, i, context) : lm2;
    }

    /* renamed from: c */
    public lm2<AllRouteResponse> mo8650c() {
        lm2<AllRouteResponse> lm2 = new lm2<>();
        this.f7088a.mo21362g().mo14269jh(new C1346e(lm2));
        return lm2;
    }

    /* renamed from: d */
    public final lm2<AllRouteResponse> mo8651d(lm2<AllRouteResponse> lm2, GenericRequest genericRequest, int i, Context context) {
        this.f7088a.mo21360e(genericRequest).mo14269jh(new C1343b(lm2));
        return lm2;
    }

    /* renamed from: e */
    public lm2<AllStopsResponse> mo8652e(GenericRequest genericRequest, boolean z, Context context, int i) {
        lm2<AllStopsResponse> lm2 = new lm2<>();
        return z ? mo8654g(lm2, genericRequest, i, context) : lm2;
    }

    /* renamed from: f */
    public lm2<AllStopsResponse> mo8653f() {
        lm2<AllStopsResponse> lm2 = new lm2<>();
        this.f7088a.mo21363h().mo14269jh(new C1348g(lm2));
        return lm2;
    }

    /* renamed from: g */
    public final lm2<AllStopsResponse> mo8654g(lm2<AllStopsResponse> lm2, GenericRequest genericRequest, int i, Context context) {
        this.f7088a.mo21361f(genericRequest).mo14269jh(new C1344c(lm2));
        return lm2;
    }

    /* renamed from: h */
    public lm2<BusMetaData> mo8655h(String str) {
        lm2<BusMetaData> lm2 = new lm2<>();
        this.f7088a.mo21359d(str).mo14269jh(new C1342a(lm2));
        return lm2;
    }

    /* renamed from: i */
    public final float mo8656i(double d, double d2, double d3, double d4) {
        Location location = new Location(pj0.m61166a(-128770721814343L));
        location.setLatitude(d);
        location.setLongitude(d2);
        Location location2 = new Location(pj0.m61166a(-128775016781639L));
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        return location.distanceTo(location2);
    }

    /* renamed from: k */
    public lm2<AllStopsResponse> mo8657k(NearByStopsRequest nearByStopsRequest, boolean z, Context context) {
        lm2<AllStopsResponse> lm2 = new lm2<>();
        AllStopsResponse allStopsResponse = new AllStopsResponse();
        ArrayList arrayList = new ArrayList();
        if (z) {
            return mo8658l(nearByStopsRequest, lm2);
        }
        new Thread(new C1349h(context, nearByStopsRequest, arrayList, allStopsResponse)).start();
        int i = 0;
        while (allStopsResponse.getAll_stops() == null && i < 12) {
            try {
                Thread.sleep(90);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
        if (allStopsResponse.getAll_stops() != null) {
            lm2.mo4933q(allStopsResponse);
        } else {
            lm2.mo4933q(null);
        }
        return lm2;
    }

    /* renamed from: l */
    public final lm2<AllStopsResponse> mo8658l(NearByStopsRequest nearByStopsRequest, lm2<AllStopsResponse> lm2) {
        this.f7088a.mo21364i(nearByStopsRequest).mo14269jh(new C1350i(lm2));
        return lm2;
    }

    /* renamed from: m */
    public lm2<RouteResponse> mo8659m(RouteDetailRequest routeDetailRequest) {
        lm2<RouteResponse> lm2 = new lm2<>();
        this.f7088a.mo21358c(routeDetailRequest).mo14269jh(new C1345d(lm2));
        return lm2;
    }

    /* renamed from: n */
    public lm2<RouteResponse> mo8660n(String str, String str2) {
        lm2<RouteResponse> lm2 = new lm2<>();
        this.f7088a.mo21357b(str, str2).mo14269jh(new C1347f(lm2));
        return lm2;
    }

    /* renamed from: o */
    public lm2<MetroTimeTableResponse> mo8661o() {
        lm2<MetroTimeTableResponse> lm2 = new lm2<>();
        this.f7088a.mo21356a().mo14269jh(new C1351j(lm2));
        return lm2;
    }
}
