package com.entity.model;

import com.entity.FanxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 返校申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class FanxiaoshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
