package sınav;

interface ReportGenerator {
    void generate();
}

class PDFReport implements ReportGenerator {
    public void generate() {
        System.out.println("PDF  report generated");
    }
}

class HTMLReport implements ReportGenerator {
    public void generate() {
        System.out.println("HTML report generated");
    }
}
