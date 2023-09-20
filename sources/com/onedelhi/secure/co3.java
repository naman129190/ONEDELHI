package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.directions.Routes_list_item;
import com.google.android.gms.common.C1410R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"SimpleDateFormat"})
public class co3 extends RecyclerView.C0805h<C1920a> {

    /* renamed from: a */
    public static final int f10441a = 800;

    /* renamed from: a */
    public final Handler f10442a = new Handler();

    /* renamed from: a */
    public final C1921b f10443a;

    /* renamed from: a */
    public final SimpleDateFormat f10444a = new SimpleDateFormat(pj0.m61166a(-85503221274439L));

    /* renamed from: a */
    public final List<Routes_list_item> f10445a;

    /* renamed from: a */
    public final Map<Integer, Runnable> f10446a = new HashMap();

    /* renamed from: a */
    public final Set<Integer> f10447a = new HashSet();

    /* renamed from: b */
    public final boolean f10448b;

    /* renamed from: com.onedelhi.secure.co3$a */
    public static class C1920a extends RecyclerView.C0803f0 implements View.OnClickListener {

        /* renamed from: a */
        public ImageView f10449a;

        /* renamed from: a */
        public final LinearLayout f10450a;

        /* renamed from: a */
        public final RelativeLayout f10451a;

        /* renamed from: a */
        public final TextView f10452a;

        /* renamed from: a */
        public final C1921b f10453a;

        /* renamed from: b */
        public final View f10454b;

        /* renamed from: b */
        public final TextView f10455b;

        /* renamed from: c */
        public final TextView f10456c;

        /* renamed from: d */
        public final TextView f10457d;

        /* renamed from: e */
        public final TextView f10458e;

        /* renamed from: f */
        public final TextView f10459f;

        public C1920a(View view, C1921b bVar) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C1410R.C1412id.route_icons_layout);
            this.f10450a = linearLayout;
            this.f10452a = (TextView) view.findViewById(C1410R.C1412id.textTimeRange);
            this.f10449a = (ImageView) view.findViewById(C1410R.C1412id.iv_new);
            this.f10455b = (TextView) view.findViewById(C1410R.C1412id.tv_boarding_stop);
            this.f10454b = view.findViewById(C1410R.C1412id.view_1);
            this.f10451a = (RelativeLayout) view.findViewById(C1410R.C1412id.rl_about_trip);
            this.f10456c = (TextView) view.findViewById(C1410R.C1412id.textStatus);
            this.f10457d = (TextView) view.findViewById(C1410R.C1412id.textFare);
            this.f10458e = (TextView) view.findViewById(C1410R.C1412id.textAboutRoute);
            this.f10459f = (TextView) view.findViewById(C1410R.C1412id.tv_bus_details);
            this.f10453a = bVar;
            view.setOnClickListener(this);
            if (bVar != null) {
                linearLayout.setOnClickListener(new bo3(this, bVar));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public /* synthetic */ void m12678b0(C1921b bVar, View view) {
            bVar.mo14314d(mo5681k());
        }

        public void onClick(View view) {
            C1921b bVar = this.f10453a;
            if (bVar != null) {
                bVar.mo14314d(mo5681k());
            }
        }
    }

    /* renamed from: com.onedelhi.secure.co3$b */
    public interface C1921b {
        /* renamed from: d */
        void mo14314d(int i);
    }

    public co3(List<Routes_list_item> list, C1921b bVar, boolean z) {
        this.f10443a = bVar;
        this.f10445a = list;
        this.f10448b = z;
    }

