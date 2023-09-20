package com.onedelhi.secure;

import com.delhitransport.onedelhi.ticket.SendLog;
import com.delhitransport.onedelhi.ticket.SendLogResponse;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;

public interface ee1 {
    @sx2("confirmation")
    /* renamed from: a */
    C6595qs<Ticket> mo15140a(@C5439gn TicketRequest ticketRequest);

    @sx2("send_log")
    /* renamed from: b */
    C6595qs<SendLogResponse> mo15141b(@C5439gn SendLog sendLog);
}
