package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.o74;
import com.onedelhi.secure.ym3;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class ae0 {
    @mr2

    /* renamed from: a */
    public final Context f9014a;
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public final Intent f9015a;
    @mr2

    /* renamed from: a */
    public final o74.C3039c f9016a;

    /* renamed from: a */
    public final ym3.C4013c f9017a;
    @mr2

    /* renamed from: a */
    public final ym3.C4014d f9018a;
    @ts2

    /* renamed from: a */
    public final ym3.C4015e f9019a;
    @ts2

    /* renamed from: a */
    public final File f9020a;
    @ts2

    /* renamed from: a */
    public final String f9021a;
    @ts2

    /* renamed from: a */
    public final List<ym3.C4012b> f9022a;

    /* renamed from: a */
    public final Set<Integer> f9023a;
    @ts2

    /* renamed from: a */
    public final Callable<InputStream> f9024a;
    @mr2

    /* renamed from: a */
    public final Executor f9025a;

    /* renamed from: a */
    public final boolean f9026a;
    @ts2

    /* renamed from: b */
    public final String f9027b;
    @mr2

    /* renamed from: b */
    public final List<Object> f9028b;
    @mr2

    /* renamed from: b */
    public final Executor f9029b;

    /* renamed from: b */
    public final boolean f9030b;
    @mr2

    /* renamed from: c */
    public final List<C2629kf> f9031c;

    /* renamed from: c */
    public final boolean f9032c;

    /* renamed from: d */
    public final boolean f9033d;

    @SuppressLint({"LambdaLast"})
    @hl3({hl3.C2354a.f13188c})
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, @mr2 ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, @ts2 Intent intent, boolean z2, boolean z3, @ts2 Set<Integer> set, @ts2 String str2, @ts2 File file, @ts2 Callable<InputStream> callable, @ts2 ym3.C4015e eVar, @ts2 List<Object> list2, @ts2 List<C2629kf> list3) {
        Intent intent2 = intent;
        this.f9016a = cVar;
        this.f9014a = context;
        this.f9021a = str;
        this.f9018a = dVar;
        this.f9022a = list;
        this.f9026a = z;
        this.f9017a = cVar2;
        this.f9025a = executor;
        this.f9029b = executor2;
        this.f9015a = intent2;
        this.f9030b = intent2 != null;
        this.f9032c = z2;
        this.f9033d = z3;
        this.f9023a = set;
        this.f9027b = str2;
        this.f9020a = file;
        this.f9024a = callable;
        this.f9019a = eVar;
        this.f9028b = list2 == null ? Collections.emptyList() : list2;
        this.f9031c = list3 == null ? Collections.emptyList() : list3;
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, boolean z2, boolean z3, boolean z4, @ts2 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, (String) null, (File) null, (Callable<InputStream>) null, (ym3.C4015e) null, (List<Object>) null, (List<C2629kf>) null);
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, boolean z2, boolean z3, boolean z4, @ts2 Set<Integer> set, @ts2 String str2, @ts2 File file) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, (Callable<InputStream>) null, (ym3.C4015e) null, (List<Object>) null, (List<C2629kf>) null);
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, @mr2 ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, boolean z2, boolean z3, boolean z4, @ts2 Set<Integer> set, @ts2 String str2, @ts2 File file, @ts2 Callable<InputStream> callable) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, callable, (ym3.C4015e) null, (List<Object>) null, (List<C2629kf>) null);
    }

    @SuppressLint({"LambdaLast"})
    @hl3({hl3.C2354a.f13188c})
    @Deprecated
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, @mr2 ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, boolean z2, boolean z3, boolean z4, @ts2 Set<Integer> set, @ts2 String str2, @ts2 File file, @ts2 Callable<InputStream> callable, @ts2 ym3.C4015e eVar) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, callable, eVar, (List<Object>) null, (List<C2629kf>) null);
    }

    @SuppressLint({"LambdaLast"})
    @hl3({hl3.C2354a.f13188c})
    @Deprecated
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, @mr2 ym3.C4013c cVar2, @mr2 Executor executor, @mr2 Executor executor2, boolean z2, boolean z3, boolean z4, @ts2 Set<Integer> set, @ts2 String str2, @ts2 File file, @ts2 Callable<InputStream> callable, @ts2 ym3.C4015e eVar, @ts2 List<Object> list2) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, callable, eVar, list2, (List<C2629kf>) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"LambdaLast"})
    @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ae0(@com.onedelhi.secure.mr2 android.content.Context r23, @com.onedelhi.secure.ts2 java.lang.String r24, @com.onedelhi.secure.mr2 com.onedelhi.secure.o74.C3039c r25, @com.onedelhi.secure.mr2 com.onedelhi.secure.ym3.C4014d r26, @com.onedelhi.secure.ts2 java.util.List<com.onedelhi.secure.ym3.C4012b> r27, boolean r28, @com.onedelhi.secure.mr2 com.onedelhi.secure.ym3.C4013c r29, @com.onedelhi.secure.mr2 java.util.concurrent.Executor r30, @com.onedelhi.secure.mr2 java.util.concurrent.Executor r31, boolean r32, boolean r33, boolean r34, @com.onedelhi.secure.ts2 java.util.Set<java.lang.Integer> r35, @com.onedelhi.secure.ts2 java.lang.String r36, @com.onedelhi.secure.ts2 java.io.File r37, @com.onedelhi.secure.ts2 java.util.concurrent.Callable<java.io.InputStream> r38, @com.onedelhi.secure.ts2 com.onedelhi.secure.ym3.C4015e r39, @com.onedelhi.secure.ts2 java.util.List<java.lang.Object> r40, @com.onedelhi.secure.ts2 java.util.List<com.onedelhi.secure.C2629kf> r41) {
        /*
            r22 = this;
            if (r32 == 0) goto L_0x000c
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r1 = androidx.room.MultiInstanceInvalidationService.class
            r3 = r23
            r0.<init>(r3, r1)
            goto L_0x000f
        L_0x000c:
            r3 = r23
            r0 = 0
        L_0x000f:
            r12 = r0
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r2.<init>((android.content.Context) r3, (java.lang.String) r4, (com.onedelhi.secure.o74.C3039c) r5, (com.onedelhi.secure.ym3.C4014d) r6, (java.util.List<com.onedelhi.secure.ym3.C4012b>) r7, (boolean) r8, (com.onedelhi.secure.ym3.C4013c) r9, (java.util.concurrent.Executor) r10, (java.util.concurrent.Executor) r11, (android.content.Intent) r12, (boolean) r13, (boolean) r14, (java.util.Set<java.lang.Integer>) r15, (java.lang.String) r16, (java.io.File) r17, (java.util.concurrent.Callable<java.io.InputStream>) r18, (com.onedelhi.secure.ym3.C4015e) r19, (java.util.List<java.lang.Object>) r20, (java.util.List<com.onedelhi.secure.C2629kf>) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ae0.<init>(android.content.Context, java.lang.String, com.onedelhi.secure.o74$c, com.onedelhi.secure.ym3$d, java.util.List, boolean, com.onedelhi.secure.ym3$c, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, com.onedelhi.secure.ym3$e, java.util.List, java.util.List):void");
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    public ae0(@mr2 Context context, @ts2 String str, @mr2 o74.C3039c cVar, @mr2 ym3.C4014d dVar, @ts2 List<ym3.C4012b> list, boolean z, ym3.C4013c cVar2, @mr2 Executor executor, boolean z2, @ts2 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor, false, z2, false, set, (String) null, (File) null, (Callable<InputStream>) null, (ym3.C4015e) null, (List<Object>) null, (List<C2629kf>) null);
    }

    /* renamed from: a */
    public boolean mo13012a(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.f9033d) && this.f9032c && ((set = this.f9023a) == null || !set.contains(Integer.valueOf(i)));
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo13013b(int i) {
        return mo13012a(i, i + 1);
    }
}
