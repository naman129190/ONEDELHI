package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C1173a;
import com.onedelhi.secure.pd0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class mc4 implements pd0<InputStream> {

    /* renamed from: b */
    public static final String f16066b = "MediaStoreThumbFetcher";

    /* renamed from: a */
    public final Uri f16067a;

    /* renamed from: a */
    public final qc4 f16068a;

    /* renamed from: a */
    public InputStream f16069a;

    /* renamed from: com.onedelhi.secure.mc4$a */
    public static class C2856a implements oc4 {

        /* renamed from: a */
        public static final String f16070a = "kind = 1 AND image_id = ?";

        /* renamed from: a */
        public static final String[] f16071a = {"_data"};

        /* renamed from: a */
        public final ContentResolver f16072a;

        public C2856a(ContentResolver contentResolver) {
            this.f16072a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo20301a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f16072a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f16071a, f16070a, new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.onedelhi.secure.mc4$b */
    public static class C2857b implements oc4 {

        /* renamed from: a */
        public static final String f16073a = "kind = 1 AND video_id = ?";

        /* renamed from: a */
        public static final String[] f16074a = {"_data"};

        /* renamed from: a */
        public final ContentResolver f16075a;

        public C2857b(ContentResolver contentResolver) {
            this.f16075a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo20301a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f16075a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f16074a, f16073a, new String[]{lastPathSegment}, (String) null);
        }
    }

    @hw4
    public mc4(Uri uri, qc4 qc4) {
        this.f16067a = uri;
        this.f16068a = qc4;
    }

    /* renamed from: e */
    public static mc4 m21475e(Context context, Uri uri, oc4 oc4) {
        return new mc4(uri, new qc4(C1173a.m7529e(context).mo7461n().mo19558g(), oc4, C1173a.m7529e(context).mo7456g(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static mc4 m21476f(Context context, Uri uri) {
        return m21475e(context, uri, new C2856a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static mc4 m21477g(Context context, Uri uri) {
        return m21475e(context, uri, new C2857b(context.getContentResolver()));
    }

    @mr2
    /* renamed from: a */
    public Class<InputStream> mo14075a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo14569b() {
        InputStream inputStream = this.f16069a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super InputStream> aVar) {
        try {
            InputStream h = mo20300h();
            this.f16069a = h;
            aVar.mo13893f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(f16066b, 3)) {
                Log.d(f16066b, "Failed to find thumbnail file", e);
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

    /* renamed from: h */
    public final InputStream mo20300h() throws FileNotFoundException {
        InputStream d = this.f16068a.mo23101d(this.f16067a);
        int a = d != null ? this.f16068a.mo23098a(this.f16067a) : -1;
        return a != -1 ? new ox0(d, a) : d;
    }
}
