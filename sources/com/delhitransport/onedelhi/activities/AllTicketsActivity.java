package com.delhitransport.onedelhi.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C3896x4;
import com.onedelhi.secure.C7131w4;
import com.onedelhi.secure.jd4;
import com.onedelhi.secure.mv2;
import com.onedelhi.secure.pj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllTicketsActivity extends BaseActivity implements mv2 {

    /* renamed from: a */
    public AlertDialog f6114a;

    /* renamed from: a */
    public RelativeLayout f6115a;

    /* renamed from: a */
    public TextView f6116a;

    /* renamed from: a */
    public RecyclerView f6117a;

    /* renamed from: a */
    public C3896x4 f6118a;

    /* renamed from: a */
    public List<Ticket> f6119a = new ArrayList();

    /* renamed from: b */
    public List<UserTickets> f6120b;

    /* renamed from: com.delhitransport.onedelhi.activities.AllTicketsActivity$a */
    public class C1203a implements View.OnClickListener {
        public C1203a() {
        }

        public void onClick(View view) {
            AllTicketsActivity.this.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m7649h1(com.delhitransport.onedelhi.ticket.AllTickets r10) {
        /*
            r9 = this;
            r0 = 2131362876(0x7f0a043c, float:1.8345545E38)
            r1 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            r2 = 2131362782(0x7f0a03de, float:1.8345354E38)
            r3 = 2131952143(0x7f13020f, float:1.954072E38)
            r4 = 8
            r5 = 0
            if (r10 == 0) goto L_0x009f
            java.lang.String r6 = r10.getMessage()
            r7 = -475753715527(0xffffff913ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0082
            java.util.List<com.delhitransport.onedelhi.ticket.Ticket> r6 = r9.f6119a
            r6.clear()
            java.util.List<com.delhitransport.onedelhi.ticket.Ticket> r6 = r9.f6119a
            java.util.List r7 = r10.getTickets()
            r6.addAll(r7)
            com.onedelhi.secure.x4 r6 = r9.f6118a
            r6.mo5717m()
            android.widget.TextView r6 = r9.f6116a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.res.Resources r8 = r9.getResources()
            java.lang.String r8 = r8.getString(r3)
            r7.append(r8)
            java.util.List r8 = r10.getTickets()
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.setText(r7)
            java.util.List r10 = r10.getTickets()
            int r10 = r10.size()
            if (r10 != 0) goto L_0x00e4
            android.widget.RelativeLayout r10 = r9.f6115a
            r10.setVisibility(r5)
            android.widget.TextView r10 = r9.f6116a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r7 = r9.getResources()
            java.lang.String r3 = r7.getString(r3)
            r6.append(r3)
            r7 = -510113453895(0xffffff893ade68b9, double:NaN)
            goto L_0x00bb
        L_0x0082:
            android.widget.RelativeLayout r10 = r9.f6115a
            r10.setVisibility(r5)
            android.widget.TextView r10 = r9.f6116a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r7 = r9.getResources()
            java.lang.String r3 = r7.getString(r3)
            r6.append(r3)
            r7 = -522998355783(0xffffff863ade68b9, double:NaN)
            goto L_0x00bb
        L_0x009f:
            android.widget.RelativeLayout r10 = r9.f6115a
            r10.setVisibility(r5)
            android.widget.TextView r10 = r9.f6116a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r7 = r9.getResources()
            java.lang.String r3 = r7.getString(r3)
            r6.append(r3)
            r7 = -535883257671(0xffffff833ade68b9, double:NaN)
        L_0x00bb:
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r10.setText(r3)
            android.widget.RelativeLayout r10 = r9.f6115a
            android.view.View r10 = r10.findViewById(r2)
            r10.setVisibility(r5)
            android.widget.RelativeLayout r10 = r9.f6115a
            android.view.View r10 = r10.findViewById(r1)
            r10.setVisibility(r4)
            android.widget.RelativeLayout r10 = r9.f6115a
            android.view.View r10 = r10.findViewById(r0)
            r10.setVisibility(r4)
        L_0x00e4:
            android.app.AlertDialog r10 = r9.f6114a
            if (r10 == 0) goto L_0x00eb
            r10.dismiss()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.AllTicketsActivity.m7649h1(com.delhitransport.onedelhi.ticket.AllTickets):void");
    }

    /* renamed from: B */
    public void mo7527B(boolean z) {
    }

    /* renamed from: F */
    public void mo7528F(boolean z, List<UserTickets> list) {
    }

    /* renamed from: M */
    public void mo7529M(boolean z, List<UserTickets> list) {
        int i;
        if (list == null) {
            Toast.makeText(this, pj0.m61166a(-222350645063L), 0).show();
            return;
        }
        for (UserTickets next : list) {
            Ticket ticket = r4;
            Ticket ticket2 = new Ticket(next.getMessage(), next.getBus_number(), next.getTicket_id(), next.getBooking_id(), next.getFare(), next.getBus_route_long_name(), next.getBus_agency(), next.getBooking_time(), next.getValidity(), next.getDescription(), next.getTotal_fare(), next.getTicket_count(), next.getTicket_count(), next.getFare_per_ticket(), next.getValidity_stop_idx(), next.getTransaction_type(), next.getTransaction_status(), next.getCategory(), next.getTicket_start_stop_name(), next.getTicket_start_stop_idx(), next.getTicket_end_stop_name(), next.getTicket_end_stop_idx(), next.getAmount_payable_by_user(), next.isAc());
            this.f6119a.add(ticket);
        }
        this.f6118a = new C3896x4(this.f6119a, this, false);
        this.f6117a.setLayoutManager(new LinearLayoutManager(this));
        this.f6117a.setAdapter(this.f6118a);
        Collections.reverse(this.f6119a);
        this.f6118a.mo5717m();
        TextView textView = this.f6116a;
        textView.setText(getResources().getString(C1410R.string.tickets_so_far) + this.f6119a.size());
        this.f6115a.setVisibility(0);
        this.f6115a.findViewById(C1410R.C1412id.tv_noTicket).setVisibility(0);
        this.f6115a.findViewById(C1410R.C1412id.rv_ticket).setVisibility(8);
        this.f6115a.findViewById(C1410R.C1412id.view_color).setVisibility(8);
        List<Ticket> list2 = this.f6119a;
        if (list2 == null || list2.size() == 0) {
            this.f6115a.setVisibility(0);
            TextView textView2 = this.f6116a;
            textView2.setText(getResources().getString(C1410R.string.tickets_so_far) + pj0.m61166a(-359789598535L));
            i = 0;
            this.f6115a.findViewById(C1410R.C1412id.tv_noTicket).setVisibility(0);
            this.f6115a.findViewById(C1410R.C1412id.rv_ticket).setVisibility(8);
            this.f6115a.findViewById(C1410R.C1412id.view_color).setVisibility(8);
        } else {
            i = 0;
        }
        Toast.makeText(this, pj0.m61166a(-372674500423L), i).show();
        AlertDialog alertDialog = this.f6114a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: g1 */
    public final boolean mo7530g1() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(pj0.m61166a(-166516070215L))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_all_tickets);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(pj0.m61166a(-110681495367L), pj0.m61166a(-153631168327L)) : pj0.m61166a(-157926135623L);
        this.f6117a = (RecyclerView) findViewById(C1410R.C1412id.tickets_list);
        ImageButton imageButton = (ImageButton) findViewById(C1410R.C1412id.ib_back);
        this.f6116a = (TextView) findViewById(C1410R.C1412id.tv_ticketCount);
        this.f6115a = (RelativeLayout) findViewById(C1410R.C1412id.card_no_ticket);
        ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-162221102919L), getResources().getString(C1410R.string.getting_previous_ticket), true);
        this.f6114a = show;
        show.setCancelable(false);
        this.f6114a.show();
        if (!mo7530g1()) {
            jd4.m18419j(this, this);
        } else {
            this.f6118a = new C3896x4(this.f6119a, this, true);
            this.f6117a.setLayoutManager(new LinearLayoutManager(this));
            this.f6117a.setAdapter(this.f6118a);
            ((TicketModel) new C0709m(this).mo5027a(TicketModel.class)).getusertickets(string).mo4926j(this, new C7131w4(this));
        }
        imageButton.setOnClickListener(new C1203a());
    }
}
