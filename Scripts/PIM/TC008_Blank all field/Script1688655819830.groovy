import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('loginPage/usernameLogin'), GlobalVariable.usernameLogin)

WebUI.setText(findTestObject('loginPage/passwordLogin'), GlobalVariable.passwordLogin)

WebUI.click(findTestObject('loginPage/loginButton'))

WebUI.delay(5)

WebUI.click(findTestObject('pimPage/ADD_EMPLOYEE/menu_PIM'))

WebUI.click(findTestObject('pimPage/ADD_EMPLOYEE/Add_PIM'))

'fungsi CTRL + A'
WebUI.sendKeys(findTestObject('pimPage/ADD_EMPLOYEE/employeeId_field'), Keys.chord(Keys.CONTROL, 'a'))

'fungsi backspace'
WebUI.sendKeys(findTestObject('pimPage/ADD_EMPLOYEE/employeeId_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('pimPage/ADD_EMPLOYEE/loginDetail_button'))

WebUI.click(findTestObject('pimPage/ADD_EMPLOYEE/Save_PIM'))

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_firstName'), 'Required')

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_password'), 'Required')

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_lastName'), 'Required')

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_username'), 'Required')

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_password'), 'Required')

WebUI.verifyElementText(findTestObject('pimPage/ADD_EMPLOYEE/alert_confirmPassword'), 'Required')

WebUI.delay(2)

