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


import com.dao.XianshangguahaoDao;
import com.entity.XianshangguahaoEntity;
import com.service.XianshangguahaoService;
import com.entity.vo.XianshangguahaoVO;
import com.entity.view.XianshangguahaoView;

@Service("xianshangguahaoService")
public class XianshangguahaoServiceImpl extends ServiceImpl<XianshangguahaoDao, XianshangguahaoEntity> implements XianshangguahaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianshangguahaoEntity> page = this.selectPage(
                new Query<XianshangguahaoEntity>(params).getPage(),
                new EntityWrapper<XianshangguahaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianshangguahaoEntity> wrapper) {
		  Page<XianshangguahaoView> page =new Query<XianshangguahaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianshangguahaoVO> selectListVO(Wrapper<XianshangguahaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianshangguahaoVO selectVO(Wrapper<XianshangguahaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianshangguahaoView> selectListView(Wrapper<XianshangguahaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianshangguahaoView selectView(Wrapper<XianshangguahaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
