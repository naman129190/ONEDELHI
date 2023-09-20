package com.onedelhi.secure;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.es2;

@VisibleForTesting
public final class c46 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ f46 f10106a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c46(f46 f46, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f10106a = f46;
    }

    @ly4
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f10106a.f11205a.mo15136e().mo12726r().mo25379a("Opening the local database failed, dropping and recreating it");
            this.f10106a.f11205a.mo27891z();
            if (!this.f10106a.f11205a.mo15137f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f10106a.f11205a.mo15136e().mo12726r().mo25380b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f10106a.f11205a.mo15136e().mo12726r().mo25380b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @ly4
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        dh5.m13126b(this.f10106a.f11205a.mo15136e(), sQLiteDatabase);
    }

    @ly4
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @ly4
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        dh5.m13125a(this.f10106a.f11205a.mo15136e(), sQLiteDatabase, es2.C2088h.f11569h, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @ly4
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
