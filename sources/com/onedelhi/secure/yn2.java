package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.StopInfoActivity;
import com.delhitransport.onedelhi.data.AllStops;
import com.google.android.gms.common.C1410R;
import java.util.List;

public class yn2 extends RecyclerView.C0805h<C4017a> {

    /* renamed from: a */
    public final Context f23253a;

    /* renamed from: a */
    public final Location f23254a;

    /* renamed from: a */
    public final List<AllStops> f23255a;

    /* renamed from: com.onedelhi.secure.yn2$a */
    public static class C4017a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final ImageView f23256a;

        /* renamed from: a */
        public final TextView f23257a;

        /* renamed from: b */
        public final TextView f23258b;

        public C4017a(View view) {
            super(view);
            this.f23257a = (TextView) view.findViewById(C1410R.C1412id.tv_stopName);
            this.f23258b = (TextView) view.findViewById(C1410R.C1412id.tv_towards);
            this.f23256a = (ImageView) view.findViewById(C1410R.C1412id.iv_type);
        }
    }

    public yn2(List<AllStops> list, Location location, Context context) {
        this.f23255a = list;
        this.f23254a = location;
        this.f23253a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m32547K(int i, View view) {
        int id = this.f23255a.get(i).getId();
        Intent intent = new Intent(this.f23253a, StopInfoActivity.class);
        intent.putExtra(pj0.m61166a(-84687177488199L), id);
        intent.putExtra(pj0.m61166a(-84721537226567L), this.f23254a);
        this.f23253a.startActivity(intent);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C4017a aVar, int i) {
        ImageView T;
        Resources resources;
        int i2;
        aVar.f23257a.setText(this.f23255a.get(i).getName());
        aVar.f23258b.setText(this.f23253a.getResources().getString(C1410R.string.towards) + this.f23255a.get(i).getNext_stop());
        if (this.f23255a.get(i).getStop_type().equalsIgnoreCase(pj0.m61166a(-84644227815239L))) {
            T = aVar.f23256a;
            resources = this.f23253a.getResources();
            i2 = C1410R.C1411drawable.ic_bus;
        } else {
            if (this.f23255a.get(i).getStop_type().equalsIgnoreCase(pj0.m61166a(-84661407684423L))) {
                T = aVar.f23256a;
                resources = this.f23253a.getResources();
                i2 = C1410R.C1411drawable.ic_metro;
            }
            aVar.f4609a.setOnClickListener(new xn2(this, i));
        }
        T.setImageDrawable(zk3.m33204g(resources, i2, (Resources.Theme) null));
        aVar.f4609a.setOnClickListener(new xn2(this, i));
    }

    @mr2
    /* renamed from: M */
    public C4017a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C4017a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.nearby_stop_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f23255a.size();
    }
}
