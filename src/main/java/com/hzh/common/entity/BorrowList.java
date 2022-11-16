package com.hzh.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * @NAME: BorrowList
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:17
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("borrow_list")
public class BorrowList {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "book_id")
    private String bookId;

    @TableField(value = "lend_card_id")
    private String lendCardId;

    @TableField(value = "deadline")
    private String deadLine;

}
