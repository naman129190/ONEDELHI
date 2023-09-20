package com.onedelhi.secure;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.onedelhi.secure.pd0;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class o62<T> implements pd0<T> {

    /* renamed from: b */
    public static final String f17839b = "LocalUriFetcher";

    /* renamed from: a */
    public final ContentResolver f17840a;

    /* renamed from: a */
    public final Uri f17841a;

    /* renamed from: a */
    public T f17842a;

    public o62(ContentResolver contentResolver, Uri uri) {
        this.f17840a = contentResolver;
        this.f17841a = uri;
    }

    /* renamed from: b */
    public void mo14569b() {
        T t = this.f17842a;
        if (t != null) {
            try {
                mo14076e(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super T> aVar) {
        try {
            T f = mo14077f(this.f17841a, this.f17840a);
            this.f17842a = f;
            aVar.mo13893f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(f17839b, 3)) {
                Log.d(f17839b, "Failed to open Uri", e);
            }
            aVar.mo13892e(e);
        }
    }

    public void cancel() {
    }

    @mr2
    /* renamed from: d */
    public vd0 mo14572d() {
        return vd0.LOCAL;
    }

    /* renamed from: e */
    public abstract void mo14076e(T t) throws IOException;

    /* renamed from: f */
    public abstract T mo14077f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
