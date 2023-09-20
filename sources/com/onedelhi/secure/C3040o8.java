package com.onedelhi.secure;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.onedelhi.secure.b70;

/* renamed from: com.onedelhi.secure.o8 */
public final class C3040o8 {

    /* renamed from: a */
    public static final String f17878a = "ReceiveContent";

    @sj3(24)
    /* renamed from: com.onedelhi.secure.o8$a */
    public static final class C3041a {
        /* JADX INFO: finally extract failed */
        @pn0
        /* renamed from: a */
        public static boolean m23606a(@mr2 DragEvent dragEvent, @mr2 TextView textView, @mr2 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                jt4.m18981m1(textView, new b70.C1754b(dragEvent.getClipData(), 3).mo13491a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @pn0
        /* renamed from: b */
        public static boolean m23607b(@mr2 DragEvent dragEvent, @mr2 View view, @mr2 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            jt4.m18981m1(view, new b70.C1754b(dragEvent.getClipData(), 3).mo13491a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m23603a(@mr2 View view, @mr2 DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && jt4.m18960h0(view) != null) {
            Activity c = m23605c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? C3041a.m23606a(dragEvent, (TextView) view, c) : C3041a.m23607b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m23604b(@mr2 TextView textView, int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || jt4.m18960h0(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            b70.C1754b bVar = new b70.C1754b(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            jt4.m18981m1(textView, bVar.mo13494d(i2).mo13491a());
        }
        return true;
    }

    @ts2
    /* renamed from: c */
    public static Activity m23605c(@mr2 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
