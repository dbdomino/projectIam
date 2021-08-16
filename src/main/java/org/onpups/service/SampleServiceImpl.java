package org.onpups.service;

import org.onpups.domain.ZozoVO;
import org.onpups.mapper.Sample1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class SampleServiceImpl implements SampleService{
	@Setter(onMethod_ = @Autowired)
	private Sample1Mapper mapper;
	@Autowired
	private Sample1Mapper Mapper1;


	@Override
	public ZozoVO view(int num) {
		// TODO Auto-generated method stub
		return mapper.read(num);
	}

}
