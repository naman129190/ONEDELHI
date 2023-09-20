package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.activities.EVDetailsActivity;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.EVSearches;
import com.delhitransport.onedelhi.p001db.EvAllSearch;
import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.delhitransport.onedelhi.p002ev.EVRequest;
import com.delhitransport.onedelhi.p002ev.EVSearch;
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
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.a60;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"MissingPermission"})
public class rq2 extends Fragment implements hu4 {

    /* renamed from: a */
    public static InputMethodManager f19985a = null;

    /* renamed from: h */
    public static ArrayList<EVConnector> f19986h = new ArrayList<>();

    /* renamed from: s */
    public static final int f19987s = 123;

    /* renamed from: t */
    public static final int f19988t = 11;

    /* renamed from: a */
    public ProgressDialog f19989a;

    /* renamed from: a */
    public Context f19990a;

    /* renamed from: a */
    public SharedPreferences f19991a;

    /* renamed from: a */
    public final Location f19992a = new Location(pj0.m61166a(-110083319109447L));

    /* renamed from: a */
    public CountDownTimer f19993a;

    /* renamed from: a */
    public AutoCompleteTextView f19994a;

    /* renamed from: a */
    public ImageButton f19995a;

    /* renamed from: a */
    public ImageView f19996a;

    /* renamed from: a */
    public ListView f19997a;

    /* renamed from: a */
    public RelativeLayout.LayoutParams f19998a;

    /* renamed from: a */
    public RelativeLayout f19999a;

    /* renamed from: a */
    public RecyclerView f20000a;

    /* renamed from: a */
    public EVRequest f20001a = new EVRequest();

    /* renamed from: a */
    public EVStations f20002a = new EVStations();

    /* renamed from: a */
    public MapView f20003a;

    /* renamed from: a */
    public FloatingActionButton f20004a;

    /* renamed from: a */
    public a60.C1654b f20005a;

    /* renamed from: a */
    public C1693af f20006a;

    /* renamed from: a */
    public gu4 f20007a;

    /* renamed from: a */
    public jd1 f20008a;

    /* renamed from: a */
    public mz2 f20009a;

    /* renamed from: a */
    public th1 f20010a;

    /* renamed from: a */
    public final z62 f20011a = new C3437a();

    /* renamed from: a */
    public final SimpleDateFormat f20012a = new SimpleDateFormat(pj0.m61166a(-110027484534599L), Locale.ENGLISH);

    /* renamed from: a */
    public ArrayList<EVdata> f20013a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, String> f20014a = new HashMap<>();

    /* renamed from: a */
    public List<String> f20015a;

    /* renamed from: b */
    public Location f20016b;

    /* renamed from: b */
    public ImageButton f20017b;

    /* renamed from: b */
    public ListView f20018b;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f20019b;

    /* renamed from: b */
    public RelativeLayout f20020b;

    /* renamed from: b */
    public RecyclerView f20021b;

    /* renamed from: b */
    public FloatingActionButton f20022b;

    /* renamed from: b */
    public a60.C1654b f20023b;

    /* renamed from: b */
    public String f20024b = pj0.m61166a(-110087614076743L);

    /* renamed from: b */
    public ArrayList<EVdata> f20025b = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, od2> f20026b = new HashMap<>();

    /* renamed from: b */
    public boolean f20027b = false;

    /* renamed from: c */
    public Location f20028c;

    /* renamed from: c */
    public RelativeLayout.LayoutParams f20029c;

    /* renamed from: c */
    public RelativeLayout f20030c;

    /* renamed from: c */
    public RecyclerView f20031c;

    /* renamed from: c */
    public String f20032c;

    /* renamed from: c */
    public ArrayList<EVdata> f20033c = new ArrayList<>();

    /* renamed from: c */
    public final HashMap<String, String> f20034c = new HashMap<>();

    /* renamed from: c */
    public boolean f20035c;

    /* renamed from: d */
    public RelativeLayout.LayoutParams f20036d;

    /* renamed from: d */
    public RelativeLayout f20037d;

    /* renamed from: d */
    public RecyclerView f20038d;

    /* renamed from: d */
    public ArrayList<EVConnector> f20039d = new ArrayList<>();

    /* renamed from: d */
    public final HashMap<String, String> f20040d = new HashMap<>();

    /* renamed from: d */
    public boolean f20041d;

    /* renamed from: e */
    public RelativeLayout.LayoutParams f20042e;

    /* renamed from: e */
    public ArrayList<EVConnector> f20043e = new ArrayList<>();

    /* renamed from: e */
    public final HashMap<String, Integer> f20044e = new HashMap<>();

    /* renamed from: e */
    public boolean f20045e = false;

    /* renamed from: f */
    public ArrayList<String> f20046f;

    /* renamed from: f */
    public final HashMap<String, String> f20047f = new HashMap<>();

    /* renamed from: f */
    public boolean f20048f = false;

    /* renamed from: g */
    public ArrayList<String> f20049g;

    /* renamed from: g */
    public boolean f20050g;

    /* renamed from: n */
    public int f20051n = 0;

    /* renamed from: o */
    public int f20052o = 0;

    /* renamed from: p */
    public int f20053p = 0;

    /* renamed from: q */
    public int f20054q;

    /* renamed from: r */
    public int f20055r = 0;

