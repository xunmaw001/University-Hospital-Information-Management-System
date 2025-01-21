package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglijiluView;


/**
 * 病例记录
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface BinglijiluService extends IService<BinglijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglijiluVO> selectListVO(Wrapper<BinglijiluEntity> wrapper);
   	
   	BinglijiluVO selectVO(@Param("ew") Wrapper<BinglijiluEntity> wrapper);
   	
   	List<BinglijiluView> selectListView(Wrapper<BinglijiluEntity> wrapper);
   	
   	BinglijiluView selectView(@Param("ew") Wrapper<BinglijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglijiluEntity> wrapper);
   	

}

