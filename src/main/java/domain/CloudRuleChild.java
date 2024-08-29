package domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则配置子表
 * @TableName cloud_rule_child
 */
@Data
public class CloudRuleChild implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 主表ID
     */
    private Long parentId;

    /**
     * 名称
     */
    private String ruleName;

    /**
     * 本地表名
     */
    private String localTableName;

    /**
     * 氚云表名
     */
    private String chuanCloudTableName;

    /**
     * 0-关闭，1-每日0点更新
     */
    private String allUpdateRule;

    /**
     * 0-关闭，1-每5分钟，2-每15分钟，3-每半小时，4-每1小时
     */
    private String sectionUpdateRule;

    /**
     * 数据更新时间
     */
    private String dataUpdateTime;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer updateBy;

    /**
     * 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 主表ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 主表ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 本地表名
     */
    public String getLocalTableName() {
        return localTableName;
    }

    /**
     * 本地表名
     */
    public void setLocalTableName(String localTableName) {
        this.localTableName = localTableName;
    }

    /**
     * 氚云表名
     */
    public String getChuanCloudTableName() {
        return chuanCloudTableName;
    }

    /**
     * 氚云表名
     */
    public void setChuanCloudTableName(String chuanCloudTableName) {
        this.chuanCloudTableName = chuanCloudTableName;
    }

    /**
     * 0-关闭，1-每日0点更新
     */
    public String getAllUpdateRule() {
        return allUpdateRule;
    }

    /**
     * 0-关闭，1-每日0点更新
     */
    public void setAllUpdateRule(String allUpdateRule) {
        this.allUpdateRule = allUpdateRule;
    }

    /**
     * 0-关闭，1-每5分钟，2-每15分钟，3-每半小时，4-每1小时
     */
    public String getSectionUpdateRule() {
        return sectionUpdateRule;
    }

    /**
     * 0-关闭，1-每5分钟，2-每15分钟，3-每半小时，4-每1小时
     */
    public void setSectionUpdateRule(String sectionUpdateRule) {
        this.sectionUpdateRule = sectionUpdateRule;
    }


    /**
     * 创建人
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        CloudRuleChild other = (CloudRuleChild) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getRuleName() == null ? other.getRuleName() == null : this.getRuleName().equals(other.getRuleName()))
            && (this.getLocalTableName() == null ? other.getLocalTableName() == null : this.getLocalTableName().equals(other.getLocalTableName()))
            && (this.getChuanCloudTableName() == null ? other.getChuanCloudTableName() == null : this.getChuanCloudTableName().equals(other.getChuanCloudTableName()))
            && (this.getAllUpdateRule() == null ? other.getAllUpdateRule() == null : this.getAllUpdateRule().equals(other.getAllUpdateRule()))
            && (this.getSectionUpdateRule() == null ? other.getSectionUpdateRule() == null : this.getSectionUpdateRule().equals(other.getSectionUpdateRule()))
            && (this.getDataUpdateTime() == null ? other.getDataUpdateTime() == null : this.getDataUpdateTime().equals(other.getDataUpdateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        result = prime * result + ((getLocalTableName() == null) ? 0 : getLocalTableName().hashCode());
        result = prime * result + ((getChuanCloudTableName() == null) ? 0 : getChuanCloudTableName().hashCode());
        result = prime * result + ((getAllUpdateRule() == null) ? 0 : getAllUpdateRule().hashCode());
        result = prime * result + ((getSectionUpdateRule() == null) ? 0 : getSectionUpdateRule().hashCode());
        result = prime * result + ((getDataUpdateTime() == null) ? 0 : getDataUpdateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", ruleName=").append(ruleName);
        sb.append(", localTableName=").append(localTableName);
        sb.append(", chuanCloudTableName=").append(chuanCloudTableName);
        sb.append(", allUpdateRule=").append(allUpdateRule);
        sb.append(", sectionUpdateRule=").append(sectionUpdateRule);
        sb.append(", dataUpdateTime=").append(dataUpdateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}