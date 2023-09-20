package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.C0887h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.data.RouteDetailRequest;
import com.delhitransport.onedelhi.data.Stop;
import com.delhitransport.onedelhi.data.TripRoute;
import com.delhitransport.onedelhi.live.BusesOnRouteRequest;
import com.delhitransport.onedelhi.live.LiveItem;
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
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3743ut;
import com.onedelhi.secure.C3798vl;
import com.onedelhi.secure.C3839we;
import com.onedelhi.secure.C3858wl;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.ag1;
import com.onedelhi.secure.ao3;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.fg1;
import com.onedelhi.secure.g33;
import com.onedelhi.secure.io1;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.od2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.qn3;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.sd2;
import com.onedelhi.secure.sn3;
import com.onedelhi.secure.th1;
import com.onedelhi.secure.tn3;
import com.onedelhi.secure.un3;
import com.onedelhi.secure.vn3;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.wn3;
import com.onedelhi.secure.xn3;
import com.onedelhi.secure.yn3;
import com.onedelhi.secure.z62;
import com.onedelhi.secure.zk3;
import com.onedelhi.secure.zn3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@SuppressLint({"MissingPermission"})
public class RouteInfoActivity extends BaseActivity {

    /* renamed from: l */
    public static final String f6801l = pj0.m61166a(-68203093006151L);

    /* renamed from: p */
    public static final int f6802p = 123;

    /* renamed from: q */
    public static final int f6803q = 15;

    /* renamed from: a */
    public double f6804a;

    /* renamed from: a */
    public ProgressDialog f6805a;

    /* renamed from: a */
    public final Location f6806a = new Location(pj0.m61166a(-65978299946823L));

    /* renamed from: a */
    public CountDownTimer f6807a;

    /* renamed from: a */
    public final Handler f6808a = new Handler();

    /* renamed from: a */
    public View f6809a;

    /* renamed from: a */
    public ImageView f6810a;

    /* renamed from: a */
    public TextView f6811a;

    /* renamed from: a */
    public DataViewModel f6812a;

    /* renamed from: a */
    public MapView f6813a;

    /* renamed from: a */
    public BottomSheetBehavior f6814a;

    /* renamed from: a */
    public FloatingActionButton f6815a;

    /* renamed from: a */
    public jd1 f6816a;

    /* renamed from: a */
    public qn3 f6817a;

    /* renamed from: a */
    public th1 f6818a;

    /* renamed from: a */
    public C3839we f6819a;

    /* renamed from: a */
    public final z62 f6820a = new C1286a();

    /* renamed from: a */
    public Runnable f6821a;

    /* renamed from: a */
    public final ArrayList<Stop> f6822a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, od2> f6823a = new HashMap<>();

    /* renamed from: b */
    public double f6824b;

    /* renamed from: b */
    public Location f6825b;

    /* renamed from: b */
    public TextView f6826b;

    /* renamed from: b */
    public final ArrayList<LatLng> f6827b = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<List<String>, List<String>> f6828b = new HashMap<>();

    /* renamed from: c */
    public TextView f6829c;

    /* renamed from: c */
    public ArrayList<AllRoutes> f6830c = new ArrayList<>();

    /* renamed from: c */
    public final HashMap<String, Pair<String, String>> f6831c = new HashMap<>();

    /* renamed from: d */
    public TextView f6832d;

    /* renamed from: d */
    public ArrayList<TripRoute> f6833d = new ArrayList<>();

    /* renamed from: d */
    public final HashMap<String, String> f6834d = new HashMap<>();

    /* renamed from: e */
    public TextView f6835e;

    /* renamed from: e */
    public String f6836e;

    /* renamed from: e */
    public final HashMap<String, String> f6837e = new HashMap<>();

    /* renamed from: e */
    public boolean f6838e;

    /* renamed from: f */
    public String f6839f;

    /* renamed from: f */
    public final HashMap<String, String> f6840f = new HashMap<>();

    /* renamed from: f */
    public boolean f6841f = false;

    /* renamed from: g */
    public String f6842g;

    /* renamed from: g */
    public boolean f6843g;

    /* renamed from: h */
    public String f6844h;

    /* renamed from: i */
    public String f6845i = pj0.m61166a(-65982594914119L);

