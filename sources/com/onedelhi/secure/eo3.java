package com.onedelhi.secure;

import com.delhitransport.onedelhi.data.AllRoutes;
import java.util.List;

@bd0
public interface eo3 {
    @f93("SELECT * FROM AllRoutes")
    /* renamed from: a */
    List<AllRoutes> mo15257a();

    @f93("SELECT COUNT(*) FROM ALLROUTES")
    /* renamed from: b */
    int mo15258b();

    @er1
    /* renamed from: c */
    void mo15259c(AllRoutes allRoutes);

    @f93("DELETE FROM ALLROUTES")
    void delete();

    @er1
    void insertMultiple(List<AllRoutes> list);
}
