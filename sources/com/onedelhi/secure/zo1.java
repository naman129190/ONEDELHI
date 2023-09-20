package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class zo1 implements Closeable {

    /* renamed from: n */
    public static final int f38395n = 1048576;
    @ts2

    /* renamed from: a */
    public w94<Bitmap> f38396a;

    /* renamed from: a */
    public final URL f38397a;
    @ts2

    /* renamed from: a */
    public volatile Future<?> f38398a;

    public zo1(URL url) {
        this.f38397a = url;
    }

    @ts2
    /* renamed from: d */
    public static zo1 m74203d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zo1(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m74204h(x94 x94) {
        try {
            x94.mo26837c(mo48404b());
        } catch (Exception e) {
            x94.mo26836b(e);
        }
    }

    /* renamed from: b */
    public Bitmap mo48404b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f38397a);
        }
        byte[] c = mo48405c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f38397a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f38397a);
    }

    /* renamed from: c */
    public final byte[] mo48405c() throws IOException {
        URLConnection openConnection = this.f38397a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] e = C4906cr.m44232e(C4906cr.m44230c(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + e.length + " bytes from " + this.f38397a);
                }
                if (e.length <= 1048576) {
                    return e;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public void close() {
        this.f38398a.cancel(true);
    }

    /* renamed from: g */
    public w94<Bitmap> mo48407g() {
        return (w94) Preconditions.checkNotNull(this.f38396a);
    }

    /* renamed from: l */
    public void mo48408l(ExecutorService executorService) {
        x94 x94 = new x94();
        this.f38398a = executorService.submit(new yo1(this, x94));
        this.f38396a = x94.mo26835a();
    }
}
