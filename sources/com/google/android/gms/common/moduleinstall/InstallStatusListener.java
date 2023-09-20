package com.google.android.gms.common.moduleinstall;

import com.onedelhi.secure.mr2;

public interface InstallStatusListener {
    void onInstallStatusUpdated(@mr2 ModuleInstallStatusUpdate moduleInstallStatusUpdate);
}
