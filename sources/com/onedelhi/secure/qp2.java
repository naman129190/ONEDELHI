package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.location.Location;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.C0887h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.DirectionRouteViewer;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.delhitransport.onedelhi.data.Stops;
import com.delhitransport.onedelhi.models.directions.AllStops;
import com.delhitransport.onedelhi.models.directions.AllStopsResponse;
import com.delhitransport.onedelhi.models.directions.DirectionResponse;
import com.delhitransport.onedelhi.models.directions.RecyclerViewItem;
import com.delhitransport.onedelhi.models.directions.Routes;
import com.delhitransport.onedelhi.models.directions.Routes_list_item;
import com.delhitransport.onedelhi.models.directions.Stop;
import com.delhitransport.onedelhi.models.directions.TripRoute;
import com.delhitransport.onedelhi.viewmodels.DirectionsViewModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.onedelhi.secure.C4084ze;
import com.onedelhi.secure.co3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class qp2 extends Fragment implements co3.C1921b, lv2, nv2, hu4 {

    /* renamed from: p */
    public static ArrayList<AllStops> f19298p = new ArrayList<>();

    /* renamed from: q */
    public static ArrayList<AllStops> f19299q = new ArrayList<>();

    /* renamed from: a */
    public ProgressDialog f19300a;

    /* renamed from: a */
    public Context f19301a;

    /* renamed from: a */
    public SharedPreferences.Editor f19302a;

    /* renamed from: a */
    public SharedPreferences f19303a;

    /* renamed from: a */
    public Location f19304a;

    /* renamed from: a */
    public CountDownTimer f19305a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f19306a = new C3321d();

    /* renamed from: a */
    public EditText f19307a;

    /* renamed from: a */
    public ImageButton f19308a;

    /* renamed from: a */
    public ImageView f19309a;

    /* renamed from: a */
    public LinearLayout f19310a;

    /* renamed from: a */
    public ListView f19311a;

    /* renamed from: a */
    public RelativeLayout f19312a;

    /* renamed from: a */
    public TextView f19313a;

    /* renamed from: a */
    public RecyclerView f19314a;

    /* renamed from: a */
    public AllStops f19315a;

    /* renamed from: a */
    public AllStopsResponse f19316a;

    /* renamed from: a */
    public DirectionResponse f19317a;

    /* renamed from: a */
    public co3 f19318a;

    /* renamed from: a */
    public C2057ef f19319a;

    /* renamed from: a */
    public gu4 f19320a;

    /* renamed from: a */
    public jd1 f19321a;

    /* renamed from: a */
    public nz2 f19322a;

    /* renamed from: a */
    public C3509se f19323a;

    /* renamed from: a */
    public final z62 f19324a = new C3323f();

    /* renamed from: a */
    public final SimpleDateFormat f19325a = new SimpleDateFormat(pj0.m61166a(-103550673852231L), Locale.getDefault());

    /* renamed from: a */
    public final ArrayList<String> f19326a = new ArrayList<>();

    /* renamed from: a */
    public HashMap<RecyclerViewItem, List<Stop>> f19327a;

    /* renamed from: b */
    public final AdapterView.OnItemClickListener f19328b = new C3325h();

    /* renamed from: b */
    public EditText f19329b;

    /* renamed from: b */
    public ImageButton f19330b;

    /* renamed from: b */
    public ImageView f19331b;

    /* renamed from: b */
    public ListView f19332b;

    /* renamed from: b */
    public RelativeLayout f19333b;

    /* renamed from: b */
    public TextView f19334b;

    /* renamed from: b */
    public AllStopsResponse f19335b;

    /* renamed from: b */
    public String f19336b = pj0.m61166a(-103533493983047L);

    /* renamed from: b */
    public final ArrayList<String> f19337b = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, Integer> f19338b = new HashMap<>();

    /* renamed from: b */
    public boolean f19339b = false;

    /* renamed from: c */
    public ImageView f19340c;

    /* renamed from: c */
    public RelativeLayout f19341c;

    /* renamed from: c */
    public TextView f19342c;

    /* renamed from: c */
    public String f19343c = pj0.m61166a(-103537788950343L);

    /* renamed from: c */
    public ArrayList<Routes_list_item> f19344c;

    /* renamed from: c */
    public boolean f19345c = false;

    /* renamed from: d */
    public ImageView f19346d;

    /* renamed from: d */
    public TextView f19347d;

    /* renamed from: d */
    public String f19348d = pj0.m61166a(-103542083917639L);

    /* renamed from: d */
    public ArrayList<Double> f19349d = new ArrayList<>();

    /* renamed from: d */
    public boolean f19350d;

    /* renamed from: e */
    public ImageView f19351e;

    /* renamed from: e */
    public String f19352e;

    /* renamed from: e */
    public ArrayList<Double> f19353e = new ArrayList<>();

    /* renamed from: e */
    public boolean f19354e;

    /* renamed from: f */
    public ImageView f19355f;

    /* renamed from: f */
    public String f19356f;

    /* renamed from: f */
    public ArrayList<String> f19357f;

    /* renamed from: f */
    public boolean f19358f = false;

    /* renamed from: g */
    public ImageView f19359g;

    /* renamed from: g */
    public String f19360g;

    /* renamed from: g */
    public ArrayList<String> f19361g;

    /* renamed from: g */
    public boolean f19362g = true;

    /* renamed from: h */
    public String f19363h;

    /* renamed from: h */
    public ArrayList<Stop> f19364h;

    /* renamed from: i */
    public String f19365i;

    /* renamed from: i */
    public ArrayList<String> f19366i = new ArrayList<>();

    /* renamed from: j */
    public String f19367j;

    /* renamed from: j */
    public ArrayList<String> f19368j = new ArrayList<>();

    /* renamed from: k */
    public String f19369k;

    /* renamed from: k */
    public ArrayList<RecyclerViewItem> f19370k;

    /* renamed from: l */
    public String f19371l = pj0.m61166a(-103589328557895L);

    /* renamed from: l */
    public final ArrayList<ArrayList<Double>> f19372l = new ArrayList<>();

    /* renamed from: m */
    public String f19373m = pj0.m61166a(-103593623525191L);

    /* renamed from: m */
    public ArrayList<AllStops> f19374m = new ArrayList<>();

    /* renamed from: n */
    public int f19375n = 0;

    /* renamed from: n */
    public final ArrayList<PastSearchTripPlanner> f19376n = new ArrayList<>();

    /* renamed from: o */
    public int f19377o = -1;

    /* renamed from: o */
    public ArrayList<String> f19378o = new ArrayList<>();

    /* renamed from: p */
    public int f19379p = -1;

    /* renamed from: q */
    public int f19380q;

    /* renamed from: r */
    public int f19381r;

    /* renamed from: s */
    public int f19382s;

    /* renamed from: t */
    public int f19383t;

    /* renamed from: com.onedelhi.secure.qp2$a */
    public class C3318a implements TextWatcher {
        public C3318a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m26013b(String str) {
            boolean unused = qp2.this.f19358f = true;
            try {
                qp2.this.mo23314a1(str, pj0.m61166a(-103035277776711L));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (qp2.this.f19307a.getText().toString().equals(pj0.m61166a(-103022392874823L))) {
                qp2.this.f19311a.setVisibility(8);
                qp2.this.f19308a.setVisibility(8);
                qp2.this.f19310a.setVisibility(0);
                qp2.this.f19349d.clear();
                int unused = qp2.this.f19379p = -1;
                String unused2 = qp2.this.f19356f = pj0.m61166a(-103026687842119L);
                return;
            }
            qp2.this.f19310a.setVisibility(8);
            qp2.this.f19311a.setVisibility(0);
            qp2.this.f19308a.setVisibility(0);
            if (qp2.this.f19323a != null) {
                qp2.this.f19323a.getFilter().filter(charSequence);
            }
            if (charSequence.length() >= 3) {
                String obj = qp2.this.f19307a.getText().toString();
                if ((!qp2.this.f19358f && !qp2.this.f19373m.equalsIgnoreCase(obj)) || qp2.this.f19373m.equalsIgnoreCase(pj0.m61166a(-103030982809415L))) {
                    new Handler().postDelayed(new pp2(this, obj), 250);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$b */
    public class C3319b implements TextWatcher {
        public C3319b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m26015b(String str) {
            boolean unused = qp2.this.f19358f = true;
            try {
                qp2.this.mo23314a1(str, pj0.m61166a(-103065342547783L));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (qp2.this.f19329b.getText().toString().equals(pj0.m61166a(-103052457645895L))) {
                qp2.this.f19311a.setVisibility(8);
                qp2.this.f19330b.setVisibility(8);
                qp2.this.f19310a.setVisibility(0);
                int unused = qp2.this.f19377o = -1;
                qp2.this.f19353e.clear();
                String unused2 = qp2.this.f19352e = pj0.m61166a(-103056752613191L);
                return;
            }
            qp2.this.f19310a.setVisibility(8);
            qp2.this.f19311a.setVisibility(0);
            qp2.this.f19330b.setVisibility(0);
            if (qp2.this.f19323a != null) {
                qp2.this.f19323a.getFilter().filter(charSequence);
            }
            if (charSequence.length() >= 3) {
                String obj = qp2.this.f19329b.getText().toString();
                if (qp2.this.f19358f) {
                    return;
                }
                if (!qp2.this.f19373m.equalsIgnoreCase(obj) || qp2.this.f19373m.equalsIgnoreCase(pj0.m61166a(-103061047580487L))) {
                    new Handler().postDelayed(new rp2(this, obj), 100);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$c */
    public class C3320c implements TimePickerDialog.OnTimeSetListener {
        public C3320c() {
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            String format = String.format(Locale.getDefault(), pj0.m61166a(-103086817384263L), new Object[]{Integer.valueOf(i)});
            String format2 = String.format(Locale.getDefault(), pj0.m61166a(-103108292220743L), new Object[]{Integer.valueOf(i2)});
            String a = pj0.m61166a(-103129767057223L);
            qp2 qp2 = qp2.this;
            String unused = qp2.f19363h = format + pj0.m61166a(-103142651959111L) + format2 + pj0.m61166a(-103151241893703L) + a;
            Context context = qp2.this.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(pj0.m61166a(-103159831828295L));
            sb.append(qp2.this.f19363h);
            Toast.makeText(context, sb.toString(), 0).show();
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$d */
    public class C3321d implements AdapterView.OnItemClickListener {
        public C3321d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AllStops allStops = (AllStops) adapterView.getItemAtPosition(i);
            if (qp2.this.f19375n == 0) {
                String unused = qp2.this.f19356f = allStops.getName();
                int unused2 = qp2.this.f19379p = allStops.getId();
                boolean unused3 = qp2.this.f19339b = allStops.getStop_type().equalsIgnoreCase(pj0.m61166a(-103228551305031L));
                qp2.this.f19349d.clear();
                qp2.this.f19349d.add(allStops.getLat());
                qp2.this.f19349d.add(allStops.getLng());
                String unused4 = qp2.this.f19336b = allStops.getStop_type();
                qp2.this.f19307a.setText(qp2.this.f19356f);
            } else {
                String unused5 = qp2.this.f19352e = allStops.getName();
                int unused6 = qp2.this.f19377o = allStops.getId();
                boolean unused7 = qp2.this.f19345c = allStops.getStop_type().equalsIgnoreCase(pj0.m61166a(-103254321108807L));
                qp2.this.f19353e.clear();
                qp2.this.f19353e.add(allStops.getLat());
                qp2.this.f19353e.add(allStops.getLng());
                qp2.this.f19329b.setText(qp2.this.f19352e);
                String unused8 = qp2.this.f19343c = allStops.getStop_type();
            }
            qp2.this.f19311a.setVisibility(8);
            qp2.this.f19310a.setVisibility(8);
            qp2.this.mo23300H1();
            qp2.this.mo23317d1();
            if (qp2.this.f19338b.containsKey(allStops.getName())) {
                Integer num = (Integer) qp2.this.f19338b.get(allStops.getName());
                qp2 qp2 = qp2.this;
                int i2 = 1;
                if (num != null) {
                    i2 = 1 + num.intValue();
                }
                qp2.mo23304L1(allStops, i2);
                return;
            }
            qp2.this.mo23318e1(allStops);
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$e */
    public class C3322e implements Runnable {
        public C3322e() {
        }

        public void run() {
            qp2.this.mo23309V0(qp2.f19298p, pj0.m61166a(-103280090912583L));
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$f */
    public class C3323f extends z62 {
        public C3323f() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            if (qp2.this.f19304a == null) {
                qp2.this.mo23311X0();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$g */
    public class C3324g implements bu2<DirectionResponse> {
        public C3324g() {
        }

        /* renamed from: a */
        public void mo3946b(DirectionResponse directionResponse) {
            if (directionResponse != null) {
                qp2.this.mo23307T0();
                qp2.this.f19310a.setVisibility(8);
                DirectionResponse unused = qp2.this.f19317a = directionResponse;
                if (directionResponse.getMsg().equalsIgnoreCase(pj0.m61166a(-103297270781767L)) && directionResponse.getDescription() != null) {
                    Toast.makeText(qp2.this.getContext(), directionResponse.getDescription(), 0).show();
                }
                qp2 qp2 = qp2.this;
                qp2.mo23296D1(directionResponse, qp2.f19307a.getText().toString().trim(), qp2.this.f19329b.getText().toString().trim());
                return;
            }
            qp2.this.mo23307T0();
            Toast.makeText(qp2.this.f19301a, pj0.m61166a(-103327335552839L), 0).show();
            qp2.this.f19314a.setVisibility(8);
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$h */
    public class C3325h implements AdapterView.OnItemClickListener {
        public C3325h() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            PastSearchTripPlanner pastSearchTripPlanner = (PastSearchTripPlanner) adapterView.getItemAtPosition(i);
            int i2 = 1;
            if (qp2.this.f19375n == 0) {
                String unused = qp2.this.f19356f = pastSearchTripPlanner.getStop_name();
                int unused2 = qp2.this.f19379p = pastSearchTripPlanner.getStop_id();
                qp2.this.f19349d.clear();
                qp2.this.f19349d.add(pastSearchTripPlanner.getStop_lat());
                qp2.this.f19349d.add(pastSearchTripPlanner.getStop_lon());
                qp2.this.f19307a.setText(qp2.this.f19356f);
                String unused3 = qp2.this.f19336b = pastSearchTripPlanner.getStop_type();
                qp2.this.f19329b.requestFocus();
                int unused4 = qp2.this.f19375n = 1;
            } else {
                String unused5 = qp2.this.f19352e = pastSearchTripPlanner.getStop_name();
                int unused6 = qp2.this.f19377o = pastSearchTripPlanner.getStop_id();
                qp2.this.f19353e.clear();
                qp2.this.f19353e.add(pastSearchTripPlanner.getStop_lat());
                qp2.this.f19353e.add(pastSearchTripPlanner.getStop_lon());
                qp2.this.f19329b.setText(qp2.this.f19352e);
                String unused7 = qp2.this.f19343c = pastSearchTripPlanner.getStop_type();
            }
            qp2.this.f19310a.setVisibility(0);
            qp2.this.f19310a.setVisibility(8);
            qp2.this.f19311a.setVisibility(8);
            qp2.this.mo23300H1();
            if (qp2.this.f19338b.containsKey(pastSearchTripPlanner.getStop_name())) {
                Integer num = (Integer) qp2.this.f19338b.get(pastSearchTripPlanner.getStop_name());
                qp2 qp2 = qp2.this;
                if (num != null) {
                    i2 = 1 + num.intValue();
                }
                qp2.mo23303K1(pastSearchTripPlanner, i2);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qp2$i */
    public class C3326i extends CountDownTimer {
        public C3326i(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (qp2.this.f19300a != null) {
                qp2.this.f19300a.dismiss();
            }
        }

        public void onTick(long j) {
            if (j < rf4.f19824c && qp2.this.f19300a != null) {
                qp2.this.f19300a.setMessage(pj0.m61166a(-103391760062279L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m25896A1(View view) {
        mo23298F1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ void m25898B1(View view) {
        this.f19307a.setText(pj0.m61166a(-109572218001223L));
        this.f19307a.setHint(pj0.m61166a(-109576512968519L));
        this.f19356f = pj0.m61166a(-109606577739591L);
        this.f19379p = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public /* synthetic */ void m25900C1(View view) {
        this.f19329b.setText(pj0.m61166a(-109512088459079L));
        this.f19329b.setHint(pj0.m61166a(-109516383426375L));
        this.f19352e = pj0.m61166a(-109567923033927L);
        this.f19377o = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m25939g1() {
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0);
        this.f19329b.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m25941h1() {
        this.f19310a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m25943i1(DirectionResponse directionResponse) {
        mo23307T0();
        if (directionResponse != null) {
            this.f19310a.setVisibility(8);
            this.f19317a = directionResponse;
            if (directionResponse.getMsg().equalsIgnoreCase(pj0.m61166a(-109288750159687L)) && directionResponse.getDescription() != null) {
                Toast.makeText(getContext(), directionResponse.getDescription(), 0).show();
            }
            mo23296D1(directionResponse, this.f19307a.getText().toString().trim(), this.f19329b.getText().toString().trim());
            return;
        }
        Toast.makeText(this.f19301a, pj0.m61166a(-109318814930759L), 0).show();
        this.f19314a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        if (r4.f19362g == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d8  */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m25945j1(com.onedelhi.secure.w94 r5) {
        /*
            r4 = this;
            boolean r0 = r5.mo17590v()
            r1 = 0
            if (r0 == 0) goto L_0x00de
            java.lang.Object r5 = r5.mo17586r()
            android.location.Location r5 = (android.location.Location) r5
            r4.f19304a = r5
            if (r5 != 0) goto L_0x0016
            r4.mo23299G1()
            goto L_0x0103
        L_0x0016:
            int r5 = r4.f19375n
            r0 = 8
            if (r5 != 0) goto L_0x006d
            java.util.ArrayList<java.lang.Double> r5 = r4.f19349d
            r5.clear()
            java.util.ArrayList<java.lang.Double> r5 = r4.f19349d
            android.location.Location r2 = r4.f19304a
            double r2 = r2.getLatitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5.add(r2)
            java.util.ArrayList<java.lang.Double> r5 = r4.f19349d
            android.location.Location r2 = r4.f19304a
            double r2 = r2.getLongitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5.add(r2)
            android.widget.EditText r5 = r4.f19307a
            r2 = -108541425850183(0xffff9d483ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r5.setHint(r2)
            r2 = -108592965457735(0xffff9d3c3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r2)
            r4.f19356f = r5
            r2 = -108644505065287(0xffff9d303ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r2)
            r4.f19336b = r5
            boolean r5 = r4.f19362g
            if (r5 != 0) goto L_0x00d4
        L_0x0067:
            android.widget.ListView r5 = r4.f19311a
            r5.setVisibility(r0)
            goto L_0x00d4
        L_0x006d:
            boolean r2 = r4.f19362g
            if (r2 != 0) goto L_0x00d4
            r2 = 1
            if (r5 != r2) goto L_0x00d4
            java.util.ArrayList<java.lang.Double> r5 = r4.f19353e
            r5.clear()
            java.util.ArrayList<java.lang.Double> r5 = r4.f19353e
            android.location.Location r2 = r4.f19304a
            double r2 = r2.getLatitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5.add(r2)
            java.util.ArrayList<java.lang.Double> r5 = r4.f19353e
            android.location.Location r2 = r4.f19304a
            double r2 = r2.getLongitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5.add(r2)
            android.widget.EditText r5 = r4.f19307a
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00af
            android.widget.EditText r5 = r4.f19329b
            r2 = -108670274869063(0xffff9d2a3ade68b9, double:NaN)
            goto L_0x00b6
        L_0x00af:
            android.widget.EditText r5 = r4.f19329b
            r2 = -108721814476615(0xffff9d1e3ade68b9, double:NaN)
        L_0x00b6:
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r5.setHint(r2)
            r2 = -108773354084167(0xffff9d123ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r2)
            r4.f19352e = r5
            r2 = -108824893691719(0xffff9d063ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r2)
            r4.f19343c = r5
            goto L_0x0067
        L_0x00d4:
            boolean r5 = r4.f19362g
            if (r5 != 0) goto L_0x00db
            r4.mo23300H1()
        L_0x00db:
            r4.f19362g = r1
            goto L_0x0103
        L_0x00de:
            android.content.Context r5 = r4.f19301a
            android.content.res.Resources r0 = r4.getResources()
            r2 = 2131952052(0x7f1301b4, float:1.9540536E38)
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
            r5.show()
            android.content.Intent r5 = new android.content.Intent
            r0 = -108850663495495(0xffff9d003ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            r5.<init>(r0)
            r4.startActivity(r5)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qp2.m25945j1(com.onedelhi.secure.w94):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m25947k1(DirectionResponse directionResponse) {
        mo23307T0();
        if (directionResponse != null) {
            this.f19310a.setVisibility(8);
            this.f19317a = directionResponse;
            if (directionResponse.getMsg().equalsIgnoreCase(pj0.m61166a(-109194260879175L)) && directionResponse.getDescription() != null) {
                Toast.makeText(getContext(), directionResponse.getDescription(), 0).show();
            }
            mo23296D1(directionResponse, this.f19307a.getText().toString().trim(), this.f19329b.getText().toString().trim());
            return;
        }
        Toast.makeText(this.f19301a, pj0.m61166a(-109224325650247L), 0).show();
        this.f19314a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m25949l1(String str, String str2, C4084ze zeVar) {
        long j;
        String str3;
        int i = 0;
        this.f19358f = false;
        this.f19373m = str;
        ArrayList arrayList = new ArrayList();
        if (zeVar != null && zeVar.mo27947b().size() > 0) {
            Iterator<C4084ze.C4086b> it = zeVar.mo27947b().iterator();
            while (it.hasNext()) {
                C4084ze.C4086b next = it.next();
                AllStops allStops = new AllStops(BZip2Constants.BASEBLOCKSIZE, Double.valueOf((double) next.mo27956c().floatValue()), Double.valueOf((double) next.mo27957d().floatValue()), next.mo27955b(), next.mo27954a(), pj0.m61166a(-109031052121927L), new ArrayList());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(allStops.getLat());
                arrayList2.add(allStops.getLng());
                if (this.f19372l.contains(arrayList2) || i == 0) {
                    Log.d(pj0.m61166a(-109056821925703L), pj0.m61166a(-109078296762183L));
                } else {
                    this.f19372l.add(arrayList2);
                    arrayList.add(allStops);
                }
                i++;
            }
        }
        arrayList.addAll(this.f19374m);
        this.f19374m.clear();
        this.f19374m.addAll(arrayList);
        this.f19323a.notifyDataSetChanged();
        C3509se seVar = this.f19323a;
        if (seVar != null) {
            seVar.getFilter().filter((this.f19375n == 0 ? this.f19307a : this.f19329b).getText().toString());
        }
        arrayList.clear();
        if (str2.equalsIgnoreCase(pj0.m61166a(-109138426304327L))) {
            if (!this.f19307a.getText().toString().trim().equalsIgnoreCase(str)) {
                str3 = this.f19307a.getText().toString().trim();
                j = -109155606173511L;
            } else {
                return;
            }
        } else if (!this.f19329b.getText().toString().trim().equalsIgnoreCase(str)) {
            str3 = this.f19329b.getText().toString().trim();
            j = -109172786042695L;
        } else {
            return;
        }
        mo23314a1(str3, pj0.m61166a(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m25951m1(ProgressDialog progressDialog, AllStopsResponse allStopsResponse) {
        if (allStopsResponse == null || !mo23319f1()) {
            Context context = this.f19301a;
            if (context != null) {
                Toast.makeText(context, getResources().getText(C1410R.string.no_resp_from_server), 0).show();
            }
        } else {
            this.f19316a = allStopsResponse;
            f19298p = new ArrayList<>();
            f19298p = allStopsResponse.getAll_stops();
            a44.m10781l(getContext(), this);
            new Handler().postDelayed(new C3322e(), 200);
        }
        if (mo23319f1() && f19299q.isEmpty()) {
            mo23316c1();
        }
        if (this.f19350d) {
            ArrayList<AllStops> arrayList = f19298p;
            if (arrayList != null) {
                mo23305R0(arrayList);
            } else {
                Toast.makeText(this.f19301a, getResources().getString(C1410R.string.no_resp_from_server), 0).show();
            }
        }
        progressDialog.dismiss();
        mo23307T0();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m25953n1(ProgressDialog progressDialog, AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f19335b = allStopsResponse;
            f19299q.clear();
            ArrayList<AllStops> all_stops = allStopsResponse.getAll_stops();
            f19299q = all_stops;
            mo23309V0(all_stops, pj0.m61166a(-109383239440199L));
        } else {
            Context context = this.f19301a;
            if (context != null) {
                Toast.makeText(context, pj0.m61166a(-109409009243975L), 0).show();
            }
        }
        if (!this.f19350d) {
            ArrayList<AllStops> arrayList = f19299q;
            if (arrayList != null) {
                mo23305R0(arrayList);
            } else {
                Context context2 = this.f19301a;
                if (context2 != null) {
                    Toast.makeText(context2, getResources().getString(C1410R.string.some_error_occurred), 0).show();
                }
            }
        }
        progressDialog.dismiss();
        mo23307T0();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m25955o1() {
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0);
        this.f19329b.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m25957p1() {
        this.f19310a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m25960q1() {
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0);
        this.f19329b.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m25963r1() {
        this.f19310a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m25966s1(View view) {
        startActivity(new Intent(requireActivity(), SettingsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m25968t1(View view) {
        mo23311X0();
        this.f19311a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m25970u1(View view) {
        new TimePickerDialog(getContext(), new C3320c(), 0, 0, false).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ boolean m25972v1(View view, MotionEvent motionEvent) {
        this.f19309a.setColorFilter(r70.m26353f(requireActivity(), C1410R.color.one_delhi_red), PorterDuff.Mode.SRC_IN);
        this.f19331b.setColorFilter(r70.m26353f(requireActivity(), C1410R.color.gray_60), PorterDuff.Mode.SRC_IN);
        this.f19375n = 0;
        this.f19310a.setVisibility(0);
        if (this.f19307a.getText().toString().equals(pj0.m61166a(-109671002249031L))) {
            this.f19308a.setVisibility(8);
        } else {
            this.f19308a.setVisibility(0);
        }
        this.f19314a.setVisibility(8);
        if (this.f19329b.getText().toString().isEmpty() || this.f19352e.equalsIgnoreCase(pj0.m61166a(-109675297216327L))) {
            this.f19347d.setVisibility(8);
        } else {
            this.f19347d.setVisibility(0);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ boolean m25975w1(View view, MotionEvent motionEvent) {
        this.f19331b.setColorFilter(r70.m26353f(requireActivity(), C1410R.color.one_delhi_red), PorterDuff.Mode.SRC_IN);
        this.f19309a.setColorFilter(r70.m26353f(requireActivity(), C1410R.color.gray_60), PorterDuff.Mode.SRC_IN);
        this.f19375n = 1;
        this.f19310a.setVisibility(0);
        if (this.f19329b.getText().toString().equals(pj0.m61166a(-109610872706887L))) {
            this.f19330b.setVisibility(8);
        } else {
            this.f19330b.setVisibility(0);
        }
        C3509se seVar = this.f19323a;
        if (seVar != null) {
            seVar.getFilter().filter(pj0.m61166a(-109615167674183L));
        }
        this.f19314a.setVisibility(8);
        if (this.f19307a.getText().toString().isEmpty() || this.f19356f.equalsIgnoreCase(pj0.m61166a(-109619462641479L))) {
            this.f19347d.setVisibility(8);
        } else {
            this.f19347d.setVisibility(0);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m25977x1(View view) {
        mo23302J1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public /* synthetic */ void m25980y1(View view) {
        mo23306S0();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public /* synthetic */ void m25982z1(View view) {
        mo23297E1();
    }

    /* renamed from: D1 */
    public final void mo23296D1(DirectionResponse directionResponse, String str, String str2) {
        long j;
        StringBuilder sb;
        int i;
        this.f19344c.clear();
        ArrayList<String> arrayList = this.f19357f;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<String> arrayList2 = this.f19361g;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<String> arrayList3 = this.f19366i;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        RecyclerViewItem[] recyclerViewItemArr = new RecyclerViewItem[1];
        int i2 = 0;
        int i3 = 0;
        while (i3 < directionResponse.getDirections().size()) {
            this.f19327a = new HashMap<>();
            this.f19370k = new ArrayList<>();
            this.f19357f = new ArrayList<>();
            this.f19361g = new ArrayList<>();
            this.f19366i = new ArrayList<>();
            String response_type = directionResponse.getDirections().get(i3).getResponse_type();
            Routes routes = directionResponse.getDirections().get(i3).getRoutes();
            String str3 = getResources().getString(C1410R.string.rupees) + directionResponse.getDirections().get(i3).getFare();
            int trip_time = directionResponse.getDirections().get(i3).getTrip_time();
            if (trip_time >= 60) {
                sb = new StringBuilder();
                sb.append(trip_time / 60);
                sb.append(pj0.m61166a(-105096862078791L));
                sb.append(getResources().getString(C1410R.string.hours));
                sb.append(pj0.m61166a(-105105452013383L));
                sb.append(trip_time % 60);
                j = -105114041947975L;
            } else {
                sb = new StringBuilder();
                sb.append(trip_time);
                j = -105122631882567L;
            }
            sb.append(pj0.m61166a(j));
            sb.append(getResources().getString(C1410R.string.mins));
            String sb2 = sb.toString();
            if (trip_time == 0) {
                sb2 = pj0.m61166a(-105131221817159L);
            }
            String a = pj0.m61166a(-105135516784455L);
            pj0.m61166a(-105144106719047L);
            String a2 = pj0.m61166a(-105148401686343L);
            String a3 = pj0.m61166a(-105152696653639L);
            try {
                this.f19365i = directionResponse.getDirections().get(i3).getRoutes().getRoute().get(i2).getVehicle_id();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String reach_by = directionResponse.getDirections().get(i3).getReach_by();
            for (TripRoute next : routes.getRoute()) {
                ArrayList<String> routes2 = next.getRoutes();
                String longName = next.getLongName();
                this.f19364h = !routes2.get(i2).equalsIgnoreCase(pj0.m61166a(-105156991620935L)) ? next.getStops() : new ArrayList<>();
                this.f19366i.add(next.getColor());
                this.f19368j.add(String.valueOf(next.getTrip_time()));
                this.f19337b.add(next.getVehicle_id());
                this.f19326a.add(String.valueOf(next.getFare()));
                if (routes2.get(0).equalsIgnoreCase(pj0.m61166a(-105178466457415L)) || !a2.equalsIgnoreCase(pj0.m61166a(-105199941293895L))) {
                    i = 0;
                } else {
                    i = 0;
                    a2 = next.getStops().get(0).getName();
                    a3 = next.getDeparture_time();
                }
                String str4 = a2;
                String str5 = a3;
                String name = next.getStops().get(i).getName();
                String name2 = next.getStops().get(next.getStops().size() - 1).getName();
                if (name.equalsIgnoreCase(str)) {
                    a = next.getComfortScore();
                }
                String str6 = a;
                String str7 = str4;
                this.f19357f.add(next.getType());
                StringBuilder sb3 = new StringBuilder();
                for (int i4 = 0; i4 < routes2.size(); i4++) {
                    sb3.append(fg1.m14893a(routes2.get(i4)));
                    if (i4 != routes2.size() - 1) {
                        sb3.append(pj0.m61166a(-105204236261191L));
                    }
                }
                this.f19361g.add(sb3.toString());
                recyclerViewItemArr[0] = new RecyclerViewItem(name, name2, longName, sb3.toString(), str6, str3, sb2, this.f19365i, next.getColor(), next.getDeparture_time(), pj0.m61166a(-105221416130375L));
                this.f19370k.add(recyclerViewItemArr[0]);
                this.f19327a.put(recyclerViewItemArr[0], this.f19364h);
                if (recyclerViewItemArr[0].getDest().equalsIgnoreCase(str2)) {
                    this.f19327a.put(recyclerViewItemArr[0], this.f19364h);
                    recyclerViewItemArr[0] = new RecyclerViewItem(str2, pj0.m61166a(-105225711097671L), pj0.m61166a(-105230006064967L), pj0.m61166a(-105234301032263L), pj0.m61166a(-105238595999559L), pj0.m61166a(-105242890966855L), pj0.m61166a(-105247185934151L), pj0.m61166a(-105251480901447L), pj0.m61166a(-105255775868743L), pj0.m61166a(-105260070836039L), pj0.m61166a(-105264365803335L));
                    this.f19370k.add(recyclerViewItemArr[0]);
                    ArrayList<Stop> arrayList4 = new ArrayList<>();
                    this.f19364h = arrayList4;
                    this.f19327a.put(recyclerViewItemArr[0], arrayList4);
                }
                a3 = str5;
                a = str6;
                a2 = str7;
                i2 = 0;
            }
            this.f19344c.add(new Routes_list_item(sb2, a, response_type, reach_by, a2, a3, this.f19326a, this.f19337b, this.f19357f, this.f19361g, this.f19366i, this.f19368j));
            this.f19318a.mo5717m();
            this.f19314a.setVisibility(0);
            i3++;
            i2 = 0;
        }
    }

    /* renamed from: E1 */
    public final void mo23297E1() {
        String str;
        this.f19378o.clear();
        this.f19378o.add(pj0.m61166a(-104310883063623L));
        this.f19378o.add(pj0.m61166a(-104336652867399L));
        this.f19379p = -1;
        this.f19377o = -1;
        this.f19376n.clear();
        nz2 nz2 = this.f19322a;
        if (nz2 != null) {
            nz2.notifyDataSetChanged();
        }
        this.f19373m = pj0.m61166a(-104362422671175L);
        vi4.m30128n(getContext(), this, this.f19378o);
        a44.m10783n(getContext(), this, pj0.m61166a(-104366717638471L));
        this.f19333b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104392487442247L)), PorterDuff.Mode.SRC_ATOP);
        this.f19334b.setTextColor(this.f19301a.getResources().getColor(C1410R.color.white));
        this.f19351e.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro_white));
        this.f19312a.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104426847180615L)), PorterDuff.Mode.SRC_ATOP);
        this.f19313a.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19346d.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus));
        this.f19341c.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104461206918983L)), PorterDuff.Mode.SRC_ATOP);
        this.f19342c.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19359g.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro));
        this.f19355f.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus));
        this.f19350d = false;
        this.f19354e = false;
        if (!this.f19336b.equalsIgnoreCase(pj0.m61166a(-104495566657351L))) {
            this.f19379p = -1;
            this.f19307a.setText(pj0.m61166a(-104521336461127L));
        }
        if (!this.f19343c.equalsIgnoreCase(pj0.m61166a(-104525631428423L))) {
            this.f19377o = -1;
            this.f19329b.setText(pj0.m61166a(-104551401232199L));
        }
        this.f19314a.setVisibility(8);
        if (this.f19381r != this.f19380q) {
            mo23316c1();
        } else {
            mo23305R0(f19299q);
        }
        new Handler().postDelayed(new ep2(this), 100);
        String str2 = this.f19356f;
        if (str2 != null && !str2.isEmpty() && (str = this.f19352e) != null && !str.isEmpty()) {
            mo23300H1();
            new Handler().postDelayed(new ap2(this), 105);
        }
    }

    /* renamed from: F1 */
    public final void mo23298F1() {
        String str;
        this.f19378o.clear();
        this.f19378o.add(pj0.m61166a(-104555696199495L));
        this.f19378o.add(pj0.m61166a(-104581466003271L));
        this.f19378o.add(pj0.m61166a(-104598645872455L));
        this.f19376n.clear();
        nz2 nz2 = this.f19322a;
        if (nz2 != null) {
            nz2.notifyDataSetChanged();
        }
        this.f19373m = pj0.m61166a(-104624415676231L);
        vi4.m30128n(getContext(), this, this.f19378o);
        a44.m10782m(getContext(), this);
        this.f19333b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104628710643527L)), PorterDuff.Mode.SRC_ATOP);
        this.f19334b.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19351e.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro));
        this.f19312a.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104663070381895L)), PorterDuff.Mode.SRC_ATOP);
        this.f19313a.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19346d.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus));
        this.f19341c.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104697430120263L)), PorterDuff.Mode.SRC_ATOP);
        this.f19342c.setTextColor(this.f19301a.getResources().getColor(C1410R.color.white));
        this.f19359g.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro_white));
        this.f19355f.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus_white));
        this.f19350d = false;
        this.f19354e = true;
        if (!this.f19336b.equalsIgnoreCase(pj0.m61166a(-104731789858631L))) {
            this.f19379p = -1;
            this.f19307a.setText(pj0.m61166a(-104757559662407L));
        }
        if (!this.f19343c.equalsIgnoreCase(pj0.m61166a(-104761854629703L))) {
            this.f19377o = -1;
            this.f19329b.setText(pj0.m61166a(-104787624433479L));
        }
        this.f19314a.setVisibility(8);
        mo23305R0(f19299q);
        new Handler().postDelayed(new cp2(this), 100);
        String str2 = this.f19356f;
        if (str2 != null && !str2.isEmpty() && (str = this.f19352e) != null && !str.isEmpty()) {
            mo23300H1();
            new Handler().postDelayed(new fp2(this), 110);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: G1 */
    public final void mo23299G1() {
        LocationRequest K2 = LocationRequest.m8995K2();
        K2.mo10538j3(100);
        K2.mo10534g3(5);
        K2.mo10533f3(0);
        K2.mo10537i3(1);
        jd1 b = b82.m11677b(this.f19301a);
        this.f19321a = b;
        z62 z62 = this.f19324a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        b.mo18262A(K2, z62, myLooper);
    }

    /* renamed from: H1 */
    public final void mo23300H1() {
        long j;
        this.f19307a.clearFocus();
        this.f19329b.clearFocus();
        if (this.f19349d.size() > 0 && this.f19379p == -1) {
            this.f19379p = 10000;
        }
        if (this.f19353e.size() > 0 && this.f19377o == -1) {
            this.f19377o = 10000;
        }
        if (this.f19377o == -1 || this.f19379p == -1) {
            Toast.makeText(this.f19301a, pj0.m61166a(-106260798216007L), 0).show();
            return;
        }
        this.f19308a.setVisibility(8);
        this.f19330b.setVisibility(8);
        String str = this.f19363h;
        if (str == null || str.isEmpty()) {
            this.f19363h = this.f19325a.format(new Date());
        }
        if (this.f19350d) {
            mo23310W0(this.f19379p, this.f19377o, this.f19363h, this.f19356f, this.f19352e);
            j = -106192078739271L;
        } else if (this.f19354e) {
            mo23313Z0(this.f19379p, this.f19377o, this.f19363h);
            j = -106209258608455L;
        } else {
            mo23312Y0(this.f19379p, this.f19377o, this.f19363h);
            j = -106235028412231L;
        }
        this.f19371l = pj0.m61166a(j);
        String trim = this.f19307a.getText().toString().trim();
        this.f19367j = trim;
        if (trim.isEmpty()) {
            this.f19367j = this.f19307a.getHint().toString().trim();
        }
        this.f19369k = this.f19329b.getText().toString().trim();
    }

    /* renamed from: I1 */
    public final void mo23301I1() {
        C3326i iVar = new C3326i(30000, 1000);
        this.f19305a = iVar;
        iVar.start();
    }

    /* renamed from: J1 */
    public final void mo23302J1() {
        String str;
        EditText editText;
        String str2;
        EditText editText2;
        String str3 = this.f19356f;
        int i = this.f19379p;
        ArrayList<Double> arrayList = this.f19349d;
        if (this.f19307a.getText().toString().equals(pj0.m61166a(-104791919400775L))) {
            this.f19329b.setHint(pj0.m61166a(-104796214368071L));
        }
        if (this.f19329b.getText().toString().equals(pj0.m61166a(-104847753975623L))) {
            this.f19307a.setHint(pj0.m61166a(-104852048942919L));
        }
        String str4 = this.f19352e;
        this.f19356f = str4;
        this.f19379p = this.f19377o;
        this.f19349d = this.f19353e;
        this.f19352e = str3;
        this.f19377o = i;
        this.f19353e = arrayList;
        if (str4.equalsIgnoreCase(pj0.m61166a(-104882113713991L))) {
            this.f19307a.setHint(pj0.m61166a(-104933653321543L));
            editText = this.f19307a;
            str = pj0.m61166a(-104985192929095L);
        } else {
            editText = this.f19307a;
            str = this.f19356f;
        }
        editText.setText(str);
        if (this.f19352e.equalsIgnoreCase(pj0.m61166a(-104989487896391L))) {
            this.f19329b.setHint(pj0.m61166a(-105041027503943L));
            editText2 = this.f19329b;
            str2 = pj0.m61166a(-105092567111495L);
        } else {
            editText2 = this.f19329b;
            str2 = this.f19352e;
        }
        editText2.setText(str2);
        String str5 = this.f19336b;
        this.f19336b = this.f19343c;
        this.f19343c = str5;
        this.f19311a.setVisibility(8);
        this.f19310a.setVisibility(8);
        mo23300H1();
    }

    /* renamed from: K1 */
    public final void mo23303K1(PastSearchTripPlanner pastSearchTripPlanner, int i) {
        if (mo23319f1()) {
            vi4.m30131q(getContext(), this, pastSearchTripPlanner.getStop_name(), pastSearchTripPlanner.getStop_type(), i);
        }
    }

    /* renamed from: L1 */
    public final void mo23304L1(AllStops allStops, int i) {
        if (mo23319f1()) {
            vi4.m30131q(getContext(), this, allStops.getName(), allStops.getStop_type(), i);
        }
    }

    /* renamed from: R0 */
    public final void mo23305R0(ArrayList<AllStops> arrayList) {
        if (arrayList != null) {
            this.f19374m = arrayList;
            C3509se seVar = new C3509se(this.f19301a, C1410R.layout.dropdown_directions, this.f19374m);
            this.f19323a = seVar;
            this.f19311a.setAdapter(seVar);
            this.f19311a.setOnItemClickListener(this.f19306a);
            return;
        }
        Context context = this.f19301a;
        if (context != null) {
            Toast.makeText(context, getResources().getString(C1410R.string.fetch_problem), 1).show();
        }
    }

    /* renamed from: S0 */
    public final void mo23306S0() {
        String str;
        this.f19376n.clear();
        nz2 nz2 = this.f19322a;
        if (nz2 != null) {
            nz2.notifyDataSetChanged();
        }
        this.f19373m = pj0.m61166a(-104083249796935L);
        this.f19312a.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104087544764231L)), PorterDuff.Mode.SRC_ATOP);
        this.f19313a.setTextColor(this.f19301a.getResources().getColor(C1410R.color.white));
        this.f19346d.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus_white));
        this.f19333b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104121904502599L)), PorterDuff.Mode.SRC_ATOP);
        this.f19334b.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19351e.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro));
        this.f19341c.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-104156264240967L)), PorterDuff.Mode.SRC_ATOP);
        this.f19342c.setTextColor(this.f19301a.getResources().getColor(C1410R.color.gray_60));
        this.f19359g.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_metro));
        this.f19355f.setImageDrawable(r70.m26356i(this.f19301a, C1410R.C1411drawable.ic_bus));
        this.f19350d = true;
        this.f19354e = false;
        this.f19378o.clear();
        this.f19378o.add(pj0.m61166a(-104190623979335L));
        this.f19378o.add(pj0.m61166a(-104207803848519L));
        vi4.m30128n(getContext(), this, this.f19378o);
        a44.m10783n(getContext(), this, pj0.m61166a(-104233573652295L));
        if (!this.f19336b.equalsIgnoreCase(pj0.m61166a(-104250753521479L))) {
            this.f19379p = -1;
            this.f19307a.setText(pj0.m61166a(-104276523325255L));
        }
        if (!this.f19343c.equalsIgnoreCase(pj0.m61166a(-104280818292551L))) {
            this.f19377o = -1;
            this.f19329b.setText(pj0.m61166a(-104306588096327L));
        }
        if (this.f19383t != this.f19382s) {
            mo23315b1();
        } else {
            mo23305R0(f19298p);
        }
        new Handler().postDelayed(new bp2(this), 100);
        String str2 = this.f19356f;
        if (str2 != null && !str2.isEmpty() && (str = this.f19352e) != null && !str.isEmpty()) {
            mo23300H1();
            new Handler().postDelayed(new gp2(this), 110);
        }
    }

    /* renamed from: T0 */
    public final void mo23307T0() {
        CountDownTimer countDownTimer = this.f19305a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f19300a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: U0 */
    public final void mo23308U0(List<Stops> list) {
        this.f19374m.clear();
        for (Stops next : list) {
            this.f19374m.add(new AllStops(next.getStop_id(), Double.valueOf(next.getLat()), Double.valueOf(next.getLon()), next.getStop_name(), next.getStop_desc(), next.getStop_type(), (ArrayList<String>) null));
        }
        mo23305R0(this.f19350d ? f19298p : f19299q);
        this.f19323a.notifyDataSetChanged();
    }

    /* renamed from: V0 */
    public final void mo23309V0(ArrayList<AllStops> arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<AllStops> it = arrayList.iterator();
        while (it.hasNext()) {
            AllStops next = it.next();
            arrayList2.add(new Stops(next.getId(), next.getName(), next.getLat().doubleValue(), next.getLng().doubleValue(), next.getStop_type(), next.getNext_stop(), -1));
        }
        a44.m10785p(getContext(), this, arrayList2, str);
    }

    /* renamed from: W0 */
    public final void mo23310W0(int i, int i2, String str, String str2, String str3) {
        String str4;
        String str5;
        if (mo23319f1()) {
            this.f19300a.setMessage(pj0.m61166a(-105487704102727L));
            this.f19300a.show();
        }
        mo23301I1();
        if (this.f19336b.equalsIgnoreCase(pj0.m61166a(-105569308481351L))) {
            str4 = this.f19349d.toString();
        } else {
            str4 = pj0.m61166a(-105595078285127L) + i + pj0.m61166a(-105603668219719L);
            this.f19336b = pj0.m61166a(-105612258154311L);
        }
        String str6 = str4;
        if (this.f19343c.equalsIgnoreCase(pj0.m61166a(-105629438023495L))) {
            str5 = this.f19353e.toString();
        } else {
            str5 = pj0.m61166a(-105655207827271L) + i2 + pj0.m61166a(-105663797761863L);
            this.f19343c = pj0.m61166a(-105672387696455L);
        }
        String str7 = str5;
        DirectionsViewModel directionsViewModel = new DirectionsViewModel();
        if (mo23319f1()) {
            directionsViewModel.getDirectionsBus(str6, str2, str7, str3, str, this.f19336b, this.f19343c, this.f19348d).mo4926j(requireActivity(), new uo2(this));
        }
    }

    /* renamed from: X0 */
    public final void mo23311X0() {
        if (!mo23319f1() || r70.m26348a(requireActivity(), pj0.m61166a(-106381057300295L)) == 0 || r70.m26348a(requireActivity(), pj0.m61166a(-106552855992135L)) == 0) {
            this.f19321a.mo18272U().mo17573e(new zo2(this));
        } else {
            Toast.makeText(requireActivity(), pj0.m61166a(-106733244618567L), 0).show();
        }
    }

    /* renamed from: Y0 */
    public final void mo23312Y0(int i, int i2, String str) {
        String str2;
        String str3;
        if (mo23319f1()) {
            this.f19300a.setMessage(pj0.m61166a(-105960150505287L));
            this.f19300a.show();
        }
        if (this.f19336b.equalsIgnoreCase(pj0.m61166a(-106054639785799L))) {
            str2 = this.f19349d.toString();
        } else {
            str2 = pj0.m61166a(-106080409589575L) + i + pj0.m61166a(-106088999524167L);
            this.f19336b = pj0.m61166a(-106097589458759L);
        }
        String str4 = str2;
        if (this.f19343c.equalsIgnoreCase(pj0.m61166a(-106123359262535L))) {
            str3 = this.f19353e.toString();
        } else {
            str3 = pj0.m61166a(-106149129066311L) + i2 + pj0.m61166a(-106157719000903L);
            this.f19343c = pj0.m61166a(-106166308935495L);
        }
        String str5 = str3;
        mo23301I1();
        DirectionsViewModel directionsViewModel = new DirectionsViewModel();
        if (mo23319f1()) {
            directionsViewModel.getDirectionsMetro(str4, this.f19356f, str5, this.f19352e, str, this.f19336b, this.f19343c, this.f19348d).mo4926j(requireActivity(), new C3324g());
        }
    }

    /* renamed from: Z0 */
    public final void mo23313Z0(int i, int i2, String str) {
        String str2;
        String str3;
        if (mo23319f1()) {
            this.f19300a.setMessage(pj0.m61166a(-105689567565639L));
            this.f19300a.show();
        }
        mo23301I1();
        if (this.f19336b.equalsIgnoreCase(pj0.m61166a(-105771171944263L))) {
            str2 = this.f19349d.toString();
        } else {
            if (this.f19339b || this.f19336b.equalsIgnoreCase(pj0.m61166a(-105796941748039L))) {
                i += 99999;
                this.f19336b = pj0.m61166a(-105822711551815L);
            }
            str2 = pj0.m61166a(-105848481355591L) + i + pj0.m61166a(-105857071290183L);
        }
        String str4 = str2;
        if (this.f19343c.equalsIgnoreCase(pj0.m61166a(-105865661224775L))) {
            str3 = this.f19353e.toString();
        } else {
            if (this.f19345c || this.f19343c.equalsIgnoreCase(pj0.m61166a(-105891431028551L))) {
                i2 += 99999;
                this.f19343c = pj0.m61166a(-105917200832327L);
            }
            str3 = pj0.m61166a(-105942970636103L) + i2 + pj0.m61166a(-105951560570695L);
        }
        String str5 = str3;
        DirectionsViewModel directionsViewModel = new DirectionsViewModel();
        if (mo23319f1()) {
            directionsViewModel.getDirectionsMultiModal(str4, this.f19356f, str5, this.f19352e, str, this.f19336b, this.f19343c, this.f19348d).mo4926j(requireActivity(), new vo2(this));
        }
    }

    /* renamed from: a1 */
    public final void mo23314a1(String str, String str2) {
        this.f19319a.mo15163b(str).mo4926j(this, new yo2(this, str, str2));
    }

    /* renamed from: b1 */
    public final void mo23315b1() {
        if (mo23319f1()) {
            if (this.f19383t != this.f19382s) {
                ProgressDialog progressDialog = new ProgressDialog(requireActivity());
                progressDialog.setMessage(pj0.m61166a(-105268660770631L));
                progressDialog.setCancelable(false);
                progressDialog.show();
                mo23301I1();
                new DirectionsViewModel().getStopsBus().mo4926j(requireActivity(), new wo2(this, progressDialog));
            }
        } else if (this.f19350d) {
            ArrayList<AllStops> arrayList = f19298p;
            if (arrayList != null) {
                mo23305R0(arrayList);
            } else {
                Toast.makeText(this.f19301a, getResources().getString(C1410R.string.no_resp_from_server), 0).show();
            }
        }
    }

    /* renamed from: c */
    public void mo21495c(boolean z, List<PastSearchTripPlanner> list) {
        if (!z || !mo23319f1()) {
            this.f19376n.clear();
            this.f19322a.notifyDataSetChanged();
            if (mo23319f1()) {
                Toast.makeText(getContext(), pj0.m61166a(-108163468728135L), 0).show();
            }
            s41.m27245c(pj0.m61166a(-108288022779719L), pj0.m61166a(-108352447289159L));
            return;
        }
        this.f19376n.clear();
        if (list.size() == 0) {
            Toast.makeText(getContext(), pj0.m61166a(-108064684480327L), 0).show();
            return;
        }
        for (PastSearchTripPlanner next : list) {
            this.f19338b.put(next.getStop_name(), Integer.valueOf(next.getCount()));
            this.f19376n.add(next);
        }
        this.f19322a.notifyDataSetChanged();
    }

    /* renamed from: c1 */
    public final void mo23316c1() {
        if (mo23319f1()) {
            ProgressDialog progressDialog = new ProgressDialog(requireActivity());
            progressDialog.setMessage(pj0.m61166a(-105384624887623L));
            progressDialog.setCancelable(false);
            progressDialog.show();
            if (this.f19381r != this.f19380q) {
                mo23301I1();
                ((DirectionsViewModel) new C0709m(this).mo5027a(DirectionsViewModel.class)).getStopsMetro().mo4926j(requireActivity(), new xo2(this, progressDialog));
            } else if (!this.f19350d) {
                ArrayList<AllStops> arrayList = f19299q;
                if (arrayList != null) {
                    mo23305R0(arrayList);
                    return;
                }
                Context context = this.f19301a;
                if (context != null) {
                    Toast.makeText(context, getResources().getString(C1410R.string.some_error_occurred), 0).show();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo14314d(int i) {
        if (mo23319f1()) {
            Intent intent = new Intent(requireActivity(), DirectionRouteViewer.class);
            intent.putExtra(pj0.m61166a(-107119791675207L), i);
            intent.putExtra(pj0.m61166a(-107197101086535L), this.f19317a);
            intent.putExtra(pj0.m61166a(-107274410497863L), this.f19367j);
            intent.putExtra(pj0.m61166a(-107325950105415L), this.f19369k);
            intent.putExtra(pj0.m61166a(-107398964549447L), this.f19377o);
            intent.putExtra(pj0.m61166a(-107484863895367L), this.f19367j);
            intent.putExtra(pj0.m61166a(-107562173306695L), this.f19356f);
            intent.putExtra(pj0.m61166a(-107630892783431L), this.f19353e);
            intent.putExtra(pj0.m61166a(-107721087096647L), this.f19349d);
            intent.putExtra(pj0.m61166a(-107794101540679L), this.f19371l);
            startActivity(intent);
        }
    }

    /* renamed from: d1 */
    public final void mo23317d1() {
        if (mo23319f1()) {
            InputMethodManager inputMethodManager = (InputMethodManager) requireActivity().getSystemService(pj0.m61166a(-106870683572039L));
            View currentFocus = requireActivity().getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(requireActivity());
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: e */
    public void mo19919e(boolean z, boolean z2, String str) {
        if (z && z2 && str != null) {
            if (str.equalsIgnoreCase(pj0.m61166a(-107849936115527L))) {
                this.f19382s = this.f19383t;
                this.f19302a.putInt(pj0.m61166a(-107867115984711L), this.f19383t);
                this.f19302a.apply();
            }
            if (str.equalsIgnoreCase(pj0.m61166a(-107927245526855L))) {
                this.f19380q = this.f19381r;
                this.f19302a.putInt(pj0.m61166a(-107953015330631L), this.f19381r);
                this.f19302a.apply();
            }
        }
    }

    /* renamed from: e1 */
    public final void mo23318e1(AllStops allStops) {
        if (mo23319f1()) {
            vi4.m30130p(getContext(), this, allStops, 1);
        }
    }

    /* renamed from: f1 */
    public final boolean mo23319f1() {
        try {
            if (!isAdded()) {
                return false;
            }
            requireActivity();
            return true;
        } catch (IllegalStateException unused) {
            c41.m40702d().mo32241g(new Exception(pj0.m61166a(-106926518146887L)));
            c41.m40702d().mo32242h();
            return false;
        }
    }

    /* renamed from: h */
    public void mo21496h(boolean z) {
    }

    /* renamed from: i */
    public void mo19920i(boolean z, List<Stops> list) {
        if (z) {
            mo23308U0(list);
        } else if (this.f19371l.equalsIgnoreCase(pj0.m61166a(-108021734807367L))) {
            mo23315b1();
        } else if (this.f19371l.equalsIgnoreCase(pj0.m61166a(-108038914676551L))) {
            mo23316c1();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f19301a = context.getApplicationContext();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!mo23319f1()) {
            return null;
        }
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_direction_new, viewGroup, false);
        this.f19307a = (EditText) inflate.findViewById(C1410R.C1412id.edit_source_stop);
        this.f19329b = (EditText) inflate.findViewById(C1410R.C1412id.edit_destination_stop);
        this.f19308a = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_src);
        this.f19330b = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_dest);
        this.f19311a = (ListView) inflate.findViewById(C1410R.C1412id.lv_routes);
        this.f19332b = (ListView) inflate.findViewById(C1410R.C1412id.lv_pastSearches);
        this.f19314a = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_routes);
        this.f19309a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_1);
        this.f19331b = (ImageView) inflate.findViewById(C1410R.C1412id.iv_3);
        this.f19312a = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rl_bus);
        this.f19333b = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rl_metro);
        this.f19341c = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rl_multi);
        this.f19351e = (ImageView) inflate.findViewById(C1410R.C1412id.metro_img);
        this.f19359g = (ImageView) inflate.findViewById(C1410R.C1412id.iv_multi_img_2);
        this.f19355f = (ImageView) inflate.findViewById(C1410R.C1412id.iv_multi_img_1);
        this.f19346d = (ImageView) inflate.findViewById(C1410R.C1412id.bus_img);
        this.f19340c = (ImageView) inflate.findViewById(C1410R.C1412id.iv_time_clock);
        this.f19342c = (TextView) inflate.findViewById(C1410R.C1412id.tv_3);
        this.f19334b = (TextView) inflate.findViewById(C1410R.C1412id.tv_2);
        this.f19313a = (TextView) inflate.findViewById(C1410R.C1412id.tv_1);
        this.f19347d = (TextView) inflate.findViewById(C1410R.C1412id.tv_my_location);
        this.f19310a = (LinearLayout) inflate.findViewById(C1410R.C1412id.ll_past_searches);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_swap);
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_settings)).setOnClickListener(new lp2(this));
        this.f19350d = true;
        this.f19354e = false;
        this.f19300a = new ProgressDialog(requireActivity());
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(pj0.m61166a(-103597918492487L), 0);
        this.f19303a = sharedPreferences;
        this.f19302a = sharedPreferences.edit();
        this.f19380q = this.f19303a.getInt(pj0.m61166a(-103683817838407L), 0);
        this.f19381r = this.f19303a.getInt(pj0.m61166a(-103752537315143L), 0);
        this.f19382s = this.f19303a.getInt(pj0.m61166a(-103851321562951L), 0);
        this.f19383t = this.f19303a.getInt(pj0.m61166a(-103911451105095L), 0);
        ArrayList<Routes_list_item> arrayList = new ArrayList<>();
        this.f19344c = arrayList;
        this.f19318a = new co3(arrayList, this, false);
        this.f19319a = new C2057ef();
        this.f19323a = new C3509se(getContext(), C1410R.layout.dropdown_directions, this.f19374m);
        this.f19378o.add(pj0.m61166a(-104001645418311L));
        this.f19378o.add(pj0.m61166a(-104018825287495L));
        mo23306S0();
        vi4.m30128n(getContext(), this, this.f19378o);
        if (bundle != null) {
            this.f19304a = (Location) bundle.getParcelable(pj0.m61166a(-104044595091271L));
        }
        this.f19321a = b82.m11677b(this.f19301a);
        mo23311X0();
        nz2 nz2 = new nz2(getContext(), C1410R.layout.dropdown_directions, this.f19376n);
        this.f19322a = nz2;
        this.f19332b.setAdapter(nz2);
        this.f19332b.setOnItemClickListener(this.f19328b);
        this.f19347d.setOnClickListener(new kp2(this));
        this.f19307a.setOnTouchListener(new to2(this));
        this.f19329b.setOnTouchListener(new op2(this));
        relativeLayout.setOnClickListener(new ip2(this));
        this.f19312a.setOnClickListener(new jp2(this));
        this.f19333b.setOnClickListener(new so2(this));
        this.f19341c.setOnClickListener(new mp2(this));
        this.f19308a.setOnClickListener(new hp2(this));
        this.f19330b.setOnClickListener(new dp2(this));
        this.f19314a.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.f19314a.setItemAnimator(new C0887h());
        this.f19314a.setAdapter(this.f19318a);
        this.f19307a.addTextChangedListener(new C3318a());
        this.f19329b.addTextChangedListener(new C3319b());
        this.f19340c.setOnClickListener(new np2(this));
        return inflate;
    }
}
