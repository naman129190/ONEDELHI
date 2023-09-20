package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.lifecycle.C0709m;
import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.data.AllRouteResponse;
import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.AllStopsResponse;
import com.delhitransport.onedelhi.data.GenericRequest;
import com.delhitransport.onedelhi.data.NearByStopsRequest;
import com.delhitransport.onedelhi.live.LiveItem;
import com.delhitransport.onedelhi.live.LiveRequest;
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
import com.onedelhi.secure.C3743ut;
import com.onedelhi.secure.C3858wl;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.a52;
import com.onedelhi.secure.b52;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.c52;
import com.onedelhi.secure.d52;
import com.onedelhi.secure.e52;
import com.onedelhi.secure.f52;
import com.onedelhi.secure.g52;
import com.onedelhi.secure.h52;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.od2;
import com.onedelhi.secure.p42;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.q42;
import com.onedelhi.secure.r42;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.s42;
import com.onedelhi.secure.sd2;
import com.onedelhi.secure.t42;
import com.onedelhi.secure.th1;
import com.onedelhi.secure.u42;
import com.onedelhi.secure.v42;
import com.onedelhi.secure.w42;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x42;
import com.onedelhi.secure.y42;
import com.onedelhi.secure.z42;
import com.onedelhi.secure.z62;
import com.onedelhi.secure.zk3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@SuppressLint({"MissingPermission"})
public class LiveActivity extends BaseActivity {

    /* renamed from: i */
    public static final String f6538i = pj0.m61166a(-41552820934471L);

    /* renamed from: t */
    public static final int f6539t = 123;

    /* renamed from: u */
    public static final int f6540u = 15;

    /* renamed from: a */
    public final Location f6541a = new Location(pj0.m61166a(-38881351276359L));

    /* renamed from: a */
    public TextView f6542a;

    /* renamed from: a */
    public MapView f6543a;

    /* renamed from: a */
    public LatLng f6544a = null;

    /* renamed from: a */
    public jd1 f6545a;

    /* renamed from: a */
    public th1 f6546a;

    /* renamed from: a */
    public final z62 f6547a = new C1256a();

    /* renamed from: a */
    public ArrayList<AllRoutes> f6548a;

    /* renamed from: a */
    public final HashMap<String, od2> f6549a = new HashMap<>();

    /* renamed from: a */
    public List<AllStops> f6550a;

    /* renamed from: b */
    public Location f6551b;

    /* renamed from: b */
    public TextView f6552b;

    /* renamed from: b */
    public LatLng f6553b = null;

    /* renamed from: b */
    public ArrayList<AllStops> f6554b;

    /* renamed from: b */
    public final HashMap<String, String> f6555b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, String> f6556c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, Long> f6557d = new HashMap<>();

    /* renamed from: e */
    public String f6558e;

    /* renamed from: e */
    public HashMap<String, String> f6559e = new HashMap<>();

    /* renamed from: e */
    public boolean f6560e;

    /* renamed from: f */
    public String f6561f = pj0.m61166a(-38885646243655L);

    /* renamed from: f */
    public HashMap<String, String> f6562f = new HashMap<>();

    /* renamed from: f */
    public boolean f6563f;

    /* renamed from: g */
    public String f6564g;

    /* renamed from: g */
    public HashMap<String, String> f6565g = new HashMap<>();

    /* renamed from: h */
    public String f6566h;

    /* renamed from: o */
    public int f6567o = 0;

    /* renamed from: p */
    public int f6568p;

    /* renamed from: q */
    public int f6569q;

    /* renamed from: r */
    public int f6570r;

    /* renamed from: s */
    public int f6571s;

