package com.onedelhi.secure;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class z91 {

    /* renamed from: a */
    public static final int f23497a = 400;

    /* renamed from: b */
    public static final int f23498b = 1;

    /* renamed from: c */
    public static final int f23499c = 0;

    /* renamed from: d */
    public static final int f23500d = 1;

    /* renamed from: e */
    public static final int f23501e = -1;

    /* renamed from: f */
    public static final int f23502f = 500;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.z91$a */
    public static class C4050a {
        @pn0
        /* renamed from: a */
        public static int m32943a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: com.onedelhi.secure.z91$b */
    public interface C4051b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.z91$c */
    public @interface C4052c {
    }

    /* renamed from: com.onedelhi.secure.z91$d */
    public static final class C4053d implements C4051b {
        @mr2

        /* renamed from: a */
        public final C4054e[] f23503a;

        public C4053d(@mr2 C4054e[] eVarArr) {
            this.f23503a = eVarArr;
        }

        @mr2
        /* renamed from: a */
        public C4054e[] mo27843a() {
            return this.f23503a;
        }
    }

    /* renamed from: com.onedelhi.secure.z91$e */
    public static final class C4054e {

        /* renamed from: a */
        public final int f23504a;
        @mr2

        /* renamed from: a */
        public final String f23505a;

        /* renamed from: a */
        public final boolean f23506a;

        /* renamed from: b */
        public final int f23507b;

        /* renamed from: b */
        public final String f23508b;

        /* renamed from: c */
        public final int f23509c;

        public C4054e(@mr2 String str, int i, boolean z, @ts2 String str2, int i2, int i3) {
            this.f23505a = str;
            this.f23504a = i;
            this.f23506a = z;
            this.f23508b = str2;
            this.f23507b = i2;
            this.f23509c = i3;
        }

        @mr2
        /* renamed from: a */
        public String mo27844a() {
            return this.f23505a;
        }

        /* renamed from: b */
        public int mo27845b() {
            return this.f23509c;
        }

        /* renamed from: c */
        public int mo27846c() {
            return this.f23507b;
        }

        @ts2
        /* renamed from: d */
        public String mo27847d() {
            return this.f23508b;
        }

        /* renamed from: e */
        public int mo27848e() {
            return this.f23504a;
        }

        /* renamed from: f */
        public boolean mo27849f() {
            return this.f23506a;
        }
    }

    /* renamed from: com.onedelhi.secure.z91$f */
    public static final class C4055f implements C4051b {

        /* renamed from: a */
        public final int f23510a;
        @mr2

        /* renamed from: a */
        public final u91 f23511a;
        @ts2

        /* renamed from: a */
        public final String f23512a;

        /* renamed from: b */
        public final int f23513b;

        public C4055f(@mr2 u91 u91, int i, int i2) {
            this(u91, i, i2, (String) null);
        }

        @hl3({hl3.C2354a.LIBRARY})
        public C4055f(@mr2 u91 u91, int i, int i2, @ts2 String str) {
            this.f23511a = u91;
            this.f23513b = i;
            this.f23510a = i2;
            this.f23512a = str;
        }

        /* renamed from: a */
        public int mo27850a() {
            return this.f23513b;
        }

        @mr2
        /* renamed from: b */
        public u91 mo27851b() {
            return this.f23511a;
        }

        @ts2
        @hl3({hl3.C2354a.LIBRARY})
        /* renamed from: c */
        public String mo27852c() {
            return this.f23512a;
        }

        /* renamed from: d */
        public int mo27853d() {
            return this.f23510a;
        }
    }

    /* renamed from: a */
    public static int m32935a(TypedArray typedArray, int i) {
        return C4050a.m32943a(typedArray, i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.ts2
    /* renamed from: b */
    public static com.onedelhi.secure.z91.C4051b m32936b(@com.onedelhi.secure.mr2 org.xmlpull.v1.XmlPullParser r3, @com.onedelhi.secure.mr2 android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            com.onedelhi.secure.z91$b r3 = m32938d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z91.m32936b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):com.onedelhi.secure.z91$b");
    }

    @mr2
    /* renamed from: c */
    public static List<List<byte[]>> m32937c(@mr2 Resources resources, @C3483sa int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m32935a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m32942h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m32942h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @ts2
    /* renamed from: d */
    public static C4051b m32938d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m32939e(xmlPullParser, resources);
        }
        m32941g(xmlPullParser);
        return null;
    }

    @ts2
    /* renamed from: e */
    public static C4051b m32939e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), nd3.C2974j.FontFamily);
        String string = obtainAttributes.getString(nd3.C2974j.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(nd3.C2974j.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(nd3.C2974j.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(nd3.C2974j.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(nd3.C2974j.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(nd3.C2974j.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(nd3.C2974j.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m32940f(xmlPullParser, resources));
                    } else {
                        m32941g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C4053d((C4054e[]) arrayList.toArray(new C4054e[0]));
        }
        while (xmlPullParser.next() != 3) {
            m32941g(xmlPullParser);
        }
        return new C4055f(new u91(string, string2, string3, m32937c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    public static C4054e m32940f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), nd3.C2974j.FontFamilyFont);
        int i = nd3.C2974j.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = nd3.C2974j.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = nd3.C2974j.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = nd3.C2974j.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = nd3.C2974j.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = nd3.C2974j.FontFamilyFont_android_ttcIndex;
        }
        int i5 = nd3.C2974j.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = nd3.C2974j.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = nd3.C2974j.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = nd3.C2974j.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m32941g(xmlPullParser);
        }
        return new C4054e(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    public static void m32941g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m32942h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
