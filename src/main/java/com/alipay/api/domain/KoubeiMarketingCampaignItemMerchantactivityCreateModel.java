package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户创建商品代金券
 *
 * @author auto create
 * @since 1.0, 2019-05-07 10:06:16
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6449586497846948334L;

	/**
	 * 活动优惠次数限制
活动优惠总次数限制不能小于1,且不能为不限制
活动优惠总次数限制不能大于99999999
	 */
	@ApiField("count_limit")
	private Long countLimit;

	/**
	 * 活动优惠单日次数限制
0表示不限制
活动优惠单日次数限制不能为负数
活动优惠单日次数限制不能大于99999999
	 */
	@ApiField("count_limit_per_day")
	private Long countLimitPerDay;

	/**
	 * 活动单用户限次
0表示不限制
活动单用户总限次不能为负数
活动单用户总限次不能大于999
	 */
	@ApiField("count_limit_per_user")
	private Long countLimitPerUser;

	/**
	 * 活动单用户单日限次
0表示不限制
活动单用户单日限次不能为负数
活动单用户单日限次不能大于999
	 */
	@ApiField("count_limit_per_user_per_day")
	private Long countLimitPerUserPerDay;

	/**
	 * 人群规则：
DEFAULT： 全部用户
ONLINE_NEWCOMER：在线购买新人
MEMBER：会员
	 */
	@ApiField("crowd")
	private String crowd;

	/**
	 * 代金券面额
代金券面额 单位为元
代金券面额格式必须为#.##
代金券面额需小于49999
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 外部回调地址
外部回调地址最大字符数不能超过500
	 */
	@ApiField("external_callback_url")
	private String externalCallbackUrl;

	/**
	 * 外部Id
最大长度不能超过64
最小长度不能低于13
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

	/**
	 * 活动结束时间
格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 活动开始时间
格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品列表
参加活动的商品列表不能为空
参加活动的商品列表最大个数不能超过100
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 备注
备注最大字符数不能超过500
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 使用门槛，满X元可用，使用门槛必须大于券面额
使用门槛单位为元
使用门槛格式必须为#.##
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 是否手动领取，本期只支持true
	 */
	@ApiField("obtain_manually")
	private Boolean obtainManually;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private MerchantActivityVoucherInfo voucherInfo;

	public Long getCountLimit() {
		return this.countLimit;
	}
	public void setCountLimit(Long countLimit) {
		this.countLimit = countLimit;
	}

	public Long getCountLimitPerDay() {
		return this.countLimitPerDay;
	}
	public void setCountLimitPerDay(Long countLimitPerDay) {
		this.countLimitPerDay = countLimitPerDay;
	}

	public Long getCountLimitPerUser() {
		return this.countLimitPerUser;
	}
	public void setCountLimitPerUser(Long countLimitPerUser) {
		this.countLimitPerUser = countLimitPerUser;
	}

	public Long getCountLimitPerUserPerDay() {
		return this.countLimitPerUserPerDay;
	}
	public void setCountLimitPerUserPerDay(Long countLimitPerUserPerDay) {
		this.countLimitPerUserPerDay = countLimitPerUserPerDay;
	}

	public String getCrowd() {
		return this.crowd;
	}
	public void setCrowd(String crowd) {
		this.crowd = crowd;
	}

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getExternalCallbackUrl() {
		return this.externalCallbackUrl;
	}
	public void setExternalCallbackUrl(String externalCallbackUrl) {
		this.externalCallbackUrl = externalCallbackUrl;
	}

	public String getExternalUniqueId() {
		return this.externalUniqueId;
	}
	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public Boolean getObtainManually() {
		return this.obtainManually;
	}
	public void setObtainManually(Boolean obtainManually) {
		this.obtainManually = obtainManually;
	}

	public MerchantActivityVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
