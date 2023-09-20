package com.delhitransport.onedelhi.p001db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.zo3;

/* renamed from: com.delhitransport.onedelhi.db.DatabaseOpenHelper */
class DatabaseOpenHelper extends zo3 {
    private static final String DATABASE_NAME = pj0.m61166a(-92469658228551L);
    private static final int DATABASE_VERSION = 2;

    public DatabaseOpenHelper(Context context) {
        super(context, pj0.m61166a(-92409528686407L), (SQLiteDatabase.CursorFactory) null, 2);
        setForcedUpgrade();
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 != i) {
            setForcedUpgrade();
            super.onUpgrade(sQLiteDatabase, i, i2);
        }
    }
}
