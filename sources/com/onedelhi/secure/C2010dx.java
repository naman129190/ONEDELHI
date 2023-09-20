package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1173a;
import com.delhitransport.onedelhi.activities.EVDetailsActivity;
import com.delhitransport.onedelhi.p002ev.EVCharger;
import com.delhitransport.onedelhi.p002ev.EVdata;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.dx */
public class C2010dx extends RecyclerView.C0805h<C2011a> {

    /* renamed from: a */
    public Context f10979a;

    /* renamed from: a */
    public EVdata f10980a;

    /* renamed from: a */
    public String f10981a;

    /* renamed from: a */
    public ArrayList<EVCharger> f10982a;

    /* renamed from: b */
    public String f10983b;

    /* renamed from: c */
    public String f10984c;

    /* renamed from: com.onedelhi.secure.dx$a */
    public class C2011a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f10985a;

        /* renamed from: a */
        public RelativeLayout f10986a;

        /* renamed from: a */
        public TextView f10987a;

        /* renamed from: b */
        public TextView f10989b;

        /* renamed from: c */
        public TextView f10990c;

        public C2011a(@mr2 View view) {
            super(view);
            this.f10986a = (RelativeLayout) view.findViewById(C1410R.C1412id.rv_ev_card_item);
            this.f10985a = (ImageView) view.findViewById(C1410R.C1412id.iv_charger);
            this.f10987a = (TextView) view.findViewById(C1410R.C1412id.tv_charger);
            this.f10989b = (TextView) view.findViewById(C1410R.C1412id.tv_charger_status);
            this.f10990c = (TextView) view.findViewById(C1410R.C1412id.tv_price);
        }
    }

    public C2010dx(ArrayList<EVCharger> arrayList, EVdata eVdata, String str, String str2, String str3, Context context) {
        this.f10982a = arrayList;
        this.f10979a = context;
        this.f10980a = eVdata;
        this.f10981a = str;
        this.f10983b = str2;
        this.f10984c = str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m13410K(View view) {
        Intent intent = new Intent(this.f10979a, EVDetailsActivity.class);
        intent.putExtra(pj0.m61166a(-83020730177351L), this.f10981a);
        intent.putExtra(pj0.m61166a(-83037910046535L), this.f10983b);
        intent.putExtra(pj0.m61166a(-83059384883015L), this.f10980a);
        intent.putExtra(pj0.m61166a(-83106629523271L), this.f10984c);
        this.f10979a.startActivity(intent);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C2011a aVar, int i) {
        int i2;
        aVar.f10987a.setText(this.f10982a.get(i).getType());
        ((ti3) ((ti3) C1173a.m7523E(this.f10979a).mo16004n(this.f10982a.get(i).getDiagram()).mo25192p(km0.f15020b)).mo25088a(mj3.m21669q1(true)).mo25135E0(new mt2(String.valueOf(System.currentTimeMillis())))).mo25101k1(aVar.f10985a);
        if (this.f10982a.get(i).getAvailable().equals(pj0.m61166a(-82999255340871L)) || this.f10982a.get(i).getAvailable().equals(pj0.m61166a(-83007845275463L))) {
            TextView textView = aVar.f10987a;
            Resources resources = this.f10979a.getResources();
            i2 = C1410R.color.light_black;
            textView.setTextColor(resources.getColor(C1410R.color.light_black));
            aVar.f10986a.getBackground().setColorFilter(this.f10979a.getResources().getColor(C1410R.color.bg_grey), PorterDuff.Mode.SRC_ATOP);
        } else {
            TextView textView2 = aVar.f10987a;
            Resources resources2 = this.f10979a.getResources();
            i2 = C1410R.color.ev_green;
            textView2.setTextColor(resources2.getColor(C1410R.color.ev_green));
        }
        aVar.f10985a.setColorFilter(this.f10979a.getResources().getColor(i2), PorterDuff.Mode.MULTIPLY);
        aVar.f10990c.setText(this.f10982a.get(i).getCost_per_unit());
        aVar.f10986a.setOnClickListener(new C4920cx(this));
    }

    @mr2
    /* renamed from: M */
    public C2011a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C2011a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.ev_charger_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        if (this.f10982a.size() > 2) {
            return 2;
        }
        return this.f10982a.size();
    }
}
