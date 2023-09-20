package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.h40;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u91;
import com.onedelhi.secure.v91;
import com.onedelhi.secure.w91;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.e */
public class C0569e extends C0552c.C0557d {

    /* renamed from: a */
    public static final C0571b f3608a = new C0571b();

    /* renamed from: androidx.emoji2.text.e$a */
    public static class C0570a extends C0574d {

        /* renamed from: a */
        public final long f3609a;

        /* renamed from: b */
        public long f3610b;

        public C0570a(long j) {
            this.f3609a = j;
        }

        /* renamed from: a */
        public long mo4218a() {
            int i = (this.f3610b > 0 ? 1 : (this.f3610b == 0 ? 0 : -1));
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i == 0) {
                this.f3610b = uptimeMillis;
                return 0;
            }
            long j = uptimeMillis - this.f3610b;
            if (j > this.f3609a) {
                return -1;
            }
            return Math.min(Math.max(j, 1000), this.f3609a - j);
        }
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.e$b */
    public static class C0571b {
        @ts2
        /* renamed from: a */
        public Typeface mo4219a(@mr2 Context context, @mr2 aa1.C1675c cVar) throws PackageManager.NameNotFoundException {
            return aa1.m10951a(context, (CancellationSignal) null, new aa1.C1675c[]{cVar});
        }

        @mr2
        /* renamed from: b */
        public aa1.C1674b mo4220b(@mr2 Context context, @mr2 u91 u91) throws PackageManager.NameNotFoundException {
            return aa1.m10952b(context, (CancellationSignal) null, u91);
        }

