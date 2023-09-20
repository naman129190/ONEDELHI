package com.onedelhi.secure;

import android.support.p000v4.media.session.PlaybackStateCompat;

public enum d44 {
    TERABYTES(1099511627776L) {
        /* renamed from: a */
        public long mo34218a(long j, d44 d44) {
            return d44.mo34223q(j);
        }
    },
    GIGABYTES(1073741824) {
        /* renamed from: a */
        public long mo34218a(long j, d44 d44) {
            return d44.mo34220e(j);
        }
    },
    MEGABYTES(PlaybackStateCompat.f408A) {
        /* renamed from: a */
        public long mo34218a(long j, d44 d44) {
            return d44.mo34222l(j);
        }
    },
    KILOBYTES(1024) {
        /* renamed from: a */
        public long mo34218a(long j, d44 d44) {
            return d44.mo34221g(j);
        }
    },
    BYTES(1) {
        /* renamed from: a */
        public long mo34218a(long j, d44 d44) {
            return d44.mo34219b(j);
        }
    };
    

    /* renamed from: b */
    public long f27250b;

    /* access modifiers changed from: public */
    d44(long j) {
        this.f27250b = j;
    }

    /* renamed from: a */
    public abstract long mo34218a(long j, d44 d44);

    /* renamed from: b */
    public long mo34219b(long j) {
        return j * this.f27250b;
    }

    /* renamed from: e */
    public long mo34220e(long j) {
        return (j * this.f27250b) / GIGABYTES.f27250b;
    }

    /* renamed from: g */
    public long mo34221g(long j) {
        return (j * this.f27250b) / KILOBYTES.f27250b;
    }

    /* renamed from: l */
    public long mo34222l(long j) {
        return (j * this.f27250b) / MEGABYTES.f27250b;
    }

    /* renamed from: q */
    public long mo34223q(long j) {
        return (j * this.f27250b) / TERABYTES.f27250b;
    }
}
