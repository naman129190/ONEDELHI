package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import com.onedelhi.secure.C2625kd;
import com.onedelhi.secure.cz3;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n74;
import com.onedelhi.secure.nq3;
import com.onedelhi.secure.pt1;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.qt1;
import com.onedelhi.secure.s74;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vm3;
import com.onedelhi.secure.ym3;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: androidx.room.c */
public class C0967c {

    /* renamed from: a */
    public static final String f5248a = "room_table_modification_log";

    /* renamed from: b */
    public static final String f5249b = "table_id";

    /* renamed from: b */
    public static final String[] f5250b = {"UPDATE", q51.C6513a.f34003w, "INSERT"};

    /* renamed from: c */
    public static final String f5251c = "invalidated";

    /* renamed from: d */
    public static final String f5252d = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @hw4

    /* renamed from: e */
    public static final String f5253e = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    @hw4

    /* renamed from: f */
    public static final String f5254f = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* renamed from: a */
    public final C0969b f5255a;

    /* renamed from: a */
    public C0973d f5256a;
    @ts2

    /* renamed from: a */
    public C2625kd f5257a;
    @hw4
    @SuppressLint({"RestrictedApi"})

    /* renamed from: a */
    public final nq3<C0970c, C0971d> f5258a;

    /* renamed from: a */
    public final pt1 f5259a;

    /* renamed from: a */
    public volatile s74 f5260a;

    /* renamed from: a */
    public final ym3 f5261a;

    /* renamed from: a */
    public final Object f5262a;
    @hw4

    /* renamed from: a */
    public Runnable f5263a;
    @mr2

    /* renamed from: a */
    public final HashMap<String, Integer> f5264a;
    @mr2

    /* renamed from: a */
    public Map<String, Set<String>> f5265a;

    /* renamed from: a */
    public AtomicBoolean f5266a;

    /* renamed from: a */
    public volatile boolean f5267a;

    /* renamed from: a */
    public final String[] f5268a;

