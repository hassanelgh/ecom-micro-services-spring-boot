# Order Service 



- entities :

   - Order : [:point_right:](./src/main/java/com/example/orderservice/entities/Order.java)

   <img src="images/img_2.png" alt="">

   - ProductItem : [:point_right:](./src/main/java/com/example/orderservice/entities/ProductItem.java)

   <img src="images/img_3.png" alt="">

- enums :

   - OrderType : [:point_right:](./src/main/java/com/example/orderservice/enums/OrderType.java)

    <img src="images/img_4.png" alt="">


- dto :

  - FullOrderDTO : [:point_right:](./src/main/java/com/example/orderservice/dto/FullOrderDTO.java)
  - ProductItemDTO : [:point_right:](./src/main/java/com/example/orderservice/dto/ProductItemDTO.java)

- exceptions :

  - CustomerNotFoundException : [:point_right:](./src/main/java/com/example/orderservice/exceptions/CustomerNotFoundException.java)
  - OrderNotFoundException : [:point_right:](./src/main/java/com/example/orderservice/exceptions/OrderNotFoundException.java)
  - ProductNotFoundException : [:point_right:](./src/main/java/com/example/orderservice/exceptions/ProductNotFoundException.java)


- mappers :

  - OrderMapper : [:point_right:](./src/main/java/com/example/orderservice/mappers/OrderMapper.java)

   <img src="images/img_5.png" alt="">

  - OrderMapperImpl : [:point_right:](./src/main/java/com/example/orderservice/mappers/OrderMapperImpl.java)

- models :

  - Customer : [:point_right:](./src/main/java/com/example/orderservice/models/Customer.java)
  - Product : [:point_right:](./src/main/java/com/example/orderservice/models/Product.java)


- openfeign :

  - CustomerRestClientService : [:point_right:](./src/main/java/com/example/orderservice/openfeign/CustomerRestClientService.java)
  - InventoryRestClientService : [:point_right:](./src/main/java/com/example/orderservice/openfeign/InventoryRestClientService.java)

- repositories :

  - OrderRepository : [:point_right:](./src/main/java/com/example/orderservice/repositories/OrderRepository.java)
  - ProductItemRepository : [:point_right:](./src/main/java/com/example/orderservice/repositories/ProductItemRepository.java)

- services :

  - OrderService : [:point_right:](./src/main/java/com/example/orderservice/services/OrderService.java)

   <img src="images/img_6.png" alt="">

  - OrderServiceImpl : [:point_right:](./src/main/java/com/example/orderservice/services/OrderServiceImpl.java)

- web :

  -OrderRestController : [:point_right:](./src/main/java/com/example/orderservice/web/OrderRestController.java)

  <img src="images/img_7.png" alt="">



- OrderServiceApplication : [:point_right:](./src/main/java/com/example/orderservice/OrderServiceApplication.java)

<img src="images/img.png" alt="">

- application.properties : [:point_right:](./src/main/resources/application.properties)

    - ajouter config import pour specifier url de config server 

<img src="images/img_1.png" alt="">
