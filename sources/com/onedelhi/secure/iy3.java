package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class iy3 {

    /* renamed from: c */
    public static final String f13904c = "extraPersonCount";

    /* renamed from: d */
    public static final int f13905d = 1;

    /* renamed from: d */
    public static final String f13906d = "extraPerson_";

    /* renamed from: e */
    public static final String f13907e = "extraLocusId";

    /* renamed from: f */
    public static final String f13908f = "extraLongLived";

    /* renamed from: g */
    public static final String f13909g = "extraSliceUri";

    /* renamed from: a */
    public int f13910a;

    /* renamed from: a */
    public long f13911a;

    /* renamed from: a */
    public ComponentName f13912a;

    /* renamed from: a */
    public Context f13913a;

    /* renamed from: a */
    public Bundle f13914a;

    /* renamed from: a */
    public PersistableBundle f13915a;

    /* renamed from: a */
    public UserHandle f13916a;

    /* renamed from: a */
    public IconCompat f13917a;
    @ts2

    /* renamed from: a */
    public t82 f13918a;

    /* renamed from: a */
    public CharSequence f13919a;

    /* renamed from: a */
    public String f13920a;

    /* renamed from: a */
    public Set<String> f13921a;

    /* renamed from: a */
    public boolean f13922a;

    /* renamed from: a */
    public Intent[] f13923a;

    /* renamed from: a */
    public s13[] f13924a;

    /* renamed from: b */
    public int f13925b;

    /* renamed from: b */
    public CharSequence f13926b;

    /* renamed from: b */
    public String f13927b;

    /* renamed from: b */
    public boolean f13928b;

    /* renamed from: c */
    public int f13929c;

    /* renamed from: c */
    public CharSequence f13930c;

    /* renamed from: c */
    public boolean f13931c;

    /* renamed from: d */
    public boolean f13932d;

    /* renamed from: e */
    public boolean f13933e;

    /* renamed from: f */
    public boolean f13934f;

    /* renamed from: g */
    public boolean f13935g;

    /* renamed from: h */
    public boolean f13936h = true;

    /* renamed from: i */
    public boolean f13937i;

    /* renamed from: com.onedelhi.secure.iy3$a */
    public static class C2463a {

        /* renamed from: a */
        public Uri f13938a;

        /* renamed from: a */
        public final iy3 f13939a;

        /* renamed from: a */
        public Map<String, Map<String, List<String>>> f13940a;

        /* renamed from: a */
        public Set<String> f13941a;

        /* renamed from: a */
        public boolean f13942a;

        @sj3(25)
        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        public C2463a(@mr2 Context context, @mr2 ShortcutInfo shortcutInfo) {
            iy3 iy3 = new iy3();
            this.f13939a = iy3;
            iy3.f13913a = context;
            iy3.f13920a = shortcutInfo.getId();
            iy3.f13927b = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            iy3.f13923a = (Intent[]) Arrays.copyOf(intents, intents.length);
            iy3.f13912a = shortcutInfo.getActivity();
            iy3.f13919a = shortcutInfo.getShortLabel();
            iy3.f13926b = shortcutInfo.getLongLabel();
            iy3.f13930c = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            iy3.f13925b = i >= 28 ? shortcutInfo.getDisabledReason() : shortcutInfo.isEnabled() ? 0 : 3;
            iy3.f13921a = shortcutInfo.getCategories();
            iy3.f13924a = iy3.m17988u(shortcutInfo.getExtras());
            iy3.f13916a = shortcutInfo.getUserHandle();
            iy3.f13911a = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                iy3.f13931c = shortcutInfo.isCached();
            }
            iy3.f13932d = shortcutInfo.isDynamic();
            iy3.f13933e = shortcutInfo.isPinned();
            iy3.f13934f = shortcutInfo.isDeclaredInManifest();
            iy3.f13935g = shortcutInfo.isImmutable();
            iy3.f13936h = shortcutInfo.isEnabled();
            iy3.f13937i = shortcutInfo.hasKeyFieldsOnly();
            iy3.f13918a = iy3.m17985p(shortcutInfo);
            iy3.f13910a = shortcutInfo.getRank();
            iy3.f13915a = shortcutInfo.getExtras();
        }

        public C2463a(@mr2 Context context, @mr2 String str) {
            iy3 iy3 = new iy3();
            this.f13939a = iy3;
            iy3.f13913a = context;
            iy3.f13920a = str;
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        public C2463a(@mr2 iy3 iy3) {
            iy3 iy32 = new iy3();
            this.f13939a = iy32;
            iy32.f13913a = iy3.f13913a;
            iy32.f13920a = iy3.f13920a;
            iy32.f13927b = iy3.f13927b;
            Intent[] intentArr = iy3.f13923a;
            iy32.f13923a = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            iy32.f13912a = iy3.f13912a;
            iy32.f13919a = iy3.f13919a;
            iy32.f13926b = iy3.f13926b;
            iy32.f13930c = iy3.f13930c;
            iy32.f13925b = iy3.f13925b;
            iy32.f13917a = iy3.f13917a;
            iy32.f13922a = iy3.f13922a;
            iy32.f13916a = iy3.f13916a;
            iy32.f13911a = iy3.f13911a;
            iy32.f13931c = iy3.f13931c;
            iy32.f13932d = iy3.f13932d;
            iy32.f13933e = iy3.f13933e;
            iy32.f13934f = iy3.f13934f;
            iy32.f13935g = iy3.f13935g;
            iy32.f13936h = iy3.f13936h;
            iy32.f13918a = iy3.f13918a;
            iy32.f13928b = iy3.f13928b;
            iy32.f13937i = iy3.f13937i;
            iy32.f13910a = iy3.f13910a;
            s13[] s13Arr = iy3.f13924a;
            if (s13Arr != null) {
                iy32.f13924a = (s13[]) Arrays.copyOf(s13Arr, s13Arr.length);
            }
            if (iy3.f13921a != null) {
                iy32.f13921a = new HashSet(iy3.f13921a);
            }
            PersistableBundle persistableBundle = iy3.f13915a;
            if (persistableBundle != null) {
                iy32.f13915a = persistableBundle;
            }
            iy32.f13929c = iy3.f13929c;
        }

        @mr2
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* renamed from: a */
        public C2463a mo18042a(@mr2 String str) {
            if (this.f13941a == null) {
                this.f13941a = new HashSet();
            }
            this.f13941a.add(str);
            return this;
        }

        @mr2
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* renamed from: b */
        public C2463a mo18043b(@mr2 String str, @mr2 String str2, @mr2 List<String> list) {
            mo18042a(str);
            if (!list.isEmpty()) {
                if (this.f13940a == null) {
                    this.f13940a = new HashMap();
                }
                if (this.f13940a.get(str) == null) {
                    this.f13940a.put(str, new HashMap());
                }
                this.f13940a.get(str).put(str2, list);
            }
            return this;
        }

        @mr2
        /* renamed from: c */
        public iy3 mo18044c() {
            if (!TextUtils.isEmpty(this.f13939a.f13919a)) {
                iy3 iy3 = this.f13939a;
                Intent[] intentArr = iy3.f13923a;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f13942a) {
                    if (iy3.f13918a == null) {
                        iy3.f13918a = new t82(iy3.f13920a);
                    }
                    this.f13939a.f13928b = true;
                }
                if (this.f13941a != null) {
                    iy3 iy32 = this.f13939a;
                    if (iy32.f13921a == null) {
                        iy32.f13921a = new HashSet();
                    }
                    this.f13939a.f13921a.addAll(this.f13941a);
                }
                if (this.f13940a != null) {
                    iy3 iy33 = this.f13939a;
                    if (iy33.f13915a == null) {
                        iy33.f13915a = new PersistableBundle();
                    }
                    for (String next : this.f13940a.keySet()) {
                        Map map = this.f13940a.get(next);
                        this.f13939a.f13915a.putStringArray(next, (String[]) map.keySet().toArray(new String[0]));
                        for (String str : map.keySet()) {
                            List list = (List) map.get(str);
                            PersistableBundle persistableBundle = this.f13939a.f13915a;
                            persistableBundle.putStringArray(next + "/" + str, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                        }
                    }
                }
                if (this.f13938a != null) {
                    iy3 iy34 = this.f13939a;
                    if (iy34.f13915a == null) {
                        iy34.f13915a = new PersistableBundle();
                    }
                    this.f13939a.f13915a.putString(iy3.f13909g, ip4.m17762a(this.f13938a));
                }
                return this.f13939a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @mr2
        /* renamed from: d */
        public C2463a mo18045d(@mr2 ComponentName componentName) {
            this.f13939a.f13912a = componentName;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C2463a mo18046e() {
            this.f13939a.f13922a = true;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C2463a mo18047f(@mr2 Set<String> set) {
            this.f13939a.f13921a = set;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C2463a mo18048g(@mr2 CharSequence charSequence) {
            this.f13939a.f13930c = charSequence;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C2463a mo18049h(int i) {
            this.f13939a.f13929c = i;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C2463a mo18050i(@mr2 PersistableBundle persistableBundle) {
            this.f13939a.f13915a = persistableBundle;
            return this;
        }

        @mr2
        /* renamed from: j */
        public C2463a mo18051j(IconCompat iconCompat) {
            this.f13939a.f13917a = iconCompat;
            return this;
        }

        @mr2
        /* renamed from: k */
        public C2463a mo18052k(@mr2 Intent intent) {
            return mo18053l(new Intent[]{intent});
        }

        @mr2
        /* renamed from: l */
        public C2463a mo18053l(@mr2 Intent[] intentArr) {
            this.f13939a.f13923a = intentArr;
            return this;
        }

        @mr2
        /* renamed from: m */
        public C2463a mo18054m() {
            this.f13942a = true;
            return this;
        }

        @mr2
        /* renamed from: n */
        public C2463a mo18055n(@ts2 t82 t82) {
            this.f13939a.f13918a = t82;
            return this;
        }

        @mr2
        /* renamed from: o */
        public C2463a mo18056o(@mr2 CharSequence charSequence) {
            this.f13939a.f13926b = charSequence;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: p */
        public C2463a mo18057p() {
            this.f13939a.f13928b = true;
            return this;
        }

        @mr2
        /* renamed from: q */
        public C2463a mo18058q(boolean z) {
            this.f13939a.f13928b = z;
            return this;
        }

        @mr2
        /* renamed from: r */
        public C2463a mo18059r(@mr2 s13 s13) {
            return mo18060s(new s13[]{s13});
        }

        @mr2
        /* renamed from: s */
        public C2463a mo18060s(@mr2 s13[] s13Arr) {
            this.f13939a.f13924a = s13Arr;
            return this;
        }

        @mr2
        /* renamed from: t */
        public C2463a mo18061t(int i) {
            this.f13939a.f13910a = i;
            return this;
        }

        @mr2
        /* renamed from: u */
        public C2463a mo18062u(@mr2 CharSequence charSequence) {
            this.f13939a.f13919a = charSequence;
            return this;
        }

        @mr2
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* renamed from: v */
        public C2463a mo18063v(@mr2 Uri uri) {
            this.f13938a = uri;
            return this;
        }

        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        /* renamed from: w */
        public C2463a mo18064w(@mr2 Bundle bundle) {
            this.f13939a.f13914a = (Bundle) k43.m19455l(bundle);
            return this;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.iy3$b */
    public @interface C2464b {
    }

    @sj3(25)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static List<iy3> m17984c(@mr2 Context context, @mr2 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo aVar : list) {
            arrayList.add(new C2463a(context, aVar).mo18044c());
        }
        return arrayList;
    }

    @sj3(25)
    @ts2
    /* renamed from: p */
    public static t82 m17985p(@mr2 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return m17986q(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return t82.m28194d(shortcutInfo.getLocusId());
    }

    @sj3(25)
    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public static t82 m17986q(@ts2 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f13907e)) == null) {
            return null;
        }
        return new t82(string);
    }

    @hw4
    @sj3(25)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: s */
    public static boolean m17987s(@ts2 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f13908f)) {
            return false;
        }
        return persistableBundle.getBoolean(f13908f);
    }

    @hw4
    @sj3(25)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @ts2
    /* renamed from: u */
    public static s13[] m17988u(@mr2 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f13904c)) {
            return null;
        }
        int i = persistableBundle.getInt(f13904c);
        s13[] s13Arr = new s13[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(f13906d);
            int i3 = i2 + 1;
            sb.append(i3);
            s13Arr[i2] = s13.m27191c(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return s13Arr;
    }

    /* renamed from: A */
    public boolean mo18013A() {
        return this.f13931c;
    }

    /* renamed from: B */
    public boolean mo18014B() {
        return this.f13934f;
    }

    /* renamed from: C */
    public boolean mo18015C() {
        return this.f13932d;
    }

    /* renamed from: D */
    public boolean mo18016D() {
        return this.f13936h;
    }

    /* renamed from: E */
    public boolean mo18017E(int i) {
        return (i & this.f13929c) != 0;
    }

    /* renamed from: F */
    public boolean mo18018F() {
        return this.f13935g;
    }

    /* renamed from: G */
    public boolean mo18019G() {
        return this.f13933e;
    }

    @sj3(25)
    /* renamed from: H */
    public ShortcutInfo mo18020H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13913a, this.f13920a).setShortLabel(this.f13919a).setIntents(this.f13923a);
        IconCompat iconCompat = this.f13917a;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.mo3785N(this.f13913a));
        }
        if (!TextUtils.isEmpty(this.f13926b)) {
            intents.setLongLabel(this.f13926b);
        }
        if (!TextUtils.isEmpty(this.f13930c)) {
            intents.setDisabledMessage(this.f13930c);
        }
        ComponentName componentName = this.f13912a;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13921a;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13910a);
        PersistableBundle persistableBundle = this.f13915a;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            s13[] s13Arr = this.f13924a;
            if (s13Arr != null && s13Arr.length > 0) {
                int length = s13Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f13924a[i].mo24157k();
                }
                intents.setPersons(personArr);
            }
            t82 t82 = this.f13918a;
            if (t82 != null) {
                intents.setLocusId(t82.mo24775c());
            }
            intents.setLongLived(this.f13928b);
        } else {
            intents.setExtras(mo18022b());
        }
        return intents.build();
    }

    /* renamed from: a */
    public Intent mo18021a(Intent intent) {
        Intent[] intentArr = this.f13923a;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f13919a.toString());
        if (this.f13917a != null) {
            Drawable drawable = null;
            if (this.f13922a) {
                PackageManager packageManager = this.f13913a.getPackageManager();
                ComponentName componentName = this.f13912a;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f13913a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f13917a.mo3789k(intent, drawable, this.f13913a);
        }
        return intent;
    }

    @sj3(22)
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public final PersistableBundle mo18022b() {
        if (this.f13915a == null) {
            this.f13915a = new PersistableBundle();
        }
        s13[] s13Arr = this.f13924a;
        if (s13Arr != null && s13Arr.length > 0) {
            this.f13915a.putInt(f13904c, s13Arr.length);
            int i = 0;
            while (i < this.f13924a.length) {
                PersistableBundle persistableBundle = this.f13915a;
                StringBuilder sb = new StringBuilder();
                sb.append(f13906d);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f13924a[i].mo24160n());
                i = i2;
            }
        }
        t82 t82 = this.f13918a;
        if (t82 != null) {
            this.f13915a.putString(f13907e, t82.mo24773a());
        }
        this.f13915a.putBoolean(f13908f, this.f13928b);
        return this.f13915a;
    }

    @ts2
    /* renamed from: d */
    public ComponentName mo18023d() {
        return this.f13912a;
    }

    @ts2
    /* renamed from: e */
    public Set<String> mo18024e() {
        return this.f13921a;
    }

    @ts2
    /* renamed from: f */
    public CharSequence mo18025f() {
        return this.f13930c;
    }

    /* renamed from: g */
    public int mo18026g() {
        return this.f13925b;
    }

    /* renamed from: h */
    public int mo18027h() {
        return this.f13929c;
    }

    @ts2
    /* renamed from: i */
    public PersistableBundle mo18028i() {
        return this.f13915a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public IconCompat mo18029j() {
        return this.f13917a;
    }

    @mr2
    /* renamed from: k */
    public String mo18030k() {
        return this.f13920a;
    }

    @mr2
    /* renamed from: l */
    public Intent mo18031l() {
        Intent[] intentArr = this.f13923a;
        return intentArr[intentArr.length - 1];
    }

    @mr2
    /* renamed from: m */
    public Intent[] mo18032m() {
        Intent[] intentArr = this.f13923a;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    /* renamed from: n */
    public long mo18033n() {
        return this.f13911a;
    }

    @ts2
    /* renamed from: o */
    public t82 mo18034o() {
        return this.f13918a;
    }

    @ts2
    /* renamed from: r */
    public CharSequence mo18035r() {
        return this.f13926b;
    }

    @mr2
    /* renamed from: t */
    public String mo18036t() {
        return this.f13927b;
    }

    /* renamed from: v */
    public int mo18037v() {
        return this.f13910a;
    }

    @mr2
    /* renamed from: w */
    public CharSequence mo18038w() {
        return this.f13919a;
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: x */
    public Bundle mo18039x() {
        return this.f13914a;
    }

    @ts2
    /* renamed from: y */
    public UserHandle mo18040y() {
        return this.f13916a;
    }

    /* renamed from: z */
    public boolean mo18041z() {
        return this.f13937i;
    }
}
