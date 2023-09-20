package com.onedelhi.secure;

import android.util.Log;
import com.bumptech.glide.load.C1186a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class i44 implements ik3<InputStream, ng1> {

    /* renamed from: a */
    public static final String f13479a = "StreamGifDecoder";

    /* renamed from: a */
    public final ik3<ByteBuffer, ng1> f13480a;

    /* renamed from: a */
    public final C3131pa f13481a;

    /* renamed from: a */
    public final List<ImageHeaderParser> f13482a;

    public i44(List<ImageHeaderParser> list, ik3<ByteBuffer, ng1> ik3, C3131pa paVar) {
        this.f13482a = list;
        this.f13480a = ik3;
        this.f13481a = paVar;
    }

    /* renamed from: e */
    public static byte[] m17178e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable(f13479a, 5)) {
                return null;
            }
            Log.w(f13479a, "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public ck3<ng1> mo14336a(@mr2 InputStream inputStream, int i, int i2, @mr2 zw2 zw2) throws IOException {
        byte[] e = m17178e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f13480a.mo14336a(ByteBuffer.wrap(e), i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 InputStream inputStream, @mr2 zw2 zw2) throws IOException {
        return !((Boolean) zw2.mo28148c(xg1.f22554b)).booleanValue() && C1186a.m7603e(this.f13482a, inputStream, this.f13481a) == ImageHeaderParser.ImageType.GIF;
    }
}
