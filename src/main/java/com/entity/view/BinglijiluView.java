package com.entity.view;

import com.entity.BinglijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病例记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@TableName("binglijilu")
public class BinglijiluView  extends BinglijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BinglijiluView(){
	}
 
 	public BinglijiluView(BinglijiluEntity binglijiluEntity){
 	try {
			BeanUtils.copyProperties(this, binglijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
