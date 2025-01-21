package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaoyiView;


/**
 * 校医评论表
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:13
 */
public interface DiscussxiaoyiService extends IService<DiscussxiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaoyiVO> selectListVO(Wrapper<DiscussxiaoyiEntity> wrapper);
   	
   	DiscussxiaoyiVO selectVO(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
   	
   	List<DiscussxiaoyiView> selectListView(Wrapper<DiscussxiaoyiEntity> wrapper);
   	
   	DiscussxiaoyiView selectView(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaoyiEntity> wrapper);
   	

}

