package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.onedelhi.secure.C2934n8;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    public final C2934n8 f1370a;

    public AppCompatRatingBar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRatingBar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.ratingBarStyle);
    }

    public AppCompatRatingBar(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qb4.m25632a(this, getContext());
        C2934n8 n8Var = new C2934n8(this);
        this.f1370a = n8Var;
        n8Var.mo20993c(attributeSet, i);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1370a.mo20992b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
