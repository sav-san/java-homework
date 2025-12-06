package Homework20;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;

public class TVK<T extends Comparable,V extends Serializable,K> {
    private T token;
    private V value;
    private K key;
    public TVK (T token, V value, K key){
        this.token = token;
        this.value = value;
        this.key = key;
    }

    public T getToken() {
        return token;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void printClassNames(){
        System.out.println(token.getClass().getName());
        System.out.println(value.getClass().getName());
        System.out.println(key.getClass().getName());
    }
}
