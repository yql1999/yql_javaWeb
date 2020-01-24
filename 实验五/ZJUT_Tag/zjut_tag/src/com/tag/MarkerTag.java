package com.tag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class MarkerTag extends SimpleTagSupport {
	private String str = "sh";
	private int count = 0; // count属性

	public void setCount(int count) {
		this.count = count;
	}

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		String text = sw.toString();
		String[]splits = text.split(" ");

		System.out.println(text);
		System.out.println("count = "+count);
		int len = splits.length;
		
		//输出标签体中前count个以“sh”开头的单词
		for(int i = 0;i < len;i++) {
			if (count == 0) {
				break;
			}
			if(splits[i].startsWith(str)) {
				count--;
				System.out.println(splits[i]);
			}
			
		}
	}
}