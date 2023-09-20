package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.faq.FAQs;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class iz0 extends RecyclerView.C0805h<C2465a> {

    /* renamed from: a */
    public Context f13956a;

    /* renamed from: a */
    public ArrayList<FAQs> f13957a;

    /* renamed from: com.onedelhi.secure.iz0$a */
    public static class C2465a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f13958a;

        /* renamed from: a */
        public RelativeLayout f13959a;

        /* renamed from: a */
        public TextView f13960a;

        /* renamed from: b */
        public TextView f13961b;

        public C2465a(@mr2 View view) {
            super(view);
            this.f13960a = (TextView) view.findViewById(C1410R.C1412id.tv_title);
            this.f13961b = (TextView) view.findViewById(C1410R.C1412id.tv_description);
            this.f13958a = (ImageView) view.findViewById(C1410R.C1412id.iv_show_desc);
            this.f13959a = (RelativeLayout) view.findViewById(C1410R.C1412id.rv_faq_data);
        }
    }

    public iz0() {
    }

    public iz0(Context context, ArrayList<FAQs> arrayList) {
        this.f13956a = context;
        this.f13957a = arrayList;
    }

    /* renamed from: K */
    public static /* synthetic */ void m18048K(AtomicBoolean atomicBoolean, C2465a aVar, View view) {
        if (atomicBoolean.get()) {
            aVar.f13961b.setVisibility(8);
            aVar.f13958a.setImageResource(C1410R.C1411drawable.ic_baseline_add_circle);
            atomicBoolean.set(false);
            return;
        }
        aVar.f13961b.setVisibility(0);
        aVar.f13958a.setImageResource(C1410R.C1411drawable.ic_baseline_remove_circle_24);
        atomicBoolean.set(true);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C2465a aVar, int i) {
        aVar.f13960a.setText(this.f13957a.get(i).getTitle());
        aVar.f13961b.setText(this.f13957a.get(i).getDescription());
        aVar.f13961b.setVisibility(8);
        aVar.f13959a.setOnClickListener(new hz0(new AtomicBoolean(false), aVar));
    }

    @mr2
    /* renamed from: M */
    public C2465a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C2465a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.faq_data_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f13957a.size();
    }
}
