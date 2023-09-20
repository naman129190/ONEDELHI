package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.qq */
public class C3327qq implements rj2<File, ByteBuffer> {

    /* renamed from: a */
    public static final String f19394a = "ByteBufferFileLoader";

    /* renamed from: com.onedelhi.secure.qq$a */
    public static final class C3328a implements pd0<ByteBuffer> {

        /* renamed from: a */
        public final File f19395a;

        public C3328a(File file) {
            this.f19395a = file;
        }

        @mr2
        /* renamed from: a */
        public Class<ByteBuffer> mo14075a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo14569b() {
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super ByteBuffer> aVar) {
            try {
                aVar.mo13893f(C3733uq.m29491a(this.f19395a));
            } catch (IOException e) {
                if (Log.isLoggable(C3327qq.f19394a, 3)) {
                    Log.d(C3327qq.f19394a, "Failed to obtain ByteBuffer for file", e);
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

    /* renamed from: com.onedelhi.secure.qq$b */
    public static class C3329b implements sj2<File, ByteBuffer> {
        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<File, ByteBuffer> mo14017c(@mr2 am2 am2) {
            return new C3327qq();
        }
    }

    /* renamed from: c */
    public rj2.C3418a<ByteBuffer> mo13191a(@mr2 File file, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(file), new C3328a(file));
    }

    /* renamed from: d */
    public boolean mo13192b(@mr2 File file) {
        return true;
    }
}
