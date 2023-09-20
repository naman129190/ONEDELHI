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

public class mz2 extends ArrayAdapter {

    /* renamed from: a */
    public final C2910a f16956a = new C2910a();

    /* renamed from: a */
    public HashMap<String, String> f16957a;

    /* renamed from: b */
    public final HashMap<String, String> f16958b;

    /* renamed from: n */
    public final int f16959n;

    /* renamed from: com.onedelhi.secure.mz2$a */
    public class C2910a extends Filter {

        /* renamed from: a */
        public final Object f16961a = new Object();

        public C2910a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f16961a) {
                    filterResults.values = mz2.this.f16958b;
                    filterResults.count = mz2.this.f16958b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : mz2.this.f16958b.entrySet()) {
                    if (((String) entry.getValue()).toLowerCase().contains(lowerCase)) {
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
                HashMap unused = mz2.this.f16957a = (HashMap) obj;
            } else {
                HashMap unused2 = mz2.this.f16957a = null;
            }
            if (filterResults.count > 0) {
                mz2.this.notifyDataSetChanged();
            } else {
                mz2.this.notifyDataSetInvalidated();
            }
        }
    }

    public mz2(@mr2 Context context, int i, HashMap<String, String> hashMap) {
        super(context, i);
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f16958b = hashMap2;
        this.f16957a = hashMap;
        this.f16959n = i;
        hashMap2.putAll(hashMap);
    }

    @ts2
    /* renamed from: c */
    public List<String> getItem(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f16957a.keySet().toArray()[i].toString());
        arrayList.add(String.valueOf(this.f16957a.values().toArray()[i]));
        return arrayList;
    }

    public int getCount() {
        return this.f16957a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f16956a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f16959n, viewGroup, false);
        }
        List<String> c = getItem(i);
        ((TextView) view.findViewById(C1410R.C1412id.tv_stationName)).setText(c.get(0));
        ((TextView) view.findViewById(C1410R.C1412id.tv_stationAddress)).setText(c.get(1));
        return view;
    }
}
