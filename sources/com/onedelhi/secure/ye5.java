package com.onedelhi.secure;

import android.os.Bundle;
import java.util.EnumMap;

public final class ye5 {

    /* renamed from: a */
    public static final ye5 f23033a = new ye5((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final EnumMap f23034a;

    public ye5(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(ne5.class);
        this.f23034a = enumMap;
        enumMap.put(ne5.AD_STORAGE, bool);
        enumMap.put(ne5.ANALYTICS_STORAGE, bool2);
    }

    public ye5(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(ne5.class);
        this.f23034a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: a */
    public static ye5 m32304a(Bundle bundle) {
        if (bundle == null) {
            return f23033a;
        }
        EnumMap enumMap = new EnumMap(ne5.class);
        for (ne5 ne5 : ne5.values()) {
            enumMap.put(ne5, m32309n(bundle.getString(ne5.f17338b)));
        }
        return new ye5(enumMap);
    }

    /* renamed from: b */
    public static ye5 m32305b(String str) {
        EnumMap enumMap = new EnumMap(ne5.class);
        if (str != null) {
            int i = 0;
            while (true) {
                ne5[] ne5Arr = ne5.f17335a;
                int length = ne5Arr.length;
                if (i >= 2) {
                    break;
                }
                ne5 ne5 = ne5Arr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(ne5, bool);
                }
                i++;
            }
        }
        return new ye5(enumMap);
    }

    /* renamed from: g */
    public static String m32306g(Bundle bundle) {
        String string;
        for (ne5 ne5 : ne5.values()) {
            if (bundle.containsKey(ne5.f17338b) && (string = bundle.getString(ne5.f17338b)) != null && m32309n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m32307j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    public static final int m32308m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    public static Boolean m32309n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final ye5 mo27431c(ye5 ye5) {
        EnumMap enumMap = new EnumMap(ne5.class);
        for (ne5 ne5 : ne5.values()) {
            Boolean bool = (Boolean) this.f23034a.get(ne5);
            Boolean bool2 = (Boolean) ye5.f23034a.get(ne5);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(ne5, bool);
        }
        return new ye5(enumMap);
    }

    /* renamed from: d */
    public final ye5 mo27432d(ye5 ye5) {
        EnumMap enumMap = new EnumMap(ne5.class);
        for (ne5 ne5 : ne5.values()) {
            Boolean bool = (Boolean) this.f23034a.get(ne5);
            if (bool == null) {
                bool = (Boolean) ye5.f23034a.get(ne5);
            }
            enumMap.put(ne5, bool);
        }
        return new ye5(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo27433e() {
        return (Boolean) this.f23034a.get(ne5.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ye5)) {
            return false;
        }
        ye5 ye5 = (ye5) obj;
        for (ne5 ne5 : ne5.values()) {
            if (m32308m((Boolean) this.f23034a.get(ne5)) != m32308m((Boolean) ye5.f23034a.get(ne5))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo27435f() {
        return (Boolean) this.f23034a.get(ne5.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo27436h() {
        StringBuilder sb = new StringBuilder("G1");
        ne5[] ne5Arr = ne5.f17335a;
        int length = ne5Arr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f23034a.get(ne5Arr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f23034a.values()) {
            i = (i * 31) + m32308m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo27438i(ne5 ne5) {
        Boolean bool = (Boolean) this.f23034a.get(ne5);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo27439k(ye5 ye5) {
        return mo27440l(ye5, (ne5[]) this.f23034a.keySet().toArray(new ne5[0]));
    }

    /* renamed from: l */
    public final boolean mo27440l(ye5 ye5, ne5... ne5Arr) {
        for (ne5 ne5 : ne5Arr) {
            Boolean bool = (Boolean) this.f23034a.get(ne5);
            Boolean bool2 = (Boolean) ye5.f23034a.get(ne5);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        ne5[] values = ne5.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            ne5 ne5 = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(ne5.name());
            sb.append(a13.f25713a);
            Boolean bool = (Boolean) this.f23034a.get(ne5);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
