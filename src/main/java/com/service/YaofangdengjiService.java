package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaofangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaofangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangdengjiView;


/**
 * 药方登记
 *
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface YaofangdengjiService extends IService<YaofangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaofangdengjiVO> selectListVO(Wrapper<YaofangdengjiEntity> wrapper);
   	
   	YaofangdengjiVO selectVO(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
   	
   	List<YaofangdengjiView> selectListView(Wrapper<YaofangdengjiEntity> wrapper);
   	
   	YaofangdengjiView selectView(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaofangdengjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YaofangdengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YaofangdengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YaofangdengjiEntity> wrapper);
}

