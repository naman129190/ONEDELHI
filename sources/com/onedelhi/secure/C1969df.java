package com.onedelhi.secure;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.google.android.gms.common.C1410R;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.onedelhi.secure.df */
public class C1969df extends ArrayAdapter {

    /* renamed from: a */
    public C1970a f10720a = new C1970a();

    /* renamed from: a */
    public TreeMap<Integer, String> f10721a;

    /* renamed from: b */
    public TreeMap<Integer, String> f10722b;

    /* renamed from: n */
    public int f10723n;

    /* renamed from: com.onedelhi.secure.df$a */
    public class C1970a extends Filter {

        /* renamed from: a */
        public final Object f10725a = new Object();

        public C1970a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f10725a) {
                    filterResults.values = C1969df.this.f10722b;
                    filterResults.count = C1969df.this.f10722b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                TreeMap treeMap = new TreeMap();
                for (Map.Entry entry : C1969df.this.f10722b.entrySet()) {
                    if (((String) entry.getValue()).toLowerCase().contains(lowerCase)) {
                        treeMap.put((Integer) entry.getKey(), (String) entry.getValue());
                    }
                }
                filterResults.values = treeMap;
                filterResults.count = treeMap.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                TreeMap unused = C1969df.this.f10721a = (TreeMap) obj;
            } else {
                TreeMap unused2 = C1969df.this.f10721a = null;
            }
            if (filterResults.count > 0) {
                C1969df.this.notifyDataSetChanged();
            } else {
                C1969df.this.notifyDataSetInvalidated();
            }
        }
    }

    public C1969df(@mr2 Context context, int i, TreeMap<Integer, String> treeMap) {
        super(context, i);
        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        this.f10722b = treeMap2;
        this.f10721a = treeMap;
        this.f10723n = i;
        treeMap2.putAll(treeMap);
    }

    /* renamed from: c */
    public Pair<Integer, String> getItem(int i) {
        this.f10721a.get(Integer.valueOf(i));
        return new Pair<>(Integer.valueOf(Integer.parseInt(String.valueOf(this.f10721a.keySet().toArray()[i]))), String.valueOf(this.f10721a.values().toArray()[i]));
    }

    public int getCount() {
        return this.f10721a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f10720a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10723n, viewGroup, false);
        }
        ((TextView) view.findViewById(C1410R.C1412id.tv_stop_name)).setText((CharSequence) getItem(i).second);
        return view;
    }
}
