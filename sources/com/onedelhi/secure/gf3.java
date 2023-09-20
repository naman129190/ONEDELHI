package com.onedelhi.secure;

import android.widget.RatingBar;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13185a})
@ut1({@tt1(attribute = "android:rating", type = RatingBar.class)})
public class gf3 {

    /* renamed from: com.onedelhi.secure.gf3$a */
    public static class C2244a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f12553a;

        /* renamed from: a */
        public final /* synthetic */ st1 f12554a;

        public C2244a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, st1 st1) {
            this.f12553a = onRatingBarChangeListener;
            this.f12554a = st1;
        }

        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f12553a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f, z);
            }
            this.f12554a.mo24536b();
        }
    }

    @C1717al(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    /* renamed from: a */
    public static void m15813a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, st1 st1) {
        if (st1 == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new C2244a(onRatingBarChangeListener, st1));
        }
    }

    @C1717al({"android:rating"})
    /* renamed from: b */
    public static void m15814b(RatingBar ratingBar, float f) {
        if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }
}
