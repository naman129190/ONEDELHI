package com.onedelhi.secure;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class es3 extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final C2102a f11667a;

    /* renamed from: a */
    public static final List<C2102a> f11668a;

    /* renamed from: b */
    public static final C2102a f11669b;

    /* renamed from: b */
    public static final String f11670b = "com.google.android.datatransport.events";

    /* renamed from: c */
    public static final C2102a f11671c;

    /* renamed from: c */
    public static final String f11672c = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* renamed from: d */
    public static final C2102a f11673d;

    /* renamed from: d */
    public static final String f11674d = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* renamed from: e */
    public static final C2102a f11675e;

    /* renamed from: e */
    public static final String f11676e = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* renamed from: f */
    public static final String f11677f = "CREATE INDEX events_backend_id on events(context_id)";

    /* renamed from: g */
    public static final String f11678g = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* renamed from: h */
    public static final String f11679h = "DROP TABLE events";

    /* renamed from: i */
    public static final String f11680i = "DROP TABLE event_metadata";

    /* renamed from: j */
    public static final String f11681j = "DROP TABLE transport_contexts";

    /* renamed from: k */
    public static final String f11682k = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* renamed from: l */
    public static final String f11683l = "DROP TABLE IF EXISTS event_payloads";

    /* renamed from: m */
    public static final String f11684m = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* renamed from: n */
    public static final String f11685n = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* renamed from: o */
    public static int f11686o = 5;

    /* renamed from: o */
    public static final String f11687o = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + pl2.f33727d);

    /* renamed from: p */
    public static final String f11688p = "DROP TABLE IF EXISTS log_event_dropped";

    /* renamed from: q */
    public static final String f11689q = "DROP TABLE IF EXISTS global_log_event_state";

    /* renamed from: b */
    public boolean f11690b = false;

    /* renamed from: n */
    public final int f11691n;

    /* renamed from: com.onedelhi.secure.es3$a */
    public interface C2102a {
        /* renamed from: a */
        void mo15563a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        cs3 cs3 = cs3.f27052a;
        f11667a = cs3;
        zr3 zr3 = zr3.f38414a;
        f11669b = zr3;
        as3 as3 = as3.f25989a;
        f11671c = as3;
        bs3 bs3 = bs3.f26528a;
        f11673d = bs3;
        ds3 ds3 = ds3.f27608a;
        f11675e = ds3;
        f11668a = Arrays.asList(new C2102a[]{cs3, zr3, as3, bs3, ds3});
    }

    @qq1
    public es3(Context context, @en2("SQLITE_DB_NAME") String str, @en2("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f11691n = i;
    }

    /* renamed from: A */
    public static /* synthetic */ void m14319A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f11688p);
        sQLiteDatabase.execSQL(f11689q);
        sQLiteDatabase.execSQL(f11684m);
        sQLiteDatabase.execSQL(f11685n);
        sQLiteDatabase.execSQL(f11687o);
    }

    /* renamed from: l */
    public static /* synthetic */ void m14325l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f11672c);
        sQLiteDatabase.execSQL(f11674d);
        sQLiteDatabase.execSQL(f11676e);
        sQLiteDatabase.execSQL(f11677f);
        sQLiteDatabase.execSQL(f11678g);
    }

    /* renamed from: m */
    public static /* synthetic */ void m14326m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: q */
    public static /* synthetic */ void m14328q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f11683l);
        sQLiteDatabase.execSQL(f11682k);
    }

    /* renamed from: E */
    public final void mo15555E(SQLiteDatabase sQLiteDatabase, int i) {
        mo15557h(sQLiteDatabase);
        mo15556H(sQLiteDatabase, 0, i);
    }

    /* renamed from: H */
    public final void mo15556H(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C2102a> list = f11668a;
        if (i2 <= list.size()) {
            while (i < i2) {
                f11668a.get(i).mo15563a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: h */
    public final void mo15557h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f11690b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f11690b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        mo15555E(sQLiteDatabase, this.f11691n);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(f11679h);
        sQLiteDatabase.execSQL(f11680i);
        sQLiteDatabase.execSQL(f11681j);
        sQLiteDatabase.execSQL(f11683l);
        sQLiteDatabase.execSQL(f11688p);
        sQLiteDatabase.execSQL(f11689q);
        mo15555E(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        mo15557h(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo15557h(sQLiteDatabase);
        mo15556H(sQLiteDatabase, i, i2);
    }
}
