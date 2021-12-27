package com.zerofam.products.model;

import com.zerofam.products.model.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_order")
public class Order extends BaseEntity<Long>{

    private Status status;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Product> products;
}
