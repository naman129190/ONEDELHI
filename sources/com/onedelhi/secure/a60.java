package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1173a;
import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.List;

public class a60 extends RecyclerView.C0805h<C1653a> {

    /* renamed from: a */
    public final Context f8836a;

    /* renamed from: a */
    public RecyclerView.C0803f0 f8837a;

    /* renamed from: a */
    public C1654b f8838a;

    /* renamed from: a */
    public final String f8839a;

    /* renamed from: a */
    public final List<EVConnector> f8840a;

    /* renamed from: com.onedelhi.secure.a60$a */
    public class C1653a extends RecyclerView.C0803f0 implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f8841a;

        /* renamed from: a */
        public final RelativeLayout f8842a;

        /* renamed from: a */
        public final TextView f8843a;

        public C1653a(@mr2 View view) {
            super(view);
            this.f8841a = (ImageView) view.findViewById(C1410R.C1412id.iv_connector_logo);
            this.f8842a = (RelativeLayout) view.findViewById(C1410R.C1412id.rv_connector_bg);
            this.f8843a = (TextView) view.findViewById(C1410R.C1412id.tv_connector_name);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            a60.this.f8838a.mo12740a(view, mo5681k());
        }
    }

    /* renamed from: com.onedelhi.secure.a60$b */
    public interface C1654b {
        /* renamed from: a */
        void mo12740a(View view, int i);
    }

    public a60(List<EVConnector> list, String str, C1654b bVar, Context context) {
        this.f8840a = list;
        this.f8836a = context;
        this.f8839a = str;
        this.f8838a = bVar;
        rq2.f19986h = new ArrayList<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m10817M(int i, C1653a aVar, View view) {
        long j;
        Drawable drawable;
        if (rq2.f19986h.contains(this.f8840a.get(i))) {
            rq2.f19986h.remove(this.f8840a.get(i));
            drawable = aVar.f8842a.getBackground();
            j = -83334262789959L;
        } else {
            rq2.f19986h.add(this.f8840a.get(i));
            drawable = aVar.f8842a.getBackground();
            j = -83368622528327L;
        }
        drawable.setColorFilter(Color.parseColor(pj0.m61166a(j)), PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: L */
    public RecyclerView.C0803f0 mo12736L() {
        return this.f8837a;
    }

    @SuppressLint({"ResourceAsColor"})
    /* renamed from: N */
    public void mo5728x(@mr2 C1653a aVar, int i) {
        Drawable background;
        long j;
        this.f8837a = aVar;
        if (this.f8840a.get(i).getUrl() != null && !this.f8840a.get(i).getUrl().equals(pj0.m61166a(-83149579196231L))) {
            C1173a.m7523E(this.f8836a).mo16004n(this.f8840a.get(i).getUrl()).mo25101k1(aVar.f8841a);
        }
        aVar.f8843a.setText(this.f8840a.get(i).getConnector_name());
        if (this.f8839a.equalsIgnoreCase(pj0.m61166a(-83153874163527L))) {
            if (this.f8840a.get(i).getVehicle_type().contains(pj0.m61166a(-83166759065415L))) {
                background = aVar.f8842a.getBackground();
                j = -83179643967303L;
            }
            aVar.f8842a.setOnClickListener(new z50(this, i, aVar));
        } else if (this.f8839a.equalsIgnoreCase(pj0.m61166a(-83214003705671L))) {
            if (this.f8840a.get(i).getVehicle_type().contains(pj0.m61166a(-83226888607559L))) {
                background = aVar.f8842a.getBackground();
                j = -83239773509447L;
            }
            aVar.f8842a.setOnClickListener(new z50(this, i, aVar));
        } else {
            if (this.f8839a.equalsIgnoreCase(pj0.m61166a(-83274133247815L)) && this.f8840a.get(i).getVehicle_type().contains(pj0.m61166a(-83287018149703L))) {
                background = aVar.f8842a.getBackground();
                j = -83299903051591L;
            }
            aVar.f8842a.setOnClickListener(new z50(this, i, aVar));
        }
        background.setColorFilter(Color.parseColor(pj0.m61166a(j)), PorterDuff.Mode.SRC_ATOP);
        rq2.f19986h.add(this.f8840a.get(i));
        aVar.f8842a.setOnClickListener(new z50(this, i, aVar));
    }

    @mr2
    /* renamed from: O */
    public C1653a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1653a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.connector_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f8840a.size();
    }
}
