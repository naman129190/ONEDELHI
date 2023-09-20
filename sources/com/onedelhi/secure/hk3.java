package com.onedelhi.secure;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class hk3 extends xb0 {

    /* renamed from: a */
    public LayoutInflater f13149a;

    /* renamed from: q */
    public int f13150q;

    /* renamed from: r */
    public int f13151r;

    @Deprecated
    public hk3(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f13151r = i;
        this.f13150q = i;
        this.f13149a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public hk3(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f13151r = i;
        this.f13150q = i;
        this.f13149a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public hk3(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f13151r = i;
        this.f13150q = i;
        this.f13149a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: i */
    public View mo17325i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13149a.inflate(this.f13151r, viewGroup, false);
    }

    /* renamed from: j */
    public View mo17326j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13149a.inflate(this.f13150q, viewGroup, false);
    }

    /* renamed from: n */
    public void mo17327n(int i) {
        this.f13151r = i;
    }

    /* renamed from: o */
    public void mo17328o(int i) {
        this.f13150q = i;
    }
}
