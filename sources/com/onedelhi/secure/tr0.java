package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.EVSearches;
import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.delhitransport.onedelhi.p002ev.EVSearchData;
import com.delhitransport.onedelhi.p002ev.EVStationCoordinates;
import com.delhitransport.onedelhi.p002ev.EVStations;
import com.delhitransport.onedelhi.p002ev.EVdata;
import com.delhitransport.onedelhi.viewmodels.EVModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SuppressLint({"MissingPermission"})
public class tr0 extends Fragment {

    /* renamed from: a */
    public static InputMethodManager f21055a = null;

    /* renamed from: p */
    public static final int f21056p = 123;

    /* renamed from: q */
    public static final int f21057q = 13;

    /* renamed from: a */
    public ProgressDialog f21058a;

    /* renamed from: a */
    public Context f21059a;

    /* renamed from: a */
    public final Location f21060a = new Location(pj0.m61166a(-97421755520839L));

    /* renamed from: a */
    public CountDownTimer f21061a;

    /* renamed from: a */
    public AutoCompleteTextView f21062a;

    /* renamed from: a */
    public ImageButton f21063a;

    /* renamed from: a */
    public ImageView f21064a;

    /* renamed from: a */
    public ListView f21065a;

    /* renamed from: a */
    public RelativeLayout.LayoutParams f21066a;

    /* renamed from: a */
    public RelativeLayout f21067a;

    /* renamed from: a */
    public RecyclerView f21068a;

    /* renamed from: a */
    public EVStations f21069a = new EVStations();

    /* renamed from: a */
    public MapView f21070a;

    /* renamed from: a */
    public BottomSheetBehavior f21071a;

    /* renamed from: a */
    public FloatingActionButton f21072a;

    /* renamed from: a */
    public C1693af f21073a;

    /* renamed from: a */
    public jd1 f21074a;

    /* renamed from: a */
    public mz2 f21075a;

    /* renamed from: a */
    public th1 f21076a;

    /* renamed from: a */
    public final z62 f21077a = new C3654a();

    /* renamed from: a */
    public ArrayList<EVdata> f21078a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, String> f21079a = new HashMap<>();

    /* renamed from: b */
    public Location f21080b;

    /* renamed from: b */
    public ImageButton f21081b;

    /* renamed from: b */
    public ImageView f21082b;

    /* renamed from: b */
    public ListView f21083b;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f21084b;

    /* renamed from: b */
    public RelativeLayout f21085b;

    /* renamed from: b */
    public FloatingActionButton f21086b;

    /* renamed from: b */
    public ArrayList<EVdata> f21087b = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, od2> f21088b = new HashMap<>();

    /* renamed from: b */
    public boolean f21089b = false;

    /* renamed from: c */
    public RelativeLayout.LayoutParams f21090c;

    /* renamed from: c */
    public RelativeLayout f21091c;

    /* renamed from: c */
    public ArrayList<EVConnector> f21092c = new ArrayList<>();

    /* renamed from: c */
    public final HashMap<String, String> f21093c = new HashMap<>();

    /* renamed from: c */
    public boolean f21094c = false;

    /* renamed from: d */
    public RelativeLayout.LayoutParams f21095d;

    /* renamed from: d */
    public RelativeLayout f21096d;

    /* renamed from: d */
    public ArrayList<EVConnector> f21097d = new ArrayList<>();

    /* renamed from: d */
    public final HashMap<String, String> f21098d = new HashMap<>();

    /* renamed from: d */
    public boolean f21099d = false;

    /* renamed from: e */
    public RelativeLayout.LayoutParams f21100e;

    /* renamed from: e */
    public RelativeLayout f21101e;

    /* renamed from: e */
    public final HashMap<String, Integer> f21102e = new HashMap<>();

    /* renamed from: n */
    public int f21103n = 0;

    /* renamed from: o */
    public int f21104o;

