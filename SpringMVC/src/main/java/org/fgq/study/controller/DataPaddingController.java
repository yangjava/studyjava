package org.fgq.study.controller;

import org.fgq.study.datapadding.DataPadding;
import org.fgq.study.datapadding.exception.DataPaddingException;
import org.fgq.study.datapadding.test.PaddingClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fenggqc
 * @create 2018-10-24 15:35
 **/

@Controller()
@RequestMapping("/dp")
public class DataPaddingController {

    //region Getter And Setter
    // endregion

    @ResponseBody
    @RequestMapping("/test")
    public String HelloName() {

        PaddingClient paddingClient=new PaddingClient();

        List<PaddingClient> paddingClientList=new ArrayList<PaddingClient>();
        paddingClientList.add(paddingClient);


        try {
            DataPadding.PadInfo( PaddingClient.class, paddingClientList);
        } catch (DataPaddingException e) {
            System.out.println(e.toString());
        }

        return "";



    }



}