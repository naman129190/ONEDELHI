package com.onedelhi.secure;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class n21<Data> implements rj2<File, Data> {

    /* renamed from: a */
    public static final String f16998a = "FileLoader";

    /* renamed from: a */
    public final C2918d<Data> f16999a;

    /* renamed from: com.onedelhi.secure.n21$a */
    public static class C2914a<Data> implements sj2<File, Data> {

        /* renamed from: a */
        public final C2918d<Data> f17000a;

        public C2914a(C2918d<Data> dVar) {
            this.f17000a = dVar;
        }

        /* renamed from: b */
        public final void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public final rj2<File, Data> mo14017c(@mr2 am2 am2) {
            return new n21(this.f17000a);
        }
    }

    /* renamed from: com.onedelhi.secure.n21$b */
    public static class C2915b extends C2914a<ParcelFileDescriptor> {

        /* renamed from: com.onedelhi.secure.n21$b$a */
        public class C2916a implements C2918d<ParcelFileDescriptor> {
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo20848a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo20849b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo20850c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, bi2.f26358i);
            }
        }

        public C2915b() {
            super(new C2916a());
        }
    }

    /* renamed from: com.onedelhi.secure.n21$c */
    public static final class C2917c<Data> implements pd0<Data> {

        /* renamed from: a */
        public final C2918d<Data> f17001a;

        /* renamed from: a */
        public final File f17002a;

        /* renamed from: a */
        public Data f17003a;

        public C2917c(File file, C2918d<Data> dVar) {
            this.f17002a = file;
            this.f17001a = dVar;
        }

        @mr2
        /* renamed from: a */
        public Class<Data> mo14075a() {
            return this.f17001a.mo20848a();
        }

        /* renamed from: b */
        public void mo14569b() {
            Data data = this.f17003a;
            if (data != null) {
                try {
                    this.f17001a.mo20849b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super Data> aVar) {
            try {
                Data c = this.f17001a.mo20850c(this.f17002a);
                this.f17003a = c;
                aVar.mo13893f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable(n21.f16998a, 3)) {
                    Log.d(n21.f16998a, "Failed to open file", e);
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
    }

    /* renamed from: com.onedelhi.secure.n21$d */
    public interface C2918d<Data> {
        /* renamed from: a */
        Class<Data> mo20848a();

        /* renamed from: b */
        void mo20849b(Data data) throws IOException;

        /* renamed from: c */
        Data mo20850c(File file) throws FileNotFoundException;
    }

    /* renamed from: com.onedelhi.secure.n21$e */
    public static class C2919e extends C2914a<InputStream> {

        /* renamed from: com.onedelhi.secure.n21$e$a */
        public class C2920a implements C2918d<InputStream> {
            /* renamed from: a */
            public Class<InputStream> mo20848a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo20849b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo20850c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C2919e() {
            super(new C2920a());
        }
    }

    public n21(C2918d<Data> dVar) {
        this.f16999a = dVar;
    }

    /* renamed from: c */
    public rj2.C3418a<Data> mo13191a(@mr2 File file, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(file), new C2917c(file, this.f16999a));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 File file) {
        return true;
    }
}
