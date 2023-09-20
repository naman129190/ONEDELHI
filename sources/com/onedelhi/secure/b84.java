package com.onedelhi.secure;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.delhitransport.onedelhi.viewmodels.FreshDeskViewModel;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class b84 extends Fragment {

    /* renamed from: a */
    public ProgressDialog f9740a;

    /* renamed from: a */
    public Context f9741a;

    /* renamed from: a */
    public SharedPreferences f9742a;

    /* renamed from: a */
    public CountDownTimer f9743a;

    /* renamed from: a */
    public TextView f9744a;

    /* renamed from: a */
    public RecyclerView f9745a;

    /* renamed from: a */
    public y74 f9746a;

    /* renamed from: a */
    public ArrayList<String> f9747a;

    /* renamed from: b */
    public String f9748b;

    /* renamed from: com.onedelhi.secure.b84$a */
    public class C1766a extends CountDownTimer {

        /* renamed from: a */
        public int f9749a = 0;

        public C1766a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (b84.this.f9740a != null) {
                b84.this.f9740a.dismiss();
            }
            Toast.makeText(b84.this.getActivity(), b84.this.getResources().getString(C1410R.string.some_error_occurred), 0).show();
        }

        public void onTick(long j) {
            int i = this.f9749a + 1;
            this.f9749a = i;
            if (i == 10) {
                b84.this.f9740a.setMessage(pj0.m61166a(-116517180118855L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m11682D(List list) {
        mo13535y();
        if (list == null || list.size() == 0) {
            this.f9744a.setVisibility(0);
            this.f9745a.setVisibility(8);
            return;
        }
        this.f9746a = new y74(list, getActivity());
        this.f9745a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f9745a.setAdapter(this.f9746a);
        this.f9744a.setVisibility(8);
        this.f9745a.setVisibility(0);
        mo13535y();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m11683E(View view) {
        startActivity(new Intent(this.f9741a, FeedbackActivity.class));
    }

    /* renamed from: A */
    public final void mo13532A(String str) {
        mo13533G();
        int nextInt = new Random().nextInt(this.f9747a.size());
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.f9740a = progressDialog;
        progressDialog.setMessage(this.f9747a.get(nextInt));
        this.f9740a.setCancelable(false);
        this.f9740a.show();
        new FreshDeskViewModel().getFreshdeskTickets(str).mo4926j(getViewLifecycleOwner(), new a84(this));
    }

    /* renamed from: G */
    public void mo13533G() {
        C1766a aVar = new C1766a(rf4.f19824c, 1000);
        this.f9743a = aVar;
        aVar.start();
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f9741a = context.getApplicationContext();
    }

    @ts2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_support_tickets, viewGroup, false);
        SharedPreferences sharedPreferences = this.f9741a.getSharedPreferences(pj0.m61166a(-116641734170439L), 0);
        this.f9742a = sharedPreferences;
        this.f9748b = sharedPreferences.getString(pj0.m61166a(-116727633516359L), pj0.m61166a(-116753403320135L));
        mo13534w();
        Button button = (Button) inflate.findViewById(C1410R.C1412id.btn_create_ticket);
        this.f9744a = (TextView) inflate.findViewById(C1410R.C1412id.tv_no_tickets);
        this.f9745a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_tickets);
        if (this.f9748b.isEmpty()) {
            this.f9744a.setText(pj0.m61166a(-116757698287431L));
        } else {
            this.f9744a.setText(pj0.m61166a(-117062640965447L));
            mo13532A(this.f9748b);
        }
        button.setOnClickListener(new z74(this));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        if (!this.f9748b.equals(this.f9742a.getString(pj0.m61166a(-117148540311367L), pj0.m61166a(-117174310115143L)))) {
            String string = this.f9742a.getString(pj0.m61166a(-117178605082439L), pj0.m61166a(-117204374886215L));
            this.f9748b = string;
            mo13532A(string);
        }
    }

    /* renamed from: w */
    public final void mo13534w() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f9747a = arrayList;
        arrayList.add(pj0.m61166a(-117208669853511L));
        this.f9747a.add(pj0.m61166a(-117255914493767L));
        this.f9747a.add(pj0.m61166a(-117320339003207L));
        this.f9747a.add(pj0.m61166a(-117393353447239L));
        this.f9747a.add(pj0.m61166a(-117474957825863L));
    }

    /* renamed from: y */
    public void mo13535y() {
        CountDownTimer countDownTimer = this.f9743a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f9740a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
