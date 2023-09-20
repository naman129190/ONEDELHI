package com.delhitransport.onedelhi.models.freshdesk;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class FreshDeskTicketResponse implements Serializable {
    @nu3("attachments")
    @qy0
    public ArrayList<?> attachments;
    @nu3("cc_emails")
    @qy0
    public ArrayList<String> cc_emails;
    @nu3("created_at")
    @qy0
    public String created_at;
    @nu3("description")
    @qy0
    public String description;
    @nu3("description_text")
    @qy0
    public String description_text;
    @nu3("due_by")
    @qy0
    public String due_by;
    @nu3("email_config_id")
    @qy0
    public Long email_config_id;
    @nu3("fr_due_by")
    @qy0
    public String fr_due_by;
    @nu3("fr_escalated")
    @qy0
    public Boolean fr_escalated;
    @nu3("fwd_emails")
    @qy0
    public ArrayList<String> fwd_emails;
    @nu3("group_id")
    @qy0
    public Long group_id;
    @nu3("id")
    @qy0

    /* renamed from: id */
    public Long f7047id;
    @nu3("is_escalated")
    @qy0
    public Boolean is_escalated;
    @nu3("priority")
    @qy0
    public Integer priority;
    @nu3("product_id")
    @qy0
    public String product_id;
    @nu3("reply_cc_emails")
    @qy0
    public ArrayList<String> reply_cc_emails;
    @nu3("requester_id")
    @qy0
    public Long requester_id;
    @nu3("responder_id")
    @qy0
    public Long responder_id;
    @nu3("source")
    @qy0
    public Integer source;
    @nu3("spam")
    @qy0
    public Boolean spam;
    @nu3("status")
    @qy0
    public Integer status;
    @nu3("subject")
    @qy0
    public String subject;
    @nu3("tags")
    @qy0
    public ArrayList<String> tags;
    @nu3("to_emails")
    @qy0
    public String to_emails;
    @nu3("type")
    @qy0
    public String type;
    @nu3("updated_at")
    @qy0
    public String updated_at;
    @nu3("urgent")
    @qy0
    public Boolean urgent;

    public ArrayList<?> getAttachments() {
        return this.attachments;
    }

    public ArrayList<String> getCc_emails() {
        return this.cc_emails;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescription_text() {
        return this.description_text;
    }

    public String getDue_by() {
        return this.due_by;
    }

    public Long getEmail_config_id() {
        return this.email_config_id;
    }

    public String getFr_due_by() {
        return this.fr_due_by;
    }

    public ArrayList<String> getFwd_emails() {
        return this.fwd_emails;
    }

    public Long getGroup_id() {
        return this.group_id;
    }

    public Long getId() {
        return this.f7047id;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getProduct_id() {
        return this.product_id;
    }

    public ArrayList<String> getReply_cc_emails() {
        return this.reply_cc_emails;
    }

    public Long getRequester_id() {
        return this.requester_id;
    }

    public Long getResponder_id() {
        return this.responder_id;
    }

    public Integer getSource() {
        return this.source;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getSubject() {
        return this.subject;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String getTo_emails() {
        return this.to_emails;
    }

    public String getType() {
        return this.type;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public Boolean isFr_escalated() {
        return this.fr_escalated;
    }

    public Boolean isIs_escalated() {
        return this.is_escalated;
    }

    public Boolean isSpam() {
        return this.spam;
    }

    public Boolean isUrgent() {
        return this.urgent;
    }

    public void setTags(ArrayList<String> arrayList) {
        this.tags = arrayList;
    }

    public String toString() {
        return "FreshDeskTicketResponse{cc_emails=" + this.cc_emails + ", fwd_emails=" + this.fwd_emails + ", reply_cc_emails=" + this.reply_cc_emails + ", email_config_id=" + this.email_config_id + ", group_id=" + this.group_id + ", priority=" + this.priority + ", requester_id=" + this.requester_id + ", responder_id=" + this.responder_id + ", source=" + this.source + ", status=" + this.status + ", subject='" + this.subject + '\'' + ", id=" + this.f7047id + ", type='" + this.type + '\'' + ", to_emails='" + this.to_emails + '\'' + ", product_id='" + this.product_id + '\'' + ", fr_escalated=" + this.fr_escalated + ", spam=" + this.spam + ", urgent=" + this.urgent + ", is_escalated=" + this.is_escalated + ", created_at='" + this.created_at + '\'' + ", updated_at='" + this.updated_at + '\'' + ", due_by='" + this.due_by + '\'' + ", fr_due_by='" + this.fr_due_by + '\'' + ", description_text='" + this.description_text + '\'' + ", description='" + this.description + '\'' + '}';
    }
}
