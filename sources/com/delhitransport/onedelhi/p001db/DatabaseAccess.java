package com.delhitransport.onedelhi.p001db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.db.DatabaseAccess */
public class DatabaseAccess {
    private static DatabaseAccess instance;
    private SQLiteDatabase database;
    private final SQLiteOpenHelper openHelper;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        DatabaseAccess databaseAccess;
        synchronized (DatabaseAccess.class) {
            if (instance == null) {
                instance = new DatabaseAccess(context);
            }
            databaseAccess = instance;
        }
        return databaseAccess;
    }

    public void close() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    public HashMap<String, Pair<String, String>> getAllRoutes() {
        ArrayList arrayList = new ArrayList();
        HashMap<String, Pair<String, String>> hashMap = new HashMap<>();
        Cursor rawQuery = this.database.rawQuery("SELECT * FROM routes", (String[]) null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            hashMap.put(rawQuery.getString(3), new Pair(rawQuery.getString(4), rawQuery.getString(1)));
            arrayList.add(new Pair(rawQuery.getString(3), rawQuery.getString(1)));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return hashMap;
    }

    public List<String> getAllRoutesLongName() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.database.rawQuery("SELECT long_name FROM routes", (String[]) null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(rawQuery.getString(0));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    public List<String> getDetails(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.database;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM route_details where route_long_name = \"" + str + "\" and agency = \"" + str2 + "\"", (String[]) null);
        while (true) {
            rawQuery.moveToNext();
            if (!rawQuery.isAfterLast()) {
                arrayList.add(rawQuery.getString(1));
            } else {
                rawQuery.close();
                return arrayList;
            }
        }
    }

    public HashMap<String, Pair<String, String>> getRoutes(String str) {
        ArrayList arrayList = new ArrayList();
        HashMap<String, Pair<String, String>> hashMap = new HashMap<>();
        SQLiteDatabase sQLiteDatabase = this.database;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM routes where agency = \"" + str + "\"", (String[]) null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            hashMap.put(rawQuery.getString(3), new Pair(rawQuery.getString(4), rawQuery.getString(1)));
            arrayList.add(new Pair(rawQuery.getString(3), rawQuery.getString(1)));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return hashMap;
    }

    public void open() {
        try {
            this.database = this.openHelper.getReadableDatabase();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
