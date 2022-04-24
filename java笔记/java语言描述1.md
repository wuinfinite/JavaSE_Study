# java语言描述-尚硅谷

##  1.常用的dos命令

### 	dir: 列出当前目录下的文件以及文件夹

### 	md: 创建目录

### 	rd: 删除目录

### 	cd: 进入指定目录

### 	cd..: 退回到上一级目录

### 	cd\: 退回到根目录

### 	cd/: 退回到根目录

### 	del: 删除文件

### 	exit: 退出dos命令行

####              补充：echo javase>1.doc

* java -version：查看jdk版本

  ​

##  2.常用快捷键

###        Delete和Backspace:删除字符



## 3.jdk jre jvm关系

+ jdk= jre+开发工具集   

+ jre=jvm+java se标准库

  ​

##4.java小常识

* javac.exe 编译源文件-->class文件（字节码文件）

* java.exe 运行class文件

  ​


## 5.环境变量配置问题

* 1.5以上版本的JDK编译 运行java源文件不需要配置classpath

  ​

## 6.编译以及运行问题

* javac编译源文件大小写都行
* java运行必须严格按照大小写

## 7.java注释

* //单行注释
* /* 多行注释*/不可以嵌套使用
* /**文档注释 */(java特有)    注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档

```java
javadoc -d (自定义名字) -author -version (java文件名)
```

## 8.javaAPI



## 9.遇到编码乱码问题

* 使用-encoding选项设置utf-8来编译   javac -encoding UTF-8 HelloWorld.java

* ```java
  chcp
  936 GBK(简体中文，一般情况下为默认编码)     
  437 MS-DOS 美国英语
  65001 utf-8
  1252 拉丁 1 字符 (ANSI)
  ```

## 10.java类声明

* 在一个java源文件中可以声明多个class，但是只能最多有一个类声明为public的。而且要求声明为public的类的类名必须与源文件名相同。

## 11.main()方法

```java
1.public static void main(String[] args){}习惯格式
2.public static void main(String[] a){}
3.public static void main(String a[]){}
```

## 12.输出语句

```java
system.out.println();先输出数据，然后换行
system.out.print();只输出数据
```

