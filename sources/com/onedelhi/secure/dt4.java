package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.onedelhi.secure.ow2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class dt4<T> implements ik3<T, Bitmap> {
    @hw4

    /* renamed from: a */
    public static final int f10910a = 2;

    /* renamed from: a */
    public static final long f10911a = -1;

    /* renamed from: a */
    public static final ow2<Long> f10912a = ow2.m24132b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1993a());

    /* renamed from: a */
    public static final String f10913a = "VideoDecoder";

    /* renamed from: b */
    public static final C1998e f10914b = new C1998e();

    /* renamed from: b */
    public static final ow2<Integer> f10915b = ow2.m24132b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1994b());

    /* renamed from: a */
    public final C1998e f10916a;

    /* renamed from: a */
    public final C1999f<T> f10917a;

    /* renamed from: a */
    public final C2355hm f10918a;

    /* renamed from: com.onedelhi.secure.dt4$a */
    public class C1993a implements ow2.C3097b<Long> {

        /* renamed from: a */
        public final ByteBuffer f10919a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void mo14843a(@mr2 byte[] bArr, @mr2 Long l, @mr2 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f10919a) {
                this.f10919a.position(0);
                messageDigest.update(this.f10919a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.onedelhi.secure.dt4$b */
    public class C1994b implements ow2.C3097b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f10920a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void mo14843a(@mr2 byte[] bArr, @mr2 Integer num, @mr2 MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f10920a) {
                    this.f10920a.position(0);
                    messageDigest.update(this.f10920a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.dt4$c */
    public static final class C1995c implements C1999f<AssetFileDescriptor> {
        public C1995c() {
        }

        public /* synthetic */ C1995c(C1993a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo14846a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.dt4$d */
    public static final class C1996d implements C1999f<ByteBuffer> {

        /* renamed from: com.onedelhi.secure.dt4$d$a */
        public class C1997a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f10922a;

            public C1997a(ByteBuffer byteBuffer) {
                this.f10922a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f10922a.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f10922a.limit())) {
                    return -1;
                }
                this.f10922a.position((int) j);
                int min = Math.min(i2, this.f10922a.remaining());
                this.f10922a.get(bArr, i, min);
                return min;
            }
        }

        /* renamed from: b */
        public void mo14846a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C1997a(byteBuffer));
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.dt4$e */
    public static class C1998e {
        /* renamed from: a */
        public MediaMetadataRetriever mo14852a() {
            return new MediaMetadataRetriever();
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.dt4$f */
    public interface C1999f<T> {
        /* renamed from: a */
        void mo14846a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.onedelhi.secure.dt4$g */
    public static final class C2000g implements C1999f<ParcelFileDescriptor> {
        /* renamed from: b */
        public void mo14846a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: com.onedelhi.secure.dt4$h */
    public static final class C2001h extends RuntimeException {

        /* renamed from: b */
        public static final long f10923b = -2556382523004027815L;

        public C2001h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public dt4(C2355hm hmVar, C1999f<T> fVar) {
        this(hmVar, fVar, f10914b);
    }

    @hw4
    public dt4(C2355hm hmVar, C1999f<T> fVar, C1998e eVar) {
        this.f10918a = hmVar;
        this.f10917a = fVar;
        this.f10916a = eVar;
    }

    /* renamed from: c */
    public static ik3<AssetFileDescriptor, Bitmap> m13309c(C2355hm hmVar) {
        return new dt4(hmVar, new C1995c((C1993a) null));
    }

    @sj3(api = 23)
    /* renamed from: d */
    public static ik3<ByteBuffer, Bitmap> m13310d(C2355hm hmVar) {
        return new dt4(hmVar, new C1996d());
    }

    @ts2
    /* renamed from: e */
    public static Bitmap m13311e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, no0 no0) {
        Bitmap g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || no0 == no0.f17499f) ? null : m13313g(mediaMetadataRetriever, j, i, i2, i3, no0);
        if (g == null) {
            g = m13312f(mediaMetadataRetriever, j, i);
        }
        if (g != null) {
            return g;
        }
        throw new C2001h();
    }

    /* renamed from: f */
    public static Bitmap m13312f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    @ts2
    /* renamed from: g */
    public static Bitmap m13313g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, no0 no0) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = no0.mo21387b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable(f10913a, 3)) {
                return null;
            }
            Log.d(f10913a, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    /* renamed from: h */
    public static ik3<ParcelFileDescriptor, Bitmap> m13314h(C2355hm hmVar) {
        return new dt4(hmVar, new C2000g());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public ck3<Bitmap> mo14336a(@mr2 T t, int i, int i2, @mr2 zw2 zw2) throws IOException {
        long longValue = ((Long) zw2.mo28148c(f10912a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) zw2.mo28148c(f10915b);
            if (num == null) {
                num = 2;
            }
            no0 no0 = (no0) zw2.mo28148c(no0.f17493a);
            if (no0 == null) {
                no0 = no0.f17500g;
            }
            no0 no02 = no0;
            MediaMetadataRetriever a = this.f10916a.mo14852a();
            try {
                this.f10917a.mo14846a(a, t);
                Bitmap e = m13311e(a, longValue, num.intValue(), i, i2, no02);
                a.release();
                return C2768lm.m20843f(e, this.f10918a);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    /* renamed from: b */
    public boolean mo14337b(@mr2 T t, @mr2 zw2 zw2) {
        return true;
    }
}
