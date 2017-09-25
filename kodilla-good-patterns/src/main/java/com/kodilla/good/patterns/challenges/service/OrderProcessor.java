package com.kodilla.good.patterns.challenges.service;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTo process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isOrder) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDTo(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTo(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}

