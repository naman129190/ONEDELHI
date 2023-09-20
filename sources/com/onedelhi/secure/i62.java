package com.onedelhi.secure;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class i62<D> {

    /* renamed from: a */
    public int f13494a;

    /* renamed from: a */
    public Context f13495a;

    /* renamed from: a */
    public C2400b<D> f13496a;

    /* renamed from: a */
    public C2401c<D> f13497a;

    /* renamed from: a */
    public boolean f13498a = false;

    /* renamed from: b */
    public boolean f13499b = false;

    /* renamed from: c */
    public boolean f13500c = true;

    /* renamed from: d */
    public boolean f13501d = false;

    /* renamed from: e */
    public boolean f13502e = false;

    /* renamed from: com.onedelhi.secure.i62$a */
    public final class C2399a extends ContentObserver {
        public C2399a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            i62.this.mo17614p();
        }
    }

    /* renamed from: com.onedelhi.secure.i62$b */
    public interface C2400b<D> {
        /* renamed from: a */
        void mo17625a(@mr2 i62<D> i62);
    }

    /* renamed from: com.onedelhi.secure.i62$c */
    public interface C2401c<D> {
        /* renamed from: a */
        void mo17626a(@mr2 i62<D> i62, @ts2 D d);
    }

    public i62(@mr2 Context context) {
        this.f13495a = context.getApplicationContext();
    }

    /* renamed from: A */
    public boolean mo17598A() {
        boolean z = this.f13501d;
        this.f13501d = false;
        this.f13502e |= z;
        return z;
    }

    @bc2
    /* renamed from: B */
    public void mo17599B(@mr2 C2401c<D> cVar) {
        C2401c<D> cVar2 = this.f13497a;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f13497a = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @bc2
    /* renamed from: C */
    public void mo17600C(@mr2 C2400b<D> bVar) {
        C2400b<D> bVar2 = this.f13496a;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f13496a = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @bc2
    /* renamed from: a */
    public void mo17601a() {
        this.f13499b = true;
        mo17612n();
    }

    @bc2
    /* renamed from: b */
    public boolean mo17602b() {
        return mo17613o();
    }

    /* renamed from: c */
    public void mo17603c() {
        this.f13502e = false;
    }

    @mr2
    /* renamed from: d */
    public String mo17604d(@ts2 D d) {
        StringBuilder sb = new StringBuilder(64);
        jf0.m18532a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @bc2
    /* renamed from: e */
    public void mo17605e() {
        C2400b<D> bVar = this.f13496a;
        if (bVar != null) {
            bVar.mo17625a(this);
        }
    }

    @bc2
    /* renamed from: f */
    public void mo12987f(@ts2 D d) {
        C2401c<D> cVar = this.f13497a;
        if (cVar != null) {
            cVar.mo17626a(this, d);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo12988g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13494a);
        printWriter.print(" mListener=");
        printWriter.println(this.f13497a);
        if (this.f13498a || this.f13501d || this.f13502e) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f13498a);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f13501d);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f13502e);
        }
        if (this.f13499b || this.f13500c) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f13499b);
            printWriter.print(" mReset=");
            printWriter.println(this.f13500c);
        }
    }

    @bc2
    /* renamed from: h */
    public void mo17606h() {
        mo17615q();
    }

    @mr2
    /* renamed from: i */
    public Context mo17607i() {
        return this.f13495a;
    }

    /* renamed from: j */
    public int mo17608j() {
        return this.f13494a;
    }

    /* renamed from: k */
    public boolean mo17609k() {
        return this.f13499b;
    }

    /* renamed from: l */
    public boolean mo17610l() {
        return this.f13500c;
    }

    /* renamed from: m */
    public boolean mo17611m() {
        return this.f13498a;
    }

    @bc2
    /* renamed from: n */
    public void mo17612n() {
    }

    @bc2
    /* renamed from: o */
    public boolean mo17613o() {
        return false;
    }

    @bc2
    /* renamed from: p */
    public void mo17614p() {
        if (this.f13498a) {
            mo17606h();
        } else {
            this.f13501d = true;
        }
    }

    @bc2
    /* renamed from: q */
    public void mo17615q() {
    }

    @bc2
    /* renamed from: r */
    public void mo12989r() {
    }

    @bc2
    /* renamed from: s */
    public void mo12814s() {
    }

    @bc2
    /* renamed from: t */
    public void mo12990t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        jf0.m18532a(this, sb);
        sb.append(" id=");
        sb.append(this.f13494a);
        sb.append("}");
        return sb.toString();
    }

    @bc2
    /* renamed from: u */
    public void mo17617u(int i, @mr2 C2401c<D> cVar) {
        if (this.f13497a == null) {
            this.f13497a = cVar;
            this.f13494a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @bc2
    /* renamed from: v */
    public void mo17618v(@mr2 C2400b<D> bVar) {
        if (this.f13496a == null) {
            this.f13496a = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @bc2
    /* renamed from: w */
    public void mo17619w() {
        mo12989r();
        this.f13500c = true;
        this.f13498a = false;
        this.f13499b = false;
        this.f13501d = false;
        this.f13502e = false;
    }

    /* renamed from: x */
    public void mo17620x() {
        if (this.f13502e) {
            mo17614p();
        }
    }

    @bc2
    /* renamed from: y */
    public final void mo17621y() {
        this.f13498a = true;
        this.f13500c = false;
        this.f13499b = false;
        mo12814s();
    }

    @bc2
    /* renamed from: z */
    public void mo17622z() {
        this.f13498a = false;
        mo12990t();
    }
}
