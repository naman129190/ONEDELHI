package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.af */
public class C1693af extends ArrayAdapter {

    /* renamed from: a */
    public final C1694a f9037a = new C1694a();

    /* renamed from: a */
    public HashMap<String, String> f9038a;

    /* renamed from: b */
    public final HashMap<String, String> f9039b;

    /* renamed from: n */
    public final int f9040n;

    /* renamed from: com.onedelhi.secure.af$a */
    public class C1694a extends Filter {

        /* renamed from: a */
        public final Object f9042a = new Object();

        public C1694a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f9042a) {
                    filterResults.values = C1693af.this.f9039b;
                    filterResults.count = C1693af.this.f9039b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : C1693af.this.f9039b.entrySet()) {
                    if (((String) entry.getKey()).toLowerCase().contains(lowerCase)) {
                        hashMap.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                filterResults.values = hashMap;
                filterResults.count = hashMap.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                HashMap unused = C1693af.this.f9038a = (HashMap) obj;
            } else {
                HashMap unused2 = C1693af.this.f9038a = null;
            }
            if (filterResults.count > 0) {
                C1693af.this.notifyDataSetChanged();
            } else {
                C1693af.this.notifyDataSetInvalidated();
            }
        }
    }

    public C1693af(@mr2 Context context, int i, HashMap<String, String> hashMap) {
        super(context, i);
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f9039b = hashMap2;
        this.f9038a = hashMap;
        this.f9040n = i;
        hashMap2.putAll(hashMap);
    }

    @ts2
    /* renamed from: c */
    public List<String> getItem(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f9038a.keySet().toArray()[i].toString());
        return arrayList;
    }

    public int getCount() {
        return this.f9038a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f9037a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f9040n, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C1410R.C1412id.tv_stationName);
        TextView textView2 = (TextView) view.findViewById(C1410R.C1412id.tv_stationAddress);
        List<String> c = getItem(i);
        if (c != null) {
            try {
                textView.setText(c.get(0).split(pj0.m61166a(-82947715733319L))[0]);
            } catch (Exception unused) {
                textView.setText(c.get(0));
            }
        }
        return view;
    }
}
