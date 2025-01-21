package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopindingdanView;


/**
 * 药品订单
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface YaopindingdanService extends IService<YaopindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopindingdanVO> selectListVO(Wrapper<YaopindingdanEntity> wrapper);
   	
   	YaopindingdanVO selectVO(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
   	
   	List<YaopindingdanView> selectListView(Wrapper<YaopindingdanEntity> wrapper);
   	
   	YaopindingdanView selectView(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopindingdanEntity> wrapper);
   	

}

