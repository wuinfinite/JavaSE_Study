package com.zipeng.java;

/**
 * @auter zipeng
 * @create &{YEAR}-04-30-9:04
 */
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }


    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            return Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
