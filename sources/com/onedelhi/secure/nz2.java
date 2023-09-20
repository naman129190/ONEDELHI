package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;

public class nz2 extends ArrayAdapter {

    /* renamed from: a */
    public final ArrayList<PastSearchTripPlanner> f17631a;

    /* renamed from: n */
    public final int f17632n;

    public nz2(@mr2 Context context, int i, ArrayList<PastSearchTripPlanner> arrayList) {
        super(context, i);
        this.f17631a = arrayList;
        this.f17632n = i;
    }

    @ts2
    /* renamed from: a */
    public PastSearchTripPlanner getItem(int i) {
        return this.f17631a.get(i);
    }

    public int getCount() {
        return this.f17631a.size();
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f17632n, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(C1410R.C1412id.iv_mode);
        TextView textView = (TextView) view.findViewById(C1410R.C1412id.tv_stop_name);
        TextView textView2 = (TextView) view.findViewById(C1410R.C1412id.tv_stop_desc);
        TextView textView3 = (TextView) view.findViewById(C1410R.C1412id.tv_stop_id);
        PastSearchTripPlanner a = getItem(i);
        if (a != null) {
            try {
                imageView.setImageDrawable(a.getStop_type().equalsIgnoreCase("bus") ? zk3.m33204g(view.getResources(), C1410R.C1411drawable.ic_bus, (Resources.Theme) null) : a.getStop_type().equalsIgnoreCase("metro") ? zk3.m33204g(view.getResources(), C1410R.C1411drawable.ic_metro, (Resources.Theme) null) : zk3.m33204g(view.getResources(), C1410R.C1411drawable.ic_location, (Resources.Theme) null));
                imageView.setColorFilter(Color.parseColor("#828282"));
                textView.setText(a.getStop_name());
                if (a.getStop_desc() != null) {
                    if (!a.getStop_desc().equalsIgnoreCase("")) {
                        textView2.setVisibility(0);
                        textView2.setText(a.getStop_desc());
                        textView3.setText(String.valueOf(a.getId()));
                    }
                }
                textView2.setVisibility(8);
                textView3.setText(String.valueOf(a.getId()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return view;
    }
}
