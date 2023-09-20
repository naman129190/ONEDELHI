package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.others.Notifications;
import com.google.android.gms.common.C1410R;
import java.util.List;

public class as2 extends RecyclerView.C0805h<C1729a> {

    /* renamed from: a */
    public final Context f9511a;

    /* renamed from: a */
    public final List<Notifications> f9512a;

    /* renamed from: com.onedelhi.secure.as2$a */
    public static class C1729a extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public TextView f9513a;

        /* renamed from: b */
        public TextView f9514b;

        /* renamed from: c */
        public TextView f9515c;

        public C1729a(View view) {
            super(view);
            this.f9513a = (TextView) view.findViewById(C1410R.C1412id.tv_notification);
            this.f9514b = (TextView) view.findViewById(C1410R.C1412id.tv_url);
            this.f9515c = (TextView) view.findViewById(C1410R.C1412id.tv_time);
        }
    }

    public as2(Context context, List<Notifications> list) {
        this.f9512a = list;
        this.f9511a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m11399K(String str, View view) {
        Intent intent = new Intent(pj0.m61166a(-84743012063047L));
        intent.setData(Uri.parse(str));
        this.f9511a.startActivity(intent);
    }

    /* renamed from: L */
    public void mo5728x(@mr2 C1729a aVar, int i) {
        String str;
        Notifications notifications = this.f9512a.get(i);
        aVar.f9513a.setText(notifications.getNotification());
        try {
            str = notifications.getUrl();
        } catch (Exception unused) {
            str = null;
        }
        if (str == null || str.equalsIgnoreCase(pj0.m61166a(-84738717095751L))) {
            aVar.f9514b.setVisibility(8);
        } else {
            aVar.f9514b.setVisibility(0);
            aVar.f9514b.setText(str);
            aVar.f9514b.setPaintFlags(8 | aVar.f9514b.getPaintFlags());
        }
        aVar.f9515c.setText(notifications.getTime());
        aVar.f9514b.setOnClickListener(new zr2(this, str));
    }

    @mr2
    /* renamed from: M */
    public C1729a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1729a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.notification_item, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f9512a.size();
    }
}
