package com.lja.sdn.entity;

import lombok.Data;

@Data
public class SwitchDTO {

    private String mac;

    private Integer port;

    private String ipv6;
}
