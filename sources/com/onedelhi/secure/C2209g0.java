package com.onedelhi.secure;

import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.onedelhi.secure.hl3;
import java.util.List;

@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.g0 */
public class C2209g0 {
    @C1717al({"android:entries"})
    /* renamed from: a */
    public static <T> void m15428a(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof wt2) {
                ((wt2) adapter).mo26678b(list);
            } else {
                absSpinner.setAdapter(new wt2(absSpinner.getContext(), list, 17367048, 17367049, 0));
            }
        } else {
            absSpinner.setAdapter((SpinnerAdapter) null);
        }
    }

    @C1717al({"android:entries"})
    /* renamed from: b */
    public static <T extends CharSequence> void m15429b(AbsSpinner absSpinner, T[] tArr) {
        if (tArr != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            boolean z = false;
            if (adapter != null && adapter.getCount() == tArr.length) {
                int i = 0;
                while (true) {
                    if (i >= tArr.length) {
                        break;
                    } else if (!tArr[i].equals(adapter.getItem(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), 17367048, tArr);
                arrayAdapter.setDropDownViewResource(17367049);
                absSpinner.setAdapter(arrayAdapter);
                return;
            }
            return;
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
