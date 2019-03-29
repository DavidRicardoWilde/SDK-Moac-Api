package manager;

import network.service.MoacNetworkService;

public interface MoacManagerAsynInf extends MoacServiceAsynInf{
    static MoacServiceAsyn build(MoacNetworkService moacNetworkService){
        return new MoacServiceAsyn(moacNetworkService);
    }
}
