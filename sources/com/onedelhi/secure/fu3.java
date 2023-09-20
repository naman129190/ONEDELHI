package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\bø\u0001\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\b\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001H\u0007\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a@\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u0004\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001a&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u001ab\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001e\"\u0004\b\u0002\u0010\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00020\u0014H\u0000\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a?\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\b\u0010(\u001a\u0004\u0018\u00018\u00002\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0007¢\u0006\u0004\b)\u0010*\u001a<\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u0002\u0007\n\u0005\b20\u0001¨\u0006-"}, d2 = {"T", "Lkotlin/Function0;", "", "iterator", "Lcom/onedelhi/secure/zt3;", "d", "e", "", "elements", "q", "([Ljava/lang/Object;)Lcom/onedelhi/secure/zt3;", "g", "p", "defaultValue", "o", "i", "", "k", "(Lcom/onedelhi/secure/zt3;)Lcom/onedelhi/secure/zt3;", "R", "Lkotlin/Function1;", "j", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/ey2;", "", "t", "r", "Lcom/onedelhi/secure/me3;", "random", "s", "C", "source", "Lkotlin/Function2;", "", "transform", "h", "f", "", "nextFunction", "l", "seed", "n", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/zt3;", "seedFunction", "m", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
public class fu3 extends eu3 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$a */
    public static final class C5312a implements zt3<T> {

        /* renamed from: a */
        public final /* synthetic */ cc1<Iterator<T>> f28666a;

        public C5312a(cc1<? extends Iterator<? extends T>> cc1) {
            this.f28666a = cc1;
        }

        @vr2
        public Iterator<T> iterator() {
            return this.f28666a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$b */
    public static final class C5313b implements zt3<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f28667a;

        public C5313b(Iterator it) {
            this.f28667a = it;
        }

        @vr2
        public Iterator<T> iterator() {
            return this.f28667a;
        }
    }

    @cf0(mo32326c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo32327f = "Sequences.kt", mo32328i = {0, 0}, mo32329l = {332}, mo32330m = "invokeSuspend", mo32331n = {"$this$sequence", "index"}, mo32332s = {"L$0", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@"}, d2 = {"T", "C", "R", "Lcom/onedelhi/secure/bu3;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$c */
    public static final class C5314c extends ll3 implements sc1<bu3<? super R>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ ec1<C, Iterator<R>> f28668a;

        /* renamed from: a */
        public final /* synthetic */ sc1<Integer, T, C> f28669a;

        /* renamed from: a */
        public final /* synthetic */ zt3<T> f28670a;

        /* renamed from: a */
        public Object f28671a;

        /* renamed from: b */
        public /* synthetic */ Object f28672b;

        /* renamed from: o */
        public int f28673o;

        /* renamed from: p */
        public int f28674p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5314c(zt3<? extends T> zt3, sc1<? super Integer, ? super T, ? extends C> sc1, ec1<? super C, ? extends Iterator<? extends R>> ec1, b80<? super C5314c> b80) {
            super(2, b80);
            this.f28670a = zt3;
            this.f28669a = sc1;
            this.f28668a = ec1;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5314c cVar = new C5314c(this.f28670a, this.f28669a, this.f28668a, b80);
            cVar.f28672b = obj;
            return cVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            bu3 bu3;
            Iterator<T> it;
            int i;
            Object h = mt1.m57558h();
            int i2 = this.f28674p;
            if (i2 == 0) {
                pl3.m61436n(obj);
                i = 0;
                it = this.f28670a.iterator();
                bu3 = (bu3) this.f28672b;
            } else if (i2 == 1) {
                i = this.f28673o;
                it = (Iterator) this.f28671a;
                bu3 = (bu3) this.f28672b;
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                T next = it.next();
                sc1<Integer, T, C> sc1 = this.f28669a;
                int i3 = i + 1;
                if (i < 0) {
                    s00.m64055X();
                }
                C h0 = sc1.mo21054h0(C7377yn.m71917f(i), next);
                this.f28672b = bu3;
                this.f28671a = it;
                this.f28673o = i3;
                this.f28674p = 1;
                if (bu3.mo31190m(this.f28668a.mo17094X(h0), this) == h) {
                    return h;
                }
                i = i3;
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super R> bu3, @ss2 b80<? super un4> b80) {
            return ((C5314c) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/onedelhi/secure/zt3;", "it", "", "a", "(Lcom/onedelhi/secure/zt3;)Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$d */
    public static final class C5315d extends d12 implements ec1<zt3<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C5315d f28675a = new C5315d();

        public C5315d() {
            super(1);
        }

        @vr2
        /* renamed from: a */
        public final Iterator<T> mo17094X(@vr2 zt3<? extends T> zt3) {
            jt1.m53777p(zt3, "it");
            return zt3.iterator();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Iterable;)Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$e */
    public static final class C5316e extends d12 implements ec1<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C5316e f28676a = new C5316e();

        public C5316e() {
            super(1);
        }

        @vr2
        /* renamed from: a */
        public final Iterator<T> mo17094X(@vr2 Iterable<? extends T> iterable) {
            jt1.m53777p(iterable, "it");
            return iterable.iterator();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "it", "X", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$f */
    public static final class C5317f extends d12 implements ec1<T, T> {

        /* renamed from: a */
        public static final C5317f f28677a = new C5317f();

        public C5317f() {
            super(1);
        }

        /* renamed from: X */
        public final T mo17094X(T t) {
            return t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "it", "X", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$g */
    public static final class C5318g extends d12 implements ec1<T, T> {

        /* renamed from: a */
        public final /* synthetic */ cc1<T> f28678a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5318g(cc1<? extends T> cc1) {
            super(1);
            this.f28678a = cc1;
        }

        @ss2
        /* renamed from: X */
        public final T mo17094X(@vr2 T t) {
            jt1.m53777p(t, "it");
            return this.f28678a.invoke();
        }
    }

    @ii2(mo38104d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo38105d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.fu3$h */
    public static final class C5319h extends d12 implements cc1<T> {

        /* renamed from: a */
        public final /* synthetic */ T f28679a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5319h(T t) {
            super(0);
            this.f28679a = t;
        }

        @ss2
        public final T invoke() {
            return this.f28679a;
        }
    }

    @cf0(mo32326c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", mo32327f = "Sequences.kt", mo32328i = {}, mo32329l = {69, 71}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"T", "Lcom/onedelhi/secure/bu3;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$i */
    public static final class C5320i extends ll3 implements sc1<bu3<? super T>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ cc1<zt3<T>> f28680a;

        /* renamed from: a */
        public final /* synthetic */ zt3<T> f28681a;

        /* renamed from: a */
        public /* synthetic */ Object f28682a;

        /* renamed from: o */
        public int f28683o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5320i(zt3<? extends T> zt3, cc1<? extends zt3<? extends T>> cc1, b80<? super C5320i> b80) {
            super(2, b80);
            this.f28681a = zt3;
            this.f28680a = cc1;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5320i iVar = new C5320i(this.f28681a, this.f28680a, b80);
            iVar.f28682a = obj;
            return iVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f28683o;
            if (i == 0) {
                pl3.m61436n(obj);
                bu3 bu3 = (bu3) this.f28682a;
                Iterator<T> it = this.f28681a.iterator();
                if (it.hasNext()) {
                    this.f28683o = 1;
                    if (bu3.mo31190m(it, this) == h) {
                        return h;
                    }
                } else {
                    this.f28683o = 2;
                    if (bu3.mo32032i(this.f28680a.invoke(), this) == h) {
                        return h;
                    }
                }
            } else if (i == 1 || i == 2) {
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super T> bu3, @ss2 b80<? super un4> b80) {
            return ((C5320i) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    @cf0(mo32326c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", mo32327f = "Sequences.kt", mo32328i = {0, 0}, mo32329l = {145}, mo32330m = "invokeSuspend", mo32331n = {"$this$sequence", "buffer"}, mo32332s = {"L$0", "L$1"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"T", "Lcom/onedelhi/secure/bu3;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fu3$j */
    public static final class C5321j extends ll3 implements sc1<bu3<? super T>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ me3 f28684a;

        /* renamed from: a */
        public final /* synthetic */ zt3<T> f28685a;

        /* renamed from: a */
        public Object f28686a;

        /* renamed from: b */
        public /* synthetic */ Object f28687b;

        /* renamed from: o */
        public int f28688o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5321j(zt3<? extends T> zt3, me3 me3, b80<? super C5321j> b80) {
            super(2, b80);
            this.f28685a = zt3;
            this.f28684a = me3;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5321j jVar = new C5321j(this.f28685a, this.f28684a, b80);
            jVar.f28687b = obj;
            return jVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            bu3 bu3;
            List<T> list;
            Object h = mt1.m57558h();
            int i = this.f28688o;
            if (i == 0) {
                pl3.m61436n(obj);
                list = hu3.m51015d3(this.f28685a);
                bu3 = (bu3) this.f28687b;
            } else if (i == 1) {
                list = (List) this.f28686a;
                bu3 = (bu3) this.f28687b;
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (!list.isEmpty()) {
                int m = this.f28684a.mo35704m(list.size());
                T L0 = x00.m69803L0(list);
                if (m < list.size()) {
                    L0 = list.set(m, L0);
                }
                this.f28687b = bu3;
                this.f28686a = list;
                this.f28688o = 1;
                if (bu3.mo31188h(L0, this) == h) {
                    return h;
                }
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super T> bu3, @ss2 b80<? super un4> b80) {
            return ((C5321j) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    @xq1
    /* renamed from: d */
    public static final <T> zt3<T> m48486d(cc1<? extends Iterator<? extends T>> cc1) {
        jt1.m53777p(cc1, "iterator");
        return new C5312a(cc1);
    }

    @vr2
    /* renamed from: e */
    public static final <T> zt3<T> m48487e(@vr2 Iterator<? extends T> it) {
        jt1.m53777p(it, "<this>");
        return m48488f(new C5313b(it));
    }

    @vr2
    /* renamed from: f */
    public static final <T> zt3<T> m48488f(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "<this>");
        return zt3 instanceof l60 ? zt3 : new l60(zt3);
    }

    @vr2
    /* renamed from: g */
    public static final <T> zt3<T> m48489g() {
        return ot0.f33168a;
    }

    @vr2
    /* renamed from: h */
    public static final <T, C, R> zt3<R> m48490h(@vr2 zt3<? extends T> zt3, @vr2 sc1<? super Integer, ? super T, ? extends C> sc1, @vr2 ec1<? super C, ? extends Iterator<? extends R>> ec1) {
        jt1.m53777p(zt3, "source");
        jt1.m53777p(sc1, "transform");
        jt1.m53777p(ec1, "iterator");
        return du3.m45551b(new C5314c(zt3, sc1, ec1, (b80<? super C5314c>) null));
    }

    @vr2
    /* renamed from: i */
    public static final <T> zt3<T> m48491i(@vr2 zt3<? extends zt3<? extends T>> zt3) {
        jt1.m53777p(zt3, "<this>");
        return m48492j(zt3, C5315d.f28675a);
    }

    /* renamed from: j */
    public static final <T, R> zt3<R> m48492j(zt3<? extends T> zt3, ec1<? super T, ? extends Iterator<? extends R>> ec1) {
        return zt3 instanceof yg4 ? ((yg4) zt3).mo47801e(ec1) : new p71(zt3, C5317f.f28677a, ec1);
    }

    @uw1(name = "flattenSequenceOfIterable")
    @vr2
    /* renamed from: k */
    public static final <T> zt3<T> m48493k(@vr2 zt3<? extends Iterable<? extends T>> zt3) {
        jt1.m53777p(zt3, "<this>");
        return m48492j(zt3, C5316e.f28676a);
    }

    @vr2
    /* renamed from: l */
    public static final <T> zt3<T> m48494l(@vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "nextFunction");
        return m48488f(new re1(cc1, new C5318g(cc1)));
    }

    @vr2
    /* renamed from: m */
    public static final <T> zt3<T> m48495m(@vr2 cc1<? extends T> cc1, @vr2 ec1<? super T, ? extends T> ec1) {
        jt1.m53777p(cc1, "seedFunction");
        jt1.m53777p(ec1, "nextFunction");
        return new re1(cc1, ec1);
    }

    @ib2
    @vr2
    /* renamed from: n */
    public static final <T> zt3<T> m48496n(@ss2 T t, @vr2 ec1<? super T, ? extends T> ec1) {
        jt1.m53777p(ec1, "nextFunction");
        return t == null ? ot0.f33168a : new re1(new C5319h(t), ec1);
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: o */
    public static final <T> zt3<T> m48497o(@vr2 zt3<? extends T> zt3, @vr2 cc1<? extends zt3<? extends T>> cc1) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(cc1, "defaultValue");
        return du3.m45551b(new C5320i(zt3, cc1, (b80<? super C5320i>) null));
    }

    @gz3(version = "1.3")
    @xq1
    /* renamed from: p */
    public static final <T> zt3<T> m48498p(zt3<? extends T> zt3) {
        return zt3 == null ? m48489g() : zt3;
    }

    @vr2
    /* renamed from: q */
    public static final <T> zt3<T> m48499q(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return tArr.length == 0 ? m48489g() : C4478ab.m37299l6(tArr);
    }

    @gz3(version = "1.4")
    @vr2
    /* renamed from: r */
    public static final <T> zt3<T> m48500r(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "<this>");
        return m48501s(zt3, me3.f32085a);
    }

    @gz3(version = "1.4")
    @vr2
    /* renamed from: s */
    public static final <T> zt3<T> m48501s(@vr2 zt3<? extends T> zt3, @vr2 me3 me3) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(me3, "random");
        return du3.m45551b(new C5321j(zt3, me3, (b80<? super C5321j>) null));
    }

    @vr2
    /* renamed from: t */
    public static final <T, R> ey2<List<T>, List<R>> m48502t(@vr2 zt3<? extends ey2<? extends T, ? extends R>> zt3) {
        jt1.m53777p(zt3, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ey2 ey2 : zt3) {
            arrayList.add(ey2.mo35668e());
            arrayList2.add(ey2.mo35670f());
        }
        return yi4.m71797a(arrayList, arrayList2);
    }
}
