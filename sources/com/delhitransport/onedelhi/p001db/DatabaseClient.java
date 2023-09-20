package com.delhitransport.onedelhi.p001db;

import android.content.Context;
import com.onedelhi.secure.fj2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n74;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.vm3;

/* renamed from: com.delhitransport.onedelhi.db.DatabaseClient */
public class DatabaseClient {
    public static final fj2 MIGRATION_1_2 = new fj2(1, 2) {
        public void migrate(n74 n74) {
            n74.mo18303G(pj0.m61166a(-91494700652359L));
            n74.mo18303G(pj0.m61166a(-92022981629767L));
        }
    };
    public static final fj2 MIGRATION_2_3 = new fj2(2, 3) {
        public void migrate(n74 n74) {
            n74.mo18303G(pj0.m61166a(-91048024053575L));
            n74.mo18303G(pj0.m61166a(-91267067385671L));
        }
    };
    public static final fj2 MIGRATION_3_4 = new fj2(3, 4) {
        public void migrate(@mr2 n74 n74) {
            n74.mo18303G(pj0.m61166a(-89716584191815L));
            n74.mo18303G(pj0.m61166a(-90369419220807L));
        }
    };
    public static final fj2 MIGRATION_5_6 = new fj2(5, 6) {
        public void migrate(@mr2 n74 n74) {
            n74.mo18303G(pj0.m61166a(-87809618712391L));
            n74.mo18303G(pj0.m61166a(-88531173218119L));
        }
    };
    public static final fj2 Migration_4_5 = new fj2(4, 5) {
        public void migrate(@mr2 n74 n74) {
            n74.mo18303G(pj0.m61166a(-89364396873543L));
        }
    };
    private static DatabaseClient databaseClient;
    private final AppDatabase appDatabase;

    private DatabaseClient(Context context) {
        this.appDatabase = vm3.m30227a(context, AppDatabase.class, pj0.m61166a(-92370873980743L)).mo27613c(MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, Migration_4_5, MIGRATION_5_6).mo27616f();
    }

    public static synchronized DatabaseClient getInstance(Context context) {
        DatabaseClient databaseClient2;
        synchronized (DatabaseClient.class) {
            if (databaseClient == null) {
                databaseClient = new DatabaseClient(context);
            }
            databaseClient2 = databaseClient;
        }
        return databaseClient2;
    }

    public AppDatabase getAppDatabase() {
        return this.appDatabase;
    }
}
