package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanxiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanxiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanxiaoshenqingView;


/**
 * 返校申请
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface FanxiaoshenqingService extends IService<FanxiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanxiaoshenqingVO> selectListVO(Wrapper<FanxiaoshenqingEntity> wrapper);
   	
   	FanxiaoshenqingVO selectVO(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
   	
   	List<FanxiaoshenqingView> selectListView(Wrapper<FanxiaoshenqingEntity> wrapper);
   	
   	FanxiaoshenqingView selectView(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanxiaoshenqingEntity> wrapper);
   	

}

