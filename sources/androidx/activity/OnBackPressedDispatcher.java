package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import com.onedelhi.secure.C2365hu;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.ku2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    @ts2

    /* renamed from: a */
    public final Runnable f607a;

    /* renamed from: a */
    public final ArrayDeque<ku2> f608a;

    public class LifecycleOnBackPressedCancellable implements C0694f, C2365hu {

        /* renamed from: a */
        public final C0690e f610a;
        @ts2

        /* renamed from: a */
        public C2365hu f611a;

        /* renamed from: a */
        public final ku2 f612a;

        public LifecycleOnBackPressedCancellable(@mr2 C0690e eVar, @mr2 ku2 ku2) {
            this.f610a = eVar;
            this.f612a = ku2;
            eVar.mo4958a(this);
        }

        public void cancel() {
            this.f610a.mo4960c(this);
            this.f612a.mo19199e(this);
            C2365hu huVar = this.f611a;
            if (huVar != null) {
                huVar.cancel();
                this.f611a = null;
            }
        }

        /* renamed from: g */
        public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
            if (bVar == C0690e.C0692b.ON_START) {
                this.f611a = OnBackPressedDispatcher.this.mo676c(this.f612a);
            } else if (bVar == C0690e.C0692b.ON_STOP) {
                C2365hu huVar = this.f611a;
                if (huVar != null) {
                    huVar.cancel();
                }
            } else if (bVar == C0690e.C0692b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0153a implements C2365hu {

        /* renamed from: a */
        public final ku2 f614a;

        public C0153a(ku2 ku2) {
            this.f614a = ku2;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f608a.remove(this.f614a);
            this.f614a.mo19199e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this((Runnable) null);
    }

    public OnBackPressedDispatcher(@ts2 Runnable runnable) {
        this.f608a = new ArrayDeque<>();
        this.f607a = runnable;
    }

    @bc2
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo674a(@mr2 a32 a32, @mr2 ku2 ku2) {
        C0690e lifecycle = a32.getLifecycle();
        if (lifecycle.mo4959b() != C0690e.C0693c.DESTROYED) {
            ku2.mo19196a(new LifecycleOnBackPressedCancellable(lifecycle, ku2));
        }
    }

    @bc2
    /* renamed from: b */
    public void mo675b(@mr2 ku2 ku2) {
        mo676c(ku2);
    }

    @bc2
    @mr2
    /* renamed from: c */
    public C2365hu mo676c(@mr2 ku2 ku2) {
        this.f608a.add(ku2);
        C0153a aVar = new C0153a(ku2);
        ku2.mo19196a(aVar);
        return aVar;
    }

    @bc2
    /* renamed from: d */
    public boolean mo677d() {
        Iterator<ku2> descendingIterator = this.f608a.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().mo19197c()) {
                return true;
            }
        }
        return false;
    }

    @bc2
    /* renamed from: e */
    public void mo678e() {
        Iterator<ku2> descendingIterator = this.f608a.descendingIterator();
        while (descendingIterator.hasNext()) {
            ku2 next = descendingIterator.next();
            if (next.mo19197c()) {
                next.mo4640b();
                return;
            }
        }
        Runnable runnable = this.f607a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
