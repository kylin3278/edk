package com.edk.springboot.boot.demo.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class ChRecmdUserCategory implements Serializable {
    private Integer id;

    /**
     * 服务商ID
     */
    private Integer userId;

    /**
     * 1级类目
     */
    private Integer category1id;

    /**
     * 2级类目
     */
    private Integer category2id;

    /**
     * 3级类目
     */
    private Integer category3id;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategory1id() {
        return category1id;
    }

    public void setCategory1id(Integer category1id) {
        this.category1id = category1id;
    }

    public Integer getCategory2id() {
        return category2id;
    }

    public void setCategory2id(Integer category2id) {
        this.category2id = category2id;
    }

    public Integer getCategory3id() {
        return category3id;
    }

    public void setCategory3id(Integer category3id) {
        this.category3id = category3id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", category1id=").append(category1id);
        sb.append(", category2id=").append(category2id);
        sb.append(", category3id=").append(category3id);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}