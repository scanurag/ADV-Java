package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("girl")
@Qualifier("bs")
public class Girl {
	@Autowired
    IceCream ic;
}
