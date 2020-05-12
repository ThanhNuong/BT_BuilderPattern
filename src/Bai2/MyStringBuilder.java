/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

//import static java.lang.String.valueOf;
//import java.lang.module.ModuleDescriptor.Builder;

public class MyStringBuilder {
    String str, str1, str2;
    
    //khong cho ben ngoai goi ma thong qua thanh phan Builder

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
        this.str1 = builder.str1;
        this.str2 = builder.str2;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + ", str1=" + str1 + ", str2=" + str2 + '}';
    }

    public static class Builder{
        String str, str1, str2;
        
        public Builder() {
        }
        
        public Builder addString(String s){
            this.str = s;
            return this;
    }
        
        public Builder addFloat(float f){
            this.str1 = String.valueOf(f);
            return this;
        }
        
        public Builder addBool(boolean b){
            this.str2 = String.valueOf(b);
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
