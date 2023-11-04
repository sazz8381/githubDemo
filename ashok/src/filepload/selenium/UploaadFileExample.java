package filepload.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploaadFileExample extends BaseClass {

	public static void main(String[] args) throws Exception {

		getBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		enterText(By.xpath("//input[@name='username']"), "admin");
		enterText(By.xpath("//input[@name='password']"), "admin123");
		clickElement(By.xpath("//button[@type='submit']"));
		clickElement(By.xpath("//a//span[text()='PIM']"));
		WebElement config = waitforElement(By.xpath("//ul//li//span[contains(text(),'Configuration')]"));
		movetoElementandClick(config);
		List<WebElement> configoptions = getallElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li"));
		String option = selectOption(configoptions, "Data Import");
		System.out.println(option + " Selected !!");
		WebElement dataimport = getElement(By.xpath("//p[text()='Data Import']"));
		if (isDisplayed(dataimport)) {
			clickElement(By.xpath("//div[text()='Browse']"));

			fileUpload("C:\\Users\\sazz8\\Documents\\Downloads\\importData.csv");

			clickElement(By.xpath("//button[text()=' Upload ' or @type='submit']"));
			
			if (isDisplayed(By.xpath("//div//p[text()='Import Details']"))) {
				WebElement uploadstatus = waitforElement(
						By.xpath("//div//p[text()='Import Details']/parent::div/following-sibling::div"));
				System.out.println(uploadstatus.getText());
				clickElement(By.xpath(
						"//div[@class='orangehrm-modal-header']/following-sibling::div[@class='orangehrm-modal-footer']"));

			}
		}
		tearDown();
	}
}