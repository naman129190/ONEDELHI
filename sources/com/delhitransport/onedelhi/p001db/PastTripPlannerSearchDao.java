package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import java.util.ArrayList;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.PastTripPlannerSearchDao */
public interface PastTripPlannerSearchDao {
    @f93("DELETE FROM PastSearchTripPlanner")
    void delete();

    @f93("SELECT * FROM PastSearchTripPlanner where stop_type == :type ORDER by count DESC")
    List<PastSearchTripPlanner> getAll(String str);

    @f93("SELECT * FROM PastSearchTripPlanner where stop_type in (:types) ORDER by count DESC")
    List<PastSearchTripPlanner> getAll(ArrayList<String> arrayList);

    @er1
    void insert(PastSearchTripPlanner pastSearchTripPlanner);

    @f93("UPDATE PastSearchTripPlanner SET count = :count where stop_type == :type AND stop_name = :stop_name")
    void update(int i, String str, String str2);
}
