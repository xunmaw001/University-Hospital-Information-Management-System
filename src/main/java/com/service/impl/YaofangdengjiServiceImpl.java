package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaofangdengjiDao;
import com.entity.YaofangdengjiEntity;
import com.service.YaofangdengjiService;
import com.entity.vo.YaofangdengjiVO;
import com.entity.view.YaofangdengjiView;

@Service("yaofangdengjiService")
public class YaofangdengjiServiceImpl extends ServiceImpl<YaofangdengjiDao, YaofangdengjiEntity> implements YaofangdengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaofangdengjiEntity> page = this.selectPage(
                new Query<YaofangdengjiEntity>(params).getPage(),
                new EntityWrapper<YaofangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaofangdengjiEntity> wrapper) {
		  Page<YaofangdengjiView> page =new Query<YaofangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaofangdengjiVO> selectListVO(Wrapper<YaofangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaofangdengjiVO selectVO(Wrapper<YaofangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaofangdengjiView> selectListView(Wrapper<YaofangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaofangdengjiView selectView(Wrapper<YaofangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YaofangdengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YaofangdengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YaofangdengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
