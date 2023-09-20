package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.b */
public class C0358b extends DataSetObservable {

    /* renamed from: a */
    public static final float f1770a = 1.0f;

    /* renamed from: a */
    public static final Map<String, C0358b> f1771a = new HashMap();

    /* renamed from: b */
    public static final int f1772b = 50;

    /* renamed from: b */
    public static final Object f1773b = new Object();

    /* renamed from: b */
    public static final String f1774b = C0358b.class.getSimpleName();

    /* renamed from: c */
    public static final int f1775c = 5;

    /* renamed from: c */
    public static final String f1776c = "historical-records";

    /* renamed from: d */
    public static final int f1777d = -1;

    /* renamed from: d */
    public static final String f1778d = "historical-record";

    /* renamed from: e */
    public static final String f1779e = "activity";

    /* renamed from: e */
    public static final boolean f1780e = false;

    /* renamed from: f */
    public static final String f1781f = "time";

    /* renamed from: g */
    public static final String f1782g = "weight";

    /* renamed from: h */
    public static final String f1783h = "activity_choser_model_history.xml";

    /* renamed from: i */
    public static final String f1784i = ".xml";

    /* renamed from: a */
    public int f1785a = 50;

    /* renamed from: a */
    public final Context f1786a;

    /* renamed from: a */
    public Intent f1787a;

    /* renamed from: a */
    public C0361c f1788a = new C0362d();

    /* renamed from: a */
    public C0364f f1789a;

    /* renamed from: a */
    public final Object f1790a = new Object();

    /* renamed from: a */
    public final String f1791a;

    /* renamed from: a */
    public final List<C0360b> f1792a = new ArrayList();

    /* renamed from: a */
    public boolean f1793a = true;

    /* renamed from: b */
    public final List<C0363e> f1794b = new ArrayList();

    /* renamed from: b */
    public boolean f1795b = false;

    /* renamed from: c */
    public boolean f1796c = true;

    /* renamed from: d */
    public boolean f1797d = false;

    /* renamed from: androidx.appcompat.widget.b$a */
    public interface C0359a {
        void setActivityChooserModel(C0358b bVar);
    }

    /* renamed from: androidx.appcompat.widget.b$b */
    public static final class C0360b implements Comparable<C0360b> {

        /* renamed from: a */
        public float f1798a;

        /* renamed from: a */
        public final ResolveInfo f1799a;

        public C0360b(ResolveInfo resolveInfo) {
            this.f1799a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C0360b bVar) {
            return Float.floatToIntBits(bVar.f1798a) - Float.floatToIntBits(this.f1798a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C0360b.class == obj.getClass() && Float.floatToIntBits(this.f1798a) == Float.floatToIntBits(((C0360b) obj).f1798a);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1798a) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f1799a.toString() + "; weight:" + new BigDecimal((double) this.f1798a) + "]";
        }
    }

    /* renamed from: androidx.appcompat.widget.b$c */
    public interface C0361c {
        /* renamed from: a */
        void mo2526a(Intent intent, List<C0360b> list, List<C0363e> list2);
    }

    /* renamed from: androidx.appcompat.widget.b$d */
    public static final class C0362d implements C0361c {

        /* renamed from: a */
        public static final float f1800a = 0.95f;

        /* renamed from: a */
        public final Map<ComponentName, C0360b> f1801a = new HashMap();

        /* renamed from: a */
        public void mo2526a(Intent intent, List<C0360b> list, List<C0363e> list2) {
            Map<ComponentName, C0360b> map = this.f1801a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0360b bVar = list.get(i);
                bVar.f1798a = 0.0f;
                ActivityInfo activityInfo = bVar.f1799a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C0363e eVar = list2.get(size2);
                C0360b bVar2 = map.get(eVar.f1804a);
                if (bVar2 != null) {
                    bVar2.f1798a += eVar.f1802a * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: androidx.appcompat.widget.b$e */
    public static final class C0363e {

        /* renamed from: a */
        public final float f1802a;

        /* renamed from: a */
        public final long f1803a;

        /* renamed from: a */
        public final ComponentName f1804a;

        public C0363e(ComponentName componentName, long j, float f) {
            this.f1804a = componentName;
            this.f1803a = j;
            this.f1802a = f;
        }

        public C0363e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0363e.class != obj.getClass()) {
                return false;
            }
            C0363e eVar = (C0363e) obj;
            ComponentName componentName = this.f1804a;
            if (componentName == null) {
                if (eVar.f1804a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1804a)) {
                return false;
            }
            return this.f1803a == eVar.f1803a && Float.floatToIntBits(this.f1802a) == Float.floatToIntBits(eVar.f1802a);
        }

        public int hashCode() {
            ComponentName componentName = this.f1804a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f1803a;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f1802a);
        }

