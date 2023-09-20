package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.data.AllStops;
import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.StopsDao */
public interface StopsDao {
    @f93("DELETE FROM AllStops")
    void delete();

    @f93("SELECT * FROM AllStops")
    List<AllStops> getAllStops();

    @f93("SELECT COUNT(*) FROM AllStops")
    int getStopsCount();

    @er1
    void insert(AllStops allStops);

    @er1
    void insertMultiple(List<AllStops> list);
}
