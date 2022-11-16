package com.hzh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.common.entity.BorrowList;
import com.hzh.common.entity.LendCard;
import com.hzh.dao.BorrowListMapper;
import com.hzh.dao.LendCardMapper;
import com.hzh.service.LendCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @NAME: LendCardServiceImpl
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:39
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Service
@Slf4j
public class LendCardServiceImpl extends ServiceImpl<LendCardMapper, LendCard> implements LendCardService {
}
