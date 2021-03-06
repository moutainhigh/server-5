package com.need.oscar.constant;

/**
 * <p></p>
 * @author Rylan 2015年7月22日 下午7:13:12
 * @ClassName Constants
 * @Description TODO
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: Rylan 2015年7月22日
 * @modify by reason:{方法名}:{原因}
 */
public class Constants {
	
	/** 
	* @Fields APP_USER_INFO : TODO app用户request中的userInfo信息
	*/ 
	public static final String WEB_REQUEST_USER_INFO="userInfoResult";
	
	
	/** 
	* @Fields APP_USER_INFO : TODO app端每页的数量默认是10个
	*/ 
	public static final Integer WEB_EVERY_PAGE_SIZE=10;
	/** 
	* @Fields APP_USER_INFO : TODO token实现时间
	*/ 
	public static final Integer TOKEN_EXPIRE=14;
	
	/** 
	* @Fields APP_USER_INFO : TODO cookie中用户token的key值
	*/ 
	public static final String COOKIET_BOPS_USER_TOKEN_KEY="token";
	/** 
	* @Fields APP_USER_INFO : TODO cookie中用户token的key值
	*/ 
	//public static final String QINIU_DOMAIN="7xkdkd.com2.z0.glb.qiniucdn.com/";
	
	
	
	/** 
	 * @Fields GOODS_UPLOAD_PATH : TODO 行家分类图片的存放路径
	 */ 
	public static final String KOL_CATEGORY_UPLOAD_PATH="/need/test_deploy/upload_images/kolCategory/";
	
	/**
	 * 把商品的价格从元与分之间转换
	 */
	public static final Integer PRICE_TO_FEN_OR_YUAN = 100;
	
	/**
	 * @Fields ADMIN_PROPERTIES : TODO 配置文件
	 */
	public static final String CONSTANTS_PROPERTIES = "/properties/constants.properties";
	
	 /**html后缀*/
    public static final String HTML_SUFFIX = ".html";
   
	/**
	 * @Fields TEMPLATE_PATH : 模板存放路径
	 */
    public static final String TEMPLATE_PATH = "template";
	
}
