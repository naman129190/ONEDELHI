package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import com.onedelhi.secure.to4;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.BookingDao */
public interface BookingDao {
    @f93("SELECT * FROM UserBookings")
    List<UserBookings> getAll();

    @f93("SELECT * FROM UserBookings ORDER BY id DESC LIMIT 1")
    List<UserBookings> getLast();

    @er1
    void insert(UserBookings userBookings);

    @to4
    void update(UserBookings userBookings);
}
