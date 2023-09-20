package com.onedelhi.secure;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import com.onedelhi.secure.ym3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class s93 implements n74 {

    /* renamed from: a */
    public final n74 f20262a;

    /* renamed from: a */
    public final ym3.C4016f f20263a;

    /* renamed from: a */
    public final Executor f20264a;

    public s93(@mr2 n74 n74, @mr2 ym3.C4016f fVar, @mr2 Executor executor) {
        this.f20262a = n74;
        this.f20263a = fVar;
        this.f20264a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m27331H() {
        this.f20263a.mo27645a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m27332K() {
        this.f20263a.mo27645a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m27333M() {
        this.f20263a.mo27645a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m27334X() {
        this.f20263a.mo27645a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m27335Y() {
        this.f20263a.mo27645a("END TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m27336Z(String str) {
        this.f20263a.mo27645a(str, new ArrayList(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m27340c0(String str, List list) {
        this.f20263a.mo27645a(str, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m27342e0(String str) {
        this.f20263a.mo27645a(str, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m27345j0(String str, List list) {
        this.f20263a.mo27645a(str, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m27347l0(q74 q74, v93 v93) {
        this.f20263a.mo27645a(q74.mo13768b(), v93.mo25906a());
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m27349o0(q74 q74, v93 v93) {
        this.f20263a.mo27645a(q74.mo13768b(), v93.mo25906a());
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m27351p0() {
        this.f20263a.mo27645a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* renamed from: A0 */
    public void mo18301A0() {
        this.f20264a.execute(new g93(this));
        this.f20262a.mo18301A0();
    }

    /* renamed from: D */
    public void mo18302D() {
        this.f20264a.execute(new m93(this));
        this.f20262a.mo18302D();
    }

    /* renamed from: G */
    public void mo18303G(@mr2 String str) throws SQLException {
        this.f20264a.execute(new q93(this, str));
        this.f20262a.mo18303G(str);
    }

    /* renamed from: G2 */
    public long mo18305G2(@mr2 String str, int i, @mr2 ContentValues contentValues) throws SQLException {
        return this.f20262a.mo18305G2(str, i, contentValues);
    }

    /* renamed from: I1 */
    public boolean mo18306I1(long j) {
        return this.f20262a.mo18306I1(j);
    }

    @sj3(api = 16)
    /* renamed from: J */
    public void mo18307J() {
        this.f20262a.mo18307J();
    }

    /* renamed from: L */
    public void mo18308L() {
        this.f20264a.execute(new k93(this));
        this.f20262a.mo18308L();
    }

    /* renamed from: O1 */
    public boolean mo18309O1() {
        return this.f20262a.mo18309O1();
    }

    /* renamed from: P */
    public int mo18310P(@mr2 String str, int i, @mr2 ContentValues contentValues, @mr2 String str2, @mr2 Object[] objArr) {
        return this.f20262a.mo18310P(str, i, contentValues, str2, objArr);
    }

    @mr2
    /* renamed from: Q1 */
    public Cursor mo18311Q1(@mr2 String str, @mr2 Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f20264a.execute(new i93(this, str, arrayList));
        return this.f20262a.mo18311Q1(str, objArr);
    }

    /* renamed from: R */
    public void mo18312R(long j) {
        this.f20262a.mo18312R(j);
    }

    @mr2
    /* renamed from: S */
    public Cursor mo18313S(@mr2 q74 q74, @mr2 CancellationSignal cancellationSignal) {
        v93 v93 = new v93();
        q74.mo13767a(v93);
        this.f20264a.execute(new p93(this, q74, v93));
        return this.f20262a.mo18323d0(q74);
    }

    /* renamed from: T1 */
    public boolean mo18314T1() {
        return this.f20262a.mo18314T1();
    }

    /* renamed from: U */
    public void mo18315U(@mr2 SQLiteTransactionListener sQLiteTransactionListener) {
        this.f20264a.execute(new n93(this));
        this.f20262a.mo18315U(sQLiteTransactionListener);
    }

    @mr2
    /* renamed from: U0 */
    public List<Pair<String, String>> mo18316U0() {
        return this.f20262a.mo18316U0();
    }

    /* renamed from: W */
    public boolean mo18317W() {
        return this.f20262a.mo18317W();
    }

    /* renamed from: W1 */
    public boolean mo18318W1() {
        return this.f20262a.mo18318W1();
    }

    /* renamed from: X1 */
    public boolean mo18319X1(int i) {
        return this.f20262a.mo18319X1(i);
    }

    /* renamed from: Y0 */
    public void mo18320Y0(@mr2 SQLiteTransactionListener sQLiteTransactionListener) {
        this.f20264a.execute(new l93(this));
        this.f20262a.mo18320Y0(sQLiteTransactionListener);
    }

    /* renamed from: Z0 */
    public void mo18321Z0(@mr2 Locale locale) {
        this.f20262a.mo18321Z0(locale);
    }

    public void close() throws IOException {
        this.f20262a.close();
    }

    @mr2
    /* renamed from: d0 */
    public Cursor mo18323d0(@mr2 q74 q74) {
        v93 v93 = new v93();
        q74.mo13767a(v93);
        this.f20264a.execute(new o93(this, q74, v93));
        return this.f20262a.mo18323d0(q74);
    }

    /* renamed from: d1 */
    public void mo18324d1() {
        this.f20264a.execute(new j93(this));
        this.f20262a.mo18324d1();
    }

    @mr2
    /* renamed from: f0 */
    public String mo18325f0() {
        return this.f20262a.mo18325f0();
    }

    /* renamed from: g0 */
    public long mo18326g0() {
        return this.f20262a.mo18326g0();
    }

    @mr2
    /* renamed from: g1 */
    public Cursor mo18327g1(@mr2 String str) {
        this.f20264a.execute(new r93(this, str));
        return this.f20262a.mo18327g1(str);
    }

    public int getVersion() {
        return this.f20262a.getVersion();
    }

    public boolean isOpen() {
        return this.f20262a.isOpen();
    }

    /* renamed from: l2 */
    public int mo18330l2(@mr2 String str, @mr2 String str2, @mr2 Object[] objArr) {
        return this.f20262a.mo18330l2(str, str2, objArr);
    }

    @mr2
    /* renamed from: n0 */
    public s74 mo18331n0(@mr2 String str) {
        return new ba3(this.f20262a.mo18331n0(str), this.f20263a, str, this.f20264a);
    }

    /* renamed from: n2 */
    public boolean mo18332n2() {
        return this.f20262a.mo18332n2();
    }

    /* renamed from: o1 */
    public void mo18333o1(int i) {
        this.f20262a.mo18333o1(i);
    }

    /* renamed from: p2 */
    public void mo18334p2(int i) {
        this.f20262a.mo18334p2(i);
    }

    /* renamed from: q2 */
    public /* synthetic */ void mo18335q2(String str, Object[] objArr) {
        m74.m21349a(this, str, objArr);
    }

    /* renamed from: t0 */
    public void mo18336t0(@mr2 String str, @mr2 Object[] objArr) throws SQLException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f20264a.execute(new h93(this, str, arrayList));
        this.f20262a.mo18336t0(str, arrayList.toArray());
    }

    /* renamed from: v0 */
    public long mo18337v0() {
        return this.f20262a.mo18337v0();
    }

    @sj3(api = 16)
    /* renamed from: v1 */
    public boolean mo18338v1() {
        return this.f20262a.mo18338v1();
    }

    /* renamed from: v2 */
    public long mo18339v2(long j) {
        return this.f20262a.mo18339v2(j);
    }

    /* renamed from: x1 */
    public /* synthetic */ boolean mo18340x1() {
        return m74.m21350b(this);
    }

    /* renamed from: y0 */
    public boolean mo18341y0() {
        return this.f20262a.mo18341y0();
    }

    @sj3(api = 16)
    /* renamed from: z0 */
    public void mo18342z0(boolean z) {
        this.f20262a.mo18342z0(z);
    }
}
