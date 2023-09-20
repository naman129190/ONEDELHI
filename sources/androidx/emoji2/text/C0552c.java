package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0546a;
import com.onedelhi.secure.C2677kx;
import com.onedelhi.secure.C3568t7;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qk4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xs0;
import com.onedelhi.secure.ys0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@C3568t7
/* renamed from: androidx.emoji2.text.c */
public class C0552c {
    @mj1("INSTANCE_LOCK")
    @ts2

    /* renamed from: a */
    public static volatile C0552c f3540a = null;

    /* renamed from: a */
    public static final Object f3541a = new Object();

    /* renamed from: a */
    public static final String f3542a = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* renamed from: b */
    public static final Object f3543b = new Object();

    /* renamed from: b */
    public static final String f3544b = "android.support.text.emoji.emojiCompat_replaceAll";

    /* renamed from: c */
    public static final String f3545c = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: d */
    public static final int f3546d = 3;
    @mj1("CONFIG_LOCK")

    /* renamed from: d */
    public static volatile boolean f3547d = false;

    /* renamed from: e */
    public static final int f3548e = 0;

    /* renamed from: f */
    public static final int f3549f = 1;

    /* renamed from: g */
    public static final int f3550g = 2;

    /* renamed from: h */
    public static final int f3551h = 0;

    /* renamed from: i */
    public static final int f3552i = 1;

    /* renamed from: j */
    public static final int f3553j = 2;

    /* renamed from: k */
    public static final int f3554k = 0;

    /* renamed from: l */
    public static final int f3555l = 1;

    /* renamed from: m */
    public static final int f3556m = 0;

    /* renamed from: n */
    public static final int f3557n = 1;

    /* renamed from: o */
    public static final int f3558o = 2;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: p */
    public static final int f3559p = Integer.MAX_VALUE;
    @mj1("mInitLock")

    /* renamed from: a */
    public volatile int f3560a = 3;
    @mr2

    /* renamed from: a */
    public final Handler f3561a;
    @mr2

    /* renamed from: a */
    public final C0556c f3562a;

    /* renamed from: a */
    public final C0558e f3563a;
    @mr2

    /* renamed from: a */
    public final C0562i f3564a;
    @mj1("mInitLock")
    @mr2

    /* renamed from: a */
    public final Set<C0559f> f3565a;
    @mr2

    /* renamed from: a */
    public final ReadWriteLock f3566a = new ReentrantReadWriteLock();

    /* renamed from: a */
    public final boolean f3567a;
    @ts2

    /* renamed from: a */
    public final int[] f3568a;

    /* renamed from: b */
    public final int f3569b;

    /* renamed from: b */
    public final boolean f3570b;

    /* renamed from: c */
    public final int f3571c;

    /* renamed from: c */
    public final boolean f3572c;

    @hl3({hl3.C2354a.f13185a})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.c$a */
    public @interface C0553a {
    }

    @sj3(19)
    /* renamed from: androidx.emoji2.text.c$b */
    public static final class C0554b extends C0556c {

        /* renamed from: a */
        public volatile C0566d f3573a;

        /* renamed from: a */
        public volatile C0575f f3574a;

        /* renamed from: androidx.emoji2.text.c$b$a */
        public class C0555a extends C0563j {
            public C0555a() {
            }

            /* renamed from: a */
            public void mo4151a(@ts2 Throwable th) {
                C0554b.this.f3576a.mo4177s(th);
            }

            /* renamed from: b */
            public void mo4152b(@mr2 C0575f fVar) {
                C0554b.this.mo4191h(fVar);
            }
        }

