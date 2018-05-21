package com.binger.goods.service;

import com.binger.goods.controller.form.SaleOrderForm;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.vo.SaleOrderMainVo;
import com.binger.goods.vo.SaleOrderVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/15
 * Time: 上午8:25
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface SaleOrderService {
    /**
     * 列出销售订单
     * @param saleOrderQueryDto
     * @return
     */
    List<SaleOrderMainVo> listByQuery(SaleOrderQueryDto saleOrderQueryDto);

    /**
     * 计数数量
     * @param saleOrderQueryDto
     * @return
     */
    long countByQuery(SaleOrderQueryDto saleOrderQueryDto);

    /**
     * 新增订单
     * @param saleOrderForm
     * @return
     */
    SaleOrderMainVo addOrder(SaleOrderForm saleOrderForm);

    /**
     * 修改订单
     * @param saleOrderForm
     * @return
     */
    SaleOrderMainVo updateOrder(SaleOrderForm saleOrderForm);

    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    SaleOrderVo findMainById(Integer id);
}
