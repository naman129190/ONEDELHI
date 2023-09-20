package com.onedelhi.secure;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.onedelhi.secure.l74;
import com.onedelhi.secure.o74;
import java.io.File;

public class rb1 implements o74 {

    /* renamed from: a */
    public final Context f19753a;

    /* renamed from: a */
    public final o74.C3036a f19754a;

    /* renamed from: a */
    public C3397a f19755a;

    /* renamed from: a */
    public final Object f19756a;

    /* renamed from: b */
    public final String f19757b;

    /* renamed from: b */
    public final boolean f19758b;

    /* renamed from: c */
    public boolean f19759c;

    /* renamed from: com.onedelhi.secure.rb1$a */
    public static class C3397a extends SQLiteOpenHelper {

        /* renamed from: a */
        public final o74.C3036a f19760a;

        /* renamed from: a */
        public final qb1[] f19761a;

        /* renamed from: b */
        public boolean f19762b;

        /* renamed from: com.onedelhi.secure.rb1$a$a */
        public class C3398a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ o74.C3036a f19763a;

            /* renamed from: a */
            public final /* synthetic */ qb1[] f19764a;

            public C3398a(o74.C3036a aVar, qb1[] qb1Arr) {
                this.f19763a = aVar;
                this.f19764a = qb1Arr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f19763a.mo21826c(C3397a.m26614c(this.f19764a, sQLiteDatabase));
            }
        }

        public C3397a(Context context, String str, qb1[] qb1Arr, o74.C3036a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f17869a, new C3398a(aVar, qb1Arr));
            this.f19760a = aVar;
            this.f19761a = qb1Arr;
        }

        /* renamed from: c */
        public static qb1 m26614c(qb1[] qb1Arr, SQLiteDatabase sQLiteDatabase) {
            qb1 qb1 = qb1Arr[0];
            if (qb1 == null || !qb1.mo23068a(sQLiteDatabase)) {
                qb1Arr[0] = new qb1(sQLiteDatabase);
            }
            return qb1Arr[0];
        }

        /* renamed from: a */
        public synchronized n74 mo23775a() {
            this.f19762b = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.f19762b) {
                close();
                return mo23775a();
            }
            return mo23776b(readableDatabase);
        }

        /* renamed from: b */
        public qb1 mo23776b(SQLiteDatabase sQLiteDatabase) {
            return m26614c(this.f19761a, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f19761a[0] = null;
        }

        /* renamed from: d */
        public synchronized n74 mo23778d() {
            this.f19762b = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f19762b) {
                close();
                return mo23778d();
            }
            return mo23776b(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f19760a.mo13197b(mo23776b(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f19760a.mo13198d(mo23776b(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19762b = true;
            this.f19760a.mo13199e(mo23776b(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f19762b) {
                this.f19760a.mo13200f(mo23776b(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19762b = true;
            this.f19760a.mo13201g(mo23776b(sQLiteDatabase), i, i2);
        }
    }

    public rb1(Context context, String str, o74.C3036a aVar) {
        this(context, str, aVar, false);
    }

    public rb1(Context context, String str, o74.C3036a aVar, boolean z) {
        this.f19753a = context;
        this.f19757b = str;
        this.f19754a = aVar;
        this.f19758b = z;
        this.f19756a = new Object();
    }

    /* renamed from: Z1 */
    public n74 mo13225Z1() {
        return mo23774a().mo23775a();
    }

    /* renamed from: a */
    public final C3397a mo23774a() {
        C3397a aVar;
        synchronized (this.f19756a) {
            if (this.f19755a == null) {
                qb1[] qb1Arr = new qb1[1];
                if (Build.VERSION.SDK_INT < 23 || this.f19757b == null || !this.f19758b) {
                    this.f19755a = new C3397a(this.f19753a, this.f19757b, qb1Arr, this.f19754a);
                } else {
                    this.f19755a = new C3397a(this.f19753a, new File(l74.C2698c.m20254a(this.f19753a), this.f19757b).getAbsolutePath(), qb1Arr, this.f19754a);
                }
                l74.C2696a.m20251h(this.f19755a, this.f19759c);
            }
            aVar = this.f19755a;
        }
        return aVar;
    }

    public void close() {
        mo23774a().close();
    }

    public String getDatabaseName() {
        return this.f19757b;
    }

    @sj3(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f19756a) {
            C3397a aVar = this.f19755a;
            if (aVar != null) {
                l74.C2696a.m20251h(aVar, z);
            }
            this.f19759c = z;
        }
    }

    /* renamed from: x */
    public n74 mo13235x() {
        return mo23774a().mo23778d();
    }
}
