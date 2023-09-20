package com.onedelhi.secure;

import android.database.sqlite.SQLiteStatement;

public class ub1 extends tb1 implements s74 {

    /* renamed from: a */
    public final SQLiteStatement f21314a;

    public ub1(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f21314a = sQLiteStatement;
    }

    /* renamed from: A2 */
    public long mo13595A2() {
        return this.f21314a.simpleQueryForLong();
    }

    /* renamed from: F2 */
    public long mo13597F2() {
        return this.f21314a.executeInsert();
    }

    /* renamed from: a1 */
    public int mo13601a1() {
        return this.f21314a.executeUpdateDelete();
    }

    /* renamed from: i0 */
    public String mo13603i0() {
        return this.f21314a.simpleQueryForString();
    }

    /* renamed from: m1 */
    public void mo13604m1() {
        this.f21314a.execute();
    }
}
