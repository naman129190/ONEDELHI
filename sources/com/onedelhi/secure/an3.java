package com.onedelhi.secure;

import android.database.Cursor;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.o74;
import java.util.List;

@hl3({hl3.C2354a.f13188c})
public class an3 extends o74.C3036a {
    @ts2

    /* renamed from: a */
    public ae0 f9422a;
    @mr2

    /* renamed from: a */
    public final C1723a f9423a;
    @mr2

    /* renamed from: b */
    public final String f9424b;
    @mr2

    /* renamed from: c */
    public final String f9425c;

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: com.onedelhi.secure.an3$a */
    public static abstract class C1723a {
        public final int version;

        public C1723a(int i) {
            this.version = i;
        }

        public abstract void createAllTables(n74 n74);

        public abstract void dropAllTables(n74 n74);

        public abstract void onCreate(n74 n74);

        public abstract void onOpen(n74 n74);

        public void onPostMigrate(n74 n74) {
        }

        public void onPreMigrate(n74 n74) {
        }

        @mr2
        public C1724b onValidateSchema(@mr2 n74 n74) {
            validateMigration(n74);
            return new C1724b(true, (String) null);
        }

        @Deprecated
        public void validateMigration(n74 n74) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: com.onedelhi.secure.an3$b */
    public static class C1724b {
        @ts2

        /* renamed from: a */
        public final String f9426a;

        /* renamed from: a */
        public final boolean f9427a;

        public C1724b(boolean z, @ts2 String str) {
            this.f9427a = z;
            this.f9426a = str;
        }
    }

    public an3(@mr2 ae0 ae0, @mr2 C1723a aVar, @mr2 String str) {
        this(ae0, aVar, "", str);
    }

    public an3(@mr2 ae0 ae0, @mr2 C1723a aVar, @mr2 String str, @mr2 String str2) {
        super(aVar.version);
        this.f9422a = ae0;
        this.f9423a = aVar;
        this.f9424b = str;
        this.f9425c = str2;
    }

    /* renamed from: j */
    public static boolean m11310j(n74 n74) {
        Cursor g1 = n74.mo18327g1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (g1.moveToFirst() && g1.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            g1.close();
        }
    }

    /* renamed from: k */
    public static boolean m11311k(n74 n74) {
        Cursor g1 = n74.mo18327g1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (g1.moveToFirst() && g1.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            g1.close();
        }
    }

    /* renamed from: b */
    public void mo13197b(n74 n74) {
        super.mo13197b(n74);
    }

    /* renamed from: d */
    public void mo13198d(n74 n74) {
        boolean j = m11310j(n74);
        this.f9423a.createAllTables(n74);
        if (!j) {
            C1724b onValidateSchema = this.f9423a.onValidateSchema(n74);
            if (!onValidateSchema.f9427a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f9426a);
            }
        }
        mo13204l(n74);
        this.f9423a.onCreate(n74);
    }

    /* renamed from: e */
    public void mo13199e(n74 n74, int i, int i2) {
        mo13201g(n74, i, i2);
    }

    /* renamed from: f */
    public void mo13200f(n74 n74) {
        super.mo13200f(n74);
        mo13202h(n74);
        this.f9423a.onOpen(n74);
        this.f9422a = null;
    }

    /* renamed from: g */
    public void mo13201g(n74 n74, int i, int i2) {
        boolean z;
        List<fj2> d;
        ae0 ae0 = this.f9422a;
        if (ae0 == null || (d = ae0.f9018a.mo27641d(i, i2)) == null) {
            z = false;
        } else {
            this.f9423a.onPreMigrate(n74);
            for (fj2 migrate : d) {
                migrate.migrate(n74);
            }
            C1724b onValidateSchema = this.f9423a.onValidateSchema(n74);
            if (onValidateSchema.f9427a) {
                this.f9423a.onPostMigrate(n74);
                mo13204l(n74);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f9426a);
            }
        }
        if (!z) {
            ae0 ae02 = this.f9422a;
            if (ae02 == null || ae02.mo13012a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f9423a.dropAllTables(n74);
            this.f9423a.createAllTables(n74);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo13202h(n74 n74) {
        if (m11311k(n74)) {
            String str = null;
            Cursor d0 = n74.mo18323d0(new cz3(zm3.f23824g));
            try {
                if (d0.moveToFirst()) {
                    str = d0.getString(0);
                }
                d0.close();
                if (!this.f9424b.equals(str) && !this.f9425c.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                d0.close();
                throw th;
            }
        } else {
            C1724b onValidateSchema = this.f9423a.onValidateSchema(n74);
            if (onValidateSchema.f9427a) {
                this.f9423a.onPostMigrate(n74);
                mo13204l(n74);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f9426a);
        }
    }

    /* renamed from: i */
    public final void mo13203i(n74 n74) {
        n74.mo18303G(zm3.f23823f);
    }

    /* renamed from: l */
    public final void mo13204l(n74 n74) {
        mo13203i(n74);
        n74.mo18303G(zm3.m33250a(this.f9424b));
    }
}
