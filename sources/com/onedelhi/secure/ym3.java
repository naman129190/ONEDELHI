package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.C0358b;
import androidx.room.C0967c;
import androidx.room.MultiInstanceInvalidationService;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.l74;
import com.onedelhi.secure.o74;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class ym3 {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    @ts2
    private C2625kd mAutoCloser;
    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public Map<Class<? extends C2629kf>, C2629kf> mAutoMigrationSpecs = new HashMap();
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @ts2
    @Deprecated
    public List<C4012b> mCallbacks;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    @Deprecated
    public volatile n74 mDatabase;
    private final C0967c mInvalidationTracker = createInvalidationTracker();
    private o74 mOpenHelper;
    private Executor mQueryExecutor;
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private Executor mTransactionExecutor;
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();
    public boolean mWriteAheadLoggingEnabled;

    /* renamed from: com.onedelhi.secure.ym3$a */
    public static class C4011a<T extends ym3> {

        /* renamed from: a */
        public long f23220a = -1;

        /* renamed from: a */
        public final Context f23221a;

        /* renamed from: a */
        public Intent f23222a;

        /* renamed from: a */
        public o74.C3039c f23223a;

        /* renamed from: a */
        public C4013c f23224a;

        /* renamed from: a */
        public final C4014d f23225a;

        /* renamed from: a */
        public C4015e f23226a;

        /* renamed from: a */
        public C4016f f23227a;

        /* renamed from: a */
        public File f23228a;

        /* renamed from: a */
        public final Class<T> f23229a;

        /* renamed from: a */
        public final String f23230a;

        /* renamed from: a */
        public ArrayList<C4012b> f23231a;

        /* renamed from: a */
        public List<Object> f23232a;

        /* renamed from: a */
        public Set<Integer> f23233a;

        /* renamed from: a */
        public Callable<InputStream> f23234a;

        /* renamed from: a */
        public Executor f23235a;

        /* renamed from: a */
        public TimeUnit f23236a;

        /* renamed from: a */
        public boolean f23237a;

        /* renamed from: b */
        public String f23238b;

        /* renamed from: b */
        public List<C2629kf> f23239b;

        /* renamed from: b */
        public Set<Integer> f23240b;

        /* renamed from: b */
        public Executor f23241b;

        /* renamed from: b */
        public boolean f23242b;

        /* renamed from: c */
        public Executor f23243c;

        /* renamed from: c */
        public boolean f23244c;

        public C4011a(@mr2 Context context, @mr2 Class<T> cls, @ts2 String str) {
            this.f23221a = context;
            this.f23229a = cls;
            this.f23230a = str;
            this.f23224a = C4013c.AUTOMATIC;
            this.f23242b = true;
            this.f23225a = new C4014d();
        }

        @mr2
        /* renamed from: a */
        public C4011a<T> mo27611a(@mr2 C2629kf kfVar) {
            if (this.f23239b == null) {
                this.f23239b = new ArrayList();
            }
            this.f23239b.add(kfVar);
            return this;
        }

        @mr2
        /* renamed from: b */
        public C4011a<T> mo27612b(@mr2 C4012b bVar) {
            if (this.f23231a == null) {
                this.f23231a = new ArrayList<>();
            }
            this.f23231a.add(bVar);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C4011a<T> mo27613c(@mr2 fj2... fj2Arr) {
            if (this.f23240b == null) {
                this.f23240b = new HashSet();
            }
            for (fj2 fj2 : fj2Arr) {
                this.f23240b.add(Integer.valueOf(fj2.startVersion));
                this.f23240b.add(Integer.valueOf(fj2.endVersion));
            }
            this.f23225a.mo27640c(fj2Arr);
            return this;
        }

        @mr2
        /* renamed from: d */
        public C4011a<T> mo27614d(@mr2 Object obj) {
            if (this.f23232a == null) {
                this.f23232a = new ArrayList();
            }
            this.f23232a.add(obj);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C4011a<T> mo27615e() {
            this.f23237a = true;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r1 != null) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0123  */
        @com.onedelhi.secure.mr2
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T mo27616f() {
            /*
                r25 = this;
                r0 = r25
                android.content.Context r1 = r0.f23221a
                if (r1 == 0) goto L_0x0133
                java.lang.Class<T> r1 = r0.f23229a
                if (r1 == 0) goto L_0x012b
                java.util.concurrent.Executor r1 = r0.f23241b
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r2 = r0.f23243c
                if (r2 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = com.onedelhi.secure.C3480s9.m27322e()
                r0.f23243c = r1
            L_0x0018:
                r0.f23241b = r1
                goto L_0x002b
            L_0x001b:
                if (r1 == 0) goto L_0x0024
                java.util.concurrent.Executor r2 = r0.f23243c
                if (r2 != 0) goto L_0x0024
                r0.f23243c = r1
                goto L_0x002b
            L_0x0024:
                if (r1 != 0) goto L_0x002b
                java.util.concurrent.Executor r1 = r0.f23243c
                if (r1 == 0) goto L_0x002b
                goto L_0x0018
            L_0x002b:
                java.util.Set<java.lang.Integer> r1 = r0.f23240b
                if (r1 == 0) goto L_0x0063
                java.util.Set<java.lang.Integer> r2 = r0.f23233a
                if (r2 == 0) goto L_0x0063
                java.util.Iterator r1 = r1.iterator()
            L_0x0037:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.f23233a
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L_0x004c
                goto L_0x0037
            L_0x004c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0063:
                com.onedelhi.secure.o74$c r1 = r0.f23223a
                if (r1 != 0) goto L_0x006c
                com.onedelhi.secure.sb1 r1 = new com.onedelhi.secure.sb1
                r1.<init>()
            L_0x006c:
                long r2 = r0.f23220a
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0090
                java.lang.String r4 = r0.f23230a
                if (r4 == 0) goto L_0x0088
                com.onedelhi.secure.kd r4 = new com.onedelhi.secure.kd
                java.util.concurrent.TimeUnit r5 = r0.f23236a
                java.util.concurrent.Executor r6 = r0.f23243c
                r4.<init>(r2, r5, r6)
                com.onedelhi.secure.qe r2 = new com.onedelhi.secure.qe
                r2.<init>(r1, r4)
                r1 = r2
                goto L_0x0090
            L_0x0088:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create auto-closing database for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x0090:
                java.lang.String r2 = r0.f23238b
                if (r2 != 0) goto L_0x009c
                java.io.File r3 = r0.f23228a
                if (r3 != 0) goto L_0x009c
                java.util.concurrent.Callable<java.io.InputStream> r3 = r0.f23234a
                if (r3 == 0) goto L_0x00be
            L_0x009c:
                java.lang.String r3 = r0.f23230a
                if (r3 == 0) goto L_0x0123
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x00a6
                r5 = 0
                goto L_0x00a7
            L_0x00a6:
                r5 = 1
            L_0x00a7:
                java.io.File r6 = r0.f23228a
                if (r6 != 0) goto L_0x00ad
                r7 = 0
                goto L_0x00ae
            L_0x00ad:
                r7 = 1
            L_0x00ae:
                int r5 = r5 + r7
                java.util.concurrent.Callable<java.io.InputStream> r7 = r0.f23234a
                if (r7 != 0) goto L_0x00b4
                goto L_0x00b5
            L_0x00b4:
                r3 = 1
            L_0x00b5:
                int r5 = r5 + r3
                if (r5 != r4) goto L_0x011b
                com.onedelhi.secure.bp3 r3 = new com.onedelhi.secure.bp3
                r3.<init>(r2, r6, r7, r1)
                r1 = r3
            L_0x00be:
                com.onedelhi.secure.ym3$f r2 = r0.f23227a
                if (r2 == 0) goto L_0x00cb
                com.onedelhi.secure.u93 r3 = new com.onedelhi.secure.u93
                java.util.concurrent.Executor r4 = r0.f23235a
                r3.<init>(r1, r2, r4)
                r8 = r3
                goto L_0x00cc
            L_0x00cb:
                r8 = r1
            L_0x00cc:
                com.onedelhi.secure.ae0 r1 = new com.onedelhi.secure.ae0
                r5 = r1
                android.content.Context r2 = r0.f23221a
                r6 = r2
                java.lang.String r7 = r0.f23230a
                com.onedelhi.secure.ym3$d r9 = r0.f23225a
                java.util.ArrayList<com.onedelhi.secure.ym3$b> r10 = r0.f23231a
                boolean r11 = r0.f23237a
                com.onedelhi.secure.ym3$c r3 = r0.f23224a
                com.onedelhi.secure.ym3$c r12 = r3.mo27637b(r2)
                java.util.concurrent.Executor r13 = r0.f23241b
                java.util.concurrent.Executor r14 = r0.f23243c
                android.content.Intent r15 = r0.f23222a
                boolean r2 = r0.f23242b
                r16 = r2
                boolean r2 = r0.f23244c
                r17 = r2
                java.util.Set<java.lang.Integer> r2 = r0.f23233a
                r18 = r2
                java.lang.String r2 = r0.f23238b
                r19 = r2
                java.io.File r2 = r0.f23228a
                r20 = r2
                java.util.concurrent.Callable<java.io.InputStream> r2 = r0.f23234a
                r21 = r2
                com.onedelhi.secure.ym3$e r2 = r0.f23226a
                r22 = r2
                java.util.List<java.lang.Object> r2 = r0.f23232a
                r23 = r2
                java.util.List<com.onedelhi.secure.kf> r2 = r0.f23239b
                r24 = r2
                r5.<init>((android.content.Context) r6, (java.lang.String) r7, (com.onedelhi.secure.o74.C3039c) r8, (com.onedelhi.secure.ym3.C4014d) r9, (java.util.List<com.onedelhi.secure.ym3.C4012b>) r10, (boolean) r11, (com.onedelhi.secure.ym3.C4013c) r12, (java.util.concurrent.Executor) r13, (java.util.concurrent.Executor) r14, (android.content.Intent) r15, (boolean) r16, (boolean) r17, (java.util.Set<java.lang.Integer>) r18, (java.lang.String) r19, (java.io.File) r20, (java.util.concurrent.Callable<java.io.InputStream>) r21, (com.onedelhi.secure.ym3.C4015e) r22, (java.util.List<java.lang.Object>) r23, (java.util.List<com.onedelhi.secure.C2629kf>) r24)
                java.lang.Class<T> r2 = r0.f23229a
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = com.onedelhi.secure.vm3.m30228b(r2, r3)
                com.onedelhi.secure.ym3 r2 = (com.onedelhi.secure.ym3) r2
                r2.init(r1)
                return r2
            L_0x011b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations."
                r1.<init>(r2)
                throw r1
            L_0x0123:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x012b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L_0x0133:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ym3.C4011a.mo27616f():com.onedelhi.secure.ym3");
        }

        @mr2
        /* renamed from: g */
        public C4011a<T> mo27617g(@mr2 String str) {
            this.f23238b = str;
            return this;
        }

        @mr2
        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: h */
        public C4011a<T> mo27618h(@mr2 String str, @mr2 C4015e eVar) {
            this.f23226a = eVar;
            this.f23238b = str;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C4011a<T> mo27619i(@mr2 File file) {
            this.f23228a = file;
            return this;
        }

        @mr2
        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        /* renamed from: j */
        public C4011a<T> mo27620j(@mr2 File file, @mr2 C4015e eVar) {
            this.f23226a = eVar;
            this.f23228a = file;
            return this;
        }

        @mr2
        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: k */
        public C4011a<T> mo27621k(@mr2 Callable<InputStream> callable) {
            this.f23234a = callable;
            return this;
        }

        @mr2
        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        /* renamed from: l */
        public C4011a<T> mo27622l(@mr2 Callable<InputStream> callable, @mr2 C4015e eVar) {
            this.f23226a = eVar;
            this.f23234a = callable;
            return this;
        }

        @mr2
        /* renamed from: m */
        public C4011a<T> mo27623m() {
            this.f23222a = this.f23230a != null ? new Intent(this.f23221a, MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @mr2
        /* renamed from: n */
        public C4011a<T> mo27624n() {
            this.f23242b = false;
            this.f23244c = true;
            return this;
        }

        @mr2
        /* renamed from: o */
        public C4011a<T> mo27625o(int... iArr) {
            if (this.f23233a == null) {
                this.f23233a = new HashSet(iArr.length);
            }
            for (int valueOf : iArr) {
                this.f23233a.add(Integer.valueOf(valueOf));
            }
            return this;
        }

        @mr2
        /* renamed from: p */
        public C4011a<T> mo27626p() {
            this.f23242b = true;
            this.f23244c = true;
            return this;
        }

        @mr2
        /* renamed from: q */
        public C4011a<T> mo27627q(@ts2 o74.C3039c cVar) {
            this.f23223a = cVar;
            return this;
        }

        @mr2
        @ky0
        /* renamed from: r */
        public C4011a<T> mo27628r(@js1(from = 0) long j, @mr2 TimeUnit timeUnit) {
            if (j >= 0) {
                this.f23220a = j;
                this.f23236a = timeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
        }

        @mr2
        /* renamed from: s */
        public C4011a<T> mo27629s(@mr2 C4013c cVar) {
            this.f23224a = cVar;
            return this;
        }

        @mr2
        @ky0
        /* renamed from: t */
        public C4011a<T> mo27630t(@mr2 Intent intent) {
            if (this.f23230a == null) {
                intent = null;
            }
            this.f23222a = intent;
            return this;
        }

        @mr2
        /* renamed from: u */
        public C4011a<T> mo27631u(@mr2 C4016f fVar, @mr2 Executor executor) {
            this.f23227a = fVar;
            this.f23235a = executor;
            return this;
        }

        @mr2
        /* renamed from: v */
        public C4011a<T> mo27632v(@mr2 Executor executor) {
            this.f23241b = executor;
            return this;
        }

        @mr2
        /* renamed from: w */
        public C4011a<T> mo27633w(@mr2 Executor executor) {
            this.f23243c = executor;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.ym3$b */
    public static abstract class C4012b {
        /* renamed from: a */
        public void mo27634a(@mr2 n74 n74) {
        }

        /* renamed from: b */
        public void mo27635b(@mr2 n74 n74) {
        }

        /* renamed from: c */
        public void mo27636c(@mr2 n74 n74) {
        }
    }

    /* renamed from: com.onedelhi.secure.ym3$c */
    public enum C4013c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        public static boolean m32533a(@mr2 ActivityManager activityManager) {
            return l74.C2697b.m20253b(activityManager);
        }

        /* renamed from: b */
        public C4013c mo27637b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C0358b.f1779e);
            return (activityManager == null || m32533a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: com.onedelhi.secure.ym3$d */
    public static class C4014d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, fj2>> f23249a = new HashMap<>();

        /* renamed from: a */
        public final void mo27638a(fj2 fj2) {
            int i = fj2.startVersion;
            int i2 = fj2.endVersion;
            TreeMap treeMap = this.f23249a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f23249a.put(Integer.valueOf(i), treeMap);
            }
            fj2 fj22 = (fj2) treeMap.get(Integer.valueOf(i2));
            if (fj22 != null) {
                Log.w(vm3.f21887a, "Overriding migration " + fj22 + " with " + fj2);
            }
            treeMap.put(Integer.valueOf(i2), fj2);
        }

        /* renamed from: b */
        public void mo27639b(@mr2 List<fj2> list) {
            for (fj2 a : list) {
                mo27638a(a);
            }
        }

        /* renamed from: c */
        public void mo27640c(@mr2 fj2... fj2Arr) {
            for (fj2 a : fj2Arr) {
                mo27638a(a);
            }
        }

        @ts2
        /* renamed from: d */
        public List<fj2> mo27641d(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return mo27642e(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: e */
        public final List<fj2> mo27642e(List<fj2> list, boolean z, int i, int i2) {
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f23249a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    Iterator it = (z ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add((fj2) treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        @mr2
        /* renamed from: f */
        public Map<Integer, Map<Integer, fj2>> mo27643f() {
            return Collections.unmodifiableMap(this.f23249a);
        }
    }

    /* renamed from: com.onedelhi.secure.ym3$e */
    public static abstract class C4015e {
        /* renamed from: a */
        public void mo27644a(@mr2 n74 n74) {
        }
    }

    /* renamed from: com.onedelhi.secure.ym3$f */
    public interface C4016f {
        /* renamed from: a */
        void mo27645a(@mr2 String str, @mr2 List<Object> list);
    }

    /* renamed from: e */
    public static boolean m32501e() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Object m32502f(n74 n74) {
        mo27587c();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object m32503g(n74 n74) {
        mo27590d();
        return null;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && m32501e()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        C2625kd kdVar = this.mAutoCloser;
        if (kdVar == null) {
            mo27587c();
        } else {
            kdVar.mo19007c(new wm3(this));
        }
    }

    /* renamed from: c */
    public final void mo27587c() {
        assertNotMainThread();
        n74 x = this.mOpenHelper.mo13235x();
        this.mInvalidationTracker.mo6633u(x);
        if (x.mo18338v1()) {
            x.mo18324d1();
        } else {
            x.mo18302D();
        }
    }

    @ly4
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.mo6630r();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public s74 compileStatement(@mr2 String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.mo13235x().mo18331n0(str);
    }

    @mr2
    public abstract C0967c createInvalidationTracker();

    @mr2
    public abstract o74 createOpenHelper(ae0 ae0);

    /* renamed from: d */
    public final void mo27590d() {
        this.mOpenHelper.mo13235x().mo18301A0();
        if (!inTransaction()) {
            this.mInvalidationTracker.mo6623k();
        }
    }

    @Deprecated
    public void endTransaction() {
        C2625kd kdVar = this.mAutoCloser;
        if (kdVar == null) {
            mo27590d();
        } else {
            kdVar.mo19007c(new xm3(this));
        }
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public List<fj2> getAutoMigrations(@mr2 Map<Class<? extends C2629kf>, C2629kf> map) {
        return Collections.emptyList();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    @mr2
    public C0967c getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    @mr2
    public o74 getOpenHelper() {
        return this.mOpenHelper;
    }

    @mr2
    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public Set<Class<? extends C2629kf>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    @mr2
    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    @ts2
    public <T> T getTypeConverter(@mr2 Class<T> cls) {
        return this.mTypeConverters.get(cls);
    }

    @ts2
    /* renamed from: h */
    public final <T> T mo27600h(Class<T> cls, o74 o74) {
        if (cls.isInstance(o74)) {
            return o74;
        }
        if (o74 instanceof ji0) {
            return mo27600h(cls, ((ji0) o74).mo13226a());
        }
        return null;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.mo13235x().mo18332n2();
    }

    @C3740us
    public void init(@mr2 ae0 ae0) {
        boolean z;
        this.mOpenHelper = createOpenHelper(ae0);
        Set<Class<? extends C2629kf>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends C2629kf>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class next = it.next();
                int size = ae0.f9031c.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(ae0.f9031c.get(size).getClass())) {
                        bitSet.set(size);
                        i = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i >= 0) {
                    this.mAutoMigrationSpecs.put(next, ae0.f9031c.get(i));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                int size2 = ae0.f9031c.size() - 1;
                while (size2 >= 0) {
                    if (bitSet.get(size2)) {
                        size2--;
                    } else {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<fj2> it2 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    fj2 next2 = it2.next();
                    if (!ae0.f9018a.mo27643f().containsKey(Integer.valueOf(next2.startVersion))) {
                        ae0.f9018a.mo27640c(next2);
                    }
                }
                ap3 ap3 = (ap3) mo27600h(ap3.class, this.mOpenHelper);
                if (ap3 != null) {
                    ap3.mo13231g(ae0);
                }
                C2508je jeVar = (C2508je) mo27600h(C2508je.class, this.mOpenHelper);
                if (jeVar != null) {
                    C2625kd b = jeVar.mo18299b();
                    this.mAutoCloser = b;
                    this.mInvalidationTracker.mo6627o(b);
                }
                if (ae0.f9017a == C4013c.WRITE_AHEAD_LOGGING) {
                    z = true;
                }
                this.mOpenHelper.setWriteAheadLoggingEnabled(z);
                this.mCallbacks = ae0.f9022a;
                this.mQueryExecutor = ae0.f9025a;
                this.mTransactionExecutor = new og4(ae0.f9029b);
                this.mAllowMainThreadQueries = ae0.f9026a;
                this.mWriteAheadLoggingEnabled = z;
                Intent intent = ae0.f9015a;
                if (intent != null) {
                    this.mInvalidationTracker.mo6628p(ae0.f9014a, ae0.f9021a, intent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry next3 : requiredTypeConverters.entrySet()) {
                    Class cls = (Class) next3.getKey();
                    Iterator it3 = ((List) next3.getValue()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Class cls2 = (Class) it3.next();
                            int size3 = ae0.f9028b.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                } else if (cls2.isAssignableFrom(ae0.f9028b.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else {
                                    size3--;
                                }
                            }
                            if (size3 >= 0) {
                                this.mTypeConverters.put(cls2, ae0.f9028b.get(size3));
                            } else {
                                throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                            }
                        }
                    }
                }
                int size4 = ae0.f9028b.size() - 1;
                while (size4 >= 0) {
                    if (bitSet2.get(size4)) {
                        size4--;
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + ae0.f9028b.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    public void internalInitInvalidationTracker(@mr2 n74 n74) {
        this.mInvalidationTracker.mo6620h(n74);
    }

    public boolean isOpen() {
        C2625kd kdVar = this.mAutoCloser;
        if (kdVar != null) {
            return kdVar.mo19012h();
        }
        n74 n74 = this.mDatabase;
        return n74 != null && n74.isOpen();
    }

    @mr2
    public Cursor query(@mr2 q74 q74) {
        return query(q74, (CancellationSignal) null);
    }

    @mr2
    public Cursor query(@mr2 q74 q74, @ts2 CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? this.mOpenHelper.mo13235x().mo18313S(q74, cancellationSignal) : this.mOpenHelper.mo13235x().mo18323d0(q74);
    }

    @mr2
    public Cursor query(@mr2 String str, @ts2 Object[] objArr) {
        return this.mOpenHelper.mo13235x().mo18323d0(new cz3(str, objArr));
    }

    public <V> V runInTransaction(@mr2 Callable<V> callable) {
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            endTransaction();
            return call;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            r04.m26249a(e2);
            endTransaction();
            return null;
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }

    public void runInTransaction(@mr2 Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.mo13235x().mo18308L();
    }
}
