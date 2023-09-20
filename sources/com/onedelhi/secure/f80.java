package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/f80;", "Lcom/onedelhi/secure/b90$b;", "T", "Lcom/onedelhi/secure/b80;", "continuation", "u0", "Lcom/onedelhi/secure/un4;", "e0", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "Lcom/onedelhi/secure/b90;", "minusKey", "b", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public interface f80 extends b90.C4634b {
    @vr2

    /* renamed from: a */
    public static final C5217b f28189a = C5217b.f28190b;

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.f80$a */
    public static final class C5216a {
        /* renamed from: a */
        public static <R> R m47595a(@vr2 f80 f80, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            jt1.m53777p(sc1, "operation");
            return b90.C4634b.C4635a.m39502a(f80, r, sc1);
        }

        @ss2
        /* renamed from: b */
        public static <E extends b90.C4634b> E m47596b(@vr2 f80 f80, @vr2 b90.C4636c<E> cVar) {
            jt1.m53777p(cVar, "key");
            if (cVar instanceof C6161n0) {
                C6161n0 n0Var = (C6161n0) cVar;
                if (!n0Var.mo40886a(f80.getKey())) {
                    return null;
                }
                E b = n0Var.mo40887b(f80);
                if (b instanceof b90.C4634b) {
                    return b;
                }
                return null;
            } else if (f80.f28189a != cVar) {
                return null;
            } else {
                jt1.m53775n(f80, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return f80;
            }
        }

        @vr2
        /* renamed from: c */
        public static b90 m47597c(@vr2 f80 f80, @vr2 b90.C4636c<?> cVar) {
            jt1.m53777p(cVar, "key");
            if (!(cVar instanceof C6161n0)) {
                return f80.f28189a == cVar ? gt0.f29313a : f80;
            }
            C6161n0 n0Var = (C6161n0) cVar;
            return (!n0Var.mo40886a(f80.getKey()) || n0Var.mo40887b(f80) == null) ? f80 : gt0.f29313a;
        }

        @vr2
        /* renamed from: d */
        public static b90 m47598d(@vr2 f80 f80, @vr2 b90 b90) {
            jt1.m53777p(b90, "context");
            return b90.C4634b.C4635a.m39505d(f80, b90);
        }

        /* renamed from: e */
        public static void m47599e(@vr2 f80 f80, @vr2 b80<?> b80) {
            jt1.m53777p(b80, "continuation");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/f80$b;", "Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/f80;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.f80$b */
    public static final class C5217b implements b90.C4636c<f80> {

        /* renamed from: b */
        public static final /* synthetic */ C5217b f28190b = new C5217b();
    }

    /* renamed from: e0 */
    void mo34866e0(@vr2 b80<?> b80);

    @ss2
    <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar);

    @vr2
    b90 minusKey(@vr2 b90.C4636c<?> cVar);

    @vr2
    /* renamed from: u0 */
    <T> b80<T> mo34867u0(@vr2 b80<? super T> b80);
}
