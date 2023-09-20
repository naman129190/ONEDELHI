package com.onedelhi.secure;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.delhitransport.onedelhi.data.AllRoutes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fo3 implements eo3 {

    /* renamed from: a */
    public final xu0<AllRoutes> f12243a;

    /* renamed from: a */
    public final ym3 f12244a;

    /* renamed from: a */
    public final yx3 f12245a;

    /* renamed from: com.onedelhi.secure.fo3$a */
    public class C2188a extends xu0<AllRoutes> {
        public C2188a(ym3 ym3) {
            super(ym3);
        }

        /* renamed from: c */
        public void bind(s74 s74, AllRoutes allRoutes) {
            if (allRoutes.getId() == null) {
                s74.mo13599J0(1);
            } else {
                s74.mo13605m2(1, allRoutes.getId());
            }
            if (allRoutes.getRoute() == null) {
                s74.mo13599J0(2);
            } else {
                s74.mo13605m2(2, allRoutes.getRoute());
            }
            if (allRoutes.getShortName() == null) {
                s74.mo13599J0(3);
            } else {
                s74.mo13605m2(3, allRoutes.getShortName());
            }
            if (allRoutes.getLongName() == null) {
                s74.mo13599J0(4);
            } else {
                s74.mo13605m2(4, allRoutes.getLongName());
            }
            if (allRoutes.getEnd() == null) {
                s74.mo13599J0(5);
            } else {
                s74.mo13605m2(5, allRoutes.getEnd());
            }
            if (allRoutes.getStart() == null) {
                s74.mo13599J0(6);
            } else {
                s74.mo13605m2(6, allRoutes.getStart());
            }
            if (allRoutes.getDirection() == null) {
                s74.mo13599J0(7);
            } else {
                s74.mo13605m2(7, allRoutes.getDirection());
            }
        }

        public String createQuery() {
            return "INSERT OR ABORT INTO `AllRoutes` (`id`,`route`,`short_name`,`long_name`,`end`,`start`,`direction`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: com.onedelhi.secure.fo3$b */
    public class C2189b extends yx3 {
        public C2189b(ym3 ym3) {
            super(ym3);
        }

        public String createQuery() {
            return "DELETE FROM ALLROUTES";
        }
    }

    public fo3(ym3 ym3) {
        this.f12244a = ym3;
        this.f12243a = new C2188a(ym3);
        this.f12245a = new C2189b(ym3);
    }

    /* renamed from: d */
    public static List<Class<?>> m15147d() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public List<AllRoutes> mo15257a() {
        bn3 d = bn3.m11970d("SELECT * FROM AllRoutes", 0);
        this.f12244a.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.f12244a, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "route");
            int e3 = bc0.m11793e(f, "short_name");
            int e4 = bc0.m11793e(f, "long_name");
            int e5 = bc0.m11793e(f, "end");
            int e6 = bc0.m11793e(f, "start");
            int e7 = bc0.m11793e(f, "direction");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                arrayList.add(new AllRoutes(f.isNull(e) ? null : f.getString(e), f.isNull(e2) ? null : f.getString(e2), f.isNull(e3) ? null : f.getString(e3), f.isNull(e4) ? null : f.getString(e4), f.isNull(e5) ? null : f.getString(e5), f.isNull(e6) ? null : f.getString(e6), f.isNull(e7) ? null : f.getString(e7)));
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: b */
    public int mo15258b() {
        int i = 0;
        bn3 d = bn3.m11970d("SELECT COUNT(*) FROM ALLROUTES", 0);
        this.f12244a.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.f12244a, d, false, (CancellationSignal) null);
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

    /* renamed from: c */
    public void mo15259c(AllRoutes allRoutes) {
        this.f12244a.assertNotSuspendingTransaction();
        this.f12244a.beginTransaction();
        try {
            this.f12243a.insert(allRoutes);
            this.f12244a.setTransactionSuccessful();
        } finally {
            this.f12244a.endTransaction();
        }
    }

    public void delete() {
        this.f12244a.assertNotSuspendingTransaction();
        s74 acquire = this.f12245a.acquire();
        this.f12244a.beginTransaction();
        try {
            acquire.mo13601a1();
            this.f12244a.setTransactionSuccessful();
        } finally {
            this.f12244a.endTransaction();
            this.f12245a.release(acquire);
        }
    }

    public void insertMultiple(List<AllRoutes> list) {
        this.f12244a.assertNotSuspendingTransaction();
        this.f12244a.beginTransaction();
        try {
            this.f12243a.insert(list);
            this.f12244a.setTransactionSuccessful();
        } finally {
            this.f12244a.endTransaction();
        }
    }
}
