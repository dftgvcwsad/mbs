package cn.sxt.vo;

import cn.sxt.domain.Operator;

public class OperatorVo extends Operator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer page;//第几页
	private Integer limit;//每页几条数据
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	
}
