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
 * @NAME: LendCard
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
@TableName("lend_card")
public class LendCard {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "student_id")
    private String studentId;
    @TableField(value = "student_name")
    private String studentName;
    @TableField(value = "student_tel")
    private String studentTel;
}
