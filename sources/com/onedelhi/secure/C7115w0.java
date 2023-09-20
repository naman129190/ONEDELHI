package com.onedelhi.secure;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/w0;", "", "E", "K", "V", "Lcom/onedelhi/secure/d1;", "element", "", "f", "(Ljava/util/Map$Entry;)Z", "g", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.w0 */
public abstract class C7115w0<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C4945d1<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo46454f((Map.Entry) obj);
    }

    /* renamed from: f */
    public final boolean mo46454f(@vr2 E e) {
        jt1.m53777p(e, "element");
        return mo39202g(e);
    }

    /* renamed from: g */
    public abstract boolean mo39202g(@vr2 Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: i */
    public /* bridge */ boolean mo39203i(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo39203i((Map.Entry) obj);
    }
}
