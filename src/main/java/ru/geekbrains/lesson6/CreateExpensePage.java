package ru.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateExpensePage extends BaseView {
    public CreateExpensePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "crm_expense_request[description]")
    public WebElement expenseRequestName;

    public CreateExpensePage fillName(String name) {
        expenseRequestName.sendKeys(name);
        return this;
    }

    @FindBy(name = "crm_expense_request[businessUnit]")
    public WebElement businessUnitSelect;

    public CreateExpensePage selectBusinessUnit(String businessUnit) {
        new Select(businessUnitSelect).selectByVisibleText(businessUnit);
        return this;
    }

    @FindBy(name = "crm_expense_request[expenditure]")
    public WebElement selectExpenditure;

    public CreateExpensePage selectExpenditure(String expenditure) {
        new Select(selectExpenditure).selectByVisibleText(expenditure);
        return this;
    }

    @FindBy(name = "crm_expense_request[currency]")
    public WebElement selectCurrency;

    public CreateExpensePage selectCurrency(String currency) {
        new Select(selectCurrency).selectByVisibleText(currency);
        return this;
    }

    @FindBy(name = "crm_expense_request[sumPlan]")
    public WebElement sumPlan;

    public CreateExpensePage fillSumPlan(String sum) {
        sumPlan.sendKeys(sum);
        return this;
    }

    @FindBy(xpath = "//input[contains(@id, 'date_selector_crm_expense_request_datePlan')]")
    public WebElement plannedDate;

    @FindBy(xpath = "//td[@data-handler='selectDay']/a")
    public List<WebElement> daysInCalendar;

    public CreateExpensePage selectDatePlan(String dayOfMonth) {
        plannedDate.click();
        daysInCalendar.stream()
                .filter(element -> element.getText().equals(dayOfMonth))
                .findFirst().get().click();
        return this;
    }

    @FindBy(xpath = saveAndCloseButtonXpathLocator)
    public WebElement saveAndCloseButton;

    public static final String saveAndCloseButtonXpathLocator = "//button[contains(text(), 'Сохранить и закрыть')]";

    @FindBy(xpath = "//*[text()='Заявка на расход сохранена']")
    public WebElement requestSavedSuccessfullyElement;
}
