package com.onedelhi.secure;

import android.database.sqlite.SQLiteProgram;

public class tb1 implements p74 {

    /* renamed from: a */
    public final SQLiteProgram f20727a;

    public tb1(SQLiteProgram sQLiteProgram) {
        this.f20727a = sQLiteProgram;
    }

    /* renamed from: B2 */
    public void mo13596B2(int i, long j) {
        this.f20727a.bindLong(i, j);
    }

    /* renamed from: I2 */
    public void mo13598I2() {
        this.f20727a.clearBindings();
    }

    /* renamed from: J0 */
    public void mo13599J0(int i) {
        this.f20727a.bindNull(i);
    }

    /* renamed from: P1 */
    public void mo13600P1(int i, double d) {
        this.f20727a.bindDouble(i, d);
    }

    public void close() {
        this.f20727a.close();
    }

    /* renamed from: m2 */
    public void mo13605m2(int i, String str) {
        this.f20727a.bindString(i, str);
    }

    /* renamed from: w */
    public void mo13606w(int i, byte[] bArr) {
        this.f20727a.bindBlob(i, bArr);
    }
}
