package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0366c;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.f13188c})
public class FitWindowsFrameLayout extends FrameLayout implements C0366c {

    /* renamed from: a */
    public C0366c.C0367a f1427a;

    public FitWindowsFrameLayout(@mr2 Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        C0366c.C0367a aVar = this.f1427a;
        if (aVar != null) {
            aVar.mo1064a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0366c.C0367a aVar) {
        this.f1427a = aVar;
    }
}
