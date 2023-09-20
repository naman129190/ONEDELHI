package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.EvAllSearchDao */
public interface EvAllSearchDao {
    @f93("DELETE FROM EvAllSearch")
    void deleteAll();

    @f93("SELECT * FROM EvAllSearch")
    List<EvAllSearch> getAll();

    @f93("SELECT COUNT(*) FROM EvAllSearch")
    int getTotalEVCount();

    @er1
    void insert(EvAllSearch evAllSearch);

    @er1
    void insertMultiple(List<EvAllSearch> list);
}
