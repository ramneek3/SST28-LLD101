package com.example.tickets;

import java.util.ArrayList;
import java.util.List;


public class IncidentTicket {

    private String id;
    private String reporterEmail;
    private String title;

    private String description;
    private String priority;       
    private List<String> tags;    
    private String assigneeEmail;
    private boolean customerVisible;
    private Integer slaMinutes;    
    private String source;         

    public IncidentTicket() {
        this.tags = new ArrayList<>();
    }

    public IncidentTicket(String id, String reporterEmail, String title) {
        this();
        this.id = id;
        this.reporterEmail = reporterEmail;
        this.title = title;
    }

    public IncidentTicket(String id, String reporterEmail, String title, String priority) {
        this(id, reporterEmail, title);
        this.priority = priority;
    }

   
    public String getId() { return id; }
    public String getReporterEmail() { return reporterEmail; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getPriority() { return priority; }
    public List<String> getTags() { return tags; } 
    public String getAssigneeEmail() { return assigneeEmail; }
    public boolean isCustomerVisible() { return customerVisible; }
    public Integer getSlaMinutes() { return slaMinutes; }
    public String getSource() { return source; }

    
    public void setId(String id) { this.id = id; }
    public void setReporterEmail(String reporterEmail) { this.reporterEmail = reporterEmail; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setTags(List<String> tags) { this.tags = tags; } 
    public void setAssigneeEmail(String assigneeEmail) { this.assigneeEmail = assigneeEmail; }
    public void setCustomerVisible(boolean customerVisible) { this.customerVisible = customerVisible; }
    public void setSlaMinutes(Integer slaMinutes) { this.slaMinutes = slaMinutes; }
    public void setSource(String source) { this.source = source; }

    @Override
    public String toString() {
        return "IncidentTicket{" +
                "id='" + id + '\'' +
                ", reporterEmail='" + reporterEmail + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", tags=" + tags +
                ", assigneeEmail='" + assigneeEmail + '\'' +
                ", customerVisible=" + customerVisible +
                ", slaMinutes=" + slaMinutes +
                ", source='" + source + '\'' +
                '}';
    }
}