    /* renamed from: com.onedelhi.secure.rq2$a */
    public class C3437a extends z62 {
        public C3437a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            rq2.this.f20010a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 11.0f));
            rq2.this.f19992a.setLatitude(M2.getLatitude());
            rq2.this.f19992a.setLongitude(M2.getLongitude());
            rq2.this.f20010a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(rq2.this.f19992a.getLatitude(), rq2.this.f19992a.getLongitude())).mo10680e(11.0f).mo10677b()));
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$b */
    public class C3438b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public boolean f20058a;

        public C3438b() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                DatabaseClient.getInstance(rq2.this.f19990a).getAppDatabase().evAllSearchDao().deleteAll();
                this.f20058a = true;
                return null;
            } catch (Exception unused) {
                this.f20058a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$c */
    public class C3439c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public List<EvAllSearch> f20060a = null;

        /* renamed from: a */
        public boolean f20061a;

        public C3439c() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                this.f20060a = DatabaseClient.getInstance(rq2.this.f19990a).getAppDatabase().evAllSearchDao().getAll();
                this.f20061a = true;
                return null;
            } catch (Exception unused) {
                this.f20061a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            if (this.f20061a) {
                for (int i = 0; i < this.f20060a.size(); i++) {
                    HashMap p0 = rq2.this.f20034c;
                    p0.put(this.f20060a.get(i).getName() + pj0.m61166a(-109726836823879L) + this.f20060a.get(i).getAddress(), this.f20060a.get(i).getId());
                }
                C1693af unused = rq2.this.f20006a = new C1693af(rq2.this.f19990a, C1410R.layout.filter_station_item, rq2.this.f20034c);
                rq2.this.f19997a.setAdapter(rq2.this.f20006a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$d */
    public class C3440d extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f20063a;

        /* renamed from: a */
        public boolean f20064a;

        public C3440d(ArrayList arrayList) {
            this.f20063a = arrayList;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            int i = 0;
            while (i < this.f20063a.size()) {
                try {
                    EvAllSearch evAllSearch = new EvAllSearch();
                    evAllSearch.setId(((EVSearchData) this.f20063a.get(i)).getId());
                    evAllSearch.setAddress(((EVSearchData) this.f20063a.get(i)).getAddress());
                    evAllSearch.setName(((EVSearchData) this.f20063a.get(i)).getName());
                    try {
                        DatabaseClient.getInstance(rq2.this.f19990a).getAppDatabase().evAllSearchDao().insert(evAllSearch);
                    } catch (Exception unused) {
                    }
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f20064a = false;
                    return null;
                }
            }
            this.f20064a = true;
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            if (this.f20064a) {
                SharedPreferences.Editor edit = rq2.this.f19991a.edit();
                edit.putString(pj0.m61166a(-109735426758471L), rq2.this.f20012a.format(new Date()));
                edit.apply();
                rq2.this.mo23991B0();
            } else if (rq2.this.mo24009T0()) {
                Toast.makeText(rq2.this.getContext(), pj0.m61166a(-109799851267911L), 0).show();
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.rq2$e */
    public class C3441e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final EVSearches f20065a = new EVSearches();

        /* renamed from: a */
        public final /* synthetic */ String f20067a;

        /* renamed from: b */
        public final /* synthetic */ String f20068b;

        /* renamed from: c */
        public final /* synthetic */ String f20069c;

        public C3441e(String str, String str2, String str3) {
            this.f20067a = str;
            this.f20068b = str2;
            this.f20069c = str3;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                this.f20065a.setId(this.f20067a);
                this.f20065a.setName(this.f20068b);
                this.f20065a.setAddress(this.f20069c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(rq2.this.f19990a).getAppDatabase().evSearchDao().insert(this.f20065a);
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

    /* renamed from: com.onedelhi.secure.rq2$f */
    public class C3442f implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f20071a;

        public C3442f(ArrayList arrayList) {
            this.f20071a = arrayList;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = rq2.this.f20024b = (String) this.f20071a.get(i);
            int unused2 = rq2.this.f20055r = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.rq2$g */
    public class C3443g extends AsyncTask<Void, Void, List<EVSearchData>> {
        public C3443g() {
        }

        /* renamed from: a */
        public List<EVSearchData> doInBackground(Void... voidArr) {
            try {
                return DatabaseClient.getInstance(rq2.this.f19990a).getAppDatabase().evSearchDao().getAll();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(List<EVSearchData> list) {
            super.onPostExecute(list);
            rq2.this.f20040d.clear();
            if (list != null && list.size() != 0) {
                ArrayList unused = rq2.this.f20046f = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    rq2.this.f20046f.add(list.get(i).getId());
                    HashMap f0 = rq2.this.f20040d;
                    f0.put(list.get(i).getName() + pj0.m61166a(-109885750613831L) + list.get(i).getAddress(), list.get(i).getId());
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$h */
    public class C3444h implements a60.C1654b {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup f20073a;

        public C3444h(RadioGroup radioGroup) {
            this.f20073a = radioGroup;
        }

        /* renamed from: a */
        public void mo12740a(View view, int i) {
            this.f20073a.clearCheck();
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$i */
    public class C3445i implements a60.C1654b {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup f20075a;

        public C3445i(RadioGroup radioGroup) {
            this.f20075a = radioGroup;
        }

        /* renamed from: a */
        public void mo12740a(View view, int i) {
            this.f20075a.clearCheck();
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$j */
    public class C3446j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ EVSearch f20077a;

        public C3446j(EVSearch eVSearch) {
            this.f20077a = eVSearch;
        }

        public void run() {
            rq2.this.mo24007R0(this.f20077a.getData());
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$k */
    public class C3447k implements TextWatcher {
        public C3447k() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (rq2.this.f19994a.getText().toString().equals(pj0.m61166a(-109894340548423L))) {
                rq2.this.f19995a.setVisibility(8);
                rq2.this.f19997a.setVisibility(8);
                rq2.this.f20018b.setVisibility(0);
            } else {
                rq2.this.f19995a.setVisibility(0);
                rq2.this.f19997a.setVisibility(0);
                rq2.this.f20018b.setVisibility(8);
            }
            rq2.this.f20006a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$l */
    public class C3448l implements TextWatcher {
        public C3448l() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (rq2.this.f19994a.getText().toString().equals(pj0.m61166a(-109898635515719L))) {
                rq2.this.f19995a.setVisibility(8);
                rq2.this.f19997a.setVisibility(8);
                rq2.this.f20018b.setVisibility(0);
            } else {
                rq2.this.f19995a.setVisibility(0);
                rq2.this.f19997a.setVisibility(0);
                rq2.this.f20018b.setVisibility(8);
            }
            rq2.this.f20006a.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.onedelhi.secure.rq2$m */
    public class C3449m extends CountDownTimer {

        /* renamed from: a */
        public int f20081a = 0;

        public C3449m(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (rq2.this.mo24009T0() && rq2.this.f19989a != null) {
                rq2.this.f19989a.dismiss();
            }
        }

        public void onTick(long j) {
            int i = this.f20081a + 1;
            this.f20081a = i;
            if (i == 10 && rq2.this.mo24009T0() && rq2.this.f19989a != null) {
                rq2.this.f19989a.setMessage(pj0.m61166a(-109902930483015L));
            }
        }
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m26922U0(Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference, LinearLayout linearLayout, LinearLayout linearLayout2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup2, RadioGroup radioGroup3, int i) {
        long j;
        RadioButton radioButton4 = (RadioButton) dialog.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioButton4.getText().equals(pj0.m61166a(-114477070653255L))) {
                j = -114550085097287L;
            } else if (radioButton4.getText().equals(pj0.m61166a(-114588739802951L))) {
                atomicReference.set(pj0.m61166a(-114644574377799L));
                radioGroup2.clearCheck();
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                radioButton.setClickable(false);
                radioButton2.setClickable(false);
                radioButton3.setClickable(false);
                return;
            } else {
                j = -114717588821831L;
            }
            atomicReference.set(pj0.m61166a(j));
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
            radioButton.setClickable(true);
            radioButton2.setClickable(true);
            radioButton3.setClickable(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m26923V0(Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioGroup radioGroup2, RadioGroup radioGroup3, int i) {
        RecyclerView recyclerView;
        a60 a60;
        RadioButton radioButton = (RadioButton) dialog.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioButton.getText().equals(pj0.m61166a(-114305271961415L))) {
                atomicReference.set(pj0.m61166a(-114318156863303L));
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(8);
                linearLayout3.setVisibility(8);
                radioGroup2.clearCheck();
                f19986h = new ArrayList<>();
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114331041765191L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114348221634375L), this.f20023b, getContext());
            } else if (radioButton.getText().equals(pj0.m61166a(-114365401503559L))) {
                atomicReference.set(pj0.m61166a(-114378286405447L));
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(0);
                linearLayout3.setVisibility(8);
                radioGroup2.clearCheck();
                f19986h = new ArrayList<>();
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114391171307335L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114408351176519L), this.f20023b, getContext());
            } else {
                atomicReference.set(pj0.m61166a(-114425531045703L));
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(0);
                linearLayout3.setVisibility(0);
                f19986h = new ArrayList<>();
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114442710914887L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114459890784071L), this.f20023b, getContext());
            }
            recyclerView.setAdapter(a60);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m26925W0(Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference, RadioGroup radioGroup2, int i) {
        RecyclerView recyclerView;
        a60 a60;
        RadioButton radioButton = (RadioButton) dialog.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioButton.getText().equals(pj0.m61166a(-114051868890951L))) {
                atomicReference.set(pj0.m61166a(-114064753792839L));
                this.f20053p = 1;
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114077638694727L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114090523596615L), this.f20023b, getContext());
            } else if (radioButton.getText().equals(pj0.m61166a(-114103408498503L))) {
                atomicReference.set(pj0.m61166a(-114116293400391L));
                this.f20053p = 2;
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114129178302279L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114142063204167L), this.f20023b, getContext());
            } else if (radioButton.getText().equals(pj0.m61166a(-114154948106055L))) {
                atomicReference.set(pj0.m61166a(-114167833007943L));
                this.f20053p = 3;
                this.f20000a.setAdapter(new a60(this.f20039d, pj0.m61166a(-114180717909831L), this.f20005a, getContext()));
                recyclerView = this.f20021b;
                a60 = new a60(this.f20043e, pj0.m61166a(-114193602811719L), this.f20023b, getContext());
            } else {
                this.f20053p = 0;
                Toast.makeText(getActivity(), pj0.m61166a(-114206487713607L), 0).show();
                return;
            }
            recyclerView.setAdapter(a60);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m26927X0(Switch switchR, Switch switchR2, AtomicReference atomicReference, AtomicReference atomicReference2, Dialog dialog, View view) {
        this.f20035c = switchR.isChecked();
        this.f20041d = switchR2.isChecked();
        mo23990A0((String) atomicReference.get(), (String) atomicReference2.get(), switchR.isChecked(), switchR2.isChecked());
        mo24000K0();
        mo24003N0(this.f19992a.getLatitude(), this.f19992a.getLongitude());
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m26929Y0(List list) {
        if (list == null) {
            try {
                if (mo24009T0()) {
                    Toast.makeText(getContext(), pj0.m61166a(-113832825558855L), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (list.size() != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EVConnector eVConnector = (EVConnector) it.next();
                (eVConnector.getPower_type().equalsIgnoreCase(pj0.m61166a(-113819940656967L)) ? this.f20039d : this.f20043e).add(eVConnector);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ void m26931Z0(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f20028c = location;
            if (location != null) {
                this.f20010a.mo24990w(C3743ut.m29571e(new LatLng(this.f20028c.getLatitude(), this.f20028c.getLongitude()), 11.0f));
                this.f19992a.setLatitude(this.f20028c.getLatitude());
                this.f19992a.setLongitude(this.f20028c.getLongitude());
                this.f20010a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f19992a.getLatitude(), this.f19992a.getLongitude())).mo10680e(11.0f).mo10677b()));
                return;
            }
            mo24010t1();
            return;
        }
        Toast.makeText(this.f19990a, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-114734768691015L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m26933a1(ProgressDialog progressDialog, String str, EVStations eVStations) {
        progressDialog.dismiss();
        if (eVStations != null && mo24009T0()) {
            pj0.m61166a(-113222940202823L);
            if (eVStations.getData() == null || eVStations.getData().size() == 0) {
                progressDialog.dismiss();
                Toast.makeText(getContext(), pj0.m61166a(-113270184843079L), 0).show();
                return;
            }
            EVdata eVdata = eVStations.getData().get(0);
            Location location = new Location(pj0.m61166a(-113248710006599L));
            location.setLongitude(eVdata.getCoordinates().getLongitude());
            location.setLatitude(eVdata.getCoordinates().getLatitude());
            String str2 = mo23995F0(location, this.f19992a) + pj0.m61166a(-113253004973895L);
            try {
                mo24008S0(str, eVdata.getName(), eVdata.getAddress());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(requireActivity(), EVDetailsActivity.class);
            intent.putExtra(pj0.m61166a(-113377559025479L), eVdata);
            intent.putExtra(pj0.m61166a(-113424803665735L), eVStations.getTimestamp());
            intent.putExtra(pj0.m61166a(-113467753338695L), str2);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m26935b1(EVSearch eVSearch) {
        if (eVSearch == null) {
            try {
                Toast.makeText(getContext(), pj0.m61166a(-113489228175175L), 0).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (eVSearch.getData().size() != 0) {
            mo24017y0();
            new Handler().postDelayed(new C3446j(eVSearch), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m26937c1(List list) {
        if (list == null) {
            try {
                if (mo24009T0()) {
                    Toast.makeText(getContext(), pj0.m61166a(-113613782226759L), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (list.size() != 0) {
            this.f20015a = list;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ void m26939d1(AdapterView adapterView, View view, int i, long j) {
        mo24005P0();
        this.f20004a.setVisibility(0);
        this.f20022b.setVisibility(0);
        ArrayList arrayList = (ArrayList) adapterView.getItemAtPosition(i);
        mo23997H0(String.valueOf(this.f20034c.get(((ArrayList) adapterView.getItemAtPosition(i)).get(0))));
        mo24006Q0();
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ void m26941e1(EVStations eVStations) {
        th1 th1;
        od2 od2;
        if (eVStations == null || (th1 = this.f20010a) == null) {
            try {
                Toast.makeText(this.f19990a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            th1.mo24976j();
            this.f20002a = eVStations;
            this.f20025b = eVStations.getData();
            ArrayList<EVdata> data = eVStations.getData();
            this.f20013a = data;
            this.f20033c = data;
            this.f19994a.setHint(eVStations.getSearch_hint());
            if (this.f20013a.size() == 0) {
                try {
                    Toast.makeText(getContext(), pj0.m61166a(-113046846543687L), 0).show();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            LatLngBounds.C1442a aVar = new LatLngBounds.C1442a();
            int i = 0;
            for (int i2 = 0; i2 < this.f20013a.size(); i2++) {
                EVdata eVdata = this.f20013a.get(i2);
                if (eVdata.getEvChargers().size() > i) {
                    i = eVdata.getEvChargers().size();
                }
                this.f20044e.put(eVdata.getId(), Integer.valueOf(i2));
                EVStationCoordinates coordinates = eVdata.getCoordinates();
                int i3 = C1410R.C1411drawable.ic_ev_charger_marker;
                mo23992C0(C1410R.C1411drawable.ic_ev_charger_marker);
                if (eVdata.getStation_type().equalsIgnoreCase(pj0.m61166a(-113124155955015L))) {
                    i3 = C1410R.C1411drawable.ic_battery_swap_marker;
                }
                Bitmap C0 = mo23992C0(i3);
                String str = null;
                if (C0 != null) {
                    od2 = this.f20010a.mo24962c(new sd2().mo24329e3(new LatLng(coordinates.getLatitude(), coordinates.getLongitude())).mo24324Z2(C3858wl.m30941d(C0)));
                    if (od2 != null) {
                        aVar.mo10694b(od2.mo21872c());
                    }
                } else {
                    od2 = null;
                }
                String str2 = eVdata.getName() + ';' + eVdata.getAddress() + ';' + coordinates.getLatitude() + ';' + coordinates.getLongitude() + ';' + eVdata.getId();
                this.f20047f.put(eVdata.getName() + pj0.m61166a(-113197170399047L) + eVdata.getAddress(), eVdata.getId());
                this.f20026b.put(eVdata.getName() + pj0.m61166a(-113205760333639L) + eVdata.getAddress(), od2);
                if (od2 != null) {
                    str = od2.mo21871b();
                }
                if (str != null) {
                    this.f20014a.put(str, str2);
                }
                if (!this.f20034c.isEmpty()) {
                    C1693af afVar = new C1693af(this.f19990a, C1410R.layout.filter_station_item, this.f20034c);
                    this.f20006a = afVar;
                    this.f19997a.setAdapter(afVar);
                }
                this.f19997a.setOnItemClickListener(new qq2(this));
                this.f19994a.addTextChangedListener(new C3448l());
            }
            try {
                LatLngBounds a = aVar.mo10693a();
                int i4 = getResources().getDisplayMetrics().widthPixels;
                this.f20050g = true;
                this.f20010a.mo24970g(C3743ut.m29570d(a, i4, getResources().getDisplayMetrics().heightPixels, (int) (((double) i4) * 0.2d)));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.f20022b.setVisibility(0);
            mo24002M0();
            mo24014w0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m26943f1(AdapterView adapterView, View view, int i, long j) {
        mo24005P0();
        try {
            mo24013v1(this.f20047f.get(((ArrayList) adapterView.getItemAtPosition(i)).get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo24006Q0();
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m26945g1(EVStations eVStations) {
        if (eVStations == null || this.f20010a == null) {
            try {
                Toast.makeText(this.f19990a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f20002a = eVStations;
            this.f20025b = eVStations.getData();
            this.f19994a.setHint(eVStations.getSearch_hint());
            int i = 0;
            for (int i2 = 0; i2 < this.f20025b.size(); i2++) {
                EVdata eVdata = this.f20025b.get(i2);
                if (eVdata.getEvChargers().size() > i) {
                    i = eVdata.getEvChargers().size();
                }
                this.f20044e.put(eVdata.getId(), Integer.valueOf(i2));
                EVStationCoordinates coordinates = eVdata.getCoordinates();
                eVdata.getName();
                eVdata.getAddress();
                coordinates.getLatitude();
                coordinates.getLongitude();
                eVdata.getId();
                HashMap<String, String> hashMap = this.f20047f;
                hashMap.put(eVdata.getName() + pj0.m61166a(-113214350268231L) + eVdata.getAddress(), eVdata.getId());
                C1693af afVar = new C1693af(this.f19990a, C1410R.layout.filter_station_item, this.f20034c);
                this.f20006a = afVar;
                this.f19997a.setAdapter(afVar);
                this.f19997a.setOnItemClickListener(new tp2(this));
                this.f19994a.addTextChangedListener(new C3447k());
            }
        }
        mo24014w0();
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m26947h1() {
        if (!this.f20050g) {
            double d = this.f20010a.mo24978k().f7555a.f7562a;
            double d2 = this.f20010a.mo24978k().f7555a.f7563b;
            Location location = new Location(pj0.m61166a(-115142790584135L));
            location.setLongitude(d2);
            location.setLatitude(d);
            if (this.f20016b == null) {
                mo24000K0();
                mo24003N0(d, d2);
                this.f20016b = location;
            }
            if (mo23995F0(this.f20016b, location) > 2.0f) {
                mo24000K0();
                mo24003N0(d, d2);
                this.f20016b = location;
            }
        }
        this.f20050g = false;
        mo24002M0();
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m26949i1(View view) {
        startActivity(new Intent(this.f19990a, SettingsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ boolean m26951j1(od2 od2) {
        this.f20010a.mo24970g(C3743ut.m29571e(new LatLng(od2.mo21872c().f7562a, od2.mo21872c().f7563b), 11.0f));
        this.f20050g = true;
        mo24002M0();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m26953k1(th1 th1) {
        this.f20010a = th1;
        mo24016x0();
        if (this.f20048f) {
            this.f20010a.mo24940I(true);
            this.f20010a.mo24985r().mo16113o(false);
            this.f20010a.mo24985r().mo16112n(false);
        }
        this.f20010a.mo24942K(new xp2(this));
        this.f20010a.mo24955X(new yp2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m26955l1(AdapterView adapterView, View view, int i, long j) {
        mo24006Q0();
        mo24005P0();
        try {
            mo23997H0((String) ((ArrayList) adapterView.getItemAtPosition(i)).get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ boolean m26957m1(View view, MotionEvent motionEvent) {
        this.f20030c.setVisibility(8);
        this.f20031c.setVisibility(8);
        this.f20027b = true;
        this.f20045e = true;
        this.f20004a.setVisibility(8);
        this.f20022b.setVisibility(8);
        this.f20017b.setImageResource(C1410R.C1411drawable.ic_back_arrow);
        RelativeLayout.LayoutParams layoutParams = this.f20019b;
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        this.f20017b.setPadding(0, 0, 0, 0);
        this.f20017b.setLayoutParams(this.f20019b);
        this.f20020b.setBackgroundColor(getResources().getColor(C1410R.color.white));
        this.f20020b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f20020b.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = this.f20042e;
        layoutParams2.topMargin = 0;
        this.f20037d.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f19994a.getLayoutParams();
        this.f19998a = layoutParams3;
        layoutParams3.topMargin = 0;
        layoutParams3.bottomMargin = 0;
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
        this.f19994a.setLayoutParams(layoutParams3);
        this.f19994a.setBackground(zk3.m33204g(this.f19990a.getResources(), C1410R.C1411drawable.default_input, (Resources.Theme) null));
        this.f19994a.setTextColor(getResources().getColor(C1410R.color.black));
        this.f19994a.setHintTextColor(Color.parseColor(pj0.m61166a(-115099840911175L)));
        this.f19994a.requestFocus();
        this.f20029c.setMargins(0, 0, 0, 0);
        this.f20029c.addRule(21);
        this.f19995a.setLayoutParams(this.f20029c);
        this.f20017b.setColorFilter(r70.m26353f(this.f19990a, C1410R.color.black));
        this.f19995a.setColorFilter(r70.m26353f(this.f19990a, C1410R.color.black));
        this.f19999a.setVisibility(0);
        this.f20009a = new mz2(this.f19990a, C1410R.layout.past_filter_station_item, this.f20040d);
        this.f19997a.setVisibility(8);
        this.f20018b.setAdapter(this.f20009a);
        this.f20018b.setOnItemClickListener(new pq2(this));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m26959n1(View view) {
        mo23994E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m26961o1(View view) {
        mo24019z0();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m26963p1(View view) {
        if (this.f20045e) {
            mo24005P0();
            mo24006Q0();
            this.f20027b = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m26966q1(View view) {
        this.f19994a.setText(pj0.m61166a(-115095545943879L));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m26972s1(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-114915157317447L)));
    }

    /* renamed from: x1 */
    public static HashMap<EVdata, Float> m26976x1(HashMap<EVdata, Float> hashMap) {
        LinkedList<Map.Entry> linkedList = new LinkedList<>(hashMap.entrySet());
        Collections.sort(linkedList, iq2.f30416a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedList) {
            linkedHashMap.put((EVdata) entry.getKey(), (Float) entry.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: A0 */
    public final void mo23990A0(String str, String str2, boolean z, boolean z2) {
        th1 th1;
        if (str.equals(pj0.m61166a(-112230802757447L))) {
            this.f20051n = 1;
        } else if (str.equals(pj0.m61166a(-112269457463111L))) {
            this.f20051n = 2;
        } else {
            this.f20051n = 0;
        }
        if (str.equalsIgnoreCase(pj0.m61166a(-112342471907143L)) || str.equalsIgnoreCase(pj0.m61166a(-112359651776327L))) {
            if (str2.equalsIgnoreCase(pj0.m61166a(-112398306481991L))) {
                this.f20052o = 1;
            } else if (str2.equalsIgnoreCase(pj0.m61166a(-112411191383879L))) {
                this.f20052o = 2;
            } else {
                this.f20052o = 0;
            }
        }
        if (this.f20033c.isEmpty() ? (th1 = this.f20010a) != null : (th1 = this.f20010a) != null) {
            th1.mo24976j();
        }
        this.f20026b.clear();
        this.f20014a.clear();
    }

    /* renamed from: B0 */
    public final void mo23991B0() {
        new C3439c().execute(new Void[0]);
    }

    /* renamed from: C0 */
    public final Bitmap mo23992C0(int i) {
        Bitmap bitmap = null;
        try {
            Drawable drawable = getResources().getDrawable(i);
            Canvas canvas = new Canvas();
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            canvas.setBitmap(bitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: D0 */
    public final void mo23993D0() {
        EVModel eVModel = new EVModel();
        if (mo24009T0()) {
            eVModel.getConnectors().mo4926j(requireActivity(), new cq2(this));
        }
    }

    /* renamed from: E0 */
    public final void mo23994E0() {
        this.f20008a.mo18272U().mo17573e(new gq2(this));
    }

    /* renamed from: F0 */
    public final float mo23995F0(Location location, Location location2) {
        DecimalFormat decimalFormat = new DecimalFormat(pj0.m61166a(-112436961187655L));
        decimalFormat.setMaximumFractionDigits(2);
        return Float.parseFloat(decimalFormat.format((double) (location.distanceTo(location2) / 1000.0f)));
    }

    /* renamed from: G0 */
    public final void mo23996G0() {
        new C3443g().execute(new Void[0]);
    }

    /* renamed from: H0 */
    public final void mo23997H0(String str) {
        if (mo24009T0()) {
            ProgressDialog progressDialog = new ProgressDialog(getContext());
            progressDialog.setCancelable(false);
            progressDialog.setMessage(this.f20049g.get(new Random().nextInt(this.f20049g.size())));
            progressDialog.show();
            new EVModel().getEvDetailsById(str).mo4926j(requireActivity(), new fq2(this, progressDialog, str));
        }
    }

    /* renamed from: I0 */
    public final void mo23998I0() {
        EVModel eVModel = new EVModel();
        if (mo24009T0()) {
            eVModel.getEvSearch().mo4926j(requireActivity(), new zp2(this));
        }
    }

    /* renamed from: J0 */
    public final void mo23999J0() {
        EVModel eVModel = new EVModel();
        if (mo24009T0()) {
            eVModel.getEvVendorsList().mo4926j(requireActivity(), new eq2(this));
        }
    }

    /* renamed from: K0 */
    public final void mo24000K0() {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        long j2;
        ArrayList arrayList3;
        long j3;
        int i = this.f20051n;
        if (i == 0) {
            this.f20001a.setStation_type((ArrayList<String>) null);
        } else {
            if (i == 1) {
                arrayList3 = new ArrayList();
                j3 = -111663867074375L;
            } else if (i == 2) {
                arrayList3 = new ArrayList();
                j3 = -111702521780039L;
            } else {
                arrayList3 = new ArrayList();
                arrayList3.add(pj0.m61166a(-111775536224071L));
                j3 = -111814190929735L;
            }
            arrayList3.add(pj0.m61166a(j3));
            this.f20001a.setStation_type(arrayList3);
        }
        int i2 = this.f20052o;
        if (i2 == 0) {
            this.f20001a.setCharger_type((ArrayList<String>) null);
        } else {
            if (i2 == 1) {
                arrayList2 = new ArrayList();
                j2 = -111887205373767L;
            } else if (i2 == 2) {
                arrayList2 = new ArrayList();
                j2 = -111900090275655L;
            } else {
                arrayList2 = new ArrayList();
                arrayList2.add(pj0.m61166a(-111912975177543L));
                j2 = -111925860079431L;
            }
            arrayList2.add(pj0.m61166a(j2));
            this.f20001a.setCharger_type(arrayList2);
        }
        int i3 = this.f20053p;
        if (i3 == 0) {
            this.f20001a.setVehicle_type((ArrayList<String>) null);
        } else {
            if (i3 == 1) {
                arrayList = new ArrayList();
                j = -111938744981319L;
            } else if (i3 == 2) {
                arrayList = new ArrayList();
                j = -111951629883207L;
            } else if (i3 == 3) {
                arrayList = new ArrayList();
                j = -111964514785095L;
            } else {
                arrayList = new ArrayList();
                arrayList.add(pj0.m61166a(-111977399686983L));
                arrayList.add(pj0.m61166a(-111990284588871L));
                j = -112003169490759L;
            }
            arrayList.add(pj0.m61166a(j));
            this.f20001a.setVehicle_type(arrayList);
        }
        if (f19986h.size() == 0) {
            this.f20001a.setConnector_type((ArrayList<String>) null);
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < f19986h.size(); i4++) {
                arrayList4.add(f19986h.get(i4).getConnector_name());
            }
            this.f20001a.setConnector_type(arrayList4);
        }
        if (this.f20035c) {
            this.f20001a.setAvailable_chargers(true);
        } else {
            this.f20001a.setAvailable_chargers(false);
        }
        if (this.f20041d) {
            this.f20001a.setFree_chargers(true);
        } else {
            this.f20001a.setFree_chargers(false);
        }
        if (this.f20001a.getStation_type() != null && this.f20001a.getStation_type().contains(pj0.m61166a(-112016054392647L))) {
            this.f20001a = new EVRequest();
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(pj0.m61166a(-112089068836679L));
            this.f20001a.setStation_type(arrayList5);
        }
        if (this.f20024b.equalsIgnoreCase(pj0.m61166a(-112162083280711L)) || this.f20024b.equalsIgnoreCase(pj0.m61166a(-112213622888263L)) || this.f20024b.isEmpty()) {
            this.f20001a.setVendor((ArrayList<String>) null);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(this.f20024b);
        this.f20001a.setVendor(arrayList6);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: L0 */
    public final Bitmap mo24001L0(String str) {
        String a = pj0.m61166a(-112458436024135L);
        io1 io1 = new io1(this.f19990a);
        io1.mo38184l(((LayoutInflater) this.f19990a.getSystemService(pj0.m61166a(-112462730991431L))).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        io1.mo38180h(this.f19990a.getResources().getDrawable(C1410R.C1411drawable.ic_ev_station_marker));
        return io1.mo38178f(a);
    }

    /* renamed from: M0 */
    public final void mo24002M0() {
        HashMap hashMap = new HashMap();
        Iterator<EVdata> it = this.f20033c.iterator();
        while (it.hasNext()) {
            EVdata next = it.next();
            Location location = new Location(pj0.m61166a(-112424076285767L));
            location.setLatitude(next.getCoordinates().getLatitude());
            location.setLongitude(next.getCoordinates().getLongitude());
            Location location2 = new Location(pj0.m61166a(-112428371253063L));
            location2.setLatitude(this.f20010a.mo24984q().mo26443b().f13892a.mo10686N2().f7562a);
            location2.setLongitude(this.f20010a.mo24984q().mo26443b().f13892a.mo10686N2().f7563b);
            hashMap.put(next, Float.valueOf(mo23995F0(location, location2)));
        }
        ArrayList arrayList = new ArrayList(m26976x1(hashMap).keySet());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Location location3 = new Location(pj0.m61166a(-112432666220359L));
            location3.setLongitude(((EVdata) arrayList.get(i)).getCoordinates().getLongitude());
            location3.setLatitude(((EVdata) arrayList.get(i)).getCoordinates().getLatitude());
            arrayList2.add(Float.valueOf(mo23995F0(location3, this.f19992a)));
        }
        try {
            un2 un2 = new un2(arrayList, arrayList2, this.f20002a.getTimestamp(), requireActivity());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            linearLayoutManager.mo5294f3(0);
            this.f20031c.setLayoutManager(linearLayoutManager);
            this.f20031c.setAdapter(un2);
            un2.mo5717m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: N0 */
    public final void mo24003N0(double d, double d2) {
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f19989a = progressDialog;
        progressDialog.setMessage(this.f20049g.get(new Random().nextInt(this.f20049g.size())));
        this.f19989a.show();
        mo24018y1();
        this.f20001a.setLatitude(d);
        this.f20001a.setLongitude(d2);
        new EVModel().getNearByEvStationDetails(this.f20001a).mo4926j(requireActivity(), new bq2(this));
    }

    /* renamed from: O0 */
    public final void mo24004O0() {
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f19989a = progressDialog;
        progressDialog.setMessage(this.f20049g.get(new Random().nextInt(this.f20049g.size())));
        this.f19989a.show();
        mo24018y1();
        new ArrayList();
        new EVModel().getEVStationDetails().mo4926j(requireActivity(), new aq2(this));
    }

    /* renamed from: P0 */
    public final void mo24005P0() {
        if (mo24009T0()) {
            View currentFocus = requireActivity().getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(requireActivity());
            }
            InputMethodManager inputMethodManager = f19985a;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo24006Q0() {
        this.f20045e = false;
        this.f20030c.setVisibility(0);
        this.f20031c.setVisibility(0);
        this.f20020b.setBackground(zk3.m33204g(this.f19990a.getResources(), C1410R.C1411drawable.one_delhi_banner_background, (Resources.Theme) null));
        this.f20020b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 126.0f, getResources().getDisplayMetrics());
        this.f20020b.requestLayout();
        this.f20004a.setVisibility(0);
        this.f20022b.setVisibility(0);
        this.f19999a.setVisibility(8);
        this.f20042e.topMargin = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f20037d.setLayoutParams(this.f20042e);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f19994a.getLayoutParams();
        this.f19998a = layoutParams;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f19998a.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f19994a.setLayoutParams(this.f19998a);
        this.f19994a.setBackground(zk3.m33204g(this.f19990a.getResources(), C1410R.C1411drawable.round_input_transparent, (Resources.Theme) null));
        this.f19994a.setTextColor(getResources().getColor(C1410R.color.white));
        this.f19994a.setHeight((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f19994a.setHintTextColor(Color.parseColor(pj0.m61166a(-110761923942215L)));
        this.f20017b.setImageResource(C1410R.C1411drawable.ic_search);
        this.f20017b.setColorFilter(r70.m26353f(this.f19990a, C1410R.color.white));
        this.f19995a.setColorFilter(r70.m26353f(this.f19990a, C1410R.color.white));
        RelativeLayout.LayoutParams layoutParams2 = this.f20019b;
        int i = this.f20054q;
        layoutParams2.leftMargin = i;
        layoutParams2.bottomMargin = i;
        layoutParams2.rightMargin = i;
        layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams3 = this.f20029c;
        int i2 = this.f20054q;
        layoutParams3.leftMargin = i2;
        layoutParams3.bottomMargin = i2;
        layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        this.f20029c.topMargin = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        this.f20017b.setLayoutParams(this.f20019b);
        this.f20029c.addRule(21);
        this.f19995a.setLayoutParams(this.f20029c);
    }

    /* renamed from: R0 */
    public final void mo24007R0(ArrayList<EVSearchData> arrayList) {
        new C3440d(arrayList).execute(new Void[0]);
    }

    /* renamed from: S0 */
    public final void mo24008S0(String str, String str2, String str3) {
        new C3441e(str, str2, str3).execute(new Void[0]);
    }

    /* renamed from: T0 */
    public final boolean mo24009T0() {
        try {
            if (!isAdded()) {
                return false;
            }
            requireActivity();
            return true;
        } catch (IllegalStateException unused) {
            c41.m40702d().mo32241g(new Exception(pj0.m61166a(-112887932753735L)));
            c41.m40702d().mo32242h();
            return false;
        }
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f19990a = context.getApplicationContext();
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f20007a = new gu4();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!mo24009T0()) {
            return null;
        }
        requireActivity().getWindow().clearFlags(8192);
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_ev, viewGroup, false);
        SharedPreferences sharedPreferences = this.f19990a.getSharedPreferences(pj0.m61166a(-110551470544711L), 0);
        this.f19991a = sharedPreferences;
        this.f20032c = sharedPreferences.getString(pj0.m61166a(-110637369890631L), pj0.m61166a(-110701794400071L));
        this.f20003a = (MapView) inflate.findViewById(C1410R.C1412id.mapView);
        this.f20004a = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_curLocation);
        this.f20022b = (FloatingActionButton) inflate.findViewById(C1410R.C1412id.fab_filter);
        this.f19994a = (AutoCompleteTextView) inflate.findViewById(C1410R.C1412id.edit_searchEV);
        this.f19995a = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_clear_destination);
        this.f20017b = (ImageButton) inflate.findViewById(C1410R.C1412id.ib_back_1);
        this.f19999a = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_filterResults);
        this.f19997a = (ListView) inflate.findViewById(C1410R.C1412id.lv_filterResults);
        this.f20018b = (ListView) inflate.findViewById(C1410R.C1412id.lv_pastSearches);
        this.f20038d = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_stations);
        this.f19996a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_settings);
        this.f20020b = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_main);
        this.f20030c = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_banner);
        this.f20037d = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_search);
        this.f20031c = (RecyclerView) inflate.findViewById(C1410R.C1412id.rv_ev_card);
        mo24012v0();
        f19985a = (InputMethodManager) requireActivity().getSystemService(pj0.m61166a(-110706089367367L));
        this.f20003a.mo10627b(bundle);
        f19986h = new ArrayList<>();
        if (!Objects.equals(this.f20032c, this.f20012a.format(new Date()))) {
            mo23998I0();
        }
        mo23996G0();
        mo23991B0();
        mo23993D0();
        mo23999J0();
        this.f20003a.mo10626a(new hq2(this));
        this.f20008a = b82.m11677b(this.f19990a);
        this.f20054q = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f20019b = (RelativeLayout.LayoutParams) this.f20017b.getLayoutParams();
        this.f20029c = (RelativeLayout.LayoutParams) this.f19995a.getLayoutParams();
        this.f20042e = (RelativeLayout.LayoutParams) this.f20037d.getLayoutParams();
        this.f19994a.setOnTouchListener(new oq2(this));
        this.f20004a.setOnClickListener(new kq2(this));
        this.f20022b.setOnClickListener(new mq2(this));
        this.f20017b.setOnClickListener(new lq2(this));
        this.f19995a.setOnClickListener(new jq2(this));
        this.f19996a.setOnClickListener(new dq2(this));
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f20003a.mo10628c();
        this.f20007a.mo16917a();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f20003a.mo10631f();
    }

    public void onPause() {
        super.onPause();
        this.f20003a.mo10632g();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-111148470998855L))) {
                    if (iArr[i2] >= 0) {
                        z = true;
                    } else {
                        Toast.makeText(this.f19990a, pj0.m61166a(-111320269690695L), 0).show();
                    }
                }
            }
            if (z) {
                mo24020z1();
            }
        }
    }

    public void onResume() {
        th1 th1;
        super.onResume();
        this.f20027b = false;
        if (!(this.f20014a.size() != 0 || (th1 = this.f20010a) == null || th1 == null)) {
            double d = th1.mo24978k().f7555a.f7562a;
            double d2 = this.f20010a.mo24978k().f7555a.f7563b;
            mo24000K0();
            mo24003N0(d, d2);
        }
        if (this.f20048f) {
            mo23994E0();
        }
        this.f20003a.mo10633h();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: t1 */
    public final void mo24010t1() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 b = b82.m11677b(this.f19990a);
        this.f20008a = b;
        z62 z62 = this.f20011a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        b.mo18262A(locationRequest, z62, myLooper);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        android.widget.Toast.makeText(r5.f19990a, com.onedelhi.secure.pj0.m61166a(-112570105173831L), 0).show();
        r6 = java.lang.Integer.parseInt(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0078 */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24011u1(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r5.f20014a     // Catch:{ Exception -> 0x00ee }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00ee }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x00ee }
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<com.delhitransport.onedelhi.activities.EVDetailsActivity> r1 = com.delhitransport.onedelhi.activities.EVDetailsActivity.class
            r7.<init>(r0, r1)     // Catch:{ Exception -> 0x00ee }
            r0 = -112531450468167(0xffff99a73ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)     // Catch:{ Exception -> 0x00ee }
            r7.putExtra(r0, r6)     // Catch:{ Exception -> 0x00ee }
            android.location.Location r0 = new android.location.Location     // Catch:{ Exception -> 0x00ee }
            r1 = -112548630337351(0xffff99a33ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)     // Catch:{ Exception -> 0x00ee }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ee }
            if (r6 == 0) goto L_0x00f2
            r1 = -112552925304647(0xffff99a23ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r1 = r6.split(r1)     // Catch:{ Exception -> 0x00ee }
            r2 = 2
            r1 = r1[r2]     // Catch:{ Exception -> 0x00ee }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00ee }
            r0.setLatitude(r1)     // Catch:{ Exception -> 0x00ee }
            r1 = -112561515239239(0xffff99a03ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r1 = r6.split(r1)     // Catch:{ Exception -> 0x00ee }
            r2 = 3
            r1 = r1[r2]     // Catch:{ Exception -> 0x00ee }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00ee }
            r0.setLongitude(r1)     // Catch:{ Exception -> 0x00ee }
            r1 = 59
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r6 = r6.split(r1)     // Catch:{ Exception -> 0x00ee }
            r1 = 4
            r6 = r6[r1]     // Catch:{ Exception -> 0x00ee }
            r1 = 0
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r5.f20044e     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x0078 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0078 }
            int r6 = r2.intValue()     // Catch:{ Exception -> 0x0078 }
            goto L_0x008e
        L_0x0078:
            android.content.Context r2 = r5.f19990a     // Catch:{ Exception -> 0x00ee }
            r3 = -112570105173831(0xffff999e3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00ee }
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r1)     // Catch:{ Exception -> 0x00ee }
            r2.show()     // Catch:{ Exception -> 0x00ee }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00ee }
        L_0x008e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ee }
            r2.<init>()     // Catch:{ Exception -> 0x00ee }
            android.location.Location r3 = r5.f19992a     // Catch:{ Exception -> 0x00ee }
            float r0 = r5.mo23995F0(r0, r3)     // Catch:{ Exception -> 0x00ee }
            r2.append(r0)     // Catch:{ Exception -> 0x00ee }
            r3 = -112625939748679(0xffff99913ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r3)     // Catch:{ Exception -> 0x00ee }
            r2.append(r0)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00ee }
            r2 = -112643119617863(0xffff998d3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)     // Catch:{ Exception -> 0x00ee }
            com.delhitransport.onedelhi.ev.EVStations r3 = r5.f20002a     // Catch:{ Exception -> 0x00ee }
            java.util.ArrayList r3 = r3.getData()     // Catch:{ Exception -> 0x00ee }
            java.lang.Object r6 = r3.get(r6)     // Catch:{ Exception -> 0x00ee }
            java.io.Serializable r6 = (java.io.Serializable) r6     // Catch:{ Exception -> 0x00ee }
            r7.putExtra(r2, r6)     // Catch:{ Exception -> 0x00ee }
            r2 = -112690364258119(0xffff99823ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r2)     // Catch:{ Exception -> 0x00ee }
            com.delhitransport.onedelhi.ev.EVStations r2 = r5.f20002a     // Catch:{ Exception -> 0x00ee }
            java.lang.String r2 = r2.getTimestamp()     // Catch:{ Exception -> 0x00ee }
            r7.putExtra(r6, r2)     // Catch:{ Exception -> 0x00ee }
            r2 = -112733313931079(0xffff99783ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r2)     // Catch:{ Exception -> 0x00ee }
            r7.putExtra(r6, r0)     // Catch:{ Exception -> 0x00ee }
            r5.mo24005P0()     // Catch:{ Exception -> 0x00ee }
            r5.mo24006Q0()     // Catch:{ Exception -> 0x00ee }
            r5.f20027b = r1     // Catch:{ Exception -> 0x00ee }
            r5.startActivity(r7)     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f2
        L_0x00ee:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rq2.mo24011u1(java.lang.String, java.lang.String):void");
    }

    /* renamed from: v0 */
    public final void mo24012v0() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f20049g = arrayList;
        arrayList.add(pj0.m61166a(-110091909044039L));
        this.f20049g.add(pj0.m61166a(-110156333553479L));
        this.f20049g.add(pj0.m61166a(-110207873161031L));
        this.f20049g.add(pj0.m61166a(-110272297670471L));
        this.f20049g.add(pj0.m61166a(-110341017147207L));
        this.f20049g.add(pj0.m61166a(-110405441656647L));
        this.f20049g.add(pj0.m61166a(-110499930937159L));
    }

    /* renamed from: v1 */
    public final void mo24013v1(String str) {
        int i;
        try {
            i = this.f20044e.get(str).intValue();
        } catch (Exception unused) {
            i = Integer.parseInt(str);
        }
        Location location = new Location(pj0.m61166a(-112754788767559L));
        location.setLongitude(this.f20002a.getData().get(i).getCoordinates().getLongitude());
        location.setLatitude(this.f20002a.getData().get(i).getCoordinates().getLatitude());
        String str2 = mo23995F0(location, this.f19992a) + pj0.m61166a(-112759083734855L);
        mo24005P0();
        mo24006Q0();
        this.f20027b = false;
        if (mo24009T0()) {
            Intent intent = new Intent(requireActivity(), EVDetailsActivity.class);
            intent.putExtra(pj0.m61166a(-112776263604039L), this.f20002a.getData().get(i));
            intent.putExtra(pj0.m61166a(-112823508244295L), this.f20002a.getTimestamp());
            intent.putExtra(pj0.m61166a(-112866457917255L), str2);
            startActivity(intent);
        }
    }

    /* renamed from: w0 */
    public void mo24014w0() {
        CountDownTimer countDownTimer = this.f19993a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f19989a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: w1 */
    public final void mo24015w1(String str) {
        od2 od2 = this.f20026b.get(str);
        if (od2 == null) {
            mo24005P0();
            mo24006Q0();
            this.f20027b = false;
            Toast.makeText(this.f19990a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            return;
        }
        this.f20010a.mo24990w(C3743ut.m29571e(new LatLng(od2.mo21872c().f7562a, od2.mo21872c().f7563b), 11.0f));
        mo24011u1(od2.mo21871b(), (String) null);
    }

    /* renamed from: x0 */
    public final void mo24016x0() {
        boolean z = r70.m26348a(this.f19990a, pj0.m61166a(-110804873615175L)) == 0;
        this.f20048f = z;
        if (!z) {
            requestPermissions(new String[]{pj0.m61166a(-110976672307015L)}, 123);
        } else {
            mo24020z1();
        }
    }

    /* renamed from: y0 */
    public final void mo24017y0() {
        new C3438b().execute(new Void[0]);
    }

    /* renamed from: y1 */
    public void mo24018y1() {
        C3449m mVar = new C3449m(rf4.f19824c, 1000);
        this.f19993a = mVar;
        mVar.start();
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r10v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r10v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02e7  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24019z0() {
        /*
            r36 = this;
            r9 = r36
            boolean r0 = r36.mo24009T0()
            if (r0 == 0) goto L_0x02fd
            android.app.Dialog r8 = new android.app.Dialog
            androidx.fragment.app.FragmentActivity r0 = r36.getActivity()
            r8.<init>(r0)
            r0 = 2131558497(0x7f0d0061, float:1.8742311E38)
            r8.setContentView(r0)
            android.view.Window r0 = r8.getWindow()
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 * 95
            int r1 = r1 / 100
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            int r2 = r2 * 90
            int r2 = r2 / 100
            r0.setLayout(r1, r2)
            android.view.Window r0 = r8.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r7 = 0
            r1.<init>(r7)
            r0.setBackgroundDrawable(r1)
            r8.show()
            r0 = 2131361907(0x7f0a0073, float:1.834358E38)
            android.view.View r0 = r8.findViewById(r0)
            r6 = r0
            android.widget.Button r6 = (android.widget.Button) r6
            r0 = 2131362464(0x7f0a02a0, float:1.834471E38)
            android.view.View r0 = r8.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.f20000a = r0
            r0 = 2131362484(0x7f0a02b4, float:1.834475E38)
            android.view.View r0 = r8.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.f20021b = r0
            r0 = 2131362421(0x7f0a0275, float:1.8344622E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r1 = 2131362414(0x7f0a026e, float:1.8344608E38)
            android.view.View r1 = r8.findViewById(r1)
            r5 = r1
            android.widget.RadioGroup r5 = (android.widget.RadioGroup) r5
            r1 = 2131362424(0x7f0a0278, float:1.8344628E38)
            android.view.View r1 = r8.findViewById(r1)
            r4 = r1
            android.widget.RadioGroup r4 = (android.widget.RadioGroup) r4
            r1 = 2131362377(0x7f0a0249, float:1.8344533E38)
            android.view.View r1 = r8.findViewById(r1)
            r3 = r1
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r1 = 2131362386(0x7f0a0252, float:1.8344551E38)
            android.view.View r1 = r8.findViewById(r1)
            r2 = r1
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r1 = 2131362378(0x7f0a024a, float:1.8344535E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r10 = 2131362376(0x7f0a0248, float:1.834453E38)
            android.view.View r10 = r8.findViewById(r10)
            r15 = r10
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            r10 = 2131362375(0x7f0a0247, float:1.8344529E38)
            android.view.View r10 = r8.findViewById(r10)
            r14 = r10
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            r10 = 2131362383(0x7f0a024f, float:1.8344545E38)
            android.view.View r10 = r8.findViewById(r10)
            r13 = r10
            android.widget.RadioButton r13 = (android.widget.RadioButton) r13
            r10 = 2131362372(0x7f0a0244, float:1.8344523E38)
            android.view.View r10 = r8.findViewById(r10)
            r12 = r10
            android.widget.RadioButton r12 = (android.widget.RadioButton) r12
            r10 = 2131362373(0x7f0a0245, float:1.8344525E38)
            android.view.View r10 = r8.findViewById(r10)
            r11 = r10
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r10 = 2131362374(0x7f0a0246, float:1.8344527E38)
            android.view.View r10 = r8.findViewById(r10)
            android.widget.RadioButton r10 = (android.widget.RadioButton) r10
            r7 = 2131362578(0x7f0a0312, float:1.834494E38)
            android.view.View r7 = r8.findViewById(r7)
            android.widget.Spinner r7 = (android.widget.Spinner) r7
            r20 = r1
            r1 = 2131362601(0x7f0a0329, float:1.8344987E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.Switch r1 = (android.widget.Switch) r1
            r21 = r1
            r1 = 2131362602(0x7f0a032a, float:1.834499E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.Switch r1 = (android.widget.Switch) r1
            r22 = r1
            r1 = 2131362226(0x7f0a01b2, float:1.8344227E38)
            android.view.View r1 = r8.findViewById(r1)
            r23 = r1
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r1 = 2131362231(0x7f0a01b7, float:1.8344237E38)
            android.view.View r1 = r8.findViewById(r1)
            r24 = r1
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            r1 = 2131362243(0x7f0a01c3, float:1.8344261E38)
            android.view.View r1 = r8.findViewById(r1)
            r25 = r1
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r1 = 2131362227(0x7f0a01b3, float:1.8344229E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 2131362229(0x7f0a01b5, float:1.8344233E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r26 = r2
            r2 = 2131362230(0x7f0a01b6, float:1.8344235E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r16 = -111526428120903(0xffff9a913ade68b9, double:NaN)
            r28 = r6
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r16)
            r3.add(r6)
            java.util.List<java.lang.String> r6 = r9.f20015a
            if (r6 == 0) goto L_0x015a
            r3.addAll(r6)
        L_0x015a:
            android.widget.ArrayAdapter r6 = new android.widget.ArrayAdapter
            r16 = r10
            android.content.Context r10 = r36.getContext()
            r17 = r11
            r11 = 17367048(0x1090008, float:2.5162948E-38)
            r6.<init>(r10, r11, r3)
            r10 = 17367049(0x1090009, float:2.516295E-38)
            r6.setDropDownViewResource(r10)
            r7.setAdapter(r6)
            int r6 = r9.f20055r
            r7.setSelection(r6)
            com.onedelhi.secure.rq2$f r6 = new com.onedelhi.secure.rq2$f
            r6.<init>(r3)
            r7.setOnItemSelectedListener(r6)
            com.onedelhi.secure.rq2$h r3 = new com.onedelhi.secure.rq2$h
            r3.<init>(r4)
            r9.f20005a = r3
            com.onedelhi.secure.rq2$i r3 = new com.onedelhi.secure.rq2$i
            r3.<init>(r4)
            r9.f20023b = r3
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.fragment.app.FragmentActivity r6 = r36.getActivity()
            r3.<init>(r6)
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.fragment.app.FragmentActivity r7 = r36.getActivity()
            r6.<init>(r7)
            r7 = 0
            r6.mo5294f3(r7)
            r3.mo5294f3(r7)
            androidx.recyclerview.widget.RecyclerView r10 = r9.f20000a
            r10.setLayoutManager(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r9.f20021b
            r3.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r9.f20000a
            androidx.recyclerview.widget.h r6 = new androidx.recyclerview.widget.h
            r6.<init>()
            r3.setItemAnimator(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r9.f20021b
            androidx.recyclerview.widget.h r6 = new androidx.recyclerview.widget.h
            r6.<init>()
            r3.setItemAnimator(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r9.f20000a
            com.onedelhi.secure.a60 r6 = new com.onedelhi.secure.a60
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVConnector> r10 = r9.f20039d
            r18 = -111577967728455(0xffff9a853ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r18)
            com.onedelhi.secure.a60$b r7 = r9.f20005a
            r29 = r4
            android.content.Context r4 = r36.getContext()
            r6.<init>(r10, r11, r7, r4)
            r3.setAdapter(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r9.f20021b
            com.onedelhi.secure.a60 r4 = new com.onedelhi.secure.a60
            java.util.ArrayList<com.delhitransport.onedelhi.ev.EVConnector> r6 = r9.f20043e
            r10 = -111595147597639(0xffff9a813ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r10)
            com.onedelhi.secure.a60$b r10 = r9.f20023b
            android.content.Context r11 = r36.getContext()
            r4.<init>(r6, r7, r10, r11)
            r3.setAdapter(r4)
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r3 = -111612327466823(0xffff9a7d3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r7.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r3 = -111629507336007(0xffff9a793ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r6.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r10 = -111646687205191(0xffff9a753ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r10)
            r4.<init>(r3)
            com.onedelhi.secure.up2 r3 = new com.onedelhi.secure.up2
            r11 = r16
            r10 = r3
            r31 = r11
            r30 = r17
            r11 = r8
            r32 = r12
            r12 = r0
            r33 = r13
            r13 = r7
            r34 = r14
            r14 = r1
            r1 = r15
            r15 = r2
            r16 = r1
            r17 = r34
            r18 = r33
            r19 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.setOnCheckedChangeListener(r3)
            com.onedelhi.secure.wp2 r10 = new com.onedelhi.secure.wp2
            r0 = r10
            r12 = r1
            r11 = r20
            r13 = r21
            r14 = r22
            r1 = r36
            r15 = r26
            r2 = r8
            r14 = r27
            r3 = r5
            r16 = r29
            r13 = r4
            r4 = r6
            r17 = r12
            r12 = r5
            r5 = r23
            r18 = r6
            r35 = r28
            r6 = r24
            r19 = r7
            r7 = r25
            r11 = r8
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.setOnCheckedChangeListener(r10)
            com.onedelhi.secure.vp2 r0 = new com.onedelhi.secure.vp2
            r1 = r16
            r0.<init>(r9, r11, r1, r13)
            r1.setOnCheckedChangeListener(r0)
            int r0 = r9.f20051n
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x028c
            r14.setChecked(r3)
            goto L_0x02a9
        L_0x028c:
            if (r0 != r3) goto L_0x0292
            r15.setChecked(r3)
            goto L_0x02a9
        L_0x0292:
            if (r0 != r2) goto L_0x029d
            r0 = r20
            r0.setChecked(r3)
            r12.clearCheck()
            goto L_0x02a9
        L_0x029d:
            r0 = r20
            r4 = 0
            r14.setChecked(r4)
            r15.setChecked(r4)
            r0.setChecked(r4)
        L_0x02a9:
            int r0 = r9.f20052o
            if (r0 != 0) goto L_0x02b3
            r10 = r17
        L_0x02af:
            r10.setChecked(r3)
            goto L_0x02bd
        L_0x02b3:
            if (r0 != r3) goto L_0x02b8
            r10 = r34
            goto L_0x02af
        L_0x02b8:
            if (r0 != r2) goto L_0x02bd
            r10 = r33
            goto L_0x02af
        L_0x02bd:
            int r0 = r9.f20053p
            if (r0 != 0) goto L_0x02c5
            r1.clearCheck()
            goto L_0x02d8
        L_0x02c5:
            if (r0 != r3) goto L_0x02cd
            r10 = r32
        L_0x02c9:
            r10.setChecked(r3)
            goto L_0x02d8
        L_0x02cd:
            if (r0 != r2) goto L_0x02d2
            r10 = r30
            goto L_0x02c9
        L_0x02d2:
            r1 = 3
            if (r0 != r1) goto L_0x02d8
            r10 = r31
            goto L_0x02c9
        L_0x02d8:
            boolean r0 = r9.f20035c
            r2 = r21
            if (r0 == 0) goto L_0x02e1
            r2.setChecked(r3)
        L_0x02e1:
            boolean r0 = r9.f20041d
            r4 = r22
            if (r0 == 0) goto L_0x02ea
            r4.setChecked(r3)
        L_0x02ea:
            com.onedelhi.secure.nq2 r7 = new com.onedelhi.secure.nq2
            r0 = r7
            r1 = r36
            r3 = r4
            r4 = r19
            r5 = r18
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r35
            r0.setOnClickListener(r7)
        L_0x02fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rq2.mo24019z0():void");
    }

    /* renamed from: z1 */
    public final void mo24020z1() {
        boolean z;
        boolean z2 = false;
        if (this.f20048f) {
            this.f20010a.mo24940I(true);
            this.f20010a.mo24985r().mo16113o(false);
            this.f20010a.mo24985r().mo16112n(false);
        }
        LocationManager locationManager = (LocationManager) this.f19990a.getSystemService(pj0.m61166a(-111436233807687L));
        try {
            z = locationManager.isProviderEnabled(pj0.m61166a(-111474888513351L));
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(pj0.m61166a(-111492068382535L));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z && !z2 && mo24009T0()) {
            new C0189c.C0190a(requireActivity()).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new sp2(this)).mo959s(this.f19990a.getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
        }
        if ((z || z2) && this.f20048f) {
            mo23994E0();
        }
    }
}
