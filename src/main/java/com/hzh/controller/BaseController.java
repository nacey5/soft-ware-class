package com.hzh.controller;

import com.hzh.common.R;

/**
 * @NAME: BaseController
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:57
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
public abstract class BaseController {
    /**
     * 成功返回
     *
     * @param data
     * @return
     */
    public <T> R<T> success(T data) {
        return R.success(data);
    }

    public R<Boolean> success() {
        return R.success();
    }

    /**
     * 失败返回
     *
     * @param msg
     * @return
     */
    public <T> R<T> fail(String msg) {
        return R.fail(msg);
    }

    public <T> R<T> fail(String msg, Object... args) {
        return R.fail(msg, args);
    }
}