    /* renamed from: com.onedelhi.secure.tr0$a */
    public class C3654a extends z62 {
        public C3654a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            tr0.this.f21076a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 13.0f));
            tr0.this.f21060a.setLatitude(M2.getLatitude());
            tr0.this.f21060a.setLongitude(M2.getLongitude());
            tr0.this.f21076a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(tr0.this.f21060a.getLatitude(), tr0.this.f21060a.getLongitude())).mo10680e(13.0f).mo10677b()));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.tr0$b */
    public class C3655b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final EVSearches f21106a = new EVSearches();

        /* renamed from: a */
        public final /* synthetic */ String f21108a;

        /* renamed from: b */
        public final /* synthetic */ String f21109b;

        public C3655b(String str, String str2) {
            this.f21108a = str;
            this.f21109b = str2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                this.f21106a.setName(this.f21108a);
                this.f21106a.setAddress(this.f21109b);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(tr0.this.f21059a).getAppDatabase().evSearchDao().insert(this.f21106a);
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
        }
    }

    /* renamed from: com.onedelhi.secure.tr0$c */
    public class C3656c extends BottomSheetBehavior.C1503f {
        public C3656c() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            CoordinatorLayout.C0459f fVar = (CoordinatorLayout.C0459f) tr0.this.f21072a.getLayoutParams();
            CoordinatorLayout.C0459f fVar2 = (CoordinatorLayout.C0459f) tr0.this.f21086b.getLayoutParams();
            switch (i) {
                case 1:
                case 2:
                case 6:
                    tr0.this.f21072a.setVisibility(8);
                    tr0.this.f21086b.setVisibility(8);
                    tr0.this.f21064a.setVisibility(8);
                    tr0.this.f21062a.setVisibility(0);
                    return;
                case 3:
                    tr0.this.f21062a.setVisibility(0);
                    tr0.this.f21072a.setVisibility(8);
                    tr0.this.f21086b.setVisibility(8);
                    tr0.this.f21064a.setVisibility(8);
                    return;
                case 4:
                    tr0.this.f21072a.setVisibility(0);
                    tr0.this.f21086b.setVisibility(0);
                    tr0.this.f21062a.setVisibility(0);
                    fVar.setMargins(0, 0, tr0.this.f21104o, (int) TypedValue.applyDimension(1, 286.0f, tr0.this.getResources().getDisplayMetrics()));
                    fVar2.setMargins(0, 0, tr0.this.f21104o, (int) TypedValue.applyDimension(1, 356.0f, tr0.this.getResources().getDisplayMetrics()));
                    return;
                case 5:
                    tr0.this.f21062a.setVisibility(0);
                    tr0.this.f21072a.setVisibility(0);
                    tr0.this.f21086b.setVisibility(0);
                    tr0.this.f21064a.setVisibility(0);
                    fVar.setMargins(0, 0, tr0.this.f21104o, (int) TypedValue.applyDimension(1, 74.0f, tr0.this.getResources().getDisplayMetrics()));
                    fVar2.setMargins(0, 0, tr0.this.f21104o, (int) TypedValue.applyDimension(1, 144.0f, tr0.this.getResources().getDisplayMetrics()));
                    tr0.this.f21090c.addRule(21);
                    tr0 tr0 = tr0.this;
                    tr0.f21063a.setLayoutParams(tr0.f21090c);
                    return;
                default:
                    return;
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.tr0$d */
    public class C3657d extends AsyncTask<Void, Void, List<EVSearchData>> {
        public C3657d() {
        }

        /* renamed from: a */
        public List<EVSearchData> doInBackground(Void... voidArr) {
            try {
                return DatabaseClient.getInstance(tr0.this.f21059a).getAppDatabase().evSearchDao().getAll();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(List<EVSearchData> list) {
            super.onPostExecute(list);
            tr0.this.f21098d.clear();
            if (list != null && list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    tr0.this.f21098d.put(list.get(i).getName(), list.get(i).getAddress());
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.tr0$e */
    public class C3658e implements TextWatcher {
        public C3658e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (tr0.this.f21062a.getText().toString().equals(pj0.m61166a(-97413165586247L))) {
                tr0.this.f21063a.setVisibility(8);
                tr0.this.f21065a.setVisibility(8);
                tr0.this.f21083b.setVisibility(0);
            } else {
                tr0.this.f21063a.setVisibility(0);
                tr0.this.f21065a.setVisibility(0);
                tr0.this.f21083b.setVisibility(8);
            }
            tr0.this.f21073a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.tr0$f */
    public class C3659f implements TextWatcher {
        public C3659f() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (tr0.this.f21062a.getText().toString().equals(pj0.m61166a(-97417460553543L))) {
                tr0.this.f21063a.setVisibility(8);
                tr0.this.f21065a.setVisibility(8);
                tr0.this.f21083b.setVisibility(0);
            } else {
                tr0.this.f21063a.setVisibility(0);
                tr0.this.f21065a.setVisibility(0);
                tr0.this.f21083b.setVisibility(8);
            }
            tr0.this.f21073a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.tr0$g */
    public class C3660g extends CountDownTimer {
        public C3660g(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (tr0.this.f21058a != null) {
                tr0.this.f21058a.dismiss();
            }
            Toast.makeText(tr0.this.getContext(), tr0.this.getResources().getString(C1410R.string.some_error_occurred), 0).show();
        }

        public void onTick(long j) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m28857A0(AdapterView adapterView, View view, int i, long j) {
        mo25272r0();
        m28892q0(requireActivity());
        try {
            mo25260L0((String) ((ArrayList) adapterView.getItemAtPosition(i)).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ boolean m28858B0(View view, MotionEvent motionEvent) {
        if (this.f21071a.mo11277v0() != 3) {
            this.f21096d.setVisibility(8);
            this.f21064a.setVisibility(8);
            this.f21089b = true;
            this.f21067a.setVisibility(8);
            this.f21094c = true;
            this.f21072a.setVisibility(8);
            this.f21086b.setVisibility(8);
            this.f21081b.setImageResource(C1410R.C1411drawable.ic_back_arrow);
            RelativeLayout.LayoutParams layoutParams = this.f21084b;
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            this.f21081b.setPadding(0, 0, 0, 0);
            this.f21081b.setLayoutParams(this.f21084b);
            this.f21091c.setBackgroundColor(getResources().getColor(C1410R.color.white));
            this.f21091c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
            this.f21091c.requestLayout();
            RelativeLayout.LayoutParams layoutParams2 = this.f21100e;
            layoutParams2.topMargin = 0;
            this.f21101e.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f21062a.getLayoutParams();
            this.f21066a = layoutParams3;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
            this.f21062a.setLayoutParams(layoutParams3);
            this.f21062a.setBackground(zk3.m33204g(this.f21059a.getResources(), C1410R.C1411drawable.default_input, (Resources.Theme) null));
            this.f21062a.setTextColor(getResources().getColor(C1410R.color.black));
            this.f21062a.setHintTextColor(Color.parseColor(pj0.m61166a(-99341605902151L)));
            this.f21062a.requestFocus();
            this.f21090c.setMargins(0, 0, 0, 0);
            this.f21090c.addRule(21);
            this.f21063a.setLayoutParams(this.f21090c);
            this.f21081b.setColorFilter(r70.m26353f(this.f21059a, C1410R.color.black));
            this.f21063a.setColorFilter(r70.m26353f(this.f21059a, C1410R.color.black));
            this.f21085b.setVisibility(0);
            this.f21075a = new mz2(this.f21059a, C1410R.layout.past_filter_station_item, this.f21098d);
            this.f21065a.setVisibility(8);
            this.f21083b.setAdapter(this.f21075a);
            this.f21083b.setOnItemClickListener(new rr0(this));
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m28859C0(View view) {
        mo25266k0();
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m28861D0(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m28863E0(View view) {
        if (this.f21094c) {
            m28892q0(requireActivity());
            mo25272r0();
            this.f21089b = false;
            this.f21067a.setVisibility(0);
            this.f21071a.mo11242Y0(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m28864F0(View view) {
        this.f21062a.setText(pj0.m61166a(-99337310934855L));
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ void m28866G0(View view) {
        startActivity(new Intent(this.f21059a, SettingsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ void m28869I0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-99156922308423L)));
    }

    /* renamed from: M0 */
    public static HashMap<EVdata, Float> m28871M0(HashMap<EVdata, Float> hashMap) {
        LinkedList<Map.Entry> linkedList = new LinkedList<>(hashMap.entrySet());
        Collections.sort(linkedList, jr0.f30910a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedList) {
            linkedHashMap.put((EVdata) entry.getKey(), (Float) entry.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: q0 */
    public static void m28892q0(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f21055a;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m28895t0(AdapterView adapterView, View view, int i, long j) {
        m28892q0(requireActivity());
        this.f21072a.setVisibility(0);
        this.f21086b.setVisibility(0);
        ArrayList arrayList = (ArrayList) adapterView.getItemAtPosition(i);
        try {
            mo25260L0((String) arrayList.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            mo25273s0((String) arrayList.get(0), (String) arrayList.get(1));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        mo25272r0();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m28896u0(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f21080b = location;
            if (location != null) {
                this.f21076a.mo24990w(C3743ut.m29571e(new LatLng(this.f21080b.getLatitude(), this.f21080b.getLongitude()), 13.0f));
                this.f21060a.setLatitude(this.f21080b.getLatitude());
                this.f21060a.setLongitude(this.f21080b.getLongitude());
                this.f21076a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f21060a.getLatitude(), this.f21060a.getLongitude())).mo10680e(13.0f).mo10677b()));
                return;
            }
            mo25258J0();
            return;
        }
        Toast.makeText(this.f21059a, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-98976533681991L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m28897v0(AdapterView adapterView, View view, int i, long j) {
        m28892q0(requireActivity());
        this.f21072a.setVisibility(0);
        this.f21086b.setVisibility(0);
        ArrayList arrayList = (ArrayList) adapterView.getItemAtPosition(i);
        try {
            mo25260L0((String) arrayList.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            mo25273s0((String) arrayList.get(0), (String) arrayList.get(1));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        mo25272r0();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m28899w0(EVStations eVStations) {
        if (eVStations == null || this.f21076a == null) {
            try {
                Toast.makeText(this.f21059a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f21069a = eVStations;
            ArrayList<EVdata> data = eVStations.getData();
            this.f21078a = data;
            this.f21087b = data;
            this.f21062a.setHint(eVStations.getSearch_hint());
            int i = 0;
            for (int i2 = 0; i2 < this.f21078a.size(); i2++) {
                EVdata eVdata = this.f21078a.get(i2);
                if (eVdata.getEvChargers().size() > i) {
                    i = eVdata.getEvChargers().size();
                }
                this.f21102e.put(eVdata.getId(), Integer.valueOf(i2));
                EVStationCoordinates coordinates = eVdata.getCoordinates();
                od2 c = this.f21076a.mo24962c(new sd2().mo24329e3(new LatLng(coordinates.getLatitude(), coordinates.getLongitude())).mo24324Z2(C3858wl.m30941d(mo25269n0(eVdata.getName()))));
                this.f21088b.put(eVdata.getName() + pj0.m61166a(-98959353812807L) + eVdata.getAddress(), c);
                this.f21079a.put(c.mo21871b(), eVdata.getName() + ';' + eVdata.getAddress() + ';' + coordinates.getLatitude() + ';' + coordinates.getLongitude() + ';' + eVdata.getId());
                this.f21093c.put(eVdata.getName() + pj0.m61166a(-98967943747399L) + eVdata.getAddress(), eVdata.getAddress());
                C1693af afVar = new C1693af(this.f21059a, C1410R.layout.filter_station_item, this.f21093c);
                this.f21073a = afVar;
                this.f21065a.setAdapter(afVar);
                this.f21065a.setOnItemClickListener(new er0(this));
                this.f21062a.addTextChangedListener(new C3658e());
            }
            mo25270o0();
            this.f21086b.setVisibility(0);
        }
        mo25263h0();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ boolean m28900x0(od2 od2) {
        if (this.f21089b) {
            return false;
        }
        mo25259K0(od2.mo21871b());
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m28902y0(View view) {
        this.f21071a.mo11242Y0(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m28903z0(th1 th1) {
        this.f21076a = th1;
        mo25264i0();
        if (this.f21099d) {
            this.f21076a.mo24940I(true);
            this.f21076a.mo24985r().mo16113o(false);
            this.f21076a.mo24985r().mo16112n(false);
        }
        this.f21076a.mo24955X(new fr0(this));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: J0 */
    public final void mo25258J0() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 b = b82.m11677b(this.f21059a);
        this.f21074a = b;
        z62 z62 = this.f21077a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        b.mo18262A(locationRequest, z62, myLooper);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        android.widget.Toast.makeText(r6.f21059a, com.onedelhi.secure.pj0.m61166a(-98774670219079L), 0).show();
        r7 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0076 */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25259K0(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r6.f21079a     // Catch:{ Exception -> 0x00e4 }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00e4 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00e4 }
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()     // Catch:{ Exception -> 0x00e4 }
            java.lang.Class<com.delhitransport.onedelhi.activities.EVDetailsActivity> r3 = com.delhitransport.onedelhi.activities.EVDetailsActivity.class
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00e4 }
            r2 = -98736015513415(0xffffa6333ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)     // Catch:{ Exception -> 0x00e4 }
            r1.putExtra(r2, r7)     // Catch:{ Exception -> 0x00e4 }
            android.location.Location r2 = new android.location.Location     // Catch:{ Exception -> 0x00e4 }
            r3 = -98753195382599(0xffffa62f3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00e4 }
            r3 = -98757490349895(0xffffa62e3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String[] r3 = r7.split(r3)     // Catch:{ Exception -> 0x00e4 }
            r4 = 2
            r3 = r3[r4]     // Catch:{ Exception -> 0x00e4 }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00e4 }
            r2.setLatitude(r3)     // Catch:{ Exception -> 0x00e4 }
            r3 = -98766080284487(0xffffa62c3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String[] r3 = r7.split(r3)     // Catch:{ Exception -> 0x00e4 }
            r4 = 3
            r3 = r3[r4]     // Catch:{ Exception -> 0x00e4 }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00e4 }
            r2.setLongitude(r3)     // Catch:{ Exception -> 0x00e4 }
            r3 = 59
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String[] r7 = r7.split(r3)     // Catch:{ Exception -> 0x00e4 }
            r3 = 4
            r7 = r7[r3]     // Catch:{ Exception -> 0x00e4 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.f21102e     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0076 }
            int r7 = r3.intValue()     // Catch:{ Exception -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            android.content.Context r3 = r6.f21059a     // Catch:{ Exception -> 0x00e4 }
            r4 = -98774670219079(0xffffa62a3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x00e4 }
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r0)     // Catch:{ Exception -> 0x00e4 }
            r3.show()     // Catch:{ Exception -> 0x00e4 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00e4 }
        L_0x008c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e4 }
            r3.<init>()     // Catch:{ Exception -> 0x00e4 }
            android.location.Location r4 = r6.f21060a     // Catch:{ Exception -> 0x00e4 }
            float r2 = r6.mo25267l0(r2, r4)     // Catch:{ Exception -> 0x00e4 }
            r3.append(r2)     // Catch:{ Exception -> 0x00e4 }
            r4 = -98830504793927(0xffffa61d3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r4)     // Catch:{ Exception -> 0x00e4 }
            r3.append(r2)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00e4 }
            r3 = -98847684663111(0xffffa6193ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            com.delhitransport.onedelhi.ev.EVStations r4 = r6.f21069a     // Catch:{ Exception -> 0x00e4 }
            java.util.ArrayList r4 = r4.getData()     // Catch:{ Exception -> 0x00e4 }
            java.lang.Object r7 = r4.get(r7)     // Catch:{ Exception -> 0x00e4 }
            java.io.Serializable r7 = (java.io.Serializable) r7     // Catch:{ Exception -> 0x00e4 }
            r1.putExtra(r3, r7)     // Catch:{ Exception -> 0x00e4 }
            r3 = -98894929303367(0xffffa60e3ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            com.delhitransport.onedelhi.ev.EVStations r3 = r6.f21069a     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r3.getTimestamp()     // Catch:{ Exception -> 0x00e4 }
            r1.putExtra(r7, r3)     // Catch:{ Exception -> 0x00e4 }
            r3 = -98937878976327(0xffffa6043ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00e4 }
            r1.putExtra(r7, r2)     // Catch:{ Exception -> 0x00e4 }
            r6.startActivity(r1)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00fc
        L_0x00e4:
            r7 = move-exception
            r7.printStackTrace()
            android.content.Context r7 = r6.f21059a
            android.content.res.Resources r1 = r6.getResources()
            r2 = 2131952114(0x7f1301f2, float:1.9540662E38)
            java.lang.String r1 = r1.getString(r2)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r1, r0)
            r7.show()
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tr0.mo25259K0(java.lang.String):void");
    }

    /* renamed from: L0 */
    public final void mo25260L0(String str) {
        od2 od2 = this.f21088b.get(str);
        if (od2 == null) {
            Toast.makeText(this.f21059a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            return;
        }
        this.f21076a.mo24990w(C3743ut.m29571e(new LatLng(od2.mo21872c().f7562a, od2.mo21872c().f7563b), 13.0f));
        mo25259K0(od2.mo21871b());
    }

    /* renamed from: N0 */
    public void mo25261N0() {
        C3660g gVar = new C3660g(20000, 1000);
        this.f21061a = gVar;
        gVar.start();
    }

    /* renamed from: O0 */
    public final void mo25262O0() {
        boolean z;
        boolean z2 = false;
        if (this.f21099d) {
            this.f21076a.mo24940I(true);
            this.f21076a.mo24985r().mo16113o(false);
            this.f21076a.mo24985r().mo16112n(false);
        }
        LocationManager locationManager = (LocationManager) this.f21059a.getSystemService(pj0.m61166a(-98242094274375L));
        try {
            z = locationManager.isProviderEnabled(pj0.m61166a(-98280748980039L));
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(pj0.m61166a(-98297928849223L));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z && !z2) {
            try {
                new C0189c.C0190a(requireActivity()).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new dr0(this)).mo959s(this.f21059a.getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if ((z || z2) && this.f21099d) {
            mo25266k0();
        }
    }

    /* renamed from: h0 */
    public void mo25263h0() {
        CountDownTimer countDownTimer = this.f21061a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f21058a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: i0 */
    public final void mo25264i0() {
        boolean z = r70.m26348a(this.f21059a, pj0.m61166a(-97610734081863L)) == 0;
        this.f21099d = z;
        if (!z) {
            requestPermissions(new String[]{pj0.m61166a(-97782532773703L)}, 123);
        } else {
            mo25262O0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25265j0(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f21087b = r0
            r0 = -98401008064327(0xffffa6813ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r0 = r11.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r11 = r10.f21078a
            java.util.Iterator r11 = r11.iterator()
        L_0x001d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r11.next()
            com.delhitransport.onedelhi.ev.EVdata r0 = (com.delhitransport.onedelhi.p002ev.EVdata) r0
            java.lang.String r2 = r0.getStation_type()
            r3 = -98439662769991(0xffffa6783ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001d
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r2 = r10.f21087b
            r2.add(r0)
            goto L_0x001d
        L_0x0042:
            r10.mo25270o0()
            r11 = 1
        L_0x0046:
            r10.f21103n = r11
            goto L_0x0091
        L_0x0049:
            r2 = -98478317475655(0xffffa66f3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0088
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r11 = r10.f21078a
            java.util.Iterator r11 = r11.iterator()
        L_0x005e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r11.next()
            com.delhitransport.onedelhi.ev.EVdata r0 = (com.delhitransport.onedelhi.p002ev.EVdata) r0
            java.lang.String r2 = r0.getStation_type()
            r3 = -98551331919687(0xffffa65e3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005e
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r2 = r10.f21087b
            r2.add(r0)
            goto L_0x005e
        L_0x0083:
            r10.mo25270o0()
            r11 = 2
            goto L_0x0046
        L_0x0088:
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r11 = r10.f21078a
            r10.f21087b = r11
            r10.mo25270o0()
            r10.f21103n = r1
        L_0x0091:
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r11 = r10.f21087b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x01b7
            com.onedelhi.secure.th1 r11 = r10.f21076a
            if (r11 == 0) goto L_0x00a0
            r11.mo24976j()
        L_0x00a0:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.od2> r11 = r10.f21088b
            r11.clear()
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r10.f21079a
            r11.clear()
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r10.f21093c
            r11.clear()
            r11 = 0
        L_0x00b0:
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r0 = r10.f21087b
            int r0 = r0.size()
            if (r11 >= r0) goto L_0x01b2
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVdata> r0 = r10.f21087b
            java.lang.Object r0 = r0.get(r11)
            com.delhitransport.onedelhi.ev.EVdata r0 = (com.delhitransport.onedelhi.p002ev.EVdata) r0
            com.delhitransport.onedelhi.ev.EVStationCoordinates r2 = r0.getCoordinates()
            java.lang.String r3 = r0.getName()
            android.graphics.Bitmap r3 = r10.mo25269n0(r3)
            com.onedelhi.secure.sd2 r4 = new com.onedelhi.secure.sd2
            r4.<init>()
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            double r6 = r2.getLatitude()
            double r8 = r2.getLongitude()
            r5.<init>(r6, r8)
            com.onedelhi.secure.sd2 r4 = r4.mo24329e3(r5)
            com.onedelhi.secure.vl r3 = com.onedelhi.secure.C3858wl.m30941d(r3)
            com.onedelhi.secure.sd2 r3 = r4.mo24324Z2(r3)
            com.onedelhi.secure.th1 r4 = r10.f21076a
            com.onedelhi.secure.od2 r3 = r4.mo24962c(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.getName()
            r4.append(r5)
            r5 = 59
            r4.append(r5)
            java.lang.String r6 = r0.getAddress()
            r4.append(r6)
            r4.append(r5)
            double r6 = r2.getLatitude()
            r4.append(r6)
            r4.append(r5)
            double r6 = r2.getLongitude()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r2 = r0.getId()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.util.HashMap<java.lang.String, com.onedelhi.secure.od2> r4 = r10.f21088b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getName()
            r5.append(r6)
            r6 = -98624346363719(0xffffa64d3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r5.append(r6)
            java.lang.String r6 = r0.getAddress()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.put(r5, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r10.f21079a
            java.lang.String r3 = r3.mo21871b()
            r4.put(r3, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r10.f21093c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            r4 = -98632936298311(0xffffa64b3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            r3.append(r4)
            java.lang.String r4 = r0.getAddress()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.getAddress()
            r2.put(r3, r0)
            com.onedelhi.secure.af r0 = new com.onedelhi.secure.af
            android.content.Context r2 = r10.f21059a
            r3 = 2131558498(0x7f0d0062, float:1.8742314E38)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r10.f21093c
            r0.<init>(r2, r3, r4)
            r10.f21073a = r0
            android.widget.ListView r2 = r10.f21065a
            r2.setAdapter(r0)
            android.widget.ListView r0 = r10.f21065a
            com.onedelhi.secure.sr0 r2 = new com.onedelhi.secure.sr0
            r2.<init>(r10)
            r0.setOnItemClickListener(r2)
            android.widget.AutoCompleteTextView r0 = r10.f21062a
            com.onedelhi.secure.tr0$f r2 = new com.onedelhi.secure.tr0$f
            r2.<init>()
            r0.addTextChangedListener(r2)
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x01b2:
            com.google.android.material.floatingactionbutton.FloatingActionButton r11 = r10.f21086b
            r11.setVisibility(r1)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tr0.mo25265j0(java.lang.String):void");
    }

    /* renamed from: k0 */
    public final void mo25266k0() {
        this.f21074a.mo18272U().mo17573e(new hr0(this));
    }

    /* renamed from: l0 */
    public final float mo25267l0(Location location, Location location2) {
        DecimalFormat decimalFormat = new DecimalFormat(pj0.m61166a(-98645821200199L));
        decimalFormat.setMaximumFractionDigits(2);
        return Float.parseFloat(decimalFormat.format((double) (location.distanceTo(location2) / 1000.0f)));
    }

    /* renamed from: m0 */
    public final void mo25268m0() {
        new C3657d().execute(new Void[0]);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: n0 */
    public final Bitmap mo25269n0(String str) {
        io1 io1 = new io1(this.f21059a);
        io1.mo38184l(((LayoutInflater) this.f21059a.getSystemService(pj0.m61166a(-98667296036679L))).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        io1.mo38180h(this.f21059a.getResources().getDrawable(C1410R.C1411drawable.ic_ev_station_marker));
        return io1.mo38178f(str);
    }

    /* renamed from: o0 */
    public final void mo25270o0() {
        HashMap hashMap = new HashMap();
        Iterator<EVdata> it = this.f21087b.iterator();
        while (it.hasNext()) {
            EVdata next = it.next();
            Location location = new Location(pj0.m61166a(-98641526232903L));
            location.setLatitude(next.getCoordinates().getLatitude());
            location.setLongitude(next.getCoordinates().getLongitude());
            hashMap.put(next, Float.valueOf(mo25267l0(location, this.f21060a)));
        }
        HashMap<EVdata, Float> M0 = m28871M0(hashMap);
        try {
            wn2 wn2 = new wn2(new ArrayList(M0.keySet()), new ArrayList(M0.values()), this.f21069a.getTimestamp(), requireActivity());
            this.f21068a.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.f21068a.setAdapter(wn2);
            wn2.mo5717m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f21059a = context.getApplicationContext();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        requireActivity().getWindow().clearFlags(8192);
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_ev, viewGroup, false);
        this.f21059a.getSharedPreferences(pj0.m61166a(-97426050488135L), 0);
        this.f21070a = (MapView) inflate.findViewById(C1410R.C1412id.mapView);
        this.f21072a = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_curLocation);
        this.f21086b = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_filter);
        this.f21062a = (AutoCompleteTextView) inflate.findViewById(C1410R.C1412id.edit_searchEV);
        this.f21063a = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_destination);
        this.f21081b = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_back_1);
        this.f21085b = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_filterResults);
        this.f21065a = (ListView) inflate.findViewById(C1410R.C1412id.lv_filterResults);
        this.f21083b = (ListView) inflate.findViewById(C1410R.C1412id.lv_pastSearches);
        this.f21068a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_stations);
        this.f21064a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_bottom_sheet);
        this.f21082b = (ImageView) inflate.findViewById(C1410R.C1412id.iv_settings);
        this.f21091c = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_main);
        this.f21096d = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_banner);
        this.f21101e = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_search);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C1410R.C1412id.bottom_sheet);
        this.f21067a = relativeLayout;
        this.f21071a = BottomSheetBehavior.m9579i0(relativeLayout);
        f21055a = (InputMethodManager) requireActivity().getSystemService(pj0.m61166a(-97511949834055L));
        this.f21071a.mo11242Y0(4);
        this.f21070a.mo10627b(bundle);
        mo25268m0();
        this.f21070a.mo10626a(new ir0(this));
        this.f21074a = b82.m11677b(this.f21059a);
        mo25271p0();
        this.f21104o = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f21071a.mo11241Y(new C3656c());
        this.f21084b = (RelativeLayout.LayoutParams) this.f21081b.getLayoutParams();
        this.f21090c = (RelativeLayout.LayoutParams) this.f21063a.getLayoutParams();
        this.f21100e = (RelativeLayout.LayoutParams) this.f21101e.getLayoutParams();
        this.f21062a.setOnTouchListener(new qr0(this));
        this.f21072a.setOnClickListener(new kr0(this));
        this.f21086b.setOnClickListener(pr0.f33757a);
        this.f21081b.setOnClickListener(new lr0(this));
        this.f21063a.setOnClickListener(new mr0(this));
        this.f21082b.setOnClickListener(new nr0(this));
        this.f21064a.setOnClickListener(new or0(this));
        return inflate;
    }

    public void onDestroy() {
        mo25263h0();
        this.f21070a.mo10628c();
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f21070a.mo10631f();
    }

    public void onPause() {
        super.onPause();
        this.f21070a.mo10632g();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-97954331465543L))) {
                    if (iArr[i2] >= 0) {
                        z = true;
                    } else {
                        Toast.makeText(this.f21059a, pj0.m61166a(-98126130157383L), 0).show();
                    }
                }
            }
            if (z) {
                mo25262O0();
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f21079a.size() == 0 && this.f21076a != null) {
            mo25271p0();
        }
        if (this.f21099d) {
            mo25266k0();
        }
        if (this.f21071a.mo11277v0() == 3) {
            this.f21071a.mo11242Y0(4);
        }
        this.f21070a.mo10633h();
    }

    /* renamed from: p0 */
    public final void mo25271p0() {
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f21058a = progressDialog;
        progressDialog.setMessage(pj0.m61166a(-98332288587591L));
        this.f21058a.show();
        mo25261N0();
        new EVModel().getEVStationDetails().mo4926j(requireActivity(), new gr0(this));
    }

    /* renamed from: r0 */
    public final void mo25272r0() {
        this.f21094c = false;
        this.f21096d.setVisibility(0);
        this.f21091c.setBackground(zk3.m33204g(this.f21059a.getResources(), C1410R.C1411drawable.one_delhi_banner_background, (Resources.Theme) null));
        this.f21091c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 126.0f, getResources().getDisplayMetrics());
        this.f21091c.requestLayout();
        this.f21072a.setVisibility(0);
        this.f21086b.setVisibility(0);
        this.f21085b.setVisibility(8);
        this.f21100e.topMargin = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f21101e.setLayoutParams(this.f21100e);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21062a.getLayoutParams();
        this.f21066a = layoutParams;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f21066a.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f21062a.setLayoutParams(this.f21066a);
        this.f21062a.setBackground(zk3.m33204g(this.f21059a.getResources(), C1410R.C1411drawable.round_input_transparent, (Resources.Theme) null));
        this.f21062a.setTextColor(getResources().getColor(C1410R.color.white));
        this.f21062a.setHeight((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f21062a.setHintTextColor(Color.parseColor(pj0.m61166a(-97567784408903L)));
        this.f21081b.setImageResource(C1410R.C1411drawable.ic_search);
        this.f21081b.setColorFilter(r70.m26353f(this.f21059a, C1410R.color.white));
        this.f21063a.setColorFilter(r70.m26353f(this.f21059a, C1410R.color.white));
        RelativeLayout.LayoutParams layoutParams2 = this.f21084b;
        int i = this.f21104o;
        layoutParams2.leftMargin = i;
        layoutParams2.bottomMargin = i;
        layoutParams2.rightMargin = i;
        layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams3 = this.f21090c;
        int i2 = this.f21104o;
        layoutParams3.leftMargin = i2;
        layoutParams3.bottomMargin = i2;
        layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        this.f21090c.topMargin = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        this.f21081b.setLayoutParams(this.f21084b);
        this.f21090c.addRule(21);
        this.f21063a.setLayoutParams(this.f21090c);
    }

    /* renamed from: s0 */
    public final void mo25273s0(String str, String str2) {
        new C3655b(str, str2).execute(new Void[0]);
    }
}
