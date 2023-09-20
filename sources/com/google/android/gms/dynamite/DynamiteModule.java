package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.fx6;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p07;
import com.onedelhi.secure.qx5;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wt6;
import com.onedelhi.secure.xy6;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk

    /* renamed from: a */
    public static final int f7376a = -1;

    /* renamed from: a */
    public static final C1415b.C1416a f7377a = new C1418a();
    @mr2
    @KeepForSdk

    /* renamed from: a */
    public static final C1415b f7378a = new C1419b();
    @GuardedBy("DynamiteModule.class")
    @ts2

    /* renamed from: a */
    public static p07 f7379a = null;
    @GuardedBy("DynamiteModule.class")
    @ts2

    /* renamed from: a */
    public static xy6 f7380a = null;
    @GuardedBy("DynamiteModule.class")
    @ts2

    /* renamed from: a */
    public static Boolean f7381a = null;
    @GuardedBy("DynamiteModule.class")
    @ts2

    /* renamed from: a */
    public static String f7382a = null;

    /* renamed from: a */
    public static final ThreadLocal f7383a = new ThreadLocal();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: a */
    public static boolean f7384a = false;
    @KeepForSdk

    /* renamed from: b */
    public static final int f7385b = 1;
    @mr2
    @KeepForSdk

    /* renamed from: b */
    public static final C1415b f7386b = new C1420c();
    @GuardedBy("DynamiteModule.class")
    @ts2

    /* renamed from: b */
    public static Boolean f7387b = null;

    /* renamed from: b */
    public static final ThreadLocal f7388b = new qx5();
    @KeepForSdk

    /* renamed from: c */
    public static final int f7389c = 0;
    @mr2
    @KeepForSdk

    /* renamed from: c */
    public static final C1415b f7390c = new C1421d();
    @KeepForSdk

    /* renamed from: d */
    public static final int f7391d = 0;
    @mr2
    @KeepForSdk

    /* renamed from: d */
    public static final C1415b f7392d = new C1422e();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    public static int f7393e = -1;
    @mr2
    @KeepForSdk

    /* renamed from: e */
    public static final C1415b f7394e = new C1423f();
    @mr2
    @KeepForSdk

    /* renamed from: f */
    public static final C1415b f7395f = new C1424g();
    @mr2

    /* renamed from: g */
    public static final C1415b f7396g = new C1425h();

    /* renamed from: a */
    public final Context f7397a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @ts2
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1414a extends Exception {
        public /* synthetic */ C1414a(String str, fx6 fx6) {
            super(str);
        }

        public /* synthetic */ C1414a(String str, Throwable th, fx6 fx6) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C1415b {

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C1416a {
            /* renamed from: a */
            int mo10410a(@mr2 Context context, @mr2 String str, boolean z) throws C1414a;

            /* renamed from: b */
            int mo10411b(@mr2 Context context, @mr2 String str);
        }

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C1417b {
            @KeepForSdk

            /* renamed from: a */
            public int f7398a = 0;
            @KeepForSdk

            /* renamed from: b */
            public int f7399b = 0;
            @KeepForSdk

            /* renamed from: c */
            public int f7400c = 0;
        }

        @mr2
        @KeepForSdk
        /* renamed from: a */
        C1417b mo10409a(@mr2 Context context, @mr2 String str, @mr2 C1416a aVar) throws C1414a;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f7397a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m8889a(@mr2 Context context, @mr2 String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static int m8890c(@mr2 Context context, @mr2 String str) {
        return m8892f(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d7, code lost:
        r2 = com.onedelhi.secure.nt2.m23165k8(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01db, code lost:
        if (r2 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01dd, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e8, code lost:
        if (r10 != 0) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ea, code lost:
        r9.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ee, code lost:
        r9.set(java.lang.Long.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f5, code lost:
        r1 = r8.f22294a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f7, code lost:
        if (r1 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f9, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fc, code lost:
        r0.set(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ff, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0208, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("Failed to load remote module.", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("Failed to create IDynamiteLoader.", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0212, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("Failed to determine which loading route to use.", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0231, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0233, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        if (r15 == null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (r15.booleanValue() == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r2 = f7379a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        if (r2 == null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6 = (com.onedelhi.secure.wt6) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        if (r6 == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r6.f22294a == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r15 = r18.getApplicationContext();
        r6 = r6.f22294a;
        com.onedelhi.secure.nt2.m23166l8(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (f7393e < 2) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r5 = java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0108, code lost:
        if (r5.booleanValue() == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r2 = r2.mo22191k8(com.onedelhi.secure.nt2.m23166l8(r15), r3, r13, com.onedelhi.secure.nt2.m23166l8(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r2 = r2.mo22190j8(com.onedelhi.secure.nt2.m23166l8(r15), r3, r13, com.onedelhi.secure.nt2.m23166l8(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0131, code lost:
        r2 = (android.content.Context) com.onedelhi.secure.nt2.m23165k8(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0137, code lost:
        if (r2 == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("Failed to get module context", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014c, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0156, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("No result cursor", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0157, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0161, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("DynamiteLoaderV2 was not cached.", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0163, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0167, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0169, code lost:
        r17 = r5;
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r13);
        r2 = m8898l(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018d, code lost:
        if (r2 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018f, code lost:
        r4 = r2.mo27156s5();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        if (r4 < 3) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        r4 = (com.onedelhi.secure.wt6) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019c, code lost:
        if (r4 == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019e, code lost:
        r2 = r2.mo27153m8(com.onedelhi.secure.nt2.m23166l8(r18), r3, r13, com.onedelhi.secure.nt2.m23166l8(r4.f22294a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b5, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.C1414a("No cached result cursor holder", (com.onedelhi.secure.fx6) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b6, code lost:
        if (r4 != 2) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b8, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r2 = r2.mo27154n8(com.onedelhi.secure.nt2.m23166l8(r18), r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c8, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r2 = r2.mo27152l8(com.onedelhi.secure.nt2.m23166l8(r18), r3, r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0277 A[Catch:{ all -> 0x0300 }] */
    @com.onedelhi.secure.mr2
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m8891e(@com.onedelhi.secure.mr2 android.content.Context r18, @com.onedelhi.secure.mr2 com.google.android.gms.dynamite.DynamiteModule.C1415b r19, @com.onedelhi.secure.mr2 java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.C1414a {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            android.content.Context r5 = r18.getApplicationContext()
            r6 = 0
            if (r5 == 0) goto L_0x0321
            java.lang.ThreadLocal r0 = f7383a
            java.lang.Object r7 = r0.get()
            com.onedelhi.secure.wt6 r7 = (com.onedelhi.secure.wt6) r7
            com.onedelhi.secure.wt6 r8 = new com.onedelhi.secure.wt6
            r8.<init>(r6)
            r0.set(r8)
            java.lang.ThreadLocal r9 = f7388b
            java.lang.Object r10 = r9.get()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0300 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0300 }
            r9.set(r14)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r14 = f7377a     // Catch:{ all -> 0x0300 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r14 = r2.mo10409a(r1, r3, r14)     // Catch:{ all -> 0x0300 }
            java.lang.String r15 = "DynamiteModule"
            int r6 = r14.f7398a     // Catch:{ all -> 0x0300 }
            int r12 = r14.f7399b     // Catch:{ all -> 0x0300 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            r13.<init>()     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = "Considering local module "
            r13.append(r2)     // Catch:{ all -> 0x0300 }
            r13.append(r3)     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = ":"
            r13.append(r2)     // Catch:{ all -> 0x0300 }
            r13.append(r6)     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = " and remote module "
            r13.append(r2)     // Catch:{ all -> 0x0300 }
            r13.append(r3)     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = ":"
            r13.append(r2)     // Catch:{ all -> 0x0300 }
            r13.append(r12)     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = r13.toString()     // Catch:{ all -> 0x0300 }
            android.util.Log.i(r15, r2)     // Catch:{ all -> 0x0300 }
            int r2 = r14.f7400c     // Catch:{ all -> 0x0300 }
            if (r2 == 0) goto L_0x02cf
            r6 = -1
            if (r2 != r6) goto L_0x007a
            int r2 = r14.f7398a     // Catch:{ all -> 0x0300 }
            if (r2 == 0) goto L_0x02cf
            r2 = -1
        L_0x007a:
            r12 = 1
            if (r2 != r12) goto L_0x0081
            int r13 = r14.f7399b     // Catch:{ all -> 0x0300 }
            if (r13 == 0) goto L_0x02cf
        L_0x0081:
            if (r2 != r6) goto L_0x00a3
            com.google.android.gms.dynamite.DynamiteModule r1 = m8894h(r5, r3)     // Catch:{ all -> 0x0300 }
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0091
            r9.remove()
            goto L_0x0098
        L_0x0091:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r9.set(r2)
        L_0x0098:
            android.database.Cursor r2 = r8.f22294a
            if (r2 == 0) goto L_0x009f
            r2.close()
        L_0x009f:
            r0.set(r7)
            return r1
        L_0x00a3:
            if (r2 != r12) goto L_0x02b7
            int r13 = r14.f7399b     // Catch:{ a -> 0x0256 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            boolean r15 = m8897k(r18)     // Catch:{ all -> 0x022a }
            if (r15 == 0) goto L_0x021d
            java.lang.Boolean r15 = f7381a     // Catch:{ all -> 0x022a }
            monitor-exit(r4)     // Catch:{ all -> 0x022a }
            if (r15 == 0) goto L_0x0212
            boolean r15 = r15.booleanValue()     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r12 = 2
            if (r15 == 0) goto L_0x0169
            java.lang.String r15 = "DynamiteModule"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r6.<init>()     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            java.lang.String r2 = "Selected remote version of "
            r6.append(r2)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r6.append(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            java.lang.String r2 = ", version >= "
            r6.append(r2)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r6.append(r13)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            java.lang.String r2 = r6.toString()     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            android.util.Log.i(r15, r2)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            com.onedelhi.secure.p07 r2 = f7379a     // Catch:{ all -> 0x0162 }
            monitor-exit(r4)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0157
            java.lang.Object r6 = r0.get()     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            com.onedelhi.secure.wt6 r6 = (com.onedelhi.secure.wt6) r6     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            if (r6 == 0) goto L_0x014c
            android.database.Cursor r15 = r6.f22294a     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            if (r15 == 0) goto L_0x014c
            android.content.Context r15 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            android.database.Cursor r6 = r6.f22294a     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r16 = 0
            com.onedelhi.secure.nt2.m23166l8(r16)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0244, all -> 0x0235 }
            r17 = r5
            int r5 = f7393e     // Catch:{ all -> 0x0149 }
            if (r5 < r12) goto L_0x00fe
            r12 = 1
            goto L_0x00ff
        L_0x00fe:
            r12 = 0
        L_0x00ff:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0149 }
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            boolean r4 = r5.booleanValue()     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            if (r4 == 0) goto L_0x011e
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r4 = com.onedelhi.secure.nt2.m23166l8(r15)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r5 = com.onedelhi.secure.nt2.m23166l8(r6)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r2 = r2.mo22191k8(r4, r3, r13, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            goto L_0x0131
        L_0x011e:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r4 = com.onedelhi.secure.nt2.m23166l8(r15)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r5 = com.onedelhi.secure.nt2.m23166l8(r6)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r2 = r2.mo22190j8(r4, r3, r13, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0131:
            java.lang.Object r2 = com.onedelhi.secure.nt2.m23165k8(r2)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            if (r2 == 0) goto L_0x0140
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            goto L_0x01e4
        L_0x0140:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "Failed to get module context"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0149:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x014c:
            r17 = r5
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "No result cursor"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0157:
            r17 = r5
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0162:
            r0 = move-exception
            r17 = r5
        L_0x0165:
            monitor-exit(r4)     // Catch:{ all -> 0x0167 }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0167:
            r0 = move-exception
            goto L_0x0165
        L_0x0169:
            r17 = r5
            java.lang.String r2 = "DynamiteModule"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r4.<init>()     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r5 = "Selected remote version of "
            r4.append(r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r4.append(r3)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r5 = ", version >= "
            r4.append(r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r4.append(r13)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            android.util.Log.i(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.xy6 r2 = m8898l(r18)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            if (r2 == 0) goto L_0x0209
            int r4 = r2.mo27156s5()     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r5 = 3
            if (r4 < r5) goto L_0x01b6
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.wt6 r4 = (com.onedelhi.secure.wt6) r4     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            if (r4 == 0) goto L_0x01ad
            com.onedelhi.secure.tn1 r5 = com.onedelhi.secure.nt2.m23166l8(r18)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            android.database.Cursor r4 = r4.f22294a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r4 = com.onedelhi.secure.nt2.m23166l8(r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r2 = r2.mo27153m8(r5, r3, r13, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            goto L_0x01d7
        L_0x01ad:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "No cached result cursor holder"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x01b6:
            if (r4 != r12) goto L_0x01c8
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "IDynamite loader version = 2"
            android.util.Log.w(r4, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r4 = com.onedelhi.secure.nt2.m23166l8(r18)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r2 = r2.mo27154n8(r4, r3, r13)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            goto L_0x01d7
        L_0x01c8:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r4, r5)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r4 = com.onedelhi.secure.nt2.m23166l8(r18)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            com.onedelhi.secure.tn1 r2 = r2.mo27152l8(r4, r3, r13)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x01d7:
            java.lang.Object r2 = com.onedelhi.secure.nt2.m23165k8(r2)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            if (r2 == 0) goto L_0x0200
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x01e4:
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01ee
            r9.remove()
            goto L_0x01f5
        L_0x01ee:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r9.set(r1)
        L_0x01f5:
            android.database.Cursor r1 = r8.f22294a
            if (r1 == 0) goto L_0x01fc
            r1.close()
        L_0x01fc:
            r0.set(r7)
            return r4
        L_0x0200:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "Failed to load remote module."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0209:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x0212:
            r17 = r5
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x021d:
            r17 = r5
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0228 }
            java.lang.String r2 = "Remote loading disabled"
            r5 = 0
            r0.<init>(r2, r5)     // Catch:{ all -> 0x0228 }
            throw r0     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r0 = move-exception
            goto L_0x022d
        L_0x022a:
            r0 = move-exception
            r17 = r5
        L_0x022d:
            monitor-exit(r4)     // Catch:{ all -> 0x0228 }
            throw r0     // Catch:{ RemoteException -> 0x0233, a -> 0x0231, all -> 0x022f }
        L_0x022f:
            r0 = move-exception
            goto L_0x0238
        L_0x0231:
            r0 = move-exception
            goto L_0x0247
        L_0x0233:
            r0 = move-exception
            goto L_0x024b
        L_0x0235:
            r0 = move-exception
            r17 = r5
        L_0x0238:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ a -> 0x0254 }
            com.google.android.gms.dynamite.DynamiteModule$a r2 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0254 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r2.<init>(r4, r0, r5)     // Catch:{ a -> 0x0254 }
            throw r2     // Catch:{ a -> 0x0254 }
        L_0x0244:
            r0 = move-exception
            r17 = r5
        L_0x0247:
            throw r0     // Catch:{ a -> 0x0254 }
        L_0x0248:
            r0 = move-exception
            r17 = r5
        L_0x024b:
            com.google.android.gms.dynamite.DynamiteModule$a r2 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0254 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r2.<init>(r4, r0, r5)     // Catch:{ a -> 0x0254 }
            throw r2     // Catch:{ a -> 0x0254 }
        L_0x0254:
            r0 = move-exception
            goto L_0x0259
        L_0x0256:
            r0 = move-exception
            r17 = r5
        L_0x0259:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0300 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            r5.<init>()     // Catch:{ all -> 0x0300 }
            java.lang.String r6 = "Failed to load remote module: "
            r5.append(r6)     // Catch:{ all -> 0x0300 }
            r5.append(r4)     // Catch:{ all -> 0x0300 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0300 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0300 }
            int r2 = r14.f7398a     // Catch:{ all -> 0x0300 }
            if (r2 == 0) goto L_0x02ae
            com.google.android.gms.dynamite.i r4 = new com.google.android.gms.dynamite.i     // Catch:{ all -> 0x0300 }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ all -> 0x0300 }
            r2 = r19
            com.google.android.gms.dynamite.DynamiteModule$b$b r1 = r2.mo10409a(r1, r3, r4)     // Catch:{ all -> 0x0300 }
            int r1 = r1.f7400c     // Catch:{ all -> 0x0300 }
            r2 = -1
            if (r1 != r2) goto L_0x02ae
            r1 = r17
            com.google.android.gms.dynamite.DynamiteModule r0 = m8894h(r1, r3)     // Catch:{ all -> 0x0300 }
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.ThreadLocal r1 = f7388b
            if (r3 != 0) goto L_0x029a
            r1.remove()
            goto L_0x02a1
        L_0x029a:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L_0x02a1:
            android.database.Cursor r1 = r8.f22294a
            if (r1 == 0) goto L_0x02a8
            r1.close()
        L_0x02a8:
            java.lang.ThreadLocal r1 = f7383a
            r1.set(r7)
            return r0
        L_0x02ae:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0300 }
            throw r1     // Catch:{ all -> 0x0300 }
        L_0x02b7:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0300 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            r1.<init>()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "VersionPolicy returned invalid code:"
            r1.append(r3)     // Catch:{ all -> 0x0300 }
            r1.append(r2)     // Catch:{ all -> 0x0300 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0300 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0300 }
            throw r0     // Catch:{ all -> 0x0300 }
        L_0x02cf:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0300 }
            int r1 = r14.f7398a     // Catch:{ all -> 0x0300 }
            int r2 = r14.f7399b     // Catch:{ all -> 0x0300 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            r4.<init>()     // Catch:{ all -> 0x0300 }
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch:{ all -> 0x0300 }
            r4.append(r3)     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x0300 }
            r4.append(r1)     // Catch:{ all -> 0x0300 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x0300 }
            r4.append(r2)     // Catch:{ all -> 0x0300 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0300 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0300 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0300 }
            throw r0     // Catch:{ all -> 0x0300 }
        L_0x0300:
            r0 = move-exception
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.ThreadLocal r1 = f7388b
            if (r3 != 0) goto L_0x030d
            r1.remove()
            goto L_0x0314
        L_0x030d:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L_0x0314:
            android.database.Cursor r1 = r8.f22294a
            if (r1 == 0) goto L_0x031b
            r1.close()
        L_0x031b:
            java.lang.ThreadLocal r1 = f7383a
            r1.set(r7)
            throw r0
        L_0x0321:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8891e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    /* renamed from: f */
    public static int m8892f(@com.onedelhi.secure.mr2 android.content.Context r10, @com.onedelhi.secure.mr2 java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01bf }
            java.lang.Boolean r1 = f7381a     // Catch:{ all -> 0x01bc }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d5
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            if (r5 != r6) goto L_0x0036
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m8895i(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x003f:
            boolean r5 = m8897k(r10)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r3
        L_0x0048:
            boolean r5 = f7384a     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a5
        L_0x0055:
            r6 = 1
            int r6 = m8893g(r10, r11, r12, r6)     // Catch:{ a -> 0x009d }
            java.lang.String r7 = f7382a     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = com.onedelhi.secure.zl5.m33245a()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f7382a     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.onedelhi.secure.ls5 r7 = new com.onedelhi.secure.ls5     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f7382a     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            m8895i(r7)     // Catch:{ a -> 0x009d }
            r1.set(r2, r7)     // Catch:{ a -> 0x009d }
            f7381a = r5     // Catch:{ a -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00ad:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            goto L_0x00d3
        L_0x00af:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r1 = move-exception
        L_0x00b7:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01bc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r5.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch:{ all -> 0x01bc }
            r5.append(r1)     // Catch:{ all -> 0x01bc }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01bc }
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x01bc }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01bc }
        L_0x00d3:
            f7381a = r1     // Catch:{ all -> 0x01bc }
        L_0x00d5:
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00fd
            int r10 = m8893g(r10, r11, r12, r3)     // Catch:{ a -> 0x00e1 }
            return r10
        L_0x00e1:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r0.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01bf }
            r0.append(r11)     // Catch:{ all -> 0x01bf }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x01bf }
            android.util.Log.w(r12, r11)     // Catch:{ all -> 0x01bf }
            return r3
        L_0x00fd:
            com.onedelhi.secure.xy6 r4 = m8898l(r10)     // Catch:{ all -> 0x01bf }
            if (r4 != 0) goto L_0x0105
            goto L_0x01b3
        L_0x0105:
            int r0 = r4.mo27156s5()     // Catch:{ RemoteException -> 0x0192 }
            r1 = 3
            if (r0 < r1) goto L_0x016d
            java.lang.ThreadLocal r0 = f7383a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            com.onedelhi.secure.wt6 r0 = (com.onedelhi.secure.wt6) r0     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            android.database.Cursor r0 = r0.f22294a     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0120:
            com.onedelhi.secure.tn1 r5 = com.onedelhi.secure.nt2.m23166l8(r10)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.ThreadLocal r0 = f7388b     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0192 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0192 }
            r6 = r11
            r7 = r12
            com.onedelhi.secure.tn1 r11 = r4.mo27155o8(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r11 = com.onedelhi.secure.nt2.m23165k8(r11)     // Catch:{ RemoteException -> 0x0192 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0192 }
            if (r11 == 0) goto L_0x015a
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r12 != 0) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r12 <= 0) goto L_0x0152
            boolean r0 = m8896j(r11)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r0 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r2 = r11
        L_0x0153:
            if (r2 == 0) goto L_0x0158
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x0158:
            r3 = r12
            goto L_0x01b3
        L_0x015a:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r11 == 0) goto L_0x01b3
            r11.close()     // Catch:{ all -> 0x01bf }
            goto L_0x01b3
        L_0x0167:
            r12 = move-exception
            r2 = r11
            goto L_0x01b6
        L_0x016a:
            r12 = move-exception
            r2 = r11
            goto L_0x0194
        L_0x016d:
            r1 = 2
            if (r0 != r1) goto L_0x0180
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0192 }
            com.onedelhi.secure.tn1 r0 = com.onedelhi.secure.nt2.m23166l8(r10)     // Catch:{ RemoteException -> 0x0192 }
            int r3 = r4.mo27151k8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0180:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0192 }
            com.onedelhi.secure.tn1 r0 = com.onedelhi.secure.nt2.m23166l8(r10)     // Catch:{ RemoteException -> 0x0192 }
            int r3 = r4.mo27150j8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0190:
            r12 = r11
            goto L_0x01b6
        L_0x0192:
            r11 = move-exception
            r12 = r11
        L_0x0194:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x01b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r0.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01b4 }
            r0.append(r12)     // Catch:{ all -> 0x01b4 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x01b3
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x01b3:
            return r3
        L_0x01b4:
            r11 = move-exception
            goto L_0x0190
        L_0x01b6:
            if (r2 == 0) goto L_0x01bb
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x01bb:
            throw r12     // Catch:{ all -> 0x01bf }
        L_0x01bc:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            throw r11     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8892f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8893g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.C1414a {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f7388b     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f7382a = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f7393e = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f7384a = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m8896j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00da
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.C1414a     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00d8 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r11.getMessage()     // Catch:{ all -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r1.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "V2 version check failed: "
            r1.append(r2)     // Catch:{ all -> 0x00d8 }
            r1.append(r13)     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00d8 }
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00d8 }
            throw r12     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r11 = move-exception
            r0 = r10
        L_0x00da:
            if (r0 == 0) goto L_0x00df
            r0.close()
        L_0x00df:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8893g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    public static DynamiteModule m8894h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: i */
    public static void m8895i(ClassLoader classLoader) throws C1414a {
        p07 p07;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                p07 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                p07 = queryLocalInterface instanceof p07 ? (p07) queryLocalInterface : new p07(iBinder);
            }
            f7379a = p07;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1414a("Failed to instantiate dynamite loader", e, (fx6) null);
        }
    }

    /* renamed from: j */
    public static boolean m8896j(Cursor cursor) {
        wt6 wt6 = (wt6) f7383a.get();
        if (wt6 == null || wt6.f22294a != null) {
            return false;
        }
        wt6.f22294a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: k */
    public static boolean m8897k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f7387b)) {
            return true;
        }
        boolean z = false;
        if (f7387b == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f7387b = valueOf;
            z = valueOf.booleanValue();
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7384a = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @ts2
    /* renamed from: l */
    public static xy6 m8898l(Context context) {
        xy6 xy6;
        synchronized (DynamiteModule.class) {
            xy6 xy62 = f7380a;
            if (xy62 != null) {
                return xy62;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    xy6 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    xy6 = queryLocalInterface instanceof xy6 ? (xy6) queryLocalInterface : new xy6(iBinder);
                }
                if (xy6 != null) {
                    f7380a = xy6;
                    return xy6;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
        }
        return null;
    }

    @ResultIgnorabilityUnspecified
    @mr2
    @KeepForSdk
    /* renamed from: b */
    public Context mo10407b() {
        return this.f7397a;
    }

    @mr2
    @KeepForSdk
    /* renamed from: d */
    public IBinder mo10408d(@mr2 String str) throws C1414a {
        try {
            return (IBinder) this.f7397a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C1414a("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (fx6) null);
        }
    }
}
