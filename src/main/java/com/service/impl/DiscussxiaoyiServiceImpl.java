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


import com.dao.DiscussxiaoyiDao;
import com.entity.DiscussxiaoyiEntity;
import com.service.DiscussxiaoyiService;
import com.entity.vo.DiscussxiaoyiVO;
import com.entity.view.DiscussxiaoyiView;

@Service("discussxiaoyiService")
public class DiscussxiaoyiServiceImpl extends ServiceImpl<DiscussxiaoyiDao, DiscussxiaoyiEntity> implements DiscussxiaoyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoyiEntity> page = this.selectPage(
                new Query<DiscussxiaoyiEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyiEntity> wrapper) {
		  Page<DiscussxiaoyiView> page =new Query<DiscussxiaoyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoyiVO> selectListVO(Wrapper<DiscussxiaoyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoyiVO selectVO(Wrapper<DiscussxiaoyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoyiView> selectListView(Wrapper<DiscussxiaoyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoyiView selectView(Wrapper<DiscussxiaoyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