    /* renamed from: j */
    public String f6846j;

    /* renamed from: k */
    public String f6847k;

    /* renamed from: o */
    public int f6848o = 0;

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$a */
    public class C1286a extends z62 {
        public C1286a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            RouteInfoActivity.this.f6818a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 15.0f));
            RouteInfoActivity.this.f6806a.setLatitude(M2.getLatitude());
            RouteInfoActivity.this.f6806a.setLongitude(M2.getLongitude());
            if (RouteInfoActivity.this.f6845i.equalsIgnoreCase(pj0.m61166a(-65961120077639L))) {
                RouteInfoActivity routeInfoActivity = RouteInfoActivity.this;
                routeInfoActivity.mo7823G1(0, routeInfoActivity.f6844h);
                RouteInfoActivity.this.mo7821E1();
                RouteInfoActivity routeInfoActivity2 = RouteInfoActivity.this;
                routeInfoActivity2.mo7832P1(routeInfoActivity2.f6844h);
            }
            RouteInfoActivity.this.f6818a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(RouteInfoActivity.this.f6806a.getLatitude(), RouteInfoActivity.this.f6806a.getLongitude())).mo10680e(15.0f).mo10677b()));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$b */
    public class C1287b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final RouteSearches f6851a = new RouteSearches();

        /* renamed from: a */
        public final /* synthetic */ String f6852a;

        /* renamed from: b */
        public final /* synthetic */ String f6853b;

        /* renamed from: c */
        public final /* synthetic */ String f6854c;

        /* renamed from: d */
        public final /* synthetic */ String f6855d;

        public C1287b(String str, String str2, String str3, String str4) {
            this.f6852a = str;
            this.f6853b = str2;
            this.f6854c = str3;
            this.f6855d = str4;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                this.f6851a.setRoute_name(this.f6852a);
                this.f6851a.setTerminal(this.f6853b);
                this.f6851a.setSource(this.f6854c);
                this.f6851a.setType(this.f6855d);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(RouteInfoActivity.this).getAppDatabase().routeSearchDao().insert(this.f6851a);
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

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$c */
    public class C1288c extends BottomSheetBehavior.C1503f {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f6856a;

        public C1288c(RecyclerView recyclerView) {
            this.f6856a = recyclerView;
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            if (i == 3) {
                RouteInfoActivity.this.f6815a.setVisibility(8);
            } else if (i == 4) {
                RouteInfoActivity.this.f6809a.setVisibility(0);
                RouteInfoActivity.this.f6815a.setVisibility(0);
                RouteInfoActivity.this.f6810a.setImageDrawable(zk3.m33204g(RouteInfoActivity.this.getResources(), C1410R.C1411drawable.ic_down_arrow_filled, (Resources.Theme) null));
                RouteInfoActivity.this.f6810a.setVisibility(0);
                this.f6856a.mo5372G1(0);
            } else if (i == 5) {
                RouteInfoActivity.this.f6815a.setVisibility(0);
                RouteInfoActivity.this.f6809a.setVisibility(8);
                if (RouteInfoActivity.this.f6822a.size() > 0) {
                    RouteInfoActivity.this.f6810a.setImageDrawable(zk3.m33204g(RouteInfoActivity.this.getResources(), C1410R.C1411drawable.ic_up_arrow_filled, (Resources.Theme) null));
                    RouteInfoActivity.this.f6810a.setVisibility(0);
                    return;
                }
                RouteInfoActivity.this.f6810a.setVisibility(8);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$d */
    public class C1289d implements Runnable {
        public C1289d() {
        }

        public void run() {
            if (RouteInfoActivity.this.f6843g) {
                RouteInfoActivity routeInfoActivity = RouteInfoActivity.this;
                routeInfoActivity.mo7823G1(1, routeInfoActivity.f6844h);
                RouteInfoActivity.this.f6808a.postDelayed(this, 10000);
                return;
            }
            RouteInfoActivity.this.f6808a.removeCallbacks(this);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$e */
    public class C1290e extends CountDownTimer {
        public C1290e(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (RouteInfoActivity.this.f6805a != null) {
                RouteInfoActivity.this.f6805a.dismiss();
            }
            RouteInfoActivity routeInfoActivity = RouteInfoActivity.this;
            Toast.makeText(routeInfoActivity, routeInfoActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            RouteInfoActivity.this.onBackPressed();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$f */
    public class C1291f implements Runnable {

        /* renamed from: a */
        public float f6860a;

        /* renamed from: a */
        public final /* synthetic */ Handler f6861a;

        /* renamed from: a */
        public final /* synthetic */ Interpolator f6862a;

        /* renamed from: a */
        public final /* synthetic */ LatLng f6864a;

        /* renamed from: a */
        public final /* synthetic */ od2 f6865a;

        /* renamed from: b */
        public float f6866b;

        /* renamed from: b */
        public long f6867b;

        /* renamed from: b */
        public final /* synthetic */ LatLng f6868b;

        /* renamed from: c */
        public final /* synthetic */ float f6869c;

        /* renamed from: c */
        public final /* synthetic */ long f6870c;

        public C1291f(long j, float f, Interpolator interpolator, LatLng latLng, LatLng latLng2, od2 od2, Handler handler) {
            this.f6870c = j;
            this.f6869c = f;
            this.f6862a = interpolator;
            this.f6864a = latLng;
            this.f6868b = latLng2;
            this.f6865a = od2;
            this.f6861a = handler;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f6870c;
            this.f6867b = uptimeMillis;
            float f = ((float) uptimeMillis) / this.f6869c;
            this.f6860a = f;
            this.f6866b = this.f6862a.getInterpolation(f);
            LatLng latLng = this.f6864a;
            double d = latLng.f7562a;
            float f2 = this.f6860a;
            LatLng latLng2 = this.f6868b;
            this.f6865a.mo21892u(new LatLng((d * ((double) (1.0f - f2))) + (latLng2.f7562a * ((double) f2)), (latLng.f7563b * ((double) (1.0f - f2))) + (latLng2.f7563b * ((double) f2))));
            if (this.f6860a < 1.0f) {
                this.f6861a.postDelayed(this, 16);
            } else {
                this.f6865a.mo21897z(true);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$g */
    public class C1292g implements th1.C3608b {
        public C1292g() {
        }

        /* renamed from: b */
        public View mo7564b(od2 od2) {
            View inflate = RouteInfoActivity.this.getLayoutInflater().inflate(C1410R.layout.marker_info_metro, (ViewGroup) null);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_available)).setVisibility(8);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_stop_name)).setText(od2.mo21877g());
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_starting_stop_1)).setVisibility(8);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_terminal_stop_1)).setVisibility(8);
            return inflate;
        }

        /* renamed from: f */
        public View mo7565f(od2 od2) {
            return null;
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.RouteInfoActivity$h */
    public static class C1293h extends LinearLayoutManager {
        public C1293h(Context context, int i, boolean z) {
            super(context, i, z);
        }

        /* renamed from: o1 */
        public void mo5230o1(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
            try {
                super.mo5230o1(wVar, c0Var);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /* renamed from: Q1 */
    public static void m8280Q1(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(pj0.m61166a(-65999774783303L));
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m8281S1(int i, List list) {
        List list2 = list;
        if (list2 != null) {
            this.f6848o = list.size();
            if (i != 0) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    LiveItem liveItem = (LiveItem) list2.get(i2);
                    LatLng latLng = new LatLng(Double.parseDouble(liveItem.getLat()), Double.parseDouble(liveItem.getLon()));
                    String id = liveItem.getId();
                    this.f6836e = id;
                    od2 od2 = this.f6823a.get(id);
                    if (od2 != null) {
                        mo7834b2(od2, latLng);
                        this.f6823a.put(this.f6836e, od2);
                    } else {
                        mo7820D1(Double.valueOf(Double.parseDouble(liveItem.getLat())), Double.valueOf(Double.parseDouble(liveItem.getLon())), liveItem.getId(), liveItem.getId(), pj0.m61166a(-67296854906695L), liveItem.getAgency(), Boolean.valueOf(liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-67314034775879L))), liveItem.getId(), String.valueOf(liveItem.getTimestamp()), pj0.m61166a(-67326919677767L), liveItem.getRoute());
                    }
                }
            } else if (list.size() > 0) {
                this.f6843g = true;
                this.f6804a = Double.parseDouble(((LiveItem) list2.get(0)).getLat());
                this.f6824b = Double.parseDouble(((LiveItem) list2.get(0)).getLon());
                for (int i3 = 0; i3 < list.size(); i3++) {
                    LiveItem liveItem2 = (LiveItem) list2.get(i3);
                    mo7820D1(Double.valueOf(Double.parseDouble(liveItem2.getLat())), Double.valueOf(Double.parseDouble(liveItem2.getLon())), liveItem2.getId(), liveItem2.getId(), pj0.m61166a(-67021976999751L), liveItem2.getAgency(), Boolean.valueOf(liveItem2.getAc().equalsIgnoreCase(pj0.m61166a(-67039156868935L))), liveItem2.getId(), String.valueOf(liveItem2.getTimestamp()), pj0.m61166a(-67052041770823L), liveItem2.getRoute());
                    if (!this.f6841f) {
                        this.f6818a.mo24990w(C3743ut.m29571e(new LatLng(this.f6804a, this.f6824b), 15.0f));
                        this.f6841f = true;
                    }
                }
            } else {
                Toast.makeText(this, pj0.m61166a(-67077811574599L), 0).show();
            }
            mo7836d2();
            return;
        }
        Toast.makeText(this, pj0.m61166a(-67352689481543L), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m8282T1(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f6825b = location;
            if (location != null) {
                this.f6818a.mo24990w(C3743ut.m29571e(new LatLng(this.f6825b.getLatitude(), this.f6825b.getLongitude()), 15.0f));
                this.f6806a.setLatitude(this.f6825b.getLatitude());
                this.f6806a.setLongitude(this.f6825b.getLongitude());
                this.f6818a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f6806a.getLatitude(), this.f6806a.getLongitude())).mo10680e(15.0f).mo10677b()));
                return;
            }
            mo7835c2();
            return;
        }
        Toast.makeText(this, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-67842315753287L)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0179 A[LOOP:0: B:22:0x0171->B:24:0x0179, LOOP_END] */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m8283U1(java.lang.String r9, com.delhitransport.onedelhi.data.RouteResponse r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x024d
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r0 = r8.f6822a
            r0.clear()
            java.util.ArrayList r10 = r10.getTransit_routes()
            r8.f6833d = r10
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r0 = r8.f6822a
            r1 = 0
            java.lang.Object r10 = r10.get(r1)
            com.delhitransport.onedelhi.data.TripRoute r10 = (com.delhitransport.onedelhi.data.TripRoute) r10
            java.util.ArrayList r10 = r10.getStops()
            r0.addAll(r10)
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            java.lang.Object r10 = r10.get(r1)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.String r10 = r10.getName()
            r8.f6842g = r10
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            int r0 = r10.size()
            int r0 = r0 + -1
            java.lang.Object r10 = r10.get(r0)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.String r10 = r10.getName()
            r8.f6839f = r10
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67571732813639(0xffffc28b3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x006e
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67588912682823(0xffffc2873ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67606092552007(0xffffc2833ade68b9, double:NaN)
        L_0x0064:
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            java.lang.String r10 = r10.replace(r0, r2)
            goto L_0x0108
        L_0x006e:
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67610387519303(0xffffc2823ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x0094
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67636157323079(0xffffc27c3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67661927126855(0xffffc2763ade68b9, double:NaN)
            goto L_0x0064
        L_0x0094:
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67666222094151(0xffffc2753ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x00ba
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67679106996039(0xffffc2723ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67691991897927(0xffffc26f3ade68b9, double:NaN)
            goto L_0x0064
        L_0x00ba:
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67696286865223(0xffffc26e3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x00e0
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67709171767111(0xffffc26b3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67722056668999(0xffffc2683ade68b9, double:NaN)
            goto L_0x0064
        L_0x00e0:
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67726351636295(0xffffc2673ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x0107
            java.lang.String r10 = r9.toUpperCase()
            r2 = -67747826472775(0xffffc2623ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67769301309255(0xffffc25d3ade68b9, double:NaN)
            goto L_0x0064
        L_0x0107:
            r10 = r9
        L_0x0108:
            java.lang.String r0 = r10.toUpperCase()
            r2 = -67773596276551(0xffffc25c3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0135
            java.lang.String r10 = r10.toUpperCase()
            r2 = -67782186211143(0xffffc25a3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r2)
            r2 = -67790776145735(0xffffc2583ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            java.lang.String r10 = r10.replace(r0, r2)
        L_0x0135:
            android.widget.TextView r0 = r8.f6835e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r3 = r8.f6822a
            int r3 = r3.size()
            r2.append(r3)
            r3 = -67795071113031(0xffffc2573ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            android.widget.TextView r0 = r8.f6829c
            r0.setText(r10)
            android.widget.TextView r10 = r8.f6826b
            java.lang.String r0 = r8.f6842g
            r10.setText(r0)
            android.widget.TextView r10 = r8.f6811a
            java.lang.String r0 = r8.f6839f
            r10.setText(r0)
            java.util.ArrayList<com.google.android.gms.maps.model.LatLng> r10 = r8.f6827b
            r10.clear()
            r10 = 0
        L_0x0171:
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r0 = r8.f6822a
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x01cd
            java.util.ArrayList<com.google.android.gms.maps.model.LatLng> r0 = r8.f6827b
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r3 = r8.f6822a
            java.lang.Object r3 = r3.get(r10)
            com.delhitransport.onedelhi.data.Stop r3 = (com.delhitransport.onedelhi.data.Stop) r3
            java.lang.Double r3 = r3.getLat()
            double r3 = r3.doubleValue()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r5 = r8.f6822a
            java.lang.Object r5 = r5.get(r10)
            com.delhitransport.onedelhi.data.Stop r5 = (com.delhitransport.onedelhi.data.Stop) r5
            java.lang.Double r5 = r5.getLon()
            double r5 = r5.doubleValue()
            r2.<init>(r3, r5)
            r0.add(r2)
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r0 = r8.f6822a
            java.lang.Object r0 = r0.get(r10)
            com.delhitransport.onedelhi.data.Stop r0 = (com.delhitransport.onedelhi.data.Stop) r0
            java.lang.Double r0 = r0.getLat()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r2 = r8.f6822a
            java.lang.Object r2 = r2.get(r10)
            com.delhitransport.onedelhi.data.Stop r2 = (com.delhitransport.onedelhi.data.Stop) r2
            java.lang.Double r2 = r2.getLon()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r3 = r8.f6822a
            java.lang.Object r3 = r3.get(r10)
            com.delhitransport.onedelhi.data.Stop r3 = (com.delhitransport.onedelhi.data.Stop) r3
            java.lang.String r3 = r3.getName()
            r8.mo7819C1(r0, r2, r3)
            int r10 = r10 + 1
            goto L_0x0171
        L_0x01cd:
            com.onedelhi.secure.qn3 r10 = r8.f6817a
            r10.mo5717m()
            r8.mo7821E1()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r8.f6814a
            r0 = 4
            r10.mo11242Y0(r0)
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            java.lang.Object r10 = r10.get(r1)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.Double r10 = r10.getLat()
            double r2 = r10.doubleValue()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            int r0 = r10.size()
            int r0 = r0 + -1
            java.lang.Object r10 = r10.get(r0)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.Double r10 = r10.getLat()
            double r4 = r10.doubleValue()
            double r2 = r2 + r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r4
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            java.lang.Object r10 = r10.get(r1)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.Double r10 = r10.getLon()
            double r0 = r10.doubleValue()
            java.util.ArrayList<com.delhitransport.onedelhi.data.Stop> r10 = r8.f6822a
            int r6 = r10.size()
            int r6 = r6 + -1
            java.lang.Object r10 = r10.get(r6)
            com.delhitransport.onedelhi.data.Stop r10 = (com.delhitransport.onedelhi.data.Stop) r10
            java.lang.Double r10 = r10.getLon()
            double r6 = r10.doubleValue()
            double r0 = r0 + r6
            double r0 = r0 / r4
            com.onedelhi.secure.th1 r10 = r8.f6818a
            com.google.android.gms.maps.model.LatLng r4 = new com.google.android.gms.maps.model.LatLng
            r4.<init>(r2, r0)
            r0 = 1094713344(0x41400000, float:12.0)
            com.onedelhi.secure.tt r0 = com.onedelhi.secure.C3743ut.m29571e(r4, r0)
            r10.mo24990w(r0)
            java.lang.String r10 = r8.f6842g
            java.lang.String r0 = r8.f6839f
            r1 = -67825135884103(0xffffc2503ade68b9, double:NaN)
            java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
            r8.mo7833R1(r9, r10, r0, r1)
        L_0x024d:
            r8.mo7824H1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.RouteInfoActivity.m8283U1(java.lang.String, com.delhitransport.onedelhi.data.RouteResponse):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ boolean m8284V1(od2 od2) {
        mo7827K1();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m8285W1(th1 th1) {
        this.f6818a = th1;
        mo7825I1();
        if (this.f6838e) {
            this.f6818a.mo24940I(true);
            this.f6818a.mo24985r().mo16113o(false);
            this.f6818a.mo24985r().mo16112n(false);
        }
        this.f6818a.mo24955X(new wn3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m8286X1(View view) {
        mo7829M1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m8287Y1(View view) {
        if (this.f6814a.mo11277v0() == 5) {
            this.f6814a.mo11242Y0(4);
        } else if (this.f6814a.mo11277v0() == 4) {
            this.f6814a.mo11242Y0(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m8288Z1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m8289a2(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-68022704379719L)));
    }

    /* renamed from: C1 */
    public final void mo7819C1(Double d, Double d2, String str) {
        sd2 h3 = new sd2().mo24329e3(new LatLng(d.doubleValue(), d2.doubleValue())).mo24324Z2(mo7822F1(this, C1410R.C1411drawable.ic_bus_stop_updated)).mo24332h3(str);
        th1 th1 = this.f6818a;
        if (th1 != null) {
            od2 c = th1.mo24962c(h3);
            this.f6840f.put(c.mo21871b(), str);
            this.f6823a.put(c.mo21871b(), c);
        }
    }

    /* renamed from: D1 */
    public final void mo7820D1(Double d, Double d2, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8) {
        String str9 = str;
        LatLng latLng = new LatLng(d.doubleValue(), d2.doubleValue());
        new sd2();
        sd2 h3 = new sd2().mo24329e3(latLng).mo24324Z2(C3858wl.m30941d(ag1.m11151a(this, str8, str4, bool, pj0.m61166a(-66987617261383L), str5))).mo24332h3(str);
        th1 th1 = this.f6818a;
        if (th1 != null) {
            od2 c = th1.mo24962c(h3);
            this.f6840f.put(c.mo21871b(), str);
            String str10 = str2;
            this.f6823a.put(str2, c);
        }
    }

    /* renamed from: E1 */
    public final void mo7821E1() {
        g33 g33 = new g33();
        g33.mo16295R2(getResources().getColor(C1410R.color.blue_00ade6));
        g33.mo16313j3(15.0f);
        g33.mo16290M2(this.f6827b);
        th1 th1 = this.f6818a;
        if (th1 != null) {
            th1.mo24966e(g33);
        }
    }

    /* renamed from: F1 */
    public final C3798vl mo7822F1(Context context, int i) {
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

    /* renamed from: G1 */
    public final void mo7823G1(int i, String str) {
        new LiveViewModel().buses_on_route(new BusesOnRouteRequest(str)).mo4926j(this, new xn3(this, i));
    }

    /* renamed from: H1 */
    public void mo7824H1() {
        CountDownTimer countDownTimer = this.f6807a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f6805a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: I1 */
    public final void mo7825I1() {
        boolean z = r70.m26348a(this, pj0.m61166a(-66313307395911L)) == 0;
        this.f6838e = z;
        if (!z) {
            C3962y2.m31859G(this, new String[]{pj0.m61166a(-66485106087751L)}, 123);
        } else {
            mo7838f2();
        }
    }

    /* renamed from: J1 */
    public final void mo7826J1() {
        th1 th1 = this.f6818a;
        if (th1 != null) {
            th1.mo24976j();
        }
        HashMap<String, od2> hashMap = this.f6823a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: K1 */
    public final void mo7827K1() {
        this.f6818a.mo24933B(new C1292g());
    }

    /* renamed from: L1 */
    public final void mo7828L1() {
        C1289d dVar = new C1289d();
        this.f6821a = dVar;
        try {
            this.f6808a.postDelayed(dVar, 10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M1 */
    public final void mo7829M1() {
        this.f6816a.mo18272U().mo17573e(new zn3(this));
    }

    /* renamed from: N1 */
    public final float mo7830N1(Location location, Location location2) {
        return location.distanceTo(location2);
    }

    /* renamed from: O1 */
    public final Bitmap mo7831O1(String str, String str2, String str3, boolean z, float f, String str4) {
        io1 io1 = new io1(this);
        io1.mo38184l(((LayoutInflater) getSystemService(pj0.m61166a(-66854473275207L))).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        if (!str2.equalsIgnoreCase(pj0.m61166a(-66923192751943L))) {
            return null;
        }
        io1.mo38180h(C3129p8.m24529b(this, str3.equalsIgnoreCase(pj0.m61166a(-66940372621127L)) ? z ? C1410R.C1411drawable.bus_marker_red : C1410R.C1411drawable.bus_marker_green : z ? C1410R.C1411drawable.bus_marker_blue : C1410R.C1411drawable.bus_marker_orange));
        if (str4.contains(pj0.m61166a(-66957552490311L))) {
            io1.mo38180h(C3129p8.m24529b(this, C1410R.C1411drawable.bus_marker_light_blue));
        }
        String a = fg1.m14893a(str);
        io1.mo38187o(C1410R.style.iconGenText);
        io1.mo38182j(0, 0, 0, 0);
        return io1.mo38178f(a);
    }

    /* renamed from: P1 */
    public final void mo7832P1(String str) {
        mo7837e2();
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6805a = progressDialog;
            progressDialog.setMessage(pj0.m61166a(-66747099092807L));
            this.f6805a.setCancelable(false);
            this.f6805a.show();
            this.f6812a.getRouteLiveDataDIMTS(new RouteDetailRequest(this.f6846j, str, this.f6847k)).mo4926j(this, new yn3(this, str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: R1 */
    public final void mo7833R1(String str, String str2, String str3, String str4) {
        new C1287b(str, str2, str3, str4).execute(new Void[0]);
    }

    /* renamed from: b2 */
    public void mo7834b2(od2 od2, LatLng latLng) {
        LatLng c = od2.mo21872c();
        Handler handler = new Handler();
        long uptimeMillis = SystemClock.uptimeMillis();
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        Location location = new Location(pj0.m61166a(-66794343733063L));
        location.setLongitude(c.f7563b);
        location.setLatitude(c.f7562a);
        Location location2 = new Location(pj0.m61166a(-66798638700359L));
        location2.setLongitude(latLng.f7563b);
        location2.setLatitude(latLng.f7562a);
        handler.post(new C1291f(uptimeMillis, mo7830N1(location, location2) < 10.0f ? 200.0f : mo7830N1(location, location2) < 100.0f ? 2000.0f : (mo7830N1(location, location2) < 100.0f || mo7830N1(location, location2) >= 200.0f) ? (mo7830N1(location, location2) < 200.0f || mo7830N1(location, location2) >= 500.0f) ? 10000.0f : 8000.0f : 4000.0f, accelerateDecelerateInterpolator, c, latLng, od2, handler));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c2 */
    public final void mo7835c2() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 a = b82.m11676a(this);
        this.f6816a = a;
        z62 z62 = this.f6820a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        a.mo18262A(locationRequest, z62, myLooper);
    }

    /* renamed from: d2 */
    public final void mo7836d2() {
        long j;
        StringBuilder sb;
        TextView textView;
        if (this.f6848o <= 1) {
            textView = this.f6832d;
            sb = new StringBuilder();
            sb.append(this.f6848o);
            j = -66802933667655L;
        } else {
            textView = this.f6832d;
            sb = new StringBuilder();
            sb.append(this.f6848o);
            j = -66824408504135L;
        }
        sb.append(pj0.m61166a(j));
        textView.setText(sb.toString());
    }

    /* renamed from: e2 */
    public void mo7837e2() {
        C1290e eVar = new C1290e(rf4.f19824c, 1000);
        this.f6807a = eVar;
        eVar.start();
    }

    /* renamed from: f2 */
    public final void mo7838f2() {
        boolean z;
        boolean z2 = false;
        if (this.f6838e) {
            this.f6818a.mo24940I(true);
            this.f6818a.mo24985r().mo16113o(false);
            this.f6818a.mo24985r().mo16112n(false);
        }
        LocationManager locationManager = (LocationManager) getSystemService(pj0.m61166a(-66656904779591L));
        try {
            z = locationManager.isProviderEnabled(pj0.m61166a(-66695559485255L));
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(pj0.m61166a(-66712739354439L));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z && !z2) {
            new C0189c.C0190a(this).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new sn3(this)).mo959s(getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
        }
        if ((z || z2) && this.f6838e) {
            mo7829M1();
        }
    }

    public void onBackPressed() {
        if (this.f6814a.mo11277v0() == 3) {
            this.f6814a.mo11242Y0(4);
            return;
        }
        finish();
        this.f6843g = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_route_info);
        Bundle extras = getIntent().getExtras();
        this.f6844h = extras != null ? extras.getString(pj0.m61166a(-66055609358151L), pj0.m61166a(-66081379161927L)) : pj0.m61166a(-66085674129223L);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-66089969096519L), 0);
        this.f6846j = sharedPreferences.getString(pj0.m61166a(-66175868442439L), pj0.m61166a(-66218818115399L));
        this.f6847k = sharedPreferences.getString(pj0.m61166a(-66223113082695L), pj0.m61166a(-66270357722951L));
        this.f6813a = (MapView) findViewById(C1410R.C1412id.mapView);
        this.f6832d = (TextView) findViewById(C1410R.C1412id.tv_bus_count);
        this.f6835e = (TextView) findViewById(C1410R.C1412id.tv_stops_count);
        this.f6815a = (FloatingActionButton) findViewById(C1410R.C1412id.fab_curLocation);
        this.f6810a = (ImageView) findViewById(C1410R.C1412id.iv_bottom_sheet);
        this.f6809a = findViewById(C1410R.C1412id.view_1);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6812a = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        this.f6813a.mo10627b(bundle);
        this.f6813a.mo10633h();
        this.f6813a.mo10626a(new ao3(this));
        if (bundle != null) {
            this.f6825b = (Location) bundle.getParcelable(pj0.m61166a(-66274652690247L));
        }
        this.f6816a = b82.m11676a(this);
        BottomSheetBehavior i0 = BottomSheetBehavior.m9579i0((RelativeLayout) findViewById(C1410R.C1412id.bottom_sheet));
        this.f6814a = i0;
        i0.mo11242Y0(5);
        RecyclerView recyclerView = (RecyclerView) findViewById(C1410R.C1412id.rv_exp);
        this.f6817a = new qn3(this.f6822a);
        recyclerView.setLayoutManager(new C1293h(this, 1, false));
        recyclerView.setItemAnimator(new C0887h());
        recyclerView.setAdapter(this.f6817a);
        this.f6829c = (TextView) findViewById(C1410R.C1412id.tv_route_name);
        this.f6826b = (TextView) findViewById(C1410R.C1412id.tv_starting_stop);
        this.f6811a = (TextView) findViewById(C1410R.C1412id.tv_ending_stop);
        this.f6815a.setOnClickListener(new un3(this));
        this.f6814a.mo11241Y(new C1288c(recyclerView));
        this.f6810a.setOnClickListener(new vn3(this));
        imageView.setOnClickListener(new tn3(this));
    }

    public void onDestroy() {
        mo7824H1();
        super.onDestroy();
    }

    public void onPause() {
        Runnable runnable;
        super.onPause();
        this.f6843g = false;
        this.f6823a.clear();
        th1 th1 = this.f6818a;
        if (th1 != null) {
            th1.mo24976j();
        }
        this.f6822a.clear();
        this.f6827b.clear();
        Handler handler = this.f6808a;
        if (handler != null && (runnable = this.f6821a) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void onResume() {
        super.onResume();
        this.f6843g = true;
        mo7823G1(1, this.f6844h);
        mo7821E1();
        mo7832P1(this.f6844h);
        mo7828L1();
        this.f6845i = pj0.m61166a(-67004797130567L);
    }
}
