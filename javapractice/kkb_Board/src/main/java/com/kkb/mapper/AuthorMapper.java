package com.kkb.mapper;

import java.util.List;
import com.kkb.model.AuthorVO;
import com.kkb.model.Criteria;

public interface AuthorMapper {

	 public void authorEnroll(AuthorVO author);
	 
	 public List<AuthorVO> authorGetList(Criteria cri);
	 
	    public int authorGetTotal(Criteria cri);
}
