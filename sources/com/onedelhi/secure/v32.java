package com.onedelhi.secure;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v32 {

    /* renamed from: a */
    public static final Comparator<C3761b> f21638a = u32.f35958a;

    /* renamed from: a */
    public static final String[] f21639a = new String[0];

    @sj3(24)
    /* renamed from: com.onedelhi.secure.v32$a */
    public static class C3760a {
        @pn0
        /* renamed from: a */
        public static void m29797a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @pn0
        /* renamed from: b */
        public static boolean m29798b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* renamed from: com.onedelhi.secure.v32$b */
    public static class C3761b {

        /* renamed from: a */
        public int f21640a;

        /* renamed from: a */
        public URLSpan f21641a;

        /* renamed from: a */
        public String f21642a;

        /* renamed from: b */
        public int f21643b;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.v32$c */
    public @interface C3762c {
    }

    /* renamed from: b */
    public static void m29780b(@mr2 TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public static void m29781c(@mr2 TextView textView, @mr2 Pattern pattern, @ts2 String str) {
        if (m29796r()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            m29783e(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    /* renamed from: d */
    public static void m29782d(@mr2 TextView textView, @mr2 Pattern pattern, @ts2 String str, @ts2 Linkify.MatchFilter matchFilter, @ts2 Linkify.TransformFilter transformFilter) {
        if (m29796r()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            m29783e(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    /* renamed from: e */
    public static void m29783e(@mr2 TextView textView, @mr2 Pattern pattern, @ts2 String str, @ts2 String[] strArr, @ts2 Linkify.MatchFilter matchFilter, @ts2 Linkify.TransformFilter transformFilter) {
        if (m29796r()) {
            C3760a.m29797a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (m29787i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            m29780b(textView);
        }
    }

    /* renamed from: f */
    public static boolean m29784f(@mr2 Spannable spannable, int i) {
        if (m29796r()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m29791m(arrayList, spannable, i03.f13399e, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (Linkify.TransformFilter) null);
        }
        if ((i & 2) != 0) {
            m29791m(arrayList, spannable, i03.f13401f, new String[]{tb2.f20728a}, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
        if ((i & 8) != 0) {
            m29792n(arrayList, spannable);
        }
        m29795q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3761b bVar = (C3761b) it.next();
            if (bVar.f21641a == null) {
                m29789k(bVar.f21642a, bVar.f21640a, bVar.f21643b, spannable);
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m29785g(@mr2 Spannable spannable, @mr2 Pattern pattern, @ts2 String str) {
        return m29796r() ? Linkify.addLinks(spannable, pattern, str) : m29787i(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    /* renamed from: h */
    public static boolean m29786h(@mr2 Spannable spannable, @mr2 Pattern pattern, @ts2 String str, @ts2 Linkify.MatchFilter matchFilter, @ts2 Linkify.TransformFilter transformFilter) {
        return m29796r() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : m29787i(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    /* renamed from: i */
    public static boolean m29787i(@mr2 Spannable spannable, @mr2 Pattern pattern, @ts2 String str, @ts2 String[] strArr, @ts2 Linkify.MatchFilter matchFilter, @ts2 Linkify.TransformFilter transformFilter) {
        if (m29796r()) {
            return C3760a.m29798b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f21639a;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            strArr2[i] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                m29789k(m29794p(group, strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public static boolean m29788j(@mr2 TextView textView, int i) {
        if (m29796r()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (m29784f(valueOf, i)) {
                m29780b(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (m29784f((Spannable) text, i)) {
            m29780b(textView);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static void m29789k(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* renamed from: l */
    public static String m29790l(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : k31.m19415c(str);
    }

    /* renamed from: m */
    public static void m29791m(ArrayList<C3761b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) && group != null) {
                C3761b bVar = new C3761b();
                bVar.f21642a = m29794p(group, strArr, matcher, transformFilter);
                bVar.f21640a = start;
                bVar.f21643b = end;
                arrayList.add(bVar);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:14:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29792n(java.util.ArrayList<com.onedelhi.secure.v32.C3761b> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = m29790l(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            com.onedelhi.secure.v32$b r3 = new com.onedelhi.secure.v32$b     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f21640a = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.f21643b = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.f21642a = r1     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r5.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.v32.m29792n(java.util.ArrayList, android.text.Spannable):void");
    }

    /* renamed from: o */
    public static /* synthetic */ int m29793o(C3761b bVar, C3761b bVar2) {
        int i = bVar.f21640a;
        int i2 = bVar2.f21640a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(bVar2.f21643b, bVar.f21643b);
    }

    /* renamed from: p */
    public static String m29794p(@mr2 String str, @mr2 String[] strArr, Matcher matcher, @ts2 Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    /* renamed from: q */
    public static void m29795q(ArrayList<C3761b> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C3761b bVar = new C3761b();
            bVar.f21641a = uRLSpan;
            bVar.f21640a = spannable.getSpanStart(uRLSpan);
            bVar.f21643b = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f21638a);
        int size = arrayList.size();
        while (i2 < size - 1) {
            C3761b bVar2 = arrayList.get(i2);
            int i3 = i2 + 1;
            C3761b bVar3 = arrayList.get(i3);
            int i4 = bVar2.f21640a;
            int i5 = bVar3.f21640a;
            if (i4 <= i5 && (i = bVar2.f21643b) > i5) {
                int i6 = bVar3.f21643b;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    URLSpan uRLSpan2 = arrayList.get(i7).f21641a;
                    if (uRLSpan2 != null) {
                        spannable.removeSpan(uRLSpan2);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: r */
    public static boolean m29796r() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
