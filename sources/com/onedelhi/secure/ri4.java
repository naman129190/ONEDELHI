package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

@sj3(21)
public class ri4 extends un0 {

    /* renamed from: a */
    public Context f19872a;

    /* renamed from: a */
    public Uri f19873a;

    public ri4(@ts2 un0 un0, Context context, Uri uri) {
        super(un0);
        this.f19872a = context;
        this.f19873a = uri;
    }

    /* renamed from: w */
    public static void m26766w(@ts2 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @ts2
    /* renamed from: x */
    public static Uri m26767x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo17744a() {
        return ao0.m11321a(this.f19872a, this.f19873a);
    }

    /* renamed from: b */
    public boolean mo17745b() {
        return ao0.m11322b(this.f19872a, this.f19873a);
    }

    @ts2
    /* renamed from: c */
    public un0 mo17746c(String str) {
        Uri x = m26767x(this.f19872a, this.f19873a, "vnd.android.document/directory", str);
        if (x != null) {
            return new ri4(this, this.f19872a, x);
        }
        return null;
    }

    @ts2
    /* renamed from: d */
    public un0 mo17747d(String str, String str2) {
        Uri x = m26767x(this.f19872a, this.f19873a, str, str2);
        if (x != null) {
            return new ri4(this, this.f19872a, x);
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo17748e() {
        try {
            return DocumentsContract.deleteDocument(this.f19872a.getContentResolver(), this.f19873a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo17749f() {
        return ao0.m11324d(this.f19872a, this.f19873a);
    }

    @ts2
    /* renamed from: k */
    public String mo17750k() {
        return ao0.m11326f(this.f19872a, this.f19873a);
    }

    @ts2
    /* renamed from: m */
    public String mo17751m() {
        return ao0.m11328h(this.f19872a, this.f19873a);
    }

    /* renamed from: n */
    public Uri mo17752n() {
        return this.f19873a;
    }

    /* renamed from: o */
    public boolean mo17753o() {
        return ao0.m11329i(this.f19872a, this.f19873a);
    }

    /* renamed from: q */
    public boolean mo17754q() {
        return ao0.m11330j(this.f19872a, this.f19873a);
    }

    /* renamed from: r */
    public boolean mo17755r() {
        return ao0.m11331k(this.f19872a, this.f19873a);
    }

    /* renamed from: s */
    public long mo17756s() {
        return ao0.m11332l(this.f19872a, this.f19873a);
    }

    /* renamed from: t */
    public long mo17757t() {
        return ao0.m11333m(this.f19872a, this.f19873a);
    }

    /* renamed from: u */
    public un0[] mo17758u() {
        ContentResolver contentResolver = this.f19872a.getContentResolver();
        Uri uri = this.f19873a;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f19873a, cursor.getString(0)));
            }
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
        } catch (Throwable th) {
            m26766w((AutoCloseable) null);
            throw th;
        }
        m26766w(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        un0[] un0Arr = new un0[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            un0Arr[i] = new ri4(this, this.f19872a, uriArr[i]);
        }
        return un0Arr;
    }

    /* renamed from: v */
    public boolean mo17759v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f19872a.getContentResolver(), this.f19873a, str);
            if (renameDocument != null) {
                this.f19873a = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
