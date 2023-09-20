package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;

public class cr4 {

    /* renamed from: a */
    public static String f27048a;

    /* renamed from: a */
    public static String m44235a() {
        return f27048a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44236b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0027 }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            goto L_0x0033
        L_0x0029:
            if (r8 == 0) goto L_0x003c
        L_0x002b:
            r8.close()
            goto L_0x003c
        L_0x002f:
            r9 = move-exception
            goto L_0x003f
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x003d }
            f27048a = r9     // Catch:{ all -> 0x003d }
            if (r8 == 0) goto L_0x003c
            goto L_0x002b
        L_0x003c:
            return r7
        L_0x003d:
            r9 = move-exception
            r7 = r8
        L_0x003f:
            if (r7 == 0) goto L_0x0044
            r7.close()
        L_0x0044:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cr4.m44236b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44237c(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r0 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0027 }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            goto L_0x0033
        L_0x0029:
            if (r8 == 0) goto L_0x003c
        L_0x002b:
            r8.close()
            goto L_0x003c
        L_0x002f:
            r9 = move-exception
            goto L_0x003f
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x003d }
            f27048a = r9     // Catch:{ all -> 0x003d }
            if (r8 == 0) goto L_0x003c
            goto L_0x002b
        L_0x003c:
            return r7
        L_0x003d:
            r9 = move-exception
            r7 = r8
        L_0x003f:
            if (r7 == 0) goto L_0x0044
            r7.close()
        L_0x0044:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cr4.m44237c(android.content.Context, android.net.Uri):java.lang.String");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m44238d(Context context, Uri uri) {
        StringBuilder sb;
        String str;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String str2 = "";
            if (m44242h(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                String[] split = documentId.split(ar4.f25981a);
                String str3 = split[0];
                if (!"primary".equalsIgnoreCase(str3)) {
                    if (new File("storage/" + documentId.replace(ar4.f25981a, "/")).exists()) {
                        return "/storage/" + documentId.replace(ar4.f25981a, "/");
                    }
                    for (String str4 : ro3.m63778f(context)) {
                        if (split[1].startsWith("/")) {
                            sb = new StringBuilder();
                            sb.append(str4);
                            str = split[1];
                        } else {
                            sb = new StringBuilder();
                            sb.append(str4);
                            sb.append("/");
                            str = split[1];
                        }
                        sb.append(str);
                        str2 = sb.toString();
                    }
                    if (str2.contains(str3)) {
                        return "storage/" + documentId.replace(ar4.f25981a, "/");
                    } else if (str2.startsWith("/storage/") || str2.startsWith("storage/")) {
                        return str2;
                    } else {
                        if (str2.startsWith("/")) {
                            return "/storage" + str2;
                        }
                        return "/storage/" + str2;
                    }
                } else if (split.length > 1) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                } else {
                    return Environment.getExternalStorageDirectory() + "/";
                }
            } else if (m44245k(uri)) {
                String c = m44237c(context, uri);
                String f = m44240f(uri);
                if (c != null) {
                    return Environment.getExternalStorageDirectory().toString() + "/Download/" + f + c;
                }
                return m44236b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
            } else if (m44241g(uri)) {
                String c2 = m44237c(context, uri);
                if (c2 != null) {
                    return Environment.getExternalStorageDirectory().toString() + "/Download/" + c2;
                }
                String documentId2 = DocumentsContract.getDocumentId(uri);
                if (documentId2.startsWith("raw:")) {
                    documentId2 = documentId2.replaceFirst("raw:", str2);
                    if (new File(documentId2).exists()) {
                        return documentId2;
                    }
                }
                if (documentId2.startsWith("raw%3A%2F")) {
                    documentId2 = documentId2.replaceFirst("raw%3A%2F", str2);
                    if (new File(documentId2).exists()) {
                        return documentId2;
                    }
                }
                return m44236b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId2).longValue()), (String) null, (String[]) null);
            } else if (m44244j(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(ar4.f25981a);
                String str5 = split2[0];
                if ("image".equals(str5)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str5)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str5)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return m44236b(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if (FirebaseAnalytics.C4305d.f24947P.equalsIgnoreCase(uri.getScheme())) {
            if (m44243i(uri)) {
                return uri.getLastPathSegment();
            }
            if (m44236b(context, uri, (String) null, (String[]) null) == null) {
                f27048a = "dataReturnedNull";
            }
            return m44236b(context, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    /* renamed from: e */
    public static String m44239e(Context context, Uri uri) {
        Cursor loadInBackground = new CursorLoader(context, uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null).loadInBackground();
        int columnIndexOrThrow = loadInBackground.getColumnIndexOrThrow("_data");
        loadInBackground.moveToFirst();
        String string = loadInBackground.getString(columnIndexOrThrow);
        loadInBackground.close();
        return string;
    }

    /* renamed from: f */
    public static String m44240f(Uri uri) {
        StringBuilder sb;
        String[] split = String.valueOf(uri).replace("%2F", "/").replace("%20", " ").replace("%3A", ar4.f25981a).split("/");
        String str = split[split.length - 2];
        String str2 = split[split.length - 3];
        String str3 = split[split.length - 4];
        String str4 = split[split.length - 5];
        if (split[split.length - 6].equals("Download")) {
            sb = new StringBuilder();
            sb.append(str4);
            sb.append("/");
        } else if (str4.equals("Download")) {
            sb = new StringBuilder();
        } else if (str3.equals("Download")) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            sb.append("/");
            return sb.toString();
        } else if (!str2.equals("Download")) {
            return "";
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            return sb.toString();
        }
        sb.append(str3);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m44241g(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: h */
    public static boolean m44242h(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: i */
    public static boolean m44243i(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: j */
    public static boolean m44244j(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: k */
    public static boolean m44245k(Uri uri) {
        return String.valueOf(uri).contains("com.android.providers.downloads.documents/document/raw");
    }
}
