package com.onedelhi.secure;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.onedelhi.secure.C1738az;
import com.onedelhi.secure.a92;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.q84;
import com.onedelhi.secure.uv0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ly4
@nz3
public class gq3 implements aw0, q84, C4029yy {

    /* renamed from: a */
    public static final hu0 f12707a = hu0.m16939b("proto");

    /* renamed from: b */
    public static final String f12708b = "SQLiteEventStore";

    /* renamed from: n */
    public static final int f12709n = 16;

    /* renamed from: o */
    public static final int f12710o = 50;

    /* renamed from: a */
    public final a73<String> f12711a;

    /* renamed from: a */
    public final bw0 f12712a;

    /* renamed from: a */
    public final es3 f12713a;

    /* renamed from: a */
    public final C2106ez f12714a;

    /* renamed from: b */
    public final C2106ez f12715b;

    /* renamed from: com.onedelhi.secure.gq3$b */
    public interface C2271b<T, U> {
        /* renamed from: a */
        U mo16830a(T t);
    }

    /* renamed from: com.onedelhi.secure.gq3$c */
    public static class C2272c {

        /* renamed from: a */
        public final String f12716a;

        /* renamed from: b */
        public final String f12717b;

        public C2272c(String str, String str2) {
            this.f12716a = str;
            this.f12717b = str2;
        }
    }

    /* renamed from: com.onedelhi.secure.gq3$d */
    public interface C2273d<T> {
        /* renamed from: a */
        T mo16831a();
    }

    @qq1
    public gq3(@rw4 C2106ez ezVar, @uk2 C2106ez ezVar2, bw0 bw0, es3 es3, @en2("PACKAGE_NAME") a73<String> a73) {
        this.f12713a = es3;
        this.f12714a = ezVar;
        this.f12715b = ezVar2;
        this.f12712a = bw0;
        this.f12711a = a73;
    }

    /* renamed from: A1 */
    public static /* synthetic */ SQLiteDatabase m16050A1(Throwable th) {
        throw new p84("Timed out while trying to open db.", th);
    }

