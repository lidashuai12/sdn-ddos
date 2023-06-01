package com.lja.sdn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("tb_forward")
@ApiModel(value="Forward对象", description="")
public class Forward implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "switchid", type = IdType.AUTO)
    private String switchid;

    private String name;

    private Integer priority;

    private Integer inport;

    private Integer outport;


}
