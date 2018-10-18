package com.company.project.service.impl;

import com.company.project.dao.QuoteMapper;
import com.company.project.model.Quote;
import com.company.project.service.QuoteService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/18.
 */
@Service
@Transactional
public class QuoteServiceImpl extends AbstractService<Quote> implements QuoteService {
    @Resource
    private QuoteMapper quoteMapper;

}
