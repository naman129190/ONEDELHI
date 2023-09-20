package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

public class nl2 {

    /* renamed from: a */
    public static final String f17482a = "MotionSpec";

    /* renamed from: a */
    public final ty3<String, ol2> f17483a = new ty3<>();

    /* renamed from: b */
    public final ty3<String, PropertyValuesHolder[]> f17484b = new ty3<>();

    /* renamed from: a */
    public static void m22933a(@mr2 nl2 nl2, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            nl2.mo21378l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            nl2.mo21379m(objectAnimator.getPropertyName(), ol2.m23863b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @ts2
    /* renamed from: c */
    public static nl2 m22934c(@mr2 Context context, @mr2 TypedArray typedArray, @g64 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m22935d(context, resourceId);
    }

    @ts2
    /* renamed from: d */
    public static nl2 m22935d(@mr2 Context context, @C2402i7 int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m22936e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m22936e(arrayList);
        } catch (Exception e) {
            Log.w(f17482a, "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @mr2
    /* renamed from: e */
    public static nl2 m22936e(@mr2 List<Animator> list) {
        nl2 nl2 = new nl2();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m22933a(nl2, list.get(i));
        }
        return nl2;
    }

    @mr2
    /* renamed from: b */
    public final PropertyValuesHolder[] mo21369b(@mr2 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl2)) {
            return false;
        }
        return this.f17483a.equals(((nl2) obj).f17483a);
    }

    @mr2
    /* renamed from: f */
    public <T> ObjectAnimator mo21371f(@mr2 String str, @mr2 T t, @mr2 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo21372g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo21373h(str).mo21979a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @mr2
    /* renamed from: g */
    public PropertyValuesHolder[] mo21372g(String str) {
        if (mo21376j(str)) {
            return mo21369b(this.f17484b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public ol2 mo21373h(String str) {
        if (mo21377k(str)) {
            return this.f17483a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f17483a.hashCode();
    }

    /* renamed from: i */
    public long mo21375i() {
        int size = this.f17483a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ol2 q = this.f17483a.mo25352q(i);
            j = Math.max(j, q.mo21980c() + q.mo21981d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo21376j(String str) {
        return this.f17484b.get(str) != null;
    }

    /* renamed from: k */
    public boolean mo21377k(String str) {
        return this.f17483a.get(str) != null;
    }

    /* renamed from: l */
    public void mo21378l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f17484b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo21379m(String str, @ts2 ol2 ol2) {
        this.f17483a.put(str, ol2);
    }

    @mr2
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f17483a + "}\n";
    }
}
