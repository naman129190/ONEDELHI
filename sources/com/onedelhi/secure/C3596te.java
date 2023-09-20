package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.delhitransport.onedelhi.data.AllStops;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.onedelhi.secure.te */
public class C3596te extends ArrayAdapter {

    /* renamed from: a */
    public final C3597a f20763a = new C3597a();

    /* renamed from: a */
    public List<AllStops> f20764a;

    /* renamed from: b */
    public List<String> f20765b;

    /* renamed from: c */
    public final List<AllStops> f20766c = new ArrayList();

    /* renamed from: n */
    public final int f20767n;

    /* renamed from: com.onedelhi.secure.te$a */
    public class C3597a extends Filter {

        /* renamed from: a */
        public final Object f20769a = new Object();

        public C3597a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (C3596te.this.f20765b == null) {
                synchronized (this.f20769a) {
                    try {
                        C3596te.this.f20766c.addAll(C3596te.this.f20764a);
                    } catch (Exception e) {
                        c41.m40702d().mo32241g(e);
                    }
                }
            }
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f20769a) {
                    filterResults.values = C3596te.this.f20766c;
                    filterResults.count = C3596te.this.f20766c.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                ArrayList arrayList = new ArrayList();
                for (AllStops allStops : C3596te.this.f20766c) {
                    if (allStops.getName().toLowerCase().contains(lowerCase)) {
                        arrayList.add(allStops);
                    }
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                List unused = C3596te.this.f20764a = (List) obj;
            } else {
                List unused2 = C3596te.this.f20764a = null;
            }
            if (filterResults.count > 0) {
                C3596te.this.notifyDataSetChanged();
            } else {
                C3596te.this.notifyDataSetInvalidated();
            }
        }
    }

    public C3596te(@mr2 Context context, int i, List<AllStops> list) {
        super(context, i);
        this.f20767n = i;
        this.f20764a = list;
    }

    /* renamed from: e */
    public AllStops getItem(int i) {
        return this.f20764a.get(i);
    }

    public int getCount() {
        return this.f20764a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f20763a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f20767n, viewGroup, false);
        }
        ((TextView) view.findViewById(C1410R.C1412id.tv_stop_name)).setText(getItem(i).getName());
        ((TextView) view.findViewById(C1410R.C1412id.tv_stop_id)).setText(view.getResources().getString(C1410R.string.towards) + getItem(i).getNext_stop());
        return view;
    }
}
