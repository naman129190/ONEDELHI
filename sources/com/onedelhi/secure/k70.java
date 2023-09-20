package com.onedelhi.secure;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

public final class k70 {

    @sj3(16)
    /* renamed from: com.onedelhi.secure.k70$a */
    public static class C2608a {
        @pn0
        /* renamed from: a */
        public static Cursor m19514a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.onedelhi.secure.ts2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m19513a(@com.onedelhi.secure.mr2 android.content.ContentResolver r7, @com.onedelhi.secure.mr2 android.net.Uri r8, @com.onedelhi.secure.ts2 java.lang.String[] r9, @com.onedelhi.secure.ts2 java.lang.String r10, @com.onedelhi.secure.ts2 java.lang.String[] r11, @com.onedelhi.secure.ts2 java.lang.String r12, @com.onedelhi.secure.ts2 com.onedelhi.secure.C3345qu r13) {
        /*
            if (r13 == 0) goto L_0x0009
            java.lang.Object r13 = r13.mo23440b()     // Catch:{ Exception -> 0x0007 }
            goto L_0x000a
        L_0x0007:
            r7 = move-exception
            goto L_0x0018
        L_0x0009:
            r13 = 0
        L_0x000a:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch:{ Exception -> 0x0007 }
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = com.onedelhi.secure.k70.C2608a.m19514a(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0007 }
            return r7
        L_0x0018:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L_0x0022
            com.onedelhi.secure.fw2 r7 = new com.onedelhi.secure.fw2
            r7.<init>()
            throw r7
        L_0x0022:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.k70.m19513a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, com.onedelhi.secure.qu):android.database.Cursor");
    }
}
