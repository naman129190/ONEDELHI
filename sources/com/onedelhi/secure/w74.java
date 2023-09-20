package com.onedelhi.secure;

import android.view.View;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import com.onedelhi.secure.y74;

public final /* synthetic */ class w74 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FreshDeskTicketResponse f36919a;

    /* renamed from: a */
    public final /* synthetic */ y74.C3980c f36920a;

    /* renamed from: a */
    public final /* synthetic */ y74 f36921a;

    public /* synthetic */ w74(y74 y74, FreshDeskTicketResponse freshDeskTicketResponse, y74.C3980c cVar) {
        this.f36921a = y74;
        this.f36919a = freshDeskTicketResponse;
        this.f36920a = cVar;
    }

    public final void onClick(View view) {
        this.f36921a.m31988O(this.f36919a, this.f36920a, view);
    }
}
