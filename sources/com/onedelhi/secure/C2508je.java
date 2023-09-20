package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.onedelhi.secure.l74;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.je */
public final class C2508je implements o74, ji0 {
    @mr2

    /* renamed from: a */
    public final C2509a f14107a;
    @mr2

    /* renamed from: a */
    public final C2625kd f14108a;
    @mr2

    /* renamed from: a */
    public final o74 f14109a;

    /* renamed from: com.onedelhi.secure.je$a */
    public static final class C2509a implements n74 {
        @mr2

        /* renamed from: a */
        public final C2625kd f14110a;

        public C2509a(@mr2 C2625kd kdVar) {
            this.f14110a = kdVar;
        }

        /* renamed from: j0 */
        public static /* synthetic */ Object m18463j0(n74 n74) {
            return null;
        }

        /* renamed from: A0 */
        public void mo18301A0() {
            if (this.f14110a.mo19008d() != null) {
                try {
                    this.f14110a.mo19008d().mo18301A0();
                } finally {
                    this.f14110a.mo19006b();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        /* renamed from: D */
        public void mo18302D() {
            try {
                this.f14110a.mo19010f().mo18302D();
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: G */
        public void mo18303G(String str) throws SQLException {
            this.f14110a.mo19007c(new C5122ee(str));
        }

        /* renamed from: G0 */
        public void mo18304G0() {
            this.f14110a.mo19007c(C6424pd.f33522a);
        }

        /* renamed from: G2 */
        public long mo18305G2(String str, int i, ContentValues contentValues) throws SQLException {
            return ((Long) this.f14110a.mo19007c(new C5239fe(str, i, contentValues))).longValue();
        }

        /* renamed from: I1 */
        public boolean mo18306I1(long j) {
            return ((Boolean) this.f14110a.mo19007c(C7327yd.f37862a)).booleanValue();
        }

        /* renamed from: J */
        public void mo18307J() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        /* renamed from: L */
        public void mo18308L() {
            n74 d = this.f14110a.mo19008d();
            if (d != null) {
                d.mo18308L();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        /* renamed from: O1 */
        public boolean mo18309O1() {
            if (this.f14110a.mo19008d() == null) {
                return false;
            }
            return ((Boolean) this.f14110a.mo19007c(C7027vd.f36487a)).booleanValue();
        }

        /* renamed from: P */
        public int mo18310P(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
            return ((Integer) this.f14110a.mo19007c(new C5420ge(str, i, contentValues, str2, objArr))).intValue();
        }

        /* renamed from: Q1 */
        public Cursor mo18311Q1(String str, Object[] objArr) {
            try {
                return new C2511c(this.f14110a.mo19010f().mo18311Q1(str, objArr), this.f14110a);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: R */
        public void mo18312R(long j) {
            this.f14110a.mo19007c(new C4749ce(j));
        }

        @sj3(api = 24)
        /* renamed from: S */
        public Cursor mo18313S(q74 q74, CancellationSignal cancellationSignal) {
            try {
                return new C2511c(this.f14110a.mo19010f().mo18313S(q74, cancellationSignal), this.f14110a);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: T1 */
        public boolean mo18314T1() {
            return ((Boolean) this.f14110a.mo19007c(C7231xd.f37380a)).booleanValue();
        }

        /* renamed from: U */
        public void mo18315U(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.f14110a.mo19010f().mo18315U(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: U0 */
        public List<Pair<String, String>> mo18316U0() {
            return (List) this.f14110a.mo19007c(C6533qd.f34061a);
        }

        /* renamed from: W */
        public boolean mo18317W() {
            return ((Boolean) this.f14110a.mo19007c(C7327yd.f37862a)).booleanValue();
        }

        /* renamed from: W1 */
        public boolean mo18318W1() {
            return ((Boolean) this.f14110a.mo19007c(C6951ud.f36036a)).booleanValue();
        }

        /* renamed from: X1 */
        public boolean mo18319X1(int i) {
            return ((Boolean) this.f14110a.mo19007c(new C5986ld(i))).booleanValue();
        }

        /* renamed from: Y0 */
        public void mo18320Y0(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.f14110a.mo19010f().mo18320Y0(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: Z0 */
        public void mo18321Z0(Locale locale) {
            this.f14110a.mo19007c(new C6101md(locale));
        }

        public void close() throws IOException {
            this.f14110a.mo19005a();
        }

        /* renamed from: d0 */
        public Cursor mo18323d0(q74 q74) {
            try {
                return new C2511c(this.f14110a.mo19010f().mo18323d0(q74), this.f14110a);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: d1 */
        public void mo18324d1() {
            try {
                this.f14110a.mo19010f().mo18324d1();
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        /* renamed from: f0 */
        public String mo18325f0() {
            return (String) this.f14110a.mo19007c(C6661rd.f34569a);
        }

        /* renamed from: g0 */
        public long mo18326g0() {
            return ((Long) this.f14110a.mo19007c(C4537ae.f25817a)).longValue();
        }

        /* renamed from: g1 */
        public Cursor mo18327g1(String str) {
            try {
                return new C2511c(this.f14110a.mo19010f().mo18327g1(str), this.f14110a);
            } catch (Throwable th) {
                this.f14110a.mo19006b();
                throw th;
            }
        }

        public int getVersion() {
            return ((Integer) this.f14110a.mo19007c(C6755sd.f34974a)).intValue();
        }

        public boolean isOpen() {
            n74 d = this.f14110a.mo19008d();
            if (d == null) {
                return false;
            }
            return d.isOpen();
        }

        /* renamed from: l2 */
        public int mo18330l2(String str, String str2, Object[] objArr) {
            return ((Integer) this.f14110a.mo19007c(new C5514he(str, str2, objArr))).intValue();
        }

        /* renamed from: n0 */
        public s74 mo18331n0(String str) {
            return new C2510b(str, this.f14110a);
        }

        /* renamed from: n2 */
        public boolean mo18332n2() {
            if (this.f14110a.mo19008d() == null) {
                return false;
            }
            return ((Boolean) this.f14110a.mo19007c(C6863td.f35521a)).booleanValue();
        }

        /* renamed from: o1 */
        public void mo18333o1(int i) {
            this.f14110a.mo19007c(new C7152wd(i));
        }

        /* renamed from: p2 */
        public void mo18334p2(int i) {
            this.f14110a.mo19007c(new C4664be(i));
        }

        /* renamed from: q2 */
        public /* synthetic */ void mo18335q2(String str, Object[] objArr) {
            m74.m21349a(this, str, objArr);
        }

        /* renamed from: t0 */
        public void mo18336t0(String str, Object[] objArr) throws SQLException {
            this.f14110a.mo19007c(new C5717ie(str, objArr));
        }

        /* renamed from: v0 */
        public long mo18337v0() {
            return ((Long) this.f14110a.mo19007c(C7470zd.f38314a)).longValue();
        }

        @sj3(api = 16)
        /* renamed from: v1 */
        public boolean mo18338v1() {
            return ((Boolean) this.f14110a.mo19007c(C6268od.f32994a)).booleanValue();
        }

        /* renamed from: v2 */
        public long mo18339v2(long j) {
            return ((Long) this.f14110a.mo19007c(new C4996de(j))).longValue();
        }

        /* renamed from: x1 */
        public /* synthetic */ boolean mo18340x1() {
            return m74.m21350b(this);
        }

        /* renamed from: y0 */
        public boolean mo18341y0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @sj3(api = 16)
        /* renamed from: z0 */
        public void mo18342z0(boolean z) {
            this.f14110a.mo19007c(new C6181nd(z));
        }
    }

    /* renamed from: com.onedelhi.secure.je$b */
    public static class C2510b implements s74 {

        /* renamed from: a */
        public final C2625kd f14111a;

        /* renamed from: a */
        public final ArrayList<Object> f14112a = new ArrayList<>();

        /* renamed from: b */
        public final String f14113b;

        public C2510b(String str, C2625kd kdVar) {
            this.f14113b = str;
            this.f14111a = kdVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ Object m18515h(bd1 bd1, n74 n74) {
            s74 n0 = n74.mo18331n0(this.f14113b);
            mo18343c(n0);
            return bd1.mo4430a(n0);
        }

        /* renamed from: A2 */
        public long mo13595A2() {
            return ((Long) mo18345d(C6425pe.f33523a)).longValue();
        }

        /* renamed from: B2 */
        public void mo13596B2(int i, long j) {
            mo18346l(i, Long.valueOf(j));
        }

        /* renamed from: F2 */
        public long mo13597F2() {
            return ((Long) mo18345d(C6269oe.f32995a)).longValue();
        }

        /* renamed from: I2 */
        public void mo13598I2() {
            this.f14112a.clear();
        }

        /* renamed from: J0 */
        public void mo13599J0(int i) {
            mo18346l(i, (Object) null);
        }

        /* renamed from: P1 */
        public void mo13600P1(int i, double d) {
            mo18346l(i, Double.valueOf(d));
        }

        /* renamed from: a1 */
        public int mo13601a1() {
            return ((Integer) mo18345d(C6102me.f32082a)).intValue();
        }

        /* renamed from: c */
        public final void mo18343c(s74 s74) {
            int i = 0;
            while (i < this.f14112a.size()) {
                int i2 = i + 1;
                Object obj = this.f14112a.get(i);
                if (obj == null) {
                    s74.mo13599J0(i2);
                } else if (obj instanceof Long) {
                    s74.mo13596B2(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    s74.mo13600P1(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    s74.mo13605m2(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    s74.mo13606w(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public final <T> T mo18345d(bd1<s74, T> bd1) {
            return this.f14111a.mo19007c(new C5897ke(this, bd1));
        }

        /* renamed from: i0 */
        public String mo13603i0() {
            return (String) mo18345d(C6182ne.f32478a);
        }

        /* renamed from: l */
        public final void mo18346l(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.f14112a.size()) {
                for (int size = this.f14112a.size(); size <= i2; size++) {
                    this.f14112a.add((Object) null);
                }
            }
            this.f14112a.set(i2, obj);
        }

        /* renamed from: m1 */
        public void mo13604m1() {
            mo18345d(C5998le.f31624a);
        }

        /* renamed from: m2 */
        public void mo13605m2(int i, String str) {
            mo18346l(i, str);
        }

        /* renamed from: w */
        public void mo13606w(int i, byte[] bArr) {
            mo18346l(i, bArr);
        }
    }

    /* renamed from: com.onedelhi.secure.je$c */
    public static final class C2511c implements Cursor {

        /* renamed from: a */
        public final Cursor f14114a;

        /* renamed from: a */
        public final C2625kd f14115a;

        public C2511c(Cursor cursor, C2625kd kdVar) {
            this.f14114a = cursor;
            this.f14115a = kdVar;
        }

        public void close() {
            this.f14114a.close();
            this.f14115a.mo19006b();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f14114a.copyStringToBuffer(i, charArrayBuffer);
        }

        @Deprecated
        public void deactivate() {
            this.f14114a.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.f14114a.getBlob(i);
        }

        public int getColumnCount() {
            return this.f14114a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f14114a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f14114a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.f14114a.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.f14114a.getColumnNames();
        }

        public int getCount() {
            return this.f14114a.getCount();
        }

        public double getDouble(int i) {
            return this.f14114a.getDouble(i);
        }

        public Bundle getExtras() {
            return this.f14114a.getExtras();
        }

        public float getFloat(int i) {
            return this.f14114a.getFloat(i);
        }

        public int getInt(int i) {
            return this.f14114a.getInt(i);
        }

        public long getLong(int i) {
            return this.f14114a.getLong(i);
        }

        @sj3(api = 19)
        public Uri getNotificationUri() {
            return l74.C2697b.m20252a(this.f14114a);
        }

        @sj3(api = 29)
        @ts2
        public List<Uri> getNotificationUris() {
            return l74.C2700e.m20256a(this.f14114a);
        }

        public int getPosition() {
            return this.f14114a.getPosition();
        }

        public short getShort(int i) {
            return this.f14114a.getShort(i);
        }

        public String getString(int i) {
            return this.f14114a.getString(i);
        }

        public int getType(int i) {
            return this.f14114a.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f14114a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f14114a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f14114a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f14114a.isClosed();
        }

        public boolean isFirst() {
            return this.f14114a.isFirst();
        }

        public boolean isLast() {
            return this.f14114a.isLast();
        }

        public boolean isNull(int i) {
            return this.f14114a.isNull(i);
        }

        public boolean move(int i) {
            return this.f14114a.move(i);
        }

        public boolean moveToFirst() {
            return this.f14114a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f14114a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f14114a.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.f14114a.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.f14114a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f14114a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f14114a.registerDataSetObserver(dataSetObserver);
        }

        @Deprecated
        public boolean requery() {
            return this.f14114a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f14114a.respond(bundle);
        }

        @sj3(api = 23)
        public void setExtras(Bundle bundle) {
            l74.C2699d.m20255a(this.f14114a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f14114a.setNotificationUri(contentResolver, uri);
        }

        @sj3(api = 29)
        public void setNotificationUris(@mr2 ContentResolver contentResolver, @mr2 List<Uri> list) {
            l74.C2700e.m20257b(this.f14114a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f14114a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f14114a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C2508je(@mr2 o74 o74, @mr2 C2625kd kdVar) {
        this.f14109a = o74;
        this.f14108a = kdVar;
        kdVar.mo19011g(o74);
        this.f14107a = new C2509a(kdVar);
    }

    @mr2
    @sj3(api = 24)
    /* renamed from: Z1 */
    public n74 mo13225Z1() {
        this.f14107a.mo18304G0();
        return this.f14107a;
    }

    @mr2
    /* renamed from: a */
    public o74 mo13226a() {
        return this.f14109a;
    }

    @mr2
    /* renamed from: b */
    public C2625kd mo18299b() {
        return this.f14108a;
    }

    @mr2
    /* renamed from: c */
    public n74 mo18300c() {
        return this.f14107a;
    }

    public void close() {
        try {
            this.f14107a.close();
        } catch (IOException e) {
            r04.m26249a(e);
        }
    }

    @ts2
    public String getDatabaseName() {
        return this.f14109a.getDatabaseName();
    }

    @sj3(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f14109a.setWriteAheadLoggingEnabled(z);
    }

    @mr2
    @sj3(api = 24)
    /* renamed from: x */
    public n74 mo13235x() {
        this.f14107a.mo18304G0();
        return this.f14107a;
    }
}
