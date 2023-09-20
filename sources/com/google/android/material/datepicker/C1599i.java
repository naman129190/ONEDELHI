package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1577f;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.me0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.xk2;

/* renamed from: com.google.android.material.datepicker.i */
public class C1599i extends RecyclerView.C0805h<C1601b> {

    /* renamed from: a */
    public final int f8340a;
    @mr2

    /* renamed from: a */
    public final C1563a f8341a;

    /* renamed from: a */
    public final C1577f.C1589l f8342a;

    /* renamed from: a */
    public final me0<?> f8343a;

    /* renamed from: com.google.android.material.datepicker.i$a */
    public class C1600a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f8344a;

        public C1600a(MaterialCalendarGridView materialCalendarGridView) {
            this.f8344a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f8344a.getAdapter().mo12120n(i)) {
                C1599i.this.f8342a.mo12059a(this.f8344a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    public static class C1601b extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final TextView f8346a;

        /* renamed from: a */
        public final MaterialCalendarGridView f8347a;

        public C1601b(@mr2 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(fd3.C2158h.month_title);
            this.f8346a = textView;
            jt4.m18853C1(textView, true);
            this.f8347a = (MaterialCalendarGridView) linearLayout.findViewById(fd3.C2158h.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C1599i(@mr2 Context context, me0<?> me0, @mr2 C1563a aVar, C1577f.C1589l lVar) {
        xk2 n = aVar.mo11998n();
        xk2 i = aVar.mo11994i();
        xk2 m = aVar.mo11997m();
        if (n.compareTo(m) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (m.compareTo(i) <= 0) {
            this.f8340a = (C1598h.f8333n * C1577f.m10146S(context)) + (C1590g.m10177d0(context) ? C1577f.m10146S(context) : 0);
            this.f8341a = aVar;
            this.f8343a = me0;
            this.f8342a = lVar;
            mo5704G(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @mr2
    /* renamed from: K */
    public xk2 mo12121K(int i) {
        return this.f8341a.mo11998n().mo26974w(i);
    }

    @mr2
    /* renamed from: L */
    public CharSequence mo12122L(int i) {
        return mo12121K(i).mo26972u();
    }

    /* renamed from: M */
    public int mo12123M(@mr2 xk2 xk2) {
        return this.f8341a.mo11998n().mo26976x(xk2);
    }

    /* renamed from: N */
    public void mo5728x(@mr2 C1601b bVar, int i) {
        xk2 w = this.f8341a.mo11998n().mo26974w(i);
        bVar.f8346a.setText(w.mo26972u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f8347a.findViewById(fd3.C2158h.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !w.equals(materialCalendarGridView.getAdapter().f8338a)) {
            C1598h hVar = new C1598h(w, this.f8343a, this.f8341a);
            materialCalendarGridView.setNumColumns(w.f22617p);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo12119m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C1600a(materialCalendarGridView));
    }

    @mr2
    /* renamed from: O */
    public C1601b mo5730z(@mr2 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(fd3.C2161k.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C1590g.m10177d0(viewGroup.getContext())) {
            return new C1601b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f8340a));
        return new C1601b(linearLayout, true);
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f8341a.mo11996k();
    }

    /* renamed from: h */
    public long mo5712h(int i) {
        return this.f8341a.mo11998n().mo26974w(i).mo26973v();
    }
}
