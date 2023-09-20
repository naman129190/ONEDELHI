package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.g60;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class f13 {
    @mr2
    /* renamed from: a */
    public static List<f13> m47447a(@mr2 d13 d13, @mr2 Context context) {
        ArrayList arrayList = new ArrayList();
        if (d13.mo34076bd()) {
            arrayList.add(new p51(d13.mo34077f5()));
        }
        if (d13.mo34082r5()) {
            arrayList.add(new m51(d13.mo34080ng(), context));
        }
        if (d13.mo34083t3()) {
            arrayList.add(new i51(d13.mo34086xb()));
        }
        if (d13.mo34070R7()) {
            arrayList.add(new k51(d13.mo34078h8()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m47448b(@mr2 d13 d13, @mr2 Context context) {
        List<f13> a = m47447a(d13, context);
        if (a.isEmpty()) {
            C7012v5.m67717e().mo46000a("No validators found for PerfMetric.");
            return false;
        }
        for (f13 c : a) {
            if (!c.mo35708c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m47449d(@mr2 String str, @mr2 String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    @ts2
    /* renamed from: e */
    public static String m47450e(@ts2 String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith(db0.f27369e)) {
            return null;
        } else {
            for (g60.C5362a aVar : g60.C5362a.values()) {
                if (aVar.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    @ts2
    /* renamed from: f */
    public static String m47451f(@ts2 String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith(db0.f27369e)) {
            return null;
        } else {
            for (g60.C5363b bVar : g60.C5363b.values()) {
                if (bVar.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith(g60.f28962c)) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
    }

    /* renamed from: c */
    public abstract boolean mo35708c();
}
