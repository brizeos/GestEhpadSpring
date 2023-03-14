package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.manager.ManagerException;

public class ApiException extends Exception {
    public ApiException(ManagerException e) {
        super(e);
    }
}
