package com.bumptech.glide.load;

import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.mr2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    /* renamed from: a */
    public static final int f6089a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: b */
        public final boolean f6090b;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.f6090b = z;
        }

        public boolean hasAlpha() {
            return this.f6090b;
        }
    }

    /* renamed from: a */
    int mo7507a(@mr2 InputStream inputStream, @mr2 C3131pa paVar) throws IOException;

    /* renamed from: b */
    int mo7508b(@mr2 ByteBuffer byteBuffer, @mr2 C3131pa paVar) throws IOException;

    @mr2
    /* renamed from: c */
    ImageType mo7509c(@mr2 ByteBuffer byteBuffer) throws IOException;

    @mr2
    /* renamed from: d */
    ImageType mo7510d(@mr2 InputStream inputStream) throws IOException;
}
