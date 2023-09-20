package com.onedelhi.secure;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import com.onedelhi.secure.hl3;
import java.util.regex.Pattern;

@hl3({hl3.C2354a.LIBRARY})
public class n94 {

    /* renamed from: a */
    public static final int f17230a = 20;

    /* renamed from: a */
    public static Pattern f17231a = Pattern.compile("\\s*,\\s*");

    /* renamed from: a */
    public static SparseBooleanArray m22530a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String parseInt : f17231a.split(charSequence)) {
            try {
                int parseInt2 = Integer.parseInt(parseInt);
                if (parseInt2 >= 0) {
                    sparseBooleanArray.put(parseInt2, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @C1717al({"android:collapseColumns"})
    /* renamed from: b */
    public static void m22531b(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray a = m22530a(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = a.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    @C1717al({"android:shrinkColumns"})
    /* renamed from: c */
    public static void m22532c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setShrinkAllColumns(false);
            SparseBooleanArray a = m22530a(charSequence);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                int keyAt = a.keyAt(i);
                boolean valueAt = a.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnShrinkable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setShrinkAllColumns(true);
    }

    @C1717al({"android:stretchColumns"})
    /* renamed from: d */
    public static void m22533d(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setStretchAllColumns(false);
            SparseBooleanArray a = m22530a(charSequence);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                int keyAt = a.keyAt(i);
                boolean valueAt = a.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnStretchable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setStretchAllColumns(true);
    }
}
