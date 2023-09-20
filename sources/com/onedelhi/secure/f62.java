package com.onedelhi.secure;

import android.annotation.SuppressLint;
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
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.MetroMapActivity;
import com.delhitransport.onedelhi.activities.NotificationsActivity;
import com.delhitransport.onedelhi.activities.RouteInfoActivity;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.delhitransport.onedelhi.activities.StopInfoActivity;
import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
import com.delhitransport.onedelhi.live.RouteSearchData;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.RouteSearches;
import com.delhitransport.onedelhi.viewmodels.DataViewModel;
import com.delhitransport.onedelhi.viewmodels.LiveViewModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.th1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@SuppressLint({"MissingPermission"})
public class f62 extends Fragment implements kv2, jv2, hu4 {

    /* renamed from: a */
    public static InputMethodManager f11843a = null;

    /* renamed from: f */
    public static final String f11844f = pj0.m61166a(-102983738169159L);

    /* renamed from: v */
    public static final int f11845v = 123;

    /* renamed from: w */
    public static final int f11846w = 15;

    /* renamed from: a */
    public Context f11847a;

    /* renamed from: a */
    public SharedPreferences f11848a;

    /* renamed from: a */
    public final Location f11849a = new Location(pj0.m61166a(-99796872435527L));

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f11850a;

    /* renamed from: a */
    public AutoCompleteTextView f11851a;

    /* renamed from: a */
    public ImageButton f11852a;

    /* renamed from: a */
    public ImageView f11853a;

    /* renamed from: a */
    public ListView f11854a;

    /* renamed from: a */
    public RelativeLayout.LayoutParams f11855a;

    /* renamed from: a */
    public RelativeLayout f11856a;

    /* renamed from: a */
    public RecyclerView f11857a;

    /* renamed from: a */
    public MapView f11858a;

    /* renamed from: a */
    public LatLng f11859a = null;

    /* renamed from: a */
    public BottomSheetBehavior f11860a;

    /* renamed from: a */
    public FloatingActionButton f11861a;

    /* renamed from: a */
    public gu4 f11862a;

    /* renamed from: a */
    public jd1 f11863a;

    /* renamed from: a */
    public lz2 f11864a;

    /* renamed from: a */
    public th1 f11865a;

    /* renamed from: a */
    public yn2 f11866a;

    /* renamed from: a */
    public final z62 f11867a;

    /* renamed from: a */
    public Boolean f11868a;

    /* renamed from: a */
    public ArrayList<AllRoutes> f11869a;

    /* renamed from: a */
    public final HashMap<String, String> f11870a = new HashMap<>();

    /* renamed from: a */
    public List<AllStops> f11871a;

    /* renamed from: b */
    public Location f11872b;

    /* renamed from: b */
    public ImageButton f11873b;

    /* renamed from: b */
    public ImageView f11874b;

    /* renamed from: b */
    public ListView f11875b;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f11876b;

    /* renamed from: b */
    public RelativeLayout f11877b;

    /* renamed from: b */
    public LatLng f11878b = null;

    /* renamed from: b */
    public Boolean f11879b;

    /* renamed from: b */
    public String f11880b;

    /* renamed from: b */
    public ArrayList<AllStops> f11881b;

    /* renamed from: b */
    public final HashMap<String, String> f11882b = new HashMap<>();

    /* renamed from: b */
    public List<AllStops> f11883b;

    /* renamed from: b */
    public boolean f11884b = false;

    /* renamed from: c */
    public RelativeLayout.LayoutParams f11885c;

    /* renamed from: c */
    public RelativeLayout f11886c;

    /* renamed from: c */
    public String f11887c = pj0.m61166a(-99801167402823L);

    /* renamed from: c */
    public ArrayList<AllStops> f11888c;

    /* renamed from: c */
    public final HashMap<String, Long> f11889c = new HashMap<>();

    /* renamed from: c */
    public boolean f11890c;

    /* renamed from: d */
    public RelativeLayout.LayoutParams f11891d;

    /* renamed from: d */
    public RelativeLayout f11892d;

    /* renamed from: d */
    public String f11893d;

    /* renamed from: d */
    public final HashMap<String, od2> f11894d = new HashMap<>();

    /* renamed from: d */
    public boolean f11895d;

    /* renamed from: e */
    public RelativeLayout.LayoutParams f11896e;

    /* renamed from: e */
    public RelativeLayout f11897e;

    /* renamed from: e */
    public String f11898e;

    /* renamed from: e */
    public final HashMap<String, String> f11899e = new HashMap<>();

    /* renamed from: e */
    public boolean f11900e = false;

    /* renamed from: f */
    public RelativeLayout f11901f;

    /* renamed from: f */
    public final HashMap<String, String> f11902f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, List<String>> f11903g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<List<String>, List<String>> f11904h = new HashMap<>();

    /* renamed from: i */
    public final HashMap<String, String> f11905i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, String> f11906j = new HashMap<>();

    /* renamed from: n */
    public int f11907n;

    /* renamed from: o */
    public int f11908o;

    /* renamed from: p */
    public int f11909p;

    /* renamed from: q */
    public int f11910q;

    /* renamed from: r */
    public int f11911r;

    /* renamed from: s */
    public int f11912s;

    /* renamed from: t */
    public int f11913t;

    /* renamed from: u */
    public int f11914u;

