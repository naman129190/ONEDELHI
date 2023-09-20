package com.onedelhi.secure;

import com.delhitransport.onedelhi.models.directions.AllStopsResponse;
import com.delhitransport.onedelhi.models.directions.DirectionResponse;

public interface nd1 {
    @md1("/v2/get_directions_bus")
    /* renamed from: a */
    C6595qs<DirectionResponse> mo21151a(@e93("src") String str, @e93("src_name") String str2, @e93("dest") String str3, @e93("dest_name") String str4, @e93("time") String str5, @e93("src_type") String str6, @e93("dest_type") String str7, @e93("entry_point") String str8);

    @md1("get_stops_metro")
    /* renamed from: b */
    C6595qs<AllStopsResponse> mo21152b();

    @md1("multi_modal/get_directions_from_src_dst_time_realtime")
    /* renamed from: c */
    C6595qs<DirectionResponse> mo21153c(@e93("src") String str, @e93("dst") String str2, @e93("time") String str3);

    @md1("get_test_response")
    /* renamed from: d */
    C6595qs<DirectionResponse> mo21154d(@e93("src") String str, @e93("dst") String str2);

    @md1("get_stops_bus")
    /* renamed from: e */
    C6595qs<AllStopsResponse> mo21155e();

    @md1("/get_multi_modal")
    /* renamed from: f */
    C6595qs<DirectionResponse> mo21156f(@e93("src") String str, @e93("src_name") String str2, @e93("dest") String str3, @e93("dest_name") String str4, @e93("time") String str5, @e93("src_type") String str6, @e93("dest_type") String str7, @e93("entry_point") String str8);

    @md1("/v2/get_directions_metro")
    /* renamed from: g */
    C6595qs<DirectionResponse> mo21157g(@e93("src") String str, @e93("src_name") String str2, @e93("dest") String str3, @e93("dest_name") String str4, @e93("time") String str5, @e93("src_type") String str6, @e93("dest_type") String str7, @e93("entry_point") String str8);
}
