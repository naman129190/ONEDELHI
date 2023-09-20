package com.onedelhi.secure;

import com.onedelhi.secure.f80;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/b90;", "", "Lcom/onedelhi/secure/b90$b;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "context", "plus", "minusKey", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public interface b90 {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.b90$a */
    public static final class C4632a {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/onedelhi/secure/b90;", "acc", "Lcom/onedelhi/secure/b90$b;", "element", "a", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/b90$b;)Lcom/onedelhi/secure/b90;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.b90$a$a */
        public static final class C4633a extends d12 implements sc1<b90, C4634b, b90> {

            /* renamed from: a */
            public static final C4633a f26182a = new C4633a();

            public C4633a() {
                super(2);
            }

            @vr2
            /* renamed from: a */
            public final b90 mo21054h0(@vr2 b90 b90, @vr2 C4634b bVar) {
                t10 t10;
                jt1.m53777p(b90, "acc");
                jt1.m53777p(bVar, "element");
                b90 minusKey = b90.minusKey(bVar.getKey());
                gt0 gt0 = gt0.f29313a;
                if (minusKey == gt0) {
                    return bVar;
                }
                f80.C5217b bVar2 = f80.f28189a;
                f80 f80 = (f80) minusKey.get(bVar2);
                if (f80 == null) {
                    t10 = new t10(minusKey, bVar);
                } else {
                    b90 minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == gt0) {
                        return new t10(bVar, f80);
                    }
                    t10 = new t10(new t10(minusKey2, bVar), f80);
                }
                return t10;
            }
        }

        @vr2
        /* renamed from: a */
        public static b90 m39499a(@vr2 b90 b90, @vr2 b90 b902) {
            jt1.m53777p(b902, "context");
            return b902 == gt0.f29313a ? b90 : (b90) b902.fold(b90, C4633a.f26182a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/b90$b;", "Lcom/onedelhi/secure/b90;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "minusKey", "getKey", "()Lcom/onedelhi/secure/b90$c;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.b90$b */
    public interface C4634b extends b90 {

        @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.b90$b$a */
        public static final class C4635a {
            /* renamed from: a */
            public static <R> R m39502a(@vr2 C4634b bVar, R r, @vr2 sc1<? super R, ? super C4634b, ? extends R> sc1) {
                jt1.m53777p(sc1, "operation");
                return sc1.mo21054h0(r, bVar);
            }

            @ss2
            /* renamed from: b */
            public static <E extends C4634b> E m39503b(@vr2 C4634b bVar, @vr2 C4636c<E> cVar) {
                jt1.m53777p(cVar, "key");
                if (!jt1.m53768g(bVar.getKey(), cVar)) {
                    return null;
                }
                jt1.m53775n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            @vr2
            /* renamed from: c */
            public static b90 m39504c(@vr2 C4634b bVar, @vr2 C4636c<?> cVar) {
                jt1.m53777p(cVar, "key");
                return jt1.m53768g(bVar.getKey(), cVar) ? gt0.f29313a : bVar;
            }

            @vr2
            /* renamed from: d */
            public static b90 m39505d(@vr2 C4634b bVar, @vr2 b90 b90) {
                jt1.m53777p(b90, "context");
                return C4632a.m39499a(bVar, b90);
            }
        }

        <R> R fold(R r, @vr2 sc1<? super R, ? super C4634b, ? extends R> sc1);

        @ss2
        <E extends C4634b> E get(@vr2 C4636c<E> cVar);

        @vr2
        C4636c<?> getKey();

        @vr2
        b90 minusKey(@vr2 C4636c<?> cVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/b90$b;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.b90$c */
    public interface C4636c<E extends C4634b> {
    }

    <R> R fold(R r, @vr2 sc1<? super R, ? super C4634b, ? extends R> sc1);

    @ss2
    <E extends C4634b> E get(@vr2 C4636c<E> cVar);

    @vr2
    b90 minusKey(@vr2 C4636c<?> cVar);

    @vr2
    b90 plus(@vr2 b90 b90);
}
