package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.delhitransport.onedelhi.models.directions.AllStops;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.onedelhi.secure.se */
public class C3509se extends ArrayAdapter {

    /* renamed from: a */
    public final C3510a f20318a = new C3510a();

    /* renamed from: a */
    public final ArrayList<AllStops> f20319a;

    /* renamed from: b */
    public ArrayList<AllStops> f20320b;

    /* renamed from: n */
    public final int f20321n;

    /* renamed from: com.onedelhi.secure.se$a */
    public class C3510a extends Filter {
        public C3510a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            String lowerCase = charSequence.toString().toLowerCase();
            Iterator it = C3509se.this.f20319a.iterator();
            while (it.hasNext()) {
                AllStops allStops = (AllStops) it.next();
                if (allStops.getName().toLowerCase().contains(lowerCase)) {
                    arrayList.add(allStops);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            ArrayList unused = C3509se.this.f20320b = (ArrayList) filterResults.values;
            C3509se.this.notifyDataSetChanged();
        }
    }

    public C3509se(@mr2 Context context, int i, ArrayList<AllStops> arrayList) {
        super(context, i);
        this.f20319a = arrayList;
        this.f20320b = arrayList;
        this.f20321n = i;
    }

    /* renamed from: c */
    public AllStops getItem(int i) {
        return this.f20320b.get(i);
    }

    public int getCount() {
        ArrayList<AllStops> arrayList = this.f20320b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @mr2
    public Filter getFilter() {
        return this.f20318a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        Resources resources;
        int i2;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f20321n, viewGroup, false);
        }
        AllStops c = getItem(i);
        String a = pj0.m61166a(-82582643513159L);
        String a2 = pj0.m61166a(-82586938480455L);
        String a3 = pj0.m61166a(-82591233447751L);
        String a4 = pj0.m61166a(-82595528415047L);
        TextView textView = (TextView) view.findViewById(C1410R.C1412id.tv_stop_name);
        TextView textView2 = (TextView) view.findViewById(C1410R.C1412id.tv_stop_id);
        TextView textView3 = (TextView) view.findViewById(C1410R.C1412id.tv_stop_desc);
        ImageView imageView = (ImageView) view.findViewById(C1410R.C1412id.iv_mode);
        if (c != null) {
            a = c.getStop_type();
            a2 = c.getName();
            a4 = String.valueOf(c.getId());
            a3 = c.getNext_stop();
        }
        textView.setText(a2);
        textView2.setText(a4);
        textView3.setText(a3);
        if (a3 != null) {
            textView3.setVisibility(0);
            textView3.setSelected(true);
        } else {
            textView3.setVisibility(8);
        }
        if (a.equalsIgnoreCase(pj0.m61166a(-82599823382343L))) {
            resources = view.getResources();
            i2 = C1410R.C1411drawable.ic_metro;
        } else if (a.equalsIgnoreCase(pj0.m61166a(-82625593186119L))) {
            resources = view.getResources();
            i2 = C1410R.C1411drawable.ic_bus;
        } else {
            resources = view.getResources();
            i2 = C1410R.C1411drawable.ic_location;
        }
        imageView.setImageDrawable(zk3.m33204g(resources, i2, (Resources.Theme) null));
        imageView.setColorFilter(Color.parseColor(pj0.m61166a(-82642773055303L)));
        return view;
    }
}
