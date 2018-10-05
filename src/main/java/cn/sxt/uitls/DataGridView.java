package cn.sxt.uitls;

import java.util.List;

import cn.sxt.constast.MBS_Constast;

/**
 * 适应easyui的表格需要的json对象
 * @author Administrator
 *
 */
public class DataGridView {
	
	private  Long code=Long.valueOf(MBS_Constast.TYPE_PUBLIC_ZERO);
	
	private  String msg="";
	
	private Long count;
	
	private List<?> data;

	public Long getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public DataGridView() {
		super();
	}

	public DataGridView(Long count, List<?> data) {
		super();
		this.count = count;
		this.data = data;
	}

	

}
