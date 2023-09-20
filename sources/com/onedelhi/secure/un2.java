package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.EVDetailsActivity;
import com.delhitransport.onedelhi.p002ev.EVdata;
import com.google.android.gms.common.C1410R;
import java.util.List;

public class un2 extends RecyclerView.C0805h<C3729a> {

    /* renamed from: a */
    public final Context f21444a;

    /* renamed from: a */
    public final String f21445a;

    /* renamed from: a */
    public final List<EVdata> f21446a;

    /* renamed from: b */
    public final List<Float> f21447b;

    /* renamed from: com.onedelhi.secure.un2$a */
    public static class C3729a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final ImageView f21448a;

        /* renamed from: a */
        public final RelativeLayout f21449a;

        /* renamed from: a */
        public final TextView f21450a;

        /* renamed from: b */
        public final ImageView f21451b;

        /* renamed from: b */
        public final TextView f21452b;

        /* renamed from: b */
        public final RecyclerView f21453b;

        /* renamed from: c */
        public final ImageView f21454c;

        /* renamed from: c */
        public final TextView f21455c;

        /* renamed from: d */
        public final ImageView f21456d;

        /* renamed from: d */
        public final TextView f21457d;

        /* renamed from: e */
        public final TextView f21458e;

        public C3729a(@mr2 View view) {
            super(view);
            this.f21450a = (TextView) view.findViewById(C1410R.C1412id.tv_ev_name);
            this.f21452b = (TextView) view.findViewById(C1410R.C1412id.tv_ev_address);
            this.f21455c = (TextView) view.findViewById(C1410R.C1412id.tv_distance);
            this.f21457d = (TextView) view.findViewById(C1410R.C1412id.tv_available_chargers);
            this.f21458e = (TextView) view.findViewById(C1410R.C1412id.tv_more_chargers);
            this.f21448a = (ImageView) view.findViewById(C1410R.C1412id.iv_directions);
            this.f21453b = (RecyclerView) view.findViewById(C1410R.C1412id.rv_chargers);
            this.f21449a = (RelativeLayout) view.findViewById(C1410R.C1412id.rl_ev_card);
            this.f21451b = (ImageView) view.findViewById(C1410R.C1412id.iv_2w);
            this.f21454c = (ImageView) view.findViewById(C1410R.C1412id.iv_3w);
            this.f21456d = (ImageView) view.findViewById(C1410R.C1412id.iv_4w);
        }
    }

    public un2(List<EVdata> list, List<Float> list2, String str, Context context) {
        this.f21446a = list;
        this.f21447b = list2;
        this.f21444a = context;
        this.f21445a = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m29452L(int i, View view) {
        String a = pj0.m61166a(-84377939842887L);
        this.f21444a.startActivity(new Intent(a, Uri.parse(pj0.m61166a(-84493903959879L) + this.f21446a.get(i).getCoordinates().getLatitude() + ',' + this.f21446a.get(i).getCoordinates().getLongitude())));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m29453M(int i, View view) {
        Intent intent = new Intent(this.f21444a, EVDetailsActivity.class);
        intent.putExtra(pj0.m61166a(-84231910954823L), this.f21446a.get(i).getName() + ';' + this.f21446a.get(i).getAddress() + ';' + this.f21446a.get(i).getCoordinates().getLatitude() + ';' + this.f21446a.get(i).getCoordinates().getLongitude());
        intent.putExtra(pj0.m61166a(-84249090824007L), this.f21447b.get(i) + pj0.m61166a(-84270565660487L));
        intent.putExtra(pj0.m61166a(-84287745529671L), this.f21446a.get(i));
        intent.putExtra(pj0.m61166a(-84334990169927L), this.f21445a);
        this.f21444a.startActivity(intent);
    }

    /* renamed from: N */
    public void mo5728x(@mr2 C3729a aVar, int i) {
        aVar.f21450a.setText(this.f21446a.get(i).getName());
        aVar.f21452b.setText(this.f21446a.get(i).getAddress());
        aVar.f21455c.setText(this.f21447b.get(i) + pj0.m61166a(-84085882066759L));
        aVar.f21457d.setText(this.f21446a.get(i).getAvailable() + pj0.m61166a(-84103061935943L) + this.f21446a.get(i).getTotal() + pj0.m61166a(-84111651870535L));
        aVar.f21448a.setOnClickListener(new tn2(this, i));
        aVar.f21449a.setOnClickListener(new sn2(this, i));
        if (this.f21446a.get(i).getEvChargers().size() > 2) {
            int size = this.f21446a.get(i).getEvChargers().size();
            aVar.f21458e.setVisibility(0);
            aVar.f21458e.setText(String.valueOf(pj0.m61166a(-84141716641607L) + (size - 2) + pj0.m61166a(-84150306576199L)));
        } else {
            aVar.f21458e.setVisibility(8);
        }
        for (int i2 = 0; i2 < this.f21446a.get(i).getEvChargers().size(); i2++) {
            if (this.f21446a.get(i).getEvChargers().get(i2).getVehicle_type().contains(pj0.m61166a(-84176076379975L))) {
                aVar.f21451b.setVisibility(0);
            }
            if (this.f21446a.get(i).getEvChargers().get(i2).getVehicle_type().contains(pj0.m61166a(-84188961281863L))) {
                aVar.f21454c.setVisibility(0);
            }
            if (this.f21446a.get(i).getEvChargers().get(i2).getVehicle_type().contains(pj0.m61166a(-84201846183751L))) {
                aVar.f21456d.setVisibility(0);
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f21444a);
        linearLayoutManager.mo5294f3(0);
        aVar.f21453b.setLayoutManager(linearLayoutManager);
        RecyclerView T = aVar.f21453b;
        T.setAdapter(new C2010dx(this.f21446a.get(i).getEvChargers(), this.f21446a.get(i), this.f21446a.get(i).getName() + ';' + this.f21446a.get(i).getAddress() + ';' + this.f21446a.get(i).getCoordinates().getLatitude() + ';' + this.f21446a.get(i).getCoordinates().getLongitude(), this.f21447b.get(i) + pj0.m61166a(-84214731085639L), this.f21445a, this.f21444a));
    }

    @mr2
    /* renamed from: O */
    public C3729a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3729a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.ev_card_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f21446a.size();
    }
}
