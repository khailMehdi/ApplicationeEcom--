package org.example.billingservice.Web;

import org.example.billingservice.Entitie.Bill;
import org.example.billingservice.Feign.BillRestFien;
import org.example.billingservice.Feign.ProductRestFien;
import org.example.billingservice.Repository.BillRepository;
import org.example.billingservice.Repository.ProductItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestController {
    @Autowired private BillRestFien billRestFien;
    @Autowired private ProductRestFien productRestFien;
    @Autowired private BillRepository billRepository;
    @Autowired private ProductItemsRepository productRepository;

    @GetMapping("/bills/all/{id}")
    Bill getBill(@PathVariable(name="id") Long id){
        Bill bill=billRepository.findById(id).get();
        bill.setCustomer(billRestFien.getCustomerById(bill.getCustomer().getId()));
        bill.getProductItems().forEach(productItem -> {
            productItem.setProduct(productRestFien.findProductById(productItem.getProductID()));
        });
        return bill; }
}
