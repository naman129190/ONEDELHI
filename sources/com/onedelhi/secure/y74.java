package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskRequest;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import com.delhitransport.onedelhi.viewmodels.FreshDeskViewModel;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.List;

public class y74 extends RecyclerView.C0805h<C3980c> {

    /* renamed from: a */
    public final Context f22909a;

    /* renamed from: a */
    public final FreshDeskViewModel f22910a = new FreshDeskViewModel();

    /* renamed from: a */
    public final List<FreshDeskTicketResponse> f22911a;

    /* renamed from: com.onedelhi.secure.y74$a */
    public class C3978a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ Context f22912a;

        /* renamed from: a */
        public final /* synthetic */ ImageView f22913a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f22915a;

        /* renamed from: b */
        public final /* synthetic */ long f22916b;

        public C3978a(ArrayList arrayList, ImageView imageView, Context context, long j) {
            this.f22915a = arrayList;
            this.f22913a = imageView;
            this.f22912a = context;
            this.f22916b = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f22915a.remove(pj0.m61166a(-85812458919751L));
            this.f22915a.add(pj0.m61166a(-85889768331079L));
            this.f22913a.setImageTintList(ColorStateList.valueOf(r70.m26353f(this.f22912a, C1410R.color.ev_green)));
            y74.this.mo27242T(this.f22912a, this.f22916b, this.f22915a, this.f22913a);
        }
    }

    /* renamed from: com.onedelhi.secure.y74$b */
    public class C3979b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ Context f22917a;

        /* renamed from: a */
        public final /* synthetic */ ImageView f22918a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f22920a;

        /* renamed from: b */
        public final /* synthetic */ long f22921b;

        public C3979b(ArrayList arrayList, ImageView imageView, Context context, long j) {
            this.f22920a = arrayList;
            this.f22918a = imageView;
            this.f22917a = context;
            this.f22921b = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f22920a.remove(pj0.m61166a(-85967077742407L));
            this.f22920a.add(pj0.m61166a(-86044387153735L));
            this.f22918a.setImageTintList(ColorStateList.valueOf(r70.m26353f(this.f22917a, C1410R.color.one_delhi_red)));
            y74.this.mo27242T(this.f22917a, this.f22921b, this.f22920a, this.f22918a);
        }
    }

    /* renamed from: com.onedelhi.secure.y74$c */
    public static class C3980c extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public ImageView f22922a;

        /* renamed from: a */
        public RelativeLayout f22923a;

        /* renamed from: a */
        public TextView f22924a;

        /* renamed from: b */
        public ImageView f22925b;

        /* renamed from: b */
        public TextView f22926b;

        /* renamed from: c */
        public TextView f22927c;

        /* renamed from: d */
        public TextView f22928d;

        public C3980c(@mr2 View view) {
            super(view);
            this.f22923a = (RelativeLayout) view.findViewById(C1410R.C1412id.rv_card);
            this.f22924a = (TextView) view.findViewById(C1410R.C1412id.tv_id);
            this.f22926b = (TextView) view.findViewById(C1410R.C1412id.tv_status);
            this.f22927c = (TextView) view.findViewById(C1410R.C1412id.tv_subject);
            this.f22928d = (TextView) view.findViewById(C1410R.C1412id.tv_date);
            this.f22922a = (ImageView) view.findViewById(C1410R.C1412id.iv_bullet);
            this.f22925b = (ImageView) view.findViewById(C1410R.C1412id.iv_feedback);
        }
    }

    public y74(List<FreshDeskTicketResponse> list, Context context) {
        this.f22911a = list;
        this.f22909a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m31988O(FreshDeskTicketResponse freshDeskTicketResponse, C3980c cVar, View view) {
        mo27239N(this.f22909a, freshDeskTicketResponse.getId().longValue(), freshDeskTicketResponse.getTags(), cVar.f22925b);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m31989P(View view) {
        Toast.makeText(this.f22909a, pj0.m61166a(-86937740351303L), 0).show();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m31990Q(Context context, ImageView imageView, FreshDeskTicketResponse freshDeskTicketResponse) {
        if (freshDeskTicketResponse != null) {
            Toast.makeText(context, pj0.m61166a(-86774531594055L), 0).show();
            return;
        }
        Toast.makeText(context, pj0.m61166a(-86851841005383L), 0).show();
        imageView.setImageTintList(ColorStateList.valueOf(r70.m26353f(context, C1410R.color.grey)));
    }

    /* renamed from: N */
    public final void mo27239N(Context context, long j, ArrayList<String> arrayList, ImageView imageView) {
        C0189c.C0190a aVar = new C0189c.C0190a(context);
        aVar.mo936K(pj0.m61166a(-86349329831751L));
        aVar.mo954n(pj0.m61166a(-86469588916039L));
        ArrayList<String> arrayList2 = arrayList;
        ImageView imageView2 = imageView;
        Context context2 = context;
        long j2 = j;
        aVar.mo928C(pj0.m61166a(-86744466822983L), new C3978a(arrayList2, imageView2, context2, j2));
        aVar.mo959s(pj0.m61166a(-86761646692167L), new C3979b(arrayList2, imageView2, context2, j2));
        aVar.mo940O();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: R */
    public void mo5728x(@mr2 C3980c cVar, int i) {
        Context context;
        ImageView imageView;
        int i2;
        ImageView imageView2;
        Context context2;
        int i3;
        FreshDeskTicketResponse freshDeskTicketResponse = this.f22911a.get(i);
        Long id = freshDeskTicketResponse.getId();
        String subject = freshDeskTicketResponse.getSubject();
        String str = freshDeskTicketResponse.getCreated_at().split(pj0.m61166a(-86121696565063L))[0];
        Integer status = freshDeskTicketResponse.getStatus();
        TextView textView = cVar.f22924a;
        textView.setText(pj0.m61166a(-86130286499655L) + id);
        cVar.f22927c.setText(subject);
        cVar.f22928d.setText(str);
        freshDeskTicketResponse.getStatus().intValue();
        if (freshDeskTicketResponse.getStatus().intValue() == 2 || freshDeskTicketResponse.getStatus().intValue() == 3) {
            cVar.f22925b.setVisibility(8);
            cVar.f22923a.setOnClickListener(new v74(this));
        } else {
            cVar.f22925b.setVisibility(0);
            if (freshDeskTicketResponse.getTags().contains(pj0.m61166a(-86138876434247L))) {
                imageView2 = cVar.f22925b;
                context2 = this.f22909a;
                i3 = C1410R.color.ev_green;
            } else if (freshDeskTicketResponse.getTags().contains(pj0.m61166a(-86216185845575L))) {
                imageView2 = cVar.f22925b;
                context2 = this.f22909a;
                i3 = C1410R.color.one_delhi_red;
            } else {
                imageView2 = cVar.f22925b;
                context2 = this.f22909a;
                i3 = C1410R.color.grey;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(r70.m26353f(context2, i3)));
            cVar.f22923a.setOnClickListener(new w74(this, freshDeskTicketResponse, cVar));
        }
        int intValue = status.intValue();
        if (intValue == 2 || intValue == 3) {
            cVar.f22926b.setText(pj0.m61166a(-86293495256903L));
            imageView = cVar.f22922a;
            context = this.f22909a;
            i2 = C1410R.color.red_ticket_bg;
        } else if (intValue == 4 || intValue == 5) {
            cVar.f22926b.setText(pj0.m61166a(-86314970093383L));
            imageView = cVar.f22922a;
            context = this.f22909a;
            i2 = C1410R.color.status_resolved_green;
        } else {
            cVar.f22926b.setText(pj0.m61166a(-86345034864455L));
            return;
        }
        imageView.setColorFilter(r70.m26353f(context, i2), PorterDuff.Mode.SRC_IN);
    }

    @mr2
    /* renamed from: S */
    public C3980c mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C3980c(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.support_ticket_item, viewGroup, false));
    }

    /* renamed from: T */
    public final void mo27242T(Context context, long j, ArrayList<String> arrayList, ImageView imageView) {
        FreshDeskRequest freshDeskRequest = new FreshDeskRequest();
        freshDeskRequest.setTags(arrayList);
        this.f22910a.updateFreshdeskTicket(j, freshDeskRequest).mo4926j((a32) context, new x74(context, imageView));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f22911a.size();
    }
}
