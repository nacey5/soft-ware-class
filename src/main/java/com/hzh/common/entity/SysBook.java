package com.hzh.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @NAME: SysBook
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:19
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("sys_book")
public class SysBook {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField(value = "book_name")
    private String bookName;
    @TableField(value = "book_remaining")
    private String bookRemaining;
}
