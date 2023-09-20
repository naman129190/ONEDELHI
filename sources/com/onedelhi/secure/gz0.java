package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.faq.FAQs;
import com.delhitransport.onedelhi.models.faq.FaQsModel;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;

public class gz0 extends RecyclerView.C0805h<C2289a> {

    /* renamed from: a */
    public Context f12829a;

    /* renamed from: a */
    public iz0 f12830a;

    /* renamed from: a */
    public ArrayList<FAQs> f12831a;

    /* renamed from: b */
    public ArrayList<FAQs> f12832b;

    /* renamed from: c */
    public ArrayList<FAQs> f12833c;

    /* renamed from: d */
    public ArrayList<FAQs> f12834d;

    /* renamed from: e */
    public ArrayList<FAQs> f12835e;

    /* renamed from: f */
    public ArrayList<FAQs> f12836f;

    /* renamed from: g */
    public ArrayList<FAQs> f12837g;

    /* renamed from: h */
    public ArrayList<FAQs> f12838h;

    /* renamed from: i */
    public ArrayList<FAQs> f12839i;

    /* renamed from: j */
    public ArrayList<String> f12840j;

    /* renamed from: k */
    public ArrayList<FaQsModel> f12841k;

    /* renamed from: com.onedelhi.secure.gz0$a */
    public static class C2289a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public TextView f12842a;

        /* renamed from: b */
        public RecyclerView f12843b;

        public C2289a(@mr2 View view) {
            super(view);
            this.f12842a = (TextView) view.findViewById(C1410R.C1412id.tv_title);
            this.f12843b = (RecyclerView) view.findViewById(C1410R.C1412id.rv_list_faq);
        }
    }

    public gz0(Context context, ArrayList<FaQsModel> arrayList) {
        this.f12829a = context;
        this.f12841k = arrayList;
    }

    public gz0(Context context, ArrayList<String> arrayList, ArrayList<FAQs> arrayList2, ArrayList<FAQs> arrayList3, ArrayList<FAQs> arrayList4, ArrayList<FAQs> arrayList5, ArrayList<FAQs> arrayList6, ArrayList<FAQs> arrayList7, ArrayList<FAQs> arrayList8, ArrayList<FAQs> arrayList9) {
        this.f12829a = context;
        this.f12832b = arrayList2;
        this.f12833c = arrayList3;
        this.f12834d = arrayList4;
        this.f12835e = arrayList5;
        this.f12836f = arrayList6;
        this.f12837g = arrayList7;
        this.f12838h = arrayList8;
        this.f12839i = arrayList9;
        this.f12840j = arrayList;
    }

    /* renamed from: J */
    public void mo5728x(@mr2 C2289a aVar, int i) {
        aVar.f12842a.setText(this.f12841k.get(i).getCategoryTitle());
        this.f12830a = new iz0(this.f12829a, this.f12841k.get(i).getFaQsModels());
        aVar.f12843b.setLayoutManager(new LinearLayoutManager(this.f12829a));
        aVar.f12843b.setAdapter(this.f12830a);
    }

    @mr2
    /* renamed from: K */
    public C2289a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C2289a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.faq_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f12841k.size();
    }
}
