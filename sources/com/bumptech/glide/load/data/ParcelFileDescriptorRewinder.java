package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C1195a<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f6100a;

    @sj3(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f6101a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6101a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6101a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f6101a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @sj3(21)
    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1194a implements C1195a.C1196a<ParcelFileDescriptor> {
        @mr2
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo7518a() {
            return ParcelFileDescriptor.class;
        }

        @mr2
        /* renamed from: c */
        public C1195a<ParcelFileDescriptor> mo7519b(@mr2 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @sj3(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6100a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: a */
    public static boolean m7613a() {
        return true;
    }

    /* renamed from: b */
    public void mo7514b() {
    }

    @mr2
    @sj3(21)
    /* renamed from: d */
    public ParcelFileDescriptor mo7515c() throws IOException {
        return this.f6100a.rewind();
    }
}
