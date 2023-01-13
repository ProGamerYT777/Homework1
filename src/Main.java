import repository.DepartmentData;
import repository.EmployeeData;
import service.UiService;
import service.impl.UiServiceImpl;

public class Main {
    public static void main(String[] args) {
        DepartmentData.getInstance();
        EmployeeData.getInstance();
        UiService uiService = new UiServiceImpl();
        uiService.getStartAppPage();
    }
}