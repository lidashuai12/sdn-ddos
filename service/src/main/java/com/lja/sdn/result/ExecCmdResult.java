package com.lja.sdn.result;

import lombok.Data;

@Data
public class ExecCmdResult {

    //命令执行是否成功
    private boolean flag ;
    //输出结果
    private String result;

    public void setFlag(boolean success){
        this.flag = success;
    }

    public boolean getFlag() {
        return flag;
    }

    public String getResult(){
        return result;
    }
    public void setResult(String result){
        this.result = result;
    }

}


