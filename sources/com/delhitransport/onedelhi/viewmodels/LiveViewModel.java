package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.live.BusesOnRouteRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
import com.delhitransport.onedelhi.models.LiveBusData;
import com.delhitransport.onedelhi.networking.C1375j;
import com.onedelhi.secure.au4;
import java.util.List;

public class LiveViewModel extends au4 {
    public LiveData<List<LiveItem>> buses_on_route(BusesOnRouteRequest busesOnRouteRequest) {
        C1375j.m8640b();
        return C1375j.m8639a(busesOnRouteRequest);
    }

    public LiveData<LiveBusData> get_bus_data(String str) {
        C1375j.m8640b();
        return C1375j.m8641c(str);
    }

    public LiveData<List<LiveItem>> get_nearby_bus(LiveRequest liveRequest) {
        C1375j.m8640b();
        return C1375j.m8642d(liveRequest);
    }
}
