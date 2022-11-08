package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Transactional
    public Object selectWithTransaction()
    {

        testMapper.select();
        return testMapper.select();
    }

    public Object selectNoTransaction()
    {
        return testMapper.select();
    }
}
