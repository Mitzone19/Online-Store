
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class ShoppingCart {
    private Map<String,Item> items;
    
    public ShoppingCart(){
        this.items=new HashMap<>();
    }
    
    public void add(String product,int price){
       if(items.containsKey(product)){
           items.get(product).increaseQuantity();
       }else{
            Item newItem = new Item(product,1, price);
            items.put(product, newItem);
       }
    }
    
    public int price(){
        int sum=0;
        for(Item x:items.values()){
            if(x.price()>0){
             sum+=x.price();
            }
        }
        return sum;
    }
    public void print(){
        for(Item x:items.values()){
            System.out.println(x);
        }
    }
    
}
