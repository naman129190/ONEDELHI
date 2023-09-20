package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.live.MetroTimeTableItem;
import com.delhitransport.onedelhi.live.MetroTimeTableResponse;
import com.delhitransport.onedelhi.viewmodels.DataViewModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.bj2;
import com.onedelhi.secure.cj2;
import com.onedelhi.secure.pj0;
import java.util.ArrayList;

@SuppressLint({"MissingPermission"})
public class MetroTimingsActivity extends BaseActivity {

    /* renamed from: a */
    public ImageButton f6595a;

    /* renamed from: a */
    public RecyclerView f6596a;

    /* renamed from: a */
    public bj2 f6597a;

    /* renamed from: a */
    public ArrayList<MetroTimeTableItem> f6598a = new ArrayList<>();

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m8092g1(MetroTimeTableResponse metroTimeTableResponse) {
        if (metroTimeTableResponse != null) {
            this.f6598a.clear();
            this.f6598a.addAll(metroTimeTableResponse.getMetroTimeTableItems());
            this.f6597a.mo5717m();
            return;
        }
        Toast.makeText(this, pj0.m61166a(-46169910777671L), 0).show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_metro_timings);
        this.f6595a = (ImageButton) findViewById(C1410R.C1412id.ib_back);
        this.f6596a = (RecyclerView) findViewById(C1410R.C1412id.timetable_list);
        this.f6597a = new bj2(this.f6598a, this);
        this.f6596a.setLayoutManager(new LinearLayoutManager(this));
        this.f6596a.setAdapter(this.f6597a);
        ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getTimetableDMRC().mo4926j(this, new cj2(this));
    }
}
