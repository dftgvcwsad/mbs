package cn.sxt.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@TableName("taccount")
public class Account extends Model<Account> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "account_id", type = IdType.AUTO)
    private Integer accountId;
    private String contactPerson;
    private String contactAddress;
    private Double contactBalance;


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Double getContactBalance() {
        return contactBalance;
    }

    public void setContactBalance(Double contactBalance) {
        this.contactBalance = contactBalance;
    }

    @Override
    protected Serializable pkVal() {
        return this.accountId;
    }

    @Override
    public String toString() {
        return "Account{" +
        "accountId=" + accountId +
        ", contactPerson=" + contactPerson +
        ", contactAddress=" + contactAddress +
        ", contactBalance=" + contactBalance +
        "}";
    }
}
