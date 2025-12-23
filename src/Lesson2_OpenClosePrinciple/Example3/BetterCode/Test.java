package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(new PDFGenerator().generateReport());
        System.out.println(new XMLReportGenerator().generateReport());
    }
}