        public String toString() {
            return "[" + "; activity:" + this.f1804a + "; time:" + this.f1803a + "; weight:" + new BigDecimal((double) this.f1802a) + "]";
        }
    }

    /* renamed from: androidx.appcompat.widget.b$f */
    public interface C0364f {
        /* renamed from: a */
        boolean mo2530a(C0358b bVar, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.b$g */
    public final class C0365g extends AsyncTask<Object, Void, Void> {
        public C0365g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
            if (r15 == null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
            if (r15 == null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d0, code lost:
            if (r15 == null) goto L_0x00d3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.b r7 = androidx.appcompat.widget.C0358b.this     // Catch:{ FileNotFoundException -> 0x00de }
                android.content.Context r7 = r7.f1786a     // Catch:{ FileNotFoundException -> 0x00de }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00de }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r9 = 0
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                androidx.appcompat.widget.b$e r10 = (androidx.appcompat.widget.C0358b.C0363e) r10     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f1804a     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r11 = "time"
                long r12 = r10.f1803a     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r11 = "weight"
                float r10 = r10.f1802a     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0093, IOException -> 0x0073 }
                androidx.appcompat.widget.b r0 = androidx.appcompat.widget.C0358b.this
                r0.f1793a = r5
                if (r15 == 0) goto L_0x00d3
            L_0x006d:
                r15.close()     // Catch:{ IOException -> 0x00d3 }
                goto L_0x00d3
            L_0x0071:
                r0 = move-exception
                goto L_0x00d4
            L_0x0073:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.C0358b.f1774b     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>()     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r2 = androidx.appcompat.widget.C0358b.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f1791a     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r0 = androidx.appcompat.widget.C0358b.this
                r0.f1793a = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x006d
            L_0x0093:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.C0358b.f1774b     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>()     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r2 = androidx.appcompat.widget.C0358b.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f1791a     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r0 = androidx.appcompat.widget.C0358b.this
                r0.f1793a = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x006d
            L_0x00b3:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.C0358b.f1774b     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>()     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r2 = androidx.appcompat.widget.C0358b.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f1791a     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.b r0 = androidx.appcompat.widget.C0358b.this
                r0.f1793a = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x006d
            L_0x00d3:
                return r6
            L_0x00d4:
                androidx.appcompat.widget.b r1 = androidx.appcompat.widget.C0358b.this
                r1.f1793a = r5
                if (r15 == 0) goto L_0x00dd
                r15.close()     // Catch:{ IOException -> 0x00dd }
            L_0x00dd:
                throw r0
            L_0x00de:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.C0358b.f1774b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                android.util.Log.e(r1, r15, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0358b.C0365g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public C0358b(Context context, String str) {
        this.f1786a = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f1784i)) {
            this.f1791a = str;
            return;
        }
        this.f1791a = str + f1784i;
    }

    /* renamed from: d */
    public static C0358b m2510d(Context context, String str) {
        C0358b bVar;
        synchronized (f1773b) {
            Map<String, C0358b> map = f1771a;
            bVar = map.get(str);
            if (bVar == null) {
                bVar = new C0358b(context, str);
                map.put(str, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo2500a(C0363e eVar) {
        boolean add = this.f1794b.add(eVar);
        if (add) {
            this.f1796c = true;
            mo2512n();
            mo2511m();
            mo2520v();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public Intent mo2501b(int i) {
        synchronized (this.f1790a) {
            if (this.f1787a == null) {
                return null;
            }
            mo2502c();
            ActivityInfo activityInfo = this.f1792a.get(i).f1799a.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1787a);
            intent.setComponent(componentName);
            if (this.f1789a != null) {
                if (this.f1789a.mo2530a(this, new Intent(intent))) {
                    return null;
                }
            }
            mo2500a(new C0363e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: c */
    public final void mo2502c() {
        boolean l = mo2510l() | mo2513o();
        mo2512n();
        if (l) {
            mo2520v();
            notifyChanged();
        }
    }

    /* renamed from: e */
    public ResolveInfo mo2503e(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1790a) {
            mo2502c();
            resolveInfo = this.f1792a.get(i).f1799a;
        }
        return resolveInfo;
    }

    /* renamed from: f */
    public int mo2504f() {
        int size;
        synchronized (this.f1790a) {
            mo2502c();
            size = this.f1792a.size();
        }
        return size;
    }

    /* renamed from: g */
    public int mo2505g(ResolveInfo resolveInfo) {
        synchronized (this.f1790a) {
            mo2502c();
            List<C0360b> list = this.f1792a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1799a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: h */
    public ResolveInfo mo2506h() {
        synchronized (this.f1790a) {
            mo2502c();
            if (this.f1792a.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f1792a.get(0).f1799a;
            return resolveInfo;
        }
    }

    /* renamed from: i */
    public int mo2507i() {
        int i;
        synchronized (this.f1790a) {
            i = this.f1785a;
        }
        return i;
    }

    /* renamed from: j */
    public int mo2508j() {
        int size;
        synchronized (this.f1790a) {
            mo2502c();
            size = this.f1794b.size();
        }
        return size;
    }

    /* renamed from: k */
    public Intent mo2509k() {
        Intent intent;
        synchronized (this.f1790a) {
            intent = this.f1787a;
        }
        return intent;
    }

    /* renamed from: l */
    public final boolean mo2510l() {
        if (!this.f1797d || this.f1787a == null) {
            return false;
        }
        this.f1797d = false;
        this.f1792a.clear();
        List<ResolveInfo> queryIntentActivities = this.f1786a.getPackageManager().queryIntentActivities(this.f1787a, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1792a.add(new C0360b(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: m */
    public final void mo2511m() {
        if (!this.f1795b) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1796c) {
            this.f1796c = false;
            if (!TextUtils.isEmpty(this.f1791a)) {
                new C0365g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1794b), this.f1791a});
            }
        }
    }

    /* renamed from: n */
    public final void mo2512n() {
        int size = this.f1794b.size() - this.f1785a;
        if (size > 0) {
            this.f1796c = true;
            for (int i = 0; i < size; i++) {
                C0363e remove = this.f1794b.remove(0);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo2513o() {
        if (!this.f1793a || !this.f1796c || TextUtils.isEmpty(this.f1791a)) {
            return false;
        }
        this.f1793a = false;
        this.f1795b = true;
        mo2514p();
        return true;
    }

    /* renamed from: p */
    public final void mo2514p() {
        try {
            FileInputStream openFileInput = this.f1786a.openFileInput(this.f1791a);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if (f1776c.equals(newPullParser.getName())) {
                    List<C0363e> list = this.f1794b;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if (f1778d.equals(newPullParser.getName())) {
                                list.add(new C0363e(newPullParser.getAttributeValue((String) null, f1779e), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e) {
                String str = f1774b;
                Log.e(str, "Error reading historical recrod file: " + this.f1791a, e);
                if (openFileInput == null) {
                }
            } catch (IOException e2) {
                String str2 = f1774b;
                Log.e(str2, "Error reading historical recrod file: " + this.f1791a, e2);
                if (openFileInput == null) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2515q(androidx.appcompat.widget.C0358b.C0361c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1790a
            monitor-enter(r0)
            androidx.appcompat.widget.b$c r1 = r2.f1788a     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.f1788a = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.mo2520v()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0358b.mo2515q(androidx.appcompat.widget.b$c):void");
    }

    /* renamed from: r */
    public void mo2516r(int i) {
        synchronized (this.f1790a) {
            mo2502c();
            C0360b bVar = this.f1792a.get(i);
            C0360b bVar2 = this.f1792a.get(0);
            float f = bVar2 != null ? (bVar2.f1798a - bVar.f1798a) + 5.0f : 1.0f;
            ActivityInfo activityInfo = bVar.f1799a.activityInfo;
            mo2500a(new C0363e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2517s(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1790a
            monitor-enter(r0)
            int r1 = r2.f1785a     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.f1785a = r3     // Catch:{ all -> 0x0019 }
            r2.mo2512n()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.mo2520v()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0358b.mo2517s(int):void");
    }

    /* renamed from: t */
    public void mo2518t(Intent intent) {
        synchronized (this.f1790a) {
            if (this.f1787a != intent) {
                this.f1787a = intent;
                this.f1797d = true;
                mo2502c();
            }
        }
    }

    /* renamed from: u */
    public void mo2519u(C0364f fVar) {
        synchronized (this.f1790a) {
            this.f1789a = fVar;
        }
    }

    /* renamed from: v */
    public final boolean mo2520v() {
        if (this.f1788a == null || this.f1787a == null || this.f1792a.isEmpty() || this.f1794b.isEmpty()) {
            return false;
        }
        this.f1788a.mo2526a(this.f1787a, this.f1792a, Collections.unmodifiableList(this.f1794b));
        return true;
    }
}
