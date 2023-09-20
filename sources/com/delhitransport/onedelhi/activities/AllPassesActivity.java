package com.delhitransport.onedelhi.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.pass.AllPasses;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C3763v4;
import com.onedelhi.secure.C6836t4;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.pj0;
import java.util.ArrayList;
import java.util.List;

public class AllPassesActivity extends BaseActivity {

    /* renamed from: a */
    public AlertDialog f6108a;

    /* renamed from: a */
    public RelativeLayout f6109a;

    /* renamed from: a */
    public TextView f6110a;

    /* renamed from: a */
    public C3763v4 f6111a;

    /* renamed from: a */
    public List<DailyPass> f6112a = new ArrayList();

    /* renamed from: com.delhitransport.onedelhi.activities.AllPassesActivity$a */
    public class C1202a implements bu2<AllPasses> {
        public C1202a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3946b(com.delhitransport.onedelhi.pass.AllPasses r9) {
            /*
                r8 = this;
                r0 = 2131952022(0x7f130196, float:1.9540475E38)
                r1 = 8
                r2 = 2131362512(0x7f0a02d0, float:1.8344807E38)
                r3 = 2131362781(0x7f0a03dd, float:1.8345352E38)
                r4 = 0
                if (r9 == 0) goto L_0x00ec
                java.lang.String r5 = r9.getMessage()
                r6 = -3307312967(0xffffffff3ade68b9, double:NaN)
                java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r5 = r5.equalsIgnoreCase(r6)
                if (r5 == 0) goto L_0x00ab
                com.delhitransport.onedelhi.activities.AllPassesActivity r5 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                java.util.List r5 = r5.f6112a
                r5.clear()
                com.delhitransport.onedelhi.activities.AllPassesActivity r5 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                java.util.List r5 = r5.f6112a
                java.util.List r6 = r9.getPasses()
                r5.addAll(r6)
                com.delhitransport.onedelhi.activities.AllPassesActivity r5 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                java.util.List r5 = r5.f6112a
                java.util.Collections.reverse(r5)
                com.delhitransport.onedelhi.activities.AllPassesActivity r5 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                com.onedelhi.secure.v4 r5 = r5.f6111a
                r5.mo5717m()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.delhitransport.onedelhi.activities.AllPassesActivity r6 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r0 = r6.getString(r0)
                r5.append(r0)
                java.util.List r0 = r9.getPasses()
                int r0 = r0.size()
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                com.delhitransport.onedelhi.activities.AllPassesActivity r5 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.TextView r5 = r5.f6110a
                r5.setText(r0)
                java.util.List r9 = r9.getPasses()
                int r9 = r9.size()
                if (r9 != 0) goto L_0x0154
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.TextView r9 = r9.f6110a
                r9.setText(r0)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r3)
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r2)
                r9.setVisibility(r1)
                goto L_0x013a
            L_0x00ab:
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r3)
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r2)
                r9.setVisibility(r1)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.TextView r9 = r9.f6110a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.delhitransport.onedelhi.activities.AllPassesActivity r6 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r0 = r6.getString(r0)
                r5.append(r0)
                r6 = -37667051335(0xfffffff73ade68b9, double:NaN)
                goto L_0x012c
            L_0x00ec:
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r3)
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r2)
                r9.setVisibility(r1)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.TextView r9 = r9.f6110a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.delhitransport.onedelhi.activities.AllPassesActivity r6 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r0 = r6.getString(r0)
                r5.append(r0)
                r6 = -46256985927(0xfffffff53ade68b9, double:NaN)
            L_0x012c:
                java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                r9.setText(r0)
            L_0x013a:
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r3)
                r9.setVisibility(r4)
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.widget.RelativeLayout r9 = r9.f6109a
                android.view.View r9 = r9.findViewById(r2)
                r9.setVisibility(r1)
            L_0x0154:
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.app.AlertDialog r9 = r9.f6108a
                if (r9 == 0) goto L_0x0165
                com.delhitransport.onedelhi.activities.AllPassesActivity r9 = com.delhitransport.onedelhi.activities.AllPassesActivity.this
                android.app.AlertDialog r9 = r9.f6108a
                r9.dismiss()
            L_0x0165:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.AllPassesActivity.C1202a.mo3946b(com.delhitransport.onedelhi.pass.AllPasses):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m7645l1(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_all_passes);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(pj0.m61166a(-54846920519L), pj0.m61166a(-97796593479L)) : pj0.m61166a(-102091560775L);
        RecyclerView recyclerView = (RecyclerView) findViewById(C1410R.C1412id.passes_list);
        this.f6110a = (TextView) findViewById(C1410R.C1412id.tv_passCount);
        this.f6109a = (RelativeLayout) findViewById(C1410R.C1412id.card_no_pass);
        ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-106386528071L), getResources().getString(C1410R.string.getting_previous_pass), true);
        this.f6108a = show;
        show.setCancelable(false);
        this.f6108a.show();
        this.f6111a = new C3763v4(this.f6112a, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f6111a);
        ((TicketModel) new C0709m(this).mo5027a(TicketModel.class)).getuserpasses(string).mo4926j(this, new C1202a());
        ((ImageButton) findViewById(C1410R.C1412id.ib_back)).setOnClickListener(new C6836t4(this));
    }
}
