package com.onedelhi.secure;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.es2;

public final class f46 extends f66 {

    /* renamed from: a */
    public final c46 f11824a;

    /* renamed from: b */
    public boolean f11825b;

    public f46(za6 za6) {
        super(za6);
        Context f = this.f11205a.mo15137f();
        this.f11205a.mo27891z();
        this.f11824a = new c46(this, f, "google_app_measurement_local.db");
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return false;
    }

    @VisibleForTesting
    @ly4
    /* renamed from: o */
    public final SQLiteDatabase mo15780o() throws SQLiteException {
        if (this.f11825b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11824a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11825b = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|198) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f11205a.mo15136e().mo12726r().mo25379a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.f11205a.mo15136e().mo12726r().mo25379a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1.f11205a.mo15136e().mo12726r().mo25379a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0129 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cc A[SYNTHETIC, Splitter:B:124:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f1 A[SYNTHETIC, Splitter:B:152:0x01f1] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x01cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x023e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x023e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x023e A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo15781p(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.mo15139h()
            boolean r0 = r1.f11825b
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.mo15784s()
            if (r0 == 0) goto L_0x025f
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 5
        L_0x001e:
            if (r8 >= r6) goto L_0x024f
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.mo15780o()     // Catch:{ SQLiteFullException -> 0x0224, SQLiteDatabaseLockedException -> 0x0211, SQLiteException -> 0x01ec, all -> 0x01e9 }
            if (r15 != 0) goto L_0x002a
            r1.f11825b = r10     // Catch:{ SQLiteFullException -> 0x01e4, SQLiteDatabaseLockedException -> 0x01e0, SQLiteException -> 0x01db, all -> 0x01d6 }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01e4, SQLiteDatabaseLockedException -> 0x01e0, SQLiteException -> 0x01db, all -> 0x01d6 }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01c7 }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01c7 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01c3 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01bf }
            r20 = -1
            if (r0 == 0) goto L_0x005b
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01bf }
            r11.close()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            goto L_0x0060
        L_0x005b:
            r11.close()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            r12 = r20
        L_0x0060:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            r14 = r0
            r15 = r11
            goto L_0x0073
        L_0x0071:
            r14 = r4
            r15 = r14
        L_0x0073:
            java.lang.String r12 = "messages"
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01b0 }
        L_0x008f:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            if (r0 == 0) goto L_0x0165
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            if (r0 != 0) goto L_0x00d9
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00c2 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00c2 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00c2 }
            android.os.Parcelable$Creator<com.onedelhi.secure.xj5> r0 = com.onedelhi.secure.xj5.CREATOR     // Catch:{ ParseException -> 0x00c2 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00c2 }
            com.onedelhi.secure.xj5 r0 = (com.onedelhi.secure.xj5) r0     // Catch:{ ParseException -> 0x00c2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            if (r0 == 0) goto L_0x008f
        L_0x00bc:
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            goto L_0x008f
        L_0x00c0:
            r0 = move-exception
            goto L_0x00d5
        L_0x00c2:
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x00c0 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x00c0 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x00c0 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.mo25379a(r13)     // Catch:{ all -> 0x00c0 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            goto L_0x008f
        L_0x00d5:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
        L_0x00d9:
            if (r0 != r10) goto L_0x010e
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00f4 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00f4 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00f4 }
            android.os.Parcelable$Creator<com.onedelhi.secure.wq6> r0 = com.onedelhi.secure.wq6.CREATOR     // Catch:{ ParseException -> 0x00f4 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00f4 }
            com.onedelhi.secure.wq6 r0 = (com.onedelhi.secure.wq6) r0     // Catch:{ ParseException -> 0x00f4 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            goto L_0x0107
        L_0x00f2:
            r0 = move-exception
            goto L_0x010a
        L_0x00f4:
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x00f2 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x00f2 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x00f2 }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.mo25379a(r13)     // Catch:{ all -> 0x00f2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            r0 = r4
        L_0x0107:
            if (r0 == 0) goto L_0x008f
            goto L_0x00bc
        L_0x010a:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
        L_0x010e:
            if (r0 != r12) goto L_0x0144
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x0129 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x0129 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x0129 }
            android.os.Parcelable$Creator<com.onedelhi.secure.fc5> r0 = com.onedelhi.secure.fc5.CREATOR     // Catch:{ ParseException -> 0x0129 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x0129 }
            com.onedelhi.secure.fc5 r0 = (com.onedelhi.secure.fc5) r0     // Catch:{ ParseException -> 0x0129 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            goto L_0x013c
        L_0x0127:
            r0 = move-exception
            goto L_0x0140
        L_0x0129:
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0127 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0127 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x0127 }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.mo25379a(r13)     // Catch:{ all -> 0x0127 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            r0 = r4
        L_0x013c:
            if (r0 == 0) goto L_0x008f
            goto L_0x00bc
        L_0x0140:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
        L_0x0144:
            r12 = 3
            if (r0 != r12) goto L_0x0158
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            java.lang.String r12 = "Skipping app launch break"
        L_0x0153:
            r0.mo25379a(r12)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            goto L_0x008f
        L_0x0158:
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            java.lang.String r12 = "Unknown record type in local database"
            goto L_0x0153
        L_0x0165:
            java.lang.String r0 = "messages"
            java.lang.String r12 = "rowid <= ?"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            java.lang.String r14 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            r13[r7] = r14     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x01a5, all -> 0x01a0 }
            r14 = r23
            int r0 = r14.delete(r0, r12, r13)     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            if (r0 >= r12) goto L_0x018c
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.mo25379a(r12)     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
        L_0x018c:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x019b, all -> 0x0199 }
            r11.close()
            r14.close()
            return r5
        L_0x0199:
            r0 = move-exception
            goto L_0x01a3
        L_0x019b:
            r0 = move-exception
            goto L_0x01de
        L_0x019d:
            r0 = move-exception
            goto L_0x01e7
        L_0x01a0:
            r0 = move-exception
            r14 = r23
        L_0x01a3:
            r4 = r11
            goto L_0x01d8
        L_0x01a5:
            r0 = move-exception
            r14 = r23
            goto L_0x01de
        L_0x01a9:
            r14 = r23
            goto L_0x01e2
        L_0x01ac:
            r0 = move-exception
            r14 = r23
            goto L_0x01e7
        L_0x01b0:
            r0 = move-exception
            r14 = r23
            goto L_0x01d8
        L_0x01b4:
            r0 = move-exception
            r14 = r23
            goto L_0x01dd
        L_0x01b8:
            r14 = r23
            goto L_0x01e1
        L_0x01bb:
            r0 = move-exception
            r14 = r23
            goto L_0x01e6
        L_0x01bf:
            r0 = move-exception
            r14 = r23
            goto L_0x01ca
        L_0x01c3:
            r0 = move-exception
            r14 = r23
            goto L_0x01c9
        L_0x01c7:
            r0 = move-exception
            r14 = r15
        L_0x01c9:
            r11 = r4
        L_0x01ca:
            if (r11 == 0) goto L_0x01cf
            r11.close()     // Catch:{ SQLiteFullException -> 0x01d4, SQLiteDatabaseLockedException -> 0x01e1, SQLiteException -> 0x01d2, all -> 0x01d0 }
        L_0x01cf:
            throw r0     // Catch:{ SQLiteFullException -> 0x01d4, SQLiteDatabaseLockedException -> 0x01e1, SQLiteException -> 0x01d2, all -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d8
        L_0x01d2:
            r0 = move-exception
            goto L_0x01dd
        L_0x01d4:
            r0 = move-exception
            goto L_0x01e6
        L_0x01d6:
            r0 = move-exception
            r14 = r15
        L_0x01d8:
            r15 = r14
            goto L_0x0244
        L_0x01db:
            r0 = move-exception
            r14 = r15
        L_0x01dd:
            r11 = r4
        L_0x01de:
            r15 = r14
            goto L_0x01ef
        L_0x01e0:
            r14 = r15
        L_0x01e1:
            r11 = r4
        L_0x01e2:
            r15 = r14
            goto L_0x0213
        L_0x01e4:
            r0 = move-exception
            r14 = r15
        L_0x01e6:
            r11 = r4
        L_0x01e7:
            r15 = r14
            goto L_0x0227
        L_0x01e9:
            r0 = move-exception
            r15 = r4
            goto L_0x0244
        L_0x01ec:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x01ef:
            if (r15 == 0) goto L_0x01fa
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x0242 }
            if (r12 == 0) goto L_0x01fa
            r15.endTransaction()     // Catch:{ all -> 0x0242 }
        L_0x01fa:
            com.onedelhi.secure.za6 r12 = r1.f11205a     // Catch:{ all -> 0x0242 }
            com.onedelhi.secure.a56 r12 = r12.mo15136e()     // Catch:{ all -> 0x0242 }
            com.onedelhi.secure.u46 r12 = r12.mo12726r()     // Catch:{ all -> 0x0242 }
            r12.mo25380b(r3, r0)     // Catch:{ all -> 0x0242 }
            r1.f11825b = r10     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x020e
            r11.close()
        L_0x020e:
            if (r15 == 0) goto L_0x023e
            goto L_0x0220
        L_0x0211:
            r11 = r4
            r15 = r11
        L_0x0213:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0242 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x021e
            r11.close()
        L_0x021e:
            if (r15 == 0) goto L_0x023e
        L_0x0220:
            r15.close()
            goto L_0x023e
        L_0x0224:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0227:
            com.onedelhi.secure.za6 r12 = r1.f11205a     // Catch:{ all -> 0x0242 }
            com.onedelhi.secure.a56 r12 = r12.mo15136e()     // Catch:{ all -> 0x0242 }
            com.onedelhi.secure.u46 r12 = r12.mo12726r()     // Catch:{ all -> 0x0242 }
            r12.mo25380b(r3, r0)     // Catch:{ all -> 0x0242 }
            r1.f11825b = r10     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x023b
            r11.close()
        L_0x023b:
            if (r15 == 0) goto L_0x023e
            goto L_0x0220
        L_0x023e:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0242:
            r0 = move-exception
            r4 = r11
        L_0x0244:
            if (r4 == 0) goto L_0x0249
            r4.close()
        L_0x0249:
            if (r15 == 0) goto L_0x024e
            r15.close()
        L_0x024e:
            throw r0
        L_0x024f:
            com.onedelhi.secure.za6 r0 = r1.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12731w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo25379a(r2)
            return r4
        L_0x025f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f46.mo15781p(int):java.util.List");
    }

    @ly4
    /* renamed from: q */
    public final void mo15782q() {
        int delete;
        mo15139h();
        try {
            SQLiteDatabase o = mo15780o();
            if (o != null && (delete = o.delete(es2.C2088h.f11569h, (String) null, (String[]) null)) > 0) {
                this.f11205a.mo15136e().mo12730v().mo25380b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Error resetting local analytics data. error", e);
        }
    }

    @ly4
    /* renamed from: r */
    public final boolean mo15783r() {
        return mo15789x(3, new byte[0]);
    }

    @VisibleForTesting
    /* renamed from: s */
    public final boolean mo15784s() {
        Context f = this.f11205a.mo15137f();
        this.f11205a.mo27891z();
        return f.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @ly4
    /* renamed from: t */
    public final boolean mo15785t() {
        mo15139h();
        if (!this.f11825b && mo15784s()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase o = mo15780o();
                    if (o == null) {
                        this.f11825b = true;
                        return false;
                    }
                    o.beginTransaction();
                    o.delete(es2.C2088h.f11569h, "type == ?", new String[]{Integer.toString(3)});
                    o.setTransactionSuccessful();
                    o.endTransaction();
                    o.close();
                    return true;
                } catch (SQLiteFullException e) {
                    this.f11205a.mo15136e().mo12726r().mo25380b("Error deleting app launch break from local database", e);
                    this.f11825b = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f11205a.mo15136e().mo12726r().mo25380b("Error deleting app launch break from local database", e2);
                    this.f11825b = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f11205a.mo15136e().mo12731w().mo25379a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo15786u(fc5 fc5) {
        byte[] e0 = this.f11205a.mo27871N().mo16875e0(fc5);
        if (e0.length <= 131072) {
            return mo15789x(2, e0);
        }
        this.f11205a.mo15136e().mo12728t().mo25379a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: v */
    public final boolean mo15787v(xj5 xj5) {
        Parcel obtain = Parcel.obtain();
        fk5.m14999a(xj5, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return mo15789x(0, marshall);
        }
        this.f11205a.mo15136e().mo12728t().mo25379a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: w */
    public final boolean mo15788w(wq6 wq6) {
        Parcel obtain = Parcel.obtain();
        yq6.m32614a(wq6, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return mo15789x(1, marshall);
        }
        this.f11205a.mo15136e().mo12728t().mo25379a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    @com.onedelhi.secure.ly4
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15789x(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            r17.mo15139h()
            boolean r0 = r1.f11825b
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r19
            r3.put(r0, r4)
            com.onedelhi.secure.za6 r0 = r1.f11205a
            r0.mo27891z()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x012d
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r17.mo15780o()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f11825b = r7     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0121
        L_0x0050:
            r0 = move-exception
            goto L_0x00b9
        L_0x0052:
            r0 = move-exception
            goto L_0x00bd
        L_0x0054:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009f
            com.onedelhi.secure.za6 r15 = r1.f11205a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.onedelhi.secure.a56 r15 = r15.mo15136e()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.onedelhi.secure.u46 r15 = r15.mo12726r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.mo25379a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r15 = 1
            long r13 = r13 + r15
            java.lang.String r12 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r11[r2] = r12     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = r9.delete(r0, r4, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            com.onedelhi.secure.za6 r4 = r1.f11205a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.onedelhi.secure.a56 r4 = r4.mo15136e()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4.mo25382d(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009f:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            r9.close()
            r2 = 1
            return r2
        L_0x00b2:
            r8 = r10
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            goto L_0x0122
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r10 = r8
        L_0x00bd:
            r8 = r9
            goto L_0x00fd
        L_0x00bf:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x00c2:
            r0 = move-exception
            r10 = r8
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r8.endTransaction()     // Catch:{ all -> 0x011f }
        L_0x00cf:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x011f }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x011f }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo25380b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f11825b = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e9:
            r9 = r8
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b4 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fb:
            r0 = move-exception
            r10 = r8
        L_0x00fd:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x011f }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x011f }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo25380b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f11825b = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x0114
            r10.close()
        L_0x0114:
            if (r8 == 0) goto L_0x0119
        L_0x0116:
            r8.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r9 = r8
        L_0x0121:
            r8 = r10
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            r8.close()
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        L_0x012d:
            com.onedelhi.secure.za6 r0 = r1.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo25379a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f46.mo15789x(int, byte[]):boolean");
    }
}
