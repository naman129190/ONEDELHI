package com.onedelhi.secure;

import com.delhitransport.onedelhi.live.BusesOnRouteRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
import com.delhitransport.onedelhi.models.LiveBusData;
import java.util.List;

public interface o42 {
    @sx2("/nearby-buses")
    /* renamed from: a */
    C6595qs<List<LiveItem>> mo21596a(@C5439gn LiveRequest liveRequest);

    @sx2("/buses-on-route")
    /* renamed from: b */
    C6595qs<List<LiveItem>> mo21597b(@C5439gn BusesOnRouteRequest busesOnRouteRequest);

    @md1("/bus-data")
    /* renamed from: c */
    C6595qs<LiveBusData> mo21598c(@e93("vehicle_id") String str);
}
