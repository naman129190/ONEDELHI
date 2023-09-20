package com.onedelhi.secure;

import android.database.Cursor;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class yt4 {

    /* renamed from: a */
    public final String f23336a;

    /* renamed from: b */
    public final String f23337b;

    public yt4(String str, String str2) {
        this.f23336a = str;
        this.f23337b = str2;
    }

    /* renamed from: a */
    public static yt4 m32681a(n74 n74, String str) {
        Cursor g1 = n74.mo18327g1("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            if (g1.moveToFirst()) {
                return new yt4(g1.getString(0), g1.getString(1));
            }
            yt4 yt4 = new yt4(str, (String) null);
            g1.close();
            return yt4;
        } finally {
            g1.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt4)) {
            return false;
        }
        yt4 yt4 = (yt4) obj;
        String str = this.f23336a;
        if (str == null ? yt4.f23336a == null : str.equals(yt4.f23336a)) {
            String str2 = this.f23337b;
            String str3 = yt4.f23337b;
            if (str2 != null) {
                if (str2.equals(str3)) {
                    return true;
                }
            } else if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23336a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23337b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ViewInfo{name='" + this.f23336a + '\'' + ", sql='" + this.f23337b + '\'' + '}';
    }
}
