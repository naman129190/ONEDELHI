package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.EVDetailsActivity;
import com.delhitransport.onedelhi.p002ev.EVdata;
import com.google.android.gms.common.C1410R;
import java.util.List;

public class wn2 extends RecyclerView.C0805h<C3862a> {

    /* renamed from: a */
    public final Context f22217a;

    /* renamed from: a */
    public final String f22218a;

    /* renamed from: a */
    public final List<EVdata> f22219a;

    /* renamed from: b */
    public final List<Float> f22220b;

    /* renamed from: com.onedelhi.secure.wn2$a */
    public static class C3862a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f22221a;

        /* renamed from: a */
        public final TextView f22222a;

        /* renamed from: b */
        public final TextView f22223b;

        /* renamed from: c */
        public final TextView f22224c;

        public C3862a(View view) {
            super(view);
            this.f22222a = (TextView) view.findViewById(C1410R.C1412id.tv_stationName);
            this.f22223b = (TextView) view.findViewById(C1410R.C1412id.tv_stationAddress);
            this.f22224c = (TextView) view.findViewById(C1410R.C1412id.tv_distance);
            this.f22221a = (ImageView) view.findViewById(C1410R.C1412id.iv_1);
        }
    }

    public wn2(List<EVdata> list, List<Float> list2, String str, Context context) {
        this.f22219a = list;
        this.f22220b = list2;
        this.f22218a = str;
        this.f22217a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m30952K(int i, View view) {
        Intent intent = new Intent(this.f22217a, EVDetailsActivity.class);
        intent.putExtra(pj0.m61166a(-83939853178695L), this.f22219a.get(i).getName() + ';' + this.f22219a.get(i).getAddress() + ';' + this.f22219a.get(i).getCoordinates().getLatitude() + ';' + this.f22219a.get(i).getCoordinates().getLongitude());
        intent.putExtra(pj0.m61166a(-83957033047879L), this.f22220b.get(i) + pj0.m61166a(-83978507884359L));
        intent.putExtra(pj0.m61166a(-83995687753543L), this.f22219a.get(i));
        intent.putExtra(pj0.m61166a(-84042932393799L), this.f22218a);
        this.f22217a.startActivity(intent);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C3862a aVar, int i) {
        int i2;
        ImageView imageView;
        aVar.f22222a.setText(this.f22219a.get(i).getName());
        aVar.f22223b.setText(this.f22219a.get(i).getAddress());
        aVar.f22224c.setText(this.f22220b.get(i) + pj0.m61166a(-83909788407623L));
        if (!this.f22219a.get(i).getAvailable().equals(pj0.m61166a(-83926968276807L))) {
            imageView = aVar.f22221a;
            i2 = C1410R.C1411drawable.ic_socket_available;
        } else {
            imageView = aVar.f22221a;
            i2 = C1410R.C1411drawable.ic_ev_station;
        }
        imageView.setImageResource(i2);
        aVar.f4609a.setOnClickListener(new vn2(this, i));
    }

    @mr2
    /* renamed from: M */
    public C3862a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3862a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.nearby_station_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f22219a.size();
    }
}
