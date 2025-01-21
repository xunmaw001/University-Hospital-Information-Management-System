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
 * 校医
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("xiaoyi")
public class XiaoyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyiEntity() {
		
	}
	
	public XiaoyiEntity(T t) {
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
	 * 校医工号
	 */
					
	private String xiaoyigonghao;
	
	/**
	 * 校医姓名
	 */
					
	private String xiaoyixingming;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 职称
	 */
					
	private String zhicheng;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 医龄
	 */
					
	private String yiling;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 坐诊时间
	 */
					
	private String zuozhenshijian;
	
	/**
	 * 校医简介
	 */
					
	private String xiaoyijianjie;
	
	/**
	 * 排班表
	 */
					
	private String paibanbiao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
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
	 * 设置：校医工号
	 */
	public void setXiaoyigonghao(String xiaoyigonghao) {
		this.xiaoyigonghao = xiaoyigonghao;
	}
	/**
	 * 获取：校医工号
	 */
	public String getXiaoyigonghao() {
		return xiaoyigonghao;
	}
	/**
	 * 设置：校医姓名
	 */
	public void setXiaoyixingming(String xiaoyixingming) {
		this.xiaoyixingming = xiaoyixingming;
	}
	/**
	 * 获取：校医姓名
	 */
	public String getXiaoyixingming() {
		return xiaoyixingming;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：职称
	 */
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
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
	 * 设置：医龄
	 */
	public void setYiling(String yiling) {
		this.yiling = yiling;
	}
	/**
	 * 获取：医龄
	 */
	public String getYiling() {
		return yiling;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：坐诊时间
	 */
	public void setZuozhenshijian(String zuozhenshijian) {
		this.zuozhenshijian = zuozhenshijian;
	}
	/**
	 * 获取：坐诊时间
	 */
	public String getZuozhenshijian() {
		return zuozhenshijian;
	}
	/**
	 * 设置：校医简介
	 */
	public void setXiaoyijianjie(String xiaoyijianjie) {
		this.xiaoyijianjie = xiaoyijianjie;
	}
	/**
	 * 获取：校医简介
	 */
	public String getXiaoyijianjie() {
		return xiaoyijianjie;
	}
	/**
	 * 设置：排班表
	 */
	public void setPaibanbiao(String paibanbiao) {
		this.paibanbiao = paibanbiao;
	}
	/**
	 * 获取：排班表
	 */
	public String getPaibanbiao() {
		return paibanbiao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
