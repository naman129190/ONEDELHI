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
import com.delhitransport.onedelhi.activities.GeneratePassActivity;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.google.android.gms.common.C1410R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.v4 */
public class C3763v4 extends RecyclerView.C0805h<C3764a> {

    /* renamed from: a */
    public final Context f21644a;

    /* renamed from: a */
    public final SimpleDateFormat f21645a;

    /* renamed from: a */
    public final List<DailyPass> f21646a;

    /* renamed from: b */
    public final SimpleDateFormat f21647b;

    /* renamed from: c */
    public final SimpleDateFormat f21648c;

    /* renamed from: com.onedelhi.secure.v4$a */
    public static class C3764a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final ImageView f21649a;

        /* renamed from: a */
        public final TextView f21650a;

        /* renamed from: a */
        public final CardView f21651a;

        /* renamed from: b */
        public final TextView f21652b;

        /* renamed from: c */
        public final TextView f21653c;

        /* renamed from: d */
        public final TextView f21654d;

        public C3764a(View view) {
            super(view);
            this.f21651a = (CardView) view.findViewById(C1410R.C1412id.card_past_ticket);
            this.f21652b = (TextView) view.findViewById(C1410R.C1412id.tv_bookingTime);
            this.f21653c = (TextView) view.findViewById(C1410R.C1412id.tv_totalFare);
            this.f21650a = (TextView) view.findViewById(C1410R.C1412id.tv_passID);
            this.f21654d = (TextView) view.findViewById(C1410R.C1412id.tv_pass_type);
            this.f21649a = (ImageView) view.findViewById(C1410R.C1412id.iv_pass_expire);
        }
    }

    public C3763v4(List<DailyPass> list, Context context) {
        String a = pj0.m61166a(-81478836918087L);
        Locale locale = Locale.ENGLISH;
        this.f21645a = new SimpleDateFormat(a, locale);
        this.f21647b = new SimpleDateFormat(pj0.m61166a(-81564736264007L), locale);
        this.f21648c = new SimpleDateFormat(pj0.m61166a(-81672110446407L), locale);
        this.f21646a = list;
        this.f21644a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m29809K(C3764a aVar, View view) {
        Intent intent = new Intent(this.f21644a, GeneratePassActivity.class);
        intent.putExtra(pj0.m61166a(-81770894694215L), this.f21646a.get(aVar.mo5681k()));
        intent.putExtra(pj0.m61166a(-81792369530695L), pj0.m61166a(-81831024236359L));
        intent.putExtra(pj0.m61166a(-81873973909319L), true);
        this.f21644a.startActivity(intent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6 = r4.f21647b.parse(r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00da */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5728x(@com.onedelhi.secure.mr2 com.onedelhi.secure.C3763v4.C3764a r5, int r6) {
        /*
            r4 = this;
            java.util.List<com.delhitransport.onedelhi.pass.DailyPass> r0 = r4.f21646a
            java.lang.Object r6 = r0.get(r6)
            com.delhitransport.onedelhi.pass.DailyPass r6 = (com.delhitransport.onedelhi.pass.DailyPass) r6
            android.widget.TextView r0 = r5.f21653c
            r1 = 0
            r0.setVisibility(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r2 = r4.f21644a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r2 = r2.getString(r3)
            r0.append(r2)
            float r2 = r6.getFare()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.widget.TextView r2 = r5.f21653c
            r2.setText(r0)
            r0 = 0
            java.lang.String r2 = r6.getBooking_time()     // Catch:{ ParseException -> 0x0058 }
            if (r2 == 0) goto L_0x0048
            java.text.SimpleDateFormat r0 = r4.f21645a     // Catch:{ ParseException -> 0x0058 }
            java.lang.String r2 = r6.getBooking_time()     // Catch:{ ParseException -> 0x0058 }
            java.util.Date r0 = r0.parse(r2)     // Catch:{ ParseException -> 0x0058 }
        L_0x0048:
            if (r0 == 0) goto L_0x0067
            android.widget.TextView r2 = r5.f21652b     // Catch:{ ParseException -> 0x0058 }
            java.text.SimpleDateFormat r3 = r4.f21648c     // Catch:{ ParseException -> 0x0058 }
            java.lang.String r0 = r3.format(r0)     // Catch:{ ParseException -> 0x0058 }
            r2.setText(r0)     // Catch:{ ParseException -> 0x0058 }
            goto L_0x0067
        L_0x0058:
            r0 = move-exception
            android.widget.TextView r2 = r5.f21652b
            java.lang.String r3 = r6.getBooking_time()
            r2.setText(r3)
            r0.printStackTrace()
        L_0x0067:
            android.widget.TextView r0 = r5.f21654d
            java.lang.String r2 = r6.getPass_type()
            r0.setText(r2)
            java.lang.String r0 = r6.getPass_type()
            r2 = -81758009792327(0xffffb5a43ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0093
            android.widget.TextView r0 = r5.f21654d
            android.content.Context r2 = r4.f21644a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            goto L_0x00a0
        L_0x0093:
            android.widget.TextView r0 = r5.f21654d
            android.content.Context r2 = r4.f21644a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131230922(0x7f0800ca, float:1.807791E38)
        L_0x00a0:
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setBackground(r2)
            android.widget.TextView r0 = r5.f21650a
            java.lang.String r6 = r6.getPass_id()
            r0.setText(r6)
            java.util.List<com.delhitransport.onedelhi.pass.DailyPass> r6 = r4.f21646a     // Catch:{ ParseException -> 0x0101 }
            int r0 = r5.mo5681k()     // Catch:{ ParseException -> 0x0101 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ ParseException -> 0x0101 }
            com.delhitransport.onedelhi.pass.DailyPass r6 = (com.delhitransport.onedelhi.pass.DailyPass) r6     // Catch:{ ParseException -> 0x0101 }
            java.lang.String r6 = r6.getValidity()     // Catch:{ ParseException -> 0x0101 }
            if (r6 == 0) goto L_0x0105
            java.util.Date r0 = new java.util.Date     // Catch:{ ParseException -> 0x0101 }
            r0.<init>()     // Catch:{ ParseException -> 0x0101 }
            java.text.SimpleDateFormat r2 = r4.f21645a     // Catch:{ ParseException -> 0x0101 }
            java.lang.String r0 = r2.format(r0)     // Catch:{ ParseException -> 0x0101 }
            java.util.Date r0 = r2.parse(r0)     // Catch:{ ParseException -> 0x0101 }
            java.text.SimpleDateFormat r2 = r4.f21645a     // Catch:{ Exception -> 0x00da }
            java.util.Date r6 = r2.parse(r6)     // Catch:{ Exception -> 0x00da }
            goto L_0x00e0
        L_0x00da:
            java.text.SimpleDateFormat r2 = r4.f21647b     // Catch:{ ParseException -> 0x0101 }
            java.util.Date r6 = r2.parse(r6)     // Catch:{ ParseException -> 0x0101 }
        L_0x00e0:
            if (r0 == 0) goto L_0x00f7
            int r6 = r0.compareTo(r6)     // Catch:{ ParseException -> 0x0101 }
            if (r6 <= 0) goto L_0x00f7
            android.widget.ImageView r6 = r5.f21649a     // Catch:{ ParseException -> 0x0101 }
            r6.setVisibility(r1)     // Catch:{ ParseException -> 0x0101 }
            android.widget.ImageView r6 = r5.f21649a     // Catch:{ ParseException -> 0x0101 }
            r6.bringToFront()     // Catch:{ ParseException -> 0x0101 }
            goto L_0x0105
        L_0x00f7:
            android.widget.ImageView r6 = r5.f21649a     // Catch:{ ParseException -> 0x0101 }
            r0 = 8
            r6.setVisibility(r0)     // Catch:{ ParseException -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0105:
            androidx.cardview.widget.CardView r6 = r5.f21651a
            com.onedelhi.secure.u4 r0 = new com.onedelhi.secure.u4
            r0.<init>(r4, r5)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3763v4.mo5728x(com.onedelhi.secure.v4$a, int):void");
    }

    @mr2
    /* renamed from: M */
    public C3764a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3764a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.past_pass_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f21646a.size();
    }
}
