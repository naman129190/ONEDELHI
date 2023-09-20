package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C0709m;
import com.onedelhi.secure.i62;
import com.onedelhi.secure.j62;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

public class k62 extends j62 {

    /* renamed from: a */
    public static final String f14751a = "LoaderManager";

    /* renamed from: a */
    public static boolean f14752a = false;
    @mr2

    /* renamed from: a */
    public final a32 f14753a;
    @mr2

    /* renamed from: a */
    public final C2605c f14754a;

    /* renamed from: com.onedelhi.secure.k62$a */
    public static class C2603a<D> extends lm2<D> implements i62.C2401c<D> {
        @ts2

        /* renamed from: a */
        public final Bundle f14755a;

        /* renamed from: a */
        public a32 f14756a;
        @mr2

        /* renamed from: a */
        public final i62<D> f14757a;

        /* renamed from: a */
        public C2604b<D> f14758a;

        /* renamed from: b */
        public i62<D> f14759b;

        /* renamed from: d */
        public final int f14760d;

        public C2603a(int i, @ts2 Bundle bundle, @mr2 i62<D> i62, @ts2 i62<D> i622) {
            this.f14760d = i;
            this.f14755a = bundle;
            this.f14757a = i62;
            this.f14759b = i622;
            i62.mo17617u(i, this);
        }

        /* renamed from: a */
        public void mo17626a(@mr2 i62<D> i62, @ts2 D d) {
            if (k62.f14752a) {
                Log.v(k62.f14751a, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4933q(d);
                return;
            }
            if (k62.f14752a) {
                Log.w(k62.f14751a, "onLoadComplete was incorrectly called on a background thread");
            }
            mo4930n(d);
        }

        /* renamed from: l */
        public void mo4928l() {
            if (k62.f14752a) {
                Log.v(k62.f14751a, "  Starting: " + this);
            }
            this.f14757a.mo17621y();
        }

        /* renamed from: m */
        public void mo4929m() {
            if (k62.f14752a) {
                Log.v(k62.f14751a, "  Stopping: " + this);
            }
            this.f14757a.mo17622z();
        }

        /* renamed from: o */
        public void mo4931o(@mr2 bu2<? super D> bu2) {
            super.mo4931o(bu2);
            this.f14756a = null;
            this.f14758a = null;
        }

        /* renamed from: q */
        public void mo4933q(D d) {
            super.mo4933q(d);
            i62<D> i62 = this.f14759b;
            if (i62 != null) {
                i62.mo17619w();
                this.f14759b = null;
            }
        }

        @bc2
        /* renamed from: r */
        public i62<D> mo18905r(boolean z) {
            if (k62.f14752a) {
                Log.v(k62.f14751a, "  Destroying: " + this);
            }
            this.f14757a.mo17602b();
            this.f14757a.mo17601a();
            C2604b<D> bVar = this.f14758a;
            if (bVar != null) {
                mo4931o(bVar);
                if (z) {
                    bVar.mo18914d();
                }
            }
            this.f14757a.mo17599B(this);
            if ((bVar == null || bVar.mo18913c()) && !z) {
                return this.f14757a;
            }
            this.f14757a.mo17619w();
            return this.f14759b;
        }

        /* renamed from: s */
        public void mo18906s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f14760d);
            printWriter.print(" mArgs=");
            printWriter.println(this.f14755a);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f14757a);
            i62<D> i62 = this.f14757a;
            i62.mo12988g(str + yg1.C3999a.f23084c, fileDescriptor, printWriter, strArr);
            if (this.f14758a != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f14758a);
                C2604b<D> bVar = this.f14758a;
                bVar.mo18912a(str + yg1.C3999a.f23084c, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo18907t().mo17604d(mo4922f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo4924h());
        }

