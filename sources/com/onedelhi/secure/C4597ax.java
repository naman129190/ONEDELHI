package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;

/* renamed from: com.onedelhi.secure.ax */
public enum C4597ax {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{CharsetNames.UTF_16BE, "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{CharsetNames.US_ASCII}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{g54.f28951c, "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: a */
    public static final Map<Integer, C4597ax> f26015a = null;

    /* renamed from: b */
    public static final Map<String, C4597ax> f26018b = null;

    /* renamed from: a */
    public final int[] f26043a;

    /* renamed from: a */
    public final String[] f26044a;

    /* access modifiers changed from: public */
    static {
        f26015a = new HashMap();
        f26018b = new HashMap();
        for (C4597ax axVar : values()) {
            for (int valueOf : axVar.f26043a) {
                f26015a.put(Integer.valueOf(valueOf), axVar);
            }
            f26018b.put(axVar.name(), axVar);
            for (String put : axVar.f26044a) {
                f26018b.put(put, axVar);
            }
        }
    }

    /* access modifiers changed from: public */
    C4597ax(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    /* access modifiers changed from: public */
    C4597ax(int i, String... strArr) {
        this.f26043a = new int[]{i};
        this.f26044a = strArr;
    }

    /* access modifiers changed from: public */
    C4597ax(int[] iArr, String... strArr) {
        this.f26043a = iArr;
        this.f26044a = strArr;
    }

    /* renamed from: a */
    public static C4597ax m39174a(String str) {
        return f26018b.get(str);
    }

    /* renamed from: b */
    public static C4597ax m39175b(int i) throws ha1 {
        if (i >= 0 && i < 900) {
            return f26015a.get(Integer.valueOf(i));
        }
        throw ha1.m50341a();
    }

    /* renamed from: e */
    public int mo31241e() {
        return this.f26043a[0];
    }
}
