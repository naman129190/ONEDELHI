package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

public interface n74 extends Closeable {
    /* renamed from: A0 */
    void mo18301A0();

    /* renamed from: D */
    void mo18302D();

    /* renamed from: G */
    void mo18303G(String str) throws SQLException;

    /* renamed from: G2 */
    long mo18305G2(String str, int i, ContentValues contentValues) throws SQLException;

    /* renamed from: I1 */
    boolean mo18306I1(long j);

    @sj3(api = 16)
    /* renamed from: J */
    void mo18307J();

    /* renamed from: L */
    void mo18308L();

    /* renamed from: O1 */
    boolean mo18309O1();

    /* renamed from: P */
    int mo18310P(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    /* renamed from: Q1 */
    Cursor mo18311Q1(String str, Object[] objArr);

    /* renamed from: R */
    void mo18312R(long j);

    @sj3(api = 16)
    /* renamed from: S */
    Cursor mo18313S(q74 q74, CancellationSignal cancellationSignal);

    /* renamed from: T1 */
    boolean mo18314T1();

    /* renamed from: U */
    void mo18315U(SQLiteTransactionListener sQLiteTransactionListener);

    /* renamed from: U0 */
    List<Pair<String, String>> mo18316U0();

    /* renamed from: W */
    boolean mo18317W();

    /* renamed from: W1 */
    boolean mo18318W1();

    /* renamed from: X1 */
    boolean mo18319X1(int i);

    /* renamed from: Y0 */
    void mo18320Y0(SQLiteTransactionListener sQLiteTransactionListener);

    /* renamed from: Z0 */
    void mo18321Z0(Locale locale);

    /* renamed from: d0 */
    Cursor mo18323d0(q74 q74);

    /* renamed from: d1 */
    void mo18324d1();

    /* renamed from: f0 */
    String mo18325f0();

    /* renamed from: g0 */
    long mo18326g0();

    /* renamed from: g1 */
    Cursor mo18327g1(String str);

    int getVersion();

    boolean isOpen();

    /* renamed from: l2 */
    int mo18330l2(String str, String str2, Object[] objArr);

    /* renamed from: n0 */
    s74 mo18331n0(String str);

    /* renamed from: n2 */
    boolean mo18332n2();

    /* renamed from: o1 */
    void mo18333o1(int i);

    /* renamed from: p2 */
    void mo18334p2(int i);

    /* renamed from: q2 */
    void mo18335q2(@mr2 String str, @SuppressLint({"ArrayReturn"}) @ts2 Object[] objArr);

    /* renamed from: t0 */
    void mo18336t0(String str, Object[] objArr) throws SQLException;

    /* renamed from: v0 */
    long mo18337v0();

    @sj3(api = 16)
    /* renamed from: v1 */
    boolean mo18338v1();

    /* renamed from: v2 */
    long mo18339v2(long j);

    /* renamed from: x1 */
    boolean mo18340x1();

    /* renamed from: y0 */
    boolean mo18341y0();

    @sj3(api = 16)
    /* renamed from: z0 */
    void mo18342z0(boolean z);
}
