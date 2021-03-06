package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsSizeMapper;
import com.binger.goods.domain.GoodsSize;
import com.binger.goods.domain.GoodsSizeExample;
import com.binger.goods.service.GoodsSizeService;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsSizeDetailVo;
import com.binger.goods.vo.GoodsSizeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsSizeServiceImpl implements GoodsSizeService{
    @Autowired
    private GoodsSizeMapper goodsSizeMapper;

    @Override
    public long countSizesByExample(GoodsSizeExample goodsSizeExample) {
        return goodsSizeMapper.countByExample(goodsSizeExample);
    }

    @Override
    public List<GoodsSizeVo> listSizeByExample(GoodsSizeExample goodsSizeExample) {
        List<GoodsSize> goodsSizeList = goodsSizeMapper.selectByExample(goodsSizeExample);
        return DozerUtils.convertList(goodsSizeList, GoodsSizeVo.class);
    }

    @Override
    public GoodsSizeDetailVo selectSizeByPrimaryId(Integer id) {
        GoodsSize goodsSize = goodsSizeMapper.selectByPrimaryKey(id);
        return DozerUtils.convert(goodsSize, GoodsSizeDetailVo.class);
    }

    @Override
    public GoodsSizeDetailVo updateSizeById(GoodsSize goodsSize, Integer id) {
        GoodsSize result = goodsSizeMapper.selectByPrimaryKey(id);
        if (result == null){
            throw BusinessException.create("没有找到该尺寸。");
        }
        checkUnique(goodsSize, id);
        goodsSize.setId(id);
        goodsSizeMapper.updateByPrimaryKeySelective(goodsSize);
        return DozerUtils.convert(goodsSizeMapper.selectByPrimaryKey(id),GoodsSizeDetailVo.class);
    }

    private void checkUnique(GoodsSize goodsSize, Integer id) {
        GoodsSizeExample example = new GoodsSizeExample();
        GoodsSizeExample.Criteria criteria = example.createCriteria();
        criteria.andSizeCodeEqualTo(goodsSize.getSizeCode());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = goodsSizeMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("[" + goodsSize.getSizeCode() + "]已存在！");
        }
    }

    @Override
    public Boolean deleteSizeById(Integer id) {
        long count = goodsSizeMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public GoodsSizeDetailVo insert(GoodsSize goodsSize) {
        checkUnique(goodsSize, null);
        goodsSizeMapper.insertSelective(goodsSize);
        GoodsSize size = goodsSizeMapper.selectByPrimaryKey(goodsSize.getId());
        if (size != null) {
            return DozerUtils.convert(size, GoodsSizeDetailVo.class);
        } else {
            return null;
        }
    }
}