package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.common.C1410R;
import java.util.HashMap;

public class nl1 extends ArrayAdapter {

    /* renamed from: a */
    public HashMap<String, String> f17480a;

    /* renamed from: n */
    public final int f17481n;

    public nl1(@mr2 Context context, int i, HashMap<String, String> hashMap) {
        super(context, i);
        this.f17480a = hashMap;
        this.f17481n = i;
    }

    @ts2
    /* renamed from: a */
    public String getItem(int i) {
        return (this.f17480a.keySet().toArray()[i].toString() + '|') + this.f17480a.values().toArray()[i];
    }

    public int getCount() {
        return this.f17480a.size();
    }

    @mr2
    public View getView(int i, @ts2 View view, @mr2 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f17481n, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C1410R.C1412id.tv_name);
        TextView textView2 = (TextView) view.findViewById(C1410R.C1412id.tv_number);
        String a = getItem(i);
        if (a != null) {
            String[] split = a.split(pj0.m61166a(-83896903505735L));
            textView.setText(split[0]);
            textView2.setText(split[1]);
        }
        return view;
    }
}
