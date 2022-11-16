package com.hzh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.common.entity.BorrowList;
import com.hzh.common.entity.CreditLevel;
import com.hzh.dao.BorrowListMapper;
import com.hzh.dao.CreditLevelMapper;
import com.hzh.service.CreditLevelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @NAME: CreditLevelServiceImpl
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:39
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Service
@Slf4j
public class CreditLevelServiceImpl extends ServiceImpl<CreditLevelMapper, CreditLevel> implements CreditLevelService {
}
