package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.onedelhi.secure.hl3;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.j7 */
public class C2479j7 {
    /* renamed from: a */
    public static void m18186a(@mr2 AnimatorSet animatorSet, @mr2 List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
