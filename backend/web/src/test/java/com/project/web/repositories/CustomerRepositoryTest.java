package com.project.web.repositories;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CustomerRepositoryTest
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired CustomerRepository repo;
    
    @Test
    public void countTest() throws Exception{
        Long count = repo.count();
        assertThat(Integer.parseInt(count+""), equalTo(31));
    }
}