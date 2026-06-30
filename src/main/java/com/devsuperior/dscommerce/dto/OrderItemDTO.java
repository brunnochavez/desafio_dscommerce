package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.Product;

public class OrderItemDTO {

    private Long produtcId;
    private String productName;
    private Double price;
    private Integer quantity;

    public OrderItemDTO() {
    }

    public OrderItemDTO(Long produtcId, String productName, Double price, Integer quantity) {
        this.produtcId = produtcId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem entity) {
        produtcId = entity.getProduct().getId();
        productName = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public Long getProdutcId() {
        return produtcId;
    }

    public void setProdutcId(Long produtcId) {
        this.produtcId = produtcId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal(){
        return price * quantity;
    }
}
