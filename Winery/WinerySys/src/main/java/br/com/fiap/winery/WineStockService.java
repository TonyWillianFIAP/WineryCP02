package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WineStockService {
    @WebMethod
    String getMenu();

    @WebMethod
    String placeOrder(String name, int quantity);
}