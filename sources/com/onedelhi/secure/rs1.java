package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.onedelhi.secure.us1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rs1 {

    /* renamed from: a */
    public static final String f34715a = "rs1";

    /* renamed from: b */
    public static final int f34716b = 49374;

    /* renamed from: b */
    public static final String f34717b = "UPC_A";

    /* renamed from: b */
    public static final Collection<String> f34718b = m63801k("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* renamed from: c */
    public static final String f34719c = "UPC_E";

    /* renamed from: c */
    public static final Collection<String> f34720c = m63801k("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* renamed from: d */
    public static final String f34721d = "EAN_8";

    /* renamed from: d */
    public static final Collection<String> f34722d = null;

    /* renamed from: e */
    public static final String f34723e = "EAN_13";

    /* renamed from: f */
    public static final String f34724f = "RSS_14";

    /* renamed from: g */
    public static final String f34725g = "CODE_39";

    /* renamed from: h */
    public static final String f34726h = "CODE_93";

    /* renamed from: i */
    public static final String f34727i = "CODE_128";

    /* renamed from: j */
    public static final String f34728j = "ITF";

    /* renamed from: k */
    public static final String f34729k = "RSS_EXPANDED";

    /* renamed from: l */
    public static final String f34730l = "QR_CODE";

    /* renamed from: m */
    public static final String f34731m = "DATA_MATRIX";

    /* renamed from: n */
    public static final String f34732n = "PDF_417";

    /* renamed from: a */
    public int f34733a = f34716b;

    /* renamed from: a */
    public final Activity f34734a;

    /* renamed from: a */
    public Fragment f34735a;

    /* renamed from: a */
    public androidx.fragment.app.Fragment f34736a;

    /* renamed from: a */
    public Class<?> f34737a;

    /* renamed from: a */
    public Collection<String> f34738a;

    /* renamed from: a */
    public final Map<String, Object> f34739a = new HashMap(3);

    public rs1(Activity activity) {
        this.f34734a = activity;
    }

    @TargetApi(11)
    /* renamed from: d */
    public static rs1 m63799d(Fragment fragment) {
        rs1 rs1 = new rs1(fragment.getActivity());
        rs1.f34735a = fragment;
        return rs1;
    }

    /* renamed from: e */
    public static rs1 m63800e(androidx.fragment.app.Fragment fragment) {
        rs1 rs1 = new rs1(fragment.getActivity());
        rs1.f34736a = fragment;
        return rs1;
    }

    /* renamed from: k */
    public static List<String> m63801k(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: l */
    public static ss1 m63802l(int i, int i2, Intent intent) {
        if (i == 49374) {
            return m63803m(i2, intent);
        }
        return null;
    }

    /* renamed from: m */
    public static ss1 m63803m(int i, Intent intent) {
        if (i != -1) {
            return new ss1(intent);
        }
        String stringExtra = intent.getStringExtra(us1.C6979a.f36265u);
        String stringExtra2 = intent.getStringExtra(us1.C6979a.f36266v);
        byte[] byteArrayExtra = intent.getByteArrayExtra(us1.C6979a.f36268x);
        int intExtra = intent.getIntExtra(us1.C6979a.f36269y, Integer.MIN_VALUE);
        return new ss1(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra(us1.C6979a.f36270z), intent.getStringExtra(us1.C6979a.f36240B), intent);
    }

    /* renamed from: a */
    public final rs1 mo44036a(String str, Object obj) {
        this.f34739a.put(str, obj);
        return this;
    }

    /* renamed from: b */
    public final void mo44037b(Intent intent) {
        Serializable serializable;
        for (Map.Entry next : this.f34739a.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                serializable = (Integer) value;
            } else if (value instanceof Long) {
                serializable = (Long) value;
            } else if (value instanceof Boolean) {
                serializable = (Boolean) value;
            } else if (value instanceof Double) {
                serializable = (Double) value;
            } else if (value instanceof Float) {
                serializable = (Float) value;
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
            intent.putExtra(str, serializable);
        }
    }

    /* renamed from: c */
    public Intent mo44038c() {
        Intent intent = new Intent(this.f34734a, mo44039f());
        intent.setAction(us1.C6979a.f36243a);
        if (this.f34738a != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.f34738a) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(next);
            }
            intent.putExtra(us1.C6979a.f36253i, sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        mo44037b(intent);
        return intent;
    }

    /* renamed from: f */
    public Class<?> mo44039f() {
        if (this.f34737a == null) {
            this.f34737a = mo44040g();
        }
        return this.f34737a;
    }

    /* renamed from: g */
    public Class<?> mo44040g() {
        return CaptureActivity.class;
    }

    /* renamed from: h */
    public Map<String, ?> mo44041h() {
        return this.f34739a;
    }

    /* renamed from: i */
    public final void mo44042i() {
        mo44056z(mo44038c(), this.f34733a);
    }

    /* renamed from: j */
    public final void mo44043j(Collection<String> collection) {
        mo44048r(collection);
        mo44042i();
    }

    /* renamed from: n */
    public rs1 mo44044n(boolean z) {
        mo44036a(us1.C6979a.f36258n, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: o */
    public rs1 mo44045o(boolean z) {
        mo44036a(us1.C6979a.f36257m, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: p */
    public rs1 mo44046p(int i) {
        if (i >= 0) {
            mo44036a(us1.C6979a.f36254j, Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: q */
    public rs1 mo44047q(Class<?> cls) {
        this.f34737a = cls;
        return this;
    }

    /* renamed from: r */
    public rs1 mo44048r(Collection<String> collection) {
        this.f34738a = collection;
        return this;
    }

    /* renamed from: s */
    public rs1 mo44049s(String... strArr) {
        this.f34738a = Arrays.asList(strArr);
        return this;
    }

    /* renamed from: t */
    public rs1 mo44050t(boolean z) {
        mo44036a(us1.C6979a.f36263s, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: u */
    public final rs1 mo44051u(String str) {
        if (str != null) {
            mo44036a(us1.C6979a.f36264t, str);
        }
        return this;
    }

    /* renamed from: v */
    public rs1 mo44052v(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("requestCode out of range");
        }
        this.f34733a = i;
        return this;
    }

    /* renamed from: w */
    public rs1 mo44053w(long j) {
        mo44036a(us1.C6979a.f36259o, Long.valueOf(j));
        return this;
    }

    /* renamed from: x */
    public rs1 mo44054x(boolean z) {
        mo44036a(us1.C6979a.f36255k, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: y */
    public void mo44055y(Intent intent) {
        Fragment fragment = this.f34735a;
        if (fragment != null) {
            fragment.startActivity(intent);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f34736a;
        if (fragment2 != null) {
            fragment2.startActivity(intent);
        } else {
            this.f34734a.startActivity(intent);
        }
    }

    /* renamed from: z */
    public void mo44056z(Intent intent, int i) {
        Fragment fragment = this.f34735a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f34736a;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i);
        } else {
            this.f34734a.startActivityForResult(intent, i);
        }
    }
}
