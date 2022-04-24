#  HTML

## 标签拥有自己的属性

1.基本属性：bgcolor="red"     可以修改简单的样式效果

2.事件属性：onclick="alert('你好！')；"   可以直接设置事件响应后的代码

3.标签分为单标签和双标签

单：换行 <br/>     水平线<hr/>

## 一些基本内容含义

### 1.字体标签font：color 颜色  face字体  size大小



### 2.特殊字符

空格：&nbsp;

小于号：&lt;

大于号：&gt;

和号：&amp;

引号：&quot;

撇号：&apos;



### 3.标题标签

<h1>to<h6>

* 左对齐align="left" 
* 居中align="center"
* 右对齐align="right"



### 4.超链接

* a标签是超链接

  ​	href属性设置链接的地址

  ​		target属性设置哪个目标进行跳转

  ​			_self 当前页面

  ​			_blank 打开新页面

  ​

### 5.列表标签

* 无序列表<ul>     type属性可以修改列表前面的符号

  ​	列表项<li>

  ​		<ul type="none"> <li>···

* 有序列表<ol>     type属性可以修改列表前面的符号

  ​	列表项<li>

  ​		<ol type="none"><li>···

### 6.img标签

![1](D:\code尚硅谷\javaweb\javaweb笔记\images\1.png)



### 7.表格标签

* table标签是表格标签

  ​	border 设置表格边框标签

  ​	width 设置表格宽度

  ​	height 设置表格宽度

  ​	align 设置表格相对于页面的对齐方式

  ​	cellspacing 设置单元格间距

* tr 是行标签

  th 是表头标签

  td 是单元格标签

  ​	align 设置单元格文本对齐方式

  b 标签是加粗标签 

### 8.表格跨行跨列

* colspan 属性设置跨列
* rowspan 属性设置跨行

### 9.iframe框架标签（内嵌窗口）

* 在页面开启一个小区域 

  ​	<iframe src=""   width=""  height="" >

* iframe和a标签组合使用步骤

  ​	1.在iframe标签中使用name属性定义一个名称

  ​	2.在a标签的target属性上设置iframe的name的属性值

  ​		<iframe src="···" name="abc"></iframe>

  ​		<ul>

  ​			 <li>

  ​				 <a  href="···" target="abc">···</a> 

  ​			<l/i>

  ​		 </ul>

### 10.表单标签

* form标签就是表单

  ​	1.input type="text  "       是文件输入框    value 属性设置默认值

  ​	2.input type="password" 是密码输入框   value 属性设置默认值

  ​	3.input type="radio" 是单选框   name属性可以对齐进行分组   checked="checked"表示默认选中

  ​		性别<input type="radio" name="sex"/>男

  ​			<input type="radio" name="sex"/>女

  ​	4.input type="checkbox" 是复选框   checked="checked"表示默认选中

  ​	5.input type="reset" 是重置按钮   value属性修改按钮上的文本

  ​	6.input type="submit" 是提交按钮   value属性修改按钮上的文本

  ​	7.input type="button" 是按钮   value属性修改按钮上的文本

  ​	8.input type="file"        是文件上传领域

  ​	9.input type="hidden" 是隐藏域（当不需要用户看到可以考虑使用）

  ​	10.select 标签是下拉列表框

  ```
  		option 标签是下拉列表框中的选项 selected="selected"表示默认选

  	textarea 表示多行文本输入框

  		row 属性设置可以显示几行高度

  		cols 属性设置每行可以显示几个字符高度
  ```

### 11.表单提交的细节

* form标签就是表单

  ​	action属性设置提交的服务器地址

  ​	method属性设置提交的方式GET（默认值）或POST

* 表单提交的时候，数据没有发送给服务器的三种情况：

  ​	1.表单项没有name属性值

  ​	2.单选、复选（下拉列表中的option标签）都需要添加value属性

  ​	3.表单项不在提交的form标签中

* get请求的特点

  ​	1.浏览器地址栏中的地址是：action属性[+?+请求参数]

  ​		请求参数的格式是：name=value&name=value

  ​	2.不安全

  ​	3.它有数据长度的限制

* post请求的特点

  ​	1.浏览器地址栏中的地址中只有action属性值

  ​	2.相对get请求要安全

  ​	3.理论上数据长度的限制

### 12.其他标签

span标签  它的长度是封装数据的长度

