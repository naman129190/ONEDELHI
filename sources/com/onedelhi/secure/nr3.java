package com.onedelhi.secure;

import android.content.Context;
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

public class nr3 {

    /* renamed from: a */
    public static final String f32743a = "UPC_A";

    /* renamed from: b */
    public static final String f32744b = "UPC_E";

    /* renamed from: b */
    public static final Collection<String> f32745b = m58730g("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* renamed from: c */
    public static final String f32746c = "EAN_8";

    /* renamed from: c */
    public static final Collection<String> f32747c = m58730g("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* renamed from: d */
    public static final String f32748d = "EAN_13";

    /* renamed from: d */
    public static final Collection<String> f32749d = null;

    /* renamed from: e */
    public static final String f32750e = "RSS_14";

    /* renamed from: f */
    public static final String f32751f = "CODE_39";

    /* renamed from: g */
    public static final String f32752g = "CODE_93";

    /* renamed from: h */
    public static final String f32753h = "CODE_128";

    /* renamed from: i */
    public static final String f32754i = "ITF";

    /* renamed from: j */
    public static final String f32755j = "RSS_EXPANDED";

    /* renamed from: k */
    public static final String f32756k = "QR_CODE";

    /* renamed from: l */
    public static final String f32757l = "DATA_MATRIX";

    /* renamed from: m */
    public static final String f32758m = "PDF_417";

    /* renamed from: a */
    public Class<?> f32759a;

    /* renamed from: a */
    public Collection<String> f32760a;

    /* renamed from: a */
    public final Map<String, Object> f32761a = new HashMap(3);

    /* renamed from: g */
    public static List<String> m58730g(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: a */
    public final nr3 mo41435a(String str, Object obj) {
        this.f32761a.put(str, obj);
        return this;
    }

    /* renamed from: b */
    public final void mo41436b(Intent intent) {
        Serializable serializable;
        for (Map.Entry next : this.f32761a.entrySet()) {
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
    public Intent mo41437c(Context context) {
        Intent intent = new Intent(context, mo41438d());
        intent.setAction(us1.C6979a.f36243a);
        if (this.f32760a != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.f32760a) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(next);
            }
            intent.putExtra(us1.C6979a.f36253i, sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        mo41436b(intent);
        return intent;
    }

    /* renamed from: d */
    public Class<?> mo41438d() {
        if (this.f32759a == null) {
            this.f32759a = mo41439e();
        }
        return this.f32759a;
    }

    /* renamed from: e */
    public Class<?> mo41439e() {
        return CaptureActivity.class;
    }

    /* renamed from: f */
    public Map<String, ?> mo41440f() {
        return this.f32761a;
    }

    /* renamed from: h */
    public nr3 mo41441h(boolean z) {
        mo41435a(us1.C6979a.f36258n, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: i */
    public nr3 mo41442i(boolean z) {
        mo41435a(us1.C6979a.f36257m, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: j */
    public nr3 mo41443j(int i) {
        if (i >= 0) {
            mo41435a(us1.C6979a.f36254j, Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: k */
    public nr3 mo41444k(Class<?> cls) {
        this.f32759a = cls;
        return this;
    }

    /* renamed from: l */
    public nr3 mo41445l(Collection<String> collection) {
        this.f32760a = collection;
        return this;
    }

    /* renamed from: m */
    public nr3 mo41446m(String... strArr) {
        this.f32760a = Arrays.asList(strArr);
        return this;
    }

    /* renamed from: n */
    public nr3 mo41447n(boolean z) {
        mo41435a(us1.C6979a.f36263s, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: o */
    public final nr3 mo41448o(String str) {
        if (str != null) {
            mo41435a(us1.C6979a.f36264t, str);
        }
        return this;
    }

    /* renamed from: p */
    public nr3 mo41449p(long j) {
        mo41435a(us1.C6979a.f36259o, Long.valueOf(j));
        return this;
    }

    /* renamed from: q */
    public nr3 mo41450q(boolean z) {
        mo41435a(us1.C6979a.f36255k, Boolean.valueOf(z));
        return this;
    }
}
