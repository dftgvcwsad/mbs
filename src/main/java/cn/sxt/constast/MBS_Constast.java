package cn.sxt.constast;

public interface MBS_Constast {
	//登录用户类型‘Y’表示是管理员，‘N’表示飞管理员。默认为N
	public static final String OPERATOR_TYPE_SUPER="O";
	public static final String OPERATOR_TYPE_ADMIN="Y";
	public static final String OPERATOR_TYPE_NORMAR="N";
	//菜单数据是否可用
	public static final String MOBILE_AVAILABLE_YES="1";
	public static final String MOBILE_AVAILABLE_NO="0";
	//公用的类型（代替大部分属性常量）
	public static final Integer TYPE_PUBLIC_ZERO=0;
	public static final Integer TYPE_PUBLIC_ONE=1;
	public static final Integer TYPE_PUBLIC_TOW=2;
	
	//默认密码
	public static final String OPERATOR_PWD_DEFAULT="123456";
	
	//权限类型
	public static final String PERMISSION_TYPE_MENU="menu";
	public static final String PERMISSION_TYPE_PERMISSION="permission";

}
