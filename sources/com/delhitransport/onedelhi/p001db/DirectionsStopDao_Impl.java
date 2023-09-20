package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.data.Stops;
import com.onedelhi.secure.bc0;
import com.onedelhi.secure.bn3;
import com.onedelhi.secure.s74;
import com.onedelhi.secure.vc0;
import com.onedelhi.secure.wu0;
import com.onedelhi.secure.xu0;
import com.onedelhi.secure.ym3;
import com.onedelhi.secure.yx3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.db.DirectionsStopDao_Impl */
public final class DirectionsStopDao_Impl implements DirectionsStopDao {
    private final ym3 __db;
    private final xu0<Stops> __insertionAdapterOfStops;
    private final yx3 __preparedStmtOfDelete;
    private final wu0<Stops> __updateAdapterOfStops;

    public DirectionsStopDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfStops = new xu0<Stops>(ym3) {
            public void bind(s74 s74, Stops stops) {
                s74.mo13596B2(1, (long) stops.getId());
                s74.mo13596B2(2, (long) stops.getStop_id());
                if (stops.getStop_name() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, stops.getStop_name());
                }
                s74.mo13600P1(4, stops.getLat());
                s74.mo13600P1(5, stops.getLon());
                if (stops.getStop_type() == null) {
                    s74.mo13599J0(6);
                } else {
                    s74.mo13605m2(6, stops.getStop_type());
                }
                if (stops.getStop_desc() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, stops.getStop_desc());
                }
                s74.mo13596B2(8, (long) stops.getCluster_id());
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `Stops` (`id`,`stop_id`,`name`,`lat`,`lon`,`stop_type`,`stop_desc`,`cluster_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfStops = new wu0<Stops>(ym3) {
            public void bind(s74 s74, Stops stops) {
                s74.mo13596B2(1, (long) stops.getId());
                s74.mo13596B2(2, (long) stops.getStop_id());
                if (stops.getStop_name() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, stops.getStop_name());
                }
                s74.mo13600P1(4, stops.getLat());
                s74.mo13600P1(5, stops.getLon());
                if (stops.getStop_type() == null) {
                    s74.mo13599J0(6);
                } else {
                    s74.mo13605m2(6, stops.getStop_type());
                }
                if (stops.getStop_desc() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, stops.getStop_desc());
                }
                s74.mo13596B2(8, (long) stops.getCluster_id());
                s74.mo13596B2(9, (long) stops.getId());
            }

            public String createQuery() {
                return "UPDATE OR ABORT `Stops` SET `id` = ?,`stop_id` = ?,`name` = ?,`lat` = ?,`lon` = ?,`stop_type` = ?,`stop_desc` = ?,`cluster_id` = ? WHERE `id` = ?";
            }
        };
        this.__preparedStmtOfDelete = new yx3(ym3) {
            public String createQuery() {
                return "DELETE FROM Stops";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public void delete() {
        this.__db.assertNotSuspendingTransaction();
        s74 acquire = this.__preparedStmtOfDelete.acquire();
        this.__db.beginTransaction();
        try {
            acquire.mo13601a1();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    public List<Stops> getAll() {
        bn3 d = bn3.m11970d("SELECT * FROM Stops", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "stop_id");
            int e3 = bc0.m11793e(f, "name");
            int e4 = bc0.m11793e(f, "lat");
            int e5 = bc0.m11793e(f, "lon");
            int e6 = bc0.m11793e(f, "stop_type");
            int e7 = bc0.m11793e(f, "stop_desc");
            int e8 = bc0.m11793e(f, "cluster_id");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                Stops stops = new Stops();
                stops.setId(f.getInt(e));
                stops.setStop_id(f.getInt(e2));
                stops.setStop_name(f.isNull(e3) ? null : f.getString(e3));
                stops.setLat(f.getDouble(e4));
                stops.setLon(f.getDouble(e5));
                stops.setStop_type(f.isNull(e6) ? null : f.getString(e6));
                stops.setStop_desc(f.isNull(e7) ? null : f.getString(e7));
                stops.setCluster_id(f.getInt(e8));
                arrayList.add(stops);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public List<Stops> getStops(String str) {
        bn3 d = bn3.m11970d("SELECT * FROM Stops where stop_type = ?", 1);
        if (str == null) {
            d.mo13599J0(1);
        } else {
            d.mo13605m2(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "stop_id");
            int e3 = bc0.m11793e(f, "name");
            int e4 = bc0.m11793e(f, "lat");
            int e5 = bc0.m11793e(f, "lon");
            int e6 = bc0.m11793e(f, "stop_type");
            int e7 = bc0.m11793e(f, "stop_desc");
            int e8 = bc0.m11793e(f, "cluster_id");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                Stops stops = new Stops();
                stops.setId(f.getInt(e));
                stops.setStop_id(f.getInt(e2));
                stops.setStop_name(f.isNull(e3) ? null : f.getString(e3));
                stops.setLat(f.getDouble(e4));
                stops.setLon(f.getDouble(e5));
                stops.setStop_type(f.isNull(e6) ? null : f.getString(e6));
                stops.setStop_desc(f.isNull(e7) ? null : f.getString(e7));
                stops.setCluster_id(f.getInt(e8));
                arrayList.add(stops);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(Stops stops) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfStops.insert(stops);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insert(ArrayList<Stops> arrayList) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfStops.insert(arrayList);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(Stops stops) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfStops.handle(stops);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
