package com.mytag;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import com.demo.Product;

public class ProductTag1 extends SimpleTagSupport{
  String[] productList={"苹果iphone5手机","OLYMPUS数码相机","文曲星电子词典"};
  public void setProductList(String[] productList){
     this.productList = productList;
  }
  public void doTag() throws JspException, IOException{
     for(String product:productList){
        getJspContext().setAttribute("product", product);
        getJspBody().invoke(null);
     }
  }
}

