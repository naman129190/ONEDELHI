package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.p002ev.EVSearchData;
import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import com.onedelhi.secure.to4;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.EVSearchDao */
public interface EVSearchDao {
    @f93("SELECT * FROM EVSearches")
    List<EVSearchData> getAll();

    @er1
    void insert(EVSearches eVSearches);

    @to4
    void update(EVSearches eVSearches);
}
