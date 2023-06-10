package com.lja.sdn.entity;

import lombok.Data;

@Data
public class HostDTO {

    private String ip;

    private String mac;

    private String linkSwitch;

    private Integer linkPort;

    private String stat = "在线";
}
