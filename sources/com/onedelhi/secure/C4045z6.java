package com.onedelhi.secure;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.onedelhi.secure.z6 */
public final class C4045z6 {

    /* renamed from: a */
    public static final ViewGroup.MarginLayoutParams f23469a;

    /* renamed from: a */
    public LinearLayoutManager f23470a;

    /* renamed from: com.onedelhi.secure.z6$a */
    public class C4046a implements Comparator<int[]> {
        public C4046a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f23469a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C4045z6(@mr2 LinearLayoutManager linearLayoutManager) {
        this.f23470a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m32872c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m32872c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo27808a() {
        int i;
        int i2;
        int i3;
        int i4;
        int Q = this.f23470a.mo5828Q();
        if (Q == 0) {
            return true;
        }
        boolean z = this.f23470a.mo5270M2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = Q;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < Q) {
            View P = this.f23470a.mo5825P(i5);
            if (P != null) {
                ViewGroup.LayoutParams layoutParams = P.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f23469a;
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = P.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = P.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = P.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = P.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C4046a());
        for (int i6 = 1; i6 < Q; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        return iArr2[0][0] <= 0 && iArr2[Q - 1][1] >= iArr2[0][1] - iArr2[0][0];
    }

    /* renamed from: b */
    public final boolean mo27809b() {
        int Q = this.f23470a.mo5828Q();
        for (int i = 0; i < Q; i++) {
            if (m32872c(this.f23470a.mo5825P(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo27810d() {
        return (!mo27808a() || this.f23470a.mo5828Q() <= 1) && mo27809b();
    }
}
