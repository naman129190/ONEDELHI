package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.w94;

public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @mr2
    w94<ModuleAvailabilityResponse> areModulesAvailable(@mr2 OptionalModuleApi... optionalModuleApiArr);

    @mr2
    w94<Void> deferredInstall(@mr2 OptionalModuleApi... optionalModuleApiArr);

    @mr2
    w94<ModuleInstallIntentResponse> getInstallModulesIntent(@mr2 OptionalModuleApi... optionalModuleApiArr);

    @mr2
    w94<ModuleInstallResponse> installModules(@mr2 ModuleInstallRequest moduleInstallRequest);

    @mr2
    w94<Void> releaseModules(@mr2 OptionalModuleApi... optionalModuleApiArr);

    @mr2
    w94<Boolean> unregisterListener(@mr2 InstallStatusListener installStatusListener);
}
