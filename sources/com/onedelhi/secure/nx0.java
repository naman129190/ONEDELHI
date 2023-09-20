package com.onedelhi.secure;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@sj3(27)
public final class nx0 implements ImageHeaderParser {
    /* renamed from: a */
    public int mo7507a(@mr2 InputStream inputStream, @mr2 C3131pa paVar) throws IOException {
        int r = new mx0(inputStream).mo20745r(mx0.f16674h, 1);
        if (r == 0) {
            return -1;
        }
        return r;
    }

    /* renamed from: b */
    public int mo7508b(@mr2 ByteBuffer byteBuffer, @mr2 C3131pa paVar) throws IOException {
        return mo7507a(C3733uq.m29496f(byteBuffer), paVar);
    }

    @mr2
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7509c(@mr2 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @mr2
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo7510d(@mr2 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
