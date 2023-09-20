package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onedelhi.secure.hl3;

public class wk0 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId = -1;
    private boolean mCancelable = true;
    private boolean mCreatingDialog;
    /* access modifiers changed from: private */
    @ts2
    public Dialog mDialog;
    private boolean mDialogCreated = false;
    private Runnable mDismissRunnable = new C3853a();
    private boolean mDismissed;
    private Handler mHandler;
    private bu2<a32> mObserver = new C3856d();
    private DialogInterface.OnCancelListener mOnCancelListener = new C3854b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener mOnDismissListener = new C3855c();
    private boolean mShownByMe;
    /* access modifiers changed from: private */
    public boolean mShowsDialog = true;
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mViewDestroyed;

    /* renamed from: com.onedelhi.secure.wk0$a */
    public class C3853a implements Runnable {
        public C3853a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            wk0.this.mOnDismissListener.onDismiss(wk0.this.mDialog);
        }
    }

    /* renamed from: com.onedelhi.secure.wk0$b */
    public class C3854b implements DialogInterface.OnCancelListener {
        public C3854b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@ts2 DialogInterface dialogInterface) {
            if (wk0.this.mDialog != null) {
                wk0 wk0 = wk0.this;
                wk0.onCancel(wk0.mDialog);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wk0$c */
    public class C3855c implements DialogInterface.OnDismissListener {
        public C3855c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@ts2 DialogInterface dialogInterface) {
            if (wk0.this.mDialog != null) {
                wk0 wk0 = wk0.this;
                wk0.onDismiss(wk0.mDialog);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wk0$d */
    public class C3856d implements bu2<a32> {
        public C3856d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo3946b(a32 a32) {
            if (a32 != null && wk0.this.mShowsDialog) {
                View requireView = wk0.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (wk0.this.mDialog != null) {
                    if (FragmentManager.m4279T0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + wk0.this.mDialog);
                    }
                    wk0.this.mDialog.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wk0$e */
    public class C3857e extends ta1 {

        /* renamed from: a */
        public final /* synthetic */ ta1 f22193a;

        public C3857e(ta1 ta1) {
            this.f22193a = ta1;
        }

        @ts2
        /* renamed from: c */
        public View mo4428c(int i) {
            return this.f22193a.mo4429d() ? this.f22193a.mo4428c(i) : wk0.this.onFindViewById(i);
        }

        /* renamed from: d */
        public boolean mo4429d() {
            return this.f22193a.mo4429d() || wk0.this.onHasView();
        }
    }

    public wk0() {
    }

    public wk0(@s12 int i) {
        super(i);
    }

    @mr2
    public ta1 createFragmentContainer() {
        return new C3857e(super.createFragmentContainer());
    }

    public void dismiss() {
        mo26620q(false, false);
    }

    public void dismissAllowingStateLoss() {
        mo26620q(true, false);
    }

    @ts2
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @e64
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @bc2
    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().mo4927k(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public void onCancel(@mr2 DialogInterface dialogInterface) {
    }

    @bc2
    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @bc2
    @mr2
    public Dialog onCreateDialog(@ts2 Bundle bundle) {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @bc2
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @bc2
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().mo4931o(this.mObserver);
    }

    public void onDismiss(@mr2 DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (FragmentManager.m4279T0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            mo26620q(true, true);
        }
    }

    @ts2
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @mr2
    public LayoutInflater onGetLayoutInflater(@ts2 Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (FragmentManager.m4279T0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.mShowsDialog) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return onGetLayoutInflater;
        }
        mo26621r(bundle);
        if (FragmentManager.m4279T0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @bc2
    public void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @bc2
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            kv4.m20051b(decorView, this);
            ov4.m24127b(decorView, this);
            mv4.m22038b(decorView, this);
        }
    }

    @bc2
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @bc2
    public void onViewStateRestored(@ts2 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public void performCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: q */
    public final void mo26620q(boolean z, boolean z2) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.mDialog.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.mHandler.getLooper()) {
                        onDismiss(this.mDialog);
                    } else {
                        this.mHandler.post(this.mDismissRunnable);
                    }
                }
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                getParentFragmentManager().mo4599m1(this.mBackStackId, 1);
                this.mBackStackId = -1;
                return;
            }
            C0657l r = getParentFragmentManager().mo4611r();
            r.mo4709B(this);
            if (z) {
                r.mo4727r();
            } else {
                r.mo4726q();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r */
    public final void mo26621r(@ts2 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @mr2
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, @e64 int i2) {
        if (FragmentManager.m4279T0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@mr2 Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(@mr2 C0657l lVar, @ts2 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        lVar.mo4865k(this, str);
        this.mViewDestroyed = false;
        int q = lVar.mo4726q();
        this.mBackStackId = q;
        return q;
    }

    public void show(@mr2 FragmentManager fragmentManager, @ts2 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C0657l r = fragmentManager.mo4611r();
        r.mo4865k(this, str);
        r.mo4726q();
    }

    public void showNow(@mr2 FragmentManager fragmentManager, @ts2 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C0657l r = fragmentManager.mo4611r();
        r.mo4865k(this, str);
        r.mo4728s();
    }
}
