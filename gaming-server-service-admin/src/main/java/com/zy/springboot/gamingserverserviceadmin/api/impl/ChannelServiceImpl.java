package com.zy.springboot.gamingserverserviceadmin.api.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.zy.springboot.gamingserverdomain.Channel;
import  com.zy.springboot.gamingserverserviceadmin.api.ChannelService;
import java.util.List;

public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> selectAll() {
        return channelMapper.selectAll();
    }
}
