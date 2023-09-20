package com.onedelhi.secure;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.FeedbackActivity;
import com.delhitransport.onedelhi.models.faq.CategoryModel;
import com.delhitransport.onedelhi.models.faq.FAQs;
import com.delhitransport.onedelhi.models.faq.FaQsModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.t61;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public class b74 extends Fragment {

    /* renamed from: a */
    public ProgressDialog f9712a;

    /* renamed from: a */
    public Context f9713a;

    /* renamed from: a */
    public CountDownTimer f9714a;

    /* renamed from: a */
    public TextView f9715a;

    /* renamed from: a */
    public RecyclerView f9716a;

    /* renamed from: a */
    public gz0 f9717a;

    /* renamed from: a */
    public n61 f9718a;

    /* renamed from: a */
    public ArrayList<String> f9719a;

    /* renamed from: a */
    public JSONArray f9720a;

    /* renamed from: com.onedelhi.secure.b74$a */
    public class C1763a implements vu2 {
        public C1763a() {
        }

        /* renamed from: c */
        public void mo7919c(@mr2 Exception exc) {
            b74.this.f9715a.setVisibility(0);
            b74.this.mo13512D();
        }
    }

    /* renamed from: com.onedelhi.secure.b74$b */
    public class C1764b extends CountDownTimer {

        /* renamed from: a */
        public int f9722a = 0;

        public C1764b(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (b74.this.mo13513E()) {
                if (b74.this.f9712a != null) {
                    b74.this.f9712a.dismiss();
                }
                Toast.makeText(b74.this.getActivity(), b74.this.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
        }

        public void onTick(long j) {
            int i = this.f9722a + 1;
            this.f9722a = i;
            if (i == 10) {
                b74.this.f9712a.setMessage(pj0.m61166a(-115658186659655L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m11645G(Boolean bool) {
        ArrayList arrayList = new ArrayList();
        try {
            this.f9720a = new JSONArray(this.f9718a.mo40983x(pj0.m61166a(-116298136786759L)));
            for (int i = 0; i < this.f9720a.length(); i++) {
                JSONObject jSONObject = new JSONObject(this.f9720a.getString(i));
                CategoryModel categoryModel = new CategoryModel(jSONObject.getString(pj0.m61166a(-116362561296199L)), jSONObject.getString(pj0.m61166a(-116401216001863L)));
                JSONArray jSONArray = new JSONArray(this.f9718a.mo40983x(categoryModel.getKey()));
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add(new FAQs(jSONObject2.getString(pj0.m61166a(-116418395871047L)), jSONObject2.getString(pj0.m61166a(-116444165674823L))));
                }
                arrayList.add(new FaQsModel(categoryModel.getCategory(), arrayList2));
            }
            this.f9717a = new gz0(getContext(), arrayList);
            this.f9716a.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f9716a.setAdapter(this.f9717a);
            this.f9715a.setVisibility(8);
            mo13512D();
        } catch (Exception e) {
            mo13512D();
            this.f9715a.setVisibility(0);
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m11646I(View view) {
        startActivity(new Intent(this.f9713a, FeedbackActivity.class));
    }

    /* renamed from: A */
    public final void mo13511A() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f9719a = arrayList;
        arrayList.add(pj0.m61166a(-115782740711239L));
        this.f9719a.add(pj0.m61166a(-115829985351495L));
        this.f9719a.add(pj0.m61166a(-115894409860935L));
        this.f9719a.add(pj0.m61166a(-115967424304967L));
        this.f9719a.add(pj0.m61166a(-116036143781703L));
    }

    /* renamed from: D */
    public void mo13512D() {
        CountDownTimer countDownTimer = this.f9714a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f9712a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: E */
    public final boolean mo13513E() {
        try {
            if (!isAdded()) {
                return false;
            }
            requireActivity();
            return true;
        } catch (IllegalStateException unused) {
            c41.m40702d().mo32241g(new Exception(pj0.m61166a(-116104863258439L)));
            c41.m40702d().mo32242h();
            return false;
        }
    }

    /* renamed from: L */
    public void mo13514L() {
        C1764b bVar = new C1764b(rf4.f19824c, 1000);
        this.f9714a = bVar;
        bVar.start();
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f9713a = context.getApplicationContext();
    }

    @ts2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_faq_support, viewGroup, false);
        this.f9716a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_categorised_faq);
        TextView textView = (TextView) inflate.findViewById(C1410R.C1412id.tv_err);
        this.f9715a = textView;
        textView.setVisibility(8);
        this.f9718a = n61.m57935t();
        mo13511A();
        int nextInt = new Random().nextInt(this.f9719a.size());
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.f9712a = progressDialog;
        progressDialog.setMessage(this.f9719a.get(nextInt));
        this.f9712a.setCancelable(false);
        this.f9712a.show();
        mo13514L();
        this.f9718a.mo40964K(new t61.C6839b().mo44931g(0).mo44927c());
        this.f9718a.mo40976o().mo17579k(new a74(this));
        this.f9718a.mo40976o().mo17576h(new C1763a());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_create_ticket)).setOnClickListener(new z64(this));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }
}
