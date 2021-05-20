package jpabook.jpashop.domain.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String zipcode;
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}