package com.onedelhi.secure;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

public abstract class un0 {

    /* renamed from: a */
    public static final String f21442a = "DocumentFile";
    @ts2

    /* renamed from: a */
    public final un0 f21443a;

    public un0(@ts2 un0 un0) {
        this.f21443a = un0;
    }

    @mr2
    /* renamed from: h */
    public static un0 m29425h(@mr2 File file) {
        return new if3((un0) null, file);
    }

    @ts2
    /* renamed from: i */
    public static un0 m29426i(@mr2 Context context, @mr2 Uri uri) {
        return new kz3((un0) null, context, uri);
    }

    @ts2
    /* renamed from: j */
    public static un0 m29427j(@mr2 Context context, @mr2 Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new ri4((un0) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    /* renamed from: p */
    public static boolean m29428p(@mr2 Context context, @ts2 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    /* renamed from: a */
    public abstract boolean mo17744a();

    /* renamed from: b */
    public abstract boolean mo17745b();

    @ts2
    /* renamed from: c */
    public abstract un0 mo17746c(@mr2 String str);

    @ts2
    /* renamed from: d */
    public abstract un0 mo17747d(@mr2 String str, @mr2 String str2);

    /* renamed from: e */
    public abstract boolean mo17748e();

    /* renamed from: f */
    public abstract boolean mo17749f();

    @ts2
    /* renamed from: g */
    public un0 mo25671g(@mr2 String str) {
        for (un0 un0 : mo17758u()) {
            if (str.equals(un0.mo17750k())) {
                return un0;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: k */
    public abstract String mo17750k();

    @ts2
    /* renamed from: l */
    public un0 mo25672l() {
        return this.f21443a;
    }

    @ts2
    /* renamed from: m */
    public abstract String mo17751m();

    @mr2
    /* renamed from: n */
    public abstract Uri mo17752n();

    /* renamed from: o */
    public abstract boolean mo17753o();

    /* renamed from: q */
    public abstract boolean mo17754q();

    /* renamed from: r */
    public abstract boolean mo17755r();

    /* renamed from: s */
    public abstract long mo17756s();

    /* renamed from: t */
    public abstract long mo17757t();

    @mr2
    /* renamed from: u */
    public abstract un0[] mo17758u();

    /* renamed from: v */
    public abstract boolean mo17759v(@mr2 String str);
}
