package com.onedelhi.secure;

import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.delhitransport.onedelhi.p002ev.EVRequest;
import com.delhitransport.onedelhi.p002ev.EVSearch;
import com.delhitransport.onedelhi.p002ev.EVStations;
import java.util.List;

public interface zq0 {
    @md1("ev_id")
    /* renamed from: a */
    C6595qs<EVStations> mo28056a(@e93("id") String str);

    @md1("vendor_names")
    /* renamed from: b */
    C6595qs<List<String>> mo28057b();

    @md1("search_evs?string=")
    /* renamed from: c */
    C6595qs<EVSearch> mo28058c();

    @sx2("get_ev_locations")
    /* renamed from: d */
    C6595qs<EVStations> mo28059d(@C5439gn EVRequest eVRequest);

    @md1("connector_names")
    /* renamed from: e */
    C6595qs<List<EVConnector>> mo28060e();

    @md1("get_ev_locations")
    /* renamed from: f */
    C6595qs<EVStations> mo28061f();
}
