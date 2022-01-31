package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityWesitePage extends PageObject {
    private WebElementFacade getCourseLink(String courseName) {
        return find(By.xpath(String.format("//*[text()='%s']", courseName)));
    }
    private WebElementFacade getCourseTitleText(){
        return find(By.xpath("//h1[@class='page']"));
    }

    public void selectCourse(String courseName){
        getCourseLink(courseName).click();
    }
    public String getCourseTitle(){
        return getCourseTitleText().getText();
    }
}
