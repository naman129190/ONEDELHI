package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.payment.UPIOptions;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;

public class p03 extends RecyclerView.C0805h<C3108b> {

    /* renamed from: a */
    public final Context f18263a;

    /* renamed from: a */
    public final C3107a f18264a;

    /* renamed from: a */
    public ArrayList<UPIOptions> f18265a;

    /* renamed from: com.onedelhi.secure.p03$a */
    public interface C3107a {
        /* renamed from: a */
        void mo22189a(UPIOptions uPIOptions);
    }

    /* renamed from: com.onedelhi.secure.p03$b */
    public static class C3108b extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f18266a;

        /* renamed from: a */
        public TextView f18267a;

        public C3108b(@mr2 View view) {
            super(view);
            this.f18266a = (ImageView) view.findViewById(C1410R.C1412id.iv_app_logo);
            this.f18267a = (TextView) view.findViewById(C1410R.C1412id.tv_app_name);
        }
    }

    public p03(ArrayList<UPIOptions> arrayList, Context context, C3107a aVar) {
        this.f18265a = arrayList;
        this.f18263a = context;
        this.f18264a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m24288K(UPIOptions uPIOptions, View view) {
        this.f18264a.mo22189a(uPIOptions);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C3108b bVar, int i) {
        UPIOptions uPIOptions = this.f18265a.get(i);
        bVar.f18267a.setText(uPIOptions.getApp_name());
        bVar.f18266a.setImageDrawable(uPIOptions.getApp_logo());
        bVar.f4609a.setOnClickListener(new o03(this, uPIOptions));
    }

    @mr2
    /* renamed from: M */
    public C3108b mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3108b(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.payment_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f18265a.size();
    }
}
