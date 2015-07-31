package app.test;

import java.math.BigDecimal;
import java.util.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import app.bean.Person;

import com.sun.jersey.api.client.*;

public class CallLED {

	public static void main(String[] args) {
		Client client = Client.create();
		String url = "http://localhost:7001/LedServiceWeb/rest/callservice/setSendWrit";
		WebResource webResource = client.resource(url);

		SwsSendwrit requestBean = new SwsSendwrit();
		// requestBean.setSendwritGen(1L); generated
		requestBean.setSendwritType(true);
		requestBean.setSysType("T");
		requestBean.setSendMethod("SM");
		requestBean.setSendMethodDate(new Date());

		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, requestBean);
		String output = response.getEntity(String.class);

		System.out.println(output);

	}
}

/*

	private static String getHelloTextByJson(WebResource webResource) {
		String output = null;
		ClientResponse response;
		JSONObject json = new JSONObject();
		try {

			json.put("sendwritBookNo", "443");
			json.put("sendwritBookDate", "qwer");
			System.out.println(json);

			MultivaluedMap multivaluedMap = new MultivaluedMapImpl();
			// multivaluedMap.add("sendwritBookNo", "Gift");
			multivaluedMap.add("sendwritBookDate", new Date());

			Map map = new HashMap();
			map.put("sendwritBookNo", "Gift");
			map.put("sendwritBookDate", new Date());

			Person person = new Person();
			person.setFirstname("dddd");
			person.setLastname("xxxx");

			response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);

			output = response.getEntity(String.class);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		return output;
	}

	private static String getHelloTextByBean(WebResource webResource) throws JSONException {
		String output;
		ClientResponse response;

		SwsSendwrit sw = new SwsSendwrit();
		//1Long 2Integer 3Short 4Byte 5BigDecimal 
		
//		sw.setSendwritGen(1L); generated
		
		sw.setSendwritType(true);
		sw.setSysType("T");
		sw.setSendMethod("SM");
		sw.setSendMethodDate(new Date());
//		sw.setExpressCode("test");
//		sw.setPccDossControlGen(1L);
//		sw.setCaseCode("test");
//		sw.setRecvNo(2);
//		sw.setRecvYear("test");
//		sw.setRecvCentDeptGen(1L);
//		sw.setCourtCode("test");
//		sw.setDocumentNo(2);
//		sw.setDocumentYy("test");
//		
//		
//		sw.setSendwritBookNo("test");
//		sw.setSendwritBookDate(new Date());
//		
//		
//		sw.setBlackPrefix("test");
//		sw.setBlackCase("test");
//		sw.setBlackYear("test");
//		sw.setRedPrefix("test");
//		sw.setRedCase("test");
//		sw.setRedYear("test");
//		sw.setCivilNamePt("test");
//		sw.setCivilNameDf("test");
//		sw.setCentDeptGenTarget(1L);
//		sw.setSendwritDateOwner(new Date());
//		sw.setSendwritReturnDate(new Date());
//		sw.setCentDeptGenOwner(1L);
//		sw.setSendwritRecvDate(new Date());
//		sw.setDocTypeCode("test");
//		sw.setDocDate(new Date());
//		sw.setDocumentDate(new Date());
//		sw.setReportDate(new Date());
//		sw.setLandStatus("test");
//		sw.setLanddeptLocGen(1L);
//		sw.setLanddeptCode("test");
//		sw.setLandDeedNo("test");
//		sw.setSendwritRecvName("test");
//		sw.setSendwritAddr("test");
//		sw.setSendwritAddrFlNo("test");
//		sw.setSendwritAddrNo("test");
//		sw.setSendwritAddrMooban("test");
//		sw.setSendwritAddrMoo("test");
//		sw.setSendwritAddrSoi("test");
//		sw.setSendwritAddrRoad("test");
//		sw.setCentLocGen(1L);
//		sw.setSellDesc("test");
//		sw.setSellDate1(new Date());
//		sw.setSellDate2(new Date());
//		sw.setSellDate3(new Date());
//		sw.setSellDate4(new Date());
//		sw.setSendwritAmount( new Short("3"));
//		sw.setSendwritAmountPending( new Short("3"));
//		sw.setSendwritAmountType(true);
//		sw.setSendwritAmountFreeRef("test");
//		sw.setSendwritAmountDateRef(new Date());
//		sw.setSendwritAmountBaht(new Short("3"));
//		sw.setSendwritAmountPercen(new Byte("4"));
//		sw.setResultCancel("test");
//		sw.setResultCancelDate(new Date());
//		sw.setChequeNo("test");
//		sw.setChequeDate(new Date());
//		sw.setChequeType("test");
//		sw.setChequeBank("test");
//		sw.setChequeSubbank(1L);
//		sw.setChequeAmount(1L);
//		sw.setSendwritEmsAmount(new Short("3"));
//		sw.setSendwritTargetGen(1L);
//		sw.setParentCentDeptGenTarget(1L);
//		sw.setParentCentDeptGenOwner(1L);
//		sw.setShrPersonMapGen(1L);
//		sw.setCfcReportsGen(1L);
//		sw.setSendByOfficerGen(1L);
//		sw.setCentDeptGen(1L);
//		sw.setAccServiceCharge(new BigDecimal("5"));
//		sw.setBillOfExchange(new BigDecimal("5"));
//		sw.setPostServiceCharge(new BigDecimal("5"));
//		sw.setPostCharge(new BigDecimal("5"));
//		sw.setPostDate(new Date());
//		sw.setPostTime("test");
//		sw.setPostReceiptName("test");
//		sw.setPostAge(new Short("3"));
//		sw.setPostRelate("test");
//		sw.setPostNo("test");
//		sw.setPostWeight(2);
//		sw.setNewspaperName("test");
//		sw.setNewspaperDate(new Date());
//		sw.setNewspaperPrintDate(new Date());
//		sw.setNewspaperCharge(new BigDecimal("5"));
//		sw.setLandDeedFlag("test");
//		sw.setConcernType("test");
//		sw.setConcernDesc("test");
//		sw.setMapCode("test");
//		sw.setApproveDate(new Date());
//		sw.setSendwritStatus("test");
//		sw.setAudWdFlag("test");
//		sw.setSwsFlag("test");
//		sw.setChequeRecvFlag("test");
//		sw.setApproveFlag("test");
//		sw.setResultFlag("test");
//		sw.setResultDate(new Date());
//		sw.setResultRemark("test");
//		sw.setCancelDate(new Date());
////		sw.setcreateByUserid
//		sw.setCreateDate(new Date());
////		sw.setUpdateByUserid(null);
////		sw.setUpdateDate(null);
////		sw.setcreateByProgid
////		sw.setupdateByProgid
////		sw.setdataId
//		sw.setUserDeptCode("test");
//		sw.setDocTime("test");
//		sw.setMobileUploadDate(new Date());
//		sw.setMobileDownloadDate(new Date());
//		sw.setDocTitlename("test");
//		sw.setStatusLongreceipt("test");
//		sw.setSellDate("test");
//		sw.setBuildId("test");
//		sw.setBuildName("test");
//		sw.setBuildFloor("test");
//		sw.setBuildNo("test");
//		sw.setBuildNoName("test");
//		sw.setBuildMaxFloor("test");
//		sw.setBuildOther("test");
//		sw.setBuildArea("test");
//		sw.setLocPriceGen(1L);
//		sw.setSendwritAdminRecvDate(new Date());
//		sw.setSendwritAdminCancelDate(new Date());
//		sw.setConcernCode("test");
//		sw.setRequestCancelRemark("test");
//		sw.setRequestCancelDate(new Date());
//		sw.setCancelRemark("test");
//		sw.setWithdrawStatus("test");
//		sw.setWithdrawStatusDate(new Date());

		//
		// JSONObject json = new JSONObject();
		// json.put("accServiceCharge", 12345);
		//
		// System.out.println(json.toString());
		
		response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, sw);
		output = response.getEntity(String.class);

		return output;
	}
}
*/