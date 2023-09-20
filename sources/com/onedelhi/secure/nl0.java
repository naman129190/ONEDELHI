package com.onedelhi.secure;

import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.data.NearByStopsRequest;
import com.delhitransport.onedelhi.data.RouteDetailRequest;
import com.delhitransport.onedelhi.data.RouteResponse;
import com.delhitransport.onedelhi.live.BusMetaData;
import com.delhitransport.onedelhi.live.MetroTimeTableResponse;

public interface nl0 {
    @md1("dmrc/get_timetable")
    /* renamed from: a */
    C6595qs<MetroTimeTableResponse> mo21356a();

    @md1("dmrc/get_routes")
    /* renamed from: b */
    C6595qs<RouteResponse> mo21357b(@e93("line") String str, @e93("direction") String str2);

    @sx2("dimts/get_transit_route_details")
    /* renamed from: c */
    C6595qs<RouteResponse> mo21358c(@C5439gn RouteDetailRequest routeDetailRequest);

    @md1("dimts/get_bus_meta_data")
    /* renamed from: d */
    C6595qs<BusMetaData> mo21359d(@e93("bus_number") String str);

    @sx2("dimts/get_routes")
    /* renamed from: e */
    C6595qs<AllRouteResponse> mo21360e(@C5439gn GenericRequest genericRequest);

    @sx2("dimts/get_stops")
    /* renamed from: f */
    C6595qs<AllStopsResponse> mo21361f(@C5439gn GenericRequest genericRequest);

    @md1("dmrc/get_all_routes")
    /* renamed from: g */
    C6595qs<AllRouteResponse> mo21362g();

    @md1("dmrc/get_stops")
    /* renamed from: h */
    C6595qs<AllStopsResponse> mo21363h();

    @sx2("dimts/get_nearby_stops")
    /* renamed from: i */
    C6595qs<AllStopsResponse> mo21364i(@C5439gn NearByStopsRequest nearByStopsRequest);
}
