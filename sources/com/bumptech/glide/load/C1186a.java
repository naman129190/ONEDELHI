package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ug3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a */
public final class C1186a {

    /* renamed from: a */
    public static final int f6091a = 5242880;

    /* renamed from: com.bumptech.glide.load.a$a */
    public class C1187a implements C1193g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f6092a;

        public C1187a(InputStream inputStream) {
            this.f6092a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7512a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo7510d(this.f6092a);
            } finally {
                this.f6092a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class C1188b implements C1193g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f6093a;

        public C1188b(ByteBuffer byteBuffer) {
            this.f6093a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7512a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo7509c(this.f6093a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class C1189c implements C1193g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6094a;

        /* renamed from: a */
        public final /* synthetic */ C3131pa f6095a;

        public C1189c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C3131pa paVar) {
            this.f6094a = parcelFileDescriptorRewinder;
            this.f6095a = paVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo7512a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.onedelhi.secure.ug3 r1 = new com.onedelhi.secure.ug3     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f6094a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo7515c()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.onedelhi.secure.pa r3 = r4.f6095a     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo7510d(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6094a
                r0.mo7515c()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6094a
                r0.mo7515c()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1186a.C1189c.mo7512a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    public class C1190d implements C1192f {

        /* renamed from: a */
        public final /* synthetic */ C3131pa f6096a;

        /* renamed from: a */
        public final /* synthetic */ InputStream f6097a;

        public C1190d(InputStream inputStream, C3131pa paVar) {
            this.f6097a = inputStream;
            this.f6096a = paVar;
        }

        /* renamed from: a */
        public int mo7513a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo7507a(this.f6097a, this.f6096a);
            } finally {
                this.f6097a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class C1191e implements C1192f {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6098a;

        /* renamed from: a */
        public final /* synthetic */ C3131pa f6099a;

        public C1191e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C3131pa paVar) {
            this.f6098a = parcelFileDescriptorRewinder;
            this.f6099a = paVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo7513a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.onedelhi.secure.ug3 r1 = new com.onedelhi.secure.ug3     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f6098a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo7515c()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.onedelhi.secure.pa r3 = r4.f6099a     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.onedelhi.secure.pa r0 = r4.f6099a     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo7507a(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6098a
                r0.mo7515c()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6098a
                r0.mo7515c()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1186a.C1191e.mo7513a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public interface C1192f {
        /* renamed from: a */
        int mo7513a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    public interface C1193g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo7512a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @sj3(21)
    /* renamed from: a */
    public static int m7599a(@mr2 List<ImageHeaderParser> list, @mr2 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @mr2 C3131pa paVar) throws IOException {
        return m7601c(list, new C1191e(parcelFileDescriptorRewinder, paVar));
    }

    /* renamed from: b */
    public static int m7600b(@mr2 List<ImageHeaderParser> list, @ts2 InputStream inputStream, @mr2 C3131pa paVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ug3(inputStream, paVar);
        }
        inputStream.mark(5242880);
        return m7601c(list, new C1190d(inputStream, paVar));
    }

    /* renamed from: c */
    public static int m7601c(@mr2 List<ImageHeaderParser> list, C1192f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo7513a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    @mr2
    @sj3(21)
    /* renamed from: d */
    public static ImageHeaderParser.ImageType m7602d(@mr2 List<ImageHeaderParser> list, @mr2 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @mr2 C3131pa paVar) throws IOException {
        return m7605g(list, new C1189c(parcelFileDescriptorRewinder, paVar));
    }

    @mr2
    /* renamed from: e */
    public static ImageHeaderParser.ImageType m7603e(@mr2 List<ImageHeaderParser> list, @ts2 InputStream inputStream, @mr2 C3131pa paVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ug3(inputStream, paVar);
        }
        inputStream.mark(5242880);
        return m7605g(list, new C1187a(inputStream));
    }

    @mr2
    /* renamed from: f */
    public static ImageHeaderParser.ImageType m7604f(@mr2 List<ImageHeaderParser> list, @ts2 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m7605g(list, new C1188b(byteBuffer));
    }

    @mr2
    /* renamed from: g */
    public static ImageHeaderParser.ImageType m7605g(@mr2 List<ImageHeaderParser> list, C1193g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.mo7512a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
