package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;

public class cf2 {
    @mr2
    /* renamed from: a */
    public static a90 m40860a(int i) {
        return i != 0 ? i != 1 ? m40861b() : new sc0() : new nn3();
    }

    @mr2
    /* renamed from: b */
    public static a90 m40861b() {
        return new nn3();
    }

    @mr2
    /* renamed from: c */
    public static bs0 m40862c() {
        return new bs0();
    }

    /* renamed from: d */
    public static void m40863d(@mr2 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof bf2) {
            ((bf2) background).mo31624n0(f);
        }
    }

    /* renamed from: e */
    public static void m40864e(@mr2 View view) {
        Drawable background = view.getBackground();
        if (background instanceof bf2) {
            m40865f(view, (bf2) background);
        }
    }

    /* renamed from: f */
    public static void m40865f(@mr2 View view, @mr2 bf2 bf2) {
        if (bf2.mo31601b0()) {
            bf2.mo31635s0(pv4.m61670j(view));
        }
    }
}
