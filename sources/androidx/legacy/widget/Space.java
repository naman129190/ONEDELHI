package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@Deprecated
public class Space extends View {
    @Deprecated
    public Space(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public Space(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    public static int m4721a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(i, size);
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m4721a(getSuggestedMinimumWidth(), i), m4721a(getSuggestedMinimumHeight(), i2));
    }
}
