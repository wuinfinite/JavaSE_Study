# java集合

## 1.集合框架的概述

![9](D:\code尚硅谷\java笔记\imsges\199.png)

## 2.集合框架

### Collection接口和Map接口

![0](D:\code尚硅谷\java笔记\imsges\200.png)



## 3.Collection接口中的方法的使用

![0](D:\code尚硅谷\java笔记\imsges\201.png)

![0](D:\code尚硅谷\java笔记\imsges\202.png)

![0](D:\code尚硅谷\java笔记\imsges\203.png)

![0](D:\code尚硅谷\java笔记\imsges\204.png)

```java
1.内部的方法: next()和hasNext()
2.集合每次调用iterator（）方法都会得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
@Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        //方式一
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        //方式二
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        删除集合中的"Tom"
         Iterator iterator = coll.iterator();
		  while (iterator.hasNext()) {
		  object obj = iterator.next();
          if("Tom".equals(obj)){
          iterator.remove();
          }  
        }
        
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
```

### 增强for循环(foreach)

* 用于遍历集合和数组

![0](D:\code尚硅谷\java笔记\imsges\205.png)

 ![0](D:\code尚硅谷\java笔记\imsges\206.png)

## 4.Collection的子接口



### List接口：三大实现类

![0](D:\code尚硅谷\java笔记\imsges\207.png)

​	![0](D:\code尚硅谷\java笔记\imsges\208.png)

![0](D:\code尚硅谷\java笔记\imsges\209.png)

### List接口：常用方法

![1](D:\code尚硅谷\java笔记\imsges\210.png)

* 总结

  ![1](D:\code尚硅谷\java笔记\imsges\211.png)

  ​

### set接口

![1](D:\code尚硅谷\java笔记\imsges\213.png)

* Set接口中没有额外定义新的方法，使用的都是Collection中声明的方法

* 向Set中添加的数据，其所在的类一定要重写hashcode()和equals()

  ​	重写hashcode()和equals()尽可能保持一致性，以实现对象相等规则，即:相等的对象必须有相等的

  散列码。			        	       

#### 一、Set：存储无序的、不可重复的数据

​	以HashSet为例说明：

​	无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的**哈希值**决定的。

​	不可重复性：保证添加的元素按照equals()判断时，不能返回true。即相同的元素只能添加一个。

#### 二、添加元素的过程，以HashSet为例

![1](D:\code尚硅谷\java笔记\imsges\212.png)

HashSet底层：数组+链表的结构



#### 三、三大实现类

![1](D:\code尚硅谷\java笔记\imsges\214.png)

* Java比较器

![1](D:\code尚硅谷\java笔记\imsges\215.png)





## 5.Map接口

### 一个子接口，五个实现类

![1](D:\code尚硅谷\java笔记\imsges\216.png)

### Map结构的理解

![1](D:\code尚硅谷\java笔记\imsges\217.png)

### HashMap的底层实现原理

* 内部类：Node

![1](D:\code尚硅谷\java笔记\imsges\218.png)

![1](D:\code尚硅谷\java笔记\imsges\219.png)

### LinkedHashMap的底层实现原理(了解)

* 内部类：Entry

![2](D:\code尚硅谷\java笔记\imsges\220.png)

### TreeMap

### Map常用方法

![2](D:\code尚硅谷\java笔记\imsges\221.png)

![2](D:\code尚硅谷\java笔记\imsges\222.png)

![2](D:\code尚硅谷\java笔记\imsges\223.png)

### Properties实现类是Hashtable的子类

![2](D:\code尚硅谷\java笔记\imsges\224.png)



## 6.Collections工具类

![2](D:\code尚硅谷\java笔记\imsges\225.png)

![2](D:\code尚硅谷\java笔记\imsges\226.png)

```java
copy方法使用的注意事项

 List list = new ArrayList();
        list.add(123);list.add(12);list.add(-14); list.add(88);list.add(56); list.add(0);

		List dest = Arrays.asList(new Object[list.size()]);//6个null元素放入
		Collections.copy(dest,list);
```

![2](D:\code尚硅谷\java笔记\imsges\227.png)

```java
        //返回list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);
```

