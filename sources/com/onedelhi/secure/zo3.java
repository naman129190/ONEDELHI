package com.onedelhi.secure;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class zo3 extends SQLiteOpenHelper {
    private static final String ASSET_DB_PATH = "databases";
    private static final String TAG = zo3.class.getSimpleName();
    private String mAssetPath;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private String mDatabasePath;
    private final SQLiteDatabase.CursorFactory mFactory;
    private int mForcedUpgradeVersion;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;
    private String mUpgradePathFormat;

    /* renamed from: com.onedelhi.secure.zo3$a */
    public static class C7510a extends SQLiteException {
        public C7510a() {
        }

        public C7510a(String str) {
            super(str);
        }
    }

    public zo3(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, (String) null, cursorFactory, i);
    }

    public zo3(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.mDatabase = null;
        this.mIsInitializing = false;
        this.mForcedUpgradeVersion = 0;
        if (i < 1) {
            throw new IllegalArgumentException("Version must be >= 1, was " + i);
        } else if (str != null) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mAssetPath = "databases/" + str;
            if (str2 != null) {
                this.mDatabasePath = str2;
            } else {
                this.mDatabasePath = context.getApplicationInfo().dataDir + "/databases";
            }
            this.mUpgradePathFormat = "databases/" + str + "_upgrade_%s-%s.sql";
        } else {
            throw new IllegalArgumentException("Database name cannot be null");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
        r1 = new com.onedelhi.secure.zo3.C7510a("Missing " + r7.mAssetPath + " file (or .zip, .gz archive) in assets, or target folder not writable");
        r1.setStackTrace(r0.getStackTrace());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = r7.mContext.getAssets().open(r0 + ".zip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = r7.mContext.getAssets().open(r0 + ".gz");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48409a() throws com.onedelhi.secure.zo3.C7510a {
        /*
            r7 = this;
            java.lang.String r0 = TAG
            java.lang.String r1 = "copying database from assets..."
            android.util.Log.w(r0, r1)
            java.lang.String r0 = r7.mAssetPath
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.mDatabasePath
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r3 = r7.mName
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 0
            android.content.Context r4 = r7.mContext     // Catch:{ IOException -> 0x002d }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x002d }
            java.io.InputStream r0 = r4.open(r0)     // Catch:{ IOException -> 0x002d }
            goto L_0x0065
        L_0x002d:
            android.content.Context r4 = r7.mContext     // Catch:{ IOException -> 0x004a }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x004a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004a }
            r5.<init>()     // Catch:{ IOException -> 0x004a }
            r5.append(r0)     // Catch:{ IOException -> 0x004a }
            java.lang.String r6 = ".zip"
            r5.append(r6)     // Catch:{ IOException -> 0x004a }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x004a }
            java.io.InputStream r0 = r4.open(r5)     // Catch:{ IOException -> 0x004a }
            r3 = 1
            goto L_0x0065
        L_0x004a:
            android.content.Context r4 = r7.mContext     // Catch:{ IOException -> 0x00cf }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x00cf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cf }
            r5.<init>()     // Catch:{ IOException -> 0x00cf }
            r5.append(r0)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = ".gz"
            r5.append(r0)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x00cf }
            java.io.InputStream r0 = r4.open(r0)     // Catch:{ IOException -> 0x00cf }
        L_0x0065:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab }
            r5.<init>()     // Catch:{ IOException -> 0x00ab }
            java.lang.String r6 = r7.mDatabasePath     // Catch:{ IOException -> 0x00ab }
            r5.append(r6)     // Catch:{ IOException -> 0x00ab }
            r5.append(r2)     // Catch:{ IOException -> 0x00ab }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x00ab }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00ab }
            boolean r2 = r4.exists()     // Catch:{ IOException -> 0x00ab }
            if (r2 != 0) goto L_0x0084
            r4.mkdir()     // Catch:{ IOException -> 0x00ab }
        L_0x0084:
            if (r3 == 0) goto L_0x009d
            java.util.zip.ZipInputStream r0 = com.onedelhi.secure.dr4.m45522b(r0)     // Catch:{ IOException -> 0x00ab }
            if (r0 == 0) goto L_0x0095
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ab }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00ab }
        L_0x0091:
            com.onedelhi.secure.dr4.m45524d(r0, r2)     // Catch:{ IOException -> 0x00ab }
            goto L_0x00a3
        L_0x0095:
            com.onedelhi.secure.zo3$a r0 = new com.onedelhi.secure.zo3$a     // Catch:{ IOException -> 0x00ab }
            java.lang.String r2 = "Archive is missing a SQLite database file"
            r0.<init>(r2)     // Catch:{ IOException -> 0x00ab }
            throw r0     // Catch:{ IOException -> 0x00ab }
        L_0x009d:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ab }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00ab }
            goto L_0x0091
        L_0x00a3:
            java.lang.String r0 = TAG     // Catch:{ IOException -> 0x00ab }
            java.lang.String r2 = "database copy complete"
            android.util.Log.w(r0, r2)     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            com.onedelhi.secure.zo3$a r2 = new com.onedelhi.secure.zo3$a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to write "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " to data directory"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r2.setStackTrace(r0)
            throw r2
        L_0x00cf:
            r0 = move-exception
            com.onedelhi.secure.zo3$a r1 = new com.onedelhi.secure.zo3$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Missing "
            r2.append(r3)
            java.lang.String r3 = r7.mAssetPath
            r2.append(r3)
            java.lang.String r3 = " file (or .zip, .gz archive) in assets, or target folder not writable"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1.setStackTrace(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zo3.mo48409a():void");
    }

    /* renamed from: b */
    public final SQLiteDatabase mo48410b(boolean z) throws C7510a {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mDatabasePath);
        sb.append("/");
        sb.append(this.mName);
        SQLiteDatabase g = new File(sb.toString()).exists() ? mo48414g() : null;
        if (g == null) {
            mo48409a();
            return mo48414g();
        } else if (!z) {
            return g;
        } else {
            Log.w(TAG, "forcing database upgrade!");
            mo48409a();
            return mo48414g();
        }
    }

    /* renamed from: c */
    public final void mo48411c(int i, int i2, int i3, ArrayList<String> arrayList) {
        int i4;
        if (mo48413d(i2, i3) != null) {
            arrayList.add(String.format(this.mUpgradePathFormat, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
            i4 = i2 - 1;
        } else {
            int i5 = i3;
            i4 = i2 - 1;
            i2 = i5;
        }
        if (i4 >= i) {
            mo48411c(i, i4, i2, arrayList);
        }
    }

    public synchronized void close() {
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    /* renamed from: d */
    public final InputStream mo48413d(int i, int i2) {
        String format = String.format(this.mUpgradePathFormat, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        try {
            return this.mContext.getAssets().open(format);
        } catch (IOException unused) {
            String str = TAG;
            Log.w(str, "missing database upgrade script: " + format);
            return null;
        }
    }

    /* renamed from: g */
    public final SQLiteDatabase mo48414g() {
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(this.mDatabasePath + "/" + this.mName, this.mFactory, 0);
            String str = TAG;
            Log.i(str, "successfully opened database " + this.mName);
            return openDatabase;
        } catch (SQLiteException e) {
            String str2 = TAG;
            Log.w(str2, "could not open database " + this.mName + " - " + e.getMessage());
            return null;
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
            return this.mDatabase;
        } else if (!this.mIsInitializing) {
            try {
                return getWritableDatabase();
            } catch (SQLiteException e) {
                if (this.mName != null) {
                    String str = TAG;
                    Log.e(str, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                    sQLiteDatabase = null;
                    this.mIsInitializing = true;
                    String path = this.mContext.getDatabasePath(this.mName).getPath();
                    sQLiteDatabase = SQLiteDatabase.openDatabase(path, this.mFactory, 1);
                    if (sQLiteDatabase.getVersion() == this.mNewVersion) {
                        onOpen(sQLiteDatabase);
                        Log.w(str, "Opened " + this.mName + " in read-only mode");
                        this.mDatabase = sQLiteDatabase;
                        this.mIsInitializing = false;
                        return sQLiteDatabase;
                    }
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                throw e;
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.mDatabase)) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.mDatabase     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0017
            android.database.sqlite.SQLiteDatabase r0 = r6.mDatabase     // Catch:{ all -> 0x00af }
            boolean r0 = r0.isReadOnly()     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x0017
            android.database.sqlite.SQLiteDatabase r0 = r6.mDatabase     // Catch:{ all -> 0x00af }
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r0 = r6.mIsInitializing     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x00a7
            r0 = 0
            r1 = 1
            r2 = 0
            r6.mIsInitializing = r1     // Catch:{ all -> 0x009e }
            android.database.sqlite.SQLiteDatabase r0 = r6.mo48410b(r2)     // Catch:{ all -> 0x009e }
            int r3 = r0.getVersion()     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x003b
            int r4 = r6.mForcedUpgradeVersion     // Catch:{ all -> 0x009e }
            if (r3 >= r4) goto L_0x003b
            android.database.sqlite.SQLiteDatabase r0 = r6.mo48410b(r1)     // Catch:{ all -> 0x009e }
            int r1 = r6.mNewVersion     // Catch:{ all -> 0x009e }
            r0.setVersion(r1)     // Catch:{ all -> 0x009e }
            int r3 = r0.getVersion()     // Catch:{ all -> 0x009e }
        L_0x003b:
            int r1 = r6.mNewVersion     // Catch:{ all -> 0x009e }
            if (r3 == r1) goto L_0x008e
            r0.beginTransaction()     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x0048
            r6.onCreate(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x007d
        L_0x0048:
            int r1 = r6.mNewVersion     // Catch:{ all -> 0x0089 }
            if (r3 <= r1) goto L_0x0078
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r4.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = "Can't downgrade read-only database from version "
            r4.append(r5)     // Catch:{ all -> 0x0089 }
            r4.append(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x0089 }
            int r5 = r6.mNewVersion     // Catch:{ all -> 0x0089 }
            r4.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = r0.getPath()     // Catch:{ all -> 0x0089 }
            r4.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0089 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0089 }
        L_0x0078:
            int r1 = r6.mNewVersion     // Catch:{ all -> 0x0089 }
            r6.onUpgrade(r0, r3, r1)     // Catch:{ all -> 0x0089 }
        L_0x007d:
            int r1 = r6.mNewVersion     // Catch:{ all -> 0x0089 }
            r0.setVersion(r1)     // Catch:{ all -> 0x0089 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0089 }
            r0.endTransaction()     // Catch:{ all -> 0x009e }
            goto L_0x008e
        L_0x0089:
            r1 = move-exception
            r0.endTransaction()     // Catch:{ all -> 0x009e }
            throw r1     // Catch:{ all -> 0x009e }
        L_0x008e:
            r6.onOpen(r0)     // Catch:{ all -> 0x009e }
            r6.mIsInitializing = r2     // Catch:{ all -> 0x00af }
            android.database.sqlite.SQLiteDatabase r1 = r6.mDatabase     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            r6.mDatabase = r0     // Catch:{ all -> 0x00af }
            monitor-exit(r6)
            return r0
        L_0x009e:
            r1 = move-exception
            r6.mIsInitializing = r2     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00a6
            r0.close()     // Catch:{ all -> 0x00af }
        L_0x00a6:
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "getWritableDatabase called recursively"
            r0.<init>(r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zo3.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = TAG;
        Log.w(str, "Upgrading database " + this.mName + " from version " + i + " to " + i2 + "...");
        ArrayList arrayList = new ArrayList();
        mo48411c(i, i2 + -1, i2, arrayList);
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new us4());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                try {
                    String str3 = TAG;
                    Log.w(str3, "processing upgrade: " + str2);
                    String a = dr4.m45521a(this.mContext.getAssets().open(str2));
                    if (a != null) {
                        for (String next : dr4.m45523c(a, ';')) {
                            if (next.trim().length() > 0) {
                                sQLiteDatabase.execSQL(next);
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            String str4 = TAG;
            Log.w(str4, "Successfully upgraded database " + this.mName + " from version " + i + " to " + i2);
            return;
        }
        Log.e(str, "no upgrade script path from " + i + " to " + i2);
        throw new C7510a("no upgrade script path from " + i + " to " + i2);
    }

    public void setForcedUpgrade() {
        setForcedUpgrade(this.mNewVersion);
    }

    public void setForcedUpgrade(int i) {
        this.mForcedUpgradeVersion = i;
    }

    @Deprecated
    public void setForcedUpgradeVersion(int i) {
        setForcedUpgrade(i);
    }
}
