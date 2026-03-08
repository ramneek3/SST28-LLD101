package com.example.reports;

public class ReportProxy implements Report {

    private final String reportId;
    private final String title;
    private final String classification;

    private final AccessControl accessControl = new AccessControl();

    private RealReport realReport; // cached real object

    public ReportProxy(String reportId, String title, String classification) {
        this.reportId = reportId;
        this.title = title;
        this.classification = classification;
    }

    @Override
    public void display(User user) {

        // 1️⃣ Access control
        if (!accessControl.canAccess(user, classification)) {
            System.out.println("ACCESS DENIED -> user=" + user.getName()
                    + " report=" + reportId
                    + " classification=" + classification);
            return;
        }

        // 2️⃣ Lazy loading
        if (realReport == null) {
            realReport = new RealReport(reportId, title, classification);
        }

        // 3️⃣ Reuse cached real report
        realReport.display(user);
    }
}