package com.entity.view;

import com.entity.XiaoyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校医
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("xiaoyi")
public class XiaoyiView  extends XiaoyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyiView(){
	}
 
 	public XiaoyiView(XiaoyiEntity xiaoyiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
