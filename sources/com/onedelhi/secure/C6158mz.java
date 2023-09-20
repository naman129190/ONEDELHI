package com.onedelhi.secure;

import java.lang.Comparable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/mz;", "", "T", "", "value", "", "b", "(Ljava/lang/Comparable;)Z", "isEmpty", "i", "()Ljava/lang/Comparable;", "start", "g", "endInclusive", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.mz */
public interface C6158mz<T extends Comparable<? super T>> {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.mz$a */
    public static final class C6159a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m57757a(@vr2 C6158mz<T> mzVar, @vr2 T t) {
            jt1.m53777p(t, "value");
            return t.compareTo(mzVar.mo27428i()) >= 0 && t.compareTo(mzVar.mo27427g()) <= 0;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m57758b(@vr2 C6158mz<T> mzVar) {
            return mzVar.mo27428i().compareTo(mzVar.mo27427g()) > 0;
        }
    }

    /* renamed from: b */
    boolean mo27426b(@vr2 T t);

    @vr2
    /* renamed from: g */
    T mo27427g();

    @vr2
    /* renamed from: i */
    T mo27428i();

    boolean isEmpty();
}