    /* renamed from: com.onedelhi.secure.f62$a */
    public class C2119a implements TextWatcher {
        public C2119a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (f62.this.f11851a.getText().toString().equals(pj0.m61166a(-99483339822919L))) {
                f62.this.f11852a.setVisibility(8);
                f62.this.f11854a.setVisibility(8);
                f62.this.f11875b.setVisibility(0);
                return;
            }
            f62.this.f11852a.setVisibility(0);
            f62.this.f11854a.setVisibility(0);
            f62.this.f11875b.setVisibility(8);
        }
    }

    /* renamed from: com.onedelhi.secure.f62$b */
    public class C2120b implements AdapterView.OnItemClickListener {
        public C2120b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            f62.this.mo15811W0();
            f62.this.f11861a.setVisibility(0);
            List list = (List) adapterView.getItemAtPosition(i);
            f62.this.f11851a.setText(((String) list.get(0)).split(pj0.m61166a(-99384555575111L))[0].substring(1));
            String[] split = ((String) list.get(1)).split(pj0.m61166a(-99393145509703L));
            String substring = split[2].substring(1);
            split[0].substring(1);
            split[1].substring(1);
            pj0.m61166a(-99401735444295L);
            Boolean unused = f62.this.f11868a = Boolean.TRUE;
            Intent intent = new Intent(f62.this.f11847a, RouteInfoActivity.class);
            intent.putExtra(pj0.m61166a(-99418915313479L), substring);
            intent.putExtra(pj0.m61166a(-99444685117255L), pj0.m61166a(-99466159953735L));
            f62.this.startActivity(intent);
            f62.this.mo15812X0();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.f62$c */
    public class C2121c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final RouteSearches f11917a = new RouteSearches();

        /* renamed from: a */
        public final /* synthetic */ String f11919a;

        /* renamed from: b */
        public final /* synthetic */ String f11920b;

        /* renamed from: c */
        public final /* synthetic */ String f11921c;

        /* renamed from: d */
        public final /* synthetic */ String f11922d;

        public C2121c(String str, String str2, String str3, String str4) {
            this.f11919a = str;
            this.f11920b = str2;
            this.f11921c = str3;
            this.f11922d = str4;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                this.f11917a.setRoute_name(this.f11919a);
                this.f11917a.setTerminal(this.f11920b);
                this.f11917a.setSource(this.f11921c);
                this.f11917a.setType(this.f11922d);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(f62.this.f11847a).getAppDatabase().routeSearchDao().insert(this.f11917a);
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

    /* renamed from: com.onedelhi.secure.f62$d */
    public class C2122d extends BottomSheetBehavior.C1503f {
        public C2122d() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            switch (i) {
                case 1:
                case 2:
                case 6:
                    f62.this.f11861a.setVisibility(8);
                    f62.this.f11853a.setVisibility(8);
                    f62.this.f11851a.setVisibility(0);
                    return;
                case 3:
                    f62.this.f11851a.setVisibility(0);
                    f62.this.f11861a.setVisibility(8);
                    f62.this.f11853a.setVisibility(8);
                    return;
                case 4:
                    f62.this.f11853a.setVisibility(8);
                    f62.this.f11861a.setVisibility(0);
                    f62.this.f11851a.setVisibility(0);
                    if (f62.this.mo15814Z0()) {
                        f62.this.f11896e.setMargins(0, 0, f62.this.f11909p, (int) TypedValue.applyDimension(1, 200.0f, f62.this.getResources().getDisplayMetrics()));
                        return;
                    }
                    return;
                case 5:
                    f62.this.f11851a.setVisibility(0);
                    f62.this.f11861a.setVisibility(0);
                    f62.this.f11853a.setVisibility(0);
                    if (f62.this.mo15814Z0()) {
                        f62.this.f11896e.setMargins(0, 0, f62.this.f11909p, (int) TypedValue.applyDimension(1, 12.0f, f62.this.getResources().getDisplayMetrics()));
                    }
                    f62 f62 = f62.this;
                    f62.f11852a.setLayoutParams(f62.f11885c);
                    return;
                default:
                    return;
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.f62$e */
    public class C2123e extends AsyncTask<Void, Void, List<RouteSearchData>> {
        public C2123e() {
        }

        /* renamed from: a */
        public List<RouteSearchData> doInBackground(Void... voidArr) {
            try {
                return DatabaseClient.getInstance(f62.this.f11847a).getAppDatabase().routeSearchDao().getAll();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(List<RouteSearchData> list) {
            super.onPostExecute(list);
            f62.this.f11903g.clear();
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    arrayList.clear();
                    arrayList.add(list.get(i).getType());
                    arrayList.add(list.get(i).getSource());
                    arrayList.add(list.get(i).getTerminal());
                    f62.this.f11903g.put(list.get(i).getRoute_name(), arrayList);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.f62$f */
    public class C2124f extends z62 {
        public C2124f() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            f62.this.f11865a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 15.0f));
            f62.this.f11849a.setLatitude(M2.getLatitude());
            f62.this.f11849a.setLongitude(M2.getLongitude());
            if (f62.this.f11872b != null) {
                LatLng unused = f62.this.f11878b = new LatLng(f62.this.f11872b.getLatitude(), f62.this.f11872b.getLongitude());
                LatLng unused2 = f62.this.f11859a = new LatLng(f62.this.f11872b.getLatitude(), f62.this.f11872b.getLongitude());
                f62.this.f11865a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(f62.this.f11849a.getLatitude(), f62.this.f11849a.getLongitude())).mo10680e(15.0f).mo10677b()));
                return;
            }
            f62.this.mo15805Q0();
        }
    }

    /* renamed from: com.onedelhi.secure.f62$g */
    public class C2125g implements TextWatcher {
        public C2125g() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (f62.this.f11851a.getText().toString().equals(pj0.m61166a(-99487634790215L))) {
                f62.this.f11852a.setVisibility(8);
                f62.this.f11854a.setVisibility(8);
                f62.this.f11875b.setVisibility(0);
                return;
            }
            f62.this.f11852a.setVisibility(0);
            f62.this.f11854a.setVisibility(0);
            f62.this.f11875b.setVisibility(8);
        }
    }

    /* renamed from: com.onedelhi.secure.f62$h */
    public class C2126h implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C3839we f11928a;

        public C2126h(C3839we weVar) {
            this.f11928a = weVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (f62.this.f11851a.getText().toString().equals(pj0.m61166a(-99491929757511L))) {
                f62.this.f11852a.setVisibility(8);
                f62.this.f11854a.setVisibility(8);
                f62.this.f11875b.setVisibility(0);
            } else {
                f62.this.f11852a.setVisibility(0);
                f62.this.f11854a.setVisibility(0);
                f62.this.f11875b.setVisibility(8);
            }
            this.f11928a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.f62$i */
    public class C2127i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Handler f11929a;

        public C2127i(Handler handler) {
            this.f11929a = handler;
        }

        public void run() {
            if (f62.this.f11895d) {
                if (f62.this.f11859a != null) {
                    f62 f62 = f62.this;
                    f62.mo15810V0(1, f62.f11859a.f7562a, f62.this.f11859a.f7563b);
                }
                this.f11929a.postDelayed(this, rf4.f19824c);
                return;
            }
            this.f11929a.removeCallbacks(this);
        }
    }

    /* renamed from: com.onedelhi.secure.f62$j */
    public class C2128j implements Runnable {

        /* renamed from: a */
        public float f11931a;

        /* renamed from: a */
        public final /* synthetic */ Handler f11932a;

        /* renamed from: a */
        public final /* synthetic */ Interpolator f11933a;

        /* renamed from: a */
        public final /* synthetic */ LatLng f11934a;

        /* renamed from: a */
        public final /* synthetic */ od2 f11936a;

        /* renamed from: b */
        public float f11937b;

        /* renamed from: b */
        public long f11938b;

        /* renamed from: b */
        public final /* synthetic */ LatLng f11939b;

        /* renamed from: c */
        public final /* synthetic */ float f11940c;

        /* renamed from: c */
        public final /* synthetic */ long f11941c;

        public C2128j(long j, float f, Interpolator interpolator, LatLng latLng, LatLng latLng2, od2 od2, Handler handler) {
            this.f11941c = j;
            this.f11940c = f;
            this.f11933a = interpolator;
            this.f11934a = latLng;
            this.f11939b = latLng2;
            this.f11936a = od2;
            this.f11932a = handler;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f11941c;
            this.f11938b = uptimeMillis;
            float f = ((float) uptimeMillis) / this.f11940c;
            this.f11931a = f;
            this.f11937b = this.f11933a.getInterpolation(f);
            LatLng latLng = this.f11934a;
            double d = latLng.f7562a;
            float f2 = this.f11931a;
            LatLng latLng2 = this.f11939b;
            this.f11936a.mo21892u(new LatLng((d * ((double) (1.0f - f2))) + (latLng2.f7562a * ((double) f2)), (latLng.f7563b * ((double) (1.0f - f2))) + (latLng2.f7563b * ((double) f2))));
            if (this.f11931a < 1.0f) {
                this.f11932a.postDelayed(this, 16);
            } else {
                this.f11936a.mo21897z(true);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.f62$k */
    public class C2129k implements th1.C3608b {
        public C2129k() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x01a0  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo7564b(com.onedelhi.secure.od2 r11) {
            /*
                r10 = this;
                com.onedelhi.secure.f62 r0 = com.onedelhi.secure.f62.this
                java.util.HashMap r0 = r0.f11905i
                java.lang.String r1 = r11.mo21871b()
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r1 = -99496224724807(0xffffa5823ade68b9, double:NaN)
                java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
                boolean r0 = r0.equalsIgnoreCase(r1)
                r1 = 0
                if (r0 == 0) goto L_0x01d7
                com.onedelhi.secure.f62 r0 = com.onedelhi.secure.f62.this
                boolean r0 = r0.mo15814Z0()
                if (r0 == 0) goto L_0x01d7
                com.onedelhi.secure.f62 r0 = com.onedelhi.secure.f62.this
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                r2 = 2131558515(0x7f0d0073, float:1.8742348E38)
                android.view.View r0 = r0.inflate(r2, r1)
                r1 = 2131362817(0x7f0a0401, float:1.8345425E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2 = 2131362713(0x7f0a0399, float:1.8345214E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r3 = 2131362839(0x7f0a0417, float:1.834547E38)
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r4 = 2131362853(0x7f0a0425, float:1.8345498E38)
                android.view.View r4 = r0.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                com.onedelhi.secure.f62 r5 = com.onedelhi.secure.f62.this
                java.util.HashMap r5 = r5.f11882b
                java.lang.String r6 = r11.mo21871b()
                java.lang.Object r5 = r5.get(r6)
                java.lang.String r5 = (java.lang.String) r5
                r2.setText(r5)
                long r6 = java.lang.System.currentTimeMillis()
                r8 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 / r8
                com.onedelhi.secure.f62 r2 = com.onedelhi.secure.f62.this
                java.util.HashMap r2 = r2.f11889c
                java.lang.String r11 = r11.mo21871b()
                java.lang.Object r11 = r2.get(r11)
                java.lang.Long r11 = (java.lang.Long) r11
                long r8 = r11.longValue()
                long r6 = r6 - r8
                java.lang.Long r11 = java.lang.Long.valueOf(r6)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r6 = -99513404593991(0xffffa57e3ade68b9, double:NaN)
                java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
                r2.append(r6)
                com.onedelhi.secure.f62 r6 = com.onedelhi.secure.f62.this
                java.lang.String r11 = r6.mo15820z1(r11)
                r2.append(r11)
                r6 = -99552059299655(0xffffa5753ade68b9, double:NaN)
                java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                r4.setText(r11)
                com.onedelhi.secure.f62 r11 = com.onedelhi.secure.f62.this
                java.util.HashMap r11 = r11.f11870a
                java.lang.Object r11 = r11.get(r5)
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99573534136135(0xffffa5703ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x00f4
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99590714005319(0xffffa56c3ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99607893874503(0xffffa5683ade68b9, double:NaN)
            L_0x00ea:
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                java.lang.String r11 = r11.replace(r2, r4)
                goto L_0x018d
            L_0x00f4:
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99612188841799(0xffffa5673ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x011a
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99637958645575(0xffffa5613ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99663728449351(0xffffa55b3ade68b9, double:NaN)
                goto L_0x00ea
            L_0x011a:
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99668023416647(0xffffa55a3ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x0140
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99680908318535(0xffffa5573ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99693793220423(0xffffa5543ade68b9, double:NaN)
                goto L_0x00ea
            L_0x0140:
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99698088187719(0xffffa5533ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x0166
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99710973089607(0xffffa5503ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99723857991495(0xffffa54d3ade68b9, double:NaN)
                goto L_0x00ea
            L_0x0166:
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99728152958791(0xffffa54c3ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x018d
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99749627795271(0xffffa5473ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99771102631751(0xffffa5423ade68b9, double:NaN)
                goto L_0x00ea
            L_0x018d:
                java.lang.String r2 = r11.toUpperCase()
                r6 = -99775397599047(0xffffa5413ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x01ba
                java.lang.String r11 = r11.toUpperCase()
                r6 = -99783987533639(0xffffa53f3ade68b9, double:NaN)
                java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r6)
                r6 = -99792577468231(0xffffa53d3ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
                java.lang.String r11 = r11.replace(r2, r4)
            L_0x01ba:
                r1.setText(r11)
                com.onedelhi.secure.f62 r11 = com.onedelhi.secure.f62.this
                java.util.HashMap r11 = r11.f11899e
                com.onedelhi.secure.f62 r1 = com.onedelhi.secure.f62.this
                java.util.HashMap r1 = r1.f11870a
                java.lang.Object r1 = r1.get(r5)
                java.lang.Object r11 = r11.get(r1)
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r3.setText(r11)
                return r0
            L_0x01d7:
                com.onedelhi.secure.f62 r0 = com.onedelhi.secure.f62.this
                boolean r0 = r0.mo15814Z0()
                if (r0 == 0) goto L_0x01fc
                com.onedelhi.secure.f62 r0 = com.onedelhi.secure.f62.this
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                r2 = 2131558516(0x7f0d0074, float:1.874235E38)
                android.view.View r1 = r0.inflate(r2, r1)
                r0 = 2131362834(0x7f0a0412, float:1.834546E38)
                android.view.View r0 = r1.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r11 = r11.mo21877g()
                r0.setText(r11)
            L_0x01fc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f62.C2129k.mo7564b(com.onedelhi.secure.od2):android.view.View");
        }

        /* renamed from: f */
        public View mo7565f(@vr2 od2 od2) {
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.f62$l */
    public class C2130l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Double f11944a;

        /* renamed from: b */
        public final /* synthetic */ Double f11945b;

        public C2130l(Double d, Double d2) {
            this.f11944a = d;
            this.f11945b = d2;
        }

        public void run() {
            f62.this.mo15803O0(this.f11944a, this.f11945b);
        }
    }

    public f62() {
        Boolean bool = Boolean.FALSE;
        this.f11868a = bool;
        this.f11850a = new C2120b();
        this.f11879b = bool;
        this.f11883b = new ArrayList();
        this.f11867a = new C2124f();
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m14666a1() {
        go3.m15970o(getActivity(), this, this.f11869a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m14668b1() {
        C2456iq.m17796o(getActivity(), this, this.f11888c);
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m14670c1(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null && mo15814Z0() && !allStopsResponse.getAll_stops().isEmpty()) {
            this.f11888c = allStopsResponse.getAll_stops();
            C2456iq.m17793l(getActivity(), this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ void m14672d1(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null && mo15814Z0()) {
            this.f11869a = allRouteResponse.getAll_routes();
            go3.m15967l(getActivity(), this);
            for (int i = 0; i < this.f11869a.size(); i++) {
                this.f11899e.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getEnd());
                this.f11902f.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getStart());
                this.f11906j.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getEnd());
            }
            mo15794F0(this.f11869a, pj0.m61166a(-102657320654663L));
            this.f11851a.addTextChangedListener(new C2125g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ void m14674e1(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null && mo15814Z0()) {
            this.f11869a = allRouteResponse.getAll_routes();
            for (int i = 0; i < this.f11869a.size(); i++) {
                this.f11899e.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getEnd());
                this.f11902f.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getStart());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m14676f1(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null && mo15814Z0()) {
            this.f11881b = allStopsResponse.getAll_stops();
            for (int i = 0; i < this.f11881b.size(); i++) {
                this.f11905i.put(this.f11865a.mo24962c(new sd2().mo24329e3(new LatLng(this.f11881b.get(i).getLat().doubleValue(), this.f11881b.get(i).getLng().doubleValue())).mo24324Z2(C3858wl.m30941d(Bitmap.createScaledBitmap(((BitmapDrawable) zk3.m33204g(getResources(), C1410R.C1411drawable.metro_statio, (Resources.Theme) null)).getBitmap(), this.f11907n, this.f11908o, false))).mo24332h3(this.f11881b.get(i).getName())).mo21871b(), pj0.m61166a(-102631550850887L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m14678g1(w94 w94) {
        if (!w94.mo17590v() || !mo15814Z0()) {
            if (this.f11847a != null && mo15814Z0()) {
                Toast.makeText(this.f11847a, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
            }
            startActivity(new Intent(pj0.m61166a(-102270773598023L)));
            return;
        }
        Location location = (Location) w94.mo17586r();
        this.f11872b = location;
        if (location != null) {
            th1 th1 = this.f11865a;
            if (th1 != null) {
                th1.mo24990w(C3743ut.m29571e(new LatLng(this.f11872b.getLatitude(), this.f11872b.getLongitude()), 15.0f));
                this.f11849a.setLatitude(this.f11872b.getLatitude());
                this.f11849a.setLongitude(this.f11872b.getLongitude());
                this.f11878b = new LatLng(this.f11872b.getLatitude(), this.f11872b.getLongitude());
                this.f11859a = new LatLng(this.f11872b.getLatitude(), this.f11872b.getLongitude());
                this.f11865a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f11849a.getLatitude(), this.f11849a.getLongitude())).mo10680e(15.0f).mo10677b()));
                mo15803O0(Double.valueOf(this.f11849a.getLatitude()), Double.valueOf(this.f11849a.getLongitude()));
                mo15810V0(0, this.f11849a.getLatitude(), this.f11849a.getLongitude());
                return;
            }
            return;
        }
        mo15819y1();
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m14680h1(int i, List list) {
        long j;
        Context context;
        List list2 = list;
        if (list2 == null || !mo15814Z0()) {
            context = this.f11847a;
            if (context != null) {
                j = -102051730265927L;
            } else {
                return;
            }
        } else if (i != 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                LiveItem liveItem = (LiveItem) list2.get(i2);
                LatLng latLng = new LatLng(Double.parseDouble(liveItem.getLat()), Double.parseDouble(liveItem.getLon()));
                String id = liveItem.getId();
                this.f11880b = id;
                String str = this.f11870a.get(id);
                od2 od2 = this.f11894d.get(this.f11880b);
                if (od2 != null) {
                    if (str != null && !str.equalsIgnoreCase(liveItem.getRoute())) {
                        mo15792C1(liveItem.getId(), liveItem.getRoute(), od2, liveItem.getAgency(), liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-101978715821895L)), Long.valueOf(String.valueOf(liveItem.getTimestamp())));
                    }
                    mo15818x1(od2, latLng, liveItem.getTimestamp());
                    od2.mo21896y(pj0.m61166a(-101991600723783L));
                    this.f11894d.put(this.f11880b, od2);
                    this.f11870a.put(this.f11880b, liveItem.getRoute());
                } else {
                    mo15793E0(Double.valueOf(Double.parseDouble(liveItem.getLat())), Double.valueOf(Double.parseDouble(liveItem.getLon())), liveItem.getId(), pj0.m61166a(-101995895691079L), liveItem.getAgency(), Boolean.valueOf(liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-102013075560263L))), liveItem.getId(), liveItem.getTimestamp(), pj0.m61166a(-102025960462151L), liveItem.getRoute());
                }
            }
            return;
        } else if (list.size() > 0) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                LiveItem liveItem2 = (LiveItem) list2.get(i3);
                mo15793E0(Double.valueOf(Double.parseDouble(liveItem2.getLat())), Double.valueOf(Double.parseDouble(liveItem2.getLon())), liveItem2.getId(), pj0.m61166a(-101703837914951L), liveItem2.getAgency(), Boolean.valueOf(liveItem2.getAc().equalsIgnoreCase(pj0.m61166a(-101721017784135L))), liveItem2.getId(), liveItem2.getTimestamp(), pj0.m61166a(-101733902686023L), liveItem2.getRoute());
            }
            return;
        } else {
            context = this.f11847a;
            j = -101759672489799L;
        }
        Toast.makeText(context, pj0.m61166a(j), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m14682i1() {
        if (this.f11887c.equalsIgnoreCase(pj0.m61166a(-102957968365383L))) {
            double d = this.f11865a.mo24978k().f7555a.f7562a;
            double d2 = this.f11865a.mo24978k().f7555a.f7563b;
            Location location = new Location(pj0.m61166a(-102975148234567L));
            Location location2 = new Location(pj0.m61166a(-102979443201863L));
            location.setLatitude(d);
            location.setLongitude(d2);
            this.f11859a = new LatLng(d, d2);
            try {
                location2.setLatitude(this.f11878b.f7562a);
                location2.setLongitude(this.f11878b.f7563b);
            } catch (Exception e) {
                location2.setLatitude(d);
                location2.setLongitude(d2);
                e.printStackTrace();
            }
            if (mo15806R0(location2, location) > 1000.0f) {
                this.f11879b = Boolean.FALSE;
                mo15797I0();
                mo15803O0(Double.valueOf(d), Double.valueOf(d2));
                mo15810V0(0, d, d2);
                this.f11878b = this.f11859a;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m14684j1(od2 od2) {
        Intent intent;
        if (this.f11905i.get(od2.mo21871b()).equalsIgnoreCase(pj0.m61166a(-102824824379207L))) {
            intent = new Intent(this.f11847a, RouteInfoActivity.class);
            intent.putExtra(pj0.m61166a(-102842004248391L), this.f11870a.get(this.f11882b.get(od2.mo21871b())));
        } else if (this.f11905i.get(od2.mo21871b()).equalsIgnoreCase(pj0.m61166a(-102867774052167L))) {
            intent = new Intent(this.f11847a, StopInfoActivity.class);
            intent.putExtra(pj0.m61166a(-102906428757831L), Integer.parseInt(this.f11882b.get(od2.mo21871b())));
            intent.putExtra(pj0.m61166a(-102940788496199L), this.f11849a);
        } else {
            return;
        }
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m14686k1(AdapterView adapterView, View view, int i, long j) {
        mo15812X0();
        mo15811W0();
        ArrayList arrayList = (ArrayList) adapterView.getItemAtPosition(i);
        try {
            Intent intent = new Intent(this.f11847a, RouteInfoActivity.class);
            intent.putExtra(pj0.m61166a(-102717450196807L), (String) arrayList.get(0));
            startActivity(intent);
            this.f11868a = Boolean.TRUE;
            this.f11900e = true;
        } catch (Exception e) {
            Toast.makeText(this.f11847a, pj0.m61166a(-102743220000583L), 0).show();
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ boolean m14688l1(View view, MotionEvent motionEvent) {
        if (this.f11860a.mo11277v0() != 3) {
            this.f11886c.setVisibility(8);
            this.f11897e.setVisibility(8);
            this.f11853a.setVisibility(8);
            this.f11884b = true;
            this.f11901f.setVisibility(8);
            this.f11900e = true;
            this.f11861a.setVisibility(8);
            this.f11873b.setImageResource(C1410R.C1411drawable.ic_back_arrow);
            RelativeLayout.LayoutParams layoutParams = this.f11876b;
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            this.f11873b.setPadding(0, 0, 0, 0);
            this.f11873b.setLayoutParams(this.f11876b);
            this.f11877b.setBackgroundColor(getResources().getColor(C1410R.color.white));
            this.f11877b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
            this.f11877b.requestLayout();
            RelativeLayout.LayoutParams layoutParams2 = this.f11891d;
            layoutParams2.topMargin = 0;
            this.f11892d.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f11851a.getLayoutParams();
            this.f11855a = layoutParams3;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
            this.f11851a.setLayoutParams(layoutParams3);
            this.f11851a.setBackground(zk3.m33204g(this.f11847a.getResources(), C1410R.C1411drawable.default_input, (Resources.Theme) null));
            this.f11851a.setTextColor(getResources().getColor(C1410R.color.black));
            this.f11851a.setHintTextColor(Color.parseColor(pj0.m61166a(-102674500523847L)));
            this.f11851a.requestFocus();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f11852a.getLayoutParams();
            this.f11885c = layoutParams4;
            layoutParams4.rightMargin = 0;
            layoutParams4.leftMargin = 0;
            layoutParams4.topMargin = 0;
            layoutParams4.bottomMargin = 0;
            layoutParams4.addRule(21);
            this.f11852a.setLayoutParams(this.f11885c);
            this.f11873b.setColorFilter(r70.m26353f(this.f11847a, C1410R.color.black));
            this.f11852a.setColorFilter(r70.m26353f(this.f11847a, C1410R.color.black));
            this.f11856a.setVisibility(0);
            this.f11864a = new lz2(this.f11847a, C1410R.layout.past_filter_route_item, this.f11903g);
            this.f11854a.setVisibility(8);
            this.f11875b.setAdapter(this.f11864a);
            this.f11875b.setOnItemClickListener(new e62(this));
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m14690m1(View view) {
        if (this.f11900e) {
            mo15811W0();
            mo15812X0();
            this.f11860a.mo11242Y0(4);
            this.f11884b = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ boolean m14692n1(od2 od2) {
        mo15798J0();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m14694o1(th1 th1) {
        this.f11865a = th1;
        mo15796H0();
        if (this.f11890c) {
            this.f11865a.mo24940I(true);
            this.f11865a.mo24985r().mo16113o(false);
            this.f11865a.mo24985r().mo16112n(false);
        }
        this.f11865a.mo24942K(new j52(this));
        this.f11865a.mo24949R(new k52(this));
        this.f11865a.mo24955X(new l52(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m14696p1(View view) {
        startActivity(new Intent(this.f11847a, NotificationsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m14699q1(View view) {
        this.f11879b = Boolean.FALSE;
        mo15797I0();
        mo15805Q0();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m14702r1(View view) {
        this.f11851a.setText(pj0.m61166a(-102820529411911L));
        this.f11897e.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m14705s1(View view) {
        startActivity(new Intent(this.f11847a, SettingsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m14707t1(View view) {
        this.f11860a.mo11242Y0(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m14709u1(View view) {
        startActivity(new Intent(this.f11847a, MetroMapActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ void m14714w1(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-102451162224455L)));
    }

    /* renamed from: A1 */
    public final ArrayList<AllStops> mo15790A1(HashMap<AllStops, Float> hashMap) {
        LinkedList<Map.Entry> linkedList = new LinkedList<>(hashMap.entrySet());
        Collections.sort(linkedList, w52.f36896a);
        ArrayList<AllStops> arrayList = new ArrayList<>();
        for (Map.Entry key : linkedList) {
            arrayList.add((AllStops) key.getKey());
        }
        return arrayList;
    }

    /* renamed from: B1 */
    public final void mo15791B1() {
        boolean z;
        boolean z2 = false;
        if (this.f11890c) {
            this.f11865a.mo24940I(true);
            this.f11865a.mo24985r().mo16113o(false);
            this.f11865a.mo24985r().mo16112n(false);
        }
        if (mo15814Z0()) {
            LocationManager locationManager = (LocationManager) this.f11847a.getSystemService(pj0.m61166a(-100922153867079L));
            try {
                z = locationManager.isProviderEnabled(pj0.m61166a(-100960808572743L));
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            try {
                z2 = locationManager.isProviderEnabled(pj0.m61166a(-100977988441927L));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!z && !z2) {
                try {
                    if (mo15814Z0()) {
                        new C0189c.C0190a(requireActivity()).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new i52(this)).mo959s(getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if ((z || z2) && this.f11890c) {
                mo15805Q0();
            }
        }
    }

    /* renamed from: C1 */
    public final void mo15792C1(String str, String str2, od2 od2, String str3, boolean z, Long l) {
        this.f11870a.put(str, str2);
    }

    /* renamed from: E0 */
    public final void mo15793E0(Double d, Double d2, String str, String str2, String str3, Boolean bool, String str4, Long l, String str5, String str6) {
        String str7 = str4;
        od2 c = this.f11865a.mo24962c(new sd2().mo24329e3(new LatLng(d.doubleValue(), d2.doubleValue())).mo24324Z2(C3858wl.m30941d(mo15808T0(str6, pj0.m61166a(-101093952558919L), str3, bool.booleanValue(), 0.0f, str4))));
        String str8 = str;
        this.f11894d.put(str, c);
        this.f11870a.put(str7, str6);
        this.f11882b.put(c.mo21871b(), str7);
        this.f11889c.put(c.mo21871b(), l);
        String str9 = str2;
        this.f11905i.put(c.mo21871b(), str2);
    }

    /* renamed from: F0 */
    public final void mo15794F0(ArrayList<AllRoutes> arrayList, String str) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(arrayList.get(i).getStart());
                arrayList2.add(arrayList.get(i).getEnd());
                arrayList2.add(arrayList.get(i).getLongName());
                arrayList2.add(str);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(arrayList.get(i).getRoute());
                arrayList3.add(arrayList.get(i).getDirection());
                this.f11904h.put(arrayList3, arrayList2);
                this.f11899e.put(arrayList.get(i).getLongName(), arrayList.get(i).getEnd());
                this.f11902f.put(arrayList.get(i).getLongName(), arrayList.get(i).getStart());
            }
            C3839we weVar = new C3839we(this.f11847a, C1410R.layout.dropdown_routes, this.f11904h, pj0.m61166a(-100441117529927L));
            this.f11851a.setThreshold(1);
            this.f11854a.setAdapter(weVar);
            this.f11854a.setOnItemClickListener(this.f11850a);
            this.f11851a.addTextChangedListener(new C2126h(weVar));
            return;
        }
        this.f11851a.setEnabled(false);
        Context context = this.f11847a;
        if (context != null) {
            Toast.makeText(context, getResources().getString(C1410R.string.fetch_problem), 1).show();
        }
    }

    /* renamed from: G0 */
    public final C3798vl mo15795G0(Context context, int i) {
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

    /* renamed from: H0 */
    public final void mo15796H0() {
        boolean z = r70.m26348a(this.f11847a, pj0.m61166a(-100462592366407L)) == 0;
        this.f11890c = z;
        if (z || !mo15814Z0()) {
            mo15791B1();
        } else {
            C3962y2.m31859G(requireActivity(), new String[]{pj0.m61166a(-100634391058247L)}, 123);
        }
    }

    /* renamed from: I0 */
    public final void mo15797I0() {
        th1 th1 = this.f11865a;
        if (th1 != null) {
            th1.mo24976j();
        }
        this.f11894d.clear();
        this.f11870a.clear();
        this.f11905i.clear();
        this.f11882b.clear();
        this.f11889c.clear();
    }

    /* renamed from: J */
    public void mo7854J(boolean z, List<AllStops> list) {
        if (z) {
            this.f11888c = (ArrayList) list;
        }
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: J0 */
    public final void mo15798J0() {
        this.f11865a.mo24933B(new C2129k());
    }

    /* renamed from: K0 */
    public final void mo15799K0() {
        GenericRequest genericRequest = new GenericRequest(this.f11893d, this.f11898e);
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        if (this.f11913t != this.f11914u && mo15814Z0()) {
            dataViewModel.getAllStopsLiveDataDIMTS(genericRequest, true, getContext(), this.f11914u).mo4926j(requireActivity(), new p52(this));
        }
    }

    /* renamed from: L0 */
    public final void mo15800L0() {
        mo15797I0();
        this.f11902f.clear();
        this.f11899e.clear();
        GenericRequest genericRequest = new GenericRequest(this.f11893d, this.f11898e);
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        if (this.f11911r != this.f11912s && mo15814Z0()) {
            dataViewModel.getAllRouteLiveDataDIMTS(genericRequest, true, getContext(), this.f11912s).mo4926j(requireActivity(), new m52(this));
        } else if (mo15814Z0()) {
            go3.m15968m(getActivity(), this);
        }
    }

    /* renamed from: M0 */
    public final void mo15801M0() {
        mo15797I0();
        this.f11902f.clear();
        this.f11899e.clear();
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        try {
            if (mo15814Z0()) {
                dataViewModel.getAllRouteLiveDataDMRC().mo4926j(requireActivity(), new n52(this));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: N0 */
    public final void mo15802N0() {
        mo15797I0();
        this.f11902f.clear();
        this.f11899e.clear();
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        if (mo15814Z0()) {
            dataViewModel.getAllStopsLiveDataDMRC().mo4926j(requireActivity(), new o52(this));
        }
    }

    /* renamed from: O0 */
    public final void mo15803O0(Double d, Double d2) {
        if (!this.f11879b.booleanValue() && mo15814Z0()) {
            try {
                if (this.f11888c == null) {
                    C2456iq.m17794m(getActivity(), this);
                }
                if (this.f11888c != null) {
                    this.f11879b = Boolean.TRUE;
                    this.f11881b = new ArrayList<>();
                    Location location = new Location(pj0.m61166a(-101149787133767L));
                    location.setLatitude(d.doubleValue());
                    location.setLongitude(d2.doubleValue());
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < this.f11888c.size(); i++) {
                        Location location2 = new Location(pj0.m61166a(-101154082101063L));
                        location2.setLongitude(this.f11888c.get(i).getLng().doubleValue());
                        location2.setLatitude(this.f11888c.get(i).getLat().doubleValue());
                        if (((int) mo15806R0(location, location2)) < 1000) {
                            this.f11881b.add(this.f11888c.get(i));
                            od2 c = this.f11865a.mo24962c(new sd2().mo24329e3(new LatLng(this.f11888c.get(i).getLat().doubleValue(), this.f11888c.get(i).getLng().doubleValue())).mo24324Z2(mo15795G0(this.f11847a, C1410R.C1411drawable.ic_bus_stop_updated)).mo24332h3(this.f11888c.get(i).getName()));
                            this.f11905i.put(c.mo21871b(), pj0.m61166a(-101158377068359L));
                            this.f11882b.put(c.mo21871b(), String.valueOf(this.f11888c.get(i).getId()));
                            Location location3 = new Location(pj0.m61166a(-101197031774023L));
                            location3.setLatitude(this.f11888c.get(i).getLat().doubleValue());
                            location3.setLongitude(this.f11888c.get(i).getLng().doubleValue());
                            hashMap.put(this.f11888c.get(i), Float.valueOf(mo15806R0(location3, location)));
                        }
                    }
                    this.f11866a = new yn2(mo15790A1(hashMap), location, requireActivity());
                    this.f11857a.setLayoutManager(new LinearLayoutManager(requireContext()));
                    this.f11857a.setAdapter(this.f11866a);
                    this.f11866a.mo5717m();
                    return;
                }
                new Handler().postDelayed(new C2130l(d, d2), 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: P0 */
    public final void mo15804P0() {
        Handler handler = new Handler();
        handler.postDelayed(new C2127i(handler), rf4.f19824c);
    }

    /* renamed from: Q0 */
    public final void mo15805Q0() {
        this.f11863a.mo18272U().mo17573e(new r52(this));
    }

    /* renamed from: R0 */
    public final float mo15806R0(Location location, Location location2) {
        return location.distanceTo(location2);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: S0 */
    public final Bitmap mo15807S0(String str) {
        io1 io1 = new io1(this.f11847a);
        io1.mo38184l(((LayoutInflater) this.f11847a.getSystemService(pj0.m61166a(-101334470727495L))).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        io1.mo38180h(this.f11847a.getResources().getDrawable(C1410R.C1411drawable.ic_box));
        io1.mo38187o(C1410R.style.iconGenText);
        io1.mo38182j(5, 4, 5, 6);
        return io1.mo38178f(str.toUpperCase());
    }

    /* renamed from: T0 */
    public final Bitmap mo15808T0(String str, String str2, String str3, boolean z, float f, String str4) {
        int i;
        Context context;
        if (!mo15814Z0()) {
            return null;
        }
        io1 io1 = new io1(this.f11847a);
        io1.mo38184l(((LayoutInflater) this.f11847a.getSystemService(pj0.m61166a(-101201326741319L))).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        if (!str2.equalsIgnoreCase(pj0.m61166a(-101270046218055L))) {
            return null;
        }
        if (str3.equalsIgnoreCase(pj0.m61166a(-101287226087239L))) {
            context = this.f11847a;
            i = z ? C1410R.C1411drawable.bus_marker_red : C1410R.C1411drawable.bus_marker_green;
        } else {
            context = this.f11847a;
            i = z ? C1410R.C1411drawable.bus_marker_blue : C1410R.C1411drawable.bus_marker_orange;
        }
        io1.mo38180h(C3129p8.m24529b(context, i));
        if (str4.contains(pj0.m61166a(-101304405956423L))) {
            io1.mo38180h(C3129p8.m24529b(this.f11847a, C1410R.C1411drawable.bus_marker_light_blue));
        }
        String a = fg1.m14893a(str);
        io1.mo38187o(C1410R.style.iconGenText);
        io1.mo38182j(0, 0, 0, 0);
        return io1.mo38178f(a);
    }

    /* renamed from: U0 */
    public final void mo15809U0() {
        new C2123e().execute(new Void[0]);
    }

    /* renamed from: V0 */
    public final void mo15810V0(int i, double d, double d2) {
        LiveViewModel liveViewModel = new LiveViewModel();
        LiveRequest liveRequest = new LiveRequest(d, d2);
        try {
            if (mo15814Z0()) {
                liveViewModel.get_nearby_bus(liveRequest).mo4926j(requireActivity(), new q52(this, i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: W0 */
    public final void mo15811W0() {
        if (mo15814Z0()) {
            View currentFocus = requireActivity().getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(requireActivity());
            }
            InputMethodManager inputMethodManager = f11843a;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: X0 */
    public final void mo15812X0() {
        if (mo15814Z0()) {
            this.f11900e = false;
            this.f11901f.setVisibility(0);
            this.f11897e.setVisibility(0);
            this.f11886c.setVisibility(0);
            this.f11877b.setBackground(getResources().getDrawable(C1410R.C1411drawable.one_delhi_banner_background));
            this.f11877b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 126.0f, getResources().getDisplayMetrics());
            this.f11877b.requestLayout();
            this.f11861a.setVisibility(0);
            this.f11856a.setVisibility(8);
            this.f11891d.topMargin = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
            this.f11892d.setLayoutParams(this.f11891d);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11851a.getLayoutParams();
            this.f11855a = layoutParams;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
            this.f11855a.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
            this.f11851a.setLayoutParams(this.f11855a);
            this.f11851a.setBackground(getResources().getDrawable(C1410R.C1411drawable.round_input_transparent));
            this.f11851a.setTextColor(getResources().getColor(C1410R.color.white));
            this.f11851a.setHeight((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
            this.f11851a.setHintTextColor(Color.parseColor(pj0.m61166a(-100398167856967L)));
            this.f11873b.setImageResource(C1410R.C1411drawable.ic_search);
            this.f11873b.setColorFilter(r70.m26353f(this.f11847a, C1410R.color.white));
            this.f11852a.setColorFilter(r70.m26353f(this.f11847a, C1410R.color.white));
            RelativeLayout.LayoutParams layoutParams2 = this.f11876b;
            int i = this.f11909p;
            layoutParams2.leftMargin = i;
            layoutParams2.bottomMargin = i;
            layoutParams2.rightMargin = i;
            layoutParams2.topMargin = this.f11910q;
            RelativeLayout.LayoutParams layoutParams3 = this.f11885c;
            layoutParams3.leftMargin = i;
            layoutParams3.bottomMargin = i;
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
            this.f11885c.topMargin = this.f11910q;
            this.f11873b.setLayoutParams(this.f11876b);
            this.f11885c.removeRule(21);
            this.f11852a.setLayoutParams(this.f11885c);
        }
    }

    /* renamed from: Y0 */
    public final void mo15813Y0(String str, String str2, String str3, String str4) {
        new C2121c(str, str2, str3, str4).execute(new Void[0]);
    }

    /* renamed from: Z0 */
    public final boolean mo15814Z0() {
        try {
            if (!isAdded()) {
                return false;
            }
            requireActivity();
            return true;
        } catch (IllegalStateException unused) {
            c41.m40702d().mo32241g(new Exception(pj0.m61166a(-101519154321223L)));
            c41.m40702d().mo32242h();
            return false;
        }
    }

    /* renamed from: a */
    public void mo15815a(boolean z, List<AllRoutes> list) {
        if (z) {
            this.f11869a = (ArrayList) list;
            for (int i = 0; i < this.f11869a.size(); i++) {
                this.f11899e.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getEnd());
                this.f11902f.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getStart());
                this.f11906j.put(this.f11869a.get(i).getLongName(), this.f11869a.get(i).getEnd());
            }
            mo15794F0(this.f11869a, pj0.m61166a(-101686658045767L));
            this.f11851a.addTextChangedListener(new C2119a());
        }
    }

    /* renamed from: b */
    public void mo15816b(boolean z) {
        if (!z) {
            return;
        }
        if (mo15814Z0()) {
            go3.m15970o(getActivity(), this, this.f11869a);
        } else {
            new Handler().post(new v52(this));
        }
    }

    /* renamed from: g */
    public void mo15817g(boolean z) {
        if (z) {
            SharedPreferences.Editor edit = this.f11848a.edit();
            edit.putInt(pj0.m61166a(-101459024779079L), this.f11912s);
            edit.apply();
        }
    }

    /* renamed from: m */
    public void mo7855m(boolean z) {
        if (z) {
            SharedPreferences.Editor edit = this.f11848a.edit();
            edit.putInt(pj0.m61166a(-101403190204231L), this.f11914u);
            edit.apply();
        }
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f11847a = context.getApplicationContext();
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f11862a = new gu4();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    @ts2
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!mo15814Z0()) {
            return null;
        }
        requireActivity().getWindow().clearFlags(8192);
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_live, viewGroup, false);
        SharedPreferences sharedPreferences = this.f11847a.getSharedPreferences(pj0.m61166a(-99805462370119L), 0);
        this.f11848a = sharedPreferences;
        this.f11893d = sharedPreferences.getString(pj0.m61166a(-99891361716039L), pj0.m61166a(-99934311388999L));
        this.f11898e = this.f11848a.getString(pj0.m61166a(-99938606356295L), pj0.m61166a(-99985850996551L));
        this.f11911r = this.f11848a.getInt(pj0.m61166a(-99990145963847L), 0);
        this.f11912s = this.f11848a.getInt(pj0.m61166a(-100050275505991L), 0);
        this.f11913t = this.f11848a.getInt(pj0.m61166a(-100140469819207L), 0);
        this.f11914u = this.f11848a.getInt(pj0.m61166a(-100196304394055L), 0);
        this.f11858a = (MapView) inflate.findViewById(C1410R.C1412id.mapView_live);
        this.f11861a = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_curLocation);
        FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_metroMap);
        this.f11897e = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_notifications);
        this.f11877b = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_main);
        this.f11886c = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_banner);
        this.f11892d = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_search);
        this.f11857a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_stops);
        this.f11851a = (AutoCompleteTextView) inflate.findViewById(C1410R.C1412id.edit_searchRoute);
        this.f11852a = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_destination);
        this.f11873b = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_back_1);
        this.f11856a = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_filterResults);
        this.f11854a = (ListView) inflate.findViewById(C1410R.C1412id.lv_filterResults);
        this.f11875b = (ListView) inflate.findViewById(C1410R.C1412id.lv_pastSearches);
        this.f11853a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_bottom_sheet);
        this.f11874b = (ImageView) inflate.findViewById(C1410R.C1412id.iv_settings);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C1410R.C1412id.bottom_sheet);
        this.f11901f = relativeLayout;
        this.f11860a = BottomSheetBehavior.m9579i0(relativeLayout);
        this.f11896e = (RelativeLayout.LayoutParams) this.f11861a.getLayoutParams();
        this.f11908o = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f11907n = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f11910q = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f11909p = applyDimension;
        this.f11896e.setMargins(0, 0, applyDimension, (int) TypedValue.applyDimension(1, 200.0f, getResources().getDisplayMetrics()));
        f11843a = (InputMethodManager) requireActivity().getSystemService(pj0.m61166a(-100282203739975L));
        this.f11858a.mo10627b(bundle);
        mo15809U0();
        this.f11858a.mo10626a(new s52(this));
        if (bundle != null) {
            this.f11872b = (Location) bundle.getParcelable(pj0.m61166a(-100338038314823L));
        }
        this.f11863a = b82.m11677b(this.f11847a);
        this.f11897e.setOnClickListener(new a62(this));
        this.f11861a.setOnClickListener(new b62(this));
        if (this.f11887c.equalsIgnoreCase(pj0.m61166a(-100376693020487L))) {
            this.f11887c = pj0.m61166a(-100380987987783L);
        }
        floatingActionButton.setVisibility(8);
        this.f11852a.setOnClickListener(new z52(this));
        this.f11874b.setOnClickListener(new x52(this));
        this.f11853a.setOnClickListener(new t52(this));
        floatingActionButton.setOnClickListener(new y52(this));
        this.f11860a.mo11241Y(new C2122d());
        this.f11876b = (RelativeLayout.LayoutParams) this.f11873b.getLayoutParams();
        this.f11885c = (RelativeLayout.LayoutParams) this.f11852a.getLayoutParams();
        this.f11891d = (RelativeLayout.LayoutParams) this.f11892d.getLayoutParams();
        mo15799K0();
        this.f11851a.setOnTouchListener(new d62(this));
        this.f11873b.setOnClickListener(new c62(this));
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11858a.mo10628c();
        this.f11862a.mo16917a();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f11858a.mo10631f();
    }

    public void onPause() {
        super.onPause();
        this.f11895d = false;
        this.f11868a = Boolean.FALSE;
        this.f11884b = false;
        this.f11863a.mo18275n(this.f11867a);
        this.f11858a.mo10632g();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 123) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.f11890c = false;
            Context context = this.f11847a;
            if (context != null) {
                Toast.makeText(context, pj0.m61166a(-100806189750087L), 0).show();
                return;
            }
            return;
        }
        this.f11890c = true;
        mo15791B1();
    }

    public void onResume() {
        int i;
        double latitude;
        double longitude;
        super.onResume();
        this.f11895d = true;
        this.f11879b = Boolean.FALSE;
        this.f11900e = true;
        this.f11858a.mo10633h();
        CameraPosition b = new CameraPosition.C1441a().mo10678c(new LatLng(this.f11849a.getLatitude(), this.f11849a.getLongitude())).mo10680e(15.0f).mo10677b();
        th1 th1 = this.f11865a;
        if (th1 != null) {
            th1.mo24990w(C3743ut.m29567a(b));
        }
        this.f11860a.mo11242Y0(4);
        if (this.f11896e != null && !this.f11868a.booleanValue()) {
            this.f11901f.setVisibility(0);
            mo15812X0();
        }
        if (this.f11887c.equalsIgnoreCase(pj0.m61166a(-101111132428103L))) {
            this.f11887c = pj0.m61166a(-101115427395399L);
        }
        if (this.f11887c.equalsIgnoreCase(pj0.m61166a(-101132607264583L))) {
            LatLng latLng = this.f11859a;
            if (latLng != null) {
                i = 0;
                latitude = latLng.f7562a;
                longitude = latLng.f7563b;
            } else {
                if (this.f11849a.getLatitude() != 0.0d) {
                    i = 0;
                    latitude = this.f11849a.getLatitude();
                    longitude = this.f11849a.getLongitude();
                }
                mo15804P0();
                mo15800L0();
            }
            mo15810V0(i, latitude, longitude);
            mo15804P0();
            mo15800L0();
        } else {
            mo15801M0();
            mo15802N0();
        }
        if (this.f11849a.getLatitude() != 0.0d) {
            mo15803O0(Double.valueOf(this.f11849a.getLatitude()), Double.valueOf(this.f11849a.getLongitude()));
        }
    }

    /* renamed from: u */
    public void mo7860u(boolean z) {
        if (!z) {
            return;
        }
        if (mo15814Z0()) {
            C2456iq.m17796o(getActivity(), this, this.f11888c);
        } else {
            new Handler().post(new u52(this));
        }
    }

    /* renamed from: x1 */
    public void mo15818x1(od2 od2, LatLng latLng, Long l) {
        LatLng c = od2.mo21872c();
        Handler handler = new Handler();
        long uptimeMillis = SystemClock.uptimeMillis();
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        Location location = new Location(pj0.m61166a(-101085362624327L));
        location.setLongitude(c.f7563b);
        location.setLatitude(c.f7562a);
        Location location2 = new Location(pj0.m61166a(-101089657591623L));
        location2.setLongitude(latLng.f7563b);
        location2.setLatitude(latLng.f7562a);
        this.f11889c.put(od2.mo21871b(), l);
        float f = 200.0f;
        if (mo15806R0(location, location2) >= 10.0f) {
            f = mo15806R0(location, location2) < 100.0f ? 2000.0f : (mo15806R0(location, location2) < 100.0f || mo15806R0(location, location2) >= 200.0f) ? (mo15806R0(location, location2) < 200.0f || mo15806R0(location, location2) >= 500.0f) ? 10000.0f : 8000.0f : 4000.0f;
        }
        handler.post(new C2128j(uptimeMillis, f, accelerateDecelerateInterpolator, c, latLng, od2, handler));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y1 */
    public final void mo15819y1() {
        Context context;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        if (mo15814Z0() && (context = this.f11847a) != null) {
            jd1 b = b82.m11677b(context);
            this.f11863a = b;
            z62 z62 = this.f11867a;
            Looper myLooper = Looper.myLooper();
            Objects.requireNonNull(myLooper);
            Looper looper = myLooper;
            b.mo18262A(locationRequest, z62, myLooper);
        }
    }

    /* renamed from: z1 */
    public final String mo15820z1(Long l) {
        StringBuilder sb;
        long j;
        String a = pj0.m61166a(-101012348180295L);
        if (l.longValue() <= 60) {
            sb = new StringBuilder();
            sb.append(l);
            j = -101016643147591L;
        } else if (l.longValue() > 3600) {
            return a;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(TimeUnit.SECONDS.toMinutes(l.longValue())));
            j = -101051002885959L;
        }
        sb.append(pj0.m61166a(j));
        return sb.toString();
    }
}
