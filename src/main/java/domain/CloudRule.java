package domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则配置表
 * @TableName cloud_rule
 */
@Data
public class CloudRule implements Serializable {
    /**
     * 
     */
    private Long id;

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
     * */
    private String dataUpdateTime;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Long updateBy;

    /**
     * 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;


}