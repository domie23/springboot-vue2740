package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 景点
 *
 * @author 
 * @email
 */
@TableName("jingdian")
public class JingdianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianEntity() {

	}

	public JingdianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 景点名称
     */
    @TableField(value = "jingdian_name")

    private String jingdianName;


    /**
     * 景点照片
     */
    @TableField(value = "jingdian_photo")

    private String jingdianPhoto;


    /**
     * 景点类型
     */
    @TableField(value = "jingdian_types")

    private Integer jingdianTypes;


    /**
     * 景点地址
     */
    @TableField(value = "jingdian_address")

    private String jingdianAddress;


    /**
     * 门票价格
     */
    @TableField(value = "menpiao_money")

    private Double menpiaoMoney;


    /**
     * 点击次数
     */
    @TableField(value = "jingdian_clicknum")

    private Integer jingdianClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "jingdian_delete")

    private Integer jingdianDelete;


    /**
     * 景点介绍
     */
    @TableField(value = "jingdian_content")

    private String jingdianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名称
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点照片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点照片
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点地址
	 */
    public String getJingdianAddress() {
        return jingdianAddress;
    }


    /**
	 * 获取：景点地址
	 */

    public void setJingdianAddress(String jingdianAddress) {
        this.jingdianAddress = jingdianAddress;
    }
    /**
	 * 设置：门票价格
	 */
    public Double getMenpiaoMoney() {
        return menpiaoMoney;
    }


    /**
	 * 获取：门票价格
	 */

    public void setMenpiaoMoney(Double menpiaoMoney) {
        this.menpiaoMoney = menpiaoMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getJingdianClicknum() {
        return jingdianClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setJingdianClicknum(Integer jingdianClicknum) {
        this.jingdianClicknum = jingdianClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJingdianDelete() {
        return jingdianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJingdianDelete(Integer jingdianDelete) {
        this.jingdianDelete = jingdianDelete;
    }
    /**
	 * 设置：景点介绍
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：景点介绍
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jingdian{" +
            "id=" + id +
            ", jingdianName=" + jingdianName +
            ", jingdianPhoto=" + jingdianPhoto +
            ", jingdianTypes=" + jingdianTypes +
            ", jingdianAddress=" + jingdianAddress +
            ", menpiaoMoney=" + menpiaoMoney +
            ", jingdianClicknum=" + jingdianClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", jingdianDelete=" + jingdianDelete +
            ", jingdianContent=" + jingdianContent +
            ", createTime=" + createTime +
        "}";
    }
}
