package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.models.payment.CustomPaymentItem;
import com.delhitransport.onedelhi.networking.C1381l;
import com.delhitransport.onedelhi.pass.AllPasses;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.delhitransport.onedelhi.pass.LastPass;
import com.delhitransport.onedelhi.pass.LastPassRequest;
import com.delhitransport.onedelhi.pass.Pass;
import com.delhitransport.onedelhi.pass.PassRequest;
import com.delhitransport.onedelhi.pass.PassTxnToken;
import com.delhitransport.onedelhi.pass.PassTxnTokenRequest;
import com.delhitransport.onedelhi.pass.ValidatePass;
import com.delhitransport.onedelhi.pass.ValidatePassRequest;
import com.delhitransport.onedelhi.ticket.AllTickets;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.FareDiscoveryRequest;
import com.delhitransport.onedelhi.ticket.FareOptions;
import com.delhitransport.onedelhi.ticket.FareOptionsRequest;
import com.delhitransport.onedelhi.ticket.InitUser;
import com.delhitransport.onedelhi.ticket.InitUserRequest;
import com.delhitransport.onedelhi.ticket.Issue;
import com.delhitransport.onedelhi.ticket.IssueRequest;
import com.delhitransport.onedelhi.ticket.LastTicket;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.delhitransport.onedelhi.ticket.TxnToken;
import com.delhitransport.onedelhi.ticket.TxnTokenRequest;
import com.delhitransport.onedelhi.ticket.Validate;
import com.delhitransport.onedelhi.ticket.ValidateRequest;
import com.onedelhi.secure.au4;

public class TicketModel extends au4 {
    private C1381l ticketRepository;

    public LiveData<Ticket> confirmation(TicketRequest ticketRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8686a(ticketRequest);
    }

    public LiveData<DailyPass> confirmationdailypass(PassRequest passRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8687b(passRequest);
    }

    public LiveData<FareDiscovery> farediscovery(FareDiscoveryRequest fareDiscoveryRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8688c(fareDiscoveryRequest);
    }

    public LiveData<Pass> fetchdailypassformfields(String str, String str2) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8689d(str, str2);
    }

    public LiveData<TxnToken> fetchpaymenttoken(TxnTokenRequest txnTokenRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8690e(txnTokenRequest);
    }

    public LiveData<PassTxnToken> fetchpaymenttokendailypass(PassTxnTokenRequest passTxnTokenRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8691f(passTxnTokenRequest);
    }

    public LiveData<FareOptions> getfareoptions(FareOptionsRequest fareOptionsRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8694j(fareOptionsRequest);
    }

    public LiveData<CustomPaymentItem> getpaymentoptions(String str, String str2) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8695k(str, str2);
    }

    public LiveData<AllPasses> getuserpasses(String str) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8692g(str);
    }

    public LiveData<AllTickets> getusertickets(String str) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8693i(str);
    }

    public LiveData<InitUser> inituser(InitUserRequest initUserRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8696l(initUserRequest);
    }

    public LiveData<Issue> reportissue(IssueRequest issueRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8697m(issueRequest);
    }

    public LiveData<LastPass> userlastpass(LastPassRequest lastPassRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8698n(lastPassRequest);
    }

    public LiveData<LastTicket> userlastticket(String str) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8699o(str);
    }

    public LiveData<Validate> validate(ValidateRequest validateRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8700p(validateRequest);
    }

    public LiveData<ValidatePass> validatedailypass(ValidatePassRequest validatePassRequest) {
        C1381l h = C1381l.m8653h();
        this.ticketRepository = h;
        return h.mo8701q(validatePassRequest);
    }
}
