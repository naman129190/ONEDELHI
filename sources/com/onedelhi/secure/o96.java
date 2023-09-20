package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class o96 {
    /* renamed from: a */
    public static String m23616a(i96 i96, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m23619d(i96, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m23617b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m23617b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m23617b(sb, i, str, b2);
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
                sb.append(fd6.m14890a(i36.m17167r((String) obj)));
                sb.append(tk4.f35693a);
            } else if (obj instanceof i36) {
                sb.append(": \"");
                sb.append(fd6.m14890a((i36) obj));
                sb.append(tk4.f35693a);
            } else if (obj instanceof e56) {
                sb.append(" {");
                m23619d((e56) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m23617b(sb, i4, "key", entry.getKey());
                m23617b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static final String m23618c(String str) {
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

    /* renamed from: d */
    public static void m23619d(i96 i96, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : i96.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith(ai2.f25857a) && !substring.endsWith(ai2.f25858b) && !substring.equals(ai2.f25857a)) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m23617b(sb, i, m23618c(concat), e56.m13587f(method2, i96, new Object[0]));
                }
            }
            if (substring.endsWith(ai2.f25859c) && !substring.equals(ai2.f25859c)) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m23617b(sb, i, m23618c(concat2), e56.m13587f(method3, i96, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith(ai2.f25860d) || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object f = e56.m13587f(method4, i96, new Object[0]);
                    if (method5 == null) {
                        if (f instanceof Boolean) {
                            if (!((Boolean) f).booleanValue()) {
                            }
                        } else if (f instanceof Integer) {
                            if (((Integer) f).intValue() == 0) {
                            }
                        } else if (f instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) f).floatValue()) == 0) {
                            }
                        } else if (!(f instanceof Double)) {
                            if (f instanceof String) {
                                obj = "";
                            } else if (f instanceof i36) {
                                obj = i36.f13476a;
                            } else if (f instanceof i96) {
                                if (f == ((i96) f).mo15049a()) {
                                }
                            } else if ((f instanceof Enum) && ((Enum) f).ordinal() == 0) {
                            }
                            if (f.equals(obj)) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) f).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) e56.m13587f(method5, i96, new Object[0])).booleanValue()) {
                    }
                    m23617b(sb, i, m23618c(concat3), f);
                }
            }
        }
        if (!(i96 instanceof b56)) {
            od6 od6 = ((e56) i96).zzc;
            if (od6 != null) {
                od6.mo21899e(sb, i);
                return;
            }
            return;
        }
        b56 b56 = (b56) i96;
        throw null;
    }
}
