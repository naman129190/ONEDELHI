package com.onedelhi.secure;

import com.delhitransport.onedelhi.models.auth.CreateResponse;
import com.delhitransport.onedelhi.models.auth.VerifyRequest;
import com.delhitransport.onedelhi.models.auth.VerifyResponse;

/* renamed from: com.onedelhi.secure.rc */
public interface C3400rc {
    @sx2("v2/verify/{number}")
    /* renamed from: a */
    C6595qs<VerifyResponse> mo23791a(@oz2("number") long j, @C5439gn VerifyRequest verifyRequest);

    @md1("v2/create/{number}")
    /* renamed from: b */
    C6595qs<CreateResponse> mo23792b(@oz2("number") long j);
}
