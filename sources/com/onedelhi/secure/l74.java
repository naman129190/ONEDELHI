package com.onedelhi.secure;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.onedelhi.secure.hl3;
import java.io.File;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class l74 {

    @sj3(16)
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.l74$a */
    public static final class C2696a {
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static void m20244a(@mr2 CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: b */
        public static CancellationSignal m20245b() {
            return new CancellationSignal();
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: c */
        public static boolean m20246c(@mr2 File file) {
            return SQLiteDatabase.deleteDatabase(file);
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: d */
        public static void m20247d(@mr2 SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: e */
        public static boolean m20248e(@mr2 SQLiteDatabase sQLiteDatabase) {
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: f */
        public static Cursor m20249f(@mr2 SQLiteDatabase sQLiteDatabase, @mr2 String str, @mr2 String[] strArr, @mr2 String str2, @mr2 CancellationSignal cancellationSignal, @mr2 SQLiteDatabase.CursorFactory cursorFactory) {
            return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: g */
        public static void m20250g(@mr2 SQLiteDatabase sQLiteDatabase, boolean z) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: h */
        public static void m20251h(@mr2 SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    @sj3(19)
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.l74$b */
    public static final class C2697b {
        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static Uri m20252a(@mr2 Cursor cursor) {
            return cursor.getNotificationUri();
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: b */
        public static boolean m20253b(@mr2 ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }
    }

    @sj3(21)
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.l74$c */
    public static final class C2698c {
        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static File m20254a(@mr2 Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @sj3(23)
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.l74$d */
    public static final class C2699d {
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static void m20255a(@mr2 Cursor cursor, @mr2 Bundle bundle) {
            cursor.setExtras(bundle);
        }
    }

    @sj3(29)
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.l74$e */
    public static final class C2700e {
        @mr2
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static List<Uri> m20256a(@mr2 Cursor cursor) {
            return cursor.getNotificationUris();
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: b */
        public static void m20257b(@mr2 Cursor cursor, @mr2 ContentResolver contentResolver, @mr2 List<Uri> list) {
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}
