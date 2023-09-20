package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class ai2 {

    /* renamed from: a */
    public static final String f25857a = "List";

    /* renamed from: b */
    public static final String f25858b = "OrBuilderList";

    /* renamed from: c */
    public static final String f25859c = "Map";

    /* renamed from: d */
    public static final String f25860d = "Bytes";

    /* renamed from: a */
    public static final String m38711a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(db0.f27369e);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m38712b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else if (!(obj instanceof C5173er)) {
            return obj instanceof yh2 ? obj == ((yh2) obj).mo43344Dd() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = C5173er.f28039a;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static final void m38713c(StringBuilder sb, int i, String str, Object obj) {
        String a;
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m38713c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m38713c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a = ab4.m37784e((String) obj);
            } else if (obj instanceof C5173er) {
                sb.append(": \"");
                a = ab4.m37780a((C5173er) obj);
            } else {
                if (obj instanceof qe1) {
                    sb.append(" {");
                    m38714d((qe1) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    m38713c(sb, i4, "key", entry.getKey());
                    m38713c(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(a);
            sb.append(tk4.f35693a);
        }
    }

    /* renamed from: d */
    public static void m38714d(yh2 yh2, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : yh2.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith(f25857a) && !substring.endsWith(f25858b) && !substring.equals(f25857a)) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m38713c(sb, i, m38711a(str2), qe1.m62502uj(method2, yh2, new Object[0]));
                }
            }
            if (substring.endsWith(f25859c) && !substring.equals(f25859c)) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m38713c(sb, i, m38711a(str3), qe1.m62502uj(method3, yh2, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith(f25860d)) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object uj = qe1.m62502uj(method4, yh2, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) qe1.m62502uj(method5, yh2, new Object[0])).booleanValue();
                    } else if (m38712b(uj)) {
                        z = false;
                    }
                    if (z) {
                        m38713c(sb, i, m38711a(str4), uj);
                    }
                }
            }
        }
        if (yh2 instanceof qe1.C6549e) {
            Iterator<Map.Entry<qe1.C6552g, Object>> H = ((qe1.C6549e) yh2).extensions.mo35720H();
            while (H.hasNext()) {
                Map.Entry next = H.next();
                m38713c(sb, i, "[" + ((qe1.C6552g) next.getKey()).mo35764j() + "]", next.getValue());
            }
        }
        bo4 bo4 = ((qe1) yh2).unknownFields;
        if (bo4 != null) {
            bo4.mo31969p(sb, i);
        }
    }

    /* renamed from: e */
    public static String m38715e(yh2 yh2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m38714d(yh2, sb, 0);
        return sb.toString();
    }
}
