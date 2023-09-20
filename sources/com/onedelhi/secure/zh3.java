package com.onedelhi.secure;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class zh3<T> {
    private final String zza;
    private Object zzb;

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.zh3$a */
    public static class C4095a extends Exception {
        @KeepForSdk
        public C4095a(@mr2 String str) {
            super(str);
        }

        @KeepForSdk
        public C4095a(@mr2 String str, @mr2 Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    public zh3(@mr2 String str) {
        this.zza = str;
    }

    @mr2
    @KeepForSdk
    public abstract T getRemoteCreator(@mr2 IBinder iBinder);

    @mr2
    @KeepForSdk
    public final T getRemoteCreatorInstance(@mr2 Context context) throws C4095a {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C4095a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C4095a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C4095a("Could not access creator.", e3);
                }
            } else {
                throw new C4095a("Could not get remote context.");
            }
        }
        return this.zzb;
    }
}