    /* renamed from: androidx.room.c$a */
    public class C0968a implements Runnable {
        public C0968a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final Set<Integer> mo6635a() {
            HashSet hashSet = new HashSet();
            Cursor query = C0967c.this.f5261a.query(new cz3(C0967c.f5254f));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                C0967c.this.f5260a.mo13601a1();
            }
            return hashSet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
            if (r0 != null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            r0.mo19006b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
            if (r0 == null) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f5269a.f5258a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r2 = r5.f5269a.f5258a.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
            if (r2.hasNext() == false) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
            ((androidx.room.C0967c.C0971d) r2.next().getValue()).mo6643a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.ym3 r0 = r0.f5261a
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                r0.lock()
                r1 = 0
                androidx.room.c r2 = androidx.room.C0967c.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r2 = r2.mo6619g()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 != 0) goto L_0x0021
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x0020
                r0.mo19006b()
            L_0x0020:
                return
            L_0x0021:
                androidx.room.c r2 = androidx.room.C0967c.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f5266a     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 != 0) goto L_0x003a
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x0039
                r0.mo19006b()
            L_0x0039:
                return
            L_0x003a:
                androidx.room.c r2 = androidx.room.C0967c.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                com.onedelhi.secure.ym3 r2 = r2.f5261a     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r2 = r2.inTransaction()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 == 0) goto L_0x0051
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x0050
                r0.mo19006b()
            L_0x0050:
                return
            L_0x0051:
                androidx.room.c r2 = androidx.room.C0967c.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                com.onedelhi.secure.ym3 r2 = r2.f5261a     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                com.onedelhi.secure.o74 r2 = r2.getOpenHelper()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                com.onedelhi.secure.n74 r2 = r2.mo13235x()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r2.mo18324d1()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.Set r1 = r5.mo6635a()     // Catch:{ all -> 0x0077 }
                r2.mo18308L()     // Catch:{ all -> 0x0077 }
                r2.mo18301A0()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x0092
            L_0x0073:
                r0.mo19006b()
                goto L_0x0092
            L_0x0077:
                r3 = move-exception
                r2.mo18301A0()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                throw r3     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
            L_0x007c:
                r1 = move-exception
                goto L_0x00c3
            L_0x007e:
                r2 = move-exception
                goto L_0x0081
            L_0x0080:
                r2 = move-exception
            L_0x0081:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x007c }
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x0092
                goto L_0x0073
            L_0x0092:
                if (r1 == 0) goto L_0x00c2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto L_0x00c2
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.nq3<androidx.room.c$c, androidx.room.c$d> r0 = r0.f5258a
                monitor-enter(r0)
                androidx.room.c r2 = androidx.room.C0967c.this     // Catch:{ all -> 0x00bf }
                com.onedelhi.secure.nq3<androidx.room.c$c, androidx.room.c$d> r2 = r2.f5258a     // Catch:{ all -> 0x00bf }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bf }
            L_0x00a7:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00bf }
                if (r3 == 0) goto L_0x00bd
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00bf }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00bf }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00bf }
                androidx.room.c$d r3 = (androidx.room.C0967c.C0971d) r3     // Catch:{ all -> 0x00bf }
                r3.mo6643a(r1)     // Catch:{ all -> 0x00bf }
                goto L_0x00a7
            L_0x00bd:
                monitor-exit(r0)     // Catch:{ all -> 0x00bf }
                goto L_0x00c2
            L_0x00bf:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00bf }
                throw r1
            L_0x00c2:
                return
            L_0x00c3:
                r0.unlock()
                androidx.room.c r0 = androidx.room.C0967c.this
                com.onedelhi.secure.kd r0 = r0.f5257a
                if (r0 == 0) goto L_0x00cf
                r0.mo19006b()
            L_0x00cf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0967c.C0968a.run():void");
        }
    }

    /* renamed from: androidx.room.c$b */
    public static class C0969b {

        /* renamed from: a */
        public static final int f5270a = 0;

        /* renamed from: b */
        public static final int f5271b = 1;

        /* renamed from: c */
        public static final int f5272c = 2;

        /* renamed from: a */
        public boolean f5273a;

        /* renamed from: a */
        public final int[] f5274a;

        /* renamed from: a */
        public final long[] f5275a;

        /* renamed from: a */
        public final boolean[] f5276a;

        public C0969b(int i) {
            long[] jArr = new long[i];
            this.f5275a = jArr;
            boolean[] zArr = new boolean[i];
            this.f5276a = zArr;
            this.f5274a = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        @ts2
        /* renamed from: a */
        public int[] mo6637a() {
            synchronized (this) {
                if (!this.f5273a) {
                    return null;
                }
                int length = this.f5275a.length;
                for (int i = 0; i < length; i++) {
                    int i2 = 1;
                    boolean z = this.f5275a[i] > 0;
                    boolean[] zArr = this.f5276a;
                    if (z != zArr[i]) {
                        int[] iArr = this.f5274a;
                        if (!z) {
                            i2 = 2;
                        }
                        iArr[i] = i2;
                    } else {
                        this.f5274a[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.f5273a = false;
                int[] iArr2 = (int[]) this.f5274a.clone();
                return iArr2;
            }
        }

        /* renamed from: b */
        public boolean mo6638b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5275a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f5273a = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: c */
        public boolean mo6639c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5275a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f5273a = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: d */
        public void mo6640d() {
            synchronized (this) {
                Arrays.fill(this.f5276a, false);
                this.f5273a = true;
            }
        }
    }

    /* renamed from: androidx.room.c$c */
    public static abstract class C0970c {

        /* renamed from: a */
        public final String[] f5277a;

        public C0970c(@mr2 String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.f5277a = strArr2;
            strArr2[strArr.length] = str;
        }

        public C0970c(@mr2 String[] strArr) {
            this.f5277a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public boolean mo6641a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo6642b(@mr2 Set<String> set);
    }

    /* renamed from: androidx.room.c$d */
    public static class C0971d {

        /* renamed from: a */
        public final C0970c f5278a;

        /* renamed from: a */
        public final Set<String> f5279a;

        /* renamed from: a */
        public final int[] f5280a;

        /* renamed from: a */
        public final String[] f5281a;

        public C0971d(C0970c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f5278a = cVar;
            this.f5280a = iArr;
            this.f5281a = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f5279a = set;
        }

        /* renamed from: a */
        public void mo6643a(Set<Integer> set) {
            int length = this.f5280a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f5280a[i]))) {
                    if (length == 1) {
                        set2 = this.f5279a;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f5281a[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f5278a.mo6642b(set2);
            }
        }

        /* renamed from: b */
        public void mo6644b(String[] strArr) {
            Set<String> set = null;
            if (this.f5281a.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f5281a[0])) {
                        set = this.f5279a;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5281a;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5278a.mo6642b(set);
            }
        }
    }

    /* renamed from: androidx.room.c$e */
    public static class C0972e extends C0970c {

        /* renamed from: a */
        public final C0967c f5282a;

        /* renamed from: a */
        public final WeakReference<C0970c> f5283a;

        public C0972e(C0967c cVar, C0970c cVar2) {
            super(cVar2.f5277a);
            this.f5282a = cVar;
            this.f5283a = new WeakReference<>(cVar2);
        }

        /* renamed from: b */
        public void mo6642b(@mr2 Set<String> set) {
            C0970c cVar = (C0970c) this.f5283a.get();
            if (cVar == null) {
                this.f5282a.mo6625m(this);
            } else {
                cVar.mo6642b(set);
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public C0967c(ym3 ym3, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5257a = null;
        this.f5266a = new AtomicBoolean(false);
        this.f5267a = false;
        this.f5258a = new nq3<>();
        this.f5262a = new Object();
        this.f5263a = new C0968a();
        this.f5261a = ym3;
        this.f5255a = new C0969b(strArr.length);
        this.f5264a = new HashMap<>();
        this.f5265a = map2;
        this.f5259a = new pt1(ym3);
        int length = strArr.length;
        this.f5268a = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5264a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f5268a[i] = str2.toLowerCase(locale);
            } else {
                this.f5268a[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f5264a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f5264a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public C0967c(ym3 ym3, String... strArr) {
        this(ym3, new HashMap(), Collections.emptyMap(), strArr);
    }

    /* renamed from: c */
    public static void m6714c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append(db0.f27369e);
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: d */
    public static void m6715d(n74 n74) {
        if (n74.mo18338v1()) {
            n74.mo18324d1();
        } else {
            n74.mo18302D();
        }
    }

    @SuppressLint({"RestrictedApi"})
    @ly4
    /* renamed from: a */
    public void mo6615a(@mr2 C0970c cVar) {
        C0971d k;
        String[] n = mo6626n(cVar.f5277a);
        int[] iArr = new int[n.length];
        int length = n.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f5264a.get(n[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + n[i]);
            }
        }
        C0971d dVar = new C0971d(cVar, iArr, n);
        synchronized (this.f5258a) {
            k = this.f5258a.mo13878k(cVar, dVar);
        }
        if (k == null && this.f5255a.mo6638b(iArr)) {
            mo6632t();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: b */
    public void mo6616b(C0970c cVar) {
        mo6615a(new C0972e(this, cVar));
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: e */
    public <T> LiveData<T> mo6617e(String[] strArr, Callable<T> callable) {
        return mo6618f(strArr, false, callable);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: f */
    public <T> LiveData<T> mo6618f(String[] strArr, boolean z, Callable<T> callable) {
        return this.f5259a.mo22633a(mo6634v(strArr), z, callable);
    }

    /* renamed from: g */
    public boolean mo6619g() {
        if (!this.f5261a.isOpen()) {
            return false;
        }
        if (!this.f5267a) {
            this.f5261a.getOpenHelper().mo13235x();
        }
        if (this.f5267a) {
            return true;
        }
        Log.e(vm3.f21887a, "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: h */
    public void mo6620h(n74 n74) {
        synchronized (this) {
            if (this.f5267a) {
                Log.e(vm3.f21887a, "Invalidation tracker is initialized twice :/.");
                return;
            }
            n74.mo18303G("PRAGMA temp_store = MEMORY;");
            n74.mo18303G("PRAGMA recursive_triggers='ON';");
            n74.mo18303G(f5252d);
            mo6633u(n74);
            this.f5260a = n74.mo18331n0(f5253e);
            this.f5267a = true;
        }
    }

    @hw4(otherwise = 3)
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: i */
    public void mo6621i(String... strArr) {
        synchronized (this.f5258a) {
            Iterator<Map.Entry<C0970c, C0971d>> it = this.f5258a.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C0970c) next.getKey()).mo6641a()) {
                    ((C0971d) next.getValue()).mo6644b(strArr);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo6622j() {
        synchronized (this) {
            this.f5267a = false;
            this.f5255a.mo6640d();
        }
    }

    /* renamed from: k */
    public void mo6623k() {
        if (this.f5266a.compareAndSet(false, true)) {
            C2625kd kdVar = this.f5257a;
            if (kdVar != null) {
                kdVar.mo19010f();
            }
            this.f5261a.getQueryExecutor().execute(this.f5263a);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @ly4
    /* renamed from: l */
    public void mo6624l() {
        C2625kd kdVar = this.f5257a;
        if (kdVar != null) {
            kdVar.mo19010f();
        }
        mo6632t();
        this.f5263a.run();
    }

    @SuppressLint({"RestrictedApi"})
    @ly4
    /* renamed from: m */
    public void mo6625m(@mr2 C0970c cVar) {
        C0971d l;
        synchronized (this.f5258a) {
            l = this.f5258a.mo13879l(cVar);
        }
        if (l != null && this.f5255a.mo6639c(l.f5280a)) {
            mo6632t();
        }
    }

    /* renamed from: n */
    public final String[] mo6626n(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f5265a.containsKey(lowerCase)) {
                hashSet.addAll(this.f5265a.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: o */
    public void mo6627o(C2625kd kdVar) {
        this.f5257a = kdVar;
        kdVar.mo19013i(new qt1(this));
    }

    /* renamed from: p */
    public void mo6628p(Context context, String str, Intent intent) {
        this.f5256a = new C0973d(context, str, intent, this, this.f5261a.getQueryExecutor());
    }

    /* renamed from: q */
    public final void mo6629q(n74 n74, int i) {
        n74.mo18303G("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f5268a[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5250b) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m6714c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append(f5248a);
            sb.append(" SET ");
            sb.append(f5251c);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append(f5249b);
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(f5251c);
            sb.append(" = 0");
            sb.append("; END");
            n74.mo18303G(sb.toString());
        }
    }

    /* renamed from: r */
    public void mo6630r() {
        C0973d dVar = this.f5256a;
        if (dVar != null) {
            dVar.mo6645a();
            this.f5256a = null;
        }
    }

    /* renamed from: s */
    public final void mo6631s(n74 n74, int i) {
        String str = this.f5268a[i];
        StringBuilder sb = new StringBuilder();
        for (String c : f5250b) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m6714c(sb, str, c);
            n74.mo18303G(sb.toString());
        }
    }

    /* renamed from: t */
    public void mo6632t() {
        if (this.f5261a.isOpen()) {
            mo6633u(this.f5261a.getOpenHelper().mo13235x());
        }
    }

    /* renamed from: u */
    public void mo6633u(n74 n74) {
        if (!n74.mo18332n2()) {
            try {
                Lock closeLock = this.f5261a.getCloseLock();
                closeLock.lock();
                try {
                    synchronized (this.f5262a) {
                        int[] a = this.f5255a.mo6637a();
                        if (a != null) {
                            int length = a.length;
                            m6715d(n74);
                            int i = 0;
                            while (i < length) {
                                try {
                                    int i2 = a[i];
                                    if (i2 == 1) {
                                        mo6629q(n74, i);
                                    } else if (i2 == 2) {
                                        mo6631s(n74, i);
                                    }
                                    i++;
                                } catch (Throwable th) {
                                    n74.mo18301A0();
                                    throw th;
                                }
                            }
                            n74.mo18308L();
                            n74.mo18301A0();
                            closeLock.unlock();
                        }
                    }
                } finally {
                    closeLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e(vm3.f21887a, "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    /* renamed from: v */
    public final String[] mo6634v(String[] strArr) {
        String[] n = mo6626n(strArr);
        int length = n.length;
        int i = 0;
        while (i < length) {
            String str = n[i];
            if (this.f5264a.containsKey(str.toLowerCase(Locale.US))) {
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return n;
    }
}
