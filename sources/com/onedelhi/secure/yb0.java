package com.onedelhi.secure;

import android.database.Cursor;
import android.widget.Filter;

public class yb0 extends Filter {

    /* renamed from: a */
    public C3983a f22964a;

    /* renamed from: com.onedelhi.secure.yb0$a */
    public interface C3983a {
        /* renamed from: a */
        CharSequence mo24232a(Cursor cursor);

        /* renamed from: b */
        void mo24233b(Cursor cursor);

        /* renamed from: c */
        Cursor mo26867c();

        /* renamed from: d */
        Cursor mo24234d(CharSequence charSequence);
    }

    public yb0(C3983a aVar) {
        this.f22964a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f22964a.mo24232a((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f22964a.mo24234d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
        } else {
            filterResults.count = 0;
            d = null;
        }
        filterResults.values = d;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.f22964a.mo26867c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.f22964a.mo24233b((Cursor) obj);
        }
    }
}
