package com.entity.vo;

import com.entity.YaofangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 药方登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class YaofangdengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 校医工号
	 */
	
	private String xiaoyigonghao;
		
	/**
	 * 校医姓名
	 */
	
	private String xiaoyixingming;
		
	/**
	 * 费用
	 */
	
	private Float feiyong;
		
	/**
	 * 开药时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaiyaoshijian;
		
	/**
	 * 疾病类型
	 */
	
	private String jibingleixing;
		
	/**
	 * 疾病名称
	 */
	
	private String jibingmingcheng;
		
	/**
	 * 药方
	 */
	
	private String yaofang;
		
	/**
	 * 用法
	 */
	
	private String yongfa;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：费用
	 */
	 
	public void setFeiyong(Float feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Float getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：开药时间
	 */
	 
	public void setKaiyaoshijian(Date kaiyaoshijian) {
		this.kaiyaoshijian = kaiyaoshijian;
	}
	
	/**
	 * 获取：开药时间
	 */
	public Date getKaiyaoshijian() {
		return kaiyaoshijian;
	}
				
	
	/**
	 * 设置：疾病类型
	 */
	 
	public void setJibingleixing(String jibingleixing) {
		this.jibingleixing = jibingleixing;
	}
	
	/**
	 * 获取：疾病类型
	 */
	public String getJibingleixing() {
		return jibingleixing;
	}
				
	
	/**
	 * 设置：疾病名称
	 */
	 
	public void setJibingmingcheng(String jibingmingcheng) {
		this.jibingmingcheng = jibingmingcheng;
	}
	
	/**
	 * 获取：疾病名称
	 */
	public String getJibingmingcheng() {
		return jibingmingcheng;
	}
				
	
	/**
	 * 设置：药方
	 */
	 
	public void setYaofang(String yaofang) {
		this.yaofang = yaofang;
	}
	
	/**
	 * 获取：药方
	 */
	public String getYaofang() {
		return yaofang;
	}
				
	
	/**
	 * 设置：用法
	 */
	 
	public void setYongfa(String yongfa) {
		this.yongfa = yongfa;
	}
	
	/**
	 * 获取：用法
	 */
	public String getYongfa() {
		return yongfa;
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
