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
 * 返校申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("fanxiaoshenqing")
public class FanxiaoshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FanxiaoshenqingEntity() {
		
	}
	
	public FanxiaoshenqingEntity(T t) {
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
	 * 角色
	 */
					
	private String jiaose;
	
	/**
	 * 学院
	 */
					
	private String xueyuan;
	
	/**
	 * 入校时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruxiaoshijian;
	
	/**
	 * 体温
	 */
					
	private String tiwen;
	
	/**
	 * 粤康码
	 */
					
	private String yuekangma;
	
	/**
	 * 行程码
	 */
					
	private String xingchengma;
	
	/**
	 * 核酸码
	 */
					
	private String hesuanma;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：学院
	 */
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
	/**
	 * 设置：入校时间
	 */
	public void setRuxiaoshijian(Date ruxiaoshijian) {
		this.ruxiaoshijian = ruxiaoshijian;
	}
	/**
	 * 获取：入校时间
	 */
	public Date getRuxiaoshijian() {
		return ruxiaoshijian;
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
	 * 设置：粤康码
	 */
	public void setYuekangma(String yuekangma) {
		this.yuekangma = yuekangma;
	}
	/**
	 * 获取：粤康码
	 */
	public String getYuekangma() {
		return yuekangma;
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
	 * 设置：核酸码
	 */
	public void setHesuanma(String hesuanma) {
		this.hesuanma = hesuanma;
	}
	/**
	 * 获取：核酸码
	 */
	public String getHesuanma() {
		return hesuanma;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
