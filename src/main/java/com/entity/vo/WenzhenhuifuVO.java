package com.entity.vo;

import com.entity.WenzhenhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 问诊回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class WenzhenhuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 校医姓名
	 */
	
	private String xiaoyixingming;
		
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
	 * 回复时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huifushijian;
		
	/**
	 * 回复内容
	 */
	
	private String huifuneirong;
				
	
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
	 * 设置：回复时间
	 */
	 
	public void setHuifushijian(Date huifushijian) {
		this.huifushijian = huifushijian;
	}
	
	/**
	 * 获取：回复时间
	 */
	public Date getHuifushijian() {
		return huifushijian;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setHuifuneirong(String huifuneirong) {
		this.huifuneirong = huifuneirong;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getHuifuneirong() {
		return huifuneirong;
	}
			
}
