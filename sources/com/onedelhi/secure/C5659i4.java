package com.onedelhi.secure;

import android.annotation.SuppressLint;
import com.onedelhi.secure.nl3;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;

@SuppressLint({"all"})
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/i4;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lcom/onedelhi/secure/un4;", "d", "b", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* renamed from: com.onedelhi.secure.i4 */
public final class C5659i4 {
    @vr2

    /* renamed from: a */
    public static final C5659i4 f30072a = new C5659i4();

    /* renamed from: a */
    public static final boolean f30073a;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/i4$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.i4$a */
    public static final class C5660a implements ClassFileTransformer {
        @vr2

        /* renamed from: a */
        public static final C5660a f30074a = new C5660a();

        @ss2
        /* renamed from: a */
        public byte[] mo37833a(@vr2 ClassLoader classLoader, @vr2 String str, @ss2 Class<?> cls, @vr2 ProtectionDomain protectionDomain, @ss2 byte[] bArr) {
            if (!jt1.m53768g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            C5359g4.f28937a.mo36565b(true);
            return C5053dr.m45504p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object obj;
        Boolean bool = null;
        try {
            nl3.C6191a aVar = nl3.f32575a;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            obj = nl3.m58187b(property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property)));
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        if (!nl3.m58194i(obj)) {
            bool = obj;
        }
        Boolean bool2 = bool;
        f30073a = bool2 == null ? ef0.f27861a.mo35195u() : bool2.booleanValue();
    }

    /* renamed from: c */
    public static final void m51780c(Signal signal) {
        ef0 ef0 = ef0.f27861a;
        if (ef0.mo35200z()) {
            ef0.mo35181f(System.out);
        } else {
            System.out.println("Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @zw1
    /* renamed from: d */
    public static final void m51781d(@ss2 String str, @vr2 Instrumentation instrumentation) {
        C5359g4.f28937a.mo36565b(true);
        instrumentation.addTransformer(C5660a.f30074a);
        ef0 ef0 = ef0.f27861a;
        ef0.mo35169K(f30073a);
        ef0.mo35198x();
        f30072a.mo37832b();
    }

    /* renamed from: b */
    public final void mo37832b() {
        try {
            Signal.handle(new Signal("TRAP"), C5478h4.f29418a);
        } catch (Throwable unused) {
        }
    }
}
