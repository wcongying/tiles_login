package com.nicole.tileslogin.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        //直接输出当前时间,比如C类alendar。但是要求是用Tag标签来处理时间的转换，可以自行写一个JSP的
        // 时间处理Tag，可以根据传入的时间格式把Long变成对应的格式
        Long curMilSec = System.currentTimeMillis();
        Date date = new Date(curMilSec);
        // 设置格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //转换
        String dateStr = sdf.format(date.getTime()) ;
        //输出
        JspWriter out = getJspContext().getOut();
        out.print(dateStr);
    }
}


