package com.onedelhi.secure;

import android.database.Cursor;
import com.onedelhi.secure.hl3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class zb1 {

    /* renamed from: a */
    public static final String[] f23560a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: a */
    public final String f23561a;

    /* renamed from: a */
    public final Set<String> f23562a;

    /* renamed from: b */
    public final Set<String> f23563b;

    public zb1(String str, Set<String> set, String str2) {
        this.f23561a = str;
        this.f23562a = set;
        this.f23563b = m33020a(str2);
    }

    public zb1(String str, Set<String> set, Set<String> set2) {
        this.f23561a = str;
        this.f23562a = set;
        this.f23563b = set2;
    }

    @hw4
    /* renamed from: a */
    public static Set<String> m33020a(String str) {
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (!(charAt == '\"' || charAt == '\'')) {
                if (charAt != ',') {
                    if (charAt == '[') {
                        if (!arrayDeque.isEmpty()) {
                        }
                        arrayDeque.push(Character.valueOf(charAt));
                    } else if (charAt != ']') {
                        if (charAt != '`') {
                        }
                    } else if (!arrayDeque.isEmpty()) {
                        if (((Character) arrayDeque.peek()).charValue() != '[') {
                        }
                        arrayDeque.pop();
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i + 1, i2).trim());
                    i = i2;
                }
            }
            if (!arrayDeque.isEmpty()) {
                if (((Character) arrayDeque.peek()).charValue() != charAt) {
                }
                arrayDeque.pop();
            }
            arrayDeque.push(Character.valueOf(charAt));
        }
        arrayList.add(substring.substring(i + 1).trim());
        HashSet hashSet = new HashSet();
        for (String str2 : arrayList) {
            for (String startsWith : f23560a) {
                if (str2.startsWith(startsWith)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static zb1 m33021b(n74 n74, String str) {
        return new zb1(str, m33022c(n74, str), m33023d(n74, str));
    }

    /* renamed from: c */
    public static Set<String> m33022c(n74 n74, String str) {
        Cursor g1 = n74.mo18327g1("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (g1.getColumnCount() > 0) {
                int columnIndex = g1.getColumnIndex("name");
                while (g1.moveToNext()) {
                    hashSet.add(g1.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            g1.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public static Set<String> m33023d(n74 n74, String str) {
        Cursor g1 = n74.mo18327g1("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            String string = g1.moveToFirst() ? g1.getString(g1.getColumnIndexOrThrow("sql")) : "";
            g1.close();
            return m33020a(string);
        } catch (Throwable th) {
            g1.close();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1 = (zb1) obj;
        String str = this.f23561a;
        if (str == null ? zb1.f23561a != null : !str.equals(zb1.f23561a)) {
            return false;
        }
        Set<String> set = this.f23562a;
        if (set == null ? zb1.f23562a != null : !set.equals(zb1.f23562a)) {
            return false;
        }
        Set<String> set2 = this.f23563b;
        Set<String> set3 = zb1.f23563b;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public int hashCode() {
        String str = this.f23561a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.f23562a;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f23563b;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.f23561a + '\'' + ", columns=" + this.f23562a + ", options=" + this.f23563b + '}';
    }
}
