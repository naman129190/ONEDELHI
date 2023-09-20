package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
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

/* renamed from: com.delhitransport.onedelhi.db.EvAllSearchDao_Impl */
public final class EvAllSearchDao_Impl implements EvAllSearchDao {
    private final ym3 __db;
    private final xu0<EvAllSearch> __insertionAdapterOfEvAllSearch;
    private final yx3 __preparedStmtOfDeleteAll;

    public EvAllSearchDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfEvAllSearch = new xu0<EvAllSearch>(ym3) {
            public void bind(s74 s74, EvAllSearch evAllSearch) {
                if (evAllSearch.getName() == null) {
                    s74.mo13599J0(1);
                } else {
                    s74.mo13605m2(1, evAllSearch.getName());
                }
                if (evAllSearch.getId() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, evAllSearch.getId());
                }
                if (evAllSearch.getAddress() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, evAllSearch.getAddress());
                }
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `EvAllSearch` (`name`,`id`,`address`) VALUES (?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new yx3(ym3) {
            public String createQuery() {
                return "DELETE FROM EvAllSearch";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        s74 acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.mo13601a1();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    public List<EvAllSearch> getAll() {
        bn3 d = bn3.m11970d("SELECT * FROM EvAllSearch", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "name");
            int e2 = bc0.m11793e(f, "id");
            int e3 = bc0.m11793e(f, "address");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                EvAllSearch evAllSearch = new EvAllSearch();
                evAllSearch.setName(f.isNull(e) ? null : f.getString(e));
                evAllSearch.setId(f.isNull(e2) ? null : f.getString(e2));
                evAllSearch.setAddress(f.isNull(e3) ? null : f.getString(e3));
                arrayList.add(evAllSearch);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public int getTotalEVCount() {
        int i = 0;
        bn3 d = bn3.m11970d("SELECT COUNT(*) FROM EvAllSearch", 0);
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

    public void insert(EvAllSearch evAllSearch) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEvAllSearch.insert(evAllSearch);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertMultiple(List<EvAllSearch> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEvAllSearch.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
