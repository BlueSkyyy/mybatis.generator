package xbed.com.cn.dao.entity.business;

import java.util.Date;

public class CheckinInfo {
    private Integer checkinInfoId;

    private Integer checkin;

    private Integer checkinId;

    private Date checkinTime;

    private Date checkoutTime;

    private Date createdAt;

    private String openPwd;

    private String orderNo;

    private String otaNo;

    private String otaStayId;

    private Integer overstay;

    private String remark;

    private Integer stat;

    private Integer isCheckined;

    private Date updatedAt;

    private String payBatch;

    private Integer payStat;

    private Integer payNotify;

    private Integer orderSource;

    private String orderSourceName;

    private Integer settlementId;

    private String payNo;

    private Integer refundId;

    private String refundNo;

    private Integer isChange;

    private String payInfos;

    private Integer isPackage;

    private Integer roomTypeId;

    private Date endTime;


    public CheckinInfo() {
        super();
    }
    public CheckinInfo(Integer checkinId, Date checkinTime, Date checkoutTime, String orderNo, Date date, Integer orderSource, String orderSourceName, String payNos) {
        super();
        this.checkinId = checkinId;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.orderNo = orderNo;
        this.stat = 1;
        this.checkin = 1;
        this.overstay = 1;
        this.payStat = 1;
        this.createdAt = date;
        this.updatedAt = date;
        this.orderSource = orderSource;
        this.orderSourceName = orderSourceName;
        this.isChange = 0;
        this.payInfos = payNos;
        this.isPackage = 0;
    }
    public CheckinInfo(Integer checkinId, Date checkinTime, Date checkoutTime, String orderNo, Date date, Integer orderSource, String orderSourceName, Integer settlementId, String otaNo, String payNos, Integer isPackage, Integer roomTypeId) {
        super();
        this.checkinId = checkinId;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.orderNo = orderNo;
        this.stat = 1;
        this.checkin = 1;
        this.overstay = 1;
        this.payStat = 1;
        this.orderSource = orderSource;
        this.orderSourceName = orderSourceName;
        this.createdAt = date;
        this.updatedAt = date;
        this.settlementId = settlementId;
        this.otaNo = otaNo;
        this.isChange = 0;
        this.payInfos = payNos;
        this.isPackage = isPackage;
        this.roomTypeId = roomTypeId;
    }

    public Integer getCheckinInfoId() {
        return checkinInfoId;
    }

    public void setCheckinInfoId(Integer checkinInfoId) {
        this.checkinInfoId = checkinInfoId;
    }

    public Integer getCheckin() {
        return checkin;
    }

    public void setCheckin(Integer checkin) {
        this.checkin = checkin;
    }

    public Integer getCheckinId() {
        return checkinId;
    }

    public void setCheckinId(Integer checkinId) {
        this.checkinId = checkinId;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getOpenPwd() {
        return openPwd;
    }

    public void setOpenPwd(String openPwd) {
        this.openPwd = openPwd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOtaNo() {
        return otaNo;
    }

    public void setOtaNo(String otaNo) {
        this.otaNo = otaNo;
    }

    public String getOtaStayId() {
        return otaStayId;
    }

    public void setOtaStayId(String otaStayId) {
        this.otaStayId = otaStayId;
    }

    public Integer getOverstay() {
        return overstay;
    }

    public void setOverstay(Integer overstay) {
        this.overstay = overstay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Integer getIsCheckined() {
        return isCheckined;
    }

    public void setIsCheckined(Integer isCheckined) {
        this.isCheckined = isCheckined;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPayBatch() {
        return payBatch;
    }

    public void setPayBatch(String payBatch) {
        this.payBatch = payBatch;
    }

    public Integer getPayStat() {
        return payStat;
    }

    public void setPayStat(Integer payStat) {
        this.payStat = payStat;
    }

    public Integer getPayNotify() {
        return payNotify;
    }

    public void setPayNotify(Integer payNotify) {
        this.payNotify = payNotify;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderSourceName() {
        return orderSourceName;
    }

    public void setOrderSourceName(String orderSourceName) {
        this.orderSourceName = orderSourceName;
    }

    public Integer getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public String getPayInfos() {
        return payInfos;
    }

    public void setPayInfos(String payInfos) {
        this.payInfos = payInfos;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}