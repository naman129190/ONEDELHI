package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.networking.C1372i;
import com.delhitransport.onedelhi.ticket.SendLog;
import com.delhitransport.onedelhi.ticket.SendLogResponse;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.onedelhi.secure.au4;

public class GenerateTicketViewModel extends au4 {
    public LiveData<Ticket> confirmation(TicketRequest ticketRequest) {
        return C1372i.m8632b().mo8683a(ticketRequest);
    }

    public LiveData<SendLogResponse> send_log(SendLog sendLog) {
        return C1372i.m8632b().mo8684c(sendLog);
    }
}
