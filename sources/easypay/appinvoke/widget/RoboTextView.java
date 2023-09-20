package easypay.appinvoke.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.onedelhi.secure.de3;
import easypay.appinvoke.manager.Constants;

public class RoboTextView extends AppCompatTextView {
    public RoboTextView(Context context) {
        super(context);
    }

    public RoboTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            mo48861h(context, attributeSet);
        }
    }

    public RoboTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            mo48861h(context, attributeSet);
        }
    }

    /* renamed from: h */
    public final void mo48861h(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, de3.C5013n.RoboTextView);
        try {
            int integer = obtainStyledAttributes.getInteger(de3.C5013n.RoboTextView_fontType, 0);
            if (integer != 0) {
                if (integer != 1) {
                    if (integer == 2) {
                        typeface = Typeface.create("sans-serif", 0);
                    } else if (integer == 3) {
                        str = Constants.FONT_FAMILY_SANS_SERIF_MEDIUM;
                    } else if (integer == 4) {
                        typeface = Typeface.create("sans-serif", 1);
                    } else if (integer == 5) {
                        typeface = Typeface.create("sans-serif", 2);
                    } else {
                        return;
                    }
                    setTypeface(typeface);
                }
                str = Constants.FONT_FAMILY_SANS_SERIF_LIGHT;
                typeface = Typeface.create(str, 0);
                setTypeface(typeface);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
