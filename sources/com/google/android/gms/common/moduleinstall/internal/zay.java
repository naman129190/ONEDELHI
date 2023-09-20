package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.i55;
import com.onedelhi.secure.w94;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zay extends GoogleApi implements ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey zac;
    private static final Api.AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zac = clientKey;
        zaq zaq = new zaq();
        zad = zaq;
        zae = new Api("ModuleInstall.API", zaq, clientKey);
    }

    public zay(Activity activity) {
        super(activity, zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public zay(Context context) {
        super(context, zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final ApiFeatureRequest zad(boolean z, OptionalModuleApi... optionalModuleApiArr) {
        Preconditions.checkNotNull(optionalModuleApiArr, "Requested APIs must not be null.");
        Preconditions.checkArgument(r0 > 0, "Please provide at least one OptionalModuleApi.");
        for (OptionalModuleApi checkNotNull : optionalModuleApiArr) {
            Preconditions.checkNotNull(checkNotNull, "Requested API must not be null.");
        }
        return ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArr), z);
    }

    public final w94<ModuleAvailabilityResponse> areModulesAvailable(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return ha4.m16572g(new ModuleAvailabilityResponse(true, 0));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(i55.f13491a);
        builder.setMethodKey(27301);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zap(this, zad2));
        return doRead(builder.build());
    }

    public final w94<Void> deferredInstall(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return ha4.m16572g(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(i55.f13491a);
        builder.setMethodKey(27302);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zan(this, zad2));
        return doRead(builder.build());
    }

    public final w94<ModuleInstallIntentResponse> getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest zad2 = zad(true, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return ha4.m16572g(new ModuleInstallIntentResponse((PendingIntent) null));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(i55.f13491a);
        builder.setMethodKey(27307);
        builder.run(new zam(this, zad2));
        return doRead(builder.build());
    }

    public final w94<ModuleInstallResponse> installModules(ModuleInstallRequest moduleInstallRequest) {
        Class<InstallStatusListener> cls = InstallStatusListener.class;
        ApiFeatureRequest fromModuleInstallRequest = ApiFeatureRequest.fromModuleInstallRequest(moduleInstallRequest);
        InstallStatusListener listener = moduleInstallRequest.getListener();
        Executor listenerExecutor = moduleInstallRequest.getListenerExecutor();
        boolean zaa = moduleInstallRequest.zaa();
        if (fromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return ha4.m16572g(new ModuleInstallResponse(0));
        }
        if (listener == null) {
            TaskApiCall.Builder builder = TaskApiCall.builder();
            builder.setFeatures(i55.f13491a);
            builder.setAutoResolveMissingFeatures(zaa);
            builder.setMethodKey(27304);
            builder.run(new zao(this, fromModuleInstallRequest));
            return doRead(builder.build());
        }
        Preconditions.checkNotNull(listener);
        String simpleName = cls.getSimpleName();
        ListenerHolder registerListener = listenerExecutor == null ? registerListener(listener, simpleName) : ListenerHolders.createListenerHolder(listener, listenerExecutor, simpleName);
        zaab zaab = new zaab(registerListener);
        AtomicReference atomicReference = new AtomicReference();
        zai zai = new zai(this, atomicReference, listener, fromModuleInstallRequest, zaab);
        zaj zaj = new zaj(this, zaab);
        RegistrationMethods.Builder builder2 = RegistrationMethods.builder();
        builder2.withHolder(registerListener);
        builder2.setFeatures(i55.f13491a);
        builder2.setAutoResolveMissingFeatures(zaa);
        builder2.register(zai);
        builder2.unregister(zaj);
        builder2.setMethodKey(27305);
        return doRegisterEventListener(builder2.build()).mo17591w(new zak(atomicReference));
    }

    public final w94<Void> releaseModules(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return ha4.m16572g(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(i55.f13491a);
        builder.setMethodKey(27303);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zal(this, zad2));
        return doRead(builder.build());
    }

    public final w94<Boolean> unregisterListener(InstallStatusListener installStatusListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(installStatusListener, InstallStatusListener.class.getSimpleName()), 27306);
    }
}
