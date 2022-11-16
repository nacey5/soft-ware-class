package com.hzh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.common.entity.BorrowList;
import com.hzh.common.entity.SysBook;
import com.hzh.dao.BorrowListMapper;
import com.hzh.dao.SysBookMapper;
import com.hzh.service.SysBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @NAME: SysBookServiceImpl
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:40
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Service
@Slf4j
public class SysBookServiceImpl extends ServiceImpl<SysBookMapper, SysBook> implements SysBookService {
}
