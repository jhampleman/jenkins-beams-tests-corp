import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
//import excel factory first

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.io.File as File
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import groovy.json.JsonSlurper

//WS.sendRequestAndVerify(findTestObject('Exede_Zip', [('mybeam') : mybeam]))




String excelFile01 = 'beams-test-results.xlsx'


// Verify sheets created
String[] ExpectedListSheetFile1 = ['Sheet1']
workbookFile01 = ExcelKeywords.getWorkbook(excelFile01)// get latest workbook File01
	

// Write some data to File01Sheet01 in File01
workbook01 = ExcelKeywords.getWorkbook(excelFile01)
sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'Sheet1')

ExcelKeywords.setValueToCellByAddress(sheet01, 'A1', 'TEST')
ExcelKeywords.setValueToCellByAddress(sheet01, 'B1', 'BEAM')
ExcelKeywords.setValueToCellByAddress(sheet01, 'C1', 'UFF')
ExcelKeywords.setValueToCellByAddress(sheet01, 'D1', 'PLAN')
ExcelKeywords.setValueToCellByAddress(sheet01, 'E1', 'API PLAN')

GlobalVariable.mybeam = mybeam
GlobalVariable.myuff = myuff
GlobalVariable.myplan = myplan
//GlobalVariable.variable = apiplan

KeywordLogger log = new KeywordLogger()


log.logWarning(((((('beam ' + mybeam) + ' zip ') + myzip) + ' upfront fees ') + myuff) + ' plan ' + myplan)


ExcelKeywords.setValueToCellByAddress(sheet01, 'B'+GlobalVariable.mycount, (GlobalVariable.beamFail))
ExcelKeywords.setValueToCellByAddress(sheet01, 'C'+GlobalVariable.mycount, (GlobalVariable.uffFail))
//myend = GlobalVariable.mycount + 1
//ExcelKeywords.setValueToCellByAddress(sheet01, 'A'+myend, 'END')

GlobalVariable.mycount = (GlobalVariable.mycount + 1)

ExcelKeywords.setValueToCellByAddress(sheet01, 'A'+GlobalVariable.mycount, ((((('beam ' + mybeam) + ' zip ') + myzip) + ' upfront fees ') + myuff) + ' plan ' + myplan)
ExcelKeywords.setValueToCellByAddress(sheet01, 'D'+GlobalVariable.mycount, (myplan))
//ExcelKeywords.setValueToCellByAddress(sheet01, 'E'+GlobalVariable.mycount, (apiplan))


WS.sendRequestAndVerify(findTestObject('Exede_Zip', [('myzip') : myzip]))
ExcelKeywords.setValueToCellByAddress(sheet01, 'E'+GlobalVariable.mycount, (GlobalVariable.variable))
//log.logWarning(GlobalVariable.variable)

// Save data of File01
ExcelKeywords.saveWorkbook(excelFile01, workbook01)



