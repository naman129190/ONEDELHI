package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.p001db.DatabaseAccess;
import com.delhitransport.onedelhi.ticket.Coupon;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.FareOptions;
import com.delhitransport.onedelhi.ticket.FareOptionsEntry;
import com.delhitransport.onedelhi.ticket.FareOptionsRequest;
import com.delhitransport.onedelhi.ticket.Validate;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C1969df;
import com.onedelhi.secure.C3839we;
import com.onedelhi.secure.as4;
import com.onedelhi.secure.bs4;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.cs4;
import com.onedelhi.secure.ds4;
import com.onedelhi.secure.gv1;
import com.onedelhi.secure.mr4;
import com.onedelhi.secure.nr4;
import com.onedelhi.secure.or4;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.pr4;
import com.onedelhi.secure.qr4;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.rr4;
import com.onedelhi.secure.sr4;
import com.onedelhi.secure.sv1;
import com.onedelhi.secure.tr4;
import com.onedelhi.secure.ur4;
import com.onedelhi.secure.uv1;
import com.onedelhi.secure.vr4;
import com.onedelhi.secure.wr4;
import com.onedelhi.secure.xr4;
import com.onedelhi.secure.yr4;
import com.onedelhi.secure.zr4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ValueActivity extends BaseActivity {

    /* renamed from: a */
    public static InputMethodManager f6923a;

    /* renamed from: a */
    public double f6924a = 0.0d;

    /* renamed from: a */
    public float f6925a = -1.0f;

    /* renamed from: a */
    public ProgressDialog f6926a;

    /* renamed from: a */
    public SharedPreferences f6927a;

    /* renamed from: a */
    public CountDownTimer f6928a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f6929a = new C1296b();

    /* renamed from: a */
    public AutoCompleteTextView f6930a;

    /* renamed from: a */
    public Button f6931a;

    /* renamed from: a */
    public ImageButton f6932a;

    /* renamed from: a */
    public RadioButton f6933a;

    /* renamed from: a */
    public RadioGroup f6934a;

    /* renamed from: a */
    public TextView f6935a;

    /* renamed from: a */
    public DatabaseAccess f6936a;

    /* renamed from: a */
    public FareDiscovery f6937a;

    /* renamed from: a */
    public FareOptions f6938a;

    /* renamed from: a */
    public TicketModel f6939a;

    /* renamed from: a */
    public Boolean f6940a;

    /* renamed from: a */
    public ArrayList<Double> f6941a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<List<String>, List<String>> f6942a = new HashMap<>();

    /* renamed from: b */
    public double f6943b = 0.0d;

    /* renamed from: b */
    public float f6944b = 0.0f;

    /* renamed from: b */
    public final AdapterView.OnItemClickListener f6945b = new C1302h();

    /* renamed from: b */
    public AutoCompleteTextView f6946b;

    /* renamed from: b */
    public ImageButton f6947b;

    /* renamed from: b */
    public TextView f6948b;

    /* renamed from: b */
    public HashMap<String, Pair<String, String>> f6949b = new HashMap<>();

    /* renamed from: c */
    public final AdapterView.OnItemClickListener f6950c = new C1303i();

    /* renamed from: c */
    public AutoCompleteTextView f6951c;

    /* renamed from: c */
    public ImageButton f6952c;

    /* renamed from: c */
    public TextView f6953c;

    /* renamed from: c */
    public HashMap<String, Float> f6954c = new HashMap<>();

    /* renamed from: d */
    public ImageButton f6955d;

    /* renamed from: d */
    public TextView f6956d;

    /* renamed from: e */
    public ImageButton f6957e;

    /* renamed from: e */
    public TextView f6958e;

    /* renamed from: e */
    public String f6959e = pj0.m61166a(-74456565389127L);

    /* renamed from: e */
    public boolean f6960e;

    /* renamed from: f */
    public String f6961f;

    /* renamed from: f */
    public boolean f6962f;

    /* renamed from: g */
    public String f6963g;

    /* renamed from: g */
    public boolean f6964g;

    /* renamed from: h */
    public String f6965h = null;

    /* renamed from: h */
    public boolean f6966h;

    /* renamed from: i */
    public String f6967i = null;

    /* renamed from: i */
    public boolean f6968i;

    /* renamed from: j */
    public String f6969j = null;

    /* renamed from: j */
    public boolean f6970j = false;

    /* renamed from: k */
    public String f6971k = null;

    /* renamed from: k */
    public boolean f6972k;

    /* renamed from: l */
    public String f6973l = null;

    /* renamed from: l */
    public boolean f6974l;

    /* renamed from: m */
    public String f6975m;

    /* renamed from: n */
    public String f6976n;

    /* renamed from: o */
    public final int f6977o = 2;

    /* renamed from: o */
    public String f6978o = pj0.m61166a(-74460860356423L);

    /* renamed from: p */
    public int f6979p = -1;

    /* renamed from: p */
    public String f6980p;

    /* renamed from: q */
    public int f6981q = -1;

    /* renamed from: q */
    public String f6982q = pj0.m61166a(-74473745258311L);

    /* renamed from: r */
    public int f6983r = 1;

    /* renamed from: r */
    public String f6984r = pj0.m61166a(-74478040225607L);

    /* renamed from: s */
    public int f6985s = -1;

    /* renamed from: s */
    public String f6986s = pj0.m61166a(-74482335192903L);

    /* renamed from: t */
    public int f6987t = -1;

    /* renamed from: t */
    public String f6988t;

    /* renamed from: u */
    public String f6989u = pj0.m61166a(-74486630160199L);

    /* renamed from: v */
    public String f6990v;

    /* renamed from: w */
    public String f6991w = pj0.m61166a(-74490925127495L);

    /* renamed from: x */
    public String f6992x;

    /* renamed from: y */
    public String f6993y;

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$a */
    public class C1295a extends CountDownTimer {
        public C1295a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (ValueActivity.this.f6926a != null) {
                ValueActivity.this.f6926a.dismiss();
            }
            ValueActivity valueActivity = ValueActivity.this;
            Toast.makeText(valueActivity, valueActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$b */
    public class C1296b implements AdapterView.OnItemClickListener {
        public C1296b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ValueActivity.m8451u2(ValueActivity.this);
            try {
                Pair pair = (Pair) adapterView.getItemAtPosition(i);
                ValueActivity.this.f6951c.setText((CharSequence) pair.second);
                int unused = ValueActivity.this.f6985s = ((Integer) pair.first).intValue();
                ValueActivity valueActivity = ValueActivity.this;
                boolean unused2 = valueActivity.f6972k = (valueActivity.f6985s == -1 || ValueActivity.this.f6979p == -1) ? false : true;
                ValueActivity.this.mo7880p2();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$c */
    public class C1297c implements TextWatcher {
        public C1297c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ValueActivity.this.f6952c.setVisibility(i3 > 0 ? 0 : 8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$d */
    public class C1298d implements TextWatcher {
        public C1298d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ValueActivity.this.f6955d.setVisibility(i3 > 0 ? 0 : 8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$e */
    public class C1299e implements TextWatcher {
        public C1299e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ValueActivity.this.f6957e.setVisibility(i3 > 0 ? 0 : 8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$f */
    public class C1300f implements Runnable {
        public C1300f() {
        }

        public void run() {
            ValueActivity.this.f6946b.showDropDown();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$g */
    public class C1301g implements Runnable {
        public C1301g() {
        }

        public void run() {
            ValueActivity.this.f6951c.showDropDown();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$h */
    public class C1302h implements AdapterView.OnItemClickListener {
        public C1302h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m8487b() {
            ValueActivity.this.f6946b.showDropDown();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ValueActivity.m8451u2(ValueActivity.this);
            ValueActivity.this.f6946b.setText(pj0.m61166a(-74374961010503L));
            ValueActivity.this.f6951c.setText(pj0.m61166a(-74379255977799L));
            ValueActivity valueActivity = ValueActivity.this;
            int unused = valueActivity.f6979p = valueActivity.f6985s = -1;
            List list = (List) adapterView.getItemAtPosition(i);
            ValueActivity.this.f6930a.setText(((String) list.get(0)).split(pj0.m61166a(-74383550945095L))[0].substring(1));
            String unused2 = ValueActivity.this.f6982q = ((String) list.get(0)).split(pj0.m61166a(-74400730814279L))[1].substring(1, ((String) list.get(0)).split(pj0.m61166a(-74392140879687L))[1].length() - 1);
            boolean unused3 = ValueActivity.this.f6968i = true;
            String unused4 = ValueActivity.this.f6965h = ((String) list.get(1)).split(pj0.m61166a(-74409320748871L))[1].substring(1);
            ValueActivity.this.mo7886v2();
            ValueActivity.this.f6930a.setVisibility(8);
            ValueActivity.this.mo7881q2();
            ValueActivity.this.mo7871V2();
            ValueActivity valueActivity2 = ValueActivity.this;
            valueActivity2.mo7884t2(valueActivity2.f6982q, 0, -1);
            ValueActivity.this.f6946b.requestFocus();
            new Handler().postDelayed(new bs4(this), 200);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$i */
    public class C1303i implements AdapterView.OnItemClickListener {
        public C1303i() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m8489b() {
            ValueActivity.this.f6951c.showDropDown();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ValueActivity.m8451u2(ValueActivity.this);
            try {
                Pair pair = (Pair) adapterView.getItemAtPosition(i);
                String unused = ValueActivity.this.f6988t = (String) pair.second;
                int unused2 = ValueActivity.this.f6979p = ((Integer) pair.first).intValue();
                int unused3 = ValueActivity.this.f6985s = -1;
                ValueActivity.this.f6951c.setText(pj0.m61166a(-74417910683463L));
                if (ValueActivity.this.f6979p != -1) {
                    ValueActivity valueActivity = ValueActivity.this;
                    valueActivity.mo7884t2(valueActivity.f6982q, 1, ValueActivity.this.f6979p);
                    ValueActivity.this.f6951c.setEnabled(true);
                    boolean unused4 = ValueActivity.this.f6970j = true;
                    ValueActivity.this.mo7887w2();
                    ValueActivity.this.f6951c.requestFocus();
                    new Handler().postDelayed(new cs4(this), 200);
                    return;
                }
                ValueActivity.this.f6951c.setEnabled(false);
                boolean unused5 = ValueActivity.this.f6970j = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ValueActivity$j */
    public class C1304j implements bu2<FareDiscovery> {
        public C1304j() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m8491c() {
            ValueActivity.this.onBackPressed();
        }

        /* renamed from: d */
        public void mo3946b(FareDiscovery fareDiscovery) {
            Button button;
            int i;
            Coupon coupon;
            ValueActivity.this.f6926a.dismiss();
            ValueActivity.this.mo7878n2();
            if (fareDiscovery != null) {
                FareDiscovery unused = ValueActivity.this.f6937a = fareDiscovery;
                if (fareDiscovery.getMessage().equalsIgnoreCase(pj0.m61166a(-74422205650759L))) {
                    int unused2 = ValueActivity.this.f6981q = fareDiscovery.getStart_stop_index();
                    String unused3 = ValueActivity.this.f6989u = fareDiscovery.getStart_stop_name();
                    int unused4 = ValueActivity.this.f6987t = fareDiscovery.getEnd_stop_index();
                    ValueActivity valueActivity = ValueActivity.this;
                    String unused5 = valueActivity.mo7883s2(valueActivity.f6982q, ValueActivity.this.f6981q);
                    String unused6 = ValueActivity.this.f6991w = fareDiscovery.getEnd_stop_name();
                    float unused7 = ValueActivity.this.f6925a = fareDiscovery.getFare_per_ticket();
                    String unused8 = ValueActivity.this.f6963g = String.valueOf(fareDiscovery.getAmount_payable_by_user());
                    try {
                        coupon = fareDiscovery.getCoupons_applied().get(0);
                    } catch (Exception unused9) {
                        coupon = null;
                    }
                    if (coupon != null) {
                        float unused10 = ValueActivity.this.f6944b = coupon.getPercentage().floatValue();
                    } else {
                        ValueActivity.this.f6935a.setVisibility(8);
                        ValueActivity.this.f6953c.setVisibility(8);
                    }
                    ValueActivity.this.mo7863N2();
                    ValueActivity.this.mo7878n2();
                    if (ValueActivity.this.f6926a != null) {
                        ValueActivity.this.f6926a.dismiss();
                    }
                    ValueActivity.this.f6931a.setEnabled(true);
                    button = ValueActivity.this.f6931a;
                    i = ValueActivity.this.getResources().getColor(C1410R.color.one_delhi_red);
                    button.setBackgroundColor(i);
                }
                ValueActivity valueActivity2 = ValueActivity.this;
                Toast.makeText(valueActivity2, valueActivity2.getResources().getString(C1410R.string.incorrect_values), 0).show();
                ValueActivity.this.f6926a.dismiss();
                ValueActivity.this.mo7878n2();
                new Handler().postDelayed(new ds4(this), 2000);
            } else {
                ValueActivity valueActivity3 = ValueActivity.this;
                Toast.makeText(valueActivity3, valueActivity3.getResources().getString(C1410R.string.please_try_again), 0).show();
                ValueActivity.this.mo7878n2();
                if (ValueActivity.this.f6926a != null) {
                    ValueActivity.this.f6926a.dismiss();
                }
            }
            ValueActivity.this.f6931a.setEnabled(false);
            button = ValueActivity.this.f6931a;
            i = ValueActivity.this.getResources().getColor(C1410R.color.light_gray_a9a9a9);
            button.setBackgroundColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void m8392A2(View view) {
        if (!this.f6968i || !this.f6970j || (!this.f6972k && !this.f6974l)) {
            Toast.makeText(this, pj0.m61166a(-79593346275143L), 0).show();
        } else {
            mo7885u1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m8394B2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ boolean m8396C2(View view, MotionEvent motionEvent) {
        if (this.f6982q.equalsIgnoreCase(pj0.m61166a(-79589051307847L))) {
            return false;
        }
        new Handler().postDelayed(new C1300f(), 100);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ boolean m8398D2(View view, MotionEvent motionEvent) {
        if (this.f6982q.equalsIgnoreCase(pj0.m61166a(-79494562027335L)) || this.f6979p == -1) {
            Toast.makeText(this, pj0.m61166a(-79498856994631L), 0).show();
        } else {
            new Handler().postDelayed(new C1301g(), 100);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m8400E2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m8402F2(View view) {
        mo7879o2();
        this.f6930a.setText(pj0.m61166a(-79709310392135L));
        this.f6946b.setText(pj0.m61166a(-79713605359431L));
        this.f6951c.setText(pj0.m61166a(-79717900326727L));
        this.f6982q = pj0.m61166a(-79722195294023L);
        this.f6985s = -1;
        this.f6979p = -1;
        mo7863N2();
        this.f6968i = false;
        this.f6970j = false;
        this.f6972k = false;
        this.f6946b.setFocusable(false);
        this.f6951c.setFocusable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m8404G2(View view) {
        this.f6946b.setText(pj0.m61166a(-79700720457543L));
        this.f6951c.setText(pj0.m61166a(-79705015424839L));
        this.f6979p = -1;
        this.f6985s = -1;
        mo7863N2();
        this.f6970j = false;
        this.f6972k = false;
        this.f6974l = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m8406H2(View view) {
        this.f6951c.setText(pj0.m61166a(-79696425490247L));
        this.f6985s = -1;
        this.f6972k = false;
        this.f6974l = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void m8408I2(RadioGroup radioGroup, int i) {
        this.f6983r = Integer.parseInt(String.valueOf(((RadioButton) findViewById(i)).getText()));
        mo7880p2();
        mo7863N2();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void m8410J2(View view, boolean z) {
        int i;
        ImageButton imageButton;
        this.f6962f = z;
        if (!z || this.f6930a.getText().toString().equalsIgnoreCase(pj0.m61166a(-79692130522951L))) {
            imageButton = this.f6952c;
            i = 8;
        } else {
            imageButton = this.f6952c;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void m8412K2(View view, boolean z) {
        int i;
        ImageButton imageButton;
        this.f6964g = z;
        if (!z || this.f6946b.getText().toString().equalsIgnoreCase(pj0.m61166a(-79687835555655L))) {
            imageButton = this.f6955d;
            i = 8;
        } else {
            imageButton = this.f6955d;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void m8414L2(View view, boolean z) {
        int i;
        ImageButton imageButton;
        this.f6966h = z;
        if (!z || this.f6951c.getText().toString().equalsIgnoreCase(pj0.m61166a(-79683540588359L))) {
            imageButton = this.f6957e;
            i = 8;
        } else {
            imageButton = this.f6957e;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    /* renamed from: u2 */
    public static void m8451u2(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f6923a;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m8455x2(FareOptions fareOptions) {
        Resources resources;
        int i;
        if (fareOptions == null) {
            resources = getResources();
            i = C1410R.string.no_resp_from_server;
        } else if (fareOptions.getMessage().equalsIgnoreCase(pj0.m61166a(-79460202288967L))) {
            mo7864O2(fareOptions);
            mo7879o2();
            mo7872h2();
            return;
        } else {
            resources = getResources();
            i = C1410R.string.some_error_occurred;
        }
        Toast.makeText(this, resources.getString(i), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void m8457y2(View view) {
        mo7867R2();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void m8459z2(View view) {
        mo7868S2(true);
    }

    /* renamed from: M2 */
    public final void mo7862M2() {
        SharedPreferences.Editor edit = this.f6927a.edit();
        edit.putString(pj0.m61166a(-78407935301447L), this.f6980p);
        edit.putBoolean(pj0.m61166a(-78472359810887L), false);
        edit.putBoolean(pj0.m61166a(-78506719549255L), true);
        edit.putBoolean(pj0.m61166a(-78528194385735L), false);
        edit.putBoolean(pj0.m61166a(-78566849091399L), false);
        if (this.f6976n.equalsIgnoreCase(pj0.m61166a(-78618388698951L))) {
            edit.putString(pj0.m61166a(-78626978633543L), this.f6976n);
        }
        boolean commit = edit.commit();
        for (int i = 10; i > 0; i--) {
            if (!commit) {
                commit = edit.commit();
            }
        }
    }

    /* renamed from: N2 */
    public final void mo7863N2() {
        String str;
        float f;
        if (this.f6925a != -1.0f) {
            String str2 = getResources().getString(C1410R.string.rupees) + (this.f6925a * ((float) this.f6983r));
            try {
                float floatValue = this.f6954c.get(String.valueOf(Math.round(this.f6925a))).floatValue();
                float f2 = this.f6925a;
                this.f6944b = ((floatValue - f2) / f2) * 100.0f;
                f = floatValue * ((float) this.f6983r);
                str = getResources().getString(C1410R.string.rupees) + f;
            } catch (NullPointerException unused) {
                f = this.f6944b != 0.0f ? this.f6937a.getAmount_payable_by_user().floatValue() : this.f6925a * ((float) this.f6983r);
                str = getResources().getString(C1410R.string.rupees) + f;
            }
            if (this.f6937a == null) {
                this.f6937a = new FareDiscovery();
            }
            if (!str.equalsIgnoreCase(str2)) {
                this.f6935a.setVisibility(0);
                this.f6935a.setText(str2);
                TextView textView = this.f6935a;
                textView.setPaintFlags(textView.getPaintFlags() | 16);
                this.f6953c.setVisibility(0);
                this.f6953c.setText(this.f6944b + pj0.m61166a(-75255429306183L));
            } else {
                this.f6935a.setVisibility(8);
                this.f6953c.setVisibility(8);
            }
            this.f6948b.setVisibility(0);
            this.f6948b.setText(str);
            if (!str.equalsIgnoreCase(String.valueOf(f))) {
                this.f6963g = String.valueOf(f);
            }
            this.f6937a.setAmount_payable_by_user(Float.valueOf(f));
            this.f6931a.setText(getResources().getString(C1410R.string.pay_amount, new Object[]{str}));
            this.f6974l = true;
        }
    }

    /* renamed from: O2 */
    public void mo7864O2(FareOptions fareOptions) {
        this.f6938a = fareOptions;
    }

    /* renamed from: P2 */
    public final void mo7865P2() {
        String upperCase;
        String a;
        long j;
        if (!this.f6982q.equalsIgnoreCase(pj0.m61166a(-75126580287303L))) {
            if (this.f6982q.toUpperCase().contains(pj0.m61166a(-75130875254599L))) {
                upperCase = this.f6982q.toUpperCase();
                a = pj0.m61166a(-75143760156487L);
                j = -75156645058375L;
            } else if (this.f6982q.toUpperCase().contains(pj0.m61166a(-75160940025671L))) {
                upperCase = this.f6982q.toUpperCase();
                a = pj0.m61166a(-75182414862151L);
                j = -75203889698631L;
            } else {
                if (this.f6982q.toUpperCase().contains(pj0.m61166a(-75208184665927L))) {
                    upperCase = this.f6982q.toUpperCase();
                    a = pj0.m61166a(-75221069567815L);
                    j = -75233954469703L;
                }
                this.f6986s = this.f6984r;
                String str = this.f6984r + pj0.m61166a(-75238249436999L) + this.f6965h;
                this.f6984r = str;
                this.f6956d.setText(str);
            }
            this.f6984r = upperCase.replace(a, pj0.m61166a(j));
            this.f6986s = this.f6984r;
            String str2 = this.f6984r + pj0.m61166a(-75238249436999L) + this.f6965h;
            this.f6984r = str2;
            this.f6956d.setText(str2);
        }
    }

    /* renamed from: Q2 */
    public final void mo7866Q2() {
        this.f6958e.setText(this.f6988t);
    }

    /* renamed from: R2 */
    public final void mo7867R2() {
        if (this.f6960e) {
            mo7874j2();
            this.f6952c.setVisibility(0);
        }
        this.f6932a.setVisibility(8);
        this.f6956d.setVisibility(8);
        this.f6930a.setVisibility(0);
        this.f6930a.setText(this.f6986s);
        this.f6930a.requestFocus();
        mo7868S2(false);
    }

    /* renamed from: S2 */
    public final void mo7868S2(boolean z) {
        this.f6947b.setVisibility(8);
        this.f6958e.setVisibility(8);
        this.f6946b.setVisibility(0);
        this.f6946b.setText(this.f6988t);
        if (z) {
            this.f6946b.requestFocus();
        }
    }

    /* renamed from: T2 */
    public final void mo7869T2() {
        this.f6930a.setVisibility(0);
        this.f6956d.setVisibility(8);
    }

    /* renamed from: U2 */
    public final void mo7870U2() {
        this.f6946b.setVisibility(0);
        this.f6958e.setVisibility(8);
    }

    /* renamed from: V2 */
    public void mo7871V2() {
        C1295a aVar = new C1295a(rf4.f19824c, 1000);
        this.f6928a = aVar;
        aVar.start();
    }

    /* renamed from: h2 */
    public final void mo7872h2() {
        FareOptions fareOptions = this.f6938a;
        if (fareOptions != null) {
            if (fareOptions.getFare_options() == null) {
                this.f6938a.setFare_options(new ArrayList());
            }
            for (int i = 0; i < this.f6938a.getFare_options().size(); i++) {
                for (Map.Entry entry : this.f6938a.getFare_options().get(i).entrySet()) {
                    this.f6954c.put((String) entry.getKey(), Float.valueOf(((FareOptionsEntry) entry.getValue()).getFinal_fare()));
                }
            }
        }
    }

    /* renamed from: i2 */
    public final void mo7873i2(RadioGroup radioGroup, String str) {
        RadioButton radioButton = new RadioButton(this);
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        radioButton.setTextSize(18.0f);
        radioButton.setButtonDrawable(getResources().getDrawable(C1410R.C1411drawable.radio_buttons));
        radioButton.setBackground(getResources().getDrawable(C1410R.C1411drawable.radio_buttons));
        radioButton.setTextColor(getResources().getColorStateList(C1410R.color.radio_buttons_text_color));
        if (radioGroup == this.f6934a && str.equalsIgnoreCase(pj0.m61166a(-75281199109959L))) {
            radioButton.setChecked(true);
        }
        radioGroup.addView(radioButton);
    }

    /* renamed from: j2 */
    public final void mo7874j2() {
        String str;
        HashMap<String, Pair<String, String>> hashMap = this.f6949b;
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                String r2 = mo7882r2((String) next.getKey());
                ArrayList arrayList = new ArrayList();
                if (this.f6992x.equalsIgnoreCase(pj0.m61166a(-75397163226951L))) {
                    str = ((String) ((Pair) next.getValue()).first) + pj0.m61166a(-75410048128839L);
                } else {
                    str = (String) ((Pair) next.getValue()).first;
                }
                arrayList.add(str);
                arrayList.add((String) ((Pair) next.getValue()).second);
                arrayList.add((String) next.getKey());
                arrayList.add(pj0.m61166a(-75418638063431L));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(r2);
                arrayList2.add((String) next.getKey());
                this.f6942a.put(arrayList2, arrayList);
            }
            C3839we weVar = new C3839we(this, C1410R.layout.dropdown_routes, this.f6942a, pj0.m61166a(-75435817932615L));
            this.f6930a.setThreshold(1);
            this.f6930a.setAdapter(weVar);
            this.f6930a.setOnItemClickListener(this.f6945b);
        } else {
            this.f6930a.setEnabled(false);
            Toast.makeText(this, getResources().getString(C1410R.string.fetch_problem), 1).show();
        }
        ProgressDialog progressDialog = this.f6926a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        mo7878n2();
    }

    /* renamed from: k2 */
    public final void mo7875k2(List<Pair<Integer, String>> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                hashMap.put((Integer) list.get(i).first, (String) list.get(i).second);
            }
            C1969df dfVar = new C1969df(this, C1410R.layout.dropdown_ticket_stop, new TreeMap(hashMap));
            this.f6951c.setThreshold(1);
            this.f6951c.setAdapter(dfVar);
            this.f6951c.setOnItemClickListener(this.f6929a);
            return;
        }
        this.f6951c.setEnabled(false);
        Toast.makeText(this, getResources().getString(C1410R.string.fetch_problem), 1).show();
    }

    /* renamed from: l2 */
    public final void mo7876l2(List<Pair<Integer, String>> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (int i = 0; i < list.size() - 1; i++) {
                hashMap.put((Integer) list.get(i).first, (String) list.get(i).second);
            }
            C1969df dfVar = new C1969df(this, C1410R.layout.dropdown_ticket_stop, new TreeMap(hashMap));
            this.f6946b.setThreshold(1);
            this.f6946b.setAdapter(dfVar);
            this.f6946b.setOnItemClickListener(this.f6950c);
            return;
        }
        this.f6946b.setEnabled(false);
        Toast.makeText(this, getResources().getString(C1410R.string.fetch_problem), 1).show();
    }

    /* renamed from: m2 */
    public final void mo7877m2(String str, String str2) {
        ProgressDialog progressDialog = this.f6926a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        mo7862M2();
        Intent intent = new Intent(this, GenerateTicketActivity.class);
        intent.putExtra(pj0.m61166a(-77445862627143L), this.f6981q);
        intent.putExtra(pj0.m61166a(-77501697201991L), this.f6989u);
        intent.putExtra(pj0.m61166a(-77561826744135L), this.f6987t);
        intent.putExtra(pj0.m61166a(-77609071384391L), this.f6991w);
        intent.putExtra(pj0.m61166a(-77660610991943L), this.f6959e);
        intent.putExtra(pj0.m61166a(-77703560664903L), str);
        intent.putExtra(pj0.m61166a(-77763690207047L), String.valueOf(this.f6983r));
        String a = pj0.m61166a(-77849589552967L);
        intent.putExtra(a, getResources().getString(C1410R.string.rupees) + this.f6925a);
        String a2 = pj0.m61166a(-77918309029703L);
        intent.putExtra(a2, getResources().getString(C1410R.string.rupees) + this.f6963g);
        intent.putExtra(pj0.m61166a(-77982733539143L), this.f6993y);
        intent.putExtra(pj0.m61166a(-78029978179399L), str2);
        intent.putExtra(pj0.m61166a(-78051453015879L), this.f6937a);
        intent.putExtra(pj0.m61166a(-78124467459911L), this.f6940a);
        intent.putExtra(pj0.m61166a(-78150237263687L), this.f6982q);
        intent.putExtra(pj0.m61166a(-78197481903943L), this.f6976n);
        intent.putExtra(pj0.m61166a(-78236136609607L), pj0.m61166a(-78274791315271L));
        intent.putExtra(pj0.m61166a(-78300561119047L), this.f6961f);
        intent.putExtra(pj0.m61166a(-78343510792007L), this.f6980p);
        mo7878n2();
        startActivity(intent);
        finish();
    }

    /* renamed from: n2 */
    public void mo7878n2() {
        CountDownTimer countDownTimer = this.f6928a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: o2 */
    public final void mo7879o2() {
        this.f6954c.clear();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        long j;
        super.onActivityResult(i, i2, intent);
        if (i != 2 || intent == null) {
            str = getResources().getString(C1410R.string.payment_failed);
        } else {
            String stringExtra = intent.getStringExtra(pj0.m61166a(-76569689298759L));
            if (stringExtra != null && stringExtra.equalsIgnoreCase(pj0.m61166a(-76608344004423L))) {
                j = -76612638971719L;
            } else if (stringExtra != null) {
                try {
                    sv1 s = uv1.m67431f(stringExtra).mo42278s();
                    String x = s.mo44562N(pj0.m61166a(-76775847728967L)).mo36921x();
                    this.f6978o = s.mo44562N(pj0.m61166a(-76805912500039L)).mo36921x();
                    this.f6975m = pj0.m61166a(-76831682303815L);
                    if (!x.equalsIgnoreCase(pj0.m61166a(-76848862172999L))) {
                        if (!x.equalsIgnoreCase(pj0.m61166a(-76900401780551L))) {
                            (x.equalsIgnoreCase(pj0.m61166a(-76904696747847L)) ? Toast.makeText(this, pj0.m61166a(-76939056486215L), 0) : Toast.makeText(this, pj0.m61166a(-77119445112647L), 0)).show();
                            return;
                        }
                    }
                    mo7877m2(this.f6978o, this.f6975m);
                    return;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    mo7877m2(this.f6978o, this.f6975m);
                    return;
                }
            } else {
                j = -77282653869895L;
            }
            str = pj0.m61166a(j);
        }
        Toast.makeText(this, str, 0).show();
    }

    public void onBackPressed() {
        super.onBackPressed();
        ProgressDialog progressDialog = this.f6926a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        mo7878n2();
    }

    @SuppressLint({"SourceLockedOrientationActivity", "ClickableViewAccessibility"})
    public void onCreate(Bundle bundle) {
        Validate validate;
        setRequestedOrientation(1);
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_value);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-74495220094791L), 0);
        this.f6927a = sharedPreferences;
        this.f6992x = sharedPreferences.getString(pj0.m61166a(-74581119440711L), pj0.m61166a(-74654133884743L));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6959e = extras.getString(pj0.m61166a(-74667018786631L), pj0.m61166a(-74714263426887L));
            this.f6976n = extras.getString(pj0.m61166a(-74718558394183L), pj0.m61166a(-74757213099847L));
            validate = (Validate) extras.get(pj0.m61166a(-74765803034439L));
            this.f6960e = extras.getBoolean(pj0.m61166a(-74804457740103L), false);
            try {
                this.f6941a = (ArrayList) extras.get(pj0.m61166a(-74855997347655L));
            } catch (Exception unused) {
                this.f6941a = null;
            }
        } else {
            this.f6959e = pj0.m61166a(-74911831922503L);
            this.f6976n = pj0.m61166a(-74916126889799L);
            this.f6960e = false;
            this.f6941a = null;
            validate = null;
        }
        if (this.f6941a == null) {
            ArrayList<Double> arrayList = new ArrayList<>();
            this.f6941a = arrayList;
            arrayList.add(Double.valueOf(1.0d));
            this.f6941a.add(Double.valueOf(1.0d));
        }
        if (validate == null) {
            Toast.makeText(this, getResources().getString(C1410R.string.no_resp_from_server), 0).show();
            onBackPressed();
        }
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_bus_number);
        this.f6956d = (TextView) findViewById(C1410R.C1412id.tv_current_route);
        this.f6958e = (TextView) findViewById(C1410R.C1412id.tv_starting_stop);
        this.f6935a = (TextView) findViewById(C1410R.C1412id.tv_total_fare);
        this.f6948b = (TextView) findViewById(C1410R.C1412id.tv_payable_fare);
        this.f6953c = (TextView) findViewById(C1410R.C1412id.tv_discount);
        this.f6946b = (AutoCompleteTextView) findViewById(C1410R.C1412id.edit_starting_stop);
        this.f6930a = (AutoCompleteTextView) findViewById(C1410R.C1412id.edit_route);
        this.f6951c = (AutoCompleteTextView) findViewById(C1410R.C1412id.edit_destination_stop);
        this.f6932a = (ImageButton) findViewById(C1410R.C1412id.ib_edit_route);
        this.f6947b = (ImageButton) findViewById(C1410R.C1412id.ib_edit_source);
        this.f6952c = (ImageButton) findViewById(C1410R.C1412id.ib_clear_route);
        this.f6955d = (ImageButton) findViewById(C1410R.C1412id.ib_clear_starting);
        this.f6957e = (ImageButton) findViewById(C1410R.C1412id.ib_clear_destination);
        this.f6934a = (RadioGroup) findViewById(C1410R.C1412id.rg_ticket_count);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6931a = (Button) findViewById(C1410R.C1412id.btn_buy);
        f6923a = (InputMethodManager) getSystemService(pj0.m61166a(-74924716824391L));
        this.f6936a = DatabaseAccess.getInstance(this);
        if (validate != null) {
            this.f6982q = validate.getRoute_long_name();
            this.f6979p = validate.getStart_stop_index();
            this.f6993y = validate.getAgency();
            this.f6988t = mo7883s2(this.f6982q, this.f6979p);
            this.f6961f = validate.getBooking_id();
            this.f6940a = Boolean.valueOf(validate.isIs_ac());
            if (validate.getFare_options() != null) {
                this.f6938a = new FareOptions(pj0.m61166a(-74980551399239L), validate.getFare_options());
            } else {
                this.f6938a = null;
            }
        } else {
            this.f6982q = pj0.m61166a(-75014911137607L);
            this.f6988t = pj0.m61166a(-75019206104903L);
            this.f6979p = -1;
            this.f6938a = null;
            this.f6961f = pj0.m61166a(-75023501072199L);
            this.f6993y = pj0.m61166a(-75027796039495L);
            this.f6940a = Boolean.FALSE;
        }
        if (this.f6982q == null) {
            this.f6982q = pj0.m61166a(-75053565843271L);
        }
        textView.setText(this.f6959e);
        this.f6958e.setText(this.f6988t);
        this.f6937a = new FareDiscovery();
        if (this.f6960e) {
            mo7872h2();
            mo7884t2(this.f6982q, 0, 0);
            mo7884t2(this.f6982q, 1, this.f6979p);
            this.f6968i = true;
            mo7886v2();
        } else {
            this.f6968i = false;
            mo7867R2();
            mo7869T2();
        }
        mo7868S2(false);
        this.f6970j = this.f6979p != -1;
        int i = 0;
        while (i < 3) {
            i++;
            mo7873i2(this.f6934a, String.valueOf(i));
        }
        this.f6932a.setOnClickListener(new wr4(this));
        this.f6947b.setOnClickListener(new vr4(this));
        imageView.setOnClickListener(new tr4(this));
        this.f6952c.setOnClickListener(new xr4(this));
        this.f6955d.setOnClickListener(new ur4(this));
        this.f6957e.setOnClickListener(new mr4(this));
        this.f6934a.setOnCheckedChangeListener(new qr4(this));
        this.f6930a.addTextChangedListener(new C1297c());
        this.f6930a.setOnFocusChangeListener(new zr4(this));
        this.f6946b.addTextChangedListener(new C1298d());
        this.f6946b.setOnFocusChangeListener(new nr4(this));
        this.f6951c.addTextChangedListener(new C1299e());
        this.f6951c.setOnFocusChangeListener(new as4(this));
        List arrayList2 = new ArrayList();
        if (this.f6965h == null) {
            this.f6936a.open();
            try {
                arrayList2 = this.f6936a.getDetails(this.f6982q, this.f6993y.toLowerCase());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                arrayList2 = this.f6936a.getDetails(this.f6982q, this.f6993y.toLowerCase());
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
                Toast.makeText(this, getResources().getString(C1410R.string.some_error_occurred), 0).show();
                onBackPressed();
            }
            this.f6936a.close();
            try {
                gv1 o = uv1.m67431f((String) arrayList2.get(0)).mo42276o();
                this.f6965h = String.valueOf(o.mo36900O(o.size() - 1).mo42278s().mo44567S().toArray()[0]);
            } catch (Exception e3) {
                System.out.println(e3.getMessage());
                this.f6965h = pj0.m61166a(-75057860810567L);
            }
        }
        this.f6936a.open();
        try {
            this.f6949b = this.f6936a.getRoutes(this.f6993y.toLowerCase());
        } catch (RuntimeException e4) {
            System.out.println(e4.getMessage());
            this.f6949b = this.f6936a.getRoutes(this.f6993y.toLowerCase());
        } catch (Exception e5) {
            System.out.println(e5.getMessage());
            Toast.makeText(this, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            onBackPressed();
        }
        if (!this.f6960e) {
            mo7874j2();
        }
        this.f6936a.close();
        this.f6939a = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
        if (this.f6976n.equalsIgnoreCase(pj0.m61166a(-75062155777863L))) {
            ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-75070745712455L), getResources().getString(C1410R.string.getting_pink_pass), true);
            this.f6926a = show;
            show.setCancelable(false);
            this.f6926a.show();
            this.f6963g = pj0.m61166a(-75075040679751L);
            this.f6937a.setBus_number(this.f6959e);
            this.f6937a.setTotal_fare(0.0f);
            this.f6937a.setFare_per_ticket(10.0f);
            this.f6937a.setAmount_payable_by_user(Float.valueOf(0.0f));
            mo7877m2(pj0.m61166a(-75096515516231L), pj0.m61166a(-75109400418119L));
        }
        this.f6931a.setOnClickListener(new yr4(this));
        imageView.setOnClickListener(new sr4(this));
        this.f6946b.setOnTouchListener(new or4(this));
        this.f6951c.setOnTouchListener(new pr4(this));
    }

    public void onResume() {
        super.onResume();
        this.f6931a.setEnabled(true);
        this.f6931a.setBackgroundColor(getResources().getColor(C1410R.color.one_delhi_red));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7880p2() {
        /*
            r12 = this;
            boolean r0 = r12.f6968i
            r1 = 0
            if (r0 == 0) goto L_0x00e4
            boolean r2 = r12.f6970j
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r12.f6972k
            if (r2 != 0) goto L_0x0011
            boolean r2 = r12.f6974l
            if (r2 == 0) goto L_0x00e4
        L_0x0011:
            android.widget.AutoCompleteTextView r0 = r12.f6946b
            r0.clearFocus()
            android.widget.AutoCompleteTextView r0 = r12.f6951c
            r0.clearFocus()
            r2 = -75650566297415(0xffffbb323ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -75654861264711(0xffffbb313ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = 1
            android.app.ProgressDialog r0 = android.app.ProgressDialog.show(r12, r0, r2, r3)
            r12.f6926a = r0
            r0.setCancelable(r1)
            java.lang.String r0 = r12.f6976n
            r2 = -75788005250887(0xffffbb123ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0093
            int r0 = r12.f6979p
            int r2 = r12.f6985s
            if (r0 == r2) goto L_0x0077
            r12.mo7871V2()
            com.delhitransport.onedelhi.ticket.FareDiscoveryRequest r0 = new com.delhitransport.onedelhi.ticket.FareDiscoveryRequest
            java.lang.String r4 = r12.f6961f
            java.lang.String r5 = r12.f6982q
            int r6 = r12.f6979p
            int r7 = r12.f6985s
            float r8 = r12.f6925a
            java.lang.String r9 = r12.f6959e
            java.lang.String r10 = r12.f6976n
            int r11 = r12.f6983r
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.delhitransport.onedelhi.viewmodels.TicketModel r1 = r12.f6939a
            androidx.lifecycle.LiveData r0 = r1.farediscovery(r0)
            com.delhitransport.onedelhi.activities.ValueActivity$j r1 = new com.delhitransport.onedelhi.activities.ValueActivity$j
            r1.<init>()
            r0.mo4926j(r12, r1)
            goto L_0x0146
        L_0x0077:
            r2 = -75796595185479(0xffffbb103ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r12, r0, r1)
            r0.show()
            r12.mo7878n2()
            android.app.ProgressDialog r0 = r12.f6926a
            if (r0 == 0) goto L_0x0146
            r0.dismiss()
            goto L_0x0146
        L_0x0093:
            java.lang.String r0 = r12.f6976n
            r2 = -76045703288647(0xffffbad63ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00c9
            r12.mo7878n2()
            android.app.ProgressDialog r0 = r12.f6926a
            if (r0 == 0) goto L_0x00ae
            r0.dismiss()
        L_0x00ae:
            r0 = -76054293223239(0xffffbad43ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            r12.f6963g = r0
            java.lang.String r0 = r12.f6978o
            r1 = -76080063027015(0xffffbace3ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            r12.mo7877m2(r0, r1)
            goto L_0x0146
        L_0x00c9:
            android.content.res.Resources r0 = r12.getResources()
            r2 = 2131951858(0x7f1300f2, float:1.9540142E38)
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r12, r0, r1)
            r0.show()
            android.app.ProgressDialog r0 = r12.f6926a
            r0.dismiss()
            r12.mo7878n2()
            goto L_0x0146
        L_0x00e4:
            if (r0 != 0) goto L_0x00f5
            android.widget.AutoCompleteTextView r0 = r12.f6930a
            r2 = -76097242896199(0xffffbaca3ade68b9, double:NaN)
        L_0x00ed:
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            goto L_0x012e
        L_0x00f5:
            boolean r0 = r12.f6970j
            if (r0 != 0) goto L_0x0101
            android.widget.AutoCompleteTextView r0 = r12.f6946b
            r2 = -76148782503751(0xffffbabe3ade68b9, double:NaN)
            goto L_0x00ed
        L_0x0101:
            boolean r0 = r12.f6972k
            if (r0 != 0) goto L_0x010d
            android.widget.AutoCompleteTextView r0 = r12.f6951c
            r2 = -76269041588039(0xffffbaa23ade68b9, double:NaN)
            goto L_0x00ed
        L_0x010d:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r3 = r12.f6968i
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            boolean r3 = r12.f6970j
            r2.append(r3)
            boolean r3 = r12.f6972k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
        L_0x012e:
            boolean r0 = r12.f6972k
            if (r0 != 0) goto L_0x0146
            boolean r0 = r12.f6974l
            if (r0 != 0) goto L_0x0146
            r2 = -76402185574215(0xffffba833ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r12, r0, r1)
            r0.show()
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.ValueActivity.mo7880p2():void");
    }

    /* renamed from: q2 */
    public final void mo7881q2() {
        this.f6939a.getfareoptions(new FareOptionsRequest(this.f6982q, this.f6961f, this.f6940a, this.f6941a)).mo4926j(this, new rr4(this));
    }

    /* renamed from: r2 */
    public final String mo7882r2(String str) {
        String upperCase;
        String a;
        long j;
        if (str.toUpperCase().contains(pj0.m61166a(-75289789044551L))) {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-75302673946439L);
            j = -75315558848327L;
        } else if (str.toUpperCase().contains(pj0.m61166a(-75319853815623L))) {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-75341328652103L);
            j = -75362803488583L;
        } else if (!str.toUpperCase().contains(pj0.m61166a(-75367098455879L))) {
            return str;
        } else {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-75379983357767L);
            j = -75392868259655L;
        }
        return upperCase.replace(a, pj0.m61166a(j));
    }

    /* renamed from: s2 */
    public final String mo7883s2(String str, int i) {
        List<String> list;
        long j;
        this.f6936a.open();
        new ArrayList();
        try {
            list = this.f6936a.getDetails(str, this.f6993y.toLowerCase());
        } catch (RuntimeException unused) {
            list = this.f6936a.getDetails(str, this.f6993y.toLowerCase());
        } catch (Exception unused2) {
            j = -75465882703687L;
            return pj0.m61166a(j);
        }
        for (String next : list) {
        }
        DatabaseAccess databaseAccess = this.f6936a;
        if (databaseAccess != null) {
            databaseAccess.close();
        }
        try {
            HashMap hashMap = new HashMap();
            gv1 o = uv1.m67431f(list.get(0)).mo42276o();
            for (int i2 = 0; i2 < o.size(); i2++) {
                if (i == i2) {
                    return o.mo36900O(i2).mo42278s().mo44567S().toString().replace(pj0.m61166a(-75470177670983L), pj0.m61166a(-75478767605575L)).replace(pj0.m61166a(-75483062572871L), pj0.m61166a(-75491652507463L));
                }
            }
            return (String) hashMap.get(String.valueOf(i));
        } catch (Exception unused3) {
            j = -75495947474759L;
            return pj0.m61166a(j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015b  */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7884t2(java.lang.String r7, int r8, int r9) {
        /*
            r6 = this;
            com.delhitransport.onedelhi.db.DatabaseAccess r0 = r6.f6936a
            r0.open()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 2131952114(0x7f1301f2, float:1.9540662E38)
            r2 = 0
            com.delhitransport.onedelhi.db.DatabaseAccess r3 = r6.f6936a     // Catch:{ RuntimeException -> 0x003f, Exception -> 0x001b }
            java.lang.String r4 = r6.f6993y     // Catch:{ RuntimeException -> 0x003f, Exception -> 0x001b }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ RuntimeException -> 0x003f, Exception -> 0x001b }
            java.util.List r0 = r3.getDetails(r7, r4)     // Catch:{ RuntimeException -> 0x003f, Exception -> 0x001b }
            goto L_0x005d
        L_0x001b:
            r7 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = r7.getMessage()
            r3.println(r4)
            com.onedelhi.secure.c41 r3 = com.onedelhi.secure.c41.m40702d()
            r3.mo32241g(r7)
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r2)
            r7.show()
            r6.onBackPressed()
            goto L_0x005d
        L_0x003f:
            r0 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = r0.getMessage()
            r3.println(r4)
            com.delhitransport.onedelhi.db.DatabaseAccess r3 = r6.f6936a
            java.lang.String r4 = r6.f6993y
            java.lang.String r4 = r4.toLowerCase()
            java.util.List r7 = r3.getDetails(r7, r4)
            com.onedelhi.secure.c41 r3 = com.onedelhi.secure.c41.m40702d()
            r3.mo32241g(r0)
            r0 = r7
        L_0x005d:
            com.delhitransport.onedelhi.db.DatabaseAccess r7 = r6.f6936a
            if (r7 == 0) goto L_0x0064
            r7.close()
        L_0x0064:
            int r7 = r0.size()
            if (r7 != 0) goto L_0x007c
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r2)
            r7.show()
            r6.onBackPressed()
        L_0x007c:
            java.lang.Object r7 = r0.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            com.onedelhi.secure.ov1 r7 = com.onedelhi.secure.uv1.m67431f(r7)
            com.onedelhi.secure.gv1 r7 = r7.mo42276o()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            int r9 = r9 + r1
        L_0x0091:
            int r3 = r7.size()
            if (r9 >= r3) goto L_0x00bc
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            com.onedelhi.secure.ov1 r5 = r7.mo36900O(r9)
            com.onedelhi.secure.sv1 r5 = r5.mo42278s()
            java.util.Set r5 = r5.mo44567S()
            java.lang.Object[] r5 = r5.toArray()
            r5 = r5[r2]
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            r0.add(r3)
            int r9 = r9 + 1
            goto L_0x0091
        L_0x00bc:
            int r9 = r0.size()
            if (r9 == 0) goto L_0x00d4
            int r7 = r0.size()
            int r7 = r7 - r1
            java.lang.Object r7 = r0.get(r7)
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r7 = r7.second
        L_0x00cf:
            java.lang.String r7 = (java.lang.String) r7
            r6.f6965h = r7
            goto L_0x0121
        L_0x00d4:
            boolean r9 = r7.mo42282z()
            if (r9 != 0) goto L_0x010e
            int r9 = r7.size()
            int r3 = r0.size()
            if (r9 <= r3) goto L_0x010e
            android.util.Pair r9 = new android.util.Pair
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.size()
            com.onedelhi.secure.ov1 r7 = r7.mo36900O(r4)
            com.onedelhi.secure.sv1 r7 = r7.mo42278s()
            java.util.Set r7 = r7.mo44567S()
            java.lang.Object[] r7 = r7.toArray()
            r7 = r7[r2]
            java.lang.String r7 = r7.toString()
            r9.<init>(r3, r7)
            java.lang.Object r7 = r9.second
            goto L_0x00cf
        L_0x010e:
            r3 = -75500242442055(0xffffbb553ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r3)
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r2)
            r7.show()
            r6.onBackPressed()
        L_0x0121:
            if (r8 != 0) goto L_0x0145
            r6.mo7876l2(r0)
            android.widget.AutoCompleteTextView r7 = r6.f6946b
            r7.setFocusableInTouchMode(r1)
            android.widget.AutoCompleteTextView r7 = r6.f6946b
            r7.setFocusable(r1)
            android.widget.AutoCompleteTextView r7 = r6.f6946b
            r7.setEnabled(r1)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setEnabled(r2)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setFocusableInTouchMode(r2)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setFocusable(r2)
            goto L_0x0157
        L_0x0145:
            r6.mo7875k2(r0)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setFocusableInTouchMode(r1)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setFocusable(r1)
            android.widget.AutoCompleteTextView r7 = r6.f6951c
            r7.setEnabled(r1)
        L_0x0157:
            android.app.ProgressDialog r7 = r6.f6926a
            if (r7 == 0) goto L_0x015e
            r7.cancel()
        L_0x015e:
            r6.mo7878n2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.ValueActivity.mo7884t2(java.lang.String, int, int):void");
    }

    /* renamed from: u1 */
    public final void mo7885u1() {
        Intent intent = new Intent(this, PaymentActivity.class);
        intent.putExtra(pj0.m61166a(-78665633339207L), this.f6959e);
        intent.putExtra(pj0.m61166a(-78708583012167L), String.valueOf(this.f6983r));
        intent.putExtra(pj0.m61166a(-78794482358087L), this.f6993y);
        intent.putExtra(pj0.m61166a(-78841726998343L), this.f6937a);
        intent.putExtra(pj0.m61166a(-78914741442375L), this.f6940a);
        intent.putExtra(pj0.m61166a(-78940511246151L), this.f6976n);
        intent.putExtra(pj0.m61166a(-78979165951815L), pj0.m61166a(-79017820657479L));
        intent.putExtra(pj0.m61166a(-79043590461255L), this.f6961f);
        intent.putExtra(pj0.m61166a(-79086540134215L), this.f6963g);
        intent.putExtra(pj0.m61166a(-79129489807175L), this.f6981q);
        intent.putExtra(pj0.m61166a(-79185324382023L), this.f6989u);
        intent.putExtra(pj0.m61166a(-79245453924167L), this.f6987t);
        intent.putExtra(pj0.m61166a(-79292698564423L), this.f6991w);
        intent.putExtra(pj0.m61166a(-79344238171975L), this.f6925a);
        intent.putExtra(pj0.m61166a(-79412957648711L), this.f6986s);
        startActivity(intent);
    }

    /* renamed from: v2 */
    public final void mo7886v2() {
        mo7865P2();
        this.f6930a.setVisibility(8);
        this.f6956d.setVisibility(0);
        this.f6932a.setVisibility(0);
    }

    /* renamed from: w2 */
    public final void mo7887w2() {
        mo7866Q2();
        this.f6946b.setVisibility(8);
        this.f6958e.setVisibility(0);
        this.f6947b.setVisibility(0);
    }
}