        @mr2
        /* renamed from: t */
        public i62<D> mo18907t() {
            return this.f14757a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f14760d);
            sb.append(" : ");
            jf0.m18532a(this.f14757a, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            r0 = r2.f14758a;
         */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo18909u() {
            /*
                r2 = this;
                boolean r0 = r2.mo4924h()
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                com.onedelhi.secure.k62$b<D> r0 = r2.f14758a
                if (r0 == 0) goto L_0x0013
                boolean r0 = r0.mo18913c()
                if (r0 != 0) goto L_0x0013
                r1 = 1
            L_0x0013:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.k62.C2603a.mo18909u():boolean");
        }

        /* renamed from: v */
        public void mo18910v() {
            a32 a32 = this.f14756a;
            C2604b<D> bVar = this.f14758a;
            if (a32 != null && bVar != null) {
                super.mo4931o(bVar);
                mo4926j(a32, bVar);
            }
        }

        @bc2
        @mr2
        /* renamed from: w */
        public i62<D> mo18911w(@mr2 a32 a32, @mr2 j62.C2476a<D> aVar) {
            C2604b<D> bVar = new C2604b<>(this.f14757a, aVar);
            mo4926j(a32, bVar);
            C2604b<D> bVar2 = this.f14758a;
            if (bVar2 != null) {
                mo4931o(bVar2);
            }
            this.f14756a = a32;
            this.f14758a = bVar;
            return this.f14757a;
        }
    }

    /* renamed from: com.onedelhi.secure.k62$b */
    public static class C2604b<D> implements bu2<D> {
        @mr2

        /* renamed from: a */
        public final i62<D> f14761a;
        @mr2

        /* renamed from: a */
        public final j62.C2476a<D> f14762a;

        /* renamed from: a */
        public boolean f14763a = false;

        public C2604b(@mr2 i62<D> i62, @mr2 j62.C2476a<D> aVar) {
            this.f14761a = i62;
            this.f14762a = aVar;
        }

        /* renamed from: a */
        public void mo18912a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f14763a);
        }

        /* renamed from: b */
        public void mo3946b(@ts2 D d) {
            if (k62.f14752a) {
                Log.v(k62.f14751a, "  onLoadFinished in " + this.f14761a + ": " + this.f14761a.mo17604d(d));
            }
            this.f14762a.mo17158c(this.f14761a, d);
            this.f14763a = true;
        }

        /* renamed from: c */
        public boolean mo18913c() {
            return this.f14763a;
        }

        @bc2
        /* renamed from: d */
        public void mo18914d() {
            if (this.f14763a) {
                if (k62.f14752a) {
                    Log.v(k62.f14751a, "  Resetting: " + this.f14761a);
                }
                this.f14762a.mo17157b(this.f14761a);
            }
        }

