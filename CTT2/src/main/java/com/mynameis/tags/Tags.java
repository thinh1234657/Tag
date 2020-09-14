/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nammain
 */
package com.mynameis.tags;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class Tags extends TagSupport{
private static final long serialVersionUID = -1780170553645616494L;
private String fname;
private String mname;
private String lname;
public String getFname() {
return fname;
}
public void setFname(String fname) {
this.fname = fname;
}
public String getMname() {
return mname;
}
public void setMname(String mname) {
this.mname = mname;
}
public String getLname() {
return lname;
}
public void setLname(String lname) {
this.lname = lname;
}
@Override
public int doStartTag() throws JspException {
try {
JspWriter out=pageContext.getOut();
out.println("<h1>First Name: "+fname+" <br> Mid Name : "+mname+" <br> Last Name : "+lname+"</h1>");
} catch (IOException e) {
e.printStackTrace();
}
return SKIP_BODY;
}
}
