package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        mo6794W0();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6794W0();
    }

    /* renamed from: W0 */
    public final void mo6794W0() {
        mo6983S0(1);
        mo6970F0(new Fade(2)).mo6970F0(new ChangeBounds()).mo6970F0(new Fade(1));
    }
}
