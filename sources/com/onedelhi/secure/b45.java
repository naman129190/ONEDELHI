package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class b45 extends p35 implements g45 {
    public b45() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) u35.m29069a(parcel, ConnectionResult.CREATOR);
                m35 m35 = (m35) u35.m29069a(parcel, m35.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) u35.m29069a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) u35.m29069a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) u35.m29069a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                u35.m29070b(parcel);
                zab((w45) u35.m29069a(parcel, w45.CREATOR));
                break;
            case 9:
                n45 n45 = (n45) u35.m29069a(parcel, n45.CREATOR);
                break;
            default:
                return false;
        }
        u35.m29070b(parcel);
        parcel2.writeNoException();
        return true;
    }
}
