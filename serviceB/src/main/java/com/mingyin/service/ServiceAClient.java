package com.mingyin.service;

import com.xiaowu.api.ServiceAInterface;
import org.springframework.cloud.netflix.feign.FeignClient;
@FeignClient("ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}