    /* renamed from: J */
    public final void mo14309J(ImageView imageView) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        alphaAnimation.setStartOffset(20);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(-1);
        imageView.startAnimation(alphaAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0466 A[SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5728x(@com.onedelhi.secure.mr2 com.onedelhi.secure.co3.C1920a r23, int r24) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            android.widget.LinearLayout r0 = r23.f10450a
            r0.removeAllViews()
            android.view.View r0 = r2.f4609a
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r5 = 1
            r6 = 1103101952(0x41c00000, float:24.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r6, r0)
            int r6 = (int) r0
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r7 = 1090519040(0x41000000, float:8.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r7, r0)
            int r7 = (int) r0
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r8 = 1097859072(0x41700000, float:15.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r8, r0)
            int r8 = (int) r0
            java.util.List<com.delhitransport.onedelhi.models.directions.Routes_list_item> r0 = r1.f10445a
            java.lang.Object r0 = r0.get(r3)
            r9 = r0
            com.delhitransport.onedelhi.models.directions.Routes_list_item r9 = (com.delhitransport.onedelhi.models.directions.Routes_list_item) r9
            java.util.ArrayList r10 = r9.getModeList()
            java.util.ArrayList r11 = r9.getRouteList()
            r9.getResponse_type()
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            r13 = -85533286045511(0xffffb2353ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r13)
            r12.<init>(r0)
            r15 = 0
            r16 = 0
        L_0x0066:
            int r0 = r10.size()
            if (r15 >= r0) goto L_0x0472
            java.lang.Object r0 = r10.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            r17 = -85571940751175(0xffffb22c3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r17)
            boolean r0 = r0.equalsIgnoreCase(r5)
            r5 = 60
            if (r0 == 0) goto L_0x0130
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r4)
            android.widget.ImageView r14 = new android.widget.ImageView
            r14.<init>(r4)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r5, r5)
            r14.setLayoutParams(r13)
            com.onedelhi.secure.fj3 r5 = com.bumptech.glide.C1173a.m7523E(r4)
            android.content.res.Resources r13 = r4.getResources()
            r19 = r12
            r12 = 2131231096(0x7f080178, float:1.8078263E38)
            r20 = r9
            r9 = 0
            android.graphics.drawable.Drawable r12 = com.onedelhi.secure.zk3.m33204g(r13, r12, r9)
            com.onedelhi.secure.ti3 r5 = r5.mo16010t(r12)
            r5.mo25101k1(r14)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            java.util.List<com.delhitransport.onedelhi.models.directions.Routes_list_item> r9 = r1.f10445a
            java.lang.Object r9 = r9.get(r3)
            com.delhitransport.onedelhi.models.directions.Routes_list_item r9 = (com.delhitransport.onedelhi.models.directions.Routes_list_item) r9
            java.util.ArrayList r9 = r9.getColorList()
            java.lang.Object r9 = r9.get(r15)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = android.graphics.Color.parseColor(r9)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.<init>(r9, r12)
            r14.setColorFilter(r5)
            r0.addView(r14)
            int r5 = r7 / 2
            r9 = 0
            r0.setPadding(r9, r5, r9, r5)
            android.widget.RelativeLayout$LayoutParams r12 = new android.widget.RelativeLayout$LayoutParams
            r13 = -2
            r12.<init>(r13, r13)
            r12.leftMargin = r5
            r0.setLayoutParams(r12)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r4)
            r13 = 20
            r5.setPadding(r8, r13, r9, r9)
            r9 = 1093664768(0x41300000, float:11.0)
            r13 = 2
            r5.setTextSize(r13, r9)
            java.util.List<com.delhitransport.onedelhi.models.directions.Routes_list_item> r9 = r1.f10445a
            java.lang.Object r9 = r9.get(r3)
            com.delhitransport.onedelhi.models.directions.Routes_list_item r9 = (com.delhitransport.onedelhi.models.directions.Routes_list_item) r9
            java.util.ArrayList r9 = r9.getTripTimeList()
            java.lang.Object r9 = r9.get(r15)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r5.setText(r9)
            android.view.View r9 = r2.f4609a
            android.content.res.Resources r9 = r9.getResources()
            r13 = 2131099686(0x7f060026, float:1.7811732E38)
            int r9 = r9.getColor(r13)
            r5.setTextColor(r9)
            r5.setLayoutParams(r12)
            r0.addView(r5)
            android.widget.LinearLayout r5 = r23.f10450a
            r5.addView(r0)
            r21 = r8
            r8 = r19
            r14 = 1
            r19 = r7
            r7 = 0
            goto L_0x0407
        L_0x0130:
            r20 = r9
            r19 = r12
            java.lang.Object r0 = r10.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            r12 = -85593415587655(0xffffb2273ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r0 = r0.equalsIgnoreCase(r9)
            r12 = 2131231192(0x7f0801d8, float:1.8078458E38)
            if (r0 == 0) goto L_0x02cc
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r4)
            android.graphics.drawable.Drawable r12 = com.onedelhi.secure.C3129p8.m24529b(r4, r12)
            android.graphics.drawable.Drawable r12 = com.onedelhi.secure.wo0.m30989r(r12)
            java.util.List<com.delhitransport.onedelhi.models.directions.Routes_list_item> r13 = r1.f10445a
            java.lang.Object r13 = r13.get(r3)
            com.delhitransport.onedelhi.models.directions.Routes_list_item r13 = (com.delhitransport.onedelhi.models.directions.Routes_list_item) r13
            java.util.ArrayList r13 = r13.getColorList()
            java.lang.Object r13 = r13.get(r15)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = android.graphics.Color.parseColor(r13)
            com.onedelhi.secure.wo0.m30985n(r12, r13)
            r0.setBackground(r12)
            int r12 = r7 / 2
            r0.setPadding(r7, r12, r7, r12)
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
            r9 = -2
            r13.<init>(r9, r9)
            r13.leftMargin = r12
            r0.setLayoutParams(r13)
            android.widget.ImageView r9 = new android.widget.ImageView
            r9.<init>(r4)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r5, r5)
            r9.setLayoutParams(r13)
            com.onedelhi.secure.fj3 r5 = com.bumptech.glide.C1173a.m7523E(r4)
            android.content.res.Resources r13 = r4.getResources()
            r14 = 2131230975(0x7f0800ff, float:1.8078018E38)
            r21 = r8
            r8 = 0
            android.graphics.drawable.Drawable r13 = com.onedelhi.secure.zk3.m33204g(r13, r14, r8)
            com.onedelhi.secure.ti3 r5 = r5.mo16010t(r13)
            r5.mo25101k1(r9)
            r5 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r8 = com.onedelhi.secure.r70.m26353f(r4, r5)
            r9.setColorFilter(r8)
            r0.addView(r9)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r4)
            r8 = 2
            r9 = 0
            r5.setPadding(r12, r8, r9, r9)
            r9 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r8, r9)
            java.lang.Object r8 = r11.get(r15)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r5.setText(r8)
            android.view.View r8 = r2.f4609a
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131099686(0x7f060026, float:1.7811732E38)
            int r8 = r8.getColor(r9)
            r5.setTextColor(r8)
            android.content.res.Resources r8 = r4.getResources()
            r9 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r8 = r8.getColor(r9)
            r5.setTextColor(r8)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r8.leftMargin = r6
            r5.setLayoutParams(r8)
            r0.addView(r5)
            android.widget.LinearLayout r5 = r23.f10450a
            r5.addView(r0)
            java.lang.String r0 = r20.getStatus()
            r8 = -85610595456839(0xffffb2233ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r8)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x021c
            r8 = -85640660227911(0xffffb21c3ade68b9, double:NaN)
            goto L_0x0221
        L_0x021c:
            r8 = -85683609900871(0xffffb2123ade68b9, double:NaN)
        L_0x0221:
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r8)
            r8 = -85705084737351(0xffffb20d3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r8)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0244
            android.widget.ImageView r0 = r23.f10449a
            r5 = 0
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r23.f10449a
            r1.mo14309J(r0)
            goto L_0x024d
        L_0x0244:
            android.widget.ImageView r0 = r23.f10449a
            r5 = 8
            r0.setVisibility(r5)
        L_0x024d:
            r8 = -85726559573831(0xffffb2083ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r8)
            java.lang.String r0 = r20.getDeparture_time()     // Catch:{ ParseException -> 0x0263 }
            r8 = r19
            java.util.Date r16 = r8.parse(r0)     // Catch:{ ParseException -> 0x0261 }
            goto L_0x0269
        L_0x0261:
            r0 = move-exception
            goto L_0x0266
        L_0x0263:
            r0 = move-exception
            r8 = r19
        L_0x0266:
            r0.printStackTrace()
        L_0x0269:
            r0 = r16
            if (r0 == 0) goto L_0x0273
            java.text.SimpleDateFormat r5 = r1.f10444a
            java.lang.String r5 = r5.format(r0)
        L_0x0273:
            android.widget.TextView r9 = r23.f10459f     // Catch:{ Exception -> 0x0294 }
            android.content.res.Resources r12 = r4.getResources()     // Catch:{ Exception -> 0x0294 }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0294 }
            r13 = 0
            r14[r13] = r5     // Catch:{ Exception -> 0x0294 }
            java.lang.String r5 = r20.getStart_stop()     // Catch:{ Exception -> 0x0294 }
            r13 = 1
            r14[r13] = r5     // Catch:{ Exception -> 0x0294 }
            r5 = 2131951865(0x7f1300f9, float:1.9540157E38)
            java.lang.String r12 = r12.getString(r5, r14)     // Catch:{ Exception -> 0x0294 }
            r9.setText(r12)     // Catch:{ Exception -> 0x0294 }
            r14 = 0
            goto L_0x02bd
        L_0x0294:
            android.widget.TextView r5 = r23.f10459f
            android.content.res.Resources r9 = r4.getResources()
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = -85730854541127(0xffffb2073ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r13)
            r14 = 0
            r12[r14] = r13
            java.lang.String r13 = r20.getStart_stop()
            r16 = 1
            r12[r16] = r13
            r13 = 2131951865(0x7f1300f9, float:1.9540157E38)
            java.lang.String r9 = r9.getString(r13, r12)
            r5.setText(r9)
        L_0x02bd:
            android.widget.TextView r5 = r23.f10459f
            r5.setVisibility(r14)
            r16 = r0
        L_0x02c6:
            r19 = r7
            r7 = 0
            r14 = 1
            goto L_0x0407
        L_0x02cc:
            r21 = r8
            r8 = r19
            java.lang.Object r0 = r10.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            r13 = -85735149508423(0xffffb2063ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r13)
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x02c6
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r4)
            android.graphics.drawable.Drawable r9 = com.onedelhi.secure.C3129p8.m24529b(r4, r12)
            android.graphics.drawable.Drawable r9 = com.onedelhi.secure.wo0.m30989r(r9)
            java.util.List<com.delhitransport.onedelhi.models.directions.Routes_list_item> r12 = r1.f10445a
            java.lang.Object r12 = r12.get(r3)
            com.delhitransport.onedelhi.models.directions.Routes_list_item r12 = (com.delhitransport.onedelhi.models.directions.Routes_list_item) r12
            java.util.ArrayList r12 = r12.getColorList()
            java.lang.Object r12 = r12.get(r15)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = android.graphics.Color.parseColor(r12)
            com.onedelhi.secure.wo0.m30985n(r9, r12)
            r0.setBackground(r9)
            int r9 = r7 / 2
            r0.setPadding(r7, r9, r7, r9)
            android.widget.RelativeLayout$LayoutParams r12 = new android.widget.RelativeLayout$LayoutParams
            r13 = -2
            r12.<init>(r13, r13)
            r12.leftMargin = r9
            r0.setLayoutParams(r12)
            android.widget.ImageView r12 = new android.widget.ImageView
            r12.<init>(r4)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r5, r5)
            r12.setLayoutParams(r13)
            com.onedelhi.secure.fj3 r5 = com.bumptech.glide.C1173a.m7523E(r4)
            android.content.res.Resources r13 = r4.getResources()
            r14 = 2131231048(0x7f080148, float:1.8078166E38)
            r19 = r7
            r7 = 0
            android.graphics.drawable.Drawable r13 = com.onedelhi.secure.zk3.m33204g(r13, r14, r7)
            com.onedelhi.secure.ti3 r5 = r5.mo16010t(r13)
            r5.mo25101k1(r12)
            r5 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r13 = com.onedelhi.secure.r70.m26353f(r4, r5)
            r12.setColorFilter(r13)
            r0.addView(r12)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r4)
            r12 = 0
            r5.setPadding(r9, r12, r12, r12)
            r9 = 1096810496(0x41600000, float:14.0)
            r12 = 2
            r5.setTextSize(r12, r9)
            java.lang.Object r9 = r11.get(r15)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r5.setText(r9)
            android.view.View r9 = r2.f4609a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131099686(0x7f060026, float:1.7811732E38)
            int r9 = r9.getColor(r12)
            r5.setTextColor(r9)
            android.content.res.Resources r9 = r4.getResources()
            r12 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r9 = r9.getColor(r12)
            r5.setTextColor(r9)
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r12 = -2
            r9.<init>(r12, r12)
            r9.leftMargin = r6
            r5.setLayoutParams(r9)
            r0.addView(r5)
            android.widget.LinearLayout r5 = r23.f10450a
            r5.addView(r0)
            r12 = -85760919312199(0xffffb2003ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r12)
            java.lang.String r0 = r20.getDeparture_time()     // Catch:{ ParseException -> 0x03ae }
            java.util.Date r16 = r8.parse(r0)     // Catch:{ ParseException -> 0x03ae }
            goto L_0x03b2
        L_0x03ae:
            r0 = move-exception
            r0.printStackTrace()
        L_0x03b2:
            r0 = r16
            if (r0 == 0) goto L_0x03bc
            java.text.SimpleDateFormat r5 = r1.f10444a
            java.lang.String r5 = r5.format(r0)
        L_0x03bc:
            android.widget.TextView r9 = r23.f10459f     // Catch:{ Exception -> 0x03dd }
            android.content.res.Resources r12 = r4.getResources()     // Catch:{ Exception -> 0x03dd }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x03dd }
            r13 = 0
            r14[r13] = r5     // Catch:{ Exception -> 0x03dd }
            java.lang.String r5 = r20.getStart_stop()     // Catch:{ Exception -> 0x03dd }
            r13 = 1
            r14[r13] = r5     // Catch:{ Exception -> 0x03dd }
            r5 = 2131951865(0x7f1300f9, float:1.9540157E38)
            java.lang.String r12 = r12.getString(r5, r14)     // Catch:{ Exception -> 0x03dd }
            r9.setText(r12)     // Catch:{ Exception -> 0x03dd }
            r14 = 1
            goto L_0x0405
        L_0x03dd:
            android.widget.TextView r5 = r23.f10459f
            android.content.res.Resources r9 = r4.getResources()
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = -85765214279495(0xffffb1ff3ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r13)
            r14 = 0
            r12[r14] = r13
            java.lang.String r13 = r20.getStart_stop()
            r14 = 1
            r12[r14] = r13
            r13 = 2131951865(0x7f1300f9, float:1.9540157E38)
            java.lang.String r9 = r9.getString(r13, r12)
            r5.setText(r9)
        L_0x0405:
            r16 = r0
        L_0x0407:
            int r0 = r10.size()
            int r0 = r0 - r14
            if (r15 == r0) goto L_0x0466
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r9 = 30
            r5.<init>(r9, r9)
            r9 = 17
            r5.gravity = r9
            r0.setLayoutParams(r5)
            r9 = 1082130432(0x40800000, float:4.0)
            android.content.res.Resources r12 = r4.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            r13 = 1
            float r9 = android.util.TypedValue.applyDimension(r13, r9, r12)
            int r9 = (int) r9
            r5.leftMargin = r9
            r5 = 2131231080(0x7f080168, float:1.807823E38)
            android.graphics.drawable.Drawable r5 = com.onedelhi.secure.C3129p8.m24529b(r4, r5)
            android.graphics.drawable.Drawable r5 = com.onedelhi.secure.wo0.m30989r(r5)
            r12 = -85769509246791(0xffffb1fe3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r12)
            int r9 = android.graphics.Color.parseColor(r9)
            com.onedelhi.secure.wo0.m30985n(r5, r9)
            com.onedelhi.secure.fj3 r9 = com.bumptech.glide.C1173a.m7523E(r4)
            com.onedelhi.secure.ti3 r5 = r9.mo16010t(r5)
            com.onedelhi.secure.tj r5 = r5.mo25128B()
            com.onedelhi.secure.ti3 r5 = (com.onedelhi.secure.ti3) r5
            r5.mo25101k1(r0)
            android.widget.LinearLayout r5 = r23.f10450a
            r5.addView(r0)
        L_0x0466:
            int r15 = r15 + 1
            r12 = r8
            r7 = r19
            r9 = r20
            r8 = r21
            r5 = 1
            goto L_0x0066
        L_0x0472:
            r20 = r9
            boolean r0 = r1.f10448b
            if (r0 != 0) goto L_0x04c6
            if (r3 != 0) goto L_0x04a2
            android.widget.TextView r0 = r23.f10458e
            android.view.View r3 = r2.f4609a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131952065(0x7f1301c1, float:1.9540562E38)
            java.lang.CharSequence r3 = r3.getText(r4)
            r0.setText(r3)
            android.view.View r0 = r23.f10454b
            r3 = 8
            r0.setVisibility(r3)
            android.widget.RelativeLayout r0 = r23.f10451a
            r4 = 0
        L_0x049c:
            r0.setVisibility(r4)
            r3 = 8
            goto L_0x04cf
        L_0x04a2:
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x04bf
            android.widget.TextView r0 = r23.f10458e
            android.view.View r3 = r2.f4609a
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131952013(0x7f13018d, float:1.9540457E38)
            java.lang.CharSequence r3 = r3.getText(r5)
            r0.setText(r3)
            android.widget.RelativeLayout r0 = r23.f10451a
            goto L_0x049c
        L_0x04bf:
            android.widget.RelativeLayout r0 = r23.f10451a
            r3 = 8
            goto L_0x04cc
        L_0x04c6:
            r3 = 8
            android.widget.RelativeLayout r0 = r23.f10451a
        L_0x04cc:
            r0.setVisibility(r3)
        L_0x04cf:
            android.widget.TextView r0 = r23.f10452a
            java.lang.String r4 = r20.getTripTime()
            r0.setText(r4)
            android.widget.TextView r0 = r23.f10456c
            java.lang.String r4 = r20.getStatus()
            r0.setText(r4)
            android.widget.TextView r0 = r23.f10457d
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.co3.mo5728x(com.onedelhi.secure.co3$a, int):void");
    }

    @mr2
    /* renamed from: L */
    public C1920a mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1920a(LayoutInflater.from(viewGroup.getContext()).inflate(C1410R.layout.route_card2, viewGroup, false), this.f10443a);
    }

    /* renamed from: M */
    public void mo5702E(@mr2 C1920a aVar) {
        super.mo5702E(aVar);
        this.f10447a.remove(Integer.valueOf(aVar.mo5681k()));
        aVar.f10449a.setVisibility(0);
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f10445a.size();
    }
}
