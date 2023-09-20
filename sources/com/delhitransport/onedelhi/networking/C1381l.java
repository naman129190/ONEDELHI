package com.delhitransport.onedelhi.networking;

import com.delhitransport.onedelhi.models.payment.CustomPaymentItem;
import com.delhitransport.onedelhi.pass.AllPasses;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.delhitransport.onedelhi.pass.LastPass;
import com.delhitransport.onedelhi.pass.LastPassRequest;
import com.delhitransport.onedelhi.pass.Pass;
import com.delhitransport.onedelhi.pass.PassRequest;
import com.delhitransport.onedelhi.pass.PassTxnToken;
import com.delhitransport.onedelhi.pass.PassTxnTokenRequest;
import com.delhitransport.onedelhi.pass.ValidatePass;
import com.delhitransport.onedelhi.pass.ValidatePassRequest;
import com.delhitransport.onedelhi.ticket.AllTickets;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.FareDiscoveryRequest;
import com.delhitransport.onedelhi.ticket.FareOptions;
import com.delhitransport.onedelhi.ticket.FareOptionsRequest;
import com.delhitransport.onedelhi.ticket.InitUser;
import com.delhitransport.onedelhi.ticket.InitUserRequest;
import com.delhitransport.onedelhi.ticket.Issue;
import com.delhitransport.onedelhi.ticket.IssueRequest;
import com.delhitransport.onedelhi.ticket.LastTicket;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.delhitransport.onedelhi.ticket.TxnToken;
import com.delhitransport.onedelhi.ticket.TxnTokenRequest;
import com.delhitransport.onedelhi.ticket.Validate;
import com.delhitransport.onedelhi.ticket.ValidateRequest;
import com.onedelhi.secure.C6595qs;
import com.onedelhi.secure.C7181ws;
import com.onedelhi.secure.el3;
import com.onedelhi.secure.lm2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.tc4;
import org.json.JSONObject;

/* renamed from: com.delhitransport.onedelhi.networking.l */
public class C1381l {

    /* renamed from: a */
    public static C1381l f7167a;

    /* renamed from: a */
    public final tc4 f7168a = ((tc4) ApiClient.m8531l(tc4.class));

    /* renamed from: com.delhitransport.onedelhi.networking.l$a */
    public class C1382a implements C7181ws<Pass> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7170a;

