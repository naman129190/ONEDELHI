package com.onedelhi.secure;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\bJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J3\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J.\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0018*\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001aH\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¨\u0006#"}, d2 = {"Lcom/onedelhi/secure/d01;", "", "", "Lcom/onedelhi/secure/yb2;", "d", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "baseClass", "", "serviceClass", "a", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d01 {
    @vr2

    /* renamed from: a */
    public static final d01 f27167a = new d01();
    @vr2

    /* renamed from: a */
    public static final String f27168a = "META-INF/services/";

    /* renamed from: a */
    public final yb2 mo34033a(Class<yb2> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <S> S mo34034b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: c */
    public final <S> List<S> mo34035c(Class<S> cls, ClassLoader classLoader) {
        try {
            return mo34037e(cls, classLoader);
        } catch (Throwable unused) {
            return a10.m35769Q5(ServiceLoader.load(cls, classLoader));
        }
    }

    @vr2
    /* renamed from: d */
    public final List<yb2> mo34036d() {
        yb2 yb2;
        Class<yb2> cls = yb2.class;
        if (!e01.m45748a()) {
            return mo34035c(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            yb2 yb22 = null;
            try {
                yb2 = cls.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                yb2 = null;
            }
            if (yb2 != null) {
                arrayList.add(yb2);
            }
            try {
                yb22 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (yb22 == null) {
                return arrayList;
            }
            arrayList.add(yb22);
            return arrayList;
        } catch (Throwable unused3) {
            return mo34035c(cls, cls.getClassLoader());
        }
    }

    @vr2
    /* renamed from: e */
    public final <S> List<S> mo34037e(@vr2 Class<S> cls, @vr2 ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources(jt1.m53745C(f27168a, cls.getName())));
        jt1.m53776o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T f : list) {
            x00.m69813p0(arrayList, f27167a.mo34038f(f));
        }
        Set<String> V5 = a10.m35794V5(arrayList);
        if (!V5.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(t00.m65073Z(V5, 10));
            for (String b : V5) {
                arrayList2.add(f27167a.mo34034b(b, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        com.onedelhi.secure.pw0.m61687a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        throw r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo34038f(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = com.onedelhi.secure.t54.m65466u2(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = com.onedelhi.secure.u54.m66665p5(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = com.onedelhi.secure.u54.m66686w5(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = com.onedelhi.secure.u54.m66665p5(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0051 }
            r6.<init>(r2)     // Catch:{ all -> 0x0051 }
            com.onedelhi.secure.d01 r0 = f27167a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.mo34039g(r6)     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.C5630hz.m51313a(r6, r4)     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r6 = move-exception
            throw r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r6, r0)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x0058:
            r0 = move-exception
            com.onedelhi.secure.pw0.m61687a(r6, r0)
            throw r6
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            com.onedelhi.secure.d01 r6 = f27167a     // Catch:{ all -> 0x0075 }
            java.util.List r6 = r6.mo34039g(r0)     // Catch:{ all -> 0x0075 }
            com.onedelhi.secure.C5630hz.m51313a(r0, r4)
            return r6
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d01.mo34038f(java.net.URL):java.util.List");
    }

    /* renamed from: g */
    public final List<String> mo34039g(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return a10.m35769Q5(linkedHashSet);
            }
            String obj = u54.m66544E5(u54.m66689x5(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                i++;
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(jt1.m53745C("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001a, code lost:
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001f, code lost:
        com.onedelhi.secure.pw0.m61687a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0022, code lost:
        throw r4;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo34040h(java.util.jar.JarFile r3, com.onedelhi.secure.ec1<? super java.util.jar.JarFile, ? extends R> r4) {
        /*
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.mo17094X(r3)     // Catch:{ all -> 0x0011 }
            com.onedelhi.secure.uq1.m67403d(r0)
            r3.close()     // Catch:{ all -> 0x000f }
            com.onedelhi.secure.uq1.m67402c(r0)
            return r4
        L_0x000f:
            r3 = move-exception
            throw r3
        L_0x0011:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r1 = move-exception
            com.onedelhi.secure.uq1.m67403d(r0)
            r3.close()     // Catch:{ all -> 0x001e }
            com.onedelhi.secure.uq1.m67402c(r0)
            throw r1
        L_0x001e:
            r3 = move-exception
            com.onedelhi.secure.pw0.m61687a(r4, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d01.mo34040h(java.util.jar.JarFile, com.onedelhi.secure.ec1):java.lang.Object");
    }
}
