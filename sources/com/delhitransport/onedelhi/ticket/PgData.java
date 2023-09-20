package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PgData {
    @nu3("body")
    @qy0
    private Body body;
    @nu3("checksum")
    @qy0
    private String checksum;
    @nu3("encoded_payload")
    @qy0
    private String encoded_payload;
    @nu3("endpoint")
    @qy0
    private String endpoint;
    @nu3("head")
    @qy0
    private Head head;

    public static class Body {
        @nu3("deepLinkInfo")
        @qy0
        private final DeepLinkInfo deepLinkInfo;
        @nu3("resultInfo")
        @qy0
        private final ResultInfo resultInfo;
        @nu3("riskContent")
        @qy0
        private final RiskContent riskContent;

        public static class DeepLinkInfo {
            @nu3("cashierRequestId")
            @qy0
            private final String cashierRequestId;
            @nu3("deepLink")
            @qy0
            private final String deepLink;
            @nu3("orderId")
            @qy0
            private final String orderId;
            @nu3("transId")
            @qy0
            private final String transId;

            public DeepLinkInfo(String str, String str2, String str3, String str4) {
                this.deepLink = str;
                this.orderId = str2;
                this.cashierRequestId = str3;
                this.transId = str4;
            }

            public String getCashierRequestId() {
                return this.cashierRequestId;
            }

            public String getDeepLink() {
                return this.deepLink;
            }

            public String getOrderId() {
                return this.orderId;
            }

            public String getTransId() {
                return this.transId;
            }
        }

        public static class ResultInfo {
            @nu3("resultCode")
            @qy0
            private final String resultCode;
            @nu3("resultMsg")
            @qy0
            private final String resultMsg;
            @nu3("resultStatus")
            @qy0
            private final String resultStatus;
            @nu3("retry")
            @qy0
            private Boolean retry;

            public ResultInfo(String str, String str2, String str3) {
                this.resultStatus = str;
                this.resultCode = str2;
                this.resultMsg = str3;
            }

            public ResultInfo(String str, String str2, String str3, Boolean bool) {
                this.resultStatus = str;
                this.resultCode = str2;
                this.resultMsg = str3;
                this.retry = bool;
            }

            public String getResultCode() {
                return this.resultCode;
            }

            public String getResultMsg() {
                return this.resultMsg;
            }

            public String getResultStatus() {
                return this.resultStatus;
            }

            public Boolean getRetry() {
                return this.retry;
            }
        }

        public static class RiskContent {
            @nu3("eventLinkId")
            @qy0
            private final String eventLinkId;

            public RiskContent(String str) {
                this.eventLinkId = str;
            }

            public String getEventLinkId() {
                return this.eventLinkId;
            }
        }

        public Body(ResultInfo resultInfo2, DeepLinkInfo deepLinkInfo2, RiskContent riskContent2) {
            this.resultInfo = resultInfo2;
            this.deepLinkInfo = deepLinkInfo2;
            this.riskContent = riskContent2;
        }

        public DeepLinkInfo getDeepLinkInfo() {
            return this.deepLinkInfo;
        }

        public ResultInfo getResultInfo() {
            return this.resultInfo;
        }

        public RiskContent getRiskContent() {
            return this.riskContent;
        }
    }

    public static class Head {
        @nu3("responseTimestamp")
        @qy0
        private final String responseTimestamp;
        @nu3("version")
        @qy0
        private final String version;

        public Head(String str, String str2) {
            this.responseTimestamp = str;
            this.version = str2;
        }

        public String getResponseTimestamp() {
            return this.responseTimestamp;
        }

        public String getVersion() {
            return this.version;
        }
    }

    public PgData(Head head2, Body body2) {
        this.head = head2;
        this.body = body2;
    }

    public PgData(String str, String str2, String str3) {
        this.encoded_payload = str;
        this.checksum = str2;
        this.endpoint = str3;
    }

    public Body getBody() {
        return this.body;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public String getEncodedPayload() {
        return this.encoded_payload;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public Head getHead() {
        return this.head;
    }
}
