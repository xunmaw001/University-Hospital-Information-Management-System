package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianshangguahaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianshangguahaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianshangguahaoView;


/**
 * 线上挂号
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface XianshangguahaoService extends IService<XianshangguahaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianshangguahaoVO> selectListVO(Wrapper<XianshangguahaoEntity> wrapper);
   	
   	XianshangguahaoVO selectVO(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
   	
   	List<XianshangguahaoView> selectListView(Wrapper<XianshangguahaoEntity> wrapper);
   	
   	XianshangguahaoView selectView(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianshangguahaoEntity> wrapper);
   	

}

