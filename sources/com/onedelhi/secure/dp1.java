package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1186a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1200c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface dp1 {

    /* renamed from: com.onedelhi.secure.dp1$a */
    public static final class C1986a implements dp1 {

        /* renamed from: a */
        public final C1200c f10873a;

        /* renamed from: a */
        public final C3131pa f10874a;

        /* renamed from: a */
        public final List<ImageHeaderParser> f10875a;

        public C1986a(InputStream inputStream, List<ImageHeaderParser> list, C3131pa paVar) {
            this.f10874a = (C3131pa) g43.m15509d(paVar);
            this.f10875a = (List) g43.m15509d(list);
            this.f10873a = new C1200c(inputStream, paVar);
        }

        @ts2
        /* renamed from: a */
        public Bitmap mo14802a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f10873a.mo7515c(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo14803b() {
            this.f10873a.mo7523a();
        }

        /* renamed from: c */
        public ImageHeaderParser.ImageType mo14804c() throws IOException {
            return C1186a.m7603e(this.f10875a, this.f10873a.mo7515c(), this.f10874a);
        }

        /* renamed from: d */
        public int mo14805d() throws IOException {
            return C1186a.m7600b(this.f10875a, this.f10873a.mo7515c(), this.f10874a);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.dp1$b */
    public static final class C1987b implements dp1 {

        /* renamed from: a */
        public final ParcelFileDescriptorRewinder f10876a;

        /* renamed from: a */
        public final C3131pa f10877a;

        /* renamed from: a */
        public final List<ImageHeaderParser> f10878a;

        public C1987b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C3131pa paVar) {
            this.f10877a = (C3131pa) g43.m15509d(paVar);
            this.f10878a = (List) g43.m15509d(list);
            this.f10876a = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @ts2
        /* renamed from: a */
        public Bitmap mo14802a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f10876a.mo7515c().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo14803b() {
        }

        /* renamed from: c */
        public ImageHeaderParser.ImageType mo14804c() throws IOException {
            return C1186a.m7602d(this.f10878a, this.f10876a, this.f10877a);
        }

        /* renamed from: d */
        public int mo14805d() throws IOException {
            return C1186a.m7599a(this.f10878a, this.f10876a, this.f10877a);
        }
    }

    @ts2
    /* renamed from: a */
    Bitmap mo14802a(BitmapFactory.Options options) throws IOException;

    /* renamed from: b */
    void mo14803b();

    /* renamed from: c */
    ImageHeaderParser.ImageType mo14804c() throws IOException;

    /* renamed from: d */
    int mo14805d() throws IOException;
}
