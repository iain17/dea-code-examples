package oose.dea.solid;

/**
 * @author mdkr
 * @version Copyright (c) 2014 HAN University, All rights reserved.
 */
public class TabloidReportPrinter extends ReportPrinter {

    private final IDataAccess reportDataAcccess = new ReportDataAccess();
    private final ReportFormatter reportFormatter = new TabloidReportFormatter();


    public void print() {
        reportDataAcccess.getReportData();
        reportFormatter.formatReport();
        System.out.println("Printing report to matrix printer");
    }

}
