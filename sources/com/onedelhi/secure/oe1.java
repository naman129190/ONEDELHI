package com.onedelhi.secure;

import android.view.View;
import android.widget.Button;
import com.delhitransport.onedelhi.activities.GenerateTicketActivity2;
import com.delhitransport.onedelhi.p001db.UserBookings;

public final /* synthetic */ class oe1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Button f33002a;

    /* renamed from: a */
    public final /* synthetic */ GenerateTicketActivity2 f33003a;

    /* renamed from: a */
    public final /* synthetic */ UserBookings f33004a;

    public /* synthetic */ oe1(GenerateTicketActivity2 generateTicketActivity2, UserBookings userBookings, Button button) {
        this.f33003a = generateTicketActivity2;
        this.f33004a = userBookings;
        this.f33002a = button;
    }

    public final void onClick(View view) {
        this.f33003a.m7941P1(this.f33004a, this.f33002a, view);
    }
}
