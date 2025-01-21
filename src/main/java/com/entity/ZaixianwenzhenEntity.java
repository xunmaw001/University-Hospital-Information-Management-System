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
 * 在线问诊
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("zaixianwenzhen")
public class ZaixianwenzhenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZaixianwenzhenEntity() {
		
	}
	
	public ZaixianwenzhenEntity(T t) {
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
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 角色
	 */
					
	private String jiaose;
	
	/**
	 * 问诊时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date wenzhenshijian;
	
	/**
	 * 回复状态
	 */
					
	private String huifuzhuangtai;
	
	/**
	 * 相关病历
	 */
					
	private String xiangguanbingli;
	
	/**
	 * 症状描述
	 */
					
	private String zhengzhuangmiaoshu;
	
	
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
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：问诊时间
	 */
	public void setWenzhenshijian(Date wenzhenshijian) {
		this.wenzhenshijian = wenzhenshijian;
	}
	/**
	 * 获取：问诊时间
	 */
	public Date getWenzhenshijian() {
		return wenzhenshijian;
	}
	/**
	 * 设置：回复状态
	 */
	public void setHuifuzhuangtai(String huifuzhuangtai) {
		this.huifuzhuangtai = huifuzhuangtai;
	}
	/**
	 * 获取：回复状态
	 */
	public String getHuifuzhuangtai() {
		return huifuzhuangtai;
	}
	/**
	 * 设置：相关病历
	 */
	public void setXiangguanbingli(String xiangguanbingli) {
		this.xiangguanbingli = xiangguanbingli;
	}
	/**
	 * 获取：相关病历
	 */
	public String getXiangguanbingli() {
		return xiangguanbingli;
	}
	/**
	 * 设置：症状描述
	 */
	public void setZhengzhuangmiaoshu(String zhengzhuangmiaoshu) {
		this.zhengzhuangmiaoshu = zhengzhuangmiaoshu;
	}
	/**
	 * 获取：症状描述
	 */
	public String getZhengzhuangmiaoshu() {
		return zhengzhuangmiaoshu;
	}

}
