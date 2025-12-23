package Lesson2_OpenClosePrinciple.Example3.ProblematicCode;

public class ReportGenerator
{
    public String generateReport(String reportType)
    {
        if(reportType.equals("PDF"))
            return "Generating PDF report...!";
        else if(reportType.equals("Word"))
            return "Generating word report...!";
        else
            return "Report type does not support..!";
    }
}