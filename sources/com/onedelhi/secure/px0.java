package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.delhitransport.onedelhi.models.directions.RecyclerViewItem;
import com.delhitransport.onedelhi.models.directions.Stop;
import com.google.android.gms.common.C1410R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class px0 extends BaseExpandableListAdapter {

    /* renamed from: a */
    public final Context f18723a;

    /* renamed from: a */
    public ImageView f18724a;

    /* renamed from: a */
    public RelativeLayout f18725a;

    /* renamed from: a */
    public final ArrayList<RecyclerViewItem> f18726a;

    /* renamed from: a */
    public final HashMap<RecyclerViewItem, List<Stop>> f18727a;

    /* renamed from: b */
    public ImageView f18728b;

    /* renamed from: b */
    public final ArrayList<String> f18729b;

    /* renamed from: c */
    public ImageView f18730c;

    /* renamed from: d */
    public ImageView f18731d;

    /* renamed from: e */
    public ImageView f18732e;

    /* renamed from: f */
    public ImageView f18733f;

    public px0(Context context, ArrayList<RecyclerViewItem> arrayList, HashMap<RecyclerViewItem, List<Stop>> hashMap, ArrayList<String> arrayList2) {
        this.f18723a = context;
        this.f18727a = hashMap;
        this.f18726a = arrayList;
        this.f18729b = arrayList2;
    }

    /* renamed from: a */
    public final void mo22668a(String str, boolean z) {
        Drawable r = wo0.m30989r(C3129p8.m24529b(this.f18723a, C1410R.C1411drawable.round_plain_box));
        Drawable r2 = wo0.m30989r(C3129p8.m24529b(this.f18723a, C1410R.C1411drawable.blue_hollow_dot));
        wo0.m30985n(r2, Color.parseColor(str));
        Drawable r3 = wo0.m30989r(C3129p8.m24529b(this.f18723a, C1410R.C1411drawable.vertical_line));
        wo0.m30985n(r3, Color.parseColor(str));
        if (!z) {
            wo0.m30985n(r, Color.parseColor(str));
            this.f18725a.setBackground(r);
            ImageView imageView = this.f18731d;
            if (imageView != null) {
                imageView.setBackground(r3);
            }
            this.f18724a.setBackground(r3);
            this.f18728b.setBackground(r3);
            this.f18730c.setBackground(r3);
            this.f18732e.setBackground(r2);
            this.f18733f.setBackground(r2);
            this.f18728b.setVisibility(0);
            this.f18730c.setVisibility(0);
            return;
        }
        wo0.m30985n(r, Color.parseColor(pj0.m61166a(-93152558028615L)));
        this.f18725a.setBackground(r);
        Drawable r4 = wo0.m30989r(C3129p8.m24529b(this.f18723a, C1410R.C1411drawable.vertical_dots));
        ImageView imageView2 = this.f18731d;
        if (imageView2 != null) {
            imageView2.setBackground(r3);
        }
        this.f18724a.setBackground(r3);
        int applyDimension = (int) TypedValue.applyDimension(1, 10.0f, this.f18723a.getResources().getDisplayMetrics());
        ((RelativeLayout.LayoutParams) this.f18728b.getLayoutParams()).setMargins(applyDimension, applyDimension, 0, applyDimension);
        ((RelativeLayout.LayoutParams) this.f18728b.getLayoutParams()).setMarginStart((int) TypedValue.applyDimension(1, 19.0f, this.f18723a.getResources().getDisplayMetrics()));
        ((RelativeLayout.LayoutParams) this.f18730c.getLayoutParams()).setMargins(applyDimension, applyDimension, 0, applyDimension);
        ((RelativeLayout.LayoutParams) this.f18730c.getLayoutParams()).setMarginStart((int) TypedValue.applyDimension(1, 19.0f, this.f18723a.getResources().getDisplayMetrics()));
        this.f18728b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 28.0f, this.f18723a.getResources().getDisplayMetrics());
        this.f18728b.getLayoutParams().width = (int) TypedValue.applyDimension(1, 7.0f, this.f18723a.getResources().getDisplayMetrics());
        this.f18730c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 28.0f, this.f18723a.getResources().getDisplayMetrics());
        this.f18730c.getLayoutParams().width = (int) TypedValue.applyDimension(1, 7.0f, this.f18723a.getResources().getDisplayMetrics());
        this.f18728b.requestLayout();
        this.f18730c.requestLayout();
        this.f18728b.setVisibility(0);
        this.f18730c.setVisibility(0);
        this.f18728b.setBackground(r4);
        this.f18730c.setBackground(r4);
        this.f18732e.setBackground(r2);
        this.f18733f.setBackground(r2);
    }

    public Object getChild(int i, int i2) {
        try {
            return this.f18727a.get(this.f18726a.get(i)).get(i2);
        } catch (Exception e) {
            e.printStackTrace();
            return new Stop();
        }
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    @SuppressLint({"InflateParams"})
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f18723a.getSystemService(pj0.m61166a(-92813255612231L));
        String name = ((Stop) getChild(i, i2)).getName();
        if (!z) {
            View inflate = layoutInflater.inflate(C1410R.layout.route_list_intermediate, (ViewGroup) null);
            this.f18731d = (ImageView) inflate.findViewById(C1410R.C1412id.up_line);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_stop_name)).setText(name);
            this.f18728b.setVisibility(0);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(C1410R.layout.route_list_main, (ViewGroup) null);
        this.f18725a = (RelativeLayout) inflate2.findViewById(C1410R.C1412id.rl_bus_route);
        TextView textView = (TextView) inflate2.findViewById(C1410R.C1412id.tv_source);
        TextView textView2 = (TextView) inflate2.findViewById(C1410R.C1412id.tv_departs);
        TextView textView3 = (TextView) inflate2.findViewById(C1410R.C1412id.tv_vehicle_id);
        this.f18724a = (ImageView) inflate2.findViewById(C1410R.C1412id.iv_0);
        this.f18728b = (ImageView) inflate2.findViewById(C1410R.C1412id.iv_1);
        this.f18730c = (ImageView) inflate2.findViewById(C1410R.C1412id.iv_2);
        this.f18732e = (ImageView) inflate2.findViewById(C1410R.C1412id.iv_source_location);
        this.f18733f = (ImageView) inflate2.findViewById(C1410R.C1412id.iv_terminal_location);
        this.f18725a.setVisibility(8);
        ((RelativeLayout) inflate2.findViewById(C1410R.C1412id.rl_vehicle_info)).setVisibility(8);
        ((TextView) inflate2.findViewById(C1410R.C1412id.tv_towards)).setVisibility(8);
        ((TextView) inflate2.findViewById(C1410R.C1412id.tv_stops_count)).setVisibility(8);
        ((TextView) inflate2.findViewById(C1410R.C1412id.tv_terminal_stop)).setVisibility(8);
        ((TextView) inflate2.findViewById(C1410R.C1412id.tv_fare)).setVisibility(8);
        ((ImageView) inflate2.findViewById(C1410R.C1412id.iv_expand)).setVisibility(8);
        if (i != getGroupCount() - 1) {
            textView.setVisibility(8);
            this.f18724a.setVisibility(8);
            this.f18728b.setVisibility(8);
            this.f18730c.setVisibility(8);
            this.f18732e.setVisibility(8);
        }
        textView.setText(name);
        mo22668a(this.f18726a.get(i).getColor(), false);
        this.f18730c.setVisibility(8);
        if (i == this.f18726a.size() - 1) {
            this.f18728b.setVisibility(8);
        } else {
            this.f18728b.setVisibility(0);
        }
        return inflate2;
    }

    public int getChildrenCount(int i) {
        return this.f18727a.get(this.f18726a.get(i)).size();
    }

    public Object getGroup(int i) {
        return this.f18727a.get(this.f18726a.get(i));
    }

    public int getGroupCount() {
        return this.f18727a.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View view2;
        int i2;
        Resources.Theme theme;
        int i3;
        Resources resources;
        int i4;
        int i5 = i;
        View inflate = view == null ? ((LayoutInflater) this.f18723a.getSystemService(pj0.m61166a(-92881975088967L))).inflate(C1410R.layout.route_list_main, (ViewGroup) null) : view;
        this.f18725a = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rl_bus_route);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C1410R.C1412id.rl_vehicle_info);
        ImageView imageView = (ImageView) inflate.findViewById(C1410R.C1412id.iv_mode);
        ImageView imageView2 = (ImageView) inflate.findViewById(C1410R.C1412id.iv_walk);
        ImageView imageView3 = (ImageView) inflate.findViewById(C1410R.C1412id.iv_expand);
        TextView textView = (TextView) inflate.findViewById(C1410R.C1412id.tv_route);
        TextView textView2 = (TextView) inflate.findViewById(C1410R.C1412id.tv_source);
        TextView textView3 = (TextView) inflate.findViewById(C1410R.C1412id.tv_towards);
        TextView textView4 = (TextView) inflate.findViewById(C1410R.C1412id.tv_departs);
        TextView textView5 = (TextView) inflate.findViewById(C1410R.C1412id.tv_stops_count);
        TextView textView6 = (TextView) inflate.findViewById(C1410R.C1412id.tv_terminal_stop);
        TextView textView7 = (TextView) inflate.findViewById(C1410R.C1412id.tv_fare);
        TextView textView8 = (TextView) inflate.findViewById(C1410R.C1412id.tv_change_here);
        TextView textView9 = (TextView) inflate.findViewById(C1410R.C1412id.tv_vehicle_id);
        this.f18724a = (ImageView) inflate.findViewById(C1410R.C1412id.iv_0);
        this.f18728b = (ImageView) inflate.findViewById(C1410R.C1412id.iv_1);
        this.f18730c = (ImageView) inflate.findViewById(C1410R.C1412id.iv_2);
        this.f18732e = (ImageView) inflate.findViewById(C1410R.C1412id.iv_source_location);
        this.f18733f = (ImageView) inflate.findViewById(C1410R.C1412id.iv_terminal_location);
        if (i5 == 0) {
            view2 = inflate;
            this.f18724a.setVisibility(4);
            i2 = 8;
        } else {
            view2 = inflate;
            i2 = 0;
        }
        textView8.setVisibility(i2);
        if (this.f18726a.get(i5).getRoute().equalsIgnoreCase(pj0.m61166a(-92950694565703L))) {
            textView2.setText(this.f18726a.get(i5).getSrc());
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(pj0.m61166a(-92997939205959L));
            textView.setTypeface(Typeface.defaultFromStyle(2));
            textView.setTextColor(zk3.m33202e(this.f18723a.getResources(), C1410R.color.grey, (Resources.Theme) null));
            imageView2.setImageDrawable(zk3.m33204g(this.f18723a.getResources(), C1410R.C1411drawable.ic_walk, (Resources.Theme) null));
            imageView2.setColorFilter(r70.m26353f(this.f18723a, C1410R.color.black), PorterDuff.Mode.SRC_IN);
            textView.setText(pj0.m61166a(-92972169402183L) + this.f18726a.get(i5).getRoute_time());
            textView6.setText(((Stop) getChild(i5, 0)).getName());
            if (i5 != this.f18726a.size() - 1) {
                i4 = 8;
                textView6.setVisibility(8);
            } else {
                i4 = 8;
            }
            textView5.setVisibility(i4);
            relativeLayout.setVisibility(i4);
            textView3.setVisibility(i4);
            textView4.setVisibility(i4);
            textView7.setVisibility(i4);
            imageView3.setVisibility(i4);
            this.f18730c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 12.0f, this.f18723a.getResources().getDisplayMetrics());
            mo22668a(this.f18726a.get(i5).getColor(), true);
        } else if (this.f18726a.get(i5).getRoute().equalsIgnoreCase(pj0.m61166a(-93019414042439L))) {
            textView2.setText(pj0.m61166a(-93040888878919L));
            relativeLayout.setVisibility(8);
        } else if (this.f18726a.get(i5).getRoute().equalsIgnoreCase(pj0.m61166a(-93062363715399L))) {
            textView2.setText(this.f18726a.get(i5).getSrc());
            textView6.setText(this.f18726a.get(i5).getDest());
        } else {
            int applyDimension = (int) TypedValue.applyDimension(1, 0.0f, this.f18723a.getResources().getDisplayMetrics());
            ((RelativeLayout.LayoutParams) this.f18728b.getLayoutParams()).setMargins(applyDimension, applyDimension, 0, applyDimension);
            ImageView imageView4 = imageView3;
            TextView textView10 = textView7;
            ((RelativeLayout.LayoutParams) this.f18728b.getLayoutParams()).setMarginStart((int) TypedValue.applyDimension(1, 21.0f, this.f18723a.getResources().getDisplayMetrics()));
            this.f18728b.getLayoutParams().height = (int) TypedValue.applyDimension(1, 12.0f, this.f18723a.getResources().getDisplayMetrics());
            this.f18728b.getLayoutParams().width = (int) TypedValue.applyDimension(1, 2.0f, this.f18723a.getResources().getDisplayMetrics());
            this.f18728b.requestLayout();
            ((RelativeLayout.LayoutParams) this.f18730c.getLayoutParams()).setMargins(applyDimension, applyDimension, 0, applyDimension);
            ((RelativeLayout.LayoutParams) this.f18730c.getLayoutParams()).setMarginStart((int) TypedValue.applyDimension(1, 21.0f, this.f18723a.getResources().getDisplayMetrics()));
            this.f18730c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 12.0f, this.f18723a.getResources().getDisplayMetrics());
            this.f18730c.getLayoutParams().width = (int) TypedValue.applyDimension(1, 2.0f, this.f18723a.getResources().getDisplayMetrics());
            this.f18730c.requestLayout();
            if (this.f18729b.get(i5).equalsIgnoreCase(pj0.m61166a(-93066658682695L))) {
                resources = this.f18723a.getResources();
                i3 = C1410R.C1411drawable.ic_metro_white;
                theme = null;
            } else {
                theme = null;
                resources = this.f18723a.getResources();
                i3 = C1410R.C1411drawable.ic_bus_white;
            }
            imageView.setBackground(zk3.m33204g(resources, i3, theme));
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
            textView.setTextColor(zk3.m33202e(this.f18723a.getResources(), C1410R.color.white, theme));
            textView2.setText(this.f18726a.get(i5).getSrc());
            textView6.setText(this.f18726a.get(i5).getDest());
            try {
                textView5.setText((getChildrenCount(i) - 1) + pj0.m61166a(-93092428486471L));
            } catch (Exception unused) {
                textView5.setText(pj0.m61166a(-93122493257543L));
            }
            textView9.setText(this.f18726a.get(i5).getVehicle_id());
            textView.setText(this.f18726a.get(i5).getRoute());
            textView3.setText(this.f18726a.get(i5).getTripHeading());
            mo22668a(this.f18726a.get(i5).getColor(), false);
            textView5.setVisibility(0);
            relativeLayout.setVisibility(0);
            textView3.setVisibility(0);
            textView4.setVisibility(8);
            textView10.setVisibility(0);
            imageView4.setVisibility(0);
            this.f18730c.getLayoutParams().height = (int) TypedValue.applyDimension(1, 70.0f, this.f18723a.getResources().getDisplayMetrics());
        }
        return view2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
