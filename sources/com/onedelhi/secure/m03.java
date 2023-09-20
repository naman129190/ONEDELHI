package com.onedelhi.secure;

import com.delhitransport.onedelhi.activities.PaymentActivity;
import com.delhitransport.onedelhi.payment.UPIOptions;
import com.delhitransport.onedelhi.ticket.TxnToken;

public final /* synthetic */ class m03 implements bu2 {

    /* renamed from: a */
    public final /* synthetic */ PaymentActivity f31966a;

    /* renamed from: a */
    public final /* synthetic */ UPIOptions f31967a;

    public /* synthetic */ m03(PaymentActivity paymentActivity, UPIOptions uPIOptions) {
        this.f31966a = paymentActivity;
        this.f31967a = uPIOptions;
    }

    /* renamed from: b */
    public final void mo3946b(Object obj) {
        this.f31966a.m8171C1(this.f31967a, (TxnToken) obj);
    }
}
