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
 * 健康上报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("jiankangshangbao")
public class JiankangshangbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangshangbaoEntity() {
		
	}
	
	public JiankangshangbaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 角色
	 */
					
	private String jiaose;
	
	/**
	 * 健康码
	 */
					
	private String jiankangma;
	
	/**
	 * 行程码
	 */
					
	private String xingchengma;
	
	/**
	 * 核酸报告
	 */
					
	private String hesuanbaogao;
	
	/**
	 * 体温
	 */
					
	private String tiwen;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 上报时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangbaoshijian;
	
	/**
	 * 经度
	 */
					
	private Float longitude;
	
	/**
	 * 纬度
	 */
					
	private Float latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：角色
	 */
	public void setJiaose(String jiaose) {
		this.jiaose = jiaose;
	}
	/**
	 * 获取：角色
	 */
	public String getJiaose() {
		return jiaose;
	}
	/**
	 * 设置：健康码
	 */
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
	/**
	 * 设置：行程码
	 */
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
	/**
	 * 设置：核酸报告
	 */
	public void setHesuanbaogao(String hesuanbaogao) {
		this.hesuanbaogao = hesuanbaogao;
	}
	/**
	 * 获取：核酸报告
	 */
	public String getHesuanbaogao() {
		return hesuanbaogao;
	}
	/**
	 * 设置：体温
	 */
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：上报时间
	 */
	public void setShangbaoshijian(Date shangbaoshijian) {
		this.shangbaoshijian = shangbaoshijian;
	}
	/**
	 * 获取：上报时间
	 */
	public Date getShangbaoshijian() {
		return shangbaoshijian;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}

}
