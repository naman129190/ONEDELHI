package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.GenerateTicketActivity2;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.google.android.gms.common.C1410R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.x4 */
public class C3896x4 extends RecyclerView.C0805h<C3898b> {

    /* renamed from: a */
    public Context f22410a;

    /* renamed from: a */
    public SimpleDateFormat f22411a;

    /* renamed from: a */
    public List<Ticket> f22412a;

    /* renamed from: b */
    public SimpleDateFormat f22413b;

    /* renamed from: b */
    public boolean f22414b;

    /* renamed from: c */
    public SimpleDateFormat f22415c;

    /* renamed from: com.onedelhi.secure.x4$a */
    public class C3897a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C3898b f22416a;

        public C3897a(C3898b bVar) {
            this.f22416a = bVar;
        }

        public void onClick(View view) {
            Intent intent = new Intent(C3896x4.this.f22410a, GenerateTicketActivity2.class);
            intent.putExtra(pj0.m61166a(-81895448745799L), (Serializable) C3896x4.this.f22412a.get(this.f22416a.mo5681k()));
            intent.putExtra(pj0.m61166a(-81942693386055L), pj0.m61166a(-81981348091719L));
            intent.putExtra(pj0.m61166a(-82007117895495L), true);
            intent.putExtra(pj0.m61166a(-82028592731975L), true);
            C3896x4.this.f22410a.startActivity(intent);
        }
    }

    /* renamed from: com.onedelhi.secure.x4$b */
    public static class C3898b extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f22418a;

        /* renamed from: a */
        public TextView f22419a;

        /* renamed from: a */
        public CardView f22420a;

        /* renamed from: b */
        public View f22421b;

        /* renamed from: b */
        public TextView f22422b;

        /* renamed from: c */
        public TextView f22423c;

        /* renamed from: d */
        public TextView f22424d;

        /* renamed from: e */
        public TextView f22425e;

        /* renamed from: f */
        public TextView f22426f;

        /* renamed from: g */
        public TextView f22427g;

        /* renamed from: h */
        public TextView f22428h;

        public C3898b(View view) {
            super(view);
            this.f22421b = view.findViewById(C1410R.C1412id.view_color);
            this.f22419a = (TextView) view.findViewById(C1410R.C1412id.tv_busRoute);
            this.f22422b = (TextView) view.findViewById(C1410R.C1412id.tv_startingStop);
            this.f22423c = (TextView) view.findViewById(C1410R.C1412id.tv_endingStop);
            this.f22424d = (TextView) view.findViewById(C1410R.C1412id.tv_bookingTime);
            this.f22425e = (TextView) view.findViewById(C1410R.C1412id.tv_farePerTicket);
            this.f22427g = (TextView) view.findViewById(C1410R.C1412id.tv_totalFare);
            this.f22426f = (TextView) view.findViewById(C1410R.C1412id.tv_ticketCount);
            this.f22428h = (TextView) view.findViewById(C1410R.C1412id.tv_ticketID);
            this.f22420a = (CardView) view.findViewById(C1410R.C1412id.card_past_ticket);
            this.f22418a = (ImageView) view.findViewById(C1410R.C1412id.iv_ticket_expire);
        }
    }

    public C3896x4(List<Ticket> list, Context context, boolean z) {
        String a = pj0.m61166a(-82114492077895L);
        Locale locale = Locale.ENGLISH;
        this.f22411a = new SimpleDateFormat(a, locale);
        this.f22413b = new SimpleDateFormat(pj0.m61166a(-82200391423815L), locale);
        this.f22415c = new SimpleDateFormat(pj0.m61166a(-82307765606215L), locale);
        this.f22412a = list;
        this.f22410a = context;
        this.f22414b = z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r8 = r6.f22413b.parse(r8);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0247 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01c8 A[Catch:{ ParseException -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d4 A[Catch:{ ParseException -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0231 A[Catch:{ ParseException -> 0x026c }] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5728x(@com.onedelhi.secure.mr2 com.onedelhi.secure.C3896x4.C3898b r7, int r8) {
        /*
            r6 = this;
            java.util.List<com.delhitransport.onedelhi.ticket.Ticket> r0 = r6.f22412a
            java.lang.Object r8 = r0.get(r8)
            com.delhitransport.onedelhi.ticket.Ticket r8 = (com.delhitransport.onedelhi.ticket.Ticket) r8
            java.lang.String r0 = r8.getCategory()
            r1 = -82393664952135(0xffffb5103ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 2131952085(0x7f1301d5, float:1.9540603E38)
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x004c
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100311(0x7f060297, float:1.7813E38)
            int r4 = r4.getColor(r5)
            r0.setBackgroundColor(r4)
            android.widget.TextView r0 = r7.f22427g
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f22422b
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f22423c
            r0.setVisibility(r2)
            goto L_0x011f
        L_0x004c:
            android.widget.TextView r0 = r7.f22422b
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.f22423c
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.f22427g
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.f22427g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r6.f22410a
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getString(r1)
            r4.append(r5)
            float r5 = r8.getAmount_payable_by_user()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            android.widget.TextView r0 = r7.f22422b
            java.lang.String r4 = r8.getTicket_start_stop_name()
            r0.setText(r4)
            android.widget.TextView r0 = r7.f22423c
            java.lang.String r4 = r8.getTicket_end_stop_name()
            r0.setText(r4)
            java.lang.String r0 = r8.getBus_agency()
            r4 = -82402254886727(0xffffb50e3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r8.isAc()
            if (r0 == 0) goto L_0x00c2
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099689(0x7f060029, float:1.7811738E38)
            goto L_0x00f1
        L_0x00c2:
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100299(0x7f06028b, float:1.7812976E38)
            goto L_0x00f1
        L_0x00d0:
            boolean r0 = r8.isAc()
            if (r0 == 0) goto L_0x00e4
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100327(0x7f0602a7, float:1.7813032E38)
            goto L_0x00f1
        L_0x00e4:
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099787(0x7f06008b, float:1.7811937E38)
        L_0x00f1:
            int r4 = r4.getColor(r5)
            r0.setBackgroundColor(r4)
            java.lang.String r0 = r8.getBus_number()
            r4 = -82428024690503(0xffffb5083ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x011f
            android.view.View r0 = r7.f22421b
            android.content.Context r4 = r6.f22410a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099794(0x7f060092, float:1.7811951E38)
            int r4 = r4.getColor(r5)
            r0.setBackgroundColor(r4)
        L_0x011f:
            android.widget.TextView r0 = r7.f22425e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r6.f22410a
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r1 = r5.getString(r1)
            r4.append(r1)
            float r1 = r8.getFare_per_ticket()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.setText(r1)
            java.lang.String r0 = r8.getBus_route_long_name()
            r4 = -82458089461575(0xffffb5013ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x01b1 }
            if (r1 == 0) goto L_0x016d
            r4 = -82470974363463(0xffffb4fe3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            r4 = -82483859265351(0xffffb4fb3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
        L_0x0168:
            java.lang.String r0 = r0.replace(r1, r4)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x01ba
        L_0x016d:
            r4 = -82488154232647(0xffffb4fa3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x01b1 }
            if (r1 == 0) goto L_0x018f
            r4 = -82509629069127(0xffffb4f53ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            r4 = -82531103905607(0xffffb4f03ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0168
        L_0x018f:
            r4 = -82535398872903(0xffffb4ef3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x01b1 }
            if (r1 == 0) goto L_0x01ba
            r4 = -82548283774791(0xffffb4ec3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            r4 = -82561168676679(0xffffb4e93ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0168
        L_0x01b1:
            r0 = -82565463643975(0xffffb4e83ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
        L_0x01ba:
            android.widget.TextView r1 = r7.f22419a
            r1.setText(r0)
            r0 = 0
            java.lang.String r1 = r8.getBooking_time()     // Catch:{ ParseException -> 0x01e2 }
            if (r1 == 0) goto L_0x01d2
            java.text.SimpleDateFormat r0 = r6.f22411a     // Catch:{ ParseException -> 0x01e2 }
            java.lang.String r1 = r8.getBooking_time()     // Catch:{ ParseException -> 0x01e2 }
            java.util.Date r0 = r0.parse(r1)     // Catch:{ ParseException -> 0x01e2 }
        L_0x01d2:
            if (r0 == 0) goto L_0x01f1
            android.widget.TextView r1 = r7.f22424d     // Catch:{ ParseException -> 0x01e2 }
            java.text.SimpleDateFormat r4 = r6.f22415c     // Catch:{ ParseException -> 0x01e2 }
            java.lang.String r0 = r4.format(r0)     // Catch:{ ParseException -> 0x01e2 }
            r1.setText(r0)     // Catch:{ ParseException -> 0x01e2 }
            goto L_0x01f1
        L_0x01e2:
            r0 = move-exception
            android.widget.TextView r1 = r7.f22424d
            java.lang.String r4 = r8.getBooking_time()
            r1.setText(r4)
            r0.printStackTrace()
        L_0x01f1:
            android.widget.TextView r0 = r7.f22428h
            java.lang.String r1 = r8.getTicket_id()
            r0.setText(r1)
            android.widget.TextView r0 = r7.f22426f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = -82569758611271(0xffffb4e73ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            r1.append(r4)
            int r8 = r8.getTicket_count()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.setText(r8)
            java.util.List<com.delhitransport.onedelhi.ticket.Ticket> r8 = r6.f22412a     // Catch:{ ParseException -> 0x026c }
            int r0 = r7.mo5681k()     // Catch:{ ParseException -> 0x026c }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ ParseException -> 0x026c }
            com.delhitransport.onedelhi.ticket.Ticket r8 = (com.delhitransport.onedelhi.ticket.Ticket) r8     // Catch:{ ParseException -> 0x026c }
            java.lang.String r8 = r8.getValidity()     // Catch:{ ParseException -> 0x026c }
            if (r8 == 0) goto L_0x0270
            java.util.Date r0 = new java.util.Date     // Catch:{ ParseException -> 0x026c }
            r0.<init>()     // Catch:{ ParseException -> 0x026c }
            java.text.SimpleDateFormat r1 = r6.f22411a     // Catch:{ ParseException -> 0x026c }
            java.lang.String r0 = r1.format(r0)     // Catch:{ ParseException -> 0x026c }
            java.util.Date r0 = r1.parse(r0)     // Catch:{ ParseException -> 0x026c }
            java.text.SimpleDateFormat r1 = r6.f22411a     // Catch:{ Exception -> 0x0247 }
            java.util.Date r8 = r1.parse(r8)     // Catch:{ Exception -> 0x0247 }
            goto L_0x024d
        L_0x0247:
            java.text.SimpleDateFormat r1 = r6.f22413b     // Catch:{ ParseException -> 0x026c }
            java.util.Date r8 = r1.parse(r8)     // Catch:{ ParseException -> 0x026c }
        L_0x024d:
            if (r0 == 0) goto L_0x0264
            int r8 = r0.compareTo(r8)     // Catch:{ ParseException -> 0x026c }
            if (r8 <= 0) goto L_0x0264
            android.widget.ImageView r8 = r7.f22418a     // Catch:{ ParseException -> 0x026c }
            r8.setVisibility(r3)     // Catch:{ ParseException -> 0x026c }
            android.widget.ImageView r8 = r7.f22418a     // Catch:{ ParseException -> 0x026c }
            r8.bringToFront()     // Catch:{ ParseException -> 0x026c }
            goto L_0x0270
        L_0x0264:
            android.widget.ImageView r8 = r7.f22418a     // Catch:{ ParseException -> 0x026c }
            r8.setVisibility(r2)     // Catch:{ ParseException -> 0x026c }
            goto L_0x0270
        L_0x026c:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0270:
            androidx.cardview.widget.CardView r8 = r7.f22420a
            com.onedelhi.secure.x4$a r0 = new com.onedelhi.secure.x4$a
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3896x4.mo5728x(com.onedelhi.secure.x4$b, int):void");
    }

    @mr2
    /* renamed from: M */
    public C3898b mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3898b(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.past_ticket_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f22412a.size();
    }
}
