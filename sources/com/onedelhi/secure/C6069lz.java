package com.onedelhi.secure;

import java.lang.Comparable;
import kotlin.Metadata;

@gz3(version = "1.1")
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/lz;", "", "T", "Lcom/onedelhi/secure/mz;", "value", "", "b", "(Ljava/lang/Comparable;)Z", "isEmpty", "a", "f", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.lz */
public interface C6069lz<T extends Comparable<? super T>> extends C6158mz<T> {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.lz$a */
    public static final class C6070a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m56660a(@vr2 C6069lz<T> lzVar, @vr2 T t) {
            jt1.m53777p(t, "value");
            return lzVar.mo38939f(lzVar.mo27428i(), t) && lzVar.mo38939f(t, lzVar.mo27427g());
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m56661b(@vr2 C6069lz<T> lzVar) {
            return !lzVar.mo38939f(lzVar.mo27428i(), lzVar.mo27427g());
        }
    }

    /* renamed from: b */
    boolean mo27426b(@vr2 T t);

    /* renamed from: f */
    boolean mo38939f(@vr2 T t, @vr2 T t2);

    boolean isEmpty();
}
