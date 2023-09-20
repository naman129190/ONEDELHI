package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.ts2;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.f */
public class C4322f {

    /* renamed from: a */
    public static final int f25161a = -16777216;

    /* renamed from: a */
    public static final String f25162a = "NotificationParams";

    /* renamed from: b */
    public static final int f25163b = 1;

    /* renamed from: c */
    public static final int f25164c = -1;

    /* renamed from: d */
    public static final int f25165d = 1;
    @mr2

    /* renamed from: a */
    public final Bundle f25166a;

    public C4322f(@mr2 Bundle bundle) {
        Objects.requireNonNull(bundle, C4311b.C4317f.C4318a.f25149a);
        this.f25166a = new Bundle(bundle);
    }

    /* renamed from: B */
    public static String m34787B(String str) {
        return str.startsWith(C4311b.C4314c.f25086b) ? str.substring(6) : str;
    }

    /* renamed from: d */
    public static int m34788d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: t */
    public static boolean m34789t(String str) {
        return str.startsWith(C4311b.C4312a.f25067a) || str.equals("from");
    }

    /* renamed from: v */
    public static boolean m34790v(Bundle bundle) {
        return mm0.f16219f.equals(bundle.getString(C4311b.C4314c.f25088d)) || mm0.f16219f.equals(bundle.getString(m34792x(C4311b.C4314c.f25088d)));
    }

    /* renamed from: w */
    public static boolean m34791w(String str) {
        return str.startsWith(C4311b.C4315d.f25125o) || str.startsWith(C4311b.C4314c.f25086b) || str.startsWith(C4311b.C4314c.f25087c);
    }

    /* renamed from: x */
    public static String m34792x(String str) {
        return !str.startsWith(C4311b.C4314c.f25086b) ? str : str.replace(C4311b.C4314c.f25086b, C4311b.C4314c.f25087c);
    }

    /* renamed from: A */
    public Bundle mo29740A() {
        Bundle bundle = new Bundle(this.f25166a);
        for (String str : this.f25166a.keySet()) {
            if (m34791w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public boolean mo29741a(String str) {
        String p = mo29755p(str);
        return mm0.f16219f.equals(p) || Boolean.parseBoolean(p);
    }

    /* renamed from: b */
    public Integer mo29742b(String str) {
        String p = mo29755p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            Log.w(f25162a, "Couldn't parse value of " + m34787B(str) + pl2.f33726c + p + ") into an int");
            return null;
        }
    }

    @ts2
    /* renamed from: c */
    public JSONArray mo29743c(String str) {
        String p = mo29755p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            Log.w(f25162a, "Malformed JSON for key " + m34787B(str) + ": " + p + ", falling back to default");
            return null;
        }
    }

    @ts2
    /* renamed from: e */
    public int[] mo29744e() {
        String str;
        JSONArray c = mo29743c(C4311b.C4314c.f25107w);
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m34788d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + c + ". Skipping setting LightSettings";
            Log.w(f25162a, str);
            return null;
        } catch (IllegalArgumentException e) {
            str = "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings";
            Log.w(f25162a, str);
            return null;
        }
    }

    @ts2
    /* renamed from: f */
    public Uri mo29745f() {
        String p = mo29755p(C4311b.C4314c.f25080C);
        if (TextUtils.isEmpty(p)) {
            p = mo29755p(C4311b.C4314c.f25079B);
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @ts2
    /* renamed from: g */
    public Object[] mo29746g(String str) {
        JSONArray c = mo29743c(str + C4311b.C4314c.f25084G);
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @ts2
    /* renamed from: h */
    public String mo29747h(String str) {
        return mo29755p(str + C4311b.C4314c.f25083F);
    }

    @ts2
    /* renamed from: i */
    public String mo29748i(Resources resources, String str, String str2) {
        String h = mo29747h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, ak4.C1709b.f9167e, str);
        if (identifier == 0) {
            Log.w(f25162a, m34787B(str2 + C4311b.C4314c.f25083F) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = mo29746g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w(f25162a, "Missing format argument for " + m34787B(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long mo29749j(String str) {
        String p = mo29755p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            Log.w(f25162a, "Couldn't parse value of " + m34787B(str) + pl2.f33726c + p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo29750k() {
        return mo29755p(C4311b.C4314c.f25081D);
    }

    @ts2
    /* renamed from: l */
    public Integer mo29751l() {
        Integer b = mo29742b(C4311b.C4314c.f25104t);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    @ts2
    /* renamed from: m */
    public Integer mo29752m() {
        Integer b = mo29742b(C4311b.C4314c.f25100p);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo29753n(Resources resources, String str, String str2) {
        String p = mo29755p(str2);
        return !TextUtils.isEmpty(p) ? p : mo29748i(resources, str, str2);
    }

    @ts2
    /* renamed from: o */
    public String mo29754o() {
        String p = mo29755p(C4311b.C4314c.f25109y);
        return TextUtils.isEmpty(p) ? mo29755p(C4311b.C4314c.f25110z) : p;
    }

    /* renamed from: p */
    public String mo29755p(String str) {
        return this.f25166a.getString(mo29760y(str));
    }

    @ts2
    /* renamed from: q */
    public long[] mo29756q() {
        JSONArray c = mo29743c(C4311b.C4314c.f25106v);
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w(f25162a, "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer mo29757r() {
        Integer b = mo29742b(C4311b.C4314c.f25105u);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w(f25162a, "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: s */
    public boolean mo29758s() {
        return !TextUtils.isEmpty(mo29755p(C4311b.C4314c.f25094j));
    }

    /* renamed from: u */
    public boolean mo29759u() {
        return mo29741a(C4311b.C4314c.f25088d);
    }

    /* renamed from: y */
    public final String mo29760y(String str) {
        if (!this.f25166a.containsKey(str) && str.startsWith(C4311b.C4314c.f25086b)) {
            String x = m34792x(str);
            if (this.f25166a.containsKey(x)) {
                return x;
            }
        }
        return str;
    }

    /* renamed from: z */
    public Bundle mo29761z() {
        Bundle bundle = new Bundle(this.f25166a);
        for (String str : this.f25166a.keySet()) {
            if (!m34789t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
