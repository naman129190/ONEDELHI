package com.onedelhi.secure;

import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import androidx.room.C0967c;
import com.onedelhi.secure.hl3;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@hl3({hl3.C2354a.f13188c})
public abstract class e32<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final C0967c.C0970c f11089a;

    /* renamed from: a */
    public final bn3 f11090a;

    /* renamed from: a */
    public final ym3 f11091a;

    /* renamed from: a */
    public final String f11092a;

    /* renamed from: a */
    public final AtomicBoolean f11093a;

    /* renamed from: a */
    public final boolean f11094a;

    /* renamed from: b */
    public final String f11095b;

    /* renamed from: com.onedelhi.secure.e32$a */
    public class C2028a extends C0967c.C0970c {
        public C2028a(String[] strArr) {
            super(strArr);
        }

        /* renamed from: b */
        public void mo6642b(@mr2 Set<String> set) {
            e32.this.invalidate();
        }
    }

    public e32(@mr2 ym3 ym3, @mr2 bn3 bn3, boolean z, boolean z2, @mr2 String... strArr) {
        this.f11093a = new AtomicBoolean(false);
        this.f11091a = ym3;
        this.f11090a = bn3;
        this.f11094a = z;
        this.f11092a = "SELECT COUNT(*) FROM ( " + bn3.mo13768b() + " )";
        this.f11095b = "SELECT * FROM ( " + bn3.mo13768b() + " ) LIMIT ? OFFSET ?";
        this.f11089a = new C2028a(strArr);
        if (z2) {
            mo15004h();
        }
    }

    public e32(@mr2 ym3 ym3, @mr2 bn3 bn3, boolean z, @mr2 String... strArr) {
        this(ym3, bn3, z, true, strArr);
    }

    public e32(@mr2 ym3 ym3, @mr2 q74 q74, boolean z, boolean z2, @mr2 String... strArr) {
        this(ym3, bn3.m11971h(q74), z, z2, strArr);
    }

    public e32(@mr2 ym3 ym3, @mr2 q74 q74, boolean z, @mr2 String... strArr) {
        this(ym3, bn3.m11971h(q74), z, strArr);
    }

    @mr2
    /* renamed from: a */
    public abstract List<T> mo14997a(@mr2 Cursor cursor);

    /* renamed from: b */
    public int mo14998b() {
        mo15004h();
        bn3 d = bn3.m11970d(this.f11092a, this.f11090a.mo13769c());
        d.mo13771g(this.f11090a);
        Cursor query = this.f11091a.query(d);
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            query.close();
            d.release();
            return 0;
        } finally {
            query.close();
            d.release();
        }
    }

    /* renamed from: c */
    public final bn3 mo14999c(int i, int i2) {
        bn3 d = bn3.m11970d(this.f11095b, this.f11090a.mo13769c() + 2);
        d.mo13771g(this.f11090a);
        d.mo13596B2(d.mo13769c() - 1, (long) i2);
        d.mo13596B2(d.mo13769c(), (long) i);
        return d;
    }

    /* renamed from: d */
    public boolean mo15000d() {
        mo15004h();
        this.f11091a.getInvalidationTracker().mo6624l();
        return e32.super.isInvalid();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15001e(@com.onedelhi.secure.mr2 androidx.paging.PositionalDataSource.LoadInitialParams r7, @com.onedelhi.secure.mr2 androidx.paging.PositionalDataSource.LoadInitialCallback<T> r8) {
        /*
            r6 = this;
            r6.mo15004h()
            java.util.List r0 = java.util.Collections.emptyList()
            com.onedelhi.secure.ym3 r1 = r6.f11091a
            r1.beginTransaction()
            r1 = 0
            int r2 = r6.mo14998b()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0035
            int r0 = computeInitialLoadPosition(r7, r2)     // Catch:{ all -> 0x004a }
            int r7 = computeInitialLoadSize(r7, r0, r2)     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.bn3 r7 = r6.mo14999c(r0, r7)     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.ym3 r3 = r6.f11091a     // Catch:{ all -> 0x0033 }
            android.database.Cursor r1 = r3.query(r7)     // Catch:{ all -> 0x0033 }
            java.util.List r3 = r6.mo14997a(r1)     // Catch:{ all -> 0x0033 }
            com.onedelhi.secure.ym3 r4 = r6.f11091a     // Catch:{ all -> 0x0033 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0033 }
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L_0x0037
        L_0x0033:
            r8 = move-exception
            goto L_0x004c
        L_0x0035:
            r7 = 0
            r3 = r1
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            com.onedelhi.secure.ym3 r1 = r6.f11091a
            r1.endTransaction()
            if (r3 == 0) goto L_0x0046
            r3.release()
        L_0x0046:
            r8.onResult(r0, r7, r2)
            return
        L_0x004a:
            r8 = move-exception
            r7 = r1
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            com.onedelhi.secure.ym3 r0 = r6.f11091a
            r0.endTransaction()
            if (r7 == 0) goto L_0x005b
            r7.release()
        L_0x005b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e32.mo15001e(androidx.paging.PositionalDataSource$LoadInitialParams, androidx.paging.PositionalDataSource$LoadInitialCallback):void");
    }

    @mr2
    /* renamed from: f */
    public List<T> mo15002f(int i, int i2) {
        List<T> a;
        bn3 c = mo14999c(i, i2);
        if (this.f11094a) {
            this.f11091a.beginTransaction();
            Cursor cursor = null;
            try {
                cursor = this.f11091a.query(c);
                a = mo14997a(cursor);
                this.f11091a.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
                this.f11091a.endTransaction();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                this.f11091a.endTransaction();
                c.release();
                throw th;
            }
        } else {
            Cursor query = this.f11091a.query(c);
            try {
                a = mo14997a(query);
                query.close();
            } catch (Throwable th2) {
                query.close();
                c.release();
                throw th2;
            }
        }
        c.release();
        return a;
    }

    /* renamed from: g */
    public void mo15003g(@mr2 PositionalDataSource.LoadRangeParams loadRangeParams, @mr2 PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(mo15002f(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    /* renamed from: h */
    public final void mo15004h() {
        if (this.f11093a.compareAndSet(false, true)) {
            this.f11091a.getInvalidationTracker().mo6616b(this.f11089a);
        }
    }
}
