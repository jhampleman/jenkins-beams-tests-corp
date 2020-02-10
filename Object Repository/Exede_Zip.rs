<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Exede_Zip</name>
   <tag></tag>
   <elementGuidId>8e783db7-1910-4e49-81c9-0fe98df826ce</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://www.exede.com/services/lookup/v2/full.php?zip=${myzip}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'31201'</defaultValue>
      <description></description>
      <id>747cb444-7542-41de-b81f-ff06f0632483</id>
      <masked>false</masked>
      <name>myzip</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>38e1e655-6c97-4e1f-8505-63995e2bb3c4</id>
      <masked>false</masked>
      <name>mycount</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>89346dea-1b09-49aa-b364-b96bb3a8ab95</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

//GlobalVariable.beamFail=&quot;&quot;

if(!WS.verifyElementPropertyValue(response, 'data.beam', GlobalVariable.mybeam)){GlobalVariable.beamFail=&quot;F&quot;;}else{GlobalVariable.beamFail=&quot;P&quot;}
if(!WS.verifyElementPropertyValue(response, 'data.product.down', GlobalVariable.myuff)){GlobalVariable.uffFail=&quot;F&quot;}else{GlobalVariable.uffFail=&quot;P&quot;}

    
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(response. getResponseText())
println(object)
mytest=object.data.product.plans
GlobalVariable.variable=mytest

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
