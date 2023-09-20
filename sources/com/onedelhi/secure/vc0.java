package com.onedelhi.secure;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.l74;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class vc0 {
    @ts2
    /* renamed from: a */
    public static CancellationSignal m29988a() {
        return l74.C2696a.m20245b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static void m29989b(n74 n74) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor g1 = n74.mo18327g1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (g1.moveToNext()) {
            try {
                arrayList.add(g1.getString(0));
            } catch (Throwable th) {
                g1.close();
                throw th;
            }
        }
        g1.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                n74.mo18303G("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: c */
    public static void m29990c(@mr2 n74 n74, @mr2 String str) {
        Cursor g1 = n74.mo18327g1("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (g1.getCount() > 0) {
                throw new IllegalStateException(m29991d(g1));
            }
        } finally {
            g1.close();
        }
    }

    /* renamed from: d */
    public static String m29991d(Cursor cursor) {
        int count = cursor.getCount();
        HashMap hashMap = new HashMap();
        String str = null;
        while (cursor.moveToNext()) {
            if (str == null) {
                str = cursor.getString(0);
            }
            String string = cursor.getString(3);
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, cursor.getString(2));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Foreign key violation(s) detected in '");
        sb.append(str);
        sb.append("'.\n");
        sb.append("Number of different violations discovered: ");
        sb.append(hashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append("\tParent Table = ");
            sb.append((String) entry.getValue());
            sb.append(", Foreign Key Constraint Index = ");
            sb.append((String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    @mr2
    @Deprecated
    /* renamed from: e */
    public static Cursor m29992e(ym3 ym3, q74 q74, boolean z) {
        return m29993f(ym3, q74, z, (CancellationSignal) null);
    }

    @mr2
    /* renamed from: f */
    public static Cursor m29993f(@mr2 ym3 ym3, @mr2 q74 q74, boolean z, @ts2 CancellationSignal cancellationSignal) {
        Cursor query = ym3.query(q74, cancellationSignal);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? bc0.m11789a(abstractWindowedCursor) : query;
    }

    /* renamed from: g */
    public static int m29994g(@mr2 File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                fileChannel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
