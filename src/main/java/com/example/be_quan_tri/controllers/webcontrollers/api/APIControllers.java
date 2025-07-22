package com.example.be_quan_tri.controllers.webcontrollers.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "api/")
public class APIControllers {
    @GetMapping("apiManagement")
    public String apiManagement(@RequestParam(defaultValue = "" , value = "size") String size,
                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiManagement";
    }

    @GetMapping("apiGroups")
    public String apiGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiGroup";
    }

    @GetMapping("apiVersions")
    public String apiVersion(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiVersion";
    }

    @GetMapping("apiDocs")
    public String apiDocs(@RequestParam(defaultValue = "" , value = "size") String size,
                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiDocs";
    }

    @GetMapping("apiSecurityPolicies")
    public String apiSecurityPolicy(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiSecurityPolicy";
    }

    @GetMapping("apiTraffic")
    public String apiTraffic(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiTraffic";
    }

    @GetMapping("servicePerformance")
    public String servicePerformance(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/servicePerformance";
    }

    @GetMapping("apiKeys")
    public String apiKey(@RequestParam(defaultValue = "" , value = "size") String size,
                         @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiKey";
    }

    @GetMapping("apiErrors")
    public String apiError(@RequestParam(defaultValue = "" , value = "size") String size,
                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiError";
    }

    @GetMapping("incidentInfo")
    public String incidentInfo(@RequestParam(defaultValue = "" , value = "size") String size,
                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/incidentInfo";
    }

    @GetMapping("loadBalancing")
    public String loadBalancing(@RequestParam(defaultValue = "" , value = "size") String size,
                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/loadBalancing";
    }

    @GetMapping("fixedRoutingVersions")
    public String fixedRoutingVersion(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/fixedRoutingVersion";
    }

    @GetMapping("routeAccessControls")
    public String routeAccessControl(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/routeAccessControl";
    }

    @GetMapping("plugins")
    public String pluginManagements(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginManagements";
    }

    @GetMapping("customPlugins")
    public String customPlugin(@RequestParam(defaultValue = "" , value = "size") String size,
                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/customPlugin";
    }

    @GetMapping("pluginVersion")
    public String pluginVersion(@RequestParam(defaultValue = "" , value = "size") String size,
                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginVersion";
    }

    @GetMapping("pluginAccessControls")
    public String pluginAccessControl(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginAccessControl";
    }

    @GetMapping("pluginConfigs")
    public String pluginConfig(@RequestParam(defaultValue = "" , value = "size") String size,
                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginConfig";
    }

    @GetMapping("pluginChains")
    public String pluginChain(@RequestParam(defaultValue = "" , value = "size") String size,
                              @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginChain";
    }

    @GetMapping("pluginSecurity")
    public String pluginSecurity(@RequestParam(defaultValue = "" , value = "size") String size,
                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginSecurity";
    }

    @GetMapping("pluginDocsGroups")
    public String pluginDocsGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginDocsGroup";
    }

    @GetMapping("pluginDocs")
    public String pluginDocs(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/pluginDocs";
    }

    @GetMapping("logLifecycles")
    public String LogLifecycle(@RequestParam(defaultValue = "" , value = "size") String size,
                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/LogLifecycle";
    }

    @GetMapping("retryPolicies")
    public String apiRetryPolicy(@RequestParam(defaultValue = "" , value = "size") String size,
                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiRetryPolicy";
    }

    @GetMapping("multiRegionTraffic")
    public String multiRegionTraffic(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/multiRegionTraffic";
    }

    @GetMapping("devApiDocs")
    public String devApiDocs(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/devApiDocs";
    }

    @GetMapping("apiServices")
    public String apiService(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiService";
    }

    @GetMapping("endpoints")
    public String endpointManagement(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/endpointManagement";
    }

    @GetMapping("serviceSecurity")
    public String apiServiceSecurity(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiServiceSecurity";
    }

    @GetMapping("serviceErrorCategories")
    public String apiErrorCategory(@RequestParam(defaultValue = "" , value = "size") String size,
                                   @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiErrorCategory";
    }

    @GetMapping("serviceErrors")
    public String apiServiceError(@RequestParam(defaultValue = "" , value = "size") String size,
                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiServiceError";
    }

    @GetMapping("serviceIncidents")
    public String apiIncident(@RequestParam(defaultValue = "" , value = "size") String size,
                              @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiIncident";
    }

    @GetMapping("roleAccess")
    public String roleBasedAccess(@RequestParam(defaultValue = "" , value = "size") String size,
                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/roleBasedAccess";
    }

    @GetMapping("requests")
    public String apiRequestList(@RequestParam(defaultValue = "" , value = "size") String size,
                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiRequestList";
    }

    @GetMapping("clientRequests")
    public String clientRequestVolume(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/clientRequestVolume";
    }

    @GetMapping("cacheMemory")
    public String cacheMemory(@RequestParam(defaultValue = "" , value = "size") String size,
                              @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/cacheMemory";
    }

    @GetMapping("captchaFailures")
    public String captchaFailureList(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/captchaFailureList";
    }

    @GetMapping("blacklist")
    public String blacklist(@RequestParam(defaultValue = "" , value = "size") String size,
                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/blacklist";
    }

    @GetMapping("internalApis")
    public String internalApiList(@RequestParam(defaultValue = "" , value = "size") String size,
                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/internalApiList";
    }

    @GetMapping("apiQuotas")
    public String apiQuota(@RequestParam(defaultValue = "" , value = "size") String size,
                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiQuota";
    }

    @GetMapping("apiPackages")
    public String apiPackage(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiPackage";
    }

    @GetMapping("apiKeyRotation")
    public String apiKeyRotation(@RequestParam(defaultValue = "" , value = "size") String size,
                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiKeyRotation";
    }

    @GetMapping("publicApis")
    public String apiPublicList(@RequestParam(defaultValue = "" , value = "size") String size,
                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/apiPublicList";
    }

    @GetMapping("whitelist")
    public String whitelist(@RequestParam(defaultValue = "" , value = "size") String size,
                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/whitelist";
    }

    @GetMapping("alerts")
    public String alertList(@RequestParam(defaultValue = "" , value = "size") String size,
                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/api/alertList";
    }
}
