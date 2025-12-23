package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class XMLReportGenerator implements ReportGenerator
{
    @Override
    public String generateReport()
    {
        return "Generating XML report..!";
    }
}
