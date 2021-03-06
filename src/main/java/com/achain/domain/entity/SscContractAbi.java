package com.achain.domain.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString(callSuper=true)
public class SscContractAbi implements Serializable {
    /**唯一id*/
    protected Integer id;

    /**合约id*/
    protected String contractId;

    /**接口名称*/
    protected String abiName;

    /***/
    protected Date createTime;

    /***/
    protected Date updateTime;

    private static final long serialVersionUID = 1L;
}