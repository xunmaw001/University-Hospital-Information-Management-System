package com.entity.vo;

import com.entity.YaopindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 药品订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class YaopindingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 药品数量
	 */
	
	private Integer yaopinshuliang;
		
	/**
	 * 药品售价
	 */
	
	private Float yaopinshoujia;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
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
	 * 购买时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumaishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：药品数量
	 */
	 
	public void setYaopinshuliang(Integer yaopinshuliang) {
		this.yaopinshuliang = yaopinshuliang;
	}
	
	/**
	 * 获取：药品数量
	 */
	public Integer getYaopinshuliang() {
		return yaopinshuliang;
	}
				
	
	/**
	 * 设置：药品售价
	 */
	 
	public void setYaopinshoujia(Float yaopinshoujia) {
		this.yaopinshoujia = yaopinshoujia;
	}
	
	/**
	 * 获取：药品售价
	 */
	public Float getYaopinshoujia() {
		return yaopinshoujia;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
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
	 * 设置：购买时间
	 */
	 
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
