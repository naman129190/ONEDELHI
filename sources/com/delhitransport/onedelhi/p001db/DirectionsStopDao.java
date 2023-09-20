package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.data.Stops;
import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import com.onedelhi.secure.to4;
import java.util.ArrayList;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.DirectionsStopDao */
public interface DirectionsStopDao {
    @f93("DELETE FROM Stops")
    void delete();

    @f93("SELECT * FROM Stops")
    List<Stops> getAll();

    @f93("SELECT * FROM Stops where stop_type = :stop_type")
    List<Stops> getStops(String str);

    @er1
    void insert(Stops stops);

    @er1
    void insert(ArrayList<Stops> arrayList);

    @to4
    void update(Stops stops);
}
