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
@TableName("toperator")
public class Operator extends Model<Operator> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "operator_id", type = IdType.AUTO)
    private String operatorId;
    private String operatorName;
    private String operatorPwd;
    private String isAdmin;


    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorPwd() {
        return operatorPwd;
    }

    public void setOperatorPwd(String operatorPwd) {
        this.operatorPwd = operatorPwd;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    protected Serializable pkVal() {
        return this.operatorId;
    }

    @Override
    public String toString() {
        return "Operator{" +
        "operatorId=" + operatorId +
        ", operatorName=" + operatorName +
        ", operatorPwd=" + operatorPwd +
        ", isAdmin=" + isAdmin +
        "}";
    }
}