        /* renamed from: c */
        public void mo4221c(@mr2 Context context, @mr2 Uri uri, @mr2 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* renamed from: d */
        public void mo4222d(@mr2 Context context, @mr2 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static class C0572c implements C0552c.C0562i {

        /* renamed from: a */
        public static final String f3611a = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @mr2

        /* renamed from: a */
        public final Context f3612a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public ContentObserver f3613a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public Handler f3614a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public C0552c.C0563j f3615a;
        @mr2

        /* renamed from: a */
        public final C0571b f3616a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public C0574d f3617a;
        @mr2

        /* renamed from: a */
        public final u91 f3618a;
        @mr2

        /* renamed from: a */
        public final Object f3619a = new Object();
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public Runnable f3620a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public Executor f3621a;
        @mj1("mLock")
        @ts2

        /* renamed from: a */
        public ThreadPoolExecutor f3622a;

        /* renamed from: androidx.emoji2.text.e$c$a */
        public class C0573a extends ContentObserver {
            public C0573a(Handler handler) {
                super(handler);
            }

            public void onChange(boolean z, Uri uri) {
                C0572c.this.mo4225d();
            }
        }

        public C0572c(@mr2 Context context, @mr2 u91 u91, @mr2 C0571b bVar) {
            k43.m19456m(context, "Context cannot be null");
            k43.m19456m(u91, "FontRequest cannot be null");
            this.f3612a = context.getApplicationContext();
            this.f3618a = u91;
            this.f3616a = bVar;
        }

        @sj3(19)
        /* renamed from: a */
        public void mo4149a(@mr2 C0552c.C0563j jVar) {
            k43.m19456m(jVar, "LoaderCallback cannot be null");
            synchronized (this.f3619a) {
                this.f3615a = jVar;
            }
            mo4225d();
        }

        /* renamed from: b */
        public final void mo4223b() {
            synchronized (this.f3619a) {
                this.f3615a = null;
                ContentObserver contentObserver = this.f3613a;
                if (contentObserver != null) {
                    this.f3616a.mo4222d(this.f3612a, contentObserver);
                    this.f3613a = null;
                }
                Handler handler = this.f3614a;
                if (handler != null) {
                    handler.removeCallbacks(this.f3620a);
                }
                this.f3614a = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3622a;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3621a = null;
                this.f3622a = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r8.f3619a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r3 = r8.f3617a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
            if (r3 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
            r3 = r3.mo4218a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            if (r3 < 0) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
            mo4227f(r0.mo12878d(), r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
            if (r1 != 0) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            com.onedelhi.secure.cg4.m12477b(f3611a);
            r1 = r8.f3616a.mo4219a(r8.f3612a, r0);
            r0 = com.onedelhi.secure.pk4.m24795f(r8.f3612a, (android.os.CancellationSignal) null, r0.mo12878d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
            if (r0 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
            if (r1 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
            r0 = androidx.emoji2.text.C0575f.m4206e(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            com.onedelhi.secure.cg4.m12479d();
            r1 = r8.f3619a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r2 = r8.f3615a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
            if (r2 == null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0060, code lost:
            r2.mo4152b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            mo4223b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0072, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            com.onedelhi.secure.cg4.m12479d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0077, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + com.onedelhi.secure.pl2.f33727d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0094, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
            monitor-enter(r8.f3619a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r2 = r8.f3615a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x009a, code lost:
            if (r2 != null) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x009c, code lost:
            r2.mo4151a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a0, code lost:
            mo4223b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = mo4226e();
            r1 = r0.mo12876b();
         */
        @com.onedelhi.secure.sj3(19)
        @com.onedelhi.secure.ly4
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4224c() {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f3619a
                monitor-enter(r0)
                androidx.emoji2.text.c$j r1 = r8.f3615a     // Catch:{ all -> 0x00a7 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                com.onedelhi.secure.aa1$c r0 = r8.mo4226e()     // Catch:{ all -> 0x0094 }
                int r1 = r0.mo12876b()     // Catch:{ all -> 0x0094 }
                r2 = 2
                if (r1 != r2) goto L_0x0034
                java.lang.Object r2 = r8.f3619a     // Catch:{ all -> 0x0094 }
                monitor-enter(r2)     // Catch:{ all -> 0x0094 }
                androidx.emoji2.text.e$d r3 = r8.f3617a     // Catch:{ all -> 0x0031 }
                if (r3 == 0) goto L_0x002f
                long r3 = r3.mo4218a()     // Catch:{ all -> 0x0031 }
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x002f
                android.net.Uri r0 = r0.mo12878d()     // Catch:{ all -> 0x0031 }
                r8.mo4227f(r0, r3)     // Catch:{ all -> 0x0031 }
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                return
            L_0x002f:
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                goto L_0x0034
            L_0x0031:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0034:
                if (r1 != 0) goto L_0x0078
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                com.onedelhi.secure.cg4.m12477b(r1)     // Catch:{ all -> 0x0073 }
                androidx.emoji2.text.e$b r1 = r8.f3616a     // Catch:{ all -> 0x0073 }
                android.content.Context r2 = r8.f3612a     // Catch:{ all -> 0x0073 }
                android.graphics.Typeface r1 = r1.mo4219a(r2, r0)     // Catch:{ all -> 0x0073 }
                android.content.Context r2 = r8.f3612a     // Catch:{ all -> 0x0073 }
                r3 = 0
                android.net.Uri r0 = r0.mo12878d()     // Catch:{ all -> 0x0073 }
                java.nio.ByteBuffer r0 = com.onedelhi.secure.pk4.m24795f(r2, r3, r0)     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x006b
                if (r1 == 0) goto L_0x006b
                androidx.emoji2.text.f r0 = androidx.emoji2.text.C0575f.m4206e(r1, r0)     // Catch:{ all -> 0x0073 }
                com.onedelhi.secure.cg4.m12479d()     // Catch:{ all -> 0x0094 }
                java.lang.Object r1 = r8.f3619a     // Catch:{ all -> 0x0094 }
                monitor-enter(r1)     // Catch:{ all -> 0x0094 }
                androidx.emoji2.text.c$j r2 = r8.f3615a     // Catch:{ all -> 0x0068 }
                if (r2 == 0) goto L_0x0063
                r2.mo4152b(r0)     // Catch:{ all -> 0x0068 }
            L_0x0063:
                monitor-exit(r1)     // Catch:{ all -> 0x0068 }
                r8.mo4223b()     // Catch:{ all -> 0x0094 }
                goto L_0x00a3
            L_0x0068:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0068 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x006b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x0073 }
                throw r0     // Catch:{ all -> 0x0073 }
            L_0x0073:
                r0 = move-exception
                com.onedelhi.secure.cg4.m12479d()     // Catch:{ all -> 0x0094 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0078:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0094 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
                r2.<init>()     // Catch:{ all -> 0x0094 }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x0094 }
                r2.append(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0094 }
                r0.<init>(r1)     // Catch:{ all -> 0x0094 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0094:
                r0 = move-exception
                java.lang.Object r1 = r8.f3619a
                monitor-enter(r1)
                androidx.emoji2.text.c$j r2 = r8.f3615a     // Catch:{ all -> 0x00a4 }
                if (r2 == 0) goto L_0x009f
                r2.mo4151a(r0)     // Catch:{ all -> 0x00a4 }
            L_0x009f:
                monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
                r8.mo4223b()
            L_0x00a3:
                return
            L_0x00a4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
                throw r0
            L_0x00a7:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0569e.C0572c.mo4224c():void");
        }

        @sj3(19)
        /* renamed from: d */
        public void mo4225d() {
            synchronized (this.f3619a) {
                if (this.f3615a != null) {
                    if (this.f3621a == null) {
                        ThreadPoolExecutor c = h40.m16466c("emojiCompat");
                        this.f3622a = c;
                        this.f3621a = c;
                    }
                    this.f3621a.execute(new v91(this));
                }
            }
        }

        @ly4
        /* renamed from: e */
        public final aa1.C1675c mo4226e() {
            try {
                aa1.C1674b b = this.f3616a.mo4220b(this.f3612a, this.f3618a);
                if (b.mo12875c() == 0) {
                    aa1.C1675c[] b2 = b.mo12874b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo12875c() + pl2.f33727d);
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @sj3(19)
        @ly4
        /* renamed from: f */
        public final void mo4227f(Uri uri, long j) {
            synchronized (this.f3619a) {
                Handler handler = this.f3614a;
                if (handler == null) {
                    handler = h40.m16468e();
                    this.f3614a = handler;
                }
                if (this.f3613a == null) {
                    C0573a aVar = new C0573a(handler);
                    this.f3613a = aVar;
                    this.f3616a.mo4221c(this.f3612a, uri, aVar);
                }
                if (this.f3620a == null) {
                    this.f3620a = new w91(this);
                }
                handler.postDelayed(this.f3620a, j);
            }
        }

        /* renamed from: g */
        public void mo4228g(@mr2 Executor executor) {
            synchronized (this.f3619a) {
                this.f3621a = executor;
            }
        }

        /* renamed from: h */
        public void mo4229h(@ts2 C0574d dVar) {
            synchronized (this.f3619a) {
                this.f3617a = dVar;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public static abstract class C0574d {
        /* renamed from: a */
        public abstract long mo4218a();
    }

    public C0569e(@mr2 Context context, @mr2 u91 u91) {
        super(new C0572c(context, u91, f3608a));
    }

    @hl3({hl3.C2354a.f13185a})
    public C0569e(@mr2 Context context, @mr2 u91 u91, @mr2 C0571b bVar) {
        super(new C0572c(context, u91, bVar));
    }

    @mr2
    @Deprecated
    /* renamed from: k */
    public C0569e mo4215k(@ts2 Handler handler) {
        if (handler == null) {
            return this;
        }
        mo4216l(h40.m16465b(handler));
        return this;
    }

    @mr2
    /* renamed from: l */
    public C0569e mo4216l(@mr2 Executor executor) {
        ((C0572c) mo4192a()).mo4228g(executor);
        return this;
    }

    @mr2
    /* renamed from: m */
    public C0569e mo4217m(@ts2 C0574d dVar) {
        ((C0572c) mo4192a()).mo4229h(dVar);
        return this;
    }
}
