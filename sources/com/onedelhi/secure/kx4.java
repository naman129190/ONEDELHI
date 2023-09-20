package com.onedelhi.secure;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.onedelhi.secure.hl3;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class kx4 implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f15105a;

    @sj3(23)
    /* renamed from: com.onedelhi.secure.kx4$a */
    public static class C2678a {
        @pn0
        /* renamed from: a */
        public static boolean m20073a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @pn0
        /* renamed from: b */
        public static ActionMode m20074b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.kx4$b */
    public static class C2679b {
        @pn0
        /* renamed from: a */
        public static void m20075a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.kx4$c */
    public static class C2680c {
        @pn0
        /* renamed from: a */
        public static void m20076a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public kx4(Window.Callback callback) {
        if (callback != null) {
            this.f15105a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo19227a() {
        return this.f15105a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f15105a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f15105a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f15105a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f15105a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f15105a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f15105a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f15105a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f15105a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f15105a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f15105a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f15105a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f15105a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f15105a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f15105a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f15105a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f15105a.onPanelClosed(i, menu);
    }

    @sj3(26)
    public void onPointerCaptureChanged(boolean z) {
        C2680c.m20076a(this.f15105a, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f15105a.onPreparePanel(i, view, menu);
    }

    @sj3(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C2679b.m20075a(this.f15105a, list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f15105a.onSearchRequested();
    }

    @sj3(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C2678a.m20073a(this.f15105a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f15105a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f15105a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f15105a.onWindowStartingActionMode(callback);
    }

    @sj3(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C2678a.m20074b(this.f15105a, callback, i);
    }
}
