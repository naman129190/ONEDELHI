package com.delhitransport.onedelhi.models.faq;

public class FAQs {
    public String description;
    public String title;

    public FAQs() {
    }

    public FAQs(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "FAQs{, title='" + this.title + '\'' + ", description='" + this.description + '\'' + '}';
    }
}
