package com.soo.shop.service.impl;

import com.soo.shop.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberRepository repository;

    @Autowired
    private ModelMapper modelMapper;


}
