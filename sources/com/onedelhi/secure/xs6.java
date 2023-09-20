package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class xs6 {

    /* renamed from: a */
    public static final char[] f22767a;

    static {
        char[] cArr = new char[80];
        f22767a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m31715a(vs6 vs6, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m31718d(vs6, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m31716b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m31716b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m31716b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m31717c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append(db0.f27369e);
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(nu6.m23196a(new pm6(((String) obj).getBytes(zq6.f23859b))));
                sb.append(tk4.f35693a);
            } else if (obj instanceof on6) {
                sb.append(": \"");
                sb.append(nu6.m23196a((on6) obj));
                sb.append(tk4.f35693a);
            } else if (obj instanceof jq6) {
                sb.append(" {");
                m31718d((jq6) obj, sb, i + 2);
                sb.append("\n");
                m31717c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m31716b(sb, i3, "key", entry.getKey());
                m31716b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m31717c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m31717c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f22767a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m31718d(vs6 vs6, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object s;
        Method method2;
        vs6 vs62 = vs6;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = vs6.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i2);
            if (substring2.endsWith(ai2.f25857a) && !substring2.endsWith(ai2.f25858b) && !substring2.equals(ai2.f25857a) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                s = jq6.m18748s(method2, vs62, new Object[0]);
            } else if (!substring2.endsWith(ai2.f25859c) || substring2.equals(ai2.f25859c) || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith(ai2.f25860d) || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object s2 = jq6.m18748s(method4, vs62, new Object[0]);
                        if (method5 == null) {
                            if (s2 instanceof Boolean) {
                                if (!((Boolean) s2).booleanValue()) {
                                }
                            } else if (s2 instanceof Integer) {
                                if (((Integer) s2).intValue() == 0) {
                                }
                            } else if (s2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) s2).floatValue()) == 0) {
                                }
                            } else if (!(s2 instanceof Double)) {
                                if (s2 instanceof String) {
                                    obj = "";
                                } else if (s2 instanceof on6) {
                                    obj = on6.f18031a;
                                } else if (s2 instanceof vs6) {
                                    if (s2 == ((vs6) s2).mo17915d()) {
                                    }
                                } else if ((s2 instanceof Enum) && ((Enum) s2).ordinal() == 0) {
                                }
                                if (s2.equals(obj)) {
                                }
                            } else if (Double.doubleToRawLongBits(((Double) s2).doubleValue()) == 0) {
                            }
                        } else if (!((Boolean) jq6.m18748s(method5, vs62, new Object[0])).booleanValue()) {
                        }
                        m31716b(sb2, i3, substring2, s2);
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                s = jq6.m18748s(method, vs62, new Object[0]);
            }
            m31716b(sb2, i3, substring, s);
            i2 = 3;
        }
        if (!(vs62 instanceof kp6)) {
            qu6 qu6 = ((jq6) vs62).zzc;
            if (qu6 != null) {
                qu6.mo23453i(sb2, i3);
                return;
            }
            return;
        }
        kp6 kp6 = (kp6) vs62;
        throw null;
    }
}
