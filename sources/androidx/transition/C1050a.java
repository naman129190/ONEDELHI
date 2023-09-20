package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.onedelhi.secure.mr2;

/* renamed from: androidx.transition.a */
public class C1050a {

    /* renamed from: androidx.transition.a$a */
    public interface C1051a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    public static void m7118a(@mr2 Animator animator, @mr2 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m7119b(@mr2 Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m7120c(@mr2 Animator animator) {
        animator.resume();
    }
}
