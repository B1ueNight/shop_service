package com.bluenight.shopping_service.api;

import com.bluenight.shopping_service.data.MemberProductHistoryVO;
import com.bluenight.shopping_service.data.PageConnnecthistoryVO;
import com.bluenight.shopping_service.mapper.HistoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/history")
public class HistoryAPIController {
    @Autowired HistoryMapper history_mapper;
    @PutMapping("/prod")
    public String putProducthistory(@RequestBody MemberProductHistoryVO data) {
        System.out.println(data);
        if(data.getMph_mi_seq() != null){
            history_mapper.insertMemberProductHistory(data);
            return"History inserted";
        }
        return "Require Login (User number is null)";
    }

    @PutMapping("/page")
    public String putproductpageHistory(@RequestBody PageConnnecthistoryVO data) {
        if(data.getPch_mi_seq() != null) {
            history_mapper.insertpageConnectHistory(data);
            return "History inserted";
        }
        return "Require Login (User number is null)";
    }
}
