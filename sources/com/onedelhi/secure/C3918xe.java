package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Pair;
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

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.onedelhi.secure.xe */
public class C3918xe extends ArrayAdapter {

    /* renamed from: a */
    public C3919a f22529a = new C3919a();

    /* renamed from: a */
    public HashMap<Integer, String> f22530a = new HashMap<>();

    /* renamed from: a */
    public List<String> f22531a;

    /* renamed from: b */
    public HashMap<Integer, String> f22532b = new HashMap<>();

    /* renamed from: n */
    public int f22533n;

    /* renamed from: com.onedelhi.secure.xe$a */
    public class C3919a extends Filter {

        /* renamed from: a */
        public final Object f22535a = new Object();

        public C3919a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (C3918xe.this.f22531a == null) {
                synchronized (this.f22535a) {
                    C3918xe.this.f22532b.putAll(C3918xe.this.f22530a);
                }
            }
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (this.f22535a) {
                    filterResults.values = C3918xe.this.f22532b;
                    filterResults.count = C3918xe.this.f22532b.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : C3918xe.this.f22532b.entrySet()) {
                    if (((String) entry.getValue()).split(pj0.m61166a(-82921945929543L))[0].toLowerCase().contains(lowerCase)) {
                        hashMap.put((Integer) entry.getKey(), (String) entry.getValue());
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
                HashMap unused = C3918xe.this.f22530a = (HashMap) obj;
            } else {
                HashMap unused2 = C3918xe.this.f22530a = null;
            }
            if (filterResults.count > 0) {
                C3918xe.this.notifyDataSetChanged();
            } else {
                C3918xe.this.notifyDataSetInvalidated();
            }
        }
    }

    public C3918xe(@mr2 Context context, int i, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        super(context, i);
        this.f22533n = i;
    }

    public C3918xe(@mr2 Context context, int i, HashMap<Integer, String> hashMap) {
        super(context, i);
        this.f22530a = hashMap;
        this.f22533n = i;
    }

    /* renamed from: e */
    public Pair<Integer, String> getItem(int i) {
        return new Pair<>(Integer.valueOf(Integer.parseInt(String.valueOf(this.f22530a.keySet().toArray()[i]))), String.valueOf(this.f22530a.values().toArray()[i]));
    }

    public int getCount() {
        return this.f22530a.size();
    }

    @mr2
    public Filter getFilter() {
        return this.f22529a;
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f22533n, viewGroup, false);
        }
        ((TextView) view.findViewById(C1410R.C1412id.tv_stop_name)).setText(((String) getItem(i).second).split(pj0.m61166a(-82930535864135L))[0]);
        ((TextView) view.findViewById(C1410R.C1412id.tv_stop_id)).setText(view.getResources().getString(C1410R.string.towards) + ((String) getItem(i).second).split(pj0.m61166a(-82939125798727L))[1]);
        return view;
    }
}
