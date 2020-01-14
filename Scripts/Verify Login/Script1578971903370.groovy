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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_email'), 'chungkh@stengg.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_pass'), 
    'Kr4d/vgDUkIxPYyzw6Q/3g==')

WebUI.click(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Remember me_login-btn'))

WebUI.verifyTextPresent('Sign Out', false)

WebUI.closeBrowser()

