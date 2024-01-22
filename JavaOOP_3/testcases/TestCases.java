package JavaOOP_3.testcases;

import JavaOOP_3.common.BaseTest;
import JavaOOP_3.common.Constants;

public class TestCases extends BaseTest {

    public void login(){
        System.out.println("Vào trang URL: https://cms.anhtester.com/login");
        System.out.println("Nhập Email = admin@example.com");
        System.out.println("Nhập Password = 123456");
        System.out.println("Nhấn Login");
        System.out.println("Kiểm tra trang CMS");
    }
    public void testLogin(){
        createDriver();
        login();
        closeDriver();
    }
    public void testAddCategory(){
        createDriver("Edge");
        login();
        System.out.println("Vào Product/Category");
        System.out.println("Nhập Add new Category");
        System.out.println("Nhập đầy đủ thông tin");
        System.out.println("Nhấn Save");
        System.out.println("Kiểm tra Category vừa được thêm");
        closeDriver("Edge");
    }

    public static void main(String[] args) {
        Constants.setBrowser("Chrome");
        Constants.setReport(true);
        Constants.setHeadless(true);

        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("=========================");
        testCases.testAddCategory();

    }
}
