package com.onedelhi.secure;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\"\u0018\u0010\f\u001a\u00020\u0000*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "", "b", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lcom/onedelhi/secure/q21;", "f", "beginIndex", "endIndex", "e", "c", "(Ljava/io/File;)Ljava/lang/String;", "rootName", "a", "(Ljava/io/File;)Ljava/io/File;", "root", "", "d", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/io/FilesKt")
public class a31 {
    @vr2
    /* renamed from: a */
    public static final File m36045a(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        return new File(m36047c(file));
    }

    /* renamed from: b */
    public static final int m36046b(String str) {
        char c;
        int q3;
        int q32 = u54.m66666q3(str, File.separatorChar, 0, false, 4, (Object) null);
        if (q32 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (q3 = u54.m66666q3(str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int q33 = u54.m66666q3(str, File.separatorChar, q3 + 1, false, 4, (Object) null);
            return q33 >= 0 ? q33 + 1 : str.length();
        } else if (q32 > 0 && str.charAt(q32 - 1) == ':') {
            return q32 + 1;
        } else {
            if (q32 != -1 || !u54.m66618a3(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    @vr2
    /* renamed from: c */
    public static final String m36047c(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        String path = file.getPath();
        jt1.m53776o(path, "path");
        String path2 = file.getPath();
        jt1.m53776o(path2, "path");
        String substring = path.substring(0, m36046b(path2));
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static final boolean m36048d(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        String path = file.getPath();
        jt1.m53776o(path, "path");
        return m36046b(path) > 0;
    }

    @vr2
    /* renamed from: e */
    public static final File m36049e(@vr2 File file, int i, int i2) {
        jt1.m53777p(file, "<this>");
        return m36050f(file).mo43093j(i, i2);
    }

    @vr2
    /* renamed from: f */
    public static final q21 m36050f(@vr2 File file) {
        List list;
        jt1.m53777p(file, "<this>");
        String path = file.getPath();
        jt1.m53776o(path, "path");
        int b = m36046b(path);
        String substring = path.substring(0, b);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(b);
        jt1.m53776o(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = s00.m64037F();
        } else {
            List<String> S4 = u54.m66592S4(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(t00.m65073Z(S4, 10));
            for (String file2 : S4) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new q21(new File(substring), list);
    }
}
