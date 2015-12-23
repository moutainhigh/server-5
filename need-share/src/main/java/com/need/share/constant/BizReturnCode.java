package com.need.share.constant;

public final class BizReturnCode {

	/**
	 * 系统常量------------------------------------------------------------------
	 */
	public final static int SUCCESS = 200;
	/**
	 * 系统异常
	 */
	public final static int SYSTEM_ERR = 1;
	/**
	 * 操作失败
	 */
	public final static int SYSTEM_OPERATE_ERR = 2;
	/**
	 * 权限不够
	 */
	public final static int SYSTEM_AUTH_ERR = 3;
	/**
	 * userToken不能为空
	 */
	public final static int SYSTEM_USER_TOKEN_NOT_EXIST = 4;
	/**
	 * 用户鉴权失败
	 */
	public final static int SYSTEM_USER_AUTH_ERR = 5;
	/**
	 * 版本信息不能为空
	 */
	public final static int SYSTEM_VERSION_NULL_ERR = 6;
	/**
	 * 发送验证码失败
	 */
	public final static int SYSTEM_SEND_VALIDATE_CODE_ERR = 7;
	/**
	 * 请求头像Token失败
	 */
	public final static int SYSTEN_REQUEST_TOKEN_ERR = 8;
	/**
	 * deviceId异常!
	 */
	public final static int SYSTEN_DEVICE_ID_ERR = 9;
	/**
	 * 该设备未注册
	 */
	public final static int SYSTEN_DEVICE_NOT_REGISTER = 10;
	/**
	 * userToken过期
	 */
	public final static int SYSTEM_USER_TOKEN_OLD = 11;
	
	/**
	 * 设备注册失败
	 */
	public final static int SYSTEM_DEVICE_FAIL = 12;

	/**
	 * 交易常量-------------------------------------------------------------------
	 */
	/**
	 * 加入购物车数量至少为1
	 */
	public final static int TRADE_CART_COUNT_LESS_ONE = 7001;
	/**
	 * 该订单号无对应记录
	 */
	public final static int TRADE_NOT_EXIST = 7002;
	/**
	 * 创建订单失败，没有此商品
	 */
	public final static int TRADE_GOODS_NOT_EXIST = 7003;
	/**
	 * 当前状态不为待收货，无法修改状态
	 */
	public final static int TRADE_STATUS_NOT_WAIT_RECEIVE = 7004;

	/**
	 * 购物编号不能为空
	 */
	public final static int TRADE_CODE_EXIST = 7005;
	/**
	 * 地区ID只能为数字
	 */
	public final static int TRADE_ADDRESS_NOT_NUM = 7006;
	/**
	 * 地区不能为空
	 */
	public final static int TRADE_LOGISTIC_EXIST = 7007;
	/**
	 * 手机号不能为空
	 */
	public final static int TRADE_MOBILE_EXIST = 7008;
	/**
	 * 收货人不能为空
	 */
	public final static int TRADE_RECEIVE_USER = 7009;
	/**
	 * 旧默认地址ID不能为空
	 */
	public final static int TRADE_OLD_ADDRESS = 7010;
	/**
	 * 新默认地址不能为空
	 */
	public final static int TRADE_NEW_ADDRESS = 7011;
	/**
	 * 加入购物车失败
	 */
	public final static int TRADE_CART_ADD_ERR = 7012;
	/**
	 * 当前状态不为待付款，无法付款或修改状态
	 */
	public final static int TRADE_STATUS_NOT_WAIT_PAY = 7013;

	/**
	 * 添加地址失败
	 */
	public final static int ADD_ADDRESS_FAIL = 7014;

	/**
	 * 地址不存在
	 */
	public final static int ADDRESS_NOT_EXIST= 7015;
	/**
	 * 流水表插入失败
	 */
	public static final int TRADE_PAY_ADD_ERR = 7016;
	/**
	 * 您已评价过了~
	 */
	public final static int TRADE_JUDGEMENT_ERROR=7017;

