package fr.cmm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)  // 404 Statut non trouvé

public class RecipeNotFoundException extends RuntimeException{

}
