package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1173a;
import com.delhitransport.onedelhi.p002ev.EVCharger;
import com.google.android.gms.common.C1410R;
import java.util.List;

/* renamed from: com.onedelhi.secure.bx */
public class C1822bx extends RecyclerView.C0805h<C1823a> {

    /* renamed from: a */
    public final Context f9998a;

    /* renamed from: a */
    public final List<EVCharger> f9999a;

    /* renamed from: com.onedelhi.secure.bx$a */
    public static class C1823a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final ImageView f10000a;

        /* renamed from: a */
        public final TextView f10001a;

        /* renamed from: b */
        public final TextView f10002b;

        /* renamed from: c */
        public final TextView f10003c;

        /* renamed from: d */
        public final TextView f10004d;

        /* renamed from: e */
        public final TextView f10005e;

        public C1823a(View view) {
            super(view);
            this.f10000a = (ImageView) view.findViewById(C1410R.C1412id.iv_charger_diagram);
            this.f10001a = (TextView) view.findViewById(C1410R.C1412id.tv_chargerType);
            this.f10002b = (TextView) view.findViewById(C1410R.C1412id.tv_capacity);
            this.f10003c = (TextView) view.findViewById(C1410R.C1412id.tv_chargerCount);
            this.f10004d = (TextView) view.findViewById(C1410R.C1412id.tv_chargerAvailable);
            this.f10005e = (TextView) view.findViewById(C1410R.C1412id.tv_chargerCost);
        }
    }

    public C1822bx(List<EVCharger> list, Context context) {
        this.f9999a = list;
        this.f9998a = context;
    }

    /* renamed from: J */
    public void mo5728x(@mr2 C1823a aVar, int i) {
        Resources resources;
        ImageView imageView;
        int i2;
        aVar.f10001a.setText(this.f9999a.get(i).getType());
        aVar.f10002b.setText(this.f9999a.get(i).getPower());
        aVar.f10003c.setText(this.f9999a.get(i).getTotal());
        aVar.f10004d.setText(this.f9999a.get(i).getAvailable());
        aVar.f10005e.setText(this.f9999a.get(i).getCost_per_unit());
        if (!this.f9999a.get(i).getDiagram().equalsIgnoreCase(pj0.m61166a(-82973485537095L))) {
            C1173a.m7523E(this.f9998a).mo16004n(this.f9999a.get(i).getDiagram()).mo25101k1(aVar.f10000a);
        }
        if (this.f9999a.get(i).getAvailable().equals(pj0.m61166a(-82977780504391L)) || this.f9999a.get(i).getAvailable().equals(pj0.m61166a(-82986370438983L))) {
            imageView = aVar.f10000a;
            resources = this.f9998a.getResources();
            i2 = C1410R.color.light_black;
        } else {
            imageView = aVar.f10000a;
            resources = this.f9998a.getResources();
            i2 = C1410R.color.ev_green;
        }
        imageView.setColorFilter(resources.getColor(i2), PorterDuff.Mode.MULTIPLY);
    }

    @mr2
    /* renamed from: K */
    public C1823a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1823a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.charger_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f9999a.size();
    }
}
