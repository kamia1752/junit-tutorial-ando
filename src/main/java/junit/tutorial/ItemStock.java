// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

public interface ItemStock {
    
    /**
     * 商品と数量を指定して追加する
     * @param item 商品名
     * @param num 追加する数量
     */
    void add(String item, int num);
    
    int size(String item);
    
    boolean contains(String item);
}
