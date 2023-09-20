package com.onedelhi.secure;

import com.onedelhi.secure.tx1;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006nopqrsBG\b\u0002\u0012\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u000e\u0010d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0006\u0010f\u001a\u00020e\u0012\u0006\u0010g\u001a\u00020e\u0012\u0006\u0010h\u001a\u00020\b\u0012\u0006\u0010i\u001a\u00020\b¢\u0006\u0004\bj\u0010kB\t\b\u0016¢\u0006\u0004\bj\u0010:B\u0011\b\u0016\u0012\u0006\u0010l\u001a\u00020\b¢\u0006\u0004\bj\u0010mJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010\"\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030!H\u0002J\u001c\u0010&\u001a\u00020\u00182\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0002J\"\u0010)\u001a\u00020\u00182\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0'H\u0002J\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\b\u0010+\u001a\u00020\u0018H\u0016J\u0017\u0010,\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010-J\u001a\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u00100J!\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u00020\n2\u0014\u0010(\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0019\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u00100J\b\u00105\u001a\u00020\nH\u0016J\u0013\u00106\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00107\u001a\u00020\bH\u0016J\b\u00109\u001a\u000208H\u0016J\u000f\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0004\b\t\u0010:J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b;\u0010\u0013J\u0017\u0010<\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010\u0013J#\u0010=\u001a\u00020\u00182\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00182\n\u0010*\u001a\u0006\u0012\u0002\b\u00030'H\u0000¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u00020\u00182\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0000¢\u0006\u0004\bA\u0010>J\u0017\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u00028\u0001H\u0000¢\u0006\u0004\bC\u0010-J\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0004\bK\u0010LR\u0014\u0010\f\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010NR$\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\bR\u0010\u0019\u001a\u0004\bS\u0010NR$\u0010T\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u00188\u0000@BX\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000X8VX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\\8VX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R&\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`0X8VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010Z¨\u0006t"}, d2 = {"Lcom/onedelhi/secure/ic2;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "R", "", "n", "Lcom/onedelhi/secure/un4;", "t", "capacity", "s", "", "l", "()[Ljava/lang/Object;", "key", "D", "(Ljava/lang/Object;)I", "o", "newHashSize", "J", "i", "", "I", "v", "value", "w", "index", "O", "removedHash", "M", "", "other", "r", "", "entry", "H", "", "from", "G", "m", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "equals", "hashCode", "", "toString", "()V", "j", "N", "q", "(Ljava/util/Map$Entry;)Z", "p", "(Ljava/util/Collection;)Z", "L", "element", "P", "Lcom/onedelhi/secure/ic2$e;", "F", "()Lcom/onedelhi/secure/ic2$e;", "Lcom/onedelhi/secure/ic2$f;", "Q", "()Lcom/onedelhi/secure/ic2$f;", "Lcom/onedelhi/secure/ic2$b;", "u", "()Lcom/onedelhi/secure/ic2$b;", "x", "()I", "z", "hashSize", "<set-?>", "size", "B", "isReadOnly", "Z", "E", "()Z", "", "A", "()Ljava/util/Set;", "keys", "", "C", "()Ljava/util/Collection;", "values", "", "y", "entries", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ic2<K, V> implements Map<K, V>, Serializable, tx1 {
    @vr2

    /* renamed from: a */
    public static final C5709a f30246a = new C5709a((wg0) null);
    @Deprecated

    /* renamed from: r */
    public static final int f30247r = -1640531527;
    @Deprecated

    /* renamed from: s */
    public static final int f30248s = 8;
    @Deprecated

    /* renamed from: t */
    public static final int f30249t = 2;
    @Deprecated

    /* renamed from: u */
    public static final int f30250u = -1;
    @ss2

    /* renamed from: a */
    public kc2<K, V> f30251a;
    @ss2

    /* renamed from: a */
    public lc2<K> f30252a;
    @ss2

    /* renamed from: a */
    public mc2<V> f30253a;
    @vr2

    /* renamed from: a */
    public int[] f30254a;
    @vr2

    /* renamed from: a */
    public K[] f30255a;

    /* renamed from: b */
    public boolean f30256b;
    @vr2

    /* renamed from: b */
    public int[] f30257b;
    @ss2

    /* renamed from: b */
    public V[] f30258b;

    /* renamed from: n */
    public int f30259n;

    /* renamed from: o */
    public int f30260o;

    /* renamed from: p */
    public int f30261p;

    /* renamed from: q */
    public int f30262q;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/ic2$a;", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$a */
    public static final class C5709a {
        public C5709a() {
        }

        public /* synthetic */ C5709a(wg0 wg0) {
            this();
        }

        /* renamed from: c */
        public final int mo37996c(int i) {
            return Integer.highestOneBit(df3.m45198n(i, 1) * 3);
        }

        /* renamed from: d */
        public final int mo37997d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/ic2$b;", "K", "V", "Lcom/onedelhi/secure/ic2$d;", "", "", "Lcom/onedelhi/secure/ic2$c;", "j", "", "m", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lcom/onedelhi/secure/un4;", "l", "Lcom/onedelhi/secure/ic2;", "map", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$b */
    public static final class C5710b<K, V> extends C5712d<K, V> implements Iterator<Map.Entry<K, V>>, qx1 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5710b(@vr2 ic2<K, V> ic2) {
            super(ic2);
            jt1.m53777p(ic2, "map");
        }

        @vr2
        /* renamed from: j */
        public C5711c<K, V> next() {
            if (mo38008a() < mo38010d().f30260o) {
                int a = mo38008a();
                mo38012h(a + 1);
                mo38014i(a);
                C5711c<K, V> cVar = new C5711c<>(mo38010d(), mo38009b());
                mo38011f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final void mo37999l(@vr2 StringBuilder sb) {
            jt1.m53777p(sb, "sb");
            if (mo38008a() < mo38010d().f30260o) {
                int a = mo38008a();
                mo38012h(a + 1);
                mo38014i(a);
                Object obj = mo38010d().f30255a[mo38009b()];
                if (jt1.m53768g(obj, mo38010d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] h = mo38010d().f30258b;
                jt1.m53774m(h);
                Object obj2 = h[mo38009b()];
                if (jt1.m53768g(obj2, mo38010d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo38011f();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: m */
        public final int mo38000m() {
            if (mo38008a() < mo38010d().f30260o) {
                int a = mo38008a();
                mo38012h(a + 1);
                mo38014i(a);
                Object obj = mo38010d().f30255a[mo38009b()];
                int i = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] h = mo38010d().f30258b;
                jt1.m53774m(h);
                Object obj2 = h[mo38009b()];
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                int i2 = hashCode ^ i;
                mo38011f();
                return i2;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00028\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00028\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/ic2$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "Lcom/onedelhi/secure/ic2;", "map", "index", "<init>", "(Lcom/onedelhi/secure/ic2;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$c */
    public static final class C5711c<K, V> implements Map.Entry<K, V>, tx1.C6906a {
        @vr2

        /* renamed from: a */
        public final ic2<K, V> f30263a;

        /* renamed from: n */
        public final int f30264n;

        public C5711c(@vr2 ic2<K, V> ic2, int i) {
            jt1.m53777p(ic2, "map");
            this.f30263a = ic2;
            this.f30264n = i;
        }

        public boolean equals(@ss2 Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return jt1.m53768g(entry.getKey(), getKey()) && jt1.m53768g(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f30263a.f30255a[this.f30264n];
        }

        public V getValue() {
            V[] h = this.f30263a.f30258b;
            jt1.m53774m(h);
            return h[this.f30264n];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f30263a.mo37977n();
            V[] c = this.f30263a.mo37975l();
            int i = this.f30264n;
            V v2 = c[i];
            c[i] = v;
            return v2;
        }

        @vr2
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/ic2$d;", "K", "V", "", "Lcom/onedelhi/secure/un4;", "f", "()V", "", "hasNext", "remove", "Lcom/onedelhi/secure/ic2;", "map", "Lcom/onedelhi/secure/ic2;", "d", "()Lcom/onedelhi/secure/ic2;", "", "index", "I", "a", "()I", "h", "(I)V", "lastIndex", "b", "i", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$d */
    public static class C5712d<K, V> {
        @vr2

        /* renamed from: a */
        public final ic2<K, V> f30265a;

        /* renamed from: n */
        public int f30266n;

        /* renamed from: o */
        public int f30267o = -1;

        public C5712d(@vr2 ic2<K, V> ic2) {
            jt1.m53777p(ic2, "map");
            this.f30265a = ic2;
            mo38011f();
        }

        /* renamed from: a */
        public final int mo38008a() {
            return this.f30266n;
        }

        /* renamed from: b */
        public final int mo38009b() {
            return this.f30267o;
        }

        @vr2
        /* renamed from: d */
        public final ic2<K, V> mo38010d() {
            return this.f30265a;
        }

        /* renamed from: f */
        public final void mo38011f() {
            while (this.f30266n < this.f30265a.f30260o) {
                int[] g = this.f30265a.f30254a;
                int i = this.f30266n;
                if (g[i] < 0) {
                    this.f30266n = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public final void mo38012h(int i) {
            this.f30266n = i;
        }

        public final boolean hasNext() {
            return this.f30266n < this.f30265a.f30260o;
        }

        /* renamed from: i */
        public final void mo38014i(int i) {
            this.f30267o = i;
        }

        public final void remove() {
            if (this.f30267o != -1) {
                this.f30265a.mo37977n();
                this.f30265a.mo37961O(this.f30267o);
                this.f30267o = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ic2$e;", "K", "V", "Lcom/onedelhi/secure/ic2$d;", "", "next", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/ic2;", "map", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$e */
    public static final class C5713e<K, V> extends C5712d<K, V> implements Iterator<K>, qx1 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5713e(@vr2 ic2<K, V> ic2) {
            super(ic2);
            jt1.m53777p(ic2, "map");
        }

        public K next() {
            if (mo38008a() < mo38010d().f30260o) {
                int a = mo38008a();
                mo38012h(a + 1);
                mo38014i(a);
                K k = mo38010d().f30255a[mo38009b()];
                mo38011f();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ic2$f;", "K", "V", "Lcom/onedelhi/secure/ic2$d;", "", "next", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/ic2;", "map", "<init>", "(Lcom/onedelhi/secure/ic2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ic2$f */
    public static final class C5714f<K, V> extends C5712d<K, V> implements Iterator<V>, qx1 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5714f(@vr2 ic2<K, V> ic2) {
            super(ic2);
            jt1.m53777p(ic2, "map");
        }

        public V next() {
            if (mo38008a() < mo38010d().f30260o) {
                int a = mo38008a();
                mo38012h(a + 1);
                mo38014i(a);
                V[] h = mo38010d().f30258b;
                jt1.m53774m(h);
                V v = h[mo38009b()];
                mo38011f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public ic2() {
        this(8);
    }

    public ic2(int i) {
        this(y32.m71205d(i), (V[]) null, new int[i], new int[f30246a.mo37996c(i)], 2, 0);
    }

    public ic2(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f30255a = kArr;
        this.f30258b = vArr;
        this.f30254a = iArr;
        this.f30257b = iArr2;
        this.f30259n = i;
        this.f30260o = i2;
        this.f30261p = f30246a.mo37997d(mo37995z());
    }

    @vr2
    /* renamed from: A */
    public Set<K> mo37948A() {
        lc2<K> lc2 = this.f30252a;
        if (lc2 != null) {
            return lc2;
        }
        lc2<K> lc22 = new lc2<>(this);
        this.f30252a = lc22;
        return lc22;
    }

    /* renamed from: B */
    public int mo37949B() {
        return this.f30262q;
    }

    @vr2
    /* renamed from: C */
    public Collection<V> mo37950C() {
        mc2<V> mc2 = this.f30253a;
        if (mc2 != null) {
            return mc2;
        }
        mc2<V> mc22 = new mc2<>(this);
        this.f30253a = mc22;
        return mc22;
    }

    /* renamed from: D */
    public final int mo37951D(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.f30261p;
    }

    /* renamed from: E */
    public final boolean mo37952E() {
        return this.f30256b;
    }

    @vr2
    /* renamed from: F */
    public final C5713e<K, V> mo37953F() {
        return new C5713e<>(this);
    }

    /* renamed from: G */
    public final boolean mo37954G(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        mo37987t(collection.size());
        for (Map.Entry H : collection) {
            if (mo37955H(H)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: H */
    public final boolean mo37955H(Map.Entry<? extends K, ? extends V> entry) {
        int j = mo37973j(entry.getKey());
        Object[] l = mo37975l();
        if (j >= 0) {
            l[j] = entry.getValue();
            return true;
        }
        int i = (-j) - 1;
        if (jt1.m53768g(entry.getValue(), l[i])) {
            return false;
        }
        l[i] = entry.getValue();
        return true;
    }

    /* renamed from: I */
    public final boolean mo37956I(int i) {
        int D = mo37951D(this.f30255a[i]);
        int i2 = this.f30259n;
        while (true) {
            int[] iArr = this.f30257b;
            if (iArr[D] == 0) {
                iArr[D] = i + 1;
                this.f30254a[i] = D;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            D = D == 0 ? mo37995z() - 1 : D - 1;
        }
    }

    /* renamed from: J */
    public final void mo37957J(int i) {
        if (this.f30260o > size()) {
            mo37978o();
        }
        int i2 = 0;
        if (i != mo37995z()) {
            this.f30257b = new int[i];
            this.f30261p = f30246a.mo37997d(i);
        } else {
            C7458za.m72931l2(this.f30257b, 0, 0, mo37995z());
        }
        while (i2 < this.f30260o) {
            int i3 = i2 + 1;
            if (mo37956I(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: L */
    public final boolean mo37958L(@vr2 Map.Entry<? extends K, ? extends V> entry) {
        jt1.m53777p(entry, wh0.f36995a);
        mo37977n();
        int v = mo37990v(entry.getKey());
        if (v < 0) {
            return false;
        }
        V[] vArr = this.f30258b;
        jt1.m53774m(vArr);
        if (!jt1.m53768g(vArr[v], entry.getValue())) {
            return false;
        }
        mo37961O(v);
        return true;
    }

    /* renamed from: M */
    public final void mo37959M(int i) {
        int u = df3.m45219u(this.f30259n * 2, mo37995z() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? mo37995z() - 1 : i - 1;
            i2++;
            if (i2 > this.f30259n) {
                this.f30257b[i3] = 0;
                return;
            }
            int[] iArr = this.f30257b;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((mo37951D(this.f30255a[i5]) - i) & (mo37995z() - 1)) >= i2) {
                    this.f30257b[i3] = i4;
                    this.f30254a[i5] = i3;
                }
                u--;
            }
            i3 = i;
            i2 = 0;
            u--;
        } while (u >= 0);
        this.f30257b[i3] = -1;
    }

    /* renamed from: N */
    public final int mo37960N(K k) {
        mo37977n();
        int v = mo37990v(k);
        if (v < 0) {
            return -1;
        }
        mo37961O(v);
        return v;
    }

    /* renamed from: O */
    public final void mo37961O(int i) {
        y32.m71207f(this.f30255a, i);
        mo37959M(this.f30254a[i]);
        this.f30254a[i] = -1;
        this.f30262q = size() - 1;
    }

    /* renamed from: P */
    public final boolean mo37962P(V v) {
        mo37977n();
        int w = mo37992w(v);
        if (w < 0) {
            return false;
        }
        mo37961O(w);
        return true;
    }

    @vr2
    /* renamed from: Q */
    public final C5714f<K, V> mo37963Q() {
        return new C5714f<>(this);
    }

    /* renamed from: R */
    public final Object mo37964R() {
        if (this.f30256b) {
            return new mu3(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public void clear() {
        mo37977n();
        ds1 o = new is1(0, this.f30260o - 1).iterator();
        while (o.hasNext()) {
            int b = o.mo19249b();
            int[] iArr = this.f30254a;
            int i = iArr[b];
            if (i >= 0) {
                this.f30257b[i] = 0;
                iArr[b] = -1;
            }
        }
        y32.m71208g(this.f30255a, 0, this.f30260o);
        V[] vArr = this.f30258b;
        if (vArr != null) {
            y32.m71208g(vArr, 0, this.f30260o);
        }
        this.f30262q = 0;
        this.f30260o = 0;
    }

    public boolean containsKey(Object obj) {
        return mo37990v(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo37992w(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo37994y();
    }

    public boolean equals(@ss2 Object obj) {
        return obj == this || ((obj instanceof Map) && mo37983r((Map) obj));
    }

    @ss2
    public V get(Object obj) {
        int v = mo37990v(obj);
        if (v < 0) {
            return null;
        }
        V[] vArr = this.f30258b;
        jt1.m53774m(vArr);
        return vArr[v];
    }

    public int hashCode() {
        C5710b u = mo37989u();
        int i = 0;
        while (u.hasNext()) {
            i += u.mo38000m();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final int mo37973j(K k) {
        mo37977n();
        while (true) {
            int D = mo37951D(k);
            int u = df3.m45219u(this.f30259n * 2, mo37995z() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f30257b[D];
                if (i2 <= 0) {
                    if (this.f30260o >= mo37993x()) {
                        mo37987t(1);
                    } else {
                        int i3 = this.f30260o;
                        int i4 = i3 + 1;
                        this.f30260o = i4;
                        this.f30255a[i3] = k;
                        this.f30254a[i3] = D;
                        this.f30257b[D] = i4;
                        this.f30262q = size() + 1;
                        if (i > this.f30259n) {
                            this.f30259n = i;
                        }
                        return i3;
                    }
                } else if (jt1.m53768g(this.f30255a[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > u) {
                        mo37957J(mo37995z() * 2);
                        break;
                    }
                    D = D == 0 ? mo37995z() - 1 : D - 1;
                }
            }
        }
    }

    public final /* bridge */ Set<K> keySet() {
        return mo37948A();
    }

    /* renamed from: l */
    public final V[] mo37975l() {
        V[] vArr = this.f30258b;
        if (vArr != null) {
            return vArr;
        }
        V[] d = y32.m71205d(mo37993x());
        this.f30258b = d;
        return d;
    }

    @vr2
    /* renamed from: m */
    public final Map<K, V> mo37976m() {
        mo37977n();
        this.f30256b = true;
        return this;
    }

    /* renamed from: n */
    public final void mo37977n() {
        if (this.f30256b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public final void mo37978o() {
        int i;
        V[] vArr = this.f30258b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f30260o;
            if (i2 >= i) {
                break;
            }
            if (this.f30254a[i2] >= 0) {
                K[] kArr = this.f30255a;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        y32.m71208g(this.f30255a, i3, i);
        if (vArr != null) {
            y32.m71208g(vArr, i3, this.f30260o);
        }
        this.f30260o = i3;
    }

    /* renamed from: p */
    public final boolean mo37979p(@vr2 Collection<?> collection) {
        jt1.m53777p(collection, by2.f10023b);
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo37982q((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @ss2
    public V put(K k, V v) {
        mo37977n();
        int j = mo37973j(k);
        V[] l = mo37975l();
        if (j < 0) {
            int i = (-j) - 1;
            V v2 = l[i];
            l[i] = v;
            return v2;
        }
        l[j] = v;
        return null;
    }

    public void putAll(@vr2 Map<? extends K, ? extends V> map) {
        jt1.m53777p(map, "from");
        mo37977n();
        mo37954G(map.entrySet());
    }

    /* renamed from: q */
    public final boolean mo37982q(@vr2 Map.Entry<? extends K, ? extends V> entry) {
        jt1.m53777p(entry, wh0.f36995a);
        int v = mo37990v(entry.getKey());
        if (v < 0) {
            return false;
        }
        V[] vArr = this.f30258b;
        jt1.m53774m(vArr);
        return jt1.m53768g(vArr[v], entry.getValue());
    }

    /* renamed from: r */
    public final boolean mo37983r(Map<?, ?> map) {
        return size() == map.size() && mo37979p(map.entrySet());
    }

    @ss2
    public V remove(Object obj) {
        int N = mo37960N(obj);
        if (N < 0) {
            return null;
        }
        V[] vArr = this.f30258b;
        jt1.m53774m(vArr);
        V v = vArr[N];
        y32.m71207f(vArr, N);
        return v;
    }

    /* renamed from: s */
    public final void mo37985s(int i) {
        int i2;
        if (i >= 0) {
            if (i > mo37993x()) {
                int x = (mo37993x() * 3) / 2;
                if (i <= x) {
                    i = x;
                }
                this.f30255a = y32.m71206e(this.f30255a, i);
                V[] vArr = this.f30258b;
                this.f30258b = vArr != null ? y32.m71206e(vArr, i) : null;
                int[] copyOf = Arrays.copyOf(this.f30254a, i);
                jt1.m53776o(copyOf, "copyOf(this, newSize)");
                this.f30254a = copyOf;
                i2 = f30246a.mo37996c(i);
                if (i2 <= mo37995z()) {
                    return;
                }
            } else if ((this.f30260o + i) - size() > mo37993x()) {
                i2 = mo37995z();
            } else {
                return;
            }
            mo37957J(i2);
            return;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ int size() {
        return mo37949B();
    }

    /* renamed from: t */
    public final void mo37987t(int i) {
        mo37985s(this.f30260o + i);
    }

    @vr2
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append(to1.f35745h);
        C5710b u = mo37989u();
        int i = 0;
        while (u.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            u.mo37999l(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "sb.toString()");
        return sb2;
    }

    @vr2
    /* renamed from: u */
    public final C5710b<K, V> mo37989u() {
        return new C5710b<>(this);
    }

    /* renamed from: v */
    public final int mo37990v(K k) {
        int D = mo37951D(k);
        int i = this.f30259n;
        while (true) {
            int i2 = this.f30257b[D];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (jt1.m53768g(this.f30255a[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            D = D == 0 ? mo37995z() - 1 : D - 1;
        }
    }

    public final /* bridge */ Collection<V> values() {
        return mo37950C();
    }

    /* renamed from: w */
    public final int mo37992w(V v) {
        int i = this.f30260o;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f30254a[i] >= 0) {
                V[] vArr = this.f30258b;
                jt1.m53774m(vArr);
                if (jt1.m53768g(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: x */
    public final int mo37993x() {
        return this.f30255a.length;
    }

    @vr2
    /* renamed from: y */
    public Set<Map.Entry<K, V>> mo37994y() {
        kc2<K, V> kc2 = this.f30251a;
        if (kc2 != null) {
            return kc2;
        }
        kc2<K, V> kc22 = new kc2<>(this);
        this.f30251a = kc22;
        return kc22;
    }

    /* renamed from: z */
    public final int mo37995z() {
        return this.f30257b.length;
    }
}
