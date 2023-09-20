package com.delhitransport.onedelhi.viewmodels;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.data.NearByStopsRequest;
import com.delhitransport.onedelhi.data.RouteDetailRequest;
import com.delhitransport.onedelhi.data.RouteResponse;
import com.delhitransport.onedelhi.live.BusMetaData;
import com.delhitransport.onedelhi.live.MetroTimeTableResponse;
import com.delhitransport.onedelhi.networking.C1341e;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.lm2;

public class DataViewModel extends au4 {
    private C1341e directionRepository;
    private lm2<RouteResponse> routeResponseMutableLiveData;

    public LiveData<AllRouteResponse> getAllRouteLiveDataDIMTS(GenericRequest genericRequest, boolean z, Context context, int i) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8649b(genericRequest, z, context, i);
    }

    public LiveData<AllRouteResponse> getAllRouteLiveDataDMRC() {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8650c();
    }

    public LiveData<AllStopsResponse> getAllStopsLiveDataDIMTS(GenericRequest genericRequest, boolean z, Context context, int i) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8652e(genericRequest, z, context, i);
    }

    public LiveData<AllStopsResponse> getAllStopsLiveDataDMRC() {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8653f();
    }

    public LiveData<BusMetaData> getBusMetaData(String str) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8655h(str);
    }

    public LiveData<AllStopsResponse> getNearByStopsDIMTS(NearByStopsRequest nearByStopsRequest, boolean z, Context context) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8657k(nearByStopsRequest, z, context);
    }

    public LiveData<RouteResponse> getRouteLiveDataDIMTS(RouteDetailRequest routeDetailRequest) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        lm2<RouteResponse> m = j.mo8659m(routeDetailRequest);
        this.routeResponseMutableLiveData = m;
        return m;
    }

    public LiveData<RouteResponse> getRouteLiveDataDMRC(String str, String str2) {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        lm2<RouteResponse> n = j.mo8660n(str, str2);
        this.routeResponseMutableLiveData = n;
        return n;
    }

    public LiveData<MetroTimeTableResponse> getTimetableDMRC() {
        C1341e j = C1341e.m8543j();
        this.directionRepository = j;
        return j.mo8661o();
    }
}
