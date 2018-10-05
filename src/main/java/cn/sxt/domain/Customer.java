package cn.sxt.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@TableName("tcustomer")
public class Customer extends Model<Customer> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "customer_id", type = IdType.AUTO)
	private Integer customerId;
	private String documentType;
	private String documentNumber;
	private String customerName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GX+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date customerBirthday;
	private String customerSex;
	private String customerAddress;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCustomerBirthday() {
		return customerBirthday;
	}

	public void setCustomerBirthday(Date customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public String getCustomerSex() {
		return customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	protected Serializable pkVal() {
		return this.customerId;
	}

	@Override
	public String toString() {
		return "Customer{" + "customerId=" + customerId + ", documentType=" + documentType + ", documentNumber="
				+ documentNumber + ", customerName=" + customerName + ", customerBirthday=" + customerBirthday
				+ ", customerSex=" + customerSex + ", customerAddress=" + customerAddress + "}";
	}
}