	/**
	 * 社交 need 模块
	 * BizCode------------------------------------------------------------------
	 * -
	 */
	/**
	 * 此用户未关注次此家
	 */
	public final static int NEED_USER_NO_FOCUSE_KOL = 5002;
	/**
	 * feedId 空
	 */
	public final static int NEED_FEEDID_NOT_EXIST = 5007;
	/**
	 * userId 空
	 */
	public final static int NEED_USERID_NOT_EXIST = 5008;

	/**
	 * content 空
	 */
	public final static int NEED_FEED_CONTENT_NOT_EXIST = 5009;

	/**
	 * kolId 空
	 */
	public final static int NEED_KOLID_NOT_EXIST = 5010;

	/**
	 * feed内容不能为空
	 */
	public final static int NEED_FEED_MEMO_NOT_EXIST = 5011;
	
	/**
	 * feed内容的长度限制
	 */
	public final static int NEED_FEED_MEMO_LENGTH = 5013;
	
	/**
	 * feed内容的评论长度限制
	 */
	public final static int NEED_FEED_MEMO_COMMENT_LENGTH = 5014;
	
	/**
	 * 该用户已关注过此行家
	 */
	public final static int NEED_USER_FOCUSED_KOL_ERROR = 5015;
	
	
	/**
	 * 商品编号不能空
	 */
	public final static int NEED_GOODS_ID_NOT_EXIST = 5012;

	/**
	 * 该行家或商品不存在
	 */
	public final static int NEED_GOODS_KOL_OR_GOODS_NOT_EXIST = 5004;

	/**
	 * 该用户未need该商品
	 */
	public final static int NEED_GOODS_USER_NONEED_GOODS = 5001;

	/**
	 * 该用户已关注过此行家
	 */
	public final static int NEED_USER_FOCUSED_KOL = 5003;

	/**
	 * 该用户已need过该商品
	 */
	public final static int NEED_USER_NEEDED_GOODS = 5005;

	/**
	 * topicId 空
	 */
	public final static int NEED_TOPIC_ID_NOT_EXIST = 5006;

	/**
	 * 用户常量--------------------------------------------------------------
	 */
	/**
	 * 用户昵称已存在
	 */
	public final static int NICKNAME_ALREADY_EXISTS = 2001;
	/**
	 * 用户手机号已存在
	 */
	public final static int MOBILE_ALREADY_EXISTS = 2002;
	/**
	 * 用户名或者密码错误
	 */
	public final static int USERNAME_OR_PASSWORD_ERR = 2003;
	/**
	 * 用户昵称不可为空
	 */
	public final static int NICKNAME_NOT_EXIST = 2004;
	/**
	 * 该用户不存在
	 */
	public final static int USER_NOT_EXIST = 2005;
	/**
	 * 原密码错误
	 */
	public final static int ORIGINAL_PASSWORD_ERROR = 2006;
	/**
	 * 手机号不存在
	 */
	public final static int MOBILE_NOT_EXIST = 2008;
	/**
	 * 验证码失效
	 */
	public final static int CODE_FAILURE = 2009;
	/**
	 * 验证码错误
	 */
	public final static int CODE_ERROR = 2010;
	/**
	 * 获取用户信息失败
	 */
	public final static int GET_USERINFO_FAIL = 2011;
	/**
	 * 手机号码不能为空
	 */
	public final static int MOBILE_NOT_NOT_EXIST = 2013;
	/**
	 * 请输入有效的手机号
	 */
	public final static int PLEASE_ENTER_VALID_MOBILE = 2014;
	/**
	 * 用户ID不能为空
	 */
	public final static int USERID_NOT_EXIST = 2015;

	/**
	 * 昵称长度需要在4-16个字符之间
	 */
	public final static int NICKNAME_LENGTH_TIPS = 2016;
	/**
	 * 原密码不能为空
	 */
	public final static int ORIGINAL_PASSWORD_NOT_EXIST = 2017;
	/**
	 * 密码长度需要在6-16个字符之间
	 */
	public final static int PASSWORD_LENGTH_TIPS = 2018;
	/**
	 * 新密码不能为空
	 */
	public final static int NEW_PASSWORD_NOT_EXIST = 2019;
	/**
	 * 密码不能为空
	 */
	public final static int PASSWORD_NOT_EXIST = 2020;
	/**
	 * 用户注册失败
	 */
	public final static int USER_REGISTRATION_FAILED = 2021;
	/**
	 * 请上传头像
	 */
	public final static int UPLOAD_PROFILE_PIC_KEY = 2022;
	/**
	 * 该手机号未注册
	 */
	public final static int MOBILE_IS_NOT_REGISTERED = 2100;

