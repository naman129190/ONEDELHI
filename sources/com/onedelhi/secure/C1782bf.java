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

/* renamed from: com.onedelhi.secure.bf */
public class C1782bf extends ArrayAdapter {

    /* renamed from: a */
    public final C1783a f9800a = new C1783a();

    /* renamed from: a */
    public HashMap<String, String> f9801a;

    /* renamed from: b */
    public final HashMap<String, String> f9802b;

    /* renamed from: n */
    public final int f9803n;

    /* renamed from: com.onedelhi.secure.bf$a */
    public class C1783a extends Filter {

        /* renamed from: a */
        public final Object f9805a = new Object();

        public C1783a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f9805a) {
                    filterResults.values = C1782bf.this.f9802b;
                    filterResults.count = C1782bf.this.f9802b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : C1782bf.this.f9802b.entrySet()) {
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
                HashMap unused = C1782bf.this.f9801a = (HashMap) obj;
            } else {
                HashMap unused2 = C1782bf.this.f9801a = null;
            }
            if (filterResults.count > 0) {
                C1782bf.this.notifyDataSetChanged();
            } else {
                C1782bf.this.notifyDataSetInvalidated();
            }
        }
    }

    public C1782bf(@mr2 Context context, int i, HashMap<String, String> hashMap) {
        super(context, i);
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f9802b = hashMap2;
        this.f9801a = hashMap;
        this.f9803n = i;
        hashMap2.putAll(hashMap);
    }

    @ts2
    /* renamed from: c */
    public List<String> getItem(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f9801a.keySet().toArray()[i].toString());
        arrayList.add(String.valueOf(this.f9801a.values().toArray()[i]));
        return arrayList;
    }

    public int getCount() {
        return this.f9801a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f9800a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f9803n, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C1410R.C1412id.tv_stationName);
        TextView textView2 = (TextView) view.findViewById(C1410R.C1412id.tv_stationAddress);
        List<String> c = getItem(i);
        if (c != null) {
            try {
                textView.setText(c.get(0).split(pj0.m61166a(-82960600635207L))[0]);
            } catch (Exception unused) {
                textView.setText(c.get(0));
            }
            textView2.setText(c.get(1));
        }
        return view;
    }
}
