package com.onedelhi.secure;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class ar1 {

    /* renamed from: a */
    public final C1728c f9500a;

    @sj3(25)
    /* renamed from: com.onedelhi.secure.ar1$a */
    public static final class C1726a implements C1728c {
        @mr2

        /* renamed from: a */
        public final InputContentInfo f9501a;

        public C1726a(@mr2 Uri uri, @mr2 ClipDescription clipDescription, @ts2 Uri uri2) {
            this.f9501a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public C1726a(@mr2 Object obj) {
            this.f9501a = (InputContentInfo) obj;
        }

        @ts2
        /* renamed from: a */
        public Uri mo13246a() {
            return this.f9501a.getLinkUri();
        }

        /* renamed from: b */
        public void mo13247b() {
            this.f9501a.requestPermission();
        }

        @mr2
        /* renamed from: c */
        public Uri mo13248c() {
            return this.f9501a.getContentUri();
        }

        @mr2
        /* renamed from: d */
        public Object mo13249d() {
            return this.f9501a;
        }

        @mr2
        /* renamed from: e */
        public ClipDescription mo13250e() {
            return this.f9501a.getDescription();
        }

        /* renamed from: f */
        public void mo13251f() {
            this.f9501a.releasePermission();
        }
    }

    /* renamed from: com.onedelhi.secure.ar1$b */
    public static final class C1727b implements C1728c {
        @mr2

        /* renamed from: a */
        public final ClipDescription f9502a;
        @mr2

        /* renamed from: a */
        public final Uri f9503a;
        @ts2

        /* renamed from: b */
        public final Uri f9504b;

        public C1727b(@mr2 Uri uri, @mr2 ClipDescription clipDescription, @ts2 Uri uri2) {
            this.f9503a = uri;
            this.f9502a = clipDescription;
            this.f9504b = uri2;
        }

        @ts2
        /* renamed from: a */
        public Uri mo13246a() {
            return this.f9504b;
        }

        /* renamed from: b */
        public void mo13247b() {
        }

        @mr2
        /* renamed from: c */
        public Uri mo13248c() {
            return this.f9503a;
        }

        @ts2
        /* renamed from: d */
        public Object mo13249d() {
            return null;
        }

        @mr2
        /* renamed from: e */
        public ClipDescription mo13250e() {
            return this.f9502a;
        }

        /* renamed from: f */
        public void mo13251f() {
        }
    }

    /* renamed from: com.onedelhi.secure.ar1$c */
    public interface C1728c {
        @ts2
        /* renamed from: a */
        Uri mo13246a();

        /* renamed from: b */
        void mo13247b();

        @mr2
        /* renamed from: c */
        Uri mo13248c();

        @ts2
        /* renamed from: d */
        Object mo13249d();

        @mr2
        /* renamed from: e */
        ClipDescription mo13250e();

        /* renamed from: f */
        void mo13251f();
    }

    public ar1(@mr2 Uri uri, @mr2 ClipDescription clipDescription, @ts2 Uri uri2) {
        this.f9500a = Build.VERSION.SDK_INT >= 25 ? new C1726a(uri, clipDescription, uri2) : new C1727b(uri, clipDescription, uri2);
    }

    public ar1(@mr2 C1728c cVar) {
        this.f9500a = cVar;
    }

    @ts2
    /* renamed from: g */
    public static ar1 m11373g(@ts2 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new ar1(new C1726a(obj));
        }
        return null;
    }

    @mr2
    /* renamed from: a */
    public Uri mo13240a() {
        return this.f9500a.mo13248c();
    }

    @mr2
    /* renamed from: b */
    public ClipDescription mo13241b() {
        return this.f9500a.mo13250e();
    }

    @ts2
    /* renamed from: c */
    public Uri mo13242c() {
        return this.f9500a.mo13246a();
    }

    /* renamed from: d */
    public void mo13243d() {
        this.f9500a.mo13251f();
    }

    /* renamed from: e */
    public void mo13244e() {
        this.f9500a.mo13247b();
    }

    @ts2
    /* renamed from: f */
    public Object mo13245f() {
        return this.f9500a.mo13249d();
    }
}
