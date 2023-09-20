package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class hr4 extends rl3 {

    /* renamed from: d */
    public static final Pattern f29753d = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: e */
    public static final Pattern f29754e = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: f */
    public static final Pattern f29755f = Pattern.compile("\r\n[ \t]");

    /* renamed from: g */
    public static final Pattern f29756g = Pattern.compile("\\\\[nN]");

    /* renamed from: h */
    public static final Pattern f29757h = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: i */
    public static final Pattern f29758i = Pattern.compile(a13.f25713a);

    /* renamed from: j */
    public static final Pattern f29759j = Pattern.compile(";");

    /* renamed from: k */
    public static final Pattern f29760k = Pattern.compile("(?<!\\\\);+");

    /* renamed from: l */
    public static final Pattern f29761l = Pattern.compile(vf4.f36537c);

    /* renamed from: m */
    public static final Pattern f29762m = Pattern.compile("[;,]");

    /* renamed from: A */
    public static String[] m50847A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List next : collection) {
            String str2 = (String) next.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i = 1;
                while (true) {
                    if (i >= next.size()) {
                        str = null;
                        break;
                    }
                    str = (String) next.get(i);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    } else {
                        i++;
                    }
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(rl3.f34675a);
    }

    /* renamed from: q */
    public static String m50848q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (!(charAt2 == 10 || charAt2 == 13)) {
                if (charAt2 != '=') {
                    m50854w(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (!(i >= length - 2 || (charAt = charSequence.charAt(i + 1)) == 13 || charAt == 10)) {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int l = rl3.m63731l(charAt);
                    int l2 = rl3.m63731l(charAt3);
                    if (l >= 0 && l2 >= 0) {
                        byteArrayOutputStream.write((l << 4) + l2);
                    }
                }
            }
            i++;
        }
        m50854w(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: r */
    public static void m50849r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List next : iterable) {
                String str = (String) next.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m50853v(strArr, 3, sb);
                m50853v(strArr, 1, sb);
                m50853v(strArr, 2, sb);
                m50853v(strArr, 0, sb);
                m50853v(strArr, 4, sb);
                next.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: s */
    public static boolean m50850s(CharSequence charSequence) {
        return charSequence == null || f29754e.matcher(charSequence).matches();
    }

    /* renamed from: t */
    public static List<String> m50851t(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> u = m50852u(charSequence, str, z, z2);
        if (u == null || u.isEmpty()) {
            return null;
        }
        return u.get(0);
    }

    /* renamed from: u */
    public static List<List<String>> m50852u(CharSequence charSequence, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        boolean z3;
        ArrayList arrayList;
        int indexOf;
        String str4;
        String str5 = str;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < length) {
            int i3 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + charSequence + "(?:;([^:]*))?:", 2).matcher(str5);
            if (i2 > 0) {
                i2--;
            }
            if (!matcher.find(i2)) {
                break;
            }
            int end = matcher.end(i);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f29759j.split(group);
                int length2 = split.length;
                int i4 = 0;
                arrayList = null;
                z3 = false;
                str3 = null;
                str2 = null;
                while (i4 < length2) {
                    String str6 = split[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str6);
                    String[] split2 = f29758i.split(str6, i3);
                    if (split2.length > 1) {
                        String str7 = split2[0];
                        String str8 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str7) && "QUOTED-PRINTABLE".equalsIgnoreCase(str8)) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str7)) {
                            str3 = str8;
                        } else if ("VALUE".equalsIgnoreCase(str7)) {
                            str2 = str8;
                        }
                    }
                    i4++;
                    i3 = 2;
                }
            } else {
                arrayList = null;
                z3 = false;
                str3 = null;
                str2 = null;
            }
            int i5 = end;
            while (true) {
                indexOf = str5.indexOf(10, i5);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i6 = indexOf + 1;
                    if (str5.charAt(i6) == ' ' || str5.charAt(i6) == 9) {
                        i5 = indexOf + 2;
                    }
                }
                if (!z3) {
                    break;
                }
                if (indexOf <= 0 || str5.charAt(indexOf - 1) != '=') {
                    if (indexOf >= 2) {
                        if (str5.charAt(indexOf - 2) != '=') {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5 = indexOf + 1;
            }
            if (indexOf < 0) {
                i2 = length;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf > 0 && str5.charAt(indexOf - 1) == 13) {
                        indexOf--;
                    }
                    String substring = str5.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (z3) {
                        str4 = m50848q(substring, str3);
                        if (z2) {
                            str4 = f29760k.matcher(str4).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            substring = f29760k.matcher(substring).replaceAll("\n").trim();
                        }
                        str4 = f29757h.matcher(f29756g.matcher(f29755f.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str2)) {
                        try {
                            str4 = URI.create(str4).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(str4);
                        arrayList2.add(arrayList3);
                    } else {
                        arrayList.add(0, str4);
                        arrayList2.add(arrayList);
                        i2 = indexOf + 1;
                    }
                }
                i2 = indexOf + 1;
            }
            i = 0;
        }
        return arrayList2;
    }

    /* renamed from: v */
    public static void m50853v(String[] strArr, int i, StringBuilder sb) {
        if (strArr[i] != null && !strArr[i].isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i]);
        }
    }

    /* renamed from: w */
    public static void m50854w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: y */
    public static String m50855y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: z */
    public static String[] m50856z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = (String) list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(rl3.f34675a);
    }

    /* renamed from: x */
    public C4620b4 mo30463k(ol3 ol3) {
        String c = rl3.m63723c(ol3);
        Matcher matcher = f29753d.matcher(c);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u = m50852u("FN", c, true, false);
        if (u == null) {
            u = m50852u("N", c, true, false);
            m50849r(u);
        }
        List<String> t = m50851t("NICKNAME", c, true, false);
        String[] split = t == null ? null : f29761l.split(t.get(0));
        List<List<String>> u2 = m50852u("TEL", c, true, false);
        List<List<String>> u3 = m50852u("EMAIL", c, true, false);
        List<String> t2 = m50851t("NOTE", c, false, false);
        List<List<String>> u4 = m50852u("ADR", c, true, true);
        List<String> t3 = m50851t("ORG", c, true, true);
        List<String> t4 = m50851t("BDAY", c, true, false);
        List<String> list = (t4 == null || m50850s(t4.get(0))) ? t4 : null;
        List<String> t5 = m50851t("TITLE", c, true, false);
        List<List<String>> u5 = m50852u("URL", c, true, false);
        List<String> t6 = m50851t("IMPP", c, true, false);
        List<String> t7 = m50851t("GEO", c, true, false);
        String[] split2 = t7 == null ? null : f29762m.split(t7.get(0));
        return new C4620b4(m50856z(u), split, (String) null, m50856z(u2), m50847A(u2), m50856z(u3), m50847A(u3), m50855y(t6), m50855y(t2), m50856z(u4), m50847A(u4), m50855y(t3), m50855y(list), m50855y(t5), m50856z(u5), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
