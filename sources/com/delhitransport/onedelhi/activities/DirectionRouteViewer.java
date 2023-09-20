package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.LiveBusData;
import com.delhitransport.onedelhi.models.directions.DirectionResponse;
import com.delhitransport.onedelhi.models.directions.PolyPoints;
import com.delhitransport.onedelhi.models.directions.RecyclerViewItem;
import com.delhitransport.onedelhi.models.directions.Routes;
import com.delhitransport.onedelhi.models.directions.Routes_list_item;
import com.delhitransport.onedelhi.models.directions.Stop;
import com.delhitransport.onedelhi.viewmodels.LiveViewModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3743ut;
import com.onedelhi.secure.C3798vl;
import com.onedelhi.secure.C3858wl;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.ag1;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.cd0;
import com.onedelhi.secure.fg1;
import com.onedelhi.secure.g33;
import com.onedelhi.secure.h03;
import com.onedelhi.secure.hl0;
import com.onedelhi.secure.hn3;
import com.onedelhi.secure.il0;
import com.onedelhi.secure.io1;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.jl0;
import com.onedelhi.secure.kl0;
import com.onedelhi.secure.ll0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu2;
import com.onedelhi.secure.od2;
import com.onedelhi.secure.pd1;
import com.onedelhi.secure.px0;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sd2;
import com.onedelhi.secure.th1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.z62;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DirectionRouteViewer extends BaseActivity {

    /* renamed from: l */
    public static final String f6156l = "location";

    /* renamed from: s */
    public static final int f6157s = 15;

    /* renamed from: a */
    public Location f6158a;

    /* renamed from: a */
    public ExpandableListView f6159a;

    /* renamed from: a */
    public RecyclerView f6160a;

    /* renamed from: a */
    public DirectionResponse f6161a;

    /* renamed from: a */
    public MapView f6162a;

    /* renamed from: a */
    public LatLng f6163a = new LatLng(0.0d, 0.0d);

    /* renamed from: a */
    public LatLngBounds.C1442a f6164a = new LatLngBounds.C1442a();

    /* renamed from: a */
    public BottomSheetBehavior f6165a;

    /* renamed from: a */
    public jd1 f6166a;

    /* renamed from: a */
    public th1 f6167a;

    /* renamed from: a */
    public final z62 f6168a = new C1212e();

    /* renamed from: a */
    public ArrayList<Double> f6169a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, String> f6170a = new HashMap<>();

    /* renamed from: a */
    public List<LatLng> f6171a;

    /* renamed from: b */
    public final Location f6172b = new Location("gps");

    /* renamed from: b */
    public LatLng f6173b = new LatLng(0.0d, 0.0d);

    /* renamed from: b */
    public ArrayList<Double> f6174b = new ArrayList<>();

    /* renamed from: b */
    public HashMap<RecyclerViewItem, List<Stop>> f6175b = new HashMap<>();

    /* renamed from: c */
    public LatLng f6176c = null;

    /* renamed from: c */
    public final ArrayList<Routes_list_item> f6177c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<String> f6178d = new ArrayList<>();

    /* renamed from: e */
    public String f6179e;

    /* renamed from: e */
    public final ArrayList<String> f6180e = new ArrayList<>();

    /* renamed from: e */
    public boolean f6181e = true;

    /* renamed from: f */
    public String f6182f;

    /* renamed from: f */
    public final ArrayList<String> f6183f = new ArrayList<>();

    /* renamed from: f */
    public final boolean f6184f = false;

    /* renamed from: g */
    public String f6185g;

    /* renamed from: g */
    public final ArrayList<String> f6186g = new ArrayList<>();

    /* renamed from: h */
    public String f6187h = "";

    /* renamed from: h */
    public final ArrayList<String> f6188h = new ArrayList<>();

    /* renamed from: i */
    public String f6189i = "";

    /* renamed from: i */
    public final ArrayList<String> f6190i = new ArrayList<>();

    /* renamed from: j */
    public String f6191j = "";

    /* renamed from: j */
    public final ArrayList<String> f6192j = new ArrayList<>();

    /* renamed from: k */
    public String f6193k = "";

    /* renamed from: k */
    public final ArrayList<String> f6194k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<Stop> f6195l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<RecyclerViewItem> f6196m = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<HashMap<RecyclerViewItem, List<Stop>>> f6197n = new ArrayList<>();

    /* renamed from: o */
    public int f6198o;

    /* renamed from: o */
    public final ArrayList<ArrayList<RecyclerViewItem>> f6199o = new ArrayList<>();

    /* renamed from: p */
    public int f6200p;

    /* renamed from: p */
    public final ArrayList<Stop> f6201p = new ArrayList<>();

    /* renamed from: q */
    public int f6202q;

    /* renamed from: q */
    public ArrayList<PolyPoints> f6203q = new ArrayList<>();

    /* renamed from: r */
    public int f6204r = 0;

    /* renamed from: r */
    public final ArrayList<LatLng> f6205r = new ArrayList<>();

    /* renamed from: s */
    public final ArrayList<String> f6206s = new ArrayList<>();

    /* renamed from: com.delhitransport.onedelhi.activities.DirectionRouteViewer$a */
    public class C1208a extends BottomSheetBehavior.C1503f {
        public C1208a() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            if (i == 4) {
                DirectionRouteViewer.this.f6159a.smoothScrollToPosition(0, 0);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.DirectionRouteViewer$b */
    public class C1209b extends BottomSheetBehavior.C1503f {
        public C1209b() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            if (5 == i) {
                DirectionRouteViewer.this.f6165a.mo11242Y0(4);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.DirectionRouteViewer$c */
    public class C1210c implements th1.C3608b {
        public C1210c() {
        }

        /* renamed from: b */
        public View mo7564b(od2 od2) {
            View inflate = DirectionRouteViewer.this.getLayoutInflater().inflate(C1410R.layout.marker_info_metro, (ViewGroup) null);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_available)).setVisibility(8);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_stop_name)).setText((CharSequence) DirectionRouteViewer.this.f6170a.get(od2.mo21871b()));
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_starting_stop_1)).setVisibility(8);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_terminal_stop_1)).setVisibility(8);
            return inflate;
        }

        /* renamed from: f */
        public View mo7565f(od2 od2) {
            return null;
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.DirectionRouteViewer$d */
    public class C1211d implements nu2<Location> {
        public C1211d() {
        }

        public void onComplete(@mr2 w94<Location> w94) {
            if (w94.mo17590v()) {
                Location unused = DirectionRouteViewer.this.f6158a = w94.mo17586r();
                if (DirectionRouteViewer.this.f6158a != null) {
                    DirectionRouteViewer.this.f6167a.mo24990w(C3743ut.m29571e(new LatLng(DirectionRouteViewer.this.f6158a.getLatitude(), DirectionRouteViewer.this.f6158a.getLongitude()), 15.0f));
                    DirectionRouteViewer.this.f6172b.setLatitude(DirectionRouteViewer.this.f6158a.getLatitude());
                    DirectionRouteViewer.this.f6172b.setLongitude(DirectionRouteViewer.this.f6158a.getLongitude());
                    DirectionRouteViewer.this.f6167a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(DirectionRouteViewer.this.f6172b.getLatitude(), DirectionRouteViewer.this.f6172b.getLongitude())).mo10680e(15.0f).mo10677b()));
                    return;
                }
                DirectionRouteViewer.this.mo7554K1();
                return;
            }
            DirectionRouteViewer directionRouteViewer = DirectionRouteViewer.this;
            Toast.makeText(directionRouteViewer, directionRouteViewer.getResources().getString(C1410R.string.turn_on_location), 0).show();
            DirectionRouteViewer.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.DirectionRouteViewer$e */
    public class C1212e extends z62 {
        public C1212e() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            DirectionRouteViewer.this.f6167a.mo24990w(C3743ut.m29571e(new LatLng(M2.getLatitude(), M2.getLongitude()), 15.0f));
            DirectionRouteViewer.this.f6172b.setLatitude(M2.getLatitude());
            DirectionRouteViewer.this.f6172b.setLongitude(M2.getLongitude());
            DirectionRouteViewer.this.f6167a.mo24970g(C3743ut.m29567a(new CameraPosition.C1441a().mo10678c(new LatLng(DirectionRouteViewer.this.f6172b.getLatitude(), DirectionRouteViewer.this.f6172b.getLongitude())).mo10680e(15.0f).mo10677b()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ void m7692D1(String[] strArr, String str, LiveBusData liveBusData) {
        StringBuilder sb;
        if (liveBusData == null) {
            sb = new StringBuilder();
        } else if (liveBusData.getMsg().equalsIgnoreCase("success")) {
            this.f6176c = new LatLng(Double.parseDouble(liveBusData.getLiveItem().getLat()), Double.parseDouble(liveBusData.getLiveItem().getLon()));
            Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) - liveBusData.getLiveItem().getTimestamp().longValue());
            try {
                strArr[0] = str + "\n" + mo7555L1(valueOf) + "ago";
            } catch (Exception e) {
                e.printStackTrace();
            }
            Bitmap a = ag1.m11151a(this, liveBusData.getLiveItem().getRoute(), liveBusData.getLiveItem().getAgency(), Boolean.valueOf(Boolean.getBoolean(liveBusData.getLiveItem().getAc())), "bus", this.f6189i);
            sd2 sd2 = new sd2();
            sd2.mo24329e3(new LatLng(Double.parseDouble(liveBusData.getLiveItem().getLat()), Double.parseDouble(liveBusData.getLiveItem().getLon()))).mo24324Z2(C3858wl.m30941d(a));
            mo7559x1(new LatLng(Double.parseDouble(liveBusData.getLiveItem().getLat()), Double.parseDouble(liveBusData.getLiveItem().getLon())), this.f6173b, this.f6176c);
            this.f6170a.put(this.f6167a.mo24962c(sd2).mo21871b(), strArr[0]);
            return;
        } else {
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append(" location not available at this moment.");
        Toast.makeText(this, sb.toString(), 0).show();
        mo7559x1(this.f6163a, this.f6173b, this.f6176c);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ void m7693E1() {
        mo7558v1(this.f6203q, this.f6185g);
        if (this.f6189i.equals("")) {
            mo7559x1(this.f6163a, this.f6173b, this.f6176c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ boolean m7694F1(od2 od2) {
        mo7561z1();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ void m7695G1(th1 th1) {
        this.f6167a = th1;
        mo7560y1();
        mo7557u1(this.f6203q);
        if (this.f6181e) {
            this.f6167a.mo24940I(true);
            this.f6167a.mo24985r().mo16113o(false);
            this.f6167a.mo24985r().mo16112n(false);
        }
        new Handler().postDelayed(new ll0(this), 200);
        this.f6167a.mo24955X(new il0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ void m7696H1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public /* synthetic */ void m7697I1(List list, Routes routes, int i) {
        mo7556t1(list, routes.getRoute().get(i).getColor());
    }

    /* renamed from: w1 */
    public static C3798vl m7712w1(Context context, int i, String str) {
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

    @SuppressLint({"MissingPermission"})
    /* renamed from: A1 */
    public final void mo7550A1() {
        if (this.f6181e) {
            this.f6166a.mo18272U().mo17573e(new C1211d());
        }
    }

    /* renamed from: B1 */
    public final Bitmap mo7551B1(String str, String str2, String str3, boolean z, float f, String str4) {
        io1 io1 = new io1(this);
        io1.mo38184l(((LayoutInflater) getSystemService("layout_inflater")).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        if (!str2.equalsIgnoreCase("bus")) {
            return null;
        }
        io1.mo38180h(C3129p8.m24529b(this, str3.equalsIgnoreCase("DTC") ? z ? C1410R.C1411drawable.bus_marker_red : C1410R.C1411drawable.bus_marker_green : z ? C1410R.C1411drawable.bus_marker_blue : C1410R.C1411drawable.bus_marker_orange));
        if (str4.contains("DL51GD")) {
            io1.mo38180h(C3129p8.m24529b(this, C1410R.C1411drawable.bus_marker_light_blue));
        }
        String a = fg1.m14893a(str);
        io1.mo38187o(C1410R.style.iconGenText);
        io1.mo38182j(0, 0, 0, 0);
        return io1.mo38178f(a);
    }

    /* renamed from: C1 */
    public final void mo7552C1(String str) {
        new LiveViewModel().get_bus_data(str).mo4926j(this, new jl0(this, new String[]{str}, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0348 A[LOOP:2: B:59:0x0342->B:61:0x0348, LOOP_END] */
    /* renamed from: J1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7553J1() {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.f6198o
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f6175b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6196m = r2
            com.delhitransport.onedelhi.models.directions.DirectionResponse r2 = r1.f6161a
            java.lang.String r8 = r2.getResponse_type()
            com.delhitransport.onedelhi.models.directions.DirectionResponse r2 = r1.f6161a
            java.util.List r2 = r2.getDirections()
            java.lang.Object r2 = r2.get(r0)
            com.delhitransport.onedelhi.models.directions.Direction r2 = (com.delhitransport.onedelhi.models.directions.Direction) r2
            com.delhitransport.onedelhi.models.directions.Routes r2 = r2.getRoutes()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.res.Resources r4 = r26.getResources()
            r5 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r4 = r4.getString(r5)
            r3.append(r4)
            com.delhitransport.onedelhi.models.directions.DirectionResponse r4 = r1.f6161a
            java.util.List r4 = r4.getDirections()
            java.lang.Object r4 = r4.get(r0)
            com.delhitransport.onedelhi.models.directions.Direction r4 = (com.delhitransport.onedelhi.models.directions.Direction) r4
            java.lang.String r4 = r4.getFare()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.delhitransport.onedelhi.models.directions.DirectionResponse r4 = r1.f6161a
            java.util.List r4 = r4.getDirections()
            java.lang.Object r4 = r4.get(r0)
            com.delhitransport.onedelhi.models.directions.Direction r4 = (com.delhitransport.onedelhi.models.directions.Direction) r4
            int r4 = r4.getTrip_time()
            r5 = 2131951919(0x7f13012f, float:1.9540266E38)
            r6 = 60
            java.lang.String r7 = " "
            if (r4 < r6) goto L_0x008f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r9 = r4 / 60
            r6.append(r9)
            r6.append(r7)
            android.content.res.Resources r9 = r26.getResources()
            r10 = 2131951855(0x7f1300ef, float:1.9540136E38)
            java.lang.String r9 = r9.getString(r10)
            r6.append(r9)
            r6.append(r7)
            int r9 = r4 % 60
            r6.append(r9)
            goto L_0x0097
        L_0x008f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
        L_0x0097:
            r6.append(r7)
            android.content.res.Resources r7 = r26.getResources()
            java.lang.String r5 = r7.getString(r5)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = ""
            if (r4 != 0) goto L_0x00af
            r4 = r6
            goto L_0x00b0
        L_0x00af:
            r4 = r5
        L_0x00b0:
            java.lang.String r5 = "0"
            com.delhitransport.onedelhi.models.directions.DirectionResponse r7 = r1.f6161a
            java.util.List r7 = r7.getDirections()
            java.lang.Object r0 = r7.get(r0)
            com.delhitransport.onedelhi.models.directions.Direction r0 = (com.delhitransport.onedelhi.models.directions.Direction) r0
            java.lang.String r7 = r0.getReach_by()
            r15 = 0
            r14 = 0
        L_0x00c4:
            java.util.List r0 = r2.getRoute()
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x03a2
            java.util.List r0 = r2.getRoute()
            java.lang.Object r0 = r0.get(r14)
            r21 = r0
            com.delhitransport.onedelhi.models.directions.TripRoute r21 = (com.delhitransport.onedelhi.models.directions.TripRoute) r21
            r9 = 1
            if (r14 != 0) goto L_0x0109
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            java.util.ArrayList r10 = r21.getStops()
            java.lang.Object r10 = r10.get(r15)
            com.delhitransport.onedelhi.models.directions.Stop r10 = (com.delhitransport.onedelhi.models.directions.Stop) r10
            java.lang.Double r10 = r10.getLat()
            double r10 = r10.doubleValue()
            java.util.ArrayList r12 = r21.getStops()
            java.lang.Object r12 = r12.get(r15)
            com.delhitransport.onedelhi.models.directions.Stop r12 = (com.delhitransport.onedelhi.models.directions.Stop) r12
            java.lang.Double r12 = r12.getLon()
            double r12 = r12.doubleValue()
            r0.<init>(r10, r12)
            r1.f6163a = r0
            goto L_0x0151
        L_0x0109:
            java.util.List r0 = r2.getRoute()
            int r0 = r0.size()
            int r0 = r0 - r9
            if (r14 != r0) goto L_0x0151
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            java.util.ArrayList r10 = r21.getStops()
            java.util.ArrayList r11 = r21.getStops()
            int r11 = r11.size()
            int r11 = r11 - r9
            java.lang.Object r10 = r10.get(r11)
            com.delhitransport.onedelhi.models.directions.Stop r10 = (com.delhitransport.onedelhi.models.directions.Stop) r10
            java.lang.Double r10 = r10.getLat()
            double r10 = r10.doubleValue()
            java.util.ArrayList r12 = r21.getStops()
            java.util.ArrayList r13 = r21.getStops()
            int r13 = r13.size()
            int r13 = r13 - r9
            java.lang.Object r12 = r12.get(r13)
            com.delhitransport.onedelhi.models.directions.Stop r12 = (com.delhitransport.onedelhi.models.directions.Stop) r12
            java.lang.Double r12 = r12.getLon()
            double r12 = r12.doubleValue()
            r0.<init>(r10, r12)
            r1.f6173b = r0
        L_0x0151:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r10 = r2.getRoute()
            java.lang.Object r10 = r10.get(r14)
            com.delhitransport.onedelhi.models.directions.TripRoute r10 = (com.delhitransport.onedelhi.models.directions.TripRoute) r10
            java.lang.Integer r10 = r10.getTrip_time()
            r0.append(r10)
            java.lang.String r10 = " min"
            r0.append(r10)
            java.lang.String r20 = r0.toString()
            java.util.ArrayList r10 = r21.getRoutes()
            java.lang.String r12 = r21.getLongName()
            java.util.ArrayList<java.lang.String> r0 = r1.f6186g
            java.lang.String r11 = r21.getColor()
            r0.add(r11)
            java.util.ArrayList<java.lang.String> r0 = r1.f6188h
            java.util.List r11 = r2.getRoute()
            java.lang.Object r11 = r11.get(r14)
            com.delhitransport.onedelhi.models.directions.TripRoute r11 = (com.delhitransport.onedelhi.models.directions.TripRoute) r11
            java.lang.Integer r11 = r11.getTrip_time()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.add(r11)
            java.util.ArrayList<java.lang.String> r0 = r1.f6190i
            java.lang.String r11 = r21.getColor()
            r0.add(r11)
            java.util.ArrayList<java.lang.String> r0 = r1.f6192j
            java.lang.String r11 = r21.getVehicle_id()
            r0.add(r11)
            java.util.ArrayList<java.lang.String> r0 = r1.f6178d
            float r11 = r21.getFare()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.add(r11)
            java.util.ArrayList<java.lang.String> r0 = r1.f6194k
            java.lang.String r11 = r1.f6185g
            r0.add(r11)
            java.lang.String r18 = r21.getColor()
            java.util.ArrayList r0 = r21.getStops()
            java.lang.Object r0 = r0.get(r15)
            com.delhitransport.onedelhi.models.directions.Stop r0 = (com.delhitransport.onedelhi.models.directions.Stop) r0
            java.lang.String r11 = r0.getName()
            java.util.ArrayList r0 = r21.getStops()
            java.util.ArrayList r13 = r21.getStops()
            int r13 = r13.size()
            int r13 = r13 - r9
            java.lang.Object r0 = r0.get(r13)
            com.delhitransport.onedelhi.models.directions.Stop r0 = (com.delhitransport.onedelhi.models.directions.Stop) r0
            java.lang.String r13 = r0.getName()
            java.util.List r0 = r2.getRoute()
            java.lang.Object r0 = r0.get(r14)
            com.delhitransport.onedelhi.models.directions.TripRoute r0 = (com.delhitransport.onedelhi.models.directions.TripRoute) r0
            java.lang.String r0 = r0.getType()
            java.lang.String r9 = "walk"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0238
            java.util.List r0 = r2.getRoute()     // Catch:{ Exception -> 0x022d }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ Exception -> 0x022d }
            com.delhitransport.onedelhi.models.directions.TripRoute r0 = (com.delhitransport.onedelhi.models.directions.TripRoute) r0     // Catch:{ Exception -> 0x022d }
            java.lang.String r0 = r0.getPolyline()     // Catch:{ Exception -> 0x022d }
            java.util.List r0 = com.onedelhi.secure.c33.m40677b(r0)     // Catch:{ Exception -> 0x022d }
            android.os.Handler r15 = new android.os.Handler     // Catch:{ Exception -> 0x022d }
            r15.<init>()     // Catch:{ Exception -> 0x022d }
            r22 = r8
            com.onedelhi.secure.ml0 r8 = new com.onedelhi.secure.ml0     // Catch:{ Exception -> 0x0227 }
            r8.<init>(r1, r0, r2, r14)     // Catch:{ Exception -> 0x0227 }
            r23 = r3
            r24 = r4
            r3 = 200(0xc8, double:9.9E-322)
            r15.postDelayed(r8, r3)     // Catch:{ Exception -> 0x0225 }
            goto L_0x023e
        L_0x0225:
            r0 = move-exception
            goto L_0x0234
        L_0x0227:
            r0 = move-exception
            r23 = r3
            r24 = r4
            goto L_0x0234
        L_0x022d:
            r0 = move-exception
            r23 = r3
            r24 = r4
            r22 = r8
        L_0x0234:
            r0.printStackTrace()
            goto L_0x023e
        L_0x0238:
            r23 = r3
            r24 = r4
            r22 = r8
        L_0x023e:
            r3 = 0
            java.lang.Object r0 = r10.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = r1.f6189i
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0264
            java.lang.String r0 = r21.getVehicle_id()
            r1.f6189i = r0
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0264
            java.lang.String r0 = r1.f6189i
            r1.mo7552C1(r0)
        L_0x0264:
            java.util.ArrayList r0 = r21.getStops()
            r1.f6195l = r0
            r3 = 0
            goto L_0x0296
        L_0x026c:
            java.util.List r0 = r2.getRoute()
            int r0 = r0.size()
            r3 = 1
            int r0 = r0 - r3
            r3 = 0
            if (r14 != r0) goto L_0x028f
            java.lang.Object r0 = r10.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x028f
            java.util.ArrayList r0 = r21.getStops()
            r1.f6195l = r0
            r0.remove(r3)
            goto L_0x0296
        L_0x028f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6195l = r0
        L_0x0296:
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.Stop> r0 = r1.f6201p
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.Stop> r4 = r1.f6195l
            r0.addAll(r4)
            java.util.List r0 = r2.getRoute()
            int r0 = r0.size()
            r4 = 1
            int r0 = r0 - r4
            if (r14 != r0) goto L_0x02b9
            java.util.List r0 = r2.getRoute()
            java.lang.Object r0 = r0.get(r14)
            com.delhitransport.onedelhi.models.directions.TripRoute r0 = (com.delhitransport.onedelhi.models.directions.TripRoute) r0
            java.lang.String r0 = r0.getRoute()
            r1.f6187h = r0
        L_0x02b9:
            java.lang.String r0 = r21.getVehicle_id()
            r1.f6191j = r0
            java.util.ArrayList<java.lang.String> r0 = r1.f6180e
            java.lang.String r4 = r21.getType()
            r0.add(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = 0
        L_0x02ce:
            int r8 = r10.size()
            if (r4 >= r8) goto L_0x02f1
            java.lang.Object r8 = r10.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = com.onedelhi.secure.fg1.m14893a(r8)
            r0.append(r8)
            int r8 = r10.size()
            r9 = 1
            int r8 = r8 - r9
            if (r4 == r8) goto L_0x02ee
            java.lang.String r8 = " / "
            r0.append(r8)
        L_0x02ee:
            int r4 = r4 + 1
            goto L_0x02ce
        L_0x02f1:
            java.util.ArrayList<java.lang.String> r4 = r1.f6183f
            java.lang.String r8 = r0.toString()
            r4.add(r8)
            r4 = 1
            com.delhitransport.onedelhi.models.directions.RecyclerViewItem[] r4 = new com.delhitransport.onedelhi.models.directions.RecyclerViewItem[r4]
            com.delhitransport.onedelhi.models.directions.RecyclerViewItem r8 = new com.delhitransport.onedelhi.models.directions.RecyclerViewItem
            java.lang.String r0 = r0.toString()
            java.lang.String r15 = r1.f6191j
            java.lang.String r19 = r21.getDeparture_time()
            r9 = r8
            r10 = r11
            r11 = r13
            r13 = r0
            r3 = r14
            r14 = r5
            r0 = r15
            r25 = 0
            r15 = r23
            r16 = r24
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4[r25] = r8
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.RecyclerViewItem> r0 = r1.f6196m
            r8 = r4[r25]
            r0.add(r8)
            java.util.List r0 = r2.getRoute()
            java.lang.Object r0 = r0.get(r3)
            com.delhitransport.onedelhi.models.directions.TripRoute r0 = (com.delhitransport.onedelhi.models.directions.TripRoute) r0
            java.lang.String r0 = r0.getType()
            java.util.ArrayList<com.google.android.gms.maps.model.LatLng> r8 = r1.f6205r
            r8.clear()
            java.util.ArrayList<java.lang.String> r8 = r1.f6206s
            r8.clear()
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.Stop> r8 = r1.f6195l
            java.util.Iterator r8 = r8.iterator()
        L_0x0342:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0372
            java.lang.Object r9 = r8.next()
            com.delhitransport.onedelhi.models.directions.Stop r9 = (com.delhitransport.onedelhi.models.directions.Stop) r9
            java.util.ArrayList<com.google.android.gms.maps.model.LatLng> r10 = r1.f6205r
            com.google.android.gms.maps.model.LatLng r11 = new com.google.android.gms.maps.model.LatLng
            java.lang.Double r12 = r9.getLat()
            double r12 = r12.doubleValue()
            java.lang.Double r14 = r9.getLon()
            double r14 = r14.doubleValue()
            r11.<init>(r12, r14)
            r10.add(r11)
            java.util.ArrayList<java.lang.String> r10 = r1.f6206s
            java.lang.String r9 = r9.getName()
            r10.add(r9)
            goto L_0x0342
        L_0x0372:
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.PolyPoints> r8 = r1.f6203q
            com.delhitransport.onedelhi.models.directions.PolyPoints r9 = new com.delhitransport.onedelhi.models.directions.PolyPoints
            java.lang.String r10 = r21.getColor()
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList<com.google.android.gms.maps.model.LatLng> r12 = r1.f6205r
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r13 = r1.f6206s
            r12.<init>(r13)
            r9.<init>(r10, r11, r12, r0)
            r8.add(r9)
            java.util.HashMap<com.delhitransport.onedelhi.models.directions.RecyclerViewItem, java.util.List<com.delhitransport.onedelhi.models.directions.Stop>> r0 = r1.f6175b
            r4 = r4[r25]
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.Stop> r8 = r1.f6195l
            r0.put(r4, r8)
            int r14 = r3 + 1
            r8 = r22
            r3 = r23
            r4 = r24
            r15 = 0
            goto L_0x00c4
        L_0x03a2:
            r24 = r4
            r22 = r8
            java.util.ArrayList<java.util.ArrayList<com.delhitransport.onedelhi.models.directions.RecyclerViewItem>> r0 = r1.f6199o
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.RecyclerViewItem> r2 = r1.f6196m
            r0.add(r2)
            java.util.ArrayList<java.util.HashMap<com.delhitransport.onedelhi.models.directions.RecyclerViewItem, java.util.List<com.delhitransport.onedelhi.models.directions.Stop>>> r0 = r1.f6197n
            java.util.HashMap<com.delhitransport.onedelhi.models.directions.RecyclerViewItem, java.util.List<com.delhitransport.onedelhi.models.directions.Stop>> r2 = r1.f6175b
            r0.add(r2)
            com.delhitransport.onedelhi.models.directions.Routes_list_item r0 = new com.delhitransport.onedelhi.models.directions.Routes_list_item
            java.util.ArrayList<java.lang.String> r9 = r1.f6178d
            java.util.ArrayList<java.lang.String> r10 = r1.f6192j
            java.util.ArrayList<java.lang.String> r11 = r1.f6180e
            java.util.ArrayList<java.lang.String> r12 = r1.f6183f
            java.util.ArrayList<java.lang.String> r13 = r1.f6186g
            java.util.ArrayList<java.lang.String> r14 = r1.f6188h
            java.lang.String r6 = ""
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.ArrayList<com.delhitransport.onedelhi.models.directions.Routes_list_item> r2 = r1.f6177c
            r2.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.DirectionRouteViewer.mo7553J1():void");
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: K1 */
    public final void mo7554K1() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 a = b82.m11676a(this);
        this.f6166a = a;
        try {
            a.mo18262A(locationRequest, this.f6168a, Looper.myLooper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: L1 */
    public final String mo7555L1(Long l) {
        StringBuilder sb;
        String str;
        if (l.longValue() <= 60) {
            sb = new StringBuilder();
            sb.append(l);
            str = " second";
        } else if (l.longValue() > 3600) {
            return "";
        } else {
            sb = new StringBuilder();
            sb.append(TimeUnit.SECONDS.toMinutes(l.longValue()));
            str = " minute";
        }
        sb.append(str);
        return sb.toString();
    }

    public void onBackPressed() {
        if (this.f6165a.mo11277v0() == 3) {
            this.f6165a.mo11242Y0(4);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_direction_route_viewer);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_destination);
        TextView textView2 = (TextView) findViewById(C1410R.C1412id.tv_source);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(C1410R.C1412id.lvExp);
        this.f6159a = expandableListView;
        expandableListView.setGroupIndicator((Drawable) null);
        this.f6159a.setDividerHeight(0);
        BottomSheetBehavior i0 = BottomSheetBehavior.m9579i0((RelativeLayout) findViewById(C1410R.C1412id.bottom_sheet));
        this.f6165a = i0;
        i0.mo11236U0(500);
        this.f6165a.mo11242Y0(5);
        this.f6165a.mo11240X0(true);
        this.f6165a.mo11241Y(new C1208a());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6198o = extras.getInt("selected_position", 0);
            this.f6161a = (DirectionResponse) extras.get("directionResponse");
            this.f6179e = extras.getString("source_name", "");
            this.f6182f = extras.getString("destination_name", "");
            this.f6200p = extras.getInt("destination_stop_id", -1);
            this.f6202q = extras.getInt("source_stop_id", -1);
            this.f6169a = (ArrayList) extras.get("destination_stop_loc");
            this.f6174b = (ArrayList) extras.get("nearest_stop_loc");
            this.f6185g = extras.getString("request_type", "bus");
        } else {
            this.f6198o = 0;
            this.f6161a = null;
            this.f6179e = "";
            this.f6182f = "";
            this.f6200p = -1;
            this.f6202q = -1;
            this.f6169a = new ArrayList<>();
            this.f6174b = new ArrayList<>();
            this.f6185g = "bus";
        }
        if (this.f6179e.isEmpty()) {
            this.f6179e = "My Location";
        }
        if (this.f6182f.isEmpty()) {
            this.f6182f = "My Location";
        }
        this.f6171a = new ArrayList();
        MapView mapView = (MapView) findViewById(C1410R.C1412id.mapView);
        this.f6162a = mapView;
        mapView.mo10627b(bundle);
        this.f6162a.mo10633h();
        this.f6162a.mo10626a(new kl0(this));
        if (bundle != null) {
            this.f6158a = (Location) bundle.getParcelable("location");
        }
        this.f6166a = b82.m11676a(this);
        mo7550A1();
        int i = getResources().getDisplayMetrics().heightPixels;
        if (this.f6161a != null) {
            mo7553J1();
            try {
                this.f6159a.setAdapter(new px0(this, this.f6199o.get(0), this.f6197n.get(0), this.f6194k));
                this.f6159a.expandGroup(this.f6197n.get(0).size() - 1);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "some error occurred", 0).show();
                onBackPressed();
            }
        }
        this.f6165a.mo11241Y(new C1209b());
        textView.setText(this.f6182f);
        textView2.setText(this.f6179e);
        imageView.setOnClickListener(new hl0(this));
    }

    /* renamed from: t1 */
    public final void mo7556t1(List<LatLng> list, String str) {
        g33 g33 = new g33();
        g33.mo16295R2(Color.parseColor(str));
        g33.mo16313j3(10.0f);
        g33.mo16310g3(Arrays.asList(new h03[]{new cd0(30.0f), new pd1(20.0f)}));
        g33.mo16311h3(new hn3());
        g33.mo16296S2(new hn3());
        g33.mo16290M2(list);
        th1 th1 = this.f6167a;
        if (th1 != null) {
            th1.mo24966e(g33);
        }
    }

    /* renamed from: u1 */
    public final void mo7557u1(ArrayList<PolyPoints> arrayList) {
        th1 th1 = this.f6167a;
        if (th1 != null) {
            th1.mo24976j();
            Iterator<PolyPoints> it = arrayList.iterator();
            while (it.hasNext()) {
                PolyPoints next = it.next();
                g33 g33 = new g33();
                g33.mo16295R2(Color.parseColor(next.getColor()));
                g33.mo16313j3(12.0f);
                g33.mo16290M2(next.getPoints());
                this.f6167a.mo24966e(g33);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC] */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7558v1(java.util.ArrayList<com.delhitransport.onedelhi.models.directions.PolyPoints> r6, java.lang.String r7) {
        /*
            r5 = this;
            com.google.android.gms.maps.model.LatLngBounds$a r7 = new com.google.android.gms.maps.model.LatLngBounds$a
            r7.<init>()
            r5.f6164a = r7
            com.onedelhi.secure.th1 r7 = r5.f6167a
            if (r7 == 0) goto L_0x00b5
            java.util.Iterator r6 = r6.iterator()
        L_0x000f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r7 = r6.next()
            com.delhitransport.onedelhi.models.directions.PolyPoints r7 = (com.delhitransport.onedelhi.models.directions.PolyPoints) r7
            r0 = 0
        L_0x001c:
            java.util.ArrayList r1 = r7.getPoints()
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x000f
            java.lang.String r1 = r7.getType()
            java.lang.String r2 = "bus"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0036
            r1 = 2131230983(0x7f080107, float:1.8078034E38)
            goto L_0x0039
        L_0x0036:
            r1 = 2131231048(0x7f080148, float:1.8078166E38)
        L_0x0039:
            r2 = 2131231087(0x7f08016f, float:1.8078245E38)
            if (r0 != 0) goto L_0x004a
            r1 = 2131231084(0x7f08016c, float:1.807824E38)
        L_0x0041:
            java.lang.String r3 = r7.getColor()
            com.onedelhi.secure.vl r1 = m7712w1(r5, r1, r3)
            goto L_0x005e
        L_0x004a:
            java.util.ArrayList r3 = r7.getPoints()
            int r3 = r3.size()
            int r3 = r3 + -1
            if (r0 != r3) goto L_0x0041
            java.lang.String r1 = r7.getColor()
            com.onedelhi.secure.vl r1 = m7712w1(r5, r2, r1)
        L_0x005e:
            java.util.ArrayList r3 = r7.getPoints()
            int r3 = r3.size()
            int r3 = r3 + -1
            if (r0 != r3) goto L_0x0072
            java.lang.String r1 = r7.getColor()
            com.onedelhi.secure.vl r1 = m7712w1(r5, r2, r1)
        L_0x0072:
            com.onedelhi.secure.sd2 r2 = new com.onedelhi.secure.sd2
            r2.<init>()
            java.util.ArrayList r3 = r7.getPoints()
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            com.onedelhi.secure.sd2 r2 = r2.mo24329e3(r3)
            com.onedelhi.secure.sd2 r1 = r2.mo24324Z2(r1)
            com.onedelhi.secure.th1 r2 = r5.f6167a
            com.onedelhi.secure.od2 r1 = r2.mo24962c(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r5.f6170a
            java.lang.String r3 = r1.mo21871b()
            java.util.ArrayList r4 = r7.getData()
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r2.put(r3, r4)
            com.google.android.gms.maps.model.LatLngBounds$a r2 = r5.f6164a
            com.google.android.gms.maps.model.LatLng r1 = r1.mo21872c()
            r2.mo10694b(r1)
            int r1 = r5.f6204r
            int r1 = r1 + 1
            r5.f6204r = r1
            int r0 = r0 + 1
            goto L_0x001c
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.DirectionRouteViewer.mo7558v1(java.util.ArrayList, java.lang.String):void");
    }

    /* renamed from: x1 */
    public final void mo7559x1(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        try {
            if (!(latLng.f7562a == 0.0d && latLng.f7563b == 0.0d)) {
                this.f6164a.mo10694b(latLng);
            }
            if (!(latLng2.f7562a == 0.0d && latLng2.f7563b == 0.0d)) {
                this.f6164a.mo10694b(latLng2);
            }
            if (latLng3 != null) {
                this.f6164a.mo10694b(latLng3);
            }
            LatLngBounds a = this.f6164a.mo10693a();
            int i = getResources().getDisplayMetrics().widthPixels;
            this.f6167a.mo24970g(C3743ut.m29570d(a, i, getResources().getDisplayMetrics().heightPixels, (int) (((double) i) * 0.2d)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y1 */
    public final void mo7560y1() {
        boolean z = r70.m26348a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
        this.f6181e = z;
        if (!z) {
            C3962y2.m31859G(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 123);
        }
    }

    /* renamed from: z1 */
    public final void mo7561z1() {
        this.f6167a.mo24933B(new C1210c());
    }
}
