package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C0552c;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.onedelhi.secure.C4048z8;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.cg4;
import com.onedelhi.secure.h40;
import com.onedelhi.secure.jh0;
import com.onedelhi.secure.kh0;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mq1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qs0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements mq1<Boolean> {

    /* renamed from: a */
    public static final long f3525a = 500;

    /* renamed from: a */
    public static final String f3526a = "EmojiCompatInitializer";

    @sj3(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C0542a extends C0552c.C0557d {
        public C0542a(Context context) {
            super(new C0543b(context));
            mo4197f(1);
        }
    }

    @sj3(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0543b implements C0552c.C0562i {

        /* renamed from: a */
        public final Context f3529a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        public class C0544a extends C0552c.C0563j {

            /* renamed from: a */
            public final /* synthetic */ C0552c.C0563j f3531a;

            /* renamed from: a */
            public final /* synthetic */ ThreadPoolExecutor f3532a;

            public C0544a(C0552c.C0563j jVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3531a = jVar;
                this.f3532a = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo4151a(@ts2 Throwable th) {
                try {
                    this.f3531a.mo4151a(th);
                } finally {
                    this.f3532a.shutdown();
                }
            }

            /* renamed from: b */
            public void mo4152b(@mr2 C0575f fVar) {
                try {
                    this.f3531a.mo4152b(fVar);
                } finally {
                    this.f3532a.shutdown();
                }
            }
        }

        public C0543b(Context context) {
            this.f3529a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo4149a(@mr2 C0552c.C0563j jVar) {
            ThreadPoolExecutor c = h40.m16466c(EmojiCompatInitializer.f3526a);
            c.execute(new qs0(this, jVar, c));
        }

        @ly4
        /* renamed from: c */
        public void m4080d(@mr2 C0552c.C0563j jVar, @mr2 ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0569e a = C0546a.m4085a(this.f3529a);
                if (a != null) {
                    a.mo4216l(threadPoolExecutor);
                    a.mo4192a().mo4149a(new C0544a(jVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                jVar.mo4151a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C0545c implements Runnable {
        public void run() {
            try {
                cg4.m12477b("EmojiCompat.EmojiCompatInitializer.run");
                if (C0552c.m4111n()) {
                    C0552c.m4105b().mo4175q();
                }
            } finally {
                cg4.m12479d();
            }
        }
    }

    @mr2
    /* renamed from: b */
    public List<Class<? extends mq1<?>>> mo4139b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @mr2
    /* renamed from: c */
    public Boolean mo4138a(@mr2 Context context) {
        C0552c.m4110m(new C0542a(context));
        mo4141d(context);
        return Boolean.TRUE;
    }

    @sj3(19)
    /* renamed from: d */
    public void mo4141d(@mr2 Context context) {
        final C0690e lifecycle = ((a32) C4048z8.m32904e(context).mo27838f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4958a(new kh0() {
            /* renamed from: a */
            public /* synthetic */ void mo4143a(a32 a32) {
                jh0.m18569f(this, a32);
            }

            /* renamed from: b */
            public /* synthetic */ void mo4144b(a32 a32) {
                jh0.m18568e(this, a32);
            }

            /* renamed from: c */
            public /* synthetic */ void mo4145c(a32 a32) {
                jh0.m18566c(this, a32);
            }

            /* renamed from: d */
            public /* synthetic */ void mo4146d(a32 a32) {
                jh0.m18565b(this, a32);
            }

            /* renamed from: e */
            public /* synthetic */ void mo4147e(a32 a32) {
                jh0.m18564a(this, a32);
            }

            /* renamed from: f */
            public void mo4148f(@mr2 a32 a32) {
                EmojiCompatInitializer.this.mo4142e();
                lifecycle.mo4960c(this);
            }
        });
    }

    @sj3(19)
    /* renamed from: e */
    public void mo4142e() {
        h40.m16468e().postDelayed(new C0545c(), 500);
    }
}
