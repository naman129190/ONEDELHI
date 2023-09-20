package com.onedelhi.secure;

public final class h47 {

    /* renamed from: a */
    public long f12910a;

    /* renamed from: a */
    public final /* synthetic */ db5 f12911a;

    /* renamed from: a */
    public x86 f12912a;

    /* renamed from: a */
    public Long f12913a;

    public /* synthetic */ h47(db5 db5, r37 r37) {
        this.f12911a = db5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.x86 mo17065a(java.lang.String r18, com.onedelhi.secure.x86 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo26819I()
            java.util.List r9 = r19.mo26820J()
            com.onedelhi.secure.db5 r2 = r1.f12911a
            com.onedelhi.secure.qq6 r2 = r2.f21907a
            r2.mo23380g0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.onedelhi.secure.uq6.m29506o(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.qq6 r0 = r0.f21907a
            r0.mo23380g0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.onedelhi.secure.uq6.m29506o(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12728t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo25380b(r2, r4)
            return r5
        L_0x0055:
            com.onedelhi.secure.x86 r0 = r1.f12912a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f12913a
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f12913a
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.qq6 r0 = r0.f21907a
            com.onedelhi.secure.vg5 r13 = r0.mo23370W()
            r13.mo15139h()
            r13.mo27038i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo26063P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r14 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r15[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r16 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r15[r11] = r16     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            android.database.Cursor r14 = r0.rawQuery(r14, r15)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.onedelhi.secure.za6 r0 = r13.f11205a     // Catch:{ SQLiteException -> 0x00e3 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x00e3 }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo25379a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            com.onedelhi.secure.u86 r5 = com.onedelhi.secure.x86.m31321F()     // Catch:{ IOException -> 0x00ce }
            com.onedelhi.secure.us6 r0 = com.onedelhi.secure.uq6.m29499C(r5, r0)     // Catch:{ IOException -> 0x00ce }
            com.onedelhi.secure.u86 r0 = (com.onedelhi.secure.u86) r0     // Catch:{ IOException -> 0x00ce }
            com.onedelhi.secure.jq6 r0 = r0.mo17922m()     // Catch:{ IOException -> 0x00ce }
            com.onedelhi.secure.x86 r0 = (com.onedelhi.secure.x86) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.onedelhi.secure.za6 r5 = r13.f11205a     // Catch:{ SQLiteException -> 0x00e3 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ SQLiteException -> 0x00e3 }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.onedelhi.secure.a56.m10802z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo25382d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.onedelhi.secure.za6 r5 = r13.f11205a     // Catch:{ all -> 0x01de }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x01de }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo25380b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            com.onedelhi.secure.x86 r5 = (com.onedelhi.secure.x86) r5
            r1.f12912a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f12910a = r12
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.qq6 r0 = r0.f21907a
            r0.mo23380g0()
            com.onedelhi.secure.x86 r0 = r1.f12912a
            java.lang.Object r0 = com.onedelhi.secure.uq6.m29506o(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f12913a = r0
        L_0x0127:
            long r12 = r1.f12910a
            r14 = -1
            long r12 = r12 + r14
            r1.f12910a = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.qq6 r0 = r0.f21907a
            com.onedelhi.secure.vg5 r2 = r0.mo23370W()
            r2.mo15139h()
            com.onedelhi.secure.za6 r0 = r2.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo25380b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo26063P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x015b }
            r0.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12726r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo25380b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.qq6 r0 = r0.f21907a
            com.onedelhi.secure.vg5 r2 = r0.mo23370W()
            long r5 = r1.f12910a
            com.onedelhi.secure.x86 r7 = r1.f12912a
            r3 = r18
            r2.mo26090v(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.onedelhi.secure.x86 r2 = r1.f12912a
            java.util.List r2 = r2.mo26820J()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.j96 r3 = (com.onedelhi.secure.j96) r3
            com.onedelhi.secure.db5 r4 = r1.f12911a
            com.onedelhi.secure.qq6 r4 = r4.f21907a
            r4.mo23380g0()
            java.lang.String r4 = r3.mo18174H()
            com.onedelhi.secure.j96 r4 = com.onedelhi.secure.uq6.m29505n(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12728t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo25380b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.onedelhi.secure.db5 r0 = r1.f12911a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12728t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo25381c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f12913a = r4
            r1.f12912a = r8
            com.onedelhi.secure.db5 r2 = r1.f12911a
            com.onedelhi.secure.qq6 r2 = r2.f21907a
            r2.mo23380g0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.onedelhi.secure.uq6.m29506o(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f12910a = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.onedelhi.secure.db5 r2 = r1.f12911a
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12728t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo25380b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.onedelhi.secure.db5 r2 = r1.f12911a
            com.onedelhi.secure.qq6 r2 = r2.f21907a
            com.onedelhi.secure.vg5 r2 = r2.mo23370W()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f12910a
            r3 = r18
            r7 = r19
            r2.mo26090v(r3, r4, r5, r7)
        L_0x0233:
            com.onedelhi.secure.ip6 r2 = r19.mo18543k()
            com.onedelhi.secure.u86 r2 = (com.onedelhi.secure.u86) r2
            r2.mo25453y(r0)
            r2.mo25451w()
            r2.mo25448t(r9)
            com.onedelhi.secure.jq6 r0 = r2.mo17922m()
            com.onedelhi.secure.x86 r0 = (com.onedelhi.secure.x86) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h47.mo17065a(java.lang.String, com.onedelhi.secure.x86):com.onedelhi.secure.x86");
    }
}
