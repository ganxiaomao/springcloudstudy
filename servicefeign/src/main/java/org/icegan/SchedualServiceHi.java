package org.icegan;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ganzhen on 08/11/2017.
 */
@FeignClient(value="eurekaclient-hi")
public interface SchedualServiceHi {
    @RequestMapping(value="/hi", method= RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}
