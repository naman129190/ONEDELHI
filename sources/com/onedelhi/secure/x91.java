package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.onedelhi.secure.aa1;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class x91 {

    /* renamed from: a */
    public static final mb2<String, Typeface> f22464a = new mb2<>(16);
    @mj1("LOCK")

    /* renamed from: a */
    public static final ty3<String, ArrayList<s60<C3906e>>> f22465a = new ty3<>();

    /* renamed from: a */
    public static final Object f22466a = new Object();

    /* renamed from: a */
    public static final ExecutorService f22467a = xi3.m31476a("fonts-androidx", 10, 10000);

    /* renamed from: com.onedelhi.secure.x91$a */
    public class C3902a implements Callable<C3906e> {

        /* renamed from: a */
        public final /* synthetic */ int f22468a;

        /* renamed from: a */
        public final /* synthetic */ Context f22469a;

        /* renamed from: a */
        public final /* synthetic */ u91 f22470a;

        /* renamed from: a */
        public final /* synthetic */ String f22471a;

        public C3902a(String str, Context context, u91 u91, int i) {
            this.f22471a = str;
            this.f22469a = context;
            this.f22470a = u91;
            this.f22468a = i;
        }

        /* renamed from: a */
        public C3906e call() {
            return x91.m31345c(this.f22471a, this.f22469a, this.f22470a, this.f22468a);
        }
    }

    /* renamed from: com.onedelhi.secure.x91$b */
    public class C3903b implements s60<C3906e> {

        /* renamed from: a */
        public final /* synthetic */ C1730at f22472a;

        public C3903b(C1730at atVar) {
            this.f22472a = atVar;
        }

        /* renamed from: a */
        public void accept(C3906e eVar) {
            if (eVar == null) {
                eVar = new C3906e(-3);
            }
            this.f22472a.mo13258b(eVar);
        }
    }

    /* renamed from: com.onedelhi.secure.x91$c */
    public class C3904c implements Callable<C3906e> {

        /* renamed from: a */
        public final /* synthetic */ int f22473a;

        /* renamed from: a */
        public final /* synthetic */ Context f22474a;

        /* renamed from: a */
        public final /* synthetic */ u91 f22475a;

        /* renamed from: a */
        public final /* synthetic */ String f22476a;

        public C3904c(String str, Context context, u91 u91, int i) {
            this.f22476a = str;
            this.f22474a = context;
            this.f22475a = u91;
            this.f22473a = i;
        }

        /* renamed from: a */
        public C3906e call() {
            try {
                return x91.m31345c(this.f22476a, this.f22474a, this.f22475a, this.f22473a);
            } catch (Throwable unused) {
                return new C3906e(-3);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.x91$d */
    public class C3905d implements s60<C3906e> {

        /* renamed from: b */
        public final /* synthetic */ String f22477b;

        public C3905d(String str) {
            this.f22477b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((com.onedelhi.secure.s60) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.onedelhi.secure.x91.C3906e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = com.onedelhi.secure.x91.f22466a
                monitor-enter(r0)
                com.onedelhi.secure.ty3<java.lang.String, java.util.ArrayList<com.onedelhi.secure.s60<com.onedelhi.secure.x91$e>>> r1 = com.onedelhi.secure.x91.f22465a     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f22477b     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f22477b     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                com.onedelhi.secure.s60 r1 = (com.onedelhi.secure.s60) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x91.C3905d.accept(com.onedelhi.secure.x91$e):void");
        }
    }

    /* renamed from: com.onedelhi.secure.x91$e */
    public static final class C3906e {

        /* renamed from: a */
        public final int f22478a;

        /* renamed from: a */
        public final Typeface f22479a;

        public C3906e(int i) {
            this.f22479a = null;
            this.f22478a = i;
        }

        @SuppressLint({"WrongConstant"})
        public C3906e(@mr2 Typeface typeface) {
            this.f22479a = typeface;
            this.f22478a = 0;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo26831a() {
            return this.f22478a == 0;
        }
    }

    /* renamed from: a */
    public static String m31343a(@mr2 u91 u91, int i) {
        return u91.mo25460d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m31344b(@mr2 aa1.C1674b bVar) {
        int i = 1;
        if (bVar.mo12875c() != 0) {
            return bVar.mo12875c() != 1 ? -3 : -2;
        }
        aa1.C1675c[] b = bVar.mo12874b();
        if (!(b == null || b.length == 0)) {
            int length = b.length;
            i = 0;
            int i2 = 0;
            while (i2 < length) {
                int b2 = b[i2].mo12876b();
                if (b2 == 0) {
                    i2++;
                } else if (b2 < 0) {
                    return -3;
                } else {
                    return b2;
                }
            }
        }
        return i;
    }

    @mr2
    /* renamed from: c */
    public static C3906e m31345c(@mr2 String str, @mr2 Context context, @mr2 u91 u91, int i) {
        mb2<String, Typeface> mb2 = f22464a;
        Typeface f = mb2.mo20268f(str);
        if (f != null) {
            return new C3906e(f);
        }
        try {
            aa1.C1674b e = t91.m28207e(context, u91, (CancellationSignal) null);
            int b = m31344b(e);
            if (b != 0) {
                return new C3906e(b);
            }
            Typeface c = ik4.m17651c(context, (CancellationSignal) null, e.mo12874b(), i);
            if (c == null) {
                return new C3906e(-3);
            }
            mb2.mo20272j(str, c);
            return new C3906e(c);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3906e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new com.onedelhi.secure.x91.C3904c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f22467a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        com.onedelhi.secure.xi3.m31478c(r8, r9, new com.onedelhi.secure.x91.C3905d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m31346d(@com.onedelhi.secure.mr2 android.content.Context r5, @com.onedelhi.secure.mr2 com.onedelhi.secure.u91 r6, int r7, @com.onedelhi.secure.ts2 java.util.concurrent.Executor r8, @com.onedelhi.secure.mr2 com.onedelhi.secure.C1730at r9) {
        /*
            java.lang.String r0 = m31343a(r6, r7)
            com.onedelhi.secure.mb2<java.lang.String, android.graphics.Typeface> r1 = f22464a
            java.lang.Object r1 = r1.mo20268f(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            com.onedelhi.secure.x91$e r5 = new com.onedelhi.secure.x91$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo13258b(r5)
            return r1
        L_0x0017:
            com.onedelhi.secure.x91$b r1 = new com.onedelhi.secure.x91$b
            r1.<init>(r9)
            java.lang.Object r9 = f22466a
            monitor-enter(r9)
            com.onedelhi.secure.ty3<java.lang.String, java.util.ArrayList<com.onedelhi.secure.s60<com.onedelhi.secure.x91$e>>> r2 = f22465a     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            com.onedelhi.secure.x91$c r9 = new com.onedelhi.secure.x91$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f22467a
        L_0x0044:
            com.onedelhi.secure.x91$d r5 = new com.onedelhi.secure.x91$d
            r5.<init>(r0)
            com.onedelhi.secure.xi3.m31478c(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x91.m31346d(android.content.Context, com.onedelhi.secure.u91, int, java.util.concurrent.Executor, com.onedelhi.secure.at):android.graphics.Typeface");
    }

    /* renamed from: e */
    public static Typeface m31347e(@mr2 Context context, @mr2 u91 u91, @mr2 C1730at atVar, int i, int i2) {
        String a = m31343a(u91, i);
        Typeface f = f22464a.mo20268f(a);
        if (f != null) {
            atVar.mo13258b(new C3906e(f));
            return f;
        } else if (i2 == -1) {
            C3906e c = m31345c(a, context, u91, i);
            atVar.mo13258b(c);
            return c.f22479a;
        } else {
            try {
                C3906e eVar = (C3906e) xi3.m31479d(f22467a, new C3902a(a, context, u91, i), i2);
                atVar.mo13258b(eVar);
                return eVar.f22479a;
            } catch (InterruptedException unused) {
                atVar.mo13258b(new C3906e(-3));
                return null;
            }
        }
    }

    /* renamed from: f */
    public static void m31348f() {
        f22464a.mo20266d();
    }
}
