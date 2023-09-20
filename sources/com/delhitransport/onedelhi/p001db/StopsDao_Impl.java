package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.data.AllStops;
import com.onedelhi.secure.bc0;
import com.onedelhi.secure.bn3;
import com.onedelhi.secure.s74;
import com.onedelhi.secure.vc0;
import com.onedelhi.secure.xu0;
import com.onedelhi.secure.ym3;
import com.onedelhi.secure.yx3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.db.StopsDao_Impl */
public final class StopsDao_Impl implements StopsDao {
    private final ym3 __db;
    private final xu0<AllStops> __insertionAdapterOfAllStops;
    private final yx3 __preparedStmtOfDelete;

    public StopsDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfAllStops = new xu0<AllStops>(ym3) {
            public void bind(s74 s74, AllStops allStops) {
                s74.mo13596B2(1, (long) allStops.getId());
                if (allStops.getLat() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13600P1(2, allStops.getLat().doubleValue());
                }
                if (allStops.getLng() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13600P1(3, allStops.getLng().doubleValue());
                }
                if (allStops.getName() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, allStops.getName());
                }
                if (allStops.getNext_stop() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, allStops.getNext_stop());
                }
                if (allStops.getStop_type() == null) {
                    s74.mo13599J0(6);
                } else {
                    s74.mo13605m2(6, allStops.getStop_type());
                }
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `AllStops` (`id`,`latitude`,`longitude`,`name`,`next_stop`,`stop_type`) VALUES (?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDelete = new yx3(ym3) {
            public String createQuery() {
                return "DELETE FROM AllStops";
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

    public List<AllStops> getAllStops() {
        bn3 d = bn3.m11970d("SELECT * FROM AllStops", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "latitude");
            int e3 = bc0.m11793e(f, "longitude");
            int e4 = bc0.m11793e(f, "name");
            int e5 = bc0.m11793e(f, "next_stop");
            int e6 = bc0.m11793e(f, "stop_type");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                AllStops allStops = new AllStops();
                allStops.setId(f.getInt(e));
                allStops.setLat(f.isNull(e2) ? null : Double.valueOf(f.getDouble(e2)));
                allStops.setLng(f.isNull(e3) ? null : Double.valueOf(f.getDouble(e3)));
                allStops.setName(f.isNull(e4) ? null : f.getString(e4));
                allStops.setNext_stop(f.isNull(e5) ? null : f.getString(e5));
                allStops.setStop_type(f.isNull(e6) ? null : f.getString(e6));
                arrayList.add(allStops);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public int getStopsCount() {
        int i = 0;
        bn3 d = bn3.m11970d("SELECT COUNT(*) FROM AllStops", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                i = f.getInt(0);
            }
            return i;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(AllStops allStops) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAllStops.insert(allStops);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertMultiple(List<AllStops> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAllStops.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
