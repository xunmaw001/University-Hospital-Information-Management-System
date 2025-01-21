package com.entity.model;

import com.entity.ZaixianwenzhenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 在线问诊
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public class ZaixianwenzhenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
