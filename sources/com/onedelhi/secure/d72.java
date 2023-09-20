package com.onedelhi.secure;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

public final /* synthetic */ class d72 {
    /* renamed from: a */
    public static void m12988a(e72 e72, int i) {
    }

    /* renamed from: b */
    public static void m12989b(e72 e72, @mr2 List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e72.onLocationChanged((Location) list.get(i));
        }
    }

    /* renamed from: c */
    public static void m12990c(e72 e72, @mr2 String str) {
    }

    /* renamed from: d */
    public static void m12991d(e72 e72, @mr2 String str) {
    }

    /* renamed from: e */
    public static void m12992e(e72 e72, @mr2 String str, int i, @ts2 Bundle bundle) {
    }
}
