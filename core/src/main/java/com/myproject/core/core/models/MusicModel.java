package com.myproject.core.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = {Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MusicModel {
    private static final Logger LOG = LoggerFactory.getLogger(MusicModel.class);

    @Inject
    private String title;
    @Inject
    private String description;

    @Inject
    private String source_path;
    @Inject
    private String  img_path;


    @PostConstruct
    public void init(){
        LOG.info("tharun");
        LOG.info("title" + getTitle() +" ,"+"Description" +getDescription()+", "+"Mp3 sourcepath "+getSource_path()+", "+"Image path"+getImg_path());
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getSource_path(){
        return source_path;
    }

    public String getImg_path(){
        return img_path;
    }





}
