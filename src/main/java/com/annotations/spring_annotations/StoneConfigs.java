package com.annotations.spring_annotations;

import com.annotations.spring_annotations.models.*;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

// por defecto springboot ya lo carga
// @ComponentScan(basePackages = "org.example")
@Slf4j
@Configuration
@PropertySources({
        @PropertySource("classpath:configs/stone.properties"),
        @PropertySource("classpath:configs/mind_stone.properties"),
        @PropertySource("classpath:configs/power_stone.properties"),
        @PropertySource("classpath:configs/reality_stone.properties"),
        @PropertySource("classpath:configs/soul_stone.properties"),
        @PropertySource("classpath:configs/space_stone.properties"),
        @PropertySource("classpath:configs/time_stone.properties")
})
public class StoneConfigs {

    //@Value("${subtitles.url}") private String subtitlesUrl;
    //@Value("${spring.profiles.active:default}") private String profile;

    // MIND
    @Value("${stone.mind.color}") private String colorMind;
    @Value("{stone.mind.name}") private String nameMind;
    @Value("${stone.mind.location}") private String locationMind;
    @Value("${stone.mind.energy_level}") private Integer energyMind;

    // POWER
    @Value("${stone.power.color}") private String colorPower;
    @Value("${stone.power.name}") private String namePower;
    @Value("${stone.power.location}") private String locationPower;
    @Value("${stone.power.energy_level}") private Integer energyPower;

    // Reality
    @Value("${stone.reality.color}") private String colorReality;
    @Value("${stone.reality.name}") private String nameReality;
    @Value("${stone.reality.location}") private String locationReality;
    @Value("${stone.reality.energy_level}") private Integer energyReality;

    // Soul
    @Value("${stone.soul.color}") private String colorSoul;
    @Value("${stone.soul.name}") private String nameSoul;
    @Value("${stone.soul.location}") private String locationSoul;
    @Value("${stone.soul.energy_level}") private Integer energySoul;

    // Space
    @Value("${stone.space.color}") private String colorSpace;
    @Value("${stone.space.name}") private String nameSpace;
    @Value("${stone.space.location}") private String locationSpace;
    @Value("${stone.space.energy_level}") private Integer energySpace;

    // time
    @Value("${stone.time.color}") private String colorTime;
    @Value("${stone.time.name}") private String nameTime;
    @Value("${stone.time.location}") private String locationTime;
    @Value("${stone.time.energy_level}") private Integer energyTime;



    /*@PostConstruct
    public void init(){
        log.info("Loading subtitles:{}.with.profile:{}", this.subtitlesUrl, profile);
    }*/
    @Bean(name = "mind")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.mind.create",
            havingValue="true"
    )
    public MindStone mindStone(){
        return new MindStone(colorMind, nameMind, locationMind, energyMind);
    }

    @Bean(name = "power")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.power.create",
            havingValue="true"
    )
    public PowerStone powerStone(){
        return new PowerStone(namePower, colorPower, locationPower, energyPower);
    }

    @Bean(name = "reality")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.reality.create",
            havingValue="true"
    )
    public RealityStone realityStone(){
        return new RealityStone(colorReality, nameReality, locationReality, energyReality);
    }

    @Bean(name = "soul")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.soul.create",
            havingValue="true"
    )
    public SoulStone soulStone(){
        return new SoulStone(colorSoul, nameSoul, locationSoul, energySoul);
    }

    @Bean(name = "space")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.space.create",
            havingValue="true"
    )
    public SpaceStone spaceStone(){
        return new SpaceStone(colorSpace, nameSpace, locationSpace, energySpace);
    }

    @Bean(name = "time")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.time.create",
            havingValue="true"
    )
    public TimeStone timeStone(){

        return new TimeStone(colorTime, nameTime, locationTime, energyTime);
    }

}
