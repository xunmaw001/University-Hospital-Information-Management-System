package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyiView;


/**
 * 校医
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface XiaoyiService extends IService<XiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyiVO> selectListVO(Wrapper<XiaoyiEntity> wrapper);
   	
   	XiaoyiVO selectVO(@Param("ew") Wrapper<XiaoyiEntity> wrapper);
   	
   	List<XiaoyiView> selectListView(Wrapper<XiaoyiEntity> wrapper);
   	
   	XiaoyiView selectView(@Param("ew") Wrapper<XiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyiEntity> wrapper);
   	

}

