package st
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	@Given("Go to login page successfully")
	def I_go_to_login_page() {
		//Action go to the login page
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://www.katalon.com/')
		
		WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/a_Sign In'))
		
	}

	@When('I enter the correct "(.*)" username and "(.*)" password')
	def I_enter_user_password(String user, String password) {
		//Input usernam and password
		WebUI.setText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_email'), user)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_pass'), 
			password)

		WebUI.click(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Remember me_login-btn'))
	}

	@Then('Show the correct expect "(.*)" message')
	def I_should_see_the_message(String message) {
		WebUI.verifyTextPresent(message, false)

		WebUI.closeBrowser()
	}
}