package com.entity.model;

import com.entity.LixiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 离校申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class LixiaoshenqingModel  implements Serializable {
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
	 * 离校时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lixiaoshijian;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 粤康码
	 */
	
	private String yuekangma;
		
	/**
	 * 离校理由
	 */
	
	private String lixiaoliyou;
		
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
	 * 设置：离校时间
	 */
	 
	public void setLixiaoshijian(Date lixiaoshijian) {
		this.lixiaoshijian = lixiaoshijian;
	}
	
	/**
	 * 获取：离校时间
	 */
	public Date getLixiaoshijian() {
		return lixiaoshijian;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
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
	 * 设置：离校理由
	 */
	 
	public void setLixiaoliyou(String lixiaoliyou) {
		this.lixiaoliyou = lixiaoliyou;
	}
	
	/**
	 * 获取：离校理由
	 */
	public String getLixiaoliyou() {
		return lixiaoliyou;
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
