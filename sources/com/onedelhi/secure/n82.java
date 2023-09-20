package com.onedelhi.secure;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/n82;", "", "E", "Lcom/onedelhi/secure/un4;", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "f", "(Lcom/onedelhi/secure/ec1;)Ljava/util/List;", "d", "()Z", "e", "isEmpty", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class n82<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32461a = AtomicReferenceFieldUpdater.newUpdater(n82.class, Object.class, "_cur");
    @vr2
    private volatile /* synthetic */ Object _cur;

    public n82(boolean z) {
        this._cur = new o82(8, z);
    }

    /* renamed from: a */
    public final boolean mo41001a(@vr2 E e) {
        while (true) {
            o82 o82 = (o82) this._cur;
            int a = o82.mo41586a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C5759j1.m52871a(f32461a, this, o82, o82.mo41596k());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo41002b() {
        while (true) {
            o82 o82 = (o82) this._cur;
            if (!o82.mo41589d()) {
                C5759j1.m52871a(f32461a, this, o82, o82.mo41596k());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo41003c() {
        return ((o82) this._cur).mo41591f();
    }

    /* renamed from: d */
    public final boolean mo41004d() {
        return ((o82) this._cur).mo41592g();
    }

    /* renamed from: e */
    public final boolean mo41005e() {
        return ((o82) this._cur).mo41593h();
    }

    @vr2
    /* renamed from: f */
    public final <R> List<R> mo41006f(@vr2 ec1<? super E, ? extends R> ec1) {
        return ((o82) this._cur).mo41594i(ec1);
    }

    @ss2
    /* renamed from: g */
    public final E mo41007g() {
        while (true) {
            o82 o82 = (o82) this._cur;
            E l = o82.mo41597l();
            if (l != o82.f32899a) {
                return l;
            }
            C5759j1.m52871a(f32461a, this, o82, o82.mo41596k());
        }
    }
}
