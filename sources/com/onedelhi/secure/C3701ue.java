package com.onedelhi.secure;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.delhitransport.onedelhi.p002ev.EVdata;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.ue */
public class C3701ue extends ArrayAdapter {

    /* renamed from: a */
    public ArrayList<EVdata> f21322a;

    /* renamed from: b */
    public String f21323b;

    /* renamed from: n */
    public final int f21324n;

    public C3701ue(@mr2 Context context, int i, ArrayList<EVdata> arrayList, String str) {
        super(context, i);
        this.f21324n = i;
        this.f21322a = arrayList;
        this.f21323b = str;
    }

    public int getCount() {
        return this.f21322a.size();
    }

    @ts2
    public Object getItem(int i) {
        return super.getItem(i);
    }
}
