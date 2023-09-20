package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.viewmodels.DataViewModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C2456iq;
import com.onedelhi.secure.C3918xe;
import com.onedelhi.secure.kv2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.w34;
import com.onedelhi.secure.x34;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"MissingPermission"})
public class StopInfoActivity extends BaseActivity implements kv2 {

    /* renamed from: a */
    public float f6907a = 1.0E7f;

    /* renamed from: a */
    public Location f6908a;

    /* renamed from: a */
    public WebView f6909a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f6910a = new C1294a();

    /* renamed from: a */
    public AutoCompleteTextView f6911a;

    /* renamed from: a */
    public TextView f6912a;

    /* renamed from: a */
    public ArrayList<AllStops> f6913a = new ArrayList<>();

    /* renamed from: e */
    public String f6914e;

    /* renamed from: f */
    public String f6915f;

    /* renamed from: g */
    public String f6916g;

    /* renamed from: o */
    public int f6917o = -1;

    /* renamed from: p */
    public int f6918p;

    /* renamed from: q */
    public int f6919q = -1;

    /* renamed from: r */
    public int f6920r;

    /* renamed from: s */
    public int f6921s;

    /* renamed from: com.delhitransport.onedelhi.activities.StopInfoActivity$a */
    public class C1294a implements AdapterView.OnItemClickListener {
        public C1294a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            StopInfoActivity.m8381p1(StopInfoActivity.this);
            try {
                Pair pair = (Pair) adapterView.getItemAtPosition(i);
                StopInfoActivity.this.f6911a.setText(((String) pair.second).split(pj0.m61166a(-73434363172679L))[0]);
                int unused = StopInfoActivity.this.f6919q = ((Integer) pair.first).intValue();
                StopInfoActivity stopInfoActivity = StopInfoActivity.this;
                stopInfoActivity.mo7859s1(stopInfoActivity.f6919q);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p1 */
    public static void m8381p1(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(pj0.m61166a(-74310536501063L));
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m8382q1(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f6913a = allStopsResponse.getAll_stops();
            C2456iq.m17793l(this, this);
            mo7856m1(this.f6913a);
            Iterator<AllStops> it = this.f6913a.iterator();
            while (it.hasNext()) {
                AllStops next = it.next();
                Location location = new Location(pj0.m61166a(-74370666043207L));
                location.setLatitude(next.getLat().doubleValue());
                location.setLongitude(next.getLng().doubleValue());
                float o1 = mo7858o1(location, this.f6908a);
                if (o1 < this.f6907a) {
                    this.f6907a = o1;
                    this.f6917o = next.getId();
                }
            }
            int i = this.f6919q;
            if (i == -1) {
                i = this.f6917o;
            }
            mo7859s1(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m8383r1(View view) {
        onBackPressed();
    }

    /* renamed from: J */
    public void mo7854J(boolean z, List<AllStops> list) {
        if (z) {
            ArrayList<AllStops> arrayList = (ArrayList) list;
            this.f6913a = arrayList;
            mo7856m1(arrayList);
            Iterator<AllStops> it = this.f6913a.iterator();
            while (it.hasNext()) {
                AllStops next = it.next();
                Location location = new Location(pj0.m61166a(-74366371075911L));
                location.setLatitude(next.getLat().doubleValue());
                location.setLongitude(next.getLng().doubleValue());
                float o1 = mo7858o1(location, this.f6908a);
                if (o1 < this.f6907a) {
                    this.f6907a = o1;
                    this.f6917o = next.getId();
                }
            }
            int i = this.f6919q;
            if (i == -1) {
                i = this.f6917o;
            }
            mo7859s1(i);
        }
    }

    /* renamed from: m */
    public void mo7855m(boolean z) {
    }

    /* renamed from: m1 */
    public final void mo7856m1(List<AllStops> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Integer valueOf = Integer.valueOf(list.get(i).getId());
                hashMap.put(valueOf, list.get(i).getName() + ';' + list.get(i).getNext_stop());
            }
            C3918xe xeVar = new C3918xe(this, C1410R.layout.dropdown_pis, hashMap);
            this.f6911a.setThreshold(1);
            this.f6911a.setAdapter(xeVar);
            this.f6911a.setOnItemClickListener(this.f6910a);
            return;
        }
        this.f6911a.setEnabled(false);
        Toast.makeText(this, getResources().getString(C1410R.string.fetch_problem), 1).show();
    }

    /* renamed from: n1 */
    public final void mo7857n1() {
        if (this.f6920r != this.f6921s) {
            ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getAllStopsLiveDataDIMTS(new GenericRequest(this.f6915f, this.f6916g), true, this, 0).mo4926j(this, new x34(this));
            return;
        }
        C2456iq.m17794m(this, this);
    }

    /* renamed from: o1 */
    public final float mo7858o1(Location location, Location location2) {
        return location.distanceTo(location2);
    }

    public void onCreate(Bundle bundle) {
        Location location;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_stop_info);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-73442953107271L), 0);
        this.f6915f = sharedPreferences.getString(pj0.m61166a(-73528852453191L), pj0.m61166a(-73571802126151L));
        this.f6916g = sharedPreferences.getString(pj0.m61166a(-73576097093447L), pj0.m61166a(-73623341733703L));
        this.f6920r = sharedPreferences.getInt(pj0.m61166a(-73627636700999L), 0);
        this.f6921s = sharedPreferences.getInt(pj0.m61166a(-73683471275847L), 0);
        Bundle extras = getIntent().getExtras();
        this.f6914e = sharedPreferences.getString(pj0.m61166a(-73769370621767L), pj0.m61166a(-73842385065799L));
        if (extras != null) {
            this.f6919q = extras.getInt(pj0.m61166a(-73855269967687L), -1);
            location = (Location) extras.get(pj0.m61166a(-73889629706055L));
        } else {
            this.f6919q = -1;
            location = new Location(pj0.m61166a(-73906809575239L));
        }
        this.f6908a = location;
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6909a = (WebView) findViewById(C1410R.C1412id.webViewPIS);
        this.f6911a = (AutoCompleteTextView) findViewById(C1410R.C1412id.edit_stop);
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_loading);
        this.f6912a = textView;
        if (this.f6919q == -1) {
            this.f6911a.requestFocus();
        } else {
            textView.setText(pj0.m61166a(-73911104542535L));
        }
        mo7857n1();
        imageView.setOnClickListener(new w34(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: s1 */
    public final void mo7859s1(int i) {
        String str = pj0.m61166a(-74005593823047L) + i + pj0.m61166a(-74284766697287L) + this.f6914e;
        try {
            this.f6909a.setWebViewClient(new WebViewClient());
            if (this.f6918p < 0) {
                this.f6909a.clearCache(true);
            }
            WebSettings settings = this.f6909a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            this.f6909a.loadUrl(str);
            this.f6912a.setVisibility(8);
        } catch (Exception e) {
            Toast.makeText(this, getResources().getString(C1410R.string.fetch_problem), 0).show();
            System.out.println(e.toString());
        }
    }

    /* renamed from: u */
    public void mo7860u(boolean z) {
        if (z) {
            C2456iq.m17796o(this, this, this.f6913a);
        }
    }
}
