package com.phonepe.intent.sdk.api;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.z25;
import java.util.HashMap;
import java.util.Map;

public class AvailabilityCheckRequest extends z25 {
    public String chmha;

    /* renamed from: jmjou  reason: collision with root package name */
    public String f38910jmjou;
    public Map<String, String> rmqfk = new HashMap();

    public static class AvailabilityCheckRequestBuilder {
        public String cqqlq;
        public String irjuc;

        public AvailabilityCheckRequest build() {
            if (l05.m55207k(this.cqqlq)) {
                throw new InvalidMandatoryRequestParamException("checksum");
            } else if (!l05.m55207k(this.irjuc)) {
                AvailabilityCheckRequest availabilityCheckRequest = new AvailabilityCheckRequest();
                availabilityCheckRequest.chmha = this.cqqlq;
                availabilityCheckRequest.f38910jmjou = this.irjuc;
                return availabilityCheckRequest;
            } else {
                throw new InvalidMandatoryRequestParamException(C4311b.C4317f.C4318a.f25149a);
            }
        }

        public AvailabilityCheckRequestBuilder setChecksum(@mr2 String str) {
            this.cqqlq = str;
            return this;
        }

        public AvailabilityCheckRequestBuilder setData(@mr2 String str) {
            this.irjuc = str;
            return this;
        }
    }

    public String getChecksum() {
        return this.chmha;
    }

    public String getData() {
        return this.f38910jmjou;
    }

    public Map<String, String> getHeaderMap() {
        this.rmqfk.put("X-VERIFY", this.chmha);
        return this.rmqfk;
    }
}
