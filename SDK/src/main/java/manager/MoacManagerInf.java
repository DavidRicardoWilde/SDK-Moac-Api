package manager;

import network.service.MoacNetworkService;

public interface MoacManagerInf extends MoacServiceInf {
    static MoacService build(MoacNetworkService moacNetworkService){
        return new MoacService(moacNetworkService);
    }
}
