package com.example.be_quan_tri.controllers.webcontrollers.executives;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "executive/")
public class ExecutiveController {

    @GetMapping("ticketCategories")
    public String ticketCategory(@RequestParam(defaultValue = "", value = "size") String size,
                                @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketCategory";
    }

    @GetMapping("slaTemplates")
    public String slaTemplate(@RequestParam(defaultValue = "", value = "size") String size,
                              @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/slaTemplate";
    }

    @GetMapping("ticketPriorities")
    public String ticketPriority(@RequestParam(defaultValue = "", value = "size") String size,
                                 @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketPriority";
    }

    @GetMapping("slaCategories")
    public String slaCategory(@RequestParam(defaultValue = "", value = "size") String size,
                              @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/slaCategory";
    }

    @GetMapping("slaManagements")
    public String slaManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/slaManagement";
    }

    @GetMapping("scheduleManagements")
    public String scheduleManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/scheduleManagement";
    }

    @GetMapping("fileManagements")
    public String fileManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                 @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/fileManagement";
    }

    @GetMapping("statusList")
    public String statusList(@RequestParam(defaultValue = "", value = "size") String size,
                             @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/statusList";
    }

    @GetMapping("ticketTemplateCategories")
    public String ticketTemplateCategory(@RequestParam(defaultValue = "", value = "size") String size,
                                         @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketTemplateCategory";
    }

    @GetMapping("ticketTemplateLists")
    public String ticketTemplateList(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketTemplateList";
    }

    @GetMapping("ticketCodes")
    public String ticketCode(@RequestParam(defaultValue = "", value = "size") String size,
                             @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketCode";
    }

    @GetMapping("channelTypes")
    public String channelType(@RequestParam(defaultValue = "", value = "size") String size,
                              @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/channelType";
    }

    @GetMapping("channelList")
    public String channelList(@RequestParam(defaultValue = "", value = "size") String size,
                              @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/channelList";
    }

    @GetMapping("ticketLabels")
    public String ticketLabelList(@RequestParam(defaultValue = "", value = "size") String size,
                                  @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketLabelList";
    }

    @GetMapping("ticketStatusList")
    public String ticketStatusList(@RequestParam(defaultValue = "", value = "size") String size,
                                   @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketStatusList";
    }

    @GetMapping("ticketRelations")
    public String ticketRelationList(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketRelationList";
    }

    @GetMapping("ticketSenderInfo")
    public String ticketSenderInfo(@RequestParam(defaultValue = "", value = "size") String size,
                                   @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketSenderInfo";
    }

    @GetMapping("ticketReceiveTimes")
    public String ticketReceiveTime(@RequestParam(defaultValue = "", value = "size") String size,
                                    @RequestParam(defaultValue = "", value = "size") String page){

        System.out.println(size+"/"+page);
        return "dashboard/executive/ticketReceiveTime";
    }

}
