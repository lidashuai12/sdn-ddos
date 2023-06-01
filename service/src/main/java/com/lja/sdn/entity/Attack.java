package com.lja.sdn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_attack")
@ApiModel(value="Attack对象", description="")
public class Attack implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("switchId")
    private String switchId;

    @TableField("inPort")
    private Integer inPort;

    @TableField("srcMac")
    private String srcMac;

    @TableField("dstMac")
    private String dstMac;

    @TableField("srcIp")
    private String srcIp;

    @TableField("dstIp")
    private String dstIp;

    @TableField("attackTime")
    private String attackTime;

    @TableField(exist = false)
    private Integer num;

}
