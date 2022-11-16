package com.hzh.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hzh.common.R;
import com.hzh.common.entity.SysBook;
import com.hzh.service.SysBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @NAME: SysBookController
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:41
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@RestController
@RequestMapping("/sysBook")
public class SysBookController extends BaseController{


    @Autowired
    private SysBookService sysBookService;

    @GetMapping("/findAllSysBooks")
    public R<List<SysBook>> findAllSysBooks(){
        List<SysBook> sysBooks = sysBookService.list();
        return R.success(sysBooks,"数据完全查询完毕");
        //return success(sysBooks);
    }

    @PostMapping("/findBookByName")
    public R<SysBook> findBookByName(@RequestParam("name") String name){
        SysBook book = sysBookService.getOne(new QueryWrapper<SysBook>().eq("book_name", name));
        if (book==null){
            return fail("没有这本书");
        }
        return success(book);
    }

    @GetMapping("/findBookByName/{id}")
    public R<SysBook> findBookByName(@PathVariable("id") int id){
        SysBook book = sysBookService.getById(id);
        if (book==null){
            return fail("没有这本书");
        }
        return success(book);
    }
}
