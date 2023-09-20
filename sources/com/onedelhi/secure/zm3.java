package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class zm3 {

    /* renamed from: a */
    public static final String f23818a = "room_master_table";

    /* renamed from: b */
    public static final String f23819b = "room_master_table";

    /* renamed from: c */
    public static final String f23820c = "id";

    /* renamed from: d */
    public static final String f23821d = "identity_hash";

    /* renamed from: e */
    public static final String f23822e = "42";

    /* renamed from: f */
    public static final String f23823f = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* renamed from: g */
    public static final String f23824g = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    /* renamed from: a */
    public static String m33250a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
