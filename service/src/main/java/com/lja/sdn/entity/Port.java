package com.lja.sdn.entity;

import lombok.Data;

@Data
public class Port {
    //端口号
    private Integer port;
    //受攻击次数
    private Integer times;
}
