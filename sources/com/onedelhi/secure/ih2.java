package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0247d;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;

public abstract class ih2 implements my3, C0258j, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f13669a;

    /* renamed from: A */
    public static boolean m17525A(C0248e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static C0247d m17526B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0247d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0247d) listAdapter;
    }

    /* renamed from: r */
    public static int m17527r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public C0260k mo1216f(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    /* renamed from: g */
    public void mo1217g(@mr2 Context context, @ts2 C0248e eVar) {
    }

    public int getId() {
        return 0;
    }

    /* renamed from: k */
    public boolean mo1221k(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: m */
    public boolean mo1223m(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: o */
    public abstract void mo1243o(C0248e eVar);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m17526B(listAdapter).f1095a.mo1299P((MenuItem) listAdapter.getItem(i), this, mo1246p() ? 0 : 4);
    }

    /* renamed from: p */
    public boolean mo1246p() {
        return true;
    }

    /* renamed from: q */
    public Rect mo17764q() {
        return this.f13669a;
    }

    /* renamed from: s */
    public abstract void mo1247s(View view);

    /* renamed from: t */
    public void mo17765t(Rect rect) {
        this.f13669a = rect;
    }

    /* renamed from: u */
    public abstract void mo1248u(boolean z);

    /* renamed from: v */
    public abstract void mo1249v(int i);

    /* renamed from: w */
    public abstract void mo1250w(int i);

    /* renamed from: x */
    public abstract void mo1251x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo1252y(boolean z);

    /* renamed from: z */
    public abstract void mo1253z(int i);
}
