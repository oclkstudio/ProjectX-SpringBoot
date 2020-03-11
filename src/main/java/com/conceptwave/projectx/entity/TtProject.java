package com.conceptwave.projectx.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TT_PROJECTT")
public class TtProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CWDOCID")
    private String  cwDocId;

    @Column(name = "DEVCAMPMAILCOUNT")
    private String devCampMailCount;

    @Column(name = "FINISHPERIOD")
    private Date finishPeriod;

    @Column(name = "HAS_ADDED_STATUS")
    private Integer hasAddedStatus;

    @Column(name = "HEAD_OF_SALES")
    private String headOfSales;

    @Column(name = "HEAD_OF_SALES_EMAIL")
    private String headOfSalesMail;

    @Column(name = "HEAD_OF_TECHNICAL_SALES")
    private String headOfTechnicalSales;

    @Column(name = "HEAD_OF_TECHNICAL_SALES_EMAIL")
    private String headOfTechnicalSalesMail;

    @Column(name = "IPVPN_SUBSCRITION_ID")
    private String ipVpnSubscriptionId;

    @Column(name = "IPVPN_VPN_ID")
    private String ipVpnId;

    @Column(name = "IS_SIGNAL_SENT")
    private Integer isSignalSent;

    @Column(name = "IS_TRESHOLD_REACHED")
    private Integer isTresholdReached;

    @Column(name = "MANUALLY_BILLED_AP_COUNT")
    private Integer manuallyBilledApCount;

    @Column(name = "NUMBER_OF_AP")
    private Integer numberOfAp;

    @Column(name = "NUMBER_OF_AP_AT_RFB")
    private Integer numberOfApAtRfb;

    @Column(name = "NUMBER_OF_SUBMITTED_AP")
    private Integer numberOfSubmittedAp;

    @Column(name = "PORTALREQUESTNUMBER")
    private Integer portalRequestNumber;

    @Column(name = "PROJECT_CODE")
    private String projectCode;

    @Column(name = "PROJECT_FIRST_RELATION_DATE")
    private Date projectFirstRelationDate;

    @Column(name = "PROJECT_MANAGER")
    private String projectManager;

    @Column(name = "PROJECT_MANAGER_EMAIL")
    private String projectManagerEmail;

    @Column(name = "PROJECT_MANAGER_ID")
    private String projectManagerId;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "PROJECT_STATUS")
    private Integer projectStatus;

    @Column(name = "RELATEDWITHDECCAMP")
    private String relatedWithDecCamp;

    @Column(name = "SALES_MANAGER")
    private String salesManager;

    @Column(name = "SALES_MANAGER_EMAIL")
    private String salesManagerEmail;

    @Column(name = "SERVICE_TYPE")
    private String serviceType;

    @Column(name = "TECHNICAL_SALES_MANAGER")
    private String technicalSalesManager;

    @Column(name = "TECHNICAL_SALES_MANAGER_EMAIL")
    private String technicalSalesManagerEmail;

    @Column(name = "TRESHOLD_PERCENTAGE")
    private String tresholdPercentage;

    @Column(name = "TURNKEY_CODE")
    private String turnKeyCode;

    @Column(name = "TURNKEY_DATE_STATUS")
    private Integer turnKeyDateStatus;

    @Column(name = "TURNKEY_DELIVERY_DATE")
    private Date turnKeyDeliveryDate;

    @Column(name = "TURNKEY_STATUS")
    private Integer turnKeyStatus;

    public TtProject() {}

    public TtProject(String devCampMailCount, Date finishPeriod, Integer hasAddedStatus, String headOfSales, String headOfSalesMail, String headOfTechnicalSales, String headOfTechnicalSalesMail, String ipVpnSubscriptionId, String ipVpnId, Integer isSignalSent, Integer isTresholdReached, Integer manuallyBilledApCount, Integer numberOfAp, Integer numberOfApAtRfb, Integer numberOfSubmittedAp, Integer portalRequestNumber, String projectCode, Date projectFirstRelationDate, String projectManager, String projectManagerEmail, String projectManagerId, String projectName, Integer projectStatus, String relatedWithDecCamp, String salesManager, String salesManagerEmail, String serviceType, String technicalSalesManager, String technicalSalesManagerEmail, String tresholdPercentage, String turnKeyCode, Integer turnKeyDateStatus, Date turnKeyDeliveryDate, Integer turnKeyStatus) {
        this.devCampMailCount = devCampMailCount;
        this.finishPeriod = finishPeriod;
        this.hasAddedStatus = hasAddedStatus;
        this.headOfSales = headOfSales;
        this.headOfSalesMail = headOfSalesMail;
        this.headOfTechnicalSales = headOfTechnicalSales;
        this.headOfTechnicalSalesMail = headOfTechnicalSalesMail;
        this.ipVpnSubscriptionId = ipVpnSubscriptionId;
        this.ipVpnId = ipVpnId;
        this.isSignalSent = isSignalSent;
        this.isTresholdReached = isTresholdReached;
        this.manuallyBilledApCount = manuallyBilledApCount;
        this.numberOfAp = numberOfAp;
        this.numberOfApAtRfb = numberOfApAtRfb;
        this.numberOfSubmittedAp = numberOfSubmittedAp;
        this.portalRequestNumber = portalRequestNumber;
        this.projectCode = projectCode;
        this.projectFirstRelationDate = projectFirstRelationDate;
        this.projectManager = projectManager;
        this.projectManagerEmail = projectManagerEmail;
        this.projectManagerId = projectManagerId;
        this.projectName = projectName;
        this.projectStatus = projectStatus;
        this.relatedWithDecCamp = relatedWithDecCamp;
        this.salesManager = salesManager;
        this.salesManagerEmail = salesManagerEmail;
        this.serviceType = serviceType;
        this.technicalSalesManager = technicalSalesManager;
        this.technicalSalesManagerEmail = technicalSalesManagerEmail;
        this.tresholdPercentage = tresholdPercentage;
        this.turnKeyCode = turnKeyCode;
        this.turnKeyDateStatus = turnKeyDateStatus;
        this.turnKeyDeliveryDate = turnKeyDeliveryDate;
        this.turnKeyStatus = turnKeyStatus;
    }

    public String getCwDocId() {
        return cwDocId;
    }

    public void setCwDocId(String cwDocId) {
        this.cwDocId = cwDocId;
    }

    public String getDevCampMailCount() {
        return devCampMailCount;
    }

    public void setDevCampMailCount(String devCampMailCount) {
        this.devCampMailCount = devCampMailCount;
    }

    public Date getFinishPeriod() {
        return finishPeriod;
    }

    public void setFinishPeriod(Date finishPeriod) {
        this.finishPeriod = finishPeriod;
    }

    public Integer getHasAddedStatus() {
        return hasAddedStatus;
    }

    public void setHasAddedStatus(Integer hasAddedStatus) {
        this.hasAddedStatus = hasAddedStatus;
    }

    public String getHeadOfSales() {
        return headOfSales;
    }

    public void setHeadOfSales(String headOfSales) {
        this.headOfSales = headOfSales;
    }

    public String getHeadOfSalesMail() {
        return headOfSalesMail;
    }

    public void setHeadOfSalesMail(String headOfSalesMail) {
        this.headOfSalesMail = headOfSalesMail;
    }

    public String getHeadOfTechnicalSales() {
        return headOfTechnicalSales;
    }

    public void setHeadOfTechnicalSales(String headOfTechnicalSales) {
        this.headOfTechnicalSales = headOfTechnicalSales;
    }

    public String getHeadOfTechnicalSalesMail() {
        return headOfTechnicalSalesMail;
    }

    public void setHeadOfTechnicalSalesMail(String headOfTechnicalSalesMail) {
        this.headOfTechnicalSalesMail = headOfTechnicalSalesMail;
    }

    public String getIpVpnSubscriptionId() {
        return ipVpnSubscriptionId;
    }

    public void setIpVpnSubscriptionId(String ipVpnSubscriptionId) {
        this.ipVpnSubscriptionId = ipVpnSubscriptionId;
    }

    public String getIpVpnId() {
        return ipVpnId;
    }

    public void setIpVpnId(String ipVpnId) {
        this.ipVpnId = ipVpnId;
    }

    public Integer getIsSignalSent() {
        return isSignalSent;
    }

    public void setIsSignalSent(Integer isSignalSent) {
        this.isSignalSent = isSignalSent;
    }

    public Integer getIsTresholdReached() {
        return isTresholdReached;
    }

    public void setIsTresholdReached(Integer isTresholdReached) {
        this.isTresholdReached = isTresholdReached;
    }

    public Integer getManuallyBilledApCount() {
        return manuallyBilledApCount;
    }

    public void setManuallyBilledApCount(Integer manuallyBilledApCount) {
        this.manuallyBilledApCount = manuallyBilledApCount;
    }

    public Integer getNumberOfAp() {
        return numberOfAp;
    }

    public void setNumberOfAp(Integer numberOfAp) {
        this.numberOfAp = numberOfAp;
    }

    public Integer getNumberOfApAtRfb() {
        return numberOfApAtRfb;
    }

    public void setNumberOfApAtRfb(Integer numberOfApAtRfb) {
        this.numberOfApAtRfb = numberOfApAtRfb;
    }

    public Integer getNumberOfSubmittedAp() {
        return numberOfSubmittedAp;
    }

    public void setNumberOfSubmittedAp(Integer numberOfSubmittedAp) {
        this.numberOfSubmittedAp = numberOfSubmittedAp;
    }

    public Integer getPortalRequestNumber() {
        return portalRequestNumber;
    }

    public void setPortalRequestNumber(Integer portalRequestNumber) {
        this.portalRequestNumber = portalRequestNumber;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Date getProjectFirstRelationDate() {
        return projectFirstRelationDate;
    }

    public void setProjectFirstRelationDate(Date projectFirstRelationDate) {
        this.projectFirstRelationDate = projectFirstRelationDate;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectManagerEmail() {
        return projectManagerEmail;
    }

    public void setProjectManagerEmail(String projectManagerEmail) {
        this.projectManagerEmail = projectManagerEmail;
    }

    public String getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(String projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getRelatedWithDecCamp() {
        return relatedWithDecCamp;
    }

    public void setRelatedWithDecCamp(String relatedWithDecCamp) {
        this.relatedWithDecCamp = relatedWithDecCamp;
    }

    public String getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(String salesManager) {
        this.salesManager = salesManager;
    }

    public String getSalesManagerEmail() {
        return salesManagerEmail;
    }

    public void setSalesManagerEmail(String salesManagerEmail) {
        this.salesManagerEmail = salesManagerEmail;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getTechnicalSalesManager() {
        return technicalSalesManager;
    }

    public void setTechnicalSalesManager(String technicalSalesManager) {
        this.technicalSalesManager = technicalSalesManager;
    }

    public String getTechnicalSalesManagerEmail() {
        return technicalSalesManagerEmail;
    }

    public void setTechnicalSalesManagerEmail(String technicalSalesManagerEmail) {
        this.technicalSalesManagerEmail = technicalSalesManagerEmail;
    }

    public String getTresholdPercentage() {
        return tresholdPercentage;
    }

    public void setTresholdPercentage(String tresholdPercentage) {
        this.tresholdPercentage = tresholdPercentage;
    }

    public String getTurnKeyCode() {
        return turnKeyCode;
    }

    public void setTurnKeyCode(String turnKeyCode) {
        this.turnKeyCode = turnKeyCode;
    }

    public Integer getTurnKeyDateStatus() {
        return turnKeyDateStatus;
    }

    public void setTurnKeyDateStatus(Integer turnKeyDateStatus) {
        this.turnKeyDateStatus = turnKeyDateStatus;
    }

    public Date getTurnKeyDeliveryDate() {
        return turnKeyDeliveryDate;
    }

    public void setTurnKeyDeliveryDate(Date turnKeyDeliveryDate) {
        this.turnKeyDeliveryDate = turnKeyDeliveryDate;
    }

    public Integer getTurnKeyStatus() {
        return turnKeyStatus;
    }

    public void setTurnKeyStatus(Integer turnKeyStatus) {
        this.turnKeyStatus = turnKeyStatus;
    }

    @Override
    public String toString() {
        return "TtProject{" +
                "cwDocId='" + cwDocId + '\'' +
                ", devCampMailCount='" + devCampMailCount + '\'' +
                ", finishPeriod=" + finishPeriod +
                ", hasAddedStatus=" + hasAddedStatus +
                ", headOfSales='" + headOfSales + '\'' +
                ", headOfSalesMail='" + headOfSalesMail + '\'' +
                ", headOfTechnicalSales='" + headOfTechnicalSales + '\'' +
                ", headOfTechnicalSalesMail='" + headOfTechnicalSalesMail + '\'' +
                ", ipVpnSubscriptionId='" + ipVpnSubscriptionId + '\'' +
                ", ipVpnId='" + ipVpnId + '\'' +
                ", isSignalSent=" + isSignalSent +
                ", isTresholdReached=" + isTresholdReached +
                ", manuallyBilledApCount=" + manuallyBilledApCount +
                ", numberOfAp=" + numberOfAp +
                ", numberOfApAtRfb=" + numberOfApAtRfb +
                ", numberOfSubmittedAp=" + numberOfSubmittedAp +
                ", portalRequestNumber=" + portalRequestNumber +
                ", projectCode='" + projectCode + '\'' +
                ", projectFirstRelationDate=" + projectFirstRelationDate +
                ", projectManager='" + projectManager + '\'' +
                ", projectManagerEmail='" + projectManagerEmail + '\'' +
                ", projectManagerId='" + projectManagerId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectStatus=" + projectStatus +
                ", relatedWithDecCamp='" + relatedWithDecCamp + '\'' +
                ", salesManager='" + salesManager + '\'' +
                ", salesManagerEmail='" + salesManagerEmail + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", technicalSalesManager='" + technicalSalesManager + '\'' +
                ", technicalSalesManagerEmail='" + technicalSalesManagerEmail + '\'' +
                ", tresholdPercentage='" + tresholdPercentage + '\'' +
                ", turnKeyCode='" + turnKeyCode + '\'' +
                ", turnKeyDateStatus=" + turnKeyDateStatus +
                ", turnKeyDeliveryDate=" + turnKeyDeliveryDate +
                ", turnKeyStatus=" + turnKeyStatus +
                '}';
    }
}
