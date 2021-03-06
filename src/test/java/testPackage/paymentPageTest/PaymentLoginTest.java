package testPackage.paymentPageTest;

import com.customize.reporter.WebReporter;

import basicTool.config.ConfigUtil;
import page.pc.NavigationPage;
import page.pc.payment.PaymentBalancePage;
import page.pc.payment.PaymentLoginPage;
import testCases.AbstractTestCases;

public class PaymentLoginTest extends AbstractTestCases {
    // @Test(testName = "", description = "在线充值IOS扫描二维码登录")
    public void scanQrcodeLoginFromIOSTest() throws Exception {
        ConfigUtil.getConfigUtil().getTestConfig().setProperty("phonePlatform", "IOS");
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.loginPaymentPage("IOS");
        balancePage.logout();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    // @Test(testName = "", description = "在线充值Android扫描二维码登录")
    public void scanQrcodeLoginFromAndroidTest() throws Exception {
        ConfigUtil.getConfigUtil().getTestConfig().setProperty("phonePlatform", "ANDRIOD");
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.loginPaymentPage("ANDRIOD");
        balancePage.logout();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
