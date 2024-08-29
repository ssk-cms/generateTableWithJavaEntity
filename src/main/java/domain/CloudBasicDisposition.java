package domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.io.Serializable;
import java.util.Date;


/**
 * 基础配置表
 * @TableName cloud_basic_disposition
 */
@Table(value = "cloud_basic_disposition", comment = "基础配置表")
public class CloudBasicDisposition implements Serializable {
    /**
     * 
     */
    @IsKey
    @IsAutoIncrement
    private Long id;

    /**
     * engineCode
     */
    @Column
    @ColumnComment("engineCode")
    private String engineCode;

    /**
     * 
     */
    @Column
    @ColumnComment("engineSecret")
    private String engineSecret;

    /**
     * mysql地址
     */
    @Column
    @ColumnComment("mysql地址")
    private String mysqlAddress;

    /**
     * mysql端口号
     */
    @Column
    @ColumnComment("mysql端口号")
    private String mysqlPort;

    /**
     * mysql数据库名称
     */
    @Column
    @ColumnComment("mysql数据库名称")
    private String databaseName;

    /**
     * mysql用户名
     */
    @Column
    @ColumnComment("mysql用户名")
    private String mysqlUser;

    /**
     * mysql密码
     */
    @Column
    @ColumnComment("mysql密码")
    private String mysqlPassword;

    /**
     * 创建人
     */
    @Column
    @ColumnComment("创建人")
    private Integer createBy;

    /**
     * 
     */
    @Column(name = "create_time", type = MySqlTypeConstant.TIMESTAMP, comment = "创建时间")
    private Date createTime;

    /**
     * 
     */
    @Column
    @ColumnComment("更新人")
    private Integer updateBy;

    /**
     * 
     */
    @Column(name = "update_time", type = MySqlTypeConstant.TIMESTAMP, comment = "更新时间")
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
     * engineCode
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * engineCode
     */
    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    /**
     * 
     */
    public String getEngineSecret() {
        return engineSecret;
    }

    /**
     * 
     */
    public void setEngineSecret(String engineSecret) {
        this.engineSecret = engineSecret;
    }

    /**
     * mysql地址
     */
    public String getMysqlAddress() {
        return mysqlAddress;
    }

    /**
     * mysql地址
     */
    public void setMysqlAddress(String mysqlAddress) {
        this.mysqlAddress = mysqlAddress;
    }

    /**
     * mysql端口号
     */
    public String getMysqlPort() {
        return mysqlPort;
    }

    /**
     * mysql端口号
     */
    public void setMysqlPort(String mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    /**
     * mysql数据库名称
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * mysql数据库名称
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * mysql用户名
     */
    public String getMysqlUser() {
        return mysqlUser;
    }

    /**
     * mysql用户名
     */
    public void setMysqlUser(String mysqlUser) {
        this.mysqlUser = mysqlUser;
    }

    /**
     * mysql密码
     */
    public String getMysqlPassword() {
        return mysqlPassword;
    }

    /**
     * mysql密码
     */
    public void setMysqlPassword(String mysqlPassword) {
        this.mysqlPassword = mysqlPassword;
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
        CloudBasicDisposition other = (CloudBasicDisposition) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEngineCode() == null ? other.getEngineCode() == null : this.getEngineCode().equals(other.getEngineCode()))
            && (this.getEngineSecret() == null ? other.getEngineSecret() == null : this.getEngineSecret().equals(other.getEngineSecret()))
            && (this.getMysqlAddress() == null ? other.getMysqlAddress() == null : this.getMysqlAddress().equals(other.getMysqlAddress()))
            && (this.getMysqlPort() == null ? other.getMysqlPort() == null : this.getMysqlPort().equals(other.getMysqlPort()))
            && (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getMysqlUser() == null ? other.getMysqlUser() == null : this.getMysqlUser().equals(other.getMysqlUser()))
            && (this.getMysqlPassword() == null ? other.getMysqlPassword() == null : this.getMysqlPassword().equals(other.getMysqlPassword()))
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
        result = prime * result + ((getEngineCode() == null) ? 0 : getEngineCode().hashCode());
        result = prime * result + ((getEngineSecret() == null) ? 0 : getEngineSecret().hashCode());
        result = prime * result + ((getMysqlAddress() == null) ? 0 : getMysqlAddress().hashCode());
        result = prime * result + ((getMysqlPort() == null) ? 0 : getMysqlPort().hashCode());
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getMysqlUser() == null) ? 0 : getMysqlUser().hashCode());
        result = prime * result + ((getMysqlPassword() == null) ? 0 : getMysqlPassword().hashCode());
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
        sb.append(", engineCode=").append(engineCode);
        sb.append(", engineSecret=").append(engineSecret);
        sb.append(", mysqlAddress=").append(mysqlAddress);
        sb.append(", mysqlPort=").append(mysqlPort);
        sb.append(", databaseName=").append(databaseName);
        sb.append(", mysqlUser=").append(mysqlUser);
        sb.append(", mysqlPassword=").append(mysqlPassword);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}