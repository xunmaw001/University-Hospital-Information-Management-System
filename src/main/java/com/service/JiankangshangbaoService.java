package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangshangbaoView;


/**
 * 健康上报
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface JiankangshangbaoService extends IService<JiankangshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangshangbaoVO> selectListVO(Wrapper<JiankangshangbaoEntity> wrapper);
   	
   	JiankangshangbaoVO selectVO(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
   	
   	List<JiankangshangbaoView> selectListView(Wrapper<JiankangshangbaoEntity> wrapper);
   	
   	JiankangshangbaoView selectView(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangshangbaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiankangshangbaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiankangshangbaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiankangshangbaoEntity> wrapper);
}

