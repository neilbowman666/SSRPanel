package org.shadowsocks.ssrpanel.good.web;

import org.shadowsocks.ssrpanel.good.enetity.Good;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class GoodController {

    /**
     * 列表所有的商品
     *
     * @return
     */
    @GetMapping("/list")
    List<Good> listGoods() {
        // TODO 列表所有商品
        return null;
    }

    @GetMapping("/{id}")
    void getGood(@RequestParam("id") Long id) {

    }
}
