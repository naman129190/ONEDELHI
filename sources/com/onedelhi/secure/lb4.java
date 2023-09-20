package com.onedelhi.secure;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class lb4 implements cv2 {

    /* renamed from: a */
    public static final String f15284a = "ReceiveContent";

    @sj3(16)
    /* renamed from: com.onedelhi.secure.lb4$a */
    public static final class C2716a {
        /* renamed from: a */
        public static CharSequence m20445a(@mr2 Context context, @mr2 ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: com.onedelhi.secure.lb4$b */
    public static final class C2717b {
        /* renamed from: a */
        public static CharSequence m20446a(@mr2 Context context, @mr2 ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    public static CharSequence m20442b(@mr2 Context context, @mr2 ClipData.Item item, int i) {
        return C2716a.m20445a(context, item, i);
    }

    /* renamed from: c */
    public static void m20443c(@mr2 Editable editable, @mr2 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @ts2
    /* renamed from: a */
    public b70 mo14391a(@mr2 View view, @mr2 b70 b70) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + b70);
        }
        if (b70.mo13487g() == 2) {
            return b70;
        }
        ClipData c = b70.mo13483c();
        int e = b70.mo13485e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            CharSequence b = m20442b(context, c.getItemAt(i), e);
            if (b != null) {
                if (!z) {
                    m20443c(editable, b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b);
                }
            }
        }
        return null;
    }
}
