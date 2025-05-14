package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineWarningServiceImplementation.WineWarningService")
public class WineWarningServiceImplementation implements WineWarningServiceImplementation.WineWarningService {

    @Override
    public String sendWarn() {
        return "Estoque insuficiente!";
    }

    @WebService
    @SOAPBinding(style = Style.RPC)
    public static interface WineWarningService {
        @WebMethod
        String sendWarn();
    }
}