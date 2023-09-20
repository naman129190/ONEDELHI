package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.onedelhi.secure.bc0;
import com.onedelhi.secure.bn3;
import com.onedelhi.secure.f54;
import com.onedelhi.secure.s74;
import com.onedelhi.secure.vc0;
import com.onedelhi.secure.xu0;
import com.onedelhi.secure.ym3;
import com.onedelhi.secure.yx3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.db.PastTripPlannerSearchDao_Impl */
public final class PastTripPlannerSearchDao_Impl implements PastTripPlannerSearchDao {
    private final ym3 __db;
    private final xu0<PastSearchTripPlanner> __insertionAdapterOfPastSearchTripPlanner;
    private final yx3 __preparedStmtOfDelete;
    private final yx3 __preparedStmtOfUpdate;

    public PastTripPlannerSearchDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfPastSearchTripPlanner = new xu0<PastSearchTripPlanner>(ym3) {
            public void bind(s74 s74, PastSearchTripPlanner pastSearchTripPlanner) {
                s74.mo13596B2(1, (long) pastSearchTripPlanner.getId());
                s74.mo13596B2(2, (long) pastSearchTripPlanner.getStop_id());
                if (pastSearchTripPlanner.getStop_name() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, pastSearchTripPlanner.getStop_name());
                }
                if (pastSearchTripPlanner.getStop_type() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, pastSearchTripPlanner.getStop_type());
                }
                if (pastSearchTripPlanner.getStop_desc() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, pastSearchTripPlanner.getStop_desc());
                }
                s74.mo13596B2(6, (long) pastSearchTripPlanner.getCount());
                if (pastSearchTripPlanner.getStop_lat() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13600P1(7, pastSearchTripPlanner.getStop_lat().doubleValue());
                }
                if (pastSearchTripPlanner.getStop_lon() == null) {
                    s74.mo13599J0(8);
                } else {
                    s74.mo13600P1(8, pastSearchTripPlanner.getStop_lon().doubleValue());
                }
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `PastSearchTripPlanner` (`id`,`stop_id`,`stop_name`,`stop_type`,`stop_desc`,`count`,`stop_lat`,`stop_lon`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfUpdate = new yx3(ym3) {
            public String createQuery() {
                return "UPDATE PastSearchTripPlanner SET count = ? where stop_type == ? AND stop_name = ?";
            }
        };
        this.__preparedStmtOfDelete = new yx3(ym3) {
            public String createQuery() {
                return "DELETE FROM PastSearchTripPlanner";
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

    public List<PastSearchTripPlanner> getAll(String str) {
        bn3 d = bn3.m11970d("SELECT * FROM PastSearchTripPlanner where stop_type == ? ORDER by count DESC", 1);
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
            int e3 = bc0.m11793e(f, "stop_name");
            int e4 = bc0.m11793e(f, "stop_type");
            int e5 = bc0.m11793e(f, "stop_desc");
            int e6 = bc0.m11793e(f, "count");
            int e7 = bc0.m11793e(f, "stop_lat");
            int e8 = bc0.m11793e(f, "stop_lon");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                PastSearchTripPlanner pastSearchTripPlanner = new PastSearchTripPlanner();
                pastSearchTripPlanner.setId(f.getInt(e));
                pastSearchTripPlanner.setStop_id(f.getInt(e2));
                pastSearchTripPlanner.setStop_name(f.isNull(e3) ? null : f.getString(e3));
                pastSearchTripPlanner.setStop_type(f.isNull(e4) ? null : f.getString(e4));
                pastSearchTripPlanner.setStop_desc(f.isNull(e5) ? null : f.getString(e5));
                pastSearchTripPlanner.setCount(f.getInt(e6));
                pastSearchTripPlanner.setStop_lat(f.isNull(e7) ? null : Double.valueOf(f.getDouble(e7)));
                pastSearchTripPlanner.setStop_lon(f.isNull(e8) ? null : Double.valueOf(f.getDouble(e8)));
                arrayList.add(pastSearchTripPlanner);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public List<PastSearchTripPlanner> getAll(ArrayList<String> arrayList) {
        StringBuilder c = f54.m14638c();
        c.append("SELECT * FROM PastSearchTripPlanner where stop_type in (");
        int size = arrayList.size();
        f54.m14636a(c, size);
        c.append(") ORDER by count DESC");
        bn3 d = bn3.m11970d(c.toString(), size + 0);
        Iterator<String> it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                d.mo13599J0(i);
            } else {
                d.mo13605m2(i, next);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "stop_id");
            int e3 = bc0.m11793e(f, "stop_name");
            int e4 = bc0.m11793e(f, "stop_type");
            int e5 = bc0.m11793e(f, "stop_desc");
            int e6 = bc0.m11793e(f, "count");
            int e7 = bc0.m11793e(f, "stop_lat");
            int e8 = bc0.m11793e(f, "stop_lon");
            ArrayList arrayList2 = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                PastSearchTripPlanner pastSearchTripPlanner = new PastSearchTripPlanner();
                pastSearchTripPlanner.setId(f.getInt(e));
                pastSearchTripPlanner.setStop_id(f.getInt(e2));
                pastSearchTripPlanner.setStop_name(f.isNull(e3) ? null : f.getString(e3));
                pastSearchTripPlanner.setStop_type(f.isNull(e4) ? null : f.getString(e4));
                pastSearchTripPlanner.setStop_desc(f.isNull(e5) ? null : f.getString(e5));
                pastSearchTripPlanner.setCount(f.getInt(e6));
                pastSearchTripPlanner.setStop_lat(f.isNull(e7) ? null : Double.valueOf(f.getDouble(e7)));
                pastSearchTripPlanner.setStop_lon(f.isNull(e8) ? null : Double.valueOf(f.getDouble(e8)));
                arrayList2.add(pastSearchTripPlanner);
            }
            return arrayList2;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(PastSearchTripPlanner pastSearchTripPlanner) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPastSearchTripPlanner.insert(pastSearchTripPlanner);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(int i, String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        s74 acquire = this.__preparedStmtOfUpdate.acquire();
        acquire.mo13596B2(1, (long) i);
        if (str == null) {
            acquire.mo13599J0(2);
        } else {
            acquire.mo13605m2(2, str);
        }
        if (str2 == null) {
            acquire.mo13599J0(3);
        } else {
            acquire.mo13605m2(3, str2);
        }
        this.__db.beginTransaction();
        try {
            acquire.mo13601a1();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdate.release(acquire);
        }
    }
}
