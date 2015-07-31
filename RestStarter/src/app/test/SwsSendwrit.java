package app.test;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SwsSendwrit implements java.io.Serializable {
	private static final long serialVersionUID = 5787153648413251180L;
	
	private Long sendwritGen;
	private Long version = 1L;
	private Boolean sendwritType;
	private String sysType;
	private String sendMethod;
	private Date sendMethodDate;
	private String expressCode;
	private Long pccDossControlGen;
	private String caseCode;
	private Integer recvNo;
	private String recvYear;
	private Long recvCentDeptGen;
	private String courtCode;
	private Integer documentNo;
	private String documentYy;
	private String sendwritBookNo;
	private Date sendwritBookDate;
	private String blackPrefix;
	private String blackCase;
	private String blackYear;
	private String redPrefix;
	private String redCase;
	private String redYear;
	private String civilNamePt;
	private String civilNameDf;
	private Long centDeptGenTarget;
	private Date sendwritDateOwner;
	private Date sendwritReturnDate;
	private Long centDeptGenOwner;
	private Date sendwritRecvDate;
	private String docTypeCode;
	private Date docDate;
	private Date documentDate;
	private Date reportDate;
	private String landStatus;
	private Long landdeptLocGen;
	private String landdeptCode;
	private String landDeedNo;
	private String sendwritRecvName;
	private String sendwritAddr;
	private String sendwritAddrFlNo;
	private String sendwritAddrNo;
	private String sendwritAddrMooban;
	private String sendwritAddrMoo;
	private String sendwritAddrSoi;
	private String sendwritAddrRoad;
	private Long centLocGen;
	private String sellDesc;
	private Date sellDate1;
	private Date sellDate2;
	private Date sellDate3;
	private Date sellDate4;
	private Short sendwritAmount;
	private Short sendwritAmountPending;
	private Boolean sendwritAmountType;
	private String sendwritAmountFreeRef;
	private Date sendwritAmountDateRef;
	private Short sendwritAmountBaht;
	private Byte sendwritAmountPercen;
	private String resultCancel;
	private Date resultCancelDate;
	private String chequeNo;
	private Date chequeDate;
	private String chequeType;
	private String chequeBank;
	private Long chequeSubbank;
	private Long chequeAmount;
	private Short sendwritEmsAmount;
	private Long sendwritTargetGen;
	private Long parentCentDeptGenTarget;
	private Long parentCentDeptGenOwner;
	private Long shrPersonMapGen;
	private Long cfcReportsGen;
	private Long sendByOfficerGen;
	private Long centDeptGen;
	private BigDecimal accServiceCharge;
	private BigDecimal billOfExchange;
	private BigDecimal postServiceCharge;
	private BigDecimal postCharge;
	private Date postDate;
	private String postTime;
	private String postReceiptName;
	private Short postAge;
	private String postRelate;
	private String postNo;
	private Integer postWeight;
	private String newspaperName;
	private Date newspaperDate;
	private Date newspaperPrintDate;
	private BigDecimal newspaperCharge;
	private String landDeedFlag;
	private String concernType;
	private String concernDesc;
	private String mapCode;
	private Date approveDate;
	private String sendwritStatus;
	private String audWdFlag;
	private String swsFlag;
	private String chequeRecvFlag;
	private String approveFlag;
	private String resultFlag;
	private Date resultDate;
	private String resultRemark;
	private Date cancelDate;
	private String createByUserid;
	private Date createDate;
	private String updateByUserid;
	private Date updateDate;
	private String createByProgid;
	private String updateByProgid;
	private BigDecimal dataId;
	private String userDeptCode;
	private String docTime;
	private Date mobileUploadDate;
	private Date mobileDownloadDate;
	private String docTitlename;
	private String statusLongreceipt;
	private String sellDate;
	private String buildId;
	private String buildName;
	private String buildFloor;
	private String buildNo;
	private String buildNoName;
	private String buildMaxFloor;
	private String buildOther;
	private String buildArea;
	private Long locPriceGen;
	private Date sendwritAdminRecvDate;
	private Date sendwritAdminCancelDate;
	private String concernCode;
	private String requestCancelRemark;
	private Date requestCancelDate;
	private String cancelRemark;
	private String withdrawStatus;
	private Date withdrawStatusDate;
//	private SwsSendDetail sendDetail;
//	private SwsSendwritLog sendwritLog;
	public Long getSendwritGen() {
		return sendwritGen;
	}
	public void setSendwritGen(Long sendwritGen) {
		this.sendwritGen = sendwritGen;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Boolean getSendwritType() {
		return sendwritType;
	}
	public void setSendwritType(Boolean sendwritType) {
		this.sendwritType = sendwritType;
	}
	public String getSysType() {
		return sysType;
	}
	public void setSysType(String sysType) {
		this.sysType = sysType;
	}
	public String getSendMethod() {
		return sendMethod;
	}
	public void setSendMethod(String sendMethod) {
		this.sendMethod = sendMethod;
	}
	public Date getSendMethodDate() {
		return sendMethodDate;
	}
	public void setSendMethodDate(Date sendMethodDate) {
		this.sendMethodDate = sendMethodDate;
	}
	public String getExpressCode() {
		return expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	public Long getPccDossControlGen() {
		return pccDossControlGen;
	}
	public void setPccDossControlGen(Long pccDossControlGen) {
		this.pccDossControlGen = pccDossControlGen;
	}
	public String getCaseCode() {
		return caseCode;
	}
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}
	public Integer getRecvNo() {
		return recvNo;
	}
	public void setRecvNo(Integer recvNo) {
		this.recvNo = recvNo;
	}
	public String getRecvYear() {
		return recvYear;
	}
	public void setRecvYear(String recvYear) {
		this.recvYear = recvYear;
	}
	public Long getRecvCentDeptGen() {
		return recvCentDeptGen;
	}
	public void setRecvCentDeptGen(Long recvCentDeptGen) {
		this.recvCentDeptGen = recvCentDeptGen;
	}
	public String getCourtCode() {
		return courtCode;
	}
	public void setCourtCode(String courtCode) {
		this.courtCode = courtCode;
	}
	public Integer getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(Integer documentNo) {
		this.documentNo = documentNo;
	}
	public String getDocumentYy() {
		return documentYy;
	}
	public void setDocumentYy(String documentYy) {
		this.documentYy = documentYy;
	}
	public String getSendwritBookNo() {
		return sendwritBookNo;
	}
	public void setSendwritBookNo(String sendwritBookNo) {
		this.sendwritBookNo = sendwritBookNo;
	}
	public Date getSendwritBookDate() {
		return sendwritBookDate;
	}
	public void setSendwritBookDate(Date sendwritBookDate) {
		this.sendwritBookDate = sendwritBookDate;
	}
	public String getBlackPrefix() {
		return blackPrefix;
	}
	public void setBlackPrefix(String blackPrefix) {
		this.blackPrefix = blackPrefix;
	}
	public String getBlackCase() {
		return blackCase;
	}
	public void setBlackCase(String blackCase) {
		this.blackCase = blackCase;
	}
	public String getBlackYear() {
		return blackYear;
	}
	public void setBlackYear(String blackYear) {
		this.blackYear = blackYear;
	}
	public String getRedPrefix() {
		return redPrefix;
	}
	public void setRedPrefix(String redPrefix) {
		this.redPrefix = redPrefix;
	}
	public String getRedCase() {
		return redCase;
	}
	public void setRedCase(String redCase) {
		this.redCase = redCase;
	}
	public String getRedYear() {
		return redYear;
	}
	public void setRedYear(String redYear) {
		this.redYear = redYear;
	}
	public String getCivilNamePt() {
		return civilNamePt;
	}
	public void setCivilNamePt(String civilNamePt) {
		this.civilNamePt = civilNamePt;
	}
	public String getCivilNameDf() {
		return civilNameDf;
	}
	public void setCivilNameDf(String civilNameDf) {
		this.civilNameDf = civilNameDf;
	}
	public Long getCentDeptGenTarget() {
		return centDeptGenTarget;
	}
	public void setCentDeptGenTarget(Long centDeptGenTarget) {
		this.centDeptGenTarget = centDeptGenTarget;
	}
	public Date getSendwritDateOwner() {
		return sendwritDateOwner;
	}
	public void setSendwritDateOwner(Date sendwritDateOwner) {
		this.sendwritDateOwner = sendwritDateOwner;
	}
	public Date getSendwritReturnDate() {
		return sendwritReturnDate;
	}
	public void setSendwritReturnDate(Date sendwritReturnDate) {
		this.sendwritReturnDate = sendwritReturnDate;
	}
	public Long getCentDeptGenOwner() {
		return centDeptGenOwner;
	}
	public void setCentDeptGenOwner(Long centDeptGenOwner) {
		this.centDeptGenOwner = centDeptGenOwner;
	}
	public Date getSendwritRecvDate() {
		return sendwritRecvDate;
	}
	public void setSendwritRecvDate(Date sendwritRecvDate) {
		this.sendwritRecvDate = sendwritRecvDate;
	}
	public String getDocTypeCode() {
		return docTypeCode;
	}
	public void setDocTypeCode(String docTypeCode) {
		this.docTypeCode = docTypeCode;
	}
	public Date getDocDate() {
		return docDate;
	}
	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}
	public Date getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getLandStatus() {
		return landStatus;
	}
	public void setLandStatus(String landStatus) {
		this.landStatus = landStatus;
	}
	public Long getLanddeptLocGen() {
		return landdeptLocGen;
	}
	public void setLanddeptLocGen(Long landdeptLocGen) {
		this.landdeptLocGen = landdeptLocGen;
	}
	public String getLanddeptCode() {
		return landdeptCode;
	}
	public void setLanddeptCode(String landdeptCode) {
		this.landdeptCode = landdeptCode;
	}
	public String getLandDeedNo() {
		return landDeedNo;
	}
	public void setLandDeedNo(String landDeedNo) {
		this.landDeedNo = landDeedNo;
	}
	public String getSendwritRecvName() {
		return sendwritRecvName;
	}
	public void setSendwritRecvName(String sendwritRecvName) {
		this.sendwritRecvName = sendwritRecvName;
	}
	public String getSendwritAddr() {
		return sendwritAddr;
	}
	public void setSendwritAddr(String sendwritAddr) {
		this.sendwritAddr = sendwritAddr;
	}
	public String getSendwritAddrFlNo() {
		return sendwritAddrFlNo;
	}
	public void setSendwritAddrFlNo(String sendwritAddrFlNo) {
		this.sendwritAddrFlNo = sendwritAddrFlNo;
	}
	public String getSendwritAddrNo() {
		return sendwritAddrNo;
	}
	public void setSendwritAddrNo(String sendwritAddrNo) {
		this.sendwritAddrNo = sendwritAddrNo;
	}
	public String getSendwritAddrMooban() {
		return sendwritAddrMooban;
	}
	public void setSendwritAddrMooban(String sendwritAddrMooban) {
		this.sendwritAddrMooban = sendwritAddrMooban;
	}
	public String getSendwritAddrMoo() {
		return sendwritAddrMoo;
	}
	public void setSendwritAddrMoo(String sendwritAddrMoo) {
		this.sendwritAddrMoo = sendwritAddrMoo;
	}
	public String getSendwritAddrSoi() {
		return sendwritAddrSoi;
	}
	public void setSendwritAddrSoi(String sendwritAddrSoi) {
		this.sendwritAddrSoi = sendwritAddrSoi;
	}
	public String getSendwritAddrRoad() {
		return sendwritAddrRoad;
	}
	public void setSendwritAddrRoad(String sendwritAddrRoad) {
		this.sendwritAddrRoad = sendwritAddrRoad;
	}
	public Long getCentLocGen() {
		return centLocGen;
	}
	public void setCentLocGen(Long centLocGen) {
		this.centLocGen = centLocGen;
	}
	public String getSellDesc() {
		return sellDesc;
	}
	public void setSellDesc(String sellDesc) {
		this.sellDesc = sellDesc;
	}
	public Date getSellDate1() {
		return sellDate1;
	}
	public void setSellDate1(Date sellDate1) {
		this.sellDate1 = sellDate1;
	}
	public Date getSellDate2() {
		return sellDate2;
	}
	public void setSellDate2(Date sellDate2) {
		this.sellDate2 = sellDate2;
	}
	public Date getSellDate3() {
		return sellDate3;
	}
	public void setSellDate3(Date sellDate3) {
		this.sellDate3 = sellDate3;
	}
	public Date getSellDate4() {
		return sellDate4;
	}
	public void setSellDate4(Date sellDate4) {
		this.sellDate4 = sellDate4;
	}
	public Short getSendwritAmount() {
		return sendwritAmount;
	}
	public void setSendwritAmount(Short sendwritAmount) {
		this.sendwritAmount = sendwritAmount;
	}
	public Short getSendwritAmountPending() {
		return sendwritAmountPending;
	}
	public void setSendwritAmountPending(Short sendwritAmountPending) {
		this.sendwritAmountPending = sendwritAmountPending;
	}
	public Boolean getSendwritAmountType() {
		return sendwritAmountType;
	}
	public void setSendwritAmountType(Boolean sendwritAmountType) {
		this.sendwritAmountType = sendwritAmountType;
	}
	public String getSendwritAmountFreeRef() {
		return sendwritAmountFreeRef;
	}
	public void setSendwritAmountFreeRef(String sendwritAmountFreeRef) {
		this.sendwritAmountFreeRef = sendwritAmountFreeRef;
	}
	public Date getSendwritAmountDateRef() {
		return sendwritAmountDateRef;
	}
	public void setSendwritAmountDateRef(Date sendwritAmountDateRef) {
		this.sendwritAmountDateRef = sendwritAmountDateRef;
	}
	public Short getSendwritAmountBaht() {
		return sendwritAmountBaht;
	}
	public void setSendwritAmountBaht(Short sendwritAmountBaht) {
		this.sendwritAmountBaht = sendwritAmountBaht;
	}
	public Byte getSendwritAmountPercen() {
		return sendwritAmountPercen;
	}
	public void setSendwritAmountPercen(Byte sendwritAmountPercen) {
		this.sendwritAmountPercen = sendwritAmountPercen;
	}
	public String getResultCancel() {
		return resultCancel;
	}
	public void setResultCancel(String resultCancel) {
		this.resultCancel = resultCancel;
	}
	public Date getResultCancelDate() {
		return resultCancelDate;
	}
	public void setResultCancelDate(Date resultCancelDate) {
		this.resultCancelDate = resultCancelDate;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public Date getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public String getChequeBank() {
		return chequeBank;
	}
	public void setChequeBank(String chequeBank) {
		this.chequeBank = chequeBank;
	}
	public Long getChequeSubbank() {
		return chequeSubbank;
	}
	public void setChequeSubbank(Long chequeSubbank) {
		this.chequeSubbank = chequeSubbank;
	}
	public Long getChequeAmount() {
		return chequeAmount;
	}
	public void setChequeAmount(Long chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	public Short getSendwritEmsAmount() {
		return sendwritEmsAmount;
	}
	public void setSendwritEmsAmount(Short sendwritEmsAmount) {
		this.sendwritEmsAmount = sendwritEmsAmount;
	}
	public Long getSendwritTargetGen() {
		return sendwritTargetGen;
	}
	public void setSendwritTargetGen(Long sendwritTargetGen) {
		this.sendwritTargetGen = sendwritTargetGen;
	}
	public Long getParentCentDeptGenTarget() {
		return parentCentDeptGenTarget;
	}
	public void setParentCentDeptGenTarget(Long parentCentDeptGenTarget) {
		this.parentCentDeptGenTarget = parentCentDeptGenTarget;
	}
	public Long getParentCentDeptGenOwner() {
		return parentCentDeptGenOwner;
	}
	public void setParentCentDeptGenOwner(Long parentCentDeptGenOwner) {
		this.parentCentDeptGenOwner = parentCentDeptGenOwner;
	}
	public Long getShrPersonMapGen() {
		return shrPersonMapGen;
	}
	public void setShrPersonMapGen(Long shrPersonMapGen) {
		this.shrPersonMapGen = shrPersonMapGen;
	}
	public Long getCfcReportsGen() {
		return cfcReportsGen;
	}
	public void setCfcReportsGen(Long cfcReportsGen) {
		this.cfcReportsGen = cfcReportsGen;
	}
	public Long getSendByOfficerGen() {
		return sendByOfficerGen;
	}
	public void setSendByOfficerGen(Long sendByOfficerGen) {
		this.sendByOfficerGen = sendByOfficerGen;
	}
	public Long getCentDeptGen() {
		return centDeptGen;
	}
	public void setCentDeptGen(Long centDeptGen) {
		this.centDeptGen = centDeptGen;
	}
	public BigDecimal getAccServiceCharge() {
		return accServiceCharge;
	}
	public void setAccServiceCharge(BigDecimal accServiceCharge) {
		this.accServiceCharge = accServiceCharge;
	}
	public BigDecimal getBillOfExchange() {
		return billOfExchange;
	}
	public void setBillOfExchange(BigDecimal billOfExchange) {
		this.billOfExchange = billOfExchange;
	}
	public BigDecimal getPostServiceCharge() {
		return postServiceCharge;
	}
	public void setPostServiceCharge(BigDecimal postServiceCharge) {
		this.postServiceCharge = postServiceCharge;
	}
	public BigDecimal getPostCharge() {
		return postCharge;
	}
	public void setPostCharge(BigDecimal postCharge) {
		this.postCharge = postCharge;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	public String getPostReceiptName() {
		return postReceiptName;
	}
	public void setPostReceiptName(String postReceiptName) {
		this.postReceiptName = postReceiptName;
	}
	public Short getPostAge() {
		return postAge;
	}
	public void setPostAge(Short postAge) {
		this.postAge = postAge;
	}
	public String getPostRelate() {
		return postRelate;
	}
	public void setPostRelate(String postRelate) {
		this.postRelate = postRelate;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public Integer getPostWeight() {
		return postWeight;
	}
	public void setPostWeight(Integer postWeight) {
		this.postWeight = postWeight;
	}
	public String getNewspaperName() {
		return newspaperName;
	}
	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}
	public Date getNewspaperDate() {
		return newspaperDate;
	}
	public void setNewspaperDate(Date newspaperDate) {
		this.newspaperDate = newspaperDate;
	}
	public Date getNewspaperPrintDate() {
		return newspaperPrintDate;
	}
	public void setNewspaperPrintDate(Date newspaperPrintDate) {
		this.newspaperPrintDate = newspaperPrintDate;
	}
	public BigDecimal getNewspaperCharge() {
		return newspaperCharge;
	}
	public void setNewspaperCharge(BigDecimal newspaperCharge) {
		this.newspaperCharge = newspaperCharge;
	}
	public String getLandDeedFlag() {
		return landDeedFlag;
	}
	public void setLandDeedFlag(String landDeedFlag) {
		this.landDeedFlag = landDeedFlag;
	}
	public String getConcernType() {
		return concernType;
	}
	public void setConcernType(String concernType) {
		this.concernType = concernType;
	}
	public String getConcernDesc() {
		return concernDesc;
	}
	public void setConcernDesc(String concernDesc) {
		this.concernDesc = concernDesc;
	}
	public String getMapCode() {
		return mapCode;
	}
	public void setMapCode(String mapCode) {
		this.mapCode = mapCode;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public String getSendwritStatus() {
		return sendwritStatus;
	}
	public void setSendwritStatus(String sendwritStatus) {
		this.sendwritStatus = sendwritStatus;
	}
	public String getAudWdFlag() {
		return audWdFlag;
	}
	public void setAudWdFlag(String audWdFlag) {
		this.audWdFlag = audWdFlag;
	}
	public String getSwsFlag() {
		return swsFlag;
	}
	public void setSwsFlag(String swsFlag) {
		this.swsFlag = swsFlag;
	}
	public String getChequeRecvFlag() {
		return chequeRecvFlag;
	}
	public void setChequeRecvFlag(String chequeRecvFlag) {
		this.chequeRecvFlag = chequeRecvFlag;
	}
	public String getApproveFlag() {
		return approveFlag;
	}
	public void setApproveFlag(String approveFlag) {
		this.approveFlag = approveFlag;
	}
	public String getResultFlag() {
		return resultFlag;
	}
	public void setResultFlag(String resultFlag) {
		this.resultFlag = resultFlag;
	}
	public Date getResultDate() {
		return resultDate;
	}
	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}
	public String getResultRemark() {
		return resultRemark;
	}
	public void setResultRemark(String resultRemark) {
		this.resultRemark = resultRemark;
	}
	public Date getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getCreateByUserid() {
		return createByUserid;
	}
	public void setCreateByUserid(String createByUserid) {
		this.createByUserid = createByUserid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateByUserid() {
		return updateByUserid;
	}
	public void setUpdateByUserid(String updateByUserid) {
		this.updateByUserid = updateByUserid;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreateByProgid() {
		return createByProgid;
	}
	public void setCreateByProgid(String createByProgid) {
		this.createByProgid = createByProgid;
	}
	public String getUpdateByProgid() {
		return updateByProgid;
	}
	public void setUpdateByProgid(String updateByProgid) {
		this.updateByProgid = updateByProgid;
	}
	public BigDecimal getDataId() {
		return dataId;
	}
	public void setDataId(BigDecimal dataId) {
		this.dataId = dataId;
	}
	public String getUserDeptCode() {
		return userDeptCode;
	}
	public void setUserDeptCode(String userDeptCode) {
		this.userDeptCode = userDeptCode;
	}
	public String getDocTime() {
		return docTime;
	}
	public void setDocTime(String docTime) {
		this.docTime = docTime;
	}
	public Date getMobileUploadDate() {
		return mobileUploadDate;
	}
	public void setMobileUploadDate(Date mobileUploadDate) {
		this.mobileUploadDate = mobileUploadDate;
	}
	public Date getMobileDownloadDate() {
		return mobileDownloadDate;
	}
	public void setMobileDownloadDate(Date mobileDownloadDate) {
		this.mobileDownloadDate = mobileDownloadDate;
	}
	public String getDocTitlename() {
		return docTitlename;
	}
	public void setDocTitlename(String docTitlename) {
		this.docTitlename = docTitlename;
	}
	public String getStatusLongreceipt() {
		return statusLongreceipt;
	}
	public void setStatusLongreceipt(String statusLongreceipt) {
		this.statusLongreceipt = statusLongreceipt;
	}
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	public String getBuildId() {
		return buildId;
	}
	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public String getBuildFloor() {
		return buildFloor;
	}
	public void setBuildFloor(String buildFloor) {
		this.buildFloor = buildFloor;
	}
	public String getBuildNo() {
		return buildNo;
	}
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}
	public String getBuildNoName() {
		return buildNoName;
	}
	public void setBuildNoName(String buildNoName) {
		this.buildNoName = buildNoName;
	}
	public String getBuildMaxFloor() {
		return buildMaxFloor;
	}
	public void setBuildMaxFloor(String buildMaxFloor) {
		this.buildMaxFloor = buildMaxFloor;
	}
	public String getBuildOther() {
		return buildOther;
	}
	public void setBuildOther(String buildOther) {
		this.buildOther = buildOther;
	}
	public String getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}
	public Long getLocPriceGen() {
		return locPriceGen;
	}
	public void setLocPriceGen(Long locPriceGen) {
		this.locPriceGen = locPriceGen;
	}
	public Date getSendwritAdminRecvDate() {
		return sendwritAdminRecvDate;
	}
	public void setSendwritAdminRecvDate(Date sendwritAdminRecvDate) {
		this.sendwritAdminRecvDate = sendwritAdminRecvDate;
	}
	public Date getSendwritAdminCancelDate() {
		return sendwritAdminCancelDate;
	}
	public void setSendwritAdminCancelDate(Date sendwritAdminCancelDate) {
		this.sendwritAdminCancelDate = sendwritAdminCancelDate;
	}
	public String getConcernCode() {
		return concernCode;
	}
	public void setConcernCode(String concernCode) {
		this.concernCode = concernCode;
	}
	public String getRequestCancelRemark() {
		return requestCancelRemark;
	}
	public void setRequestCancelRemark(String requestCancelRemark) {
		this.requestCancelRemark = requestCancelRemark;
	}
	public Date getRequestCancelDate() {
		return requestCancelDate;
	}
	public void setRequestCancelDate(Date requestCancelDate) {
		this.requestCancelDate = requestCancelDate;
	}
	public String getCancelRemark() {
		return cancelRemark;
	}
	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}
	public String getWithdrawStatus() {
		return withdrawStatus;
	}
	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
	}
	public Date getWithdrawStatusDate() {
		return withdrawStatusDate;
	}
	public void setWithdrawStatusDate(Date withdrawStatusDate) {
		this.withdrawStatusDate = withdrawStatusDate;
	}
	@Override
	public String toString() {
		return "{sendwritGen:" + sendwritGen + ", version:" + version + ", sendwritType:" + sendwritType + ", sysType:" + sysType + ", sendMethod:" + sendMethod + ", sendMethodDate:"
				+ sendMethodDate + ", expressCode:" + expressCode + ", pccDossControlGen:" + pccDossControlGen + ", caseCode:" + caseCode + ", recvNo:" + recvNo + ", recvYear:" + recvYear
				+ ", recvCentDeptGen:" + recvCentDeptGen + ", courtCode:" + courtCode + ", documentNo:" + documentNo + ", documentYy:" + documentYy + ", sendwritBookNo:" + sendwritBookNo
				+ ", sendwritBookDate:" + sendwritBookDate + ", blackPrefix:" + blackPrefix + ", blackCase:" + blackCase + ", blackYear:" + blackYear + ", redPrefix:" + redPrefix + ", redCase:"
				+ redCase + ", redYear:" + redYear + ", civilNamePt:" + civilNamePt + ", civilNameDf:" + civilNameDf + ", centDeptGenTarget:" + centDeptGenTarget + ", sendwritDateOwner:"
				+ sendwritDateOwner + ", sendwritReturnDate:" + sendwritReturnDate + ", centDeptGenOwner:" + centDeptGenOwner + ", sendwritRecvDate:" + sendwritRecvDate + ", docTypeCode:"
				+ docTypeCode + ", docDate:" + docDate + ", documentDate:" + documentDate + ", reportDate:" + reportDate + ", landStatus:" + landStatus + ", landdeptLocGen:" + landdeptLocGen
				+ ", landdeptCode:" + landdeptCode + ", landDeedNo:" + landDeedNo + ", sendwritRecvName:" + sendwritRecvName + ", sendwritAddr:" + sendwritAddr + ", sendwritAddrFlNo:"
				+ sendwritAddrFlNo + ", sendwritAddrNo:" + sendwritAddrNo + ", sendwritAddrMooban:" + sendwritAddrMooban + ", sendwritAddrMoo:" + sendwritAddrMoo + ", sendwritAddrSoi:"
				+ sendwritAddrSoi + ", sendwritAddrRoad:" + sendwritAddrRoad + ", centLocGen:" + centLocGen + ", sellDesc:" + sellDesc + ", sellDate1:" + sellDate1 + ", sellDate2:" + sellDate2
				+ ", sellDate3:" + sellDate3 + ", sellDate4:" + sellDate4 + ", sendwritAmount:" + sendwritAmount + ", sendwritAmountPending:" + sendwritAmountPending + ", sendwritAmountType:"
				+ sendwritAmountType + ", sendwritAmountFreeRef:" + sendwritAmountFreeRef + ", sendwritAmountDateRef:" + sendwritAmountDateRef + ", sendwritAmountBaht:" + sendwritAmountBaht
				+ ", sendwritAmountPercen:" + sendwritAmountPercen + ", resultCancel:" + resultCancel + ", resultCancelDate:" + resultCancelDate + ", chequeNo:" + chequeNo + ", chequeDate:"
				+ chequeDate + ", chequeType:" + chequeType + ", chequeBank:" + chequeBank + ", chequeSubbank:" + chequeSubbank + ", chequeAmount:" + chequeAmount + ", sendwritEmsAmount:"
				+ sendwritEmsAmount + ", sendwritTargetGen:" + sendwritTargetGen + ", parentCentDeptGenTarget:" + parentCentDeptGenTarget + ", parentCentDeptGenOwner:" + parentCentDeptGenOwner
				+ ", shrPersonMapGen:" + shrPersonMapGen + ", cfcReportsGen:" + cfcReportsGen + ", sendByOfficerGen:" + sendByOfficerGen + ", centDeptGen:" + centDeptGen + ", accServiceCharge:"
				+ accServiceCharge + ", billOfExchange:" + billOfExchange + ", postServiceCharge:" + postServiceCharge + ", postCharge:" + postCharge + ", postDate:" + postDate + ", postTime:"
				+ postTime + ", postReceiptName:" + postReceiptName + ", postAge:" + postAge + ", postRelate:" + postRelate + ", postNo:" + postNo + ", postWeight:" + postWeight + ", newspaperName:"
				+ newspaperName + ", newspaperDate:" + newspaperDate + ", newspaperPrintDate:" + newspaperPrintDate + ", newspaperCharge:" + newspaperCharge + ", landDeedFlag:" + landDeedFlag
				+ ", concernType:" + concernType + ", concernDesc:" + concernDesc + ", mapCode:" + mapCode + ", approveDate:" + approveDate + ", sendwritStatus:" + sendwritStatus + ", audWdFlag:"
				+ audWdFlag + ", swsFlag:" + swsFlag + ", chequeRecvFlag:" + chequeRecvFlag + ", approveFlag:" + approveFlag + ", resultFlag:" + resultFlag + ", resultDate:" + resultDate
				+ ", resultRemark:" + resultRemark + ", cancelDate:" + cancelDate + ", createByUserid:" + createByUserid + ", createDate:" + createDate + ", updateByUserid:" + updateByUserid
				+ ", updateDate:" + updateDate + ", createByProgid:" + createByProgid + ", updateByProgid:" + updateByProgid + ", dataId:" + dataId + ", userDeptCode:" + userDeptCode + ", docTime:"
				+ docTime + ", mobileUploadDate:" + mobileUploadDate + ", mobileDownloadDate:" + mobileDownloadDate + ", docTitlename:" + docTitlename + ", statusLongreceipt:" + statusLongreceipt
				+ ", sellDate:" + sellDate + ", buildId:" + buildId + ", buildName:" + buildName + ", buildFloor:" + buildFloor + ", buildNo:" + buildNo + ", buildNoName:" + buildNoName
				+ ", buildMaxFloor:" + buildMaxFloor + ", buildOther:" + buildOther + ", buildArea:" + buildArea + ", locPriceGen:" + locPriceGen + ", sendwritAdminRecvDate:" + sendwritAdminRecvDate
				+ ", sendwritAdminCancelDate:" + sendwritAdminCancelDate + ", concernCode:" + concernCode + ", requestCancelRemark:" + requestCancelRemark + ", requestCancelDate:" + requestCancelDate
				+ ", cancelRemark:" + cancelRemark + ", withdrawStatus:" + withdrawStatus + ", withdrawStatusDate:" + withdrawStatusDate + "}";
	}
	

	
}
