package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
import com.delhitransport.onedelhi.live.RouteSearchData;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.viewmodels.DataViewModel;
import com.delhitransport.onedelhi.viewmodels.LiveViewModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class fm0 extends Fragment implements kv2, jv2 {

    /* renamed from: a */
    public static InputMethodManager f12152a = null;

    /* renamed from: f */
    public static final String f12153f = pj0.m61166a(-97374510880583L);

    /* renamed from: t */
    public static final int f12154t = 123;

    /* renamed from: u */
    public static final int f12155u = 15;

    /* renamed from: a */
    public float f12156a;

    /* renamed from: a */
    public Context f12157a;

    /* renamed from: a */
    public final Location f12158a = new Location(pj0.m61166a(-94015846455111L));

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f12159a;

    /* renamed from: a */
    public AutoCompleteTextView f12160a;

    /* renamed from: a */
    public Button f12161a;

    /* renamed from: a */
    public ImageButton f12162a;

    /* renamed from: a */
    public ImageView f12163a;

    /* renamed from: a */
    public ListView f12164a;

    /* renamed from: a */
    public RelativeLayout.LayoutParams f12165a;

    /* renamed from: a */
    public RelativeLayout f12166a;

    /* renamed from: a */
    public RecyclerView f12167a;

    /* renamed from: a */
    public AllStops f12168a;

    /* renamed from: a */
    public MapView f12169a;

    /* renamed from: a */
    public LatLng f12170a = null;

    /* renamed from: a */
    public FloatingActionButton f12171a;

    /* renamed from: a */
    public FirebaseAnalytics f12172a;

    /* renamed from: a */
    public jd1 f12173a;

    /* renamed from: a */
    public lz2 f12174a;

    /* renamed from: a */
    public th1 f12175a;

    /* renamed from: a */
    public yn2 f12176a;

    /* renamed from: a */
    public final z62 f12177a;

    /* renamed from: a */
    public Boolean f12178a;

    /* renamed from: a */
    public ArrayList<AllRoutes> f12179a;

    /* renamed from: a */
    public final HashMap<String, String> f12180a = new HashMap<>();

    /* renamed from: a */
    public List<AllStops> f12181a;

    /* renamed from: b */
    public Location f12182b;

    /* renamed from: b */
    public AutoCompleteTextView f12183b;

    /* renamed from: b */
    public ImageButton f12184b;

    /* renamed from: b */
    public ListView f12185b;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f12186b;

    /* renamed from: b */
    public RelativeLayout f12187b;

    /* renamed from: b */
    public AllStops f12188b;

    /* renamed from: b */
    public LatLng f12189b = null;

    /* renamed from: b */
    public Boolean f12190b;

    /* renamed from: b */
    public String f12191b;

    /* renamed from: b */
    public ArrayList<AllStops> f12192b;

    /* renamed from: b */
    public final HashMap<String, String> f12193b = new HashMap<>();

    /* renamed from: b */
    public boolean f12194b = false;

    /* renamed from: c */
    public ImageButton f12195c;

    /* renamed from: c */
    public RelativeLayout.LayoutParams f12196c;

    /* renamed from: c */
    public RelativeLayout f12197c;

    /* renamed from: c */
    public String f12198c = pj0.m61166a(-94020141422407L);

    /* renamed from: c */
    public final HashMap<String, od2> f12199c = new HashMap<>();

    /* renamed from: c */
    public boolean f12200c;

    /* renamed from: d */
    public ImageButton f12201d;

    /* renamed from: d */
    public RelativeLayout.LayoutParams f12202d;

    /* renamed from: d */
    public RelativeLayout f12203d;

    /* renamed from: d */
    public String f12204d;

    /* renamed from: d */
    public final HashMap<String, String> f12205d = new HashMap<>();

    /* renamed from: d */
    public boolean f12206d;

    /* renamed from: e */
    public RelativeLayout.LayoutParams f12207e;

    /* renamed from: e */
    public String f12208e;

    /* renamed from: e */
    public final HashMap<String, String> f12209e = new HashMap<>();

    /* renamed from: e */
    public boolean f12210e = false;

    /* renamed from: f */
    public final HashMap<String, List<String>> f12211f = new HashMap<>();

    /* renamed from: f */
    public boolean f12212f;

    /* renamed from: g */
    public final HashMap<List<String>, List<String>> f12213g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, String> f12214h = new HashMap<>();

    /* renamed from: i */
    public final HashMap<String, String> f12215i = new HashMap<>();

    /* renamed from: n */
    public int f12216n;

    /* renamed from: o */
    public int f12217o;

    /* renamed from: p */
    public int f12218p;

    /* renamed from: q */
    public int f12219q;

    /* renamed from: r */
    public int f12220r;

    /* renamed from: s */
    public int f12221s;

    /* renamed from: com.onedelhi.secure.fm0$a */
    public class C2179a extends z62 {
        public C2179a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            fm0.this.f12175a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 15.0f));
            fm0.this.f12158a.setLatitude(M2.getLatitude());
            fm0.this.f12158a.setLongitude(M2.getLongitude());
            if (fm0.this.f12182b != null) {
                LatLng unused = fm0.this.f12189b = new LatLng(fm0.this.f12182b.getLatitude(), fm0.this.f12182b.getLongitude());
                LatLng unused2 = fm0.this.f12170a = new LatLng(fm0.this.f12182b.getLatitude(), fm0.this.f12182b.getLongitude());
                fm0.this.f12175a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(fm0.this.f12158a.getLatitude(), fm0.this.f12158a.getLongitude())).mo10680e(15.0f).mo10677b()));
                return;
            }
            fm0.this.mo16084y0();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.fm0$b */
    public class C2180b extends AsyncTask<Void, Void, List<RouteSearchData>> {
        public C2180b() {
        }

        /* renamed from: a */
        public List<RouteSearchData> doInBackground(Void... voidArr) {
            try {
                return DatabaseClient.getInstance(fm0.this.f12157a).getAppDatabase().routeSearchDao().getAll();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(List<RouteSearchData> list) {
            super.onPostExecute(list);
            fm0.this.f12211f.clear();
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    arrayList.clear();
                    arrayList.add(list.get(i).getType());
                    arrayList.add(list.get(i).getSource());
                    arrayList.add(list.get(i).getTerminal());
                    fm0.this.f12211f.put(list.get(i).getRoute_name(), arrayList);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fm0$c */
    public class C2181c implements AdapterView.OnItemClickListener {
        public C2181c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            fm0.m15033D0(fm0.this.requireActivity());
            fm0.this.f12171a.setVisibility(0);
            AllStops allStops = (AllStops) adapterView.getItemAtPosition(i);
            if (fm0.this.f12212f) {
                fm0.this.f12160a.setText(allStops.getName());
                AllStops unused = fm0.this.f12188b = allStops;
                return;
            }
            fm0.this.f12183b.setText(allStops.getName());
            AllStops unused2 = fm0.this.f12168a = allStops;
        }
    }

    /* renamed from: com.onedelhi.secure.fm0$d */
    public class C2182d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C3596te f12226a;

        public C2182d(C3596te teVar) {
            this.f12226a = teVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (fm0.this.f12160a.getText().toString().equals(pj0.m61166a(-94007256520519L))) {
                fm0.this.f12162a.setVisibility(8);
                fm0.this.f12164a.setVisibility(8);
                fm0.this.f12185b.setVisibility(0);
            } else {
                fm0.this.f12162a.setVisibility(0);
                fm0.this.f12164a.setVisibility(0);
                fm0.this.f12185b.setVisibility(8);
            }
            this.f12226a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.fm0$e */
    public class C2183e implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C3596te f12228a;

        public C2183e(C3596te teVar) {
            this.f12228a = teVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (fm0.this.f12183b.getText().toString().equals(pj0.m61166a(-94011551487815L))) {
                fm0.this.f12184b.setVisibility(8);
                fm0.this.f12164a.setVisibility(8);
                fm0.this.f12185b.setVisibility(0);
            } else {
                fm0.this.f12184b.setVisibility(0);
                fm0.this.f12164a.setVisibility(0);
                fm0.this.f12185b.setVisibility(8);
            }
            this.f12228a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.fm0$f */
    public class C2184f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Handler f12229a;

        public C2184f(Handler handler) {
            this.f12229a = handler;
        }

        public void run() {
            if (fm0.this.f12206d) {
                fm0 fm0 = fm0.this;
                fm0.mo16069C0(1, fm0.f12170a.f7562a, fm0.this.f12170a.f7563b);
                this.f12229a.postDelayed(this, 10000);
                return;
            }
            this.f12229a.removeCallbacks(this);
        }
    }

    public fm0() {
        Boolean bool = Boolean.FALSE;
        this.f12178a = bool;
        this.f12190b = bool;
        this.f12177a = new C2179a();
        this.f12168a = null;
        this.f12188b = null;
        this.f12156a = 1.0E7f;
        this.f12212f = false;
        this.f12159a = new C2181c();
    }

    /* renamed from: D0 */
    public static void m15033D0(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f12152a;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m15035F0(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null) {
            this.f12179a = allRouteResponse.getAll_routes();
            for (int i = 0; i < this.f12179a.size(); i++) {
                this.f12205d.put(this.f12179a.get(i).getLongName(), this.f12179a.get(i).getEnd());
                this.f12209e.put(this.f12179a.get(i).getLongName(), this.f12179a.get(i).getStart());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ void m15037G0(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f12192b = allStopsResponse.getAll_stops();
            for (int i = 0; i < this.f12192b.size(); i++) {
                this.f12214h.put(this.f12175a.mo24962c(new sd2().mo24329e3(new LatLng(this.f12192b.get(i).getLat().doubleValue(), this.f12192b.get(i).getLng().doubleValue())).mo24324Z2(C3858wl.m30941d(Bitmap.createScaledBitmap(((BitmapDrawable) zk3.m33204g(getResources(), C1410R.C1411drawable.metro_statio, (Resources.Theme) null)).getBitmap(), this.f12216n, this.f12217o, false))).mo24332h3(this.f12192b.get(i).getName())).mo21871b(), pj0.m61166a(-96670136244039L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ void m15038H0(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f12192b = new ArrayList<>();
            ArrayList<AllStops> all_stops = allStopsResponse.getAll_stops();
            this.f12192b = all_stops;
            mo16075p0(all_stops);
            C2456iq.m17793l(getActivity(), this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ void m15040I0(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f12182b = location;
            if (location != null) {
                this.f12175a.mo24990w(C3743ut.m29571e(new LatLng(this.f12182b.getLatitude(), this.f12182b.getLongitude()), 15.0f));
                this.f12158a.setLatitude(this.f12182b.getLatitude());
                this.f12158a.setLongitude(this.f12182b.getLongitude());
                this.f12189b = new LatLng(this.f12182b.getLatitude(), this.f12182b.getLongitude());
                this.f12170a = new LatLng(this.f12182b.getLatitude(), this.f12182b.getLongitude());
                this.f12175a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f12158a.getLatitude(), this.f12158a.getLongitude())).mo10680e(15.0f).mo10677b()));
                mo16081v0(Double.valueOf(this.f12158a.getLatitude()), Double.valueOf(this.f12158a.getLongitude()));
                mo16069C0(0, this.f12158a.getLatitude(), this.f12158a.getLongitude());
                return;
            }
            mo16072X0();
            return;
        }
        Toast.makeText(this.f12157a, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-96309358991175L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ void m15041J0(int i, List list) {
        long j;
        Context context;
        List list2 = list;
        if (list2 == null) {
            context = this.f12157a;
            j = -96090315659079L;
        } else if (i != 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                LiveItem liveItem = (LiveItem) list2.get(i2);
                String id = liveItem.getId();
                this.f12191b = id;
                if (this.f12199c.get(id) == null) {
                    mo16074o0(Double.valueOf(Double.parseDouble(liveItem.getLat())), Double.valueOf(Double.parseDouble(liveItem.getLon())), liveItem.getId(), pj0.m61166a(-96034481084231L), liveItem.getAgency(), Boolean.valueOf(liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-96051660953415L))), liveItem.getId(), String.valueOf(liveItem.getTimestamp()), pj0.m61166a(-96064545855303L), liveItem.getRoute());
                }
            }
            return;
        } else if (list.size() > 0) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                LiveItem liveItem2 = (LiveItem) list2.get(i3);
                mo16074o0(Double.valueOf(Double.parseDouble(liveItem2.getLat())), Double.valueOf(Double.parseDouble(liveItem2.getLon())), liveItem2.getId(), pj0.m61166a(-95759603177287L), liveItem2.getAgency(), Boolean.valueOf(liveItem2.getAc().equalsIgnoreCase(pj0.m61166a(-95776783046471L))), liveItem2.getId(), String.valueOf(liveItem2.getTimestamp()), pj0.m61166a(-95789667948359L), liveItem2.getRoute());
            }
            return;
        } else {
            context = this.f12157a;
            j = -95815437752135L;
        }
        Toast.makeText(context, pj0.m61166a(j), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ void m15042K0() {
        if (this.f12198c.equalsIgnoreCase(pj0.m61166a(-97348741076807L))) {
            double d = this.f12175a.mo24978k().f7555a.f7562a;
            double d2 = this.f12175a.mo24978k().f7555a.f7563b;
            Location location = new Location(pj0.m61166a(-97365920945991L));
            Location location2 = new Location(pj0.m61166a(-97370215913287L));
            location.setLatitude(d);
            location.setLongitude(d2);
            this.f12170a = new LatLng(d, d2);
            try {
                location2.setLatitude(this.f12189b.f7562a);
                location2.setLongitude(this.f12189b.f7563b);
            } catch (Exception e) {
                location2.setLatitude(d);
                location2.setLongitude(d2);
                e.printStackTrace();
            }
            if (mo16067A0(location2, location) > 2000.0f) {
                this.f12190b = Boolean.FALSE;
                mo16078s0();
                mo16081v0(Double.valueOf(d), Double.valueOf(d2));
                mo16069C0(0, d, d2);
                this.f12189b = this.f12170a;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ void m15044L0(th1 th1) {
        this.f12175a = th1;
        mo16077r0();
        if (this.f12200c) {
            this.f12175a.mo24940I(true);
            this.f12175a.mo24985r().mo16113o(false);
            this.f12175a.mo24985r().mo16112n(false);
            th1.mo24985r().mo16115q(false);
        }
        this.f12175a.mo24942K(new pl0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ void m15045M0(View view) {
        if (this.f12210e) {
            m15033D0(requireActivity());
            mo16070E0();
            this.f12194b = false;
            this.f12160a.clearFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ void m15047N0(View view) {
        this.f12190b = Boolean.FALSE;
        mo16078s0();
        mo16084y0();
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m15049O0(View view) {
        AllStops allStops;
        AllStops allStops2;
        AllStops allStops3 = this.f12168a;
        if (allStops3 != null && (allStops2 = this.f12188b) != null) {
            this.f12168a = allStops2;
            this.f12188b = allStops3;
            this.f12183b.setText(allStops2.getName());
        } else if (allStops3 == null && (allStops = this.f12188b) != null) {
            this.f12188b = new AllStops(0, Double.valueOf(this.f12158a.getLatitude()), Double.valueOf(this.f12158a.getLongitude()), pj0.m61166a(-97271431665479L), pj0.m61166a(-97344446109511L));
            this.f12168a = allStops;
            this.f12183b.setText(allStops.getName());
        } else {
            return;
        }
        this.f12160a.setText(this.f12188b.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ void m15051P0(Bundle bundle, View view) {
        double d;
        Bundle bundle2 = new Bundle();
        bundle.putString(pj0.m61166a(-96880589641543L), pj0.m61166a(-96940719183687L));
        this.f12172a.mo29667c(pj0.m61166a(-97043798398791L), bundle2);
        Location location = new Location(pj0.m61166a(-97146877613895L));
        Location location2 = new Location(pj0.m61166a(-97151172581191L));
        AllStops allStops = this.f12168a;
        if (allStops == null || this.f12188b == null || this.f12158a == null) {
            Location location3 = this.f12158a;
            if (location3 != null && this.f12188b != null) {
                location.setLatitude(location3.getLatitude());
                d = this.f12158a.getLongitude();
                location.setLongitude(d);
                location2.setLatitude(this.f12188b.getLat().doubleValue());
                location2.setLongitude(this.f12188b.getLng().doubleValue());
                mo16071W0(location, location2);
            } else if (allStops == null || this.f12188b == null) {
                Toast.makeText(this.f12157a, pj0.m61166a(-97155467548487L), 0).show();
                return;
            }
        }
        location.setLatitude(allStops.getLat().doubleValue());
        d = this.f12168a.getLng().doubleValue();
        location.setLongitude(d);
        location2.setLatitude(this.f12188b.getLat().doubleValue());
        location2.setLongitude(this.f12188b.getLng().doubleValue());
        mo16071W0(location, location2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m15053Q0(View view) {
        this.f12183b.setText(pj0.m61166a(-96876294674247L));
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m15055R0(View view) {
        this.f12160a.setText(pj0.m61166a(-96871999706951L));
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ boolean m15057S0(View view, MotionEvent motionEvent) {
        this.f12212f = false;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ boolean m15059T0(View view, MotionEvent motionEvent) {
        if (!this.f12160a.getText().toString().equalsIgnoreCase(pj0.m61166a(-96695906047815L))) {
            this.f12162a.setVisibility(0);
        } else {
            this.f12162a.setVisibility(8);
        }
        this.f12212f = true;
        this.f12197c.setVisibility(8);
        if (this.f12183b.getText().toString().equalsIgnoreCase(pj0.m61166a(-96700201015111L))) {
            this.f12183b.setText(pj0.m61166a(-96704495982407L));
        }
        this.f12183b.setVisibility(0);
        this.f12201d.setVisibility(0);
        this.f12194b = true;
        this.f12210e = true;
        this.f12195c.setImageResource(C1410R.C1411drawable.ic_back_arrow);
        RelativeLayout.LayoutParams layoutParams = this.f12186b;
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = this.f12218p / 2;
        this.f12195c.setPadding(0, 0, 0, 0);
        this.f12195c.setLayoutParams(this.f12186b);
        this.f12187b.setBackground(getResources().getDrawable(C1410R.C1411drawable.default_input));
        this.f12187b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f12187b.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = this.f12202d;
        layoutParams2.topMargin = 0;
        this.f12203d.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f12183b.getLayoutParams();
        layoutParams3.topMargin = this.f12218p / 2;
        layoutParams3.bottomMargin = 0;
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
        layoutParams3.addRule(1, C1410R.C1412id.ib_back_1);
        this.f12183b.setLayoutParams(layoutParams3);
        this.f12183b.setPadding(0, 0, this.f12218p, 0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f12160a.getLayoutParams();
        this.f12165a = layoutParams4;
        layoutParams4.topMargin = this.f12218p / 2;
        layoutParams4.bottomMargin = 0;
        layoutParams4.leftMargin = 0;
        layoutParams4.rightMargin = 0;
        layoutParams4.addRule(1, C1410R.C1412id.ib_back_1);
        this.f12160a.setLayoutParams(this.f12165a);
        this.f12160a.setPadding(0, 0, this.f12218p, 0);
        this.f12183b.setBackground(zk3.m33204g(this.f12157a.getResources(), C1410R.C1411drawable.default_input, (Resources.Theme) null));
        this.f12183b.setTextColor(getResources().getColor(C1410R.color.black));
        this.f12183b.setHintTextColor(Color.parseColor(pj0.m61166a(-96777510426439L)));
        this.f12160a.setBackground(zk3.m33204g(this.f12157a.getResources(), C1410R.C1411drawable.default_input, (Resources.Theme) null));
        this.f12160a.setTextColor(getResources().getColor(C1410R.color.black));
        this.f12160a.setHintTextColor(Color.parseColor(pj0.m61166a(-96820460099399L)));
        this.f12160a.requestFocus();
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f12184b.getLayoutParams();
        layoutParams5.rightMargin = 0;
        layoutParams5.leftMargin = 0;
        layoutParams5.topMargin = this.f12218p / 2;
        layoutParams5.bottomMargin = 0;
        layoutParams5.addRule(21);
        this.f12184b.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = this.f12196c;
        layoutParams6.rightMargin = 0;
        layoutParams6.leftMargin = 0;
        layoutParams6.topMargin = this.f12218p / 2;
        layoutParams6.bottomMargin = 0;
        layoutParams6.addRule(21);
        this.f12162a.setLayoutParams(this.f12196c);
        this.f12195c.setColorFilter(r70.m26353f(this.f12157a, C1410R.color.black));
        this.f12162a.setColorFilter(r70.m26353f(this.f12157a, C1410R.color.black));
        this.f12184b.setColorFilter(r70.m26353f(this.f12157a, C1410R.color.black));
        this.f12166a.setVisibility(0);
        if (this.f12183b.getText().toString().equalsIgnoreCase(pj0.m61166a(-96863409772359L)) || this.f12160a.getText().toString().equalsIgnoreCase(pj0.m61166a(-96867704739655L))) {
            this.f12164a.setVisibility(8);
        }
        m15066Y0(requireActivity());
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m15061U0(View view) {
        startActivity(new Intent(this.f12157a, SettingsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m15062V0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-96489747617607L)));
    }

    /* renamed from: Y0 */
    public static void m15066Y0(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f12152a;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        }
    }

    /* renamed from: A0 */
    public final float mo16067A0(Location location, Location location2) {
        return location.distanceTo(location2);
    }

    /* renamed from: B0 */
    public final void mo16068B0() {
        new C2180b().execute(new Void[0]);
    }

    /* renamed from: C0 */
    public final void mo16069C0(int i, double d, double d2) {
        try {
            new LiveViewModel().get_nearby_bus(new LiveRequest(d, d2)).mo4926j(requireActivity(), new tl0(this, i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: E0 */
    public final void mo16070E0() {
        this.f12210e = false;
        this.f12183b.setVisibility(8);
        this.f12201d.setVisibility(8);
        this.f12197c.setVisibility(0);
        this.f12187b.setBackground(getResources().getDrawable(C1410R.C1411drawable.one_delhi_banner_background));
        this.f12187b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 126.0f, getResources().getDisplayMetrics());
        this.f12187b.requestLayout();
        this.f12171a.setVisibility(0);
        this.f12166a.setVisibility(8);
        this.f12202d.topMargin = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f12203d.setLayoutParams(this.f12202d);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12160a.getLayoutParams();
        this.f12165a = layoutParams;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f12165a.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f12165a.removeRule(1);
        this.f12160a.setLayoutParams(this.f12165a);
        this.f12160a.setBackground(getResources().getDrawable(C1410R.C1411drawable.round_input_transparent));
        this.f12160a.setTextColor(getResources().getColor(C1410R.color.white));
        this.f12160a.setHeight((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f12160a.setHintTextColor(Color.parseColor(pj0.m61166a(-94681566385991L)));
        this.f12160a.setPadding((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()), 0, this.f12218p, 0);
        this.f12195c.setImageResource(C1410R.C1411drawable.ic_search);
        this.f12195c.setColorFilter(r70.m26353f(this.f12157a, C1410R.color.white));
        this.f12162a.setColorFilter(r70.m26353f(this.f12157a, C1410R.color.white));
        RelativeLayout.LayoutParams layoutParams2 = this.f12186b;
        int i = this.f12218p;
        layoutParams2.leftMargin = i;
        layoutParams2.bottomMargin = i;
        layoutParams2.rightMargin = i;
        layoutParams2.topMargin = i / 2;
        this.f12195c.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = this.f12196c;
        int i2 = this.f12218p;
        layoutParams3.leftMargin = i2;
        layoutParams3.bottomMargin = i2;
        layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams4 = this.f12196c;
        layoutParams4.topMargin = this.f12219q;
        layoutParams4.removeRule(21);
        this.f12162a.setVisibility(8);
        this.f12184b.setVisibility(8);
    }

    /* renamed from: J */
    public void mo7854J(boolean z, List<AllStops> list) {
        if (z) {
            ArrayList<AllStops> arrayList = (ArrayList) list;
            this.f12192b = arrayList;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < this.f12192b.size(); i++) {
                    if (mo16085z0(this.f12158a.getLatitude(), this.f12158a.getLongitude(), this.f12192b.get(i).getLat().doubleValue(), this.f12192b.get(i).getLng().doubleValue()) < 1000.0f) {
                        try {
                            od2 c = this.f12175a.mo24962c(new sd2().mo24329e3(new LatLng(this.f12192b.get(i).getLat().doubleValue(), this.f12192b.get(i).getLng().doubleValue())).mo24324Z2(mo16076q0(this.f12157a, C1410R.C1411drawable.ic_bus_stop_updated)).mo24332h3(this.f12192b.get(i).getName()));
                            this.f12214h.put(c.mo21871b(), pj0.m61166a(-95720948471623L));
                            this.f12193b.put(c.mo21871b(), String.valueOf(this.f12192b.get(i).getId()));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        mo16075p0(this.f12192b);
    }

    /* renamed from: W0 */
    public final void mo16071W0(Location location, Location location2) {
        startActivity(new Intent(pj0.m61166a(-94771760699207L), Uri.parse(getResources().getString(C1410R.string.google_directions, new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude())}))));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: X0 */
    public final void mo16072X0() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 b = b82.m11677b(this.f12157a);
        this.f12173a = b;
        z62 z62 = this.f12177a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        b.mo18262A(locationRequest, z62, myLooper);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Z0 */
    public final void mo16073Z0() {
        boolean z;
        boolean z2 = false;
        if (this.f12200c) {
            this.f12175a.mo24940I(true);
            this.f12175a.mo24985r().mo16113o(false);
            this.f12175a.mo24985r().mo16112n(false);
        }
        LocationManager locationManager = (LocationManager) this.f12157a.getSystemService(pj0.m61166a(-95519085008711L));
        try {
            z = locationManager.isProviderEnabled(pj0.m61166a(-95557739714375L));
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(pj0.m61166a(-95574919583559L));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z && !z2) {
            try {
                new C0189c.C0190a(requireActivity()).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new ol0(this)).mo959s(getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if ((z || z2) && this.f12200c) {
            mo16084y0();
        }
    }

    /* renamed from: a */
    public void mo15815a(boolean z, List<AllRoutes> list) {
    }

    /* renamed from: b */
    public void mo15816b(boolean z) {
    }

    /* renamed from: g */
    public void mo15817g(boolean z) {
    }

    /* renamed from: m */
    public void mo7855m(boolean z) {
    }

    /* renamed from: o0 */
    public final void mo16074o0(Double d, Double d2, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7) {
        LatLng latLng = new LatLng(d.doubleValue(), d2.doubleValue());
        int i = str2.equalsIgnoreCase(pj0.m61166a(-95609279321927L)) ? str3.equalsIgnoreCase(pj0.m61166a(-95626459191111L)) ? bool.booleanValue() ? C1410R.C1411drawable.ic_blue_bus : C1410R.C1411drawable.ic_orange_bus : bool.booleanValue() ? C1410R.C1411drawable.ic_red_bus : C1410R.C1411drawable.ic_green_bus : C1410R.C1411drawable.ic_bus_stop_updated;
        if (str4.contains(pj0.m61166a(-95652228994887L))) {
            i = C1410R.C1411drawable.ic_bus_light_blue;
        }
        if (i != -1) {
            od2 c = this.f12175a.mo24962c(new sd2().mo24329e3(latLng).mo24324Z2(mo16076q0(this.f12157a, i)));
            this.f12199c.put(str, c);
            this.f12180a.put(str4, str7);
            this.f12193b.put(c.mo21871b(), str4);
            this.f12214h.put(c.mo21871b(), str2);
        }
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f12157a = context.getApplicationContext();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    @ts2
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        requireActivity().getWindow().clearFlags(8192);
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_directions, viewGroup, false);
        SharedPreferences sharedPreferences = this.f12157a.getSharedPreferences(pj0.m61166a(-94024436389703L), 0);
        this.f12204d = sharedPreferences.getString(pj0.m61166a(-94110335735623L), pj0.m61166a(-94153285408583L));
        this.f12208e = sharedPreferences.getString(pj0.m61166a(-94157580375879L), pj0.m61166a(-94204825016135L));
        this.f12220r = sharedPreferences.getInt(pj0.m61166a(-94209119983431L), 0);
        this.f12221s = sharedPreferences.getInt(pj0.m61166a(-94264954558279L), 0);
        this.f12169a = (MapView) inflate.findViewById(C1410R.C1412id.mapView);
        this.f12171a = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_curLocation);
        this.f12187b = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_main);
        this.f12197c = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_banner);
        this.f12203d = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_search);
        this.f12167a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_stops);
        this.f12160a = (AutoCompleteTextView) inflate.findViewById(C1410R.C1412id.edit_destination_stop);
        this.f12183b = (AutoCompleteTextView) inflate.findViewById(C1410R.C1412id.edit_starting_stop);
        this.f12162a = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_destination);
        this.f12184b = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_source);
        this.f12195c = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_back_1);
        this.f12201d = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_swap);
        this.f12166a = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_filterResults);
        this.f12164a = (ListView) inflate.findViewById(C1410R.C1412id.lv_filterResults);
        this.f12185b = (ListView) inflate.findViewById(C1410R.C1412id.lv_pastSearches);
        this.f12161a = (Button) inflate.findViewById(C1410R.C1412id.btn_search_route);
        this.f12163a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_settings);
        this.f12207e = (RelativeLayout.LayoutParams) this.f12171a.getLayoutParams();
        this.f12217o = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f12216n = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f12219q = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f12218p = applyDimension;
        this.f12207e.setMargins(0, 0, applyDimension, (int) TypedValue.applyDimension(1, 72.0f, getResources().getDisplayMetrics()));
        f12152a = (InputMethodManager) requireActivity().getSystemService(pj0.m61166a(-94350853904199L));
        this.f12169a.mo10627b(bundle);
        mo16068B0();
        this.f12172a = FirebaseAnalytics.getInstance(getContext());
        Bundle bundle2 = new Bundle();
        bundle2.putString(pj0.m61166a(-94406688479047L), pj0.m61166a(-94449638152007L));
        this.f12172a.mo29667c(pj0.m61166a(-94535537497927L), bundle2);
        this.f12169a.mo10626a(new vl0(this));
        if (bundle != null) {
            this.f12182b = (Location) bundle.getParcelable(pj0.m61166a(-94621436843847L));
        }
        this.f12173a = b82.m11677b(this.f12157a);
        this.f12171a.setOnClickListener(new yl0(this));
        this.f12201d.setOnClickListener(new zl0(this));
        this.f12161a.setOnClickListener(new cm0(this, bundle2));
        if (this.f12198c.equalsIgnoreCase(pj0.m61166a(-94660091549511L))) {
            this.f12198c = pj0.m61166a(-94664386516807L);
        }
        this.f12184b.setOnClickListener(new wl0(this));
        this.f12162a.setOnClickListener(new bm0(this));
        this.f12186b = (RelativeLayout.LayoutParams) this.f12195c.getLayoutParams();
        this.f12196c = (RelativeLayout.LayoutParams) this.f12162a.getLayoutParams();
        this.f12202d = (RelativeLayout.LayoutParams) this.f12203d.getLayoutParams();
        this.f12183b.setOnTouchListener(new dm0(this));
        this.f12160a.setOnTouchListener(new em0(this));
        this.f12163a.setOnClickListener(new xl0(this));
        this.f12195c.setOnClickListener(new am0(this));
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12169a.mo10628c();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f12169a.mo10631f();
    }

    public void onPause() {
        super.onPause();
        this.f12206d = false;
        this.f12178a = Boolean.FALSE;
        this.f12194b = false;
        this.f12173a.mo18275n(this.f12177a);
        this.f12169a.mo10632g();
        this.f12166a.setVisibility(8);
        this.f12164a.setVisibility(8);
        mo16070E0();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-95231322199879L))) {
                    if (iArr[i2] >= 0) {
                        z = true;
                    } else {
                        Toast.makeText(this.f12157a, pj0.m61166a(-95403120891719L), 0).show();
                    }
                }
            }
            if (z) {
                mo16073Z0();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f12206d = true;
        this.f12190b = Boolean.FALSE;
        this.f12210e = true;
        this.f12169a.mo10633h();
        if (this.f12158a.getLatitude() != 0.0d) {
            mo16081v0(Double.valueOf(this.f12158a.getLatitude()), Double.valueOf(this.f12158a.getLongitude()));
        }
        mo16070E0();
        if (this.f12198c.equalsIgnoreCase(pj0.m61166a(-95682293765959L))) {
            this.f12198c = pj0.m61166a(-95686588733255L);
        }
        if (this.f12198c.equalsIgnoreCase(pj0.m61166a(-95703768602439L))) {
            LatLng latLng = this.f12170a;
            if (latLng != null) {
                mo16069C0(0, latLng.f7562a, latLng.f7563b);
            } else if (this.f12158a.getLatitude() != 0.0d) {
                mo16069C0(0, this.f12158a.getLatitude(), this.f12158a.getLongitude());
            }
            mo16083x0();
            mo16082w0();
            return;
        }
        mo16079t0();
        mo16080u0();
    }

    /* renamed from: p0 */
    public final void mo16075p0(List<AllStops> list) {
        if (list != null) {
            try {
                C3596te teVar = new C3596te(requireActivity(), C1410R.layout.dropdown_pis, list);
                this.f12160a.setThreshold(1);
                this.f12183b.setThreshold(1);
                this.f12164a.setAdapter(teVar);
                this.f12164a.setOnItemClickListener(this.f12159a);
                this.f12160a.addTextChangedListener(new C2182d(teVar));
                this.f12183b.addTextChangedListener(new C2183e(teVar));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f12160a.setEnabled(false);
            Toast.makeText(requireActivity(), getResources().getString(C1410R.string.fetch_problem), 1).show();
        }
    }

    /* renamed from: q0 */
    public final C3798vl mo16076q0(Context context, int i) {
        Bitmap bitmap;
        Drawable i2 = r70.m26356i(context, i);
        if (i2 != null) {
            i2.setBounds(0, 0, i2.getIntrinsicWidth(), i2.getIntrinsicHeight());
            bitmap = Bitmap.createBitmap(i2.getIntrinsicWidth(), i2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            i2.draw(new Canvas(bitmap));
        }
        return C3858wl.m30941d(bitmap);
    }

    /* renamed from: r0 */
    public final void mo16077r0() {
        boolean z = r70.m26348a(this.f12157a, pj0.m61166a(-94887724816199L)) == 0;
        this.f12200c = z;
        if (!z) {
            C3962y2.m31859G(requireActivity(), new String[]{pj0.m61166a(-95059523508039L)}, 123);
        } else {
            mo16073Z0();
        }
    }

    /* renamed from: s0 */
    public final void mo16078s0() {
        th1 th1 = this.f12175a;
        if (th1 != null) {
            th1.mo24976j();
        }
        this.f12199c.clear();
        this.f12180a.clear();
        this.f12214h.clear();
        this.f12193b.clear();
    }

    /* renamed from: t0 */
    public final void mo16079t0() {
        mo16078s0();
        this.f12209e.clear();
        this.f12205d.clear();
        try {
            ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getAllRouteLiveDataDMRC().mo4926j(requireActivity(), new ql0(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: u */
    public void mo7860u(boolean z) {
        if (z) {
            C2456iq.m17796o(getActivity(), this, this.f12192b);
        }
    }

    /* renamed from: u0 */
    public final void mo16080u0() {
        mo16078s0();
        this.f12209e.clear();
        this.f12205d.clear();
        ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getAllStopsLiveDataDMRC().mo4926j(requireActivity(), new rl0(this));
    }

    /* renamed from: v0 */
    public final void mo16081v0(Double d, Double d2) {
        if (!this.f12190b.booleanValue()) {
            mo16078s0();
            this.f12190b = Boolean.TRUE;
            ArrayList<AllStops> arrayList = this.f12192b;
            if (arrayList != null) {
                this.f12181a = arrayList;
                if (!arrayList.isEmpty()) {
                    for (int i = 0; i < this.f12181a.size(); i++) {
                        if (mo16085z0(d.doubleValue(), d2.doubleValue(), this.f12181a.get(i).getLat().doubleValue(), this.f12181a.get(i).getLng().doubleValue()) < 1000.0f) {
                            try {
                                od2 c = this.f12175a.mo24962c(new sd2().mo24329e3(new LatLng(this.f12181a.get(i).getLat().doubleValue(), this.f12181a.get(i).getLng().doubleValue())).mo24324Z2(mo16076q0(this.f12157a, C1410R.C1411drawable.ic_bus_stop_updated)).mo24332h3(this.f12181a.get(i).getName()));
                                this.f12214h.put(c.mo21871b(), pj0.m61166a(-94724516058951L));
                                this.f12193b.put(c.mo21871b(), String.valueOf(this.f12181a.get(i).getId()));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void mo16082w0() {
        GenericRequest genericRequest = new GenericRequest(this.f12204d, this.f12208e);
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        if (this.f12220r != this.f12221s) {
            dataViewModel.getAllStopsLiveDataDIMTS(genericRequest, true, getContext(), this.f12221s).mo4926j(this, new sl0(this));
        } else {
            C2456iq.m17794m(getActivity(), this);
        }
    }

    /* renamed from: x0 */
    public final void mo16083x0() {
        Handler handler = new Handler();
        handler.postDelayed(new C2184f(handler), 10000);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y0 */
    public final void mo16084y0() {
        this.f12173a.mo18272U().mo17573e(new ul0(this));
    }

    /* renamed from: z0 */
    public final float mo16085z0(double d, double d2, double d3, double d4) {
        Location location = new Location(pj0.m61166a(-94763170764615L));
        location.setLatitude(d);
        location.setLongitude(d2);
        Location location2 = new Location(pj0.m61166a(-94767465731911L));
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        return location.distanceTo(location2);
    }
}
