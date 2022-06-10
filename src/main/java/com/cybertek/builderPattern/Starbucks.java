package com.cybertek.builderPattern;

// Class içerisinde opsiyonel field lar fazla ise veya constructor içinde çok parametre varsa builder pattern mantıklı oluyor...
public class Starbucks {

    // gerekli
    private String coffeeSize;

    // opsiyonel
    private String milkType;
    private Boolean isSoft;

    public Starbucks(Builder builder){
        coffeeSize = builder.coffeeSize;
        milkType = builder.milkType;
        isSoft = builder.isSoft;
    }

    public static class Builder{

        // gerekli
        private String coffeeSize;

        // opsiyonel
        private String milkType;
        private Boolean isSoft;

        public Builder(String coffeeSize) {
            this.coffeeSize = coffeeSize;
        }

        public Builder laktozsuzMilk(String lzktozsuz){
            milkType = lzktozsuz;
            return this;
        }

        public Builder isSoft(boolean softness){
            isSoft = softness;
            return this;
        }

        public Starbucks build(){
            return new Starbucks(this);
        }
    }
}
