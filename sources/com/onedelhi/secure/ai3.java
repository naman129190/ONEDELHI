package com.onedelhi.secure;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ai3 {

    /* renamed from: b */
    public static final int f9070b = 0;

    /* renamed from: b */
    public static final String f9071b = "android.remoteinput.results";

    /* renamed from: c */
    public static final int f9072c = 1;

    /* renamed from: c */
    public static final String f9073c = "android.remoteinput.resultsData";

    /* renamed from: d */
    public static final int f9074d = 0;

    /* renamed from: d */
    public static final String f9075d = "android.remoteinput.dataTypeResultsData";

    /* renamed from: e */
    public static final int f9076e = 1;

    /* renamed from: e */
    public static final String f9077e = "android.remoteinput.resultsSource";

    /* renamed from: f */
    public static final int f9078f = 2;

    /* renamed from: a */
    public final int f9079a;

    /* renamed from: a */
    public final Bundle f9080a;

    /* renamed from: a */
    public final CharSequence f9081a;

    /* renamed from: a */
    public final String f9082a;

    /* renamed from: a */
    public final Set<String> f9083a;

    /* renamed from: a */
    public final boolean f9084a;

    /* renamed from: a */
    public final CharSequence[] f9085a;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.ai3$a */
    public static class C1699a {
        @pn0
        /* renamed from: a */
        public static ClipData m11201a(Intent intent) {
            return intent.getClipData();
        }

        @pn0
        /* renamed from: b */
        public static void m11202b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    @sj3(20)
    /* renamed from: com.onedelhi.secure.ai3$b */
    public static class C1700b {
        @pn0
        /* renamed from: a */
        public static void m11203a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m11204b(ai3 ai3) {
            Set<String> g;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(ai3.mo13099o()).setLabel(ai3.mo13098n()).setChoices(ai3.mo13095h()).setAllowFreeFormInput(ai3.mo13093f()).addExtras(ai3.mo13097m());
            if (Build.VERSION.SDK_INT >= 26 && (g = ai3.mo13094g()) != null) {
                for (String d : g) {
                    C1701c.m11210d(addExtras, d, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C1703e.m11214b(addExtras, ai3.mo13096k());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static ai3 m11205c(Object obj) {
            Set<String> b;
            RemoteInput remoteInput = (RemoteInput) obj;
            C1704f a = new C1704f(remoteInput.getResultKey()).mo13108h(remoteInput.getLabel()).mo13106f(remoteInput.getChoices()).mo13105e(remoteInput.getAllowFreeFormInput()).mo13101a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b = C1701c.m11208b(remoteInput)) != null) {
                for (String d : b) {
                    a.mo13104d(d, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.mo13107g(C1703e.m11213a(remoteInput));
            }
            return a.mo13102b();
        }

        @pn0
        /* renamed from: d */
        public static Bundle m11206d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.ai3$c */
    public static class C1701c {
        @pn0
        /* renamed from: a */
        public static void m11207a(ai3 ai3, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(ai3.m11184c(ai3), intent, map);
        }

        @pn0
        /* renamed from: b */
        public static Set<String> m11208b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @pn0
        /* renamed from: c */
        public static Map<String, Uri> m11209c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @pn0
        /* renamed from: d */
        public static RemoteInput.Builder m11210d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.ai3$d */
    public static class C1702d {
        @pn0
        /* renamed from: a */
        public static int m11211a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @pn0
        /* renamed from: b */
        public static void m11212b(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.ai3$e */
    public static class C1703e {
        @pn0
        /* renamed from: a */
        public static int m11213a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @pn0
        /* renamed from: b */
        public static RemoteInput.Builder m11214b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* renamed from: com.onedelhi.secure.ai3$f */
    public static final class C1704f {

        /* renamed from: a */
        public int f9086a = 0;

        /* renamed from: a */
        public final Bundle f9087a = new Bundle();

        /* renamed from: a */
        public CharSequence f9088a;

        /* renamed from: a */
        public final String f9089a;

        /* renamed from: a */
        public final Set<String> f9090a = new HashSet();

        /* renamed from: a */
        public boolean f9091a = true;

        /* renamed from: a */
        public CharSequence[] f9092a;

        public C1704f(@mr2 String str) {
            if (str != null) {
                this.f9089a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @mr2
        /* renamed from: a */
        public C1704f mo13101a(@mr2 Bundle bundle) {
            if (bundle != null) {
                this.f9087a.putAll(bundle);
            }
            return this;
        }

        @mr2
        /* renamed from: b */
        public ai3 mo13102b() {
            return new ai3(this.f9089a, this.f9088a, this.f9092a, this.f9091a, this.f9086a, this.f9087a, this.f9090a);
        }

        @mr2
        /* renamed from: c */
        public Bundle mo13103c() {
            return this.f9087a;
        }

        @mr2
        /* renamed from: d */
        public C1704f mo13104d(@mr2 String str, boolean z) {
            if (z) {
                this.f9090a.add(str);
            } else {
                this.f9090a.remove(str);
            }
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1704f mo13105e(boolean z) {
            this.f9091a = z;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1704f mo13106f(@ts2 CharSequence[] charSequenceArr) {
            this.f9092a = charSequenceArr;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1704f mo13107g(int i) {
            this.f9086a = i;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1704f mo13108h(@ts2 CharSequence charSequence) {
            this.f9088a = charSequence;
            return this;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.ai3$g */
    public @interface C1705g {
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.ai3$h */
    public @interface C1706h {
    }

    public ai3(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f9082a = str;
        this.f9081a = charSequence;
        this.f9085a = charSequenceArr;
        this.f9084a = z;
        this.f9079a = i;
        this.f9080a = bundle;
        this.f9083a = set;
        if (mo13096k() == 2 && !mo13093f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static void m11182a(@mr2 ai3 ai3, @mr2 Intent intent, @mr2 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1701c.m11207a(ai3, intent, map);
            return;
        }
        Intent i = m11187i(intent);
        if (i == null) {
            i = new Intent();
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Uri uri = (Uri) next.getValue();
            if (str != null) {
                Bundle bundleExtra = i.getBundleExtra(m11189l(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(ai3.mo13099o(), uri.toString());
                i.putExtra(m11189l(str), bundleExtra);
            }
        }
        C1699a.m11202b(intent, ClipData.newIntent(f9071b, i));
    }

    /* renamed from: b */
    public static void m11183b(@mr2 ai3[] ai3Arr, @mr2 Intent intent, @mr2 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1700b.m11203a(m11185d(ai3Arr), intent, bundle);
            return;
        }
        Bundle p = m11190p(intent);
        int q = m11191q(intent);
        if (p != null) {
            p.putAll(bundle);
            bundle = p;
        }
        for (ai3 ai3 : ai3Arr) {
            Map<String, Uri> j = m11188j(intent, ai3.mo13099o());
            C1700b.m11203a(m11185d(new ai3[]{ai3}), intent, bundle);
            if (j != null) {
                m11182a(ai3, intent, j);
            }
        }
        m11192s(intent, q);
    }

    @sj3(20)
    /* renamed from: c */
    public static RemoteInput m11184c(ai3 ai3) {
        return C1700b.m11204b(ai3);
    }

    @sj3(20)
    /* renamed from: d */
    public static RemoteInput[] m11185d(ai3[] ai3Arr) {
        if (ai3Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[ai3Arr.length];
        for (int i = 0; i < ai3Arr.length; i++) {
            remoteInputArr[i] = m11184c(ai3Arr[i]);
        }
        return remoteInputArr;
    }

    @sj3(20)
    /* renamed from: e */
    public static ai3 m11186e(RemoteInput remoteInput) {
        return C1700b.m11205c(remoteInput);
    }

    @sj3(16)
    /* renamed from: i */
    public static Intent m11187i(Intent intent) {
        ClipData a = C1699a.m11201a(intent);
        if (a == null) {
            return null;
        }
        ClipDescription description = a.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f9071b)) {
            return a.getItemAt(0).getIntent();
        }
        return null;
    }

    @ts2
    /* renamed from: j */
    public static Map<String, Uri> m11188j(@mr2 Intent intent, @mr2 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return C1701c.m11209c(intent, str);
        }
        Intent i = m11187i(intent);
        if (i == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i.getExtras().keySet()) {
            if (str2.startsWith(f9075d)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* renamed from: l */
    public static String m11189l(String str) {
        return f9075d + str;
    }

    @ts2
    /* renamed from: p */
    public static Bundle m11190p(@mr2 Intent intent) {
        return C1700b.m11206d(intent);
    }

    /* renamed from: q */
    public static int m11191q(@mr2 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1702d.m11211a(intent);
        }
        Intent i = m11187i(intent);
        if (i == null) {
            return 0;
        }
        return i.getExtras().getInt(f9077e, 0);
    }

    /* renamed from: s */
    public static void m11192s(@mr2 Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1702d.m11212b(intent, i);
            return;
        }
        Intent i2 = m11187i(intent);
        if (i2 == null) {
            i2 = new Intent();
        }
        i2.putExtra(f9077e, i);
        C1699a.m11202b(intent, ClipData.newIntent(f9071b, i2));
    }

    /* renamed from: f */
    public boolean mo13093f() {
        return this.f9084a;
    }

    @ts2
    /* renamed from: g */
    public Set<String> mo13094g() {
        return this.f9083a;
    }

    @ts2
    /* renamed from: h */
    public CharSequence[] mo13095h() {
        return this.f9085a;
    }

    /* renamed from: k */
    public int mo13096k() {
        return this.f9079a;
    }

    @mr2
    /* renamed from: m */
    public Bundle mo13097m() {
        return this.f9080a;
    }

    @ts2
    /* renamed from: n */
    public CharSequence mo13098n() {
        return this.f9081a;
    }

    @mr2
    /* renamed from: o */
    public String mo13099o() {
        return this.f9082a;
    }

    /* renamed from: r */
    public boolean mo13100r() {
        return !mo13093f() && (mo13095h() == null || mo13095h().length == 0) && mo13094g() != null && !mo13094g().isEmpty();
    }
}