	/**
	 * 用户密码不正确
	 */
	public final static int LOGIN_PASSWORD_ERROR = 2101;

	/**
	 * begin
	 * -------------------------------------------------------------------------
	 * ---------------- 商品相关异常
	 */
	/**
	 * 商品编号不能为空
	 */
	public final static int GOODS_NOT_EXIST = 3001;

	/**
	 * 场景ID不能为空
	 */
	public final static int SCENE_NOT_EXIST = 3002;

	/**
	 * 无此商品
	 */
	public final static int NOT_FIND_GOODS = 3003;

	/**
	 * 无此商品场景
	 */
	public final static int NOT_SCENE_ID = 3004;
	
	/**
	 * 库存不足
	 */
	public final static int GOODS_STORE_NOT_ENOUGH=3005;

	/**
	 * end
	 * -------------------------------------------------------------------------
	 * ---------------- 商品相关异常
	 */
    
    
	/**
	 * begin
	 * -------------------------------------------------------------------------
	 * ---------------- 优惠券相关异常
	 */
	/**
	 * 优惠券不存在
	 */
	public final static int COUPONNO_NOT_EXIST = 6001;
    
	/**
	 * 未达到优惠券最低消费额度
	 */
	public final static int COUPON_COST_NOTENOUGH = 6002;
    
	/**
	 * 优惠券已冻结
	 */
	public final static int COUPON_FROZE = 6003;
    
	/**
	 * 优惠券已使用
	 */
	public final static int COUPON_USED = 6004;
    
	/**
	 * 不是您的优惠券
	 */
	public final static int COUPON_NOT_OWN = 6005;
    
	/**
	 * 优惠券已过期
	 */
	public final static int COUPON_EXPIRED = 6006;
    
	/**
	 * 优惠券未开始
	 */
	public final static int COUPON_NOT_BEGIN = 6007;
    
	/**
	 * 优惠券已失效
	 */
	public final static int COUPON_INVALID = 6008;
    
	/**
	 * 优惠券今日领取已达到限额
	 */
	public final static int COUPON_DAILY_OUT = 6009;
    
	/**
	 * 优惠券已领完
	 */
	public final static int COUPON_OUT = 6010;
    
	/**
	 * 优惠券模板id不能为空
	 */
	public final static int COUPON_TEMPLATE_ID_NOT_EXIST = 6011;
    
	/**
	 * 优惠券消费金额不能为空
	 */
	public final static int COUPON_COST_NOT_EXIST = 6012;
    
	/**
	 * 优惠券领取已总数达到限额
	 */
	public final static int COUPON_REVEICE_OUT = 6013;
    
	/**
	 * 无法领取自己分享的优惠券
	 */
	public final static int COUPON_REVEICE_SELF = 6014;
    
	/**
	 * 只有新人才能领取该优惠券
	 */
	public final static int COUPON_FOR_NEW = 6015;
    
	/**
	 * 分享用户不存在，无法领取优惠券
	 */
	public final static int COUPON_SHARE_USER_NOT_EXIST = 6016;

	/**
	 * 优惠券模板已生效不允许修改
	 */
	public final static int COUPON_VALID_UPDATE = 6017;

	/**
	 * 优惠券模板状态不正确
	 */
	public final static int COUPON_STATUS_ERROR = 6018;

	/**
	 * 优惠券模板金额不正确
	 */
	public final static int COUPON_VALUE_ERROR = 6019;

	/**
	 * 优惠券模板时间不正确
	 */
	public final static int COUPON_TIME_ERROR = 6020;

	/**
	 * 优惠券模板编号不能重复
	 */
	public final static int COUPON_NO_DUPLICATE = 6021;
    
	/**
	 * end
	 * -------------------------------------------------------------------------
	 * ---------------- 优惠券相关异常
	 */
	
	/**
	 *改组合不存在
	 */
	public final static int GOODS_GROUP_NO_EXIST = 9001;
}