        public C1382a(lm2 lm2) {
            this.f7170a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<Pass> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-137983426664263L);
            s41.m27245c(a, pj0.m61166a(-138133750519623L) + th.toString());
            this.f7170a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<Pass> qsVar, @mr2 el3<Pass> el3) {
            if (el3.mo35472g()) {
                this.f7170a.mo4933q(el3.mo35468a());
            } else if (el3.mo35469b() >= 500 || el3.mo35469b() < 400) {
                this.f7170a.mo4933q(null);
            } else {
                try {
                    new JSONObject(el3.mo35470e().string());
                    Pass pass = new Pass();
                    pass.setIs_valid_bus(Boolean.FALSE);
                    this.f7170a.mo4933q(pass);
                } catch (Exception e) {
                    this.f7170a.mo4933q(null);
                    System.out.println(e.toString());
                    s41.m27244b(e, pj0.m61166a(-137772973266759L) + el3.toString());
                }
                String a = pj0.m61166a(-137803038037831L);
                s41.m27245c(a, pj0.m61166a(-137953361893191L) + el3.toString());
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$b */
    public class C1383b implements C7181ws<ValidatePass> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7172a;

        public C1383b(lm2 lm2) {
            this.f7172a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<ValidatePass> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-138322729080647L);
            s41.m27245c(a, pj0.m61166a(-138473052936007L) + th.toString());
            this.f7172a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<ValidatePass> qsVar, @mr2 el3<ValidatePass> el3) {
            ValidatePass validatePass;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7172a;
                validatePass = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-138172405225287L);
                s41.m27245c(a, pj0.m61166a(-138292664309575L) + el3.toString());
                lm2 = this.f7172a;
                validatePass = null;
            }
            lm2.mo4933q(validatePass);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$c */
    public class C1384c implements C7181ws<PassTxnToken> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7174a;

        public C1384c(lm2 lm2) {
            this.f7174a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<PassTxnToken> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-138700686202695L);
            s41.m27245c(a, pj0.m61166a(-138859599992647L) + th.toString());
            this.f7174a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<PassTxnToken> qsVar, @mr2 el3<PassTxnToken> el3) {
            PassTxnToken passTxnToken;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7174a;
                passTxnToken = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-138511707641671L);
                s41.m27245c(a, pj0.m61166a(-138670621431623L) + el3.toString());
                lm2 = this.f7174a;
                passTxnToken = null;
            }
            lm2.mo4933q(passTxnToken);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$d */
    public class C1385d implements C7181ws<DailyPass> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7176a;

        public C1385d(lm2 lm2) {
            this.f7176a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<DailyPass> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-139065758422855L);
            s41.m27245c(a, pj0.m61166a(-139203197376327L) + th.toString());
            this.f7176a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<DailyPass> qsVar, @mr2 el3<DailyPass> el3) {
            DailyPass dailyPass;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7176a;
                dailyPass = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-138898254698311L);
                s41.m27245c(a, pj0.m61166a(-139035693651783L) + el3.toString());
                lm2 = this.f7176a;
                dailyPass = null;
            }
            lm2.mo4933q(dailyPass);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$e */
    public class C1386e implements C7181ws<AllPasses> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7178a;

        public C1386e(lm2 lm2) {
            this.f7178a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<AllPasses> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-139362111166279L);
            s41.m27245c(a, pj0.m61166a(-139452305479495L) + th.toString());
            this.f7178a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<AllPasses> qsVar, @mr2 el3<AllPasses> el3) {
            AllPasses allPasses;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7178a;
                allPasses = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-139241852081991L);
                s41.m27245c(a, pj0.m61166a(-139332046395207L) + el3.toString());
                lm2 = this.f7178a;
                allPasses = null;
            }
            lm2.mo4933q(allPasses);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$f */
    public class C1387f implements C7181ws<LastPass> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7180a;

        public C1387f(lm2 lm2) {
            this.f7180a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<LastPass> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-139619809204039L);
            s41.m27245c(a, pj0.m61166a(-139718593451847L) + th.toString());
            this.f7180a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<LastPass> qsVar, @mr2 el3<LastPass> el3) {
            LastPass lastPass;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7180a;
                lastPass = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-139490960185159L);
                s41.m27245c(a, pj0.m61166a(-139589744432967L) + el3.toString());
                lm2 = this.f7180a;
                lastPass = null;
            }
            lm2.mo4933q(lastPass);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$g */
    public class C1388g implements C7181ws<CustomPaymentItem> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7182a;

        public C1388g(lm2 lm2) {
            this.f7182a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<CustomPaymentItem> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-140023536129863L);
            s41.m27245c(a, pj0.m61166a(-140143795214151L) + th.toString());
            this.f7182a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<CustomPaymentItem> qsVar, @mr2 el3<CustomPaymentItem> el3) {
            if (el3.mo35472g()) {
                this.f7182a.mo4933q(el3.mo35468a());
            } else if (el3.mo35469b() < 500 && el3.mo35469b() >= 400) {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    CustomPaymentItem customPaymentItem = new CustomPaymentItem();
                    customPaymentItem.setMessage(jSONObject.getString(pj0.m61166a(-139757248157511L)));
                    customPaymentItem.setDescription(jSONObject.getString(pj0.m61166a(-139791607895879L)));
                    this.f7182a.mo4933q(customPaymentItem);
                } catch (Exception e) {
                    s41.m27244b(e, pj0.m61166a(-139843147503431L) + el3.toString());
                    this.f7182a.mo4933q(null);
                }
                String a = pj0.m61166a(-139873212274503L);
                s41.m27245c(a, pj0.m61166a(-139993471358791L) + el3.toString());
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$h */
    public class C1389h implements C7181ws<Validate> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7184a;

        public C1389h(lm2 lm2) {
            this.f7184a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<Validate> qsVar, @mr2 Throwable th) {
            System.out.println(th.getMessage());
            this.f7184a.mo4933q(null);
            String a = pj0.m61166a(-137652714182471L);
            s41.m27245c(a, pj0.m61166a(-137734318561095L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<Validate> qsVar, @mr2 el3<Validate> el3) {
            String str;
            long j;
            StringBuilder sb;
            if (el3.mo35472g()) {
                this.f7184a.mo4933q(el3.mo35468a());
                return;
            }
            if (el3.mo35469b() >= 500 || el3.mo35469b() < 400) {
                this.f7184a.mo4933q(null);
                str = pj0.m61166a(-137515275228999L);
                sb = new StringBuilder();
                j = -137614059476807L;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(el3.mo35470e().string());
                    Validate validate = new Validate();
                    validate.setMessage(jSONObject.getString(pj0.m61166a(-137154497976135L)));
                    validate.setDescription(jSONObject.getString(pj0.m61166a(-137188857714503L)));
                    this.f7184a.mo4933q(validate);
                } catch (Exception e) {
                    String a = pj0.m61166a(-137240397322055L);
                    s41.m27245c(a, pj0.m61166a(-137339181569863L) + e.toString());
                    this.f7184a.mo4933q(null);
                }
                str = pj0.m61166a(-137377836275527L);
                sb = new StringBuilder();
                j = -137476620523335L;
            }
            sb.append(pj0.m61166a(j));
            sb.append(el3.toString());
            s41.m27245c(str, sb.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$i */
    public class C1390i implements C7181ws<TxnToken> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7186a;

        public C1390i(lm2 lm2) {
            this.f7186a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<TxnToken> qsVar, @mr2 Throwable th) {
            System.out.println(th.getMessage());
            this.f7186a.mo4933q(null);
            String a = pj0.m61166a(-140332773775175L);
            s41.m27245c(a, pj0.m61166a(-140453032859463L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<TxnToken> qsVar, @mr2 el3<TxnToken> el3) {
            if (el3.mo35472g()) {
                this.f7186a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7186a.mo4933q(null);
            String a = pj0.m61166a(-140182449919815L);
            s41.m27245c(a, pj0.m61166a(-140302709004103L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$j */
    public class C1391j implements C7181ws<FareOptions> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7188a;

        public C1391j(lm2 lm2) {
            this.f7188a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<FareOptions> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-140629126518599L);
            s41.m27245c(a, pj0.m61166a(-140736500700999L) + th.toString());
            this.f7188a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<FareOptions> qsVar, @mr2 el3<FareOptions> el3) {
            if (el3.mo35472g()) {
                this.f7188a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7188a.mo4933q(null);
            String a = pj0.m61166a(-140491687565127L);
            s41.m27245c(a, pj0.m61166a(-140599061747527L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$k */
    public class C1392k implements C7181ws<FareDiscovery> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7190a;

        public C1392k(lm2 lm2) {
            this.f7190a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<FareDiscovery> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-140908299392839L);
            s41.m27245c(a, pj0.m61166a(-141011378607943L) + th.toString());
            this.f7190a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<FareDiscovery> qsVar, @mr2 el3<FareDiscovery> el3) {
            FareDiscovery fareDiscovery;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7190a;
                fareDiscovery = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-140775155406663L);
                s41.m27245c(a, pj0.m61166a(-140878234621767L) + el3.toString());
                lm2 = this.f7190a;
                fareDiscovery = null;
            }
            lm2.mo4933q(fareDiscovery);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$l */
    public class C1393l implements C7181ws<Ticket> {

        /* renamed from: a */
        public final /* synthetic */ TicketRequest f7192a;

        /* renamed from: a */
        public final /* synthetic */ lm2 f7193a;

        /* renamed from: a */
        public final /* synthetic */ String[] f7194a;

        public C1393l(lm2 lm2, String[] strArr, TicketRequest ticketRequest) {
            this.f7193a = lm2;
            this.f7194a = strArr;
            this.f7192a = ticketRequest;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<Ticket> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-141969156314951L);
            s41.m27245c(a, pj0.m61166a(-142067940562759L) + th.toString());
            this.f7193a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<Ticket> qsVar, @mr2 el3<Ticket> el3) {
            lm2 lm2;
            Ticket ticket;
            if (el3.mo35472g()) {
                lm2 = this.f7193a;
                ticket = el3.mo35468a();
            } else {
                try {
                    if (el3.mo35469b() == 400) {
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = this.f7194a;
                        sb.append(strArr[0]);
                        sb.append(String.format(pj0.m61166a(-141050033313607L), new Object[]{el3.mo35470e()}));
                        strArr[0] = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr2 = this.f7194a;
                        sb2.append(strArr2[0]);
                        sb2.append(String.format(pj0.m61166a(-141187472267079L), new Object[]{this.f7192a.getBooking_id(), this.f7192a.toString(), el3.toString()}));
                        strArr2[0] = sb2.toString();
                    }
                    String a = pj0.m61166a(-141449465272135L);
                    s41.m27245c(a, pj0.m61166a(-141548249519943L) + el3.toString());
                } catch (Exception unused) {
                    StringBuilder sb3 = new StringBuilder();
                    String[] strArr3 = this.f7194a;
                    sb3.append(strArr3[0]);
                    sb3.append(String.format(pj0.m61166a(-141578314291015L), new Object[]{this.f7192a.getBooking_id(), this.f7192a.toString(), el3.toString()}));
                    strArr3[0] = sb3.toString();
                }
                String a2 = pj0.m61166a(-141840307296071L);
                s41.m27245c(a2, pj0.m61166a(-141939091543879L) + this.f7194a[0]);
                lm2 = this.f7193a;
                ticket = null;
            }
            lm2.mo4933q(ticket);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$m */
    public class C1394m implements C7181ws<InitUser> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7196a;

        public C1394m(lm2 lm2) {
            this.f7196a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<InitUser> qsVar, @mr2 Throwable th) {
            this.f7196a.mo4933q(null);
            String a = pj0.m61166a(-142222559385415L);
            s41.m27245c(a, pj0.m61166a(-142347113436999L) + th.toString());
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<InitUser> qsVar, @mr2 el3<InitUser> el3) {
            if (el3.mo35472g()) {
                this.f7196a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7196a.mo4933q(null);
            String a = pj0.m61166a(-142106595268423L);
            s41.m27245c(a, pj0.m61166a(-142192494614343L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$n */
    public class C1395n implements C7181ws<AllTickets> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7198a;

        public C1395n(lm2 lm2) {
            this.f7198a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<AllTickets> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-142523207096135L);
            s41.m27245c(a, pj0.m61166a(-142626286311239L) + th.toString());
            this.f7198a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<AllTickets> qsVar, @mr2 el3<AllTickets> el3) {
            AllTickets allTickets;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7198a;
                allTickets = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-142390063109959L);
                s41.m27245c(a, pj0.m61166a(-142493142325063L) + el3.toString());
                lm2 = this.f7198a;
                allTickets = null;
            }
            lm2.mo4933q(allTickets);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$o */
    public class C1396o implements C7181ws<LastTicket> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7200a;

        public C1396o(lm2 lm2) {
            this.f7200a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<LastTicket> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-142802379970375L);
            s41.m27245c(a, pj0.m61166a(-142909754152775L) + th.toString());
            this.f7200a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<LastTicket> qsVar, @mr2 el3<LastTicket> el3) {
            if (el3.mo35472g()) {
                this.f7200a.mo4933q(el3.mo35468a());
                return;
            }
            this.f7200a.mo4933q(null);
            String a = pj0.m61166a(-142664941016903L);
            s41.m27245c(a, pj0.m61166a(-142772315199303L) + el3.toString());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.networking.l$p */
    public class C1397p implements C7181ws<Issue> {

        /* renamed from: a */
        public final /* synthetic */ lm2 f7202a;

        public C1397p(lm2 lm2) {
            this.f7202a = lm2;
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<Issue> qsVar, @mr2 Throwable th) {
            String a = pj0.m61166a(-143072962910023L);
            s41.m27245c(a, pj0.m61166a(-143167452190535L) + th.toString());
            this.f7202a.mo4933q(null);
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<Issue> qsVar, @mr2 el3<Issue> el3) {
            Issue issue;
            lm2 lm2;
            if (el3.mo35472g()) {
                lm2 = this.f7202a;
                issue = el3.mo35468a();
            } else {
                String a = pj0.m61166a(-142948408858439L);
                s41.m27245c(a, pj0.m61166a(-143042898138951L) + el3.toString());
                lm2 = this.f7202a;
                issue = null;
            }
            lm2.mo4933q(issue);
        }
    }

    /* renamed from: h */
    public static C1381l m8653h() {
        if (f7167a == null) {
            f7167a = new C1381l();
        }
        return f7167a;
    }

    /* renamed from: a */
    public lm2<Ticket> mo8686a(TicketRequest ticketRequest) {
        lm2<Ticket> lm2 = new lm2<>();
        this.f7168a.mo24847a(ticketRequest).mo14269jh(new C1393l(lm2, new String[]{pj0.m61166a(-143206106896199L)}, ticketRequest));
        return lm2;
    }

    /* renamed from: b */
    public lm2<DailyPass> mo8687b(PassRequest passRequest) {
        lm2<DailyPass> lm2 = new lm2<>();
        this.f7168a.mo24852f(passRequest).mo14269jh(new C1385d(lm2));
        return lm2;
    }

    /* renamed from: c */
    public lm2<FareDiscovery> mo8688c(FareDiscoveryRequest fareDiscoveryRequest) {
        lm2<FareDiscovery> lm2 = new lm2<>();
        this.f7168a.mo24854h(fareDiscoveryRequest).mo14269jh(new C1392k(lm2));
        return lm2;
    }

    /* renamed from: d */
    public lm2<Pass> mo8689d(String str, String str2) {
        lm2<Pass> lm2 = new lm2<>();
        this.f7168a.mo24849c(str, str2).mo14269jh(new C1382a(lm2));
        return lm2;
    }

    /* renamed from: e */
    public lm2<TxnToken> mo8690e(TxnTokenRequest txnTokenRequest) {
        lm2<TxnToken> lm2 = new lm2<>();
        this.f7168a.mo24850d(txnTokenRequest).mo14269jh(new C1390i(lm2));
        return lm2;
    }

    /* renamed from: f */
    public lm2<PassTxnToken> mo8691f(PassTxnTokenRequest passTxnTokenRequest) {
        lm2<PassTxnToken> lm2 = new lm2<>();
        this.f7168a.mo24856j(passTxnTokenRequest).mo14269jh(new C1384c(lm2));
        return lm2;
    }

    /* renamed from: g */
    public lm2<AllPasses> mo8692g(String str) {
        lm2<AllPasses> lm2 = new lm2<>();
        this.f7168a.mo24860n(str).mo14269jh(new C1386e(lm2));
        return lm2;
    }

    /* renamed from: i */
    public lm2<AllTickets> mo8693i(String str) {
        lm2<AllTickets> lm2 = new lm2<>();
        this.f7168a.mo24859m(str).mo14269jh(new C1395n(lm2));
        return lm2;
    }

    /* renamed from: j */
    public lm2<FareOptions> mo8694j(FareOptionsRequest fareOptionsRequest) {
        lm2<FareOptions> lm2 = new lm2<>();
        this.f7168a.mo24858l(fareOptionsRequest).mo14269jh(new C1391j(lm2));
        return lm2;
    }

    /* renamed from: k */
    public lm2<CustomPaymentItem> mo8695k(String str, String str2) {
        lm2<CustomPaymentItem> lm2 = new lm2<>();
        this.f7168a.mo24855i(str, str2).mo14269jh(new C1388g(lm2));
        return lm2;
    }

    /* renamed from: l */
    public lm2<InitUser> mo8696l(InitUserRequest initUserRequest) {
        lm2<InitUser> lm2 = new lm2<>();
        this.f7168a.mo24861o(initUserRequest).mo14269jh(new C1394m(lm2));
        return lm2;
    }

    /* renamed from: m */
    public lm2<Issue> mo8697m(IssueRequest issueRequest) {
        lm2<Issue> lm2 = new lm2<>();
        this.f7168a.mo24851e(issueRequest).mo14269jh(new C1397p(lm2));
        return lm2;
    }

    /* renamed from: n */
    public lm2<LastPass> mo8698n(LastPassRequest lastPassRequest) {
        lm2<LastPass> lm2 = new lm2<>();
        this.f7168a.mo24853g(lastPassRequest).mo14269jh(new C1387f(lm2));
        return lm2;
    }

    /* renamed from: o */
    public lm2<LastTicket> mo8699o(String str) {
        lm2<LastTicket> lm2 = new lm2<>();
        this.f7168a.mo24848b(str).mo14269jh(new C1396o(lm2));
        return lm2;
    }

    /* renamed from: p */
    public lm2<Validate> mo8700p(ValidateRequest validateRequest) {
        lm2<Validate> lm2 = new lm2<>();
        this.f7168a.mo24862p(validateRequest).mo14269jh(new C1389h(lm2));
        return lm2;
    }

    /* renamed from: q */
    public lm2<ValidatePass> mo8701q(ValidatePassRequest validatePassRequest) {
        lm2<ValidatePass> lm2 = new lm2<>();
        this.f7168a.mo24857k(validatePassRequest).mo14269jh(new C1383b(lm2));
        return lm2;
    }
}
