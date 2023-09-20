package com.delhitransport.onedelhi.p001db;

import android.database.Cursor;
import android.os.CancellationSignal;
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

/* renamed from: com.delhitransport.onedelhi.db.BookingDao_Impl */
public final class BookingDao_Impl implements BookingDao {
    private final ym3 __db;
    private final xu0<UserBookings> __insertionAdapterOfUserBookings;
    private final wu0<UserBookings> __updateAdapterOfUserBookings;

    public BookingDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfUserBookings = new xu0<UserBookings>(ym3) {
            public void bind(s74 s74, UserBookings userBookings) {
                s74.mo13596B2(1, (long) userBookings.getId());
                if (userBookings.getMessage() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, userBookings.getMessage());
                }
                if (userBookings.getRoute_long_name() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, userBookings.getRoute_long_name());
                }
                s74.mo13596B2(4, (long) userBookings.getStart_stop_index());
                if (userBookings.getStart_stop_name() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, userBookings.getStart_stop_name());
                }
                if (userBookings.getBooking_id() == null) {
                    s74.mo13599J0(6);
                } else {
                    s74.mo13605m2(6, userBookings.getBooking_id());
                }
                if (userBookings.getAgency() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, userBookings.getAgency());
                }
                s74.mo13596B2(8, userBookings.isIs_ac() ? 1 : 0);
                if (userBookings.getDescription() == null) {
                    s74.mo13599J0(9);
                } else {
                    s74.mo13605m2(9, userBookings.getDescription());
                }
                if (userBookings.getRoute_termination_stop() == null) {
                    s74.mo13599J0(10);
                } else {
                    s74.mo13605m2(10, userBookings.getRoute_termination_stop());
                }
                s74.mo13596B2(11, userBookings.isPostpaid() ? 1 : 0);
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `UserBookings` (`id`,`message`,`route_long_name`,`start_stop_index`,`start_stop_name`,`booking_id`,`bus_agency`,`is_ac`,`description`,`route_termination_stop`,`postpaid`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfUserBookings = new wu0<UserBookings>(ym3) {
            public void bind(s74 s74, UserBookings userBookings) {
                s74.mo13596B2(1, (long) userBookings.getId());
                if (userBookings.getMessage() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, userBookings.getMessage());
                }
                if (userBookings.getRoute_long_name() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, userBookings.getRoute_long_name());
                }
                s74.mo13596B2(4, (long) userBookings.getStart_stop_index());
                if (userBookings.getStart_stop_name() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, userBookings.getStart_stop_name());
                }
                if (userBookings.getBooking_id() == null) {
                    s74.mo13599J0(6);
                } else {
                    s74.mo13605m2(6, userBookings.getBooking_id());
                }
                if (userBookings.getAgency() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, userBookings.getAgency());
                }
                s74.mo13596B2(8, userBookings.isIs_ac() ? 1 : 0);
                if (userBookings.getDescription() == null) {
                    s74.mo13599J0(9);
                } else {
                    s74.mo13605m2(9, userBookings.getDescription());
                }
                if (userBookings.getRoute_termination_stop() == null) {
                    s74.mo13599J0(10);
                } else {
                    s74.mo13605m2(10, userBookings.getRoute_termination_stop());
                }
                s74.mo13596B2(11, userBookings.isPostpaid() ? 1 : 0);
                s74.mo13596B2(12, (long) userBookings.getId());
            }

            public String createQuery() {
                return "UPDATE OR ABORT `UserBookings` SET `id` = ?,`message` = ?,`route_long_name` = ?,`start_stop_index` = ?,`start_stop_name` = ?,`booking_id` = ?,`bus_agency` = ?,`is_ac` = ?,`description` = ?,`route_termination_stop` = ?,`postpaid` = ? WHERE `id` = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public List<UserBookings> getAll() {
        bn3 d = bn3.m11970d("SELECT * FROM UserBookings", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "message");
            int e3 = bc0.m11793e(f, "route_long_name");
            int e4 = bc0.m11793e(f, "start_stop_index");
            int e5 = bc0.m11793e(f, "start_stop_name");
            int e6 = bc0.m11793e(f, "booking_id");
            int e7 = bc0.m11793e(f, "bus_agency");
            int e8 = bc0.m11793e(f, "is_ac");
            int e9 = bc0.m11793e(f, "description");
            int e10 = bc0.m11793e(f, "route_termination_stop");
            int e11 = bc0.m11793e(f, "postpaid");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                UserBookings userBookings = new UserBookings();
                userBookings.setId(f.getInt(e));
                userBookings.setMessage(f.isNull(e2) ? null : f.getString(e2));
                userBookings.setRoute_long_name(f.isNull(e3) ? null : f.getString(e3));
                userBookings.setStart_stop_index(f.getInt(e4));
                userBookings.setStart_stop_name(f.isNull(e5) ? null : f.getString(e5));
                userBookings.setBooking_id(f.isNull(e6) ? null : f.getString(e6));
                userBookings.setAgency(f.isNull(e7) ? null : f.getString(e7));
                userBookings.setIs_ac(f.getInt(e8) != 0);
                userBookings.setDescription(f.isNull(e9) ? null : f.getString(e9));
                userBookings.setRoute_termination_stop(f.isNull(e10) ? null : f.getString(e10));
                userBookings.setPostpaid(f.getInt(e11) != 0);
                arrayList.add(userBookings);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public List<UserBookings> getLast() {
        bn3 d = bn3.m11970d("SELECT * FROM UserBookings ORDER BY id DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "message");
            int e3 = bc0.m11793e(f, "route_long_name");
            int e4 = bc0.m11793e(f, "start_stop_index");
            int e5 = bc0.m11793e(f, "start_stop_name");
            int e6 = bc0.m11793e(f, "booking_id");
            int e7 = bc0.m11793e(f, "bus_agency");
            int e8 = bc0.m11793e(f, "is_ac");
            int e9 = bc0.m11793e(f, "description");
            int e10 = bc0.m11793e(f, "route_termination_stop");
            int e11 = bc0.m11793e(f, "postpaid");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                UserBookings userBookings = new UserBookings();
                userBookings.setId(f.getInt(e));
                userBookings.setMessage(f.isNull(e2) ? null : f.getString(e2));
                userBookings.setRoute_long_name(f.isNull(e3) ? null : f.getString(e3));
                userBookings.setStart_stop_index(f.getInt(e4));
                userBookings.setStart_stop_name(f.isNull(e5) ? null : f.getString(e5));
                userBookings.setBooking_id(f.isNull(e6) ? null : f.getString(e6));
                userBookings.setAgency(f.isNull(e7) ? null : f.getString(e7));
                userBookings.setIs_ac(f.getInt(e8) != 0);
                userBookings.setDescription(f.isNull(e9) ? null : f.getString(e9));
                userBookings.setRoute_termination_stop(f.isNull(e10) ? null : f.getString(e10));
                userBookings.setPostpaid(f.getInt(e11) != 0);
                arrayList.add(userBookings);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    public void insert(UserBookings userBookings) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserBookings.insert(userBookings);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(UserBookings userBookings) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfUserBookings.handle(userBookings);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
