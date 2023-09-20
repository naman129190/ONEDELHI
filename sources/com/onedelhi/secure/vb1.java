package com.onedelhi.secure;

import com.delhitransport.onedelhi.models.freshdesk.FreshDeskRequest;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import java.util.List;
import okhttp3.RequestBody;

public interface vb1 {
    @md1("tickets")
    /* renamed from: a */
    C6595qs<List<FreshDeskTicketResponse>> mo25995a(@e93("email") String str);

    @sx2("tickets")
    /* renamed from: b */
    C6595qs<FreshDeskTicketResponse> mo25996b(@C5439gn FreshDeskRequest freshDeskRequest);

    @sx2("tickets")
    /* renamed from: c */
    C6595qs<FreshDeskTicketResponse> mo25997c(@C5439gn RequestBody requestBody);

    @tx2("tickets/{id}")
    /* renamed from: d */
    C6595qs<FreshDeskTicketResponse> mo25998d(@oz2("id") long j, @C5439gn FreshDeskRequest freshDeskRequest);

    @sx2("tickets")
    /* renamed from: e */
    C6595qs<FreshDeskTicketResponse> mo25999e(@C5439gn RequestBody requestBody);
}
