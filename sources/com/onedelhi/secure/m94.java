package com.onedelhi.secure;

import android.database.Cursor;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class m94 {

    /* renamed from: a */
    public static final int f15957a = 0;

    /* renamed from: b */
    public static final int f15958b = 1;

    /* renamed from: c */
    public static final int f15959c = 2;

    /* renamed from: a */
    public final String f15960a;

    /* renamed from: a */
    public final Map<String, C2838a> f15961a;

    /* renamed from: a */
    public final Set<C2839b> f15962a;
    @ts2

    /* renamed from: b */
    public final Set<C2841d> f15963b;

    /* renamed from: com.onedelhi.secure.m94$a */
    public static final class C2838a {
        @r10.C3352b

        /* renamed from: a */
        public final int f15964a;

        /* renamed from: a */
        public final String f15965a;

        /* renamed from: a */
        public final boolean f15966a;

        /* renamed from: b */
        public final int f15967b;

        /* renamed from: b */
        public final String f15968b;

        /* renamed from: c */
        public final int f15969c;

        /* renamed from: c */
        public final String f15970c;

        @Deprecated
        public C2838a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, (String) null, 0);
        }

        public C2838a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f15965a = str;
            this.f15968b = str2;
            this.f15966a = z;
            this.f15967b = i;
            this.f15964a = m21380c(str2);
            this.f15970c = str3;
            this.f15969c = i2;
        }

        /* renamed from: a */
        public static boolean m21378a(@mr2 String str) {
            if (str.length() == 0) {
                return false;
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i++;
                } else if (charAt == ')' && i - 1 == 0 && i2 != str.length() - 1) {
                    return false;
                }
            }
            return i == 0;
        }

        /* renamed from: b */
        public static boolean m21379b(@mr2 String str, @ts2 String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (m21378a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        @r10.C3352b
        /* renamed from: c */
        public static int m21380c(@ts2 String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: d */
        public boolean mo20196d() {
            return this.f15967b > 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
            r1 = r5.f15970c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r6 instanceof com.onedelhi.secure.m94.C2838a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.onedelhi.secure.m94$a r6 = (com.onedelhi.secure.m94.C2838a) r6
                int r1 = r5.f15967b
                int r3 = r6.f15967b
                if (r1 == r3) goto L_0x0013
                return r2
            L_0x0013:
                java.lang.String r1 = r5.f15965a
                java.lang.String r3 = r6.f15965a
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x001e
                return r2
            L_0x001e:
                boolean r1 = r5.f15966a
                boolean r3 = r6.f15966a
                if (r1 == r3) goto L_0x0025
                return r2
            L_0x0025:
                int r1 = r5.f15969c
                r3 = 2
                if (r1 != r0) goto L_0x003b
                int r1 = r6.f15969c
                if (r1 != r3) goto L_0x003b
                java.lang.String r1 = r5.f15970c
                if (r1 == 0) goto L_0x003b
                java.lang.String r4 = r6.f15970c
                boolean r1 = m21379b(r1, r4)
                if (r1 != 0) goto L_0x003b
                return r2
            L_0x003b:
                int r1 = r5.f15969c
                if (r1 != r3) goto L_0x0050
                int r1 = r6.f15969c
                if (r1 != r0) goto L_0x0050
                java.lang.String r1 = r6.f15970c
                if (r1 == 0) goto L_0x0050
                java.lang.String r3 = r5.f15970c
                boolean r1 = m21379b(r1, r3)
                if (r1 != 0) goto L_0x0050
                return r2
            L_0x0050:
                int r1 = r5.f15969c
                if (r1 == 0) goto L_0x006a
                int r3 = r6.f15969c
                if (r1 != r3) goto L_0x006a
                java.lang.String r1 = r5.f15970c
                if (r1 == 0) goto L_0x0065
                java.lang.String r3 = r6.f15970c
                boolean r1 = m21379b(r1, r3)
                if (r1 != 0) goto L_0x006a
                goto L_0x0069
            L_0x0065:
                java.lang.String r1 = r6.f15970c
                if (r1 == 0) goto L_0x006a
            L_0x0069:
                return r2
            L_0x006a:
                int r1 = r5.f15964a
                int r6 = r6.f15964a
                if (r1 != r6) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r0 = 0
            L_0x0072:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m94.C2838a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.f15965a.hashCode() * 31) + this.f15964a) * 31) + (this.f15966a ? 1231 : 1237)) * 31) + this.f15967b;
        }

        public String toString() {
            return "Column{name='" + this.f15965a + '\'' + ", type='" + this.f15968b + '\'' + ", affinity='" + this.f15964a + '\'' + ", notNull=" + this.f15966a + ", primaryKeyPosition=" + this.f15967b + ", defaultValue='" + this.f15970c + '\'' + '}';
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.m94$b */
    public static final class C2839b {
        @mr2

        /* renamed from: a */
        public final String f15971a;
        @mr2

        /* renamed from: a */
        public final List<String> f15972a;
        @mr2

        /* renamed from: b */
        public final String f15973b;
        @mr2

        /* renamed from: b */
        public final List<String> f15974b;
        @mr2

        /* renamed from: c */
        public final String f15975c;

        public C2839b(@mr2 String str, @mr2 String str2, @mr2 String str3, @mr2 List<String> list, @mr2 List<String> list2) {
            this.f15971a = str;
            this.f15973b = str2;
            this.f15975c = str3;
            this.f15972a = Collections.unmodifiableList(list);
            this.f15974b = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2839b)) {
                return false;
            }
            C2839b bVar = (C2839b) obj;
            if (this.f15971a.equals(bVar.f15971a) && this.f15973b.equals(bVar.f15973b) && this.f15975c.equals(bVar.f15975c) && this.f15972a.equals(bVar.f15972a)) {
                return this.f15974b.equals(bVar.f15974b);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f15971a.hashCode() * 31) + this.f15973b.hashCode()) * 31) + this.f15975c.hashCode()) * 31) + this.f15972a.hashCode()) * 31) + this.f15974b.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f15971a + '\'' + ", onDelete='" + this.f15973b + '\'' + ", onUpdate='" + this.f15975c + '\'' + ", columnNames=" + this.f15972a + ", referenceColumnNames=" + this.f15974b + '}';
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.m94$c */
    public static class C2840c implements Comparable<C2840c> {

        /* renamed from: b */
        public final String f15976b;

        /* renamed from: c */
        public final String f15977c;

        /* renamed from: n */
        public final int f15978n;

        /* renamed from: o */
        public final int f15979o;

        public C2840c(int i, int i2, String str, String str2) {
            this.f15978n = i;
            this.f15979o = i2;
            this.f15976b = str;
            this.f15977c = str2;
        }

        /* renamed from: a */
        public int compareTo(@mr2 C2840c cVar) {
            int i = this.f15978n - cVar.f15978n;
            return i == 0 ? this.f15979o - cVar.f15979o : i;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.m94$d */
    public static final class C2841d {

        /* renamed from: b */
        public static final String f15980b = "index_";

        /* renamed from: a */
        public final String f15981a;

        /* renamed from: a */
        public final List<String> f15982a;

        /* renamed from: a */
        public final boolean f15983a;

        /* renamed from: b */
        public final List<String> f15984b;

        public C2841d(String str, boolean z, List<String> list) {
            this(str, z, list, (List<String>) null);
        }

        public C2841d(String str, boolean z, List<String> list, List<String> list2) {
            this.f15981a = str;
            this.f15983a = z;
            this.f15982a = list;
            this.f15984b = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), up1.C3732a.ASC.name()) : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2841d)) {
                return false;
            }
            C2841d dVar = (C2841d) obj;
            if (this.f15983a == dVar.f15983a && this.f15982a.equals(dVar.f15982a) && this.f15984b.equals(dVar.f15984b)) {
                return this.f15981a.startsWith(f15980b) ? dVar.f15981a.startsWith(f15980b) : this.f15981a.equals(dVar.f15981a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f15981a.startsWith(f15980b) ? -1184239155 : this.f15981a.hashCode()) * 31) + (this.f15983a ? 1 : 0)) * 31) + this.f15982a.hashCode()) * 31) + this.f15984b.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f15981a + '\'' + ", unique=" + this.f15983a + ", columns=" + this.f15982a + ", orders=" + this.f15984b + '}';
        }
    }

    public m94(String str, Map<String, C2838a> map, Set<C2839b> set) {
        this(str, map, set, Collections.emptySet());
    }

    public m94(String str, Map<String, C2838a> map, Set<C2839b> set, Set<C2841d> set2) {
        this.f15960a = str;
        this.f15961a = Collections.unmodifiableMap(map);
        this.f15962a = Collections.unmodifiableSet(set);
        this.f15963b = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static m94 m21372a(n74 n74, String str) {
        return new m94(str, m21373b(n74, str), m21375d(n74, str), m21377f(n74, str));
    }

    /* renamed from: b */
    public static Map<String, C2838a> m21373b(n74 n74, String str) {
        Cursor g1 = n74.mo18327g1("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (g1.getColumnCount() > 0) {
                int columnIndex = g1.getColumnIndex("name");
                int columnIndex2 = g1.getColumnIndex("type");
                int columnIndex3 = g1.getColumnIndex("notnull");
                int columnIndex4 = g1.getColumnIndex("pk");
                int columnIndex5 = g1.getColumnIndex("dflt_value");
                while (g1.moveToNext()) {
                    String string = g1.getString(columnIndex);
                    hashMap.put(string, new C2838a(string, g1.getString(columnIndex2), g1.getInt(columnIndex3) != 0, g1.getInt(columnIndex4), g1.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            g1.close();
        }
    }

    /* renamed from: c */
    public static List<C2840c> m21374c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C2840c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static Set<C2839b> m21375d(n74 n74, String str) {
        HashSet hashSet = new HashSet();
        Cursor g1 = n74.mo18327g1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = g1.getColumnIndex("id");
            int columnIndex2 = g1.getColumnIndex("seq");
            int columnIndex3 = g1.getColumnIndex("table");
            int columnIndex4 = g1.getColumnIndex("on_delete");
            int columnIndex5 = g1.getColumnIndex("on_update");
            List<C2840c> c = m21374c(g1);
            int count = g1.getCount();
            for (int i = 0; i < count; i++) {
                g1.moveToPosition(i);
                if (g1.getInt(columnIndex2) == 0) {
                    int i2 = g1.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C2840c next : c) {
                        if (next.f15978n == i2) {
                            arrayList.add(next.f15976b);
                            arrayList2.add(next.f15977c);
                        }
                    }
                    hashSet.add(new C2839b(g1.getString(columnIndex3), g1.getString(columnIndex4), g1.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            g1.close();
        }
    }

    @ts2
    /* renamed from: e */
    public static C2841d m21376e(n74 n74, String str, boolean z) {
        Cursor g1 = n74.mo18327g1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = g1.getColumnIndex("seqno");
            int columnIndex2 = g1.getColumnIndex("cid");
            int columnIndex3 = g1.getColumnIndex("name");
            int columnIndex4 = g1.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (g1.moveToNext()) {
                        if (g1.getInt(columnIndex2) >= 0) {
                            int i = g1.getInt(columnIndex);
                            String string = g1.getString(columnIndex3);
                            String str2 = g1.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            treeMap.put(Integer.valueOf(i), string);
                            treeMap2.put(Integer.valueOf(i), str2);
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    ArrayList arrayList2 = new ArrayList(treeMap2.size());
                    arrayList2.addAll(treeMap2.values());
                    C2841d dVar = new C2841d(str, z, arrayList, arrayList2);
                    g1.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            g1.close();
        }
    }

    @ts2
    /* renamed from: f */
    public static Set<C2841d> m21377f(n74 n74, String str) {
        Cursor g1 = n74.mo18327g1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = g1.getColumnIndex("name");
            int columnIndex2 = g1.getColumnIndex("origin");
            int columnIndex3 = g1.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (g1.moveToNext()) {
                        if ("c".equals(g1.getString(columnIndex2))) {
                            String string = g1.getString(columnIndex);
                            boolean z = true;
                            if (g1.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C2841d e = m21376e(n74, string, z);
                            if (e == null) {
                                g1.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    g1.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            g1.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C2841d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m94)) {
            return false;
        }
        m94 m94 = (m94) obj;
        String str = this.f15960a;
        if (str == null ? m94.f15960a != null : !str.equals(m94.f15960a)) {
            return false;
        }
        Map<String, C2838a> map = this.f15961a;
        if (map == null ? m94.f15961a != null : !map.equals(m94.f15961a)) {
            return false;
        }
        Set<C2839b> set2 = this.f15962a;
        if (set2 == null ? m94.f15962a != null : !set2.equals(m94.f15962a)) {
            return false;
        }
        Set<C2841d> set3 = this.f15963b;
        if (set3 == null || (set = m94.f15963b) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f15960a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C2838a> map = this.f15961a;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C2839b> set = this.f15962a;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f15960a + '\'' + ", columns=" + this.f15961a + ", foreignKeys=" + this.f15962a + ", indices=" + this.f15963b + '}';
    }
}
