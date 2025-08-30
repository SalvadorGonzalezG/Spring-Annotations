package com.annotations.spring_annotations.services;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Getter
@ConditionalOnBean(value = {
        
})
public class GauntletServiceImpl implements IGauntletService {


    @Override
    public void useGauntlet(String nameStone) {

    }

    @Override
    public void useFullPower() {

    }
}
