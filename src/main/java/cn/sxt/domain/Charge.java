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
@TableName("tcharge")
public class Charge extends Model<Charge> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "charge_code", type = IdType.AUTO)
    private String chargeCode;
    private String chargeName;
    private Double chargePrice;


    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public Double getChargePrice() {
        return chargePrice;
    }

    public void setChargePrice(Double chargePrice) {
        this.chargePrice = chargePrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.chargeCode;
    }

    @Override
    public String toString() {
        return "Charge{" +
        "chargeCode=" + chargeCode +
        ", chargeName=" + chargeName +
        ", chargePrice=" + chargePrice +
        "}";
    }
}
