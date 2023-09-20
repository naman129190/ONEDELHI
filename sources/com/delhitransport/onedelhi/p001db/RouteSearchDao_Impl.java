package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.live.RouteSearchData;
import com.onedelhi.secure.bc0;
import com.onedelhi.secure.bn3;
import com.onedelhi.secure.s74;
import com.onedelhi.secure.vc0;
import com.onedelhi.secure.wu0;
import com.onedelhi.secure.xu0;
import com.onedelhi.secure.ym3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.db.RouteSearchDao_Impl */
public final class RouteSearchDao_Impl implements RouteSearchDao {
    private final ym3 __db;
    private final xu0<RouteSearches> __insertionAdapterOfRouteSearches;
    private final wu0<RouteSearches> __updateAdapterOfRouteSearches;

    public RouteSearchDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfRouteSearches = new xu0<RouteSearches>(ym3) {
            public void bind(s74 s74, RouteSearches routeSearches) {
                s74.mo13596B2(1, (long) routeSearches.getId());
                if (routeSearches.getRoute_name() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, routeSearches.getRoute_name());
                }
                if (routeSearches.getSource() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, routeSearches.getSource());
                }
                if (routeSearches.getTerminal() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, routeSearches.getTerminal());
                }
                if (routeSearches.getType() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, routeSearches.getType());
                }
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `RouteSearches` (`id`,`route_name`,`source`,`terminal`,`type`) VALUES (nullif(?, 0),?,?,?,?)";
            }
        };
        this.__updateAdapterOfRouteSearches = new wu0<RouteSearches>(ym3) {
            public void bind(s74 s74, RouteSearches routeSearches) {
                s74.mo13596B2(1, (long) routeSearches.getId());
                if (routeSearches.getRoute_name() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, routeSearches.getRoute_name());
                }
                if (routeSearches.getSource() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, routeSearches.getSource());
                }
                if (routeSearches.getTerminal() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, routeSearches.getTerminal());
                }
                if (routeSearches.getType() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, routeSearches.getType());
                }
                s74.mo13596B2(6, (long) routeSearches.getId());
            }

            public String createQuery() {
                return "UPDATE OR ABORT `RouteSearches` SET `id` = ?,`route_name` = ?,`source` = ?,`terminal` = ?,`type` = ? WHERE `id` = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public List<RouteSearchData> getAll() {
        bn3 d = bn3.m11970d("SELECT * FROM RouteSearches", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "route_name");
            int e3 = bc0.m11793e(f, "source");
            int e4 = bc0.m11793e(f, "terminal");
            int e5 = bc0.m11793e(f, "type");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                RouteSearchData routeSearchData = new RouteSearchData();
                routeSearchData.setId(f.isNull(e) ? null : f.getString(e));
                routeSearchData.setRoute_name(f.isNull(e2) ? null : f.getString(e2));
                routeSearchData.setSource(f.isNull(e3) ? null : f.getString(e3));
                routeSearchData.setTerminal(f.isNull(e4) ? null : f.getString(e4));
                routeSearchData.setType(f.isNull(e5) ? null : f.getString(e5));
                arrayList.add(routeSearchData);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(RouteSearches routeSearches) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRouteSearches.insert(routeSearches);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(RouteSearches routeSearches) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfRouteSearches.handle(routeSearches);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
