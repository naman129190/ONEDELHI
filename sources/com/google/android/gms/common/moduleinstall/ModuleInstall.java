package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.onedelhi.secure.mr2;

public final class ModuleInstall {
    private ModuleInstall() {
    }

    @mr2
    public static ModuleInstallClient getClient(@mr2 Activity activity) {
        return new zay(activity);
    }

    @mr2
    public static ModuleInstallClient getClient(@mr2 Context context) {
        return new zay(context);
    }
}
