package com.onedelhi.secure;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.onedelhi.secure.i62;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class ac0 extends C3044ob<Cursor> {

    /* renamed from: a */
    public Cursor f8985a;

    /* renamed from: a */
    public Uri f8986a;

    /* renamed from: a */
    public final i62<Cursor>.a f8987a = new i62.C2399a();

    /* renamed from: a */
    public C3345qu f8988a;

    /* renamed from: a */
    public String[] f8989a;

    /* renamed from: b */
    public String f8990b;

    /* renamed from: b */
    public String[] f8991b;

    /* renamed from: c */
    public String f8992c;

    public ac0(@mr2 Context context) {
        super(context);
    }

    public ac0(@mr2 Context context, @mr2 Uri uri, @ts2 String[] strArr, @ts2 String str, @ts2 String[] strArr2, @ts2 String str2) {
        super(context);
        this.f8986a = uri;
        this.f8989a = strArr;
        this.f8990b = str;
        this.f8991b = strArr2;
        this.f8992c = str2;
    }

    /* renamed from: D */
    public void mo12972D() {
        super.mo12972D();
        synchronized (this) {
            C3345qu quVar = this.f8988a;
            if (quVar != null) {
                quVar.mo23439a();
            }
        }
    }

    /* renamed from: N */
    public void mo12987f(Cursor cursor) {
        if (!mo17610l()) {
            Cursor cursor2 = this.f8985a;
            this.f8985a = cursor;
            if (mo17611m()) {
                super.mo12987f(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @ts2
    /* renamed from: O */
    public String[] mo12975O() {
        return this.f8989a;
    }

    @ts2
    /* renamed from: P */
    public String mo12976P() {
        return this.f8990b;
    }

    @ts2
    /* renamed from: Q */
    public String[] mo12977Q() {
        return this.f8991b;
    }

    @ts2
    /* renamed from: R */
    public String mo12978R() {
        return this.f8992c;
    }

    @mr2
    /* renamed from: S */
    public Uri mo12979S() {
        return this.f8986a;
    }

    /* renamed from: T */
    public Cursor mo12813I() {
        Cursor a;
        synchronized (this) {
            if (!mo21849H()) {
                this.f8988a = new C3345qu();
            } else {
                throw new fw2();
            }
        }
        try {
            a = k70.m19513a(mo17607i().getContentResolver(), this.f8986a, this.f8989a, this.f8990b, this.f8991b, this.f8992c, this.f8988a);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f8987a);
            }
            synchronized (this) {
                this.f8988a = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f8988a = null;
                throw th;
            }
        }
    }

    /* renamed from: U */
    public void mo12973J(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: V */
    public void mo12982V(@ts2 String[] strArr) {
        this.f8989a = strArr;
    }

    /* renamed from: W */
    public void mo12983W(@ts2 String str) {
        this.f8990b = str;
    }

    /* renamed from: X */
    public void mo12984X(@ts2 String[] strArr) {
        this.f8991b = strArr;
    }

    /* renamed from: Y */
    public void mo12985Y(@ts2 String str) {
        this.f8992c = str;
    }

    /* renamed from: Z */
    public void mo12986Z(@mr2 Uri uri) {
        this.f8986a = uri;
    }

    @Deprecated
    /* renamed from: g */
    public void mo12988g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo12988g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f8986a);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f8989a));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f8990b);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f8991b));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f8992c);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f8985a);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f13501d);
    }

    /* renamed from: r */
    public void mo12989r() {
        super.mo12989r();
        mo12990t();
        Cursor cursor = this.f8985a;
        if (cursor != null && !cursor.isClosed()) {
            this.f8985a.close();
        }
        this.f8985a = null;
    }

    /* renamed from: s */
    public void mo12814s() {
        Cursor cursor = this.f8985a;
        if (cursor != null) {
            mo12987f(cursor);
        }
        if (mo17598A() || this.f8985a == null) {
            mo17606h();
        }
    }

    /* renamed from: t */
    public void mo12990t() {
        mo17602b();
    }
}
