package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.manager.ManagerException;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
public @interface ApiGetByID {

}
