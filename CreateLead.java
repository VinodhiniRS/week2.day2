package week2.day2.selenium.assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement userNameElement=driver.findElement(By.id("username"));
userNameElement.sendKeys("Demosalesmanager");
WebElement passwordElement=driver.findElement(By.id("password"));
passwordElement.sendKeys("crmsfa");
WebElement loginElement=driver.findElement(By.className("decorativeSubmit"));
loginElement.click();
WebElement crmsfaElement=driver.findElement(By.linkText("CRM/SFA"));
crmsfaElement.click();
WebElement leadsElement=driver.findElement(By.linkText("Leads"));
leadsElement.click();
WebElement createLeadElement=driver.findElement(By.linkText("Create Lead"));
createLeadElement.click();
WebElement companyElement=driver.findElement(By.id("createLeadForm_companyName"));
companyElement.sendKeys("Wipro Technologies");
WebElement firstNameElement=driver.findElement(By.id("createLeadForm_firstName"));
firstNameElement.sendKeys("Vinodhini");
WebElement lastNameElement=driver.findElement(By.id("createLeadForm_lastName"));
lastNameElement.sendKeys("Suriya Prakash");
WebElement firsttNameLocalElement=driver.findElement(By.id("createLeadForm_firstNameLocal"));
firsttNameLocalElement.sendKeys("RS");
WebElement departmentElement=driver.findElement(By.id("createLeadForm_departmentName"));
departmentElement.sendKeys("Computer Science");
WebElement descriptionElement=driver.findElement(By.id("createLeadForm_description"));
descriptionElement.sendKeys("Everything looks good");
WebElement emailAddressElement=driver.findElement(By.id("createLeadForm_primaryEmail"));
emailAddressElement.sendKeys("abctest@gmail.com");
WebElement stateElement=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select state=new Select(stateElement);
state.selectByVisibleText("New York");
WebElement clickLeadElement=driver.findElement(By.name("submitButton"));
clickLeadElement.click();
System.out.println("The Title is:"+driver.getTitle());
//driver.close();
}
}
