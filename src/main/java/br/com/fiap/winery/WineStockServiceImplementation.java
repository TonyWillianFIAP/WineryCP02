package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Cabernet Sauvignon, Merlot, Pinot Noir, Chardonnay";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Vinho: " + name + ", Quantidade: " + quantity;
    }
}
