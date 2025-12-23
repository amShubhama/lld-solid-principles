package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class WordReportGenerator implements ReportGenerator
{
    @Override
    public String generateReport()
    {
        return "Generating Word reporting..!";
    }
}