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

/* renamed from: com.delhitransport.onedelhi.db.TicketDao_Impl */
public final class TicketDao_Impl implements TicketDao {
    private final ym3 __db;
    private final xu0<UserTickets> __insertionAdapterOfUserTickets;
    private final wu0<UserTickets> __updateAdapterOfUserTickets;

    public TicketDao_Impl(ym3 ym3) {
        this.__db = ym3;
        this.__insertionAdapterOfUserTickets = new xu0<UserTickets>(ym3) {
            public void bind(s74 s74, UserTickets userTickets) {
                s74.mo13596B2(1, (long) userTickets.getId());
                if (userTickets.getMessage() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, userTickets.getMessage());
                }
                if (userTickets.getBus_number() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, userTickets.getBus_number());
                }
                if (userTickets.getTicket_id() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, userTickets.getTicket_id());
                }
                if (userTickets.getBooking_id() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, userTickets.getBooking_id());
                }
                s74.mo13600P1(6, (double) userTickets.getFare());
                if (userTickets.getBus_route_long_name() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, userTickets.getBus_route_long_name());
                }
                if (userTickets.getBus_agency() == null) {
                    s74.mo13599J0(8);
                } else {
                    s74.mo13605m2(8, userTickets.getBus_agency());
                }
                if (userTickets.getBooking_time() == null) {
                    s74.mo13599J0(9);
                } else {
                    s74.mo13605m2(9, userTickets.getBooking_time());
                }
                if (userTickets.getValidity() == null) {
                    s74.mo13599J0(10);
                } else {
                    s74.mo13605m2(10, userTickets.getValidity());
                }
                if (userTickets.getDescription() == null) {
                    s74.mo13599J0(11);
                } else {
                    s74.mo13605m2(11, userTickets.getDescription());
                }
                s74.mo13600P1(12, (double) userTickets.getTotal_fare());
                s74.mo13596B2(13, (long) userTickets.getTicket_count());
                s74.mo13600P1(14, (double) userTickets.getFare_per_ticket());
                s74.mo13596B2(15, (long) userTickets.getValidity_stop_idx());
                s74.mo13596B2(16, (long) userTickets.getTransaction_type());
                if (userTickets.getTransaction_status() == null) {
                    s74.mo13599J0(17);
                } else {
                    s74.mo13605m2(17, userTickets.getTransaction_status());
                }
                if (userTickets.getCategory() == null) {
                    s74.mo13599J0(18);
                } else {
                    s74.mo13605m2(18, userTickets.getCategory());
                }
                if (userTickets.getTicket_start_stop_name() == null) {
                    s74.mo13599J0(19);
                } else {
                    s74.mo13605m2(19, userTickets.getTicket_start_stop_name());
                }
                s74.mo13596B2(20, (long) userTickets.getTicket_start_stop_idx());
                if (userTickets.getTicket_end_stop_name() == null) {
                    s74.mo13599J0(21);
                } else {
                    s74.mo13605m2(21, userTickets.getTicket_end_stop_name());
                }
                s74.mo13596B2(22, (long) userTickets.getTicket_end_stop_idx());
                s74.mo13600P1(23, (double) userTickets.getAmount_payable_by_user());
                s74.mo13596B2(24, userTickets.isAc() ? 1 : 0);
            }

            public String createQuery() {
                return "INSERT OR ABORT INTO `UserTickets` (`id`,`message`,`bus_number`,`ticket_id`,`booking_id`,`fare`,`bus_route_long_name`,`bus_agency`,`booking_time`,`validity`,`description`,`total_fare`,`ticket_count`,`fare_per_ticket`,`validity_stop_index`,`transaction_type`,`transaction_status`,`category`,`ticket_start_stop_name`,`ticket_start_stop_index`,`ticket_end_stop_name`,`ticket_end_stop_index`,`amount_payable_by_user`,`is_ac`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfUserTickets = new wu0<UserTickets>(ym3) {
            public void bind(s74 s74, UserTickets userTickets) {
                s74.mo13596B2(1, (long) userTickets.getId());
                if (userTickets.getMessage() == null) {
                    s74.mo13599J0(2);
                } else {
                    s74.mo13605m2(2, userTickets.getMessage());
                }
                if (userTickets.getBus_number() == null) {
                    s74.mo13599J0(3);
                } else {
                    s74.mo13605m2(3, userTickets.getBus_number());
                }
                if (userTickets.getTicket_id() == null) {
                    s74.mo13599J0(4);
                } else {
                    s74.mo13605m2(4, userTickets.getTicket_id());
                }
                if (userTickets.getBooking_id() == null) {
                    s74.mo13599J0(5);
                } else {
                    s74.mo13605m2(5, userTickets.getBooking_id());
                }
                s74.mo13600P1(6, (double) userTickets.getFare());
                if (userTickets.getBus_route_long_name() == null) {
                    s74.mo13599J0(7);
                } else {
                    s74.mo13605m2(7, userTickets.getBus_route_long_name());
                }
                if (userTickets.getBus_agency() == null) {
                    s74.mo13599J0(8);
                } else {
                    s74.mo13605m2(8, userTickets.getBus_agency());
                }
                if (userTickets.getBooking_time() == null) {
                    s74.mo13599J0(9);
                } else {
                    s74.mo13605m2(9, userTickets.getBooking_time());
                }
                if (userTickets.getValidity() == null) {
                    s74.mo13599J0(10);
                } else {
                    s74.mo13605m2(10, userTickets.getValidity());
                }
                if (userTickets.getDescription() == null) {
                    s74.mo13599J0(11);
                } else {
                    s74.mo13605m2(11, userTickets.getDescription());
                }
                s74.mo13600P1(12, (double) userTickets.getTotal_fare());
                s74.mo13596B2(13, (long) userTickets.getTicket_count());
                s74.mo13600P1(14, (double) userTickets.getFare_per_ticket());
                s74.mo13596B2(15, (long) userTickets.getValidity_stop_idx());
                s74.mo13596B2(16, (long) userTickets.getTransaction_type());
                if (userTickets.getTransaction_status() == null) {
                    s74.mo13599J0(17);
                } else {
                    s74.mo13605m2(17, userTickets.getTransaction_status());
                }
                if (userTickets.getCategory() == null) {
                    s74.mo13599J0(18);
                } else {
                    s74.mo13605m2(18, userTickets.getCategory());
                }
                if (userTickets.getTicket_start_stop_name() == null) {
                    s74.mo13599J0(19);
                } else {
                    s74.mo13605m2(19, userTickets.getTicket_start_stop_name());
                }
                s74.mo13596B2(20, (long) userTickets.getTicket_start_stop_idx());
                if (userTickets.getTicket_end_stop_name() == null) {
                    s74.mo13599J0(21);
                } else {
                    s74.mo13605m2(21, userTickets.getTicket_end_stop_name());
                }
                s74.mo13596B2(22, (long) userTickets.getTicket_end_stop_idx());
                s74.mo13600P1(23, (double) userTickets.getAmount_payable_by_user());
                s74.mo13596B2(24, userTickets.isAc() ? 1 : 0);
                s74.mo13596B2(25, (long) userTickets.getId());
            }

            public String createQuery() {
                return "UPDATE OR ABORT `UserTickets` SET `id` = ?,`message` = ?,`bus_number` = ?,`ticket_id` = ?,`booking_id` = ?,`fare` = ?,`bus_route_long_name` = ?,`bus_agency` = ?,`booking_time` = ?,`validity` = ?,`description` = ?,`total_fare` = ?,`ticket_count` = ?,`fare_per_ticket` = ?,`validity_stop_index` = ?,`transaction_type` = ?,`transaction_status` = ?,`category` = ?,`ticket_start_stop_name` = ?,`ticket_start_stop_index` = ?,`ticket_end_stop_name` = ?,`ticket_end_stop_index` = ?,`amount_payable_by_user` = ?,`is_ac` = ? WHERE `id` = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public List<UserTickets> getAll() {
        bn3 bn3;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        boolean z;
        bn3 d = bn3.m11970d("SELECT * FROM UserTickets", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "message");
            int e3 = bc0.m11793e(f, "bus_number");
            int e4 = bc0.m11793e(f, "ticket_id");
            int e5 = bc0.m11793e(f, "booking_id");
            int e6 = bc0.m11793e(f, "fare");
            int e7 = bc0.m11793e(f, "bus_route_long_name");
            int e8 = bc0.m11793e(f, "bus_agency");
            int e9 = bc0.m11793e(f, "booking_time");
            int e10 = bc0.m11793e(f, "validity");
            int e11 = bc0.m11793e(f, "description");
            int e12 = bc0.m11793e(f, "total_fare");
            int e13 = bc0.m11793e(f, "ticket_count");
            int e14 = bc0.m11793e(f, "fare_per_ticket");
            bn3 = d;
            try {
                int e15 = bc0.m11793e(f, "validity_stop_index");
                int e16 = bc0.m11793e(f, "transaction_type");
                int e17 = bc0.m11793e(f, "transaction_status");
                int e18 = bc0.m11793e(f, "category");
                int e19 = bc0.m11793e(f, "ticket_start_stop_name");
                int e20 = bc0.m11793e(f, "ticket_start_stop_index");
                int e21 = bc0.m11793e(f, "ticket_end_stop_name");
                int e22 = bc0.m11793e(f, "ticket_end_stop_index");
                int e23 = bc0.m11793e(f, "amount_payable_by_user");
                int e24 = bc0.m11793e(f, "is_ac");
                int i3 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    UserTickets userTickets = new UserTickets();
                    ArrayList arrayList2 = arrayList;
                    userTickets.setId(f.getInt(e));
                    userTickets.setMessage(f.isNull(e2) ? null : f.getString(e2));
                    userTickets.setBus_number(f.isNull(e3) ? null : f.getString(e3));
                    userTickets.setTicket_id(f.isNull(e4) ? null : f.getString(e4));
                    userTickets.setBooking_id(f.isNull(e5) ? null : f.getString(e5));
                    userTickets.setFare(f.getFloat(e6));
                    userTickets.setBus_route_long_name(f.isNull(e7) ? null : f.getString(e7));
                    userTickets.setBus_agency(f.isNull(e8) ? null : f.getString(e8));
                    userTickets.setBooking_time(f.isNull(e9) ? null : f.getString(e9));
                    userTickets.setValidity(f.isNull(e10) ? null : f.getString(e10));
                    userTickets.setDescription(f.isNull(e11) ? null : f.getString(e11));
                    userTickets.setTotal_fare(f.getFloat(e12));
                    userTickets.setTicket_count(f.getInt(e13));
                    int i4 = i3;
                    int i5 = e;
                    userTickets.setFare_per_ticket(f.getFloat(i4));
                    int i6 = e15;
                    int i7 = e12;
                    userTickets.setValidity_stop_idx(f.getInt(i6));
                    int i8 = e16;
                    int i9 = i6;
                    userTickets.setTransaction_type(f.getInt(i8));
                    int i10 = e17;
                    if (f.isNull(i10)) {
                        i = i10;
                        str = null;
                    } else {
                        i = i10;
                        str = f.getString(i10);
                    }
                    userTickets.setTransaction_status(str);
                    int i11 = e18;
                    if (f.isNull(i11)) {
                        e18 = i11;
                        str2 = null;
                    } else {
                        e18 = i11;
                        str2 = f.getString(i11);
                    }
                    userTickets.setCategory(str2);
                    int i12 = e19;
                    if (f.isNull(i12)) {
                        e19 = i12;
                        str3 = null;
                    } else {
                        e19 = i12;
                        str3 = f.getString(i12);
                    }
                    userTickets.setTicket_start_stop_name(str3);
                    int i13 = i8;
                    int i14 = e20;
                    userTickets.setTicket_start_stop_idx(f.getInt(i14));
                    int i15 = e21;
                    if (f.isNull(i15)) {
                        i2 = i14;
                        str4 = null;
                    } else {
                        i2 = i14;
                        str4 = f.getString(i15);
                    }
                    userTickets.setTicket_end_stop_name(str4);
                    int i16 = i15;
                    int i17 = e22;
                    userTickets.setTicket_end_stop_idx(f.getInt(i17));
                    e22 = i17;
                    int i18 = e23;
                    userTickets.setAmount_payable_by_user(f.getFloat(i18));
                    int i19 = e24;
                    if (f.getInt(i19) != 0) {
                        e24 = i19;
                        z = true;
                    } else {
                        e24 = i19;
                        z = false;
                    }
                    userTickets.setAc(z);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(userTickets);
                    e23 = i18;
                    e12 = i7;
                    e15 = i9;
                    e16 = i13;
                    e17 = i;
                    int i20 = i4;
                    arrayList = arrayList3;
                    e = i5;
                    i3 = i20;
                    int i21 = i2;
                    e21 = i16;
                    e20 = i21;
                }
                ArrayList arrayList4 = arrayList;
                f.close();
                bn3.release();
                return arrayList4;
            } catch (Throwable th) {
                th = th;
                f.close();
                bn3.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bn3 = d;
            f.close();
            bn3.release();
            throw th;
        }
    }

    public List<UserTickets> getLast() {
        bn3 bn3;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        boolean z;
        bn3 d = bn3.m11970d("SELECT * FROM UserTickets ORDER BY id DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f = vc0.m29993f(this.__db, d, false, (CancellationSignal) null);
        try {
            int e = bc0.m11793e(f, "id");
            int e2 = bc0.m11793e(f, "message");
            int e3 = bc0.m11793e(f, "bus_number");
            int e4 = bc0.m11793e(f, "ticket_id");
            int e5 = bc0.m11793e(f, "booking_id");
            int e6 = bc0.m11793e(f, "fare");
            int e7 = bc0.m11793e(f, "bus_route_long_name");
            int e8 = bc0.m11793e(f, "bus_agency");
            int e9 = bc0.m11793e(f, "booking_time");
            int e10 = bc0.m11793e(f, "validity");
            int e11 = bc0.m11793e(f, "description");
            int e12 = bc0.m11793e(f, "total_fare");
            int e13 = bc0.m11793e(f, "ticket_count");
            int e14 = bc0.m11793e(f, "fare_per_ticket");
            bn3 = d;
            try {
                int e15 = bc0.m11793e(f, "validity_stop_index");
                int e16 = bc0.m11793e(f, "transaction_type");
                int e17 = bc0.m11793e(f, "transaction_status");
                int e18 = bc0.m11793e(f, "category");
                int e19 = bc0.m11793e(f, "ticket_start_stop_name");
                int e20 = bc0.m11793e(f, "ticket_start_stop_index");
                int e21 = bc0.m11793e(f, "ticket_end_stop_name");
                int e22 = bc0.m11793e(f, "ticket_end_stop_index");
                int e23 = bc0.m11793e(f, "amount_payable_by_user");
                int e24 = bc0.m11793e(f, "is_ac");
                int i3 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    UserTickets userTickets = new UserTickets();
                    ArrayList arrayList2 = arrayList;
                    userTickets.setId(f.getInt(e));
                    userTickets.setMessage(f.isNull(e2) ? null : f.getString(e2));
                    userTickets.setBus_number(f.isNull(e3) ? null : f.getString(e3));
                    userTickets.setTicket_id(f.isNull(e4) ? null : f.getString(e4));
                    userTickets.setBooking_id(f.isNull(e5) ? null : f.getString(e5));
                    userTickets.setFare(f.getFloat(e6));
                    userTickets.setBus_route_long_name(f.isNull(e7) ? null : f.getString(e7));
                    userTickets.setBus_agency(f.isNull(e8) ? null : f.getString(e8));
                    userTickets.setBooking_time(f.isNull(e9) ? null : f.getString(e9));
                    userTickets.setValidity(f.isNull(e10) ? null : f.getString(e10));
                    userTickets.setDescription(f.isNull(e11) ? null : f.getString(e11));
                    userTickets.setTotal_fare(f.getFloat(e12));
                    userTickets.setTicket_count(f.getInt(e13));
                    int i4 = i3;
                    int i5 = e;
                    userTickets.setFare_per_ticket(f.getFloat(i4));
                    int i6 = e15;
                    int i7 = e12;
                    userTickets.setValidity_stop_idx(f.getInt(i6));
                    int i8 = e16;
                    int i9 = i6;
                    userTickets.setTransaction_type(f.getInt(i8));
                    int i10 = e17;
                    if (f.isNull(i10)) {
                        i = i10;
                        str = null;
                    } else {
                        i = i10;
                        str = f.getString(i10);
                    }
                    userTickets.setTransaction_status(str);
                    int i11 = e18;
                    if (f.isNull(i11)) {
                        e18 = i11;
                        str2 = null;
                    } else {
                        e18 = i11;
                        str2 = f.getString(i11);
                    }
                    userTickets.setCategory(str2);
                    int i12 = e19;
                    if (f.isNull(i12)) {
                        e19 = i12;
                        str3 = null;
                    } else {
                        e19 = i12;
                        str3 = f.getString(i12);
                    }
                    userTickets.setTicket_start_stop_name(str3);
                    int i13 = i8;
                    int i14 = e20;
                    userTickets.setTicket_start_stop_idx(f.getInt(i14));
                    int i15 = e21;
                    if (f.isNull(i15)) {
                        i2 = i14;
                        str4 = null;
                    } else {
                        i2 = i14;
                        str4 = f.getString(i15);
                    }
                    userTickets.setTicket_end_stop_name(str4);
                    int i16 = i15;
                    int i17 = e22;
                    userTickets.setTicket_end_stop_idx(f.getInt(i17));
                    e22 = i17;
                    int i18 = e23;
                    userTickets.setAmount_payable_by_user(f.getFloat(i18));
                    int i19 = e24;
                    if (f.getInt(i19) != 0) {
                        e24 = i19;
                        z = true;
                    } else {
                        e24 = i19;
                        z = false;
                    }
                    userTickets.setAc(z);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(userTickets);
                    e23 = i18;
                    e12 = i7;
                    e15 = i9;
                    e16 = i13;
                    e17 = i;
                    int i20 = i4;
                    arrayList = arrayList3;
                    e = i5;
                    i3 = i20;
                    int i21 = i2;
                    e21 = i16;
                    e20 = i21;
                }
                ArrayList arrayList4 = arrayList;
                f.close();
                bn3.release();
                return arrayList4;
            } catch (Throwable th) {
                th = th;
                f.close();
                bn3.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bn3 = d;
            f.close();
            bn3.release();
            throw th;
        }
    }

    public void insert(UserTickets userTickets) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserTickets.insert(userTickets);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(UserTickets userTickets) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfUserTickets.handle(userTickets);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
