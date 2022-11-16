package com.hzh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.common.entity.BorrowList;
import com.hzh.dao.BorrowListMapper;
import com.hzh.service.BorrowListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @NAME: BorrowListServiceImpl
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:38
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Service
@Slf4j
public class BorrowListServiceImpl extends ServiceImpl<BorrowListMapper, BorrowList> implements BorrowListService {
}
