package cn.sxt.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@TableName("tmobile")
public class Mobile extends Model<Mobile> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mobile_number", type = IdType.AUTO)
    private String mobileNumber;
    private String mobileType;
    private String cardNumber;
    private String isAvailable;


    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    protected Serializable pkVal() {
        return this.mobileNumber;
    }

    @Override
    public String toString() {
        return "Mobile{" +
        "mobileNumber=" + mobileNumber +
        ", mobileType=" + mobileType +
        ", cardNumber=" + cardNumber +
        ", isAvailable=" + isAvailable +
        "}";
    }
}
