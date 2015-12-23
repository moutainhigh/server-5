package com.need.common.domain.enums;

import com.need.utils.StringUtil;
/**
 * 
 * <p></p>
 * @author LXD 2015年8月12日 下午8:03:28
 * @ClassName NeedStatusEnum
 * @Description TODO 用户关注行家的状态
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: LXD 2015年8月12日
 * @modify by reason:{方法名}:{原因}
 */
public enum UserNeedStatus {
	NEED("NEED", "need过的状态"), CANCEL("CANCEL", "取消need的状态");
	public String code;
	public String desc;

	private UserNeedStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static String getCode(String userStatus) {
		String result = "";
		if(StringUtil.isBlank(userStatus)){
			return result;
		}
		switch (userStatus) {
		case "NEED":
			result = NEED.code;
			break;
		case "CANCEL":
			result = CANCEL.code;
		default:
			break;
		}
		return result;
	}

}
