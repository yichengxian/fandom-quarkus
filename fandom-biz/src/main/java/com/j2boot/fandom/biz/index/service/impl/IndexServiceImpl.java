package com.j2boot.fandom.biz.index.service.impl;

import com.j2boot.fandom.biz.index.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * @author yichengxian
 *
 */
@Service
public class IndexServiceImpl implements IndexService {
    /**
     *
     * @return
     */
    @Override
    public String index() {
        return "hello world";
    }
}