    /* renamed from: B1 */
    public static /* synthetic */ Long m16051B1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: D1 */
    public static /* synthetic */ he4 m16054D1(long j, SQLiteDatabase sQLiteDatabase) {
        return (he4) m16071P2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new ep3(j));
    }

    /* renamed from: E1 */
    public static /* synthetic */ Long m16056E1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: E2 */
    public static byte[] m16057E2(@ts2 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ Boolean m16060G1(xh4 xh4, SQLiteDatabase sQLiteDatabase) {
        Long f1 = mo16824f1(sQLiteDatabase, xh4);
        if (f1 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m16071P2(mo16815S0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{f1.toString()}), rp3.f34710a);
    }

    /* renamed from: H1 */
    public static /* synthetic */ List m16062H1(SQLiteDatabase sQLiteDatabase) {
        return (List) m16071P2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), mp3.f32214a);
    }

    /* renamed from: J1 */
    public static /* synthetic */ List m16063J1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(xh4.m31443a().mo23183b(cursor.getString(1)).mo23185d(h53.m16480b(cursor.getInt(2))).mo23184c(m16057E2(cursor.getString(3))).mo23182a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ List m16065L1(xh4 xh4, SQLiteDatabase sQLiteDatabase) {
        List<p13> x2 = mo16829x2(sQLiteDatabase, xh4, this.f12712a.mo13838d());
        for (d53 d53 : d53.values()) {
            if (d53 != xh4.mo23179d()) {
                int d = this.f12712a.mo13838d() - x2.size();
                if (d <= 0) {
                    break;
                }
                x2.addAll(mo16829x2(sQLiteDatabase, xh4.mo26924f(d53), d));
            }
        }
        return mo16828j1(x2, mo16806C2(sQLiteDatabase, x2));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ C1738az m16068M1(Map map, C1738az.C1739a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            a92.C1672b O0 = mo16811O0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(a92.m10938d().mo12866c(O0).mo12865b(j).mo12864a());
        }
        mo16807K2(aVar, map);
        aVar.mo13345f(mo16821c1());
        aVar.mo13343d(mo16816V0());
        aVar.mo13342c(this.f12711a.get());
        return aVar.mo13341b();
    }

    /* renamed from: N2 */
    public static hu0 m16069N2(@ts2 String str) {
        return str == null ? f12707a : hu0.m16939b(str);
    }

    /* renamed from: O2 */
    public static String m16070O2(Iterable<p13> iterable) {
        StringBuilder sb = new StringBuilder(pl2.f33726c);
        Iterator<p13> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo15178c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @hw4
    /* renamed from: P2 */
    public static <T> T m16071P2(Cursor cursor, C2271b<Cursor, T> bVar) {
        try {
            return bVar.mo16830a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ C1738az m16072U1(String str, Map map, C1738az.C1739a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C1738az) m16071P2(sQLiteDatabase.rawQuery(str, new String[0]), new ip3(this, map, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ Object m16073V1(List list, xh4 xh4, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            uv0.C3747a k = uv0.m29608a().mo25595j(cursor.getString(1)).mo25594i(cursor.getLong(2)).mo25596k(cursor.getLong(3));
            k.mo25593h(z ? new xt0(m16069N2(cursor.getString(4)), cursor.getBlob(5)) : new xt0(m16069N2(cursor.getString(4)), mo16808L2(j)));
            if (!cursor.isNull(6)) {
                k.mo25592g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(p13.m24339a(j, xh4, k.mo25589d()));
        }
        return null;
    }

    /* renamed from: a2 */
    public static /* synthetic */ Object m16077a2(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C2272c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ Long m16078b2(uv0 uv0, xh4 xh4, SQLiteDatabase sQLiteDatabase) {
        if (mo16827i1()) {
            mo16817a(1, a92.C1672b.CACHE_FULL, uv0.mo25586l());
            return -1L;
        }
        long Q0 = mo16813Q0(sQLiteDatabase, xh4);
        int e = this.f12712a.mo13839e();
        byte[] a = uv0.mo25582e().mo27087a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(Q0));
        contentValues.put("transport_name", uv0.mo25586l());
        contentValues.put("timestamp_ms", Long.valueOf(uv0.mo25584f()));
        contentValues.put("uptime_ms", Long.valueOf(uv0.mo25587m()));
        contentValues.put("payload_encoding", uv0.mo25582e().mo27088b().mo17410a());
        contentValues.put("code", uv0.mo25581d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : uv0.mo25744i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: c2 */
    public static /* synthetic */ byte[] m16080c2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ Object m16081d2(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo16817a((long) i, a92.C1672b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ Object m16084g2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m16071P2(sQLiteDatabase.rawQuery(str2, (String[]) null), new aq3(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: i2 */
    public static /* synthetic */ Boolean m16086i2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: j2 */
    public static /* synthetic */ Object m16088j2(String str, a92.C1672b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m16071P2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo12867j())}), qp3.f34321a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo12867j()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo12867j())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ Object m16091l1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo16817a((long) i, a92.C1672b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: o2 */
    public static /* synthetic */ Object m16094o2(long j, xh4 xh4, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{xh4.mo23177b(), String.valueOf(h53.m16479a(xh4.mo23179d()))}) < 1) {
            contentValues.put("backend_name", xh4.mo23177b());
            contentValues.put("priority", Integer.valueOf(h53.m16479a(xh4.mo23179d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ Integer m16097p1(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m16071P2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new zp3(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: s1 */
    public static /* synthetic */ Object m16100s1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", (String) null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", (String) null, new String[0]);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ Object m16103w2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f12714a.mo15656a()).execute();
        return null;
    }

    /* renamed from: z1 */
    public static /* synthetic */ Object m16104z1(Throwable th) {
        throw new p84("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: C2 */
    public final Map<Long, Set<C2272c>> mo16806C2(SQLiteDatabase sQLiteDatabase, List<p13> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo15178c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m16071P2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new kp3(hashMap));
        return hashMap;
    }

    /* renamed from: E0 */
    public int mo13292E0() {
        return ((Integer) mo16826h1(new cq3(this, this.f12714a.mo15656a() - this.f12712a.mo13837c()))).intValue();
    }

    /* renamed from: H0 */
    public Iterable<p13> mo13293H0(xh4 xh4) {
        return (Iterable) mo16826h1(new eq3(this, xh4));
    }

    /* renamed from: K1 */
    public long mo13294K1(xh4 xh4) {
        return ((Long) m16071P2(mo16815S0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{xh4.mo23177b(), String.valueOf(h53.m16479a(xh4.mo23179d()))}), np3.f32719a)).longValue();
    }

    /* renamed from: K2 */
    public final void mo16807K2(C1738az.C1739a aVar, Map<String, List<a92>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo13340a(i92.m17359d().mo17693d((String) next.getKey()).mo17692c((List) next.getValue()).mo17691b());
        }
    }

    /* renamed from: L2 */
    public final byte[] mo16808L2(long j) {
        return (byte[]) m16071P2(mo16815S0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), lp3.f31785a);
    }

    /* renamed from: M2 */
    public final <T> T mo16809M2(C2273d<T> dVar, C2271b<Throwable, T> bVar) {
        long a = this.f12715b.mo15656a();
        while (true) {
            try {
                return dVar.mo16831a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f12715b.mo15656a() >= ((long) this.f12712a.mo13836b()) + a) {
                    return bVar.mo16830a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    @hl3({hl3.C2354a.f13190e})
    /* renamed from: N0 */
    public void mo16810N0() {
        mo16826h1(sp3.f35161a);
    }

    /* renamed from: O0 */
    public final a92.C1672b mo16811O0(int i) {
        a92.C1672b bVar = a92.C1672b.REASON_UNKNOWN;
        if (i == bVar.mo12867j()) {
            return bVar;
        }
        a92.C1672b bVar2 = a92.C1672b.MESSAGE_TOO_OLD;
        if (i == bVar2.mo12867j()) {
            return bVar2;
        }
        a92.C1672b bVar3 = a92.C1672b.CACHE_FULL;
        if (i == bVar3.mo12867j()) {
            return bVar3;
        }
        a92.C1672b bVar4 = a92.C1672b.PAYLOAD_TOO_BIG;
        if (i == bVar4.mo12867j()) {
            return bVar4;
        }
        a92.C1672b bVar5 = a92.C1672b.MAX_RETRIES_REACHED;
        if (i == bVar5.mo12867j()) {
            return bVar5;
        }
        a92.C1672b bVar6 = a92.C1672b.INVALID_PAYLOD;
        if (i == bVar6.mo12867j()) {
            return bVar6;
        }
        a92.C1672b bVar7 = a92.C1672b.SERVER_ERROR;
        if (i == bVar7.mo12867j()) {
            return bVar7;
        }
        r92.m26529c(f12708b, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: P0 */
    public final void mo16812P0(SQLiteDatabase sQLiteDatabase) {
        mo16809M2(new wp3(sQLiteDatabase), vp3.f36618a);
    }

    /* renamed from: Q */
    public boolean mo13295Q(xh4 xh4) {
        return ((Boolean) mo16826h1(new fq3(this, xh4))).booleanValue();
    }

    /* renamed from: Q0 */
    public final long mo16813Q0(SQLiteDatabase sQLiteDatabase, xh4 xh4) {
        Long f1 = mo16824f1(sQLiteDatabase, xh4);
        if (f1 != null) {
            return f1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", xh4.mo23177b());
        contentValues.put("priority", Integer.valueOf(h53.m16479a(xh4.mo23179d())));
        contentValues.put("next_request_ms", 0);
        if (xh4.mo23178c() != null) {
            contentValues.put("extras", Base64.encodeToString(xh4.mo23178c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    @hw4
    /* renamed from: R0 */
    public long mo16814R0() {
        return mo16819b1() * mo16825g0();
    }

    @hw4
    /* renamed from: S0 */
    public SQLiteDatabase mo16815S0() {
        es3 es3 = this.f12713a;
        Objects.requireNonNull(es3);
        return (SQLiteDatabase) mo16809M2(new xp3(es3), up3.f36227a);
    }

    /* renamed from: T0 */
    public Iterable<xh4> mo13296T0() {
        return (Iterable) mo16826h1(tp3.f35758a);
    }

    /* renamed from: V0 */
    public final jh1 mo16816V0() {
        return jh1.m18571d().mo18423b(c44.m12298d().mo13972b(mo16814R0()).mo13973c(bw0.f9992a.mo13840f()).mo13971a()).mo18422a();
    }

    /* renamed from: a */
    public void mo16817a(long j, a92.C1672b bVar, String str) {
        mo16826h1(new jp3(str, bVar, j));
    }

    /* renamed from: b */
    public <T> T mo16818b(q84.C3244a<T> aVar) {
        SQLiteDatabase S0 = mo16815S0();
        mo16812P0(S0);
        try {
            T a = aVar.mo22943a();
            S0.setTransactionSuccessful();
            return a;
        } finally {
            S0.endTransaction();
        }
    }

    /* renamed from: b1 */
    public final long mo16819b1() {
        return mo16815S0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: c */
    public void mo16820c() {
        mo16826h1(new bq3(this));
    }

    /* renamed from: c1 */
    public final he4 mo16821c1() {
        return (he4) mo16826h1(new pp3(this.f12714a.mo15656a()));
    }

    public void close() {
        this.f12713a.close();
    }

    /* renamed from: d */
    public C1738az mo16823d() {
        return (C1738az) mo16826h1(new gp3(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C1738az.m11489h()));
    }

    @ts2
    /* renamed from: f1 */
    public final Long mo16824f1(SQLiteDatabase sQLiteDatabase, xh4 xh4) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{xh4.mo23177b(), String.valueOf(h53.m16479a(xh4.mo23179d()))}));
        if (xh4.mo23178c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(xh4.mo23178c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m16071P2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), op3.f33163a);
    }

    /* renamed from: g0 */
    public final long mo16825g0() {
        return mo16815S0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @hw4
    /* renamed from: h1 */
    public <T> T mo16826h1(C2271b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase S0 = mo16815S0();
        S0.beginTransaction();
        try {
            T a = bVar.mo16830a(S0);
            S0.setTransactionSuccessful();
            return a;
        } finally {
            S0.endTransaction();
        }
    }

    /* renamed from: i1 */
    public final boolean mo16827i1() {
        return mo16819b1() * mo16825g0() >= this.f12712a.mo13840f();
    }

    /* renamed from: j1 */
    public final List<p13> mo16828j1(List<p13> list, Map<Long, Set<C2272c>> map) {
        ListIterator<p13> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            p13 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo15178c()))) {
                uv0.C3747a n = next.mo15177b().mo25747n();
                for (C2272c cVar : map.get(Long.valueOf(next.mo15178c()))) {
                    n.mo25750c(cVar.f12716a, cVar.f12717b);
                }
                listIterator.set(p13.m24339a(next.mo15178c(), next.mo15179d(), n.mo25589d()));
            }
        }
        return list;
    }

    /* renamed from: t2 */
    public void mo13297t2(Iterable<p13> iterable) {
        if (iterable.iterator().hasNext()) {
            mo16815S0().compileStatement("DELETE FROM events WHERE _id in " + m16070O2(iterable)).execute();
        }
    }

    /* renamed from: x0 */
    public void mo13298x0(Iterable<p13> iterable) {
        if (iterable.iterator().hasNext()) {
            mo16826h1(new fp3(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m16070O2(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: x2 */
    public final List<p13> mo16829x2(SQLiteDatabase sQLiteDatabase, xh4 xh4, int i) {
        ArrayList arrayList = new ArrayList();
        Long f1 = mo16824f1(sQLiteDatabase, xh4);
        if (f1 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m16071P2(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{f1.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new hp3(this, arrayList, xh4));
        return arrayList;
    }

    /* renamed from: y */
    public void mo13299y(xh4 xh4, long j) {
        mo16826h1(new yp3(j, xh4));
    }

    @ts2
    /* renamed from: y1 */
    public p13 mo13300y1(xh4 xh4, uv0 uv0) {
        r92.m26531e(f12708b, "Storing event with priority=%s, name=%s for destination %s", xh4.mo23179d(), uv0.mo25586l(), xh4.mo23177b());
        long longValue = ((Long) mo16826h1(new dq3(this, uv0, xh4))).longValue();
        if (longValue < 1) {
            return null;
        }
        return p13.m24339a(longValue, xh4, uv0);
    }
}
