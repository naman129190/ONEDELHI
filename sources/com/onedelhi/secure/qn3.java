package com.onedelhi.secure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.data.Stop;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;

public class qn3 extends RecyclerView.C0805h<C3311a> {

    /* renamed from: a */
    public View.OnClickListener f19259a;

    /* renamed from: a */
    public final ArrayList<Stop> f19260a;

    /* renamed from: com.onedelhi.secure.qn3$a */
    public class C3311a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final ImageView f19261a;

        /* renamed from: a */
        public final TextView f19262a;

        /* renamed from: b */
        public final ImageView f19264b;

        /* renamed from: c */
        public final ImageView f19265c;

        public C3311a(View view) {
            super(view);
            view.setTag(this);
            this.f19262a = (TextView) view.findViewById(C1410R.C1412id.tv_stop);
            this.f19261a = (ImageView) view.findViewById(C1410R.C1412id.up_line);
            this.f19264b = (ImageView) view.findViewById(C1410R.C1412id.down_line);
            this.f19265c = (ImageView) view.findViewById(C1410R.C1412id.iv_location);
            view.setOnClickListener(qn3.this.f19259a);
        }
    }

    public qn3(ArrayList<Stop> arrayList) {
        this.f19260a = arrayList;
    }

    /* renamed from: K */
    public void mo5728x(@mr2 C3311a aVar, int i) {
        ImageView T;
        int i2;
        if (mo5711g() > 0) {
            if (i == 0) {
                T = aVar.f19261a;
                i2 = 4;
            } else if (i == mo5711g() - 1) {
                T = aVar.f19264b;
                i2 = 8;
            } else {
                aVar.f19261a.setVisibility(0);
                aVar.f19264b.setVisibility(0);
                aVar.f19265c.setImageResource(C1410R.C1411drawable.red_hollow_dot);
                aVar.f19262a.setText(this.f19260a.get(i).getName());
            }
            T.setVisibility(i2);
            aVar.f19265c.setImageResource(C1410R.C1411drawable.red_filler_dot);
            aVar.f19262a.setText(this.f19260a.get(i).getName());
        }
    }

    @mr2
    /* renamed from: L */
    public C3311a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3311a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.route_detail_item, viewGroup, false));
    }

    /* renamed from: M */
    public void mo23272M(View.OnClickListener onClickListener) {
        this.f19259a = onClickListener;
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f19260a.size();
    }
}
