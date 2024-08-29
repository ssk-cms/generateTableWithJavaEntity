package domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * 本地字段和氚云字段对照关系表
 * @TableName cloud_local_contrast
 */
@Data
@Table(value = "cloud_local_contrast", comment = "本地字段和氚云字段对照关系表")
public class CloudLocalContrast implements Serializable {
    /**
     * 字段对应关系表主键id
     */
//    @TableId(typepe = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    private Long id;

    /**
     * 规则ID
     */
    @Column
    @ColumnComment("规则ID")
    private Long ruleId;

    /**
     * 氚云表名
     * */
    @Column
    @ColumnComment("氚云表名")
    private String chuanCloudTableName;

    /**
     * 氚云子表表名
     * */
    @Column
    @ColumnComment("氚云子表表名")
    private String chuanCloudChildCloudName;

    /**
     * 本地字段名称
     */
    @Column
    @ColumnComment("本地字段名称")
    private String localFields;

    /**
     * 本地字段类型
     * */
    @Column
    @ColumnComment("本地字段类型")
    private String localFieldType;

    /**
     * 氚云字段名称
     */
    @Column
    @ColumnComment("氚云字段名称")
    private String cloudFields;

    /**
     * 字段类型
     * */
    @Column
    @ColumnComment("字段类型")
    private String fieldType;

    /**
     * 字段备注
     * */
    @Column
    @ColumnComment("字段备注")
    private String remark;


    /**
     * 字段对应类型，1-主表对应，2-字表对应
     * */
    @Column
    @ColumnComment("字段对应类型，1-主表对应，2-字表对应")
    private int type;


    private static final long serialVersionUID = 1L;

    /**
     * 字段对应关系表主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 字段对应关系表主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 规则ID
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 规则ID
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 本地字段名称
     */
    public String getLocalFields() {
        return localFields;
    }

    /**
     * 本地字段名称
     */
    public void setLocalFields(String localFields) {
        this.localFields = localFields;
    }

    /**
     * 氚云字段名称
     */
    public String getCloudFields() {
        return cloudFields;
    }

    /**
     * 氚云字段名称
     */
    public void setCloudFields(String cloudFields) {
        this.cloudFields = cloudFields;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CloudLocalContrast other = (CloudLocalContrast) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getLocalFields() == null ? other.getLocalFields() == null : this.getLocalFields().equals(other.getLocalFields()))
            && (this.getCloudFields() == null ? other.getCloudFields() == null : this.getCloudFields().equals(other.getCloudFields()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        result = prime * result + ((getLocalFields() == null) ? 0 : getLocalFields().hashCode());
        result = prime * result + ((getCloudFields() == null) ? 0 : getCloudFields().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", localFields=").append(localFields);
        sb.append(", cloudFields=").append(cloudFields);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}