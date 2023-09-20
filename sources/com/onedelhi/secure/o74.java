package com.onedelhi.secure;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.onedelhi.secure.l74;
import java.io.Closeable;
import java.io.File;

public interface o74 extends Closeable {

    /* renamed from: com.onedelhi.secure.o74$a */
    public static abstract class C3036a {

        /* renamed from: a */
        public static final String f17868a = "SupportSQLite";

        /* renamed from: a */
        public final int f17869a;

        public C3036a(int i) {
            this.f17869a = i;
        }

        /* renamed from: a */
        public final void mo21825a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w(f17868a, "deleting the database file: " + str);
                try {
                    l74.C2696a.m20246c(new File(str));
                } catch (Exception e) {
                    Log.w(f17868a, "delete failed: ", e);
                }
            }
        }

        /* renamed from: b */
        public void mo13197b(@mr2 n74 n74) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            mo21825a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            mo21825a(r3.mo18325f0());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo21826c(@com.onedelhi.secure.mr2 com.onedelhi.secure.n74 r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.mo18325f0()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.mo18325f0()
                r2.mo21825a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.mo18316U0()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.mo21825a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.mo18325f0()
                r2.mo21825a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.mo21825a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.mo18325f0()
                r2.mo21825a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o74.C3036a.mo21826c(com.onedelhi.secure.n74):void");
        }

        /* renamed from: d */
        public abstract void mo13198d(@mr2 n74 n74);

        /* renamed from: e */
        public void mo13199e(@mr2 n74 n74, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo13200f(@mr2 n74 n74) {
        }

        /* renamed from: g */
        public abstract void mo13201g(@mr2 n74 n74, int i, int i2);
    }

    /* renamed from: com.onedelhi.secure.o74$b */
    public static class C3037b {
        @mr2

        /* renamed from: a */
        public final Context f17870a;
        @mr2

        /* renamed from: a */
        public final C3036a f17871a;
        @ts2

        /* renamed from: a */
        public final String f17872a;

        /* renamed from: a */
        public final boolean f17873a;

        /* renamed from: com.onedelhi.secure.o74$b$a */
        public static class C3038a {

            /* renamed from: a */
            public Context f17874a;

            /* renamed from: a */
            public C3036a f17875a;

            /* renamed from: a */
            public String f17876a;

            /* renamed from: a */
            public boolean f17877a;

            public C3038a(@mr2 Context context) {
                this.f17874a = context;
            }

            @mr2
            /* renamed from: a */
            public C3037b mo21827a() {
                if (this.f17875a == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f17874a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f17877a || !TextUtils.isEmpty(this.f17876a)) {
                    return new C3037b(this.f17874a, this.f17876a, this.f17875a, this.f17877a);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            @mr2
            /* renamed from: b */
            public C3038a mo21828b(@mr2 C3036a aVar) {
                this.f17875a = aVar;
                return this;
            }

            @mr2
            /* renamed from: c */
            public C3038a mo21829c(@ts2 String str) {
                this.f17876a = str;
                return this;
            }

            @mr2
            /* renamed from: d */
            public C3038a mo21830d(boolean z) {
                this.f17877a = z;
                return this;
            }
        }

        public C3037b(@mr2 Context context, @ts2 String str, @mr2 C3036a aVar) {
            this(context, str, aVar, false);
        }

        public C3037b(@mr2 Context context, @ts2 String str, @mr2 C3036a aVar, boolean z) {
            this.f17870a = context;
            this.f17872a = str;
            this.f17871a = aVar;
            this.f17873a = z;
        }

        @mr2
        /* renamed from: a */
        public static C3038a m23597a(@mr2 Context context) {
            return new C3038a(context);
        }
    }

    /* renamed from: com.onedelhi.secure.o74$c */
    public interface C3039c {
        @mr2
        /* renamed from: a */
        o74 mo13792a(@mr2 C3037b bVar);
    }

    /* renamed from: Z1 */
    n74 mo13225Z1();

    void close();

    @ts2
    String getDatabaseName();

    @sj3(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);

    /* renamed from: x */
    n74 mo13235x();
}
