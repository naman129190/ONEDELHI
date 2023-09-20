package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

@sj3(19)
public class ao0 {

    /* renamed from: a */
    public static final int f9429a = 512;

    /* renamed from: a */
    public static final String f9430a = "DocumentFile";

    /* renamed from: a */
    public static boolean m11321a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m11327g(context, uri));
    }

    /* renamed from: b */
    public static boolean m11322b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g = m11327g(context, uri);
        int n = m11334n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        if ((n & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g) || (n & 8) == 0) {
            return !TextUtils.isEmpty(g) && (n & 2) != 0;
        }
        return true;
    }

    /* renamed from: c */
    public static void m11323c(@ts2 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m11324d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            m11323c(cursor);
        }
    }

    /* renamed from: e */
    public static long m11325e(Context context, Uri uri) {
        return m11335o(context, uri, "flags", 0);
    }

    @ts2
    /* renamed from: f */
    public static String m11326f(Context context, Uri uri) {
        return m11336p(context, uri, "_display_name", (String) null);
    }

    @ts2
    /* renamed from: g */
    public static String m11327g(Context context, Uri uri) {
        return m11336p(context, uri, "mime_type", (String) null);
    }

    @ts2
    /* renamed from: h */
    public static String m11328h(Context context, Uri uri) {
        String g = m11327g(context, uri);
        if ("vnd.android.document/directory".equals(g)) {
            return null;
        }
        return g;
    }

    /* renamed from: i */
    public static boolean m11329i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m11327g(context, uri));
    }

    /* renamed from: j */
    public static boolean m11330j(Context context, Uri uri) {
        String g = m11327g(context, uri);
        return !"vnd.android.document/directory".equals(g) && !TextUtils.isEmpty(g);
    }

    /* renamed from: k */
    public static boolean m11331k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (m11325e(context, uri) & 512) != 0;
    }

    /* renamed from: l */
    public static long m11332l(Context context, Uri uri) {
        return m11335o(context, uri, "last_modified", 0);
    }

    /* renamed from: m */
    public static long m11333m(Context context, Uri uri) {
        return m11335o(context, uri, "_size", 0);
    }

    /* renamed from: n */
    public static int m11334n(Context context, Uri uri, String str, int i) {
        return (int) m11335o(context, uri, str, (long) i);
    }

    /* renamed from: o */
    public static long m11335o(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            m11323c(cursor);
            return j;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            m11323c(cursor);
        }
    }

    @ts2
    /* renamed from: p */
    public static String m11336p(Context context, Uri uri, String str, @ts2 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            m11323c(cursor);
            return str2;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            m11323c(cursor);
        }
    }
}
