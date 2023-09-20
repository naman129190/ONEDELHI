package com.onedelhi.secure;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.tn1;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
public final class nt2<T> extends tn1.C3647a {

    /* renamed from: a */
    public final Object f17564a;

    public nt2(Object obj) {
        this.f17564a = obj;
    }

    @mr2
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* renamed from: k8 */
    public static <T> T m23165k8(@mr2 tn1 tn1) {
        if (tn1 instanceof nt2) {
            return ((nt2) tn1).f17564a;
        }
        IBinder asBinder = tn1.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    @mr2
    @KeepForSdk
    /* renamed from: l8 */
    public static <T> tn1 m23166l8(@mr2 T t) {
        return new nt2(t);
    }
}
