package com.onedelhi.secure;

import android.database.sqlite.SQLiteDatabase;
import com.onedelhi.secure.es3;

public final /* synthetic */ class as3 implements es3.C2102a {

    /* renamed from: a */
    public static final /* synthetic */ as3 f25989a = new as3();

    /* renamed from: a */
    public final void mo15563a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