        public C0554b(C0552c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public String mo4184a() {
            String N = this.f3574a.mo4233g().mo21287N();
            return N == null ? "" : N;
        }

        /* renamed from: b */
        public int mo4185b(CharSequence charSequence, int i) {
            return this.f3573a.mo4206d(charSequence, i);
        }

        /* renamed from: c */
        public boolean mo4186c(@mr2 CharSequence charSequence) {
            return this.f3573a.mo4205c(charSequence) == 1;
        }

        /* renamed from: d */
        public boolean mo4187d(@mr2 CharSequence charSequence, int i) {
            return this.f3573a.mo4206d(charSequence, i) == 1;
        }

        /* renamed from: e */
        public void mo4188e() {
            try {
                this.f3576a.f3564a.mo4149a(new C0555a());
            } catch (Throwable th) {
                this.f3576a.mo4177s(th);
            }
        }

        /* renamed from: f */
        public CharSequence mo4189f(@mr2 CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3573a.mo4208j(charSequence, i, i2, i3, z);
        }

        /* renamed from: g */
        public void mo4190g(@mr2 EditorInfo editorInfo) {
            editorInfo.extras.putInt(C0552c.f3542a, this.f3574a.mo4234h());
            editorInfo.extras.putBoolean(C0552c.f3544b, this.f3576a.f3567a);
        }

        /* renamed from: h */
        public void mo4191h(@mr2 C0575f fVar) {
            if (fVar == null) {
                this.f3576a.mo4177s(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3574a = fVar;
            C0575f fVar2 = this.f3574a;
            C0565l lVar = new C0565l();
            C0558e a = this.f3576a.f3563a;
            C0552c cVar = this.f3576a;
            this.f3573a = new C0566d(fVar2, lVar, a, cVar.f3570b, cVar.f3568a);
            this.f3576a.mo4178t();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C0556c {

        /* renamed from: a */
        public final C0552c f3576a;

        public C0556c(C0552c cVar) {
            this.f3576a = cVar;
        }

        /* renamed from: a */
        public String mo4184a() {
            return "";
        }

        /* renamed from: b */
        public int mo4185b(CharSequence charSequence, int i) {
            return 0;
        }

        /* renamed from: c */
        public boolean mo4186c(@mr2 CharSequence charSequence) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4187d(@mr2 CharSequence charSequence, int i) {
            return false;
        }

        /* renamed from: e */
        public void mo4188e() {
            this.f3576a.mo4178t();
        }

        /* renamed from: f */
        public CharSequence mo4189f(@mr2 CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2, @js1(from = 0) int i3, boolean z) {
            return charSequence;
        }

        /* renamed from: g */
        public void mo4190g(@mr2 EditorInfo editorInfo) {
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static abstract class C0557d {

        /* renamed from: a */
        public int f3577a = -16711936;
        @mr2

        /* renamed from: a */
        public C0558e f3578a = new C0551b();
        @mr2

        /* renamed from: a */
        public final C0562i f3579a;
        @ts2

        /* renamed from: a */
        public Set<C0559f> f3580a;

        /* renamed from: a */
        public boolean f3581a;
        @ts2

        /* renamed from: a */
        public int[] f3582a;

        /* renamed from: b */
        public int f3583b = 0;

        /* renamed from: b */
        public boolean f3584b;

        /* renamed from: c */
        public boolean f3585c;

        public C0557d(@mr2 C0562i iVar) {
            k43.m19456m(iVar, "metadataLoader cannot be null.");
            this.f3579a = iVar;
        }

        @mr2
        /* renamed from: a */
        public final C0562i mo4192a() {
            return this.f3579a;
        }

        @mr2
        /* renamed from: b */
        public C0557d mo4193b(@mr2 C0559f fVar) {
            k43.m19456m(fVar, "initCallback cannot be null");
            if (this.f3580a == null) {
                this.f3580a = new C3679ua();
            }
            this.f3580a.add(fVar);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C0557d mo4194c(@d10 int i) {
            this.f3577a = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C0557d mo4195d(boolean z) {
            this.f3585c = z;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C0557d mo4196e(@mr2 C0558e eVar) {
            k43.m19456m(eVar, "GlyphChecker cannot be null");
            this.f3578a = eVar;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C0557d mo4197f(int i) {
            this.f3583b = i;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C0557d mo4198g(boolean z) {
            this.f3581a = z;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C0557d mo4199h(boolean z) {
            return mo4200i(z, (List<Integer>) null);
        }

        @mr2
        /* renamed from: i */
        public C0557d mo4200i(boolean z, @ts2 List<Integer> list) {
            this.f3584b = z;
            if (!z || list == null) {
                this.f3582a = null;
            } else {
                this.f3582a = new int[list.size()];
                int i = 0;
                for (Integer intValue : list) {
                    this.f3582a[i] = intValue.intValue();
                    i++;
                }
                Arrays.sort(this.f3582a);
            }
            return this;
        }

        @mr2
        /* renamed from: j */
        public C0557d mo4201j(@mr2 C0559f fVar) {
            k43.m19456m(fVar, "initCallback cannot be null");
            Set<C0559f> set = this.f3580a;
            if (set != null) {
                set.remove(fVar);
            }
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.c$e */
    public interface C0558e {
        /* renamed from: a */
        boolean mo4164a(@mr2 CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2, @js1(from = 0) int i3);
    }

    /* renamed from: androidx.emoji2.text.c$f */
    public static abstract class C0559f {
        /* renamed from: a */
        public void mo2332a(@ts2 Throwable th) {
        }

        /* renamed from: b */
        public void mo2333b() {
        }
    }

    /* renamed from: androidx.emoji2.text.c$g */
    public static class C0560g implements Runnable {

        /* renamed from: a */
        public final Throwable f3586a;

        /* renamed from: a */
        public final List<C0559f> f3587a;

        /* renamed from: n */
        public final int f3588n;

        public C0560g(@mr2 C0559f fVar, int i) {
            this(Arrays.asList(new C0559f[]{(C0559f) k43.m19456m(fVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        public C0560g(@mr2 Collection<C0559f> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        public C0560g(@mr2 Collection<C0559f> collection, int i, @ts2 Throwable th) {
            k43.m19456m(collection, "initCallbacks cannot be null");
            this.f3587a = new ArrayList(collection);
            this.f3588n = i;
            this.f3586a = th;
        }

        public void run() {
            int size = this.f3587a.size();
            int i = 0;
            if (this.f3588n != 1) {
                while (i < size) {
                    this.f3587a.get(i).mo2332a(this.f3586a);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f3587a.get(i).mo2333b();
                i++;
            }
        }
    }

    @hl3({hl3.C2354a.f13185a})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.c$h */
    public @interface C0561h {
    }

    /* renamed from: androidx.emoji2.text.c$i */
    public interface C0562i {
        /* renamed from: a */
        void mo4149a(@mr2 C0563j jVar);
    }

    /* renamed from: androidx.emoji2.text.c$j */
    public static abstract class C0563j {
        /* renamed from: a */
        public abstract void mo4151a(@ts2 Throwable th);

        /* renamed from: b */
        public abstract void mo4152b(@mr2 C0575f fVar);
    }

    @hl3({hl3.C2354a.f13185a})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.c$k */
    public @interface C0564k {
    }

    @sj3(19)
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.c$l */
    public static class C0565l {
        /* renamed from: a */
        public ys0 mo4203a(@mr2 xs0 xs0) {
            return new qk4(xs0);
        }
    }

    public C0552c(@mr2 C0557d dVar) {
        this.f3567a = dVar.f3581a;
        this.f3570b = dVar.f3584b;
        this.f3568a = dVar.f3582a;
        this.f3572c = dVar.f3585c;
        this.f3569b = dVar.f3577a;
        this.f3564a = dVar.f3579a;
        this.f3571c = dVar.f3583b;
        this.f3563a = dVar.f3578a;
        this.f3561a = new Handler(Looper.getMainLooper());
        C3679ua uaVar = new C3679ua();
        this.f3565a = uaVar;
        Set<C0559f> set = dVar.f3580a;
        if (set != null && !set.isEmpty()) {
            uaVar.addAll(dVar.f3580a);
        }
        this.f3562a = new C0554b(this);
        mo4176r();
    }

    @ts2
    @hl3({hl3.C2354a.f13190e})
    /* renamed from: A */
    public static C0552c m4102A(@ts2 C0552c cVar) {
        C0552c cVar2;
        synchronized (f3541a) {
            f3540a = cVar;
            cVar2 = f3540a;
        }
        return cVar2;
    }

    @hl3({hl3.C2354a.f13190e})
    /* renamed from: B */
    public static void m4103B(boolean z) {
        synchronized (f3543b) {
            f3547d = z;
        }
    }

    @mr2
    /* renamed from: b */
    public static C0552c m4105b() {
        C0552c cVar;
        synchronized (f3541a) {
            cVar = f3540a;
            k43.m19458o(cVar != null, f3545c);
        }
        return cVar;
    }

    /* renamed from: g */
    public static boolean m4106g(@mr2 InputConnection inputConnection, @mr2 Editable editable, @js1(from = 0) int i, @js1(from = 0) int i2, boolean z) {
        return C0566d.m4167e(inputConnection, editable, i, i2, z);
    }

    /* renamed from: h */
    public static boolean m4107h(@mr2 Editable editable, int i, @mr2 KeyEvent keyEvent) {
        return C0566d.m4168f(editable, i, keyEvent);
    }

    @ts2
    /* renamed from: k */
    public static C0552c m4108k(@mr2 Context context) {
        return m4109l(context, (C0546a.C0547a) null);
    }

    @ts2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: l */
    public static C0552c m4109l(@mr2 Context context, @ts2 C0546a.C0547a aVar) {
        C0552c cVar;
        if (f3547d) {
            return f3540a;
        }
        if (aVar == null) {
            aVar = new C0546a.C0547a((C0546a.C0548b) null);
        }
        C0557d c = aVar.mo4156c(context);
        synchronized (f3543b) {
            if (!f3547d) {
                if (c != null) {
                    m4110m(c);
                }
                f3547d = true;
            }
            cVar = f3540a;
        }
        return cVar;
    }

    @mr2
    /* renamed from: m */
    public static C0552c m4110m(@mr2 C0557d dVar) {
        C0552c cVar = f3540a;
        if (cVar == null) {
            synchronized (f3541a) {
                cVar = f3540a;
                if (cVar == null) {
                    cVar = new C0552c(dVar);
                    f3540a = cVar;
                }
            }
        }
        return cVar;
    }

    /* renamed from: n */
    public static boolean m4111n() {
        return f3540a != null;
    }

    @mr2
    /* renamed from: z */
    public static C0552c m4112z(@mr2 C0557d dVar) {
        C0552c cVar;
        synchronized (f3541a) {
            cVar = new C0552c(dVar);
            f3540a = cVar;
        }
        return cVar;
    }

    /* renamed from: C */
    public void mo4165C(@mr2 C0559f fVar) {
        k43.m19456m(fVar, "initCallback cannot be null");
        this.f3566a.writeLock().lock();
        try {
            this.f3565a.remove(fVar);
        } finally {
            this.f3566a.writeLock().unlock();
        }
    }

    /* renamed from: D */
    public void mo4166D(@mr2 EditorInfo editorInfo) {
        if (mo4174p() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3562a.mo4190g(editorInfo);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo4167c() {
        k43.m19458o(mo4174p(), "Not initialized yet");
        return this.f3562a.mo4184a();
    }

    /* renamed from: d */
    public int mo4168d(@mr2 CharSequence charSequence, @js1(from = 0) int i) {
        k43.m19458o(mo4174p(), "Not initialized yet");
        k43.m19456m(charSequence, "sequence cannot be null");
        return this.f3562a.mo4185b(charSequence, i);
    }

    @d10
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: e */
    public int mo4169e() {
        return this.f3569b;
    }

    /* renamed from: f */
    public int mo4170f() {
        this.f3566a.readLock().lock();
        try {
            return this.f3560a;
        } finally {
            this.f3566a.readLock().unlock();
        }
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo4171i(@mr2 CharSequence charSequence) {
        k43.m19458o(mo4174p(), "Not initialized yet");
        k43.m19456m(charSequence, "sequence cannot be null");
        return this.f3562a.mo4186c(charSequence);
    }

    @Deprecated
    /* renamed from: j */
    public boolean mo4172j(@mr2 CharSequence charSequence, @js1(from = 0) int i) {
        k43.m19458o(mo4174p(), "Not initialized yet");
        k43.m19456m(charSequence, "sequence cannot be null");
        return this.f3562a.mo4187d(charSequence, i);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: o */
    public boolean mo4173o() {
        return this.f3572c;
    }

    /* renamed from: p */
    public final boolean mo4174p() {
        return mo4170f() == 1;
    }

    /* renamed from: q */
    public void mo4175q() {
        boolean z = true;
        if (this.f3571c != 1) {
            z = false;
        }
        k43.m19458o(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!mo4174p()) {
            this.f3566a.writeLock().lock();
            try {
                if (this.f3560a != 0) {
                    this.f3560a = 0;
                    this.f3566a.writeLock().unlock();
                    this.f3562a.mo4188e();
                }
            } finally {
                this.f3566a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r */
    public final void mo4176r() {
        this.f3566a.writeLock().lock();
        try {
            if (this.f3571c == 0) {
                this.f3560a = 0;
            }
            this.f3566a.writeLock().unlock();
            if (mo4170f() == 0) {
                this.f3562a.mo4188e();
            }
        } catch (Throwable th) {
            this.f3566a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public void mo4177s(@ts2 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3566a.writeLock().lock();
        try {
            this.f3560a = 2;
            arrayList.addAll(this.f3565a);
            this.f3565a.clear();
            this.f3566a.writeLock().unlock();
            this.f3561a.post(new C0560g(arrayList, this.f3560a, th));
        } catch (Throwable th2) {
            this.f3566a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public void mo4178t() {
        ArrayList arrayList = new ArrayList();
        this.f3566a.writeLock().lock();
        try {
            this.f3560a = 1;
            arrayList.addAll(this.f3565a);
            this.f3565a.clear();
            this.f3566a.writeLock().unlock();
            this.f3561a.post(new C0560g((Collection<C0559f>) arrayList, this.f3560a));
        } catch (Throwable th) {
            this.f3566a.writeLock().unlock();
            throw th;
        }
    }

    @C2677kx
    @ts2
    /* renamed from: u */
    public CharSequence mo4179u(@ts2 CharSequence charSequence) {
        return mo4180v(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @C2677kx
    @ts2
    /* renamed from: v */
    public CharSequence mo4180v(@ts2 CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2) {
        return mo4181w(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @C2677kx
    @ts2
    /* renamed from: w */
    public CharSequence mo4181w(@ts2 CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2, @js1(from = 0) int i3) {
        return mo4182x(charSequence, i, i2, i3, 0);
    }

    @C2677kx
    @ts2
    /* renamed from: x */
    public CharSequence mo4182x(@ts2 CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2, @js1(from = 0) int i3, int i4) {
        k43.m19458o(mo4174p(), "Not initialized yet");
        k43.m19453j(i, "start cannot be negative");
        k43.m19453j(i2, "end cannot be negative");
        k43.m19453j(i3, "maxEmojiCount cannot be negative");
        k43.m19445b(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        k43.m19445b(i <= charSequence.length(), "start should be < than charSequence length");
        k43.m19445b(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.f3562a.mo4189f(charSequence, i, i2, i3, i4 != 1 ? i4 != 2 ? this.f3567a : false : true);
    }

    /* renamed from: y */
    public void mo4183y(@mr2 C0559f fVar) {
        k43.m19456m(fVar, "initCallback cannot be null");
        this.f3566a.writeLock().lock();
        try {
            if (this.f3560a != 1) {
                if (this.f3560a != 2) {
                    this.f3565a.add(fVar);
                }
            }
            this.f3561a.post(new C0560g(fVar, this.f3560a));
        } finally {
            this.f3566a.writeLock().unlock();
        }
    }
}
