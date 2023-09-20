package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.live.MetroTimeTableItem;
import com.google.android.gms.common.C1410R;
import java.util.List;

public class bj2 extends RecyclerView.C0805h<C1787a> {

    /* renamed from: a */
    public final Context f9844a;

    /* renamed from: a */
    public final List<MetroTimeTableItem> f9845a;

    /* renamed from: com.onedelhi.secure.bj2$a */
    public static class C1787a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final RelativeLayout f9846a;

        /* renamed from: a */
        public final TextView f9847a;

        /* renamed from: b */
        public final TextView f9848b;

        /* renamed from: c */
        public final TextView f9849c;

        public C1787a(View view) {
            super(view);
            this.f9846a = (RelativeLayout) view.findViewById(C1410R.C1412id.rv_lineColor);
            this.f9847a = (TextView) view.findViewById(C1410R.C1412id.tv_stationName);
            this.f9848b = (TextView) view.findViewById(C1410R.C1412id.tv_firstTrain);
            this.f9849c = (TextView) view.findViewById(C1410R.C1412id.tv_lastTrain);
        }
    }

    public bj2(List<MetroTimeTableItem> list, Context context) {
        this.f9845a = list;
        this.f9844a = context;
    }

    /* renamed from: J */
    public void mo5728x(@mr2 C1787a aVar, int i) {
        MetroTimeTableItem metroTimeTableItem = this.f9845a.get(i);
        aVar.f9846a.setBackgroundColor(Color.parseColor(metroTimeTableItem.getLine_color()));
        aVar.f9848b.setText(metroTimeTableItem.getFirst_train());
        aVar.f9849c.setText(metroTimeTableItem.getLast_train());
        aVar.f9847a.setText(metroTimeTableItem.getStation_name());
    }

    @mr2
    /* renamed from: K */
    public C1787a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1787a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.metro_time_table_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f9845a.size();
    }
}
