package com.kkb.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.kkb.model.AuthorVO;
import com.kkb.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AuthorMapperTests {
 
    @Autowired
    private AuthorMapper mapper;
    
    /* 작가 등록 테스트 */
    @Test
    public void authorGetTotalTEST() throws Exception{
        
        Criteria cri = new Criteria();
       cri.setKeyword("경빈이는 짱");
       
       int total = mapper.authorGetTotal(cri);

       System.out.println("total. . . " + total) ;
    }    
    
}
 