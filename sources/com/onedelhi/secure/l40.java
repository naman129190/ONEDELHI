package com.onedelhi.secure;

import com.onedelhi.secure.tx1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003%&\u001fB\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001b\u0010\u0014\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001c¨\u0006'"}, d2 = {"Lcom/onedelhi/secure/l40;", "", "K", "V", "Lcom/onedelhi/secure/c1;", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "Lcom/onedelhi/secure/un4;", "clear", "()V", "n", "l", "m", "Lcom/onedelhi/secure/ok1;", "w", "j", "(Lcom/onedelhi/secure/ok1;)V", "", "f", "()I", "size", "", "d", "()Ljava/util/Set;", "keys", "", "c", "entries", "", "weakRefQueue", "<init>", "(Z)V", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l40<K, V> extends C4721c1<K, V> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31542a = AtomicIntegerFieldUpdater.newUpdater(l40.class, "_size");
    @vr2
    private volatile /* synthetic */ int _size;
    @ss2

    /* renamed from: a */
    public final ReferenceQueue<K> f31543a;
    @vr2
    public volatile /* synthetic */ Object core;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\u0004\b\u0002\u0010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/onedelhi/secure/l40$a;", "", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lcom/onedelhi/secure/ok1;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/ok1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/l40;", "h", "()Lcom/onedelhi/secure/l40$a;", "weakRef", "Lcom/onedelhi/secure/un4;", "b", "(Lcom/onedelhi/secure/ok1;)V", "E", "Lkotlin/Function2;", "factory", "", "e", "(Lcom/onedelhi/secure/sc1;)Ljava/util/Iterator;", "", "hash", "d", "(I)I", "index", "i", "(I)V", "allocated", "<init>", "(Lcom/onedelhi/secure/l40;I)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l40$a */
    public final class C5961a {

        /* renamed from: a */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f31544a = AtomicIntegerFieldUpdater.newUpdater(C5961a.class, "load");

        /* renamed from: a */
        public final int f31545a;
        @vr2

        /* renamed from: a */
        public /* synthetic */ AtomicReferenceArray f31547a;

        /* renamed from: b */
        public final int f31548b;
        @vr2

        /* renamed from: b */
        public /* synthetic */ AtomicReferenceArray f31549b;

        /* renamed from: c */
        public final int f31550c;
        @vr2
        private volatile /* synthetic */ int load = 0;

        @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/l40$a$a;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "Lcom/onedelhi/secure/un4;", "a", "Lkotlin/Function2;", "factory", "<init>", "(Lcom/onedelhi/secure/l40$a;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.l40$a$a */
        public final class C5962a<E> implements Iterator<E>, qx1 {
            @vr2

            /* renamed from: a */
            public final sc1<K, V, E> f31552a;

            /* renamed from: a */
            public K f31553a;

            /* renamed from: b */
            public V f31554b;

            /* renamed from: n */
            public int f31555n = -1;

            public C5962a(@vr2 sc1<? super K, ? super V, ? extends E> sc1) {
                this.f31552a = sc1;
                mo39663a();
            }

            /* renamed from: a */
            public final void mo39663a() {
                while (true) {
                    int i = this.f31555n + 1;
                    this.f31555n = i;
                    if (i < C5961a.this.f31545a) {
                        ok1 ok1 = (ok1) C5961a.this.f31547a.get(this.f31555n);
                        K k = ok1 == null ? null : ok1.get();
                        if (k != null) {
                            this.f31553a = k;
                            V v = C5961a.this.f31549b.get(this.f31555n);
                            if (v instanceof nd2) {
                                v = ((nd2) v).f32477a;
                            }
                            if (v != null) {
                                this.f31554b = v;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @vr2
            /* renamed from: b */
            public Void remove() {
                Void unused = m40.m56905e();
                throw new b02();
            }

            public boolean hasNext() {
                return this.f31555n < C5961a.this.f31545a;
            }

            public E next() {
                if (this.f31555n < C5961a.this.f31545a) {
                    sc1<K, V, E> sc1 = this.f31552a;
                    K k = this.f31553a;
                    if (k == null) {
                        jt1.m53761S("key");
                        k = un4.f36206a;
                    }
                    V v = this.f31554b;
                    if (v == null) {
                        jt1.m53761S("value");
                        v = un4.f36206a;
                    }
                    E h0 = sc1.mo21054h0(k, v);
                    mo39663a();
                    return h0;
                }
                throw new NoSuchElementException();
            }
        }

        public C5961a(int i) {
            this.f31545a = i;
            this.f31548b = Integer.numberOfLeadingZeros(i) + 1;
            this.f31550c = (i * 2) / 3;
            this.f31547a = new AtomicReferenceArray(i);
            this.f31549b = new AtomicReferenceArray(i);
        }

        /* renamed from: g */
        public static /* synthetic */ Object m55276g(C5961a aVar, Object obj, Object obj2, ok1 ok1, int i, Object obj3) {
            if ((i & 4) != 0) {
                ok1 = null;
            }
            return aVar.mo39660f(obj, obj2, ok1);
        }

        /* renamed from: b */
        public final void mo39656b(@vr2 ok1<?> ok1) {
            int d = mo39658d(ok1.f33075a);
            while (true) {
                ok1<?> ok12 = (ok1) this.f31547a.get(d);
                if (ok12 != null) {
                    if (ok12 == ok1) {
                        mo39662i(d);
                        return;
                    }
                    if (d == 0) {
                        d = this.f31545a;
                    }
                    d--;
                } else {
                    return;
                }
            }
        }

        @ss2
        /* renamed from: c */
        public final V mo39657c(@vr2 K k) {
            int d = mo39658d(k.hashCode());
            while (true) {
                ok1 ok1 = (ok1) this.f31547a.get(d);
                if (ok1 == null) {
                    return null;
                }
                Object obj = ok1.get();
                if (jt1.m53768g(k, obj)) {
                    V v = this.f31549b.get(d);
                    return v instanceof nd2 ? ((nd2) v).f32477a : v;
                }
                if (obj == null) {
                    mo39662i(d);
                }
                if (d == 0) {
                    d = this.f31545a;
                }
                d--;
            }
        }

        /* renamed from: d */
        public final int mo39658d(int i) {
            return (i * -1640531527) >>> this.f31548b;
        }

        @vr2
        /* renamed from: e */
        public final <E> Iterator<E> mo39659e(@vr2 sc1<? super K, ? super V, ? extends E> sc1) {
            return new C5962a(sc1);
        }

        @ss2
        /* renamed from: f */
        public final Object mo39660f(@vr2 K k, @ss2 V v, @ss2 ok1<K> ok1) {
            Object obj;
            int i;
            int d = mo39658d(k.hashCode());
            boolean z = false;
            while (true) {
                ok1 ok12 = (ok1) this.f31547a.get(d);
                if (ok12 != null) {
                    Object obj2 = ok12.get();
                    if (!jt1.m53768g(k, obj2)) {
                        if (obj2 == null) {
                            mo39662i(d);
                        }
                        if (d == 0) {
                            d = this.f31545a;
                        }
                        d--;
                    } else if (z) {
                        f31544a.decrementAndGet(this);
                    }
                } else if (v == null) {
                    return null;
                } else {
                    if (!z) {
                        do {
                            i = this.load;
                            if (i >= this.f31550c) {
                                return m40.f32007a;
                            }
                        } while (!f31544a.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (ok1 == null) {
                        ok1 = new ok1<>(k, l40.this.f31543a);
                    }
                    if (this.f31547a.compareAndSet(d, (Object) null, ok1)) {
                        break;
                    }
                }
            }
            do {
                obj = this.f31549b.get(d);
                if (obj instanceof nd2) {
                    return m40.f32007a;
                }
            } while (!this.f31549b.compareAndSet(d, obj, v));
            return obj;
        }

        @vr2
        /* renamed from: h */
        public final l40<K, V>.a mo39661h() {
            Object obj;
            while (true) {
                l40<K, V>.a aVar = new C5961a(Integer.highestOneBit(df3.m45198n(l40.this.size(), 4)) * 4);
                int i = 0;
                int i2 = this.f31545a;
                while (true) {
                    if (i >= i2) {
                        return aVar;
                    }
                    int i3 = i + 1;
                    ok1 ok1 = (ok1) this.f31547a.get(i);
                    Object obj2 = ok1 == null ? null : ok1.get();
                    if (ok1 != null && obj2 == null) {
                        mo39662i(i);
                    }
                    while (true) {
                        obj = this.f31549b.get(i);
                        if (!(obj instanceof nd2)) {
                            if (this.f31549b.compareAndSet(i, obj, m40.m56904d(obj))) {
                                break;
                            }
                        } else {
                            obj = ((nd2) obj).f32477a;
                            break;
                        }
                    }
                    if (obj2 == null || obj == null || aVar.mo39660f(obj2, obj, ok1) != m40.f32007a) {
                        i = i3;
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo39662i(int i) {
            Object obj;
            do {
                obj = this.f31549b.get(i);
                if (obj == null || (obj instanceof nd2)) {
                    return;
                }
            } while (!this.f31549b.compareAndSet(i, obj, (Object) null));
            l40.this.mo39652l();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00028\u0002\u0012\u0006\u0010\u000b\u001a\u00028\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00028\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/l40$b;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "value", "getValue", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l40$b */
    public static final class C5963b<K, V> implements Map.Entry<K, V>, tx1.C6906a {

        /* renamed from: a */
        public final K f31556a;

        /* renamed from: b */
        public final V f31557b;

        public C5963b(K k, V v) {
            this.f31556a = k;
            this.f31557b = v;
        }

        public K getKey() {
            return this.f31556a;
        }

        public V getValue() {
            return this.f31557b;
        }

        public V setValue(V v) {
            Void unused = m40.m56905e();
            throw new b02();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0002R\u0014\u0010\f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/l40$c;", "E", "Lcom/onedelhi/secure/d1;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "", "b", "()I", "size", "Lkotlin/Function2;", "factory", "<init>", "(Lcom/onedelhi/secure/l40;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l40$c */
    public final class C5964c<E> extends C4945d1<E> {
        @vr2

        /* renamed from: a */
        public final sc1<K, V, E> f31559a;

        public C5964c(@vr2 sc1<? super K, ? super V, ? extends E> sc1) {
            this.f31559a = sc1;
        }

        public boolean add(E e) {
            Void unused = m40.m56905e();
            throw new b02();
        }

        /* renamed from: b */
        public int mo32169b() {
            return l40.this.size();
        }

        @vr2
        public Iterator<E> iterator() {
            return ((C5961a) l40.this.core).mo39659e(this.f31559a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "k", "v", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l40$d */
    public static final class C5965d extends d12 implements sc1<K, V, Map.Entry<K, V>> {

        /* renamed from: a */
        public static final C5965d f31560a = new C5965d();

        public C5965d() {
            super(2);
        }

        @vr2
        /* renamed from: a */
        public final Map.Entry<K, V> mo21054h0(@vr2 K k, @vr2 V v) {
            return new C5963b(k, v);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "k", "<anonymous parameter 1>", "h0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l40$e */
    public static final class C5966e extends d12 implements sc1<K, V, K> {

        /* renamed from: a */
        public static final C5966e f31561a = new C5966e();

        public C5966e() {
            super(2);
        }

        @vr2
        /* renamed from: h0 */
        public final K mo21054h0(@vr2 K k, @vr2 V v) {
            return k;
        }
    }

    public l40() {
        this(false, 1, (wg0) null);
    }

    public l40(boolean z) {
        this._size = 0;
        this.core = new C5961a(16);
        this.f31543a = z ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l40(boolean z, int i, wg0 wg0) {
        this((i & 1) != 0 ? false : z);
    }

    @vr2
    /* renamed from: c */
    public Set<Map.Entry<K, V>> mo32201c() {
        return new C5964c(C5965d.f31560a);
    }

    public void clear() {
        for (Object remove : keySet()) {
            remove(remove);
        }
    }

    @vr2
    /* renamed from: d */
    public Set<K> mo32202d() {
        return new C5964c(C5966e.f31561a);
    }

    /* renamed from: f */
    public int mo32204f() {
        return this._size;
    }

    @ss2
    public V get(@ss2 Object obj) {
        if (obj == null) {
            return null;
        }
        return ((C5961a) this.core).mo39657c(obj);
    }

    /* renamed from: j */
    public final void mo39651j(ok1<?> ok1) {
        ((C5961a) this.core).mo39656b(ok1);
    }

    /* renamed from: l */
    public final void mo39652l() {
        f31542a.decrementAndGet(this);
    }

    /* renamed from: m */
    public final synchronized V mo39653m(K k, V v) {
        V g;
        l40<K, V>.a aVar = (C5961a) this.core;
        while (true) {
            g = C5961a.m55276g(aVar, k, v, (ok1) null, 4, (Object) null);
            if (g == m40.f32007a) {
                aVar = aVar.mo39661h();
                this.core = aVar;
            }
        }
        return g;
    }

    /* renamed from: n */
    public final void mo39654n() {
        if (this.f31543a != null) {
            while (true) {
                try {
                    Reference<? extends K> remove = this.f31543a.remove();
                    if (remove != null) {
                        mo39651j((ok1) remove);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
    }

    @ss2
    public V put(@vr2 K k, @vr2 V v) {
        V g = C5961a.m55276g((C5961a) this.core, k, v, (ok1) null, 4, (Object) null);
        if (g == m40.f32007a) {
            g = mo39653m(k, v);
        }
        if (g == null) {
            f31542a.incrementAndGet(this);
        }
        return g;
    }

    @ss2
    public V remove(@ss2 Object obj) {
        if (obj == null) {
            return null;
        }
        V g = C5961a.m55276g((C5961a) this.core, obj, (Object) null, (ok1) null, 4, (Object) null);
        if (g == m40.f32007a) {
            g = mo39653m(obj, (Object) null);
        }
        if (g != null) {
            f31542a.decrementAndGet(this);
        }
        return g;
    }
}
