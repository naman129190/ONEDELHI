package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(@mr2 Context context) {
        super(context);
    }

    public DialogTitle(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, za3.C4068m.TextAppearance, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }
}