    /* renamed from: com.delhitransport.onedelhi.activities.LiveActivity$a */
    public class C1256a extends z62 {
        public C1256a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            LiveActivity.this.f6546a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 15.0f));
            LiveActivity.this.f6541a.setLatitude(M2.getLatitude());
            LiveActivity.this.f6541a.setLongitude(M2.getLongitude());
            LatLng unused = LiveActivity.this.f6553b = new LatLng(LiveActivity.this.f6551b.getLatitude(), LiveActivity.this.f6551b.getLongitude());
            LatLng unused2 = LiveActivity.this.f6544a = new LatLng(LiveActivity.this.f6551b.getLatitude(), LiveActivity.this.f6551b.getLongitude());
            LiveActivity.this.f6546a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(LiveActivity.this.f6541a.getLatitude(), LiveActivity.this.f6541a.getLongitude())).mo10680e(15.0f).mo10677b()));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.LiveActivity$b */
    public class C1257b implements Runnable {
        public C1257b() {
        }

        public void run() {
            LiveActivity liveActivity = LiveActivity.this;
            liveActivity.f6550a = DatabaseClient.getInstance(liveActivity).getAppDatabase().allStopsDao().getAllStops();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.LiveActivity$c */
    public class C1258c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Handler f6574a;

        public C1258c(Handler handler) {
            this.f6574a = handler;
        }

        public void run() {
            if (LiveActivity.this.f6563f) {
                LiveActivity liveActivity = LiveActivity.this;
                liveActivity.mo7721W1(1, liveActivity.f6544a.f7562a, LiveActivity.this.f6544a.f7563b);
                this.f6574a.postDelayed(this, 10000);
                return;
            }
            this.f6574a.removeCallbacks(this);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.LiveActivity$d */
    public class C1259d implements th1.C3608b {
        public C1259d() {
        }

        /* renamed from: b */
        public View mo7564b(od2 od2) {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0142  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo7565f(com.onedelhi.secure.od2 r8) {
            /*
                r7 = this;
                com.delhitransport.onedelhi.activities.LiveActivity r0 = com.delhitransport.onedelhi.activities.LiveActivity.this
                java.util.HashMap r0 = r0.f6565g
                java.lang.String r1 = r8.mo21871b()
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r1 = -38640833107783(0xffffdcdb3ade68b9, double:NaN)
                java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
                boolean r0 = r0.equalsIgnoreCase(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0179
                com.delhitransport.onedelhi.activities.LiveActivity r0 = com.delhitransport.onedelhi.activities.LiveActivity.this
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
                com.delhitransport.onedelhi.activities.LiveActivity r4 = com.delhitransport.onedelhi.activities.LiveActivity.this
                java.util.HashMap r4 = r4.f6562f
                java.lang.String r8 = r8.mo21871b()
                java.lang.Object r8 = r4.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                r2.setText(r8)
                com.delhitransport.onedelhi.activities.LiveActivity r2 = com.delhitransport.onedelhi.activities.LiveActivity.this
                java.util.HashMap r2 = r2.f6559e
                java.lang.Object r2 = r2.get(r8)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38658012976967(0xffffdcd73ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x0096
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38675192846151(0xffffdcd33ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38692372715335(0xffffdccf3ade68b9, double:NaN)
            L_0x008c:
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                java.lang.String r2 = r2.replace(r4, r5)
                goto L_0x012f
            L_0x0096:
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38696667682631(0xffffdcce3ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x00bc
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38722437486407(0xffffdcc83ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38748207290183(0xffffdcc23ade68b9, double:NaN)
                goto L_0x008c
            L_0x00bc:
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38752502257479(0xffffdcc13ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x00e2
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38765387159367(0xffffdcbe3ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38778272061255(0xffffdcbb3ade68b9, double:NaN)
                goto L_0x008c
            L_0x00e2:
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38782567028551(0xffffdcba3ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x0108
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38795451930439(0xffffdcb73ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38808336832327(0xffffdcb43ade68b9, double:NaN)
                goto L_0x008c
            L_0x0108:
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38812631799623(0xffffdcb33ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x012f
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38834106636103(0xffffdcae3ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38855581472583(0xffffdca93ade68b9, double:NaN)
                goto L_0x008c
            L_0x012f:
                java.lang.String r4 = r2.toUpperCase()
                r5 = -38859876439879(0xffffdca83ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x015c
                java.lang.String r2 = r2.toUpperCase()
                r4 = -38868466374471(0xffffdca63ade68b9, double:NaN)
                java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
                r5 = -38877056309063(0xffffdca43ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                java.lang.String r2 = r2.replace(r4, r5)
            L_0x015c:
                r1.setText(r2)
                com.delhitransport.onedelhi.activities.LiveActivity r1 = com.delhitransport.onedelhi.activities.LiveActivity.this
                java.util.HashMap r1 = r1.f6555b
                com.delhitransport.onedelhi.activities.LiveActivity r2 = com.delhitransport.onedelhi.activities.LiveActivity.this
                java.util.HashMap r2 = r2.f6559e
                java.lang.Object r8 = r2.get(r8)
                java.lang.Object r8 = r1.get(r8)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r3.setText(r8)
                return r0
            L_0x0179:
                com.delhitransport.onedelhi.activities.LiveActivity r0 = com.delhitransport.onedelhi.activities.LiveActivity.this
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                r2 = 2131558516(0x7f0d0074, float:1.874235E38)
                android.view.View r0 = r0.inflate(r2, r1)
                r1 = 2131362834(0x7f0a0412, float:1.834546E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2 = 2131362826(0x7f0a040a, float:1.8345444E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2 = 2131362840(0x7f0a0418, float:1.8345472E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r8 = r8.mo21877g()
                r1.setText(r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.LiveActivity.C1259d.mo7565f(com.onedelhi.secure.od2):android.view.View");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m8005X1(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null) {
            this.f6548a = allRouteResponse.getAll_routes();
            for (int i = 0; i < this.f6548a.size(); i++) {
                this.f6555b.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getEnd());
                this.f6556c.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getStart());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m8006Y1(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null) {
            this.f6548a = allRouteResponse.getAll_routes();
            for (int i = 0; i < this.f6548a.size(); i++) {
                this.f6555b.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getEnd());
                this.f6556c.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getStart());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m8007Z1(AllRouteResponse allRouteResponse) {
        if (allRouteResponse != null) {
            this.f6548a = allRouteResponse.getAll_routes();
            for (int i = 0; i < this.f6548a.size(); i++) {
                this.f6555b.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getEnd());
                this.f6556c.put(this.f6548a.get(i).getLongName(), this.f6548a.get(i).getStart());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m8008a2(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f6554b = allStopsResponse.getAll_stops();
            for (int i = 0; i < this.f6554b.size(); i++) {
                this.f6565g.put(this.f6546a.mo24962c(new sd2().mo24329e3(new LatLng(this.f6554b.get(i).getLat().doubleValue(), this.f6554b.get(i).getLng().doubleValue())).mo24324Z2(C3858wl.m30941d(Bitmap.createScaledBitmap(((BitmapDrawable) zk3.m33204g(getResources(), C1410R.C1411drawable.metro_statio, (Resources.Theme) null)).getBitmap(), this.f6568p, this.f6569q, false))).mo24332h3(this.f6554b.get(i).getName())).mo21871b(), pj0.m61166a(-41123324204871L));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m8009b2(AllStopsResponse allStopsResponse) {
        if (allStopsResponse != null) {
            this.f6554b = allStopsResponse.getAll_stops();
            for (int i = 0; i < this.f6554b.size(); i++) {
                od2 c = this.f6546a.mo24962c(new sd2().mo24329e3(new LatLng(this.f6554b.get(i).getLat().doubleValue(), this.f6554b.get(i).getLng().doubleValue())).mo24324Z2(C3858wl.m30941d(((BitmapDrawable) zk3.m33204g(getResources(), C1410R.C1411drawable.bus_stop, (Resources.Theme) null)).getBitmap())).mo24332h3(this.f6554b.get(i).getName()));
                this.f6565g.put(c.mo21871b(), pj0.m61166a(-41149094008647L));
                this.f6562f.put(c.mo21871b(), String.valueOf(this.f6554b.get(i).getId()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m8010c2(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f6551b = location;
            if (location != null) {
                this.f6546a.mo24990w(C3743ut.m29571e(new LatLng(this.f6551b.getLatitude(), this.f6551b.getLongitude()), 15.0f));
                this.f6541a.setLatitude(this.f6551b.getLatitude());
                this.f6541a.setLongitude(this.f6551b.getLongitude());
                this.f6553b = new LatLng(this.f6551b.getLatitude(), this.f6551b.getLongitude());
                this.f6544a = new LatLng(this.f6551b.getLatitude(), this.f6551b.getLongitude());
                this.f6546a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(this.f6541a.getLatitude(), this.f6541a.getLongitude())).mo10680e(15.0f).mo10677b()));
                if (this.f6567o == 0) {
                    mo7721W1(0, this.f6541a.getLatitude(), this.f6541a.getLongitude());
                    mo7716R1(Double.valueOf(this.f6541a.getLatitude()), Double.valueOf(this.f6541a.getLongitude()));
                    this.f6567o = 1;
                    return;
                }
                return;
            }
            mo7722q2();
            return;
        }
        Toast.makeText(this, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-40762546952007L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m8011d2(int i, List list) {
        long j;
        List list2 = list;
        if (list2 == null) {
            j = -40543503619911L;
        } else if (i != 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                LiveItem liveItem = (LiveItem) list2.get(i2);
                LatLng latLng = new LatLng(Double.parseDouble(liveItem.getLat()), Double.parseDouble(liveItem.getLon()));
                String id = liveItem.getId();
                this.f6558e = id;
                String str = this.f6559e.get(id);
                od2 od2 = this.f6549a.get(this.f6558e);
                if (od2 != null) {
                    if (str != null && !str.equalsIgnoreCase(liveItem.getRoute())) {
                        mo7724s2(liveItem.getId(), liveItem.getRoute(), od2, liveItem.getAgency(), liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-40470489175879L)), Long.valueOf(String.valueOf(liveItem.getTimestamp())));
                    }
                    od2.mo21892u(latLng);
                    od2.mo21896y(pj0.m61166a(-40483374077767L));
                    this.f6549a.put(this.f6558e, od2);
                    this.f6559e.put(this.f6558e, liveItem.getRoute());
                } else {
                    mo7709K1(Double.valueOf(Double.parseDouble(liveItem.getLat())), Double.valueOf(Double.parseDouble(liveItem.getLon())), liveItem.getId(), pj0.m61166a(-40487669045063L), liveItem.getAgency(), Boolean.valueOf(liveItem.getAc().equalsIgnoreCase(pj0.m61166a(-40504848914247L))), liveItem.getId(), String.valueOf(liveItem.getTimestamp()), pj0.m61166a(-40517733816135L), liveItem.getRoute());
                }
            }
            return;
        } else if (list.size() > 0) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                LiveItem liveItem2 = (LiveItem) list2.get(i3);
                mo7709K1(Double.valueOf(Double.parseDouble(liveItem2.getLat())), Double.valueOf(Double.parseDouble(liveItem2.getLon())), liveItem2.getId(), pj0.m61166a(-40195611268935L), liveItem2.getAgency(), Boolean.valueOf(liveItem2.getAc().equalsIgnoreCase(pj0.m61166a(-40212791138119L))), liveItem2.getId(), String.valueOf(liveItem2.getTimestamp()), pj0.m61166a(-40225676040007L), liveItem2.getRoute());
            }
            return;
        } else {
            j = -40251445843783L;
        }
        Toast.makeText(this, pj0.m61166a(j), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m8012e2() {
        if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-41527051130695L))) {
            double d = this.f6546a.mo24978k().f7555a.f7562a;
            double d2 = this.f6546a.mo24978k().f7555a.f7563b;
            Location location = new Location(pj0.m61166a(-41544230999879L));
            Location location2 = new Location(pj0.m61166a(-41548525967175L));
            location.setLatitude(d);
            location.setLongitude(d2);
            this.f6544a = new LatLng(d, d2);
            try {
                location2.setLatitude(this.f6553b.f7562a);
                location2.setLongitude(this.f6553b.f7563b);
            } catch (Exception e) {
                location2.setLatitude(d);
                location2.setLongitude(d2);
                e.printStackTrace();
            }
            if (mo7720V1(location2, location) > 2000.0f) {
                mo7711M1();
                mo7721W1(0, d, d2);
                mo7716R1(Double.valueOf(d), Double.valueOf(d2));
                this.f6553b = this.f6544a;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m8014f2(od2 od2) {
        Intent intent;
        if (this.f6565g.get(od2.mo21871b()).equalsIgnoreCase(pj0.m61166a(-41393907144519L))) {
            intent = new Intent(this, RouteInfoActivity.class);
            intent.putExtra(pj0.m61166a(-41411087013703L), this.f6559e.get(this.f6562f.get(od2.mo21871b())));
        } else if (this.f6565g.get(od2.mo21871b()).equalsIgnoreCase(pj0.m61166a(-41436856817479L))) {
            intent = new Intent(this, StopInfoActivity.class);
            intent.putExtra(pj0.m61166a(-41475511523143L), Integer.parseInt(this.f6562f.get(od2.mo21871b())));
            intent.putExtra(pj0.m61166a(-41509871261511L), this.f6541a);
        } else {
            return;
        }
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m8016g2(View view) {
        startActivity(new Intent(this, MetroMapActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ boolean m8018h2(od2 od2) {
        mo7712N1();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m8020i2(th1 th1) {
        this.f6546a = th1;
        mo7710L1();
        if (this.f6560e) {
            this.f6546a.mo24940I(true);
            this.f6546a.mo24985r().mo16113o(false);
            this.f6546a.mo24985r().mo16112n(false);
        }
        this.f6546a.mo24942K(new g52(this));
        this.f6546a.mo24949R(new h52(this));
        this.f6546a.mo24955X(new q42(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m8022j2(View view) {
        mo7718T1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m8024k2(View view) {
        startActivity(this.f6561f.equalsIgnoreCase(pj0.m61166a(-41376727275335L)) ? new Intent(this, RouteInfoActivity.class) : new Intent(this, MetroMapActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m8026l2(View view) {
        Intent intent;
        if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-41342367536967L))) {
            intent = new Intent(this, StopInfoActivity.class);
            intent.putExtra(pj0.m61166a(-41359547406151L), this.f6541a);
        } else {
            intent = new Intent(this, MetroTimingsActivity.class);
        }
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m8028m2(TextView textView, TextView textView2, FloatingActionButton floatingActionButton, View view) {
        textView.setText(getResources().getString(C1410R.string.bus_route));
        textView2.setText(getResources().getString(C1410R.string.bus_stop));
        this.f6561f = pj0.m61166a(-41325187667783L);
        this.f6563f = true;
        Location location = this.f6541a;
        if (location != null) {
            mo7721W1(0, location.getLatitude(), this.f6541a.getLongitude());
            mo7716R1(Double.valueOf(this.f6541a.getLatitude()), Double.valueOf(this.f6541a.getLongitude()));
        }
        mo7713O1();
        mo7717S1();
        floatingActionButton.setVisibility(4);
        this.f6552b.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.round_box_grey, (Resources.Theme) null));
        this.f6542a.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.round_box_red, (Resources.Theme) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m8030n2(TextView textView, TextView textView2, FloatingActionButton floatingActionButton, View view) {
        textView.setText(pj0.m61166a(-41187748714311L));
        textView2.setText(pj0.m61166a(-41239288321863L));
        this.f6561f = pj0.m61166a(-41299417864007L);
        this.f6563f = false;
        floatingActionButton.setVisibility(0);
        this.f6552b.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.round_box_red, (Resources.Theme) null));
        this.f6542a.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.round_box_grey, (Resources.Theme) null));
        mo7714P1();
        mo7715Q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m8032o2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m8034p2(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-40942935578439L)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7709K1(java.lang.Double r3, java.lang.Double r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r2 = this;
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            double r0 = r3.doubleValue()
            double r3 = r4.doubleValue()
            r10.<init>(r0, r3)
            r3 = -40071057217351(0xffffdb8e3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r3 = r6.equalsIgnoreCase(r3)
            r4 = 2131231022(0x7f08012e, float:1.8078113E38)
            r11 = 0
            if (r3 == 0) goto L_0x005c
            r0 = -40088237086535(0xffffdb8a3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0045
            boolean r3 = r8.booleanValue()
            if (r3 == 0) goto L_0x003d
            android.content.res.Resources r3 = r2.getResources()
            r7 = 2131230971(0x7f0800fb, float:1.807801E38)
            goto L_0x0063
        L_0x003d:
            android.content.res.Resources r3 = r2.getResources()
            r7 = 2131231060(0x7f080154, float:1.807819E38)
            goto L_0x0063
        L_0x0045:
            boolean r3 = r8.booleanValue()
            if (r3 == 0) goto L_0x0053
            android.content.res.Resources r3 = r2.getResources()
            r7 = 2131231074(0x7f080162, float:1.8078219E38)
            goto L_0x0063
        L_0x0053:
            android.content.res.Resources r3 = r2.getResources()
            android.graphics.drawable.Drawable r3 = com.onedelhi.secure.zk3.m33204g(r3, r4, r11)
            goto L_0x0067
        L_0x005c:
            android.content.res.Resources r3 = r2.getResources()
            r7 = 2131230889(0x7f0800a9, float:1.8077844E38)
        L_0x0063:
            android.graphics.drawable.Drawable r3 = com.onedelhi.secure.zk3.m33204g(r3, r7, r11)
        L_0x0067:
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            if (r3 == 0) goto L_0x00c3
            r7 = -40114006890311(0xffffdb843ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0083
            android.content.res.Resources r3 = r2.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r4)
            goto L_0x0090
        L_0x0083:
            android.graphics.Bitmap r3 = r3.getBitmap()
            int r4 = r2.f6568p
            int r7 = r2.f6569q
            r8 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r7, r8)
        L_0x0090:
            com.onedelhi.secure.sd2 r4 = new com.onedelhi.secure.sd2
            r4.<init>()
            com.onedelhi.secure.sd2 r4 = r4.mo24329e3(r10)
            com.onedelhi.secure.vl r3 = com.onedelhi.secure.C3858wl.m30941d(r3)
            com.onedelhi.secure.sd2 r3 = r4.mo24324Z2(r3)
            com.onedelhi.secure.th1 r4 = r2.f6546a
            com.onedelhi.secure.od2 r3 = r4.mo24962c(r3)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.od2> r4 = r2.f6549a
            r4.put(r5, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r2.f6559e
            r4.put(r9, r12)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r2.f6562f
            java.lang.String r5 = r3.mo21871b()
            r4.put(r5, r9)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r2.f6565g
            java.lang.String r3 = r3.mo21871b()
            r4.put(r3, r6)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.LiveActivity.mo7709K1(java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: L1 */
    public final void mo7710L1() {
        boolean z = r70.m26348a(this, pj0.m61166a(-39349502711623L)) == 0;
        this.f6560e = z;
        if (!z) {
            C3962y2.m31859G(this, new String[]{pj0.m61166a(-39521301403463L)}, 123);
        } else {
            mo7723r2();
        }
    }

    /* renamed from: M1 */
    public final void mo7711M1() {
        th1 th1 = this.f6546a;
        if (th1 != null) {
            th1.mo24976j();
        }
        this.f6549a.clear();
        this.f6559e.clear();
        this.f6562f.clear();
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: N1 */
    public final void mo7712N1() {
        this.f6546a.mo24933B(new C1259d());
    }

    /* renamed from: O1 */
    public final void mo7713O1() {
        bu2 bu2;
        LiveData<AllRouteResponse> liveData;
        mo7711M1();
        this.f6556c.clear();
        this.f6555b.clear();
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        GenericRequest genericRequest = new GenericRequest(this.f6564g, this.f6566h);
        int i = this.f6570r;
        int i2 = this.f6571s;
        if (i != i2) {
            liveData = dataViewModel.getAllRouteLiveDataDIMTS(genericRequest, true, this, i2);
            bu2 = new s42(this);
        } else {
            liveData = dataViewModel.getAllRouteLiveDataDIMTS(genericRequest, false, this, i2);
            bu2 = new t42(this);
        }
        liveData.mo4926j(this, bu2);
    }

    /* renamed from: P1 */
    public final void mo7714P1() {
        mo7711M1();
        this.f6556c.clear();
        this.f6555b.clear();
        ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getAllRouteLiveDataDMRC().mo4926j(this, new r42(this));
    }

    /* renamed from: Q1 */
    public final void mo7715Q1() {
        mo7711M1();
        this.f6556c.clear();
        this.f6555b.clear();
        ((DataViewModel) new C0709m(this).mo5027a(DataViewModel.class)).getAllStopsLiveDataDMRC().mo4926j(this, new u42(this));
    }

    /* renamed from: R1 */
    public final void mo7716R1(Double d, Double d2) {
        NearByStopsRequest nearByStopsRequest = new NearByStopsRequest(this.f6564g, d, d2, this.f6566h);
        DataViewModel dataViewModel = (DataViewModel) new C0709m(this).mo5027a(DataViewModel.class);
        this.f6550a = new ArrayList();
        new Thread(new C1257b()).start();
        int i = 0;
        while (this.f6550a.isEmpty() && i < 12) {
            try {
                Thread.sleep(90);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
        if (!this.f6550a.isEmpty()) {
            for (int i2 = 0; i2 < this.f6550a.size(); i2++) {
                if (mo7719U1(d.doubleValue(), d2.doubleValue(), this.f6550a.get(i2).getLat().doubleValue(), this.f6550a.get(i2).getLng().doubleValue()) < 1000.0f) {
                    try {
                        od2 c = this.f6546a.mo24962c(new sd2().mo24329e3(new LatLng(this.f6550a.get(i2).getLat().doubleValue(), this.f6550a.get(i2).getLng().doubleValue())).mo24324Z2(C3858wl.m30941d(((BitmapDrawable) zk3.m33204g(getResources(), C1410R.C1411drawable.bus_stop, (Resources.Theme) null)).getBitmap())).mo24332h3(this.f6550a.get(i2).getName()));
                        this.f6565g.put(c.mo21871b(), pj0.m61166a(-39302258071367L));
                        this.f6562f.put(c.mo21871b(), String.valueOf(this.f6550a.get(i2).getId()));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            return;
        }
        dataViewModel.getNearByStopsDIMTS(nearByStopsRequest, true, getApplicationContext()).mo4926j(this, new v42(this));
    }

    /* renamed from: S1 */
    public final void mo7717S1() {
        Handler handler = new Handler();
        handler.postDelayed(new C1258c(handler), 10000);
    }

    /* renamed from: T1 */
    public final void mo7718T1() {
        this.f6545a.mo18272U().mo17573e(new x42(this));
    }

    /* renamed from: U1 */
    public final float mo7719U1(double d, double d2, double d3, double d4) {
        Location location = new Location(pj0.m61166a(-39340912777031L));
        location.setLatitude(d);
        location.setLongitude(d2);
        Location location2 = new Location(pj0.m61166a(-39345207744327L));
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        return location.distanceTo(location2);
    }

    /* renamed from: V1 */
    public final float mo7720V1(Location location, Location location2) {
        return location.distanceTo(location2);
    }

    /* renamed from: W1 */
    public final void mo7721W1(int i, double d, double d2) {
        new LiveViewModel().get_nearby_bus(new LiveRequest(d, d2)).mo4926j(this, new w42(this, i));
    }

    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_live);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-38889941210951L), 0);
        this.f6564g = sharedPreferences.getString(pj0.m61166a(-38975840556871L), pj0.m61166a(-39018790229831L));
        this.f6566h = sharedPreferences.getString(pj0.m61166a(-39023085197127L), pj0.m61166a(-39070329837383L));
        this.f6570r = sharedPreferences.getInt(pj0.m61166a(-39074624804679L), 0);
        this.f6571s = sharedPreferences.getInt(pj0.m61166a(-39134754346823L), 0);
        this.f6543a = (MapView) findViewById(C1410R.C1412id.mapView);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C1410R.C1412id.fab_curLocation);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(C1410R.C1412id.fab_metroMap);
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_bus_route_info);
        TextView textView2 = (TextView) findViewById(C1410R.C1412id.tv_bus_stop_info);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6542a = (TextView) findViewById(C1410R.C1412id.tv_bus);
        this.f6552b = (TextView) findViewById(C1410R.C1412id.tv_metro);
        this.f6543a.mo10627b(bundle);
        this.f6543a.mo10626a(new y42(this));
        if (bundle != null) {
            this.f6551b = (Location) bundle.getParcelable(pj0.m61166a(-39224948660039L));
        }
        this.f6567o = 0;
        this.f6569q = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f6568p = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.f6545a = b82.m11676a(this);
        floatingActionButton.setOnClickListener(new a52(this));
        textView.setOnClickListener(new b52(this));
        textView2.setOnClickListener(new z42(this));
        if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-39263603365703L))) {
            this.f6561f = pj0.m61166a(-39267898332999L);
        }
        if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-39285078202183L))) {
            mo7717S1();
            mo7713O1();
            floatingActionButton2.setVisibility(4);
        } else {
            mo7714P1();
            mo7715Q1();
            floatingActionButton2.setVisibility(0);
        }
        this.f6542a.setOnClickListener(new e52(this, textView, textView2, floatingActionButton2));
        this.f6552b.setOnClickListener(new f52(this, textView, textView2, floatingActionButton2));
        imageView.setOnClickListener(new c52(this));
        floatingActionButton2.setOnClickListener(new d52(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6543a.mo10628c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f6543a.mo10631f();
    }

    public void onPause() {
        this.f6563f = false;
        this.f6549a.clear();
        th1 th1 = this.f6546a;
        if (th1 != null) {
            th1.mo24976j();
        }
        super.onPause();
        this.f6543a.mo10632g();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-39693100095303L))) {
                    if (iArr[i2] >= 0) {
                        z = true;
                    } else {
                        Toast.makeText(this, pj0.m61166a(-39864898787143L), 0).show();
                    }
                }
            }
            if (z) {
                mo7723r2();
            }
        }
    }

    public void onResume() {
        TextView textView;
        super.onResume();
        this.f6563f = true;
        if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-40131186759495L))) {
            this.f6561f = pj0.m61166a(-40135481726791L);
        }
        Location location = this.f6541a;
        if (location == null || location.getLongitude() == 0.0d || !this.f6561f.equalsIgnoreCase(pj0.m61166a(-40152661595975L))) {
            if (this.f6561f.equalsIgnoreCase(pj0.m61166a(-40169841465159L))) {
                textView = this.f6552b;
            }
            this.f6543a.mo10633h();
        }
        textView = this.f6542a;
        textView.callOnClick();
        this.f6543a.mo10633h();
    }

    /* renamed from: q2 */
    public final void mo7722q2() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 a = b82.m11676a(this);
        this.f6545a = a;
        z62 z62 = this.f6547a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        a.mo18262A(locationRequest, z62, myLooper);
    }

    /* renamed from: r2 */
    public final void mo7723r2() {
        boolean z;
        boolean z2 = false;
        if (this.f6560e) {
            this.f6546a.mo24940I(true);
            this.f6546a.mo24985r().mo16113o(false);
            this.f6546a.mo24985r().mo16112n(false);
        }
        LocationManager locationManager = (LocationManager) getSystemService(pj0.m61166a(-39980862904135L));
        try {
            z = locationManager.isProviderEnabled(pj0.m61166a(-40019517609799L));
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(pj0.m61166a(-40036697478983L));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z && !z2) {
            new C0189c.C0190a(this).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new p42(this)).mo959s(getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
        }
        if ((z || z2) && this.f6560e) {
            mo7718T1();
        }
    }

    /* renamed from: s2 */
    public final void mo7724s2(String str, String str2, od2 od2, String str3, boolean z, Long l) {
        this.f6559e.put(str, str2);
    }
}
