package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.models.auth.CreateResponse;
import com.delhitransport.onedelhi.models.auth.VerifyRequest;
import com.delhitransport.onedelhi.models.auth.VerifyResponse;
import com.delhitransport.onedelhi.networking.C1338d;
import com.onedelhi.secure.au4;

public class AuthenticationViewModel extends au4 {
    private final C1338d authenticationRepository = C1338d.m8535b();

    public LiveData<CreateResponse> create(long j) {
        return this.authenticationRepository.mo8644a(j);
    }

    public LiveData<VerifyResponse> verify(long j, VerifyRequest verifyRequest) {
        return this.authenticationRepository.mo8645c(j, verifyRequest);
    }
}
