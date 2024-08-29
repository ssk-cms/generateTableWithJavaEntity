package domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户管理
 * </p>
 *
 * @author tr
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
@TableName("dri_mp_alliance_business_user")
@Table(value = "dri_mp_alliance_business_user", comment = "用户管理")
public class MpUserManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer NOT_DELETED = 0;

    @TableId(value = "id", type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    private Long id;


    /**
     * 用户姓名
     */
    @Column
    @ColumnComment("用户姓名")
    private String userName;

    /**
     * 用户手机号
     */
    @Column
    @ColumnComment("用户姓名")
    private String userPhone;

    /**
     * 创建时间
     */
    @Column(name = "create_time", type = MySqlTypeConstant.DATETIME, comment = "创建时间")
    private LocalDateTime createTime;


    /**
     * 创建人姓名
     */
    @Column
    @ColumnComment("用户姓名")
    private  String creator;

    /**
     * 修改时间
     */
    @Column(name = "update_time", type = MySqlTypeConstant.DATETIME, comment = "更新时间")
    private LocalDateTime updateTime;

    /**
     * 主公司/主加盟商id
     */
    @Column
    @ColumnComment("用户姓名")
    private Long allianceBusinessId;

    /**
     * 帐号类型
     */
    @Column
    @ColumnComment("帐号类型")
    private String type;

    /**
     * 删除状态 1是0否
     */
    @Column
    @ColumnComment("删除状态 1是0否")
    private Integer deleted;



}
