package com.onedelhi.secure;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.util.Arrays;

@hl3({hl3.C2354a.f13188c})
public class bc0 {
    @mr2
    /* renamed from: a */
    public static Cursor m11789a(@mr2 Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    /* renamed from: b */
    public static int m11790b(@mr2 Cursor cursor, @mr2 String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return m11791c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    @hw4(otherwise = 2)
    /* renamed from: c */
    public static int m11791c(String[] strArr, String str) {
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i = 0; i < strArr.length; i++) {
            String str4 = strArr[i];
            if (str4.length() >= str.length() + 2) {
                if (str4.endsWith(str2)) {
                    return i;
                }
                if (str4.charAt(0) == '`' && str4.endsWith(str3)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m11792d(@mr2 Cursor cursor, @mr2 String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        return columnIndex2 >= 0 ? columnIndex2 : m11790b(cursor, str);
    }

    /* renamed from: e */
    public static int m11793e(@mr2 Cursor cursor, @mr2 String str) {
        String str2;
        int d = m11792d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
