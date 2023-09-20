package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.live.RouteSearchData;
import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import com.onedelhi.secure.to4;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.RouteSearchDao */
public interface RouteSearchDao {
    @f93("SELECT * FROM RouteSearches")
    List<RouteSearchData> getAll();

    @er1
    void insert(RouteSearches routeSearches);

    @to4
    void update(RouteSearches routeSearches);
}
