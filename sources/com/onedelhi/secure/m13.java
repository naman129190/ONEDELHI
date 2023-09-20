package com.onedelhi.secure;

import android.os.Build;
import android.os.PersistableBundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/m13;", "", "", "capacity", "Landroid/os/PersistableBundle;", "a", "persistableBundle", "", "key", "value", "Lcom/onedelhi/secure/un4;", "b", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(21)
public final class m13 {
    @vr2

    /* renamed from: a */
    public static final m13 f15865a = new m13();

    @zw1
    @pn0
    @vr2
    /* renamed from: a */
    public static final PersistableBundle m21184a(int i) {
        return new PersistableBundle(i);
    }

    @zw1
    @pn0
    /* renamed from: b */
    public static final void m21185b(@vr2 PersistableBundle persistableBundle, @ss2 String str, @ss2 Object obj) {
        String str2;
        jt1.m53777p(persistableBundle, "persistableBundle");
        if (obj == null) {
            str2 = null;
        } else if (obj instanceof Boolean) {
            if (Build.VERSION.SDK_INT >= 22) {
                n13.m22272a(persistableBundle, str, ((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Illegal value type boolean for key \"" + str + tk4.f35693a);
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        } else if (obj instanceof String) {
            str2 = (String) obj;
        } else if (obj instanceof boolean[]) {
            if (Build.VERSION.SDK_INT >= 22) {
                n13.m22273b(persistableBundle, str, (boolean[]) obj);
                return;
            }
            throw new IllegalArgumentException("Illegal value type boolean[] for key \"" + str + tk4.f35693a);
        } else if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        } else if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        } else if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        } else if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            jt1.m53774m(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            String canonicalName = componentType.getCanonicalName();
            throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + str + tk4.f35693a);
        } else {
            String canonicalName2 = obj.getClass().getCanonicalName();
            throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + str + tk4.f35693a);
        }
        persistableBundle.putString(str, str2);
    }
}
