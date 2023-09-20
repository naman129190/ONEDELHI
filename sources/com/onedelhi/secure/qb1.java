package com.onedelhi.secure;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import com.onedelhi.secure.l74;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class qb1 implements n74 {

    /* renamed from: a */
    public static final String[] f19054a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    public static final String[] f19055b = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f19056a;

    /* renamed from: com.onedelhi.secure.qb1$a */
    public class C3277a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ q74 f19057a;

        public C3277a(q74 q74) {
            this.f19057a = q74;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19057a.mo13767a(new tb1(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: com.onedelhi.secure.qb1$b */
    public class C3278b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ q74 f19059a;

        public C3278b(q74 q74) {
            this.f19059a = q74;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19059a.mo13767a(new tb1(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public qb1(SQLiteDatabase sQLiteDatabase) {
        this.f19056a = sQLiteDatabase;
    }

    /* renamed from: A0 */
    public void mo18301A0() {
        this.f19056a.endTransaction();
    }

    /* renamed from: D */
    public void mo18302D() {
        this.f19056a.beginTransaction();
    }

    /* renamed from: G */
    public void mo18303G(String str) throws SQLException {
        this.f19056a.execSQL(str);
    }

    /* renamed from: G2 */
    public long mo18305G2(String str, int i, ContentValues contentValues) throws SQLException {
        return this.f19056a.insertWithOnConflict(str, (String) null, contentValues, i);
    }

    /* renamed from: I1 */
    public boolean mo18306I1(long j) {
        return this.f19056a.yieldIfContendedSafely(j);
    }

    @sj3(api = 16)
    /* renamed from: J */
    public void mo18307J() {
        l74.C2696a.m20247d(this.f19056a);
    }

    /* renamed from: L */
    public void mo18308L() {
        this.f19056a.setTransactionSuccessful();
    }

    /* renamed from: O1 */
    public boolean mo18309O1() {
        return this.f19056a.isDbLockedByCurrentThread();
    }

    /* renamed from: P */
    public int mo18310P(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(f19054a[i]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i2 = 0;
        for (String next : contentValues.keySet()) {
            sb.append(i2 > 0 ? vf4.f36537c : "");
            sb.append(next);
            objArr2[i2] = contentValues.get(next);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        s74 n0 = mo18331n0(sb.toString());
        cz3.m12861e(n0, objArr2);
        return n0.mo13601a1();
    }

    /* renamed from: Q1 */
    public Cursor mo18311Q1(String str, Object[] objArr) {
        return mo18323d0(new cz3(str, objArr));
    }

    /* renamed from: R */
    public void mo18312R(long j) {
        this.f19056a.setPageSize(j);
    }

    @sj3(api = 16)
    /* renamed from: S */
    public Cursor mo18313S(q74 q74, CancellationSignal cancellationSignal) {
        return l74.C2696a.m20249f(this.f19056a, q74.mo13768b(), f19055b, (String) null, cancellationSignal, new C3278b(q74));
    }

    /* renamed from: T1 */
    public boolean mo18314T1() {
        return this.f19056a.isReadOnly();
    }

    /* renamed from: U */
    public void mo18315U(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f19056a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    /* renamed from: U0 */
    public List<Pair<String, String>> mo18316U0() {
        return this.f19056a.getAttachedDbs();
    }

    /* renamed from: W */
    public boolean mo18317W() {
        return this.f19056a.yieldIfContendedSafely();
    }

    /* renamed from: W1 */
    public boolean mo18318W1() {
        return this.f19056a.isDatabaseIntegrityOk();
    }

    /* renamed from: X1 */
    public boolean mo18319X1(int i) {
        return this.f19056a.needUpgrade(i);
    }

    /* renamed from: Y0 */
    public void mo18320Y0(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f19056a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    /* renamed from: Z0 */
    public void mo18321Z0(Locale locale) {
        this.f19056a.setLocale(locale);
    }

    /* renamed from: a */
    public boolean mo23068a(SQLiteDatabase sQLiteDatabase) {
        return this.f19056a == sQLiteDatabase;
    }

    public void close() throws IOException {
        this.f19056a.close();
    }

    /* renamed from: d0 */
    public Cursor mo18323d0(q74 q74) {
        return this.f19056a.rawQueryWithFactory(new C3277a(q74), q74.mo13768b(), f19055b, (String) null);
    }

    /* renamed from: d1 */
    public void mo18324d1() {
        this.f19056a.beginTransactionNonExclusive();
    }

    /* renamed from: f0 */
    public String mo18325f0() {
        return this.f19056a.getPath();
    }

    /* renamed from: g0 */
    public long mo18326g0() {
        return this.f19056a.getPageSize();
    }

    /* renamed from: g1 */
    public Cursor mo18327g1(String str) {
        return mo18323d0(new cz3(str));
    }

    public int getVersion() {
        return this.f19056a.getVersion();
    }

    public boolean isOpen() {
        return this.f19056a.isOpen();
    }

    /* renamed from: l2 */
    public int mo18330l2(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        s74 n0 = mo18331n0(sb.toString());
        cz3.m12861e(n0, objArr);
        return n0.mo13601a1();
    }

    /* renamed from: n0 */
    public s74 mo18331n0(String str) {
        return new ub1(this.f19056a.compileStatement(str));
    }

    /* renamed from: n2 */
    public boolean mo18332n2() {
        return this.f19056a.inTransaction();
    }

    /* renamed from: o1 */
    public void mo18333o1(int i) {
        this.f19056a.setMaxSqlCacheSize(i);
    }

    /* renamed from: p2 */
    public void mo18334p2(int i) {
        this.f19056a.setVersion(i);
    }

    /* renamed from: q2 */
    public void mo18335q2(@mr2 String str, @ts2 Object[] objArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f19056a.execPerConnectionSQL(str, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    /* renamed from: t0 */
    public void mo18336t0(String str, Object[] objArr) throws SQLException {
        this.f19056a.execSQL(str, objArr);
    }

    /* renamed from: v0 */
    public long mo18337v0() {
        return this.f19056a.getMaximumSize();
    }

    @sj3(api = 16)
    /* renamed from: v1 */
    public boolean mo18338v1() {
        return l74.C2696a.m20248e(this.f19056a);
    }

    /* renamed from: v2 */
    public long mo18339v2(long j) {
        return this.f19056a.setMaximumSize(j);
    }

    /* renamed from: x1 */
    public boolean mo18340x1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: y0 */
    public boolean mo18341y0() {
        return this.f19056a.enableWriteAheadLogging();
    }

    @sj3(api = 16)
    /* renamed from: z0 */
    public void mo18342z0(boolean z) {
        l74.C2696a.m20250g(this.f19056a, z);
    }
}
