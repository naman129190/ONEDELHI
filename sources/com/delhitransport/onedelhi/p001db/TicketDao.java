package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.bd0;
import com.onedelhi.secure.er1;
import com.onedelhi.secure.f93;
import com.onedelhi.secure.to4;
import java.util.List;

@bd0
/* renamed from: com.delhitransport.onedelhi.db.TicketDao */
public interface TicketDao {
    @f93("SELECT * FROM UserTickets")
    List<UserTickets> getAll();

    @f93("SELECT * FROM UserTickets ORDER BY id DESC LIMIT 1")
    List<UserTickets> getLast();

    @er1
    void insert(UserTickets userTickets);

    @to4
    void update(UserTickets userTickets);
}
