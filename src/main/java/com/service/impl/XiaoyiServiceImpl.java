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


import com.dao.XiaoyiDao;
import com.entity.XiaoyiEntity;
import com.service.XiaoyiService;
import com.entity.vo.XiaoyiVO;
import com.entity.view.XiaoyiView;

@Service("xiaoyiService")
public class XiaoyiServiceImpl extends ServiceImpl<XiaoyiDao, XiaoyiEntity> implements XiaoyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyiEntity> page = this.selectPage(
                new Query<XiaoyiEntity>(params).getPage(),
                new EntityWrapper<XiaoyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyiEntity> wrapper) {
		  Page<XiaoyiView> page =new Query<XiaoyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyiVO> selectListVO(Wrapper<XiaoyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyiVO selectVO(Wrapper<XiaoyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyiView> selectListView(Wrapper<XiaoyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyiView selectView(Wrapper<XiaoyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
