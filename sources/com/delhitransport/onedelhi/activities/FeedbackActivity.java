package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.live.BusMetaData;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskRequest;
import com.delhitransport.onedelhi.models.freshdesk.FreshDeskTicketResponse;
import com.delhitransport.onedelhi.p001db.DatabaseAccess;
import com.delhitransport.onedelhi.viewmodels.DataViewModel;
import com.delhitransport.onedelhi.viewmodels.FreshDeskViewModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.textfield.TextInputEditText;
import com.onedelhi.secure.C3839we;
import com.onedelhi.secure.a11;
import com.onedelhi.secure.b11;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.c11;
import com.onedelhi.secure.d11;
import com.onedelhi.secure.d23;
import com.onedelhi.secure.e11;
import com.onedelhi.secure.e23;
import com.onedelhi.secure.f11;
import com.onedelhi.secure.g11;
import com.onedelhi.secure.h11;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.m01;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n01;
import com.onedelhi.secure.o01;
import com.onedelhi.secure.p01;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.q01;
import com.onedelhi.secure.r01;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.s01;
import com.onedelhi.secure.t01;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u01;
import com.onedelhi.secure.v01;
import com.onedelhi.secure.w01;
import com.onedelhi.secure.x01;
import com.onedelhi.secure.y01;
import com.onedelhi.secure.z01;
import com.onedelhi.secure.z62;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class FeedbackActivity extends BaseActivity implements e23, AdapterView.OnItemSelectedListener, LocationListener {

    /* renamed from: a */
    public ProgressDialog f6218a;

    /* renamed from: a */
    public SharedPreferences.Editor f6219a;

    /* renamed from: a */
    public SharedPreferences f6220a;

    /* renamed from: a */
    public Location f6221a;

    /* renamed from: a */
    public Uri f6222a;

    /* renamed from: a */
    public CountDownTimer f6223a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f6224a = new C1213a();

    /* renamed from: a */
    public ArrayAdapter<String> f6225a;

    /* renamed from: a */
    public AutoCompleteTextView f6226a;

    /* renamed from: a */
    public Button f6227a;

    /* renamed from: a */
    public EditText f6228a;

    /* renamed from: a */
    public ImageButton f6229a;

    /* renamed from: a */
    public ImageView f6230a;

    /* renamed from: a */
    public LinearLayout f6231a;

    /* renamed from: a */
    public ProgressBar f6232a;

    /* renamed from: a */
    public RadioGroup f6233a;

    /* renamed from: a */
    public RelativeLayout f6234a;

    /* renamed from: a */
    public TextView f6235a;

    /* renamed from: a */
    public DatabaseAccess f6236a;

    /* renamed from: a */
    public BusMetaData f6237a;

    /* renamed from: a */
    public TextInputEditText f6238a;

    /* renamed from: a */
    public d23 f6239a;

    /* renamed from: a */
    public jd1 f6240a;

    /* renamed from: a */
    public final z62 f6241a = new C1214b();

    /* renamed from: a */
    public final DecimalFormat f6242a = new DecimalFormat(pj0.m61166a(-11835942213447L));

    /* renamed from: a */
    public ArrayList<String> f6243a;

    /* renamed from: a */
    public final Calendar f6244a = Calendar.getInstance(TimeZone.getDefault());

    /* renamed from: a */
    public final HashMap<List<String>, List<String>> f6245a = new HashMap<>();

    /* renamed from: a */
    public final Pattern f6246a = Pattern.compile(pj0.m61166a(-11612603914055L), 2);

    /* renamed from: b */
    public Button f6247b;

    /* renamed from: b */
    public EditText f6248b;

    /* renamed from: b */
    public ImageButton f6249b;

    /* renamed from: b */
    public ImageView f6250b;

    /* renamed from: b */
    public LinearLayout f6251b;

    /* renamed from: b */
    public RadioGroup f6252b;

    /* renamed from: b */
    public RelativeLayout f6253b;

    /* renamed from: b */
    public TextView f6254b;

    /* renamed from: b */
    public TextInputEditText f6255b;

    /* renamed from: b */
    public ArrayList<String> f6256b;

    /* renamed from: b */
    public HashMap<String, Pair<String, String>> f6257b = new HashMap<>();

    /* renamed from: c */
    public ImageView f6258c;

    /* renamed from: c */
    public LinearLayout f6259c;

    /* renamed from: c */
    public RadioGroup f6260c;

    /* renamed from: c */
    public RelativeLayout f6261c;

    /* renamed from: c */
    public TextView f6262c;

    /* renamed from: c */
    public TextInputEditText f6263c;

    /* renamed from: c */
    public ArrayList<String> f6264c;

    /* renamed from: d */
    public ImageView f6265d;

    /* renamed from: d */
    public LinearLayout f6266d;

    /* renamed from: d */
    public RadioGroup f6267d;

    /* renamed from: d */
    public RelativeLayout f6268d;

    /* renamed from: d */
    public TextView f6269d;

    /* renamed from: d */
    public TextInputEditText f6270d;

    /* renamed from: d */
    public ArrayList<String> f6271d = new ArrayList<>();

    /* renamed from: e */
    public LinearLayout f6272e;

    /* renamed from: e */
    public RelativeLayout f6273e;

    /* renamed from: e */
    public TextView f6274e;

    /* renamed from: e */
    public TextInputEditText f6275e;

    /* renamed from: e */
    public String f6276e;

    /* renamed from: e */
    public boolean f6277e;

    /* renamed from: f */
    public String f6278f;

    /* renamed from: f */
    public boolean f6279f;

    /* renamed from: g */
    public String f6280g;

    /* renamed from: g */
    public boolean f6281g;

    /* renamed from: h */
    public String f6282h;

    /* renamed from: h */
    public boolean f6283h;

    /* renamed from: i */
    public String f6284i;

    /* renamed from: i */
    public boolean f6285i;

    /* renamed from: j */
    public String f6286j = null;

    /* renamed from: j */
    public boolean f6287j;

    /* renamed from: k */
    public String f6288k;

    /* renamed from: l */
    public String f6289l = pj0.m61166a(-11788697573191L);

    /* renamed from: m */
    public String f6290m = pj0.m61166a(-11831647246151L);

    /* renamed from: o */
    public final int f6291o = 22;

    /* renamed from: p */
    public int f6292p = 1;

    /* renamed from: q */
    public int f6293q;

    /* renamed from: r */
    public int f6294r;

    /* renamed from: s */
    public int f6295s;

    /* renamed from: t */
    public int f6296t;

    /* renamed from: u */
    public int f6297u;

    /* renamed from: v */
    public final int f6298v = 500;

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$a */
    public class C1213a implements AdapterView.OnItemClickListener {
        public C1213a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            FeedbackActivity feedbackActivity = FeedbackActivity.this;
            feedbackActivity.mo7583X1(feedbackActivity.f6226a);
            String substring = ((String) ((List) adapterView.getItemAtPosition(i)).get(0)).split(pj0.m61166a(-11449395156807L))[1].substring(1);
            String substring2 = substring.substring(0, substring.length() - 1);
            FeedbackActivity.this.f6226a.setText(substring2);
            FeedbackActivity.this.f6269d.setText(substring2);
            FeedbackActivity.this.f6226a.setVisibility(8);
            FeedbackActivity.this.f6269d.setVisibility(0);
            FeedbackActivity.this.f6250b.setVisibility(0);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$b */
    public class C1214b extends z62 {
        public C1214b() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location unused = FeedbackActivity.this.f6221a = locationResult.mo10563M2();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$c */
    public class C1215c implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f6301a;

        public C1215c(TextView textView) {
            this.f6301a = textView;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            TextView textView = this.f6301a;
            textView.setText(pj0.m61166a(-11457985091399L) + FeedbackActivity.this.f6242a.format((long) i3) + pj0.m61166a(-11488049862471L) + FeedbackActivity.this.f6242a.format((long) (i2 + 1)) + pj0.m61166a(-11496639797063L) + i);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$d */
    public class C1216d implements TimePickerDialog.OnTimeSetListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f6303a;

        public C1216d(TextView textView) {
            this.f6303a = textView;
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            TextView textView = this.f6303a;
            textView.setText(pj0.m61166a(-11505229731655L) + FeedbackActivity.this.f6242a.format((long) i) + pj0.m61166a(-11535294502727L) + FeedbackActivity.this.f6242a.format((long) i2));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$e */
    public class C1217e implements TextWatcher {
        public C1217e() {
        }

        public void afterTextChanged(Editable editable) {
            TextView I1 = FeedbackActivity.this.f6274e;
            I1.setText(String.valueOf(editable.length()) + pj0.m61166a(-11543884437319L) + 500);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$f */
    public class C1218f extends CountDownTimer {
        public C1218f(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (FeedbackActivity.this.f6218a != null) {
                FeedbackActivity.this.f6218a.dismiss();
            }
            FeedbackActivity feedbackActivity = FeedbackActivity.this;
            Toast.makeText(feedbackActivity, feedbackActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$g */
    public class C1219g implements Runnable {

        /* renamed from: com.delhitransport.onedelhi.activities.FeedbackActivity$g$a */
        public class C1220a implements Runnable {
            public C1220a() {
            }

            public void run() {
                HashMap<String, Pair<String, String>> hashMap = FeedbackActivity.this.f6257b;
                if (hashMap != null) {
                    for (Map.Entry next : hashMap.entrySet()) {
                        String L1 = FeedbackActivity.this.mo7581V1((String) next.getKey());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(((String) ((Pair) next.getValue()).first) + pj0.m61166a(-11552474371911L));
                        arrayList.add((String) ((Pair) next.getValue()).second);
                        arrayList.add((String) next.getKey());
                        arrayList.add(pj0.m61166a(-11561064306503L));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(L1);
                        arrayList2.add((String) next.getKey());
                        FeedbackActivity.this.f6245a.put(arrayList2, arrayList);
                    }
                    FeedbackActivity feedbackActivity = FeedbackActivity.this;
                    C3839we weVar = new C3839we(feedbackActivity, C1410R.layout.dropdown_routes, feedbackActivity.f6245a, pj0.m61166a(-11578244175687L));
                    FeedbackActivity.this.f6226a.setThreshold(1);
                    FeedbackActivity.this.f6226a.setAdapter(weVar);
                    FeedbackActivity.this.f6226a.setOnItemClickListener(FeedbackActivity.this.f6224a);
                }
            }
        }

        public C1219g() {
        }

        public void run() {
            FeedbackActivity.this.f6236a.open();
            try {
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                feedbackActivity.f6257b = feedbackActivity.f6236a.getAllRoutes();
            } catch (RuntimeException unused) {
                FeedbackActivity feedbackActivity2 = FeedbackActivity.this;
                feedbackActivity2.f6257b = feedbackActivity2.f6236a.getAllRoutes();
            } catch (Exception unused2) {
                FeedbackActivity feedbackActivity3 = FeedbackActivity.this;
                Toast.makeText(feedbackActivity3, feedbackActivity3.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
            FeedbackActivity.this.f6236a.close();
            FeedbackActivity.this.runOnUiThread(new C1220a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m7752Y1(FreshDeskTicketResponse freshDeskTicketResponse) {
        mo7574O1();
        if (freshDeskTicketResponse != null) {
            mo7578S1(String.valueOf(freshDeskTicketResponse.getId()));
        } else {
            Toast.makeText(this, pj0.m61166a(-18978472826695L), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m7753Z1(FreshDeskTicketResponse freshDeskTicketResponse) {
        mo7574O1();
        if (freshDeskTicketResponse != null) {
            mo7578S1(String.valueOf(freshDeskTicketResponse.getId()));
        } else {
            Toast.makeText(this, pj0.m61166a(-18798084200263L), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m7754a2(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m7755b2(String str, BusMetaData busMetaData) {
        this.f6218a.setMessage(pj0.m61166a(-19158861453127L));
        this.f6218a.show();
        if (busMetaData == null) {
            Toast.makeText(this, pj0.m61166a(-19901890795335L), 0).show();
            this.f6237a = new BusMetaData();
        } else if (busMetaData.getStatus().equalsIgnoreCase(pj0.m61166a(-19236170864455L))) {
            this.f6271d = new ArrayList<>();
            this.f6237a = busMetaData;
            this.f6271d.add(this.f6237a.getAgency());
            this.f6271d.add(this.f6237a.getDepot());
            this.f6284i = (pj0.m61166a(-19270530602823L) + str + pj0.m61166a(-19356429948743L) + this.f6226a.getText().toString().trim() + pj0.m61166a(-19438034327367L) + this.f6237a.getAgency() + pj0.m61166a(-19523933673287L) + this.f6237a.getDepot() + pj0.m61166a(-19605538051911L)) + this.f6284i;
            mo7577R1();
            return;
        } else {
            Toast.makeText(this, busMetaData.getDescription(), 0).show();
            this.f6237a = new BusMetaData();
            this.f6284i = (pj0.m61166a(-19712912234311L) + str + pj0.m61166a(-19798811580231L) + this.f6226a.getText().toString().trim() + pj0.m61166a(-19880415958855L)) + this.f6284i;
        }
        mo7574O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m7756c2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m7757d2(View view) {
        if (this.f6277e) {
            this.f6258c.setRotation(-90.0f);
            this.f6231a.setVisibility(0);
            this.f6277e = false;
            return;
        }
        this.f6258c.setRotation(90.0f);
        this.f6231a.setVisibility(8);
        this.f6277e = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m7758e2(View view) {
        mo7599x2(pj0.m61166a(-20112344192839L));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m7760f2(View view) {
        mo7599x2(pj0.m61166a(-20082279421767L));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m7762g2(View view) {
        mo7599x2(pj0.m61166a(-20060804585287L));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m7764h2(View view) {
        mo7599x2(pj0.m61166a(-20013559945031L));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m7766i2(RadioGroup radioGroup, int i) {
        this.f6286j = null;
        if (this.f6283h || this.f6285i) {
            if (this.f6260c.getCheckedRadioButtonId() != -1) {
                this.f6260c.clearCheck();
                this.f6283h = false;
            }
            if (this.f6267d.getCheckedRadioButtonId() != -1) {
                this.f6267d.clearCheck();
                this.f6285i = false;
            }
        }
        this.f6281g = true;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            this.f6286j = String.valueOf(radioButton.getText());
        }
        String str = this.f6286j;
        if (str != null) {
            mo7575P1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m7768j2(RadioGroup radioGroup, int i) {
        this.f6286j = null;
        if (this.f6281g || this.f6285i) {
            if (this.f6252b.getCheckedRadioButtonId() != -1) {
                this.f6252b.clearCheck();
                this.f6281g = false;
            }
            if (this.f6267d.getCheckedRadioButtonId() != -1) {
                this.f6267d.clearCheck();
                this.f6285i = false;
            }
        }
        this.f6283h = true;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            this.f6286j = String.valueOf(radioButton.getText());
        }
        String str = this.f6286j;
        if (str != null) {
            mo7575P1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m7770k2(RadioGroup radioGroup, int i) {
        this.f6286j = null;
        if (this.f6281g || this.f6283h) {
            if (this.f6252b.getCheckedRadioButtonId() != -1) {
                this.f6252b.clearCheck();
                this.f6281g = false;
            }
            if (this.f6260c.getCheckedRadioButtonId() != -1) {
                this.f6260c.clearCheck();
                this.f6283h = false;
            }
        }
        this.f6285i = true;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            this.f6286j = String.valueOf(radioButton.getText());
        }
        String str = this.f6286j;
        if (str != null) {
            mo7575P1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m7772l2(View view) {
        this.f6226a.setVisibility(0);
        this.f6269d.setVisibility(8);
        this.f6226a.setText(pj0.m61166a(-20004970010439L));
        this.f6269d.setText(pj0.m61166a(-20009264977735L));
        this.f6250b.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m7774m2(View view) {
        if (this.f6279f) {
            this.f6265d.setRotation(-90.0f);
            this.f6251b.setVisibility(0);
            this.f6279f = false;
            return;
        }
        this.f6265d.setRotation(90.0f);
        this.f6251b.setVisibility(8);
        this.f6279f = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m7776n2(View view) {
        mo7598w2();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m7778o2(TextView textView, View view) {
        this.f6293q = this.f6244a.get(1);
        this.f6294r = this.f6244a.get(2);
        this.f6295s = this.f6244a.get(5);
        new DatePickerDialog(this, new C1215c(textView), this.f6293q, this.f6294r, this.f6295s).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m7780p2(TextView textView, View view) {
        new TimePickerDialog(this, new C1216d(textView), this.f6296t, this.f6297u, false).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void m7782q2(View view) {
        this.f6222a = null;
        this.f6276e = null;
        this.f6229a.setVisibility(0);
        this.f6249b.setVisibility(8);
        this.f6262c.setText(pj0.m61166a(-20322797590343L));
        this.f6262c.setPadding(50, 0, 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void m7784r2(View view) {
        mo7570B2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void m7786s2(RadioGroup radioGroup, int i) {
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioButton.getText().equals(pj0.m61166a(-20155293865799L))) {
                this.f6266d.setVisibility(0);
                this.f6272e.setVisibility(8);
                this.f6289l = radioButton.getText().toString();
            }
            if (radioButton.getText().equals(pj0.m61166a(-20198243538759L))) {
                this.f6266d.setVisibility(8);
                this.f6272e.setVisibility(0);
                this.f6289l = radioButton.getText().toString();
            }
            if (radioButton.getText().equals(pj0.m61166a(-20254078113607L))) {
                this.f6266d.setVisibility(8);
                this.f6272e.setVisibility(0);
                this.f6289l = radioButton.getText().toString();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m7788t2(View view) {
        mo7599x2(pj0.m61166a(-20138113996615L));
    }

    /* renamed from: A2 */
    public void mo7569A2() {
        C1218f fVar = new C1218f(rf4.f19824c, 1000);
        this.f6223a = fVar;
        fVar.start();
    }

    /* renamed from: B2 */
    public final void mo7570B2() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6218a = progressDialog;
        progressDialog.setCancelable(false);
        this.f6218a.setMessage(this.f6264c.get(new Random().nextInt(this.f6264c.size())));
        this.f6218a.show();
        mo7569A2();
        mo7576Q1(this.f6289l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0210  */
    /* renamed from: C2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7571C2() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f6289l
            r1 = -14284073572167(0xfffff3023ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6263c
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r6.f6282h = r0
            java.util.regex.Pattern r3 = r6.f6246a
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0043
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6263c
            r2 = -14327023245127(0xfffff2f83ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6263c
            r0.requestFocus()
            r2 = 0
        L_0x0043:
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6255b
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r6.f6280g = r0
            int r0 = r0.length()
            r3 = 10
            if (r0 == r3) goto L_0x006f
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6255b
            r2 = -14387152787271(0xfffff2ea3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6255b
            r0.requestFocus()
            r2 = 0
        L_0x006f:
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6238a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r6.f6278f = r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = r6.f6278f
            r3 = -14451577296711(0xfffff2db3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r0 = r0.matches(r3)
            if (r0 != 0) goto L_0x0116
        L_0x0096:
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6238a
            r2 = -14507411871559(0xfffff2ce3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6238a
            r0.requestFocus()
            goto L_0x0115
        L_0x00aa:
            java.lang.String r0 = r6.f6289l
            r3 = -14653440759623(0xfffff2ac3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0116
            android.content.SharedPreferences r0 = r6.f6220a
            r3 = -14722160236359(0xfffff29c3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r4 = -14743635072839(0xfffff2973ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            java.lang.String r0 = r0.getString(r3, r4)
            r6.f6278f = r0
            com.google.android.material.textfield.TextInputEditText r0 = r6.f6270d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.f6282h = r0
            r3 = -14747930040135(0xfffff2963ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = r6.f6282h
            r3 = -14777994811207(0xfffff28f3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0116
            android.content.Context r0 = r6.getApplicationContext()
            r2 = -14808059582279(0xfffff2883ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L_0x0115:
            r2 = 0
        L_0x0116:
            boolean r0 = r6.f6287j
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = r6.f6288k
            if (r0 != 0) goto L_0x0133
            android.content.Context r0 = r6.getApplicationContext()
            r2 = -14945498535751(0xfffff2683ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            r2 = 0
        L_0x0133:
            android.widget.EditText r0 = r6.f6228a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018c
            android.widget.TextView r0 = r6.f6269d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = r6.f6290m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018c
            android.content.Context r0 = r6.getApplicationContext()
            r2 = -15052872718151(0xfffff24f3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            android.widget.EditText r0 = r6.f6228a
            r2 = -15233261344583(0xfffff2253ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            android.widget.TextView r0 = r6.f6269d
            r2 = -15357815396167(0xfffff2083ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            r2 = 0
        L_0x018c:
            android.widget.EditText r0 = r6.f6228a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01c1
            android.widget.EditText r0 = r6.f6228a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 4
            if (r0 == r3) goto L_0x01c1
            android.widget.EditText r0 = r6.f6228a
            r2 = -15482369447751(0xfffff1eb3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            android.widget.EditText r0 = r6.f6228a
            r0.requestFocus()
            r2 = 0
        L_0x01c1:
            java.lang.String r0 = r6.f6286j
            if (r0 != 0) goto L_0x01da
            android.content.Context r0 = r6.getApplicationContext()
            r2 = -15563973826375(0xfffff1d83ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            r2 = 0
        L_0x01da:
            android.widget.EditText r0 = r6.f6248b
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r6.f6284i = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0210
            android.widget.LinearLayout r0 = r6.f6251b
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.f6265d
            r2 = 1119092736(0x42b40000, float:90.0)
            r0.setRotation(r2)
            android.widget.EditText r0 = r6.f6248b
            r2 = -15662758074183(0xfffff1c13ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r0.setError(r2)
            android.widget.EditText r0 = r6.f6248b
            r0.requestFocus()
            goto L_0x0211
        L_0x0210:
            r1 = r2
        L_0x0211:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.FeedbackActivity.mo7571C2():boolean");
    }

    /* renamed from: N1 */
    public final void mo7572N1() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f6264c = arrayList;
        arrayList.add(pj0.m61166a(-17067212379975L));
        this.f6264c.add(pj0.m61166a(-17114457020231L));
        this.f6264c.add(pj0.m61166a(-17178881529671L));
        this.f6264c.add(pj0.m61166a(-17260485908295L));
    }

    /* renamed from: O */
    public void mo7573O() {
    }

    /* renamed from: O1 */
    public void mo7574O1() {
        CountDownTimer countDownTimer = this.f6223a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f6218a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: P1 */
    public final void mo7575P1(String str) {
        if (str.equalsIgnoreCase(pj0.m61166a(-16723614996295L)) || str.equalsIgnoreCase(pj0.m61166a(-16753679767367L)) || str.equalsIgnoreCase(pj0.m61166a(-16796629440327L)) || str.equalsIgnoreCase(pj0.m61166a(-16830989178695L))) {
            this.f6259c.setVisibility(0);
            mo7583X1(this.f6228a);
            mo7583X1(this.f6248b);
            mo7601z2(this.f6228a);
            this.f6287j = true;
            return;
        }
        mo7583X1(this.f6228a);
        mo7583X1(this.f6248b);
        mo7601z2(this.f6248b);
        this.f6259c.setVisibility(8);
        this.f6287j = false;
    }

    /* renamed from: Q1 */
    public final void mo7576Q1(String str) {
        int i;
        if (str.equalsIgnoreCase(pj0.m61166a(-12553201751879L))) {
            if (!mo7571C2()) {
                mo7574O1();
                return;
            }
            i = 1;
        } else if (str.equalsIgnoreCase(pj0.m61166a(-12596151424839L))) {
            if (!mo7571C2()) {
                mo7574O1();
                return;
            }
            this.f6292p = 2;
            this.f6282h = this.f6270d.getText().toString();
            this.f6282h = pj0.m61166a(-12651985999687L) + this.f6282h + pj0.m61166a(-12694935672647L);
            mo7600y2();
        } else if (!str.equalsIgnoreCase(pj0.m61166a(-12776540051271L))) {
            return;
        } else {
            if (!mo7571C2()) {
                mo7574O1();
                return;
            }
            i = 3;
        }
        this.f6292p = i;
        mo7597v2();
        mo7600y2();
    }

    /* renamed from: R1 */
    public final void mo7577R1() {
        bu2 bu2;
        LiveData<FreshDeskTicketResponse> liveData;
        FreshDeskViewModel freshDeskViewModel = new FreshDeskViewModel();
        if (this.f6271d == null) {
            this.f6271d = new ArrayList<>();
        }
        this.f6271d.add(this.f6286j);
        if (this.f6287j) {
            if (!this.f6290m.isEmpty()) {
                this.f6284i = (pj0.m61166a(-13695663052615L) + this.f6290m + pj0.m61166a(-13777267431239L)) + this.f6284i;
                this.f6271d.add(this.f6290m);
            }
            this.f6284i = (pj0.m61166a(-13798742267719L) + this.f6242a.format((long) this.f6295s) + pj0.m61166a(-13910411417415L) + this.f6242a.format((long) this.f6294r) + pj0.m61166a(-13919001352007L) + this.f6242a.format((long) this.f6293q) + pj0.m61166a(-13927591286599L) + this.f6242a.format((long) this.f6296t) + pj0.m61166a(-13944771155783L) + this.f6242a.format((long) this.f6297u) + pj0.m61166a(-13953361090375L)) + this.f6284i;
        }
        if (this.f6221a != null) {
            this.f6284i += pj0.m61166a(-13974835926855L) + this.f6221a.getLatitude() + pj0.m61166a(-14275483637575L) + this.f6221a.getLongitude();
        }
        FreshDeskRequest freshDeskRequest = new FreshDeskRequest(this.f6278f, this.f6282h, this.f6280g, this.f6286j, this.f6284i, 2, this.f6292p, 3, this.f6271d);
        String str = this.f6276e;
        if (str == null) {
            liveData = freshDeskViewModel.createNewTicket(freshDeskRequest);
            bu2 = new w01(this);
        } else {
            liveData = freshDeskViewModel.createNewTicketWithAttachment(freshDeskRequest, str);
            bu2 = new y01(this);
        }
        liveData.mo4926j(this, bu2);
    }

    /* renamed from: S1 */
    public final void mo7578S1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(C1410R.layout.complaint_ticket_custom_dialog);
        dialog.getWindow().setLayout((Resources.getSystem().getDisplayMetrics().widthPixels * 85) / 100, (Resources.getSystem().getDisplayMetrics().heightPixels * 50) / 100);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCancelable(false);
        dialog.show();
        String a = pj0.m61166a(-17402219829063L);
        String a2 = pj0.m61166a(-17526773880647L);
        ((TextView) dialog.findViewById(C1410R.C1412id.tv_heading_custom)).setText(a);
        ((TextView) dialog.findViewById(C1410R.C1412id.ticket_id_custom)).setText(pj0.m61166a(-17342090286919L) + str);
        ((TextView) dialog.findViewById(C1410R.C1412id.more_details)).setText(a2);
        ((Button) dialog.findViewById(C1410R.C1412id.btn_ok_custom)).setOnClickListener(new b11(this));
    }

    /* renamed from: T1 */
    public final void mo7579T1() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f6256b = arrayList;
        arrayList.add(pj0.m61166a(-12364223190855L));
        this.f6256b.add(pj0.m61166a(-12411467831111L));
        this.f6256b.add(pj0.m61166a(-12428647700295L));
        this.f6256b.add(pj0.m61166a(-12454417504071L));
        this.f6256b.add(pj0.m61166a(-12484482275143L));
        this.f6256b.add(pj0.m61166a(-12505957111623L));
    }

    /* renamed from: U1 */
    public final void mo7580U1(String str) {
        ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getBusMetaData(str).mo4926j(this, new z01(this, str));
    }

    /* renamed from: V1 */
    public final String mo7581V1(String str) {
        String upperCase;
        String a;
        long j;
        if (str.toUpperCase().contains(pj0.m61166a(-16959838197575L))) {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-16972723099463L);
            j = -16985608001351L;
        } else if (str.toUpperCase().contains(pj0.m61166a(-16989902968647L))) {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-17011377805127L);
            j = -17032852641607L;
        } else if (!str.toUpperCase().contains(pj0.m61166a(-17037147608903L))) {
            return str;
        } else {
            upperCase = str.toUpperCase();
            a = pj0.m61166a(-17050032510791L);
            j = -17062917412679L;
        }
        return upperCase.replace(a, pj0.m61166a(j));
    }

    /* renamed from: W1 */
    public final void mo7582W1() {
        new Thread(new C1219g()).start();
    }

    /* renamed from: X1 */
    public final void mo7583X1(EditText editText) {
        ((InputMethodManager) getSystemService(pj0.m61166a(-16848169047879L))).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /* renamed from: f */
    public void mo7584f(int i) {
    }

    /* renamed from: g */
    public void mo7585g() {
    }

    /* renamed from: l */
    public void mo7586l(String str, boolean z, boolean z2, boolean z3, String str2) {
        if (z3) {
            File file = new File(str);
            if (file.length() > 8000000) {
                Toast.makeText(this, pj0.m61166a(-17853191395143L), 0).show();
                return;
            }
            this.f6276e = str;
            if (file.getName().contains(pj0.m61166a(-17921910871879L)) || file.getName().contains(pj0.m61166a(-17939090741063L)) || file.getName().contains(pj0.m61166a(-17956270610247L)) || file.getName().contains(pj0.m61166a(-17973450479431L)) || file.getName().contains(pj0.m61166a(-17990630348615L)) || file.getName().contains(pj0.m61166a(-18012105185095L)) || file.getName().contains(pj0.m61166a(-18033580021575L)) || file.getName().contains(pj0.m61166a(-18050759890759L)) || file.getName().contains(pj0.m61166a(-18067939759943L)) || file.getName().contains(pj0.m61166a(-18085119629127L)) || file.getName().contains(pj0.m61166a(-18102299498311L)) || file.getName().contains(pj0.m61166a(-18123774334791L)) || file.getName().contains(pj0.m61166a(-18145249171271L)) || file.getName().contains(pj0.m61166a(-18162429040455L))) {
                this.f6229a.setVisibility(8);
                this.f6262c.setText(file.getName());
                this.f6262c.setPadding(0, 25, 0, 25);
                this.f6249b.setVisibility(0);
                return;
            }
            Toast.makeText(this, pj0.m61166a(-18179608909639L), 0).show();
            this.f6262c.setText(pj0.m61166a(-18261213288263L));
            this.f6262c.setPadding(50, 0, 0, 0);
            this.f6229a.setVisibility(0);
            this.f6249b.setVisibility(8);
            return;
        }
        this.f6276e = null;
    }

    /* renamed from: n */
    public void mo7587n(ArrayList<String> arrayList, boolean z, String str) {
    }

    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 22 && i2 == -1 && intent != null && intent.getData() != null) {
            if (intent.getData().toString().contains(pj0.m61166a(-16324183037767L)) || intent.getData().toString().contains(pj0.m61166a(-16345657874247L)) || intent.getData().toString().contains(pj0.m61166a(-16367132710727L)) || intent.getData().toString().contains(pj0.m61166a(-16388607547207L)) || intent.getData().toString().contains(pj0.m61166a(-16410082383687L)) || intent.getData().toString().contains(pj0.m61166a(-16435852187463L)) || intent.getData().toString().contains(pj0.m61166a(-16461621991239L)) || intent.getData().toString().contains(pj0.m61166a(-16483096827719L)) || intent.getData().toString().contains(pj0.m61166a(-16504571664199L)) || intent.getData().toString().contains(pj0.m61166a(-16526046500679L)) || intent.getData().toString().contains(pj0.m61166a(-16547521337159L)) || intent.getData().toString().contains(pj0.m61166a(-16568996173639L)) || intent.getData().toString().contains(pj0.m61166a(-16590471010119L)) || intent.getData().toString().contains(pj0.m61166a(-16616240813895L))) {
                Uri data = intent.getData();
                this.f6222a = data;
                this.f6239a.mo34171k(data, Build.VERSION.SDK_INT);
                return;
            }
            Toast.makeText(this, pj0.m61166a(-16642010617671L), 0).show();
            this.f6222a = null;
            this.f6276e = null;
        }
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_feedback);
        this.f6235a = (TextView) findViewById(C1410R.C1412id.tv_heading_details);
        this.f6254b = (TextView) findViewById(C1410R.C1412id.tv_verified);
        this.f6262c = (TextView) findViewById(C1410R.C1412id.tv_add_a_file);
        this.f6269d = (TextView) findViewById(C1410R.C1412id.tv_route);
        this.f6274e = (TextView) findViewById(C1410R.C1412id.tv_char_count);
        this.f6238a = (TextInputEditText) findViewById(C1410R.C1412id.et_name);
        this.f6255b = (TextInputEditText) findViewById(C1410R.C1412id.et_mobile_num);
        this.f6263c = (TextInputEditText) findViewById(C1410R.C1412id.et_email);
        this.f6270d = (TextInputEditText) findViewById(C1410R.C1412id.et_Login_id);
        this.f6275e = (TextInputEditText) findViewById(C1410R.C1412id.et_password);
        this.f6228a = (EditText) findViewById(C1410R.C1412id.et_bus_num);
        this.f6248b = (EditText) findViewById(C1410R.C1412id.et_desc);
        this.f6229a = (ImageButton) findViewById(C1410R.C1412id.image_file);
        this.f6249b = (ImageButton) findViewById(C1410R.C1412id.cancel_image);
        this.f6231a = (LinearLayout) findViewById(C1410R.C1412id.ll_personal_details);
        this.f6251b = (LinearLayout) findViewById(C1410R.C1412id.ll_description);
        this.f6266d = (LinearLayout) findViewById(C1410R.C1412id.ll_passenger);
        this.f6272e = (LinearLayout) findViewById(C1410R.C1412id.ll_official_login);
        this.f6259c = (LinearLayout) findViewById(C1410R.C1412id.ll_bus_data);
        this.f6227a = (Button) findViewById(C1410R.C1412id.btn_submit);
        this.f6247b = (Button) findViewById(C1410R.C1412id.btn_login);
        this.f6230a = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6250b = (ImageView) findViewById(C1410R.C1412id.iv_cross);
        this.f6258c = (ImageView) findViewById(C1410R.C1412id.img_collapse_personal_details);
        this.f6265d = (ImageView) findViewById(C1410R.C1412id.img_collapse_description);
        this.f6233a = (RadioGroup) findViewById(C1410R.C1412id.rg_user_type);
        this.f6234a = (RelativeLayout) findViewById(C1410R.C1412id.rv_red_bus);
        this.f6253b = (RelativeLayout) findViewById(C1410R.C1412id.rv_green_bus);
        this.f6261c = (RelativeLayout) findViewById(C1410R.C1412id.rv_orange_bus);
        this.f6268d = (RelativeLayout) findViewById(C1410R.C1412id.rv_blue_bus);
        this.f6273e = (RelativeLayout) findViewById(C1410R.C1412id.rv_light_blue_bus);
        RadioButton radioButton = (RadioButton) findViewById(C1410R.C1412id.rb_senior_official);
        RadioButton radioButton2 = (RadioButton) findViewById(C1410R.C1412id.rb_passenger);
        RadioButton radioButton3 = (RadioButton) findViewById(C1410R.C1412id.rb_bus_marshall);
        this.f6232a = (ProgressBar) findViewById(C1410R.C1412id.pb_officials_login);
        this.f6226a = (AutoCompleteTextView) findViewById(C1410R.C1412id.auto_complete_routes);
        Spinner spinner = (Spinner) findViewById(C1410R.C1412id.spinner_bus_num_prefix);
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_date);
        TextView textView2 = (TextView) findViewById(C1410R.C1412id.tv_time);
        this.f6252b = (RadioGroup) findViewById(C1410R.C1412id.rg_1);
        this.f6260c = (RadioGroup) findViewById(C1410R.C1412id.rg_2);
        this.f6267d = (RadioGroup) findViewById(C1410R.C1412id.rg_3);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(pj0.m61166a(-11848827115335L), 0);
        this.f6220a = sharedPreferences;
        this.f6278f = sharedPreferences.getString(pj0.m61166a(-11934726461255L), pj0.m61166a(-11956201297735L));
        this.f6282h = this.f6220a.getString(pj0.m61166a(-11960496265031L), pj0.m61166a(-11986266068807L));
        this.f6280g = this.f6220a.getString(pj0.m61166a(-11990561036103L), pj0.m61166a(-12020625807175L));
        this.f6243a = new ArrayList<>(Arrays.asList(this.f6220a.getString(pj0.m61166a(-12024920774471L), pj0.m61166a(-12102230185799L)).split(pj0.m61166a(-12209604368199L))));
        spinner.setOnItemSelectedListener(this);
        mo7596u2();
        this.f6238a.setText(this.f6278f);
        this.f6263c.setText(this.f6282h);
        this.f6255b.setText(this.f6280g);
        if (this.f6255b.getText() != null && !this.f6255b.getText().toString().isEmpty()) {
            this.f6255b.setBackgroundResource(17170445);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.f6243a);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        this.f6236a = DatabaseAccess.getInstance(this);
        mo7582W1();
        this.f6239a = new d23(this, this, this);
        this.f6230a.setOnClickListener(new n01(this));
        mo7572N1();
        if (this.f6278f.isEmpty() || this.f6282h.isEmpty() || this.f6280g.isEmpty()) {
            this.f6277e = false;
            this.f6258c.setRotation(-90.0f);
            this.f6231a.setVisibility(0);
        } else {
            this.f6277e = true;
            this.f6231a.setVisibility(8);
            this.f6258c.setRotation(90.0f);
        }
        this.f6258c.setOnClickListener(new h11(this));
        this.f6279f = false;
        this.f6265d.setOnClickListener(new f11(this));
        this.f6247b.setVisibility(8);
        this.f6229a.setOnClickListener(new a11(this));
        this.f6295s = this.f6244a.get(5);
        this.f6294r = this.f6244a.get(2) + 1;
        this.f6293q = this.f6244a.get(1);
        this.f6296t = this.f6244a.get(10);
        this.f6297u = this.f6244a.get(12);
        textView.setText(pj0.m61166a(-12218194302791L) + this.f6242a.format((long) this.f6295s) + pj0.m61166a(-12248259073863L) + this.f6242a.format((long) this.f6294r) + pj0.m61166a(-12256849008455L) + this.f6293q);
        StringBuilder sb = new StringBuilder();
        sb.append(pj0.m61166a(-12265438943047L));
        sb.append(this.f6242a.format((long) this.f6296t));
        sb.append(pj0.m61166a(-12295503714119L));
        sb.append(this.f6242a.format((long) this.f6297u));
        textView2.setText(sb.toString());
        textView.setOnClickListener(new q01(this, textView));
        textView2.setOnClickListener(new r01(this, textView2));
        this.f6249b.setOnClickListener(new g11(this));
        this.f6227a.setOnClickListener(new e11(this));
        this.f6233a.setOnCheckedChangeListener(new t01(this));
        this.f6234a.setOnClickListener(new p01(this));
        this.f6253b.setOnClickListener(new d11(this));
        this.f6261c.setOnClickListener(new o01(this));
        this.f6268d.setOnClickListener(new x01(this));
        this.f6273e.setOnClickListener(new m01(this));
        if (this.f6282h.contains(pj0.m61166a(-12304093648711L)) || this.f6282h.contains(pj0.m61166a(-12334158419783L))) {
            radioButton2.setVisibility(8);
            radioButton3.setVisibility(8);
            radioButton.setChecked(true);
            this.f6270d.setText(this.f6282h);
        } else {
            radioButton2.setVisibility(0);
            radioButton3.setVisibility(0);
            radioButton2.setChecked(true);
        }
        this.f6252b.setOnCheckedChangeListener(new v01(this));
        this.f6260c.setOnCheckedChangeListener(new u01(this));
        this.f6267d.setOnCheckedChangeListener(new s01(this));
        this.f6248b.addTextChangedListener(new C1217e());
        this.f6250b.setOnClickListener(new c11(this));
    }

    public void onDestroy() {
        mo7574O1();
        super.onDestroy();
    }

    public void onFlushComplete(int i) {
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (adapterView.getId() == C1410R.C1412id.spinner_bus_num_prefix) {
            this.f6288k = this.f6243a.get(i);
        }
    }

    public void onLocationChanged(@mr2 Location location) {
        this.f6221a = location;
    }

    public void onLocationChanged(@mr2 List<Location> list) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onPause() {
        super.onPause();
        jd1 jd1 = this.f6240a;
        if (jd1 != null) {
            jd1.mo18275n(this.f6241a);
        }
    }

    public void onProviderDisabled(@mr2 String str) {
    }

    public void onProviderEnabled(@mr2 String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* renamed from: u2 */
    public final void mo7596u2() {
        if (r70.m26348a(this, pj0.m61166a(-18308457928519L)) == 0 || r70.m26348a(this, pj0.m61166a(-18480256620359L)) == 0) {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.mo10538j3(100);
            locationRequest.mo10534g3(1);
            locationRequest.mo10533f3(0);
            locationRequest.mo10537i3(1);
            jd1 a = b82.m11676a(this);
            this.f6240a = a;
            z62 z62 = this.f6241a;
            Looper myLooper = Looper.myLooper();
            Objects.requireNonNull(myLooper);
            Looper looper = myLooper;
            a.mo18262A(locationRequest, z62, myLooper);
            return;
        }
        Toast.makeText(getApplicationContext(), pj0.m61166a(-18660645246791L), 0).show();
    }

    /* renamed from: v2 */
    public final void mo7597v2() {
        SharedPreferences.Editor edit = this.f6220a.edit();
        this.f6219a = edit;
        edit.putString(pj0.m61166a(-12845259528007L), this.f6278f);
        this.f6219a.putString(pj0.m61166a(-12866734364487L), this.f6282h);
        this.f6219a.putString(pj0.m61166a(-12892504168263L), this.f6280g);
        this.f6219a.apply();
    }

    /* renamed from: w2 */
    public final void mo7598w2() {
        String[] strArr = {pj0.m61166a(-15731477550919L)};
        if (r70.m26348a(getApplicationContext(), pj0.m61166a(-15907571210055L)) == 0) {
            Intent intent = new Intent();
            intent.setType(pj0.m61166a(-16083664869191L));
            intent.setAction(pj0.m61166a(-16100844738375L));
            startActivityForResult(Intent.createChooser(intent, pj0.m61166a(-16246873626439L)), 22);
        } else if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(strArr, 101);
        }
    }

    /* renamed from: x2 */
    public final void mo7599x2(String str) {
        long j;
        this.f6234a.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-12922568939335L)), PorterDuff.Mode.SRC_ATOP);
        this.f6253b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-12956928677703L)), PorterDuff.Mode.SRC_ATOP);
        this.f6261c.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-12991288416071L)), PorterDuff.Mode.SRC_ATOP);
        this.f6268d.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13025648154439L)), PorterDuff.Mode.SRC_ATOP);
        this.f6273e.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13060007892807L)), PorterDuff.Mode.SRC_ATOP);
        if (str.equalsIgnoreCase(pj0.m61166a(-13094367631175L))) {
            this.f6234a.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13111547500359L)), PorterDuff.Mode.SRC_ATOP);
            j = -13145907238727L;
        } else if (str.equalsIgnoreCase(pj0.m61166a(-13163087107911L))) {
            this.f6253b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13188856911687L)), PorterDuff.Mode.SRC_ATOP);
            j = -13223216650055L;
        } else if (str.equalsIgnoreCase(pj0.m61166a(-13248986453831L))) {
            this.f6261c.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13279051224903L)), PorterDuff.Mode.SRC_ATOP);
            j = -13313410963271L;
        } else if (str.equalsIgnoreCase(pj0.m61166a(-13343475734343L))) {
            this.f6268d.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13364950570823L)), PorterDuff.Mode.SRC_ATOP);
            j = -13399310309191L;
        } else {
            if (str.equalsIgnoreCase(pj0.m61166a(-13420785145671L))) {
                this.f6273e.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-13468029785927L)), PorterDuff.Mode.SRC_ATOP);
                j = -13502389524295L;
            }
            Context applicationContext = getApplicationContext();
            Toast.makeText(applicationContext, this.f6290m + pj0.m61166a(-13549634164551L), 0).show();
        }
        this.f6290m = pj0.m61166a(j);
        Context applicationContext2 = getApplicationContext();
        Toast.makeText(applicationContext2, this.f6290m + pj0.m61166a(-13549634164551L), 0).show();
    }

    /* renamed from: y2 */
    public final void mo7600y2() {
        if (this.f6287j) {
            if (!this.f6228a.getText().toString().isEmpty()) {
                mo7580U1(this.f6288k + this.f6228a.getText().toString().trim());
                return;
            } else if (!this.f6226a.getText().toString().isEmpty()) {
                this.f6284i = pj0.m61166a(-13609763706695L) + this.f6226a.getText().toString().trim() + pj0.m61166a(-13674188216135L) + this.f6284i;
            }
        }
        this.f6271d = null;
        mo7577R1();
    }

    /* renamed from: z2 */
    public final void mo7601z2(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) getSystemService(pj0.m61166a(-16904003622727L))).toggleSoftInput(2, 0);
    }
}
