package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
import java.util.List;

public final class bo0 {

    /* renamed from: a */
    public static final String f9913a = "tree";

    /* renamed from: com.onedelhi.secure.bo0$a */
    public static final class C1797a {

        /* renamed from: a */
        public static final int f9914a = 512;
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.bo0$b */
    public static class C1798b {
        @pn0
        /* renamed from: a */
        public static Uri m12004a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @pn0
        /* renamed from: b */
        public static boolean m12005b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @pn0
        /* renamed from: c */
        public static String m12006c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @pn0
        /* renamed from: d */
        public static boolean m12007d(Context context, @ts2 Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.bo0$c */
    public static class C1799c {
        @pn0
        /* renamed from: a */
        public static Uri m12008a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @pn0
        /* renamed from: b */
        public static Uri m12009b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @pn0
        /* renamed from: c */
        public static Uri m12010c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @pn0
        /* renamed from: d */
        public static Uri m12011d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @pn0
        /* renamed from: e */
        public static Uri m12012e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @pn0
        /* renamed from: f */
        public static String m12013f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @pn0
        /* renamed from: g */
        public static Uri m12014g(@mr2 ContentResolver contentResolver, @mr2 Uri uri, @mr2 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.bo0$d */
    public static class C1800d {
        @pn0
        /* renamed from: a */
        public static boolean m12015a(@mr2 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @pn0
        /* renamed from: b */
        public static boolean m12016b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @ts2
    /* renamed from: a */
    public static Uri m11992a(@mr2 String str, @ts2 String str2) {
        return C1799c.m12008a(str, str2);
    }

    @ts2
    /* renamed from: b */
    public static Uri m11993b(@mr2 Uri uri, @mr2 String str) {
        return C1799c.m12009b(uri, str);
    }

    @ts2
    /* renamed from: c */
    public static Uri m11994c(@mr2 String str, @mr2 String str2) {
        return C1798b.m12004a(str, str2);
    }

    @ts2
    /* renamed from: d */
    public static Uri m11995d(@mr2 Uri uri, @mr2 String str) {
        return C1799c.m12010c(uri, str);
    }

    @ts2
    /* renamed from: e */
    public static Uri m11996e(@mr2 String str, @mr2 String str2) {
        return C1799c.m12011d(str, str2);
    }

    @ts2
    /* renamed from: f */
    public static Uri m11997f(@mr2 ContentResolver contentResolver, @mr2 Uri uri, @mr2 String str, @mr2 String str2) throws FileNotFoundException {
        return C1799c.m12012e(contentResolver, uri, str, str2);
    }

    @ts2
    /* renamed from: g */
    public static String m11998g(@mr2 Uri uri) {
        return C1798b.m12006c(uri);
    }

    @ts2
    /* renamed from: h */
    public static String m11999h(@mr2 Uri uri) {
        return C1799c.m12013f(uri);
    }

    /* renamed from: i */
    public static boolean m12000i(@mr2 Context context, @ts2 Uri uri) {
        return C1798b.m12007d(context, uri);
    }

    /* renamed from: j */
    public static boolean m12001j(@mr2 Uri uri) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1800d.m12015a(uri);
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && f9913a.equals(pathSegments.get(0));
    }

    /* renamed from: k */
    public static boolean m12002k(@mr2 ContentResolver contentResolver, @mr2 Uri uri, @mr2 Uri uri2) throws FileNotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? C1800d.m12016b(contentResolver, uri, uri2) : C1798b.m12005b(contentResolver, uri);
    }

    @ts2
    /* renamed from: l */
    public static Uri m12003l(@mr2 ContentResolver contentResolver, @mr2 Uri uri, @mr2 String str) throws FileNotFoundException {
        return C1799c.m12014g(contentResolver, uri, str);
    }
}
