package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskRequest;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import com.delhitransport.onedelhi.networking.C1367h;
import com.onedelhi.secure.au4;
import java.util.List;

public class FreshDeskViewModel extends au4 {
    private C1367h freshDeskRepository;

    public LiveData<FreshDeskTicketResponse> createNewTicket(FreshDeskRequest freshDeskRequest) {
        C1367h d = C1367h.m8616d();
        this.freshDeskRepository = d;
        return d.mo8676a(freshDeskRequest);
    }

    public LiveData<FreshDeskTicketResponse> createNewTicketWithAttachment(FreshDeskRequest freshDeskRequest, String str) {
        C1367h d = C1367h.m8616d();
        this.freshDeskRepository = d;
        return d.mo8677b(freshDeskRequest, str);
    }

    public LiveData<List<FreshDeskTicketResponse>> getFreshdeskTickets(String str) {
        C1367h d = C1367h.m8616d();
        this.freshDeskRepository = d;
        return d.mo8678c(str);
    }

    public LiveData<FreshDeskTicketResponse> updateFreshdeskTicket(long j, FreshDeskRequest freshDeskRequest) {
        C1367h d = C1367h.m8616d();
        this.freshDeskRepository = d;
        return d.mo8682h(j, freshDeskRequest);
    }
}
