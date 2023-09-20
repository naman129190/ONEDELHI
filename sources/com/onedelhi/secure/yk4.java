package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012*\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a2\u0010 \u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a2\u0010\"\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a2\u0010$\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0018\u0010&\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0018\u0010(\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0018\u0010*\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0018\u0010,\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a@\u00102\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a@\u00104\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a@\u00106\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a@\u00108\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a4\u0010=\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030:j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`;H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a4\u0010?\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070:j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`;H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a4\u0010A\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`;H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a4\u0010C\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`;H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0018\u0010E\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010'\u001a\u0018\u0010F\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010)\u001a\u0018\u0010G\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010+\u001a\u0018\u0010H\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010-\u001a@\u0010I\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u00103\u001a@\u0010J\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u00105\u001a@\u0010K\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u00107\u001a@\u0010L\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u00109\u001a4\u0010M\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030:j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`;H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010>\u001a4\u0010N\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070:j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`;H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010@\u001a4\u0010O\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`;H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010B\u001a4\u0010P\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`;H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010D\u001a.\u0010R\u001a\u00020Q*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Q00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a.\u0010T\u001a\u00020Q*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Q00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a.\u0010V\u001a\u00020Q*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020Q00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a.\u0010/\u001a\u00020Q*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010X\u001a.\u0010Z\u001a\u00020Y*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Y00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a.\u0010\\\u001a\u00020Y*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a.\u0010^\u001a\u00020Y*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020Y00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a.\u0010`\u001a\u00020Y*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Y00H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006b"}, d2 = {"Lcom/onedelhi/secure/nl4;", "", "index", "Lcom/onedelhi/secure/il4;", "o", "([II)I", "Lcom/onedelhi/secure/ul4;", "Lcom/onedelhi/secure/tl4;", "p", "([JI)J", "Lcom/onedelhi/secure/bl4;", "Lcom/onedelhi/secure/al4;", "m", "([BI)B", "Lcom/onedelhi/secure/ym4;", "Lcom/onedelhi/secure/xm4;", "n", "([SI)S", "", "a", "([I)Ljava/util/List;", "c", "([J)Ljava/util/List;", "b", "([B)Ljava/util/List;", "d", "([S)Ljava/util/List;", "element", "fromIndex", "toIndex", "e", "([IIII)I", "i", "([JJII)I", "k", "([BBII)I", "g", "([SSII)I", "q", "([I)Lcom/onedelhi/secure/il4;", "s", "([J)Lcom/onedelhi/secure/tl4;", "r", "([B)Lcom/onedelhi/secure/al4;", "t", "([S)Lcom/onedelhi/secure/xm4;", "", "R", "Lkotlin/Function1;", "selector", "w", "([ILcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/il4;", "v", "([JLcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/tl4;", "u", "([BLcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/al4;", "x", "([SLcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/xm4;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "z", "([ILjava/util/Comparator;)Lcom/onedelhi/secure/il4;", "B", "([JLjava/util/Comparator;)Lcom/onedelhi/secure/tl4;", "y", "([BLjava/util/Comparator;)Lcom/onedelhi/secure/al4;", "A", "([SLjava/util/Comparator;)Lcom/onedelhi/secure/xm4;", "C", "E", "D", "F", "I", "H", "G", "J", "L", "N", "K", "M", "Ljava/math/BigDecimal;", "P", "([ILcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "Q", "([JLcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "O", "([BLcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "([SLcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "T", "([ILcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "U", "([JLcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "S", "([BLcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "V", "([SLcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, pn = "kotlin.collections", xs = "kotlin/collections/unsigned/UArraysKt")
public class yk4 {

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013"}, d2 = {"com/onedelhi/secure/yk4$a", "Lcom/onedelhi/secure/t0;", "Lcom/onedelhi/secure/il4;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "f", "(I)Z", "", "index", "g", "(I)I", "i", "j", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.yk4$a */
    public static final class C7370a extends C6809t0<il4> implements RandomAccess {

        /* renamed from: a */
        public final /* synthetic */ int[] f37989a;

        public C7370a(int[] iArr) {
            this.f37989a = iArr;
        }

        /* renamed from: b */
        public int mo34341b() {
            return nl4.m58209u(this.f37989a);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof il4)) {
                return false;
            }
            return mo47834f(((il4) obj).mo38158r0());
        }

        /* renamed from: f */
        public boolean mo47834f(int i) {
            return nl4.m58204l(this.f37989a, i);
        }

        /* renamed from: g */
        public int mo47835g(int i) {
            return nl4.m58208s(this.f37989a, i);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return il4.m52414b(mo47835g(i));
        }

        /* renamed from: i */
        public int mo47836i(int i) {
            return C4478ab.m37186hg(this.f37989a, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof il4)) {
                return -1;
            }
            return mo47836i(((il4) obj).mo38158r0());
        }

        public boolean isEmpty() {
            return nl4.m58212x(this.f37989a);
        }

        /* renamed from: j */
        public int mo47837j(int i) {
            return C4478ab.m37312li(this.f37989a, i);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof il4)) {
                return -1;
            }
            return mo47837j(((il4) obj).mo38158r0());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"com/onedelhi/secure/yk4$b", "Lcom/onedelhi/secure/t0;", "Lcom/onedelhi/secure/tl4;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "f", "(J)Z", "", "index", "g", "(I)J", "i", "(J)I", "j", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.yk4$b */
    public static final class C7371b extends C6809t0<tl4> implements RandomAccess {

        /* renamed from: a */
        public final /* synthetic */ long[] f37990a;

        public C7371b(long[] jArr) {
            this.f37990a = jArr;
        }

        /* renamed from: b */
        public int mo34341b() {
            return ul4.m67117u(this.f37990a);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof tl4)) {
                return false;
            }
            return mo47838f(((tl4) obj).mo45180r0());
        }

        /* renamed from: f */
        public boolean mo47838f(long j) {
            return ul4.m67112l(this.f37990a, j);
        }

        /* renamed from: g */
        public long mo47839g(int i) {
            return ul4.m67116s(this.f37990a, i);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return tl4.m65991b(mo47839g(i));
        }

        /* renamed from: i */
        public int mo47840i(long j) {
            return C4478ab.m37217ig(this.f37990a, j);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof tl4)) {
                return -1;
            }
            return mo47840i(((tl4) obj).mo45180r0());
        }

        public boolean isEmpty() {
            return ul4.m67120x(this.f37990a);
        }

        /* renamed from: j */
        public int mo47841j(long j) {
            return C4478ab.m37343mi(this.f37990a, j);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof tl4)) {
                return -1;
            }
            return mo47841j(((tl4) obj).mo45180r0());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"com/onedelhi/secure/yk4$c", "Lcom/onedelhi/secure/t0;", "Lcom/onedelhi/secure/al4;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "f", "(B)Z", "", "index", "g", "(I)B", "i", "(B)I", "j", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.yk4$c */
    public static final class C7372c extends C6809t0<al4> implements RandomAccess {

        /* renamed from: a */
        public final /* synthetic */ byte[] f37991a;

        public C7372c(byte[] bArr) {
            this.f37991a = bArr;
        }

        /* renamed from: b */
        public int mo34341b() {
            return bl4.m40158u(this.f37991a);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof al4)) {
                return false;
            }
            return mo47842f(((al4) obj).mo30974p0());
        }

        /* renamed from: f */
        public boolean mo47842f(byte b) {
            return bl4.m40153l(this.f37991a, b);
        }

        /* renamed from: g */
        public byte mo47843g(int i) {
            return bl4.m40157s(this.f37991a, i);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return al4.m38830b(mo47843g(i));
        }

        /* renamed from: i */
        public int mo47844i(byte b) {
            return C4478ab.m37060dg(this.f37991a, b);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof al4)) {
                return -1;
            }
            return mo47844i(((al4) obj).mo30974p0());
        }

        public boolean isEmpty() {
            return bl4.m40161x(this.f37991a);
        }

        /* renamed from: j */
        public int mo47845j(byte b) {
            return C4478ab.m37188hi(this.f37991a, b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof al4)) {
                return -1;
            }
            return mo47845j(((al4) obj).mo30974p0());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"com/onedelhi/secure/yk4$d", "Lcom/onedelhi/secure/t0;", "Lcom/onedelhi/secure/xm4;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "f", "(S)Z", "", "index", "g", "(I)S", "i", "(S)I", "j", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.yk4$d */
    public static final class C7373d extends C6809t0<xm4> implements RandomAccess {

        /* renamed from: a */
        public final /* synthetic */ short[] f37992a;

        public C7373d(short[] sArr) {
            this.f37992a = sArr;
        }

        /* renamed from: b */
        public int mo34341b() {
            return ym4.m71901u(this.f37992a);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof xm4)) {
                return false;
            }
            return mo47846f(((xm4) obj).mo47362p0());
        }

        /* renamed from: f */
        public boolean mo47846f(short s) {
            return ym4.m71896l(this.f37992a, s);
        }

        /* renamed from: g */
        public short mo47847g(int i) {
            return ym4.m71900s(this.f37992a, i);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return xm4.m70692b(mo47847g(i));
        }

        /* renamed from: i */
        public int mo47848i(short s) {
            return C4478ab.m37279kg(this.f37992a, s);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof xm4)) {
                return -1;
            }
            return mo47848i(((xm4) obj).mo47362p0());
        }

        public boolean isEmpty() {
            return ym4.m71904x(this.f37992a);
        }

        /* renamed from: j */
        public int mo47849j(short s) {
            return C4478ab.m37405oi(this.f37992a, s);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof xm4)) {
                return -1;
            }
            return mo47849j(((xm4) obj).mo47362p0());
        }
    }

    @oy0
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: A */
    public static final /* synthetic */ xm4 m71814A(short[] sArr, Comparator comparator) {
        jt1.m53777p(sArr, "$this$maxWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73386M6(sArr, comparator);
    }

    @oy0
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: B */
    public static final /* synthetic */ tl4 m71815B(long[] jArr, Comparator comparator) {
        jt1.m53777p(jArr, "$this$maxWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73399N6(jArr, comparator);
    }

    @oy0
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: G */
    public static final /* synthetic */ <R extends Comparable<? super R>> al4 m71820G(byte[] bArr, ec1<? super al4, ? extends R> ec1) {
        jt1.m53777p(bArr, "$this$minBy");
        jt1.m53777p(ec1, "selector");
        if (bl4.m40161x(bArr)) {
            return null;
        }
        byte s = bl4.m40157s(bArr, 0);
        int Re = C4478ab.m36674Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(al4.m38830b(s));
            ds1 o = new is1(1, Re).iterator();
            while (o.hasNext()) {
                byte s2 = bl4.m40157s(bArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(al4.m38830b(s2));
                if (comparable.compareTo(comparable2) > 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return al4.m38830b(s);
    }

    @oy0
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: H */
    public static final /* synthetic */ <R extends Comparable<? super R>> tl4 m71821H(long[] jArr, ec1<? super tl4, ? extends R> ec1) {
        jt1.m53777p(jArr, "$this$minBy");
        jt1.m53777p(ec1, "selector");
        if (ul4.m67120x(jArr)) {
            return null;
        }
        long s = ul4.m67116s(jArr, 0);
        int We = C4478ab.m36834We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(tl4.m65991b(s));
            ds1 o = new is1(1, We).iterator();
            while (o.hasNext()) {
                long s2 = ul4.m67116s(jArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(tl4.m65991b(s2));
                if (comparable.compareTo(comparable2) > 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return tl4.m65991b(s);
    }

    @oy0
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: I */
    public static final /* synthetic */ <R extends Comparable<? super R>> il4 m71822I(int[] iArr, ec1<? super il4, ? extends R> ec1) {
        jt1.m53777p(iArr, "$this$minBy");
        jt1.m53777p(ec1, "selector");
        if (nl4.m58212x(iArr)) {
            return null;
        }
        int s = nl4.m58208s(iArr, 0);
        int Ve = C4478ab.m36802Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(il4.m52414b(s));
            ds1 o = new is1(1, Ve).iterator();
            while (o.hasNext()) {
                int s2 = nl4.m58208s(iArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(il4.m52414b(s2));
                if (comparable.compareTo(comparable2) > 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return il4.m52414b(s);
    }

    @oy0
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: J */
    public static final /* synthetic */ <R extends Comparable<? super R>> xm4 m71823J(short[] sArr, ec1<? super xm4, ? extends R> ec1) {
        jt1.m53777p(sArr, "$this$minBy");
        jt1.m53777p(ec1, "selector");
        if (ym4.m71904x(sArr)) {
            return null;
        }
        short s = ym4.m71900s(sArr, 0);
        int Ye = C4478ab.m36898Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(xm4.m70692b(s));
            ds1 o = new is1(1, Ye).iterator();
            while (o.hasNext()) {
                short s2 = ym4.m71900s(sArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(xm4.m70692b(s2));
                if (comparable.compareTo(comparable2) > 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return xm4.m70692b(s);
    }

    @oy0
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: K */
    public static final /* synthetic */ al4 m71824K(byte[] bArr, Comparator comparator) {
        jt1.m53777p(bArr, "$this$minWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73413O7(bArr, comparator);
    }

    @oy0
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: L */
    public static final /* synthetic */ il4 m71825L(int[] iArr, Comparator comparator) {
        jt1.m53777p(iArr, "$this$minWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73426P7(iArr, comparator);
    }

    @oy0
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: M */
    public static final /* synthetic */ xm4 m71826M(short[] sArr, Comparator comparator) {
        jt1.m53777p(sArr, "$this$minWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73439Q7(sArr, comparator);
    }

    @oy0
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: N */
    public static final /* synthetic */ tl4 m71827N(long[] jArr, Comparator comparator) {
        jt1.m53777p(jArr, "$this$minWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73452R7(jArr, comparator);
    }

    @oy0
    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: O */
    public static final BigDecimal m71828O(byte[] bArr, ec1<? super al4, ? extends BigDecimal> ec1) {
        jt1.m53777p(bArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = bl4.m40158u(bArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(al4.m38830b(bl4.m40157s(bArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: P */
    public static final BigDecimal m71829P(int[] iArr, ec1<? super il4, ? extends BigDecimal> ec1) {
        jt1.m53777p(iArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = nl4.m58209u(iArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(il4.m52414b(nl4.m58208s(iArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: Q */
    public static final BigDecimal m71830Q(long[] jArr, ec1<? super tl4, ? extends BigDecimal> ec1) {
        jt1.m53777p(jArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = ul4.m67117u(jArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(tl4.m65991b(ul4.m67116s(jArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: R */
    public static final BigDecimal m71831R(short[] sArr, ec1<? super xm4, ? extends BigDecimal> ec1) {
        jt1.m53777p(sArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = ym4.m71901u(sArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(xm4.m70692b(ym4.m71900s(sArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: S */
    public static final BigInteger m71832S(byte[] bArr, ec1<? super al4, ? extends BigInteger> ec1) {
        jt1.m53777p(bArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = bl4.m40158u(bArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(al4.m38830b(bl4.m40157s(bArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: T */
    public static final BigInteger m71833T(int[] iArr, ec1<? super il4, ? extends BigInteger> ec1) {
        jt1.m53777p(iArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = nl4.m58209u(iArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(il4.m52414b(nl4.m58208s(iArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: U */
    public static final BigInteger m71834U(long[] jArr, ec1<? super tl4, ? extends BigInteger> ec1) {
        jt1.m53777p(jArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = ul4.m67117u(jArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(tl4.m65991b(ul4.m67116s(jArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: V */
    public static final BigInteger m71835V(short[] sArr, ec1<? super xm4, ? extends BigInteger> ec1) {
        jt1.m53777p(sArr, "$this$sumOf");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        int u = ym4.m71901u(sArr);
        for (int i = 0; i < u; i++) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(xm4.m70692b(ym4.m71900s(sArr, i))));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: a */
    public static final List<il4> m71836a(@vr2 int[] iArr) {
        jt1.m53777p(iArr, "$this$asList");
        return new C7370a(iArr);
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: b */
    public static final List<al4> m71837b(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "$this$asList");
        return new C7372c(bArr);
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: c */
    public static final List<tl4> m71838c(@vr2 long[] jArr) {
        jt1.m53777p(jArr, "$this$asList");
        return new C7371b(jArr);
    }

    @oy0
    @vr2
    @gz3(version = "1.3")
    /* renamed from: d */
    public static final List<xm4> m71839d(@vr2 short[] sArr) {
        jt1.m53777p(sArr, "$this$asList");
        return new C7373d(sArr);
    }

    @gz3(version = "1.3")
    @oy0
    /* renamed from: e */
    public static final int m71840e(@vr2 int[] iArr, int i, int i2, int i3) {
        jt1.m53777p(iArr, "$this$binarySearch");
        C6809t0.f35278a.mo44672d(i2, i3, nl4.m58209u(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int c = mo4.m57477c(iArr[i5], i);
            if (c < 0) {
                i2 = i5 + 1;
            } else if (c <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: f */
    public static /* synthetic */ int m71841f(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = nl4.m58209u(iArr);
        }
        return m71840e(iArr, i, i2, i3);
    }

    @gz3(version = "1.3")
    @oy0
    /* renamed from: g */
    public static final int m71842g(@vr2 short[] sArr, short s, int i, int i2) {
        jt1.m53777p(sArr, "$this$binarySearch");
        C6809t0.f35278a.mo44672d(i, i2, ym4.m71901u(sArr));
        short s2 = s & xm4.f37547c;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int c = mo4.m57477c(sArr[i4], s2);
            if (c < 0) {
                i = i4 + 1;
            } else if (c <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: h */
    public static /* synthetic */ int m71843h(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ym4.m71901u(sArr);
        }
        return m71842g(sArr, s, i, i2);
    }

    @gz3(version = "1.3")
    @oy0
    /* renamed from: i */
    public static final int m71844i(@vr2 long[] jArr, long j, int i, int i2) {
        jt1.m53777p(jArr, "$this$binarySearch");
        C6809t0.f35278a.mo44672d(i, i2, ul4.m67117u(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int g = mo4.m57481g(jArr[i4], j);
            if (g < 0) {
                i = i4 + 1;
            } else if (g <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: j */
    public static /* synthetic */ int m71845j(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ul4.m67117u(jArr);
        }
        return m71844i(jArr, j, i, i2);
    }

    @gz3(version = "1.3")
    @oy0
    /* renamed from: k */
    public static final int m71846k(@vr2 byte[] bArr, byte b, int i, int i2) {
        jt1.m53777p(bArr, "$this$binarySearch");
        C6809t0.f35278a.mo44672d(i, i2, bl4.m40158u(bArr));
        byte b2 = b & 255;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int c = mo4.m57477c(bArr[i4], b2);
            if (c < 0) {
                i = i4 + 1;
            } else if (c <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: l */
    public static /* synthetic */ int m71847l(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bl4.m40158u(bArr);
        }
        return m71846k(bArr, b, i, i2);
    }

    @gz3(version = "1.3")
    @xq1
    @oy0
    /* renamed from: m */
    public static final byte m71848m(byte[] bArr, int i) {
        jt1.m53777p(bArr, "$this$elementAt");
        return bl4.m40157s(bArr, i);
    }

    @gz3(version = "1.3")
    @xq1
    @oy0
    /* renamed from: n */
    public static final short m71849n(short[] sArr, int i) {
        jt1.m53777p(sArr, "$this$elementAt");
        return ym4.m71900s(sArr, i);
    }

    @gz3(version = "1.3")
    @xq1
    @oy0
    /* renamed from: o */
    public static final int m71850o(int[] iArr, int i) {
        jt1.m53777p(iArr, "$this$elementAt");
        return nl4.m58208s(iArr, i);
    }

    @gz3(version = "1.3")
    @xq1
    @oy0
    /* renamed from: p */
    public static final long m71851p(long[] jArr, int i) {
        jt1.m53777p(jArr, "$this$elementAt");
        return ul4.m67116s(jArr, i);
    }

    @oy0
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: u */
    public static final /* synthetic */ <R extends Comparable<? super R>> al4 m71856u(byte[] bArr, ec1<? super al4, ? extends R> ec1) {
        jt1.m53777p(bArr, "$this$maxBy");
        jt1.m53777p(ec1, "selector");
        if (bl4.m40161x(bArr)) {
            return null;
        }
        byte s = bl4.m40157s(bArr, 0);
        int Re = C4478ab.m36674Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(al4.m38830b(s));
            ds1 o = new is1(1, Re).iterator();
            while (o.hasNext()) {
                byte s2 = bl4.m40157s(bArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(al4.m38830b(s2));
                if (comparable.compareTo(comparable2) < 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return al4.m38830b(s);
    }

    @oy0
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: v */
    public static final /* synthetic */ <R extends Comparable<? super R>> tl4 m71857v(long[] jArr, ec1<? super tl4, ? extends R> ec1) {
        jt1.m53777p(jArr, "$this$maxBy");
        jt1.m53777p(ec1, "selector");
        if (ul4.m67120x(jArr)) {
            return null;
        }
        long s = ul4.m67116s(jArr, 0);
        int We = C4478ab.m36834We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(tl4.m65991b(s));
            ds1 o = new is1(1, We).iterator();
            while (o.hasNext()) {
                long s2 = ul4.m67116s(jArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(tl4.m65991b(s2));
                if (comparable.compareTo(comparable2) < 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return tl4.m65991b(s);
    }

    @oy0
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: w */
    public static final /* synthetic */ <R extends Comparable<? super R>> il4 m71858w(int[] iArr, ec1<? super il4, ? extends R> ec1) {
        jt1.m53777p(iArr, "$this$maxBy");
        jt1.m53777p(ec1, "selector");
        if (nl4.m58212x(iArr)) {
            return null;
        }
        int s = nl4.m58208s(iArr, 0);
        int Ve = C4478ab.m36802Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(il4.m52414b(s));
            ds1 o = new is1(1, Ve).iterator();
            while (o.hasNext()) {
                int s2 = nl4.m58208s(iArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(il4.m52414b(s2));
                if (comparable.compareTo(comparable2) < 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return il4.m52414b(s);
    }

    @oy0
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    @gz3(version = "1.3")
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: x */
    public static final /* synthetic */ <R extends Comparable<? super R>> xm4 m71859x(short[] sArr, ec1<? super xm4, ? extends R> ec1) {
        jt1.m53777p(sArr, "$this$maxBy");
        jt1.m53777p(ec1, "selector");
        if (ym4.m71904x(sArr)) {
            return null;
        }
        short s = ym4.m71900s(sArr, 0);
        int Ye = C4478ab.m36898Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) ec1.mo17094X(xm4.m70692b(s));
            ds1 o = new is1(1, Ye).iterator();
            while (o.hasNext()) {
                short s2 = ym4.m71900s(sArr, o.mo19249b());
                Comparable comparable2 = (Comparable) ec1.mo17094X(xm4.m70692b(s2));
                if (comparable.compareTo(comparable2) < 0) {
                    s = s2;
                    comparable = comparable2;
                }
            }
        }
        return xm4.m70692b(s);
    }

    @oy0
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: y */
    public static final /* synthetic */ al4 m71860y(byte[] bArr, Comparator comparator) {
        jt1.m53777p(bArr, "$this$maxWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73360K6(bArr, comparator);
    }

    @oy0
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @gz3(version = "1.3")
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: z */
    public static final /* synthetic */ il4 m71861z(int[] iArr, Comparator comparator) {
        jt1.m53777p(iArr, "$this$maxWith");
        jt1.m53777p(comparator, "comparator");
        return zk4.m73373L6(iArr, comparator);
    }
}
