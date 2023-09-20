package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.p002ev.EVSearchData;
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

/* renamed from: com.delhitransport.onedelhi.db.EVSearchDao_Impl */
public final class EVSearchDao_Impl implements EVSearchDao {
    private final ym3 __db;
    private final xu0<EVSearches> __insertionAdapterOfEVSearches;
    private final wu0<EVSearches> __updateAdapterOfEVSearches;

    public EVSearchDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfEVSearches = new xu0<EVSearches>(ym3) {
            public void bind(s74 s74, EVSearches eVSearches) {
                if (eVSearches.getId() == null) {
                    s74.mo13599J0(1);
                } else {
                    s74.mo13605m2(1, eVSearches.getId());
                }
                if (eVSearches.getName() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, eVSearches.getName());
                }
                if (eVSearches.getAddress() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, eVSearches.getAddress());
                }
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `EVSearches` (`id`,`name`,`address`) VALUES (?,?,?)";
            }
        };
        this.__updateAdapterOfEVSearches = new wu0<EVSearches>(ym3) {
            public void bind(s74 s74, EVSearches eVSearches) {
                if (eVSearches.getId() == null) {
                    s74.mo13599J0(1);
                } else {
                    s74.mo13605m2(1, eVSearches.getId());
                }
                if (eVSearches.getName() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, eVSearches.getName());
                }
                if (eVSearches.getAddress() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, eVSearches.getAddress());
                }
                if (eVSearches.getId() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, eVSearches.getId());
                }
            }

            public String createQuery() {
                return "UPDATE OR ABORT `EVSearches` SET `id` = ?,`name` = ?,`address` = ? WHERE `id` = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public List<EVSearchData> getAll() {
        bn3 d = bn3.m11970d("SELECT * FROM EVSearches", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "name");
            int e3 = bc0.m11793e(f, "address");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                EVSearchData eVSearchData = new EVSearchData();
                eVSearchData.setId(f.isNull(e) ? null : f.getString(e));
                eVSearchData.setName(f.isNull(e2) ? null : f.getString(e2));
                eVSearchData.setAddress(f.isNull(e3) ? null : f.getString(e3));
                arrayList.add(eVSearchData);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(EVSearches eVSearches) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEVSearches.insert(eVSearches);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(EVSearches eVSearches) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfEVSearches.handle(eVSearches);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