        public String toString() {
            return this.f14762a.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.k62$c */
    public static class C2605c extends au4 {

        /* renamed from: a */
        public static final C0709m.C0713b f14764a = new C2606a();

        /* renamed from: a */
        public k14<C2603a> f14765a = new k14<>();

        /* renamed from: a */
        public boolean f14766a = false;

        /* renamed from: com.onedelhi.secure.k62$c$a */
        public static class C2606a implements C0709m.C0713b {
            /* renamed from: a */
            public /* synthetic */ au4 mo4943a(Class cls, jb0 jb0) {
                return eu4.m14374b(this, cls, jb0);
            }

            @mr2
            /* renamed from: b */
            public <T extends au4> T mo4944b(@mr2 Class<T> cls) {
                return new C2605c();
            }
        }

        @mr2
        /* renamed from: e */
        public static C2605c m19496e(gu4 gu4) {
            return (C2605c) new C0709m(gu4, f14764a).mo5027a(C2605c.class);
        }

        /* renamed from: b */
        public void mo18916b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f14765a.mo18866x() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f14765a.mo18866x(); i++) {
                    C2603a y = this.f14765a.mo18867y(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f14765a.mo18854m(i));
                    printWriter.print(": ");
                    printWriter.println(y.toString());
                    y.mo18906s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: d */
        public void mo18917d() {
            this.f14766a = false;
        }

        /* renamed from: f */
        public <D> C2603a<D> mo18918f(int i) {
            return this.f14765a.mo18849h(i);
        }

        /* renamed from: g */
        public boolean mo18919g() {
            int x = this.f14765a.mo18866x();
            for (int i = 0; i < x; i++) {
                if (this.f14765a.mo18867y(i).mo18909u()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public boolean mo18920i() {
            return this.f14766a;
        }

        /* renamed from: j */
        public void mo18921j() {
            int x = this.f14765a.mo18866x();
            for (int i = 0; i < x; i++) {
                this.f14765a.mo18867y(i).mo18910v();
            }
        }

        /* renamed from: k */
        public void mo18922k(int i, @mr2 C2603a aVar) {
            this.f14765a.mo18855n(i, aVar);
        }

        /* renamed from: l */
        public void mo18923l(int i) {
            this.f14765a.mo18858q(i);
        }

        /* renamed from: m */
        public void mo18924m() {
            this.f14766a = true;
        }

        public void onCleared() {
            super.onCleared();
            int x = this.f14765a.mo18866x();
            for (int i = 0; i < x; i++) {
                this.f14765a.mo18867y(i).mo18905r(true);
            }
            this.f14765a.mo18842b();
        }
    }

    public k62(@mr2 a32 a32, @mr2 gu4 gu4) {
        this.f14753a = a32;
        this.f14754a = C2605c.m19496e(gu4);
    }

    @bc2
    /* renamed from: a */
    public void mo18147a(int i) {
        if (this.f14754a.mo18920i()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f14752a) {
                Log.v(f14751a, "destroyLoader in " + this + " of " + i);
            }
            C2603a f = this.f14754a.mo18918f(i);
            if (f != null) {
                f.mo18905r(true);
                this.f14754a.mo18923l(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo18148b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f14754a.mo18916b(str, fileDescriptor, printWriter, strArr);
    }

    @ts2
    /* renamed from: e */
    public <D> i62<D> mo18149e(int i) {
        if (!this.f14754a.mo18920i()) {
            C2603a f = this.f14754a.mo18918f(i);
            if (f != null) {
                return f.mo18907t();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    /* renamed from: f */
    public boolean mo18150f() {
        return this.f14754a.mo18919g();
    }

    @bc2
    @mr2
    /* renamed from: g */
    public <D> i62<D> mo18151g(int i, @ts2 Bundle bundle, @mr2 j62.C2476a<D> aVar) {
        if (this.f14754a.mo18920i()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C2603a f = this.f14754a.mo18918f(i);
            if (f14752a) {
                Log.v(f14751a, "initLoader in " + this + ": args=" + bundle);
            }
            if (f == null) {
                return mo18903j(i, bundle, aVar, (i62) null);
            }
            if (f14752a) {
                Log.v(f14751a, "  Re-using existing loader " + f);
            }
            return f.mo18911w(this.f14753a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: h */
    public void mo18152h() {
        this.f14754a.mo18921j();
    }

    @bc2
    @mr2
    /* renamed from: i */
    public <D> i62<D> mo18153i(int i, @ts2 Bundle bundle, @mr2 j62.C2476a<D> aVar) {
        if (this.f14754a.mo18920i()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f14752a) {
                Log.v(f14751a, "restartLoader in " + this + ": args=" + bundle);
            }
            C2603a f = this.f14754a.mo18918f(i);
            i62 i62 = null;
            if (f != null) {
                i62 = f.mo18905r(false);
            }
            return mo18903j(i, bundle, aVar, i62);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    @bc2
    @mr2
    /* renamed from: j */
    public final <D> i62<D> mo18903j(int i, @ts2 Bundle bundle, @mr2 j62.C2476a<D> aVar, @ts2 i62<D> i62) {
        try {
            this.f14754a.mo18924m();
            i62<D> a = aVar.mo17156a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a);
                    }
                }
                C2603a aVar2 = new C2603a(i, bundle, a, i62);
                if (f14752a) {
                    Log.v(f14751a, "  Created new loader " + aVar2);
                }
                this.f14754a.mo18922k(i, aVar2);
                this.f14754a.mo18917d();
                return aVar2.mo18911w(this.f14753a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f14754a.mo18917d();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        jf0.m18532a(this.f14753a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
