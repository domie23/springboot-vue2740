package com.entity.model;

import com.entity.JingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 景点
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingdianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 景点名称
     */
    private String jingdianName;


    /**
     * 景点照片
     */
    private String jingdianPhoto;


    /**
     * 景点类型
     */
    private Integer jingdianTypes;


    /**
     * 景点地址
     */
    private String jingdianAddress;


    /**
     * 门票价格
     */
    private Double menpiaoMoney;


    /**
     * 点击次数
     */
    private Integer jingdianClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer jingdianDelete;


    /**
     * 景点介绍
     */
    private String jingdianContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 设置：景点名称
	 */
    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 获取：景点照片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 设置：景点照片
	 */
    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 获取：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 设置：景点类型
	 */
    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 获取：景点地址
	 */
    public String getJingdianAddress() {
        return jingdianAddress;
    }


    /**
	 * 设置：景点地址
	 */
    public void setJingdianAddress(String jingdianAddress) {
        this.jingdianAddress = jingdianAddress;
    }
    /**
	 * 获取：门票价格
	 */
    public Double getMenpiaoMoney() {
        return menpiaoMoney;
    }


    /**
	 * 设置：门票价格
	 */
    public void setMenpiaoMoney(Double menpiaoMoney) {
        this.menpiaoMoney = menpiaoMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getJingdianClicknum() {
        return jingdianClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setJingdianClicknum(Integer jingdianClicknum) {
        this.jingdianClicknum = jingdianClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJingdianDelete() {
        return jingdianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setJingdianDelete(Integer jingdianDelete) {
        this.jingdianDelete = jingdianDelete;
    }
    /**
	 * 获取：景点介绍
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 设置：景点介绍
	 */
    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
