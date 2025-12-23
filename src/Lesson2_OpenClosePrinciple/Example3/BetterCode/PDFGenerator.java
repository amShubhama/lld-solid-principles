package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class PDFGenerator implements ReportGenerator
{
    @Override
    public String generateReport()
    {
        return "Generating PDF report..!";
    }
}