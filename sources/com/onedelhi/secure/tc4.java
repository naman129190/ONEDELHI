package com.onedelhi.secure;

import com.delhitransport.onedelhi.models.payment.CustomPaymentItem;
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

public interface tc4 {
    @bm3
    @sx2("api/v2/confirmation")
    /* renamed from: a */
    C6595qs<Ticket> mo24847a(@C5439gn TicketRequest ticketRequest);

    @bm3
    @md1("api/v2/user-last-ticket/{deviceId}")
    /* renamed from: b */
    C6595qs<LastTicket> mo24848b(@oz2("deviceId") String str);

    @bm3
    @md1("dailypass/v1/fetch-daily-pass-form-fields")
    /* renamed from: c */
    C6595qs<Pass> mo24849c(@e93("language") String str, @e93("bus_number") String str2);

    @bm3
    @sx2("api/v2/fetchpaymenttoken")
    /* renamed from: d */
    C6595qs<TxnToken> mo24850d(@C5439gn TxnTokenRequest txnTokenRequest);

    @bm3
    @sx2("api/v2/issue")
    /* renamed from: e */
    C6595qs<Issue> mo24851e(@C5439gn IssueRequest issueRequest);

    @bm3
    @sx2("dailypass/v1/confirmation-for-dailypass")
    /* renamed from: f */
    C6595qs<DailyPass> mo24852f(@C5439gn PassRequest passRequest);

    @bm3
    @sx2("dailypass/v1/user-last-dailypass")
    /* renamed from: g */
    C6595qs<LastPass> mo24853g(@C5439gn LastPassRequest lastPassRequest);

    @bm3
    @sx2("api/v2/fare-discovery")
    /* renamed from: h */
    C6595qs<FareDiscovery> mo24854h(@C5439gn FareDiscoveryRequest fareDiscoveryRequest);

    @bm3
    @md1("api/v2/payment-options/{user_id}")
    /* renamed from: i */
    C6595qs<CustomPaymentItem> mo24855i(@oz2("user_id") String str, @e93("src") String str2);

    @bm3
    @sx2("dailypass/v1/fetch-payment-token-for-dailypass")
    /* renamed from: j */
    C6595qs<PassTxnToken> mo24856j(@C5439gn PassTxnTokenRequest passTxnTokenRequest);

    @bm3
    @sx2("dailypass/v1/validate-dailypass-input")
    /* renamed from: k */
    C6595qs<ValidatePass> mo24857k(@C5439gn ValidatePassRequest validatePassRequest);

    @bm3
    @sx2("api/v2/get-fare-options")
    /* renamed from: l */
    C6595qs<FareOptions> mo24858l(@C5439gn FareOptionsRequest fareOptionsRequest);

    @bm3
    @md1("api/v2/getusertickets/{deviceId}")
    /* renamed from: m */
    C6595qs<AllTickets> mo24859m(@oz2("deviceId") String str);

    @bm3
    @md1("dailypass/v1/user-dailypasses/{deviceId}")
    /* renamed from: n */
    C6595qs<AllPasses> mo24860n(@oz2("deviceId") String str);

    @bm3
    @sx2("api/v2/inituser")
    /* renamed from: o */
    C6595qs<InitUser> mo24861o(@C5439gn InitUserRequest initUserRequest);

    @bm3
    @sx2("api/v2/validate")
    /* renamed from: p */
    C6595qs<Validate> mo24862p(@C5439gn ValidateRequest validateRequest);
}
