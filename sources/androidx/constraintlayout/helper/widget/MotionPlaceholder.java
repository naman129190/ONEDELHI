package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import com.onedelhi.secure.dw4;
import com.onedelhi.secure.i23;
import com.onedelhi.secure.jl1;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.p60;

public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: d */
    public static final String f1944d = "MotionPlaceholder";

    /* renamed from: a */
    public i23 f1945a;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }

    /* renamed from: H */
    public void mo2720H(p60 p60, jl1 jl1, SparseArray<o60> sparseArray) {
    }

    /* renamed from: J */
    public void mo2675J(dw4 dw4, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (dw4 != null) {
            dw4.mo14918v2(mode, size, mode2, size2);
            setMeasuredDimension(dw4.mo14913q2(), dw4.mo14912p2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2675J(this.f1945a, i, i2);
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        this.f2460a = new i23();
        mo3196I();
    }
}
