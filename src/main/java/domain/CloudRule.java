package domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则配置表
 * @TableName cloud_rule
 */
@Data
@Table(value = "cloud_rule", comment = "规则配置表")
public class CloudRule implements Serializable {
    /**
     * 
     */
    @IsKey
    @IsAutoIncrement
    private Long id;

    /**
     * 名称
     */
    @Column
    @ColumnComment("名称")
    private String ruleName;

    /**
     * 本地表名
     */
    @Column
    @ColumnComment("本地表名")
    private String localTableName;

    /**
     * 氚云表名
     */
    @Column
    @ColumnComment("氚云表名")
    private String chuanCloudTableName;

    /**
     * 0-关闭，1-每日0点更新
     */
    @Column
    @ColumnComment("0-关闭，1-每日0点更新")
    private String allUpdateRule;

    /**
     * 0-关闭，1-每5分钟，2-每15分钟，3-每半小时，4-每1小时
     */
    @Column
    @ColumnComment("0-关闭，1-每5分钟，2-每15分钟，3-每半小时，4-每1小时")
    private String sectionUpdateRule;

    /**
     * 数据更新时间
     * */
    @Column
    @ColumnComment("数据更新时间")
    private String dataUpdateTime;

    /**
     * 创建人
     */
    @Column
    @ColumnComment("创建人")
    private Long createBy;

    /**
     * 
     */
    @Column(name = "create_time", type = MySqlTypeConstant.DATETIME, comment = "创建时间")
    private Date createTime;

    /**
     * 
     */
    @Column
    @ColumnComment("更新人")
    private Long updateBy;

    /**
     * 
     */
    @Column(name = "update_time", type = MySqlTypeConstant.DATETIME, comment = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;


}