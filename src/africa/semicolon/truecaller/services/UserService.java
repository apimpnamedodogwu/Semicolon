package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.dtos.requests.RegisterRequest;

public interface UserService {

    void register(RegisterRequest request);
    int count();
}
