package org.shadowsocks.ssrpanel.node.controller;

import org.shadowsocks.ssrpanel.node.entity.SSRNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

    @GetMapping("/ssrnode")
    public SSRNode getSSRNode(){
        return null;
    }

}
