package com.onedelhi.secure;

import com.onedelhi.secure.nl6;
import com.onedelhi.secure.pl6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class pl6<MessageType extends pl6<MessageType, BuilderType>, BuilderType extends nl6<MessageType, BuilderType>> implements vs6 {
    public int zzb = 0;

    /* renamed from: g */
    public static void m24800g(Iterable iterable, List list) {
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(iterable);
        if (iterable instanceof kr6) {
            List X = ((kr6) iterable).mo18557X();
            kr6 kr6 = (kr6) list;
            int size = list.size();
            for (Object next : X) {
                if (next == null) {
                    String str = "Element at index " + (kr6.size() - size) + " is null.";
                    int size2 = kr6.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            kr6.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof on6) {
                    kr6.mo18563h((on6) next);
                } else {
                    kr6.add((String) next);
                }
            }
        } else if (!(iterable instanceof ct6)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: c */
    public final on6 mo22496c() {
        try {
            int b = mo18536b();
            on6 on6 = on6.f18031a;
            byte[] bArr = new byte[b];
            eo6 A = eo6.m13904A(bArr, 0, b);
            mo18535a(A);
            A.mo15262a();
            return new pm6(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: f */
    public int mo18539f(gt6 gt6) {
        throw null;
    }

    /* renamed from: h */
    public final byte[] mo22497h() {
        try {
            int b = mo18536b();
            byte[] bArr = new byte[b];
            eo6 A = eo6.m13904A(bArr, 0, b);
            mo18535a(A);
            A.mo15262a();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
