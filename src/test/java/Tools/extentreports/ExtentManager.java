package Tools.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports ();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter ( "./extent-reports/extent-report.html" );
        reporter.config ().setReportName ( "QA Bantotal Extent Report" );
        extentReports.attachReporter ( reporter );
        extentReports.setSystemInfo ( "App Name", "Bantotal" );
        extentReports.setSystemInfo ( "Author", "Nestor Flores" );
        return extentReports;
    }
}