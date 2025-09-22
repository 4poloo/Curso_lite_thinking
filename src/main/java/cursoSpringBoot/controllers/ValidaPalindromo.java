package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidaPalindromo {

    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }

    @GetMapping("/validar/{palabra}")
    public String Palindromo(@PathVariable String palabra) {
    String word = palabra;


    if (isPalindrome(word)) {
        System.out.println(word + " es un palíndromo.");
        return "La Palabra " + word + " es un palíndromo.";
    } else {
        System.out.println(word + " no es un palíndromo.");
        return "La Palabra " + word + " NO es un palíndromo.";
    }

    }

}