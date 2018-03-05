package knightech.net.api.security.service;


public interface TokenService {

    String getToken(String username, String password);
}
