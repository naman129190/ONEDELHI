package com.onedelhi.secure;

import androidx.cardview.widget.CardView;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @C1983dl(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @C1983dl(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @C1983dl(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.gv */
public class C2279gv {
    @C1717al({"contentPadding"})
    /* renamed from: a */
    public static void m16263a(CardView cardView, int i) {
        cardView.setContentPadding(i, i, i, i);
    }

    @C1717al({"contentPaddingBottom"})
    /* renamed from: b */
    public static void m16264b(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i);
    }

    @C1717al({"contentPaddingLeft"})
    /* renamed from: c */
    public static void m16265c(CardView cardView, int i) {
        cardView.setContentPadding(i, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @C1717al({"contentPaddingRight"})
    /* renamed from: d */
    public static void m16266d(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i, cardView.getContentPaddingBottom());
    }

    @C1717al({"contentPaddingTop"})
    /* renamed from: e */
    public static void m16267e(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), i, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
