package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wk0;

public class SupportErrorDialogFragment extends wk0 {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @ts2
    private Dialog zac;

    @mr2
    public static SupportErrorDialogFragment newInstance(@mr2 Dialog dialog) {
        return newInstance(dialog, (DialogInterface.OnCancelListener) null);
    }

    @mr2
    public static SupportErrorDialogFragment newInstance(@mr2 Dialog dialog, @ts2 DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(@mr2 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @mr2
    public Dialog onCreateDialog(@ts2 Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
        }
        return this.zac;
    }

    public void show(@mr2 FragmentManager fragmentManager, @ts2 String str) {
        super.show(fragmentManager, str);
    }
}
