package com.sonic.errorhandlercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by prash on 11/13/2016.
 */
@Controller
public class CustomErrorController implements ErrorController {

    private static final String ERROR_PATH="/error";

    private static final String ERROR_TEMLPATE="customError";

    private final ErrorAttributes errorAttributes;

    @Autowired
    //ErrorAttributes provides access to error attributes which can be displayed to the user
    public CustomErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    //Returns the error attributes
    //servletrequest and it defines an object to provide client request information to a servlet.HttpServletRequest provide request information for HTTP servlets.
    private Map<String,Object> getErrorAttributes(HttpServletRequest request,boolean includeStackTrace){
        RequestAttributes requestAttributes=new ServletRequestAttributes(request);
        return this.errorAttributes.getErrorAttributes(requestAttributes,includeStackTrace);
    }

    @RequestMapping(ERROR_PATH)
    public String error(Model model, HttpServletRequest request){
        Map<String,Object> error=getErrorAttributes(request,true);

        model.addAttribute("timestamp",error.get("timestamp"));
        model.addAttribute("status",error.get("status"));
        model.addAttribute("error",error.get("error"));
        model.addAttribute("message",error.get("message"));
        model.addAttribute("path",error.get("path"));

        return ERROR_TEMLPATE;
    }

    public String getErrorPath() {
        return ERROR_PATH;
    }

}
