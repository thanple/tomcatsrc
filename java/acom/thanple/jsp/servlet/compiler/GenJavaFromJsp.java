package acom.thanple.jsp.servlet.compiler;

import org.apache.jasper.JspC;


/**
 * Created by Thanple on 2017/3/28.
 *
 * 将JSP生成Servlet的.java代码
 */
public class GenJavaFromJsp {

    public static void main(String[] args) {
        JspC jspc = new JspC();
        jspc.setUriroot("E:/IdeaProjects/tomcatsrc/lunch/webapps/examples");//web应用的root目录
        jspc.setOutputDir("E:/Temp");//.java文件和.class文件的输出目录
        jspc.setJspFiles("jsp/tagplugin/if.jsp");//要编译的jsp
        jspc.setCompile(true);//是否编译 false或不指定的话只生成.java文件
        jspc.execute();
    }

}
