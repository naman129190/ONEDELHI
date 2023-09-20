package com.onedelhi.secure;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C1767b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class vg5 extends xo6 {

    /* renamed from: a */
    public static final String[] f21781a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: b */
    public static final String[] f21782b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: c */
    public static final String[] f21783c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};

    /* renamed from: d */
    public static final String[] f21784d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: e */
    public static final String[] f21785e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: f */
    public static final String[] f21786f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g */
    public static final String[] f21787g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: h */
    public static final String[] f21788h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: a */
    public final mg5 f21789a;

    /* renamed from: a */
    public final po6 f21790a = new po6(this.f11205a.mo15133a());

    public vg5(qq6 qq6) {
        super(qq6);
        this.f11205a.mo27891z();
        this.f21789a = new mg5(this, this.f11205a.mo15137f(), "google_app_measurement.db");
    }

    @ly4
    /* renamed from: H */
    public static final void m30056H(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26055G(java.lang.String r21, long r22, long r24, com.onedelhi.secure.kq6 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r26)
            r20.mo15139h()
            r20.mo27038i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo26063P()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0071
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x0062
            r4.close()
            return
        L_0x0062:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
            goto L_0x00b3
        L_0x006e:
            r0 = move-exception
            goto L_0x020b
        L_0x0071:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x0084
        L_0x0080:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x0084:
            if (r4 == 0) goto L_0x0088
            java.lang.String r5 = " and rowid <= ?"
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x00ac
            r4.close()
            return
        L_0x00ac:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
        L_0x00b3:
            r16 = r4
            r17 = r5
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r4 != 0) goto L_0x00f4
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r0.mo25380b(r2, r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r12.close()
            return
        L_0x00f4:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.onedelhi.secure.va6 r5 = com.onedelhi.secure.ya6.m32031Q1()     // Catch:{ IOException -> 0x01da }
            com.onedelhi.secure.us6 r4 = com.onedelhi.secure.uq6.m29499C(r5, r4)     // Catch:{ IOException -> 0x01da }
            com.onedelhi.secure.va6 r4 = (com.onedelhi.secure.va6) r4     // Catch:{ IOException -> 0x01da }
            com.onedelhi.secure.jq6 r4 = r4.mo17922m()     // Catch:{ IOException -> 0x01da }
            com.onedelhi.secure.ya6 r4 = (com.onedelhi.secure.ya6) r4     // Catch:{ IOException -> 0x01da }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r5 == 0) goto L_0x0121
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.onedelhi.secure.u46 r5 = r5.mo12731w()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5.mo25380b(r6, r7)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
        L_0x0121:
            r12.close()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r2.f15047a = r4     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0141
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r5
            goto L_0x014d
        L_0x0141:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r6
        L_0x014d:
            java.lang.String r5 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r9, r10}     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 == 0) goto L_0x01c3
        L_0x0171:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x006e }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.u86 r7 = com.onedelhi.secure.x86.m31321F()     // Catch:{ IOException -> 0x01a3 }
            com.onedelhi.secure.us6 r0 = com.onedelhi.secure.uq6.m29499C(r7, r0)     // Catch:{ IOException -> 0x01a3 }
            com.onedelhi.secure.u86 r0 = (com.onedelhi.secure.u86) r0     // Catch:{ IOException -> 0x01a3 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo25453y(r8)     // Catch:{ SQLiteException -> 0x006e }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo25440C(r9)     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.jq6 r0 = r0.mo17922m()     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.x86 r0 = (com.onedelhi.secure.x86) r0     // Catch:{ SQLiteException -> 0x006e }
            boolean r0 = r2.mo19176a(r5, r0)     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x01b9
            r4.close()
            return
        L_0x01a3:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r5.mo25381c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x006e }
        L_0x01b9:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x0171
            r4.close()
            return
        L_0x01c3:
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x006e }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo25380b(r2, r5)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()
            return
        L_0x01da:
            r0 = move-exception
            r14 = r12
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r2.mo25381c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r14.close()
            return
        L_0x01f3:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f5:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f7:
            r0 = move-exception
            r14 = r12
        L_0x01f9:
            r3 = r14
            goto L_0x0226
        L_0x01fb:
            r0 = move-exception
            r14 = r12
        L_0x01fd:
            r4 = r14
            goto L_0x020b
        L_0x01ff:
            r0 = move-exception
            r3 = r16
            goto L_0x0226
        L_0x0203:
            r0 = move-exception
            r4 = r16
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            goto L_0x0226
        L_0x0209:
            r0 = move-exception
            r4 = r3
        L_0x020b:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x0224 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x0224 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ all -> 0x0224 }
            r2.mo25381c(r5, r3, r0)     // Catch:{ all -> 0x0224 }
            if (r4 == 0) goto L_0x0223
            r4.close()
        L_0x0223:
            return
        L_0x0224:
            r0 = move-exception
            r3 = r4
        L_0x0226:
            if (r3 == 0) goto L_0x022b
            r3.close()
        L_0x022b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26055G(java.lang.String, long, long, com.onedelhi.secure.kq6):void");
    }

    @ly4
    /* renamed from: I */
    public final long mo26056I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo26063P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @ly4
    /* renamed from: J */
    public final int mo26057J(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15139h();
        mo27038i();
        try {
            return mo26063P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25382d("Error deleting conditional property", a56.m10802z(str), this.f11205a.mo27862D().mo19282f(str2), e);
            return 0;
        }
    }

    @ly4
    /* renamed from: K */
    public final long mo26058K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo26063P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    @ly4
    /* renamed from: L */
    public final long mo26059L(String str, String str2) {
        String str3 = str;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        mo15139h();
        mo27038i();
        SQLiteDatabase P = mo26063P();
        P.beginTransaction();
        long j = 0;
        try {
            long K = mo26058K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str3}, -1);
            if (K == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f11205a.mo15136e().mo12726r().mo25381c("Failed to insert column (got -1). appId", a56.m10802z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                K = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + K));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f11205a.mo15136e().mo12726r().mo25381c("Failed to update column (got 0). appId", a56.m10802z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return K;
            } catch (SQLiteException e) {
                e = e;
                j = K;
                try {
                    this.f11205a.mo15136e().mo12726r().mo25382d("Error inserting column. appId", a56.m10802z(str), "first_open_count", e);
                    P.endTransaction();
                    return j;
                } catch (Throwable th) {
                    P.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f11205a.mo15136e().mo12726r().mo25382d("Error inserting column. appId", a56.m10802z(str), "first_open_count", e);
            P.endTransaction();
            return j;
        }
    }

    @ly4
    /* renamed from: M */
    public final long mo26060M() {
        return mo26058K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @ly4
    /* renamed from: N */
    public final long mo26061N() {
        return mo26058K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo26062O(String str) {
        Preconditions.checkNotEmpty(str);
        return mo26058K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    @VisibleForTesting
    @ly4
    /* renamed from: P */
    public final SQLiteDatabase mo26063P() {
        mo15139h();
        try {
            return this.f21789a.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo26064Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo15139h()
            r7.mo27038i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo26063P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.onedelhi.secure.za6 r8 = r7.f11205a     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.a56 r8 = r8.mo15136e()     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.u46 r8 = r8.mo12730v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo25379a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.u86 r3 = com.onedelhi.secure.x86.m31321F()     // Catch:{ IOException -> 0x00a2 }
            com.onedelhi.secure.us6 r2 = com.onedelhi.secure.uq6.m29499C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.onedelhi.secure.u86 r2 = (com.onedelhi.secure.u86) r2     // Catch:{ IOException -> 0x00a2 }
            com.onedelhi.secure.jq6 r2 = r2.mo17922m()     // Catch:{ IOException -> 0x00a2 }
            com.onedelhi.secure.x86 r2 = (com.onedelhi.secure.x86) r2     // Catch:{ IOException -> 0x00a2 }
            com.onedelhi.secure.qq6 r8 = r7.f21907a     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo23380g0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo26820J()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.j96 r3 = (com.onedelhi.secure.j96) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo18174H()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo18177U()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo18170B()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo18178V()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo18171C()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo18181Y()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo18175I()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo18179W()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo18173E()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.onedelhi.secure.za6 r3 = r7.f11205a     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ SQLiteException -> 0x00ba }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo25381c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.onedelhi.secure.za6 r2 = r7.f11205a     // Catch:{ all -> 0x00d5 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x00d5 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo25380b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26064Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x011d A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0121 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0155 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0173 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0176 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0185 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d0 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f4 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0206 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0240  */
    @com.onedelhi.secure.ly4
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.yd6 mo26065R(java.lang.String r38) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r38)
            r37.mo15139h()
            r37.mo27038i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r37.mo26063P()     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x021d }
            if (r5 != 0) goto L_0x006f
            r4.close()
            return r3
        L_0x006f:
            com.onedelhi.secure.yd6 r5 = new com.onedelhi.secure.yd6     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.qq6 r6 = r1.f21907a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.za6 r6 = r6.mo23376c0()     // Catch:{ SQLiteException -> 0x021d }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27398i(r6)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27419x(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27362G(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27358C(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27359D(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27357B(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27402k(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27400j(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27420y(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27415t(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x00db
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r6 = 0
            goto L_0x00dc
        L_0x00db:
            r6 = 1
        L_0x00dc:
            r5.mo27360E(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27414s(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27412q(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27411p(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27408n(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27406m(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27417v(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 == 0) goto L_0x0121
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0126
        L_0x0121:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x021d }
        L_0x0126:
            r5.mo27404l(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27418w(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27410o(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27413r(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27421z(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x015e
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r6 = 0
            goto L_0x015f
        L_0x015e:
            r6 = 1
        L_0x015f:
            r5.mo27396h(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 24
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27394g(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 25
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 == 0) goto L_0x0176
            r6 = 0
            goto L_0x017a
        L_0x0176:
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x017a:
            r5.mo27416u(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 26
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x0197
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x021d }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27363H(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0197:
            com.onedelhi.secure.xz6.m31807c()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.za6 r6 = r1.f11205a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.ce5 r6 = r6.mo27891z()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.k36 r7 = com.onedelhi.secure.n36.f17074o0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14110B(r2, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 != 0) goto L_0x01b6
            com.onedelhi.secure.za6 r6 = r1.f11205a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.ce5 r6 = r6.mo27891z()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.k36 r7 = com.onedelhi.secure.n36.f17070m0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14110B(r3, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01bf
        L_0x01b6:
            r6 = 28
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27364I(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01bf:
            com.onedelhi.secure.y07.m31827c()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.za6 r6 = r1.f11205a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.ce5 r6 = r6.mo27891z()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.k36 r7 = com.onedelhi.secure.n36.f17078q0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14110B(r3, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01e3
            r6 = 29
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x01df
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r0 = 0
        L_0x01e0:
            r5.mo27365J(r0)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01e3:
            com.onedelhi.secure.ky6.m20117c()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.k36 r6 = com.onedelhi.secure.n36.f17019E0     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = r0.mo14110B(r3, r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r0 == 0) goto L_0x01fd
            r0 = 30
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo27366K(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01fd:
            r5.mo27390e()     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021d }
            if (r0 == 0) goto L_0x0219
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x021d }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r38)     // Catch:{ SQLiteException -> 0x021d }
            r0.mo25380b(r6, r7)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0219:
            r4.close()
            return r5
        L_0x021d:
            r0 = move-exception
            goto L_0x0223
        L_0x021f:
            r0 = move-exception
            goto L_0x023e
        L_0x0221:
            r0 = move-exception
            r4 = r3
        L_0x0223:
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ all -> 0x023c }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x023c }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x023c }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.onedelhi.secure.a56.m10802z(r38)     // Catch:{ all -> 0x023c }
            r5.mo25381c(r6, r2, r0)     // Catch:{ all -> 0x023c }
            if (r4 == 0) goto L_0x023b
            r4.close()
        L_0x023b:
            return r3
        L_0x023c:
            r0 = move-exception
            r3 = r4
        L_0x023e:
            if (r3 == 0) goto L_0x0243
            r3.close()
        L_0x0243:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26065R(java.lang.String):com.onedelhi.secure.yd6");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    @com.onedelhi.secure.ly4
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.fc5 mo26066S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r32)
            r30.mo15139h()
            r30.mo27038i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo26063P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo26071Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.qq6 r0 = r1.f21907a     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.uq6 r0 = r0.mo23380g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.onedelhi.secure.xj5> r3 = com.onedelhi.secure.xj5.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo25707z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.onedelhi.secure.xj5 r23 = (com.onedelhi.secure.xj5) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.qq6 r0 = r1.f21907a     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.uq6 r0 = r0.mo23380g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo25707z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.onedelhi.secure.xj5 r26 = (com.onedelhi.secure.xj5) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.qq6 r0 = r1.f21907a     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.uq6 r0 = r0.mo23380g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo25707z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.onedelhi.secure.xj5 r29 = (com.onedelhi.secure.xj5) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.wq6 r18 = new com.onedelhi.secure.wq6     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.fc5 r0 = new com.onedelhi.secure.fc5     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ SQLiteException -> 0x00f9 }
            com.onedelhi.secure.l46 r5 = r5.mo27862D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo19282f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo25381c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x0122 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x0122 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r31)     // Catch:{ all -> 0x0122 }
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ all -> 0x0122 }
            com.onedelhi.secure.l46 r5 = r5.mo27862D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo19282f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo25382d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26066S(java.lang.String, java.lang.String):com.onedelhi.secure.fc5");
    }

    @ly4
    /* renamed from: T */
    public final uf5 mo26067T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo26068U(j, str, 1, false, false, z3, false, z5);
    }

    @ly4
    /* renamed from: U */
    public final uf5 mo26068U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        mo15139h();
        mo27038i();
        String[] strArr = {str};
        uf5 uf5 = new uf5();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo26063P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f11205a.mo15136e().mo12731w().mo25380b("Not updating daily counts, app is not known. appId", a56.m10802z(str));
                cursor.close();
                return uf5;
            }
            if (cursor.getLong(0) == j) {
                uf5.f21331b = cursor.getLong(1);
                uf5.f21330a = cursor.getLong(2);
                uf5.f21332c = cursor.getLong(3);
                uf5.f21333d = cursor.getLong(4);
                uf5.f21334e = cursor.getLong(5);
            }
            if (z) {
                uf5.f21331b += j2;
            }
            if (z2) {
                uf5.f21330a += j2;
            }
            if (z3) {
                uf5.f21332c += j2;
            }
            if (z4) {
                uf5.f21333d += j2;
            }
            if (z5) {
                uf5.f21334e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(uf5.f21330a));
            contentValues.put("daily_events_count", Long.valueOf(uf5.f21331b));
            contentValues.put("daily_conversions_count", Long.valueOf(uf5.f21332c));
            contentValues.put("daily_error_events_count", Long.valueOf(uf5.f21333d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(uf5.f21334e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return uf5;
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error updating daily counts. appId", a56.m10802z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return uf5;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    @com.onedelhi.secure.ly4
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ri5 mo26069V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r29)
            r27.mo15139h()
            r27.mo27038i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo26063P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r5 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.onedelhi.secure.ri5 r24 = new com.onedelhi.secure.ri5     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo25380b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x014b }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x014b }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r28)     // Catch:{ all -> 0x014b }
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ all -> 0x014b }
            com.onedelhi.secure.l46 r5 = r5.mo27862D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo19280d(r6)     // Catch:{ all -> 0x014b }
            r2.mo25382d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26069V(java.lang.String, java.lang.String):com.onedelhi.secure.ri5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    @com.onedelhi.secure.ly4
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ar6 mo26070X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.mo15139h()
            r19.mo27038i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo26063P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r14 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo26071Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.onedelhi.secure.ar6 r0 = new com.onedelhi.secure.ar6     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ SQLiteException -> 0x0079 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x0079 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo25380b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x00a2 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x00a2 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r20)     // Catch:{ all -> 0x00a2 }
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ all -> 0x00a2 }
            com.onedelhi.secure.l46 r5 = r5.mo27862D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo19282f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo25382d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26070X(java.lang.String, java.lang.String):com.onedelhi.secure.ar6");
    }

    @VisibleForTesting
    @ly4
    /* renamed from: Y */
    public final Object mo26071Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f11205a.mo15136e().mo12726r().mo25379a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    @com.onedelhi.secure.ly4
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26072Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo26063P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.onedelhi.secure.za6 r3 = r6.f11205a     // Catch:{ all -> 0x003a }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x003a }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo25380b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26072Z():java.lang.String");
    }

    @ly4
    /* renamed from: a0 */
    public final List mo26073a0(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo15139h();
        mo27038i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo26074b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo26074b0(String str, String[] strArr) {
        mo15139h();
        mo27038i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo26063P();
            String[] strArr2 = {"app_id", "origin", "name", "value", C1767b9.C1768a.f9765n, C1767b9.C1768a.f9755d, C1767b9.C1768a.f9756e, "timed_out_event", C1767b9.C1768a.f9764m, "triggered_event", C1767b9.C1768a.f9766o, C1767b9.C1768a.f9761j, "expired_event"};
            this.f11205a.mo27891z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f11205a.mo27891z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo26071Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        uq6 g0 = this.f21907a.mo23380g0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<xj5> creator = xj5.CREATOR;
                        arrayList.add(new fc5(string, string2, new wq6(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (xj5) g0.mo25707z(blob, creator), j, (xj5) this.f21907a.mo23380g0().mo25707z(query.getBlob(9), creator), query.getLong(11), (xj5) this.f21907a.mo23380g0().mo25707z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        u46 r = this.f11205a.mo15136e().mo12726r();
                        this.f11205a.mo27891z();
                        r.mo25380b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @ly4
    /* renamed from: c0 */
    public final List mo26075c0(String str) {
        Preconditions.checkNotEmpty(str);
        mo15139h();
        mo27038i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f11205a.mo27891z();
            Cursor query = mo26063P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo26071Y(query, 3);
                    if (Y == null) {
                        this.f11205a.mo15136e().mo12726r().mo25380b("Read invalid user property value, ignoring it. appId", a56.m10802z(str));
                    } else {
                        arrayList.add(new ar6(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error querying user properties. appId", a56.m10802z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123 A[DONT_GENERATE] */
    @com.onedelhi.secure.ly4
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo26076d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r18)
            r17.mo15139h()
            r17.mo27038i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0105 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0105 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0103 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0103 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x00ff }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ff }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00ff }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x00ff }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x00ff }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x00ff }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo26063P()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r10 = "rowid"
            com.onedelhi.secure.za6 r4 = r1.f11205a     // Catch:{ SQLiteException -> 0x00ff }
            r4.mo27891z()     // Catch:{ SQLiteException -> 0x00ff }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ff }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00ff }
            if (r3 != 0) goto L_0x009a
            r12.close()
            return r2
        L_0x009a:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x00ff }
            com.onedelhi.secure.za6 r4 = r1.f11205a     // Catch:{ SQLiteException -> 0x00ff }
            r4.mo27891z()     // Catch:{ SQLiteException -> 0x00ff }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c0
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x00ff }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x00ff }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.onedelhi.secure.za6 r5 = r1.f11205a     // Catch:{ SQLiteException -> 0x00ff }
            r5.mo27891z()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ff }
            r0.mo25380b(r3, r4)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00fb
        L_0x00c0:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x00ff }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x00ff }
            r3 = 2
            java.lang.Object r10 = r1.mo26071Y(r12, r3)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x00ff }
            if (r10 != 0) goto L_0x00e9
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ SQLiteException -> 0x00ff }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ SQLiteException -> 0x00ff }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r18)     // Catch:{ SQLiteException -> 0x00ff }
            r3.mo25382d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00f5
        L_0x00e9:
            com.onedelhi.secure.ar6 r3 = new com.onedelhi.secure.ar6     // Catch:{ SQLiteException -> 0x00ff }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00ff }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x00f5:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00ff }
            if (r3 != 0) goto L_0x009a
        L_0x00fb:
            r12.close()
            return r2
        L_0x00ff:
            r0 = move-exception
            goto L_0x010a
        L_0x0101:
            r0 = move-exception
            goto L_0x0127
        L_0x0103:
            r0 = move-exception
            goto L_0x0108
        L_0x0105:
            r0 = move-exception
            r14 = r18
        L_0x0108:
            r15 = r19
        L_0x010a:
            com.onedelhi.secure.za6 r2 = r1.f11205a     // Catch:{ all -> 0x0101 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x0101 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r18)     // Catch:{ all -> 0x0101 }
            r2.mo25382d(r3, r4, r15, r0)     // Catch:{ all -> 0x0101 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x0126
            r12.close()
        L_0x0126:
            return r0
        L_0x0127:
            if (r12 == 0) goto L_0x012c
            r12.close()
        L_0x012c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26076d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @ly4
    /* renamed from: e0 */
    public final void mo26077e0() {
        mo27038i();
        mo26063P().beginTransaction();
    }

    @ly4
    /* renamed from: f0 */
    public final void mo26078f0() {
        mo27038i();
        mo26063P().endTransaction();
    }

    @VisibleForTesting
    @ly4
    /* renamed from: g0 */
    public final void mo26079g0(List list) {
        mo15139h();
        mo27038i();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (mo26089u()) {
            String str = pl2.f33726c + TextUtils.join(vf4.f36537c, list) + pl2.f33727d;
            if (mo26056I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f11205a.mo15136e().mo12731w().mo25379a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo26063P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Error incrementing retry count. error", e);
            }
        }
    }

    @ly4
    /* renamed from: h0 */
    public final void mo26080h0() {
        mo15139h();
        mo27038i();
        if (mo26089u()) {
            long a = this.f21907a.mo23378e0().f20432a.mo15075a();
            long elapsedRealtime = this.f11205a.mo15133a().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            this.f11205a.mo27891z();
            if (abs > ((Long) n36.f17093y.mo18887a((Object) null)).longValue()) {
                this.f21907a.mo23378e0().f20432a.mo15076b(elapsedRealtime);
                mo15139h();
                mo27038i();
                if (mo26089u()) {
                    SQLiteDatabase P = mo26063P();
                    this.f11205a.mo27891z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f11205a.mo15133a().currentTimeMillis()), String.valueOf(ce5.m12446i())});
                    if (delete > 0) {
                        this.f11205a.mo15136e().mo12730v().mo25380b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        return false;
    }

    @ly4
    /* renamed from: m */
    public final void mo26081m(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15139h();
        mo27038i();
        try {
            mo26063P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25382d("Error deleting user property. appId", a56.m10802z(str), this.f11205a.mo27862D().mo19282f(str2), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0325, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo27805J());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x032e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x032f, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.C4311b.C4317f.C4318a.f25149a, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0343, code lost:
        if (mo26063P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0345, code lost:
        r1.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert property filter (got -1). appId", com.onedelhi.secure.a56.m10802z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0359, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r3 = r1.f11205a.mo15136e().mo12726r();
        r7 = "Error storing property filter. appId";
        r8 = com.onedelhi.secure.a56.m10802z(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0370, code lost:
        mo27038i();
        mo15139h();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = mo26063P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03a7, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0176, code lost:
        r0.mo25381c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
        r11 = r0.mo24188I().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
        if (r11.hasNext() == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0192, code lost:
        if (((com.onedelhi.secure.z46) r11.next()).mo27806K() != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0194, code lost:
        r0 = r1.f11205a.mo15136e().mo12731w();
        r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r9 = com.onedelhi.secure.a56.m10802z(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a9, code lost:
        r11 = r0.mo24187H().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bf, code lost:
        if (r11.hasNext() == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r12 = (com.onedelhi.secure.y36) r11.next();
        mo27038i();
        mo15139h();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01db, code lost:
        if (r12.mo27183H().isEmpty() == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01dd, code lost:
        r0 = r1.f11205a.mo15136e().mo12731w();
        r9 = com.onedelhi.secure.a56.m10802z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f5, code lost:
        if (r12.mo27189P() == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f7, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo27180C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0202, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0204, code lost:
        r0.mo25382d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020f, code lost:
        r3 = r12.mo22497h();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r2);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0228, code lost:
        if (r12.mo27189P() == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022a, code lost:
        r9 = java.lang.Integer.valueOf(r12.mo27180C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0233, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0234, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.mo27183H());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0244, code lost:
        if (r12.mo27190Q() == false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0246, code lost:
        r9 = java.lang.Boolean.valueOf(r12.mo27187N());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024f, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0250, code lost:
        r7.put("session_scoped", r9);
        r7.put(com.google.firebase.messaging.C4311b.C4317f.C4318a.f25149a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0264, code lost:
        if (mo26063P().insertWithOnConflict("event_filters", (java.lang.String) null, r7, 5) != -1) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0266, code lost:
        r1.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert event filter (got -1). appId", com.onedelhi.secure.a56.m10802z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0279, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0290, code lost:
        r3.mo25381c(r7, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0295, code lost:
        r21 = r7;
        r0 = r0.mo24188I().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a3, code lost:
        if (r0.hasNext() == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a5, code lost:
        r3 = (com.onedelhi.secure.z46) r0.next();
        mo27038i();
        mo15139h();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02bf, code lost:
        if (r3.mo27802F().isEmpty() == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c1, code lost:
        r0 = r1.f11205a.mo15136e().mo12731w();
        r8 = com.onedelhi.secure.a56.m10802z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d9, code lost:
        if (r3.mo27806K() == false) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02db, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo27800B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02e5, code lost:
        r0.mo25382d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ee, code lost:
        r7 = r3.mo22497h();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0305, code lost:
        if (r3.mo27806K() == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0307, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo27800B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0310, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0311, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo27802F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0323, code lost:
        if (r3.mo27807L() == false) goto L_0x032e;
     */
    @com.onedelhi.secure.ly4
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26082n(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00dc
            java.lang.Object r9 = r3.get(r8)
            com.onedelhi.secure.s36 r9 = (com.onedelhi.secure.s36) r9
            com.onedelhi.secure.ip6 r9 = r9.mo18543k()
            com.onedelhi.secure.p36 r9 = (com.onedelhi.secure.p36) r9
            int r11 = r9.mo22302q()
            if (r11 == 0) goto L_0x009d
            r11 = 0
        L_0x002b:
            int r12 = r9.mo22302q()
            if (r11 >= r12) goto L_0x009d
            com.onedelhi.secure.y36 r12 = r9.mo22306u(r11)
            com.onedelhi.secure.ip6 r12 = r12.mo18543k()
            com.onedelhi.secure.v36 r12 = (com.onedelhi.secure.v36) r12
            com.onedelhi.secure.ip6 r13 = r12.mo17916f()
            com.onedelhi.secure.v36 r13 = (com.onedelhi.secure.v36) r13
            java.lang.String r14 = r12.mo25843u()
            java.lang.String r14 = com.onedelhi.secure.le6.m20591b(r14)
            if (r14 == 0) goto L_0x0050
            r13.mo25840r(r14)
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            int r7 = r12.mo25839q()
            if (r15 >= r7) goto L_0x0088
            com.onedelhi.secure.e46 r7 = r12.mo25842t(r15)
            java.lang.String r10 = r7.mo15042F()
            r16 = r12
            java.lang.String[] r12 = com.onedelhi.secure.oe6.f17938a
            r17 = r4
            java.lang.String[] r4 = com.onedelhi.secure.oe6.f17939b
            java.lang.String r4 = com.onedelhi.secure.dj6.m13168b(r10, r12, r4)
            if (r4 == 0) goto L_0x0081
            com.onedelhi.secure.ip6 r7 = r7.mo18543k()
            com.onedelhi.secure.b46 r7 = (com.onedelhi.secure.b46) r7
            r7.mo13418q(r4)
            com.onedelhi.secure.jq6 r4 = r7.mo17922m()
            com.onedelhi.secure.e46 r4 = (com.onedelhi.secure.e46) r4
            r13.mo25841s(r15, r4)
            r14 = 1
        L_0x0081:
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            goto L_0x0052
        L_0x0088:
            r17 = r4
            if (r14 == 0) goto L_0x0098
            r9.mo22304s(r11, r13)
            com.onedelhi.secure.jq6 r4 = r9.mo17922m()
            com.onedelhi.secure.s36 r4 = (com.onedelhi.secure.s36) r4
            r3.set(r8, r4)
        L_0x0098:
            int r11 = r11 + 1
            r4 = r17
            goto L_0x002b
        L_0x009d:
            r17 = r4
            int r4 = r9.mo22303r()
            if (r4 == 0) goto L_0x00d6
            r4 = 0
        L_0x00a6:
            int r7 = r9.mo22303r()
            if (r4 >= r7) goto L_0x00d6
            com.onedelhi.secure.z46 r7 = r9.mo22307v(r4)
            java.lang.String r10 = r7.mo27802F()
            java.lang.String[] r11 = com.onedelhi.secure.re6.f19810a
            java.lang.String[] r12 = com.onedelhi.secure.re6.f19811b
            java.lang.String r10 = com.onedelhi.secure.dj6.m13168b(r10, r11, r12)
            if (r10 == 0) goto L_0x00d3
            com.onedelhi.secure.ip6 r7 = r7.mo18543k()
            com.onedelhi.secure.w46 r7 = (com.onedelhi.secure.w46) r7
            r7.mo26441q(r10)
            r9.mo22305t(r4, r7)
            com.onedelhi.secure.jq6 r7 = r9.mo17922m()
            com.onedelhi.secure.s36 r7 = (com.onedelhi.secure.s36) r7
            r3.set(r8, r7)
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00d6:
            int r8 = r8 + 1
            r4 = r17
            goto L_0x0012
        L_0x00dc:
            r17 = r4
            r23.mo27038i()
            r23.mo15139h()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            android.database.sqlite.SQLiteDatabase r4 = r23.mo26063P()
            r4.beginTransaction()
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            android.database.sqlite.SQLiteDatabase r7 = r23.mo26063P()     // Catch:{ all -> 0x0490 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0490 }
            r10 = 0
            r9[r10] = r2     // Catch:{ all -> 0x0490 }
            r7.delete(r6, r0, r9)     // Catch:{ all -> 0x0490 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0490 }
            r9[r10] = r2     // Catch:{ all -> 0x0490 }
            r7.delete(r5, r0, r9)     // Catch:{ all -> 0x0490 }
            java.util.Iterator r7 = r25.iterator()     // Catch:{ all -> 0x0490 }
        L_0x0112:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x03ad
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.s36 r0 = (com.onedelhi.secure.s36) r0     // Catch:{ all -> 0x0490 }
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0490 }
            boolean r10 = r0.mo24189L()     // Catch:{ all -> 0x0490 }
            if (r10 != 0) goto L_0x0144
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "Audience with no ID. appId"
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            r0.mo25380b(r8, r9)     // Catch:{ all -> 0x0490 }
            goto L_0x0112
        L_0x0144:
            int r10 = r0.mo24182B()     // Catch:{ all -> 0x0490 }
            java.util.List r11 = r0.mo24187H()     // Catch:{ all -> 0x0490 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0490 }
        L_0x0150:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0490 }
            if (r12 == 0) goto L_0x017a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.y36 r12 = (com.onedelhi.secure.y36) r12     // Catch:{ all -> 0x0490 }
            boolean r12 = r12.mo27189P()     // Catch:{ all -> 0x0490 }
            if (r12 != 0) goto L_0x0150
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
        L_0x0176:
            r0.mo25381c(r8, r9, r10)     // Catch:{ all -> 0x0490 }
            goto L_0x0112
        L_0x017a:
            java.util.List r11 = r0.mo24188I()     // Catch:{ all -> 0x0490 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0490 }
        L_0x0182:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0490 }
            if (r12 == 0) goto L_0x01a9
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.z46 r12 = (com.onedelhi.secure.z46) r12     // Catch:{ all -> 0x0490 }
            boolean r12 = r12.mo27806K()     // Catch:{ all -> 0x0490 }
            if (r12 != 0) goto L_0x0182
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
            goto L_0x0176
        L_0x01a9:
            java.util.List r11 = r0.mo24187H()     // Catch:{ all -> 0x0490 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0490 }
        L_0x01b1:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r9 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x0295
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.y36 r12 = (com.onedelhi.secure.y36) r12     // Catch:{ all -> 0x0490 }
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch:{ all -> 0x0490 }
            java.lang.String r21 = r12.mo27183H()     // Catch:{ all -> 0x0490 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x0490 }
            if (r21 == 0) goto L_0x020f
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
            boolean r13 = r12.mo27189P()     // Catch:{ all -> 0x0490 }
            if (r13 == 0) goto L_0x0202
            int r12 = r12.mo27180C()     // Catch:{ all -> 0x0490 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0490 }
            r20 = r12
            goto L_0x0204
        L_0x0202:
            r20 = 0
        L_0x0204:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0490 }
            r0.mo25382d(r8, r9, r11, r12)     // Catch:{ all -> 0x0490 }
            r21 = r7
            goto L_0x0370
        L_0x020f:
            byte[] r3 = r12.mo22497h()     // Catch:{ all -> 0x0490 }
            r21 = r7
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0490 }
            r7.<init>()     // Catch:{ all -> 0x0490 }
            r7.put(r15, r2)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
            r7.put(r9, r15)     // Catch:{ all -> 0x0490 }
            boolean r9 = r12.mo27189P()     // Catch:{ all -> 0x0490 }
            if (r9 == 0) goto L_0x0233
            int r9 = r12.mo27180C()     // Catch:{ all -> 0x0490 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0490 }
            goto L_0x0234
        L_0x0233:
            r9 = 0
        L_0x0234:
            r7.put(r14, r9)     // Catch:{ all -> 0x0490 }
            java.lang.String r9 = "event_name"
            java.lang.String r14 = r12.mo27183H()     // Catch:{ all -> 0x0490 }
            r7.put(r9, r14)     // Catch:{ all -> 0x0490 }
            boolean r9 = r12.mo27190Q()     // Catch:{ all -> 0x0490 }
            if (r9 == 0) goto L_0x024f
            boolean r9 = r12.mo27187N()     // Catch:{ all -> 0x0490 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0490 }
            goto L_0x0250
        L_0x024f:
            r9 = 0
        L_0x0250:
            r7.put(r13, r9)     // Catch:{ all -> 0x0490 }
            r7.put(r8, r3)     // Catch:{ all -> 0x0490 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo26063P()     // Catch:{ SQLiteException -> 0x027f }
            r8 = 5
            r9 = 0
            long r7 = r3.insertWithOnConflict(r5, r9, r7, r8)     // Catch:{ SQLiteException -> 0x027f }
            r12 = -1
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0279
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ SQLiteException -> 0x027f }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ SQLiteException -> 0x027f }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ SQLiteException -> 0x027f }
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ SQLiteException -> 0x027f }
            r3.mo25380b(r7, r8)     // Catch:{ SQLiteException -> 0x027f }
        L_0x0279:
            r3 = r25
            r7 = r21
            goto L_0x01b1
        L_0x027f:
            r0 = move-exception
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0490 }
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
        L_0x0290:
            r3.mo25381c(r7, r8, r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0370
        L_0x0295:
            r21 = r7
            java.util.List r0 = r0.mo24188I()     // Catch:{ all -> 0x0490 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0490 }
        L_0x029f:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0490 }
            if (r3 == 0) goto L_0x03a7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.z46 r3 = (com.onedelhi.secure.z46) r3     // Catch:{ all -> 0x0490 }
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0490 }
            java.lang.String r7 = r3.mo27802F()     // Catch:{ all -> 0x0490 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0490 }
            if (r7 == 0) goto L_0x02ee
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0490 }
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
            boolean r11 = r3.mo27806K()     // Catch:{ all -> 0x0490 }
            if (r11 == 0) goto L_0x02e4
            int r3 = r3.mo27800B()     // Catch:{ all -> 0x0490 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0490 }
            goto L_0x02e5
        L_0x02e4:
            r3 = 0
        L_0x02e5:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0490 }
            r0.mo25382d(r7, r8, r9, r3)     // Catch:{ all -> 0x0490 }
            goto L_0x0370
        L_0x02ee:
            byte[] r7 = r3.mo22497h()     // Catch:{ all -> 0x0490 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0490 }
            r11.<init>()     // Catch:{ all -> 0x0490 }
            r11.put(r15, r2)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0490 }
            r11.put(r9, r12)     // Catch:{ all -> 0x0490 }
            boolean r12 = r3.mo27806K()     // Catch:{ all -> 0x0490 }
            if (r12 == 0) goto L_0x0310
            int r12 = r3.mo27800B()     // Catch:{ all -> 0x0490 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0490 }
            goto L_0x0311
        L_0x0310:
            r12 = 0
        L_0x0311:
            r11.put(r14, r12)     // Catch:{ all -> 0x0490 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo27802F()     // Catch:{ all -> 0x0490 }
            r11.put(r12, r0)     // Catch:{ all -> 0x0490 }
            boolean r0 = r3.mo27807L()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x032e
            boolean r0 = r3.mo27805J()     // Catch:{ all -> 0x0490 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x032f
        L_0x032e:
            r0 = 0
        L_0x032f:
            r11.put(r13, r0)     // Catch:{ all -> 0x0490 }
            r11.put(r8, r7)     // Catch:{ all -> 0x0490 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo26063P()     // Catch:{ SQLiteException -> 0x035d }
            r3 = 0
            r7 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r7)     // Catch:{ SQLiteException -> 0x035d }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0359
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ SQLiteException -> 0x035d }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x035d }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ SQLiteException -> 0x035d }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ SQLiteException -> 0x035d }
            r0.mo25380b(r3, r7)     // Catch:{ SQLiteException -> 0x035d }
            goto L_0x0370
        L_0x0359:
            r0 = r22
            goto L_0x029f
        L_0x035d:
            r0 = move-exception
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0490 }
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            goto L_0x0290
        L_0x0370:
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo26063P()     // Catch:{ all -> 0x0490 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0490 }
            r3 = 0
            r7[r3] = r2     // Catch:{ all -> 0x0490 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0490 }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x0490 }
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch:{ all -> 0x0490 }
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0490 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0490 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0490 }
            r0.delete(r5, r3, r7)     // Catch:{ all -> 0x0490 }
            r17 = r3
            r7 = r21
            r3 = r25
            goto L_0x0112
        L_0x03a7:
            r3 = r25
            r7 = r21
            goto L_0x0112
        L_0x03ad:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0490 }
            r0.<init>()     // Catch:{ all -> 0x0490 }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ all -> 0x0490 }
        L_0x03b7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0490 }
            if (r6 == 0) goto L_0x03d7
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.s36 r6 = (com.onedelhi.secure.s36) r6     // Catch:{ all -> 0x0490 }
            boolean r7 = r6.mo24189L()     // Catch:{ all -> 0x0490 }
            if (r7 == 0) goto L_0x03d2
            int r6 = r6.mo24182B()     // Catch:{ all -> 0x0490 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0490 }
            goto L_0x03d3
        L_0x03d2:
            r9 = r3
        L_0x03d3:
            r0.add(r9)     // Catch:{ all -> 0x0490 }
            goto L_0x03b7
        L_0x03d7:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch:{ all -> 0x0490 }
            r23.mo27038i()     // Catch:{ all -> 0x0490 }
            r23.mo15139h()     // Catch:{ all -> 0x0490 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo26063P()     // Catch:{ all -> 0x0490 }
            java.lang.String r5 = "select count(1) from audience_filter_values where app_id=?"
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0475 }
            r6 = 0
            r7[r6] = r2     // Catch:{ SQLiteException -> 0x0475 }
            long r5 = r1.mo26056I(r5, r7)     // Catch:{ SQLiteException -> 0x0475 }
            com.onedelhi.secure.za6 r7 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.ce5 r7 = r7.mo27891z()     // Catch:{ all -> 0x0490 }
            r8 = 2000(0x7d0, float:2.803E-42)
            com.onedelhi.secure.k36 r9 = com.onedelhi.secure.n36.f17020F     // Catch:{ all -> 0x0490 }
            int r7 = r7.mo14122o(r2, r9)     // Catch:{ all -> 0x0490 }
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0490 }
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0490 }
            long r8 = (long) r7     // Catch:{ all -> 0x0490 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x040e
            goto L_0x0489
        L_0x040e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0490 }
            r5.<init>()     // Catch:{ all -> 0x0490 }
            r10 = 0
        L_0x0414:
            int r6 = r0.size()     // Catch:{ all -> 0x0490 }
            if (r10 >= r6) goto L_0x0430
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0490 }
            if (r6 == 0) goto L_0x0489
            int r6 = r6.intValue()     // Catch:{ all -> 0x0490 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0490 }
            r5.add(r6)     // Catch:{ all -> 0x0490 }
            int r10 = r10 + 1
            goto L_0x0414
        L_0x0430:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0490 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0490 }
            r5.<init>()     // Catch:{ all -> 0x0490 }
            java.lang.String r6 = "("
            r5.append(r6)     // Catch:{ all -> 0x0490 }
            r5.append(r0)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0490 }
            java.lang.String r5 = "audience_filter_values"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0490 }
            r6.<init>()     // Catch:{ all -> 0x0490 }
            java.lang.String r8 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r8)     // Catch:{ all -> 0x0490 }
            r6.append(r0)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0490 }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0490 }
            r8 = 0
            r6[r8] = r2     // Catch:{ all -> 0x0490 }
            java.lang.String r2 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0490 }
            r7 = 1
            r6[r7] = r2     // Catch:{ all -> 0x0490 }
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x0490 }
            goto L_0x0489
        L_0x0475:
            r0 = move-exception
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0490 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0490 }
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r2 = com.onedelhi.secure.a56.m10802z(r24)     // Catch:{ all -> 0x0490 }
            r3.mo25381c(r5, r2, r0)     // Catch:{ all -> 0x0490 }
        L_0x0489:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0490 }
            r4.endTransaction()
            return
        L_0x0490:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vg5.mo26082n(java.lang.String, java.util.List):void");
    }

    @ly4
    /* renamed from: o */
    public final void mo26083o() {
        mo27038i();
        mo26063P().setTransactionSuccessful();
    }

    @ly4
    /* renamed from: p */
    public final void mo26084p(yd6 yd6) {
        Preconditions.checkNotNull(yd6);
        mo15139h();
        mo27038i();
        String i0 = yd6.mo27399i0();
        Preconditions.checkNotNull(i0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i0);
        contentValues.put("app_instance_id", yd6.mo27401j0());
        contentValues.put(nh1.f32548u, yd6.mo27409n0());
        contentValues.put("resettable_device_id_hash", yd6.mo27384b());
        contentValues.put("last_bundle_index", Long.valueOf(yd6.mo27387c0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(yd6.mo27389d0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(yd6.mo27385b0()));
        contentValues.put("app_version", yd6.mo27405l0());
        contentValues.put("app_store", yd6.mo27403k0());
        contentValues.put("gmp_version", Long.valueOf(yd6.mo27383a0()));
        contentValues.put("dev_cert_hash", Long.valueOf(yd6.mo27379X()));
        contentValues.put("measurement_enabled", Boolean.valueOf(yd6.mo27368M()));
        contentValues.put("day", Long.valueOf(yd6.mo27378W()));
        contentValues.put("daily_public_events_count", Long.valueOf(yd6.mo27376U()));
        contentValues.put("daily_events_count", Long.valueOf(yd6.mo27375T()));
        contentValues.put("daily_conversions_count", Long.valueOf(yd6.mo27373R()));
        contentValues.put("config_fetched_time", Long.valueOf(yd6.mo27372Q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(yd6.mo27381Z()));
        contentValues.put("app_version_int", Long.valueOf(yd6.mo27371P()));
        contentValues.put("firebase_instance_id", yd6.mo27407m0());
        contentValues.put("daily_error_events_count", Long.valueOf(yd6.mo27374S()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(yd6.mo27377V()));
        contentValues.put("health_monitor_sample", yd6.mo27382a());
        yd6.mo27356A();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(yd6.mo27367L()));
        contentValues.put("admob_app_id", yd6.mo27395g0());
        contentValues.put("dynamite_version", Long.valueOf(yd6.mo27380Y()));
        contentValues.put("session_stitching_token", yd6.mo27386c());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(yd6.mo27370O()));
        contentValues.put("target_os_version", Long.valueOf(yd6.mo27391e0()));
        List d = yd6.mo27388d();
        if (d != null) {
            if (d.isEmpty()) {
                this.f11205a.mo15136e().mo12731w().mo25380b("Safelisted events should not be an empty list. appId", i0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(vf4.f36537c, d));
            }
        }
        lw6.m21031c();
        if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17066k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo26063P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{i0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert/update app (got -1). appId", a56.m10802z(i0));
            }
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error storing app. appId", a56.m10802z(i0), e);
        }
    }

    @ly4
    /* renamed from: q */
    public final void mo26085q(ri5 ri5) {
        Preconditions.checkNotNull(ri5);
        mo15139h();
        mo27038i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ri5.f19877a);
        contentValues.put("name", ri5.f19880b);
        contentValues.put("lifetime_count", Long.valueOf(ri5.f19874a));
        contentValues.put("current_bundle_count", Long.valueOf(ri5.f19878b));
        contentValues.put("last_fire_timestamp", Long.valueOf(ri5.f19883d));
        contentValues.put("last_bundled_timestamp", Long.valueOf(ri5.f19884e));
        contentValues.put("last_bundled_day", ri5.f19876a);
        contentValues.put("last_sampled_complex_event_id", ri5.f19879b);
        contentValues.put("last_sampling_rate", ri5.f19882c);
        contentValues.put("current_session_count", Long.valueOf(ri5.f19881c));
        Boolean bool = ri5.f19875a;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo26063P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert/update event aggregates (got -1). appId", a56.m10802z(ri5.f19877a));
            }
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error storing event aggregates. appId", a56.m10802z(ri5.f19877a), e);
        }
    }

    /* renamed from: r */
    public final boolean mo26086r() {
        return mo26056I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: s */
    public final boolean mo26087s() {
        return mo26056I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo26088t() {
        return mo26056I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    @VisibleForTesting
    /* renamed from: u */
    public final boolean mo26089u() {
        Context f = this.f11205a.mo15137f();
        this.f11205a.mo27891z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo26090v(String str, Long l, long j, x86 x86) {
        mo15139h();
        mo27038i();
        Preconditions.checkNotNull(x86);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] h = x86.mo22497h();
        this.f11205a.mo15136e().mo12730v().mo25381c("Saving complex main event, appId, data size", this.f11205a.mo27862D().mo19280d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", h);
        try {
            if (mo26063P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert complex main event (got -1). appId", a56.m10802z(str));
            return false;
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error storing complex main event. appId", a56.m10802z(str), e);
            return false;
        }
    }

    @ly4
    /* renamed from: w */
    public final boolean mo26091w(fc5 fc5) {
        Preconditions.checkNotNull(fc5);
        mo15139h();
        mo27038i();
        String str = fc5.f12020b;
        Preconditions.checkNotNull(str);
        if (mo26070X(str, fc5.f12016a.f22256b) == null) {
            long I = mo26056I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f11205a.mo27891z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", fc5.f12024c);
        contentValues.put("name", fc5.f12016a.f22256b);
        m30056H(contentValues, "value", Preconditions.checkNotNull(fc5.f12016a.mo26660K2()));
        contentValues.put(C1767b9.C1768a.f9765n, Boolean.valueOf(fc5.f12021b));
        contentValues.put(C1767b9.C1768a.f9755d, fc5.f12026d);
        contentValues.put(C1767b9.C1768a.f9756e, Long.valueOf(fc5.f12022c));
        contentValues.put("timed_out_event", this.f11205a.mo27871N().mo16875e0(fc5.f12017a));
        contentValues.put(C1767b9.C1768a.f9764m, Long.valueOf(fc5.f12018b));
        contentValues.put("triggered_event", this.f11205a.mo27871N().mo16875e0(fc5.f12019b));
        contentValues.put(C1767b9.C1768a.f9766o, Long.valueOf(fc5.f12016a.f22255b));
        contentValues.put(C1767b9.C1768a.f9761j, Long.valueOf(fc5.f12025d));
        contentValues.put("expired_event", this.f11205a.mo27871N().mo16875e0(fc5.f12023c));
        try {
            if (mo26063P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert/update conditional user property (got -1)", a56.m10802z(str));
            }
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error storing conditional user property", a56.m10802z(str), e);
        }
        return true;
    }

    @ly4
    /* renamed from: x */
    public final boolean mo26092x(ar6 ar6) {
        Preconditions.checkNotNull(ar6);
        mo15139h();
        mo27038i();
        if (mo26070X(ar6.f9508a, ar6.f9510c) == null) {
            if (gr6.m16176Z(ar6.f9510c)) {
                if (mo26056I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ar6.f9508a}) >= ((long) this.f11205a.mo27891z().mo14123p(ar6.f9508a, n36.f17022G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(ar6.f9510c)) {
                long I = mo26056I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ar6.f9508a, ar6.f9509b});
                this.f11205a.mo27891z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ar6.f9508a);
        contentValues.put("origin", ar6.f9509b);
        contentValues.put("name", ar6.f9510c);
        contentValues.put("set_timestamp", Long.valueOf(ar6.f9506a));
        m30056H(contentValues, "value", ar6.f9507a);
        try {
            if (mo26063P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert/update user property (got -1). appId", a56.m10802z(ar6.f9508a));
            }
        } catch (SQLiteException e) {
            this.f11205a.mo15136e().mo12726r().mo25381c("Error storing user property. appId", a56.m10802z(ar6.f9508a), e);
        }
        return true;
    }
}
